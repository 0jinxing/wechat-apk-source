package com.tencent.mm.plugin.location.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bku;
import com.tencent.mm.protocal.protobuf.bqt;
import com.tencent.mm.protocal.protobuf.bqu;
import com.tencent.mm.protocal.protobuf.cie;
import com.tencent.mm.protocal.protobuf.cmj;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c extends m
  implements k
{
  public final b ehh;
  private f ehi;
  private Runnable fPK;
  public String hwA;
  public int nLb;
  public cie nLc;
  public List<cmj> nLd;
  public bqu nLe;
  public int nLf;
  private String nLg;

  public c(String paramString, int paramInt1, cmj paramcmj, int paramInt2, cie paramcie)
  {
    AppMethodBeat.i(113415);
    this.nLc = null;
    this.nLd = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bqt();
    ((b.a)localObject).fsK = new bqu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/refreshtrackroom";
    ((b.a)localObject).fsI = 492;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bqt)this.ehh.fsG.fsP;
    ((bqt)localObject).weu = paramString;
    ((bqt)localObject).jCt = paramInt1;
    ((bqt)localObject).wTf = paramcmj;
    ((bqt)localObject).nbj = paramInt2;
    ((bqt)localObject).wTg = paramcie;
    this.nLg = paramString;
    this.nLf = ((bqt)localObject).jCt;
    ab.d("MicroMsg.NetSceneRefreshTrackRoom", "userPosiItem " + paramcmj.vHl + " " + paramcmj.xkm.vNI + " " + paramcmj.xkm.vNH + " heading:" + paramcmj.xkm.wNP);
    ab.d("MicroMsg.NetSceneRefreshTrackRoom", "userPoi " + paramcie.vNI + " " + paramcie.vNH + " " + paramcie.Name);
    ab.d("MicroMsg.NetSceneRefreshTrackRoom", "trackRoomId:" + paramString + " uploadStatus:" + paramInt1);
    AppMethodBeat.o(113415);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(113416);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(113416);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(113417);
    this.nLe = ((bqu)((b)paramq).fsH.fsP);
    if (this.nLe != null)
      this.hwA = this.nLe.vKq;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.nLb = this.nLe.wBg;
      this.nLc = this.nLe.wTi;
      this.nLd = this.nLe.wTh;
      paramq = new StringBuffer();
      paramq.append(String.format("[ resp count %d ] ", new Object[] { Integer.valueOf(this.nLe.jBv) }));
      if (this.nLc != null)
        paramq.append(String.format("[ roomPoi  %f %f %s] ", new Object[] { Double.valueOf(this.nLc.vNI), Double.valueOf(this.nLc.vNH), this.nLc.Name }));
      ab.d("MicroMsg.NetSceneRefreshTrackRoom", "onGynetEnd " + paramq.toString());
      LinkedList localLinkedList = new LinkedList();
      paramArrayOfByte = this.nLe.wTh.iterator();
      while (paramArrayOfByte.hasNext())
      {
        paramq = (cmj)paramArrayOfByte.next();
        if (paramq == null)
        {
          localLinkedList.add(paramq);
        }
        else
        {
          if (paramq.xkm == null)
            localLinkedList.add(paramq);
          if ((Math.abs(paramq.xkm.vNH) > 180.0D) || (Math.abs(paramq.xkm.vNI) > 90.0D))
          {
            ab.w("MicroMsg.NetSceneRefreshTrackRoom", "server lat lng invalid %s %f %f %f", new Object[] { paramq.vHl, Double.valueOf(paramq.xkm.vNI), Double.valueOf(paramq.xkm.vNH), Double.valueOf(paramq.xkm.wNP) });
            localLinkedList.add(paramq);
          }
        }
      }
      this.nLe.jBv = this.nLe.wTh.size();
    }
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (this.fPK != null)
      this.fPK.run();
    AppMethodBeat.o(113417);
  }

  public final int getType()
  {
    return 492;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.a.c
 * JD-Core Version:    0.6.2
 */