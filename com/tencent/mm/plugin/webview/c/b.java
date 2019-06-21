package com.tencent.mm.plugin.webview.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.buy;
import com.tencent.mm.protocal.protobuf.buz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends m
  implements k
{
  private f eIc;
  private final com.tencent.mm.ai.b ehh;
  private long kVE;
  private byte[] kWI;
  private String kWK;
  private int kWt;
  int ueW;
  boolean ueX;

  public b(int paramInt1, String paramString, byte[] paramArrayOfByte, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(5658);
    this.kWI = null;
    this.ueW = -1;
    this.ueX = true;
    this.kVE = 0L;
    b.a locala = new b.a();
    locala.fsJ = new buy();
    locala.fsK = new buz();
    locala.uri = "/cgi-bin/micromsg-bin/mmsearchemotion";
    locala.fsI = 234;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.kWt = paramInt1;
    this.kWK = paramString;
    this.kWI = paramArrayOfByte;
    this.ueW = paramInt2;
    this.kVE = paramLong;
    AppMethodBeat.o(5658);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(5659);
    this.eIc = paramf;
    buy localbuy = (buy)this.ehh.fsG.fsP;
    if (!bo.cb(this.kWI))
    {
      localbuy.wok = aa.ad(this.kWI);
      this.ueX = false;
      localbuy.won = this.kVE;
      if (localbuy.wok != null)
        break label131;
    }
    label131: for (paramf = "Buf is NULL"; ; paramf = localbuy.wok.toString())
    {
      ab.d("MicroMsg.emoji.NetSceneSearchEmotion", paramf);
      localbuy.ReqType = this.kWt;
      localbuy.wol = this.kWK;
      int i = a(parame, this.ehh, this);
      AppMethodBeat.o(5659);
      return i;
      localbuy.wok = new SKBuiltinBuffer_t();
      this.ueX = true;
      break;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(5660);
    ab.i("MicroMsg.emoji.NetSceneSearchEmotion", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(5660);
  }

  public final buz cWk()
  {
    if (this.ehh == null);
    for (buz localbuz = null; ; localbuz = (buz)this.ehh.fsH.fsP)
      return localbuz;
  }

  public final int getType()
  {
    return 234;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.c.b
 * JD-Core Version:    0.6.2
 */