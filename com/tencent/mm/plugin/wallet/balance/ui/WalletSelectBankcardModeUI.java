package com.tencent.mm.plugin.wallet.balance.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Iterator;

public class WalletSelectBankcardModeUI extends WalletBaseUI
{
  private ListView Ej;
  private int emC;
  private ArrayList<WalletSelectBankcardModeUI.a> mData;
  private ArrayList<Bankcard> tgB;
  private Bankcard tgC;
  private String tgD;
  private int tgO;
  private int tgS;
  private TextView thQ;
  private WalletSelectBankcardModeUI.b thR;

  public WalletSelectBankcardModeUI()
  {
    AppMethodBeat.i(45494);
    this.emC = 0;
    this.tgO = 0;
    this.mData = new ArrayList();
    this.tgS = -1;
    AppMethodBeat.o(45494);
  }

  public final boolean bNf()
  {
    return false;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971164;
  }

  public final void initView()
  {
    AppMethodBeat.i(45496);
    setMMTitle(2131304581);
    setBackBtn(new WalletSelectBankcardModeUI.1(this));
    this.thQ = ((TextView)findViewById(2131829050));
    Object localObject;
    label200: int i;
    label254: Bankcard localBankcard;
    if (this.emC == 0)
    {
      this.thQ.setText(2131305351);
      this.Ej = ((ListView)findViewById(2131829051));
      this.thR = new WalletSelectBankcardModeUI.b(this);
      this.Ej.setAdapter(this.thR);
      this.Ej.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          AppMethodBeat.i(45490);
          WalletSelectBankcardModeUI.a(WalletSelectBankcardModeUI.this, paramAnonymousInt);
          WalletSelectBankcardModeUI.a(WalletSelectBankcardModeUI.this).notifyDataSetChanged();
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.putExtra("key_select_index", paramAnonymousInt);
          WalletSelectBankcardModeUI.this.setResult(-1, paramAnonymousAdapterView);
          ab.i("MicroMsg.WalletSelectBankcardModeUI", "onItemClick pos is ".concat(String.valueOf(paramAnonymousInt)));
          WalletSelectBankcardModeUI.this.finish();
          AppMethodBeat.o(45490);
        }
      });
      this.mData.clear();
      this.tgD = getString(2131304573);
      if (this.emC != 0)
        break label561;
      s.cNC();
      localObject = s.cND();
      this.tgB = ((ak)localObject).cQD();
      this.tgC = ((ak)localObject).a(this.tgB, null, false, true);
      if (((ak)localObject).tCX == null)
        break label397;
      this.tgO = ((ak)localObject).tCX.tgO;
      ab.e("MicroMsg.WalletSelectBankcardModeUI", "is_show_charge is " + this.tgO);
      if ((this.tgB == null) || (this.tgB.size() <= 0))
        break label574;
      ab.i("MicroMsg.WalletSelectBankcardModeUI", "mBankcardList size is " + this.tgB.size());
      Iterator localIterator = this.tgB.iterator();
      i = 0;
      if (!localIterator.hasNext())
        break label508;
      localBankcard = (Bankcard)localIterator.next();
      localObject = new WalletSelectBankcardModeUI.a((byte)0);
      ((WalletSelectBankcardModeUI.a)localObject).title = localBankcard.field_desc;
      if ((localBankcard.field_fetch_charge_rate <= 0.0D) || (this.tgO != 1))
        break label455;
      if (TextUtils.isEmpty(localBankcard.field_fetch_charge_info))
        break label412;
      ((WalletSelectBankcardModeUI.a)localObject).kfM = localBankcard.field_fetch_charge_info;
    }
    while (true)
    {
      this.mData.add(localObject);
      if ((this.tgS == -1) && (this.tgC != null) && (this.tgC.equals(localBankcard)))
        this.tgS = i;
      i++;
      break label254;
      if (this.emC != 1)
        break;
      this.thQ.setText(2131305352);
      break;
      label397: this.tgO = 0;
      ab.e("MicroMsg.WalletSelectBankcardModeUI", "userInfo.getBalanceFetchInfo() is null");
      break label200;
      label412: ((WalletSelectBankcardModeUI.a)localObject).kfM = (getString(2131304531) + localBankcard.field_fetch_charge_rate * 100.0D + "%");
      continue;
      label455: ab.i("MicroMsg.WalletSelectBankcardModeUI", "the bank " + localBankcard.field_desc + " field_fetch_charge_rate is " + localBankcard.field_fetch_charge_rate + " is_show_charge is " + this.tgO);
    }
    label508: if ((this.tgS == -1) && (this.tgC == null))
      this.tgS = i;
    while (true)
    {
      localObject = new WalletSelectBankcardModeUI.a((byte)0);
      ((WalletSelectBankcardModeUI.a)localObject).title = this.tgD;
      ((WalletSelectBankcardModeUI.a)localObject).kfM = "";
      this.mData.add(localObject);
      label561: this.thR.notifyDataSetChanged();
      AppMethodBeat.o(45496);
      return;
      label574: ab.i("MicroMsg.WalletSelectBankcardModeUI", "hy: no bankcard show new only");
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45495);
    super.onCreate(paramBundle);
    setResult(0);
    this.emC = getIntent().getIntExtra("key_scene_select_bankcard_mode_ui", 0);
    this.tgS = getIntent().getIntExtra("key_select_index", -1);
    ab.i("MicroMsg.WalletSelectBankcardModeUI", "onCreate() mFromScene is " + this.emC);
    initView();
    AppMethodBeat.o(45495);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(45497);
    if (paramInt == 4)
    {
      setResult(0);
      finish();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(45497);
    return bool;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletSelectBankcardModeUI
 * JD-Core Version:    0.6.2
 */