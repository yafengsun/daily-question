/**
 * @param {number[]} salary
 * @return {number}
 */
var average = function(salary) {
  //从小到大排序
salary.sort((a,b)=>{
  return a-b
})
let arr = salary.slice(1,salary.length-1)
let num = arr.reduce((a,b)=>{
  return a+b
})
return num/(salary.length-2)
};