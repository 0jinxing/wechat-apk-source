package com.tencent.mm.ui;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseActivity$2
  implements View.OnClickListener
{
  BaseActivity$2(BaseActivity paramBaseActivity, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112446);
    this.kiI.onMenuItemClick(null);
    AppMethodBeat.o(112446);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.BaseActivity.2
 * JD-Core Version:    0.6.2
 */