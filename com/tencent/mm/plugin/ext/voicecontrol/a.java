package com.tencent.mm.plugin.ext.voicecontrol;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.fb;
import com.tencent.mm.protocal.protobuf.fc;
import com.tencent.mm.protocal.protobuf.fd;
import com.tencent.mm.protocal.protobuf.fh;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  public int JJ;
  public String appId;
  public int coc;
  public int czE;
  com.tencent.mm.ai.b ehh;
  private f ehi;
  public int frO;
  public fh lRA;
  public fb lRB;
  int lRC;
  long lRD;
  public int lRx;
  public com.tencent.mm.bt.b lRy;
  public String lRz;

  public a(int paramInt1, String paramString1, int paramInt2, String paramString2, fh paramfh)
  {
    AppMethodBeat.i(20457);
    this.lRC = 5000;
    this.lRD = 0L;
    this.czE = 1;
    this.appId = paramString1;
    this.lRx = paramInt1;
    this.JJ = 1;
    this.frO = paramInt2;
    this.lRA = paramfh;
    this.lRB = null;
    this.lRz = paramString2;
    if (paramfh != null);
    while (true)
    {
      ab.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] new NetSceneAppVoiceControl, opCode=%s, appId=%s, voiceId=%s, totalLen=%s, controlType=%s, %s, %s", new Object[] { Integer.valueOf(1), paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(1), Boolean.valueOf(bool), Boolean.FALSE });
      AppMethodBeat.o(20457);
      return;
      bool = false;
    }
  }

  public a(int paramInt, String paramString, fb paramfb, long paramLong)
  {
    AppMethodBeat.i(20458);
    this.lRC = 5000;
    this.lRD = 0L;
    this.czE = 2;
    this.appId = paramString;
    this.lRx = paramInt;
    this.JJ = 1;
    this.lRA = null;
    this.lRB = paramfb;
    this.lRD = paramLong;
    ab.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] new NetSceneAppVoiceControl, opCode=%s, appId=%s, voiceId=%s, controlType=%s, %s, %s", new Object[] { Integer.valueOf(2), paramString, Integer.valueOf(paramInt), Integer.valueOf(1), Boolean.FALSE, Boolean.TRUE });
    AppMethodBeat.o(20458);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(20460);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsI = 985;
    paramf.uri = "/cgi-bin/micromsg-bin/appvoicecontrol";
    paramf.fsJ = new fc();
    paramf.fsK = new fd();
    paramf.fsL = 0;
    paramf.fsM = 0;
    this.ehh = paramf.acD();
    paramf = (fc)this.ehh.fsG.fsP;
    paramf.OpCode = this.czE;
    paramf.fKh = this.appId;
    paramf.vHa = this.lRx;
    paramf.vHb = this.JJ;
    paramf.vHc = this.lRA;
    paramf.vHd = this.lRB;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(20460);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(20459);
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramq != null))
    {
      ab.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] onGYNetEnd netId %d , errType %d, errCode %d, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
      if (this.ehi == null)
        break label124;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(20459);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] onGYNetEnd netId %d , errType %d, errCode %d, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
      break;
      label124: ab.e("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] callback null");
      AppMethodBeat.o(20459);
    }
  }

  public final int getType()
  {
    return 985;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.voicecontrol.a
 * JD-Core Version:    0.6.2
 */