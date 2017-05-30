let nextTodoId = 0
export const changeYear = (year) => {
    return {
        type: 'UPDATE_RACE',
        value: year
    }
}

export const setYear = () => {
    return {
        type: 'SET_YEAR',
        value: 2017
    }
}