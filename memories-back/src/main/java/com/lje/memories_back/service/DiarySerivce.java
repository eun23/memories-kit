package com.lje.memories_back.service;

import org.springframework.http.ResponseEntity;

import com.lje.memories_back.common.dto.request.diary.PatchDiaryRequestDto;
import com.lje.memories_back.common.dto.request.diary.PostDiaryRequestDto;
import com.lje.memories_back.common.dto.response.ResponseDto;
import com.lje.memories_back.common.dto.response.diary.GetDiaryResponseDto;
import com.lje.memories_back.common.dto.response.diary.GetMyDiaryResponseDto;

public interface DiarySerivce {
  ResponseEntity<ResponseDto> postDiary(PostDiaryRequestDto dto, String userId);
  ResponseEntity<? super GetMyDiaryResponseDto> getMyDiary(String userId);
  ResponseEntity<? super GetDiaryResponseDto> getDiary(Integer diaryNumber); 
  ResponseEntity<ResponseDto> patchDiary(PatchDiaryRequestDto dto, Integer diaryNumber, String userId);
  ResponseEntity<ResponseDto> deleteDiary(Integer diaryNumber, String userId);
}
