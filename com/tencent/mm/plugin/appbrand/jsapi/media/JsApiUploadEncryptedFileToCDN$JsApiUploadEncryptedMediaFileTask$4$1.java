package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$4$1
  implements DialogInterface.OnClickListener
{
  JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$4$1(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(131307);
    ab.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel upload the media file");
    JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.c(this.hQz.hQx).cancel();
    this.hQz.hQx.hQs = 1;
    this.hQz.hQx.hQt = 1;
    AppBrandMainProcessService.a(this.hQz.hQx);
    AppMethodBeat.o(131307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.4.1
 * JD-Core Version:    0.6.2
 */