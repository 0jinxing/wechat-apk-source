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

public final class a$3
  implements Preference.b
{
  public a$3(c.b paramb, ad paramad, c.a parama, Context paramContext)
  {
  }

  public final boolean car()
  {
    AppMethodBeat.i(23252);
    Object localObject1 = this.pkz.geX;
    try
    {
      Object localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>(this.pkz.geX);
      localObject2 = ((JSONObject)localObject2).optString("tel");
      localObject1 = localObject2;
      h.pYm.e(15319, new Object[] { this.emj.field_openImAppid, Integer.valueOf(this.pkz.action), this.pkA.title });
      localObject1 = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(localObject1))));
      ((Intent)localObject1).setFlags(268435456);
      this.val$context.startActivity((Intent)localObject1);
      AppMethodBeat.o(23252);
      return true;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.Profile.OpenIMProfileLogic", localJSONException, "OpenIMCustomDetail.OPENIM_ACTION_DIAL_PHONE click parse error", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.a.3
 * JD-Core Version:    0.6.2
 */