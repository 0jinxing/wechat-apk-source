package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;

final class EnterpriseBizContactPlainListUI$5
  implements q.a
{
  EnterpriseBizContactPlainListUI$5(EnterpriseBizContactPlainListUI paramEnterpriseBizContactPlainListUI, String paramString)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(13984);
    if (!paramBoolean)
      AppMethodBeat.o(13984);
    while (true)
    {
      return;
      if (EnterpriseBizContactPlainListUI.b(this.jMl) == 3)
      {
        paramString = this.jMl.getIntent();
        paramString.putExtra("enterprise_biz_name", this.jMn);
        this.jMl.setResult(-1, paramString);
        this.jMl.finish();
      }
      AppMethodBeat.o(13984);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI.5
 * JD-Core Version:    0.6.2
 */