/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
  let arr = s.split('')
  let newArr = [];
   newArr.push(arr[0])
  for(let i = 1; i < arr.length; i++){
       newArr.push(arr[i])
      if((newArr[newArr.length - 2]==='(' && newArr[newArr.length - 1]===')') || (newArr[newArr.length - 2]==='{' && newArr[newArr.length - 1]==='}') ||(newArr[newArr.length - 2]==='[' && newArr[newArr.length - 1]===']') ){
           newArr.pop(newArr.length - 1)
           newArr.pop(newArr.length - 1)
      }
     
  }
  if(newArr.length === 0) return true
  return false
};