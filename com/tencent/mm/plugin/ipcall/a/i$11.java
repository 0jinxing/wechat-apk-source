package com.tencent.mm.plugin.ipcall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.ir;
import com.tencent.mm.g.a.to;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Map;

final class i$11
  implements bz.a
{
  i$11(i parami)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(21773);
    ab.i("MicroMsg.SubCoreIPCall", "WeChatOut onRecieveMsg");
    String str1 = aa.a(parama.eAB.vED);
    if ((str1 == null) || (str1.length() == 0))
    {
      ab.e("MicroMsg.SubCoreIPCall", "WeChatOut onReceiveMsg, msgContent is null");
      AppMethodBeat.o(21773);
    }
    while (true)
    {
      return;
      parama = br.z(str1, "sysmsg");
      if (parama != null)
        break;
      ab.e("MicroMsg.SubCoreIPCall", "WeChatOut onReceiveMsg, values is null");
      AppMethodBeat.o(21773);
    }
    int i;
    if (parama.containsKey(".sysmsg.WeChatOut.AccountRedDotType"))
    {
      i = bo.getInt((String)parama.get(".sysmsg.WeChatOut.AccountRedDotType"), -1);
      ab.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountRedDotType: %d", new Object[] { Integer.valueOf(i) });
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xLs, Integer.valueOf(i));
    }
    while (true)
    {
      int j;
      if (parama.containsKey(".sysmsg.WeChatOut.AcctRD"))
      {
        j = bo.getInt((String)parama.get(".sysmsg.WeChatOut.AcctRD"), 0);
        ab.i("MicroMsg.SubCoreIPCall", "WeChatOut AcctRD: %d", new Object[] { Integer.valueOf(j) });
        if (j != 0)
        {
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLr, Boolean.TRUE);
          h.pYm.e(13254, new Object[] { Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(-1), Integer.valueOf(-1) });
        }
      }
      else
      {
        label262: if (parama.containsKey(".sysmsg.WeChatOut.TabRD"))
        {
          i = bo.getInt((String)parama.get(".sysmsg.WeChatOut.TabRD"), 0);
          ab.i("MicroMsg.SubCoreIPCall", "WeChatOut TabRD: %d", new Object[] { Integer.valueOf(i) });
          if (i == 0)
            break label1264;
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLE, Boolean.TRUE);
          h.pYm.e(13254, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1) });
        }
        label383: if (parama.containsKey(".sysmsg.WeChatOut.RechargeRD"))
        {
          i = bo.getInt((String)parama.get(".sysmsg.WeChatOut.RechargeRD"), 0);
          ab.i("MicroMsg.SubCoreIPCall", "WeChatOut RechargeRD: %d", new Object[] { Integer.valueOf(i) });
          if (i == 0)
            break label1283;
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLy, Boolean.TRUE);
          h.pYm.e(13254, new Object[] { Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1) });
        }
        label504: String str2;
        if (parama.containsKey(".sysmsg.WeChatOut.RechargeWording"))
        {
          str2 = (String)parama.get(".sysmsg.WeChatOut.RechargeWording");
          ab.i("MicroMsg.SubCoreIPCall", "WeChatOut RechargeWording: %s", new Object[] { str2 });
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLx, str2);
        }
        if (parama.containsKey(".sysmsg.WeChatOut.PackagePurchaseWording"))
        {
          str2 = (String)parama.get(".sysmsg.WeChatOut.PackagePurchaseWording");
          ab.i("MicroMsg.SubCoreIPCall", "WeChatOut PackagePurchaseWording: %s", new Object[] { str2 });
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLz, str2);
        }
        if (parama.containsKey(".sysmsg.WeChatOut.AccountWording"))
        {
          str2 = (String)parama.get(".sysmsg.WeChatOut.AccountWording");
          ab.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountWording: %s", new Object[] { str2 });
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLt, str2);
        }
        if (parama.containsKey(".sysmsg.WeChatOut.RechargeWordingVersion"))
        {
          i = bo.getInt((String)parama.get(".sysmsg.WeChatOut.RechargeWordingVersion"), 0);
          ab.i("MicroMsg.SubCoreIPCall", "WeChatOut RechargeWordingVersion: %d", new Object[] { Integer.valueOf(i) });
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLI, Integer.valueOf(i));
        }
        if (parama.containsKey(".sysmsg.WeChatOut.TabWording"))
        {
          str2 = (String)parama.get(".sysmsg.WeChatOut.TabWording");
          ab.i("MicroMsg.SubCoreIPCall", "WeChatOut TabWording: %s", new Object[] { str2 });
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLD, str2);
        }
        if (parama.containsKey(".sysmsg.WeChatOut.AccountActivityWording"))
        {
          str2 = (String)parama.get(".sysmsg.WeChatOut.AccountActivityWording");
          ab.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountActivityWording: %s", new Object[] { str2 });
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLu, str2);
        }
        if (parama.containsKey(".sysmsg.WeChatOut.AccountActivityWordingClearType"))
        {
          i = bo.getInt((String)parama.get(".sysmsg.WeChatOut.AccountActivityWordingClearType"), 0);
          ab.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountActivityWordingClearType : %d", new Object[] { Integer.valueOf(i) });
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLv, Integer.valueOf(i));
        }
        if (parama.containsKey(".sysmsg.WeChatOut.AccountActivityWordingVersion"))
        {
          i = bo.getInt((String)parama.get(".sysmsg.WeChatOut.AccountActivityWordingVersion"), 0);
          ab.i("MicroMsg.SubCoreIPCall", "WeChatOut AccountActivityWordingVersion: %d", new Object[] { Integer.valueOf(i) });
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLw, Integer.valueOf(i));
        }
        if (parama.containsKey(".sysmsg.WeChatOut.TabRedDotType"))
        {
          i = bo.getInt((String)parama.get(".sysmsg.WeChatOut.TabRedDotType"), 0);
          ab.i("MicroMsg.SubCoreIPCall", "WeChatOut TabRedDotType: %d", new Object[] { Integer.valueOf(i) });
          h.pYm.e(13254, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(i) });
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLF, Integer.valueOf(i));
        }
        i = str1.indexOf("<ActivityInfo>");
        j = str1.indexOf("</ActivityInfo>");
        if ((i > 0) && (j > 0) && (j > i))
        {
          str1 = str1.substring(i, j + 15);
          ab.i("MicroMsg.SubCoreIPCall", "WeChatOut ActivityInfo: %s", new Object[] { str1 });
          parama = com.tencent.mm.plugin.ipcall.a.g.a.OO(str1);
          if ((parama == null) || (!bo.isNullOrNil(parama.Title)) || (!bo.isNullOrNil(parama.Desc)))
            break label1302;
          ab.i("MicroMsg.SubCoreIPCall", "clear activity");
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLR, Boolean.FALSE);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLS, "");
        }
      }
      while (true)
      {
        com.tencent.mm.sdk.b.a.xxA.m(new ir());
        com.tencent.mm.sdk.b.a.xxA.m(new to());
        AppMethodBeat.o(21773);
        break;
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xLr, Boolean.FALSE);
        break label262;
        label1264: aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xLE, Boolean.FALSE);
        break label383;
        label1283: aw.ZK();
        com.tencent.mm.model.c.Ry().set(ac.a.xLy, Boolean.FALSE);
        break label504;
        label1302: if (parama != null)
        {
          if (!bo.isNullOrNil(parama.ImgUrl))
            o.ahk().a(parama.ImgUrl, null);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLR, Boolean.TRUE);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xLS, str1);
        }
      }
      i = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.i.11
 * JD-Core Version:    0.6.2
 */