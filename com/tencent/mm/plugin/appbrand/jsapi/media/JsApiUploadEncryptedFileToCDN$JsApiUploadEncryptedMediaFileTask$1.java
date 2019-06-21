package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.c.d.a;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$1
  implements d.a
{
  JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$1(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask paramJsApiUploadEncryptedMediaFileTask)
  {
  }

  public final void J(int paramInt, String paramString)
  {
    AppMethodBeat.i(131304);
    ab.d("MicroMsg.JsApiUploadEncryptedFileToCDN", "progress, percent:%d, localId:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    this.hQx.hQr = paramInt;
    this.hQx.hQt = 3;
    JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.a(this.hQx);
    AppMethodBeat.o(131304);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.1
 * JD-Core Version:    0.6.2
 */