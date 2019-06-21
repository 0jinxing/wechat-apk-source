package com.tencent.mm.plugin.game.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameDropdownView$1
  implements View.OnClickListener
{
  GameDropdownView$1(GameDropdownView paramGameDropdownView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(111913);
    if ((GameDropdownView.a(this.nik).getContentView() == null) || (!(GameDropdownView.a(this.nik).getContentView() instanceof ViewGroup)))
    {
      GameDropdownView.a(this.nik).dismiss();
      AppMethodBeat.o(111913);
    }
    while (true)
    {
      return;
      int i = ((ViewGroup)GameDropdownView.a(this.nik).getContentView()).indexOfChild(paramView);
      GameDropdownView.a(this.nik, i);
      GameDropdownView.a(this.nik).dismiss();
      AppMethodBeat.o(111913);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDropdownView.1
 * JD-Core Version:    0.6.2
 */