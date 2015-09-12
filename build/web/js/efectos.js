
$('#but_per').click(function () {
    $('.regist_persona').toggle("animation");
    $('.regist_persona').css("display", "inline-block");
    $('.regist_empresa').hide();
    $('.Video').hide();
});
$('#but_emp').click(function () {
    $('.regist_empresa').toggle("animation");
    $('.regist_empresa').css("display", "inline-block");
    $('.regist_persona').hide();
    $('.Video').hide();

});

$('.menu_bar').click(function () {
    $('.Main_Menu').toggle("animation");
    
});



