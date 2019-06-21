package com.tencent.mm.plugin.aa.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.vending.app.c;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tenpay.android.wechat.MyKeyboardWindow;

public abstract class BaseAAPresenterActivity extends WalletBaseUI
{
  private static final int gnS = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 300);
  private c eMI = new c();
  protected View gnR;

  public final <T extends b<? extends com.tencent.mm.vending.app.a>> T V(Class<? extends b<? extends com.tencent.mm.vending.app.a>> paramClass)
  {
    return this.eMI.a(this, paramClass);
  }

  public final <T extends com.tencent.mm.vending.app.a> T Z(Class<? extends com.tencent.mm.vending.app.a> paramClass)
  {
    return this.eMI.b(this, paramClass);
  }

  public final void a(View paramView, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.mKeyboard = ((MyKeyboardWindow)findViewById(2131822357));
    this.nTi = findViewById(2131822356);
    View localView = findViewById(2131822358);
    EditText localEditText = (EditText)paramView.findViewById(2131820687);
    if ((this.mKeyboard == null) || (localEditText == null) || (this.nTi == null));
    while (true)
    {
      return;
      this.nTi.setVisibility(8);
      e.setNoSystemInputOnEditText(localEditText);
      localEditText.setOnFocusChangeListener(new BaseAAPresenterActivity.1(this, paramBoolean1, paramBoolean2, localEditText, paramView, paramInt));
      localEditText.setOnClickListener(new BaseAAPresenterActivity.2(this, paramBoolean1, localEditText, paramInt));
      localView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(40779);
          BaseAAPresenterActivity.this.aoB();
          AppMethodBeat.o(40779);
        }
      });
    }
  }

  public final void aoB()
  {
    super.aoB();
    if (this.gnR != null)
      this.gnR.scrollTo(0, 0);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eMI.A(getIntent(), this);
    this.Ahz = true;
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.eMI.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    this.eMI.a(3);
  }

  public void onResume()
  {
    super.onResume();
    this.eMI.a(2);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.BaseAAPresenterActivity
 * JD-Core Version:    0.6.2
 */