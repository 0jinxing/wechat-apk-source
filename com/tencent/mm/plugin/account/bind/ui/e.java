package com.tencent.mm.plugin.account.bind.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ki;
import com.tencent.mm.g.a.ki.a;
import com.tencent.mm.sdk.b.c;

public final class e extends c<ki>
  implements f.a
{
  private ki gua;

  public e()
  {
    AppMethodBeat.i(13746);
    this.xxI = ki.class.getName().hashCode();
    AppMethodBeat.o(13746);
  }

  public final void apu()
  {
    AppMethodBeat.i(13748);
    if ((this.gua != null) && (this.gua.cFO.cFQ != null))
    {
      this.gua.cFP.cvi = false;
      this.gua.cFO.cFQ.run();
      this.gua = null;
    }
    AppMethodBeat.o(13748);
  }

  public final boolean cL(int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(13747);
    if (this.gua == null)
      AppMethodBeat.o(13747);
    while (true)
    {
      return bool;
      if (this.gua.cFO.cFQ == null)
      {
        this.gua = null;
        AppMethodBeat.o(13747);
      }
      else if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.gua.cFP.cvi = true;
        this.gua.cFO.cFQ.run();
        this.gua = null;
        AppMethodBeat.o(13747);
        bool = true;
      }
      else
      {
        this.gua.cFP.cvi = false;
        this.gua.cFO.cFQ.run();
        this.gua = null;
        AppMethodBeat.o(13747);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.e
 * JD-Core Version:    0.6.2
 */