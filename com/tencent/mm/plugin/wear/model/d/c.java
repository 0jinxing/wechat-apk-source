package com.tencent.mm.plugin.wear.model.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.clc;
import com.tencent.mm.protocal.protobuf.cld;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.storage.z;
import java.util.UUID;

public final class c extends m
  implements k
{
  private String clientId;
  public int ctE;
  private com.tencent.mm.ai.b ehh;
  f ehi;
  public boolean fZa;
  String filename;
  ap frk;
  private boolean gaK;
  private int gaO;
  int tYr;
  public String tYs;
  public boolean tYt;
  public String talker;

  public c(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(26379);
    this.filename = null;
    this.gaO = 0;
    this.fZa = false;
    this.tYr = 0;
    this.gaK = false;
    this.frk = new ap(new c.1(this), true);
    this.ctE = paramInt;
    this.talker = paramString2;
    this.filename = paramString1;
    this.gaO = 0;
    this.clientId = UUID.randomUUID().toString();
    AppMethodBeat.o(26379);
  }

  private static String d(SKBuiltinBuffer_t paramSKBuiltinBuffer_t)
  {
    AppMethodBeat.i(26383);
    if ((paramSKBuiltinBuffer_t != null) && (paramSKBuiltinBuffer_t.getBuffer() != null))
    {
      paramSKBuiltinBuffer_t = paramSKBuiltinBuffer_t.getBuffer().dlY();
      AppMethodBeat.o(26383);
    }
    while (true)
    {
      return paramSKBuiltinBuffer_t;
      paramSKBuiltinBuffer_t = null;
      AppMethodBeat.o(26383);
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    int i = 0;
    AppMethodBeat.i(26380);
    this.ehi = paramf;
    int j = com.tencent.mm.a.e.cs(this.filename);
    int k;
    if (j <= 0)
    {
      ab.e("MicroMsg.Wear.NetSceneVoiceToText", "doScene file length is zero: %s", new Object[] { this.filename });
      AppMethodBeat.o(26380);
      k = -1;
    }
    while (true)
    {
      return k;
      int m = j - this.tYr;
      if (m > 3960)
        k = 3960;
      while (true)
      {
        ab.i("MicroMsg.Wear.NetSceneVoiceToText", "fileLength: %d | readOffset: %d | isRecordFinish=%b | endFlag=%b | filename=%s", new Object[] { Integer.valueOf(j), Integer.valueOf(this.tYr), Boolean.valueOf(this.fZa), Boolean.valueOf(this.gaK), this.filename });
        paramf = com.tencent.mm.a.e.e(this.filename, this.tYr, k);
        if (paramf != null)
          break label302;
        if (!this.gaK)
          break label251;
        AppMethodBeat.o(26380);
        k = i;
        break;
        if ((m < 3300) && (!this.fZa))
        {
          ab.e("MicroMsg.Wear.NetSceneVoiceToText", "try to send a buf less than MIN_SEND_BYTE_PER_PACK: canReadLen=%d | isRecordFinished=%b", new Object[] { Integer.valueOf(m), Boolean.valueOf(this.fZa) });
          AppMethodBeat.o(26380);
          k = -1;
          break;
        }
        k = m;
        if (this.fZa)
        {
          this.gaK = true;
          k = m;
        }
      }
      label251: ab.e("MicroMsg.Wear.NetSceneVoiceToText", "Can not read file: canReadLen=%d | isRecordFinish=%b | endFlag=%b", new Object[] { Integer.valueOf(k), Boolean.valueOf(this.fZa), Boolean.valueOf(this.gaK) });
      AppMethodBeat.o(26380);
      k = -1;
    }
    label302: Object localObject = new b.a();
    ((b.a)localObject).fsJ = new clc();
    ((b.a)localObject).fsK = new cld();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadinputvoice";
    ((b.a)localObject).fsI = 349;
    ((b.a)localObject).fsL = 158;
    ((b.a)localObject).fsM = 1000000158;
    this.ehh = ((b.a)localObject).acD();
    localObject = (clc)this.ehh.fsG.fsP;
    aw.ZK();
    ((clc)localObject).jBB = ((String)com.tencent.mm.model.c.Ry().get(2, ""));
    ((clc)localObject).ptz = new SKBuiltinBuffer_t().setBuffer(paramf);
    ((clc)localObject).vOq = this.tYr;
    ((clc)localObject).xiM = this.clientId;
    if (this.gaK)
    {
      k = 1;
      label454: ((clc)localObject).fJT = k;
      ((clc)localObject).xiN = 0;
      ((clc)localObject).vHr = 0;
      ((clc)localObject).xiO = this.gaO;
      ((clc)localObject).vHo = 0;
      k = a(parame, this.ehh, this);
      i = ((clc)localObject).vOq;
      this.tYr = (((clc)localObject).ptz.getILen() + i);
      if (!this.fZa)
        break label590;
    }
    label590: for (long l = 0L; ; l = 500L)
    {
      ab.i("MicroMsg.Wear.NetSceneVoiceToText", "doScene filename=%s | delay=%d | ret=%d", new Object[] { this.filename, Long.valueOf(l), Integer.valueOf(k) });
      this.frk.ae(l, l);
      AppMethodBeat.o(26380);
      break;
      k = 0;
      break label454;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26382);
    ab.i("MicroMsg.Wear.NetSceneVoiceToText", "onGYNetEnd errorType=%d | errorCode=%d |filename=%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this.filename });
    paramq = (cld)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(26382);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Wear.NetSceneVoiceToText", "resp EndFlag=%d | Text=%s", new Object[] { Integer.valueOf(paramq.fJT), d(paramq.xiP) });
      if (paramq.fJT == 1)
      {
        this.tYt = true;
        paramq = d(paramq.xiP);
        if (paramq != null)
          this.tYs = paramq;
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(26382);
      }
      else
      {
        AppMethodBeat.o(26382);
      }
    }
  }

  public final void a(m.a parama)
  {
    AppMethodBeat.i(26381);
    this.ehi.onSceneEnd(3, 0, "securityCheckError", this);
    AppMethodBeat.o(26381);
  }

  public final int acn()
  {
    return 20;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 349;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.d.c
 * JD-Core Version:    0.6.2
 */