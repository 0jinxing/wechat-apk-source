package com.tencent.mm.plugin.welab.c;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.ac;
import com.tencent.mm.plugin.websearch.api.m;
import com.tencent.mm.plugin.welab.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public final class a
  implements b
{
  public final String ddq()
  {
    AppMethodBeat.i(26577);
    String str = ac.adL("discoverRecommendEntry").optString("labIcon");
    AppMethodBeat.o(26577);
    return str;
  }

  public final String ddr()
  {
    AppMethodBeat.i(26578);
    String str = ac.adL("discoverRecommendEntry").optString("wording");
    if (bo.isNullOrNil(str))
    {
      str = ah.getContext().getString(2131299820);
      AppMethodBeat.o(26578);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(26578);
    }
  }

  public final void f(Activity paramActivity, String paramString)
  {
    AppMethodBeat.i(26576);
    if (!aa.HU(0))
    {
      ab.e("MicroMsg.FTS.LookOneLookOpener", "fts h5 template not avail");
      AppMethodBeat.o(26576);
    }
    while (true)
    {
      return;
      paramString = ac.adL("discoverRecommendEntry").optString("wording");
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.FTS.LookOneLookOpener", "empty query");
        AppMethodBeat.o(26576);
      }
      else
      {
        ((m)g.K(m.class)).a(ah.getContext(), new a.1(this, paramString, paramActivity));
        AppMethodBeat.o(26576);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.c.a
 * JD-Core Version:    0.6.2
 */