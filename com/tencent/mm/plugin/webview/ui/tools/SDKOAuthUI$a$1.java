package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bew;

final class SDKOAuthUI$a$1
  implements View.OnClickListener
{
  SDKOAuthUI$a$1(SDKOAuthUI.a parama, bew parambew, ImageView paramImageView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7539);
    if (this.usB.wIR == 2)
    {
      this.usC.setImageResource(2131231542);
      this.usB.wIR = 1;
      AppMethodBeat.o(7539);
    }
    while (true)
    {
      return;
      if (this.usB.wIR == 1)
      {
        this.usC.setImageResource(2131231540);
        this.usB.wIR = 2;
      }
      AppMethodBeat.o(7539);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.a.1
 * JD-Core Version:    0.6.2
 */