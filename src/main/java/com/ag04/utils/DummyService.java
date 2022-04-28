package com.ag04.utils;

/**
 * @author patrick
 */
public interface DummyService {
    
    DummyDTO get(Long id);

    DummyDTO save(DummyDTO testDto);
}
