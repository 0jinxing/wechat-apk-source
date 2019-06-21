package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.protocal.protobuf.axu;
import com.tencent.mm.protocal.protobuf.og;
import com.tencent.mm.protocal.protobuf.oh;
import com.tencent.mm.protocal.protobuf.ok;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.List;

public final class w extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  private byte[] fIi;
  private int kec;

  public w(int paramInt)
  {
    AppMethodBeat.i(87882);
    this.kec = 0;
    ab.d("MicroMsg.NetSceneCardSync", "<init>, selector = %d", new Object[] { Integer.valueOf(1) });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new og();
    ((b.a)localObject).fsK = new oh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/cardsync";
    ((b.a)localObject).fsI = 558;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = new axu();
    ((axu)localObject).kfA = ((String)g.RP().Ry().get(ac.a.xKi, null));
    ((axu)localObject).latitude = am.bbc().ecs;
    ((axu)localObject).longitude = am.bbc().ect;
    og localog = (og)this.ehh.fsG.fsP;
    localog.vTN = 1;
    localog.vTP = ((axu)localObject);
    localog.vTQ = paramInt;
    this.kec = paramInt;
    AppMethodBeat.o(87882);
  }

  private static boolean a(tb paramtb)
  {
    AppMethodBeat.i(87885);
    boolean bool;
    if (paramtb == null)
    {
      ab.e("MicroMsg.NetSceneCardSync", "processCmdItem fail, null cmd");
      AppMethodBeat.o(87885);
      bool = false;
    }
    while (true)
    {
      return bool;
      byte[] arrayOfByte = aa.a(paramtb.wau);
      if ((arrayOfByte == null) || (arrayOfByte.length == 0))
      {
        ab.e("MicroMsg.NetSceneCardSync", "processCmdItem fail, null buf");
        AppMethodBeat.o(87885);
        bool = false;
      }
      else
      {
        ab.d("MicroMsg.NetSceneCardSync", "processCmdItem, buf length = %d, cmdId = %d", new Object[] { Integer.valueOf(arrayOfByte.length), Integer.valueOf(paramtb.wat) });
        try
        {
          switch (paramtb.wat)
          {
          default:
            ab.w("MicroMsg.NetSceneCardSync", "processCmdItem, unknown cmdId = %d", new Object[] { Integer.valueOf(paramtb.wat) });
            AppMethodBeat.o(87885);
            bool = false;
            break;
          case 1:
            paramtb = new com/tencent/mm/protocal/protobuf/ok;
            paramtb.<init>();
            paramtb = (ok)paramtb.parseFrom(arrayOfByte);
            ab.i("MicroMsg.NetSceneCardSync", "processCmdIem, card user item, Status = %d", new Object[] { Integer.valueOf(paramtb.jBT) });
            switch (paramtb.jBT)
            {
            default:
              ab.e("MicroMsg.NetSceneCardSync", "processCmdIem, card user item, unknown StateFlag = %d", new Object[] { Integer.valueOf(paramtb.vUM) });
              AppMethodBeat.o(87885);
              bool = false;
              break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
              am.baV().a(paramtb);
            case 6:
              AppMethodBeat.o(87885);
              bool = true;
            }
            break;
          }
        }
        catch (Exception paramtb)
        {
          ab.e("MicroMsg.NetSceneCardSync", "processCmdItem fail, ex = %s", new Object[] { paramtb.getMessage() });
          AppMethodBeat.o(87885);
          bool = false;
        }
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(87883);
    this.ehi = paramf;
    paramf = (og)this.ehh.fsG.fsP;
    this.fIi = bo.anf(bo.nullAsNil((String)g.RP().Ry().get(282880, null)));
    if ((this.fIi == null) || (this.fIi.length == 0))
      ab.e("MicroMsg.NetSceneCardSync", "doScene, keyBuf is null, init card sync~~~");
    paramf.vTO = aa.ad(this.fIi);
    if (this.fIi == null);
    for (int i = 0; ; i = this.fIi.length)
    {
      ab.i("MicroMsg.NetSceneCardSync", "doScene, keyBuf.length = %d", new Object[] { Integer.valueOf(i) });
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(87883);
      return i;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q arg5, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87884);
    ab.d("MicroMsg.NetSceneCardSync", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneCardSync", "onGYNetEnd, card sync fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(87884);
      return;
    }
    paramArrayOfByte = (oh)this.ehh.fsH.fsP;
    if (paramArrayOfByte.vTS == 1)
      ab.i("MicroMsg.NetSceneCardSync", "need do getCardsLayoutScene");
    this.fIi = aa.a(paramArrayOfByte.vTO, new byte[0]);
    if (paramArrayOfByte.vTR == null)
    {
      ??? = null;
      label145: if (??? != null)
        break label269;
      paramInt1 = 0;
      label152: if (this.fIi != null)
        break label280;
      paramInt2 = 0;
      label161: ab.i("MicroMsg.NetSceneCardSync", "onGYNetEnd, cmd list size = %d, synckey length = %d, continueFlag = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramArrayOfByte.vQe) });
      if ((??? == null) || (???.size() <= 0))
        break label422;
      paramInt1 = 0;
      ??? = ???.iterator();
      label224: if (!???.hasNext())
        break label289;
      if (a((tb)???.next()))
        break label538;
      paramInt1++;
    }
    label269: label280: label538: 
    while (true)
    {
      break label224;
      ??? = paramArrayOfByte.vTR.jBw;
      break label145;
      paramInt1 = ???.size();
      break label152;
      paramInt2 = this.fIi.length;
      break label161;
      label289: ab.i("MicroMsg.NetSceneCardSync", "onGYNetEnd, %d fail cmds", new Object[] { Integer.valueOf(paramInt1) });
      am.baV().bai();
      while (true)
      {
        g.RP().Ry().set(282880, bo.cd(this.fIi));
        if (paramArrayOfByte.vQe > 0)
        {
          ab.d("MicroMsg.NetSceneCardSync", "onGYNetEnd, should continue, continueFlag = %d", new Object[] { Integer.valueOf(paramArrayOfByte.vQe) });
          paramInt1 = a(this.ftf, this.ehi);
          if (paramInt1 <= 0)
          {
            ab.e("MicroMsg.NetSceneCardSync", "onGYNetEnd, doScene again fail, ret = %d", new Object[] { Integer.valueOf(paramInt1) });
            this.ehi.onSceneEnd(3, -1, paramString, this);
          }
          AppMethodBeat.o(87884);
          break;
          label422: ab.i("MicroMsg.NetSceneCardSync", "cmdList == null or size is 0");
          com.tencent.mm.plugin.card.b.b localb = am.baV();
          ab.i("MicroMsg.BatchGetCardMgr", "retryAll, getNow = %b", new Object[] { Boolean.TRUE });
          synchronized (localb.eMl)
          {
            localb.kaA.addAll(localb.kaB);
            localb.kaB.clear();
            localb.bai();
          }
        }
      }
      this.ehi.onSceneEnd(0, 0, paramString, this);
      AppMethodBeat.o(87884);
      break;
    }
  }

  public final int getType()
  {
    return 558;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.w
 * JD-Core Version:    0.6.2
 */