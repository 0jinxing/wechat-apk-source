package com.tencent.mm.modelfriend;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ax;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.n.a;
import com.tencent.mm.protocal.n.b;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bzr;
import com.tencent.mm.protocal.protobuf.cfi;
import com.tencent.mm.protocal.protobuf.crs;
import com.tencent.mm.protocal.protobuf.jo;
import com.tencent.mm.protocal.protobuf.jp;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.y;
import java.util.Iterator;
import java.util.LinkedList;

public final class a extends m
  implements k
{
  public static a.a fBa;
  com.tencent.mm.ai.f ehi;
  public final q ftU;
  private int ftx;

  public a(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3)
  {
    AppMethodBeat.i(123400);
    this.ehi = null;
    this.ftx = 2;
    this.ftU = new a.b();
    n.a locala = (n.a)this.ftU.acF();
    locala.vyq.vIJ = paramInt1;
    ab.d("MicroMsg.NetSceneBindMobileForReg", "Get mobile:" + paramString1 + " opcode:" + paramInt1 + " verifyCode:" + paramString2);
    locala.vyq.vLs = paramString1;
    locala.vyq.vLt = paramString2;
    locala.vyq.vLu = paramInt2;
    locala.vyq.vLv = paramString3;
    locala.vyq.luQ = aa.dor();
    locala.vyq.vIj = com.tencent.mm.kernel.a.Rb();
    if ((bo.isNullOrNil(locala.vyq.vLx)) && (bo.isNullOrNil(locala.vyq.vLy)))
    {
      paramString2 = locala.vyq;
      if (fBa == null)
        break label223;
    }
    label223: for (paramString1 = fBa.agu(); ; paramString1 = "")
    {
      paramString2.vLx = paramString1;
      locala.vyq.vLy = d.DEVICE_NAME;
      AppMethodBeat.o(123400);
      return;
    }
  }

  public a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4)
  {
    this(paramString1, paramInt, paramString2, 0, paramString3);
    AppMethodBeat.i(123399);
    ((n.a)this.ftU.acF()).vyq.vHS = paramString4;
    AppMethodBeat.o(123399);
  }

  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this(paramString1, 11, paramString2, paramString3, paramString4);
    AppMethodBeat.i(123398);
    paramString1 = (n.a)this.ftU.acF();
    paramString1.vyq.vLx = paramString5;
    paramString1.vyq.vLy = paramString6;
    AppMethodBeat.o(123398);
  }

  public final int Ah()
  {
    AppMethodBeat.i(123403);
    int i = ((n.a)this.ftU.acF()).vyq.vIJ;
    AppMethodBeat.o(123403);
    return i;
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(123404);
    this.ehi = paramf;
    paramf = (n.a)this.ftU.acF();
    int i;
    if ((paramf.vyq.vLs == null) || (paramf.vyq.vLs.length() <= 0))
    {
      ab.e("MicroMsg.NetSceneBindMobileForReg", "doScene getMobile Error: " + paramf.vyq.vLs);
      AppMethodBeat.o(123404);
      i = -1;
    }
    while (true)
    {
      return i;
      if (((paramf.vyq.vIJ == 6) || (paramf.vyq.vIJ == 9)) && ((paramf.vyq.vLt == null) || (paramf.vyq.vLt.length() <= 0)))
      {
        ab.e("MicroMsg.NetSceneBindMobileForReg", "doScene getVerifyCode Error: " + paramf.vyq.vLs);
        AppMethodBeat.o(123404);
        i = -1;
      }
      else
      {
        i = a(parame, this.ftU, this);
        AppMethodBeat.o(123404);
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(123405);
    ab.i("MicroMsg.NetSceneBindMobileForReg", "dkidc onGYNetEnd  errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramArrayOfByte = (n.b)paramq.ZS();
    boolean bool;
    if ((paramArrayOfByte != null) && (paramArrayOfByte.vyr != null))
    {
      paramInt1 = paramArrayOfByte.vyr.vHW;
      ab.i("MicroMsg.NetSceneBindMobileForReg", "summerauth mmtls bindopreg:%s", new Object[] { Integer.valueOf(paramInt1) });
      g.RQ();
      g.RP().eJH.set(47, Integer.valueOf(paramInt1));
      com.tencent.mm.network.e locale = g.RO().eJo.ftA;
      if (locale != null)
      {
        if ((paramInt1 & 0x1) == 0)
        {
          bool = true;
          locale.cI(bool);
        }
      }
      else
      {
        label135: if ((paramInt2 != 4) || (paramInt3 != -301))
          break label259;
        ax.a(true, paramArrayOfByte.vyr.vLL, paramArrayOfByte.vyr.vLM, paramArrayOfByte.vyr.vLK);
        this.ftx -= 1;
        if (this.ftx > 0)
          break label238;
        this.ehi.onSceneEnd(3, -1, "", this);
        AppMethodBeat.o(123405);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      ab.i("MicroMsg.NetSceneBindMobileForReg", "summerauth mmtls bindopreg not set as ret:%s", new Object[] { paramArrayOfByte });
      break label135;
      label238: a(this.ftf, this.ehi);
      AppMethodBeat.o(123405);
      continue;
      label259: if ((paramInt2 == 4) && (paramInt3 == -240))
      {
        ab.i("MicroMsg.NetSceneBindMobileForReg", "summerauth bindopreg MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", new Object[] { Integer.valueOf(this.ftx) });
        this.ftx -= 1;
        if (this.ftx <= 0)
        {
          this.ehi.onSceneEnd(3, -1, "", this);
          AppMethodBeat.o(123405);
        }
        else
        {
          a(this.ftf, this.ehi);
          AppMethodBeat.o(123405);
        }
      }
      else if ((paramInt2 == 4) && (paramInt3 == -102))
      {
        paramInt1 = paramq.acF().vyj.ver;
        ab.d("MicroMsg.NetSceneBindMobileForReg", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
        g.RS().aa(new a.1(this, paramInt1));
        AppMethodBeat.o(123405);
      }
      else if ((paramInt2 == 4) && ((paramInt3 == -305) || (paramInt3 == -306)))
      {
        ab.i("MicroMsg.NetSceneBindMobileForReg", "summerauth bindmobilereg MM_ERR_CERT_SWITCH or MM_ERR_ECDHFAIL_ROLLBACK errCode:%d ver:%d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(com.tencent.mm.protocal.f.vxC) });
        a(this.ftf, this.ehi);
        AppMethodBeat.o(123405);
      }
      else if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        ab.e("MicroMsg.NetSceneBindMobileForReg", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(123405);
      }
      else
      {
        ax.a(false, paramArrayOfByte.vyr.vLL, paramArrayOfByte.vyr.vLM, paramArrayOfByte.vyr.vLK);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(123405);
      }
    }
  }

  public final void a(m.a parama)
  {
  }

  public final void a(crs paramcrs)
  {
    AppMethodBeat.i(123414);
    try
    {
      jo localjo = ((n.a)this.ftU.acF()).vyq;
      SKBuiltinBuffer_t localSKBuiltinBuffer_t = new com/tencent/mm/protocal/protobuf/SKBuiltinBuffer_t;
      localSKBuiltinBuffer_t.<init>();
      localjo.vLF = localSKBuiltinBuffer_t.setBuffer(paramcrs.toByteArray());
      AppMethodBeat.o(123414);
      return;
    }
    catch (Throwable paramcrs)
    {
      while (true)
        AppMethodBeat.o(123414);
    }
  }

  public final int acn()
  {
    return 3;
  }

  public final String agf()
  {
    AppMethodBeat.i(123406);
    String str = ((n.b)this.ftU.ZS()).vyr.vLJ;
    AppMethodBeat.o(123406);
    return str;
  }

  public final String agg()
  {
    AppMethodBeat.i(123408);
    String str = ((n.b)this.ftU.ZS()).vyr.cxb;
    AppMethodBeat.o(123408);
    return str;
  }

  public final String agh()
  {
    AppMethodBeat.i(123409);
    String str = ((n.b)this.ftU.ZS()).vyr.vHS;
    AppMethodBeat.o(123409);
    return str;
  }

  public final String agi()
  {
    AppMethodBeat.i(123410);
    String str = ((n.b)this.ftU.ZS()).vyr.vLQ;
    AppMethodBeat.o(123410);
    return str;
  }

  public final int agj()
  {
    AppMethodBeat.i(123411);
    int i = ((n.b)this.ftU.ZS()).vyr.vLC;
    AppMethodBeat.o(123411);
    return i;
  }

  public final String agk()
  {
    AppMethodBeat.i(123412);
    String str = ((n.b)this.ftU.ZS()).vyr.vLS;
    AppMethodBeat.o(123412);
    return str;
  }

  public final String agl()
  {
    AppMethodBeat.i(123413);
    String str = ((n.b)this.ftU.ZS()).vyr.vLT;
    AppMethodBeat.o(123413);
    return str;
  }

  public final int agm()
  {
    AppMethodBeat.i(123415);
    Object localObject = ((n.b)this.ftU.ZS()).vyr.vHR;
    cfi localcfi;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      localObject = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext())
          break;
        localcfi = (cfi)((Iterator)localObject).next();
      }
      while (localcfi.pXC != 6);
    }
    for (int i = bo.getInt(localcfi.xeN, 3); ; i = 3)
    {
      AppMethodBeat.o(123415);
      return i;
    }
  }

  public final int agn()
  {
    AppMethodBeat.i(123416);
    Object localObject = ((n.b)this.ftU.ZS()).vyr.vHR;
    cfi localcfi;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      localObject = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext())
          break;
        localcfi = (cfi)((Iterator)localObject).next();
      }
      while (localcfi.pXC != 4);
    }
    for (int i = bo.getInt(localcfi.xeN, 30); ; i = 30)
    {
      AppMethodBeat.o(123416);
      return i;
    }
  }

  public final int ago()
  {
    AppMethodBeat.i(123417);
    Object localObject = ((n.b)this.ftU.ZS()).vyr.vHR;
    cfi localcfi;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      localObject = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext())
          break;
        localcfi = (cfi)((Iterator)localObject).next();
      }
      while (localcfi.pXC != 5);
    }
    for (int i = bo.getInt(localcfi.xeN, 0); ; i = 0)
    {
      AppMethodBeat.o(123417);
      return i;
    }
  }

  public final boolean agp()
  {
    AppMethodBeat.i(123418);
    Object localObject = ((n.b)this.ftU.ZS()).vyr.vHR;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      Iterator localIterator = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localObject = (cfi)localIterator.next();
      }
      while (((cfi)localObject).pXC != 7);
    }
    for (int i = bo.getInt(((cfi)localObject).xeN, 0); ; i = 0)
    {
      boolean bool;
      if (i > 0)
      {
        bool = true;
        AppMethodBeat.o(123418);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(123418);
        bool = false;
      }
    }
  }

  public final boolean agq()
  {
    AppMethodBeat.i(123419);
    Object localObject = ((n.b)this.ftU.ZS()).vyr.vHR;
    cfi localcfi;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      localObject = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!((Iterator)localObject).hasNext())
          break;
        localcfi = (cfi)((Iterator)localObject).next();
      }
      while (localcfi.pXC != 10);
    }
    for (int i = bo.getInt(localcfi.xeN, 0); ; i = 0)
    {
      boolean bool;
      if (i > 0)
      {
        bool = true;
        AppMethodBeat.o(123419);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(123419);
        bool = false;
      }
    }
  }

  public final String agr()
  {
    AppMethodBeat.i(123420);
    Object localObject = ((n.b)this.ftU.ZS()).vyr.vHR;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      Iterator localIterator = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localObject = (cfi)localIterator.next();
      }
      while (((cfi)localObject).pXC != 14);
    }
    for (localObject = ((cfi)localObject).xeN; ; localObject = null)
    {
      AppMethodBeat.o(123420);
      return localObject;
    }
  }

  public final String ags()
  {
    AppMethodBeat.i(123421);
    Object localObject = ((n.b)this.ftU.ZS()).vyr.vHR;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      Iterator localIterator = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localObject = (cfi)localIterator.next();
      }
      while (((cfi)localObject).pXC != 15);
    }
    for (localObject = ((cfi)localObject).xeN; ; localObject = null)
    {
      AppMethodBeat.o(123421);
      return localObject;
    }
  }

  public final String agt()
  {
    AppMethodBeat.i(123422);
    String str = ((n.b)this.ftU.ZS()).vyr.vLD;
    AppMethodBeat.o(123422);
    return str;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 145;
  }

  public final String getUsername()
  {
    AppMethodBeat.i(123407);
    String str = ((n.b)this.ftU.ZS()).vyr.vHl;
    AppMethodBeat.o(123407);
    return str;
  }

  public final void lo(int paramInt)
  {
    AppMethodBeat.i(123401);
    ((n.a)this.ftU.acF()).vyq.vLA = paramInt;
    AppMethodBeat.o(123401);
  }

  public final void lp(int paramInt)
  {
    AppMethodBeat.i(123402);
    ((n.a)this.ftU.acF()).vyq.vLB = paramInt;
    AppMethodBeat.o(123402);
  }

  public final void rV(String paramString)
  {
    AppMethodBeat.i(123423);
    ((n.a)this.ftU.acF()).vyq.vLD = paramString;
    AppMethodBeat.o(123423);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.a
 * JD-Core Version:    0.6.2
 */