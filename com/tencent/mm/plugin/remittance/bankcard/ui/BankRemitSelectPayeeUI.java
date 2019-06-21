package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.f;
import com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.ui.view.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.c.p.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BankRemitSelectPayeeUI extends BankRemitBaseUI
  implements n.d
{
  private com.tencent.mm.ui.tools.j icA;
  private ListView pOg;
  private BankRemitSelectPayeeUI.b pOh;
  private List<TransferRecordParcel> pOi;
  private ArrayList<TransferRecordParcel> pOj;
  private ArrayList<String> pOk;
  private int pOl = -1;
  private int pOm = -1;
  private Intent pOn;

  public final boolean c(int paramInt1, int paramInt2, final String paramString, m paramm)
  {
    AppMethodBeat.i(44694);
    if ((paramm instanceof com.tencent.mm.plugin.remittance.bankcard.a.j))
    {
      paramString = (com.tencent.mm.plugin.remittance.bankcard.a.j)paramm;
      paramString.a(new BankRemitSelectPayeeUI.8(this, paramString)).b(new BankRemitSelectPayeeUI.7(this, paramString)).c(new BankRemitSelectPayeeUI.6(this));
    }
    while (true)
    {
      AppMethodBeat.o(44694);
      return false;
      if ((paramm instanceof f))
      {
        paramString = (f)paramm;
        paramString.a(new p.a()
        {
          public final void e(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
          {
            AppMethodBeat.i(44672);
            BankRemitSelectPayeeUI.a(BankRemitSelectPayeeUI.this, paramString.pLt);
            AppMethodBeat.o(44672);
          }
        }).b(new BankRemitSelectPayeeUI.10(this, paramString)).c(new BankRemitSelectPayeeUI.9(this));
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130968828;
  }

  public final void initView()
  {
    AppMethodBeat.i(44690);
    this.pOg = ((ListView)findViewById(2131821693));
    this.icA = new com.tencent.mm.ui.tools.j(this);
    this.pOh = new BankRemitSelectPayeeUI.b(this, (byte)0);
    this.pOg.setAdapter(this.pOh);
    this.pOg.setOnItemClickListener(new BankRemitSelectPayeeUI.1(this));
    this.pOg.setOnItemLongClickListener(new BankRemitSelectPayeeUI.3(this));
    AppMethodBeat.o(44690);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44689);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getParcelableArrayListExtra("key_self_transfer_record_list");
    Object localObject = getIntent().getParcelableArrayListExtra("key_freq_transfer_record_list");
    this.pOi = new ArrayList();
    if ((paramBundle != null) && (!paramBundle.isEmpty()))
    {
      this.pOl = 0;
      this.pOi.addAll(paramBundle);
    }
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      this.pOm = (this.pOi.size() + this.pOl + 1);
      this.pOi.addAll((Collection)localObject);
    }
    ab.i("MicroMsg.BankRemitSelectPayeeUI", "selfHeaderPos: %s, otherHeaderPos: %s", new Object[] { Integer.valueOf(this.pOl), Integer.valueOf(this.pOm) });
    paramBundle = this.pOi.iterator();
    while (paramBundle.hasNext())
    {
      localObject = (TransferRecordParcel)paramBundle.next();
      ab.d("MicroMsg.BankRemitSelectPayeeUI", "seqno: %s, tail: %s, bank_logo: %s, bank_name: %s, bank_type: %s, payee: %s, explain: %s", new Object[] { ((TransferRecordParcel)localObject).pMd, ((TransferRecordParcel)localObject).pMe, ((TransferRecordParcel)localObject).pLH, ((TransferRecordParcel)localObject).nuL, ((TransferRecordParcel)localObject).pbn, ((TransferRecordParcel)localObject).pMf, ((TransferRecordParcel)localObject).pMg });
    }
    this.pOn = new Intent();
    initView();
    setMMTitle(2131297485);
    nf(1590);
    nf(1395);
    AppMethodBeat.o(44689);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(44691);
    paramContextMenu.add(0, 1, 0, 2131297483);
    paramContextMenu.add(0, 0, 0, 2131297480);
    AppMethodBeat.o(44691);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(44693);
    super.onDestroy();
    ng(1590);
    ng(1395);
    AppMethodBeat.o(44693);
  }

  public void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(44692);
    paramInt = paramMenuItem.getItemId();
    paramMenuItem = (AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo();
    paramMenuItem = (TransferRecordParcel)this.pOg.getItemAtPosition(paramMenuItem.position);
    if (paramMenuItem == null)
    {
      ab.i("MicroMsg.BankRemitSelectPayeeUI", "select record is null");
      AppMethodBeat.o(44692);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
      {
        a.a(this, getString(2131298361), paramMenuItem.pMg, "", 32, new BankRemitSelectPayeeUI.4(this, paramMenuItem), new BankRemitSelectPayeeUI.5(this));
        AppMethodBeat.o(44692);
      }
      else if (paramInt == 0)
      {
        paramMenuItem = paramMenuItem.pMd;
        ab.i("MicroMsg.BankRemitSelectPayeeUI", "do delete record");
        a(new f(paramMenuItem), true, false);
        h.pYm.e(14673, new Object[] { Integer.valueOf(7) });
        AppMethodBeat.o(44692);
      }
      else
      {
        ab.i("MicroMsg.BankRemitSelectPayeeUI", "unknown itemId: %s", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(44692);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI
 * JD-Core Version:    0.6.2
 */