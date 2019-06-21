package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.ak;
import com.tencent.mm.plugin.webview.modeltools.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class v extends bd<com.tencent.mm.plugin.webview.luggage.d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<com.tencent.mm.plugin.webview.luggage.d>.a parama)
  {
    AppMethodBeat.i(6317);
    ab.i("MicroMsg.JsApiImagePreview", "invokeInOwn");
    Object localObject1 = parama.bPa.bOf.optString("current");
    JSONArray localJSONArray = parama.bPa.bOf.optJSONArray("urls");
    Object localObject2 = new ArrayList();
    if ((localJSONArray == null) || (localJSONArray.length() == 0))
    {
      ab.e("MicroMsg.JsApiImagePreview", "fail, urls is null");
      parama.a("invalid_url", null);
      AppMethodBeat.o(6317);
      return;
    }
    int i = 0;
    Object localObject4;
    if (i < localJSONArray.length())
    {
      localObject3 = localJSONArray.optString(i);
      if ((bo.isNullOrNil((String)localObject3)) || (((String)localObject3).equalsIgnoreCase("null")))
        ab.e("MicroMsg.JsApiImagePreview", "null url, i = %d", new Object[] { Integer.valueOf(i) });
      while (true)
      {
        i++;
        break;
        localObject4 = localObject3;
        if (bo.nullAsNil((String)localObject3).startsWith("weixin://resourceid/"))
        {
          localObject4 = g.cYF().aex((String)localObject3);
          if (localObject4 != null)
            localObject4 = ((WebViewJSSDKFileItem)localObject4).heo;
        }
        else
        {
          ((ArrayList)localObject2).add(localObject4);
        }
      }
    }
    Object localObject3 = (String[])((ArrayList)localObject2).toArray(new String[((ArrayList)localObject2).size()]);
    if (bo.isNullOrNil((String)localObject1))
      localObject4 = localObject3[0];
    while (true)
    {
      localObject1 = new Intent();
      localObject2 = b.dTR().getCookie(((com.tencent.mm.plugin.webview.luggage.d)parama.bOZ).getUrl());
      if (!bo.isNullOrNil((String)localObject2))
        ((Intent)localObject1).putExtra("cookie", (String)localObject2);
      ((Intent)localObject1).putExtra("nowUrl", (String)localObject4);
      ((Intent)localObject1).putExtra("urlList", (String[])localObject3);
      ((Intent)localObject1).putExtra("type", -255);
      ((Intent)localObject1).putExtra("isFromWebView", true);
      com.tencent.mm.bp.d.b(((com.tencent.mm.plugin.webview.luggage.d)parama.bOZ).mContext, "subapp", ".ui.gallery.GestureGalleryUI", (Intent)localObject1);
      parama.a("", null);
      AppMethodBeat.o(6317);
      break;
      if (((String)localObject1).startsWith("weixin://resourceid/"))
      {
        localObject4 = g.cYF().aex((String)localObject1);
        if (localObject4 != null)
          localObject4 = ((WebViewJSSDKFileItem)localObject4).heo;
        else
          localObject4 = "";
      }
      else
      {
        localObject4 = localObject1;
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "imagePreview";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.v
 * JD-Core Version:    0.6.2
 */