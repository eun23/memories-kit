package com.lje.memories_back.service;

import org.springframework.http.ResponseEntity;

import com.lje.memories_back.common.dto.request.test.PostConcentrationRequestDto;
import com.lje.memories_back.common.dto.request.test.PostMemoryRequestDto;
import com.lje.memories_back.common.dto.response.ResponseDto;
import com.lje.memories_back.common.dto.response.test.GetConcentrationResponseDto;
import com.lje.memories_back.common.dto.response.test.GetMemoryResponseDto;

public interface TestService {
  ResponseEntity<ResponseDto> postMemory(PostMemoryRequestDto dto, String userId);
  ResponseEntity<ResponseDto> postConcentration(PostConcentrationRequestDto dto, String userId);
  ResponseEntity<? super GetMemoryResponseDto> getMemory(String userId);
  ResponseEntity<? super GetConcentrationResponseDto> getConcentration(String userId);
}