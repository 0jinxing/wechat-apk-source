package com.tencent.mm.plugin.order.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallOrderDetailInfoUI$7
  implements View.OnClickListener
{
  MallOrderDetailInfoUI$7(MallOrderDetailInfoUI paramMallOrderDetailInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43802);
    if ((MallOrderDetailInfoUI.f(this.pdR) != null) && (MallOrderDetailInfoUI.g(this.pdR) != null))
      if (paramView.getId() == 2131825800)
      {
        MallOrderDetailInfoUI.f(this.pdR).setSelected(true);
        MallOrderDetailInfoUI.g(this.pdR).setSelected(false);
        MallOrderDetailInfoUI.a(this.pdR, 100);
        AppMethodBeat.o(43802);
      }
    while (true)
    {
      return;
      MallOrderDetailInfoUI.f(this.pdR).setSelected(false);
      MallOrderDetailInfoUI.g(this.pdR).setSelected(true);
      MallOrderDetailInfoUI.a(this.pdR, -100);
      AppMethodBeat.o(43802);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderDetailInfoUI.7
 * JD-Core Version:    0.6.2
 */