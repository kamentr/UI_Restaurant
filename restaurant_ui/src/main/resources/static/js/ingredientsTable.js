$.getJSON('http://localhost:8080/ingredient?token=testToken', function(data){
console.log(data);
$(data).each(function(i, ingredient){
  	$('#ingredientsBody').append($("<tr>")
    	.append($("<td>").append(ingredient.id))
    	.append($("<td>").append(ingredient.name))
    	.append($("<td>").append(ingredient.ingredientStatus.locked)));
	});
});
