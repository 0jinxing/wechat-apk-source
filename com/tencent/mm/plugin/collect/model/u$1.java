package com.tencent.mm.plugin.collect.model;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.pr;
import com.tencent.mm.g.a.pr.a;
import com.tencent.mm.kernel.g;

final class u$1
  implements f
{
  u$1(u paramu, pr parampr)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(40998);
    if ((this.kCM.gnn != null) && (this.kCM.gnn.isShowing()))
    {
      this.kCM.gnn.dismiss();
      this.kCM.gnn = null;
    }
    g.Rg().b(1800, this);
    paramString = (k)paramm;
    paramString.a(new u.1.3(this)).b(new u.1.2(this, paramString)).c(new u.1.1(this));
    this.kCL.cLS.callback.run();
    AppMethodBeat.o(40998);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.u.1
 * JD-Core Version:    0.6.2
 */