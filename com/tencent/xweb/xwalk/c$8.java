package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.m;

final class c$8
  implements View.OnClickListener
{
  c$8(c paramc, Button paramButton)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85129);
    paramView = m.dTZ();
    boolean bool;
    Button localButton;
    if (!m.dTZ().AMB)
    {
      bool = true;
      paramView.ry(bool);
      localButton = this.ARn;
      if (!m.dTZ().AMB)
        break label58;
    }
    label58: for (paramView = "使用正式版config"; ; paramView = "使用测试config")
    {
      localButton.setText(paramView);
      AppMethodBeat.o(85129);
      return;
      bool = false;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.8
 * JD-Core Version:    0.6.2
 */