package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.i.c;
import com.tencent.mm.i.g.a;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;

final class g$1
  implements g.a
{
  g$1(g paramg)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(53107);
    if ((bo.isNullOrNil(this.kWG.fFa)) || (!paramString.equals(this.kWG.fFa)))
    {
      ab.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "cdntra mediaId is no equal");
      AppMethodBeat.o(53107);
    }
    while (true)
    {
      return 0;
      if (paramInt == -21006)
      {
        ab.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", new Object[] { this.kWG.fFa });
        g.g(this.kWG.kWz, 6, 0, this.kWG.fFa);
        AppMethodBeat.o(53107);
        continue;
      }
      if (paramInt != 0)
      {
        ab.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "download emoji pack failed. mProductId:%s:", new Object[] { this.kWG.kWz });
        g.g(this.kWG.kWz, -1, 0, this.kWG.fFa);
        AppMethodBeat.o(53107);
        continue;
      }
      if (paramc != null)
      {
        if (paramc.field_finishedLength == paramc.field_toltalLength)
        {
          ab.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "cdntra ignore progress 100%");
          AppMethodBeat.o(53107);
          continue;
        }
        ab.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "cdntra progresscallback id:%s finish:%d total:%d", new Object[] { this.kWG.fFa, Integer.valueOf(paramc.field_finishedLength), Integer.valueOf(paramc.field_toltalLength) });
        if (!this.kWG.eVT)
          g.g(this.kWG.kWz, 6, (int)(paramc.field_finishedLength / paramc.field_toltalLength * 100.0F), this.kWG.fFa);
        AppMethodBeat.o(53107);
        continue;
      }
      if (paramd != null)
      {
        h.pYm.e(10625, new Object[] { Integer.valueOf(2), paramd.field_fileId, this.kWG.kWz, paramd.field_transInfo });
        if (paramd.field_retCode != 0)
        {
          ab.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "donwload emoji pack faild. ProductId:%s code:%d ", new Object[] { this.kWG.kWz, Integer.valueOf(paramd.field_retCode) });
          g.g(this.kWG.kWz, -1, 0, this.kWG.fFa);
        }
      }
      else
      {
        AppMethodBeat.o(53107);
        continue;
      }
      ab.d("MicroMsg.emoji.NetSceneExchangeEmotionPack", "donwload emoji success.");
      try
      {
        paramc = com.tencent.mm.plugin.emoji.e.d.bjH();
        paramString = this.kWG.kWz;
        if ((paramc.kTF != null) && (paramc.kTF.contains(paramString)))
          paramc.kTF.remove(paramString);
        EmojiLogic.a(this.kWG.kWz, this.kWG.kWA, this.kWG.kWC, this.kWG.kWF);
        j.getEmojiStorageMgr().xYn.doNotify();
        g.g(this.kWG.kWz, 7, 100, this.kWG.fFa);
        paramc = new java/io/File;
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        paramc.<init>(e.euQ + this.kWG.kWz);
        if ((paramc.isFile()) && (paramc.exists()))
          paramc.delete();
        g.av(this.kWG.kWz, true);
        AppMethodBeat.o(53107);
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "unzip emoji package Error." + bo.dpG());
        g.g(this.kWG.kWz, -1, 0, this.kWG.fFa);
        g.av(this.kWG.kWz, false);
        AppMethodBeat.o(53107);
      }
      catch (OutOfMemoryError paramString)
      {
        while (true)
          ab.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "unzip emoji package Out Of Memory Error." + bo.dpG());
      }
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.g.1
 * JD-Core Version:    0.6.2
 */