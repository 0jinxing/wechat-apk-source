package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.a.b;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.Set;

final class g$9
  implements Runnable
{
  g$9(g paramg, int paramInt, bau parambau, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36144);
    while (g.e(this.qIr).size() >= 60)
    {
      localb = (g.b)g.e(this.qIr).removeFirst();
      this.qIr.qIp.remove(localb.key);
    }
    ab.i("MicroMsg.LazyerImageLoader2", "add loaderlist size:" + g.e(this.qIr).size());
    g.b localb = new g.b(this.qIr, i.bc(this.qIt, this.qIs.Id), this.qID + this.qIE, this.qID, this.qIs, this.qIt);
    if (!g.f(this.qIr).aj(localb.key))
      g.e(this.qIr).add(localb);
    while (true)
    {
      g.g(this.qIr);
      AppMethodBeat.o(36144);
      return;
      this.qIr.qIp.remove(localb.key);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.g.9
 * JD-Core Version:    0.6.2
 */