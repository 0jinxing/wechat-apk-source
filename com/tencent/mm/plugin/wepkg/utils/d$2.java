package com.tencent.mm.plugin.wepkg.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.plugin.wepkg.model.a;
import com.tencent.mm.sdk.platformtools.ab;

final class d$2
  implements Runnable
{
  d$2(long paramLong, a parama, WepkgCrossProcessTask paramWepkgCrossProcessTask)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63650);
    ab.i("MicroMsg.Wepkg.WepkgUtil", "bind service time:%s", new Object[] { Long.valueOf(System.currentTimeMillis() - this.uYg) });
    if (this.uXt != null)
      this.uXt.a(this.uXk);
    this.uXk.aBW();
    AppMethodBeat.o(63650);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.utils.d.2
 * JD-Core Version:    0.6.2
 */