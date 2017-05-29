import React from 'react';
import ReactDOM from 'react-dom';
import axios from 'axios';
import {BootstrapTable, TableHeaderColumn} from 'react-bootstrap-table';

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
                <BootstrapTable data={ this.state.posts } striped hover condensed>
                    <TableHeaderColumn dataField='raceid' isKey>Race ID</TableHeaderColumn>
                    <TableHeaderColumn dataField='name'>Race Name</TableHeaderColumn>
                    <TableHeaderColumn dataField='date'>Race Date</TableHeaderColumn>
                </BootstrapTable>
            </div>

        );
    }
}