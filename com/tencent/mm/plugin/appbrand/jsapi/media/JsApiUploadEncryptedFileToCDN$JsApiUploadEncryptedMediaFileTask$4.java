package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$4
  implements DialogInterface.OnKeyListener
{
  JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask$4(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask paramJsApiUploadEncryptedMediaFileTask)
  {
  }

  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(131309);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 1))
      if ((!TextUtils.isEmpty(this.hQx.mimeType)) && (this.hQx.mimeType.contains("video")))
      {
        paramDialogInterface = this.hQx.hQu.getString(2131297128);
        h.a(this.hQx.hQu, true, this.hQx.hQu.getString(2131297123, new Object[] { paramDialogInterface }), "", this.hQx.hQu.getString(2131297125), this.hQx.hQu.getString(2131297126), new JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.4.1(this), new JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.4.2(this));
        AppMethodBeat.o(131309);
      }
    while (true)
    {
      return bool;
      paramDialogInterface = this.hQx.hQu.getString(2131297122);
      break;
      AppMethodBeat.o(131309);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.4
 * JD-Core Version:    0.6.2
 */