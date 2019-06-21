package com.tencent.mm.plugin.appbrand.page.b;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;

public abstract interface c
{
  public abstract void aAS();

  public abstract void aBr();

  public abstract void aBs();

  public abstract c.b aBt();

  public abstract void onOrientationChanged(int paramInt);

  public static final class a
  {
    public static c r(u paramu)
    {
      AppMethodBeat.i(87373);
      if (Build.VERSION.SDK_INT >= 21)
      {
        paramu = new a(paramu);
        AppMethodBeat.o(87373);
      }
      while (true)
      {
        return paramu;
        paramu = new b(paramu);
        AppMethodBeat.o(87373);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.b.c
 * JD-Core Version:    0.6.2
 */