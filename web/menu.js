$(".submenu").click(function(){
    $(this).children("ul").slideToggle();
})

$("ul").click(function(sMenu){
    sMenu.stopPropagation();
})

