package com.tencent.mm.plugin.nearby.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.axv;
import com.tencent.mm.protocal.protobuf.axz;
import com.tencent.mm.protocal.protobuf.aya;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;

  public c(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    AppMethodBeat.i(55363);
    if ((paramInt1 != 1) && (paramInt1 != 2) && (paramInt1 != 3) && (paramInt1 != 4))
      ab.e("MicroMsg.NetSceneLbsP", "OpCode Error :".concat(String.valueOf(paramInt1)));
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new axz();
    ((b.a)localObject).fsK = new aya();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/lbsfind";
    ((b.a)localObject).fsI = 148;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (axz)this.ehh.fsG.fsP;
    ((axz)localObject).OpCode = paramInt1;
    ((axz)localObject).vRp = paramFloat1;
    ((axz)localObject).vRq = paramFloat2;
    ((axz)localObject).wfG = paramInt2;
    ((axz)localObject).wfH = paramString1;
    ((axz)localObject).wfI = paramString2;
    ((axz)localObject).wfJ = paramInt3;
    ((axz)localObject).vIl = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.bVS());
    ab.d("MicroMsg.NetSceneLbsP", "Req: opcode:" + paramInt1 + " lon:" + paramFloat1 + " lat:" + paramFloat2 + " pre:" + paramInt2 + " gpsSource:" + paramInt3 + " mac" + paramString1 + " cell:" + paramString2 + " ccdLen:" + ((axz)localObject).vIl.getILen());
    com.tencent.mm.modelstat.o.a(2001, paramFloat1, paramFloat2, paramInt2);
    AppMethodBeat.o(55363);
  }

  public final int Ah()
  {
    return ((axz)this.ehh.fsG.fsP).OpCode;
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(55364);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(55364);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(55365);
    ab.d("MicroMsg.NetSceneLbsP", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (aya)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    paramq = new ArrayList();
    for (paramInt1 = 0; paramInt1 < paramArrayOfByte.woe.size(); paramInt1++)
    {
      h localh = new h();
      localh.username = ((axv)paramArrayOfByte.woe.get(paramInt1)).jBB;
      localh.dtR = ((axv)paramArrayOfByte.woe.get(paramInt1)).vEE;
      localh.frW = ((axv)paramArrayOfByte.woe.get(paramInt1)).vXm;
      localh.frV = ((axv)paramArrayOfByte.woe.get(paramInt1)).vXn;
      localh.cB(true);
      paramq.add(localh);
    }
    com.tencent.mm.ah.o.act().aa(paramq);
    if ((Ah() == 1) || (Ah() == 3) || (Ah() == 4))
    {
      if ((paramInt2 != 0) && (paramInt3 == -2001))
      {
        com.tencent.mm.kernel.g.RP().Ry().set(8210, Long.valueOf(0L));
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(55365);
        return;
      }
      com.tencent.mm.kernel.g.RP().Ry().set(8210, Long.valueOf(System.currentTimeMillis() + paramArrayOfByte.wCg * 1000));
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(55365);
      break;
      if (Ah() == 2)
        com.tencent.mm.kernel.g.RP().Ry().set(8210, Long.valueOf(0L));
    }
  }

  public final boolean bUX()
  {
    if (((aya)this.ehh.fsH.fsP).wCh == 1);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int bUY()
  {
    return ((aya)this.ehh.fsH.fsP).wCi;
  }

  public final List<axv> bUZ()
  {
    AppMethodBeat.i(55366);
    LinkedList localLinkedList = ((aya)this.ehh.fsH.fsP).woe;
    if (localLinkedList != null)
    {
      com.tencent.mm.kernel.g.RN().QU();
      Iterator localIterator = localLinkedList.iterator();
      while (localIterator.hasNext())
      {
        axv localaxv = (axv)localIterator.next();
        com.tencent.mm.plugin.c.a.ask().Yn().ia(localaxv.jBB, localaxv.wlF);
      }
    }
    AppMethodBeat.o(55366);
    return localLinkedList;
  }

  public final int getType()
  {
    return 148;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.a.c
 * JD-Core Version:    0.6.2
 */