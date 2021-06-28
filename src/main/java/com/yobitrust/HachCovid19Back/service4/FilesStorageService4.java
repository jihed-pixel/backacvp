package com.yobitrust.HachCovid19Back.service4;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface FilesStorageService4 {
  public void init4();

  public void save4(MultipartFile file);

  public Resource load4(String filename);

  public void deleteAll4();

  public Stream<Path> loadAll4();
}
