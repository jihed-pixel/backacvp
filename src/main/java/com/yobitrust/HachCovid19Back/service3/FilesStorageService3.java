package com.yobitrust.HachCovid19Back.service3;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface FilesStorageService3 {
  public void init3();

  public void save3(MultipartFile file);

  public Resource load3(String filename);

  public void deleteAll3();

  public Stream<Path> loadAll3();
}
