package com.tencent.mm.plugin.location.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$3
  implements View.OnClickListener
{
  m$3(m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113561);
    int[] arrayOfInt = new int[2];
    paramView.getLocationInWindow(arrayOfInt);
    m.a(this.nOf, arrayOfInt[0], arrayOfInt[1]);
    AppMethodBeat.o(113561);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.m.3
 * JD-Core Version:    0.6.2
 */