import React from 'react';
import ReactDOM from 'react-dom';
import axios from 'axios';
import fetchRace from "./components/fetchRace"

class App extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
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
                <h1>{`/r/${this.props.subreddit}`}</h1>
                <select>
                    {this.state.posts.map(post =>
                        <option value={post.year} key={post.year}>{post.year}</option>
                    )}
                </select>

            </div>
        );
    }
}


ReactDOM.render(
    <App subreddit="reactjs"/>,
    document.getElementById('app')
);