package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

final class al$a$1
  implements z.a
{
  al$a$1(al.a parama, b paramb, bi parambi, long paramLong, String paramString)
  {
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, long paramLong)
  {
    AppMethodBeat.i(27394);
    if (bo.isNullOrNil(paramString3))
      AppMethodBeat.o(27394);
    while (true)
    {
      return;
      this.vcL.field_signature = paramString3;
      this.vcL.field_fakeAeskey = paramString4;
      this.vcL.field_fakeSignature = paramString5;
      this.vcL.field_lastModifyTime = bo.anU();
      paramString4 = this.fkD.field_content;
      paramString3 = paramString4;
      if (t.kH(this.fkD.field_talker))
      {
        int i = bf.ox(this.fkD.field_content);
        paramString3 = paramString4;
        if (i != -1)
          paramString3 = (this.fkD.field_content + " ").substring(i + 2).trim();
      }
      paramString3 = j.b.me(bo.anj(paramString3));
      if (paramString3 != null)
      {
        paramString3.filemd5 = paramString1;
        paramString3.eyr = paramString2;
        paramString3.fgo = ((int)paramLong);
        aw.ZK();
        paramString1 = com.tencent.mm.model.c.XO().jf(this.vcL.field_msgInfoId);
        paramString1.setContent(j.b.a(paramString3, null, null));
        aw.ZK();
        com.tencent.mm.model.c.XO().a(paramString1.field_msgId, paramString1);
      }
      am.aUq().a(this.vcL, new String[0]);
      paramString1 = new ai(this.vcM, null, this.hno);
      aw.Rg().a(paramString1, 0);
      AppMethodBeat.o(27394);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.al.a.1
 * JD-Core Version:    0.6.2
 */