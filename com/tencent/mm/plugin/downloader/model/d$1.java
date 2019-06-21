package com.tencent.mm.plugin.downloader.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.ac;
import com.tencent.mm.plugin.downloader.f.a;

final class d$1
  implements Runnable
{
  d$1(d paramd, a parama, int paramInt, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2407);
    if ((g.RO().eJo == null) || (g.RO().eJo.ftA == null))
      AppMethodBeat.o(2407);
    while (true)
    {
      return;
      new ac(this.kMF.field_packageName, this.kMW).a(g.RO().eJo.ftA, new d.1.1(this));
      AppMethodBeat.o(2407);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.model.d.1
 * JD-Core Version:    0.6.2
 */