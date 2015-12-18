$( document ).ready(function() {
  $('#steps li').click(function(){
    var $this = $(this);
    if (!($this.hasClass("active"))) {
      var page = $this.attr('data-page');
      $.ajax({
       type: "POST",
       url: page,
       success: function( returnedData ) {
         $( '.current-step-block' ).html( returnedData );
         $('.active').removeClass("active");
         $this.addClass("active");
       }
      });
    };
  });
});
