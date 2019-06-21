package com.tencent.mm.plugin.nearlife.b;

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
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.akh;
import com.tencent.mm.protocal.protobuf.aki;
import com.tencent.mm.protocal.protobuf.axw;
import com.tencent.mm.protocal.protobuf.axx;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public final class c extends m
  implements k
{
  public static Vector<String> oRg;
  public int czE;
  private final b ehh;
  private f ehi;
  public String hlm;
  public int nJK;
  public String oRh;
  public String oRi;
  public List<a> oRj;
  public boolean oRk;

  static
  {
    AppMethodBeat.i(22934);
    oRg = new Vector();
    AppMethodBeat.o(22934);
  }

  public c(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, String paramString1, String paramString2, SKBuiltinBuffer_t paramSKBuiltinBuffer_t, String paramString3, int paramInt5, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(22930);
    this.czE = 0;
    this.oRh = "";
    this.oRi = "";
    this.hlm = "";
    this.oRh = paramString3;
    if ((paramInt1 != 0) && (paramInt1 != 1))
      ab.e("MicroMsg.NetSceneGetLbsLifeList", "OpCode Error :".concat(String.valueOf(paramInt1)));
    this.czE = paramInt1;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new akh();
    ((b.a)localObject).fsK = new aki();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getlbslifelist";
    ((b.a)localObject).fsI = 603;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (akh)this.ehh.fsG.fsP;
    axx localaxx = new axx();
    localaxx.wfI = paramString2;
    localaxx.wfJ = paramInt4;
    localaxx.vRq = paramFloat2;
    localaxx.vRp = paramFloat1;
    localaxx.wfH = paramString1;
    localaxx.wfG = paramInt3;
    ((akh)localObject).wcn = localaxx;
    ((akh)localObject).wkD = paramString3;
    ((akh)localObject).Scene = paramInt2;
    ((akh)localObject).wpQ = paramInt5;
    if (paramSKBuiltinBuffer_t == null)
    {
      ((akh)localObject).wpP = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
      ((akh)localObject).vIJ = paramInt1;
      if (!paramBoolean2)
        break label427;
    }
    label427: for (int i = 1; ; i = 0)
    {
      ((akh)localObject).wpR = i;
      this.oRk = paramBoolean1;
      ab.d("MicroMsg.NetSceneGetLbsLifeList", "Req: opcode:" + paramInt1 + " lon:" + paramFloat1 + " lat:" + paramFloat2 + " pre:" + paramInt3 + " gpsSource:" + paramInt4 + " mac" + paramString1 + " cell:" + paramString2 + " scene: " + paramInt2 + " entryTime: " + paramInt5);
      ab.d("MicroMsg.NetSceneGetLbsLifeList", "isLoadMore: %s, buf: %s", new Object[] { Boolean.valueOf(paramBoolean1), Integer.valueOf(((akh)localObject).wpP.getILen()) });
      AppMethodBeat.o(22930);
      return;
      ((akh)localObject).wpP = paramSKBuiltinBuffer_t;
      break;
    }
  }

  public static boolean Ab(int paramInt)
  {
    AppMethodBeat.i(22927);
    String str = String.valueOf(paramInt);
    boolean bool;
    if (oRg.contains(str))
    {
      bool = false;
      AppMethodBeat.o(22927);
    }
    while (true)
    {
      return bool;
      oRg.add(str);
      bool = true;
      AppMethodBeat.o(22927);
    }
  }

  public static boolean Ac(int paramInt)
  {
    AppMethodBeat.i(22928);
    oRg.remove(String.valueOf(paramInt));
    AppMethodBeat.o(22928);
    return true;
  }

  public static void clear()
  {
    AppMethodBeat.i(22929);
    oRg.clear();
    AppMethodBeat.o(22929);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(22931);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(22931);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(22932);
    ab.d("MicroMsg.NetSceneGetLbsLifeList", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (aki)((b)paramq).fsH.fsP;
    this.hlm = paramArrayOfByte.vQg;
    this.nJK = paramArrayOfByte.wpZ;
    ab.d("MicroMsg.NetSceneGetLbsLifeList", "resp " + paramArrayOfByte.wpW + "searchId " + this.hlm);
    if ((paramInt3 == 0) || (paramInt3 == 101))
    {
      paramInt1 = 1;
      if ((paramInt2 == 0) || (paramInt1 != 0))
        break label157;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(22932);
    }
    while (true)
    {
      return;
      paramInt1 = 0;
      break;
      label157: ab.d("MicroMsg.NetSceneGetLbsLifeList", "continueFlag %d lifeCount %d linkCount %d %s", new Object[] { Integer.valueOf(paramArrayOfByte.vQe), Integer.valueOf(paramArrayOfByte.wpW), Integer.valueOf(paramArrayOfByte.wpU), paramArrayOfByte.wpY });
      this.oRi = bo.bc(paramArrayOfByte.wpY, "");
      this.oRj = new ArrayList();
      paramq = paramArrayOfByte.wpX.iterator();
      Object localObject;
      while (paramq.hasNext())
      {
        localObject = (axw)paramq.next();
        localObject = new a(paramArrayOfByte.vQg, (axw)localObject);
        this.oRj.add(localObject);
      }
      if (paramArrayOfByte.wpW > 0)
      {
        paramArrayOfByte = (axw)paramArrayOfByte.wpX.get(0);
        paramq = new StringBuffer();
        paramq.append(" Bid " + paramArrayOfByte.oQU);
        paramq.append(" title " + paramArrayOfByte.Title);
        paramq.append(" link " + paramArrayOfByte.oRb);
        paramq.append(" price " + paramArrayOfByte.oQV);
        paramq.append(" rate " + paramArrayOfByte.oRa);
        paramq.append(" type " + paramArrayOfByte.jCt);
        paramq.append(" desc : ");
        localObject = paramArrayOfByte.oQZ.iterator();
        while (((Iterator)localObject).hasNext())
        {
          paramArrayOfByte = (bts)((Iterator)localObject).next();
          paramq.append(paramArrayOfByte.wVI + "-");
        }
        ab.d("MicroMsg.NetSceneGetLbsLifeList", "resp one %s ", new Object[] { paramq.toString() });
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(22932);
    }
  }

  public final SKBuiltinBuffer_t bVh()
  {
    AppMethodBeat.i(22933);
    SKBuiltinBuffer_t localSKBuiltinBuffer_t = ((aki)this.ehh.fsH.fsP).wpP;
    if (localSKBuiltinBuffer_t == null)
    {
      localSKBuiltinBuffer_t = new SKBuiltinBuffer_t().setBuffer(new byte[0]);
      AppMethodBeat.o(22933);
    }
    while (true)
    {
      return localSKBuiltinBuffer_t;
      AppMethodBeat.o(22933);
    }
  }

  public final int bVi()
  {
    return ((aki)this.ehh.fsH.fsP).vQe;
  }

  public final int getType()
  {
    return 603;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearlife.b.c
 * JD-Core Version:    0.6.2
 */