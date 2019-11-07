//-- delete user
function deleteUser(id) {
	isDelete = confirm("您确定要删除数据");
	if (isDelete) {
		window.location.href = 'deleteuser/' + id;
	}
}
//-- update user
function updateUser(id) {
	window.location.href = 'updateuser/' + id;
}