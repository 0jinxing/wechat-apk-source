package com.tencent.mm.plugin.aa.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.aa.a.c.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.wallet_core.ui.g;

public class AAQueryListUI extends BaseAAPresenterActivity
{
  private com.tencent.mm.plugin.aa.a.c.b gnk;
  private ListView gnl;
  private b gnm;
  private Dialog gnn;
  private boolean gno;
  private boolean gnp;
  private View gnq;
  private AAQueryListH5UrlFooterView gnr;
  private String gns;
  private int mode;

  public AAQueryListUI()
  {
    AppMethodBeat.i(40737);
    this.gnk = ((com.tencent.mm.plugin.aa.a.c.b)V(com.tencent.mm.plugin.aa.a.c.b.class));
    this.gno = false;
    this.gnp = false;
    this.mode = 1;
    AppMethodBeat.o(40737);
  }

  private void h(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(40739);
    if (this.gno)
    {
      ab.i("MicroMsg.AAQueryListUI", "getNextPage, loading");
      AppMethodBeat.o(40739);
    }
    while (true)
    {
      return;
      if (paramBoolean)
      {
        this.gnp = false;
        this.gnl.removeFooterView(this.gnr);
      }
      this.gno = true;
      this.gnk.gmD.g(paramBoolean, paramInt).f(new AAQueryListUI.6(this, paramBoolean)).a(new AAQueryListUI.5(this));
      AppMethodBeat.o(40739);
    }
  }

  public final int getLayoutId()
  {
    return 2130968579;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(40740);
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      boolean bool = paramIntent.getBooleanExtra("close_aa", false);
      int i = paramIntent.getIntExtra("item_position", 0);
      int j = paramIntent.getIntExtra("item_offset", 0);
      if (bool)
      {
        this.gnl.setSelectionFromTop(i, j);
        h(true, this.mode);
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(40740);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(40738);
    super.onCreate(paramBundle);
    setBackBtn(new AAQueryListUI.1(this));
    setMMTitle(2131296368);
    addIconOptionMenu(0, 2130839555, new AAQueryListUI.4(this));
    this.gnl = ((ListView)findViewById(2131820894));
    this.gnl.setOnScrollListener(new AAQueryListUI.2(this));
    this.gnl.setOnItemClickListener(new AAQueryListUI.3(this));
    this.gnq = new AAQueryListLoadingMoreView(this);
    this.gnr = new AAQueryListH5UrlFooterView(this);
    this.gnn = g.a(this, false, null);
    this.gnm = new b(this, this.mode);
    this.gnl.setAdapter(this.gnm);
    this.gnl.setVisibility(4);
    h(false, this.mode);
    AppMethodBeat.o(40738);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AAQueryListUI
 * JD-Core Version:    0.6.2
 */