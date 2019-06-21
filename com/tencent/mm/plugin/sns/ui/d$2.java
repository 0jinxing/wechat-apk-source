package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.List;

final class d$2
  implements Runnable
{
  d$2(d paramd, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38078);
    this.rgc.dq(this.rgd);
    d locald = this.rgc;
    boolean bool = this.rge;
    af.cno().post(new d.3(locald, bool));
    AppMethodBeat.o(38078);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.2
 * JD-Core Version:    0.6.2
 */