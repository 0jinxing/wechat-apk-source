package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cpg;
import com.tencent.mm.protocal.protobuf.cqj;
import com.tencent.mm.protocal.protobuf.cqk;
import com.tencent.mm.sdk.platformtools.ab;

public final class m extends n<cqj, cqk>
{
  public m(int paramInt1, cpg paramcpg, byte[] paramArrayOfByte, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(4736);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cqj();
    ((b.a)localObject).fsK = new cqk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipsync";
    ((b.a)localObject).fsI = 174;
    ((b.a)localObject).fsL = 62;
    ((b.a)localObject).fsM = 1000000062;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cqj)this.ehh.fsG.fsP;
    ((cqj)localObject).wem = paramInt1;
    ((cqj)localObject).xoq = paramcpg;
    ((cqj)localObject).wen = paramLong;
    ((cqj)localObject).wPm = r.Yz();
    ((cqj)localObject).vTN = paramInt2;
    ((cqj)localObject).vTO = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte);
    ((cqj)localObject).xlQ = System.currentTimeMillis();
    ab.i("MicroMsg.NetSceneVoipSync", "sync timestamp: " + ((cqj)localObject).xlQ);
    AppMethodBeat.o(4736);
  }

  public final f cKt()
  {
    AppMethodBeat.i(4737);
    m.1 local1 = new m.1(this);
    AppMethodBeat.o(4737);
    return local1;
  }

  public final int cKv()
  {
    return ((cqj)this.ehh.fsG.fsP).vTN;
  }

  public final int getType()
  {
    return 174;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.m
 * JD-Core Version:    0.6.2
 */