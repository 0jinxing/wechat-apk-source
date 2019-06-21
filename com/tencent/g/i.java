package com.tencent.g;

import android.content.Context;
import com.tencent.g.b.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.c.c;

public final class i
{
  private static i AHM;
  private Context Gn;
  private boolean mStarted;

  public static void dM(Context paramContext)
  {
    AppMethodBeat.i(127763);
    i locali = dSH();
    if (!locali.mStarted)
    {
      locali.Gn = paramContext;
      paramContext = new d("EventCenter", com.tencent.g.a.b.class.getName());
    }
    while (true)
    {
      try
      {
        paramContext = f.a(paramContext);
        if (paramContext != null)
          paramContext.start();
        AppMethodBeat.o(127763);
        return;
      }
      catch (Throwable paramContext)
      {
        c.w("service", new Object[] { paramContext });
      }
      AppMethodBeat.o(127763);
    }
  }

  private static i dSH()
  {
    AppMethodBeat.i(127762);
    if (AHM == null);
    try
    {
      if (AHM == null)
      {
        locali = new com/tencent/g/i;
        locali.<init>();
        AHM = locali;
      }
      i locali = AHM;
      AppMethodBeat.o(127762);
      return locali;
    }
    finally
    {
      AppMethodBeat.o(127762);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.g.i
 * JD-Core Version:    0.6.2
 */