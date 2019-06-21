package com.tencent.mm.ui.chatting;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.applet.s;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.d.a;
import java.util.LinkedList;

public final class ag
  implements com.tencent.mm.pluginsdk.ui.e.g
{
  private a cgL;

  public ag(a parama)
  {
    this.cgL = parama;
  }

  public final Object a(m paramm)
  {
    AppMethodBeat.i(30955);
    i.Lt(6);
    switch (paramm.type)
    {
    case 3:
    case 5:
    case 8:
    case 10:
    case 11:
    case 12:
    case 13:
    case 19:
    case 24:
    case 26:
    case 27:
    case 28:
    case 29:
    case 32:
    default:
      paramm = null;
      AppMethodBeat.o(30955);
    case 4:
    case 2:
    case 6:
    case 7:
    case 9:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 20:
    case 21:
    case 22:
    case 23:
    case 25:
    case 30:
    case 31:
    case 33:
    case 1:
    }
    while (true)
    {
      return paramm;
      LinkedList localLinkedList = new LinkedList();
      int i;
      if (t.mN(this.cgL.getTalkerUserName()))
      {
        i = paramm.url.lastIndexOf("/");
        if (i < 0)
          break;
        localLinkedList.add(paramm.url.substring(i + 1));
      }
      while (true)
      {
        paramm = new LinkedList();
        for (i = 0; i < localLinkedList.size(); i++)
          paramm.add(Integer.valueOf(6));
        localLinkedList.add(this.cgL.getTalkerUserName());
      }
      new s(this.cgL.yTx.getContext(), new ag.1(this)).g(localLinkedList, paramm);
      break;
      this.cgL.yTx.dBP();
      break;
      paramm = this.cgL.getTalkerUserName();
      AppMethodBeat.o(30955);
      continue;
      paramm = this.cgL.getTalkerUserName();
      AppMethodBeat.o(30955);
    }
  }

  public final Object b(m paramm)
  {
    AppMethodBeat.i(30956);
    switch (paramm.type)
    {
    default:
    case 45:
    }
    while (true)
    {
      AppMethodBeat.o(30956);
      while (true)
      {
        return null;
        if (!aw.RK())
          break;
        if (f.kq(this.cgL.getTalkerUserName()))
        {
          AppMethodBeat.o(30956);
        }
        else if (f.rc(this.cgL.getTalkerUserName()))
        {
          AppMethodBeat.o(30956);
        }
        else
        {
          if (!f.rb(this.cgL.getTalkerUserName()))
            break;
          AppMethodBeat.o(30956);
        }
      }
      String str1 = new String(Base64.decode(paramm.url, 0));
      String str2 = new String(Base64.decode(bo.bc((String)paramm.au(String.class), ""), 0));
      ab.i("MicroMsg.MMChattingSpanClickCallback", "appId:%s,path:%s", new Object[] { str1, str2 });
      paramm = new AppBrandStatObject();
      paramm.scene = 1082;
      paramm.cst = this.cgL.getTalkerUserName();
      ((e)com.tencent.mm.kernel.g.K(e.class)).a(this.cgL.yTx.getContext(), null, str1, 0, 0, str2, paramm);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ag
 * JD-Core Version:    0.6.2
 */