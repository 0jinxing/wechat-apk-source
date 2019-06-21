package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.plugin.wallet_core.utils.d;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.wallet_core.c.ae;
import com.tencent.mm.wallet_core.c.n;
import com.tencent.mm.wallet_core.c.n.a;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;

@com.tencent.mm.ui.base.a(19)
public class WalletVerifyCodeUI extends WalletBaseUI
  implements WalletFormView.a
{
  private Button gEZ;
  private PayInfo pVL;
  private Orders pWy;
  private int tLa;
  protected WalletFormView tLb;
  private Button tLc;
  private String tLd;
  private String tLe;
  private boolean tLf;
  private a tLg;
  private TextView tLh;
  private TextView tLi;
  private boolean tLj;
  private boolean tLk;
  private com.tencent.mm.plugin.wallet_core.model.i tLl;
  private n.a tLm;
  private Authen tms;

  public WalletVerifyCodeUI()
  {
    AppMethodBeat.i(47703);
    this.tLa = 60000;
    this.tLb = null;
    this.tLf = false;
    this.tLg = null;
    this.tLj = false;
    this.tLk = true;
    this.tLl = new com.tencent.mm.plugin.wallet_core.model.i();
    this.tLm = new WalletVerifyCodeUI.11(this);
    AppMethodBeat.o(47703);
  }

  private void cu()
  {
    AppMethodBeat.i(138558);
    Object localObject = (Bankcard)this.mBundle.getParcelable("key_bankcard");
    String str = cRU();
    if ((bo.isNullOrNil(str)) && (localObject != null))
    {
      str = ((Bankcard)localObject).field_mobile;
      this.mBundle.putString("key_mobile", str);
    }
    while (true)
    {
      this.tLi.setText(getString(2131305259, new Object[] { str }));
      localObject = dOF();
      if (!bo.ac((CharSequence)localObject))
      {
        this.tLh.setText((CharSequence)localObject);
        AppMethodBeat.o(138558);
      }
      while (true)
      {
        return;
        this.tLh.setText(String.format(getString(2131305398), new Object[] { str }));
        AppMethodBeat.o(138558);
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(47710);
    ab.d("MicroMsg.WalletVertifyCodeUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramm instanceof n))
    {
      if ((paramInt2 != 0) && (((n)paramm).cNi))
        com.tencent.mm.ui.base.h.a(this.mController.ylL, paramString, null, false, new WalletVerifyCodeUI.2(this));
      AppMethodBeat.o(47710);
      return bool;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = com.tencent.mm.wallet_core.a.aE(this);
      if ((paramm instanceof y))
      {
        this.mBundle.putBoolean("intent_bind_end", true);
        com.tencent.mm.ui.base.h.bQ(this, getString(2131304583));
        ab.i("MicroMsg.WalletVertifyCodeUI", "query bound bank card resp!");
        paramInt1 = 1;
      }
    }
    while (true)
    {
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.q))
        com.tencent.mm.plugin.report.service.h.pYm.e(10707, new Object[] { Integer.valueOf(2), Integer.valueOf(d.cSQ()) });
      if ((this.tms != null) && ((paramm instanceof com.tencent.mm.wallet_core.tenpay.model.m)))
      {
        paramString = ((com.tencent.mm.wallet_core.tenpay.model.m)paramm).getToken();
        if (!bo.isNullOrNil(paramString))
          this.mBundle.putString("kreq_token", paramString);
      }
      if (paramInt1 != 0)
      {
        ab.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess1 and finish!");
        com.tencent.mm.wallet_core.a.j(this, this.mBundle);
        finish();
        AppMethodBeat.o(47710);
        break;
        if (!(paramm instanceof com.tencent.mm.wallet_core.tenpay.model.q))
        {
          if (!paramString.c(this, null))
            break label322;
          a(new y(cNH(), 13), true, false);
          ab.i("MicroMsg.WalletVertifyCodeUI", "to query bound bank card!");
        }
        paramInt1 = 0;
        continue;
      }
      AppMethodBeat.o(47710);
      bool = false;
      break;
      label322: paramInt1 = 1;
    }
  }

  public final boolean cNR()
  {
    AppMethodBeat.i(47714);
    boolean bool = getIntent().getBooleanExtra("key_need_confirm_finish", false);
    if (((this.pVL != null) && (this.pVL.mXg)) || (bool))
    {
      bool = true;
      AppMethodBeat.o(47714);
    }
    while (true)
    {
      return bool;
      bool = super.cNR();
      AppMethodBeat.o(47714);
    }
  }

  protected final String cRU()
  {
    AppMethodBeat.i(47706);
    String str = bo.bc(this.mBundle.getString("key_mobile"), "");
    if (bo.isNullOrNil(str))
    {
      Bankcard localBankcard = (Bankcard)this.mBundle.getParcelable("key_bankcard");
      if (localBankcard != null)
        str = localBankcard.field_mobile;
    }
    while (true)
    {
      AppMethodBeat.o(47706);
      return str;
    }
  }

  protected final void cRV()
  {
    int i = 2;
    AppMethodBeat.i(47707);
    ab.i("MicroMsg.WalletVertifyCodeUI", "get verify code!");
    Object localObject = com.tencent.mm.plugin.report.service.h.pYm;
    int j;
    if ((this.pVL != null) && (this.pVL.cIf != 0))
    {
      j = 1;
      if (!this.tLf)
        break label168;
      label46: ((com.tencent.mm.plugin.report.service.h)localObject).e(10706, new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      this.tLf = true;
      this.tLc.setClickable(false);
      this.tLc.setEnabled(false);
      if (this.tLg != null)
      {
        this.tLg.cancel();
        this.tLg = null;
      }
      localObject = new a(this.tLa);
      this.tLg = ((a)localObject);
      ((a)localObject).start();
      if (!dOE().x(new Object[] { this.tLd }))
        break label173;
      AppMethodBeat.o(47707);
    }
    while (true)
    {
      return;
      j = 2;
      break;
      label168: i = 1;
      break label46;
      label173: if (rl(false))
      {
        AppMethodBeat.o(47707);
      }
      else
      {
        this.tms = ((Authen)this.mBundle.getParcelable("key_authen"));
        if (this.tms == null)
        {
          ab.w("MicroMsg.WalletVertifyCodeUI", "error authen is null");
          AppMethodBeat.o(47707);
        }
        else
        {
          d.cSP();
          AppMethodBeat.o(47707);
        }
      }
    }
  }

  protected final void cRW()
  {
    AppMethodBeat.i(47709);
    Bundle localBundle = this.mBundle;
    Object localObject = this.mBundle.getString("key_pwd1");
    this.tLd = this.tLb.getText();
    s locals = new s();
    locals.guu = ((String)localObject);
    locals.pGr = this.pVL;
    locals.tCi = this.tLd;
    locals.token = bo.bc(this.mBundle.getString("kreq_token"), "");
    localObject = (Bankcard)localBundle.getParcelable("key_bankcard");
    if (localObject != null)
    {
      locals.pbn = ((Bankcard)localObject).field_bankcardType;
      locals.pbo = ((Bankcard)localObject).field_bindSerial;
      locals.twk = bo.bc(((Bankcard)localObject).field_arrive_type, "");
    }
    while (true)
    {
      ab.d("MicroMsg.WalletVertifyCodeUI", "payInfo " + locals.pGr + " mVerifyCode: " + this.tLd);
      localBundle.putString("key_verify_code", this.tLd);
      com.tencent.mm.wallet_core.a.aE(this);
      ab.i("MicroMsg.WalletVertifyCodeUI", "do verify result : ".concat(String.valueOf(dOE().p(new Object[] { this.tLd, locals }))));
      AppMethodBeat.o(47709);
      return;
      locals.pbn = this.mBundle.getString("key_bank_type");
      if (bo.isNullOrNil(locals.pbn))
        locals.pbn = this.mBundle.getString("key_bind_card_type", "");
    }
  }

  public void finish()
  {
    AppMethodBeat.i(47705);
    ab.i("MicroMsg.WalletVertifyCodeUI", "do finish: %s", new Object[] { bo.dpG() });
    super.finish();
    AppMethodBeat.o(47705);
  }

  public final int getLayoutId()
  {
    return 2130971180;
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(47712);
    if (this.tLb.fx(null))
    {
      this.gEZ.setEnabled(true);
      this.gEZ.setClickable(true);
      AppMethodBeat.o(47712);
    }
    while (true)
    {
      return;
      this.gEZ.setEnabled(false);
      this.gEZ.setClickable(false);
      AppMethodBeat.o(47712);
    }
  }

  public final boolean i(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(47715);
    ab.i("MicroMsg.WalletVertifyCodeUI", "onPreSceneEnd %s %s", new Object[] { Integer.valueOf(paramInt2), paramm });
    if (((paramm instanceof n)) && (paramInt2 == 0))
    {
      this.tLj = true;
      t.makeText(this, 2131305116, 0).show();
      ab.i("MicroMsg.WalletVertifyCodeUI", "tag it isCertInstalled ok");
    }
    AppMethodBeat.o(47715);
    return true;
  }

  public final void initView()
  {
    AppMethodBeat.i(47708);
    Object localObject1 = com.tencent.mm.wallet_core.a.aE(this);
    Bankcard localBankcard = (Bankcard)this.mBundle.getParcelable("key_bankcard");
    this.tLh = ((TextView)findViewById(2131826507));
    this.tLi = ((TextView)findViewById(2131829076));
    this.tLb = ((WalletFormView)findViewById(2131821771));
    this.tLb.setOnInputValidChangeListener(this);
    this.tLc = ((Button)findViewById(2131826508));
    this.tLc.setOnClickListener(new WalletVerifyCodeUI.1(this, localBankcard));
    this.gEZ = ((Button)findViewById(2131821772));
    this.gEZ.setOnClickListener(new WalletVerifyCodeUI.4(this));
    cu();
    this.tLc.setClickable(false);
    this.tLc.setEnabled(false);
    if (this.tLg != null)
    {
      this.tLg.cancel();
      this.tLg = null;
    }
    Object localObject2 = new a(this.tLa);
    this.tLg = ((a)localObject2);
    ((a)localObject2).start();
    TextView localTextView = (TextView)findViewById(2131826509);
    boolean bool1 = this.mBundle.getBoolean("key_is_changing_balance_phone_num");
    boolean bool2 = this.mBundle.getBoolean("key_need_show_switch_phone", false);
    if ((bool1) && (!bool2))
    {
      localTextView.setVisibility(8);
      localObject2 = (PayInfo)this.mBundle.getParcelable("key_pay_info");
      if (localObject2 == null)
        break label511;
    }
    label511: for (int i = ((PayInfo)localObject2).cIf; ; i = 0)
    {
      if (bool2)
      {
        localTextView.setText(2131305403);
        localTextView.setOnClickListener(new WalletVerifyCodeUI.5(this, localBankcard));
      }
      while (true)
      {
        this.tLb.requestFocus();
        localObject1 = this.mBundle.getString("key_QADNA_URL");
        if (!bo.isNullOrNil((String)localObject1))
          addIconOptionMenu(0, 2130840734, new WalletVerifyCodeUI.9(this, (String)localObject1));
        setBackBtn(new WalletVerifyCodeUI.10(this));
        AppMethodBeat.o(47708);
        return;
        localTextView.setVisibility(0);
        break;
        if ((localObject1 != null) && (((com.tencent.mm.wallet_core.c)localObject1).dNH()) && (i != 11) && (i != 21))
        {
          if ((!localBankcard.cPc()) && (!localBankcard.cPd()))
          {
            localTextView.setOnClickListener(new WalletVerifyCodeUI.6(this, localBankcard));
          }
          else
          {
            localObject2 = this.mBundle.getString("key_verify_tail_wording", getString(2131305403));
            localObject1 = localObject2;
            if (bo.isNullOrNil((String)localObject2))
              localObject1 = getString(2131305403);
            localTextView.setText((CharSequence)localObject1);
            localTextView.setOnClickListener(new WalletVerifyCodeUI.7(this, localBankcard));
          }
        }
        else
        {
          localTextView.setText(ae.iq(this));
          localTextView.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(47697);
              WalletVerifyCodeUI.e(WalletVerifyCodeUI.this);
              AppMethodBeat.o(47697);
            }
          });
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 2;
    AppMethodBeat.i(47704);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.WalletVertifyCodeUI", "on create");
    setMMTitle(2131305415);
    this.pVL = ((PayInfo)this.mBundle.getParcelable("key_pay_info"));
    this.pWy = ((Orders)this.mBundle.getParcelable("key_orders"));
    this.tLe = this.mBundle.getString("key_bank_phone");
    this.tLl = new com.tencent.mm.plugin.wallet_core.model.i(this.mBundle);
    this.tLf = false;
    initView();
    paramBundle = com.tencent.mm.plugin.report.service.h.pYm;
    int j;
    if ((this.pVL != null) && (this.pVL.cIf != 0))
    {
      j = 1;
      if (!this.tLf)
        break label310;
    }
    while (true)
    {
      paramBundle.e(10706, new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      d.cSP();
      d.a(this, this.mBundle, 4);
      if (this.tLl.cPm())
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(13731, new Object[] { Integer.valueOf(5) });
        if (!bo.isNullOrNil(this.tLl.tyi.title))
          setMMTitle(this.tLl.tyi.title);
        if (this.tLh != null)
          this.tLh.setText(getString(2131305405));
        if ((this.gEZ != null) && (!bo.isNullOrNil(this.tLl.tyi.Afn)))
          this.gEZ.setText(this.tLl.tyi.Afn);
      }
      this.Ahr.nf(1580);
      AppMethodBeat.o(47704);
      return;
      j = 2;
      break;
      label310: i = 1;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47713);
    this.Ahr.ng(1580);
    super.onDestroy();
    AppMethodBeat.o(47713);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(47711);
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(47711);
    return bool;
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(138557);
    super.onNewIntent(paramIntent);
    cu();
    AppMethodBeat.o(138557);
  }

  public void onResume()
  {
    AppMethodBeat.i(138556);
    super.onResume();
    cu();
    AppMethodBeat.o(138556);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends CountDownTimer
  {
    public a(long arg2)
    {
      super(1000L);
    }

    public final void onFinish()
    {
      AppMethodBeat.i(47702);
      WalletVerifyCodeUI.f(WalletVerifyCodeUI.this).setClickable(true);
      WalletVerifyCodeUI.f(WalletVerifyCodeUI.this).setEnabled(true);
      WalletVerifyCodeUI.f(WalletVerifyCodeUI.this).setText(WalletVerifyCodeUI.this.getString(2131305412));
      AppMethodBeat.o(47702);
    }

    public final void onTick(long paramLong)
    {
      AppMethodBeat.i(47701);
      WalletVerifyCodeUI.f(WalletVerifyCodeUI.this).setText(WalletVerifyCodeUI.this.getString(2131305412) + "(" + paramLong / 1000L + ")");
      AppMethodBeat.o(47701);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI
 * JD-Core Version:    0.6.2
 */