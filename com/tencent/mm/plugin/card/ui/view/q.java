package com.tencent.mm.plugin.card.ui.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.platformtools.bo;

public final class q extends g
{
  public String knw = "";

  public final ab beA()
  {
    AppMethodBeat.i(88779);
    r localr = new r(this, this.jiE);
    AppMethodBeat.o(88779);
    return localr;
  }

  public final ab bey()
  {
    AppMethodBeat.i(88777);
    s locals = new s(this, this.jiE);
    AppMethodBeat.o(88777);
    return locals;
  }

  public final ab bez()
  {
    AppMethodBeat.i(88778);
    p localp = new p(this, this.jiE);
    AppMethodBeat.o(88778);
    return localp;
  }

  public final String e(c paramc)
  {
    AppMethodBeat.i(88776);
    if (!bo.isNullOrNil(this.kaS.aZW().vSo))
    {
      paramc = this.kaS.aZW().vSo;
      AppMethodBeat.o(88776);
    }
    while (true)
    {
      return paramc;
      if ((this.kaS.aZQ()) && (!bo.isNullOrNil(this.knw)))
      {
        paramc = this.knw;
        AppMethodBeat.o(88776);
      }
      else
      {
        paramc = this.kaS.aZW().code;
        AppMethodBeat.o(88776);
      }
    }
  }

  public final boolean f(b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(88775);
    if (this.kaS == null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
      AppMethodBeat.o(88775);
    }
    while (true)
    {
      return bool;
      if (paramb == null)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
        AppMethodBeat.o(88775);
        bool = false;
      }
      else
      {
        Object localObject = this.kaS.aZW().code;
        String str = paramb.aZW().code;
        if ((!bo.isNullOrNil((String)localObject)) && (!bo.isNullOrNil(str)) && (!((String)localObject).equals(str)))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
          AppMethodBeat.o(88775);
        }
        else
        {
          localObject = this.kaS.aZV().vUA;
          paramb = paramb.aZV().vUA;
          if (((localObject == null) && (paramb != null)) || ((localObject != null) && (paramb == null)))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field  is diffrent！");
            AppMethodBeat.o(88775);
          }
          else if ((localObject != null) && (paramb != null) && (((tm)localObject).title != null) && (paramb.title != null) && (!((tm)localObject).title.equals(paramb.title)))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field title is diffrent！");
            AppMethodBeat.o(88775);
          }
          else if ((localObject != null) && (paramb != null) && (((tm)localObject).kbX != null) && (paramb.kbX != null) && (!((tm)localObject).kbX.equals(paramb.kbX)))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field aux_title  is diffrent！");
            AppMethodBeat.o(88775);
          }
          else if ((this.kaS.aZQ()) && (!bo.isNullOrNil(this.knw)))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.CardCodeView", "dynamicCode updated！");
            AppMethodBeat.o(88775);
          }
          else
          {
            AppMethodBeat.o(88775);
            bool = false;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.q
 * JD-Core Version:    0.6.2
 */