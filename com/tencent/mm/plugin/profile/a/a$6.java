package com.tencent.mm.plugin.profile.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.openim.a.c.a;
import com.tencent.mm.openim.a.c.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.preference.Preference.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class a$6
  implements Preference.b
{
  public a$6(c.b paramb, ad paramad, c.a parama)
  {
  }

  public final boolean car()
  {
    AppMethodBeat.i(23255);
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(this.pkz.geX);
      String str1 = ((JSONObject)localObject).optString("name");
      String str2 = ((JSONObject)localObject).optString("pagepath");
      localObject = new com/tencent/mm/g/a/se;
      ((se)localObject).<init>();
      ((se)localObject).cOf.userName = str1;
      ((se)localObject).cOf.cOh = bo.bc(str2, "");
      a.xxA.m((b)localObject);
      h.pYm.e(15319, new Object[] { this.emj.field_openImAppid, Integer.valueOf(this.pkz.action), this.pkA.title });
      AppMethodBeat.o(23255);
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
 * Qualified Name:     com.tencent.mm.plugin.profile.a.a.6
 * JD-Core Version:    0.6.2
 */