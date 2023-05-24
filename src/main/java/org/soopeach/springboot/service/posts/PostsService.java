package org.soopeach.springboot.service.posts;

import lombok.RequiredArgsConstructor;
import org.soopeach.springboot.domain.posts.PostsRepository;
import org.soopeach.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
