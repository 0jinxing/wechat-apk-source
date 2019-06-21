package com.tencent.mm.ui.voicesearch;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.a.f;
import com.tencent.mm.storage.ad;

final class b$7
  implements Runnable
{
  b$7(b paramb, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35333);
    if (b.b(this.zLA).isHidden())
    {
      b.b(this.zLA).NL();
      if (!b.c(this.zLA))
        break label84;
      f localf = new f(this.zLB, 3);
      aw.Rg().a(localf, 0);
      b.d(this.zLA);
      AppMethodBeat.o(35333);
    }
    while (true)
    {
      return;
      b.b(this.zLA).NK();
      label84: AppMethodBeat.o(35333);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.b.7
 * JD-Core Version:    0.6.2
 */