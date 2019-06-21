package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.aet;
import com.tencent.mm.protocal.protobuf.aeu;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  private final String id;
  public byte[] jAn;

  public e(String paramString)
  {
    AppMethodBeat.i(17891);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aet();
    ((b.a)localObject).fsK = new aeu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getbakchatkey";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    ((b.a)localObject).fsI = 596;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aet)this.ehh.fsG.fsP;
    ((aet)localObject).ID = paramString;
    ((aet)localObject).wmw = z.dmx().ver;
    this.id = paramString;
    ab.i("MicroMsg.NetSceneGetBakchatkey", "init id:%s, ver:0x%x", new Object[] { ((aet)localObject).ID, Integer.valueOf(((aet)localObject).wmw) });
    AppMethodBeat.o(17891);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(17893);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(17893);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17894);
    ab.i("MicroMsg.NetSceneGetBakchatkey", "errType %d,  errCode %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.jAn = ((aeu)this.ehh.fsH.fsP).vIn.getBuffer().wR;
      paramq = this.id;
      if (this.jAn == null);
      for (paramInt1 = 0; ; paramInt1 = this.jAn.length)
      {
        ab.i("MicroMsg.NetSceneGetBakchatkey", "id:%s,  key len:%d", new Object[] { paramq, Integer.valueOf(paramInt1) });
        if (this.jAn == null)
          break label196;
        paramArrayOfByte = this.jAn;
        paramq = "";
        for (paramInt1 = 0; paramInt1 < paramArrayOfByte.length; paramInt1++)
          paramq = paramq + Integer.toHexString(paramArrayOfByte[paramInt1] & 0xFF) + " ";
      }
      ab.i("MicroMsg.NetSceneGetBakchatkey", "dump bakchat: %s", new Object[] { paramq });
    }
    label196: this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(17894);
  }

  public final void cancel()
  {
    AppMethodBeat.i(17892);
    super.cancel();
    AppMethodBeat.o(17892);
  }

  public final int getType()
  {
    return 596;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.c.e
 * JD-Core Version:    0.6.2
 */