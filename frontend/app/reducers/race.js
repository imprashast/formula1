const races = (state = { value : 2017}, action) => {
    switch (action.type) {
        case 'SET_YEAR':
            return {...state, value: action.value}
        case 'UPDATE_RACE':
            return {...state, value: action.value}
        default:
            return state
    }
}

export default races