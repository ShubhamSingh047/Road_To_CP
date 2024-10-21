const LargetsString = (str) => {
  let max = "";

  str.split(" ").forEach((element) => {
    element.length > max.length ? (max = element) : max;
  });
  return max;
};

const str = "my name is Shubham Singh";
// const res = LargetsString(str);
// console.log(res, "is the largest word !");

/*----------> 2nd qusting wap to gernrate hashtag from String <-------------*/
const Hashtag = (str) => {
  const strArray = str.split(" ");

  const upperArray = strArray.map(
    (el) => el.charAt(0).toUpperCase() + el.slice(1)
  );
  return "#" + upperArray.join("");
};

// const res = Hashtag(str);
// console.log(res, "res");

/*----------> 3rd qusting wap to count char at in string  <-------------*/
const CountChar = (str, char) => {
  let count = 0;
  for (let i = 0; i < str.length; i++) {
    if (str.charAt(i) == char.toLowerCase()) {
      count++;
    }
  }
  return count;
};

// console.log(CountChar("Shubham", "h"));

/*------> 4th Qus find max in an array <-------*/

const maxInArr = (arr) => {
  const res = arr.reduce((acc, curr) => (curr > acc ? curr : acc));
  return res;
};

const arr = [5, 15, 2, 3, 4];
// console.log(maxInArr(arr));

/*------>5th qus take number as digit and return sum <------*/

const sumOfDigit = (num) => {
  const res = num
    .toString()
    .split("")
    .reduce((accu, curr) => accu + Number(curr), 0);
  return res;
};
// console.log(sumOfDigit(12345));

/*------>6th qus remove dublicate in array <------*/

const dublicate = (arr) => {
  return [...new Set(arr)];
};

const dubl_arr = [1, 2, 3, 2, 3, 4];

// console.log(dublicate(dubl_arr));

/*--------> write a program to compute opertaion in nested object  <-------*/

const input = {
  A: (a, b, c) => a + b + c,
  B: (a, b, c) => a - b - c,
  D: {
    C: (a, b, c) => a * b * c,
  },
};

const Compute = (obj, fn) => {
  for (let key in obj) {
    if (typeof obj[key] === "function") {
      Input(key, obj[key]);
    } else {
      Compute(obj[key], fn);
    }
  }
};

const Input = (key, obj) => {
  console.log(`${key} : ${obj(1, 2, 7)}`);
};

// Compute(input, Input);



/*--------> write a program to flat and nested object or array  <-------*/