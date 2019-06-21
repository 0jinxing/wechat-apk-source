package com.tencent.mm.plugin.wxcredit.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wxcredit.a.d;
import com.tencent.mm.plugin.wxcredit.a.j;
import com.tencent.mm.plugin.wxcredit.a.k;
import com.tencent.mm.plugin.wxcredit.b;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;

@com.tencent.mm.ui.base.a(3)
public class WalletWXCreditDetailUI extends WalletPreferenceUI
{
  private f ehK;
  private boolean hasInit;
  private View.OnClickListener qqV;
  private Bankcard tmw;
  private com.tencent.mm.wallet_core.c uZv;
  private k uZw;

  public WalletWXCreditDetailUI()
  {
    AppMethodBeat.i(48725);
    this.hasInit = false;
    this.qqV = new WalletWXCreditDetailUI.3(this);
    AppMethodBeat.o(48725);
  }

  private void ceo()
  {
    AppMethodBeat.i(48734);
    addIconOptionMenu(0, 2130839555, new WalletWXCreditDetailUI.4(this));
    AppMethodBeat.o(48734);
  }

  private void cu()
  {
    AppMethodBeat.i(48730);
    if (!this.hasInit)
      initView();
    Object localObject1;
    Object localObject2;
    if (this.uZw != null)
    {
      localObject1 = (WalletWXCreditDetailHeaderPreference)this.ehK.aqO("wallet_wxcredit_header");
      double d = this.uZw.uYB;
      ((WalletWXCreditDetailHeaderPreference)localObject1).gng.setText(com.tencent.mm.wallet_core.ui.e.G(d));
      String str = this.tmw.field_bankName;
      localObject2 = this.uZw.uYM;
      ((WalletWXCreditDetailHeaderPreference)localObject1).uZu.setText(((Preference)localObject1).mContext.getString(2131305518, new Object[] { localObject2, str }));
    }
    boolean bool;
    if (this.uZw != null)
    {
      this.ehK.aqO("wallet_wxcredit_total_amount").setTitle(getString(2131305492, new Object[] { com.tencent.mm.wallet_core.ui.e.G(this.uZw.uYv) }));
      localObject1 = this.ehK;
      if (this.uZw.uYG)
        break label367;
      bool = true;
      ((f)localObject1).ce("wallet_wxcredit_change_amount", bool);
      localObject1 = this.ehK.aqO("wallet_wxcredit_bill");
      if (this.uZw.uYC != 0.0D)
        ((Preference)localObject1).setSummary(com.tencent.mm.wallet_core.ui.e.G(this.uZw.uYC));
      localObject1 = this.ehK.aqO("wallet_wxcredit_repayment");
      localObject2 = this.ehK.aqO("wallet_wxcredit_repayment_tips");
      if (this.uZw.uYE <= 0.0D)
        break label373;
      ((Preference)localObject1).setSummary(com.tencent.mm.wallet_core.ui.e.G(this.uZw.uYE));
      ((Preference)localObject2).setTitle(getString(2131305516, new Object[] { this.uZw.uYJ }));
      this.ehK.ce("wallet_wxcredit_repayment_tips", false);
    }
    while (true)
    {
      if (this.tmw != null)
        this.ehK.aqO("wallet_wxcredit_bank_name").setTitle(this.tmw.field_bankName);
      ((WalletWXCreditDetailFooterPreference)this.ehK.aqO("wallet_wxcredit_footer")).qqV = this.qqV;
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(48730);
      return;
      label367: bool = false;
      break;
      label373: this.ehK.ce("wallet_wxcredit_repayment_tips", true);
    }
  }

