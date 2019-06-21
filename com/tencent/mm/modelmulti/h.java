package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.a.qc;
import com.tencent.mm.g.a.qe;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.p;
import com.tencent.mm.model.r;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bbe;
import com.tencent.mm.protocal.protobuf.bbf;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.bwl;
import com.tencent.mm.protocal.protobuf.bwm;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.wcdb.database.SQLiteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class h extends com.tencent.mm.ai.m
  implements k
{
  private static final List<Object> fIl;
  public long cvx;
  private b ehh;
  private f ehi;
  private final List<bi> fIm;
  private int fIn;
  private boolean fIo;
  private final List<bi> fIp;
  private bi fIq;
  public com.tencent.mm.plugin.messenger.foundation.a.m fIr;

  static
  {
    AppMethodBeat.i(59985);
    fIl = new ArrayList();
    AppMethodBeat.o(59985);
  }

  public h()
  {
    AppMethodBeat.i(59970);
    this.fIm = new LinkedList();
    this.fIn = 3;
    this.fIo = false;
    this.fIp = new ArrayList();
    this.fIq = null;
    this.fIr = null;
    ab.d("MicroMsg.NetSceneSendMsg", "dktext :%s", new Object[] { bo.dpG() });
    ab.i("MicroMsg.NetSceneSendMsg", "empty msg sender created");
    AppMethodBeat.o(59970);
  }

  public h(long paramLong)
  {
    AppMethodBeat.i(59969);
    this.fIm = new LinkedList();
    this.fIn = 3;
    this.fIo = false;
    this.fIp = new ArrayList();
    this.fIq = null;
    this.fIr = null;
    ab.i("MicroMsg.NetSceneSendMsg", "resend msg , local id = ".concat(String.valueOf(paramLong)));
    this.cvx = paramLong;
    this.fIq = ((j)g.K(j.class)).bOr().jf(paramLong);
    if (this.fIq == null)
      ab.e("MicroMsg.NetSceneSendMsg", "resend msg , msg is null localid:%d", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(59969);
  }

  public h(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(59968);
    this.fIm = new LinkedList();
    this.fIn = 3;
    this.fIo = false;
    this.fIp = new ArrayList();
    this.fIq = null;
    this.fIr = null;
    ab.d("MicroMsg.NetSceneSendMsg", "dktext :%s", new Object[] { bo.dpG() });
    bi localbi;
    if (!bo.isNullOrNil(paramString1))
    {
      localbi = new bi();
      localbi.setStatus(1);
      localbi.ju(paramString1);
      localbi.eJ(bf.oC(paramString1));
      localbi.hO(1);
      localbi.setContent(paramString2);
      localbi.setType(paramInt);
      paramString1 = ((com.tencent.mm.plugin.messenger.foundation.a.q)g.K(com.tencent.mm.plugin.messenger.foundation.a.q.class)).B(localbi);
      if (!bo.isNullOrNil(paramString1))
      {
        localbi.ix(paramString1);
        ab.d("MicroMsg.NetSceneSendMsg", "NetSceneSendMsg:MsgSource:%s", new Object[] { localbi.dqJ });
      }
    }
    while (true)
    {
      try
      {
        this.cvx = ((j)g.K(j.class)).bOr().c(localbi, true);
        if (this.cvx == -1L)
          com.tencent.mm.plugin.report.e.pXa.a(111L, 255L, 1L, false);
        if (this.cvx != -1L)
        {
          bool = true;
          Assert.assertTrue(bool);
          ab.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.cvx);
          AppMethodBeat.o(59968);
          return;
        }
      }
      catch (SQLiteException paramString1)
      {
        com.tencent.mm.plugin.report.e.pXa.a(111L, 255L, 1L, false);
        AppMethodBeat.o(59968);
        throw paramString1;
      }
      boolean bool = false;
    }
  }

  public h(String paramString1, String paramString2, int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(59967);
    this.fIm = new LinkedList();
    this.fIn = 3;
    this.fIo = false;
    this.fIp = new ArrayList();
    this.fIq = null;
    this.fIr = null;
    ab.d("MicroMsg.NetSceneSendMsg", "dktext :%s", new Object[] { bo.dpG() });
    bi localbi;
    if (!bo.isNullOrNil(paramString1))
    {
      localbi = new bi();
      localbi.setStatus(1);
      localbi.ju(paramString1);
      localbi.eJ(bf.oC(paramString1));
      localbi.hO(1);
      localbi.setContent(paramString2);
      localbi.setType(paramInt1);
      paramString1 = a(((com.tencent.mm.plugin.messenger.foundation.a.q)g.K(com.tencent.mm.plugin.messenger.foundation.a.q.class)).B(localbi), paramObject, paramInt2);
      if (!bo.isNullOrNil(paramString1))
      {
        localbi.ix(paramString1);
        ab.d("MicroMsg.NetSceneSendMsg", "NetSceneSendMsg:MsgSource:%s", new Object[] { localbi.dqJ });
      }
    }
    while (true)
    {
      try
      {
        this.cvx = ((j)g.K(j.class)).bOr().c(localbi, true);
        if (this.cvx == -1L)
          com.tencent.mm.plugin.report.e.pXa.a(111L, 255L, 1L, false);
        if (this.cvx != -1L)
        {
          bool = true;
          Assert.assertTrue(bool);
          ab.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.cvx);
          AppMethodBeat.o(59967);
          return;
        }
      }
      catch (SQLiteException paramString1)
      {
        com.tencent.mm.plugin.report.e.pXa.a(111L, 255L, 1L, false);
        AppMethodBeat.o(59967);
        throw paramString1;
      }
      boolean bool = false;
    }
  }

  private static void A(bi parambi)
  {
    AppMethodBeat.i(59981);
    parambi.setStatus(5);
    com.tencent.mm.plugin.report.e.pXa.a(111L, 30L, 1L, true);
    ((j)g.K(j.class)).bOr().a(parambi.field_msgId, parambi);
    parambi = fIl.iterator();
    while (parambi.hasNext())
      parambi.next();
    AppMethodBeat.o(59981);
  }

  private static String a(String paramString, Object paramObject, int paramInt)
  {
    AppMethodBeat.i(59973);
    boolean bool;
    if (paramObject == null)
    {
      bool = true;
      ab.i("MicroMsg.NetSceneSendMsg", "[mergeMsgSource] rawSource:%s args is null:%s flag:%s", new Object[] { paramString, Boolean.valueOf(bool), Integer.valueOf(paramInt) });
      if ((bo.isNullOrNil(paramString)) || (paramString.startsWith("<msgsource>")))
        break label88;
      ab.w("MicroMsg.NetSceneSendMsg", "[mergeMsgSource] WTF the msgsource is right? %s", new Object[] { paramString });
      AppMethodBeat.o(59973);
    }
    while (true)
    {
      return paramString;
      bool = false;
      break;
      label88: if ((paramInt == 291) && ((paramObject instanceof HashMap)))
      {
        StringBuffer localStringBuffer = new StringBuffer();
        if (bo.isNullOrNil(paramString))
          localStringBuffer.append("<msgsource>");
        paramObject = ((HashMap)paramObject).entrySet().iterator();
        while (paramObject.hasNext())
        {
          Object localObject = (Map.Entry)paramObject.next();
          String str = (String)((Map.Entry)localObject).getValue();
          localObject = (String)((Map.Entry)localObject).getKey();
          if ((bo.isNullOrNil(str)) || (bo.isNullOrNil((String)localObject)))
          {
            ab.w("MicroMsg.NetSceneSendMsg", "%s %s", new Object[] { localObject, str });
          }
          else
          {
            localStringBuffer.append("<").append((String)localObject).append(">");
            localStringBuffer.append(str);
            localStringBuffer.append("</").append((String)localObject).append(">");
          }
        }
        if (bo.isNullOrNil(paramString))
        {
          localStringBuffer.append("</msgsource>");
          paramString = localStringBuffer.toString();
          AppMethodBeat.o(59973);
        }
        else
        {
          paramString = paramString.replace("<msgsource>", "<msgsource>" + localStringBuffer.toString());
          AppMethodBeat.o(59973);
        }
      }
      else
      {
        AppMethodBeat.o(59973);
      }
    }
  }

  private void ahQ()
  {
    AppMethodBeat.i(59979);
    for (int i = 0; i < this.fIm.size(); i++)
      lM(i);
    AppMethodBeat.o(59979);
  }

  private void lL(int paramInt)
  {
    AppMethodBeat.i(59975);
    if (this.fIm == null)
    {
      ab.e("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent, sendingList is null");
      AppMethodBeat.o(59975);
    }
    while (true)
    {
      return;
      if ((paramInt >= this.fIm.size()) || (paramInt < 0))
      {
        ab.e("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent, index:%d, sendingList.size:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.fIm.size()) });
        AppMethodBeat.o(59975);
      }
      else
      {
        z((bi)this.fIm.get(paramInt));
        AppMethodBeat.o(59975);
      }
    }
  }

  private void lM(int paramInt)
  {
    AppMethodBeat.i(59980);
    bi localbi = (bi)this.fIm.get(paramInt);
    ab.d("MicroMsg.NetSceneSendMsg", "markMsgFailed for id:%d", new Object[] { Long.valueOf(localbi.field_msgId) });
    A(localbi);
    AppMethodBeat.o(59980);
  }

  private void sQ(String paramString)
  {
    AppMethodBeat.i(59978);
    ab.d("MicroMsg.NetSceneSendMsg", "continue send msg in list");
    int i = a(this.ftf, this.ehi);
    if (i == -2)
    {
      this.ehi.onSceneEnd(0, 0, paramString, this);
      AppMethodBeat.o(59978);
    }
    while (true)
    {
      return;
      if (i < 0)
        this.ehi.onSceneEnd(3, -1, paramString, this);
      AppMethodBeat.o(59978);
    }
  }

  private static void z(bi parambi)
  {
    AppMethodBeat.i(59976);
    qc localqc = new qc();
    localqc.cMs.csG = parambi;
    a.xxA.m(localqc);
    ab.d("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent for msgId:%d", new Object[] { Long.valueOf(parambi.field_msgId) });
    AppMethodBeat.o(59976);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(59974);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new bwl();
    paramf.fsK = new bwm();
    paramf.uri = "/cgi-bin/micromsg-bin/newsendmsg";
    paramf.fsI = 522;
    paramf.fsL = 237;
    paramf.fsM = 1000000237;
    this.ehh = paramf.acD();
    bwl localbwl = (bwl)this.ehh.fsG.fsP;
    int i;
    if (this.fIq == null)
    {
      paramf = ((j)g.K(j.class)).bOr().bOD();
      if (paramf.size() != 0)
        break label257;
      ab.w("MicroMsg.NetSceneSendMsg", "no sending message");
      i = -2;
      AppMethodBeat.o(59974);
    }
    while (true)
    {
      return i;
      if (this.fIq.field_status != 5)
        ab.w("MicroMsg.NetSceneSendMsg", "msg:%d status:%d should not be resend !", new Object[] { Long.valueOf(this.fIq.field_msgId), Integer.valueOf(this.fIq.field_status) });
      this.fIq.setStatus(1);
      ((j)g.K(j.class)).bOr().a(this.cvx, this.fIq);
      paramf = new ArrayList();
      paramf.add(this.fIq);
      this.fIq = null;
      break;
      label257: this.fIm.clear();
      for (i = 0; i < paramf.size(); i++)
      {
        bi localbi = (bi)paramf.get(i);
        if (localbi.field_isSend == 1)
        {
          bbe localbbe = new bbe();
          localbbe.vEC = new bts().alV(localbi.field_talker);
          localbbe.pcX = ((int)(localbi.field_createTime / 1000L));
          localbbe.jCt = localbi.getType();
          localbbe.ncM = localbi.field_content;
          localbbe.wFW = p.m(r.Yz(), localbi.field_createTime).hashCode();
          if (this.fIr == null)
            this.fIr = ((com.tencent.mm.plugin.messenger.foundation.a.q)g.K(com.tencent.mm.plugin.messenger.foundation.a.q.class)).ahU();
          ab.i("MicroMsg.NetSceneSendMsg", "using message source assembler %s", new Object[] { this.fIr });
          this.fIr.a(localbbe, localbi);
          ab.i("MicroMsg.NetSceneSendMsg", "reqCmd.MsgSource:%s", new Object[] { localbbe.vEG });
          localbwl.jBw.add(localbbe);
          localbwl.jBv = localbwl.jBw.size();
          this.fIm.add(localbi);
        }
      }
      i = a(parame, this.ehh, this);
      if (i < 0)
      {
        ab.i("MicroMsg.NetSceneSendMsg", "mark all failed. do scene %d", new Object[] { Integer.valueOf(i) });
        ahQ();
      }
      AppMethodBeat.o(59974);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(59977);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.i("MicroMsg.NetSceneSendMsg", "mark all failed. onGYNetEnd. errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      com.tencent.mm.plugin.report.e.pXa.a(111L, paramInt2 + 40, 1L, true);
      com.tencent.mm.plugin.report.e.pXa.a(111L, 253L, 1L, false);
      if ((paramInt2 == 3) || (paramInt2 == 9) || (paramInt2 == 7) || (paramInt2 == 8) || (paramInt2 == 1))
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        ab.e("MicroMsg.NetSceneSendMsg", "Message delivery failed due to network reasons.");
        AppMethodBeat.o(59977);
      }
    }
    while (true)
    {
      return;
      ahQ();
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      for (paramInt1 = 0; paramInt1 < this.fIm.size(); paramInt1++)
        lL(paramInt1);
      ab.d("MicroMsg.NetSceneSendMsg", "send fail, continue send SENDING msg");
      sQ(paramString);
      AppMethodBeat.o(59977);
      continue;
      paramq = ((bwm)this.ehh.fsH.fsP).jBw;
      paramArrayOfByte = new ArrayList();
      if (this.fIm.size() == paramq.size())
      {
        paramInt1 = 0;
        label242: if (paramInt1 < paramq.size())
        {
          Object localObject = (bbf)paramq.get(paramInt1);
          if ((((bbf)localObject).Ret != 0) || (ae.gjg))
          {
            com.tencent.mm.plugin.report.e.pXa.a(111L, 252L, 1L, false);
            if ((((bbf)localObject).Ret == -49) || (ae.gjg))
            {
              ab.i("MicroMsg.NetSceneSendMsg", "summerdktext send msg failed: item ret code[%d], index[%d], testVerifyPsw[%b], retryVerifyCount[%d]", new Object[] { Integer.valueOf(((bbf)localObject).Ret), Integer.valueOf(paramInt1), Boolean.valueOf(ae.gjg), Integer.valueOf(this.fIn) });
              if (this.fIo)
              {
                localObject = (bi)this.fIm.get(paramInt1);
                this.fIp.add(localObject);
              }
              while (true)
              {
                paramInt1++;
                break label242;
                if (this.fIn < 0)
                {
                  lM(paramInt1);
                  this.ehi.onSceneEnd(4, ((bbf)localObject).Ret, paramString, this);
                  lL(paramInt1);
                  AppMethodBeat.o(59977);
                  break;
                }
                this.fIo = true;
                this.fIn -= 1;
                localObject = (bi)this.fIm.get(paramInt1);
                this.fIp.add(localObject);
                g.RS().aa(new h.1(this, paramString));
              }
            }
            lM(paramInt1);
            this.ehi.onSceneEnd(4, ((bbf)localObject).Ret, paramString, this);
            lL(paramInt1);
            AppMethodBeat.o(59977);
          }
          else
          {
            long l = ((bi)this.fIm.get(paramInt1)).field_msgId;
            ab.i("MicroMsg.NetSceneSendMsg", "msg local id = " + l + ", SvrId = " + ((bbf)localObject).ptF + " sent successfully!");
            bi localbi = ((j)g.K(j.class)).bOr().jf(l);
            localbi.eI(((bbf)localObject).ptF);
            ab.d("MicroMsg.NetSceneSendMsg", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(((bbf)localObject).ptF), Integer.valueOf(ae.giA) });
            if ((10007 == ae.giz) && (ae.giA != 0))
            {
              localbi.eI(ae.giA);
              ae.giA = 0;
            }
            localbi.setStatus(2);
            ((j)g.K(j.class)).bOr().a(l, localbi);
            if (this.fIm == null)
              ab.e("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent, sendingList is null");
            while (true)
            {
              paramArrayOfByte.add(Integer.valueOf(paramInt1));
              if (1 != ((bbf)localObject).jCt)
                break;
              com.tencent.mm.plugin.report.e.pXa.a(11942, true, false, new Object[] { Long.valueOf(((bbf)localObject).ptF) });
              com.tencent.mm.plugin.report.e.pXa.a(11945, false, true, new Object[] { Long.valueOf(((bbf)localObject).ptF) });
              com.tencent.mm.plugin.report.e.pXa.a(11946, false, false, new Object[] { Long.valueOf(((bbf)localObject).ptF) });
              com.tencent.mm.plugin.report.e.pXa.a(90L, 0L, 1L, false);
              com.tencent.mm.plugin.report.e.pXa.a(90L, 1L, 1L, true);
              break;
              if ((paramInt1 >= this.fIm.size()) || (paramInt1 < 0))
              {
                ab.e("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent, index:%d, sendingList.size:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(this.fIm.size()) });
              }
              else
              {
                l = ((bi)this.fIm.get(paramInt1)).field_msgId;
                ab.d("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent for msgId:%d", new Object[] { Long.valueOf(l) });
                localbi = ((j)g.K(j.class)).bOr().jf(l);
                qe localqe = new qe();
                localqe.cMu.csG = localbi;
                a.xxA.m(localqe);
              }
            }
          }
        }
        else
        {
          ab.i("MicroMsg.NetSceneSendMsg", "summerdktext total  [%d]msgs sent successfully, [%d]msgs need verifypsw", new Object[] { Integer.valueOf(paramInt1 - this.fIp.size()), Integer.valueOf(this.fIp.size()) });
        }
      }
      else
      {
        ab.d("MicroMsg.NetSceneSendMsg", "summerdktext send finish, continue send SENDING msg verifyingPsw[%b]", new Object[] { Boolean.valueOf(this.fIo) });
        if (this.fIo)
        {
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(59977);
        }
        else
        {
          sQ(paramString);
          AppMethodBeat.o(59977);
        }
      }
    }
  }

  public final boolean acI()
  {
    return true;
  }

  public final boolean acJ()
  {
    AppMethodBeat.i(59971);
    boolean bool = super.acJ();
    if (bool)
      com.tencent.mm.plugin.report.e.pXa.a(111L, 254L, 1L, false);
    AppMethodBeat.o(59971);
    return bool;
  }

  public final int acn()
  {
    return 10;
  }

  public final m.b b(com.tencent.mm.network.q paramq)
  {
    AppMethodBeat.i(59972);
    if (this.fIm.size() > 0)
    {
      paramq = m.b.ftu;
      AppMethodBeat.o(59972);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftv;
      AppMethodBeat.o(59972);
    }
  }

  public final int getType()
  {
    return 522;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.h
 * JD-Core Version:    0.6.2
 */