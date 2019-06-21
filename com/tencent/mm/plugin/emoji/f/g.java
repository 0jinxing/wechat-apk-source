package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.al.c;
import com.tencent.mm.i.g.a;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.EmotionCDNUrl;
import com.tencent.mm.protocal.protobuf.ExchangeEmotionPackRequest;
import com.tencent.mm.protocal.protobuf.ExchangeEmotionPackResponse;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.io.File;

public final class g extends m
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ai.f eIc;
  boolean eVT;
  private final com.tencent.mm.ai.b ehh;
  public String fFa;
  private int gOW;
  public String kWA;
  public String kWB;
  String kWC;
  private int kWD;
  private g.a kWE;
  EmojiGroupInfo kWF;
  public String kWz;

  public g(String paramString)
  {
    this(paramString, null, "", null, 1, 0);
  }

  public g(String paramString, byte paramByte)
  {
    this(paramString, null, "", null, 1, 1);
  }

  public g(String paramString1, String paramString2)
  {
    this(paramString1, null, paramString2, null, 0, 0);
  }

  public g(String paramString1, String paramString2, String paramString3)
  {
    this(paramString1, paramString2, paramString3, null);
  }

  public g(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this(paramString1, paramString2, paramString3, paramString4, 0, 0);
  }

  private g(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(53108);
    this.fFa = "";
    this.kWE = new g.1(this);
    this.kWz = paramString1;
    this.kWA = paramString3;
    this.kWB = paramString2;
    this.kWC = paramString4;
    this.kWF = null;
    this.kWD = paramInt1;
    this.gOW = paramInt2;
    paramString1 = new b.a();
    paramString1.fsJ = new ExchangeEmotionPackRequest();
    paramString1.fsK = new ExchangeEmotionPackResponse();
    paramString1.uri = "/cgi-bin/micromsg-bin/exchangeemotionpack";
    paramString1.fsI = 423;
    paramString1.fsL = 213;
    paramString1.fsM = 1000000213;
    this.ehh = paramString1.acD();
    AppMethodBeat.o(53108);
  }

  static void g(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(53111);
    j.bkn().g(paramString1, paramInt1, paramInt2, paramString2);
    AppMethodBeat.o(53111);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(53110);
    ab.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "doScene");
    this.eIc = paramf;
    if (this.gOW == 0)
      g(this.kWz, 6, 0, this.fFa);
    paramf = (ExchangeEmotionPackRequest)this.ehh.fsG.fsP;
    paramf.ProductID = this.kWz;
    paramf.SeriesID = this.kWB;
    paramf.IsAutomatic = this.kWD;
    paramf.Scene = this.gOW;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(53110);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53109);
    ab.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
      g(this.kWz, -1, 0, this.fFa);
      AppMethodBeat.o(53109);
      return;
    }
    if (this.gOW == 0)
    {
      paramq = new File(com.tencent.mm.compatible.util.e.euQ);
      if (!paramq.exists())
        paramq.mkdirs();
      long l = System.currentTimeMillis();
      paramq = new StringBuilder();
      com.tencent.mm.kernel.g.RN();
      this.fFa = c.a("downzip", l, com.tencent.mm.kernel.a.QF(), "emoji");
      paramq = ((ExchangeEmotionPackResponse)this.ehh.fsH.fsP).DownloadInfo;
      paramArrayOfByte = new com.tencent.mm.i.g();
      paramArrayOfByte.field_mediaId = this.fFa;
      paramArrayOfByte.field_fullpath = (com.tencent.mm.compatible.util.e.euQ + this.kWz);
      paramArrayOfByte.field_fileType = com.tencent.mm.i.a.MediaType_FILE;
      paramArrayOfByte.field_totalLen = paramq.FileSize;
      paramArrayOfByte.field_aesKey = paramq.AesKey;
      paramArrayOfByte.field_fileId = paramq.Url;
      paramArrayOfByte.field_priority = com.tencent.mm.i.a.efC;
      paramArrayOfByte.egl = this.kWE;
      paramArrayOfByte.field_needStorage = true;
      this.eVT = false;
      if (!com.tencent.mm.al.f.afx().b(paramArrayOfByte, -1))
        ab.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "add task failed:");
    }
    while (true)
    {
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
      paramString = new k(this.kWz);
      com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
      AppMethodBeat.o(53109);
      break;
      ab.i("MicroMsg.emoji.NetSceneExchangeEmotionPack", "add custom emoji.need no download pack");
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(53112);
    super.cancel();
    this.eVT = true;
    AppMethodBeat.o(53112);
  }

  public final int getType()
  {
    return 423;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.g
 * JD-Core Version:    0.6.2
 */