package com.tencent.mm.plugin.base.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.pluginsdk.e.a;
import com.tencent.mm.protocal.protobuf.ciq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class WXBizEntryActivity$7
  implements e.a
{
  WXBizEntryActivity$7(WXBizEntryActivity paramWXBizEntryActivity)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(18146);
    ab.i("MicroMsg.WXBizEntryActivity", "offline pay, DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Boolean.valueOf(paramBoolean) });
    if ((paramm != null) && (paramInt1 != 0) && (paramInt2 != 0) && ((paramm instanceof z)))
    {
      paramString = ((z)paramm).ajE();
      if ((paramString != null) && (!this.jDz.isFinishing()))
      {
        h.a(this.jDz, bo.nullAsNil(paramString.xhy), this.jDz.getString(2131297061), this.jDz.getString(2131296994), false, new WXBizEntryActivity.7.1(this));
        AppMethodBeat.o(18146);
      }
    }
    while (true)
    {
      return;
      this.jDz.finish();
      AppMethodBeat.o(18146);
      continue;
      this.jDz.finish();
      AppMethodBeat.o(18146);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXBizEntryActivity.7
 * JD-Core Version:    0.6.2
 */