package com.tencent.mm.plugin.websearch.widget.view.footer;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DirectionSwitchFooter$2
  implements View.OnClickListener
{
  DirectionSwitchFooter$2(DirectionSwitchFooter paramDirectionSwitchFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(91570);
    if (DirectionSwitchFooter.a(this.uer) != null)
      DirectionSwitchFooter.a(this.uer).cWg();
    AppMethodBeat.o(91570);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.footer.DirectionSwitchFooter.2
 * JD-Core Version:    0.6.2
 */