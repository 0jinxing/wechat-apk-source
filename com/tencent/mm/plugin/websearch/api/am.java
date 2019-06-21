package com.tencent.mm.plugin.websearch.api;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class am
{
  private static am uaT;
  public am.a uaS;

  static
  {
    AppMethodBeat.i(124212);
    uaT = new am();
    AppMethodBeat.o(124212);
  }

  private am()
  {
    AppMethodBeat.i(124209);
    Object localObject = (String)g.RP().Ry().get(ac.a.xSI, "");
    this.uaS = new am.a();
    am.a locala = this.uaS;
    try
    {
      if (!TextUtils.isEmpty((CharSequence)localObject))
      {
        localObject = ((String)localObject).split("&");
        locala.id = bo.t(localObject[0], new Object[0]);
        locala.uaU = bo.ank(localObject[1]);
        locala.uaV = bo.ank(localObject[2]);
        locala.oak = bo.anl(localObject[3]);
        locala.tZU = bo.ank(localObject[4]);
        locala.type = bo.ank(localObject[5]);
        locala.text = localObject[6];
        locala.cIY = localObject[7];
        locala.timestamp = bo.anl(localObject[8]);
        locala.uaW = bo.ank(localObject[9]);
        locala.fJB = bo.anl(localObject[10]);
        locala.uaX = bo.ank(localObject[11]);
      }
      AppMethodBeat.o(124209);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WebSearch.WebSearchRedPointMgr", localException, "", new Object[0]);
        AppMethodBeat.o(124209);
      }
    }
  }

  public static am cVt()
  {
    return uaT;
  }

  public static long cVu()
  {
    AppMethodBeat.i(124211);
    Object localObject = g.RP().Ry().get(ac.a.xVd, null);
    long l;
    if (localObject == null)
    {
      l = 0L;
      AppMethodBeat.o(124211);
    }
    while (true)
    {
      return l;
      l = ((Long)localObject).longValue();
      AppMethodBeat.o(124211);
    }
  }

  public final void save()
  {
    AppMethodBeat.i(124210);
    if (this.uaS == null);
    for (String str = ""; ; str = this.uaS.aDu())
    {
      g.RP().Ry().set(ac.a.xSI, str);
      AppMethodBeat.o(124210);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.am
 * JD-Core Version:    0.6.2
 */