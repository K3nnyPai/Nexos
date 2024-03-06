function eliminarDep(id){
	swal({
  		title: "Estas seguro de Eliminar Este Departamento?",
  		text: "¡Una vez eliminado, no podrás recuperar estos Datos!",
  		icon: "warning",
  		buttons: true,
  		dangerMode: true,
		})
	.then((OK) => {
 		 if (OK) {
			  $.ajax({
				  url:"/eliminar/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  })
    		swal("uff! Acabas de Eliminar el Dato!", {
      		icon: "success",
    		}).then((ok) => {
				if(ok){
					location.href="/listarDepartamentos"
				}
			});
  		} else {
    		swal("Tus datos se han conservado!");
  			}
		});
}

function eliminarEmp(id){
	swal({
  		title: "Estas seguro de Eliminar este Empleado?",
  		text: "¡Una vez eliminado, no podrás recuperar estos Datos!",
  		icon: "warning",
  		buttons: true,
  		dangerMode: true,
		})
	.then((OK) => {
 		 if (OK) {
			  $.ajax({
				  url:"/eliminarEmpleado/"+id,
				  success: function(res){
					  console.log(res);
				  }
			  })
    		swal("uff! Acabas de Eliminar el Dato!", {
      		icon: "success",
    		}).then((ok) => {
				if(ok){
					location.href="/listarEmpleados"
				}
			});
  		} else {
    		swal("Tus datos se han conservado!");
  			}
		});
}