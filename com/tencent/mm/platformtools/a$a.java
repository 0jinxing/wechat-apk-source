package com.tencent.mm.platformtools;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bm;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class a$a
  implements Runnable
{
  private static byte[] eMl;
  public static boolean fAV;
  private static final ak ggQ;
  private List<String[]> ggL;
  private List<String[]> ggM;
  private List<com.tencent.mm.plugin.account.friend.a.a> ggN;
  private List<com.tencent.mm.plugin.account.friend.a.a> ggO;
  private bm ggP;

  static
  {
    AppMethodBeat.i(124511);
    fAV = false;
    eMl = new byte[0];
    ggQ = new ak(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(124506);
        if (!com.tencent.mm.kernel.g.RK())
          AppMethodBeat.o(124506);
        while (true)
        {
          return;
          g.a locala = new g.a();
          int i = a.ggH.size();
          boolean bool = Boolean.parseBoolean(paramAnonymousMessage.obj.toString());
          paramAnonymousMessage = a.ggH.iterator();
          while (paramAnonymousMessage.hasNext())
            ((com.tencent.mm.plugin.account.a.a.b)paramAnonymousMessage.next()).cN(bool);
          a.ggH.clear();
          ab.i("MicroMsg.AddrBookSyncHelper", "callBackHandler setSize:%d time:%d", new Object[] { Integer.valueOf(i), Long.valueOf(locala.Mr()) });
          AppMethodBeat.o(124506);
        }
      }
    };
    AppMethodBeat.o(124511);
  }

  private static void anF()
  {
    AppMethodBeat.i(124509);
    bm localbm = new bm("MicroMsg.AddrBookSyncHelper", "delete");
    ArrayList localArrayList = new ArrayList();
    List localList = com.tencent.mm.pluginsdk.a.fB(ah.getContext());
    Iterator localIterator = ((com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).apJ().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String[])localIterator.next();
      String str = bo.nullAsNil(localObject[0]);
      localObject = bo.nullAsNil(localObject[1]);
      if ((!str.equals("")) && (!localList.contains(str)))
        localArrayList.add(localObject);
    }
    if (localArrayList.size() > 0)
    {
      ((com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).ap(localArrayList);
      l.ar(localArrayList);
    }
    localbm.addSplit("end");
    localbm.dumpToLog();
    AppMethodBeat.o(124509);
  }

  private static List<com.tencent.mm.plugin.account.friend.a.a> c(int paramInt, List<String[]> paramList)
  {
    AppMethodBeat.i(124510);
    if (paramList == null)
    {
      ab.e("MicroMsg.AddrBookSyncHelper", "sync address book failed, null info list");
      paramList = new LinkedList();
      AppMethodBeat.o(124510);
    }
    while (true)
    {
      return paramList;
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (String[])localIterator.next();
        if (paramList != null)
        {
          Object localObject1 = paramList[0];
          String str1 = paramList[1];
          String str2 = paramList[2];
          Object localObject2 = paramList[3];
          long l = bo.anl(paramList[4]);
          if ((str2 != null) && (!str2.equals("")))
          {
            paramList = "";
            if (paramInt == 1)
              paramList = com.tencent.mm.a.g.x(str2.getBytes());
            if (paramInt == 0)
            {
              paramList = com.tencent.mm.pluginsdk.a.ws(str2);
              if (bo.isNullOrNil(paramList))
                ab.d("MicroMsg.AddrBookSyncHelper", "formatted mobile null, continue");
              else
                paramList = com.tencent.mm.a.g.x(paramList.getBytes());
            }
            else
            {
              com.tencent.mm.plugin.account.friend.a.a locala = new com.tencent.mm.plugin.account.friend.a.a();
              locala.eBb = str1;
              locala.guE = g.vp(str1);
              locala.guF = g.vo(str1);
              locala.guC = localObject1;
              locala.frQ = localObject2;
              locala.vS(paramList);
              locala.gvf = l;
              locala.guL = locala.Ny();
              if (paramInt == 1)
                locala.dtV = str2;
              if (paramInt == 0)
                locala.guI = str2;
              locala.type = paramInt;
              locala.bJt = 1095798;
              localArrayList.add(locala);
            }
          }
        }
      }
      AppMethodBeat.o(124510);
      paramList = localArrayList;
    }
  }

  private static List<com.tencent.mm.plugin.account.friend.a.a> c(List<com.tencent.mm.plugin.account.friend.a.a> paramList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(124507);
    LinkedList localLinkedList = new LinkedList();
    while (paramInt1 < paramInt2)
    {
      localLinkedList.add(paramList.get(paramInt1));
      paramInt1++;
    }
    AppMethodBeat.o(124507);
    return localLinkedList;
  }

  public final void run()
  {
    AppMethodBeat.i(124508);
    synchronized (eMl)
    {
      Object localObject1 = new com/tencent/mm/sdk/platformtools/bm;
      ((bm)localObject1).<init>("MicroMsg.AddrBookSyncHelper", "sync addrBook");
      this.ggP = ((bm)localObject1);
      this.ggP.addSplit("sync begin");
      ab.d("MicroMsg.AddrBookSyncHelper", "reading email info");
      this.ggL = com.tencent.mm.pluginsdk.a.fA(ah.getContext());
      if (this.ggL != null)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("sync address book email size: ");
        ab.i("MicroMsg.AddrBookSyncHelper", this.ggL.size());
      }
      this.ggO = c(1, this.ggL);
      ab.d("MicroMsg.AddrBookSyncHelper", "reading mobile info");
      this.ggM = com.tencent.mm.pluginsdk.a.fz(ah.getContext());
      if (this.ggM != null)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("sync address book mobile size: ");
        ab.i("MicroMsg.AddrBookSyncHelper", this.ggM.size());
      }
      this.ggN = c(0, this.ggM);
      ab.d("MicroMsg.AddrBookSyncHelper", "reading done, begin sync to addr_upload");
      int i;
      StringBuilder localStringBuilder;
      if ((this.ggL != null) && (this.ggO.size() > 0))
      {
        i = 0;
        if (i < this.ggO.size())
        {
          ab.i("MicroMsg.AddrBookSyncHelper", "sync email index: ".concat(String.valueOf(i)));
          if (i + 100 < this.ggO.size());
          for (localObject1 = c(this.ggO, i, i + 100); ; localObject1 = c((List)localObject1, i, ((List)localObject1).size()))
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("sync email listToSync size: ");
            ab.i("MicroMsg.AddrBookSyncHelper", ((List)localObject1).size());
            l.as((List)localObject1);
            i += 100;
            break;
            localObject1 = this.ggO;
          }
        }
      }
      if ((this.ggN == null) || (this.ggN.size() == 0))
      {
        ab.i("MicroMsg.AddrBookSyncHelper", "mobile list null stop service");
        localObject1 = ggQ.obtainMessage();
        ((Message)localObject1).obj = Boolean.FALSE;
        ggQ.sendMessage((Message)localObject1);
        AppMethodBeat.o(124508);
      }
      while (true)
      {
        return;
        i = 0;
        if (i < this.ggN.size())
        {
          ab.i("MicroMsg.AddrBookSyncHelper", "sync mobile index: ".concat(String.valueOf(i)));
          if (!com.tencent.mm.kernel.g.RK())
          {
            ab.i("MicroMsg.AddrBookSyncHelper", "account not ready, stop sync");
            localObject1 = ggQ.obtainMessage();
            ((Message)localObject1).obj = Boolean.FALSE;
            ggQ.sendMessage((Message)localObject1);
            AppMethodBeat.o(124508);
          }
          else
          {
            if (i + 100 < this.ggN.size());
            for (localObject1 = c(this.ggN, i, i + 100); ; localObject1 = c((List)localObject1, i, ((List)localObject1).size()))
            {
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>("sync mobile listToSync size: ");
              ab.i("MicroMsg.AddrBookSyncHelper", ((List)localObject1).size());
              l.as((List)localObject1);
              i += 100;
              break;
              localObject1 = this.ggN;
            }
          }
        }
        else
        {
          ab.i("MicroMsg.AddrBookSyncHelper", "sync ok");
          if (com.tencent.mm.kernel.g.RK())
            break;
          ab.i("MicroMsg.AddrBookSyncHelper", "account not ready, exit");
          localObject1 = ggQ.obtainMessage();
          ((Message)localObject1).obj = Boolean.FALSE;
          ggQ.sendMessage((Message)localObject1);
          AppMethodBeat.o(124508);
        }
      }
      anF();
      System.currentTimeMillis();
      l.apX();
      this.ggP.addSplit("sync ok");
      this.ggP.dumpToLog();
      localObject1 = ggQ.obtainMessage();
      ((Message)localObject1).obj = Boolean.TRUE;
      ggQ.sendMessage((Message)localObject1);
      AppMethodBeat.o(124508);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.a.a
 * JD-Core Version:    0.6.2
 */