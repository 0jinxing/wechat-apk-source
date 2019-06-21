package com.tencent.mm.plugin.fav.ui.widget;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavTagPanel$1$2
  implements Runnable
{
  FavTagPanel$1$2(FavTagPanel.1 param1, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74706);
    FavTagPanel.a(this.mqe.mqc).Mi(((TextView)this.mqd).getText().toString());
    AppMethodBeat.o(74706);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.1.2
 * JD-Core Version:    0.6.2
 */