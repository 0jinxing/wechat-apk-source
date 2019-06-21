package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class ai$1$1
  implements z.a
{
  ai$1$1(ai.1 param1, int paramInt, d paramd)
  {
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(27370);
    paramString2 = bo.anv(paramString2);
    String str1 = bo.anv(paramString3);
    String str2 = bo.anv(paramString4);
    String str3 = bo.anv(paramString5);
    if (this.vcG.vcF.csH == null);
    while (true)
    {
      ab.i("MicroMsg.NetSceneUploadAppAttach", "summerbig NetSceneCheckBigFileUpload exist_whencheck call back new md5[%s], aesKey[%s], signature[%s], aesKey[%s], signature[%s], amc null[%b], enableHitcheck[%b]", new Object[] { paramString1, paramString2, str1, str2, str3, Boolean.valueOf(bool), Boolean.valueOf(this.vcG.vcF.fFs) });
      if (!bo.isNullOrNil(paramString3))
      {
        this.vcG.vcF.pJj.field_signature = paramString3;
        this.vcG.vcF.pJj.field_fakeAeskey = paramString4;
        this.vcG.vcF.pJj.field_fakeSignature = paramString5;
      }
      this.vcG.a(this.kDE, this.fyV);
      AppMethodBeat.o(27370);
      return;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ai.1.1
 * JD-Core Version:    0.6.2
 */