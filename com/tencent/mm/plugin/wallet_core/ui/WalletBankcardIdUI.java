package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.um;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.t;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.utils.d;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.ListViewInScrollView;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class WalletBankcardIdUI extends WalletBaseUI
  implements WalletFormView.a
{
  private Button gEZ;
  private int gOW;
  protected WalletFormView tEp;
  protected WalletFormView tEq;
  private Bankcard tEr;
  private WalletBankcardIdUI.a tEs;
  private boolean tEt;
  private boolean tEu;
  com.tencent.mm.sdk.b.c tmk;
  com.tencent.mm.sdk.b.c trF;

  public WalletBankcardIdUI()
  {
    AppMethodBeat.i(47174);
    this.tEt = false;
    this.gOW = -1;
    this.tmk = new com.tencent.mm.sdk.b.c()
    {
    };
    this.trF = new WalletBankcardIdUI.2(this);
    AppMethodBeat.o(47174);
  }

  private boolean arW()
  {
    boolean bool = true;
    AppMethodBeat.i(47181);
    if (this.tEp.fx(null))
    {
      this.gEZ.setEnabled(true);
      this.gEZ.setClickable(true);
      AppMethodBeat.o(47181);
    }
    while (true)
    {
      return bool;
      this.gEZ.setEnabled(false);
      this.gEZ.setClickable(false);
      AppMethodBeat.o(47181);
      bool = false;
    }
  }

  protected final void ari()
  {
    AppMethodBeat.i(47178);
    if (dOD() == null)
    {
      ab.e("Micromsg.WalletInputCardIDUI", "WalletBankcardIdUI doNext, process is null");
      AppMethodBeat.o(47178);
    }
    while (true)
    {
      return;
      String str = dOD().mqu.getString("kreq_token");
      int i = this.mBundle.getInt("entry_scene", -1);
      Object localObject;
      if (this.tEr != null)
      {
        localObject = new t(cNH(), null, (PayInfo)this.mBundle.getParcelable("key_pay_info"), str, this.gOW, i);
        ((t)localObject).pNL = this.tEr.field_bankcardType;
        this.mBundle.putParcelable("key_history_bankcard", this.tEr);
        a((m)localObject, true, true);
        AppMethodBeat.o(47178);
      }
      else if (arW())
      {
        localObject = this.tEp.getText();
        a(new t(cNH(), (String)localObject, (PayInfo)this.mBundle.getParcelable("key_pay_info"), str, this.gOW, i), true, true);
        AppMethodBeat.o(47178);
      }
      else
      {
        h.g(this, 2131305020, 2131297061);
        AppMethodBeat.o(47178);
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool1 = true;
    AppMethodBeat.i(47180);
    ab.d("Micromsg.WalletInputCardIDUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    paramString = new Bundle();
    boolean bool2;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof t))
      {
        paramm = (t)paramm;
        paramString.putBoolean("key_need_area", paramm.cOU());
        paramString.putBoolean("key_need_profession", paramm.cOV());
        paramString.putParcelableArray("key_profession_list", paramm.tur);
        if (paramm.tus == 1)
        {
          bool2 = true;
          paramString.putBoolean("key_need_country", bool2);
          paramString.putStringArray("key_country_excludes", paramm.tut);
          if (paramm.tun == null)
            break label260;
          if ((!paramm.tun.tyC) || (!paramm.tun.isError()))
            break label201;
          h.g(this, 2131304582, 2131297061);
          AppMethodBeat.o(47180);
          bool2 = bool1;
        }
      }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label201: paramString.putString("bank_name", paramm.tun.nuL);
      paramString.putParcelable("elemt_query", paramm.tun);
      paramString.putString("key_card_id", this.tEp.getText());
      com.tencent.mm.wallet_core.a.j(this, paramString);
      AppMethodBeat.o(47180);
      bool2 = bool1;
      continue;
      label260: paramString.putString("bank_name", "");
      paramString.putParcelable("elemt_query", new ElementQuery());
      paramString.putString("key_card_id", this.tEp.getText());
      com.tencent.mm.wallet_core.a.j(this, paramString);
      do
      {
        AppMethodBeat.o(47180);
        bool2 = false;
        break;
      }
      while ((paramInt2 != 1) || (!(paramm instanceof t)));
      paramString.putString("bank_name", "");
      paramString.putParcelable("elemt_query", new ElementQuery());
      paramString.putString("key_card_id", this.tEp.getText());
      com.tencent.mm.wallet_core.a.j(this, paramString);
      AppMethodBeat.o(47180);
      bool2 = bool1;
    }
  }

  public final boolean cNR()
  {
    return true;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971063;
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(47182);
    if (!paramBoolean)
    {
      this.tEr = null;
      this.mBundle.putParcelable("key_history_bankcard", null);
    }
    arW();
    AppMethodBeat.o(47182);
  }

  public final void initView()
  {
    AppMethodBeat.i(47177);
    this.gEZ = ((Button)findViewById(2131822846));
    this.tEp = ((WalletFormView)findViewById(2131826500));
    com.tencent.mm.wallet_core.ui.formview.a.b(this.tEp);
    this.tEq = ((WalletFormView)findViewById(2131828681));
    Object localObject1;
    label124: Object localObject2;
    if (this.mBundle.getBoolean("key_bind_show_change_card", false))
    {
      com.tencent.mm.wallet_core.ui.formview.a.d(this, this.tEq);
      this.tEp.setOnInputValidChangeListener(this);
      this.gEZ.setOnClickListener(new WalletBankcardIdUI.3(this));
      localObject1 = dOD();
      if (localObject1 == null)
        break label675;
      this.tEu = ((com.tencent.mm.wallet_core.c)localObject1).mqu.getBoolean("key_is_realname_verify_process", false);
      if (!this.tEu)
        break label683;
      setMMTitle(2131305256);
      label138: localObject1 = (TextView)findViewById(2131828577);
      if ((!r.cPI().cQi()) && (!r.cPI().cQh()))
        break label693;
      localObject2 = new j(this);
      ((j)localObject2).tHw = new WalletBankcardIdUI.4(this);
      Object localObject3 = getString(2131304863);
      SpannableString localSpannableString = new SpannableString((CharSequence)localObject3);
      localSpannableString.setSpan(localObject2, ((String)localObject3).length() - 6, ((String)localObject3).length(), 33);
      ((TextView)localObject1).setText(localSpannableString);
      ((TextView)localObject1).setMovementMethod(LinkMovementMethod.getInstance());
      label238: localObject2 = (FavorPayInfo)this.mBundle.getParcelable("key_favor_pay_info");
      localObject1 = (Orders)this.mBundle.getParcelable("key_orders");
      if ((localObject2 != null) && (localObject1 != null))
      {
        localObject3 = c.tDU.a((Orders)localObject1);
        localObject1 = (TextView)findViewById(2131828682);
        if (localObject3 == null)
          break label733;
        localObject2 = ((b)localObject3).acT(((b)localObject3).acW(((FavorPayInfo)localObject2).tzb));
        if (((List)localObject2).size() <= 0)
          break label724;
        this.tEs = new WalletBankcardIdUI.a(this.mController.ylL, (List)localObject2);
        ((TextView)localObject1).setText(2131304861);
        ((TextView)localObject1).setOnClickListener(new WalletBankcardIdUI.5(this));
        ((TextView)localObject1).setVisibility(0);
      }
      label362: localObject1 = r.cPI();
      if ((!((ak)localObject1).cQg()) || (((ak)localObject1).bhp() == null) || (bo.isNullOrNil(((ak)localObject1).bhp().trim())) || (!((ak)localObject1).cQp()))
        break label750;
      this.tEq.setVisibility(0);
      this.tEq.setText(((ak)localObject1).bhp());
      this.tEp.setHint(getString(2131304691));
      this.tEq.setClickable(false);
      this.tEq.setEnabled(false);
    }
    while (true)
    {
      if ((this.mBundle.getInt("key_bind_scene") == 18) || (this.mBundle.getInt("key_bind_scene") == 19))
        this.tEp.setHint(getString(2131304867));
      g.RQ();
      localObject1 = (String)g.RP().Ry().get(ac.a.xJQ, null);
      if (!bo.isNullOrNil((String)localObject1))
        this.tEp.setHint((CharSequence)localObject1);
      this.tEr = ((Bankcard)this.mBundle.getParcelable("key_history_bankcard"));
      if (this.tEr != null)
      {
        this.tEp.setText(this.tEr.twO);
        this.tEp.a(new WalletBankcardIdUI.6(this));
      }
      arW();
      d.a(this, this.mBundle, 2);
      e(this.tEp, 0, false);
      this.tEp.setOnInfoIvClickListener(new WalletBankcardIdUI.7(this));
      if (r.cPI().cQo().cPX())
      {
        this.tEp.getInfoIv().setVisibility(0);
        this.tEp.getInfoIv().setImageResource(2131232128);
      }
      AppMethodBeat.o(47177);
      return;
      com.tencent.mm.wallet_core.ui.formview.a.e(this, this.tEq);
      break;
      label675: this.tEu = false;
      break label124;
      label683: setMMTitle(2131304869);
      break label138;
      label693: ((TextView)localObject1).setVisibility(0);
      localObject2 = this.mBundle.getString("key_custom_bind_tips");
      if (bo.isNullOrNil((String)localObject2))
        break label238;
      ((TextView)localObject1).setText((CharSequence)localObject2);
      break label238;
      label724: ((TextView)localObject1).setVisibility(8);
      break label362;
      label733: ab.w("Micromsg.WalletInputCardIDUI", "favorlogichelper null");
      ((TextView)localObject1).setVisibility(8);
      break label362;
      label750: this.tEq.setVisibility(8);
      this.tEp.setHint(getString(2131304865));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47175);
    super.onCreate(paramBundle);
    setMMTitle(2131304869);
    initView();
    com.tencent.mm.sdk.b.a.xxA.c(this.tmk);
    com.tencent.mm.sdk.b.a.xxA.c(this.trF);
    this.gOW = this.mBundle.getInt("key_bind_scene");
    AppMethodBeat.o(47175);
  }

  public Dialog onCreateDialog(int paramInt)
  {
    AppMethodBeat.i(47179);
    Object localObject1;
    Object localObject2;
    if (paramInt == 1)
    {
      localObject1 = getLayoutInflater().inflate(2130971114, null);
      ((ListViewInScrollView)((View)localObject1).findViewById(2131821054)).setAdapter(this.tEs);
      localObject2 = new c.a(this);
      ((c.a)localObject2).PV(2131304860);
      ((c.a)localObject2).fn((View)localObject1);
      ((c.a)localObject2).f(null);
      ((c.a)localObject2).Qc(2131304829);
      localObject2 = ((c.a)localObject2).aMb();
      AppMethodBeat.o(47179);
      return localObject2;
    }
    if ((this.tEu) && (paramInt == 1000))
    {
      localObject2 = getString(2131304862);
      localObject1 = com.tencent.mm.wallet_core.a.aE(this);
      if (localObject1 == null)
        break label202;
    }
    label202: for (paramInt = ((com.tencent.mm.wallet_core.c)localObject1).a(this, 1); ; paramInt = -1)
    {
      if (paramInt != -1)
        localObject2 = getString(paramInt);
      localObject2 = h.a(this, true, (String)localObject2, "", getString(2131297088), getString(2131296990), new WalletBankcardIdUI.8(this), new WalletBankcardIdUI.9(this));
      AppMethodBeat.o(47179);
      break;
      localObject2 = super.onCreateDialog(paramInt);
      AppMethodBeat.o(47179);
      break;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47176);
    com.tencent.mm.sdk.b.a.xxA.d(this.tmk);
    com.tencent.mm.sdk.b.a.xxA.d(this.trF);
    super.onDestroy();
    AppMethodBeat.o(47176);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI
 * JD-Core Version:    0.6.2
 */