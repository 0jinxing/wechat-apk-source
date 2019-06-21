package com.tencent.mm.plugin.wallet_ecard.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.t;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wallet_ecard.a.a;
import com.tencent.mm.plugin.wallet_ecard.a.d;
import com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI;
import com.tencent.mm.plugin.wallet_ecard.ui.WalletECardCheckOtherCardUI;
import com.tencent.mm.plugin.wallet_ecard.ui.WalletECardElementInputUI;
import com.tencent.mm.plugin.wallet_ecard.ui.WalletECardFinishUI;
import com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenECardProxyUI;
import com.tencent.mm.plugin.wallet_ecard.ui.WalletOpenLqbProxyUI;
import com.tencent.mm.protocal.protobuf.bfy;
import com.tencent.mm.protocal.protobuf.bhg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.io.IOException;

public class b extends c
{
  private int bwU()
  {
    AppMethodBeat.i(48110);
    int i = this.mqu.getInt(a.tPH);
    AppMethodBeat.o(48110);
    return i;
  }

  private String cSS()
  {
    AppMethodBeat.i(48109);
    String str = this.mqu.getString(a.tPJ);
    AppMethodBeat.o(48109);
    return str;
  }

  private void g(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48105);
    ab.c("MicroMsg.OpenECardProcess", "gotoFinishUI, openScene: %s", new Object[] { Integer.valueOf(bwU()) });
    if (bwU() == 3)
    {
      paramBundle.putInt(a.tPH, 3);
      paramBundle.putString(a.tPN, this.mqu.getString(a.tPN, ""));
      b(paramActivity, WalletOpenLqbProxyUI.class, paramBundle);
      AppMethodBeat.o(48105);
    }
    while (true)
    {
      return;
      b(paramActivity, WalletECardFinishUI.class, null);
      AppMethodBeat.o(48105);
    }
  }

  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48103);
    b(paramActivity, WalletOpenECardProxyUI.class, paramBundle);
    ab.i("MicroMsg.OpenECardProcess", "start open ecard: %s", new Object[] { Integer.valueOf(bwU()) });
    AppMethodBeat.o(48103);
    return this;
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(48111);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new b.b(this, paramMMActivity, parami);
      AppMethodBeat.o(48111);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletVerifyCodeUI))
      {
        paramMMActivity = new b.g(this, paramMMActivity, parami);
        AppMethodBeat.o(48111);
      }
      else if ((paramMMActivity instanceof WalletECardBindCardListUI))
      {
        paramMMActivity = new b.d(this, paramMMActivity, parami);
        AppMethodBeat.o(48111);
      }
      else if ((paramMMActivity instanceof WalletECardCheckOtherCardUI))
      {
        paramMMActivity = new a(paramMMActivity, parami);
        AppMethodBeat.o(48111);
      }
      else if ((paramMMActivity instanceof WalletECardElementInputUI))
      {
        paramMMActivity = new b.e(this, paramMMActivity, parami);
        AppMethodBeat.o(48111);
      }
      else if ((paramMMActivity instanceof WalletOpenECardProxyUI))
      {
        paramMMActivity = new b.c(this, paramMMActivity, parami);
        AppMethodBeat.o(48111);
      }
      else if ((paramMMActivity instanceof WalletOpenLqbProxyUI))
      {
        paramMMActivity = new b.f(this, paramMMActivity, parami);
        AppMethodBeat.o(48111);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(48111);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(48104);
    if ((paramActivity instanceof WalletCheckPwdUI))
      if (paramBundle.getBoolean(a.tPZ, false))
      {
        ab.i("MicroMsg.OpenECardProcess", "forward, is reuse exist card");
        this.mqu.putBoolean(a.tPZ, true);
        b(paramActivity, WalletOpenECardProxyUI.class, paramBundle);
        paramActivity.finish();
        AppMethodBeat.o(48104);
      }
    while (true)
    {
      return;
      b(paramActivity, WalletECardBindCardListUI.class, null);
      AppMethodBeat.o(48104);
      continue;
      if ((paramActivity instanceof WalletECardBindCardListUI))
      {
        if (this.mqu.getInt(a.tPL, a.tQc) == a.tQc)
        {
          if (paramBundle.getBoolean(a.tPW))
          {
            paramBundle.putBoolean("key_need_confirm_finish", true);
            a(paramActivity, WalletVerifyCodeUI.class, null, paramBundle);
            AppMethodBeat.o(48104);
          }
          else
          {
            g(paramActivity, paramBundle);
            AppMethodBeat.o(48104);
          }
        }
        else
        {
          b(paramActivity, WalletECardCheckOtherCardUI.class, null);
          AppMethodBeat.o(48104);
        }
      }
      else if (!(paramActivity instanceof WalletVerifyCodeUI))
      {
        boolean bool2;
        if ((paramActivity instanceof WalletECardCheckOtherCardUI))
        {
          boolean bool1 = paramBundle.getBoolean(a.tPX, false);
          bool2 = paramBundle.getBoolean(a.tPW);
          ab.i("MicroMsg.OpenECardProcess", "input card elem: %s, verify sms: %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
          if (bool1)
          {
            b(paramActivity, WalletECardElementInputUI.class, null);
            AppMethodBeat.o(48104);
          }
          else if (bool2)
          {
            paramBundle.putBoolean("key_need_confirm_finish", true);
            a(paramActivity, WalletVerifyCodeUI.class, null, paramBundle);
            AppMethodBeat.o(48104);
          }
        }
        else if ((paramActivity instanceof WalletECardElementInputUI))
        {
          if (paramBundle.getBoolean(a.tPW))
          {
            paramBundle.putBoolean("key_need_confirm_finish", true);
            a(paramActivity, WalletVerifyCodeUI.class, null, paramBundle);
            AppMethodBeat.o(48104);
          }
          else
          {
            g(paramActivity, paramBundle);
            AppMethodBeat.o(48104);
          }
        }
        else if ((paramActivity instanceof WalletOpenECardProxyUI))
        {
          bool2 = paramBundle.getBoolean(a.tPK, false);
          this.mqu.putBoolean(a.tPK, bool2);
          String str = this.mqu.getString(a.tPI);
          paramInt = bwU();
          int i = paramBundle.getInt("key_ecard_proxy_action", 1);
          ab.i("MicroMsg.OpenECardProcess", "forward openScene: %s, token==null: %s, isTokenInvalid: %s, action: %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bo.isNullOrNil(str)), Boolean.valueOf(bool2), Integer.valueOf(i) });
          if (i == 1)
          {
            if (!bo.isNullOrNil(str))
            {
              if (bool2)
              {
                b(paramActivity, WalletCheckPwdUI.class, paramBundle);
                AppMethodBeat.o(48104);
                continue;
              }
              if (paramInt != 3)
                break label543;
              b(paramActivity, WalletECardBindCardListUI.class, null);
              AppMethodBeat.o(48104);
              continue;
            }
            a(paramActivity, WalletCheckPwdUI.class, paramBundle, 1);
            AppMethodBeat.o(48104);
            continue;
          }
          if (paramBundle.getBoolean(a.tPW))
          {
            paramBundle.putBoolean("key_need_confirm_finish", true);
            a(paramActivity, WalletVerifyCodeUI.class, null, paramBundle);
            AppMethodBeat.o(48104);
          }
        }
      }
      else
      {
        g(paramActivity, paramBundle);
        label543: AppMethodBeat.o(48104);
      }
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(48107);
    ab.i("MicroMsg.OpenECardProcess", "end process: %s", new Object[] { paramActivity });
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
      localBundle = new Bundle();
    paramBundle = new Intent(paramActivity, WalletOpenECardProxyUI.class);
    paramBundle.putExtras(localBundle);
    if (localBundle.containsKey("key_process_result_code"))
      i = localBundle.getInt("key_process_result_code", 0);
    a(paramActivity, WalletOpenECardProxyUI.class, i, paramBundle, true);
    AppMethodBeat.o(48107);
  }

  public final String bxP()
  {
    return "OpenECardProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(48106);
    if (paramInt == 100)
    {
      ab.i("MicroMsg.OpenECardProcess", "back to card list");
      paramInt = bwU();
      String str1 = cSS();
      String str2 = (String)this.mqu.get("key_pwd1");
      this.mqu.clear();
      this.mqu.putInt(a.tPH, paramInt);
      this.mqu.putString(a.tPJ, str1);
      this.mqu.putString("key_pwd1", str2);
      a(paramActivity, WalletECardBindCardListUI.class, 0);
      AppMethodBeat.o(48106);
    }
    while (true)
    {
      return;
      if ((paramActivity instanceof WalletVerifyCodeUI))
      {
        if (this.mqu.getInt(a.tPL) == a.tQc)
        {
          a(paramActivity, WalletECardBindCardListUI.class, 0);
          AppMethodBeat.o(48106);
        }
        else
        {
          a(paramActivity, WalletECardCheckOtherCardUI.class, 0);
        }
      }
      else
        AppMethodBeat.o(48106);
    }
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }

  public final boolean h(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48108);
    ab.d("MicroMsg.OpenECardProcess", "intercept");
    paramBundle.putInt("key_process_result_code", 0);
    boolean bool = super.h(paramActivity, paramBundle);
    AppMethodBeat.o(48108);
    return bool;
  }

  final class a extends g
  {
    public a(MMActivity parami, i arg3)
    {
      super(locali);
    }

    public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
    {
      AppMethodBeat.i(48074);
      if ((paramm instanceof t))
      {
        paramm = (t)paramm;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = new Bundle();
          if ((paramm.tun != null) && (paramm.tun.tyC))
          {
            str = b.F(b.this).getString(a.tPR);
            paramString = b.G(b.this).getString(a.tPS);
            paramm = paramm.tun.pbn;
            b.H(b.this).putString(a.tPT, paramm);
            this.Agm.nf(1985);
            paramString = new d(b.b(b.this), b.e(b.this), str, paramString, paramm, b.m(b.this), false, 0, "");
            this.Agm.a(paramString, true);
          }
        }
      }
      boolean bool;
      while (!(paramm instanceof d))
        while (true)
        {
          String str;
          bool = false;
          AppMethodBeat.o(48074);
          return bool;
          paramString.putBoolean(a.tPX, true);
          b.this.a(this.hwd, 0, paramString);
          continue;
          ab.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramm });
          paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramString });
          h.b(this.hwd, paramString, "", false);
        }
      this.Agm.ng(1985);
      paramm = (d)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (paramm.tQi.kdT == 0)
        {
          paramString = new Bundle();
          paramString.putBoolean(a.tPX, false);
          if ((paramm.tQi.vLd != null) && (!bo.isNullOrNil(paramm.tQi.vLd.title)))
          {
            ab.i("MicroMsg.OpenECardProcess", "no need verify sms");
            paramString.putBoolean(a.tPW, false);
          }
        }
      while (true)
      {
        try
        {
          b.I(b.this).putByteArray(a.tQa, paramm.tQi.vLd.toByteArray());
          b.this.a(this.hwd, 0, paramString);
          bool = true;
          AppMethodBeat.o(48074);
        }
        catch (IOException paramm)
        {
          ab.printErrStackTrace("MicroMsg.OpenECardProcess", paramm, "", new Object[0]);
          continue;
        }
        ab.i("MicroMsg.OpenECardProcess", "need verfiy sms");
        paramString.putBoolean(a.tPW, true);
        paramString.putString(a.tPU, paramm.tQi.vLb);
        paramString.putString(a.tPV, paramm.tQi.wJO);
        continue;
        if ((!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm.tQi.vLc)) && (!com.tencent.mm.plugin.wallet_ecard.a.b.a((WalletBaseUI)this.hwd, paramm, paramm.kCl, paramm.kCm, paramm.tQi.kdT, paramm.tQi.kdU)))
        {
          paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramm.tQi.kdU, paramm.kCm, paramString });
          h.b(this.hwd, paramString, "", false);
          continue;
          ab.w("MicroMsg.OpenECardProcess", "net error: %s", new Object[] { paramm });
          paramString = com.tencent.mm.plugin.wallet_ecard.a.b.d(this.hwd, new String[] { paramString });
          h.b(this.hwd, paramString, "", false);
        }
      }
    }

    public final boolean p(Object[] paramArrayOfObject)
    {
      AppMethodBeat.i(48073);
      String str = (String)paramArrayOfObject[0];
      paramArrayOfObject = (String)paramArrayOfObject[1];
      b.D(b.this).putString(a.tPR, str);
      b.E(b.this).putString(a.tPS, paramArrayOfObject);
      paramArrayOfObject = new t("", str, null);
      this.Agm.a(paramArrayOfObject, true);
      AppMethodBeat.o(48073);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.b
 * JD-Core Version:    0.6.2
 */