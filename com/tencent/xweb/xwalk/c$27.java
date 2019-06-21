package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$27
  implements View.OnClickListener
{
  c$27(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85148);
    LinearLayout localLinearLayout = (LinearLayout)this.ARk.ARh.findViewById(2131823212);
    if (localLinearLayout.getVisibility() == 8)
    {
      localLinearLayout.setVisibility(0);
      ((Button)paramView).setText("隐藏高级设置");
      AppMethodBeat.o(85148);
    }
    while (true)
    {
      return;
      localLinearLayout.setVisibility(8);
      ((Button)paramView).setText("高级设置");
      AppMethodBeat.o(85148);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.27
 * JD-Core Version:    0.6.2
 */