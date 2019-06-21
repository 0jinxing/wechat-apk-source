package com.tencent.mm.plugin.order.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.a.a;
import com.tencent.mm.plugin.order.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;
import com.tencent.mm.wallet_core.ui.c;
import java.util.List;

public class MallOrderTransactionInfoUI extends WalletPreferenceUI
{
  protected f iFE;
  private int peo;
  private MallTransactionObject pep = null;
  private c peq;

  private Bundle bZi()
  {
    AppMethodBeat.i(43883);
    Bundle localBundle1 = com.tencent.mm.wallet_core.a.aD(this);
    Bundle localBundle2 = localBundle1;
    if (localBundle1 == null)
      localBundle2 = new Bundle();
    AppMethodBeat.o(43883);
    return localBundle2;
  }

  public final int JC()
  {
    return 2131165248;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    return false;
  }

  public final boolean f(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(43882);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramm instanceof com.tencent.mm.plugin.order.model.h))
      {
        paramString = ((com.tencent.mm.plugin.order.model.h)paramm).pcS;
        if (paramString != null)
        {
          this.pep = paramString.pbI;
          this.iFE.removeAll();
          AppCompatActivity localAppCompatActivity = this.mController.ylL;
          f localf = this.iFE;
          MallTransactionObject localMallTransactionObject = this.pep;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = this.peq;
          if (localMallTransactionObject == null)
          {
            paramString = null;
            if (paramString != null)
              for (paramInt1 = 0; paramInt1 < paramString.size(); paramInt1++)
              {
                paramm = (Preference)paramString.get(paramInt1);
                this.iFE.b(paramm);
              }
          }
          else
          {
            switch (localMallTransactionObject.cQO)
            {
            default:
              paramm = new com.tencent.mm.plugin.order.ui.a.a();
              paramString = paramm;
              if ((arrayOfObject[0] instanceof c))
                ((com.tencent.mm.plugin.order.ui.a.a)paramm).peq = ((c)arrayOfObject[0]);
              break;
            case 21:
            }
            for (paramString = paramm; ; paramString = new b())
            {
              paramString = paramString.a(localAppCompatActivity, localf, localMallTransactionObject);
              break;
            }
          }
          this.iFE.notifyDataSetChanged();
        }
      }
      AppMethodBeat.o(43882);
      bool = true;
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(43882);
    }
  }

  public final int getLayoutId()
  {
    return 2130970063;
  }

  public final void initView()
  {
    AppMethodBeat.i(43880);
    setMMTitle(2131301335);
    setBackBtn(new MallOrderTransactionInfoUI.2(this));
    this.iFE = this.yCw;
    this.peq = new c(this);
    this.peq.ase();
    AppMethodBeat.o(43880);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(43879);
    super.onCreate(paramBundle);
    paramBundle = com.tencent.mm.wallet_core.a.aE(this);
    String str;
    if ((paramBundle != null) && ((paramBundle instanceof com.tencent.mm.plugin.order.a.a)))
    {
      str = bZi().getString("key_trans_id");
      paramBundle = bZi().getString("bill_id");
    }
    while (true)
    {
      if (bo.isNullOrNil(str))
      {
        ab.w("MicroMsg.mmui.MMPreference", "mOrders info is Illegal!");
        com.tencent.mm.ui.base.h.a(this.mController.ylL, 2131305049, 0, new MallOrderTransactionInfoUI.1(this));
      }
      this.peo = bZi().getInt("key_pay_type");
      initView();
      dOM().a(new com.tencent.mm.plugin.order.model.h(str, paramBundle), true, 1);
      AppMethodBeat.o(43879);
      return;
      if ((getIntent().getIntExtra("scene", 0) == 1) || (getIntent().getIntExtra("scene", 0) == 2))
      {
        str = getIntent().getStringExtra("trans_id");
        paramBundle = getIntent().getStringExtra("bill_id");
      }
      else
      {
        paramBundle = null;
        str = null;
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(43881);
    super.onDestroy();
    if (this.peq != null)
      this.peq.release();
    AppMethodBeat.o(43881);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI
 * JD-Core Version:    0.6.2
 */