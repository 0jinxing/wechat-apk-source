package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.qk;
import com.tencent.mm.protocal.protobuf.ql;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class c extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private final com.tencent.mm.pluginsdk.model.app.b pJj;

  public c(com.tencent.mm.pluginsdk.model.app.b paramb, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(135639);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new qk();
    ((b.a)localObject).fsK = new ql();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkbigfiledownload";
    ((b.a)localObject).fsI = 728;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    this.pJj = paramb;
    localObject = (qk)this.ehh.fsG.fsP;
    ((qk)localObject).vRw = paramString1;
    ((qk)localObject).vXv = paramb.field_totalLen;
    ((qk)localObject).vXw = paramString2;
    ((qk)localObject).fMd = paramString3;
    ((qk)localObject).vXx = paramString4;
    ((qk)localObject).ndG = paramString5;
    ((qk)localObject).ndF = ((String)g.RP().Ry().get(2, ""));
    ((qk)localObject).vHo = com.tencent.mm.i.a.efE;
    ab.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig AESKey[%s] FileMd5[%s] FileName[%s] FileExt[%s] FileSize[%d] FileType[%d] stack[%s]", new Object[] { bo.anv(((qk)localObject).vRw), ((qk)localObject).vXw, ((qk)localObject).fMd, ((qk)localObject).vXx, Long.valueOf(((qk)localObject).vXv), Integer.valueOf(((qk)localObject).vHo), bo.dpG() });
    AppMethodBeat.o(135639);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(135640);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(135640);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135641);
    ab.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig onGYNetEnd [%d, %d, %s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ql)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      this.pJj.field_signature = paramq.guQ;
      this.pJj.field_fakeAeskey = paramq.vXz;
      this.pJj.field_fakeSignature = paramq.vXA;
      boolean bool = com.tencent.mm.plugin.s.a.aUq().a(this.pJj, new String[0]);
      ab.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig onGYNetEnd field_signature[%s], field_fakeAeskey[%s], field_fakeSignature[%s], update[%b]", new Object[] { bo.anv(this.pJj.field_signature), bo.anv(this.pJj.field_fakeAeskey), bo.anv(this.pJj.field_fakeSignature), Boolean.valueOf(bool) });
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(135641);
  }

  public final String getMediaId()
  {
    if (this.pJj != null);
    for (String str = this.pJj.field_mediaSvrId; ; str = "")
      return str;
  }

  public final int getType()
  {
    return 728;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.c
 * JD-Core Version:    0.6.2
 */