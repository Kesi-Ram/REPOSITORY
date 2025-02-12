document.addEventListener('DOMContentLoaded', (event) => {
    const noButton = document.getElementById('no');
    const yesButton = document.getElementById('yes');
    const imgElement = document.getElementById('una');
    let clickCount = 0;
    const maxClicks = 4;

    const images = ["una.jpg", "hearttotoro.jpg", "sadtotoro.jpg", "cryingtotoro.png"];
    const buttonMessages = ["weh", "ayaw talaga?", "sumbong kita kay titaaaa", "last chance!"];
    const yesImage = "happyvalentine.jpg"; // Image to show when "yes" is clicked

    noButton.addEventListener('click', () => {
        if (clickCount < maxClicks) {
            // Shrink the font size of the "no" button
            let noButtonFontSize = window.getComputedStyle(noButton).fontSize;
            noButton.style.fontSize = (parseFloat(noButtonFontSize) - 2) + 'px';

            // Adjust the padding of the "no" button to match the text size
            let noButtonPadding = window.getComputedStyle(noButton).padding;
            let paddingValues = noButtonPadding.split(' ').map(value => parseFloat(value));
            noButton.style.padding = `${paddingValues[0] - 1}px ${paddingValues[1] - 2}px`;

            // Adjust the width of the "no" button to match the text size
            let noButtonWidth = noButton.offsetWidth;
            noButton.style.width = (noButtonWidth - 10) + 'px';

            // Enlarge the "yes" button
            let yesButtonWidth = yesButton.offsetWidth;
            let yesButtonHeight = yesButton.offsetHeight;
            yesButton.style.width = (yesButtonWidth + 10) + 'px';
            yesButton.style.height = (yesButtonHeight + 5) + 'px';

            // Enlarge the font size of the "yes" button
            let yesButtonFontSize = window.getComputedStyle(yesButton).fontSize;
            yesButton.style.fontSize = (parseFloat(yesButtonFontSize) + 1) + 'px';

            // Change the image
            imgElement.src = images[clickCount];

            // Change the button message
            noButton.textContent = buttonMessages[clickCount];

            clickCount++;
        }

        if (clickCount >= maxClicks) {
            noButton.disabled = true;
            noButton.style.cursor = 'not-allowed';
        }
    });

    yesButton.addEventListener('click', () => {
        // Change the image to the "yes" image
        imgElement.src = "hearttotoro.jpg";
    });
});