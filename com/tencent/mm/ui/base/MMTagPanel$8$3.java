package com.tencent.mm.ui.base;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMTagPanel$8$3
  implements Runnable
{
  MMTagPanel$8$3(MMTagPanel.8 param8, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106819);
    MMTagPanel.e(this.yxE.yxC).JR(((TextView)this.mqd).getText().toString());
    AppMethodBeat.o(106819);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanel.8.3
 * JD-Core Version:    0.6.2
 */