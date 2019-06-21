package com.tencent.mm.plugin.qqmail.ui;

import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class ComposeUI$c$1
  implements Runnable
{
  ComposeUI$c$1(ComposeUI.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(68211);
    if ((!ComposeUI.e(this.pxm.pwY).pyz.isFocused()) && (!ComposeUI.f(this.pxm.pwY).pyz.isFocused()) && (ComposeUI.e(this.pxm.pwY).getMailAddrs().size() == 0) && (ComposeUI.f(this.pxm.pwY).getMailAddrs().size() == 0) && (ComposeUI.e(this.pxm.pwY).cdg()) && (ComposeUI.f(this.pxm.pwY).cdg()))
    {
      ComposeUI.z(this.pxm.pwY).setVisibility(0);
      ComposeUI.A(this.pxm.pwY).setVisibility(8);
      ComposeUI.B(this.pxm.pwY).setVisibility(8);
    }
    AppMethodBeat.o(68211);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ComposeUI.c.1
 * JD-Core Version:    0.6.2
 */