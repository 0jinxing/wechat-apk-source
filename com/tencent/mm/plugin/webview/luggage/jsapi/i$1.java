package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Intent;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.c.c;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;

final class i$1
  implements MMActivity.a
{
  i$1(a.a parama, MMActivity paramMMActivity)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(6301);
    Object localObject1;
    Object localObject2;
    if (paramInt1 == 45)
    {
      switch (paramInt2)
      {
      default:
        this.mUf.a("fail", null);
      case 0:
      case -1:
      }
      while (true)
      {
        this.icV.ifE = null;
        AppMethodBeat.o(6301);
        return;
        this.mUf.a("cancel", null);
        continue;
        localObject1 = paramIntent.getStringExtra("key_pick_local_media_local_id");
        paramIntent = paramIntent.getStringExtra("key_pick_local_media_thumb_local_id");
        ab.i("MicroMsg.JsApiChooseVideo", "localId:%s", new Object[] { localObject1 });
        ab.i("MicroMsg.JsApiChooseVideo", "thumbLocalId:%s", new Object[] { paramIntent });
        if (bo.isNullOrNil((String)localObject1))
          break;
        localObject2 = c.aeo((String)localObject1);
        if ((localObject2 != null) && ((localObject2 instanceof WebViewJSSDKVideoItem)))
        {
          WebViewJSSDKVideoItem localWebViewJSSDKVideoItem = (WebViewJSSDKVideoItem)localObject2;
          localObject2 = new HashMap();
          ((HashMap)localObject2).put("localId", localObject1);
          ((HashMap)localObject2).put("duration", Integer.valueOf(localWebViewJSSDKVideoItem.duration));
          ((HashMap)localObject2).put("height", Integer.valueOf(localWebViewJSSDKVideoItem.height));
          ((HashMap)localObject2).put("size", Integer.valueOf(localWebViewJSSDKVideoItem.size));
          ((HashMap)localObject2).put("width", Integer.valueOf(localWebViewJSSDKVideoItem.width));
          ((HashMap)localObject2).put("thumbLocalId", paramIntent);
          this.mUf.c("", (Map)localObject2);
        }
        else
        {
          this.mUf.a("fail", null);
        }
      }
    }
    if (paramInt1 == 32)
      switch (paramInt2)
      {
      default:
        label304: this.mUf.a("fail", null);
      case 0:
      case -1:
      }
    while (true)
    {
      this.icV.ifE = null;
      AppMethodBeat.o(6301);
      break;
      this.mUf.a("cancel", null);
      continue;
      paramIntent = paramIntent.getStringExtra("key_pick_local_media_local_id");
      if (bo.isNullOrNil(paramIntent))
        break label304;
      localObject1 = c.aeo(paramIntent);
      if ((localObject1 != null) && ((localObject1 instanceof WebViewJSSDKVideoItem)))
      {
        localObject1 = (WebViewJSSDKVideoItem)localObject1;
        localObject2 = new HashMap();
        ((HashMap)localObject2).put("localId", paramIntent);
        ((HashMap)localObject2).put("duration", Integer.valueOf(((WebViewJSSDKVideoItem)localObject1).duration));
        ((HashMap)localObject2).put("height", Integer.valueOf(((WebViewJSSDKVideoItem)localObject1).height));
        ((HashMap)localObject2).put("size", Integer.valueOf(((WebViewJSSDKVideoItem)localObject1).size));
        ((HashMap)localObject2).put("width", Integer.valueOf(((WebViewJSSDKVideoItem)localObject1).width));
        this.mUf.c("", (Map)localObject2);
      }
      else
      {
        this.mUf.a("fail", null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.i.1
 * JD-Core Version:    0.6.2
 */