// Create an array with letters from A to D
let arr = ["A", "B", "C", "D"];

// Define a shuffle function using the Fisher-Yates algorithm
function shuffle(array) {
  for (let i = array.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [array[i], array[j]] = [array[j], array[i]];
  }
  return array;
}

// Call the shuffle function on the array
shuffle(arr);

// Print the shuffled array
console.log(arr);