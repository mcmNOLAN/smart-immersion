'use strict';

const React = require('react');
const ReactDOM = require('react-dom');
const client = require('./client');

class App extends React.Component {

	constructor(props) {
		super(props);
		this.state = {catFacts: []};
	}

	componentDidMount() {
		client({method: 'GET', path: '/api/catFacts'}).done(response => {
			this.setState({catFacts: response.entity._embedded.catFacts});
		});
	}

	render() {
		return (
			<CatFactsList catFacts={this.state.catFacts}/>
		)
	}
}

class CatFactsList extends React.Component{
	render() {
		const catFacts = this.props.catFacts.map(catFact =>
			<CatFact key={catFact._links.self.href} catFact={catFact}/>
		);
		return (
			<table>
				<tbody>
					<tr>
						<th>Fact</th>
						<th>Length</th>
					</tr>
					{catFacts}
				</tbody>
			</table>
		)
	}
}

class CatFact extends React.Component{
	render() {
		return (
			<tr>
				<td>{this.props.catFact.fact}</td>
				<td>{this.props.catFact.length}</td>
			</tr>
		)
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)