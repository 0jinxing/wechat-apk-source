package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.c.c;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public class aj extends bd<com.tencent.mm.plugin.webview.luggage.d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<com.tencent.mm.plugin.webview.luggage.d>.a parama)
  {
    AppMethodBeat.i(6348);
    ab.i("MicroMsg.GameJsApiPreviewVideo", "invoke");
    if (bo.isNullOrNil(parama.bPa.bOf.optString("localId")))
    {
      ab.i("MicroMsg.GameJsApiPreviewVideo", "data is invalid");
      parama.a("invalid_data", null);
      AppMethodBeat.o(6348);
    }
    while (true)
    {
      return;
      Object localObject1 = parama.bPa.bOf.optString("localId");
      Object localObject2 = c.aeo((String)localObject1);
      if ((localObject2 == null) || (TextUtils.isEmpty(((WebViewJSSDKFileItem)localObject2).heo)) || (!com.tencent.mm.a.e.ct(((WebViewJSSDKFileItem)localObject2).heo)))
      {
        ab.e("MicroMsg.GameJsApiPreviewVideo", "the item is null or the File item not exist for localId: %s", new Object[] { localObject1 });
        parama.a("fail", null);
        AppMethodBeat.o(6348);
      }
      else
      {
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_video_path", ((WebViewJSSDKFileItem)localObject2).heo);
        localObject2 = (MMActivity)((com.tencent.mm.plugin.webview.luggage.d)parama.bOZ).mContext;
        ((MMActivity)localObject2).ifE = new aj.1(this, parama, (MMActivity)localObject2);
        com.tencent.mm.bp.d.b((Context)localObject2, "card", ".ui.CardGiftVideoUI", (Intent)localObject1, hashCode() & 0xFFFF);
        AppMethodBeat.o(6348);
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "previewVideo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.aj
 * JD-Core Version:    0.6.2
 */