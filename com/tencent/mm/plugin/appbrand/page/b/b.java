package com.tencent.mm.plugin.appbrand.page.b;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.ui.n;
import java.util.concurrent.atomic.AtomicReference;

public class b
  implements c
{
  protected final u ivs;
  protected final AtomicReference<c.b> ivt;

  b(u paramu)
  {
    AppMethodBeat.i(87370);
    this.ivt = new AtomicReference();
    this.ivt.set(c.b.ivu);
    this.ivs = paramu;
    AppMethodBeat.o(87370);
  }

  public void aAS()
  {
    AppMethodBeat.i(87372);
    if ((this.ivs.mContext instanceof Activity))
      n.c(((Activity)this.ivs.mContext).getWindow(), false);
    AppMethodBeat.o(87372);
  }

  public void aBr()
  {
  }

  public void aBs()
  {
  }

  public final c.b aBt()
  {
    AppMethodBeat.i(87371);
    c.b localb = (c.b)this.ivt.get();
    AppMethodBeat.o(87371);
    return localb;
  }

  public void onOrientationChanged(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.b.b
 * JD-Core Version:    0.6.2
 */