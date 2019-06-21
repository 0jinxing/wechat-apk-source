package com.tencent.mm.pluginsdk.wallet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;

public final class h
{
  public static PayInfo N(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(135781);
    PayInfo localPayInfo = new PayInfo();
    localPayInfo.czZ = paramString1;
    localPayInfo.appId = paramString2;
    localPayInfo.tRb = null;
    localPayInfo.cIf = paramInt;
    localPayInfo.aIm = null;
    localPayInfo.cIb = 0;
    AppMethodBeat.o(135781);
    return localPayInfo;
  }

  public static void a(Context paramContext, String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(135793);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_qrcode_url", paramString1);
    localIntent.putExtra("key_channel", paramInt1);
    localIntent.putExtra("key_web_url", paramString2);
    localIntent.putExtra("key_scene", paramInt2);
    d.b(paramContext, "collect", ".reward.ui.QrRewardSelectMoneyUI", localIntent);
    AppMethodBeat.o(135793);
  }

  public static boolean a(Context paramContext, int paramInt1, String paramString, int paramInt2, a parama)
  {
    AppMethodBeat.i(135792);
    Intent localIntent = new Intent();
    localIntent.putExtra("scene", paramInt1);
    localIntent.putExtra("receiver_name", paramString);
    if (paramInt2 > 0)
      localIntent.putExtra("pay_channel", paramInt2);
    a.a(parama, localIntent);
    if (r.YM())
      d.b(paramContext, "wallet_payu", ".remittance.ui.PayURemittanceAdapterUI", localIntent);
    while (true)
    {
      AppMethodBeat.o(135792);
      return true;
      if (r.YN())
      {
        d.b(paramContext, "remittance", ".ui.RemittanceAdapterUI", localIntent);
        com.tencent.mm.plugin.report.service.h.pYm.e(12097, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
        com.tencent.mm.plugin.report.service.h.pYm.e(11850, new Object[] { Integer.valueOf(7), Integer.valueOf(1) });
      }
      else
      {
        d.b(paramContext, "remittance", ".ui.RemittanceAdapterUI", localIntent);
        com.tencent.mm.plugin.report.service.h.pYm.e(12097, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Long.valueOf(System.currentTimeMillis()) });
        com.tencent.mm.plugin.report.service.h.pYm.e(11850, new Object[] { Integer.valueOf(3), Integer.valueOf(1) });
      }
    }
  }

  public static boolean a(Context paramContext, Bundle paramBundle, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(135776);
    Intent localIntent = new Intent();
    localIntent.putExtra("orderhandlerui_checkapp_result", paramBoolean);
    if (!bo.isNullOrNil(paramString))
      localIntent.putExtra("_mmessage_appPackage", paramString);
    if (paramBundle != null)
      localIntent.putExtras(paramBundle);
    d.b(paramContext, "wallet_index", ".ui.OrderHandlerUI", localIntent);
    AppMethodBeat.o(135776);
    return true;
  }

  public static boolean a(Context paramContext, PayInfo paramPayInfo, int paramInt)
  {
    AppMethodBeat.i(135782);
    boolean bool = a(paramContext, false, "", paramPayInfo, paramInt);
    AppMethodBeat.o(135782);
    return bool;
  }

