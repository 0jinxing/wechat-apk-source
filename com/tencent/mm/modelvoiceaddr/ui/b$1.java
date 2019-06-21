package com.tencent.mm.modelvoiceaddr.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.r.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.tools.d;

final class b$1
  implements VoiceSearchLayout.a
{
  b$1(b paramb)
  {
  }

  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong)
  {
    AppMethodBeat.i(116787);
    ab.d("MicroMsg.VoiceSearchViewHelper", "on voice search return, success %B, voice id %d", new Object[] { Boolean.valueOf(paramBoolean), Long.valueOf(paramLong) });
    if (this.gcr.gco != null)
      this.gcr.gco.a(paramBoolean, paramArrayOfString, paramLong, this.gcr.gcn);
    AppMethodBeat.o(116787);
  }

  public final void amE()
  {
    AppMethodBeat.i(116785);
    if ((a.bJ(ah.getContext())) || (a.bH(ah.getContext())))
      AppMethodBeat.o(116785);
    while (true)
    {
      return;
      ab.d("MicroMsg.VoiceSearchViewHelper", "on voice search start");
      h.pYm.e(10453, new Object[] { Integer.valueOf(this.gcr.gcm), Integer.valueOf(3) });
      if (this.gcr.gco != null)
        this.gcr.gco.amJ();
      AppMethodBeat.o(116785);
    }
  }

  public final void amF()
  {
    AppMethodBeat.i(116786);
    ab.d("MicroMsg.VoiceSearchViewHelper", "on voice search cancel");
    h.pYm.e(10453, new Object[] { Integer.valueOf(this.gcr.gcm), Integer.valueOf(4) });
    if (this.gcr.zGZ != null)
    {
      this.gcr.zGZ.setEditTextEnabled(true);
      this.gcr.zGZ.setStatusBtnEnabled(true);
    }
    AppMethodBeat.o(116786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.ui.b.1
 * JD-Core Version:    0.6.2
 */