package com.tencent.mm.plugin.websearch;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.g.a.ll;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class a$1
  implements Runnable
{
  a$1(a parama, Map paramMap, String paramString1, int paramInt1, String paramString2, boolean paramBoolean1, int paramInt2, String paramString3, boolean paramBoolean2, boolean paramBoolean3, int paramInt3, Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91330);
    if (!aa.HU(0))
    {
      ab.e("StartWebSearchService", "fts h5 template not avail");
      AppMethodBeat.o(91330);
    }
    while (true)
    {
      return;
      Object localObject1 = "";
      int i = -1;
      JSONObject localJSONObject = new JSONObject();
      Object localObject2 = "";
      if (this.tZe != null)
      {
        localObject2 = (String)this.tZe.get("sugId");
        if (!this.tZe.containsKey("parentSearchID"))
          break label528;
        localObject1 = (String)this.tZe.get("parentSearchID");
      }
      try
      {
        localJSONObject.put("parentSearchID", localObject1);
        localObject3 = (String)this.tZe.get("sugId");
        i = bo.ank((String)this.tZe.get("sceneActionType"));
        localObject2 = localObject1;
        localObject1 = localObject3;
        String str = String.valueOf(System.currentTimeMillis());
        localObject3 = aa.HP(this.fwD);
        aa.a(str, this.hno, (String)localObject3, this.IP, this.fwD, (String)localObject1, i, (String)localObject2);
        localObject1 = new ll();
        ((ll)localObject1).cHk.scene = 0;
        com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
        localObject1 = aa.a(this.fwD, this.tZf, 0, Uri.encode(localJSONObject.toString()), "", this.hno, this.IP, "", (String)localObject3, "", str);
        if (this.tZe != null)
          ((Map)localObject1).putAll(this.tZe);
      }
      catch (JSONException localJSONException)
      {
        try
        {
          Object localObject3;
          ((Map)localObject1).put("query", q.encode(this.IP, "UTF-8"));
          ((Map)localObject1).put("sessionId", this.hno);
          localObject1 = aa.E((Map)localObject1);
          localObject2 = aa.cVd();
          ((Intent)localObject2).putExtra("ftsType", this.bVv);
          ((Intent)localObject2).putExtra("title", this.chV);
          ((Intent)localObject2).putExtra("ftsbizscene", this.fwD);
          ((Intent)localObject2).putExtra("ftsQuery", this.IP);
          if ((!TextUtils.isEmpty(this.IP)) || (this.tZg))
          {
            bool = true;
            ((Intent)localObject2).putExtra("ftsInitToSearch", bool);
            ((Intent)localObject2).putExtra("sessionId", this.hno);
            ((Intent)localObject2).putExtra("subSessionId", (String)localObject3);
            ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
            ((Intent)localObject2).putExtra("key_preload_biz", a.cUG());
            ((Intent)localObject2).putExtra("key_weapp_url", a.adB(this.hno));
            if (this.tZh)
              ((Intent)localObject2).putExtra("status_bar_style", "black");
            if (this.tZi != 2147483647)
              ((Intent)localObject2).putExtra("customize_status_bar_color", this.tZi);
            ((Intent)localObject2).putExtra("key_load_js_without_delay", true);
            if (this.fwD == 56)
              ((Intent)localObject2).putExtra("ftsneedkeyboard", true);
            d.b(this.val$context, "webview", ".ui.tools.fts.FTSSOSHomeWebViewUI", (Intent)localObject2);
            a.cUH();
            AppMethodBeat.o(91330);
            continue;
            label528: localObject3 = new StringBuilder();
            if (this.tZe.containsKey("clickType"));
            for (localObject1 = (String)this.tZe.get("clickType") + ":"; ; localObject1 = "0:")
            {
              localObject1 = (String)localObject1 + (String)localObject2 + ":" + this.IP + ":";
              break;
            }
            localJSONException = localJSONException;
            ab.b("StartWebSearchService", "", new Object[] { localJSONException });
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ((Map)localObject1).put("query", this.IP);
            continue;
            boolean bool = false;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.a.1
 * JD-Core Version:    0.6.2
 */