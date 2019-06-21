package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

final class ai$1$2
  implements z.a
{
  ai$1$2(ai.1 param1, int paramInt)
  {
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, long paramLong)
  {
    AppMethodBeat.i(27372);
    String str1 = bo.anv(paramString2);
    String str2 = bo.anv(paramString3);
    String str3 = bo.anv(paramString4);
    String str4 = bo.anv(paramString5);
    boolean bool;
    if (this.vcG.vcF.csH == null)
    {
      bool = true;
      ab.i("MicroMsg.NetSceneUploadAppAttach", "summerbig NetSceneCheckBigFileUpload not exist_whencheck call back new md5[%s], aesKey[%s], signature[%s], aesKey[%s], signature[%s], amc null[%b], enableHitcheck[%b]", new Object[] { paramString1, str1, str2, str3, str4, Boolean.valueOf(bool), Boolean.valueOf(this.vcG.vcF.fFs) });
      if (!bo.isNullOrNil(paramString3))
      {
        this.vcG.vcF.pJj.field_signature = paramString3;
        this.vcG.vcF.pJj.field_fakeAeskey = paramString4;
        this.vcG.vcF.pJj.field_fakeSignature = paramString5;
        this.vcG.vcF.pJj.field_lastModifyTime = bo.anU();
        if (this.vcG.vcF.csH != null)
        {
          this.vcG.vcF.csH.filemd5 = paramString1;
          this.vcG.vcF.csH.eyr = paramString2;
          this.vcG.vcF.csH.fgo = ((int)paramLong);
          aw.ZK();
          paramString1 = com.tencent.mm.model.c.XO().jf(this.vcG.vcF.pJj.field_msgInfoId);
          paramString1.setContent(j.b.a(this.vcG.vcF.csH, null, null));
          aw.ZK();
          com.tencent.mm.model.c.XO().a(paramString1.field_msgId, paramString1);
        }
      }
      this.vcG.vcF.fFs = false;
      bool = am.aUq().a(this.vcG.vcF.pJj, new String[0]);
      if (bool)
        break label407;
      ab.e("MicroMsg.NetSceneUploadAppAttach", "summerbig cdnCallback onGYNetEnd update info ret:".concat(String.valueOf(bool)));
      this.vcG.vcF.retCode = (-10000 - g.getLine());
      this.vcG.vcF.ehi.onSceneEnd(3, this.kDE, "", this.vcG.vcF);
      AppMethodBeat.o(27372);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label407: aw.RS().aa(new ai.1.2.1(this));
      AppMethodBeat.o(27372);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ai.1.2
 * JD-Core Version:    0.6.2
 */