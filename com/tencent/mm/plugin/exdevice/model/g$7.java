package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ce;
import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.List;

final class g$7
  implements ap.a
{
  g$7(g paramg)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(19257);
    int i = this.lsY.lsJ.size();
    for (int j = 0; j < i; j++)
      if ((((b)this.lsY.lsJ.get(j)).dFr.contains("internet_to_device")) && (((b)this.lsY.lsJ.get(j)).dFr.contains("wechat_to_device")) && (!this.lsY.lsK.contains(this.lsY.lsJ.get(j))))
      {
        this.lsY.lsK.add(this.lsY.lsJ.get(j));
        g.bx(this.lsY.lsK);
      }
    AppMethodBeat.o(19257);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.g.7
 * JD-Core Version:    0.6.2
 */