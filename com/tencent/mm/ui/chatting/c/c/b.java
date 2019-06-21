package com.tencent.mm.ui.chatting.c.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends com.tencent.mm.ui.chatting.c.a
  implements com.tencent.mm.ui.chatting.c.b.a
{
  private a yTs;

  public b(a parama)
  {
    this.yTs = parama;
  }

  private boolean dFs()
  {
    boolean bool = false;
    AppMethodBeat.i(31910);
    if (bo.isNullOrNil(this.cgL.getTalkerUserName()))
      AppMethodBeat.o(31910);
    while (true)
    {
      return bool;
      if (t.nH(this.cgL.getTalkerUserName()))
      {
        AppMethodBeat.o(31910);
      }
      else if (this.yTs != null)
      {
        bool = true;
        AppMethodBeat.o(31910);
      }
      else
      {
        AppMethodBeat.o(31910);
      }
    }
  }

  public final void a(com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(31898);
    super.a(parama);
    if (this.yTs != null)
      this.yTs.a(parama);
    AppMethodBeat.o(31898);
  }

  public final void dDh()
  {
    AppMethodBeat.i(31899);
    super.dDh();
    if (this.yTs != null)
      this.yTs.dDh();
    AppMethodBeat.o(31899);
  }

  public final void dEm()
  {
    AppMethodBeat.i(31907);
    if (dFs())
      this.yTs.dEm();
    AppMethodBeat.o(31907);
  }

  public final void dFq()
  {
    AppMethodBeat.i(31908);
    if (dFs())
      this.yTs.dFq();
    AppMethodBeat.o(31908);
  }

  public final String dFr()
  {
    AppMethodBeat.i(31909);
    String str;
    if (dFs())
    {
      str = this.yTs.dFr();
      AppMethodBeat.o(31909);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(31909);
    }
  }

  public final void dxA()
  {
    AppMethodBeat.i(31903);
    if (dFs())
      this.yTs.dxA();
    AppMethodBeat.o(31903);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31904);
    if (dFs())
      this.yTs.dxB();
    AppMethodBeat.o(31904);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31905);
    if (dFs())
      this.yTs.dxC();
    AppMethodBeat.o(31905);
  }

  public final void dxD()
  {
    AppMethodBeat.i(31906);
    if (dFs())
      this.yTs.dxD();
    AppMethodBeat.o(31906);
  }

  public final void dxx()
  {
    AppMethodBeat.i(31900);
    if (dFs())
      this.yTs.dxx();
    AppMethodBeat.o(31900);
  }

  public final void dxy()
  {
    AppMethodBeat.i(31901);
    if (dFs())
      this.yTs.dxy();
    AppMethodBeat.o(31901);
  }

  public final void dxz()
  {
    AppMethodBeat.i(31902);
    if (dFs())
      this.yTs.dxz();
    AppMethodBeat.o(31902);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.c.b
 * JD-Core Version:    0.6.2
 */