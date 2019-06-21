package com.tencent.mm.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public abstract class SearchBarUI extends BaseActivity
  implements ab.a
{
  ab ypT;

  public void onClickBackBtn(View paramView)
  {
    finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = BaseActivity.c.yft;
    SearchBarUI.1 local1 = new SearchBarUI.1(this);
    BaseActivity.b localb = new BaseActivity.b();
    localb.yfi = 0;
    localb.yfj = 0;
    localb.text = "";
    localb.gzB = local1;
    localb.mlV = null;
    localb.yfn = paramBundle;
    if ((localb.yfj == 2130837619) && ("".length() <= 0))
      localb.text = getString(2131296390);
    int i = localb.yfi;
    for (int j = 0; ; j++)
      if (j < this.yfa.size())
      {
        if (((BaseActivity.b)this.yfa.get(j)).yfi == i)
        {
          ai.d("BaseActivity", "match menu, id ：" + i + ", remove it", new Object[0]);
          this.yfa.remove(j);
        }
      }
      else
      {
        this.yfa.add(localb);
        new Handler().postDelayed(new BaseActivity.6(this), 200L);
        setBackBtn(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            AppMethodBeat.i(112458);
            SearchBarUI.this.finish();
            AppMethodBeat.o(112458);
            return true;
          }
        });
        return;
      }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.SearchBarUI
 * JD-Core Version:    0.6.2
 */