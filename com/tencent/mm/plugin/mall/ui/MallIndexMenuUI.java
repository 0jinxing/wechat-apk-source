package com.tencent.mm.plugin.mall.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.on;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.b.a.bj;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.ai;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.protocal.protobuf.bjl;
import com.tencent.mm.protocal.protobuf.bjm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class MallIndexMenuUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private int okT;
  private List<bjm> omK;
  private HashMap<String, bjl> omL;
  private boolean omM;

  public MallIndexMenuUI()
  {
    AppMethodBeat.i(43171);
    this.omL = new HashMap();
    AppMethodBeat.o(43171);
  }

  public final int JC()
  {
    return -1;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool1 = true;
    AppMethodBeat.i(43174);
    paramf = paramPreference.mKey;
    ab.i("MicroMsg.MallIndexMenuUI", "onPreferenceTreeClick, key: %s", new Object[] { paramf });
    bjl localbjl = (bjl)this.omL.get(paramf);
    String str;
    if (localbjl != null)
    {
      paramf = new JSONObject();
      com.tencent.mm.kernel.g.RQ();
      str = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTV, "");
      if (bo.isNullOrNil(str));
    }
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        paramf = localJSONObject;
        if (paramf.optInt(localbjl.name, 0) != 1)
          break label1300;
        paramf.remove(localbjl.name);
        paramf.remove(String.format("%s_expiretime", new Object[] { localbjl.name }));
        if (paramf.length() > 0)
          break label305;
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTV, "");
        if ((paramPreference instanceof IconPreference))
        {
          ((IconPreference)paramPreference).NN(8);
          ((IconPreference)paramPreference).NL(8);
          ((IconPreference)paramPreference).NM(8);
          ((IconPreference)paramPreference).qh(false);
        }
        i = 1;
        switch (localbjl.ttd)
        {
        case 6:
        case 7:
        default:
          AppMethodBeat.o(43174);
          bool2 = bool1;
          return bool2;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 8:
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.MallIndexMenuUI", localException, "parse redDotConfig json failed: %s", new Object[] { localException.getMessage() });
      }
      continue;
      label305: com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTV, paramf.toString());
      continue;
      ab.i("MicroMsg.MallIndexMenuUI", "jump type h5, url: %s", new Object[] { localbjl.tte });
      if (!bo.isNullOrNil(localbjl.tte))
        com.tencent.mm.wallet_core.ui.e.n(this, localbjl.tte, false);
      paramf = h.pYm;
      if (i != 0);
      for (int i = 1; ; i = 0)
      {
        paramf.e(14872, new Object[] { Integer.valueOf(1), Integer.valueOf(i), localbjl.tte, "", Integer.valueOf(0) });
        break;
      }
      ab.i("MicroMsg.MallIndexMenuUI", "jump type tiny app, username: %s, path: %s", new Object[] { localbjl.tzW, localbjl.tzW });
      if (!bo.isNullOrNil(localbjl.tzW))
      {
        paramf = new se();
        paramf.cOf.userName = localbjl.tzW;
        paramf.cOf.cOh = bo.bc(localbjl.ttg, "");
        paramf.cOf.scene = 1066;
        paramf.cOf.cOi = 0;
        com.tencent.mm.sdk.b.a.xxA.m(paramf);
      }
      paramf = h.pYm;
      if (i != 0);
      for (i = 1; ; i = 0)
      {
        paramf.e(14872, new Object[] { Integer.valueOf(2), Integer.valueOf(i), "", localbjl.tzW, Integer.valueOf(0) });
        break;
      }
      ab.i("MicroMsg.MallIndexMenuUI", "jump type payment management");
      d.H(this, "wallet", ".pwd.ui.WalletPasswordSettingUI");
      paramf = h.pYm;
      if (i != 0);
      for (i = 1; ; i = 0)
      {
        paramf.e(14872, new Object[] { Integer.valueOf(3), Integer.valueOf(i), "", "", Integer.valueOf(0) });
        break;
      }
      ab.i("MicroMsg.MallIndexMenuUI", "jump type payment security");
      paramf = new Intent();
      paramf.putExtra("wallet_lock_jsapi_scene", 1);
      d.b(this, "wallet", ".pwd.ui.WalletSecuritySettingUI", paramf);
      paramf = h.pYm;
      if (i != 0);
      for (i = 1; ; i = 0)
      {
        paramf.e(14872, new Object[] { Integer.valueOf(4), Integer.valueOf(i), "", "", Integer.valueOf(0) });
        new bj();
        break;
      }
      ab.i("MicroMsg.MallIndexMenuUI", "jump type wallet switch");
      d.c(this, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
      paramf = h.pYm;
      if (i != 0);
      for (i = 1; ; i = 0)
      {
        paramf.e(14872, new Object[] { Integer.valueOf(5), Integer.valueOf(i), "", "", Integer.valueOf(0) });
        break;
      }
      ab.i("MicroMsg.MallIndexMenuUI", "jump type honey pay");
      d.H(this, "honey_pay", ".ui.HoneyPayMainUI");
      paramf = h.pYm;
      if (i != 0);
      for (i = 1; ; i = 0)
      {
        paramf.e(14872, new Object[] { Integer.valueOf(8), Integer.valueOf(i), "", "", Integer.valueOf(0) });
        break;
      }
      if ("pay_my_msg".equals(paramf))
      {
        paramf = com.tencent.mm.plugin.wallet_core.model.r.cPI().cQo();
        if ((paramf.tCP & 0x10000) > 0)
        {
          bool2 = true;
          label985: ab.i("MicroMsg.WalletSwitchConfig", "isShowH5TradeDetail, ret = %s switchBit %s", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(paramf.tCP) });
          if (!bool2)
            break label1073;
          paramf = new Intent();
          paramf.putExtra("rawUrl", "https://wx.tenpay.com/userroll/readtemplate?t=userroll/index_tmpl");
          d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
        }
        while (true)
        {
          com.tencent.mm.wallet_core.ui.e.QS(20);
          AppMethodBeat.o(43174);
          bool2 = bool1;
          break;
          bool2 = false;
          break label985;
          label1073: com.tencent.mm.wallet_core.a.b(this, "ShowOrdersInfoProcess", null);
        }
      }
      if ("pay_manage".equals(paramf))
      {
        if (com.tencent.mm.model.r.YM())
          d.H(this, "wallet_payu", ".pwd.ui.WalletPayUPasswordSettingUI");
        while (true)
        {
          com.tencent.mm.wallet_core.ui.e.QS(21);
          AppMethodBeat.o(43174);
          bool2 = bool1;
          break;
          d.H(this, "wallet", ".pwd.ui.WalletPasswordSettingUI");
        }
      }
      if ("pay_security".equals(paramf))
      {
        d.H(this, "wallet", ".pwd.ui.WalletSecuritySettingUI");
        com.tencent.mm.wallet_core.ui.e.QS(22);
        paramf = new bj();
        paramf.cVT = 11L;
        paramf.dcm = 1L;
        paramf.ajK();
      }
      do
      {
        AppMethodBeat.o(43174);
        bool2 = false;
        break;
        if ("pay_help_center".equals(paramf))
        {
          paramPreference = new Intent();
          if (com.tencent.mm.model.r.YM());
          for (paramf = "https://wx.tenpay.com/cgi-bin/mmpayweb-bin/readtemplate?t=payu_faq_tmpl"; ; paramf = "https://kf.qq.com/touch/scene_product.html?scene_id=kf1")
          {
            paramPreference.putExtra("rawUrl", paramf);
            d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
            com.tencent.mm.wallet_core.ui.e.QS(23);
            AppMethodBeat.o(43174);
            bool2 = bool1;
            break;
          }
        }
      }
      while (!"pay_wallet_switch".equals(paramf));
      d.c(this, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
      AppMethodBeat.o(43174);
      boolean bool2 = bool1;
      continue;
      label1300: i = 0;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(43176);
    if (paramInt1 == 1)
    {
      com.tencent.mm.kernel.g.RQ();
      this.okT = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
      if (paramInt2 == -1)
        if (com.tencent.mm.model.r.YN())
        {
          finish();
          AppMethodBeat.o(43176);
        }
    }
    while (true)
    {
      return;
      finish();
      paramIntent = new on();
      paramIntent.cKQ.context = this.mController.ylL;
      com.tencent.mm.sdk.b.a.xxA.m(paramIntent);
      AppMethodBeat.o(43176);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(43172);
    this.yll = true;
    super.onCreate(paramBundle);
    xE(this.mController.dyj());
    this.omM = getIntent().getBooleanExtra("key_default_show_currency", false);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTW, Boolean.FALSE);
    setBackBtn(new MallIndexMenuUI.1(this));
    this.ehK = this.yCw;
    setMMTitle(2131301324);
    com.tencent.mm.kernel.g.Rg().a(1754, this);
    paramBundle = new com.tencent.mm.plugin.mall.a.g();
    com.tencent.mm.kernel.g.Rg().a(paramBundle, 0);
    AppMethodBeat.o(43172);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(43173);
    super.onDestroy();
    com.tencent.mm.kernel.g.Rg().b(1754, this);
    AppMethodBeat.o(43173);
  }

  // ERROR //
  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    // Byte code:
    //   0: ldc_w 495
    //   3: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 53
    //   8: ldc_w 497
    //   11: iconst_2
    //   12: anewarray 57	java/lang/Object
    //   15: dup
    //   16: iconst_0
    //   17: iload_1
    //   18: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   21: aastore
    //   22: dup
    //   23: iconst_1
    //   24: iload_2
    //   25: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   28: aastore
    //   29: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   32: iload_1
    //   33: ifne +7 -> 40
    //   36: iload_2
    //   37: ifeq +18 -> 55
    //   40: ldc 53
    //   42: ldc_w 499
    //   45: invokestatic 501	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: ldc_w 495
    //   51: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   54: return
    //   55: aload 4
    //   57: checkcast 480	com/tencent/mm/plugin/mall/a/g
    //   60: getfield 505	com/tencent/mm/plugin/mall/a/g:okV	Lcom/tencent/mm/protocal/protobuf/amf;
    //   63: astore 5
    //   65: aload 5
    //   67: getfield 510	com/tencent/mm/protocal/protobuf/amf:title	Ljava/lang/String;
    //   70: astore_3
    //   71: aload 5
    //   73: getfield 514	com/tencent/mm/protocal/protobuf/amf:wrk	Ljava/util/LinkedList;
    //   76: astore 4
    //   78: aload 5
    //   80: getfield 514	com/tencent/mm/protocal/protobuf/amf:wrk	Ljava/util/LinkedList;
    //   83: ifnull +760 -> 843
    //   86: aload 5
    //   88: getfield 514	com/tencent/mm/protocal/protobuf/amf:wrk	Ljava/util/LinkedList;
    //   91: invokevirtual 519	java/util/LinkedList:size	()I
    //   94: istore_1
    //   95: ldc 53
    //   97: ldc_w 521
    //   100: iconst_3
    //   101: anewarray 57	java/lang/Object
    //   104: dup
    //   105: iconst_0
    //   106: aload_3
    //   107: aastore
    //   108: dup
    //   109: iconst_1
    //   110: aload 4
    //   112: aastore
    //   113: dup
    //   114: iconst_2
    //   115: iload_1
    //   116: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   119: aastore
    //   120: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: ldc 53
    //   125: ldc_w 523
    //   128: iconst_1
    //   129: anewarray 57	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload 5
    //   136: aastore
    //   137: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: aload 5
    //   142: ifnull +1332 -> 1474
    //   145: aload_0
    //   146: getfield 465	com/tencent/mm/plugin/mall/ui/MallIndexMenuUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   149: invokeinterface 528 1 0
    //   154: aload 5
    //   156: getfield 510	com/tencent/mm/protocal/protobuf/amf:title	Ljava/lang/String;
    //   159: invokestatic 108	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   162: ifne +12 -> 174
    //   165: aload_0
    //   166: aload 5
    //   168: getfield 510	com/tencent/mm/protocal/protobuf/amf:title	Ljava/lang/String;
    //   171: invokevirtual 530	com/tencent/mm/plugin/mall/ui/MallIndexMenuUI:setMMTitle	(Ljava/lang/String;)V
    //   174: new 70	org/json/JSONObject
    //   177: dup
    //   178: invokespecial 71	org/json/JSONObject:<init>	()V
    //   181: astore_3
    //   182: invokestatic 77	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   185: pop
    //   186: invokestatic 81	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   189: invokevirtual 87	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   192: getstatic 93	com/tencent/mm/storage/ac$a:xTV	Lcom/tencent/mm/storage/ac$a;
    //   195: ldc 95
    //   197: invokevirtual 100	com/tencent/mm/storage/z:get	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)Ljava/lang/Object;
    //   200: checkcast 102	java/lang/String
    //   203: astore 6
    //   205: aload 6
    //   207: invokestatic 108	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   210: ifne +640 -> 850
    //   213: new 70	org/json/JSONObject
    //   216: astore 4
    //   218: aload 4
    //   220: aload 6
    //   222: invokespecial 111	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   225: aload 4
    //   227: astore_3
    //   228: aload 5
    //   230: getfield 514	com/tencent/mm/protocal/protobuf/amf:wrk	Ljava/util/LinkedList;
    //   233: ifnull +1195 -> 1428
    //   236: aload 5
    //   238: getfield 514	com/tencent/mm/protocal/protobuf/amf:wrk	Ljava/util/LinkedList;
    //   241: invokevirtual 519	java/util/LinkedList:size	()I
    //   244: ifle +1184 -> 1428
    //   247: aload_0
    //   248: aload 5
    //   250: getfield 514	com/tencent/mm/protocal/protobuf/amf:wrk	Ljava/util/LinkedList;
    //   253: putfield 532	com/tencent/mm/plugin/mall/ui/MallIndexMenuUI:omK	Ljava/util/List;
    //   256: iconst_1
    //   257: istore_2
    //   258: aload 5
    //   260: getfield 514	com/tencent/mm/protocal/protobuf/amf:wrk	Ljava/util/LinkedList;
    //   263: invokevirtual 536	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   266: astore 4
    //   268: iconst_0
    //   269: istore_1
    //   270: aload 4
    //   272: invokeinterface 541 1 0
    //   277: ifeq +1151 -> 1428
    //   280: aload 4
    //   282: invokeinterface 545 1 0
    //   287: checkcast 547	com/tencent/mm/protocal/protobuf/bjm
    //   290: astore 6
    //   292: aload 6
    //   294: getfield 550	com/tencent/mm/protocal/protobuf/bjm:wMT	Ljava/util/LinkedList;
    //   297: ifnull +1189 -> 1486
    //   300: aload 6
    //   302: getfield 550	com/tencent/mm/protocal/protobuf/bjm:wMT	Ljava/util/LinkedList;
    //   305: invokevirtual 519	java/util/LinkedList:size	()I
    //   308: ifle +1178 -> 1486
    //   311: iload_2
    //   312: ifne +31 -> 343
    //   315: aload 6
    //   317: getfield 551	com/tencent/mm/protocal/protobuf/bjm:title	Ljava/lang/String;
    //   320: invokestatic 108	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   323: ifeq +20 -> 343
    //   326: aload_0
    //   327: getfield 465	com/tencent/mm/plugin/mall/ui/MallIndexMenuUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   330: new 553	com/tencent/mm/ui/base/preference/PreferenceSmallCategory
    //   333: dup
    //   334: aload_0
    //   335: invokespecial 556	com/tencent/mm/ui/base/preference/PreferenceSmallCategory:<init>	(Landroid/content/Context;)V
    //   338: invokeinterface 559 2 0
    //   343: aload 6
    //   345: getfield 551	com/tencent/mm/protocal/protobuf/bjm:title	Ljava/lang/String;
    //   348: invokestatic 108	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   351: ifne +34 -> 385
    //   354: new 561	com/tencent/mm/ui/base/preference/PreferenceTitleCategory
    //   357: dup
    //   358: aload_0
    //   359: invokespecial 562	com/tencent/mm/ui/base/preference/PreferenceTitleCategory:<init>	(Landroid/content/Context;)V
    //   362: astore 5
    //   364: aload 5
    //   366: aload 6
    //   368: getfield 551	com/tencent/mm/protocal/protobuf/bjm:title	Ljava/lang/String;
    //   371: invokevirtual 566	com/tencent/mm/ui/base/preference/PreferenceTitleCategory:setTitle	(Ljava/lang/CharSequence;)V
    //   374: aload_0
    //   375: getfield 465	com/tencent/mm/plugin/mall/ui/MallIndexMenuUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   378: aload 5
    //   380: invokeinterface 559 2 0
    //   385: invokestatic 572	java/lang/System:currentTimeMillis	()J
    //   388: lstore 7
    //   390: aload 6
    //   392: getfield 550	com/tencent/mm/protocal/protobuf/bjm:wMT	Ljava/util/LinkedList;
    //   395: invokevirtual 536	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   398: astore 5
    //   400: aload 5
    //   402: invokeinterface 541 1 0
    //   407: ifeq +1016 -> 1423
    //   410: aload 5
    //   412: invokeinterface 545 1 0
    //   417: checkcast 68	com/tencent/mm/protocal/protobuf/bjl
    //   420: astore 6
    //   422: ldc 53
    //   424: ldc_w 574
    //   427: iconst_1
    //   428: anewarray 57	java/lang/Object
    //   431: dup
    //   432: iconst_0
    //   433: aload 6
    //   435: getfield 114	com/tencent/mm/protocal/protobuf/bjl:name	Ljava/lang/String;
    //   438: aastore
    //   439: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   442: new 576	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference
    //   445: dup
    //   446: aload_0
    //   447: invokespecial 577	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:<init>	(Landroid/content/Context;)V
    //   450: astore 9
    //   452: aload 6
    //   454: getfield 578	com/tencent/mm/protocal/protobuf/bjl:title	Ljava/lang/String;
    //   457: invokestatic 108	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   460: ifne +13 -> 473
    //   463: aload 9
    //   465: aload 6
    //   467: getfield 578	com/tencent/mm/protocal/protobuf/bjl:title	Ljava/lang/String;
    //   470: invokevirtual 579	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:setTitle	(Ljava/lang/CharSequence;)V
    //   473: aload 6
    //   475: getfield 582	com/tencent/mm/protocal/protobuf/bjl:desc	Ljava/lang/String;
    //   478: invokestatic 108	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   481: ifne +26 -> 507
    //   484: aload 9
    //   486: iconst_0
    //   487: invokevirtual 583	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:NM	(I)V
    //   490: aload 9
    //   492: aload 6
    //   494: getfield 582	com/tencent/mm/protocal/protobuf/bjl:desc	Ljava/lang/String;
    //   497: iconst_m1
    //   498: ldc_w 585
    //   501: invokestatic 591	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   504: invokevirtual 595	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:av	(Ljava/lang/String;II)V
    //   507: aload 6
    //   509: getfield 598	com/tencent/mm/protocal/protobuf/bjl:kbV	Ljava/lang/String;
    //   512: invokestatic 108	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   515: ifne +13 -> 528
    //   518: aload 9
    //   520: aload 6
    //   522: getfield 598	com/tencent/mm/protocal/protobuf/bjl:kbV	Ljava/lang/String;
    //   525: putfield 601	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:iconUrl	Ljava/lang/String;
    //   528: aload 9
    //   530: aload 6
    //   532: getfield 114	com/tencent/mm/protocal/protobuf/bjl:name	Ljava/lang/String;
    //   535: invokevirtual 604	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:setKey	(Ljava/lang/String;)V
    //   538: aload_3
    //   539: ldc 124
    //   541: iconst_1
    //   542: anewarray 57	java/lang/Object
    //   545: dup
    //   546: iconst_0
    //   547: aload 6
    //   549: getfield 114	com/tencent/mm/protocal/protobuf/bjl:name	Ljava/lang/String;
    //   552: aastore
    //   553: invokestatic 128	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   556: lconst_0
    //   557: invokevirtual 608	org/json/JSONObject:optLong	(Ljava/lang/String;J)J
    //   560: lstore 10
    //   562: ldc 53
    //   564: ldc_w 610
    //   567: iconst_1
    //   568: anewarray 57	java/lang/Object
    //   571: dup
    //   572: iconst_0
    //   573: lload 10
    //   575: invokestatic 615	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   578: aastore
    //   579: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   582: aload_3
    //   583: aload 6
    //   585: getfield 114	com/tencent/mm/protocal/protobuf/bjl:name	Ljava/lang/String;
    //   588: iconst_0
    //   589: invokevirtual 118	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   592: iconst_1
    //   593: if_icmpne +260 -> 853
    //   596: iconst_1
    //   597: istore_2
    //   598: iload_2
    //   599: ifeq +884 -> 1483
    //   602: lload 10
    //   604: lconst_0
    //   605: lcmp
    //   606: ifle +877 -> 1483
    //   609: lload 7
    //   611: lload 10
    //   613: lcmp
    //   614: iflt +869 -> 1483
    //   617: ldc 53
    //   619: ldc_w 617
    //   622: invokestatic 241	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   625: iconst_0
    //   626: istore_2
    //   627: aload_3
    //   628: aload 6
    //   630: getfield 114	com/tencent/mm/protocal/protobuf/bjl:name	Ljava/lang/String;
    //   633: iconst_0
    //   634: invokevirtual 621	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   637: pop
    //   638: iload_2
    //   639: ifeq +103 -> 742
    //   642: aload 6
    //   644: getfield 625	com/tencent/mm/protocal/protobuf/bjl:wMS	Lcom/tencent/mm/protocal/protobuf/bqo;
    //   647: ifnull +334 -> 981
    //   650: ldc_w 627
    //   653: aload 6
    //   655: getfield 625	com/tencent/mm/protocal/protobuf/bjl:wMS	Lcom/tencent/mm/protocal/protobuf/bqo;
    //   658: getfield 632	com/tencent/mm/protocal/protobuf/bqo:type	Ljava/lang/String;
    //   661: invokevirtual 293	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   664: ifeq +221 -> 885
    //   667: aload 9
    //   669: iconst_0
    //   670: invokevirtual 583	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:NM	(I)V
    //   673: aload 9
    //   675: iconst_1
    //   676: invokevirtual 633	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:qh	(Z)V
    //   679: aload 6
    //   681: getfield 625	com/tencent/mm/protocal/protobuf/bjl:wMS	Lcom/tencent/mm/protocal/protobuf/bqo;
    //   684: getfield 636	com/tencent/mm/protocal/protobuf/bqo:cEh	Ljava/lang/String;
    //   687: invokestatic 108	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   690: ifne +52 -> 742
    //   693: ldc 53
    //   695: ldc_w 638
    //   698: iconst_1
    //   699: anewarray 57	java/lang/Object
    //   702: dup
    //   703: iconst_0
    //   704: aload 6
    //   706: getfield 625	com/tencent/mm/protocal/protobuf/bjl:wMS	Lcom/tencent/mm/protocal/protobuf/bqo;
    //   709: getfield 636	com/tencent/mm/protocal/protobuf/bqo:cEh	Ljava/lang/String;
    //   712: aastore
    //   713: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   716: aload 9
    //   718: aload 6
    //   720: getfield 625	com/tencent/mm/protocal/protobuf/bjl:wMS	Lcom/tencent/mm/protocal/protobuf/bqo;
    //   723: getfield 636	com/tencent/mm/protocal/protobuf/bqo:cEh	Ljava/lang/String;
    //   726: iconst_m1
    //   727: ldc_w 585
    //   730: invokestatic 591	android/graphics/Color:parseColor	(Ljava/lang/String;)I
    //   733: invokevirtual 595	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:av	(Ljava/lang/String;II)V
    //   736: aload 9
    //   738: iconst_0
    //   739: invokevirtual 583	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:NM	(I)V
    //   742: aload 9
    //   744: bipush 8
    //   746: invokevirtual 641	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:NQ	(I)V
    //   749: aload 6
    //   751: getfield 114	com/tencent/mm/protocal/protobuf/bjl:name	Ljava/lang/String;
    //   754: invokestatic 108	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   757: ifne +233 -> 990
    //   760: aload_0
    //   761: getfield 34	com/tencent/mm/plugin/mall/ui/MallIndexMenuUI:omL	Ljava/util/HashMap;
    //   764: aload 6
    //   766: getfield 114	com/tencent/mm/protocal/protobuf/bjl:name	Ljava/lang/String;
    //   769: aload 6
    //   771: invokevirtual 644	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   774: pop
    //   775: aload_0
    //   776: getfield 465	com/tencent/mm/plugin/mall/ui/MallIndexMenuUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   779: aload 9
    //   781: invokeinterface 559 2 0
    //   786: iinc 1 1
    //   789: aload 6
    //   791: getfield 153	com/tencent/mm/protocal/protobuf/bjl:ttd	I
    //   794: tableswitch	default:+46 -> 840, 1:+247->1041, 2:+312->1106, 3:+377->1171, 4:+439->1233, 5:+501->1295, 6:+46->840, 7:+46->840, 8:+563->1357
    //   841: impdep1
    //   842: dstore_1
    //   843: iconst_0
    //   844: istore_1
    //   845: goto -750 -> 95
    //   848: astore 4
    //   850: goto -622 -> 228
    //   853: iconst_0
    //   854: istore_2
    //   855: goto -257 -> 598
    //   858: astore 12
    //   860: ldc 53
    //   862: aload 12
    //   864: ldc_w 646
    //   867: iconst_1
    //   868: anewarray 57	java/lang/Object
    //   871: dup
    //   872: iconst_0
    //   873: aload 12
    //   875: invokevirtual 159	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   878: aastore
    //   879: invokestatic 163	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   882: goto -244 -> 638
    //   885: ldc_w 648
    //   888: aload 6
    //   890: getfield 625	com/tencent/mm/protocal/protobuf/bjl:wMS	Lcom/tencent/mm/protocal/protobuf/bqo;
    //   893: getfield 632	com/tencent/mm/protocal/protobuf/bqo:type	Ljava/lang/String;
    //   896: invokevirtual 293	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   899: ifeq +27 -> 926
    //   902: aload 9
    //   904: aload_0
    //   905: ldc_w 649
    //   908: invokevirtual 653	com/tencent/mm/plugin/mall/ui/MallIndexMenuUI:getString	(I)Ljava/lang/String;
    //   911: ldc_w 654
    //   914: invokevirtual 658	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:ey	(Ljava/lang/String;I)V
    //   917: aload 9
    //   919: iconst_0
    //   920: invokevirtual 659	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:NL	(I)V
    //   923: goto -244 -> 679
    //   926: ldc_w 661
    //   929: aload 6
    //   931: getfield 625	com/tencent/mm/protocal/protobuf/bjl:wMS	Lcom/tencent/mm/protocal/protobuf/bqo;
    //   934: getfield 632	com/tencent/mm/protocal/protobuf/bqo:type	Ljava/lang/String;
    //   937: invokevirtual 293	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   940: ifeq -261 -> 679
    //   943: aload 9
    //   945: new 663	java/lang/StringBuilder
    //   948: dup
    //   949: invokespecial 664	java/lang/StringBuilder:<init>	()V
    //   952: aload 6
    //   954: getfield 625	com/tencent/mm/protocal/protobuf/bjl:wMS	Lcom/tencent/mm/protocal/protobuf/bqo;
    //   957: getfield 667	com/tencent/mm/protocal/protobuf/bqo:number	I
    //   960: invokevirtual 671	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   963: invokevirtual 672	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   966: ldc_w 673
    //   969: invokevirtual 658	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:ey	(Ljava/lang/String;I)V
    //   972: aload 9
    //   974: iconst_0
    //   975: invokevirtual 659	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:NL	(I)V
    //   978: goto -299 -> 679
    //   981: aload 9
    //   983: iconst_0
    //   984: invokevirtual 674	com/tencent/mm/plugin/mall/ui/CdnImageIconPreference:NN	(I)V
    //   987: goto -245 -> 742
    //   990: aload_0
    //   991: getfield 34	com/tencent/mm/plugin/mall/ui/MallIndexMenuUI:omL	Ljava/util/HashMap;
    //   994: new 663	java/lang/StringBuilder
    //   997: dup
    //   998: invokespecial 664	java/lang/StringBuilder:<init>	()V
    //   1001: iload_1
    //   1002: invokevirtual 671	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1005: aload 6
    //   1007: getfield 114	com/tencent/mm/protocal/protobuf/bjl:name	Ljava/lang/String;
    //   1010: invokevirtual 677	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1013: aload 6
    //   1015: getfield 153	com/tencent/mm/protocal/protobuf/bjl:ttd	I
    //   1018: invokevirtual 671	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1021: aload 6
    //   1023: getfield 578	com/tencent/mm/protocal/protobuf/bjl:title	Ljava/lang/String;
    //   1026: invokevirtual 677	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1029: invokevirtual 672	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1032: aload 6
    //   1034: invokevirtual 644	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1037: pop
    //   1038: goto -263 -> 775
    //   1041: getstatic 183	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1044: astore 9
    //   1046: iload_2
    //   1047: ifeq +54 -> 1101
    //   1050: iconst_1
    //   1051: istore_2
    //   1052: aload 9
    //   1054: sipush 14872
    //   1057: iconst_5
    //   1058: anewarray 57	java/lang/Object
    //   1061: dup
    //   1062: iconst_0
    //   1063: iconst_1
    //   1064: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1067: aastore
    //   1068: dup
    //   1069: iconst_1
    //   1070: iload_2
    //   1071: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1074: aastore
    //   1075: dup
    //   1076: iconst_2
    //   1077: aload 6
    //   1079: getfield 171	com/tencent/mm/protocal/protobuf/bjl:tte	Ljava/lang/String;
    //   1082: aastore
    //   1083: dup
    //   1084: iconst_3
    //   1085: ldc 95
    //   1087: aastore
    //   1088: dup
    //   1089: iconst_4
    //   1090: iconst_1
    //   1091: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1094: aastore
    //   1095: invokevirtual 193	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1098: goto -698 -> 400
    //   1101: iconst_0
    //   1102: istore_2
    //   1103: goto -51 -> 1052
    //   1106: getstatic 183	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1109: astore 9
    //   1111: iload_2
    //   1112: ifeq +54 -> 1166
    //   1115: iconst_1
    //   1116: istore_2
    //   1117: aload 9
    //   1119: sipush 14872
    //   1122: iconst_5
    //   1123: anewarray 57	java/lang/Object
    //   1126: dup
    //   1127: iconst_0
    //   1128: iconst_2
    //   1129: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1132: aastore
    //   1133: dup
    //   1134: iconst_1
    //   1135: iload_2
    //   1136: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1139: aastore
    //   1140: dup
    //   1141: iconst_2
    //   1142: ldc 95
    //   1144: aastore
    //   1145: dup
    //   1146: iconst_3
    //   1147: aload 6
    //   1149: getfield 198	com/tencent/mm/protocal/protobuf/bjl:tzW	Ljava/lang/String;
    //   1152: aastore
    //   1153: dup
    //   1154: iconst_4
    //   1155: iconst_1
    //   1156: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1159: aastore
    //   1160: invokevirtual 193	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1163: goto -763 -> 400
    //   1166: iconst_0
    //   1167: istore_2
    //   1168: goto -51 -> 1117
    //   1171: getstatic 183	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1174: astore 6
    //   1176: iload_2
    //   1177: ifeq +51 -> 1228
    //   1180: iconst_1
    //   1181: istore_2
    //   1182: aload 6
    //   1184: sipush 14872
    //   1187: iconst_5
    //   1188: anewarray 57	java/lang/Object
    //   1191: dup
    //   1192: iconst_0
    //   1193: iconst_3
    //   1194: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1197: aastore
    //   1198: dup
    //   1199: iconst_1
    //   1200: iload_2
    //   1201: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1204: aastore
    //   1205: dup
    //   1206: iconst_2
    //   1207: ldc 95
    //   1209: aastore
    //   1210: dup
    //   1211: iconst_3
    //   1212: ldc 95
    //   1214: aastore
    //   1215: dup
    //   1216: iconst_4
    //   1217: iconst_1
    //   1218: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1221: aastore
    //   1222: invokevirtual 193	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1225: goto -825 -> 400
    //   1228: iconst_0
    //   1229: istore_2
    //   1230: goto -48 -> 1182
    //   1233: getstatic 183	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1236: astore 6
    //   1238: iload_2
    //   1239: ifeq +51 -> 1290
    //   1242: iconst_1
    //   1243: istore_2
    //   1244: aload 6
    //   1246: sipush 14872
    //   1249: iconst_5
    //   1250: anewarray 57	java/lang/Object
    //   1253: dup
    //   1254: iconst_0
    //   1255: iconst_4
    //   1256: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1259: aastore
    //   1260: dup
    //   1261: iconst_1
    //   1262: iload_2
    //   1263: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1266: aastore
    //   1267: dup
    //   1268: iconst_2
    //   1269: ldc 95
    //   1271: aastore
    //   1272: dup
    //   1273: iconst_3
    //   1274: ldc 95
    //   1276: aastore
    //   1277: dup
    //   1278: iconst_4
    //   1279: iconst_1
    //   1280: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1283: aastore
    //   1284: invokevirtual 193	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1287: goto -887 -> 400
    //   1290: iconst_0
    //   1291: istore_2
    //   1292: goto -48 -> 1244
    //   1295: getstatic 183	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1298: astore 6
    //   1300: iload_2
    //   1301: ifeq +51 -> 1352
    //   1304: iconst_1
    //   1305: istore_2
    //   1306: aload 6
    //   1308: sipush 14872
    //   1311: iconst_5
    //   1312: anewarray 57	java/lang/Object
    //   1315: dup
    //   1316: iconst_0
    //   1317: iconst_5
    //   1318: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1321: aastore
    //   1322: dup
    //   1323: iconst_1
    //   1324: iload_2
    //   1325: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1328: aastore
    //   1329: dup
    //   1330: iconst_2
    //   1331: ldc 95
    //   1333: aastore
    //   1334: dup
    //   1335: iconst_3
    //   1336: ldc 95
    //   1338: aastore
    //   1339: dup
    //   1340: iconst_4
    //   1341: iconst_1
    //   1342: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1345: aastore
    //   1346: invokevirtual 193	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1349: goto -949 -> 400
    //   1352: iconst_0
    //   1353: istore_2
    //   1354: goto -48 -> 1306
    //   1357: getstatic 183	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   1360: astore 9
    //   1362: iload_2
    //   1363: ifeq +55 -> 1418
    //   1366: iconst_1
    //   1367: istore_2
    //   1368: aload 9
    //   1370: sipush 14872
    //   1373: iconst_5
    //   1374: anewarray 57	java/lang/Object
    //   1377: dup
    //   1378: iconst_0
    //   1379: bipush 8
    //   1381: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1384: aastore
    //   1385: dup
    //   1386: iconst_1
    //   1387: iload_2
    //   1388: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1391: aastore
    //   1392: dup
    //   1393: iconst_2
    //   1394: aload 6
    //   1396: getfield 171	com/tencent/mm/protocal/protobuf/bjl:tte	Ljava/lang/String;
    //   1399: aastore
    //   1400: dup
    //   1401: iconst_3
    //   1402: ldc 95
    //   1404: aastore
    //   1405: dup
    //   1406: iconst_4
    //   1407: iconst_1
    //   1408: invokestatic 189	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1411: aastore
    //   1412: invokevirtual 193	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   1415: goto -575 -> 840
    //   1418: iconst_0
    //   1419: istore_2
    //   1420: goto -52 -> 1368
    //   1423: iconst_0
    //   1424: istore_2
    //   1425: goto -1155 -> 270
    //   1428: aload_3
    //   1429: invokevirtual 131	org/json/JSONObject:length	()I
    //   1432: ifle +42 -> 1474
    //   1435: ldc 53
    //   1437: ldc_w 679
    //   1440: iconst_1
    //   1441: anewarray 57	java/lang/Object
    //   1444: dup
    //   1445: iconst_0
    //   1446: aload_3
    //   1447: invokevirtual 166	org/json/JSONObject:toString	()Ljava/lang/String;
    //   1450: aastore
    //   1451: invokestatic 62	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1454: invokestatic 77	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   1457: pop
    //   1458: invokestatic 81	com/tencent/mm/kernel/g:RP	()Lcom/tencent/mm/kernel/e;
    //   1461: invokevirtual 87	com/tencent/mm/kernel/e:Ry	()Lcom/tencent/mm/storage/z;
    //   1464: getstatic 93	com/tencent/mm/storage/ac$a:xTV	Lcom/tencent/mm/storage/ac$a;
    //   1467: aload_3
    //   1468: invokevirtual 166	org/json/JSONObject:toString	()Ljava/lang/String;
    //   1471: invokevirtual 135	com/tencent/mm/storage/z:set	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)V
    //   1474: ldc_w 495
    //   1477: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1480: goto -1426 -> 54
    //   1483: goto -845 -> 638
    //   1486: goto -61 -> 1425
    //
    // Exception table:
    //   from	to	target	type
    //   213	225	848	org/json/JSONException
    //   627	638	858	java/lang/Exception
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexMenuUI
 * JD-Core Version:    0.6.2
 */