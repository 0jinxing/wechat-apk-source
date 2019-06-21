package com.tencent.mm.plugin.wallet_core.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wallet_core.utils.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.c.z;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class b extends a
{
  public c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(46476);
    F(new Object[] { "start", paramActivity, paramBundle });
    ab.d("MicroMsg.BindCardProcess", "start Process : BindCardProcess");
    if (paramBundle != null)
    {
      z.hL(6, paramBundle.getInt("key_bind_scene"));
      x.QN(paramBundle.getInt("key_bind_scene"));
      if (!r.cPI().cQg())
        break label96;
      b(paramActivity, WalletCheckPwdUI.class, paramBundle);
      AppMethodBeat.o(46476);
      paramActivity = this;
    }
    while (true)
    {
      return paramActivity;
      z.hL(6, 0);
      x.QN(0);
      break;
      label96: if (paramBundle != null)
        d.gj(paramBundle.getInt("key_bind_scene", 0), 1);
      if ((paramBundle != null) && (paramBundle.getBoolean("key_is_import_bind", false)))
      {
        b(paramActivity, WalletCardImportUI.class, paramBundle);
        AppMethodBeat.o(46476);
        paramActivity = this;
      }
      else
      {
        paramActivity = super.a(paramActivity, paramBundle);
        AppMethodBeat.o(46476);
      }
    }
  }

  public g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(46478);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new b.1(this, paramMMActivity, parami);
      AppMethodBeat.o(46478);
    }
    while (true)
    {
      return paramMMActivity;
      if (((paramMMActivity instanceof WalletCardElementUI)) || ((paramMMActivity instanceof WalletCardImportUI)))
      {
        paramMMActivity = new b.2(this, paramMMActivity, parami);
        AppMethodBeat.o(46478);
      }
      else if ((paramMMActivity instanceof WalletVerifyCodeUI))
      {
        paramMMActivity = new b.3(this, paramMMActivity, parami);
        AppMethodBeat.o(46478);
      }
      else if ((paramMMActivity instanceof WalletPwdConfirmUI))
      {
        paramMMActivity = new b.4(this, paramMMActivity, parami);
        AppMethodBeat.o(46478);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(46478);
      }
    }
  }

  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(46477);
    F(new Object[] { "forward", paramActivity, Integer.valueOf(paramInt), paramBundle });
    ab.i("MicroMsg.BindCardProcess", "forward Process : BindCardProcess");
    if ((paramActivity instanceof WalletCheckPwdUI))
      if (paramBundle.getBoolean("key_is_import_bind", false))
      {
        b(paramActivity, WalletCardImportUI.class, paramBundle);
        AppMethodBeat.o(46477);
      }
    while (true)
    {
      return;
      b(paramActivity, WalletBankcardIdUI.class, paramBundle);
      AppMethodBeat.o(46477);
      continue;
      if (((paramActivity instanceof WalletCardElementUI)) || ((paramActivity instanceof WalletCardImportUI)))
      {
        if (!cRY())
        {
          ab.i("MicroMsg.BindCardProcess", "is domestic bankcard! need verify code!");
          b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
          AppMethodBeat.o(46477);
        }
        else if (!r.cPI().cQg())
        {
          ab.i("MicroMsg.BindCardProcess", "wallet is not register, start WalletSetPasswordUI!");
          b(paramActivity, WalletSetPasswordUI.class, paramBundle);
          AppMethodBeat.o(46477);
        }
        else
        {
          ab.i("MicroMsg.BindCardProcess", "bind bank card success!!");
          paramBundle.putBoolean("intent_bind_end", true);
          com.tencent.mm.ui.base.h.bQ(paramActivity, paramActivity.getString(2131304583));
          b(paramActivity, paramBundle);
          AppMethodBeat.o(46477);
        }
      }
      else
      {
        BindCardOrder localBindCardOrder;
        String str1;
        String str2;
        String str3;
        int i;
        if (((paramActivity instanceof WalletVerifyCodeUI)) && (r.cPI().cQg()))
        {
          ab.i("MicroMsg.BindCardProcess", "end process after verify!");
          paramInt = this.mqu.getInt("key_bind_scene", -1);
          localBindCardOrder = (BindCardOrder)this.mqu.getParcelable("key_bindcard_value_result");
          if ((localBindCardOrder != null) && (paramInt == 15))
          {
            str1 = this.mqu.getString("key_bind_card_type");
            str2 = this.mqu.getString("key_bind_card_show1");
            str3 = this.mqu.getString("key_bind_card_show2");
            i = this.mqu.getInt("key_bind_scene");
            paramInt = this.mqu.getInt("realname_scene");
            ab.i("MicroMsg.BindCardProcess", "order ok bank_type %s  bank_type_show %s scene %s realnameScene %s", new Object[] { str1, str2, Integer.valueOf(i), Integer.valueOf(paramInt) });
            localBindCardOrder.pbn = str1;
            localBindCardOrder.txI = str2;
            localBindCardOrder.txJ = str3;
            localBindCardOrder.txL = i;
            localBindCardOrder.txM = paramInt;
            b(paramActivity, WalletBindCardResultUI.class, paramBundle);
            AppMethodBeat.o(46477);
          }
          else
          {
            b(paramActivity, paramBundle);
            AppMethodBeat.o(46477);
          }
        }
        else if ((paramActivity instanceof WalletPwdConfirmUI))
        {
          ab.i("MicroMsg.BindCardProcess", "end process after confirm pwd!");
          d.gj(this.mqu.getInt("key_bind_scene", 0), 7);
          paramBundle.putBoolean("intent_bind_end", true);
          com.tencent.mm.ui.base.h.bQ(paramActivity, paramActivity.getString(2131304583));
          localBindCardOrder = (BindCardOrder)this.mqu.getParcelable("key_bindcard_value_result");
          paramInt = this.mqu.getInt("key_bind_scene", -1);
          if ((localBindCardOrder != null) && (paramInt == 15))
          {
            str3 = this.mqu.getString("key_bind_card_type");
            str1 = this.mqu.getString("key_bind_card_show1");
            str2 = this.mqu.getString("key_bind_card_show2");
            paramInt = this.mqu.getInt("key_bind_scene");
            i = this.mqu.getInt("realname_scene");
            ab.i("MicroMsg.BindCardProcess", "order ok bank_type %s  bank_type_show %s scene %s realnameScene %s", new Object[] { str3, str1, Integer.valueOf(paramInt), Integer.valueOf(i) });
            localBindCardOrder.pbn = str3;
            localBindCardOrder.txI = str1;
            localBindCardOrder.txJ = str2;
            localBindCardOrder.txL = paramInt;
            localBindCardOrder.txM = i;
            b(paramActivity, WalletBindCardResultUI.class, paramBundle);
            AppMethodBeat.o(46477);
          }
          else
          {
            b(paramActivity, paramBundle);
            AppMethodBeat.o(46477);
          }
        }
        else if ((paramActivity instanceof WalletBindCardResultUI))
        {
          b(paramActivity, paramBundle);
          AppMethodBeat.o(46477);
        }
        else
        {
          ab.i("MicroMsg.BindCardProcess", "super forward!");
          super.a(paramActivity, 0, paramBundle);
          AppMethodBeat.o(46477);
        }
      }
    }
  }

  public final void a(i parami)
  {
    AppMethodBeat.i(46479);
    ab.d("MicroMsg.BindCardProcess", "do set user exinfo");
    parami.a(new com.tencent.mm.plugin.wallet_core.id_verify.model.h(this.mqu.getString("key_country_code", ""), this.mqu.getString("key_province_code", ""), this.mqu.getString("key_city_code", ""), (Profession)this.mqu.getParcelable("key_profession"), this.mqu.getString("key_country_iso")), false, 1);
    AppMethodBeat.o(46479);
  }

  public void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(46480);
    F(new Object[] { "end", paramActivity, paramBundle });
    ab.i("MicroMsg.BindCardProcess", "end Process : BindCardProcess");
    x.dNV();
    dNI();
    if ((paramBundle != null) && (paramBundle.getBoolean("key_need_bind_response", false)))
    {
      Intent localIntent = new Intent();
      localIntent.putExtras(paramBundle);
      a(paramActivity, "wallet", ".bind.ui.WalletBindUI", -1, localIntent, false);
      AppMethodBeat.o(46480);
    }
    while (true)
    {
      return;
      d(paramActivity, "mall", ".ui.MallIndexUI");
      AppMethodBeat.o(46480);
    }
  }

  public String bxP()
  {
    return "BindCardProcess";
  }

  public boolean c(Activity paramActivity, Bundle paramBundle)
  {
    boolean bool = true;
    AppMethodBeat.i(46481);
    if (r.cPI().cQg())
      if (((paramActivity instanceof WalletCardElementUI)) && (cRY()))
        AppMethodBeat.o(46481);
    while (true)
    {
      return bool;
      if ((paramActivity instanceof WalletVerifyCodeUI))
      {
        AppMethodBeat.o(46481);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(46481);
        continue;
        bool = paramActivity instanceof WalletPwdConfirmUI;
        AppMethodBeat.o(46481);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.b.b
 * JD-Core Version:    0.6.2
 */