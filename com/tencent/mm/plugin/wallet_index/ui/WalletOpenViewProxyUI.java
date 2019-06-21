package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.ix;
import com.tencent.mm.g.a.uj;
import com.tencent.mm.plugin.wallet.balance.a.a.ad;
import com.tencent.mm.plugin.wallet.balance.a.a.l;
import com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI;
import com.tencent.mm.plugin.wallet_core.c.u;
import com.tencent.mm.protocal.protobuf.bhd;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(7)
public class WalletOpenViewProxyUI extends WalletBaseUI
{
  private Map<String, String> tSm;

  public WalletOpenViewProxyUI()
  {
    AppMethodBeat.i(48301);
    this.tSm = new HashMap();
    AppMethodBeat.o(48301);
  }

  private void adj(String paramString)
  {
    AppMethodBeat.i(48305);
    int i;
    if (!bo.isNullOrNil(paramString))
    {
      paramString = (String)this.tSm.get("openview");
      if ("open_wcpay_biz_view".equals(paramString))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open mall_index_ui");
        com.tencent.mm.pluginsdk.wallet.h.fV(this.mController.ylL);
        i = 1;
      }
    }
    while (true)
    {
      paramString = new Intent();
      paramString.putExtra("closeWebView", (String)this.tSm.get("closeWebView"));
      setResult(-1, paramString);
      if (i != 0)
        finish();
      AppMethodBeat.o(48305);
      return;
      if ("open_wcpay_balance_view".equals(paramString))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open wallet_balance_manager_ui");
        com.tencent.mm.pluginsdk.wallet.h.ak(this.mController.ylL, 0);
        i = 1;
      }
      else if ("open_wcpay_order_detail_view".equals(paramString))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open mall_order_transaction_info_ui");
        paramString = new Intent();
        paramString.putExtra("trans_id", (String)this.tSm.get("trans_id"));
        paramString.putExtra("scene", 1);
        if (this.tSm.containsKey("bill_id"))
          paramString.putExtra("bill_id", (String)this.tSm.get("bill_id"));
        d.b(this.mController.ylL, "order", ".ui.MallOrderTransactionInfoUI", paramString);
        i = 1;
      }
      else if ("open_wcpay_f2f_receive_detail".equals(paramString))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open open_wcpay_f2f_receive_detail");
        paramString = new Intent();
        paramString.putExtra("key_timestamp", bo.getLong((String)this.tSm.get("fromtimestamp"), 0L));
        paramString.putExtra("key_from_scene", 1);
        d.b(this.mController.ylL, "collect", ".ui.CollectBillUI", paramString);
        com.tencent.mm.plugin.report.service.h.pYm.e(13944, new Object[] { Integer.valueOf(2) });
        i = 1;
      }
      else if ("open_wcpay_grouppay_detail".equals(paramString))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open open_wcpay_grouppay_detail");
        paramString = new Intent();
        paramString.putExtra("bill_no", (String)this.tSm.get("billno"));
        paramString.putExtra("chatroom", (String)this.tSm.get("groupid"));
        paramString.putExtra("key_sign", (String)this.tSm.get("sign"));
        paramString.putExtra("key_ver", (String)this.tSm.get("ver"));
        paramString.putExtra("enter_scene", 5);
        d.b(this.mController.ylL, "aa", ".ui.PaylistAAUI", paramString);
        i = 1;
      }
      else if ("open_wcpay_t2bc_detail".equals(paramString))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WalletOpenViewProxyUI", "do open_wcpay_t2bc_detail");
        paramString = new Intent();
        paramString.putExtra("key_transfer_bill_id", (String)this.tSm.get("transfer_bill_id"));
        paramString.putExtra("key_enter_scene", 1);
        d.b(this.mController.ylL, "remittance", ".bankcard.ui.BankRemitDetailUI", paramString);
        i = 1;
      }
      else if ("open_honey_pay_home".equals(paramString))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WalletOpenViewProxyUI", "do open honey pay view");
        paramString = new Intent();
        d.b(this.mController.ylL, "honey_pay", ".ui.HoneyPayMainUI", paramString);
        i = 1;
      }
      else if ("open_wcpay_t2bc_view".equals(paramString))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WalletOpenViewProxyUI", "do open VIEW_OPEN_T2BC_UI");
        paramString = new Intent();
        d.b(this.mController.ylL, "remittance", ".bankcard.ui.BankRemitBankcardInputUI", paramString);
        i = 1;
      }
      else if ("open_wcpay_fetch_balance_view".equals(paramString))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WalletOpenViewProxyUI", "do open VIEW_OPEN_FETCH_BALANCE_UI");
        paramString = new uj();
        paramString.cQB.context = this.mController.ylL;
        com.tencent.mm.sdk.b.a.xxA.m(paramString);
        i = 1;
      }
      else if ("open_wcpay_wallet_lock_view".equals(paramString))
      {
        paramString = new Intent();
        paramString.putExtra("wallet_lock_jsapi_scene", (String)this.tSm.get("entry_scene"));
        ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.walletlock.a.b.class)).b(this, paramString);
        i = 1;
      }
      else if ("open_wcpay_security_setting_view".equals(paramString))
      {
        paramString = new Intent();
        paramString.putExtra("wallet_lock_jsapi_scene", (String)this.tSm.get("entry_scene"));
        d.b(this, "wallet", ".pwd.ui.WalletSecuritySettingUI", paramString);
        i = 1;
      }
      else
      {
        String str;
        Object localObject;
        if ("open_wcpay_c2c_message_view".equals(paramString))
        {
          if (this.tSm != null)
          {
            i = bo.getInt((String)this.tSm.get("bizType"), -1);
            if (i == 1)
            {
              str = (String)this.tSm.get("bizId");
              paramString = (String)this.tSm.get("username");
              long l = bo.getLong((String)this.tSm.get("createTime"), -1L);
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletOpenViewProxyUI", "view open c2c message view, bizType: %s, bizId: %s, username: %s, createTime: %s", new Object[] { Integer.valueOf(i), str, paramString, Long.valueOf(l) });
              localObject = new ix();
              ((ix)localObject).cDZ.cEa = str;
              ((ix)localObject).cDZ.username = paramString;
              ((ix)localObject).cDZ.cEb = Long.valueOf(l);
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
            }
            i = 1;
          }
        }
        else if ("open_lqt_auto_planindex_view".equals(paramString))
        {
          paramString = new Intent();
          d.b(this.mController.ylL, "wallet", ".balance.ui.lqt.WalletLqtPlanHomeUI", paramString);
          i = 1;
        }
        else if ("open_lqt_auto_planadd_view".equals(paramString))
        {
          paramString = new Intent(this, WalletLqtPlanAddUI.class);
          paramString.putExtra("key_mode", 1);
          startActivity(paramString);
          i = 1;
        }
        else if ("open_wcpay_lqt_save".equals(paramString))
        {
          com.tencent.mm.plugin.wallet.balance.a.a.ab.ach((String)this.tSm.get("trace_info"));
          str = (String)this.tSm.get("operate_id");
          paramString = com.tencent.mm.wallet_core.ui.g.b(this.mController.ylL, false, null);
          new l().acy().b(new WalletOpenViewProxyUI.1(this, paramString, str));
          i = 0;
        }
        else if ("open_wcpay_grouppay_introview".equals(paramString))
        {
          localObject = (String)this.tSm.get("amount");
          str = (String)this.tSm.get("title");
          Intent localIntent = new Intent();
          localIntent.putExtra("amount", (String)localObject);
          paramString = str;
          if (!bo.isNullOrNil(str))
          {
            paramString = URLDecoder.decode(str);
            localIntent.putExtra("title", paramString);
          }
          localIntent.putExtra("enter_scene", 5);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletOpenViewProxyUI", "view open grouppay, amount: %s, title: %s", new Object[] { localObject, paramString });
          d.b(this, "aa", ".ui.AAEntranceUI", localIntent);
          i = 1;
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] invalid target view : ".concat(String.valueOf(paramString)));
          i = 1;
          continue;
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] packageExt null or nil");
          i = 1;
        }
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(48303);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletOpenViewProxyUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm });
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        com.tencent.mm.pluginsdk.wallet.f.akr(((com.tencent.mm.plugin.wallet_core.c.a)paramm).cOS());
        adj(getIntent().getStringExtra("packageExt"));
        AppMethodBeat.o(48303);
      }
    while (true)
    {
      return bool;
      if ((paramm instanceof u))
      {
        adj(getIntent().getStringExtra("packageExt"));
        AppMethodBeat.o(48303);
      }
      else if ((paramm instanceof ad))
      {
        paramString = ((ad)paramm).tgw;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletOpenViewProxyUI", "on open lqb account scene end, retcode: %s, regmsg: %s", new Object[] { Integer.valueOf(paramString.kdT), paramString.kdU });
        if (paramString.kdT == 0)
        {
          paramString = new Intent();
          paramString.putExtra("key_account_type", 2);
          d.b(this.mController.ylL, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", paramString);
          setResult(-1);
        }
        while (true)
        {
          finish();
          AppMethodBeat.o(48303);
          break;
          Toast.makeText(this, paramString.kdU, 1).show();
          setResult(0);
        }
        setResult(0);
        finish();
        AppMethodBeat.o(48303);
      }
      else
      {
        AppMethodBeat.o(48303);
        bool = false;
      }
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48306);
    if (paramInt1 == 563)
    {
      if (paramInt2 == -1)
      {
        String str1 = paramIntent.getStringExtra("Select_Conv_User");
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletOpenViewProxyUI", "select chatroom：%s", new Object[] { str1 });
        String str2 = (String)this.tSm.get("amount");
        String str3 = (String)this.tSm.get("title");
        Intent localIntent = new Intent();
        localIntent.putExtra("amount", str2);
        String str4 = str3;
        if (!bo.isNullOrNil(str3))
        {
          str4 = URLDecoder.decode(str3);
          localIntent.putExtra("title", str4);
        }
        if (!bo.isNullOrNil(str1))
          localIntent.putExtra("chatroom_name", str1);
        localIntent.putExtra("enter_scene", 5);
        d.b(this.mController.ylL, "aa", ".ui.LaunchAAUI", localIntent);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletOpenViewProxyUI", "view open grouppay, amount: %s, title: %s", new Object[] { str2, str4 });
      }
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(48306);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48302);
    super.onCreate(paramBundle);
    AM(8);
    paramBundle = getIntent().getStringExtra("packageExt");
    this.tSm = new HashMap();
    Object localObject;
    if (!bo.isNullOrNil(paramBundle))
    {
      localObject = paramBundle.split("&");
      if ((localObject != null) && (localObject.length > 0))
        for (int i = 0; i < localObject.length; i++)
          if (!bo.isNullOrNil(localObject[i]))
          {
            paramBundle = localObject[i].split("=");
            if ((paramBundle.length == 2) && (!bo.isNullOrNil(paramBundle[0])))
              this.tSm.put(paramBundle[0], paramBundle[1]);
          }
    }
    paramBundle = (String)this.tSm.get("trace_info");
    if (!bo.isNullOrNil(paramBundle))
      com.tencent.mm.plugin.wallet.balance.a.a.ab.ach(paramBundle);
    nf(2996);
    nf(580);
    nf(385);
    if (getIntent() == null)
    {
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.WalletOpenViewProxyUI", "func[doCheckPayNetscene] intent null");
      setResult(0);
      finish();
      AppMethodBeat.o(48302);
    }
    while (true)
    {
      return;
      String str1 = (String)this.tSm.get("openview");
      String str2 = getIntent().getStringExtra("appId");
      String str3 = getIntent().getStringExtra("timeStamp");
      paramBundle = getIntent().getStringExtra("nonceStr");
      String str4 = getIntent().getStringExtra("packageExt");
      localObject = getIntent().getStringExtra("paySignature");
      if ("open_wcpay_f2f_receive_detail".equals(str1))
      {
        a(new u(str2, str3, paramBundle, str4, (String)localObject), true, false);
        AppMethodBeat.o(48302);
      }
      else if ("open_wcpay_grouppay_detail".equals(str1))
      {
        adj(str4);
        AppMethodBeat.o(48302);
      }
      else
      {
        if ("open_wcpay_lqt_detail".equals(str1))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletOpenViewProxyUI", "open lqt detail ui");
          if (this.tSm != null)
          {
            new Intent().putExtra("key_account_type", 1);
            localObject = (String)this.tSm.get("ecardtype");
            str4 = (String)this.tSm.get("extradata");
            paramBundle = (String)this.tSm.get("need_open_lqb");
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletOpenViewProxyUI", "open lqt detail ui, ecardtype: %s, extradata: %s, need_open_lqb: %s", new Object[] { localObject, str4, paramBundle });
            if (bo.getInt(paramBundle, 0) == 1)
            {
              paramBundle = (Bundle)localObject;
              if (bo.isNullOrNil((String)localObject))
                paramBundle = "WEB_DEBIT";
              a(new ad(paramBundle, str4), true, false);
            }
          }
          while (true)
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(663L, 18L, 1L, false);
            AppMethodBeat.o(48302);
            break;
            d.H(this.mController.ylL, "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
            setResult(-1);
            finish();
            continue;
            d.H(this.mController.ylL, "wallet", ".balance.ui.lqt.WalletLqtDetailUI");
            setResult(-1);
            finish();
          }
        }
        if ("redenvelopes_getshowresouces_and_move_to_root".equals(str1))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WalletOpenViewProxyUI", "receive envelope");
          ((com.tencent.mm.plugin.luckymoney.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.luckymoney.a.a.class)).bKL();
          setResult(-1);
          finish();
          AppMethodBeat.o(48302);
        }
        else
        {
          a(new com.tencent.mm.plugin.wallet_core.c.a(str2, str3, paramBundle, str4, getIntent().getStringExtra("signtype"), (String)localObject, getIntent().getStringExtra("url"), 4, "openWCPaySpecificView", getIntent().getIntExtra("pay_channel", 0)), true, false);
          AppMethodBeat.o(48302);
        }
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48304);
    super.onDestroy();
    ng(580);
    ng(385);
    ng(2996);
    AppMethodBeat.o(48304);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI
 * JD-Core Version:    0.6.2
 */