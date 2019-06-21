package com.tencent.mm.plugin.card.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.a;
import com.tencent.mm.plugin.card.model.am;

public final class d
  implements a
{
  private c kiD;

  public d(c paramc)
  {
    this.kiD = paramc;
  }

  public final void ZZ()
  {
    AppMethodBeat.i(88253);
    if (this.kiD != null)
      this.kiD.a(null, null);
    AppMethodBeat.o(88253);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(88251);
    if (this.kiD != null)
      am.baW().c(this.kiD);
    AppMethodBeat.o(88251);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(88252);
    if (this.kiD != null)
    {
      am.baW().d(this.kiD);
      this.kiD.release();
      this.kiD = null;
    }
    AppMethodBeat.o(88252);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.d
 * JD-Core Version:    0.6.2
 */