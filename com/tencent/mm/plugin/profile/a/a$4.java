package com.tencent.mm.plugin.profile.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.openim.a.c.a;
import com.tencent.mm.openim.a.c.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.preference.Preference.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class a$4
  implements Preference.b
{
  public a$4(c.b paramb, ad paramad, c.a parama, Context paramContext)
  {
  }

  public final boolean car()
  {
    AppMethodBeat.i(23253);
    Object localObject1 = "";
    try
    {
      Object localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>(this.pkz.geX);
      localObject2 = ((JSONObject)localObject2).optString("mailto");
      localObject1 = localObject2;
      h.pYm.e(15319, new Object[] { this.emj.field_openImAppid, Integer.valueOf(this.pkz.action), this.pkA.title });
      localObject2 = new Intent("android.intent.action.SENDTO");
      ((Intent)localObject2).setData(Uri.parse("mailto:".concat(String.valueOf(localObject1))));
      this.val$context.startActivity((Intent)localObject2);
      AppMethodBeat.o(23253);
      return true;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Profile.OpenIMProfileLogic", localJSONException, "loadProfile", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.a.4
 * JD-Core Version:    0.6.2
 */