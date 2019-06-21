package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ahz;
import com.tencent.mm.protocal.protobuf.aia;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.h.a;
import java.io.IOException;

public final class h extends m
  implements k
{
  private f eIc;
  private final b ehh;
  public int gvO;
  private int kWH;
  public byte[] kWI;
  private int kWJ;
  private String kWK;
  private int kWL;

  public h(int paramInt1, int paramInt2, int paramInt3, String paramString, int paramInt4, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53114);
    b.a locala = new b.a();
    locala.fsJ = new ahz();
    locala.fsK = new aia();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetdesigneremojilist";
    locala.fsI = 821;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.gvO = paramInt1;
    this.kWH = paramInt2;
    this.kWJ = paramInt3;
    this.kWK = paramString;
    this.kWI = paramArrayOfByte;
    this.kWL = paramInt4;
    AppMethodBeat.o(53114);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(53116);
    this.eIc = paramf;
    ahz localahz = (ahz)this.ehh.fsG.fsP;
    if (this.kWI != null)
    {
      localahz.wok = aa.ad(this.kWI);
      if (localahz.wok != null)
        break label132;
    }
    label132: for (paramf = "Buf is NULL"; ; paramf = localahz.wok.toString())
    {
      ab.d("MicroMsg.emoji.NetSceneGetDesignerEmojiList", paramf);
      localahz.DesignerUin = this.kWH;
      localahz.OpCode = this.gvO;
      localahz.wdI = this.kWJ;
      localahz.wol = this.kWK;
      localahz.wom = this.kWL;
      int i = a(parame, this.ehh, this);
      AppMethodBeat.o(53116);
      return i;
      localahz.wok = new SKBuiltinBuffer_t();
      break;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53115);
    ab.d("MicroMsg.emoji.NetSceneGetDesignerEmojiList", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    String str;
    aia localaia;
    if (((paramInt2 == 0) && (paramInt3 == 0)) || ((paramInt2 == 4) && ((paramInt3 == 2) || (paramInt3 == 3)) && ((this.kWI == null) || (this.kWI.length <= 0)) && (this.gvO != 3)))
    {
      paramArrayOfByte = ((d)com.tencent.mm.kernel.g.M(d.class)).getEmojiStorageMgr().xYt;
      str = this.kWH;
      localaia = bkw();
      if ((!bo.isNullOrNil(str)) && (localaia != null))
        break label200;
      ab.w("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerEmojiListResponseByUIN failed. designerID or response is null.");
    }
    while (true)
    {
      paramq = (aia)((b)paramq).fsH.fsP;
      if (paramq.wok != null)
        this.kWI = aa.a(paramq.wok);
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(53115);
      return;
      try
      {
        label200: Object localObject1 = new com/tencent/mm/storage/emotion/g;
        ((com.tencent.mm.storage.emotion.g)localObject1).<init>();
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((com.tencent.mm.storage.emotion.g)localObject1).field_designerIDAndType = (str + h.a.ybb.value);
        ((com.tencent.mm.storage.emotion.g)localObject1).field_content = localaia.toByteArray();
        localObject2 = ((com.tencent.mm.storage.emotion.g)localObject1).Hl();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(str).append(h.a.ybb.value).toString();
        if (paramArrayOfByte.bSd.replace("EmotionDesignerInfo", "designerIDAndType", (ContentValues)localObject2) <= 0L)
          break label359;
        ab.i("MicroMsg.emoji.EmotionDesignerInfo", "savePersonalDesignerResponseByUIN success. designerID:%s", new Object[] { str });
      }
      catch (IOException paramArrayOfByte)
      {
        ab.e("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID exception:%s", new Object[] { bo.l(paramArrayOfByte) });
      }
      continue;
      label359: ab.i("MicroMsg.emoji.EmotionDesignerInfo", "savePersonalDesignerResponseByUIN failed. designerID:%s", new Object[] { str });
    }
  }

  public final aia bkw()
  {
    if (this.ehh == null);
    for (aia localaia = null; ; localaia = (aia)this.ehh.fsH.fsP)
      return localaia;
  }

  public final int getType()
  {
    return 821;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.h
 * JD-Core Version:    0.6.2
 */