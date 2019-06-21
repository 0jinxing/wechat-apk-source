package com.tencent.mm.plugin.walletlock.fingerprint.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.ActionBar;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.walletlock.c.i;
import com.tencent.mm.plugin.walletlock.fingerprint.a.d.a;
import com.tencent.mm.plugin.walletlock.fingerprint.a.h.1;
import com.tencent.mm.plugin.walletlock.fingerprint.a.h.2;
import com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.soter.a.g.b.a;
import com.tencent.soter.a.g.f;
import com.tencent.soter.core.c.j;

public class FingerprintWalletLockUI extends MMActivity
{
  private String JU;
  private String gHr = null;
  private String gtl;
  private com.tencent.mm.ui.widget.a.c hSs = null;
  private boolean isCancelled = false;
  private TextView juY;
  private ProgressDialog kvA = null;
  private int msy = 0;
  private boolean ozH = true;
  private boolean tVe = false;
  private TextView tVl;
  private TextView tVm;
  private TextView tVn;
  private Animation tVo;
  private String tVp;
  private String tVq;
  private com.tencent.mm.plugin.walletlock.fingerprint.a.d tVr;
  private com.tencent.mm.plugin.walletlock.fingerprint.a.h tVs;
  private com.tencent.mm.plugin.walletlock.c.b tVt;
  private String tVu = "-1";
  private int tVv = -1;
  private int tVw = -1;

  private void Dv(String paramString)
  {
    AppMethodBeat.i(51530);
    int i = (int)(System.currentTimeMillis() / 1000L);
    if (i - this.msy > 1)
    {
      this.msy = i;
      dismissDialog();
      if (this.tVl != null)
      {
        this.tVl.setText(paramString);
        this.tVl.setTextColor(getResources().getColor(2131690384));
        this.tVl.setVisibility(4);
        if (this.tVo == null)
          this.tVo = AnimationUtils.loadAnimation(this.mController.ylL, 2131034183);
        this.tVl.startAnimation(this.tVo);
        al.n(new FingerprintWalletLockUI.5(this), this.tVo.getDuration());
      }
      AppMethodBeat.o(51530);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(51530);
    }
  }

  private void HC(int paramInt)
  {
    AppMethodBeat.i(51527);
    Intent localIntent = new Intent();
    if (paramInt == 1)
      localIntent.putExtra("action", "action.touchlock_verify_by_paypwd");
    while (true)
    {
      localIntent.putExtra("key_wallet_lock_type", 2);
      com.tencent.mm.bp.d.b(this, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent, paramInt);
      AppMethodBeat.o(51527);
      return;
      if (paramInt == 2)
      {
        localIntent.putExtra("action", "action.touchlock_need_verify_paypwd");
        localIntent.putExtra("key_wallet_lock_input_new_fp_tips", getString(2131304896));
      }
    }
  }

  private void JN(String paramString)
  {
    AppMethodBeat.i(51529);
    String str = paramString;
    if (bo.isNullOrNil(paramString))
      str = getString(2131304890);
    dismissDialog();
    this.hSs = com.tencent.mm.ui.base.h.a(this, str, "", new FingerprintWalletLockUI.4(this));
    this.hSs.setCanceledOnTouchOutside(false);
    AppMethodBeat.o(51529);
  }

  private void aDw()
  {
    AppMethodBeat.i(51528);
    if ((this.kvA != null) && (this.kvA.isShowing()))
      this.kvA.dismiss();
    AppMethodBeat.o(51528);
  }

