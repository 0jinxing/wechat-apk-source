package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

public class FreeWifiNetCheckUI extends MMActivity
{
  private int cIb;
  private ap che;
  private Intent intent;
  private String key;
  private boolean myf;
  private final int mzA;
  private final int mzB;
  private int[] mzD;
  ak mzE;
  private b mzL;
  ImageView mzx;
  private int scene;

  public FreeWifiNetCheckUI()
  {
    AppMethodBeat.i(21043);
    this.myf = true;
    this.mzA = 1;
    this.mzB = 2;
    this.mzD = new int[] { 2130838838, 2130838839, 2130838840, 2130838841, 2130838842 };
    this.mzE = new FreeWifiNetCheckUI.1(this);
    AppMethodBeat.o(21043);
  }

  private void bzS()
  {
    AppMethodBeat.i(21047);
    if (bo.isNullOrNil(this.key))
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
      finish();
      AppMethodBeat.o(21047);
    }
    while (true)
    {
      return;
      this.mzL = new b(this, this.key, this.cIb);
      ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiNetCheckUI.connectFreewifi, desc=base params are ready and it will connets wifi.apKey=%s, channel=%d", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(this.intent)), this.key, Integer.valueOf(this.cIb) });
      this.mzL.connect();
      AppMethodBeat.o(21047);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(21044);
    if (this.che != null)
      this.che.stopTimer();
    this.mzE.sendEmptyMessage(2);
    super.finish();
    AppMethodBeat.o(21044);
  }

