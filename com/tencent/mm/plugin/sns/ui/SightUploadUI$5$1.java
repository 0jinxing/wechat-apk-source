package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.b.c.a;

final class SightUploadUI$5$1
  implements c.a
{
  SightUploadUI$5$1(SightUploadUI.5 param5, int paramInt)
  {
  }

  public final void JW()
  {
  }

  public final void JX()
  {
    AppMethodBeat.i(38589);
    com.tencent.mm.ui.base.h.g(this.rnq.rnn, 2131303848, 2131303849);
    AppMethodBeat.o(38589);
  }

  public final void ki(String paramString)
  {
    AppMethodBeat.i(38588);
    PInt localPInt = new PInt();
    SightUploadUI.j(this.rnq.rnn).a(SightUploadUI.c(this.rnq.rnn), 0, null, SightUploadUI.d(this.rnq.rnn), null, SightUploadUI.e(this.rnq.rnn).getLocation(), this.rnp, SightUploadUI.f(this.rnq.rnn), SightUploadUI.g(this.rnq.rnn), localPInt, "", SightUploadUI.h(this.rnq.rnn), SightUploadUI.i(this.rnq.rnn));
    paramString = com.tencent.mm.plugin.report.service.h.pYm;
    long l1 = SightUploadUI.k(this.rnq.rnn);
    long l2 = bo.anT();
    if (SightUploadUI.l(this.rnq.rnn))
    {
      i = 0;
      paramString.e(13303, new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), Integer.valueOf(localPInt.value) });
      l2 = SightUploadUI.k(this.rnq.rnn);
      l1 = bo.anT();
      if (!SightUploadUI.l(this.rnq.rnn))
        break label280;
    }
    label280: for (int i = 0; ; i = 1)
    {
      ab.d("MicroMsg.SightUploadUI", "reprot timelinePostAction(13303), %d, %d, %d, %d", new Object[] { Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(localPInt.value) });
      AppMethodBeat.o(38588);
      return;
      i = 1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SightUploadUI.5.1
 * JD-Core Version:    0.6.2
 */