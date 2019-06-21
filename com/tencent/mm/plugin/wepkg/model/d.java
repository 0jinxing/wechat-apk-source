package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.b;
import com.tencent.mm.plugin.wepkg.utils.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.o;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class d
{
  private Map<String, f> uWM;
  private int uWN;

  public d()
  {
    AppMethodBeat.i(63520);
    this.uWM = new HashMap();
    this.uWN = 1;
    AppMethodBeat.o(63520);
  }

  public final void ahR(String paramString)
  {
    AppMethodBeat.i(63521);
    if (this.uWN > 3)
    {
      ab.i("MicroMsg.Wepkg.SupportIframe", "more than 3 wepkgs");
      AppMethodBeat.o(63521);
    }
    while (true)
    {
      return;
      String str = com.tencent.mm.plugin.wepkg.utils.d.aid(paramString);
      if ((!bo.isNullOrNil(str)) && (this.uWM.get(str) == null) && (!b.ahw(str)))
      {
        this.uWN += 1;
        f localf = b.bN(paramString, true);
        if ((localf != null) && (localf.uWY != null))
        {
          this.uWM.put(str, localf);
          a.b("EnterWeb", paramString, localf.uWY.eBS, localf.uWY.version, 1L, 0L, null);
          ab.i("MicroMsg.Wepkg.SupportIframe", "load wepkg: %s", new Object[] { str });
        }
      }
      AppMethodBeat.o(63521);
    }
  }

  public final o ahS(String paramString)
  {
    AppMethodBeat.i(63522);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(63522);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Iterator localIterator = this.uWM.values().iterator();
      while (true)
        if (localIterator.hasNext())
        {
          o localo = ((f)localIterator.next()).ahS(paramString);
          if (localo != null)
          {
            ab.i("MicroMsg.Wepkg.SupportIframe", "hit rid: %s", new Object[] { paramString });
            AppMethodBeat.o(63522);
            paramString = localo;
            break;
          }
        }
      AppMethodBeat.o(63522);
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.d
 * JD-Core Version:    0.6.2
 */