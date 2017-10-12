package eu.arcangelovicedomini.javaforum.api.service;

import eu.arcangelovicedomini.javaforum.api.domain.UploadedMedia;

public interface MediaService {

  UploadedMedia uploadMedia(UploadedMedia media, byte[] bytes);

  void deleteMedia(UploadedMedia media);

  void deleteMedia(String uuid);
}
