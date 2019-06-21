package com.tencent.mm.ui.tools;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.sortlist.DragSortListView;
import com.tencent.mm.ui.widget.sortlist.DragSortListView.h;
import java.util.List;

public class MoreShareAppUI extends MMActivity
{
  private DragSortListView lar;
  private List<f> yqo;
  private MoreShareAppUI.a zGm;

  public final int getLayoutId()
  {
    return 2130970244;
  }

  public final void initView()
  {
    AppMethodBeat.i(34889);
    setMMTitle(2131297743);
    this.lar = ((DragSortListView)findViewById(2131821698));
    this.lar.setDropListener(new DragSortListView.h()
    {
      public final void dm(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(34884);
        f localf = (f)MoreShareAppUI.a(MoreShareAppUI.this).getItem(paramAnonymousInt1);
        MoreShareAppUI.a.a(MoreShareAppUI.a(MoreShareAppUI.this)).remove(paramAnonymousInt1);
        MoreShareAppUI.a(MoreShareAppUI.this).notifyDataSetChanged();
        MoreShareAppUI.a(MoreShareAppUI.this).insert(localf, paramAnonymousInt2);
        AppMethodBeat.o(34884);
      }
    });
    AppMethodBeat.o(34889);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34888);
    super.onCreate(paramBundle);
    initView();
    setBackBtn(new MoreShareAppUI.2(this));
    addTextOptionMenu(0, getString(2131299083), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        return false;
      }
    });
    this.zGm = new MoreShareAppUI.a(this, this.yqo);
    this.lar.setAdapter(this.zGm);
    AppMethodBeat.o(34888);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MoreShareAppUI
 * JD-Core Version:    0.6.2
 */