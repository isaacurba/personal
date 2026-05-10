//CREATE
const person = {
	first_name: ["Yemisi", "Chinedu", "Grace"],
	last_name: "Kpomassi",
	age_: 100,
	is_Valid: true
}

const  user = {
	firstName: ["Yemisi", "Chinedu", "Grace"],
	lastName: "Kpomassi",
	age: 100,
	isValid: true,
	...person
}

// READ
console.log(user);
console.log(user.firstName[1]);
console.log()

// UPDATE
user.age = 50
console.log(user.age)

console.log()

// DELETE
delete user.age
console.log(user)

console.log()

// DESTRUCTURING
const {isValid} = user
console.log(isValid)