  public final int getLayoutId()
  {
    return 2130969594;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21045);
    super.onCreate(paramBundle);
    setMMTitle(2131300078);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(21035);
        FreeWifiNetCheckUI.this.finish();
        AppMethodBeat.o(21035);
        return true;
      }
    });
    this.intent = getIntent();
    m.U(this.intent);
    this.key = getIntent().getStringExtra("free_wifi_ap_key");
    this.scene = getIntent().getIntExtra("free_wifi_source", 1);
    ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiNetCheckUI.onCreate, desc=it goes into black loading ui and starts to connect. get qrcode key = %s, current connected ssid = %s", new Object[] { m.V(this.intent), Integer.valueOf(m.W(this.intent)), this.key, com.tencent.mm.plugin.freewifi.model.d.byO() });
    this.mzx = ((ImageView)findViewById(2131824129));
    this.che = new ap(new FreeWifiNetCheckUI.3(this), true);
    this.che.ae(200L, 200L);
    AppMethodBeat.o(21045);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(21048);
    super.onDestroy();
    if (this.mzL != null)
      this.mzL = null;
    this.che.stopTimer();
    AppMethodBeat.o(21048);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(21049);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      finish();
      bool = true;
      AppMethodBeat.o(21049);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(21049);
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(21050);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(21050);
      return;
    }
    ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 77:
    }
    while (true)
    {
      AppMethodBeat.o(21050);
      break;
      if ((paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == -1))
      {
        this.myf = false;
        h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131297773), false, new FreeWifiNetCheckUI.7(this), new FreeWifiNetCheckUI.8(this));
      }
    }
  }

  // ERROR //
  public void onResume()
  {
    // Byte code:
    //   0: sipush 21046
    //   3: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokespecial 293	com/tencent/mm/ui/MMActivity:onResume	()V
    //   10: aload_0
    //   11: getfield 41	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:myf	Z
    //   14: ifeq +59 -> 73
    //   17: aload_0
    //   18: ldc_w 295
    //   21: bipush 77
    //   23: aconst_null
    //   24: aconst_null
    //   25: invokestatic 300	com/tencent/mm/pluginsdk/permission/b:a	(Landroid/app/Activity;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z
    //   28: istore_1
    //   29: ldc 106
    //   31: ldc_w 302
    //   34: iconst_1
    //   35: anewarray 127	java/lang/Object
    //   38: dup
    //   39: iconst_0
    //   40: iload_1
    //   41: invokestatic 307	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   44: aastore
    //   45: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   48: iload_1
    //   49: ifne +24 -> 73
    //   52: iconst_0
    //   53: istore_2
    //   54: iload_2
    //   55: ifne +92 -> 147
    //   58: ldc 106
    //   60: ldc_w 309
    //   63: invokestatic 311	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: sipush 21046
    //   69: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: return
    //   73: aload_0
    //   74: ldc_w 295
    //   77: invokestatic 314	com/tencent/mm/pluginsdk/permission/b:o	(Landroid/content/Context;Ljava/lang/String;)Z
    //   80: ifne +8 -> 88
    //   83: iconst_0
    //   84: istore_2
    //   85: goto -31 -> 54
    //   88: invokestatic 320	com/tencent/mm/modelgeo/d:agA	()Z
    //   91: ifne +51 -> 142
    //   94: aload_0
    //   95: aload_0
    //   96: ldc_w 321
    //   99: invokevirtual 274	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getString	(I)Ljava/lang/String;
    //   102: aload_0
    //   103: ldc_w 322
    //   106: invokevirtual 274	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getString	(I)Ljava/lang/String;
    //   109: aload_0
    //   110: ldc_w 276
    //   113: invokevirtual 274	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getString	(I)Ljava/lang/String;
    //   116: aload_0
    //   117: ldc_w 323
    //   120: invokevirtual 274	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getString	(I)Ljava/lang/String;
    //   123: iconst_0
    //   124: new 8	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI$4
    //   127: dup
    //   128: aload_0
    //   129: invokespecial 324	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI$4:<init>	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI;)V
    //   132: aconst_null
    //   133: invokestatic 288	com/tencent/mm/ui/base/h:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)Lcom/tencent/mm/ui/widget/a/c;
    //   136: pop
    //   137: iconst_0
    //   138: istore_2
    //   139: goto -85 -> 54
    //   142: iconst_1
    //   143: istore_2
    //   144: goto -90 -> 54
    //   147: aload_0
    //   148: getfield 207	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:scene	I
    //   151: tableswitch	default:+37 -> 188, 1:+369->520, 2:+37->188, 3:+37->188, 4:+103->254, 5:+323->474, 6:+648->799
    //   189: fmul
    //   190: ldc_w 326
    //   193: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   196: aload_0
    //   197: invokevirtual 88	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:finish	()V
    //   200: ldc 106
    //   202: ldc_w 328
    //   205: iconst_3
    //   206: anewarray 127	java/lang/Object
    //   209: dup
    //   210: iconst_0
    //   211: aload_0
    //   212: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   215: invokestatic 137	com/tencent/mm/plugin/freewifi/m:V	(Landroid/content/Intent;)Ljava/lang/String;
    //   218: aastore
    //   219: dup
    //   220: iconst_1
    //   221: aload_0
    //   222: getfield 97	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:intent	Landroid/content/Intent;
    //   225: invokestatic 141	com/tencent/mm/plugin/freewifi/m:W	(Landroid/content/Intent;)I
    //   228: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   231: aastore
    //   232: dup
    //   233: iconst_2
    //   234: aload_0
    //   235: getfield 118	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:cIb	I
    //   238: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   241: aastore
    //   242: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   245: sipush 21046
    //   248: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   251: goto -179 -> 72
    //   254: aload_0
    //   255: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   258: ldc_w 330
    //   261: invokevirtual 199	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   264: astore_3
    //   265: ldc_w 332
    //   268: aload_3
    //   269: invokevirtual 338	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   272: ifeq +68 -> 340
    //   275: aload_0
    //   276: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   279: ldc_w 340
    //   282: bipush 9
    //   284: invokevirtual 343	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   287: pop
    //   288: aload_0
    //   289: bipush 9
    //   291: putfield 118	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:cIb	I
    //   294: aload_0
    //   295: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   298: ldc_w 330
    //   301: invokevirtual 199	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   304: astore_3
    //   305: aload_3
    //   306: ldc_w 345
    //   309: invokevirtual 338	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   312: ifeq +80 -> 392
    //   315: aload_0
    //   316: getfield 67	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:key	Ljava/lang/String;
    //   319: invokestatic 104	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   322: ifeq +70 -> 392
    //   325: ldc 106
    //   327: ldc_w 347
    //   330: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   333: aload_0
    //   334: invokevirtual 88	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:finish	()V
    //   337: goto -137 -> 200
    //   340: ldc_w 345
    //   343: aload_3
    //   344: invokevirtual 338	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   347: ifeq +25 -> 372
    //   350: aload_0
    //   351: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   354: ldc_w 340
    //   357: bipush 8
    //   359: invokevirtual 343	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   362: pop
    //   363: aload_0
    //   364: bipush 8
    //   366: putfield 118	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:cIb	I
    //   369: goto -75 -> 294
    //   372: aload_0
    //   373: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   376: ldc_w 340
    //   379: iconst_4
    //   380: invokevirtual 343	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   383: pop
    //   384: aload_0
    //   385: iconst_4
    //   386: putfield 118	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:cIb	I
    //   389: goto -95 -> 294
    //   392: aload_3
    //   393: ldc_w 345
    //   396: invokevirtual 338	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   399: ifeq +10 -> 409
    //   402: aload_0
    //   403: invokespecial 160	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:bzS	()V
    //   406: goto -206 -> 200
    //   409: aload_3
    //   410: ldc_w 332
    //   413: invokevirtual 338	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   416: ifeq +43 -> 459
    //   419: aload_0
    //   420: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   423: ldc_w 349
    //   426: invokevirtual 199	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   429: astore_3
    //   430: invokestatic 352	com/tencent/mm/plugin/freewifi/model/d:isWifiEnabled	()Z
    //   433: ifne +7 -> 440
    //   436: invokestatic 355	com/tencent/mm/plugin/freewifi/model/d:byJ	()Z
    //   439: pop
    //   440: invokestatic 361	com/tencent/mm/plugin/freewifi/model/h$b:byT	()Lcom/tencent/mm/plugin/freewifi/model/h;
    //   443: new 363	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI$6
    //   446: dup
    //   447: aload_0
    //   448: aload_3
    //   449: invokespecial 366	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI$6:<init>	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI;Ljava/lang/String;)V
    //   452: invokevirtual 371	com/tencent/mm/plugin/freewifi/model/h:a	(Lcom/tencent/mm/plugin/freewifi/model/h$a;)Z
    //   455: pop
    //   456: goto -256 -> 200
    //   459: ldc 106
    //   461: ldc_w 373
    //   464: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   467: aload_0
    //   468: invokevirtual 88	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:finish	()V
    //   471: goto -271 -> 200
    //   474: aload_0
    //   475: aload_0
    //   476: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   479: ldc_w 340
    //   482: iconst_1
    //   483: invokevirtual 205	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   486: putfield 118	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:cIb	I
    //   489: aload_0
    //   490: getfield 67	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:key	Ljava/lang/String;
    //   493: invokestatic 104	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   496: ifeq +17 -> 513
    //   499: ldc 106
    //   501: ldc 108
    //   503: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   506: aload_0
    //   507: invokevirtual 88	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:finish	()V
    //   510: goto -310 -> 200
    //   513: aload_0
    //   514: invokespecial 160	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:bzS	()V
    //   517: goto -317 -> 200
    //   520: aload_0
    //   521: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   524: ldc_w 340
    //   527: iconst_2
    //   528: invokevirtual 343	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   531: pop
    //   532: aload_0
    //   533: iconst_2
    //   534: putfield 118	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:cIb	I
    //   537: aload_0
    //   538: getfield 67	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:key	Ljava/lang/String;
    //   541: invokestatic 104	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   544: ifeq +17 -> 561
    //   547: ldc 106
    //   549: ldc 108
    //   551: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   554: aload_0
    //   555: invokevirtual 88	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:finish	()V
    //   558: goto -358 -> 200
    //   561: ldc_w 375
    //   564: astore 4
    //   566: aload_0
    //   567: getfield 67	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:key	Ljava/lang/String;
    //   570: invokestatic 381	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   573: astore_3
    //   574: aload_3
    //   575: ldc_w 383
    //   578: invokevirtual 386	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   581: astore 5
    //   583: aload 5
    //   585: astore 4
    //   587: ldc_w 388
    //   590: aload 4
    //   592: invokevirtual 391	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   595: ifeq +188 -> 783
    //   598: aload_3
    //   599: ldc_w 393
    //   602: invokevirtual 386	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   605: astore 4
    //   607: aload_3
    //   608: ldc_w 395
    //   611: invokevirtual 386	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   614: astore 5
    //   616: aload_3
    //   617: ldc_w 397
    //   620: invokevirtual 386	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   623: astore 6
    //   625: aload_0
    //   626: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   629: aload 6
    //   631: invokestatic 400	com/tencent/mm/plugin/freewifi/m:d	(Landroid/content/Intent;Ljava/lang/String;)V
    //   634: invokestatic 406	com/tencent/mm/plugin/freewifi/k:byo	()Lcom/tencent/mm/plugin/freewifi/k$a;
    //   637: astore_3
    //   638: aload_3
    //   639: aload 5
    //   641: putfield 411	com/tencent/mm/plugin/freewifi/k$a:muc	Ljava/lang/String;
    //   644: aload_3
    //   645: aload 4
    //   647: putfield 414	com/tencent/mm/plugin/freewifi/k$a:mud	Ljava/lang/String;
    //   650: aload_3
    //   651: aload 6
    //   653: putfield 417	com/tencent/mm/plugin/freewifi/k$a:kBq	Ljava/lang/String;
    //   656: aload_3
    //   657: getstatic 423	com/tencent/mm/plugin/freewifi/k$b:muK	Lcom/tencent/mm/plugin/freewifi/k$b;
    //   660: getfield 427	com/tencent/mm/plugin/freewifi/k$b:muQ	J
    //   663: putfield 430	com/tencent/mm/plugin/freewifi/k$a:muf	J
    //   666: aload_3
    //   667: getstatic 423	com/tencent/mm/plugin/freewifi/k$b:muK	Lcom/tencent/mm/plugin/freewifi/k$b;
    //   670: getfield 433	com/tencent/mm/plugin/freewifi/k$b:name	Ljava/lang/String;
    //   673: putfield 436	com/tencent/mm/plugin/freewifi/k$a:mug	Ljava/lang/String;
    //   676: aload_3
    //   677: invokevirtual 440	com/tencent/mm/plugin/freewifi/k$a:byq	()Lcom/tencent/mm/plugin/freewifi/k;
    //   680: invokevirtual 443	com/tencent/mm/plugin/freewifi/k:byp	()Lcom/tencent/mm/plugin/freewifi/k;
    //   683: pop
    //   684: ldc 106
    //   686: ldc_w 445
    //   689: iconst_5
    //   690: anewarray 127	java/lang/Object
    //   693: dup
    //   694: iconst_0
    //   695: aload_0
    //   696: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   699: invokestatic 137	com/tencent/mm/plugin/freewifi/m:V	(Landroid/content/Intent;)Ljava/lang/String;
    //   702: aastore
    //   703: dup
    //   704: iconst_1
    //   705: aload_0
    //   706: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   709: invokestatic 141	com/tencent/mm/plugin/freewifi/m:W	(Landroid/content/Intent;)I
    //   712: invokestatic 147	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   715: aastore
    //   716: dup
    //   717: iconst_2
    //   718: aload 5
    //   720: aastore
    //   721: dup
    //   722: iconst_3
    //   723: aload 4
    //   725: aastore
    //   726: dup
    //   727: iconst_4
    //   728: aload 6
    //   730: aastore
    //   731: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   734: new 447	com/tencent/mm/plugin/freewifi/d/h
    //   737: dup
    //   738: aload 4
    //   740: aload 5
    //   742: invokestatic 450	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   745: invokevirtual 453	java/lang/Integer:intValue	()I
    //   748: aload 6
    //   750: invokespecial 456	com/tencent/mm/plugin/freewifi/d/h:<init>	(Ljava/lang/String;ILjava/lang/String;)V
    //   753: new 458	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI$5
    //   756: dup
    //   757: aload_0
    //   758: aload 5
    //   760: aload 6
    //   762: aload 4
    //   764: invokespecial 461	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI$5:<init>	(Lcom/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   767: invokevirtual 464	com/tencent/mm/plugin/freewifi/d/h:c	(Lcom/tencent/mm/ai/f;)V
    //   770: goto -570 -> 200
    //   773: astore_3
    //   774: aconst_null
    //   775: astore_3
    //   776: aload_0
    //   777: invokevirtual 88	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:finish	()V
    //   780: goto -193 -> 587
    //   783: ldc_w 466
    //   786: aload 4
    //   788: invokevirtual 338	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   791: pop
    //   792: aload_0
    //   793: invokespecial 160	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:bzS	()V
    //   796: goto -596 -> 200
    //   799: aload_0
    //   800: invokevirtual 131	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:getIntent	()Landroid/content/Intent;
    //   803: ldc_w 340
    //   806: bipush 10
    //   808: invokevirtual 343	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   811: pop
    //   812: aload_0
    //   813: bipush 10
    //   815: putfield 118	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:cIb	I
    //   818: aload_0
    //   819: getfield 67	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:key	Ljava/lang/String;
    //   822: invokestatic 104	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   825: ifeq +17 -> 842
    //   828: ldc 106
    //   830: ldc 108
    //   832: invokestatic 114	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   835: aload_0
    //   836: invokevirtual 88	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:finish	()V
    //   839: goto -639 -> 200
    //   842: aload_0
    //   843: invokespecial 160	com/tencent/mm/plugin/freewifi/ui/FreeWifiNetCheckUI:bzS	()V
    //   846: goto -646 -> 200
    //   849: astore 5
    //   851: goto -75 -> 776
    //
    // Exception table:
    //   from	to	target	type
    //   566	574	773	java/lang/Exception
    //   574	583	849	java/lang/Exception
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiNetCheckUI
 * JD-Core Version:    0.6.2
 */