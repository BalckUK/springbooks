package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = { @Autowired })
	private BoardMapper mapper;
	
	@Setter(onMethod_ = {@Autowired} )
	private BoardService service;

//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board -> log.info(board));
//	}
//	
//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("���� �ۼ��ϴ� ��");
//		board.setContent("���� �ۼ��ϴ� ����");
//		board.setWriter("newbie");
//		
//		mapper.insert(board);
//		
//		log.info(board);
//	}
//	
//	@Test
//	public void testInsertSelectKey() {
//		BoardVO board = new BoardVO();
//		board.setTitle("���� �ۼ��ϴ� �� select key");
//		board.setContent("���� �ۼ��ϴ� ���� select key");
//		board.setWriter("newbie");
//		
//		mapper.insertSelectKey(board);
//		
//		log.info(board);
//	}

//	@Test
//	public void testRead() {
//		
//		//�����ϴ� �Խù� ��ȣ�� �׽�Ʈ
//		BoardVO board = mapper.read(5L);
//		
//		log.info(board);
//	}

//	@Test
//	public void testDelete() {
//		log.info("DELETE COUNT: "+ mapper.delete(3L));
//	}

//	@Test
//	public void testUpdate() {
//		BoardVO board = new BoardVO();
//		//������ �����ϴ� ��ȣ���� Ȯ���� ��
//		board.setBno(5L);
//		board.setTitle("������ ����");
//		board.setContent("������ ����");
//		board.setWriter("user00");
//		
//		int count = mapper.update(board);
//		log.info("UPDATE COUNT : "+ count);
//	}
	

//	@Test
//	public void testRegister() {
//		BoardVO board = new BoardVO();
//		board.setTitle("���� �ۼ��ϴ� ��123");
//		board.setContent("���� �ۼ��ϴ� ����123");
//		board.setWriter("newbie");
//		
//		service.register(board);
//		
//		log.info("������ �Խù��� ��ȣ : "+ board.getBno());
//	}
	
//	@Test
//	public void testGetList() {
//		service.getList().forEach(board -> log.info(board));
//	}
	
	@Test
	public void testGet() {
		log.info(service.get(1L));
	}
	
	@Test
	public void testDelete() {
		
		
		//�Խù� ��ȣ�� ���� ���θ� Ȯ���ϰ� �׽�Ʈ�� ��
		log.info("REMOVE RESUTL : "+ service.remove(2L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = service.get(1L);
		
		if(board == null) {
			return;
		}
		
		board.setTitle("���� �����մϴ�");
		log.info("MODIFY RESULT : "+ service.modify(board));
	}
}
