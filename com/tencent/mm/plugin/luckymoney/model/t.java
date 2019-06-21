package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;

public final class t
  implements g.a
{
  String lvp = null;
  t.a nXU;
  String nXV;
  boolean nXW = true;

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(42350);
    ab.d("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd:cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
    if ((paramd != null) && (this.lvp.equals(paramString)) && (!bo.isNullOrNil(paramd.field_fileId)))
    {
      ab.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer success, sceneResult.field_retCode:" + paramd.field_retCode);
      if ((paramInt == 0) && (paramd.field_retCode == 0))
        if (this.nXW)
        {
          ab.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, upload callback success");
          ab.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd:transfer done, mediaid=%s, completeInfo=%s", new Object[] { paramString, paramd.toString() });
          if (this.nXU != null)
            this.nXU.aS(this.nXV, true);
        }
    }
    while (true)
    {
      AppMethodBeat.o(42350);
      return 0;
      ab.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, download callback success");
      break;
      ab.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, fail");
      if (this.nXU != null)
      {
        this.nXU.aS(this.nXV, false);
        continue;
        if ((paramd != null) && (this.lvp.equals(paramString)) && (paramd.field_retCode != 0))
        {
          ab.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: transfer done, fail, sceneResult.field_retCode:" + paramd.field_retCode);
          if (this.nXU != null)
            this.nXU.aS(this.nXV, false);
        }
        else if (paramc != null)
        {
          ab.d("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: upload progressing....");
        }
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.t
 * JD-Core Version:    0.6.2
 */