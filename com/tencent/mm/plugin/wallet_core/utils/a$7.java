package com.tencent.mm.plugin.wallet_core.utils;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;

final class a$7
  implements f
{
  a$7(a parama, Context paramContext)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(47990);
    g.RQ();
    g.RO().eJo.b(1650, this);
    this.tOT.tOS = null;
    if (this.tOT.eBA != null)
    {
      this.tOT.b(this.val$context, this.tOT.eBA);
      this.tOT.eBA = null;
    }
    AppMethodBeat.o(47990);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.utils.a.7
 * JD-Core Version:    0.6.2
 */