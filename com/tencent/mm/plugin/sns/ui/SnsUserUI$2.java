package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsUserUI$2
  implements Runnable
{
  SnsUserUI$2(SnsUserUI paramSnsUserUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39786);
    if (SnsUserUI.l(this.rDa))
    {
      ab.w("MicroMsg.SnsUserUI", "too fast that it finish");
      AppMethodBeat.o(39786);
    }
    while (true)
    {
      return;
      SnsUserUI.b(this.rDa).a(SnsUserUI.m(this.rDa).getType(), SnsUserUI.c(this.rDa), this.rDa);
      if ((SnsUserUI.m(this.rDa).getType() == 1) && (SnsUserUI.m(this.rDa).cuk()))
        af.cnv().B(af.cnM().qMB, -1);
      if (!SnsUserUI.m(this.rDa).cuk())
      {
        am.a locala = SnsUserUI.b(this.rDa);
        int i = SnsUserUI.m(this.rDa).getType();
        String str = SnsUserUI.c(this.rDa);
        SnsUserUI.d(this.rDa);
        locala.a(i, str, SnsUserUI.f(this.rDa), SnsUserUI.e(this.rDa));
      }
      AppMethodBeat.o(39786);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI.2
 * JD-Core Version:    0.6.2
 */