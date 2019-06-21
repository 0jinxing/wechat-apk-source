package com.tencent.mm.plugin.websearch.widget.view.footer;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DirectionSwitchFooter$1
  implements View.OnClickListener
{
  DirectionSwitchFooter$1(DirectionSwitchFooter paramDirectionSwitchFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(91569);
    if (DirectionSwitchFooter.a(this.uer) != null)
      DirectionSwitchFooter.a(this.uer).cWh();
    AppMethodBeat.o(91569);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.footer.DirectionSwitchFooter.1
 * JD-Core Version:    0.6.2
 */