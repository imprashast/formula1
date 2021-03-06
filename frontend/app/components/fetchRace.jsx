import React from 'react';
import ReactDOM from 'react-dom';
import { connect } from 'react-redux';
import axios from 'axios';
import {BootstrapTable, TableHeaderColumn} from 'react-bootstrap-table';
import store from '../store'

@connect((store) => {
    return {
        value: store.value
    };
})
class FetchRace extends React.Component {
    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }

    componentDidMount() {
        axios.get(`http://localhost:7480/formula1/race.json/${this.props.value}`)
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
                <h1>All Events for {this.props.value}</h1>
                <BootstrapTable data={ this.state.posts } striped hover condensed>
                    <TableHeaderColumn dataField='raceid' isKey>Race ID</TableHeaderColumn>
                    <TableHeaderColumn dataField='name'>Race Name</TableHeaderColumn>
                    <TableHeaderColumn dataField='date'>Race Date</TableHeaderColumn>
                </BootstrapTable>
            </div>

        );
    }
}
function mapStateToProps(state) {
    return { value: state.value };
}

export default connect(mapStateToProps)(FetchRace);