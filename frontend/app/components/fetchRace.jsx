import React from 'react';
import ReactDOM from 'react-dom';
import axios from 'axios';

class App extends React.Component {
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
                this.setState({ posts });
            })
            .catch(function (error) {
                console.log(error);
            });
    }

    render() {
        return (
            <div>
                <h1>{`Race Calender`}</h1>
                <table>
                    <td>
                        {this.state.posts.map(post =>
                            <td key={post.year}>{post.name}
                            </td>
                        )}
                    </td>
                </table>

            </div>
        );
    }
}


ReactDOM.render(
    <App year="2016"/>,
    document.getElementById('app2')
);