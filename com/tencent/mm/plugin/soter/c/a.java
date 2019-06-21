package com.tencent.mm.plugin.soter.c;

import android.app.Activity;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.soter.d.j;
import com.tencent.mm.plugin.soter.d.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.ref.WeakReference;

public enum a
{
  static
  {
    AppMethodBeat.i(73863);
    rNL = new a("IML");
    rNM = new a[] { rNL };
    AppMethodBeat.o(73863);
  }

  public static c a(Activity paramActivity, j paramj, k paramk, Handler paramHandler)
  {
    AppMethodBeat.i(73862);
    if (((paramj.rOi & 0x1) != 0) && (com.tencent.soter.core.a.iP(ah.getContext())))
    {
      paramActivity = new b(new WeakReference(paramActivity), paramj, paramk, paramHandler);
      AppMethodBeat.o(73862);
    }
    while (true)
    {
      return paramActivity;
      ab.e("MicroMsg.SoterControllerFactory", "hy: no matching: %d", new Object[] { Byte.valueOf(paramj.rOi) });
      paramActivity = null;
      AppMethodBeat.o(73862);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.c.a
 * JD-Core Version:    0.6.2
 */