  public static boolean a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(135779);
    boolean bool = b(paramContext, paramString1, paramString2, paramInt1, paramInt2);
    AppMethodBeat.o(135779);
    return bool;
  }

  public static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(135787);
    boolean bool;
    if (bo.isNullOrNil(paramString2))
    {
      bool = false;
      AppMethodBeat.o(135787);
    }
    while (true)
    {
      return bool;
      bool = a(paramContext, true, paramString1, N(paramString2, paramString3, paramInt1), paramInt2);
      AppMethodBeat.o(135787);
    }
  }

  private static boolean a(Context paramContext, boolean paramBoolean, String paramString, PayInfo paramPayInfo, int paramInt)
  {
    AppMethodBeat.i(135783);
    paramBoolean = b(paramContext, paramBoolean, paramString, paramPayInfo, paramInt);
    AppMethodBeat.o(135783);
    return paramBoolean;
  }

  public static boolean a(Context paramContext, boolean paramBoolean, String paramString1, PayInfo paramPayInfo, String paramString2, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(135785);
    paramBoolean = a(paramContext, paramBoolean, paramString1, "", paramPayInfo, paramString2, paramIntent, paramInt);
    AppMethodBeat.o(135785);
    return paramBoolean;
  }

  public static boolean a(Context paramContext, boolean paramBoolean, String paramString1, String paramString2, PayInfo paramPayInfo, String paramString3, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(135786);
    if ((2 == paramPayInfo.cIf) || (1 == paramPayInfo.cIf) || (4 == paramPayInfo.cIf) || (36 == paramPayInfo.cIf))
    {
      paramPayInfo.mXg = false;
      if ((paramPayInfo.cIf != 4) && (paramPayInfo.cIf != 1) && (36 != paramPayInfo.cIf) && (8 != paramPayInfo.cIf))
        break label255;
      paramPayInfo.vwf = true;
      label92: paramPayInfo.pPw = paramString3;
      paramIntent.putExtra("key_pay_info", paramPayInfo);
      paramIntent.putExtra("key_force_use_bind_serail", bo.nullAsNil(paramString1));
      paramIntent.putExtra("key_is_force_use_given_card", paramBoolean);
      if ((paramContext instanceof Activity))
      {
        paramIntent.putExtra("key_context_hashcode", paramContext.hashCode());
        ab.i("MicroMsg.WalletManager", "startPay context %s %s", new Object[] { paramContext, Integer.valueOf(paramContext.hashCode()) });
      }
      if (!bo.isNullOrNil(paramString2))
        paramIntent.putExtra("key_is_use_default_card", paramString2);
      ab.i("MicroMsg.WalletManager", "startPay context %s from %s", new Object[] { paramContext, bo.dpG() });
      paramIntent.putExtra("key_receiver_true_name", paramString3);
      if (!r.YM())
        break label264;
      d.b(paramContext, "wallet_payu", ".pay.ui.WalletPayUPayUI", paramIntent, paramInt);
    }
    while (true)
    {
      AppMethodBeat.o(135786);
      return true;
      paramPayInfo.mXg = true;
      break;
      label255: paramPayInfo.vwf = false;
      break label92;
      label264: d.b(paramContext, "wallet", ".pay.ui.WalletPayUI", paramIntent, paramInt);
    }
  }

  public static boolean a(MMActivity paramMMActivity, g paramg, int paramInt, MMActivity.a parama)
  {
    AppMethodBeat.i(135777);
    Intent localIntent = new Intent();
    localIntent.putExtra("appId", paramg.appId);
    localIntent.putExtra("timeStamp", paramg.timeStamp);
    localIntent.putExtra("nonceStr", paramg.nonceStr);
    localIntent.putExtra("packageExt", paramg.packageExt);
    localIntent.putExtra("signtype", paramg.signType);
    localIntent.putExtra("paySignature", paramg.cId);
    localIntent.putExtra("cookie", paramg.flp);
    localIntent.putExtra("url", paramg.url);
    localIntent.putExtra("bizUsername", paramg.cIe);
    localIntent.putExtra("pay_channel", paramg.cvS);
    localIntent.putExtra("pay_for_wallet_type", paramg.vwu);
    localIntent.putExtra("pay_scene", paramg.cIf);
    localIntent.putExtra("result_jump_mode", paramg.vww);
    localIntent.putExtra("ext_info", paramg.extInfo);
    localIntent.putExtra("key_wx_app_scene", paramg.vwt);
    localIntent.putExtra("intent_app_brand_from_path", paramg.vwx);
    localIntent.putExtra("intent_app_brand_from_username", paramg.vwy);
    localIntent.putExtra("intent_app_brand_from_scene", paramg.vwz);
    if (parama != null)
      paramMMActivity.ifE = parama;
    ab.i("MicroMsg.WalletManager", "startJsapiPay context %s from %s", new Object[] { paramMMActivity, bo.dpG() });
    d.a(paramMMActivity, "wallet_index", ".ui.WalletBrandUI", localIntent, paramInt, false);
    AppMethodBeat.o(135777);
    return true;
  }

  public static void ai(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(135778);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_from_scene", paramInt);
    d.b(paramContext, "collect", ".ui.CollectAdapterUI", localIntent);
    AppMethodBeat.o(135778);
  }

  public static boolean aj(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(135789);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_bind_scene", 5);
    localIntent.putExtra("key_offline_add_fee", paramInt);
    d.b(paramContext, "wallet", ".bind.ui.WalletBindUI", localIntent);
    AppMethodBeat.o(135789);
    return true;
  }

  public static boolean ak(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(135790);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_scene_balance_manager", paramInt);
    if (r.YM())
      d.b(paramContext, "wallet_payu", ".balance.ui.WalletPayUBalanceManagerUI", localIntent);
    while (true)
    {
      AppMethodBeat.o(135790);
      return true;
      d.b(paramContext, "wallet", ".balance.ui.WalletBalanceManagerUI", localIntent);
    }
  }

  private static boolean b(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(135780);
    boolean bool;
    if (bo.isNullOrNil(paramString1))
    {
      bool = false;
      AppMethodBeat.o(135780);
    }
    while (true)
    {
      return bool;
      bool = a(paramContext, N(paramString1, paramString2, paramInt1), paramInt2);
      AppMethodBeat.o(135780);
    }
  }

  private static boolean b(Context paramContext, boolean paramBoolean, String paramString, PayInfo paramPayInfo, int paramInt)
  {
    AppMethodBeat.i(135784);
    paramBoolean = a(paramContext, paramBoolean, paramString, paramPayInfo, null, new Intent(), paramInt);
    AppMethodBeat.o(135784);
    return paramBoolean;
  }

  public static boolean b(MMActivity paramMMActivity, g paramg, int paramInt, MMActivity.a parama)
  {
    AppMethodBeat.i(135788);
    Intent localIntent = new Intent();
    localIntent.putExtra("appId", paramg.appId);
    localIntent.putExtra("timeStamp", paramg.timeStamp);
    localIntent.putExtra("nonceStr", paramg.nonceStr);
    localIntent.putExtra("packageExt", paramg.packageExt);
    localIntent.putExtra("signtype", paramg.signType);
    localIntent.putExtra("paySignature", paramg.cId);
    localIntent.putExtra("url", paramg.url);
    localIntent.putExtra("key_bind_scene", paramg.cIg);
    localIntent.putExtra("pay_channel", paramg.cvS);
    paramMMActivity.ifE = parama;
    d.a(paramMMActivity, "wallet", ".bind.ui.WalletBindUI", localIntent, paramInt, false);
    AppMethodBeat.o(135788);
    return true;
  }

  public static boolean fV(Context paramContext)
  {
    AppMethodBeat.i(135791);
    d.H(paramContext, "mall", ".ui.MallIndexUI");
    AppMethodBeat.o(135791);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.wallet.h
 * JD-Core Version:    0.6.2
 */