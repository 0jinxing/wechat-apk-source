package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.openim.a.c.a;
import com.tencent.mm.openim.a.c.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference.b;
import org.json.JSONException;
import org.json.JSONObject;

final class k$9
  implements Preference.b
{
  k$9(k paramk, c.b paramb, c.a parama)
  {
  }

  public final boolean car()
  {
    AppMethodBeat.i(23573);
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(this.pkz.geX);
      String str = ((JSONObject)localObject).optString("name");
      localObject = ((JSONObject)localObject).optString("pagepath");
      se localse = new com/tencent/mm/g/a/se;
      localse.<init>();
      localse.cOf.userName = str;
      localse.cOf.cOh = bo.bc((String)localObject, "");
      a.xxA.m(localse);
      h.pYm.e(15319, new Object[] { this.pno.ehM.field_openImAppid, Integer.valueOf(this.pkz.action), this.pkA.title });
      AppMethodBeat.o(23573);
      return true;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ContactWidgetNormal", localJSONException, "loadProfile", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.k.9
 * JD-Core Version:    0.6.2
 */