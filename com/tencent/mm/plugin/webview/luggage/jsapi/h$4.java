package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.c.c;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.mm.plugin.webview.model.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;

final class h$4
  implements MMActivity.a
{
  h$4(h paramh)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(6291);
    if (paramInt1 == (this.ujZ.hashCode() & 0xFFFF));
    switch (paramInt2)
    {
    default:
      h.a(this.ujZ, "fail");
      AppMethodBeat.o(6291);
    case 0:
    case -1:
    }
    while (true)
    {
      return;
      h.a(this.ujZ, "cancel");
      AppMethodBeat.o(6291);
      continue;
      if (paramIntent == null)
      {
        ab.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA bundle is null,");
        h.a(this.ujZ, "fail");
        AppMethodBeat.o(6291);
      }
      else
      {
        paramInt1 = paramIntent.getIntExtra("key_pick_local_media_callback_type", 0);
        Object localObject1;
        if (paramInt1 == 1)
        {
          localObject1 = paramIntent.getStringExtra("key_pick_local_media_local_id");
          paramIntent = paramIntent.getStringExtra("key_pick_local_media_thumb_local_id");
          ab.i("MicroMsg.JsApiChooseMedia", "video localId:%s", new Object[] { localObject1 });
          ab.i("MicroMsg.JsApiChooseMedia", "video thumbLocalId:%s", new Object[] { paramIntent });
          if (bo.isNullOrNil((String)localObject1))
          {
            ab.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA video localId is null");
            h.a(this.ujZ, "fail");
            AppMethodBeat.o(6291);
            continue;
          }
          Object localObject2 = c.aeo((String)localObject1);
          if ((localObject2 != null) && ((localObject2 instanceof WebViewJSSDKVideoItem)))
          {
            localObject2 = (WebViewJSSDKVideoItem)localObject2;
            localObject1 = ap.c((String)localObject1, paramIntent, ((WebViewJSSDKVideoItem)localObject2).duration, ((WebViewJSSDKVideoItem)localObject2).height, ((WebViewJSSDKVideoItem)localObject2).width, ((WebViewJSSDKVideoItem)localObject2).size);
            ab.i("MicroMsg.JsApiChooseMedia", "after parse to json data : %s", new Object[] { localObject1 });
            paramIntent = new HashMap();
            paramIntent.put("type", Integer.valueOf(1));
            paramIntent.put("localIds", localObject1);
            h.a(this.ujZ, paramIntent);
            AppMethodBeat.o(6291);
            continue;
          }
          ab.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA nor the videoitem");
          break;
        }
        if (paramInt1 == 2)
        {
          paramIntent = paramIntent.getStringExtra("key_pick_local_media_local_ids");
          ab.i("MicroMsg.JsApiChooseMedia", "chooseMedia localIds:%s", new Object[] { paramIntent });
          if (bo.isNullOrNil(paramIntent))
          {
            ab.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult REQUEST_CHOOSE_MEDIA image localIds is null");
            h.a(this.ujZ, "fail");
            AppMethodBeat.o(6291);
          }
          else
          {
            localObject1 = new HashMap();
            ((HashMap)localObject1).put("type", Integer.valueOf(2));
            ((HashMap)localObject1).put("localIds", paramIntent);
            h.a(this.ujZ, (HashMap)localObject1);
            AppMethodBeat.o(6291);
          }
        }
        else
        {
          ab.e("MicroMsg.JsApiChooseMedia", "type:%d is error", new Object[] { Integer.valueOf(paramInt1) });
          h.a(this.ujZ, "fail");
          AppMethodBeat.o(6291);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.h.4
 * JD-Core Version:    0.6.2
 */