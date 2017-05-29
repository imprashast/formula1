import React from 'react';
import ReactDOM from 'react-dom';
import axios from 'axios';

export default class FetchRace extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    componentDidMount() {
        axios.get(`http://localhost:7480/formula1/race.json/${this.props.year}`)
            .then(res => {
                const posts = res.data;
                this.setState({posts});
            })
            .catch(function (error) {
                console.log(error);
            });
    }


    render() {
        return (
            <div >
                <h1>All Events</h1>
                <table>
                    <tr>
                        <th>Event title</th>
                        <th>Event location</th>
                    </tr>
                    {this.state.posts.map(post =>
                    <tr>
                        <td>{post.date}</td>
                        <td>{post.name} </td>
                    </tr>
                    )}
                </table>
            </div>

        );
    }
}