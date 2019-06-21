package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cny;
import com.tencent.mm.protocal.protobuf.cnz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.LinkedList;
import java.util.List;

public final class d extends a
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
  private int gaL;
  private String[] gaM;
  int retCode;

  public d(String paramString, int paramInt)
  {
    AppMethodBeat.i(116684);
    this.retCode = 0;
    this.fQx = 0;
    this.filename = null;
    this.gaJ = -1L;
    this.gaK = false;
    this.fZa = false;
    this.gaM = new String[0];
    this.frk = new ap(new d.1(this), true);
    this.gaJ = bo.anU();
    this.filename = paramString;
    this.gaL = paramInt;
    AppMethodBeat.o(116684);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(116685);
    this.ehi = paramf;
    long l = com.tencent.mm.vfs.e.asZ(this.filename);
    ab.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Mq() + " read file:" + this.filename + " filelen:" + l + " oldoff:" + this.fQx + " isFin:" + this.fZa);
    if (l <= 0L)
    {
      ab.e("MicroMsg.NetSceneVoiceAddr", "read failed :" + this.filename);
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
      AppMethodBeat.o(116685);
      i = -1;
      return i;
    }
    int j = (int)(l - this.fQx);
    if (j > 3960)
      i = 3960;
    while (true)
    {
      ab.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Mq() + " read file:" + this.filename + " filelen:" + l + " oldoff:" + this.fQx + " isFin:" + this.fZa + " endFlag:" + this.gaK);
      paramf = com.tencent.mm.vfs.e.e(this.filename, this.fQx, i);
      if (paramf != null)
        break label432;
      ab.e("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Mq() + " read failed :" + this.filename + " read:" + i);
      this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
      AppMethodBeat.o(116685);
      i = -1;
      break;
      if ((j < 3300) && (!this.fZa))
      {
        ab.e("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Mq() + " read failed :" + this.filename + "can read:" + j + " isfinish:" + this.fZa);
        this.retCode = (com.tencent.mm.compatible.util.g.getLine() + 40000);
        AppMethodBeat.o(116685);
        i = -1;
        break;
      }
      i = j;
      if (this.fZa)
      {
        this.gaK = true;
        i = j;
      }
    }
    label432: Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cny();
    ((b.a)localObject).fsK = new cnz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voiceaddr";
    ((b.a)localObject).fsI = 206;
    ((b.a)localObject).fsL = 94;
    ((b.a)localObject).fsM = 1000000094;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cny)this.ehh.fsG.fsP;
    ((cny)localObject).ptz = new SKBuiltinBuffer_t().setBuffer(paramf);
    ab.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Mq() + " read file:" + this.filename + " readlen:" + paramf.length + " datalen:" + ((cny)localObject).ptz.getBuffer().toByteArray().length + " dataiLen:" + ((cny)localObject).ptz.getILen() + " md5:" + com.tencent.mm.a.g.x(paramf) + " datamd5:" + com.tencent.mm.a.g.x(((cny)localObject).ptz.getBuffer().toByteArray()));
    ((cny)localObject).jBB = ((String)com.tencent.mm.kernel.g.RP().Ry().get(2, ""));
    ((cny)localObject).vOq = this.fQx;
    ((cny)localObject).xiM = this.gaJ;
    if (this.gaK);
    for (int i = 1; ; i = 0)
    {
      ((cny)localObject).fJT = i;
      ((cny)localObject).xiN = 0;
      ((cny)localObject).vHr = 0;
      ((cny)localObject).xiO = 0;
      ((cny)localObject).vHo = 0;
      ((cny)localObject).xlv = this.gaL;
      ab.d("MicroMsg.NetSceneVoiceAddr", "clientId " + this.gaJ);
      i = a(parame, this.ehh, this);
      AppMethodBeat.o(116685);
      break;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(116687);
    ab.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Mq() + " onGYNetEnd file:" + this.filename + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (cny)((com.tencent.mm.ai.b)paramq).fsG.fsP;
    paramq = (cnz)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Mq() + " onGYNetEnd file:" + this.filename + " errType:" + paramInt2 + " errCode:" + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(116687);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneVoiceAddr", com.tencent.mm.compatible.util.g.Mq() + " onGYNetEnd  file:" + this.filename + " endflag:" + paramq.fJT + " lst:" + paramq.vEg);
      if (paramArrayOfByte.fJT != 1)
        break;
      this.gaM = new String[paramq.vEg.size()];
      for (paramInt1 = 0; paramInt1 < paramq.vEg.size(); paramInt1++)
        this.gaM[paramInt1] = ((bts)paramq.vEg.get(paramInt1)).wVI;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(116687);
    }
    paramInt1 = paramArrayOfByte.vOq;
    this.fQx = (paramArrayOfByte.ptz.getILen() + paramInt1);
    if (this.fZa);
    for (long l = 0L; ; l = 500L)
    {
      ab.d("MicroMsg.NetSceneVoiceAddr", "onGYNetEnd file:" + this.filename + " delay:" + l);
      this.frk.ae(l, l);
      AppMethodBeat.o(116687);
      break;
    }
  }

  public final void a(m.a parama)
  {
    AppMethodBeat.i(116686);
    this.ehi.onSceneEnd(3, com.tencent.mm.compatible.util.g.getLine() + 40000, "ecurityCheckError", this);
    AppMethodBeat.o(116686);
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
    return 206;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.d
 * JD-Core Version:    0.6.2
 */