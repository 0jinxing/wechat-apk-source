package com.tencent.mm.plugin.profile.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.openim.a.c.a;
import com.tencent.mm.openim.a.c.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.preference.Preference.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class a$5
  implements Preference.b
{
  public a$5(c.b paramb, ad paramad, c.a parama)
  {
  }

  public final boolean car()
  {
    AppMethodBeat.i(23254);
    Intent localIntent = new Intent();
    localIntent.setFlags(268435456);
    localIntent.setClassName(ah.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
    Object localObject1 = "";
    try
    {
      Object localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>(this.pkz.geX);
      localObject2 = ((JSONObject)localObject2).optString("url");
      localObject1 = localObject2;
      h.pYm.e(15319, new Object[] { this.emj.field_openImAppid, Integer.valueOf(this.pkz.action), this.pkA.title });
      localIntent.putExtra("geta8key_scene", 58);
      localIntent.putExtra("rawUrl", (String)localObject1);
      ah.getContext().startActivity(localIntent);
      AppMethodBeat.o(23254);
      return true;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Profile.OpenIMProfileLogic", localJSONException, "loadProfile", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.a.5
 * JD-Core Version:    0.6.2
 */