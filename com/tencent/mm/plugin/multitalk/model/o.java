package com.tencent.mm.plugin.multitalk.model;

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
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bdo;
import com.tencent.mm.protocal.protobuf.bdp;
import com.tencent.mm.sdk.platformtools.ab;

public final class o extends m
  implements k
{
  byte[] cQr;
  private final b ehh;
  private f ehi;
  int lqx;
  int lqy;

  public o(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(54085);
    this.lqx = paramInt1;
    this.lqy = paramInt2;
    b.a locala = new b.a();
    locala.fsJ = new bdo();
    locala.fsK = new bdp();
    String str;
    switch (paramInt2)
    {
    case 1920:
    case 1921:
    case 1922:
    case 1923:
    case 1924:
    case 1925:
    case 1926:
    case 1930:
    case 1934:
    case 1936:
    default:
      str = "";
    case 1918:
    case 1919:
    case 1927:
    case 1928:
    case 1929:
    case 1931:
    case 1932:
    case 1933:
    case 1935:
    case 1937:
    case 1938:
    case 1939:
    }
    while (true)
    {
      ab.i("MicroMsg.MT.NetSceneMultiTalk", "netSceneMultiTalk cmdid %d cgiName %s", new Object[] { Integer.valueOf(paramInt2), str });
      locala.uri = str;
      locala.fsI = this.lqy;
      locala.fsL = 0;
      locala.fsM = 0;
      this.ehh = locala.acD();
      ((bdo)this.ehh.fsG.fsP).vJd = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte);
      AppMethodBeat.o(54085);
      return;
      str = "/cgi-bin/qcwxmultitalk-bin/createtalkroom";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/entertalkroom";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/exittalkroom";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/cancelcreatetalkroom";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/rejectentertalkroom";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/addmembers";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/hellotalkroom";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/miscinfo";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/voiceackreq";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/oiceredirectreq";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/getgroupinfobatch";
      continue;
      str = "/cgi-bin/qcwxmultitalk-bin/memberwhisper";
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(54086);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(54086);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(54087);
    ab.d("MicroMsg.MT.NetSceneMultiTalk", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " " + this.lqy);
    this.cQr = aa.a(((bdp)((b)paramq).fsH.fsP).vJd);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(54087);
  }

  public final int getType()
  {
    return this.lqy;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.o
 * JD-Core Version:    0.6.2
 */