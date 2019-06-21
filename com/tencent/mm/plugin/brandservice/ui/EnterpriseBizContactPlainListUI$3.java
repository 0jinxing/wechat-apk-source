package com.tencent.mm.plugin.brandservice.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;

final class EnterpriseBizContactPlainListUI$3
  implements View.OnClickListener
{
  EnterpriseBizContactPlainListUI$3(EnterpriseBizContactPlainListUI paramEnterpriseBizContactPlainListUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13982);
    BackwardSupportUtil.c.a(EnterpriseBizContactPlainListUI.a(this.jMl));
    AppMethodBeat.o(13982);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI.3
 * JD-Core Version:    0.6.2
 */