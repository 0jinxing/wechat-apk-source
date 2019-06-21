package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.p;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bbe;
import com.tencent.mm.protocal.protobuf.bbf;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.bwl;
import com.tencent.mm.protocal.protobuf.bwm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;

public final class h extends m
  implements k
{
  private static final List<Object> fIl;
  private static final Set<Long> sOD;
  private long cvx;
  private b ehh;
  private f ehi;
  private final List<bi> fIm;

  static
  {
    AppMethodBeat.i(4365);
    fIl = new ArrayList();
    sOD = new HashSet();
    AppMethodBeat.o(4365);
  }

  public h()
  {
    AppMethodBeat.i(4359);
    this.fIm = new LinkedList();
    ab.d("MicroMsg.NetSceneSendMsg", "dktext :" + bo.dpG());
    ab.i("MicroMsg.NetSceneSendMsg", "empty msg sender created");
    AppMethodBeat.o(4359);
  }

  public h(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(4358);
    this.fIm = new LinkedList();
    ab.d("MicroMsg.NetSceneSendMsg", "dktext :" + bo.dpG());
    if (!bo.isNullOrNil(paramString1))
    {
      bi localbi = new bi();
      localbi.setStatus(1);
      localbi.ju(paramString1);
      localbi.eJ(bf.oC(paramString1));
      localbi.hO(1);
      localbi.setContent(paramString2);
      localbi.setType(paramInt);
      this.cvx = ((j)g.K(j.class)).bOr().Z(localbi);
      if (this.cvx == -1L)
        break label173;
    }
    label173: for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      ab.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.cvx);
      AppMethodBeat.o(4358);
      return;
    }
  }

  private void ahQ()
  {
    AppMethodBeat.i(4363);
    for (int i = 0; i < this.fIm.size(); i++)
      lM(i);
    AppMethodBeat.o(4363);
  }

  private void lM(int paramInt)
  {
    AppMethodBeat.i(4364);
    Object localObject = (bi)this.fIm.get(paramInt);
    ((bi)localObject).setStatus(5);
    ((j)g.K(j.class)).bOr().a(((cy)localObject).field_msgId, (bi)localObject);
    localObject = fIl.iterator();
    while (((Iterator)localObject).hasNext())
      ((Iterator)localObject).next();
    AppMethodBeat.o(4364);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(4361);
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
    paramf = ((j)g.K(j.class)).bOr().bOD();
    int i;
    if (paramf.size() == 0)
    {
      ab.i("MicroMsg.NetSceneSendMsg", "no sending message");
      i = -2;
      AppMethodBeat.o(4361);
    }
    while (true)
    {
      return i;
      this.fIm.clear();
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
          localbbe.vEG = bh.aaf();
          localbwl.jBw.add(localbbe);
          localbwl.jBv = localbwl.jBw.size();
          this.fIm.add(localbi);
        }
      }
      i = a(parame, this.ehh, this);
      if (i < 0)
        ahQ();
      AppMethodBeat.o(4361);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(4362);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ahQ();
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(4362);
    }
    while (true)
    {
      return;
      paramq = ((bwm)this.ehh.fsH.fsP).jBw;
      if (this.fIm.size() == paramq.size())
      {
        for (paramInt1 = 0; ; paramInt1++)
        {
          if (paramInt1 >= paramq.size())
            break label295;
          paramArrayOfByte = (bbf)paramq.get(paramInt1);
          if (paramArrayOfByte.Ret != 0)
          {
            ab.e("MicroMsg.NetSceneSendMsg", "send msg failed: item ret code=" + paramArrayOfByte.Ret);
            lM(paramInt1);
            this.ehi.onSceneEnd(4, paramArrayOfByte.Ret, paramString, this);
            AppMethodBeat.o(4362);
            break;
          }
          long l = ((bi)this.fIm.get(paramInt1)).field_msgId;
          ab.i("MicroMsg.NetSceneSendMsg", "msg local id = " + l + ", SvrId = " + paramArrayOfByte.ptF + " sent successfully!");
          bi localbi = ((j)g.K(j.class)).bOr().jf(l);
          localbi.eI(paramArrayOfByte.ptF);
          localbi.setStatus(2);
          ((j)g.K(j.class)).bOr().a(l, localbi);
        }
        label295: ab.i("MicroMsg.NetSceneSendMsg", "total " + paramInt1 + " msgs sent successfully");
      }
      paramInt1 = a(this.ftf, this.ehi);
      if (paramInt1 == -2)
      {
        this.ehi.onSceneEnd(0, 0, paramString, this);
        AppMethodBeat.o(4362);
      }
      else
      {
        if (paramInt1 < 0)
          this.ehi.onSceneEnd(3, -1, paramString, this);
        AppMethodBeat.o(4362);
      }
    }
  }

  public final int acn()
  {
    return 10;
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(4360);
    if (this.fIm.size() > 0)
    {
      paramq = m.b.ftu;
      AppMethodBeat.o(4360);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftv;
      AppMethodBeat.o(4360);
    }
  }

  public final int getType()
  {
    return 522;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.h
 * JD-Core Version:    0.6.2
 */