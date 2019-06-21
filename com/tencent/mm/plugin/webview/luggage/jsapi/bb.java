package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.c.c;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import org.json.JSONObject;

public class bb extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6388);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.JsApiUploadMediaFile", "invokeInOwn");
    String str1 = parama.bPa.bOf.optString("appId");
    String str2 = parama.bPa.bOf.optString("localId");
    boolean bool;
    if (parama.bPa.bOf.optInt("isShowProgressTips", 0) == 1)
    {
      bool = true;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.JsApiUploadMediaFile", "uploadMediaFile, appid = %s, localid = %s, isShowProgressTips = %b", new Object[] { str1, str2, Boolean.valueOf(bool) });
      if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)))
        break label127;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.JsApiUploadMediaFile", "appId or localid is null or nil.");
      parama.a("missing arguments", null);
      AppMethodBeat.o(6388);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label127: LuggageUploadMediaFileManager localLuggageUploadMediaFileManager = new LuggageUploadMediaFileManager();
      MMActivity localMMActivity = (MMActivity)((d)parama.bOZ).mContext;
      d locald = (d)parama.bOZ;
      parama = new bb.1(this, parama, localLuggageUploadMediaFileManager);
      localLuggageUploadMediaFileManager.knn = localMMActivity;
      localLuggageUploadMediaFileManager.uiI = locald;
      localLuggageUploadMediaFileManager.mAppId = str1;
      localLuggageUploadMediaFileManager.ukB = str2;
      localLuggageUploadMediaFileManager.ukC = bool;
      localLuggageUploadMediaFileManager.ukD = parama;
      parama = c.aeo(localLuggageUploadMediaFileManager.ukB);
      if (parama == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.UploadMediaFileHelp", "item is null");
        localLuggageUploadMediaFileManager.ukD.a(false, null);
        AppMethodBeat.o(6388);
      }
      else if (parama.cyQ != 1)
      {
        if ((bo.isNullOrNil(parama.heo)) || (!com.tencent.mm.a.e.ct(parama.heo)))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.UploadMediaFileHelp", "origFilePath is not exist");
          localLuggageUploadMediaFileManager.ukD.a(false, null);
          AppMethodBeat.o(6388);
        }
        else if (!com.tencent.mm.network.ab.ch(localLuggageUploadMediaFileManager.knn))
        {
          parama = bo.my(com.tencent.mm.a.e.cs(parama.heo));
          h.a(localLuggageUploadMediaFileManager.knn, localLuggageUploadMediaFileManager.knn.getString(2131305569, new Object[] { parama }), localLuggageUploadMediaFileManager.knn.getString(2131297061), false, new LuggageUploadMediaFileManager.1(localLuggageUploadMediaFileManager), new LuggageUploadMediaFileManager.2(localLuggageUploadMediaFileManager));
          AppMethodBeat.o(6388);
        }
        else
        {
          localLuggageUploadMediaFileManager.cXp();
          AppMethodBeat.o(6388);
        }
      }
      else
      {
        localLuggageUploadMediaFileManager.cXq();
        AppMethodBeat.o(6388);
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "uploadMediaFile";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.bb
 * JD-Core Version:    0.6.2
 */