package com.tencent.mm.plugin.brandservice.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MPSmileyFooter$1
  implements View.OnClickListener
{
  MPSmileyFooter$1(MPSmileyFooter paramMPSmileyFooter)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(14466);
    if (this.jZo.getVisibility() == 8)
      this.jZo.setVisibility(0);
    if (this.jZo.aYV())
      MPSmileyFooter.a(this.jZo);
    AppMethodBeat.o(14466);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPSmileyFooter.1
 * JD-Core Version:    0.6.2
 */