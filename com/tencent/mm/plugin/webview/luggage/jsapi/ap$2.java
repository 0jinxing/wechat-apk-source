package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.a.py.a;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.model.t;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.json.JSONObject;

final class ap$2
  implements MMActivity.a
{
  ap$2(ap paramap, JSONObject paramJSONObject, bc.a parama, Context paramContext)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(6368);
    Object localObject1;
    if (paramInt1 == 1)
      localObject1 = this.hsm.optString("appid");
    switch (paramInt2)
    {
    default:
      this.kOw.d("fail", null);
      AppMethodBeat.o(6368);
    case -1:
    case 0:
    case 1:
    }
    label278: 
    while (true)
    {
      return;
      if (paramIntent == null);
      for (String str = null; ; str = paramIntent.getStringExtra("Select_Conv_User"))
      {
        if ((str != null) && (str.length() != 0))
          break label122;
        ab.e("MicroMsg.JsApiSendAppMessage", "mmOnActivityResult fail, toUser is null");
        this.kOw.d("fail", null);
        AppMethodBeat.o(6368);
        break;
      }
      label122: if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.JsApiSendAppMessage", "toUser is null");
        AppMethodBeat.o(6368);
      }
      else
      {
        o.ahk();
        Object localObject2 = c.kR(this.hsm.optString("img_url"));
        Object localObject3 = ap.aN(this.hsm);
        if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled()))
        {
          ab.i("MicroMsg.JsApiSendAppMessage", "thumb image is not null");
          localObject4 = new ByteArrayOutputStream();
          ((Bitmap)localObject2).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject4);
          ((WXMediaMessage)localObject3).thumbData = ((ByteArrayOutputStream)localObject4).toByteArray();
        }
        Object localObject4 = g.bT((String)localObject1, true);
        localObject2 = new py();
        ((py)localObject2).cMe.cEl = ((WXMediaMessage)localObject3);
        ((py)localObject2).cMe.appId = ((String)localObject1);
        localObject3 = ((py)localObject2).cMe;
        if (localObject4 == null)
        {
          localObject1 = "";
          ((py.a)localObject3).appName = ((String)localObject1);
          ((py)localObject2).cMe.toUser = str;
          ((py)localObject2).cMe.cMf = 2;
          if (!bo.isNullOrNil(this.hsm.optString("src_username")))
            break label509;
          ((py)localObject2).cMe.cMi = null;
        }
        while (true)
        {
          ((py)localObject2).cMe.cMj = this.hsm.optString("shareUrl");
          ((py)localObject2).cMe.cMk = this.hsm.optString("currentUrl");
          ((py)localObject2).cMe.cMl = this.hsm.optString("preVerifyAppId");
          a.xxA.m((b)localObject2);
          paramIntent = paramIntent.getStringExtra("custom_send_text");
          if (!bo.isNullOrNil(paramIntent))
          {
            localObject1 = new qb();
            ((qb)localObject1).cMq.cMr = str;
            ((qb)localObject1).cMq.content = paramIntent;
            ((qb)localObject1).cMq.type = t.nK(str);
            ((qb)localObject1).cMq.flags = 0;
            a.xxA.m((b)localObject1);
          }
          h.bQ(this.val$context, this.val$context.getResources().getString(2131297050));
          this.kOw.d(null, null);
          AppMethodBeat.o(6368);
          break;
          localObject1 = ((f)localObject4).field_appName;
          break label278;
          label509: ((py)localObject2).cMe.cMg = this.hsm.optString("src_username");
          ((py)localObject2).cMe.cMh = this.hsm.optString("src_displayname");
        }
        this.kOw.d("cancel", null);
        AppMethodBeat.o(6368);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ap.2
 * JD-Core Version:    0.6.2
 */