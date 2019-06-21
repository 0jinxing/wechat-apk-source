package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.b.a.bj;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.model.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tencent.mm.wallet_core.ui.formview.a.a;

@com.tencent.mm.ui.base.a(3)
public class WalletIdCardCheckUI extends WalletBaseUI
  implements TextView.OnEditorActionListener, WalletFormView.a
{
  private WalletFormView trX;
  private TextView trY;
  private TextView trZ;
  private Button tsa;
  private int tsb = 1;

  private void Hj(int paramInt)
  {
    AppMethodBeat.i(46331);
    if (paramInt == 1)
    {
      e(this.trX, 1, false);
      AppMethodBeat.o(46331);
    }
    while (true)
    {
      return;
      e(this.trX, 1, true);
      AppMethodBeat.o(46331);
    }
  }

  private static void a(WalletFormView paramWalletFormView, int paramInt)
  {
    AppMethodBeat.i(46332);
    paramWalletFormView = paramWalletFormView.getLogicDelegate();
    if ((paramWalletFormView instanceof a.a))
      ((a.a)paramWalletFormView).QT(paramInt);
    AppMethodBeat.o(46332);
  }

  public final void bLz()
  {
    AppMethodBeat.i(46326);
    ab.d("Micromsg.WalletIdCardCheckUI", "check pwd ");
    this.Ahr.bLz();
    AppMethodBeat.o(46326);
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
    return 2130971081;
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(46335);
    this.trZ.setVisibility(4);
    AppMethodBeat.o(46335);
  }

  public final boolean i(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(46334);
    ab.d("Micromsg.WalletIdCardCheckUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof n)))
    {
      paramString = new bj();
      paramString.cVT = 1L;
      paramString.dcm = 2L;
      paramString.ajK();
      h.a(this, getString(2131305110), "", getString(2131304829), false, new WalletIdCardCheckUI.3(this));
    }
    AppMethodBeat.o(46334);
    return true;
  }

  public final void initView()
  {
    AppMethodBeat.i(46330);
    this.trX = ((WalletFormView)findViewById(2131828720));
    this.trZ = ((TextView)findViewById(2131828729));
    this.trY = ((TextView)findViewById(2131828718));
    this.trX.setOnInputValidChangeListener(this);
    this.trX.setOnEditorActionListener(this);
    this.trZ.setVisibility(4);
    this.tsa = ((Button)findViewById(2131828749));
    com.tencent.mm.wallet_core.ui.formview.a.d(this.trX);
    e(this.trX, 1, false);
    this.tsa.setOnClickListener(new WalletIdCardCheckUI.2(this));
    this.tsb = r.cPI().cQq();
    String str1 = r.cPI().cQr();
    ab.i("Micromsg.WalletIdCardCheckUI", "mIdentityType %d %s", new Object[] { Integer.valueOf(this.tsb), str1 });
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = r.cPQ().Z(this, this.tsb);
    a(this.trX, this.tsb);
    this.trX.setTitleText(str2);
    this.trX.cey();
    Hj(this.tsb);
    str2 = r.cPI().bhp();
    this.trX.setHint(getString(2131305107, new Object[] { e.atw(str2) }));
    AppMethodBeat.o(46330);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46325);
    super.onCreate(paramBundle);
    setMMTitle(2131305115);
    nf(1580);
    initView();
    setBackBtn(new WalletIdCardCheckUI.1(this));
    AppMethodBeat.o(46325);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46329);
    super.onDestroy();
    ng(1580);
    AppMethodBeat.o(46329);
  }

  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(46333);
    boolean bool;
    if ((this.nTi != null) && (this.nTi.isShown()))
    {
      this.nTi.setVisibility(8);
      bool = true;
      AppMethodBeat.o(46333);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(46333);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(46328);
    super.onPause();
    AppMethodBeat.o(46328);
  }

  public void onResume()
  {
    AppMethodBeat.i(46327);
    super.onResume();
    AppMethodBeat.o(46327);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletIdCardCheckUI
 * JD-Core Version:    0.6.2
 */