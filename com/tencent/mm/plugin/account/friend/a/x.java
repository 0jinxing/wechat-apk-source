package com.tencent.mm.plugin.account.friend.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.tt;
import com.tencent.mm.model.bx;
import com.tencent.mm.model.r;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.jo;
import com.tencent.mm.protocal.protobuf.jp;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.y;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.Set;

public final class x extends m
  implements k
{
  private String cCU;
  private String cCW;
  public final com.tencent.mm.ai.b ehh;
  private f ehi;
  private int ftx;

  public x(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3)
  {
    AppMethodBeat.i(108429);
    this.ehi = null;
    this.ftx = 2;
    this.cCU = null;
    this.cCW = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new jo();
    ((b.a)localObject).fsK = new jp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindopmobile";
    ((b.a)localObject).fsI = 132;
    ((b.a)localObject).fsL = 45;
    ((b.a)localObject).fsM = 1000000045;
    this.ehh = ((b.a)localObject).acD();
    localObject = (jo)this.ehh.fsG.fsP;
    ((jo)localObject).vIJ = paramInt1;
    ((jo)localObject).vLu = paramInt2;
    ((jo)localObject).vLv = paramString3;
    if ((bo.isNullOrNil(this.cCU)) && (bo.isNullOrNil(this.cCW)))
    {
      if (com.tencent.mm.sdk.platformtools.g.xyg)
      {
        paramString3 = ah.getContext().getString(2131302677);
        ((jo)localObject).vLx = paramString3;
        ((jo)localObject).vLy = d.DEVICE_NAME;
      }
    }
    else
    {
      if ((paramString1 == null) || (paramString1.length() <= 0) || ((paramInt1 != 1) && (paramInt1 != 4) && (paramInt1 != 18)))
        break label304;
      com.tencent.mm.kernel.g.RP().Ry().set(4097, paramString1);
    }
    while (true)
    {
      ab.d("MicroMsg.NetSceneBindOpMobile", "Get mobile:" + paramString1 + " opcode:" + paramInt1 + " verifyCode:" + paramString2);
      ((jo)localObject).vLs = paramString1;
      ((jo)localObject).vLt = paramString2;
      ((jo)localObject).luQ = aa.dor();
      AppMethodBeat.o(108429);
      return;
      paramString3 = ah.getContext().getString(2131302676);
      break;
      label304: if ((paramInt1 == 2) || (paramInt1 == 19))
        paramString1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(4097, null);
      else if (paramInt1 == 3)
        paramString1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(6, null);
    }
  }

  public x(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    this(paramString1, paramInt, paramString2, 0, paramString3);
    AppMethodBeat.i(108428);
    this.cCU = paramString4;
    this.cCW = paramString5;
    paramString1 = (jo)this.ehh.fsG.fsP;
    paramString1.vLx = paramString4;
    paramString1.vLy = paramString5;
    AppMethodBeat.o(108428);
  }

  public final int Ah()
  {
    return ((jo)this.ehh.fsG.fsP).vIJ;
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(108430);
    this.ehi = paramf;
    paramf = (jo)this.ehh.fsG.fsP;
    int i;
    if ((paramf.vLs == null) || (paramf.vLs.length() <= 0))
    {
      ab.e("MicroMsg.NetSceneBindOpMobile", "doScene getMobile Error: " + paramf.vLs);
      AppMethodBeat.o(108430);
      i = -1;
    }
    while (true)
    {
      return i;
      if (((paramf.vIJ == 2) || (paramf.vIJ == 19)) && ((paramf.vLt == null) || (paramf.vLt.length() <= 0)))
      {
        ab.e("MicroMsg.NetSceneBindOpMobile", "doScene getVerifyCode Error: " + paramf.vLs);
        AppMethodBeat.o(108430);
        i = -1;
      }
      else
      {
        i = a(parame, this.ehh, this);
        AppMethodBeat.o(108430);
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108431);
    paramq = (jo)this.ehh.fsG.fsP;
    Object localObject = (jp)this.ehh.fsH.fsP;
    boolean bool;
    if (localObject != null)
    {
      paramInt1 = ((jp)localObject).vHW;
      ab.i("MicroMsg.NetSceneBindOpMobile", "summerauth mmtls bindop:%s", new Object[] { Integer.valueOf(paramInt1) });
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().eJH.set(47, Integer.valueOf(paramInt1));
      paramArrayOfByte = com.tencent.mm.kernel.g.RO().eJo.ftA;
      if (paramArrayOfByte != null)
      {
        if ((paramInt1 & 0x1) == 0)
        {
          bool = true;
          paramArrayOfByte.cI(bool);
        }
      }
      else
      {
        label117: if ((paramInt2 == 0) && (paramInt3 == 0))
          break label298;
        ab.e("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
        if ((paramInt2 != 4) || (paramInt3 != -240))
          break label276;
        ab.i("MicroMsg.NetSceneBindOpMobile", "summerauth bindop MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", new Object[] { Integer.valueOf(this.ftx) });
        this.ftx -= 1;
        if (this.ftx > 0)
          break label255;
        this.ehi.onSceneEnd(3, -1, "", this);
        AppMethodBeat.o(108431);
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      ab.i("MicroMsg.NetSceneBindOpMobile", "summerauth mmtls bindop not set as ret:%s", new Object[] { localObject });
      break label117;
      label255: a(this.ftf, this.ehi);
      AppMethodBeat.o(108431);
      continue;
      label276: this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(108431);
    }
    label298: if (localObject != null)
      ab.d("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " sms:" + ((jp)localObject).vLH + "safedevice status = " + ((jp)localObject).vCl);
    if ((paramq.vIJ == 2) || (paramq.vIJ == 4) || (paramq.vIJ == 11) || (paramq.vIJ == 19))
    {
      com.tencent.mm.kernel.g.RP().Ry().set(4097, "");
      localObject = (String)com.tencent.mm.kernel.g.RP().Ry().get(6, "");
      com.tencent.mm.kernel.g.RP().Ry().set(6, paramq.vLs);
      if (!bo.isNullOrNil((String)localObject))
      {
        if (com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVa, "").equals(localObject))
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVa, r.Yz());
        Iterator localIterator = bx.fnB.aat().iterator();
        while (localIterator.hasNext())
        {
          paramArrayOfByte = (String)localIterator.next();
          if (((String)localObject).equals(bx.fnB.getString(paramArrayOfByte, "login_user_name")))
            bx.fnB.n(paramArrayOfByte, "login_user_name", paramArrayOfByte);
        }
      }
      if ((bo.isNullOrNil(this.cCU)) || (bo.isNullOrNil(this.cCW)))
        l.apP();
      if (paramq.vIJ == 19)
        com.tencent.mm.kernel.g.RP().Ry().set(12322, null);
      ab.d("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  mobile binded");
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(108431);
      break;
      if (paramq.vIJ == 3)
      {
        com.tencent.mm.kernel.g.RP().Ry().set(4097, "");
        com.tencent.mm.kernel.g.RP().Ry().set(6, "");
        com.tencent.mm.kernel.g.RP().Ry().set(12322, null);
        com.tencent.mm.kernel.g.RP().Ry().set(64, Integer.valueOf(((jp)localObject).vCl));
        paramq = new tt();
        paramq.cPS.cPT = false;
        paramq.cPS.cPU = true;
        a.xxA.m(paramq);
        l.apY();
        l.apZ();
        ab.d("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  mobile unbinded");
      }
    }
  }

  public final String agg()
  {
    return ((jp)this.ehh.fsH.fsP).cxb;
  }

  public final int getType()
  {
    return 132;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.x
 * JD-Core Version:    0.6.2
 */