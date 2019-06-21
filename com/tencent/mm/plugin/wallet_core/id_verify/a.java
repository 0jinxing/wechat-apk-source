package com.tencent.mm.plugin.wallet_core.id_verify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.uq;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class a extends b
{
  private int bFZ = 0;
  private boolean eTf = false;
  private String mActivityName = null;
  private int mMode;
  private String tuM = null;
  private boolean tuN = false;
  private int tuO = -1;

  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return 2131304871;
  }

  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(46580);
    F(new Object[] { "start", paramActivity, paramBundle });
    if (this.mqu == null)
      this.mqu = new Bundle();
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
      localBundle = this.mqu;
    boolean bool;
    if (localBundle != null)
    {
      this.mMode = localBundle.getInt("real_name_verify_mode", 0);
      this.tuO = this.mMode;
      localBundle.putBoolean("key_is_realname_verify_process", true);
      this.tuM = localBundle.getString("realname_verify_process_jump_plugin", "");
      this.mActivityName = localBundle.getString("realname_verify_process_jump_activity", "");
      if (localBundle.getInt("realname_verify_process_allow_idverify", 0) != 1)
        break label211;
      bool = true;
      label123: this.tuN = bool;
      ab.i("MicroMsg.RealNameVerifyProcess", "mAllowIdVerify is  mAllowIdVerify: %s,mPluginName %s, mActivityName %s ", new Object[] { Boolean.valueOf(this.tuN), this.tuM, this.mActivityName });
      switch (this.mMode)
      {
      default:
      case 1:
      case 0:
      case 2:
      }
    }
    while (true)
    {
      AppMethodBeat.o(46580);
      return this;
      this.mMode = 0;
      break;
      label211: bool = false;
      break label123;
      localBundle.putBoolean("key_need_bind_response", true);
      x.QN(10);
      super.a(paramActivity, localBundle);
      continue;
      x.QN(10);
      b(paramActivity, SwitchRealnameVerifyModeUI.class, localBundle);
      continue;
      b(paramActivity, WalletRealNameVerifyUI.class, localBundle);
    }
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(46584);
    if ((paramMMActivity instanceof WalletPwdConfirmUI))
      if (this.mMode == 2)
      {
        paramMMActivity = new a.2(this, paramMMActivity, parami);
        AppMethodBeat.o(46584);
      }
    while (true)
    {
      return paramMMActivity;
      paramMMActivity = super.a(paramMMActivity, parami);
      AppMethodBeat.o(46584);
      continue;
      if ((paramMMActivity instanceof WalletRealNameVerifyUI))
      {
        paramMMActivity = new g(paramMMActivity, parami)
        {
          public final CharSequence Au(int paramAnonymousInt)
          {
            AppMethodBeat.i(46579);
            Object localObject1 = null;
            if (paramAnonymousInt == 0)
            {
              Object localObject2 = this.hwd.getString(2131305249);
              localObject1 = this.hwd.getString(2131305245);
              String str = this.hwd.getString(2131305255, new Object[] { localObject2, localObject1 });
              localObject2 = new j(this.hwd);
              SpannableString localSpannableString = new SpannableString(str);
              localSpannableString.setSpan(localObject2, str.length() - ((String)localObject1).length(), str.length(), 33);
              localObject1 = localSpannableString.subSequence(0, localSpannableString.length());
            }
            AppMethodBeat.o(46579);
            return localObject1;
          }

          public final boolean c(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
          {
            return false;
          }

          public final boolean p(Object[] paramAnonymousArrayOfObject)
          {
            return false;
          }
        };
        AppMethodBeat.o(46584);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(46584);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(46582);
    F(new Object[] { "forward", paramActivity, "actionCode:".concat(String.valueOf(paramInt)), paramBundle });
    int i = this.mqu.getInt("real_name_verify_mode", this.mMode);
    if (this.mMode != i)
      this.mMode = i;
    if (this.mMode == 2)
      if ((paramActivity instanceof WalletRealNameVerifyUI))
      {
        b(paramActivity, WalletSetPasswordUI.class, paramBundle);
        AppMethodBeat.o(46582);
      }
    while (true)
    {
      return;
      if ((paramActivity instanceof WalletSetPasswordUI))
      {
        b(paramActivity, WalletPwdConfirmUI.class, paramBundle);
        AppMethodBeat.o(46582);
      }
      else if ((!(paramActivity instanceof WalletPwdConfirmUI)) && ((paramActivity instanceof SwitchRealnameVerifyModeUI)))
      {
        b(paramActivity, WalletRealNameVerifyUI.class, paramBundle);
        this.mMode = 2;
        AppMethodBeat.o(46582);
        continue;
        if (this.mMode == 1)
        {
          if ((paramActivity instanceof SwitchRealnameVerifyModeUI))
          {
            if (r.cPI().cQg())
            {
              b(paramActivity, WalletCheckPwdUI.class, paramBundle);
              AppMethodBeat.o(46582);
            }
            else
            {
              b(paramActivity, WalletBankcardIdUI.class, paramBundle);
              AppMethodBeat.o(46582);
            }
          }
          else if ((paramActivity instanceof WalletCheckPwdUI))
          {
            b(paramActivity, WalletBankcardIdUI.class, paramBundle);
            AppMethodBeat.o(46582);
          }
          else
          {
            super.a(paramActivity, paramInt, paramBundle);
            AppMethodBeat.o(46582);
          }
        }
        else if ((paramActivity instanceof WalletRealNameVerifyUI))
        {
          b(paramActivity, WalletBankcardIdUI.class, paramBundle);
          this.mMode = 1;
          AppMethodBeat.o(46582);
        }
        else
        {
          super.a(paramActivity, paramInt, paramBundle);
        }
      }
      else
      {
        AppMethodBeat.o(46582);
      }
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(46583);
    F(new Object[] { "end", paramActivity, paramBundle });
    x.dNV();
    if (paramBundle == null)
      paramBundle = this.mqu;
    while (true)
    {
      Object localObject = paramBundle;
      if (paramBundle == null)
        localObject = new Bundle();
      if (this.mMode == 1)
      {
        dNI();
        if (((Bundle)localObject).getBoolean("intent_bind_end", false))
        {
          this.bFZ = -1;
          if (((Bundle)localObject).containsKey("intent_bind_end"))
            ((Bundle)localObject).remove("intent_bind_end");
          if (((Bundle)localObject).containsKey("key_is_bind_reg_process"))
            ((Bundle)localObject).remove("key_is_bind_reg_process");
          ((Bundle)localObject).putInt("realname_verify_process_ret", this.bFZ);
          paramBundle = new Intent();
          paramBundle.putExtras((Bundle)localObject);
          if (this.bFZ == -1)
            Toast.makeText(paramActivity, paramActivity.getString(2131302176), 0).show();
          localObject = new uq();
          if (this.bFZ != -1)
            break label250;
          ((uq)localObject).cQP.scene = 17;
        }
      }
      while (true)
      {
        ((uq)localObject).callback = new a.1(this, (uq)localObject, paramBundle, paramActivity);
        ((uq)localObject).callback.run();
        AppMethodBeat.o(46583);
        return;
        this.bFZ = 0;
        break;
        if (((Bundle)localObject).containsKey("realname_verify_process_ret"))
        {
          this.bFZ = ((Bundle)localObject).getInt("realname_verify_process_ret", -1);
          break;
        }
        this.bFZ = 0;
        break;
        label250: if (this.bFZ == 0)
          ((uq)localObject).cQP.scene = 18;
        else
          ((uq)localObject).cQP.scene = 0;
      }
    }
  }

  public final String bxP()
  {
    return "realname_verify_process";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(46581);
    F(new Object[] { "back", paramActivity, Integer.valueOf(paramInt) });
    x.dNV();
    if ((paramActivity instanceof SwitchRealnameVerifyModeUI))
      if (paramInt == 0)
        b(paramActivity, this.mqu);
    while (true)
    {
      if ((paramActivity instanceof WalletPwdConfirmUI))
        a(paramActivity, WalletSetPasswordUI.class, paramInt);
      AppMethodBeat.o(46581);
      return;
      if (((paramActivity instanceof WalletRealNameVerifyUI)) || ((paramActivity instanceof WalletBankcardIdUI)))
      {
        if (this.tuO != 0)
          b(paramActivity, this.mqu);
      }
      else if ((paramActivity instanceof WalletCheckPwdUI))
        b(paramActivity, this.mqu);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.a
 * JD-Core Version:    0.6.2
 */