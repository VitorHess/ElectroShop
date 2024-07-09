
$(document).ready(function () {
    $("#backToggle").click(function () {
        $("#mainContent").html(`
            <h1>Inicio</h1>
        `);
    });
});

$(document).ready(function () {
    $("#toggleButtonToViewStock").click(function () {
        $("#mainContent").html(`
            <div class="container">
                <h1 class="text-center"> ViewStock </h1>
            </div>
        `);
    });
});

$(document).ready(function () {
    $("#toggleButtonToAddOrRemoveProduct").click(function () {
        $("#mainContent").html(`
            <div class="container">
                <h1 class="text-center"> Remove or Add Products 
        `);
    });
});