package com.tencent.mm.plugin.appbrand.r;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

public final class q
{
  public static <T extends q.a> String a(Context paramContext, String paramString, T paramT)
  {
    AppMethodBeat.i(91177);
    String str = "Luggage.UserAgentUtil, appendUserAgent fail, context is null, stack = " + bo.dpG();
    boolean bool;
    if (paramContext != null)
    {
      bool = true;
      Assert.assertTrue(str, bool);
      if (paramString != null)
        break label159;
    }
    label159: for (paramContext = paramT.xJ(); ; paramContext = paramString + paramT.xJ())
    {
      paramContext = paramContext + paramT.xK();
      paramString = at.gB(ah.getContext());
      paramContext = paramContext + " NetType/" + paramString;
      paramContext = paramContext + " Language/" + aa.gw(ah.getContext());
      ab.i("Luggage.UserAgentUtil", "appendUserAgent, uaStr = ".concat(String.valueOf(paramContext)));
      AppMethodBeat.o(91177);
      return paramContext;
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.q
 * JD-Core Version:    0.6.2
 */