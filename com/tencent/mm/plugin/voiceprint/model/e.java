package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.bb.a;
import com.tencent.mm.model.bb.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.aqg;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class e extends m
  implements k
{
  f ehi;
  String elr;
  private final q ftU;
  private int ftx;

  public e(String paramString)
  {
    AppMethodBeat.i(26083);
    this.elr = "";
    this.ftx = 2;
    this.ftU = new b();
    bb.a locala = (bb.a)this.ftU.acF();
    locala.flY.jBB = paramString;
    locala.flY.wue = 1;
    ab.i("MicroMsg.NetSceneGetVoiceprintTicketRsa", "sceneType %d %s", new Object[] { Integer.valueOf(1), paramString });
    AppMethodBeat.o(26083);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(26084);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(26084);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26085);
    paramArrayOfByte = (bb.b)paramq.ZS();
    this.elr = paramArrayOfByte.flZ.wuf;
    ab.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " mTicket: " + this.elr);
    if ((paramInt2 == 4) && (paramInt3 == -301))
    {
      ax.a(true, paramArrayOfByte.flZ.vLL, paramArrayOfByte.flZ.vLM, paramArrayOfByte.flZ.vLK);
      this.ftx -= 1;
      if (this.ftx <= 0)
      {
        ab.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "reach redirect limit, invoke callback");
        this.ehi.onSceneEnd(3, -1, "", this);
        AppMethodBeat.o(26085);
      }
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "redirect IDC");
      a(this.ftf, this.ehi);
      AppMethodBeat.o(26085);
      continue;
      if ((paramInt2 == 4) && (paramInt3 == -102))
      {
        paramInt1 = paramq.acF().vyj.ver;
        ab.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
        aw.RS().aa(new e.1(this, paramInt1));
        AppMethodBeat.o(26085);
      }
      else if ((paramInt2 != 0) && (paramInt3 != 0))
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(26085);
      }
      else
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(26085);
      }
    }
  }

  public final void a(m.a parama)
  {
  }

  public final int acn()
  {
    return 3;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 618;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.e
 * JD-Core Version:    0.6.2
 */