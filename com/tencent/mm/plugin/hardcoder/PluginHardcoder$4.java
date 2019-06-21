package com.tencent.mm.plugin.hardcoder;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class PluginHardcoder$4
  implements Runnable
{
  PluginHardcoder$4(PluginHardcoder paramPluginHardcoder)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(60255);
    ab.i("MicroMsg.PluginHardcoder", "reportHardcoderRunnable start to run");
    g.RQ();
    long l1 = ((Long)g.RP().Ry().get(ac.a.xOH, Long.valueOf(0L))).longValue();
    long l2 = System.currentTimeMillis();
    if ((l2 - l1 > 86400000L) || (l1 > l2))
    {
      g.RQ();
      g.RP().Ry().set(ac.a.xOH, Long.valueOf(l2));
      d.post(new PluginHardcoder.4.1(this), "reportHardCoder");
    }
    AppMethodBeat.o(60255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hardcoder.PluginHardcoder.4
 * JD-Core Version:    0.6.2
 */