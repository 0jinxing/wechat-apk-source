package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import org.json.JSONObject;

public final class JsApiUploadEncryptedFileToCDN extends a
{
  public static final int CTRL_INDEX = 194;
  public static final String NAME = "uploadEncryptedFileToCDN";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131319);
    Context localContext = paramc.getContext();
    if ((localContext == null) || (!(localContext instanceof Activity)))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  pageContext is null");
      paramc.M(paramInt, j("fail", null));
      AppMethodBeat.o(131319);
    }
    while (true)
    {
      return;
      if (paramJSONObject == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  data is null");
        paramc.M(paramInt, j("fail:data is null", null));
        AppMethodBeat.o(131319);
      }
      else
      {
        String str1 = paramc.getAppId();
        String str2 = paramJSONObject.optString("tempFilePath");
        boolean bool = paramJSONObject.optBoolean("isShowProgressTips", false);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "JsApiUploadEncryptedFileToCDN appId:%s, data:%s", new Object[] { str1, paramJSONObject.toString() });
        if (bo.isNullOrNil(str2))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  tempFilePath is null");
          paramc.M(paramInt, j("fail:tempFilePath is null", null));
          AppMethodBeat.o(131319);
        }
        else
        {
          AppBrandLocalMediaObject localAppBrandLocalMediaObject = AppBrandLocalMediaObjectManager.bt(str1, str2);
          if (localAppBrandLocalMediaObject == null)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  tempFilePath file is not exist");
            paramc.M(paramInt, j("fail:file doesn't exist", null));
            AppMethodBeat.o(131319);
          }
          else if (TextUtils.isEmpty(localAppBrandLocalMediaObject.fnQ))
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail, fileFullPath is null");
            paramc.M(paramInt, j("fail:fileFullPath is null", null));
            AppMethodBeat.o(131319);
          }
          else
          {
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask localJsApiUploadEncryptedMediaFileTask = new JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask();
            localJsApiUploadEncryptedMediaFileTask.appId = str1;
            localJsApiUploadEncryptedMediaFileTask.czD = str2;
            localJsApiUploadEncryptedMediaFileTask.hQq = bool;
            localJsApiUploadEncryptedMediaFileTask.hQu = ((Activity)localContext);
            localJsApiUploadEncryptedMediaFileTask.hxS = paramc;
            localJsApiUploadEncryptedMediaFileTask.mimeType = localAppBrandLocalMediaObject.mimeType;
            localJsApiUploadEncryptedMediaFileTask.hww = new JsApiUploadEncryptedFileToCDN.1(this, localJsApiUploadEncryptedMediaFileTask, paramc, paramInt);
            if (!com.tencent.mm.network.ab.ch(localContext))
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "2G/3G/4G network available, do upload in mobile network and show the gprs confirm tips dialog");
              if ((!TextUtils.isEmpty(localAppBrandLocalMediaObject.mimeType)) && (localAppBrandLocalMediaObject.mimeType.contains("video")));
              for (paramJSONObject = localContext.getString(2131297128); ; paramJSONObject = localContext.getString(2131297122))
              {
                h.a(localContext, localContext.getString(2131297124, new Object[] { paramJSONObject, bo.my(e.cs(localAppBrandLocalMediaObject.fnQ)) }), localContext.getString(2131297061), new JsApiUploadEncryptedFileToCDN.2(this, localJsApiUploadEncryptedMediaFileTask), new JsApiUploadEncryptedFileToCDN.3(this, paramc, paramInt, localJsApiUploadEncryptedMediaFileTask));
                AppMethodBeat.o(131319);
                break;
              }
            }
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "wifi network available, do not show the gprs confirm dialog");
            localJsApiUploadEncryptedMediaFileTask.aBV();
            AppBrandMainProcessService.a(localJsApiUploadEncryptedMediaFileTask);
            AppMethodBeat.o(131319);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN
 * JD-Core Version:    0.6.2
 */