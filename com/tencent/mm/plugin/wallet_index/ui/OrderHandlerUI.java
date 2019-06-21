package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.modelpay.PayReq.Options;
import com.tencent.mm.opensdk.modelpay.PayResp;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.bio;
import com.tencent.mm.protocal.protobuf.csj;
import com.tencent.mm.protocal.protobuf.nb;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.c.z;

@com.tencent.mm.ui.base.a(3)
public class OrderHandlerUI extends MMActivity
  implements f
{
  public String TAG;
  private String czZ;
  private String fOs;
  private int gOW;
  private long jEg;
  private PayReq.Options options;
  private boolean pSQ;
  private c piM;
  private PayReq tRH;
  private PayResp tRI;
  private boolean tRJ;
  private String tRK;
  private boolean tRL;
  private boolean tRM;

  public OrderHandlerUI()
  {
    AppMethodBeat.i(48232);
    this.TAG = "MicroMsg.OrderHandlerUI";
    this.tRJ = false;
    this.gOW = 0;
    this.tRK = "";
    this.tRL = false;
    this.jEg = 0L;
    this.pSQ = false;
    this.tRM = false;
    this.piM = new OrderHandlerUI.1(this);
    AppMethodBeat.o(48232);
  }

  private void JN(String paramString)
  {
    AppMethodBeat.i(48242);
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
      str = getString(2131305389);
    com.tencent.mm.ui.base.h.a(this, str, null, false, new OrderHandlerUI.2(this));
    AppMethodBeat.o(48242);
  }

  private void bD(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(48238);
    if (this.gOW == 1)
      if ((TextUtils.isEmpty(this.tRK)) && (paramBoolean))
      {
        AM(0);
        JN(paramString);
        AppMethodBeat.o(48238);
      }
    while (true)
    {
      return;
      bf(this, this.tRK);
      finish();
      AppMethodBeat.o(48238);
      continue;
      e.a(this, this.fOs, this.tRI, this.options);
      finish();
      AppMethodBeat.o(48238);
    }
  }

  private void bf(Context paramContext, String paramString)
  {
    AppMethodBeat.i(48241);
    if (paramContext == null)
    {
      ab.e(this.TAG, "startOuterApp context == null");
      AppMethodBeat.o(48241);
    }
    while (true)
    {
      return;
      if (TextUtils.isEmpty(paramString))
      {
        ab.e(this.TAG, "startOuterApp callbackUrl is empty");
        AppMethodBeat.o(48241);
      }
      else
      {
        ab.i(this.TAG, "startOuterApp callbackUrl is ".concat(String.valueOf(paramString)));
        paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
        paramString.addFlags(268435456);
        if (bo.k(paramContext, paramString))
          paramContext.startActivity(paramString);
        AppMethodBeat.o(48241);
      }
    }
  }

  public void finish()
  {
    AppMethodBeat.i(48239);
    ab.i(this.TAG, "finish hasFinish %s %s", new Object[] { Boolean.valueOf(this.pSQ), bo.dpG().toString() });
    if (this.pSQ)
      AppMethodBeat.o(48239);
    while (true)
    {
      return;
      this.pSQ = true;
      super.finish();
      AppMethodBeat.o(48239);
    }
  }

  public final int getLayoutId()
  {
    return 2130970340;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48237);
    ab.i(this.TAG, "onActivityResult resp %s, onPayEndCalled %s", new Object[] { this.tRI, Boolean.valueOf(this.tRJ) });
    if (paramIntent != null)
    {
      paramInt1 = paramIntent.getIntExtra("key_pay_reslut_type", 0);
      if (paramInt1 == 1000)
      {
        ab.i(this.TAG, "onActivityResult resp %s, onPayEndCalled %s payResultType %s", new Object[] { this.tRI, Boolean.valueOf(this.tRJ), Integer.valueOf(paramInt1) });
        finish();
        AppMethodBeat.o(48237);
      }
    }
    while (true)
    {
      return;
      if (paramInt1 == 1001)
      {
        AppMethodBeat.o(48237);
      }
      else
      {
        if ((this.tRI != null) && (!this.tRJ))
        {
          ab.e(this.TAG, "onActivityResult, onPayEnd not called");
          this.tRI.errCode = -2;
          bD("", false);
        }
        AppMethodBeat.o(48237);
      }
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(48240);
    super.onConfigurationChanged(paramConfiguration);
    ab.i(this.TAG, "onConfigurationChanged");
    AppMethodBeat.o(48240);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48233);
    super.onCreate(paramBundle);
    this.TAG = ("MicroMsg.OrderHandlerUI@" + hashCode());
    this.jEg = getIntent().getLongExtra("wallet_pay_key_check_time", -1L);
    AM(8);
    z.dNW();
    com.tencent.mm.sdk.b.a.xxA.c(this.piM);
    AppMethodBeat.o(48233);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48235);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(397, this);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(2655, this);
    com.tencent.mm.sdk.b.a.xxA.d(this.piM);
    super.onDestroy();
    AppMethodBeat.o(48235);
  }

  // ERROR //
  public void onResume()
  {
    // Byte code:
    //   0: ldc_w 330
    //   3: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokespecial 332	com/tencent/mm/ui/MMActivity:onResume	()V
    //   10: new 334	com/tencent/mm/opensdk/modelpay/PayReq
    //   13: dup
    //   14: invokespecial 335	com/tencent/mm/opensdk/modelpay/PayReq:<init>	()V
    //   17: astore_1
    //   18: aload_1
    //   19: aload_0
    //   20: invokevirtual 277	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   23: invokevirtual 339	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   26: invokevirtual 342	com/tencent/mm/opensdk/modelpay/PayReq:fromBundle	(Landroid/os/Bundle;)V
    //   29: aload_0
    //   30: getfield 344	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:tRH	Lcom/tencent/mm/opensdk/modelpay/PayReq;
    //   33: ifnull +27 -> 60
    //   36: aload_1
    //   37: getfield 347	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   40: ifnull +559 -> 599
    //   43: aload_1
    //   44: getfield 347	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   47: aload_0
    //   48: getfield 344	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:tRH	Lcom/tencent/mm/opensdk/modelpay/PayReq;
    //   51: getfield 347	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   54: invokevirtual 351	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   57: ifne +542 -> 599
    //   60: aload_0
    //   61: aload_1
    //   62: putfield 344	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:tRH	Lcom/tencent/mm/opensdk/modelpay/PayReq;
    //   65: aload_0
    //   66: aload_0
    //   67: invokevirtual 277	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   70: ldc_w 353
    //   73: iconst_0
    //   74: invokevirtual 232	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   77: putfield 50	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:gOW	I
    //   80: aload_0
    //   81: getfield 46	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:TAG	Ljava/lang/String;
    //   84: new 261	java/lang/StringBuilder
    //   87: dup
    //   88: ldc_w 355
    //   91: invokespecial 265	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   94: aload_0
    //   95: getfield 50	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:gOW	I
    //   98: invokevirtual 272	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   101: invokevirtual 273	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   107: aload_0
    //   108: getfield 50	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:gOW	I
    //   111: ifne +55 -> 166
    //   114: aload_0
    //   115: aload_0
    //   116: invokevirtual 277	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   119: ldc_w 357
    //   122: invokevirtual 360	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   125: putfield 118	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:fOs	Ljava/lang/String;
    //   128: aload_0
    //   129: getfield 118	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:fOs	Ljava/lang/String;
    //   132: ifnull +13 -> 145
    //   135: aload_0
    //   136: getfield 118	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:fOs	Ljava/lang/String;
    //   139: invokevirtual 363	java/lang/String:length	()I
    //   142: ifne +24 -> 166
    //   145: aload_0
    //   146: getfield 46	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:TAG	Ljava/lang/String;
    //   149: ldc_w 365
    //   152: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   155: aload_0
    //   156: invokevirtual 116	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:finish	()V
    //   159: ldc_w 330
    //   162: invokestatic 72	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   165: return
    //   166: aload_0
    //   167: new 367	com/tencent/mm/opensdk/modelpay/PayReq$Options
    //   170: dup
    //   171: invokespecial 368	com/tencent/mm/opensdk/modelpay/PayReq$Options:<init>	()V
    //   174: putfield 122	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:options	Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;
    //   177: aload_0
    //   178: getfield 122	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:options	Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;
    //   181: aload_0
    //   182: invokevirtual 277	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   185: invokevirtual 339	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   188: invokevirtual 369	com/tencent/mm/opensdk/modelpay/PayReq$Options:fromBundle	(Landroid/os/Bundle;)V
    //   191: aload_0
    //   192: new 243	com/tencent/mm/opensdk/modelpay/PayResp
    //   195: dup
    //   196: invokespecial 370	com/tencent/mm/opensdk/modelpay/PayResp:<init>	()V
    //   199: putfield 120	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:tRI	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   202: aload_0
    //   203: getfield 120	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:tRI	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   206: aload_1
    //   207: getfield 347	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   210: putfield 371	com/tencent/mm/opensdk/modelpay/PayResp:prepayId	Ljava/lang/String;
    //   213: aload_0
    //   214: getfield 120	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:tRI	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   217: aload_1
    //   218: getfield 374	com/tencent/mm/opensdk/modelpay/PayReq:extData	Ljava/lang/String;
    //   221: putfield 375	com/tencent/mm/opensdk/modelpay/PayResp:extData	Ljava/lang/String;
    //   224: ldc 52
    //   226: astore_2
    //   227: aload_0
    //   228: getfield 50	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:gOW	I
    //   231: ifne +134 -> 365
    //   234: aload_1
    //   235: invokevirtual 379	com/tencent/mm/opensdk/modelpay/PayReq:checkArgs	()Z
    //   238: ifne +65 -> 303
    //   241: aload_0
    //   242: getfield 46	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:TAG	Ljava/lang/String;
    //   245: ldc_w 381
    //   248: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   251: aload_0
    //   252: getfield 120	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:tRI	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   255: iconst_m1
    //   256: putfield 246	com/tencent/mm/opensdk/modelpay/PayResp:errCode	I
    //   259: aload_0
    //   260: getfield 120	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:tRI	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   263: aload_0
    //   264: ldc_w 382
    //   267: invokevirtual 87	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getString	(I)Ljava/lang/String;
    //   270: putfield 385	com/tencent/mm/opensdk/modelpay/PayResp:errStr	Ljava/lang/String;
    //   273: aload_0
    //   274: aload_0
    //   275: getfield 118	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:fOs	Ljava/lang/String;
    //   278: aload_0
    //   279: getfield 120	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:tRI	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   282: aload_0
    //   283: getfield 122	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:options	Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;
    //   286: invokestatic 127	com/tencent/mm/plugin/wallet_index/ui/e:a	(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/opensdk/modelpay/PayResp;Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;)Z
    //   289: pop
    //   290: aload_0
    //   291: invokevirtual 116	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:finish	()V
    //   294: ldc_w 330
    //   297: invokestatic 72	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   300: goto -135 -> 165
    //   303: aload_0
    //   304: invokevirtual 277	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   307: ldc_w 387
    //   310: iconst_0
    //   311: invokevirtual 391	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   314: ifne +63 -> 377
    //   317: aload_0
    //   318: getfield 46	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:TAG	Ljava/lang/String;
    //   321: ldc_w 393
    //   324: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   327: aload_0
    //   328: getfield 120	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:tRI	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   331: iconst_m1
    //   332: putfield 246	com/tencent/mm/opensdk/modelpay/PayResp:errCode	I
    //   335: aload_0
    //   336: aload_0
    //   337: getfield 118	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:fOs	Ljava/lang/String;
    //   340: aload_0
    //   341: getfield 120	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:tRI	Lcom/tencent/mm/opensdk/modelpay/PayResp;
    //   344: aload_0
    //   345: getfield 122	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:options	Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;
    //   348: invokestatic 127	com/tencent/mm/plugin/wallet_index/ui/e:a	(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/mm/opensdk/modelpay/PayResp;Lcom/tencent/mm/opensdk/modelpay/PayReq$Options;)Z
    //   351: pop
    //   352: aload_0
    //   353: invokevirtual 116	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:finish	()V
    //   356: ldc_w 330
    //   359: invokestatic 72	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   362: goto -197 -> 165
    //   365: aload_0
    //   366: getfield 50	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:gOW	I
    //   369: iconst_1
    //   370: if_icmpne +7 -> 377
    //   373: ldc_w 395
    //   376: astore_2
    //   377: aload_0
    //   378: invokevirtual 277	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getIntent	()Landroid/content/Intent;
    //   381: ldc_w 357
    //   384: invokevirtual 360	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   387: astore_3
    //   388: ldc 52
    //   390: astore 4
    //   392: ldc 52
    //   394: astore 5
    //   396: aload_0
    //   397: invokevirtual 399	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getPackageManager	()Landroid/content/pm/PackageManager;
    //   400: aload_3
    //   401: iconst_0
    //   402: invokevirtual 405	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   405: pop
    //   406: aload_0
    //   407: invokevirtual 399	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getPackageManager	()Landroid/content/pm/PackageManager;
    //   410: aload_3
    //   411: iconst_0
    //   412: invokevirtual 405	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   415: getfield 411	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   418: aload_0
    //   419: invokevirtual 399	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:getPackageManager	()Landroid/content/pm/PackageManager;
    //   422: invokevirtual 417	android/content/pm/ApplicationInfo:loadLabel	(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
    //   425: checkcast 142	java/lang/String
    //   428: astore 6
    //   430: aload_0
    //   431: aload_3
    //   432: invokestatic 423	com/tencent/mm/pluginsdk/model/app/p:bx	(Landroid/content/Context;Ljava/lang/String;)[Landroid/content/pm/Signature;
    //   435: astore 4
    //   437: aload 4
    //   439: ifnull +9 -> 448
    //   442: aload 4
    //   444: arraylength
    //   445: ifne +163 -> 608
    //   448: ldc_w 425
    //   451: ldc_w 427
    //   454: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   457: aconst_null
    //   458: astore 4
    //   460: aload 6
    //   462: astore 7
    //   464: aload 4
    //   466: astore 6
    //   468: aload 7
    //   470: astore 4
    //   472: aload_0
    //   473: getfield 46	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:TAG	Ljava/lang/String;
    //   476: ldc_w 429
    //   479: iconst_3
    //   480: anewarray 199	java/lang/Object
    //   483: dup
    //   484: iconst_0
    //   485: aload_3
    //   486: aastore
    //   487: dup
    //   488: iconst_1
    //   489: aload 4
    //   491: aastore
    //   492: dup
    //   493: iconst_2
    //   494: aload 6
    //   496: aastore
    //   497: invokestatic 217	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   500: new 431	com/tencent/mm/plugin/wallet_index/c/g
    //   503: dup
    //   504: aload_1
    //   505: aload_2
    //   506: aload_3
    //   507: aload 4
    //   509: aload 6
    //   511: invokespecial 434	com/tencent/mm/plugin/wallet_index/c/g:<init>	(Lcom/tencent/mm/opensdk/modelpay/PayReq;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   514: astore 5
    //   516: aload 5
    //   518: astore 7
    //   520: aload_1
    //   521: getfield 347	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   524: invokestatic 438	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   527: ifne +36 -> 563
    //   530: aload 5
    //   532: astore 7
    //   534: aload_1
    //   535: getfield 347	com/tencent/mm/opensdk/modelpay/PayReq:prepayId	Ljava/lang/String;
    //   538: ldc_w 440
    //   541: invokevirtual 443	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   544: ifeq +19 -> 563
    //   547: new 445	com/tencent/mm/plugin/wallet_index/c/k
    //   550: dup
    //   551: aload_1
    //   552: aload_2
    //   553: aload_3
    //   554: aload 4
    //   556: aload 6
    //   558: invokespecial 446	com/tencent/mm/plugin/wallet_index/c/k:<init>	(Lcom/tencent/mm/opensdk/modelpay/PayReq;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   561: astore 7
    //   563: invokestatic 307	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   566: pop
    //   567: invokestatic 311	com/tencent/mm/kernel/g:RO	()Lcom/tencent/mm/kernel/b;
    //   570: getfield 317	com/tencent/mm/kernel/b:eJo	Lcom/tencent/mm/ai/p;
    //   573: aload 7
    //   575: invokevirtual 449	com/tencent/mm/plugin/wallet_index/c/g:getType	()I
    //   578: aload_0
    //   579: invokevirtual 451	com/tencent/mm/ai/p:a	(ILcom/tencent/mm/ai/f;)V
    //   582: invokestatic 307	com/tencent/mm/kernel/g:RQ	()Lcom/tencent/mm/kernel/g;
    //   585: pop
    //   586: invokestatic 311	com/tencent/mm/kernel/g:RO	()Lcom/tencent/mm/kernel/b;
    //   589: getfield 317	com/tencent/mm/kernel/b:eJo	Lcom/tencent/mm/ai/p;
    //   592: aload 7
    //   594: iconst_0
    //   595: invokevirtual 454	com/tencent/mm/ai/p:a	(Lcom/tencent/mm/ai/m;I)Z
    //   598: pop
    //   599: ldc_w 330
    //   602: invokestatic 72	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   605: goto -440 -> 165
    //   608: aload 4
    //   610: iconst_0
    //   611: aaload
    //   612: invokevirtual 460	android/content/pm/Signature:toByteArray	()[B
    //   615: invokestatic 466	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   618: astore 4
    //   620: goto -160 -> 460
    //   623: astore 7
    //   625: aload_0
    //   626: getfield 46	com/tencent/mm/plugin/wallet_index/ui/OrderHandlerUI:TAG	Ljava/lang/String;
    //   629: aload 7
    //   631: ldc 52
    //   633: iconst_0
    //   634: anewarray 199	java/lang/Object
    //   637: invokestatic 470	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   640: aload 5
    //   642: astore 6
    //   644: goto -172 -> 472
    //   647: astore 7
    //   649: aload 6
    //   651: astore 4
    //   653: goto -28 -> 625
    //
    // Exception table:
    //   from	to	target	type
    //   396	430	623	android/content/pm/PackageManager$NameNotFoundException
    //   430	437	647	android/content/pm/PackageManager$NameNotFoundException
    //   442	448	647	android/content/pm/PackageManager$NameNotFoundException
    //   448	457	647	android/content/pm/PackageManager$NameNotFoundException
    //   608	620	647	android/content/pm/PackageManager$NameNotFoundException
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48236);
    if ((paramm.getType() != 397) && (paramm.getType() != 2655))
    {
      AppMethodBeat.o(48236);
      return;
    }
    PayInfo localPayInfo = new PayInfo();
    if (this.gOW == 1)
    {
      localPayInfo.cIf = 36;
      label59: com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RO().eJo.b(paramm.getType(), this);
      ab.i(this.TAG, "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
      localObject1 = (com.tencent.mm.plugin.wallet_index.c.g)paramm;
      paramm = (bio)((com.tencent.mm.plugin.wallet_index.c.g)localObject1).ehh.fsH.fsP;
      if (paramm != null)
        break label224;
      paramm = null;
      label143: this.tRK = paramm;
      if ((paramInt1 != 4) || (paramInt2 != -5))
        break label245;
      ab.e(this.TAG, "onSceneEnd, auth access denied");
      this.tRI.errCode = -1;
      bD(paramString, true);
      paramInt1 = localPayInfo.cIf;
      if (this.tRH != null)
        break label234;
    }
    label224: label234: for (paramString = ""; ; paramString = this.tRH.prepayId)
    {
      ad.o(paramInt1, paramString, paramInt2);
      AppMethodBeat.o(48236);
      break;
      localPayInfo.cIf = 2;
      break label59;
      paramm = paramm.wLZ;
      break label143;
    }
    label245: if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e(this.TAG, "onSceneEnd,  PayAuthApp is failed!");
      this.tRI.errCode = -1;
      bD(paramString, true);
      paramInt1 = localPayInfo.cIf;
      if (this.tRH == null);
      for (paramString = ""; ; paramString = this.tRH.prepayId)
      {
        ad.o(paramInt1, paramString, paramInt2);
        AppMethodBeat.o(48236);
        break;
      }
    }
    paramm = (bio)((com.tencent.mm.plugin.wallet_index.c.g)localObject1).ehh.fsH.fsP;
    label342: label366: Object localObject2;
    label390: Object localObject3;
    if (paramm == null)
    {
      paramInt1 = -1;
      paramm = (bio)((com.tencent.mm.plugin.wallet_index.c.g)localObject1).ehh.fsH.fsP;
      if (paramm != null)
        break label524;
      paramm = null;
      localObject2 = (bio)((com.tencent.mm.plugin.wallet_index.c.g)localObject1).ehh.fsH.fsP;
      if (localObject2 != null)
        break label534;
      localObject2 = null;
      localObject3 = (bio)((com.tencent.mm.plugin.wallet_index.c.g)localObject1).ehh.fsH.fsP;
      if (localObject3 != null)
        break label544;
      localObject3 = null;
      label414: localObject1 = (bio)((com.tencent.mm.plugin.wallet_index.c.g)localObject1).ehh.fsH.fsP;
      if (localObject1 != null)
        break label554;
    }
    label524: label534: label544: label554: for (Object localObject1 = null; ; localObject1 = ((bio)localObject1).wlh)
    {
      ab.i(this.TAG, "onSceneEnd, respErrCode = %d, respErrMsg = %s, respPrepayId = %s, respAppSource = %s", new Object[] { Integer.valueOf(paramInt1), paramm, localObject2, localObject3 });
      if (!bo.isNullOrNil((String)localObject2))
        break label564;
      ab.e(this.TAG, "onSceneEnd, respPrepayId is null");
      this.tRI.errCode = -1;
      bD(paramString, true);
      AppMethodBeat.o(48236);
      break;
      paramInt1 = paramm.luT;
      break label342;
      paramm = paramm.luU;
      break label366;
      localObject2 = ((bio)localObject2).wlb;
      break label390;
      localObject3 = ((bio)localObject3).wlc;
      break label414;
    }
    label564: ad.o(localPayInfo.cIf, (String)localObject2, paramInt2);
    if ((localObject1 != null) && (!bo.isNullOrNil(((csj)localObject1).xpI)))
    {
      this.tRM = true;
      paramString = new Intent();
      paramString.putExtra("prepayId", (String)localObject2);
      paramString.putExtra("is_jsapi_offline_pay", false);
      paramString.putExtra("pay_gate_url", ((csj)localObject1).xpI);
      paramString.putExtra("need_dialog", ((csj)localObject1).xpK);
      paramString.putExtra("dialog_text", ((csj)localObject1).xpL);
      paramString.putExtra("max_count", ((csj)localObject1).xpJ.vRG);
      paramString.putExtra("inteval_time", ((csj)localObject1).xpJ.vRF);
      paramString.putExtra("default_wording", ((csj)localObject1).xpJ.vRH);
      d.c(this, "wallet_core", ".ui.WalletMixOrderInfoUI", paramString);
    }
    while (true)
    {
      this.czZ = ((String)localObject2);
      this.tRJ = false;
      AppMethodBeat.o(48236);
      break;
      localPayInfo.appId = this.tRH.appId;
      localPayInfo.czZ = ((String)localObject2);
      localPayInfo.partnerId = this.tRH.partnerId;
      localPayInfo.tRb = ((String)localObject3);
      localPayInfo.vwg = String.valueOf(paramInt1);
      localPayInfo.aIm = paramm;
      if (this.jEg > 0L)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(641L, 1L, 1L, true);
        com.tencent.mm.plugin.report.service.h.pYm.a(641L, 2L, bo.gb(this.jEg), true);
        if (localPayInfo.vwh == null)
          localPayInfo.vwh = new Bundle();
        localPayInfo.vwh.putLong("wallet_pay_key_check_time", this.jEg);
      }
      com.tencent.mm.pluginsdk.wallet.h.a(this, localPayInfo, 123);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI
 * JD-Core Version:    0.6.2
 */