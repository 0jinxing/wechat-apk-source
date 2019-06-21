package com.tencent.mm.plugin.wallet.pay;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.g.a.uv.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI;
import com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI;
import com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI;
import com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyIdCardUI;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.gz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.x;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b extends com.tencent.mm.plugin.wallet_core.b.a
{
  private List<WeakReference<WalletBaseUI>> tnV;

  public b()
  {
    AppMethodBeat.i(45892);
    this.tnV = new ArrayList();
    AppMethodBeat.o(45892);
  }

  private boolean cNG()
  {
    boolean bool = true;
    AppMethodBeat.i(138085);
    int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUA, Integer.valueOf(0))).intValue();
    if ((com.tencent.mm.sdk.a.b.dnO()) || (f.IS_FLAVOR_RED) || (f.IS_FLAVOR_PURPLE))
      i = 1;
    while (true)
    {
      Orders localOrders = (Orders)this.mqu.getParcelable("key_orders");
      if ((i == 1) || ((localOrders != null) && (localOrders.tAN == 1)))
        AppMethodBeat.o(138085);
      while (true)
      {
        return bool;
        AppMethodBeat.o(138085);
        bool = false;
      }
    }
  }

  private String cNH()
  {
    AppMethodBeat.i(45905);
    Object localObject;
    if (this.mqu == null)
    {
      localObject = "";
      AppMethodBeat.o(45905);
    }
    while (true)
    {
      return localObject;
      localObject = (PayInfo)this.mqu.getParcelable("key_pay_info");
      if (localObject != null)
      {
        localObject = ((PayInfo)localObject).czZ;
        AppMethodBeat.o(45905);
      }
      else
      {
        localObject = "";
        AppMethodBeat.o(45905);
      }
    }
  }

  private boolean e(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(45900);
    int i = paramBundle.getInt("key_err_code", 0);
    ab.i("MicroMsg.PayProcess", "dealwithErr(), errCode %d", new Object[] { Integer.valueOf(i) });
    boolean bool;
    switch (i)
    {
    default:
      AppMethodBeat.o(45900);
      bool = false;
    case 402:
    case 403:
    case 408:
    case -1003:
    case -1004:
    case 417:
    case 418:
    }
    while (true)
    {
      return bool;
      Bankcard localBankcard = (Bankcard)this.mqu.get("key_bankcard");
      if ((localBankcard != null) && (localBankcard.cPc()))
        if ((com.tencent.mm.plugin.wallet_core.model.r.cPI().cQB() != null) && (com.tencent.mm.plugin.wallet_core.model.r.cPI().cQB().size() > 0))
        {
          ab.i("MicroMsg.PayProcess", "hy: go to select bankcard ui");
          paramBundle = new Bundle();
          paramBundle.putBoolean("key_is_show_new_bankcard", true);
          paramBundle.putInt("key_scene", 0);
          paramBundle.putParcelableArrayList("key_showing_bankcards", com.tencent.mm.plugin.wallet_core.model.r.cPI().cQB());
          paramBundle.putString("key_top_tips", paramActivity.getString(2131305341));
          b(paramActivity, WalletSelectBankcardUI.class, paramBundle);
        }
      while (true)
      {
        AppMethodBeat.o(45900);
        bool = true;
        break;
        b(paramActivity, WalletBankcardIdUI.class, paramBundle);
        continue;
        b(paramActivity, WalletResetInfoUI.class, paramBundle);
      }
      s.cNC();
      if (s.cND().cQg())
      {
        paramBundle.putInt("key_pay_flag", 2);
        paramBundle.putInt("key_err_code", 0);
        b(paramActivity, WalletCheckPwdUI.class, paramBundle);
      }
      while (true)
      {
        AppMethodBeat.o(45900);
        bool = true;
        break;
        paramBundle.putInt("key_pay_flag", 1);
        paramBundle.putInt("key_err_code", 0);
        b(paramActivity, WalletBankcardIdUI.class, paramBundle);
      }
      this.mqu.putInt("key_pay_flag", 3);
      this.mqu.putInt("key_err_code", 0);
      if (cNG())
      {
        paramBundle = new Bundle();
        paramBundle.putBoolean("direc_change_bankcard", true);
        paramBundle.putBoolean("send_cancel_event", false);
        b(paramActivity, WalletPayUI.class, paramBundle, 0);
      }
      while (true)
      {
        AppMethodBeat.o(45900);
        bool = true;
        break;
        b(paramActivity, WalletChangeBankcardUI.class, paramBundle);
      }
      paramBundle.putInt("key_err_code", 0);
      b(paramActivity, WalletSwitchVerifyPhoneUI.class, paramBundle);
      AppMethodBeat.o(45900);
      bool = true;
      continue;
      paramBundle.putInt("key_err_code", 0);
      b(paramActivity, WalletResetInfoUI.class, paramBundle);
      AppMethodBeat.o(45900);
      bool = true;
    }
  }

  private void f(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(45901);
    Bundle localBundle = paramBundle;
    if (this.mqu != null)
    {
      localBundle = paramBundle;
      if (this.mqu.containsKey("key_realname_guide_helper"))
      {
        localBundle = paramBundle;
        if (paramBundle == null)
          localBundle = new Bundle();
        localBundle.putParcelable("key_realname_guide_helper", this.mqu.getParcelable("key_realname_guide_helper"));
      }
    }
    int i = localBundle.getInt("key_pay_scene", 6);
    ab.i("MicroMsg.PayProcess", "jumpToResultUI() payScene:%d", new Object[] { Integer.valueOf(i) });
    if ((i == 11) || (i == 21))
    {
      b(paramActivity, WalletBalanceResultUI.class, localBundle);
      AppMethodBeat.o(45901);
    }
    while (true)
    {
      return;
      if ((i == 5) || (i == 31) || (i == 32) || (i == 33) || (i == 48))
      {
        paramBundle = (PayInfo)localBundle.getParcelable("key_pay_info");
        if ((paramBundle != null) && (paramBundle.pPV == 1))
        {
          ab.i("MicroMsg.PayProcess", "is busi f2f");
          b(paramActivity, localBundle);
          AppMethodBeat.o(45901);
        }
        else
        {
          a(paramActivity, "remittance", ".ui.RemittanceResultUI", localBundle);
          AppMethodBeat.o(45901);
        }
      }
      else if ((i == 37) || (i == 39) || (i == 42) || (i == 45) || (i == 52) || (i == 49))
      {
        b(paramActivity, localBundle);
        AppMethodBeat.o(45901);
      }
      else
      {
        b(paramActivity, WalletOrderInfoUI.class, localBundle);
        AppMethodBeat.o(45901);
      }
    }
  }

  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return 2131305187;
  }

  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(45893);
    PayInfo localPayInfo = (PayInfo)paramBundle.getParcelable("key_pay_info");
    paramBundle.putInt("key_pay_scene", localPayInfo.cIf);
    paramBundle.putInt("key_pay_channel", localPayInfo.cIb);
    if (e(paramActivity, paramBundle))
    {
      ab.w("MicroMsg.PayProcess", "hy: has err. return");
      AppMethodBeat.o(45893);
      return this;
    }
    int i = paramBundle.getInt("key_pay_flag", 0);
    if (((i == 2) || (i == 1)) && (localPayInfo.cIf == 11))
      x.QN(13);
    ab.i("MicroMsg.PayProcess", "start pay_flag : " + paramBundle.getInt("key_pay_flag", 0));
    switch (paramBundle.getInt("key_pay_flag", 0))
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(45893);
      break;
      ab.i("MicroMsg.PayProcess", "start Process : PayRegBindProcess");
      b(paramActivity, WalletBankcardIdUI.class, paramBundle);
      continue;
      ab.i("MicroMsg.PayProcess", "start Process : PayBindProcess");
      b(paramActivity, WalletCheckPwdUI.class, paramBundle);
      continue;
      if ((paramBundle.getBoolean("key_need_verify_sms", false)) && (!cRY()))
      {
        ab.i("MicroMsg.PayProcess", "domestic and verify sms!");
        b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
      }
      else
      {
        ab.i("MicroMsg.PayProcess", "jump to result ui!");
        f(paramActivity, paramBundle);
      }
    }
  }

  public final com.tencent.mm.wallet_core.d.g a(MMActivity paramMMActivity, i parami)
  {
    // Byte code:
    //   0: ldc_w 372
    //   3: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: instanceof 248
    //   10: ifeq +25 -> 35
    //   13: new 374	com/tencent/mm/plugin/wallet/pay/b$11
    //   16: dup
    //   17: aload_0
    //   18: aload_1
    //   19: checkcast 376	com/tencent/mm/wallet_core/ui/WalletBaseUI
    //   22: aload_2
    //   23: invokespecial 379	com/tencent/mm/plugin/wallet/pay/b$11:<init>	(Lcom/tencent/mm/plugin/wallet/pay/b;Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;Lcom/tencent/mm/wallet_core/d/i;)V
    //   26: astore_1
    //   27: ldc_w 372
    //   30: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: aload_1
    //   34: areturn
    //   35: aload_1
    //   36: instanceof 240
    //   39: ifeq +26 -> 65
    //   42: new 8	com/tencent/mm/plugin/wallet/pay/b$12
    //   45: dup
    //   46: aload_0
    //   47: aload_1
    //   48: checkcast 376	com/tencent/mm/wallet_core/ui/WalletBaseUI
    //   51: aload_2
    //   52: invokespecial 380	com/tencent/mm/plugin/wallet/pay/b$12:<init>	(Lcom/tencent/mm/plugin/wallet/pay/b;Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;Lcom/tencent/mm/wallet_core/d/i;)V
    //   55: astore_1
    //   56: ldc_w 372
    //   59: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   62: goto -29 -> 33
    //   65: aload_1
    //   66: instanceof 222
    //   69: ifeq +26 -> 95
    //   72: new 382	com/tencent/mm/plugin/wallet/pay/b$13
    //   75: dup
    //   76: aload_0
    //   77: aload_1
    //   78: checkcast 376	com/tencent/mm/wallet_core/ui/WalletBaseUI
    //   81: aload_2
    //   82: invokespecial 383	com/tencent/mm/plugin/wallet/pay/b$13:<init>	(Lcom/tencent/mm/plugin/wallet/pay/b;Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;Lcom/tencent/mm/wallet_core/d/i;)V
    //   85: astore_1
    //   86: ldc_w 372
    //   89: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   92: goto -59 -> 33
    //   95: aload_1
    //   96: instanceof 385
    //   99: ifeq +26 -> 125
    //   102: new 387	com/tencent/mm/plugin/wallet/pay/b$14
    //   105: dup
    //   106: aload_0
    //   107: aload_1
    //   108: checkcast 376	com/tencent/mm/wallet_core/ui/WalletBaseUI
    //   111: aload_2
    //   112: invokespecial 388	com/tencent/mm/plugin/wallet/pay/b$14:<init>	(Lcom/tencent/mm/plugin/wallet/pay/b;Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;Lcom/tencent/mm/wallet_core/d/i;)V
    //   115: astore_1
    //   116: ldc_w 372
    //   119: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: goto -89 -> 33
    //   125: aload_1
    //   126: instanceof 366
    //   129: ifeq +26 -> 155
    //   132: new 390	com/tencent/mm/plugin/wallet/pay/b$15
    //   135: dup
    //   136: aload_0
    //   137: aload_1
    //   138: checkcast 376	com/tencent/mm/wallet_core/ui/WalletBaseUI
    //   141: aload_2
    //   142: invokespecial 391	com/tencent/mm/plugin/wallet/pay/b$15:<init>	(Lcom/tencent/mm/plugin/wallet/pay/b;Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;Lcom/tencent/mm/wallet_core/d/i;)V
    //   145: astore_1
    //   146: ldc_w 372
    //   149: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   152: goto -119 -> 33
    //   155: aload_1
    //   156: instanceof 274
    //   159: ifeq +26 -> 185
    //   162: new 393	com/tencent/mm/plugin/wallet/pay/b$16
    //   165: dup
    //   166: aload_0
    //   167: aload_1
    //   168: checkcast 376	com/tencent/mm/wallet_core/ui/WalletBaseUI
    //   171: aload_2
    //   172: invokespecial 394	com/tencent/mm/plugin/wallet/pay/b$16:<init>	(Lcom/tencent/mm/plugin/wallet/pay/b;Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;Lcom/tencent/mm/wallet_core/d/i;)V
    //   175: astore_1
    //   176: ldc_w 372
    //   179: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   182: goto -149 -> 33
    //   185: aload_1
    //   186: instanceof 396
    //   189: ifeq +26 -> 215
    //   192: new 398	com/tencent/mm/plugin/wallet/pay/b$17
    //   195: dup
    //   196: aload_0
    //   197: aload_1
    //   198: checkcast 376	com/tencent/mm/wallet_core/ui/WalletBaseUI
    //   201: aload_2
    //   202: invokespecial 399	com/tencent/mm/plugin/wallet/pay/b$17:<init>	(Lcom/tencent/mm/plugin/wallet/pay/b;Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;Lcom/tencent/mm/wallet_core/d/i;)V
    //   205: astore_1
    //   206: ldc_w 372
    //   209: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: goto -179 -> 33
    //   215: aload_1
    //   216: instanceof 253
    //   219: ifeq +26 -> 245
    //   222: new 401	com/tencent/mm/plugin/wallet/pay/b$18
    //   225: dup
    //   226: aload_0
    //   227: aload_1
    //   228: checkcast 376	com/tencent/mm/wallet_core/ui/WalletBaseUI
    //   231: aload_2
    //   232: invokespecial 402	com/tencent/mm/plugin/wallet/pay/b$18:<init>	(Lcom/tencent/mm/plugin/wallet/pay/b;Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;Lcom/tencent/mm/wallet_core/d/i;)V
    //   235: astore_1
    //   236: ldc_w 372
    //   239: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   242: goto -209 -> 33
    //   245: aload_1
    //   246: instanceof 217
    //   249: ifeq +23 -> 272
    //   252: new 404	com/tencent/mm/plugin/wallet/pay/b$2
    //   255: dup
    //   256: aload_0
    //   257: aload_1
    //   258: aload_2
    //   259: invokespecial 407	com/tencent/mm/plugin/wallet/pay/b$2:<init>	(Lcom/tencent/mm/plugin/wallet/pay/b;Lcom/tencent/mm/ui/MMActivity;Lcom/tencent/mm/wallet_core/d/i;)V
    //   262: astore_1
    //   263: ldc_w 372
    //   266: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   269: goto -236 -> 33
    //   272: aload_1
    //   273: instanceof 224
    //   276: ifeq +26 -> 302
    //   279: new 409	com/tencent/mm/plugin/wallet/pay/b$3
    //   282: dup
    //   283: aload_0
    //   284: aload_1
    //   285: checkcast 376	com/tencent/mm/wallet_core/ui/WalletBaseUI
    //   288: aload_2
    //   289: invokespecial 410	com/tencent/mm/plugin/wallet/pay/b$3:<init>	(Lcom/tencent/mm/plugin/wallet/pay/b;Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;Lcom/tencent/mm/wallet_core/d/i;)V
    //   292: astore_1
    //   293: ldc_w 372
    //   296: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   299: goto -266 -> 33
    //   302: aload_1
    //   303: instanceof 255
    //   306: ifeq +26 -> 332
    //   309: new 10	com/tencent/mm/plugin/wallet/pay/b$4
    //   312: dup
    //   313: aload_0
    //   314: aload_1
    //   315: checkcast 376	com/tencent/mm/wallet_core/ui/WalletBaseUI
    //   318: aload_2
    //   319: invokespecial 411	com/tencent/mm/plugin/wallet/pay/b$4:<init>	(Lcom/tencent/mm/plugin/wallet/pay/b;Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;Lcom/tencent/mm/wallet_core/d/i;)V
    //   322: astore_1
    //   323: ldc_w 372
    //   326: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   329: goto -296 -> 33
    //   332: aload_1
    //   333: instanceof 413
    //   336: ifeq +26 -> 362
    //   339: new 415	com/tencent/mm/plugin/wallet/pay/b$5
    //   342: dup
    //   343: aload_0
    //   344: aload_1
    //   345: checkcast 376	com/tencent/mm/wallet_core/ui/WalletBaseUI
    //   348: aload_2
    //   349: invokespecial 416	com/tencent/mm/plugin/wallet/pay/b$5:<init>	(Lcom/tencent/mm/plugin/wallet/pay/b;Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;Lcom/tencent/mm/wallet_core/d/i;)V
    //   352: astore_1
    //   353: ldc_w 372
    //   356: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   359: goto -326 -> 33
    //   362: aload_0
    //   363: aload_1
    //   364: aload_2
    //   365: invokespecial 418	com/tencent/mm/plugin/wallet_core/b/a:a	(Lcom/tencent/mm/ui/MMActivity;Lcom/tencent/mm/wallet_core/d/i;)Lcom/tencent/mm/wallet_core/d/g;
    //   368: astore_1
    //   369: ldc_w 372
    //   372: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   375: goto -342 -> 33
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(45894);
    if (e(paramActivity, paramBundle))
    {
      ab.i("MicroMsg.PayProcess", "deal with the err!");
      AppMethodBeat.o(45894);
    }
    while (true)
    {
      return;
      if (!(paramActivity instanceof WalletSwitchVerifyPhoneUI))
        break;
      if (!this.mqu.getBoolean("key_forward_to_id_verify", false))
        break label93;
      ab.i("MicroMsg.PayProcess", "go to verify id tail");
      b(paramActivity, WalletVerifyIdCardUI.class, this.mqu);
      AppMethodBeat.o(45894);
    }
    if ((paramActivity instanceof WalletVerifyIdCardUI))
      f(paramActivity, paramBundle);
    label93: if (paramBundle.containsKey("key_pay_flag"))
    {
      paramInt = paramBundle.getInt("key_pay_flag", 0);
      label110: ab.i("MicroMsg.PayProcess", "forward pay_flag : ".concat(String.valueOf(paramInt)));
      switch (paramInt)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      AppMethodBeat.o(45894);
      break;
      paramInt = this.mqu.getInt("key_pay_flag", 0);
      break label110;
      ab.i("MicroMsg.PayProcess", "forwardUnreg()");
      if ((paramActivity instanceof WalletSetPasswordUI))
      {
        b(paramActivity, WalletPwdConfirmUI.class, paramBundle);
        AppMethodBeat.o(45894);
        break;
      }
      if ((paramActivity instanceof WalletPwdConfirmUI))
      {
        f(paramActivity, paramBundle);
        AppMethodBeat.o(45894);
        break;
      }
      if ((paramActivity instanceof WalletCardElementUI))
      {
        if (!cRY())
        {
          ab.i("MicroMsg.PayProcess", "domestic, verify code");
          b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
          AppMethodBeat.o(45894);
          break;
        }
        ab.i("MicroMsg.PayProcess", "oversea, set pwd");
        b(paramActivity, WalletSetPasswordUI.class, paramBundle);
        AppMethodBeat.o(45894);
        break;
      }
      if ((paramActivity instanceof WalletBalanceResultUI))
      {
        a(paramActivity, WalletBalanceManagerUI.class, -1, null, true);
        AppMethodBeat.o(45894);
        break;
      }
      super.a(paramActivity, 0, paramBundle);
      AppMethodBeat.o(45894);
      break;
      ab.i("MicroMsg.PayProcess", "forwardBind()");
      if (((paramActivity instanceof WalletCheckPwdUI)) || ((paramActivity instanceof WalletSelectBankcardUI)) || ((paramActivity instanceof WalletSwitchVerifyPhoneUI)))
      {
        b(paramActivity, WalletBankcardIdUI.class, paramBundle);
        AppMethodBeat.o(45894);
        break;
      }
      if ((paramActivity instanceof WalletVerifyCodeUI))
      {
        f(paramActivity, paramBundle);
        AppMethodBeat.o(45894);
        break;
      }
      if ((paramActivity instanceof WalletCardElementUI))
      {
        if (!cRY())
        {
          ab.i("MicroMsg.PayProcess", "domestic, verify code!");
          b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
          AppMethodBeat.o(45894);
          break;
        }
        ab.i("MicroMsg.PayProcess", "oversea, jump to result ui!");
        f(paramActivity, paramBundle);
        AppMethodBeat.o(45894);
        break;
      }
      if ((paramActivity instanceof WalletBalanceResultUI))
      {
        a(paramActivity, WalletBalanceManagerUI.class, -1, null, true);
        AppMethodBeat.o(45894);
        break;
      }
      super.a(paramActivity, 0, paramBundle);
      AppMethodBeat.o(45894);
      break;
      ab.i("MicroMsg.PayProcess", "forwardBound()");
      if ((paramActivity instanceof WalletVerifyCodeUI))
      {
        f(paramActivity, paramBundle);
        AppMethodBeat.o(45894);
        break;
      }
      if (((paramActivity instanceof WalletResetInfoUI)) || ((paramActivity instanceof WalletChangeBankcardUI)))
      {
        if (((paramBundle.getBoolean("key_need_verify_sms", false)) && (!cRY())) || (paramBundle.getBoolean("key_is_changing_balance_phone_num")))
        {
          ab.i("MicroMsg.PayProcess", "need verify code after reset info or change bank card info!");
          b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
          AppMethodBeat.o(45894);
          break;
        }
        ab.i("MicroMsg.PayProcess", "jump to result ui!");
        f(paramActivity, paramBundle);
        AppMethodBeat.o(45894);
        break;
      }
      if ((paramActivity instanceof WalletBalanceResultUI))
      {
        a(paramActivity, WalletBalanceManagerUI.class, -1, null, true);
        AppMethodBeat.o(45894);
        break;
      }
      if (((paramActivity instanceof WalletSelectBankcardUI)) || ((paramActivity instanceof WalletSwitchVerifyPhoneUI)))
      {
        ab.i("MicroMsg.PayProcess", "need verify code after select bank card!");
        b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
        AppMethodBeat.o(45894);
        break;
      }
      super.a(paramActivity, 0, paramBundle);
    }
  }

  public final void a(WalletBaseUI paramWalletBaseUI)
  {
    AppMethodBeat.i(45897);
    this.tnV.add(new WeakReference(paramWalletBaseUI));
    AppMethodBeat.o(45897);
  }

  public final boolean a(final WalletBaseUI paramWalletBaseUI, final int paramInt, String paramString)
  {
    AppMethodBeat.i(45904);
    ab.i("MicroMsg.PayProcess", "onReceiveErr(), errCode %d", new Object[] { Integer.valueOf(paramInt) });
    boolean bool;
    Object localObject;
    switch (paramInt)
    {
    case 405:
    case 406:
    case 407:
    default:
    case 402:
    case 403:
    case 408:
      do
      {
        AppMethodBeat.o(45904);
        bool = false;
        return bool;
      }
      while ((!dNH()) || (this.mqu.getParcelable("key_bankcard") == null));
      localObject = (Bankcard)this.mqu.getParcelable("key_bankcard");
      if (bo.isNullOrNil(paramString))
        paramString = paramWalletBaseUI.getString(2131305201, new Object[] { ((Bankcard)localObject).field_desc, ((Bankcard)localObject).field_mobile });
      break;
    case 404:
    }
    while (true)
    {
      h.d(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(2131305200), paramWalletBaseUI.getString(2131296868), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(45871);
          b.v(b.this).putInt("key_pay_flag", 3);
          b.w(b.this).putInt("key_err_code", paramInt);
          b.this.a(paramWalletBaseUI, 0, b.x(b.this));
          if (paramWalletBaseUI.bwP())
            paramWalletBaseUI.finish();
          AppMethodBeat.o(45871);
        }
      }
      , null);
      AppMethodBeat.o(45904);
      bool = true;
      break;
      ab.i("MicroMsg.PayProcess", "404 pay error, cancel pay or change!");
      s.cNC();
      localObject = s.cND().cQB();
      if ((localObject == null) || (((ArrayList)localObject).isEmpty()))
        h.d(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(2131305157), paramWalletBaseUI.getString(2131304624), new b.7(this, paramWalletBaseUI), new b.8(this, paramWalletBaseUI));
      while (true)
      {
        AppMethodBeat.o(45904);
        bool = true;
        break;
        h.d(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(2131305176), paramWalletBaseUI.getString(2131304624), new b.9(this, paramWalletBaseUI), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(45875);
            b.this.b(paramWalletBaseUI, b.F(b.this));
            if (paramWalletBaseUI.bwP())
              paramWalletBaseUI.finish();
            AppMethodBeat.o(45875);
          }
        });
      }
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    int i = -1;
    AppMethodBeat.i(45896);
    ab.i("MicroMsg.PayProcess", "end pay_flag : " + this.mqu.getInt("key_pay_flag", 0));
    x.dNV();
    int j;
    Intent localIntent;
    Object localObject1;
    Object localObject2;
    if (this.mqu.getBoolean("intent_pay_end", false))
    {
      j = -1;
      localIntent = new Intent();
      if (paramBundle != null)
      {
        localObject1 = (PayInfo)this.mqu.getParcelable("key_pay_info");
        localObject2 = new Bundle();
        ((Bundle)localObject2).putInt("intent_pay_end_errcode", this.mqu.getInt("intent_pay_end_errcode"));
        ((Bundle)localObject2).putString("intent_pay_app_url", this.mqu.getString("intent_pay_app_url"));
        ((Bundle)localObject2).putBoolean("intent_pay_end", this.mqu.getBoolean("intent_pay_end"));
        ((Bundle)localObject2).putString("intent_wap_pay_jump_url", this.mqu.getString("intent_wap_pay_jump_url"));
        ((Bundle)localObject2).putParcelable("key_realname_guide_helper", this.mqu.getParcelable("key_realname_guide_helper"));
        if (localObject1 != null)
          ((Bundle)localObject2).putInt("pay_channel", ((PayInfo)localObject1).cIb);
        localIntent.putExtras((Bundle)localObject2);
      }
      localIntent.putExtra("key_orders", this.mqu.getParcelable("key_orders"));
      localIntent.putExtra("key_is_clear_failure", this.mqu.getInt("key_is_clear_failure", -1));
      localObject1 = new uv();
      ((uv)localObject1).cRF.intent = localIntent;
      ((uv)localObject1).cRF.czZ = cNH();
      localObject2 = ((uv)localObject1).cRF;
      if (!this.mqu.getBoolean("intent_pay_end", false))
        break label388;
    }
    while (true)
    {
      ((uv.a)localObject2).result = i;
      if ((((uv)localObject1).cRF.result == 0) && (paramBundle != null))
      {
        paramBundle = (PayInfo)paramBundle.getParcelable("key_pay_info");
        if (paramBundle != null)
          com.tencent.mm.plugin.wallet.pay.a.b.b.ak(paramBundle.czZ, paramBundle.cIf, paramBundle.cIb);
      }
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      a(paramActivity, "wallet", ".pay.ui.WalletPayUI", j, localIntent, false);
      AppMethodBeat.o(45896);
      return;
      j = 0;
      break;
      label388: i = 0;
    }
  }

  public final void b(WalletBaseUI paramWalletBaseUI)
  {
    AppMethodBeat.i(45898);
    Iterator localIterator = this.tnV.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      if (localWeakReference.get() == paramWalletBaseUI)
      {
        this.tnV.remove(localWeakReference);
        AppMethodBeat.o(45898);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(45898);
    }
  }

  public final String bxP()
  {
    return "PayProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(45895);
    ab.i("MicroMsg.PayProcess", "back pay_flag : " + this.mqu.getInt("key_pay_flag", 0));
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
      AppMethodBeat.o(45895);
    }
    while (true)
    {
      return;
      x.dNV();
      F(paramActivity);
      AppMethodBeat.o(45895);
    }
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    boolean bool = false;
    AppMethodBeat.i(45902);
    ab.d("MicroMsg.PayProcess", "pay_flag : " + this.mqu.getInt("key_pay_flag", 0));
    switch (this.mqu.getInt("key_pay_flag", 0))
    {
    default:
      AppMethodBeat.o(45902);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return bool;
      bool = paramActivity instanceof WalletOrderInfoUI;
      AppMethodBeat.o(45902);
      continue;
      bool = paramActivity instanceof WalletOrderInfoUI;
      AppMethodBeat.o(45902);
      continue;
      AppMethodBeat.o(45902);
    }
  }

  public final void cNF()
  {
    AppMethodBeat.i(45899);
    al.n(new b.1(this), 200L);
    AppMethodBeat.o(45899);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.b
 * JD-Core Version:    0.6.2
 */