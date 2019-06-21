package com.tencent.mm.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.widget.listview.PullDownListView;

final class MoreTabUI$7
  implements View.OnClickListener
{
  MoreTabUI$7(MoreTabUI paramMoreTabUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29698);
    if (MoreTabUI.g(this.yoD))
    {
      t.makeText(this.yoD.getContext(), this.yoD.getResources().getString(2131303947), 0).show();
      AppMethodBeat.o(29698);
    }
    while (true)
    {
      return;
      if (MoreTabUI.h(this.yoD) != null)
        MoreTabUI.h(this.yoD).dLg();
      AppMethodBeat.o(29698);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MoreTabUI.7
 * JD-Core Version:    0.6.2
 */