package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.protocal.protobuf.lk;

final class EnterpriseBizContactPlainListUI$4
  implements q.a
{
  EnterpriseBizContactPlainListUI$4(EnterpriseBizContactPlainListUI paramEnterpriseBizContactPlainListUI, lk paramlk)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(13983);
    if (paramBoolean)
    {
      paramString = this.jMl.getIntent();
      paramString.putExtra("enterprise_biz_name", this.jMm.userName);
      this.jMl.setResult(-1, paramString);
      this.jMl.finish();
    }
    AppMethodBeat.o(13983);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI.4
 * JD-Core Version:    0.6.2
 */