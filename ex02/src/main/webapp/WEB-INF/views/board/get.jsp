<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ include file="../includes/header.jsp" %>



<div class="row">
<div class="col-log-12">
	<h1 class="page-header">Board Get</h1>
</div>
<!-- /.col-lg-12 -->
</div>
<!-- /.row -->

	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel- panel-default"></div>
				<div class="panel-heading">Board Get</div>
				<!-- /.panel-body -->
				<div class="panel-body">
							
							<div class="form-group">
								<label>Bno</label>
								<input class="form-control" name="bno" value='<c:out value="${board.bno}"/>' readonly="readonly"></input>
							</div>
															
							<div class="form-group">
								<label>Title</label>
								<input class="form-control" name="title" value='<c:out value="${board.title}"/>' readonly="readonly"></input>
							</div>
							
							
							<div class="form-group">
								<label>Text Area</label>
								<textarea class='form-control' rows="3" name='content' readonly="readonly"><c:out value="${board.content}"/></textarea>
							</div>
							
							
							<div class="form-group">
								<label>Writer</label>
								<input class="form-control" name="writer" value='<c:out value="${board.writer}"/>' readonly="readonly">
							</div>
							
							
							<button data-oper='modify' class="btn btn-default" onclick="location.href='/board/modfiy?bno=<c:out value="${board.bno}"/>'">Modfiy</button>
							<button data-oper='list' class="btn btn-info" onclick="location.href='/board/list'">List</button>
							
							<form id="operForm" action="/board/modify" method="get">
								<input type="hidden" id="bno" name="bno" value='<c:out value="${board.bno}"/>'>
							</form>
				</div>
				<!-- end panel-body -->
			</div>
			<!-- end panel-body -->
		</div>
	<!-- end panel -->
		</div>
		<!-- /.row -->
		<%@ include file="../includes/footer.jsp" %>
		<script>
			$(document).ready(function(){
				var operForm = $("#operForm");
				
				$("button[data-oper='modify']").on("click",function(e){
					operForm.attr("action","/board/modify").submit();
				})
				
				
				$("button[data-oper='list']").on("click",function(e){
					
					operForm.find("#bno").remove();
					operForm.attr("action","/board/list");
					operForm.submit();
					
				});
			});
		</script>