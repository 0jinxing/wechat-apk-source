package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

final class JsApiUploadEncryptedFileToCDN$1
  implements Runnable
{
  JsApiUploadEncryptedFileToCDN$1(JsApiUploadEncryptedFileToCDN paramJsApiUploadEncryptedFileToCDN, JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask paramJsApiUploadEncryptedMediaFileTask, c paramc, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131301);
    HashMap localHashMap = new HashMap();
    localHashMap.put("fileId", this.hQo.fileId);
    localHashMap.put("aesKey", this.hQo.eyr);
    localHashMap.put("fileUrl", this.hQo.fileUrl);
    localHashMap.put("fileLength", this.hQo.gUm);
    ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fileId:%s", new Object[] { this.hQo.fileId });
    if (bo.isNullOrNil(this.hQo.fileId))
    {
      ab.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail , return serverId is empty");
      this.hxc.M(this.eIl, this.hQp.j("fail", null));
    }
    while (true)
    {
      this.hQo.aBW();
      AppMethodBeat.o(131301);
      return;
      ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN ok");
      this.hxc.M(this.eIl, this.hQp.j("ok", localHashMap));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN.1
 * JD-Core Version:    0.6.2
 */