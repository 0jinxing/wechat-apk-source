package com.tencent.mm.plugin.card.ui.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.ui.MMActivity;

public final class e extends a
{
  public e(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
  }

  public final boolean bdE()
  {
    AppMethodBeat.i(88719);
    boolean bool;
    if ((super.bdE()) && (this.kaS.isNormal()) && (!this.kok) && (!bdB()) && (!bdC()))
    {
      bool = true;
      AppMethodBeat.o(88719);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88719);
    }
  }

  public final boolean bdM()
  {
    AppMethodBeat.i(88714);
    boolean bool;
    if ((this.kaS.aZD()) && (!l.to(this.kjF.emC)) && (this.kaS.isNormal()) && (!this.kok))
    {
      bool = false;
      AppMethodBeat.o(88714);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(88714);
    }
  }

  public final boolean bdQ()
  {
    AppMethodBeat.i(88715);
    boolean bool;
    if ((this.kaS.aZD()) && (!l.to(this.kjF.emC)) && (this.kaS.isNormal()) && (!this.kok))
    {
      bool = true;
      AppMethodBeat.o(88715);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88715);
    }
  }

  public final boolean bdR()
  {
    return this.kok;
  }

  public final boolean bdT()
  {
    AppMethodBeat.i(88720);
    boolean bool;
    if ((this.kaS.aZV() != null) && (this.kaS.aZV().vUC))
    {
      bool = true;
      AppMethodBeat.o(88720);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88720);
    }
  }

  public final boolean bdU()
  {
    AppMethodBeat.i(88716);
    boolean bool;
    if ((super.bdU()) || ((this.kaS.isNormal()) && (!this.kok) && ((bdB()) || (bdC()))))
    {
      bool = true;
      AppMethodBeat.o(88716);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88716);
    }
  }

  public final boolean bdZ()
  {
    AppMethodBeat.i(88718);
    boolean bool;
    if ((this.kaS.isNormal()) && (super.bdZ()) && (!bdT()))
    {
      bool = true;
      AppMethodBeat.o(88718);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88718);
    }
  }

  public final boolean bed()
  {
    AppMethodBeat.i(88717);
    boolean bool;
    if ((this.kaS.aZD()) && (this.kaS.aZV().vUo != null) && (this.kaS.isNormal()) && (!this.kok) && (!bdB()) && (!bdC()))
    {
      bool = true;
      AppMethodBeat.o(88717);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88717);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.a.e
 * JD-Core Version:    0.6.2
 */