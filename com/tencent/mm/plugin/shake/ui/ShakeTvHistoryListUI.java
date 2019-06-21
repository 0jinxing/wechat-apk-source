package com.tencent.mm.plugin.shake.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.shake.d.a.n;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.j;

public class ShakeTvHistoryListUI extends MMActivity
{
  private n.d jKa;
  private ShakeTvHistoryListUI.a qwv;
  private ListView qww;
  private String username;

  public ShakeTvHistoryListUI()
  {
    AppMethodBeat.i(24903);
    this.jKa = new ShakeTvHistoryListUI.5(this);
    AppMethodBeat.o(24903);
  }

  public final int getLayoutId()
  {
    return 2130970661;
  }

  public final void initView()
  {
    AppMethodBeat.i(24906);
    setMMTitle(2131303482);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(24892);
        ShakeTvHistoryListUI.this.aqX();
        ShakeTvHistoryListUI.this.finish();
        AppMethodBeat.o(24892);
        return true;
      }
    });
    addTextOptionMenu(0, getString(2131296871), new ShakeTvHistoryListUI.2(this));
    this.qww = ((ListView)findViewById(2131827534));
    this.qwv = new ShakeTvHistoryListUI.a(this, this);
    this.qww.setAdapter(this.qwv);
    this.qww.setOnItemClickListener(new ShakeTvHistoryListUI.3(this));
    j localj = new j(this);
    this.qww.setOnItemLongClickListener(new ShakeTvHistoryListUI.4(this, localj));
    AppMethodBeat.o(24906);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24904);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(24904);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(24907);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.username = ((n)this.qwv.getItem(paramView.position)).field_username;
    paramContextMenu.add(paramView.position, 0, 0, 2131296881);
    AppMethodBeat.o(24907);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24905);
    this.qwv.bIf();
    super.onDestroy();
    AppMethodBeat.o(24905);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a$a
  {
    TextView iDT;
    TextView nSC;
    MMImageView qwz;

    a$a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI
 * JD-Core Version:    0.6.2
 */