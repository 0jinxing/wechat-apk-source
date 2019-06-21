package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.blk;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.can;
import com.tencent.mm.protocal.protobuf.cao;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cau;
import com.tencent.mm.protocal.protobuf.cav;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbn;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.Locale;

public final class o extends m
  implements k
{
  private b ehh;
  public com.tencent.mm.ai.f ehi;
  private String qIR;
  private cao qIS;
  private int type;

  public o(cao paramcao, String paramString)
  {
    AppMethodBeat.i(36261);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cau();
    ((b.a)localObject).fsK = new cav();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnscomment";
    ((b.a)localObject).fsI = 213;
    ((b.a)localObject).fsL = 100;
    ((b.a)localObject).fsM = 1000000100;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cau)this.ehh.fsG.fsP;
    ((cau)localObject).wZr = paramcao;
    this.type = paramcao.wZN.jCt;
    this.qIS = paramcao;
    ((cau)localObject).ptv = paramString;
    this.qIR = paramString;
    ab.d("MicroMsg.NetSceneSnsComment", paramcao.wZN.wPm + " " + paramcao.wZN.wel);
    AppMethodBeat.o(36261);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(36262);
    Object localObject1 = af.cnF().kD(this.qIS.vQE);
    Object localObject2 = localObject1;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject3 = af.cnI().ku(this.qIS.vQE);
      localObject2 = localObject1;
      if (localObject3 != null)
        localObject2 = ((com.tencent.mm.plugin.sns.storage.e)localObject3).cqB();
    }
    if (localObject2 != null);
    try
    {
      localObject1 = new com/tencent/mm/protocal/protobuf/cbf;
      ((cbf)localObject1).<init>();
      localObject2 = (cbf)((cbf)localObject1).parseFrom(((n)localObject2).field_attrBuf);
      if ((((cbf)localObject2).xaD != null) && (((cbf)localObject2).xaD.hasBuffer()))
      {
        localObject1 = new com/tencent/mm/protocal/protobuf/cbn;
        ((cbn)localObject1).<init>();
        localObject1 = (cbn)((cbn)localObject1).parseFrom(((cbf)localObject2).xaD.getBufferToBytes());
        localObject2 = (cau)this.ehh.fsG.fsP;
        if (((cbn)localObject1).xaS != null)
        {
          localObject1 = String.format(Locale.US, "preloadLayerId=%d&preloadExpId=%d", new Object[] { Integer.valueOf(((cbn)localObject1).xaS.wcL), Integer.valueOf(((cbn)localObject1).xaS.wcM) });
          ab.i("MicroMsg.NetSceneSnsComment", "doScene(sight_autodownload) snsStatExt:%s", new Object[] { localObject1 });
          localObject3 = new com/tencent/mm/protocal/protobuf/bts;
          ((bts)localObject3).<init>();
          ((cau)localObject2).wZs = ((bts)localObject3).alV((String)localObject1);
        }
      }
      this.ehi = paramf;
      int i = a(parame, this.ehh, this);
      AppMethodBeat.o(36262);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.NetSceneSnsComment", localException, "", new Object[0]);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36263);
    ab.d("MicroMsg.NetSceneSnsComment", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
      if (paramInt2 == 4)
        af.cnE().e(this.qIS.vQE, this.type, this.qIR);
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36263);
      return;
      af.cnE().e(this.qIS.vQE, this.type, this.qIR);
      paramArrayOfByte = this.qIS.wZN;
      if ((paramArrayOfByte.jCt == 1) || (paramArrayOfByte.jCt == 2) || (paramArrayOfByte.jCt == 3) || (paramArrayOfByte.jCt == 5))
      {
        paramq = new cat();
        paramq.pcX = paramArrayOfByte.pcX;
        paramq.jCt = paramArrayOfByte.jCt;
        paramq.vFH = paramArrayOfByte.vFH;
        paramq.vHl = paramArrayOfByte.wPm;
        paramq.wCW = paramArrayOfByte.wZD;
        paramq.ncM = paramArrayOfByte.ncM;
        paramq.wZL = paramArrayOfByte.wZL;
      }
      try
      {
        paramq = ((cav)this.ehh.fsH.fsP).wZu;
        if ((paramArrayOfByte.jCt == 1) || (paramArrayOfByte.jCt == 5))
        {
          paramArrayOfByte = new java/lang/StringBuilder;
          paramArrayOfByte.<init>("snsComment:");
          ab.i("MicroMsg.NetSceneSnsComment", paramq.vQE + " " + aa.b(paramq.xam) + " " + paramq.xaq.size() + " " + paramq.xat.size());
        }
        while (true)
        {
          aj.d(paramq);
          af.cnE().cnf();
          break;
          paramArrayOfByte = new java/lang/StringBuilder;
          paramArrayOfByte.<init>("snsComment:");
          ab.i("MicroMsg.NetSceneSnsComment", paramq.vQE + " " + paramq.xaq.size() + " " + paramq.xat.size());
        }
      }
      catch (Exception paramq)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.NetSceneSnsComment", paramq, "", new Object[0]);
      }
    }
  }

  public final int getType()
  {
    return 213;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.o
 * JD-Core Version:    0.6.2
 */