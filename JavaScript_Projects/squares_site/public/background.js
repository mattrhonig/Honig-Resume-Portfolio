function getRandomColor() {
    const colorProbabilities = [
        { color: '#111111', probability: 0.46  }, //Grey1 Dark
        { color: '#151514', probability: 0.32  }, //Grey2 Med
        { color: '#1A1A19', probability: 0.20  }, //Grey3 Light
        { color: '#A70B0B', probability: 0.005 }, //Red
        { color: '#EEDC23', probability: 0.005 }, //Yellow
        { color: '#53BA3F', probability: 0.005 }, //Green
        { color: '#2D8BAE', probability: 0.005 }  //Blue
    ];

    const random = Math.random();
    let totalProbability = 0; //Probablities MUST += 1
    
    for (let i = 0; i < colorProbabilities.length; i++) {
        totalProbability += colorProbabilities[i].probability;
        if (random <= totalProbability) {
            return colorProbabilities[i].color;
        }
    }
    
    return colorProbabilities[0].color;
}

function createSquare() {
    const square = document.createElement('div');
    square.classList.add('square');
    square.style.backgroundColor = getRandomColor();
    return square;
}
  
function animateSquares() {
    const background = document.getElementById('background');
    const screenWidth = window.innerWidth;
    const screenHeight = window.innerHeight;
    const squareSize = 25; //Adjustable square size

    //SSet screen dimension
    const squaresPerRow = Math.ceil(screenWidth / squareSize);
    const squaresPerColumn = Math.ceil(screenHeight / squareSize);
    const totalSquares = squaresPerRow * squaresPerColumn;
    const squares = [];
    
    for (let i = 0; i < totalSquares; i++) {
      const square = createSquare();
      background.appendChild(square);
      squares.push(square);
    }

    function updateSquareColor(square) {
        square.style.backgroundColor = getRandomColor();
  
        const randomDelay = Math.random() * 3000; //Random delay up to 3000ms
        setTimeout(() => {
            updateSquareColor(square);
        }, randomDelay);
    }

    squares.forEach((square) => {
        updateSquareColor(square);
    });

    window.addEventListener('resize', () => {
        //Remove existing squares
        while (background.firstChild) {
            background.firstChild.remove();
        }
        squares.length = 0;

        //Add back new squares to removed locations
        const screenWidth = window.innerWidth;
        const screenHeight = window.innerHeight;
        const squaresPerRow = Math.ceil(screenWidth / squareSize);
        const rows = Math.ceil(screenHeight / squareSize);
        const totalSquares = squaresPerRow * rows;

        for (let i = 0; i < totalSquares; i++) {
            const square = createSquare();
            background.appendChild(square);
            squares.push(square);
        }
        
        squares.forEach((square) => {
            updateSquareColor(square);
        });
    });
}

animateSquares();
