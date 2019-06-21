package com.tencent.mm.plugin.wallet_payu.remittance.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.order.c.a;
import com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI;
import com.tencent.mm.plugin.wallet_payu.remittance.a.b;
import com.tencent.mm.plugin.wallet_payu.remittance.a.c;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class PayURemittanceDetailUI extends RemittanceDetailUI
{
  private int pVq;
  private String pWz;
  private int pcD;
  private int pcE;
  private String tUC;
  private String tUD;
  private int tUE;
  private int tUF;

  public final void BK(int paramInt)
  {
    AppMethodBeat.i(48554);
    a(new com.tencent.mm.plugin.wallet_payu.remittance.a.e(this.pRG, this.pVm, this.pVj), true, false);
    AppMethodBeat.o(48554);
  }

  public final void BL(int paramInt)
  {
    AppMethodBeat.i(48555);
    a(new com.tencent.mm.plugin.wallet_payu.remittance.a.e(this.pRG, this.pVm, this.pVj, paramInt), true, false);
    AppMethodBeat.o(48555);
  }

  public final void an(Intent paramIntent)
  {
    AppMethodBeat.i(48556);
    d.b(this, "wallet_payu", ".remittance.ui.PayURemittanceResendMsgUI", paramIntent);
    AppMethodBeat.o(48556);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(48559);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((paramm instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.e))
    {
      paramString = (com.tencent.mm.plugin.wallet_payu.remittance.a.e)paramm;
      if (paramString.czE == 0)
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if ((this.pVk == 1) && (!getIntent().getBooleanExtra("is_sender", false)))
          {
            this.pUy.setImageResource(2130840747);
            this.pUz.setText(2131302410);
            this.pUA.setText(com.tencent.mm.wallet_core.ui.e.e(paramString.kCJ, paramString.pcl));
            this.pUD.setVisibility(0);
            this.pUD.setOnClickListener(new PayURemittanceDetailUI.6(this));
            localObject1 = getString(2131302414, new Object[] { Integer.valueOf(this.pVo) });
            localObject2 = getString(2131302402);
            localObject3 = new SpannableString((String)localObject1 + (String)localObject2);
            paramm = new a(this);
            paramm.peT = new PayURemittanceDetailUI.7(this);
            ((SpannableString)localObject3).setSpan(paramm, ((String)localObject1).length(), ((String)localObject1).length() + ((String)localObject2).length(), 33);
            this.ocV.setMovementMethod(LinkMovementMethod.getInstance());
            this.ocV.setText((CharSequence)localObject3);
            this.pUB.setText(getString(2131302419, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(paramString.pQf) }));
            this.pUB.setVisibility(0);
            this.pUC.setVisibility(8);
          }
          AppMethodBeat.o(48559);
        }
    }
    while (true)
    {
      return bool1;
      BL(0);
      AppMethodBeat.o(48559);
      continue;
      bool1 = bool2;
      if (paramInt1 == 0)
      {
        bool1 = bool2;
        if (paramInt2 == 0)
        {
          this.tUE = paramString.status;
          this.tUF = paramString.pQf;
          this.pcE = paramString.tUy;
          this.pcD = paramString.tUz;
          this.pVq = ((int)(paramString.kCJ * 100.0D));
          this.tUC = paramString.pcl;
          paramm = r.Yz();
          bool1 = this.pWz.equals(paramm);
          this.pUD.setVisibility(8);
          this.pUA.setText(com.tencent.mm.wallet_core.ui.e.e(this.pVq / 100.0D, this.tUC));
          this.pUE.setVisibility(0);
          this.pUZ.setVisibility(8);
          paramInt1 = this.tUE;
        }
      }
      switch (paramInt1)
      {
      default:
        finish();
        bool1 = true;
        if (paramString.bJt == 1)
        {
          g.RQ();
          if (!((String)g.RP().Ry().get(327729, "0")).equals("0"))
            break label1566;
          h.a(this.mController.ylL, 2131298125, 2131305293, new PayURemittanceDetailUI.8(this));
          g.RQ();
          g.RP().Ry().set(327729, "1");
        }
        break;
      case 2000:
      case 2001:
      case 2002:
      case 2003:
      }
      while (true)
      {
        AppMethodBeat.o(48559);
        break;
        if (!bool1)
        {
          paramm = getString(2131302411, new Object[] { bc(this.pWz, true) });
          this.pUz.setText(j.b(this, paramm, this.pUz.getTextSize()));
          localObject1 = getString(2131302418, new Object[] { Integer.valueOf(this.pVo) });
          localObject3 = getString(2131302456);
          paramm = new SpannableString((String)localObject1 + (String)localObject3);
          localObject2 = new a(this);
          ((a)localObject2).peT = new PayURemittanceDetailUI.1(this);
          paramm.setSpan(localObject2, ((String)localObject1).length(), ((String)localObject1).length() + ((String)localObject3).length(), 33);
          this.ocV.setMovementMethod(LinkMovementMethod.getInstance());
          this.ocV.setText(paramm);
        }
        while (true)
        {
          this.pUy.setImageResource(2130840747);
          this.pUB.setText(getString(2131302419, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(this.pcE) }));
          this.pUB.setVisibility(0);
          this.pUC.setVisibility(8);
          bool1 = true;
          break;
          this.pUy.setImageResource(2130840747);
          this.pUD.setVisibility(0);
          this.pUD.setOnClickListener(new PayURemittanceDetailUI.2(this));
          localObject2 = getString(2131302414, new Object[] { Integer.valueOf(this.pVo) });
          paramm = getString(2131302402);
          localObject1 = new SpannableString((String)localObject2 + paramm);
          localObject3 = new a(this);
          ((a)localObject3).peT = new PayURemittanceDetailUI.3(this);
          ((SpannableString)localObject1).setSpan(localObject3, ((String)localObject2).length(), ((String)localObject2).length() + paramm.length(), 33);
          this.ocV.setMovementMethod(LinkMovementMethod.getInstance());
          this.ocV.setText((CharSequence)localObject1);
        }
        this.pUy.setImageResource(2131231868);
        if (bool1)
        {
          this.pUz.setText(2131302405);
          localObject1 = getString(2131302386);
          localObject3 = new SpannableString((CharSequence)localObject1);
          paramm = new a(this);
          paramm.peT = new PayURemittanceDetailUI.4(this);
          ((SpannableString)localObject3).setSpan(paramm, 0, ((String)localObject1).length(), 33);
          this.ocV.setMovementMethod(LinkMovementMethod.getInstance());
          this.ocV.setText((CharSequence)localObject3);
          this.ocV.setVisibility(0);
        }
        while (true)
        {
          this.pUB.setText(getString(2131302419, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(this.tUF) }));
          this.pUB.setVisibility(0);
          this.pUC.setText(getString(2131302394, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(this.pcD) }));
          this.pUC.setVisibility(0);
          bool1 = true;
          break;
          paramm = bc(this.pWz, true) + " " + getString(2131302405);
          this.pUz.setText(j.b(this, paramm, this.pUz.getTextSize()));
          this.ocV.setVisibility(8);
        }
        if ((paramInt1 == 2003) && (!bool1))
        {
          this.pUy.setImageResource(2131231870);
          this.pUz.setText(2131302409);
          label1265: if (bool1)
            break label1553;
          paramm = getString(2131302399);
          localObject3 = getString(2131302386);
          localObject2 = new SpannableString(paramm + (String)localObject3);
          localObject1 = new a(this);
          ((a)localObject1).peT = new PayURemittanceDetailUI.5(this);
          ((SpannableString)localObject2).setSpan(localObject1, paramm.length(), paramm.length() + ((String)localObject3).length(), 33);
          this.ocV.setMovementMethod(LinkMovementMethod.getInstance());
          this.ocV.setText((CharSequence)localObject2);
        }
        while (true)
        {
          this.ocV.setVisibility(0);
          this.pUB.setText(getString(2131302419, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(this.tUF) }));
          this.pUB.setVisibility(0);
          this.pUC.setText(getString(2131302397, new Object[] { com.tencent.mm.wallet_core.ui.e.kC(this.pcE) }));
          this.pUC.setVisibility(0);
          bool1 = true;
          break;
          this.pUy.setImageResource(2131231869);
          if (bool1)
          {
            this.pUz.setText(2131302407);
            break label1265;
          }
          paramm = bc(this.pWz, true) + getString(2131302407);
          this.pUz.setText(j.b(this, paramm, this.pUz.getTextSize()));
          break label1265;
          label1553: this.ocV.setText("");
        }
        label1566: h.bQ(this.mController.ylL, getString(2131302392));
      }
      if (((paramm instanceof c)) || ((paramm instanceof b)))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if ((paramm instanceof c))
            BL(1);
          while (true)
          {
            AppMethodBeat.o(48559);
            break;
            aZ(0, getString(2131302393));
          }
        }
        aZ(paramInt2, paramString);
        AppMethodBeat.o(48559);
      }
      else
      {
        AppMethodBeat.o(48559);
        bool1 = false;
      }
    }
  }

  public final void cfV()
  {
    AppMethodBeat.i(48557);
    a(new c(this.pRG, this.pVq, this.tUC, this.pVm), true, true);
    AppMethodBeat.o(48557);
  }

  public final void cfW()
  {
    AppMethodBeat.i(48558);
    a(new b(this.pRG, this.pVq, this.tUC, this.pVm), true, true);
    AppMethodBeat.o(48558);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48553);
    super.onCreate(paramBundle);
    this.pVq = getIntent().getIntExtra("total_fee", 0);
    this.tUC = getIntent().getStringExtra("fee_type");
    if (getIntent().getBooleanExtra("is_sender", false))
    {
      this.tUD = r.Yz();
      this.pWz = this.pVm;
      AppMethodBeat.o(48553);
    }
    while (true)
    {
      return;
      this.tUD = this.pVm;
      this.pWz = r.Yz();
      AppMethodBeat.o(48553);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.remittance.ui.PayURemittanceDetailUI
 * JD-Core Version:    0.6.2
 */