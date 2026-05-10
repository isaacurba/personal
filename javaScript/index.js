const prompt = require("prompt-sync")();

const age = Number(prompt("What is your age: "));

if (age < 12) console.log("you are a minor");
else if (age > 12) console.log("you are now officially an adult teen");
else console.log("you are " + age + " years old teen.");
