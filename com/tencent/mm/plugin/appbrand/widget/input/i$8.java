package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class i$8
  implements View.OnKeyListener
{
  i$8(i parami)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(123634);
    paramView = this.jeg;
    boolean bool;
    if (67 == paramInt)
    {
      bool = true;
      paramView.jea = bool;
      if (!this.jeg.jea)
        break label86;
      this.jeg.jec.removeCallbacks(this.jeg.jeb);
      this.jeg.jec.postDelayed(this.jeg.jeb, 1000L);
    }
    while (true)
    {
      AppMethodBeat.o(123634);
      return false;
      bool = false;
      break;
      label86: this.jeg.jeb.run();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.i.8
 * JD-Core Version:    0.6.2
 */