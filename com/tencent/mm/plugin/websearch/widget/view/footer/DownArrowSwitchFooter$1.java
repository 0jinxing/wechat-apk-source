package com.tencent.mm.plugin.websearch.widget.view.footer;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DownArrowSwitchFooter$1
  implements View.OnClickListener
{
  DownArrowSwitchFooter$1(DownArrowSwitchFooter paramDownArrowSwitchFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(91577);
    if (DownArrowSwitchFooter.a(this.ues) != null)
      DownArrowSwitchFooter.a(this.ues).cWf();
    AppMethodBeat.o(91577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.footer.DownArrowSwitchFooter.1
 * JD-Core Version:    0.6.2
 */