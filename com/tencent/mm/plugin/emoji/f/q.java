package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bby;
import com.tencent.mm.protocal.protobuf.bbz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;

public final class q extends m
  implements k
{
  private f eIc;
  private final b ehh;
  public String kWz;
  private int kXc;

  public q(String paramString, int paramInt)
  {
    AppMethodBeat.i(53147);
    this.kWz = paramString;
    if ((!bo.isNullOrNil(paramString)) && (paramString.equals(String.valueOf(EmojiGroupInfo.yac))))
      this.kWz = "com.tencent.xin.emoticon.tusiji";
    this.kXc = paramInt;
    paramString = new b.a();
    paramString.fsJ = new bby();
    paramString.fsK = new bbz();
    paramString.uri = "/cgi-bin/micromsg-bin/modemotionpack";
    paramString.fsI = 413;
    paramString.fsL = 212;
    paramString.fsM = 1000000212;
    this.ehh = paramString.acD();
    AppMethodBeat.o(53147);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(53148);
    this.eIc = paramf;
    paramf = (bby)this.ehh.fsG.fsP;
    paramf.ProductID = this.kWz;
    paramf.OpCode = this.kXc;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(53148);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53149);
    ab.d("MicroMsg.emoji.NetSceneModEmotionPack", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
      if (this.kXc == 1)
      {
        h.pYm.a(165L, 3L, 1L, false);
        ab.i("MicroMsg.emoji.NetSceneModEmotionPack", "del tukiz failed  ");
        AppMethodBeat.o(53149);
      }
      while (true)
      {
        return;
        h.pYm.a(165L, 5L, 1L, false);
        ab.i("MicroMsg.emoji.NetSceneModEmotionPack", "del emoji failed md5:%s", new Object[] { this.kWz });
        AppMethodBeat.o(53149);
      }
    }
    if (this.kXc == 1)
      h.pYm.a(165L, 2L, 1L, false);
    while (true)
    {
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(53149);
      break;
      h.pYm.a(165L, 4L, 1L, false);
    }
  }

  public final int getType()
  {
    return 413;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.q
 * JD-Core Version:    0.6.2
 */