package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class SearchBarUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SearchBarUI$1(SearchBarUI paramSearchBarUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(112457);
    Object localObject = this.ypU;
    if (!((BaseActivity)localObject).yfa.isEmpty())
    {
      ((BaseActivity)localObject).yfa.clear();
      ((BaseActivity)localObject).supportInvalidateOptionsMenu();
    }
    ((SearchBarUI)localObject).ypT = new ab((Context)localObject);
    ((SearchBarUI)localObject).ypT.setSearchViewListener((ab.a)localObject);
    ((SearchBarUI)localObject).ypT.setHint(((SearchBarUI)localObject).getResources().getString(2131304136));
    ((SearchBarUI)localObject).getSupportActionBar().setCustomView(((SearchBarUI)localObject).ypT);
    paramMenuItem = (InputMethodManager)((Activity)localObject).getSystemService("input_method");
    if (paramMenuItem != null)
    {
      localObject = ((Activity)localObject).getCurrentFocus();
      if ((localObject != null) && (((View)localObject).getWindowToken() != null))
        paramMenuItem.toggleSoftInput(0, 2);
    }
    AppMethodBeat.o(112457);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.SearchBarUI.1
 * JD-Core Version:    0.6.2
 */