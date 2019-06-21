package com.tencent.mm.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class d
  implements View.OnClickListener
{
  private long iBO = 0L;
  private View.OnClickListener pLd;

  public void onClick(View paramView)
  {
    AppMethodBeat.i(49240);
    long l = System.currentTimeMillis();
    if (l - this.iBO >= 500L)
    {
      this.pLd.onClick(paramView);
      this.iBO = l;
    }
    AppMethodBeat.o(49240);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.d
 * JD-Core Version:    0.6.2
 */