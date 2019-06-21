package com.tencent.mm.plugin.expt.hellhound.core;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.hellhound.core.stack.d;
import com.tencent.mm.plugin.expt.hellhound.core.stack.e;
import com.tencent.mm.plugin.expt.hellhound.core.stack.f;
import com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.b;

@TargetApi(14)
public class a
{
  private static volatile a lMj;
  public c lMk;

  private a()
  {
    AppMethodBeat.i(73343);
    if (!bqn())
      AppMethodBeat.o(73343);
    while (true)
    {
      return;
      this.lMk = new com.tencent.mm.plugin.expt.hellhound.core.v2.activity.c();
      d.bqu();
      b.bqC();
      com.tencent.mm.plugin.expt.hellhound.a.b.a.bqG();
      AppMethodBeat.o(73343);
    }
  }

  public static void a(f paramf)
  {
    AppMethodBeat.i(73344);
    d.bqu().lMw.lMx.lMA = paramf;
    AppMethodBeat.o(73344);
  }

  public static a bqm()
  {
    AppMethodBeat.i(73342);
    if (lMj == null);
    try
    {
      if (lMj == null)
      {
        locala = new com/tencent/mm/plugin/expt/hellhound/core/a;
        locala.<init>();
        lMj = locala;
      }
      a locala = lMj;
      AppMethodBeat.o(73342);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(73342);
    }
  }

  public static boolean bqn()
  {
    if (Build.VERSION.SDK_INT >= 14);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.a
 * JD-Core Version:    0.6.2
 */