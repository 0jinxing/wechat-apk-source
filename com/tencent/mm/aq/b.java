package com.tencent.mm.aq;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.notification.d;
import com.tencent.mm.protocal.protobuf.ahc;
import com.tencent.mm.protocal.protobuf.ahd;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class b
  implements w.a
{
  private static d fCn;
  private static b fCp;
  public b.a fCk;
  private m fCl;
  private ap fCm;
  private b.b fCo;

  static
  {
    AppMethodBeat.i(16455);
    fCn = new d(true);
    AppMethodBeat.o(16455);
  }

  private b()
  {
    AppMethodBeat.i(16446);
    this.fCm = new ap(aw.RS().oAl.getLooper(), new b.1(this), false);
    this.fCo = new b.b()
    {
      public final void b(int paramAnonymousInt, List<bi> paramAnonymousList)
      {
        AppMethodBeat.i(16445);
        ab.w("MicroMsg.GetChatroomMsgFetcher", "[onFinish] ret:" + paramAnonymousInt + " addSize:" + paramAnonymousList.size());
        AppMethodBeat.o(16445);
      }
    };
    AppMethodBeat.o(16446);
  }

  private static LinkedList<e.a> a(List<cm> paramList, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(16451);
    long l1 = ((j)g.K(j.class)).Yo().QQ(paramString);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    long l2 = 0L;
    if (localIterator.hasNext())
    {
      paramList = (cm)localIterator.next();
      long l3 = paramList.pcX * 1000L;
      long l4 = l3;
      if (l2 == 0L)
      {
        bi localbi = ((j)g.K(j.class)).bOr().Y(aa.a(paramList.vEB), paramList.vEI);
        l4 = l3;
        if (localbi.field_createTime / 1000L == paramList.pcX)
          l4 = localbi.field_createTime + 1L;
      }
      if (l2 / 1000L == l4 / 1000L)
      {
        l4 = 1L + l2;
        paramList = new e.a(paramList, paramBoolean, l4);
        label186: if (l1 >= l4)
          break label222;
        localLinkedList.add(paramList);
      }
      while (true)
      {
        l2 = l4;
        break;
        paramList = new e.a(paramList, paramBoolean, l4);
        break label186;
        label222: ab.w("MicroMsg.GetChatroomMsgFetcher", "this conversation[%s] has delete before! lastDeleteCreateTime:%s curTime:%s", new Object[] { paramString, Long.valueOf(l1), Long.valueOf(l4) });
      }
    }
    AppMethodBeat.o(16451);
    return localLinkedList;
  }

  private void a(com.tencent.mm.ai.b paramb, int paramInt, LinkedList<bi> paramLinkedList)
  {
    AppMethodBeat.i(16450);
    ab.w("MicroMsg.GetChatroomMsgFetcher", "[requestCallback] ret:".concat(String.valueOf(paramInt)));
    if (paramb == null)
    {
      paramb = com.tencent.mm.ui.chatting.j.b.yZH;
      com.tencent.mm.ui.chatting.j.b.dGY();
      if (this.fCo != null)
        this.fCo.b(paramInt, paramLinkedList);
      AppMethodBeat.o(16450);
      return;
    }
    ahc localahc = (ahc)paramb.fsG.fsP;
    ahd localahd = (ahd)paramb.fsH.fsP;
    boolean bool1;
    if ((this.fCk != null) && (paramInt >= 0))
    {
      paramb = this.fCk;
      String str = aa.a(localahc.wnA);
      if (localahc.wnC == 1)
      {
        bool1 = true;
        label118: com.tencent.mm.j.a.a.c localc = w(localahc.wnE, localahc.vEI);
        if (localahd.vQe != 0)
          break label246;
        bool2 = true;
        label146: paramb.a(str, bool1, paramLinkedList, localc, bool2);
      }
    }
    else
    {
      if (this.fCo != null)
        this.fCo.b(paramInt, paramLinkedList);
      paramb = com.tencent.mm.ui.chatting.j.b.yZH;
      if (localahc.wnC != 0)
        break label252;
      bool1 = true;
      label194: if (paramInt < 0)
        break label258;
    }
    label258: for (boolean bool2 = true; ; bool2 = false)
    {
      paramb.c(bool1, bool2, aa.a(localahc.wnA));
      if (paramInt >= 0)
        com.tencent.mm.ui.chatting.j.b.yZH.Pi(paramLinkedList.size());
      AppMethodBeat.o(16450);
      break;
      bool1 = false;
      break label118;
      label246: bool2 = false;
      break label146;
      label252: bool1 = false;
      break label194;
    }
  }

  public static b agG()
  {
    AppMethodBeat.i(16447);
    if (fCp == null);
    try
    {
      if (fCp == null)
      {
        localb = new com/tencent/mm/aq/b;
        localb.<init>();
        fCp = localb;
      }
      b localb = fCp;
      AppMethodBeat.o(16447);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(16447);
    }
  }

  public static void rX(String paramString)
  {
    AppMethodBeat.i(16453);
    if (((j)g.K(j.class)).bOm().QL(paramString))
    {
      ab.i("MicroMsg.GetChatroomMsgFetcher", "[clearConversationDeliverCount] username:%s", new Object[] { paramString });
      ahc localahc = new ahc();
      localahc.wnA = aa.vy(paramString);
      localahc.vEI = 0;
      localahc.wnE = 0;
      localahc.wnB = 0;
      localahc.wnC = 0;
      paramString = new com.tencent.mm.ai.b.a();
      paramString.fsJ = localahc;
      paramString.fsK = new ahd();
      paramString.uri = "/cgi-bin/micromsg-bin/getcrmsg";
      paramString.fsI = 805;
      paramString.fsL = 0;
      paramString.fsM = 0;
      w.b(paramString.acD());
    }
    AppMethodBeat.o(16453);
  }

  private static com.tencent.mm.j.a.a.c w(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(16452);
    long l;
    if (paramLong1 > paramLong2)
      l = paramLong1;
    while (true)
    {
      com.tencent.mm.j.a.a.c localc = new com.tencent.mm.j.a.a.c();
      localc.eoC = paramLong2;
      localc.eoD = l;
      AppMethodBeat.o(16452);
      return localc;
      l = paramLong2;
      paramLong2 = paramLong1;
    }
  }

  public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, m paramm)
  {
    AppMethodBeat.i(16449);
    ab.i("MicroMsg.GetChatroomMsgFetcher", "[callback] errType:%d errCode:%d errMsg:%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramString = new LinkedList();
    if (paramm.getType() != 805)
    {
      a(paramb, -1, paramString);
      AppMethodBeat.o(16449);
    }
    while (true)
    {
      return 0;
      this.fCm.stopTimer();
      if ((paramInt1 != 0) || (paramInt2 != 0) || (paramb == null))
      {
        a(paramb, -1, paramString);
        AppMethodBeat.o(16449);
      }
      else
      {
        Object localObject1 = (ahc)paramb.fsG.fsP;
        paramm = (ahd)paramb.fsH.fsP;
        boolean bool1;
        if ((paramm == null) || (paramm.wnF == null))
        {
          a(paramb, -1, paramString);
          if (paramm == null)
          {
            bool1 = true;
            label163: if (paramm.wnF != null)
              break label217;
          }
          label217: for (boolean bool2 = true; ; bool2 = false)
          {
            ab.e("MicroMsg.GetChatroomMsgFetcher", "[callback] resp == null? %b resp.AddMsgList == null? %b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
            AppMethodBeat.o(16449);
            break;
            bool1 = false;
            break label163;
          }
        }
        if (paramm.wnF.size() <= 0)
        {
          ab.w("MicroMsg.GetChatroomMsgFetcher", "[callback] fetch size is 0! [%s:%s] isUpFlag:%s ChatroomId:%s", new Object[] { Integer.valueOf(((ahc)localObject1).vEI), Integer.valueOf(((ahc)localObject1).wnE), Integer.valueOf(((ahc)localObject1).wnC), aa.a(((ahc)localObject1).wnA) });
          a(paramb, 0, paramString);
          AppMethodBeat.o(16449);
        }
        else
        {
          Object localObject3;
          while (true)
          {
            try
            {
              i locali = (i)g.K(i.class);
              localObject3 = ((j)g.K(j.class)).bOr();
              Object localObject4 = new java/lang/StringBuilder;
              ((StringBuilder)localObject4).<init>("MicroMsg.GetChatroomMsgFetcher");
              ((h)localObject3).QW(hashCode());
              localObject3 = paramm.wnF;
              if (((ahc)localObject1).wnC == 1)
              {
                bool1 = true;
                localObject4 = a((List)localObject3, bool1, aa.a(((ahc)localObject1).wnA)).iterator();
                if (!((Iterator)localObject4).hasNext())
                  break label842;
                localObject3 = (e.a)((Iterator)localObject4).next();
                localObject5 = locali.a((e.a)localObject3, fCn);
                if (localObject5 == null)
                  break;
                if (((e.b)localObject5).csG != null)
                  break label575;
                ab.e("MicroMsg.GetChatroomMsgFetcher", "ddMsgReturn.msg == null！may be revoke msg");
                continue;
              }
            }
            finally
            {
              ((j)g.K(j.class)).bOr().QX("MicroMsg.GetChatroomMsgFetcher" + hashCode());
              localObject1 = aa.a(((ahc)localObject1).wnA);
              ab.i("MicroMsg.GetChatroomMsgFetcher", "[callback] chatroomId:" + (String)localObject1 + " AddMsgList size:" + paramm.wnF.size());
              a(paramb, 0, paramString);
              AppMethodBeat.o(16449);
            }
            bool1 = false;
            continue;
            label575: paramString.add(((e.b)localObject5).csG);
          }
          Object localObject5 = ((e.a)localObject3).eAB;
          bi localbi = new com/tencent/mm/storage/bi;
          localbi.<init>();
          localbi.eI(((cm)localObject5).ptF);
          localbi.eJ(((e.a)localObject3).fsX);
          localbi.eL(((cm)localObject5).vEI);
          String str1 = aa.a(((cm)localObject5).vEB);
          String str2 = aa.a(((cm)localObject5).vEC);
          k localk = ((j)g.K(j.class)).XU();
          String str3 = (String)g.RP().Ry().get(2, "");
          if ((localk.has(str1)) || (str3.equals(str1)))
          {
            paramInt1 = 1;
            label713: if (paramInt1 == 0)
              break label806;
            localbi.hO(1);
            localbi.ju(str2);
            paramInt1 = ((cm)localObject5).jBT;
          }
          while (true)
          {
            localbi.setStatus(paramInt1);
            if (((cm)localObject5).nao == 10000)
              localbi.setStatus(4);
            localbi.hY(2);
            paramString.add(localbi);
            ab.i("MicroMsg.GetChatroomMsgFetcher", "addMsgReturn == null! addMsgInfo addMsg type:%s", new Object[] { Integer.valueOf(((e.a)localObject3).eAB.nao) });
            break;
            paramInt1 = 0;
            break label713;
            label806: localbi.hO(0);
            localbi.ju(str1);
            if (((cm)localObject5).jBT > 3)
              paramInt1 = ((cm)localObject5).jBT;
            else
              paramInt1 = 3;
          }
          label842: ((j)g.K(j.class)).bOr().QX("MicroMsg.GetChatroomMsgFetcher" + hashCode());
          localObject1 = aa.a(((ahc)localObject1).wnA);
          ab.i("MicroMsg.GetChatroomMsgFetcher", "[callback] chatroomId:" + (String)localObject1 + " AddMsgList size:" + paramm.wnF.size());
          a(paramb, 0, paramString);
          AppMethodBeat.o(16449);
        }
      }
    }
  }

  public final void a(String paramString, long paramLong1, long paramLong2, int paramInt, b.b paramb)
  {
    AppMethodBeat.i(16448);
    ab.i("MicroMsg.GetChatroomMsgFetcher", "[fetch] chatroomId:" + paramString + " msgSeq:" + paramLong1 + " filterSeq:" + paramLong2 + " upDownFlag:" + paramInt);
    this.fCo = paramb;
    paramb = new ahc();
    paramb.wnA = aa.vy(paramString);
    paramb.vEI = ((int)paramLong1);
    paramb.wnE = ((int)paramLong2);
    paramb.wnB = 18;
    paramb.wnC = paramInt;
    paramString = new com.tencent.mm.ai.b.a();
    paramString.fsJ = paramb;
    paramString.fsK = new ahd();
    paramString.uri = "/cgi-bin/micromsg-bin/getcrmsg";
    paramString.fsI = 805;
    paramString.fsL = 0;
    paramString.fsM = 0;
    if (this.fCl != null)
      w.c(this.fCl);
    this.fCl = w.a(paramString.acD(), this, true);
    this.fCm.stopTimer();
    this.fCm.ae(8000L, 8000L);
    AppMethodBeat.o(16448);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aq.b
 * JD-Core Version:    0.6.2
 */