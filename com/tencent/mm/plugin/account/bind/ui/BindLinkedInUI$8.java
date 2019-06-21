package com.tencent.mm.plugin.account.bind.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class BindLinkedInUI$8
  implements View.OnClickListener
{
  BindLinkedInUI$8(BindLinkedInUI paramBindLinkedInUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13395);
    h.a(this.grc, this.grc.getString(2131298563), null, new BindLinkedInUI.8.1(this), new BindLinkedInUI.8.2(this));
    AppMethodBeat.o(13395);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI.8
 * JD-Core Version:    0.6.2
 */