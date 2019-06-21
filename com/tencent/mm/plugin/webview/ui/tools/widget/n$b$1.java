package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.buj;

final class n$b$1
  implements View.OnClickListener
{
  n$b$1(n.b paramb, buj parambuj, ImageView paramImageView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(79178);
    if (this.iwt.wWa == 2)
    {
      this.usC.setImageResource(2131231542);
      this.iwt.wWa = 1;
      AppMethodBeat.o(79178);
    }
    while (true)
    {
      return;
      if (this.iwt.wWa == 1)
      {
        this.usC.setImageResource(2131231540);
        this.iwt.wWa = 2;
      }
      AppMethodBeat.o(79178);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.n.b.1
 * JD-Core Version:    0.6.2
 */