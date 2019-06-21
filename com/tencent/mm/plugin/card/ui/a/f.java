package com.tencent.mm.plugin.card.ui.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public final class f extends a
{
  public f(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
  }

  public final boolean bdR()
  {
    return this.kok;
  }

  public final boolean bdS()
  {
    AppMethodBeat.i(88721);
    boolean bool;
    if ((this.kaS.isNormal()) && (super.bdS()) && ((this.kaS.aZQ()) || (!bo.isNullOrNil(this.kaS.aZW().code))))
    {
      bool = true;
      AppMethodBeat.o(88721);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88721);
    }
  }

  public final boolean bdT()
  {
    return true;
  }

  public final boolean bdW()
  {
    AppMethodBeat.i(88722);
    boolean bool;
    if ((this.kaS.isNormal()) && (super.bdW()))
    {
      bool = true;
      AppMethodBeat.o(88722);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(88722);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.a.f
 * JD-Core Version:    0.6.2
 */