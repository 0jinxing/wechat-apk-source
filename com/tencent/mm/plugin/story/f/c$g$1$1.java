package com.tencent.mm.plugin.story.f;

import a.l;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.e.a;
import com.tencent.mm.plugin.story.ui.StoryCaptureUI.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class c$g$1$1
  implements Runnable
{
  c$g$1$1(c.g.1 param1, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109530);
    Object localObject = this.rYP.rYN.rYB.rYt;
    if (localObject != null)
      ((c.a)localObject).dismiss();
    this.rYP.rYN.rYB.rYt = null;
    localObject = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.g(this.rYQ, this.rYP.rYN.rYB.rWx.fbT, this.rYP.rYN.rYB.rWx.fbV);
    localObject = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.bl(this.rYQ, this.rYP.rYO);
    com.tencent.mm.ui.base.h.bN(this.rYP.rYN.rYB.context, this.rYP.rYN.rYB.context.getString(2131297044));
    this.rYP.rYN.rYB.rYv.exit();
    AppMethodBeat.o(109530);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.c.g.1.1
 * JD-Core Version:    0.6.2
 */