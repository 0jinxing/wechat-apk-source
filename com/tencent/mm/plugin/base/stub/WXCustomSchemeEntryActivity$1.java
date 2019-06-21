package com.tencent.mm.plugin.base.stub;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.pluginsdk.e.a;
import com.tencent.mm.protocal.protobuf.ciq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;

final class WXCustomSchemeEntryActivity$1
  implements e.a
{
  WXCustomSchemeEntryActivity$1(WXCustomSchemeEntryActivity paramWXCustomSchemeEntryActivity)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, m paramm, boolean paramBoolean)
  {
    AppMethodBeat.i(18181);
    ab.i("MicroMsg.WXCustomSchemeEntryActivity", "DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Boolean.valueOf(paramBoolean) });
    if ((paramm != null) && (paramInt1 != 0) && (paramInt2 != 0) && ((paramm instanceof z)))
    {
      paramString = ((z)paramm).ajE();
      if ((paramString != null) && (!this.jEa.isFinishing()))
        t.makeText(this.jEa, this.jEa.getString(2131297061) + " : " + bo.nullAsNil(paramString.xhy), 0).show();
    }
    this.jEa.finish();
    AppMethodBeat.o(18181);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity.1
 * JD-Core Version:    0.6.2
 */