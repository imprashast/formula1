import React from 'react';
import { connect } from 'react-redux';
import axios from 'axios';
import store from '../store'

class Year extends React.Component {
    constructor() {
        super();

        this.state = {
            posts: [],
            value: '2017'
        };

        this.handleChange = this.handleChange.bind(this);
    }

    handleChange(event) {
        this.setState({value: event.target.value});
        store.dispatch({type: 'UPDATE_RACE', value: event.target.value})
    }

    componentDidMount() {
        axios.get(`http://localhost:7480/formula1/year.json`)
            .then(res => {
                const posts = res.data;
                this.setState({ posts });
            })
            .catch(function (error) {
                console.log(error);
            });
    }

    render() {
        return (
            <div>
                <h1>{`Race Calender: Year ${this.state.value}`}</h1>
                <select value={this.state.value} onChange={this.handleChange}>
                    {this.state.posts.map(post =>
                        <option value={post.year} key={post.year}>{post.year}</option>
                    )}
                </select>
            </div>
        );
    }
}

function mapStateToProps(state) {
    return { value: state.value };
}

export default connect(mapStateToProps)(Year);