package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class s$1
  implements n.b
{
  s$1(s params)
  {
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(45848);
    if (bo.g(paramObject, 0) == 339975)
    {
      g.RQ();
      paramInt = ((Integer)g.RP().Ry().get(339975, Integer.valueOf(0))).intValue();
      if (paramInt != s.a(this.tnI))
      {
        an.dhQ().reset();
        s.a(this.tnI, paramInt);
      }
      AppMethodBeat.o(45848);
    }
    while (true)
    {
      return;
      if (ac.a.xNQ.equals(paramObject))
      {
        g.RQ();
        paramInt = ((Integer)g.RP().Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
        if (paramInt != s.b(this.tnI))
        {
          an.dhQ().reset();
          s.b(this.tnI, paramInt);
        }
      }
      AppMethodBeat.o(45848);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.s.1
 * JD-Core Version:    0.6.2
 */