package com.tencent.mm.sdk.platformtools;

import android.os.Build.VERSION;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n
{
  public static void ci(View paramView)
  {
    AppMethodBeat.i(51990);
    if (paramView == null)
      AppMethodBeat.o(51990);
    while (true)
    {
      return;
      ab.b("MicroMsg.ForceGpuUtil", "setLayerType, view: %s", new Object[] { Integer.valueOf(paramView.hashCode()) });
      if (Build.VERSION.SDK_INT >= 11)
      {
        new p();
        p.ci(paramView);
      }
      AppMethodBeat.o(51990);
    }
  }

  public static void w(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(51991);
    if (paramView == null)
      AppMethodBeat.o(51991);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 11)
      {
        new p();
        p.w(paramView, paramInt1, paramInt2);
      }
      AppMethodBeat.o(51991);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.n
 * JD-Core Version:    0.6.2
 */