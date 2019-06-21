package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.e;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Map;

final class ar$5
  implements Runnable
{
  ar$5(ar paramar, String paramString, Object[] paramArrayOfObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36649);
    o.alm().m(this.qNc, this.fzu);
    if ((this.qNb.qMW != null) && (bo.isEqual(this.qNb.qMW.fUL, this.qNc)))
      ar.a(this.qNb);
    ay localay = (ay)this.qNb.qMY.get(this.qNc);
    this.qNb.qMX.remove(localay);
    AppMethodBeat.o(36649);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ar.5
 * JD-Core Version:    0.6.2
 */