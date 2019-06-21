package com.tencent.mm.plugin.card.ui.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.sdk.platformtools.bo;

public final class j extends g
{
  public final ab beA()
  {
    AppMethodBeat.i(88751);
    t localt = new t(this, this.jiE);
    AppMethodBeat.o(88751);
    return localt;
  }

  public final ab bey()
  {
    AppMethodBeat.i(88749);
    v localv = new v(this, this.jiE);
    AppMethodBeat.o(88749);
    return localv;
  }

  public final ab bez()
  {
    AppMethodBeat.i(88750);
    f localf = new f(this, this.jiE);
    AppMethodBeat.o(88750);
    return localf;
  }

  public final String e(c paramc)
  {
    AppMethodBeat.i(88748);
    paramc = this.kaS.aZW().code;
    AppMethodBeat.o(88748);
    return paramc;
  }

  public final boolean f(b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(88747);
    if (this.kaS == null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
      AppMethodBeat.o(88747);
    }
    while (true)
    {
      return bool;
      if (paramb == null)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
        AppMethodBeat.o(88747);
        bool = false;
      }
      else
      {
        String str = this.kaS.aZW().code;
        paramb = paramb.aZW().code;
        if ((!bo.isNullOrNil(str)) && (!bo.isNullOrNil(paramb)) && (!str.equals(paramb)))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
          AppMethodBeat.o(88747);
        }
        else
        {
          AppMethodBeat.o(88747);
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.j
 * JD-Core Version:    0.6.2
 */