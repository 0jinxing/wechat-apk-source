package com.tencent.mm.compatible.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;

public final class a
{
  public static boolean a(int paramInt, a parama)
  {
    AppMethodBeat.i(51922);
    boolean bool;
    if (d.iW(paramInt))
    {
      parama.run();
      bool = true;
      AppMethodBeat.o(51922);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(51922);
    }
  }

  public static abstract interface a
  {
    public abstract void run();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.a.a
 * JD-Core Version:    0.6.2
 */