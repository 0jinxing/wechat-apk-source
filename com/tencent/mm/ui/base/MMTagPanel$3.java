package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMTagPanel$3
  implements View.OnFocusChangeListener
{
  MMTagPanel$3(MMTagPanel paramMMTagPanel)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(106812);
    ab.d("MicroMsg.MMTagPanel", "on edittext focus changed %B", new Object[] { Boolean.valueOf(paramBoolean) });
    if ((paramBoolean) && (MMTagPanel.e(this.yxC) != null))
      MMTagPanel.e(this.yxC).bmm();
    AppMethodBeat.o(106812);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanel.3
 * JD-Core Version:    0.6.2
 */