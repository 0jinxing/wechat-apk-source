package com.tencent.mm.plugin.sns.model;

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
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.protobuf.cbz;
import com.tencent.mm.protocal.protobuf.cce;
import com.tencent.mm.protocal.protobuf.ccf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class x extends m
  implements k
{
  private int czE;
  private b ehh;
  public f ehi;
  private long qJQ;

  public x(long paramLong, String paramString)
  {
    AppMethodBeat.i(36333);
    this.qJQ = 0L;
    ab.d("MicroMsg.NetSceneSnsTagOption", "opcode 3 snsTagId " + paramLong + " tagName " + paramString);
    this.qJQ = paramLong;
    this.czE = 3;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cce();
    ((b.a)localObject).fsK = new ccf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstagoption";
    ((b.a)localObject).fsI = 290;
    ((b.a)localObject).fsL = 114;
    ((b.a)localObject).fsM = 1000000114;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cce)this.ehh.fsG.fsP;
    ((cce)localObject).OpCode = 3;
    ((cce)localObject).xbt = paramLong;
    ((cce)localObject).ncF = paramString;
    AppMethodBeat.o(36333);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(36334);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36334);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36335);
    ab.d("MicroMsg.NetSceneSnsTagOption", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36335);
      return;
    }
    paramArrayOfByte = ((ccf)((b)paramq).fsH.fsP).xbv;
    ab.d("MicroMsg.NetSceneSnsTagOption", paramArrayOfByte.toString());
    switch (this.czE)
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36335);
      break;
      paramq = af.cnL().kF(paramArrayOfByte.xbt);
      paramq.field_tagId = paramArrayOfByte.xbt;
      paramq.field_tagName = bo.bc(paramArrayOfByte.ncF, "");
      paramq.field_count = paramArrayOfByte.jBv;
      paramq.jdMethod_do(paramArrayOfByte.jBw);
      af.cnL().a(paramq);
      continue;
      ab.d("MicroMsg.NetSceneSnsTagOption", "MM_SNS_TAG_DEL ".concat(String.valueOf(af.cnL().kG(this.qJQ))));
    }
  }

  public final int getType()
  {
    return 290;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.x
 * JD-Core Version:    0.6.2
 */