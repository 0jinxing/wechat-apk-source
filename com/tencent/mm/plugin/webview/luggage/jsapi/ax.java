package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.webview.luggage.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public class ax extends bd<com.tencent.mm.plugin.webview.luggage.d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<com.tencent.mm.plugin.webview.luggage.d>.a parama)
  {
    AppMethodBeat.i(6383);
    ab.i("MicroMsg.JsApiShareTimeLine", "invoke");
    MMActivity localMMActivity = (MMActivity)((com.tencent.mm.plugin.webview.luggage.d)parama.bOZ).mContext;
    if ((localMMActivity == null) || (localMMActivity.isFinishing()))
    {
      ab.w("MicroMsg.JsApiShareTimeLine", "activity is null or finish");
      AppMethodBeat.o(6383);
    }
    while (true)
    {
      return;
      Object localObject1 = parama.bPa.bOf;
      String str1 = ((JSONObject)localObject1).optString("link");
      if (bo.isNullOrNil(str1))
      {
        ab.e("MicroMsg.JsApiShareTimeLine", "link is null");
        parama.a("invalid_params", null);
        AppMethodBeat.o(6383);
        continue;
      }
      String str2 = ((JSONObject)localObject1).optString("desc");
      label130: String str3;
      Object localObject2;
      String str4;
      String str5;
      String str6;
      String str7;
      int i;
      if (str2 != null)
      {
        if (str2.startsWith("http://"))
          str2.substring(7);
      }
      else
      {
        str3 = ((JSONObject)localObject1).optString("appid");
        localObject2 = ((JSONObject)localObject1).optString("img_width");
        str4 = ((JSONObject)localObject1).optString("img_height");
        ab.i("MicroMsg.JsApiShareTimeLine", "doTimeline, rawUrl:[%s], shareUrl:[%s]", new Object[] { str1, str1 });
        str5 = ((JSONObject)localObject1).optString("type");
        str6 = ((JSONObject)localObject1).optString("title");
        str7 = ((JSONObject)localObject1).optString("img_url");
        str2 = ((JSONObject)localObject1).optString("src_username");
        localObject1 = ((JSONObject)localObject1).optString("src_displayname");
        i = -1;
      }
      try
      {
        int j = Integer.valueOf((String)localObject2).intValue();
        i = j;
        Integer.valueOf(str4);
        i = j;
        label241: localObject2 = new Intent();
        ((Intent)localObject2).putExtra("Ksnsupload_width", i);
        ((Intent)localObject2).putExtra("Ksnsupload_height", i);
        ((Intent)localObject2).putExtra("Ksnsupload_link", str1);
        ((Intent)localObject2).putExtra("Ksnsupload_title", str6);
        ((Intent)localObject2).putExtra("Ksnsupload_imgurl", str7);
        if (t.mZ(str2))
        {
          ((Intent)localObject2).putExtra("src_username", str2);
          ((Intent)localObject2).putExtra("src_displayname", (String)localObject1);
        }
        ((Intent)localObject2).putExtra("Ksnsupload_source", 1);
        ((Intent)localObject2).putExtra("Ksnsupload_type", 1);
        if ((!bo.isNullOrNil(str5)) && (str5.equals("music")))
          ((Intent)localObject2).putExtra("ksnsis_music", true);
        if ((!bo.isNullOrNil(str5)) && (str5.equals("video")))
          ((Intent)localObject2).putExtra("ksnsis_video", true);
        if ((str3 != null) && (str3.length() > 0))
          ((Intent)localObject2).putExtra("Ksnsupload_appid", str3);
        ((Intent)localObject2).putExtra("ShareUrlOriginal", str1);
        ((Intent)localObject2).putExtra("ShareUrlOpen", ((com.tencent.mm.plugin.webview.luggage.d)parama.bOZ).getUrl());
        ((Intent)localObject2).putExtra("JsAppId", ((com.tencent.mm.plugin.webview.luggage.d)parama.bOZ).uij.getAppId());
        ((Intent)localObject2).putExtra("need_result", true);
        ab.i("MicroMsg.JsApiShareTimeLine", "doTimeline, start activity");
        localMMActivity.ifE = new ax.1(this, parama, localMMActivity);
        com.tencent.mm.bp.d.a(localMMActivity, "sns", ".ui.SnsUploadUI", (Intent)localObject2, hashCode() & 0xFFFF, false);
        AppMethodBeat.o(6383);
        continue;
        if (!str2.startsWith("https://"))
          break label130;
        str2.substring(8);
      }
      catch (Exception localException)
      {
        break label241;
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "shareTimeline";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ax
 * JD-Core Version:    0.6.2
 */