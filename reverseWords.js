function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => reverseWord(word));
    return reversedWords.join(' ');
}

function reverseWord(word) {
    return word.split('').reverse().join('');
}

const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter a sentence: ', (input) => {
    const reversedSentence = reverseWordsInSentence(input);
    console.log('Reversed sentence: ' + reversedSentence);
    rl.close();
});
