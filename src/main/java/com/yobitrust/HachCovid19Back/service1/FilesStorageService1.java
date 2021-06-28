package com.yobitrust.HachCovid19Back.service1;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface FilesStorageService1 {
  public void init1();

  public void save1(MultipartFile file);

  public Resource load1(String filename);

  public void deleteAll1();

  public Stream<Path> loadAll1();
}
