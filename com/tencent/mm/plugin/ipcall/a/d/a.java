package com.tencent.mm.plugin.ipcall.a.d;

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
import com.tencent.mm.protocal.protobuf.blu;
import com.tencent.mm.protocal.protobuf.blv;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  private b ehh;
  private f ehi;
  public blu nyf;
  private blv nyg;

  public a(int paramInt1, long paramLong1, String paramString1, String paramString2, int paramInt2, long paramLong2)
  {
    AppMethodBeat.i(21836);
    this.ehh = null;
    this.nyf = null;
    this.nyg = null;
    this.ehi = null;
    b.a locala = new b.a();
    locala.fsJ = new blu();
    locala.fsK = new blv();
    locala.fsI = 843;
    locala.uri = "/cgi-bin/micromsg-bin/pstncancelinvite";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    long l = System.currentTimeMillis();
    this.nyf = ((blu)this.ehh.fsG.fsP);
    this.nyf.wem = paramInt1;
    this.nyf.wen = paramLong1;
    this.nyf.ndF = paramString1;
    this.nyf.wOP = l;
    this.nyf.wOQ = paramInt2;
    this.nyf.wOR = paramString2;
    this.nyf.wOS = paramLong2;
    ab.d("MicroMsg.NetSceneIPCallCancel", "roomId: %d, roomKey: %d, toUsername: %s, timestamp: %d, inviteId: %d, phoneNumber: %s, callseq: %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong1), paramString1, Long.valueOf(l), Integer.valueOf(paramInt2), paramString2, Long.valueOf(paramLong2) });
    AppMethodBeat.o(21836);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(21837);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21837);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21838);
    ab.i("MicroMsg.NetSceneIPCallCancel", "errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyg = ((blv)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(21838);
  }

  public final int getType()
  {
    return 843;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.a
 * JD-Core Version:    0.6.2
 */