package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiUploadEncryptedFileToCDN$2
  implements DialogInterface.OnClickListener
{
  JsApiUploadEncryptedFileToCDN$2(JsApiUploadEncryptedFileToCDN paramJsApiUploadEncryptedFileToCDN, JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask paramJsApiUploadEncryptedMediaFileTask)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(131302);
    ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "do confirm upload in 2G/3G/4G network");
    this.hQo.aBV();
    AppBrandMainProcessService.a(this.hQo);
    AppMethodBeat.o(131302);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN.2
 * JD-Core Version:    0.6.2
 */