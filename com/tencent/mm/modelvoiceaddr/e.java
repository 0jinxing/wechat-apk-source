package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.clc;
import com.tencent.mm.protocal.protobuf.cld;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.List;

public final class e extends a
  implements k
{
  private com.tencent.mm.ai.b ehh;
  f ehi;
  int fQx;
  boolean fZa;
  String filename;
  ap frk;
  private long gaJ;
  private boolean gaK;
  private String[] gaM;
  private int gaO;
  int retCode;

  public e(String paramString, int paramInt)
  {
    AppMethodBeat.i(116689);
    this.retCode = 0;
    this.fZa = false;
    this.fQx = 0;
    this.filename = null;
    this.gaJ = -1L;
    this.gaK = false;
    this.gaO = 0;
    this.gaM = new String[0];
    this.frk = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(116688);
        long l = com.tencent.mm.vfs.e.asZ(e.this.filename);
        ab.d("MicroMsg.NetSceneVoiceInput", com.tencent.mm.compatible.util.g.Mq() + " onTimerExpired: file:" + e.this.filename + " nowlen:" + l + " oldoff:" + e.this.fQx + " isFin:" + e.this.fZa);
        boolean bool;
        if ((l - e.this.fQx < 3300L) && (!e.this.fZa))
        {
          bool = true;
          AppMethodBeat.o(116688);
        }
        while (true)
        {
          return bool;
          if (e.this.a(e.this.ftf, e.this.ehi) == -1)
          {
            e.this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
            e.this.ehi.onSceneEnd(3, -1, "doScene failed", e.this);
          }
          bool = false;
          AppMethodBeat.o(116688);
        }
      }
    }
    , true);
    this.gaJ = bo.anU().hashCode();
    this.filename = paramString;
    this.gaO = paramInt;
    AppMethodBeat.o(116689);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(116690);
    this.ehi = paramf;
    int i = (int)com.tencent.mm.vfs.e.asZ(this.filename);
    ab.d("MicroMsg.NetSceneVoiceInput", "read file: %s, filelen: %d, oldoff: %d, isFin: %b", new Object[] { this.filename, Integer.valueOf(i), Integer.valueOf(this.fQx), Boolean.valueOf(this.fZa) });
    if (i <= 0)
    {
      ab.e("MicroMsg.NetSceneVoiceInput", "read failed :" + this.filename);
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
      AppMethodBeat.o(116690);
      j = -1;
      return j;
    }
    int k = i - this.fQx;
    if (k > 3960)
      j = 3960;
    while (true)
    {
      ab.d("MicroMsg.NetSceneVoiceInput", "read file: %s, filelen: %d, oldoff: %b, isFin:%b, endFlag: %b", new Object[] { this.filename, Integer.valueOf(i), Boolean.valueOf(this.fZa), Boolean.valueOf(this.fZa), Boolean.valueOf(this.gaK) });
      paramf = com.tencent.mm.vfs.e.e(this.filename, this.fQx, j);
      if (paramf != null)
        break label385;
      ab.e("MicroMsg.NetSceneVoiceInput", com.tencent.mm.compatible.util.g.Mq() + " read failed :" + this.filename + " read:" + j);
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
      AppMethodBeat.o(116690);
      j = -1;
      break;
      if ((k < 3300) && (!this.fZa))
      {
        ab.e("MicroMsg.NetSceneVoiceInput", com.tencent.mm.compatible.util.g.Mq() + " read failed :" + this.filename + "can read:" + k + " isfinish:" + this.fZa);
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
        AppMethodBeat.o(116690);
        j = -1;
        break;
      }
      j = k;
      if (this.fZa)
      {
        this.gaK = true;
        j = k;
      }
    }
    label385: Object localObject = new b.a();
    ((b.a)localObject).fsJ = new clc();
    ((b.a)localObject).fsK = new cld();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/uploadinputvoice";
    ((b.a)localObject).fsI = 349;
    ((b.a)localObject).fsL = 158;
    ((b.a)localObject).fsM = 1000000158;
    this.ehh = ((b.a)localObject).acD();
    localObject = (clc)this.ehh.fsG.fsP;
    ((clc)localObject).jBB = ((String)com.tencent.mm.kernel.g.RP().Ry().get(2, ""));
    ((clc)localObject).ptz = new SKBuiltinBuffer_t().setBuffer(paramf);
    ab.d("MicroMsg.NetSceneVoiceInput", com.tencent.mm.compatible.util.g.Mq() + " read file:" + this.filename + " readlen:" + paramf.length + " datalen:" + ((clc)localObject).ptz.getBuffer().toByteArray().length + " dataiLen:" + ((clc)localObject).ptz.getILen() + " md5:" + com.tencent.mm.a.g.x(paramf) + " datamd5:" + com.tencent.mm.a.g.x(((clc)localObject).ptz.getBuffer().toByteArray()));
    ((clc)localObject).vOq = this.fQx;
    ((clc)localObject).xiM = this.gaJ;
    if (this.gaK);
    for (int j = 1; ; j = 0)
    {
      ((clc)localObject).fJT = j;
      ((clc)localObject).xiN = 0;
      ((clc)localObject).vHr = 0;
      ((clc)localObject).xiO = this.gaO;
      ((clc)localObject).vHo = 0;
      ab.d("MicroMsg.NetSceneVoiceInput", "clientId " + this.gaJ);
      j = a(parame, this.ehh, this);
      AppMethodBeat.o(116690);
      break;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(116692);
    ab.d("MicroMsg.NetSceneVoiceInput", "onGYNetEnd file:" + this.filename + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (clc)((com.tencent.mm.ai.b)paramq).fsG.fsP;
    paramq = (cld)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneVoiceInput", com.tencent.mm.compatible.util.g.Mq() + " onGYNetEnd file:" + this.filename + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(116692);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneVoiceInput", com.tencent.mm.compatible.util.g.Mq() + " onGYNetEnd  file:" + this.filename + " endflag:" + paramq.fJT);
      if (paramArrayOfByte.fJT != 1)
        break;
      if ((paramq.xiP != null) && (paramq.xiP.getBuffer() != null))
        this.gaM = new String[] { paramq.xiP.getBuffer().dlY() };
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(116692);
    }
    paramInt1 = paramArrayOfByte.vOq;
    this.fQx = (paramArrayOfByte.ptz.getILen() + paramInt1);
    if (this.fZa);
    for (long l = 0L; ; l = 500L)
    {
      ab.d("MicroMsg.NetSceneVoiceInput", "onGYNetEnd file:" + this.filename + " delay:" + l);
      this.frk.ae(l, l);
      AppMethodBeat.o(116692);
      break;
    }
  }

  public final void a(m.a parama)
  {
    AppMethodBeat.i(116691);
    this.ehi.onSceneEnd(3, com.tencent.mm.compatible.util.g.getLine() + 40000, "ecurityCheckError", this);
    AppMethodBeat.o(116691);
  }

  public final int acn()
  {
    return 20;
  }

  public final void amj()
  {
    this.fZa = true;
  }

  public final String[] amk()
  {
    return this.gaM;
  }

  public final long aml()
  {
    return this.gaJ;
  }

  public final int amm()
  {
    return this.retCode;
  }

  public final List<String> amn()
  {
    return null;
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.e
 * JD-Core Version:    0.6.2
 */