  private boolean dgI()
  {
    boolean bool = false;
    AppMethodBeat.i(48727);
    if (this.tmw == null)
      AppMethodBeat.o(48727);
    while (true)
    {
      return bool;
      if (this.tmw.field_bankcardState == 0)
      {
        AppMethodBeat.o(48727);
        bool = true;
      }
      else
      {
        int i = this.tmw.field_wxcreditState;
        if (this.uZw != null)
          i = this.uZw.uYA;
        switch (i)
        {
        case 2:
        default:
          AppMethodBeat.o(48727);
          bool = true;
          break;
        case 1:
          if (r.cPI().cQM())
          {
            AppMethodBeat.o(48727);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(48727);
          }
          break;
        case 3:
          h.a(this, 2131305490, -1, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(48720);
              WalletWXCreditDetailUI.this.dOM().a(new com.tencent.mm.plugin.wxcredit.a.i(WalletWXCreditDetailUI.a(WalletWXCreditDetailUI.this).field_bankcardType, WalletWXCreditDetailUI.a(WalletWXCreditDetailUI.this).twO), true, 1);
              AppMethodBeat.o(48720);
            }
          });
          AppMethodBeat.o(48727);
          break;
        case 5:
          this.uZv.mqu.putBoolean("key_can_unbind", false);
        case 4:
          if (this.uZw != null)
          {
            this.uZv.mqu.putString("key_repayment_url", this.uZw.uYI);
            this.uZv.a(this, 1, this.uZv.mqu);
            AppMethodBeat.o(48727);
          }
          else
          {
            AppMethodBeat.o(48727);
            bool = true;
          }
          break;
        }
      }
    }
  }

  public final int JC()
  {
    return 2131165317;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = false;
    AppMethodBeat.i(48731);
    paramf = paramPreference.mKey;
    if ("wallet_wxcredit_change_amount".equals(paramf))
    {
      paramf = new Bundle();
      paramf.putParcelable("key_bankcard", this.tmw);
      com.tencent.mm.wallet_core.a.a(this, b.class, paramf);
      bool = true;
      AppMethodBeat.o(48731);
      return bool;
    }
    if ("wallet_wxcredit_bill".equals(paramf))
      if (this.uZw != null)
      {
        paramf = new Bundle();
        paramf.putString("key_url", this.uZw.pPO);
        com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wxcredit.c.class, paramf);
      }
    while (true)
    {
      AppMethodBeat.o(48731);
      break;
      if ("wallet_wxcredit_card_info".equals(paramf))
      {
        if (this.uZw != null)
        {
          paramf = new Bundle();
          paramf.putString("key_url", this.uZw.uYK);
          com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wxcredit.c.class, paramf);
        }
      }
      else if ("wallet_wxcredit_right".equals(paramf))
      {
        if (this.uZw != null)
          com.tencent.mm.wallet_core.ui.e.n(this, this.uZw.uYL, false);
      }
      else if ("wallet_wxcredit_repayment".equals(paramf))
      {
        if (this.uZw != null)
          com.tencent.mm.wallet_core.ui.e.n(this, this.uZw.uYI, false);
      }
      else if (("wallet_wxcredit_bank_name".equals(paramf)) && (this.uZw != null))
        com.tencent.mm.wallet_core.ui.e.ae(this, this.uZw.uYO.username);
    }
  }

  public final boolean f(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48732);
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramm instanceof d))
      {
        r.cPI().tDc = (System.currentTimeMillis() / 1000L);
        this.uZw = ((d)paramm).uYw;
        if ((this.uZw != null) && (this.uZw.uYA == 2))
        {
          com.tencent.mm.kernel.g.RQ();
          if (((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(196658, Boolean.FALSE)).booleanValue())
          {
            paramm = com.tencent.mm.wallet_core.a.aE(this);
            paramString = paramm.mqu;
            paramString.putDouble("key_total_amount", this.uZw.uYv);
            paramString.putBoolean("key_can_upgrade_amount", this.uZw.uYG);
            paramm.a(this, WalletWXCreditOpenNotifyUI.class, paramString, 1);
          }
        }
        while (true)
        {
          AppMethodBeat.o(48732);
          bool = true;
          return bool;
          if (dgI())
          {
            AM(0);
            cu();
          }
        }
      }
      if (!(paramm instanceof com.tencent.mm.plugin.wxcredit.a.i))
        break label211;
      dOM().a(new y(), true, 1);
    }
    while (true)
    {
      AppMethodBeat.o(48732);
      bool = false;
      break;
      label211: if ((paramm instanceof y))
        finish();
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(48729);
    this.hasInit = true;
    setMMTitle(2131305491);
    this.ehK = this.yCw;
    setBackBtn(new WalletWXCreditDetailUI.2(this));
    ceo();
    AppMethodBeat.o(48729);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48733);
    AM(0);
    cu();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(48733);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48726);
    super.onCreate(paramBundle);
    dOM().nf(621);
    dOM().nf(600);
    AM(4);
    this.uZv = com.tencent.mm.wallet_core.a.aE(this);
    if (this.tmw == null)
      this.tmw = ((Bankcard)this.uZv.mqu.getParcelable("key_bankcard"));
    if (dgI())
    {
      if (this.Ahs == null)
      {
        if (this.Ahq == null)
          this.Ahq = com.tencent.mm.wallet_core.a.aE(this);
        this.Ahs = this.Ahq.a(this, this.Ahr);
      }
      if (!this.Ahs.w(new Object[] { this.tmw }))
      {
        AM(0);
        initView();
      }
    }
    AppMethodBeat.o(48726);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48728);
    dOM().ng(621);
    dOM().ng(600);
    super.onDestroy();
    AppMethodBeat.o(48728);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI
 * JD-Core Version:    0.6.2
 */