package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.e;
import com.tencent.mm.plugin.remittance.bankcard.a.i;
import com.tencent.mm.protocal.protobuf.atf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.List;

public class BankRemitHistoryUI extends BankRemitBaseUI
  implements n.d
{
  private boolean gno;
  private boolean gnp;
  private j icA;
  private List<atf> kPz;
  private View leb;
  private int limit;
  private int offset;
  private ListView pNq;
  private BankRemitHistoryUI.a pNr;

  public BankRemitHistoryUI()
  {
    AppMethodBeat.i(44620);
    this.kPz = new ArrayList();
    this.gno = false;
    this.gnp = false;
    this.limit = 20;
    this.offset = 0;
    AppMethodBeat.o(44620);
  }

  private void cfk()
  {
    AppMethodBeat.i(44627);
    ab.i("MicroMsg.BankRemitHistoryUI", "fetch data: %s, %s", new Object[] { Integer.valueOf(this.limit), Integer.valueOf(this.offset) });
    this.gno = true;
    i locali = new i(this.limit, this.offset);
    locali.o(this);
    a(locali, false, false);
    AppMethodBeat.o(44627);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44625);
    if ((paramm instanceof i))
    {
      paramString = (i)paramm;
      paramString.a(new BankRemitHistoryUI.5(this, paramString)).b(new BankRemitHistoryUI.4(this, paramString)).c(new BankRemitHistoryUI.3(this));
      this.gno = false;
    }
    while (true)
    {
      AppMethodBeat.o(44625);
      return false;
      if ((paramm instanceof e))
      {
        paramString = (e)paramm;
        paramString.a(new BankRemitHistoryUI.8(this, paramString)).b(new BankRemitHistoryUI.7(this, paramString)).c(new BankRemitHistoryUI.6(this));
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130968819;
  }

  public final void initView()
  {
    AppMethodBeat.i(44622);
    this.pNq = ((ListView)findViewById(2131821671));
    this.leb = LayoutInflater.from(this).inflate(2130968581, null);
    this.icA = new j(this);
    this.pNr = new BankRemitHistoryUI.a(this, (byte)0);
    this.pNq.addFooterView(this.leb);
    this.pNq.setAdapter(this.pNr);
    this.pNq.setOnItemLongClickListener(new BankRemitHistoryUI.1(this));
    this.pNq.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        AppMethodBeat.i(44607);
        if ((BankRemitHistoryUI.b(BankRemitHistoryUI.this).getLastVisiblePosition() == BankRemitHistoryUI.b(BankRemitHistoryUI.this).getCount() - 1) && (BankRemitHistoryUI.b(BankRemitHistoryUI.this).getCount() > 0) && (!BankRemitHistoryUI.c(BankRemitHistoryUI.this)) && (!BankRemitHistoryUI.d(BankRemitHistoryUI.this)))
          BankRemitHistoryUI.e(BankRemitHistoryUI.this);
        AppMethodBeat.o(44607);
      }

      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
      }
    });
    AppMethodBeat.o(44622);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44621);
    super.onCreate(paramBundle);
    nf(1511);
    nf(1737);
    setMMTitle(2131297464);
    initView();
    cfk();
    AppMethodBeat.o(44621);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(44623);
    paramContextMenu.add(0, 1, 0, 2131297480);
    AppMethodBeat.o(44623);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(44626);
    super.onDestroy();
    ng(1511);
    ng(1737);
    AppMethodBeat.o(44626);
  }

  public void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(44624);
    Object localObject = (AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo();
    localObject = (atf)this.pNq.getItemAtPosition(((AdapterView.AdapterContextMenuInfo)localObject).position);
    if ((paramMenuItem.getItemId() == 1) && (localObject != null))
    {
      paramMenuItem = ((atf)localObject).vPX;
      ab.i("MicroMsg.BankRemitHistoryUI", "delete record: %s", new Object[] { paramMenuItem });
      paramMenuItem = new e(paramMenuItem);
      paramMenuItem.o(this);
      a(paramMenuItem, true, true);
    }
    AppMethodBeat.o(44624);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitHistoryUI
 * JD-Core Version:    0.6.2
 */