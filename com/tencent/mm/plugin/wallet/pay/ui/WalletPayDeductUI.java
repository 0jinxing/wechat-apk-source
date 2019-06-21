package com.tencent.mm.plugin.wallet.pay.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DeductInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.DeductShowInfo;
import com.tencent.mm.plugin.wallet_core.model.ac;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.ArrayList;
import java.util.List;

public class WalletPayDeductUI extends MMPreference
  implements View.OnClickListener, com.tencent.mm.ai.f
{
  protected Button gHn;
  private Dialog gII = null;
  protected com.tencent.mm.ui.base.preference.f iFE;
  private String kdE;
  private LinearLayout nrC;
  protected MMSwitchBtn omp;
  protected Orders pWy;
  protected ArrayList<Preference> tpd;
  protected TextView tpe;
  private TextView tpf;
  private TextView tpg;
  private String tph;
  private String tpi;
  private Bankcard tpj;
  protected boolean tpk = false;
  private int tpl = 0;
  private String tpm;

  private void cNU()
  {
    AppMethodBeat.i(46026);
    s.cNC();
    Object localObject = s.cND();
    if (this.tpj == null)
      this.tpj = ((ak)localObject).a(null, null, true, true, true);
    if (this.tpj == null)
    {
      ab.i("MicroMsg.WalletPayDeductUI", "no bank card!");
      finish();
      AppMethodBeat.o(46026);
    }
    while (true)
    {
      return;
      SpannableString localSpannableString = new SpannableString(this.tpj.field_desc);
      localObject = new com.tencent.mm.plugin.wallet_core.ui.j(this.mController.ylL);
      ((com.tencent.mm.plugin.wallet_core.ui.j)localObject).tHw = new WalletPayDeductUI.3(this, ac.cPS());
      localSpannableString.setSpan(localObject, 0, localSpannableString.length(), 18);
      this.tpf.setText(localSpannableString);
      this.tpf.setMovementMethod(LinkMovementMethod.getInstance());
      AppMethodBeat.o(46026);
    }
  }

  private void cNV()
  {
    AppMethodBeat.i(46028);
    if ((this.tpd == null) || (this.tpd.size() <= 0))
      AppMethodBeat.o(46028);
    while (true)
    {
      return;
      int i = this.tpd.size();
      for (int j = 0; j < i; j++)
        this.iFE.ce(((Preference)this.tpd.get(j)).mKey, false);
      this.iFE.notifyDataSetChanged();
      AppMethodBeat.o(46028);
    }
  }

  private void dP(List<Orders.DeductShowInfo> paramList)
  {
    AppMethodBeat.i(46029);
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.e("MicroMsg.WalletPayDeductUI", "showinfos is null or length is 0");
      AppMethodBeat.o(46029);
    }
    while (true)
    {
      return;
      if (this.tpd == null)
      {
        int i = paramList.size();
        this.tpd = new ArrayList();
        int j = 0;
        if (j < i)
        {
          Object localObject = (Orders.DeductShowInfo)paramList.get(j);
          com.tencent.mm.plugin.wallet_core.ui.e locale;
          if ((localObject != null) && (!bo.isNullOrNil(((Orders.DeductShowInfo)localObject).name)))
          {
            locale = new com.tencent.mm.plugin.wallet_core.ui.e(this);
            locale.setTitle(((Orders.DeductShowInfo)localObject).name);
            if (((Orders.DeductShowInfo)localObject).tBi <= 0)
              break label229;
            locale.peA = getResources().getColor(2131690208);
            String str = ((Orders.DeductShowInfo)localObject).value;
            localObject = new WalletPayDeductUI.4(this, (Orders.DeductShowInfo)localObject);
            locale.mXp = str;
            locale.mXt = true;
            locale.lDG = ((com.tencent.mm.ai.f)localObject);
          }
          while (true)
          {
            locale.setKey("deduct_info_".concat(String.valueOf(j)));
            this.tpd.add(locale);
            this.iFE.b(locale);
            this.iFE.ce(locale.mKey, true);
            j++;
            break;
            label229: locale.mXp = ((Orders.DeductShowInfo)localObject).value;
            locale.mXt = false;
          }
        }
      }
      AppMethodBeat.o(46029);
    }
  }

  public final int JC()
  {
    return -1;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return 2130971145;
  }

  public final void initView()
  {
    AppMethodBeat.i(46025);
    this.tpe = ((TextView)this.mController.contentView.findViewById(2131828982));
    this.gHn = ((Button)this.mController.contentView.findViewById(2131822846));
    this.nrC = ((LinearLayout)findViewById(2131828978));
    ((TextView)findViewById(2131828976)).setText(this.pWy.tAv.title);
    ((TextView)findViewById(2131820678)).setText(((Orders.Commodity)this.pWy.tAq.get(0)).desc);
    Object localObject1 = (WalletTextView)findViewById(2131828974);
    ((WalletTextView)localObject1).setTypeface(0);
    ((WalletTextView)localObject1).setText(com.tencent.mm.wallet_core.ui.e.atr(this.pWy.pcl));
    ((TextView)findViewById(2131826481)).setText(((Orders.Commodity)this.pWy.tAq.get(0)).kCJ);
    localObject1 = (TextView)findViewById(2131825998);
    Object localObject2 = (TextView)findViewById(2131828977);
    boolean bool;
    if (!bo.isNullOrNil(this.pWy.tAv.tBg))
    {
      ((TextView)localObject2).setText(this.pWy.tAv.tBg);
      if (!bo.isNullOrNil(this.pWy.tAv.tBh))
        ((TextView)localObject2).setTextColor(Color.parseColor(this.pWy.tAv.tBh));
      this.tpf = ((TextView)findViewById(2131828979));
      this.tpg = ((TextView)findViewById(2131828980));
      if (this.pWy.tAv.tpY != 1)
        break label783;
      bool = true;
      label319: this.tpk = bool;
      this.tpl = this.pWy.tAv.tpl;
      this.kdE = this.pWy.tAv.kdE;
      this.tpm = this.pWy.tAv.tpm;
      ab.i("MicroMsg.WalletPayDeductUI", "open: %s, show_type: %s", new Object[] { Boolean.valueOf(this.tpk), Integer.valueOf(this.tpl) });
      if (this.tpl != 0)
        break label788;
      this.omp = ((MMSwitchBtn)findViewById(2131820932));
      this.omp.setCheck(this.tpk);
      this.omp.setSwitchListener(new WalletPayDeductUI.2(this));
      mX(this.tpk);
      label453: ab.d("MicroMsg.WalletPayDeductUI", "show pay way layout: %d", new Object[] { Integer.valueOf(this.pWy.tAv.tBf) });
      if (this.pWy.tAv.tBf != 1)
        break label875;
      com.tencent.mm.kernel.g.RQ();
      this.tpi = ((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xNL, ""));
      com.tencent.mm.kernel.g.RQ();
      this.tph = ((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xNK, ""));
      if ((!bo.isNullOrNil(this.tph)) && (!bo.isNullOrNil(this.tph)))
        break label857;
      ab.i("MicroMsg.WalletPayDeductUI", "need do pay manager");
      this.gII = com.tencent.mm.wallet_core.ui.g.a(this.mController.ylL, false, null);
      localObject2 = new com.tencent.mm.plugin.wallet.pwd.a.j();
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a((m)localObject2, 0);
      label615: if (bo.isNullOrNil(this.pWy.tAv.tBd))
        break label887;
      Object localObject3 = getString(2131304765);
      localObject2 = getString(2131304766);
      SpannableString localSpannableString = com.tencent.mm.pluginsdk.ui.e.j.b(this, getString(2131304764, new Object[] { localObject3, localObject2 }));
      com.tencent.mm.plugin.wallet_core.ui.j localj = new com.tencent.mm.plugin.wallet_core.ui.j(this.mController.ylL);
      localObject3 = new SpannableString(localSpannableString);
      ((SpannableString)localObject3).setSpan(localj, localSpannableString.length() - ((String)localObject2).length(), localSpannableString.length(), 33);
      ((TextView)localObject1).setTextColor(getResources().getColor(2131690164));
      ((TextView)localObject1).setText((CharSequence)localObject3);
      ((TextView)localObject1).setOnClickListener(this);
      ((TextView)localObject1).setVisibility(0);
    }
    while (true)
    {
      this.gHn.setOnClickListener(this);
      AppMethodBeat.o(46025);
      return;
      ((TextView)localObject2).setVisibility(8);
      break;
      label783: bool = false;
      break label319;
      label788: if (!bo.isNullOrNil(this.kdE))
        this.gHn.setText(this.kdE);
      if (!bo.isNullOrNil(this.tpm))
      {
        this.tpe.setText(this.tpm);
        this.tpe.setVisibility(0);
      }
      findViewById(2131828975).setVisibility(8);
      cNV();
      break label453;
      label857: this.tpg.setText(this.tpi);
      cNU();
      break label615;
      label875: this.nrC.setVisibility(8);
      break label615;
      label887: ((TextView)localObject1).setVisibility(8);
    }
  }

  protected final void mX(boolean paramBoolean)
  {
    AppMethodBeat.i(46027);
    if (paramBoolean)
    {
      findViewById(16908298).setVisibility(0);
      if (this.pWy.tAv.tBf == 1)
      {
        this.nrC.setVisibility(0);
        cNV();
        if (!r.cPI().cQg())
          break label122;
        this.tpe.setVisibility(8);
        this.gHn.setText(2131304770);
      }
    }
    while (true)
    {
      ab.i("MicroMsg.WalletPayDeductUI", "isCheck=" + this.omp.zMU);
      AppMethodBeat.o(46027);
      return;
      this.nrC.setVisibility(8);
      break;
      label122: this.tpe.setVisibility(0);
      this.tpe.setText(2131304769);
      this.gHn.setText(2131304767);
      continue;
      if ((this.tpd != null) && (this.tpd.size() > 0))
      {
        int i = this.tpd.size();
        for (int j = 0; j < i; j++)
          this.iFE.ce(((Preference)this.tpd.get(j)).mKey, true);
      }
      findViewById(16908298).setVisibility(8);
      this.nrC.setVisibility(8);
      this.tpe.setVisibility(8);
      this.gHn.setText(2131304768);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(46030);
    int i = paramView.getId();
    if (i == 2131822846)
    {
      paramView = new Intent();
      if (this.tpl == 0)
        if (this.omp.zMU)
        {
          i = 1;
          paramView.putExtra("auto_deduct_flag", i);
          label54: if (this.tpj != null)
          {
            paramView.putExtra("deduct_bank_type", this.tpj.field_bankcardType);
            paramView.putExtra("deduct_bind_serial", this.tpj.field_bindSerial);
            ab.i("MicroMsg.WalletPayDeductUI", "deduct bankType: %s", new Object[] { this.tpj.field_bankcardType });
          }
          setResult(-1, paramView);
          finish();
          AppMethodBeat.o(46030);
        }
    }
    while (true)
    {
      return;
      i = 0;
      break;
      paramView.putExtra("auto_deduct_flag", this.pWy.tAv.tpY);
      break label54;
      if ((i == 2131825998) && (!bo.isNullOrNil(this.pWy.tAv.tBd)))
      {
        paramView = new Intent();
        paramView.putExtra("rawUrl", this.pWy.tAv.tBd);
        paramView.putExtra("showShare", false);
        com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramView);
      }
      AppMethodBeat.o(46030);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46022);
    super.onCreate(paramBundle);
    this.iFE = this.yCw;
    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131690691)));
    View localView = getSupportActionBar().getCustomView();
    if (localView != null)
    {
      paramBundle = localView.findViewById(2131821128);
      if (paramBundle != null)
        paramBundle.setBackgroundColor(getResources().getColor(2131690597));
      paramBundle = localView.findViewById(16908309);
      if ((paramBundle != null) && ((paramBundle instanceof TextView)))
        ((TextView)paramBundle).setTextColor(getResources().getColor(2131690691));
    }
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(-2147483648);
      if (com.tencent.mm.compatible.util.d.iW(23))
      {
        paramBundle.setStatusBarColor(getResources().getColor(2131690622));
        getWindow().getDecorView().setSystemUiVisibility(8192);
      }
    }
    else
    {
      paramBundle = getIntent();
      if (paramBundle != null)
        break label216;
      ab.e("MicroMsg.WalletPayDeductUI", "intent is null");
      finish();
      AppMethodBeat.o(46022);
    }
    while (true)
    {
      return;
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
      break;
      label216: this.pWy = ((Orders)paramBundle.getParcelableExtra("orders"));
      if ((this.pWy == null) || (this.pWy.tAv == null))
      {
        ab.e("MicroMsg.WalletPayDeductUI", "Orders data or deductInfo is null   : " + this.pWy);
        finish();
      }
      dP(this.pWy.tAv.tBe);
      setResult(0);
      setBackBtn(new WalletPayDeductUI.1(this), 2131230737);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.a(385, this);
      initView();
      AppMethodBeat.o(46022);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46024);
    super.onDestroy();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(385, this);
    AppMethodBeat.o(46024);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(46031);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(46031);
    return bool;
  }

  public void onResume()
  {
    AppMethodBeat.i(46023);
    super.onResume();
    AppMethodBeat.o(46023);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(46032);
    ab.i("MicroMsg.WalletPayDeductUI", "errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramm instanceof com.tencent.mm.plugin.wallet.pwd.a.j))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.kernel.g.RQ();
        this.tpi = ((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xNL, getString(2131305178)));
        com.tencent.mm.kernel.g.RQ();
        this.tph = ((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xNK, getString(2131305181)));
        this.tpg.setText(this.tpi);
        cNU();
      }
    while (true)
    {
      if (this.gII != null)
        this.gII.dismiss();
      AppMethodBeat.o(46032);
      return;
      ab.d("MicroMsg.WalletPayDeductUI", "other tenpay scene");
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI
 * JD-Core Version:    0.6.2
 */