package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMTagPanel$4
  implements View.OnClickListener
{
  MMTagPanel$4(MMTagPanel paramMMTagPanel)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(106813);
    ab.d("MicroMsg.MMTagPanel", "on edittext click");
    this.yxC.dAf();
    if (MMTagPanel.e(this.yxC) != null)
      MMTagPanel.e(this.yxC).bmm();
    AppMethodBeat.o(106813);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanel.4
 * JD-Core Version:    0.6.2
 */