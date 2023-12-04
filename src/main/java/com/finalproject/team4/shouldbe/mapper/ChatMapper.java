package com.finalproject.team4.shouldbe.mapper;

import com.finalproject.team4.shouldbe.vo.ChatRoomVO;
import com.finalproject.team4.shouldbe.vo.MessageVO;
import com.finalproject.team4.shouldbe.vo.PagingVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChatMapper {

    List<ChatRoomVO> getCurrentUserChatRooms(PagingVO pvo, String userId);
    int countUserChatRooms(String userId);
    List<MessageVO> getMessagesByChatId(int chatId);
    String getProfileImg(String userId);
}