  private void bv(int paramInt, String paramString)
  {
    AppMethodBeat.i(51532);
    ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo finish with result, resultCode: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(-1), Integer.valueOf(paramInt), paramString });
    release();
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt);
    localIntent.putExtra("key_err_msg", paramString);
    setResult(-1, localIntent);
    finish();
    AppMethodBeat.o(51532);
  }

  private void cTs()
  {
    AppMethodBeat.i(51521);
    if (this.JU.equals("action.verify_pattern"))
    {
      this.tVl.setText(2131304891);
      this.tVl.setTextColor(getResources().getColor(2131690316));
      this.tVn.setVisibility(0);
      AppMethodBeat.o(51521);
    }
    while (true)
    {
      return;
      this.tVl.setText(2131304884);
      this.tVl.setTextColor(getResources().getColor(2131690316));
      this.tVn.setVisibility(8);
      AppMethodBeat.o(51521);
    }
  }

  private void cTt()
  {
    AppMethodBeat.i(51522);
    aDw();
    c.a locala = new c.a(this);
    ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo mAuthType: %d", new Object[] { Integer.valueOf(this.tVv) });
    if (this.tVv == 2)
      locala.PZ(2131304898).Qc(2131304902).a(new FingerprintWalletLockUI.12(this)).Qd(2131296868).b(new FingerprintWalletLockUI.11(this));
    while (true)
    {
      this.hSs = locala.aMb();
      this.hSs.setCanceledOnTouchOutside(false);
      this.hSs.show();
      AppMethodBeat.o(51522);
      return;
      locala.PZ(2131304897).asJ(getString(2131296994)).a(new FingerprintWalletLockUI.13(this));
    }
  }

  private void cTu()
  {
    AppMethodBeat.i(51525);
    ab.i("MicroMsg.FingerprintWalletLockUI", "currentAction: %s", new Object[] { this.tVq });
    if (bo.isNullOrNil(this.tVq))
    {
      finish();
      AppMethodBeat.o(51525);
      return;
    }
    Object localObject1 = this.tVq;
    int i = -1;
    switch (((String)localObject1).hashCode())
    {
    default:
      label100: switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      }
      break;
    case 1420518755:
    case -1305462654:
    case -639789777:
    case -1423990800:
    }
    while (true)
    {
      AppMethodBeat.o(51525);
      break;
      if (!((String)localObject1).equals("action.switch_on_pattern"))
        break label100;
      i = 0;
      break label100;
      if (!((String)localObject1).equals("action.verify_pattern"))
        break label100;
      i = 1;
      break label100;
      if (!((String)localObject1).equals("next_action.switch_on_pattern"))
        break label100;
      i = 2;
      break label100;
      if (!((String)localObject1).equals("next_action.goto_protected_page"))
        break label100;
      i = 3;
      break label100;
      this.tVt = new FingerprintWalletLockUI.a(this, this);
      this.tVu = "-1";
      if (this.tVs == null)
        this.tVs = new com.tencent.mm.plugin.walletlock.fingerprint.a.h();
      localObject1 = this.tVs;
      Object localObject2 = this.tVt;
      Object localObject3 = new h.1((com.tencent.mm.plugin.walletlock.fingerprint.a.h)localObject1, (com.tencent.mm.plugin.walletlock.c.b)localObject2);
      ((com.tencent.mm.plugin.walletlock.fingerprint.a.h)localObject1).tVi = new com.tencent.soter.a.a.a();
      localObject3 = new b.a().iW(this).Rk(1).a(((com.tencent.mm.plugin.walletlock.fingerprint.a.h)localObject1).tVi).a((com.tencent.soter.a.a.b)localObject3).aug(com.tencent.mm.plugin.walletlock.c.g.tWY.tWZ).Rj(3).Awk;
      com.tencent.mm.plugin.walletlock.c.g.tWY.tXa = null;
      ab.i("MicroMsg.SoterFingerprintAuthManager", "alvinluo start auth");
      com.tencent.soter.a.a.a(new h.2((com.tencent.mm.plugin.walletlock.fingerprint.a.h)localObject1, (com.tencent.mm.plugin.walletlock.c.b)localObject2), (com.tencent.soter.a.g.b)localObject3);
      AppMethodBeat.o(51525);
      break;
      localObject2 = com.tencent.mm.plugin.walletlock.c.g.tWY.tXa;
      if (localObject2 == null)
      {
        Dv(getString(2131304886));
        AppMethodBeat.o(51525);
        break;
      }
      localObject1 = ((j)localObject2).Avx;
      localObject2 = ((j)localObject2).signature;
      if (this.tVr != null)
      {
        this.kvA = com.tencent.mm.ui.base.h.b(this, getString(2131304893), false, null);
        this.tVr.a(new d.a()
        {
          public final void aC(int paramAnonymousInt, String paramAnonymousString)
          {
            AppMethodBeat.i(51503);
            ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo open fingerprint lock onFinish errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
            if (paramAnonymousInt == 0)
            {
              FingerprintWalletLockUI.k(FingerprintWalletLockUI.this);
              AppMethodBeat.o(51503);
            }
            while (true)
            {
              return;
              FingerprintWalletLockUI.b(FingerprintWalletLockUI.this, FingerprintWalletLockUI.this.getString(2131304882));
              AppMethodBeat.o(51503);
            }
          }
        }
        , this.gtl, (String)localObject1, (String)localObject2);
      }
      AppMethodBeat.o(51525);
      break;
      com.tencent.mm.plugin.walletlock.fingerprint.a.a.lK(SystemClock.elapsedRealtime());
      cTv();
    }
  }

  private void cTv()
  {
    AppMethodBeat.i(51526);
    this.ozH = false;
    al.n(new FingerprintWalletLockUI.3(this), 200L);
    Intent localIntent = (Intent)getIntent().getParcelableExtra("page_intent");
    if (localIntent != null)
    {
      ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo go to protected page");
      i.tXc.nB(true);
      i.tXc.nC(true);
      localIntent.addFlags(131072);
      startActivity(localIntent);
      overridePendingTransition(2131034261, 2131034266);
      AppMethodBeat.o(51526);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FingerprintWalletLockUI", "Protected page's intent not found, finish myself only.");
      AppMethodBeat.o(51526);
    }
  }

  private void dismissDialog()
  {
    AppMethodBeat.i(51523);
    aDw();
    if ((this.hSs != null) && (this.hSs.isShowing()))
      this.hSs.dismiss();
    AppMethodBeat.o(51523);
  }

  private void release()
  {
    AppMethodBeat.i(51531);
    ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo fingerprint lock ui release isCancelled: %b", new Object[] { Boolean.valueOf(this.isCancelled) });
    if (this.isCancelled)
      AppMethodBeat.o(51531);
    while (true)
    {
      return;
      this.isCancelled = true;
      if (this.tVs != null)
        this.tVs.release();
      if (this.tVr != null)
        this.tVr.release();
      f.dRn().dRo();
      AppMethodBeat.o(51531);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(51533);
    super.finish();
    release();
    AppMethodBeat.o(51533);
  }

  public final int getLayoutId()
  {
    return 2130969566;
  }

  public final void initView()
  {
    AppMethodBeat.i(51520);
    super.initView();
    this.tVl = ((TextView)findViewById(2131824062));
    this.tVm = ((TextView)findViewById(2131824063));
    this.juY = ((TextView)findViewById(2131824059));
    this.tVn = ((TextView)findViewById(2131824060));
    this.tVm.setOnClickListener(new FingerprintWalletLockUI.1(this));
    this.juY.setOnClickListener(new FingerprintWalletLockUI.8(this));
    this.tVn.setOnClickListener(new FingerprintWalletLockUI.9(this));
    AppMethodBeat.o(51520);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(51534);
    ab.v("MicroMsg.FingerprintWalletLockUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramIntent == null)
    {
      ab.e("MicroMsg.FingerprintWalletLockUI", "alvinluo data is null");
      AppMethodBeat.o(51534);
    }
    while (true)
    {
      return;
      paramInt2 = paramIntent.getIntExtra("key_err_code", -1);
      ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo onActivityResult errCode: %d", new Object[] { Integer.valueOf(paramInt2) });
      if (paramInt1 == 1)
      {
        if (paramInt2 == 0)
        {
          cTv();
          com.tencent.mm.plugin.walletlock.c.h.cUa();
          AppMethodBeat.o(51534);
        }
        else if (paramInt2 == -1)
        {
          this.ozH = false;
          JN(getString(2131304906));
          AppMethodBeat.o(51534);
        }
      }
      else if (paramInt1 == 2)
      {
        if (paramInt2 == 0)
        {
          com.tencent.mm.plugin.walletlock.fingerprint.a.a.ado(this.tVu);
          com.tencent.mm.plugin.walletlock.fingerprint.a.a.lK(SystemClock.elapsedRealtime());
          cTv();
          AppMethodBeat.o(51534);
        }
        else if (paramInt2 == -1)
        {
          this.ozH = false;
          JN(getString(2131304906));
          AppMethodBeat.o(51534);
        }
      }
      else if (paramInt1 == 3)
      {
        if (paramInt2 == 0)
        {
          cTv();
          AppMethodBeat.o(51534);
        }
        else
        {
          finish();
          i.tXc.cUg();
          AppMethodBeat.o(51534);
        }
      }
      else if (paramInt1 == 4)
      {
        if (paramInt2 == 0)
        {
          cTv();
          AppMethodBeat.o(51534);
        }
        else if (paramInt2 == -1)
        {
          this.ozH = false;
          JN(getString(2131304894));
          AppMethodBeat.o(51534);
        }
        else
        {
          finish();
          i.tXc.cUg();
          AppMethodBeat.o(51534);
        }
      }
      else if (paramInt1 == 5)
      {
        if (paramInt2 == 0)
        {
          ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.walletlock.a.b.class)).HB(0);
          paramIntent = com.tencent.mm.plugin.walletlock.c.g.tWY;
          com.tencent.mm.plugin.walletlock.c.g.cTq();
          Toast.makeText(this, getString(2131304876), 0).show();
          cTv();
          AppMethodBeat.o(51534);
        }
        else if (paramInt2 == -1)
        {
          this.ozH = false;
          JN(getString(2131304877));
          AppMethodBeat.o(51534);
        }
        else if (paramInt2 == 4)
        {
          finish();
          i.tXc.cUg();
        }
      }
      else
        AppMethodBeat.o(51534);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(51524);
    ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo onBackPressed");
    finish();
    i.tXc.cUg();
    AppMethodBeat.o(51524);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(51517);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo onCreate %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    if (getSupportActionBar() != null)
      getSupportActionBar().hide();
    initView();
    paramBundle = getIntent();
    this.JU = paramBundle.getStringExtra("action");
    this.tVq = this.JU;
    this.tVp = paramBundle.getStringExtra("next_action");
    this.gtl = paramBundle.getStringExtra("token");
    this.gHr = paramBundle.getStringExtra("key_pay_passwd");
    this.tVw = paramBundle.getIntExtra("scene", -1);
    ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo mAction: %s, mNextAction: %s", new Object[] { this.JU, this.tVp });
    if (this.JU.equals("action.verify_pattern"))
    {
      this.tVv = 2;
      com.tencent.mm.plugin.walletlock.c.h.cUc();
      AppMethodBeat.o(51517);
    }
    while (true)
    {
      return;
      if (this.JU.equals("action.switch_on_pattern"))
        this.tVv = 1;
      AppMethodBeat.o(51517);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(51519);
    super.onPause();
    ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo FingerprintWalletLockUI onPause");
    dismissDialog();
    release();
    this.ozH = true;
    AppMethodBeat.o(51519);
  }

  public void onResume()
  {
    AppMethodBeat.i(51518);
    super.onResume();
    ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo needResume: %b", new Object[] { Boolean.valueOf(this.ozH) });
    if (!this.ozH)
    {
      AppMethodBeat.o(51518);
      return;
    }
    this.tVr = new com.tencent.mm.plugin.walletlock.fingerprint.a.c();
    this.tVs = new com.tencent.mm.plugin.walletlock.fingerprint.a.h();
    this.isCancelled = false;
    f.dRn().dRo();
    this.kvA = com.tencent.mm.ui.base.h.b(this, getString(2131297086), false, null);
    cTs();
    label118: Object localObject;
    if (this.JU.equals("action.switch_on_pattern"))
    {
      this.tVe = false;
      ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo start prepare, time: %d, isOffline: %b", new Object[] { Long.valueOf(System.currentTimeMillis()), Boolean.valueOf(this.tVe) });
      localObject = com.tencent.mm.plugin.walletlock.c.g.tWY;
      boolean bool = com.tencent.mm.plugin.walletlock.c.g.cTY();
      localObject = com.tencent.mm.plugin.walletlock.c.g.tWY;
      if ((!com.tencent.mm.plugin.walletlock.c.g.cTn()) || (bool))
        break label555;
      ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user opend fingerprint lock but device not support soter, isSupportFingerprintLock: %b", new Object[] { Boolean.valueOf(bool) });
      if (!com.tencent.mm.plugin.walletlock.gesture.a.e.cTz())
        break label453;
      ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo user opened gesture, then switch to gesture");
      ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.walletlock.a.b.class)).HB(1);
      localObject = com.tencent.mm.plugin.walletlock.c.g.tWY;
      com.tencent.mm.plugin.walletlock.c.g.cTW();
      finish();
      localObject = new Intent(this, GestureGuardLogicUI.class);
      ((Intent)localObject).addFlags(131072);
      ((Intent)localObject).putExtra("action", "action.verify_pattern");
      ((Intent)localObject).putExtra("next_action", "next_action.goto_protected_page");
      ((Intent)localObject).putExtra("page_intent", getIntent().getParcelableExtra("page_intent"));
      ((Intent)localObject).setPackage(ah.getPackageName());
      bool = com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xTm, false);
      if (!bool)
      {
        ((Intent)localObject).putExtra("verify_title", getString(2131304904));
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTm, Boolean.TRUE);
        com.tencent.mm.kernel.g.RP().Ry().dsb();
      }
      ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo start gesture protect ui, isShowed: %b", new Object[] { Boolean.valueOf(bool) });
      startActivity((Intent)localObject);
      com.tencent.mm.plugin.report.service.h.pYm.e(12097, new Object[] { Integer.valueOf(8), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
    }
    while (true)
    {
      ab.i("MicroMsg.FingerprintWalletLockUI", "onResume end: %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      AppMethodBeat.o(51518);
      break;
      this.tVe = true;
      break label118;
      label453: ab.i("MicroMsg.FingerprintWalletLockUI", "alvinluo show not support fingerprint dialog");
      aDw();
      this.hSs = new c.a(this).PZ(2131304899).Qc(2131304903).a(new FingerprintWalletLockUI.15(this)).f(new FingerprintWalletLockUI.14(this)).aMb();
      this.hSs.setCanceledOnTouchOutside(false);
      this.hSs.b(getString(2131304875), false, new FingerprintWalletLockUI.2(this));
      this.hSs.show();
      continue;
      label555: if (!com.tencent.soter.core.a.iR(this))
      {
        cTt();
      }
      else
      {
        localObject = new Bundle();
        ((Bundle)localObject).putString("key_pay_passwd", this.gHr);
        ((Bundle)localObject).putBoolean("key_fp_lock_offline_mode", this.tVe);
        this.tVr.a(new FingerprintWalletLockUI.10(this), (Bundle)localObject);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.ui.FingerprintWalletLockUI
 * JD-Core Version:    0.6.2
 */