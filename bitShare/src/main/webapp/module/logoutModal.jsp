<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <div class="modal fade" id="logout" tabindex="-1" role="dialog"
    aria-hidden="true" aria-labelledby="myModalLabel">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal"
            aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>

        </div>
        <div class="modal-body">
        
           
        <form name="logoutForm" method="post"  action="/user/logout">
        	 로그아웃 하시겠 습니까(뺄생각임)
        </form>
          <br/>
        </div>
        <div class="modal-footer">
        <button type="button" class="btn btn-primary"  onclick="logoutUserSubmit()">Log out</button>
          
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
  </div>