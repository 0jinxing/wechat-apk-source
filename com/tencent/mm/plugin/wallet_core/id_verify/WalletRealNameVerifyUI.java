package com.tencent.mm.plugin.wallet_core.id_verify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.id_verify.model.d;
import com.tencent.mm.plugin.wallet_core.id_verify.model.g;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tencent.mm.wallet_core.ui.formview.a.a;
import com.tencent.mm.wallet_core.ui.formview.a.b;

public class WalletRealNameVerifyUI extends WalletBaseUI
  implements View.OnClickListener, WalletFormView.a
{
  private String countryCode;
  private String fno;
  private String fnp;
  private Button gHn;
  private TextView nFy;
  private Profession[] tur;
  private WalletFormView tvo;
  private WalletFormView tvp;
  private WalletFormView tvq;
  private WalletFormView tvr;
  private CheckBox tvs;
  private TextView tvt;
  private ElementQuery tvu;
  private Profession tvv;
  private boolean tvw = false;
  private boolean tvx = false;

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    AppMethodBeat.i(46630);
    boolean bool3;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof d))
      {
        c localc = dOD();
        paramString = null;
        if (localc != null)
          paramString = localc.mqu;
        paramm = ((d)paramm).token;
        ab.i("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response succ");
        if (localc != null)
        {
          paramString.putString("key_real_name_token", paramm);
          paramString.putString("key_country_code", this.countryCode);
          paramString.putString("key_province_code", this.fnp);
          paramString.putString("key_city_code", this.fno);
          paramString.putParcelable("key_profession", this.tvv);
          localc.a(this, 0, paramString);
        }
        AppMethodBeat.o(46630);
        bool3 = bool2;
      }
    while (true)
    {
      return bool3;
      if ((paramm instanceof g))
      {
        paramString = (g)paramm;
        if (paramString.tup == 1);
        for (bool3 = true; ; bool3 = false)
        {
          this.tvw = bool3;
          bool3 = bool1;
          if (paramString.tuq == 1)
            bool3 = true;
          this.tvx = bool3;
          if (!this.tvx)
            this.tvq.setVisibility(8);
          if (!this.tvw)
            this.tvr.setVisibility(8);
          if ((this.tvw) || (this.tvx))
            this.tvt.setText(2131305251);
          this.tur = paramString.tvM;
          AppMethodBeat.o(46630);
          bool3 = bool2;
          break;
        }
        ab.e("MicroMsg.WalletRealNameVerifyUI", "NetSceneRealNameVerify response fail");
      }
      AppMethodBeat.o(46630);
      bool3 = false;
    }
  }

  public final int getLayoutId()
  {
    return 2130971159;
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(46632);
    ab.d("MicroMsg.WalletRealNameVerifyUI", "check info");
    String str1 = this.tvo.getText();
    String str2 = this.tvp.getText();
    int i;
    if (bo.isNullOrNil(str1))
      i = 0;
    while (true)
    {
      if (i == 0)
      {
        this.gHn.setEnabled(false);
        this.gHn.setClickable(false);
        AppMethodBeat.o(46632);
      }
      while (true)
      {
        return;
        if (bo.isNullOrNil(str2))
        {
          i = 0;
          break;
        }
        if (this.tvw)
        {
          if ((!bo.isNullOrNil(this.countryCode)) || (!bo.isNullOrNil(this.fnp)) || (!bo.isNullOrNil(this.fno)));
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              break label135;
            i = 0;
            break;
          }
        }
        label135: if ((!this.tvx) || (this.tvv != null))
          break label179;
        i = 0;
        break;
        this.gHn.setEnabled(true);
        this.gHn.setClickable(true);
        AppMethodBeat.o(46632);
      }
      label179: i = 1;
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(46629);
    setMMTitle(2131305256);
    this.gHn = ((Button)findViewById(2131822846));
    this.tvo = ((WalletFormView)findViewById(2131828681));
    this.tvp = ((WalletFormView)findViewById(2131826500));
    this.tvq = ((WalletFormView)findViewById(2131828724));
    this.tvr = ((WalletFormView)findViewById(2131828725));
    this.tvt = ((TextView)findViewById(2131828577));
    this.tvo.setOnInputValidChangeListener(this);
    this.tvp.setOnInputValidChangeListener(this);
    this.tvq.setOnInputValidChangeListener(this);
    this.tvr.setOnInputValidChangeListener(this);
    this.tvo.setFocusable(true);
    this.tvo.getInfoIv().setVisibility(8);
    com.tencent.mm.wallet_core.ui.formview.a.d(this.tvp);
    b localb = this.tvp.getLogicDelegate();
    if ((localb instanceof a.a))
      ((a.a)localb).QT(1);
    this.tvq.setOnClickListener(new WalletRealNameVerifyUI.1(this));
    this.tvr.setOnClickListener(new WalletRealNameVerifyUI.2(this));
    this.gHn.setOnClickListener(new WalletRealNameVerifyUI.3(this));
    e(this.tvp, 1, false);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(46623);
        paramAnonymousMenuItem = (a)WalletRealNameVerifyUI.this.dOD();
        if (paramAnonymousMenuItem != null)
          paramAnonymousMenuItem.c(WalletRealNameVerifyUI.this, 0);
        WalletRealNameVerifyUI.this.finish();
        AppMethodBeat.o(46623);
        return true;
      }
    });
    this.tvs = ((CheckBox)findViewById(2131828739));
    this.nFy = ((TextView)findViewById(2131829029));
    this.tvs.setChecked(true);
    this.tvs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(46624);
        if (paramAnonymousBoolean)
        {
          WalletRealNameVerifyUI.d(WalletRealNameVerifyUI.this).setEnabled(true);
          WalletRealNameVerifyUI.d(WalletRealNameVerifyUI.this).setClickable(true);
          AppMethodBeat.o(46624);
        }
        while (true)
        {
          return;
          WalletRealNameVerifyUI.d(WalletRealNameVerifyUI.this).setEnabled(false);
          WalletRealNameVerifyUI.d(WalletRealNameVerifyUI.this).setClickable(false);
          AppMethodBeat.o(46624);
        }
      }
    });
    this.nFy.setOnClickListener(new WalletRealNameVerifyUI.6(this));
    AppMethodBeat.o(46629);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(46631);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
      if (paramInt2 == -1)
      {
        this.tvv = ((Profession)paramIntent.getParcelableExtra("key_select_profession"));
        this.tvq.setText(this.tvv.tvN);
        AppMethodBeat.o(46631);
      }
    while (true)
    {
      return;
      ab.i("MicroMsg.WalletRealNameVerifyUI", "no choose!");
      AppMethodBeat.o(46631);
      continue;
      if (paramInt1 == 2)
      {
        if (paramInt2 == -1)
        {
          String str1 = paramIntent.getStringExtra("CountryName");
          String str2 = paramIntent.getStringExtra("ProviceName");
          String str3 = paramIntent.getStringExtra("CityName");
          this.countryCode = paramIntent.getStringExtra("Country");
          this.fnp = paramIntent.getStringExtra("Contact_Province");
          this.fno = paramIntent.getStringExtra("Contact_City");
          paramIntent = new StringBuilder();
          if (!bo.isNullOrNil(str1))
            paramIntent.append(str1);
          if (!bo.isNullOrNil(str2))
            paramIntent.append(" ").append(str2);
          if (!bo.isNullOrNil(str3))
            paramIntent.append(" ").append(str3);
          this.tvr.setText(paramIntent.toString());
          AppMethodBeat.o(46631);
        }
        else
        {
          ab.i("MicroMsg.WalletRealNameVerifyUI", "no area choose!");
        }
      }
      else
        AppMethodBeat.o(46631);
    }
  }

  public void onClick(View paramView)
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46627);
    super.onCreate(paramBundle);
    this.Ahr.nf(1616);
    this.tvu = ((ElementQuery)this.mBundle.getParcelable("elemt_query"));
    initView();
    a(new g(), true, false);
    AppMethodBeat.o(46627);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46628);
    this.Ahr.ng(1616);
    super.onDestroy();
    AppMethodBeat.o(46628);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI
 * JD-Core Version:    0.6.2
 */