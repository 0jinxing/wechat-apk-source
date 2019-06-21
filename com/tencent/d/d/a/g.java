package com.tencent.d.d.a;

import com.tencent.d.d.b.d.a;
import com.tencent.d.f.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g
  implements b
{
  private final List<d.a> Atc;
  private final Pattern yNM;

  public g()
  {
    AppMethodBeat.i(114512);
    this.Atc = new ArrayList();
    this.yNM = Pattern.compile("^/system/xbin/ku\\.sud$|^daemonsu:|^k_worker/[1-9]\\d*:[1-9]\\d*$|^kr_worker/[1-9]\\d*:[1-9]\\d*$|^km_worker/[1-9]\\d*:[1-9]\\d*$|^tworker/[1-9]\\d*:[1-9]\\d*$|^tu_worker/[1-9]\\d*:[1-9]\\d*$|^tq_worker/[1-9]\\d*:[1-9]\\d*$|^kworker/[1-9]\\d{2}$|^permmgrd$|^360sguard$|^/data/data/[\\w\\-\\.]+/");
    AppMethodBeat.o(114512);
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(114513);
    if (parama.uid != 0)
      AppMethodBeat.o(114513);
    while (true)
    {
      return;
      if (parama.Atj != 1)
      {
        AppMethodBeat.o(114513);
      }
      else
      {
        this.Atc.add(parama);
        AppMethodBeat.o(114513);
      }
    }
  }

  public final boolean dQl()
  {
    AppMethodBeat.i(114514);
    Iterator localIterator = this.Atc.iterator();
    boolean bool;
    while (localIterator.hasNext())
    {
      d.a locala = (d.a)localIterator.next();
      new StringBuilder("SingleProcessAnalyzer : ").append(locala.toString());
      h.dQH();
      if ((locala.name != null) && (this.yNM.matcher(locala.name).find()))
      {
        new StringBuilder("SingleProcessAnalyzer match : ").append(locala.toString());
        h.dQG();
        bool = true;
        AppMethodBeat.o(114514);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(114514);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.a.g
 * JD-Core Version:    0.6.2
 */