<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div w3-include-html="content.html"></div>


    <div class="login modal fade" id="modalView" tabindex="-1" role="dialog"
    aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal"
            aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div align="center">
          <div class="modal-body">
            <br /> <br /> <br /> <br />
            <div style="width: 450px; height: 300px; overflow: hidden">
           <div class="cycle-slideshow" data-cycle-fx="scrollHorz"
            data-cycle-timeout="0"  data-cycle-prev="#prev" data-cycle-next="#next" align="center">
            <img src="img/portfolio/cabin.png" style="width: 450px; height: 300px; title="cabin" />
            <img src="img/portfolio/cake.png" style="width: 450px; height: 300px; alt="cake" />
            <img src="img/portfolio/circus.png" style="width: 450px; height: 300px; alt="circus" />
            <img src="img/portfolio/game.png" style="width: 450px; height: 300px; alt="game" />
            <img src="img/portfolio/safe.png" style="width: 450px; height: 300px; alt="safe" />
            <img src="img/portfolio/submarine.png" style="width: 450px; height: 300px; alt="submarine" />
            </div>
            </div>
            <div class="center">
              <a href=# id="prev">Prev</a>
              <a href=# id="next">Next</a>
            </div>
            <br /> <br /> <br /> <br /> <br /> <br />
          </div>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
  </div>

	<div class="portfolio-modal modal fade" id="modalView" tabindex="-1"
		role="dialog" aria-hidden="true">
		<div class="modal-content">
			<div class="close-modal" data-dismiss="modal">
				<div class="lr">
					<div class="rl"></div>
				</div>
			</div>
				<div class="container">
					<div class="row">
						<div class="col-lg-8 col-lg-offset-2">
							<div id="modalBody"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<div class="modal fade" id="successCheck" tabindex="-1" role="dialog"
			aria-hidden="true">
			
			<div class="modal-dialog">
				<div class="modal-content">
					
					<div align="center">
						<div class="modal-body">
							<br /> <br /> <br /> <br />
							<h2 class="modal-title" id="myModalLabel">upload success!</h2>
							<hr class="star-primary"></hr>
							<button type="button" class="btn btn-default" style="text-size:20px" data-dismiss="modal">  ok!  </button>
							<br/><br/><br/>
						</div>
					</div>
				</div>
			</div>
		</div>