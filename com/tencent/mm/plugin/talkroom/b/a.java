package com.tencent.mm.plugin.talkroom.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cgl;
import com.tencent.mm.protocal.protobuf.cgm;
import com.tencent.mm.protocal.protobuf.ym;
import com.tencent.mm.protocal.protobuf.yn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class a extends f
{
  private final b ehh;
  private com.tencent.mm.ai.f ehi;
  private final String nNq;
  public int nwu;
  public long nwv;
  private int sceneType;
  public int syE;
  public int syF;
  public LinkedList<cgl> syH;
  public LinkedList<cgm> sza;

  public a(String paramString, int paramInt)
  {
    AppMethodBeat.i(25867);
    this.sceneType = 0;
    b.a locala = new b.a();
    this.sceneType = paramInt;
    locala.fsJ = new ym();
    locala.fsK = new yn();
    locala.uri = "/cgi-bin/micromsg-bin/entertalkroom";
    locala.fsI = 332;
    locala.fsL = 147;
    locala.fsM = 1000000147;
    this.ehh = locala.acD();
    ((ym)this.ehh.fsG.fsP).wel = paramString;
    ((ym)this.ehh.fsG.fsP).Scene = paramInt;
    this.nNq = paramString;
    AppMethodBeat.o(25867);
  }

  private static LinkedList<cgm> as(LinkedList<cgm> paramLinkedList)
  {
    AppMethodBeat.i(25870);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      paramLinkedList = (cgm)localIterator.next();
      if (!bo.isNullOrNil(paramLinkedList.jBB))
        localLinkedList.add(paramLinkedList);
    }
    AppMethodBeat.o(25870);
    return localLinkedList;
  }

  private static LinkedList<cgl> at(LinkedList<cgl> paramLinkedList)
  {
    AppMethodBeat.i(25871);
    LinkedList localLinkedList = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
      localLinkedList.add((cgl)paramLinkedList.next());
    AppMethodBeat.o(25871);
    return localLinkedList;
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(25868);
    ab.d("MicroMsg.NetSceneEnterTalkRoom", "doScene %d", new Object[] { Integer.valueOf(this.sceneType) });
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(25868);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25869);
    ab.d("MicroMsg.NetSceneEnterTalkRoom", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25869);
    }
    while (true)
    {
      return;
      paramq = (yn)this.ehh.fsH.fsP;
      ab.i("MicroMsg.NetSceneEnterTalkRoom", "resp %s", new Object[] { paramq.toString() });
      this.nwu = paramq.wem;
      this.nwv = paramq.wen;
      this.syE = paramq.weo;
      this.syF = paramq.weq;
      this.sza = as(paramq.vEh);
      this.syH = at(paramq.vIO);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25869);
    }
  }

  public final String cED()
  {
    return this.nNq;
  }

  public final int cEE()
  {
    return this.sceneType;
  }

  public final int getType()
  {
    return 332;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.b.a
 * JD-Core Version:    0.6.2
 */