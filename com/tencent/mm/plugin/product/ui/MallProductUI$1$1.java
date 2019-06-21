package com.tencent.mm.plugin.product.ui;

import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallProductUI$1$1
  implements Runnable
{
  MallProductUI$1$1(MallProductUI.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(44156);
    ScrollView localScrollView = (ScrollView)this.pkf.pke.findViewById(2131826635);
    if (localScrollView != null)
      localScrollView.pageScroll(33);
    AppMethodBeat.o(44156);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductUI.1.1
 * JD-Core Version:    0.6.2
 */