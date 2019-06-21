package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.openim.a.c.a;
import com.tencent.mm.openim.a.c.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference.b;
import org.json.JSONException;
import org.json.JSONObject;

final class k$6
  implements Preference.b
{
  k$6(k paramk, c.b paramb, c.a parama)
  {
  }

  public final boolean car()
  {
    AppMethodBeat.i(23570);
    Object localObject1 = this.pkz.geX;
    try
    {
      Object localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>(this.pkz.geX);
      localObject2 = ((JSONObject)localObject2).optString("tel");
      localObject1 = localObject2;
      h.pYm.e(15319, new Object[] { this.pno.ehM.field_openImAppid, Integer.valueOf(this.pkz.action), this.pkA.title });
      localObject1 = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(localObject1))));
      ((Intent)localObject1).setFlags(268435456);
      this.pno.crP.startActivity((Intent)localObject1);
      AppMethodBeat.o(23570);
      return true;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ContactWidgetNormal", localJSONException, "OpenIMCustomDetail.OPENIM_ACTION_DIAL_PHONE click parse error", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.k.6
 * JD-Core Version:    0.6.2
 */