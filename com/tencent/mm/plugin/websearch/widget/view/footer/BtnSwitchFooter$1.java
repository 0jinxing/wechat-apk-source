package com.tencent.mm.plugin.websearch.widget.view.footer;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BtnSwitchFooter$1
  implements View.OnClickListener
{
  BtnSwitchFooter$1(BtnSwitchFooter paramBtnSwitchFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(91560);
    if (BtnSwitchFooter.a(this.uem) != null)
      BtnSwitchFooter.a(this.uem).cWf();
    AppMethodBeat.o(91560);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.footer.BtnSwitchFooter.1
 * JD-Core Version:    0.6.2
 */