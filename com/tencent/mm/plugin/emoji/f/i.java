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
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.protocal.protobuf.aib;
import com.tencent.mm.protocal.protobuf.aic;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.h;
import com.tencent.mm.storage.emotion.h.a;
import java.io.IOException;

public final class i extends m
  implements k
{
  private f eIc;
  private final b ehh;
  private String kWM;

  public i(String paramString)
  {
    AppMethodBeat.i(53117);
    b.a locala = new b.a();
    locala.fsJ = new aib();
    locala.fsK = new aic();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetdesignersimpleinfo";
    locala.fsI = 239;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.kWM = paramString;
    AppMethodBeat.o(53117);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(53119);
    this.eIc = paramf;
    ((aib)this.ehh.fsG.fsP).wdC = this.kWM;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(53119);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53118);
    ab.d("MicroMsg.emoji.NetSceneGetDesignerSimpleInfo", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    Object localObject1;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = ((d)com.tencent.mm.kernel.g.M(d.class)).getEmojiStorageMgr().xYt;
      paramq = this.kWM;
      localObject1 = bkx();
      if ((!bo.isNullOrNil(paramq)) && (localObject1 != null))
        break label113;
      ab.w("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID failed. designerID or response is null.");
    }
    while (true)
    {
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(53118);
      return;
      try
      {
        label113: com.tencent.mm.storage.emotion.g localg = new com/tencent/mm/storage/emotion/g;
        localg.<init>();
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localg.field_designerIDAndType = (paramq + h.a.yaZ.value);
        localg.field_content = ((aic)localObject1).toByteArray();
        localObject2 = localg.Hl();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(paramq).append(h.a.yaZ.value).toString();
        if (paramArrayOfByte.bSd.replace("EmotionDesignerInfo", "designerIDAndType", (ContentValues)localObject2) <= 0L)
          break label268;
        ab.i("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID success. designerID:%s", new Object[] { paramq });
      }
      catch (IOException paramq)
      {
        ab.e("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID exception:%s", new Object[] { bo.l(paramq) });
      }
      continue;
      label268: ab.i("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID failed. designerID:%s", new Object[] { paramq });
    }
  }

  public final aic bkx()
  {
    if (this.ehh == null);
    for (aic localaic = null; ; localaic = (aic)this.ehh.fsH.fsP)
      return localaic;
  }

  public final int getType()
  {
    return 239;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.i
 * JD-Core Version:    0.6.2
 */