package com.tencent.mm.plugin.location.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.als;
import com.tencent.mm.protocal.protobuf.alt;
import com.tencent.mm.protocal.protobuf.bhu;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h extends m
  implements k
{
  public String aIm;
  public int czE;
  public boolean eTf;
  public final b ehh;
  private com.tencent.mm.ai.f ehi;
  public int errCode;
  public int errType;
  private Runnable fPK;
  public String hlm;
  public List<com.tencent.mm.plugin.location.ui.impl.f> list;
  public byte[] nJH;
  public byte[] nJI;
  public String nJJ;
  public int nJK;

  public h(byte[] paramArrayOfByte, double paramDouble1, double paramDouble2, int paramInt1, int paramInt2, double paramDouble3, double paramDouble4, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(113315);
    this.list = new ArrayList();
    this.nJI = null;
    this.eTf = false;
    this.nJJ = "";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new als();
    ((b.a)localObject).fsK = new alt();
    ((b.a)localObject).fsK = new alt();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getpoilist";
    ((b.a)localObject).fsI = 457;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    als localals = (als)this.ehh.fsG.fsP;
    if (paramArrayOfByte == null)
    {
      localObject = new SKBuiltinBuffer_t();
      localals.wpP = ((SKBuiltinBuffer_t)localObject);
      localals.wkD = paramString2;
      localals.vNI = paramDouble1;
      localals.vNH = paramDouble2;
      localals.Scene = paramInt1;
      localals.OpCode = paramInt2;
      localals.wqT = paramDouble4;
      localals.wqS = paramDouble3;
      if (!paramBoolean)
        break label332;
    }
    label332: for (int i = 1; ; i = 0)
    {
      localals.wpR = i;
      this.czE = localals.OpCode;
      this.nJJ = paramString1;
      this.nJH = paramArrayOfByte;
      ab.i("MicroMsg.NetSceneGetPoiList", "lat %f lng %f scene %d opcode %d oriLat %f oriLng %f isAutuQuery %s".concat(String.valueOf(paramArrayOfByte)), new Object[] { Double.valueOf(paramDouble1), Double.valueOf(paramDouble2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Double.valueOf(paramDouble4), Double.valueOf(paramDouble3), Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(113315);
      return;
      localObject = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte);
      break;
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(113316);
    ab.d("MicroMsg.NetSceneGetPoiList", "scene done");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(113316);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(113317);
    ab.d("MicroMsg.NetSceneGetPoiList", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + "errMsg:" + paramString);
    this.errType = paramInt2;
    this.errCode = paramInt3;
    this.aIm = paramString;
    alt localalt = (alt)this.ehh.fsH.fsP;
    this.list.clear();
    ab.d("MicroMsg.NetSceneGetPoiList", "url " + localalt.wpY + " " + localalt.wdK + " " + localalt.Url + " " + localalt.vQg);
    ab.d("MicroMsg.NetSceneGetPoiList", "autoInterval: %d", new Object[] { Integer.valueOf(localalt.wpZ) });
    this.hlm = localalt.vQg;
    this.nJK = localalt.wpZ;
    if (localalt.wqV != null)
    {
      ab.d("MicroMsg.NetSceneGetPoiList", "poi result %d ", new Object[] { Integer.valueOf(localalt.wqV.size()) });
      if (localalt.wqV.size() > 0)
        ab.d("MicroMsg.NetSceneGetPoiList", "addr %s, province %s, street %s, city %s", new Object[] { ((bhu)localalt.wqV.get(0)).wKW, ((bhu)localalt.wqV.get(0)).guO, ((bhu)localalt.wqV.get(0)).wcm, ((bhu)localalt.wqV.get(0)).guP });
      paramq = localalt.wqV.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = new com.tencent.mm.plugin.location.ui.impl.f((bhu)paramq.next(), this.hlm);
        this.list.add(paramArrayOfByte);
      }
    }
    if (localalt.wpP != null)
      this.nJI = aa.a(localalt.wpP);
    if (localalt.wqW == 1);
    for (boolean bool = true; ; bool = false)
    {
      this.eTf = bool;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      if (this.fPK != null)
        this.fPK.run();
      AppMethodBeat.o(113317);
      return;
    }
  }

  public final int getType()
  {
    return 457;
  }

  public final boolean isFirst()
  {
    if (this.nJH == null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.h
 * JD-Core Version:    0.6.2
 */