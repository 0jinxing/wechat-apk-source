package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$10
  implements View.OnClickListener
{
  c$10(c paramc, LinearLayout paramLinearLayout)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85131);
    if (this.ARo.getVisibility() == 8)
    {
      this.ARo.setVisibility(0);
      ((Button)paramView).setText("隐藏插件设置");
      AppMethodBeat.o(85131);
    }
    while (true)
    {
      return;
      this.ARo.setVisibility(8);
      ((Button)paramView).setText("插件设置");
      AppMethodBeat.o(85131);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.10
 * JD-Core Version:    0.6.2
 */