package com.tencent.mm.plugin.address.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bph;
import com.tencent.mm.protocal.protobuf.bpi;
import com.tencent.mm.protocal.protobuf.bpj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class d extends m
  implements k
{
  private b ehh;
  private f ehi;
  public int status;

  public d(String paramString1, String paramString2, p paramp)
  {
    AppMethodBeat.i(16731);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bph();
    ((b.a)localObject).fsK = new bpi();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rcptinfoimport";
    ((b.a)localObject).fsI = 582;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    StringBuilder localStringBuilder = new StringBuilder("a2key is ");
    if (!bo.isNullOrNil(paramString1))
    {
      bool2 = true;
      localStringBuilder = localStringBuilder.append(bool2).append(", newa2key is ");
      if (bo.isNullOrNil(paramString2))
        break label218;
    }
    label218: for (boolean bool2 = bool1; ; bool2 = false)
    {
      ab.d("MicroMsg.NetSceneRcptInfoImportYiXun", bool2);
      this.ehh = ((b.a)localObject).acD();
      localObject = (bph)this.ehh.fsG.fsP;
      ((bph)localObject).vHP = new SKBuiltinBuffer_t().setBuffer(bo.anf(paramString1));
      ((bph)localObject).wRL = new SKBuiltinBuffer_t().setBuffer(bo.anf(paramString2));
      ((bph)localObject).qq = paramp.intValue();
      AppMethodBeat.o(16731);
      return;
      bool2 = false;
      break;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16733);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16733);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16732);
    ab.d("MicroMsg.NetSceneRcptInfoImportYiXun", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bpi)((b)paramq).fsH.fsP;
      this.status = paramq.wRM;
      ab.d("MicroMsg.NetSceneRcptInfoImportYiXun", "status : " + this.status);
      if ((paramq.wRK.wRN != null) && (this.status == 0))
      {
        ab.d("MicroMsg.NetSceneRcptInfoImportYiXun", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.wRK.wRN.size());
        a.arQ();
        a.arS().s(paramq.wRK.wRN);
        a.arQ();
        a.arS().arU();
      }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16732);
  }

  public final int getType()
  {
    return 582;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.model.d
 * JD-Core Version:    0.6.2
 */