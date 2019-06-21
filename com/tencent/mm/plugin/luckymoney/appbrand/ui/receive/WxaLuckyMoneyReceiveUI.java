package com.tencent.mm.plugin.luckymoney.appbrand.ui.receive;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;

@com.tencent.mm.ui.base.a(3)
public class WxaLuckyMoneyReceiveUI extends WxaLuckyMoneyBaseUI
  implements b
{
  private TextView kGq;
  private int lqz = -1;
  private ImageView nSM;
  private int nTB = -1;
  private a nTC;
  private TextView nTD;
  private Button nTE;
  private View nTF;
  private ImageView nTG;
  private TextView nTH;
  private View nTI;
  private TextView nsq;
  private p tipDialog = null;

  static
  {
    AppMethodBeat.i(42122);
    if (!WxaLuckyMoneyReceiveUI.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(42122);
      return;
    }
  }

  private void C(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(42110);
    if (paramBoolean1)
    {
      this.nTF.setVisibility(0);
      if (paramBoolean2)
      {
        this.nTH.setText(2131301093);
        this.nTG.setVisibility(8);
        this.nTF.setOnClickListener(new WxaLuckyMoneyReceiveUI.2(this));
        AppMethodBeat.o(42110);
      }
    }
    while (true)
    {
      return;
      this.nTH.setText(2131301086);
      break;
      this.nTF.setVisibility(8);
      this.nTG.setVisibility(0);
      AppMethodBeat.o(42110);
    }
  }

  private void bLe()
  {
    AppMethodBeat.i(42107);
    x.a(this.nTI, null);
    this.mController.contentView.setVisibility(0);
    AppMethodBeat.o(42107);
  }

  private void bLf()
  {
    AppMethodBeat.i(42118);
    if (this.nTE == null)
      AppMethodBeat.o(42118);
    while (true)
    {
      return;
      Object localObject = ah.getContext().getSharedPreferences(ah.doA(), 0);
      ah.getContext();
      localObject = aa.g((SharedPreferences)localObject);
      if ((localObject != null) && (((String)localObject).length() > 0) && ((((String)localObject).equals("zh_CN")) || (((String)localObject).equals("zh_TW")) || (((String)localObject).equals("zh_HK"))))
      {
        AppMethodBeat.o(42118);
      }
      else
      {
        this.nTE.setBackgroundResource(2130839404);
        this.nTE.setText(2131301160);
        AppMethodBeat.o(42118);
      }
    }
  }

  private void eT(String paramString1, String paramString2)
  {
    AppMethodBeat.i(42108);
    x.b(this.nSM, paramString2, null);
    x.a(this.mController.ylL, this.nTD, paramString1);
    AppMethodBeat.o(42108);
  }

  private void eU(String paramString1, String paramString2)
  {
    AppMethodBeat.i(42109);
    if (!bo.isNullOrNil(paramString1))
    {
      this.kGq.setText(paramString1);
      this.kGq.setVisibility(0);
    }
    while (true)
    {
      if (!bo.isNullOrNil(paramString2))
      {
        x.a(this.mController.ylL, this.nsq, paramString2);
        this.nsq.setVisibility(0);
      }
      AppMethodBeat.o(42109);
      return;
      this.kGq.setVisibility(8);
    }
  }

  private void eq(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(42115);
    ab.i("MicroMsg.WxaLuckyMoneyReceiveUI", "setBackResult cgiType:[%d],errCode:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      setResult(0, new Intent().putExtra("result_error_code", 10001).putExtra("result_error_msg", "fail:no permission to receive the red packet"));
      AppMethodBeat.o(42115);
    }
    while (true)
    {
      return;
      if (paramInt1 == 4)
        setResult(0, new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel}}"));
      AppMethodBeat.o(42115);
    }
  }

  private void f(TextView paramTextView, int paramInt)
  {
    AppMethodBeat.i(42117);
    int i = (int)(com.tencent.mm.bz.a.am(this.mController.ylL, paramInt) * 1.125F);
    paramInt = com.tencent.mm.bz.a.al(this.mController.ylL, paramInt);
    if (paramInt > i)
      paramInt = i;
    while (true)
    {
      paramTextView.setTextSize(0, paramInt);
      AppMethodBeat.o(42117);
      return;
    }
  }

  public final void Qf(String paramString)
  {
  }

  public final void a(String paramString1, String paramString2, int paramInt, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(42106);
    this.lqz = paramInt;
    this.nTB = 1;
    bKV();
    eT(paramString1, paramString2);
    eU(null, paramString3);
    this.nTE.setOnClickListener(null);
    this.nTE.setVisibility(8);
    C(paramBoolean1, paramBoolean2);
    bLe();
    AppMethodBeat.o(42106);
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(42105);
    bKV();
    eT(paramString1, paramString2);
    eU(paramString3, paramString4);
    this.nTE.setOnClickListener(new WxaLuckyMoneyReceiveUI.1(this));
    this.nTE.setVisibility(0);
    C(paramBoolean1, paramBoolean2);
    bLe();
    AppMethodBeat.o(42105);
  }

  public final MMActivity bKU()
  {
    return this;
  }

  public final void bKV()
  {
    AppMethodBeat.i(42104);
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    AppMethodBeat.o(42104);
  }

  public final void bLd()
  {
    AppMethodBeat.i(42103);
    x.d(this.nTE);
    AppMethodBeat.o(42103);
  }

  public final int getLayoutId()
  {
    return 2130971246;
  }

  public final void initView()
  {
    AppMethodBeat.i(42116);
    this.nTI = findViewById(2131825520);
    this.nSM = ((ImageView)findViewById(2131825516));
    this.nTD = ((TextView)findViewById(2131825517));
    this.kGq = ((TextView)findViewById(2131825522));
    this.nsq = ((TextView)findViewById(2131825650));
    this.nTE = ((Button)findViewById(2131825651));
    this.nTH = ((TextView)findViewById(2131825653));
    this.nTF = findViewById(2131825652);
    this.nTG = ((ImageView)findViewById(2131825523));
    Object localObject = (ImageView)findViewById(2131825524);
    if ((!$assertionsDisabled) && (localObject == null))
    {
      localObject = new AssertionError();
      AppMethodBeat.o(42116);
      throw ((Throwable)localObject);
    }
    ((ImageView)localObject).setOnClickListener(new WxaLuckyMoneyReceiveUI.3(this));
    f(this.nTD, 2131428492);
    f(this.kGq, 2131428493);
    f(this.nsq, 2131428494);
    this.mController.contentView.setVisibility(8);
    this.tipDialog = h.b(this.mController.ylL, getString(2131300968), true, new WxaLuckyMoneyReceiveUI.4(this));
    this.tipDialog.show();
    bLf();
    AppMethodBeat.o(42116);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(42114);
    eq(this.nTB, this.lqz);
    finish();
    AppMethodBeat.o(42114);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42111);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.WxaLuckyMoneyReceiveUI", "WxaLuckyMoneyReceiveUI.onCreate ");
    initView();
    getIntent();
    this.nTC = new c();
    this.nTC.a(this, getIntent());
    AppMethodBeat.o(42111);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42113);
    super.onDestroy();
    ab.i("MicroMsg.WxaLuckyMoneyReceiveUI", "WxaLuckyMoneyReceiveUI.onDestroy ");
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    if (this.nTC != null)
    {
      this.nTC.onDestroy();
      this.nTC = null;
    }
    AppMethodBeat.o(42113);
  }

  public void onResume()
  {
    AppMethodBeat.i(42112);
    super.onResume();
    x.d(this.nTE);
    this.nTE.setBackgroundResource(2130838808);
    bLf();
    AppMethodBeat.o(42112);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI
 * JD-Core Version:    0.6.2
 */