package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.provider.Settings.System;
import android.support.v4.app.a.a;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.luggage.g.e.c;
import com.tencent.luggage.g.e.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic;
import com.tencent.mm.plugin.appbrand.b.f;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.a.b.2;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.k.3;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.p;
import com.tencent.mm.plugin.appbrand.page.r;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.widget.input.am;
import com.tencent.mm.sdk.h.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(1)
public class AppBrandUI extends MMActivity
  implements a.a, s, t
{
  private com.tencent.mm.plugin.appbrand.task.i gOD;
  private final com.tencent.mm.plugin.appbrand.widget.input.a iIN;
  private boolean iIO;
  l iIP;
  private m iIQ;
  private com.tencent.mm.plugin.appbrand.b.e iIR;
  private Intent iIS;
  private boolean iIT;
  private boolean iIU;
  private boolean iIV;
  private Configuration iIW;
  public boolean iIX;
  private Boolean iIY;

  public AppBrandUI()
  {
    AppMethodBeat.i(133126);
    this.iIN = new com.tencent.mm.plugin.appbrand.widget.input.a(this);
    this.iIO = false;
    this.iIS = null;
    this.iIT = false;
    this.iIU = false;
    this.iIV = false;
    this.iIW = null;
    this.iIX = false;
    this.gOD = new AppBrandUI.5(this);
    AppMethodBeat.o(133126);
  }

  private static Pair<AppBrandInitConfigWC, AppBrandStatObject> K(Intent paramIntent)
  {
    AppMethodBeat.i(138698);
    Object localObject = paramIntent.getExtras();
    if (localObject == null)
    {
      paramIntent = new NullPointerException("intent.getExtras() returns NULL");
      AppMethodBeat.o(138698);
      throw paramIntent;
    }
    ((Bundle)localObject).setClassLoader(AppBrandInitConfigWC.class.getClassLoader());
    paramIntent = (AppBrandInitConfigWC)((Bundle)localObject).getParcelable("key_appbrand_init_config");
    ((Bundle)localObject).setClassLoader(AppBrandStatObject.class.getClassLoader());
    localObject = (AppBrandStatObject)((Bundle)localObject).getParcelable("key_appbrand_stat_object");
    if (paramIntent == null)
    {
      paramIntent = new NullPointerException("config is NULL");
      AppMethodBeat.o(138698);
      throw paramIntent;
    }
    if (localObject == null)
    {
      paramIntent = new NullPointerException("stat is NULL");
      AppMethodBeat.o(138698);
      throw paramIntent;
    }
    paramIntent = Pair.create(paramIntent, localObject);
    AppMethodBeat.o(138698);
    return paramIntent;
  }

  private void aMs()
  {
    AppMethodBeat.i(133128);
    int i;
    if (this.iIP == null)
    {
      i = -1;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "%s.closeIfNoActiveRuntimes %d,", new Object[] { getLocalClassName(), Integer.valueOf(i) });
      if (!(this.iIP instanceof l))
        break label79;
      ((l)this.iIP).atC();
      AppMethodBeat.o(133128);
    }
    while (true)
    {
      return;
      i = this.iIP.atw();
      break;
      label79: if (i <= 0)
        finish();
      AppMethodBeat.o(133128);
    }
  }

  // ERROR //
  protected void J(Intent paramIntent)
  {
    // Byte code:
    //   0: ldc 196
    //   2: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: invokestatic 198	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:K	(Landroid/content/Intent;)Landroid/util/Pair;
    //   9: astore_2
    //   10: aload_2
    //   11: getfield 202	android/util/Pair:first	Ljava/lang/Object;
    //   14: checkcast 98	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC
    //   17: astore_3
    //   18: aload_2
    //   19: getfield 205	android/util/Pair:second	Ljava/lang/Object;
    //   22: checkcast 118	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject
    //   25: astore_2
    //   26: aload_3
    //   27: ifnull +14 -> 41
    //   30: aload_2
    //   31: ifnull +10 -> 41
    //   34: aload_3
    //   35: getfield 209	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:hgF	Lcom/tencent/mm/plugin/appbrand/config/AppBrandLaunchReferrer;
    //   38: ifnonnull +53 -> 91
    //   41: aload_0
    //   42: getfield 138	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:iIP	Lcom/tencent/mm/plugin/appbrand/l;
    //   45: ifnull +13 -> 58
    //   48: aload_0
    //   49: getfield 138	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:iIP	Lcom/tencent/mm/plugin/appbrand/l;
    //   52: invokevirtual 213	com/tencent/mm/plugin/appbrand/l:atv	()Lcom/tencent/mm/plugin/appbrand/i;
    //   55: ifnonnull +7 -> 62
    //   58: aload_0
    //   59: invokevirtual 174	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:finish	()V
    //   62: ldc 196
    //   64: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   67: return
    //   68: astore_2
    //   69: aconst_null
    //   70: astore_3
    //   71: ldc 140
    //   73: ldc 215
    //   75: iconst_1
    //   76: anewarray 144	java/lang/Object
    //   79: dup
    //   80: iconst_0
    //   81: aload_2
    //   82: aastore
    //   83: invokestatic 218	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   86: aconst_null
    //   87: astore_2
    //   88: goto -62 -> 26
    //   91: aload_1
    //   92: invokevirtual 221	android/content/Intent:getFlags	()I
    //   95: ldc 222
    //   97: iand
    //   98: ifle +89 -> 187
    //   101: aload_3
    //   102: invokestatic 228	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   105: putfield 231	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:startTime	J
    //   108: aload_3
    //   109: iconst_1
    //   110: putfield 235	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:hgP	I
    //   113: aload_0
    //   114: getfield 61	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:iIT	Z
    //   117: ifeq +14 -> 131
    //   120: aload_0
    //   121: getfield 63	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:iIU	Z
    //   124: istore 4
    //   126: iload 4
    //   128: ifeq +67 -> 195
    //   131: ldc 140
    //   133: ldc 237
    //   135: iconst_2
    //   136: anewarray 144	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload_3
    //   142: aastore
    //   143: dup
    //   144: iconst_1
    //   145: aload_2
    //   146: aastore
    //   147: invokestatic 159	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: aload_3
    //   151: invokevirtual 240	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:xy	()Z
    //   154: ifeq +7 -> 161
    //   157: iconst_1
    //   158: invokestatic 245	com/tencent/mm/plugin/webview/ui/tools/widget/o:JV	(I)V
    //   161: aload_0
    //   162: getfield 138	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:iIP	Lcom/tencent/mm/plugin/appbrand/l;
    //   165: aconst_null
    //   166: aload_3
    //   167: aload_2
    //   168: invokevirtual 250	com/tencent/luggage/sdk/b/a:a	(Lcom/tencent/mm/plugin/appbrand/i;Lcom/tencent/luggage/sdk/config/AppBrandInitConfigLU;Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;)V
    //   171: aload_0
    //   172: aload_0
    //   173: invokevirtual 254	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:getIntent	()Landroid/content/Intent;
    //   176: invokevirtual 257	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:initActivityOpenAnimation	(Landroid/content/Intent;)V
    //   179: ldc 196
    //   181: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: goto -117 -> 67
    //   187: aload_3
    //   188: iconst_0
    //   189: putfield 235	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:hgP	I
    //   192: goto -79 -> 113
    //   195: aload_3
    //   196: getfield 261	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:hgN	Lcom/tencent/mm/plugin/appbrand/report/quality/QualitySession;
    //   199: ifnull -68 -> 131
    //   202: aload_0
    //   203: iconst_1
    //   204: putfield 63	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:iIU	Z
    //   207: new 263	com/tencent/mm/g/b/a/bt
    //   210: astore_1
    //   211: aload_1
    //   212: invokespecial 264	com/tencent/mm/g/b/a/bt:<init>	()V
    //   215: aload_1
    //   216: aload_3
    //   217: getfield 261	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:hgN	Lcom/tencent/mm/plugin/appbrand/report/quality/QualitySession;
    //   220: getfield 270	com/tencent/mm/plugin/appbrand/report/quality/QualitySession:igT	Ljava/lang/String;
    //   223: invokevirtual 274	com/tencent/mm/g/b/a/bt:gt	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/bt;
    //   226: pop
    //   227: aload_1
    //   228: aload_3
    //   229: getfield 277	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:appId	Ljava/lang/String;
    //   232: invokevirtual 280	com/tencent/mm/g/b/a/bt:gu	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/bt;
    //   235: pop
    //   236: aload_1
    //   237: aload_3
    //   238: getfield 283	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:axy	I
    //   241: i2l
    //   242: putfield 286	com/tencent/mm/g/b/a/bt:ddd	J
    //   245: aload_1
    //   246: aload_3
    //   247: getfield 289	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:gVs	I
    //   250: iconst_1
    //   251: iadd
    //   252: invokestatic 295	com/tencent/mm/g/b/a/bt$a:gU	(I)Lcom/tencent/mm/g/b/a/bt$a;
    //   255: putfield 299	com/tencent/mm/g/b/a/bt:ddS	Lcom/tencent/mm/g/b/a/bt$a;
    //   258: aload_1
    //   259: aload_3
    //   260: getfield 302	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:bQe	I
    //   263: sipush 1000
    //   266: iadd
    //   267: i2l
    //   268: putfield 305	com/tencent/mm/g/b/a/bt:ddz	J
    //   271: aload_1
    //   272: aload_2
    //   273: getfield 308	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject:scene	I
    //   276: i2l
    //   277: putfield 311	com/tencent/mm/g/b/a/bt:cVR	J
    //   280: aload_1
    //   281: aload_3
    //   282: getfield 314	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:hgK	J
    //   285: invokevirtual 318	com/tencent/mm/g/b/a/bt:dF	(J)Lcom/tencent/mm/g/b/a/bt;
    //   288: pop
    //   289: aload_1
    //   290: getstatic 323	com/tencent/mm/kernel/a/a:eKO	J
    //   293: invokevirtual 326	com/tencent/mm/g/b/a/bt:dG	(J)Lcom/tencent/mm/g/b/a/bt;
    //   296: pop
    //   297: aload_1
    //   298: aload_1
    //   299: getfield 329	com/tencent/mm/g/b/a/bt:ddC	J
    //   302: aload_1
    //   303: getfield 332	com/tencent/mm/g/b/a/bt:ddB	J
    //   306: lsub
    //   307: invokevirtual 335	com/tencent/mm/g/b/a/bt:dE	(J)Lcom/tencent/mm/g/b/a/bt;
    //   310: pop
    //   311: aload_1
    //   312: aload_3
    //   313: getfield 235	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:hgP	I
    //   316: i2l
    //   317: putfield 338	com/tencent/mm/g/b/a/bt:ddT	J
    //   320: aload_1
    //   321: invokevirtual 341	com/tencent/mm/g/b/a/bt:ajK	()Z
    //   324: pop
    //   325: new 343	com/tencent/mm/g/b/a/bu
    //   328: astore_1
    //   329: aload_1
    //   330: invokespecial 344	com/tencent/mm/g/b/a/bu:<init>	()V
    //   333: aload_1
    //   334: aload_3
    //   335: getfield 261	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:hgN	Lcom/tencent/mm/plugin/appbrand/report/quality/QualitySession;
    //   338: getfield 270	com/tencent/mm/plugin/appbrand/report/quality/QualitySession:igT	Ljava/lang/String;
    //   341: invokevirtual 348	com/tencent/mm/g/b/a/bu:gv	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/bu;
    //   344: pop
    //   345: aload_1
    //   346: aload_3
    //   347: getfield 277	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:appId	Ljava/lang/String;
    //   350: invokevirtual 351	com/tencent/mm/g/b/a/bu:gw	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/bu;
    //   353: pop
    //   354: aload_1
    //   355: aload_3
    //   356: getfield 283	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:axy	I
    //   359: i2l
    //   360: putfield 352	com/tencent/mm/g/b/a/bu:ddd	J
    //   363: aload_1
    //   364: aload_3
    //   365: getfield 289	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:gVs	I
    //   368: iconst_1
    //   369: iadd
    //   370: invokestatic 358	com/tencent/mm/g/b/a/bu$a:gV	(I)Lcom/tencent/mm/g/b/a/bu$a;
    //   373: putfield 362	com/tencent/mm/g/b/a/bu:ddY	Lcom/tencent/mm/g/b/a/bu$a;
    //   376: aload_1
    //   377: aload_3
    //   378: getfield 302	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:bQe	I
    //   381: sipush 1000
    //   384: iadd
    //   385: i2l
    //   386: putfield 363	com/tencent/mm/g/b/a/bu:ddz	J
    //   389: aload_1
    //   390: aload_2
    //   391: getfield 308	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject:scene	I
    //   394: i2l
    //   395: putfield 364	com/tencent/mm/g/b/a/bu:cVR	J
    //   398: aload_1
    //   399: getstatic 369	com/tencent/mm/plugin/appbrand/a/a:gQJ	J
    //   402: invokevirtual 373	com/tencent/mm/g/b/a/bu:dI	(J)Lcom/tencent/mm/g/b/a/bu;
    //   405: pop
    //   406: aload_1
    //   407: getstatic 376	com/tencent/mm/plugin/appbrand/a/a:gQK	J
    //   410: invokevirtual 379	com/tencent/mm/g/b/a/bu:dJ	(J)Lcom/tencent/mm/g/b/a/bu;
    //   413: pop
    //   414: aload_1
    //   415: aload_1
    //   416: getfield 380	com/tencent/mm/g/b/a/bu:ddC	J
    //   419: aload_1
    //   420: getfield 381	com/tencent/mm/g/b/a/bu:ddB	J
    //   423: lsub
    //   424: invokevirtual 384	com/tencent/mm/g/b/a/bu:dH	(J)Lcom/tencent/mm/g/b/a/bu;
    //   427: pop
    //   428: getstatic 390	com/tencent/mm/plugin/appbrand/ui/AppBrandUI$6:iJa	[I
    //   431: invokestatic 396	com/tencent/xweb/WebView:getCurWebType	()Lcom/tencent/xweb/WebView$d;
    //   434: invokevirtual 401	com/tencent/xweb/WebView$d:ordinal	()I
    //   437: iaload
    //   438: tableswitch	default:+26 -> 464, 1:+162->600, 2:+172->610, 3:+182->620
    //   465: invokevirtual 402	com/tencent/mm/g/b/a/bu:ajK	()Z
    //   468: pop
    //   469: new 404	com/tencent/mm/g/b/a/bq
    //   472: astore_1
    //   473: aload_1
    //   474: invokespecial 405	com/tencent/mm/g/b/a/bq:<init>	()V
    //   477: aload_1
    //   478: aload_3
    //   479: getfield 261	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:hgN	Lcom/tencent/mm/plugin/appbrand/report/quality/QualitySession;
    //   482: getfield 270	com/tencent/mm/plugin/appbrand/report/quality/QualitySession:igT	Ljava/lang/String;
    //   485: invokevirtual 409	com/tencent/mm/g/b/a/bq:gn	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/bq;
    //   488: pop
    //   489: aload_1
    //   490: aload_3
    //   491: getfield 277	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:appId	Ljava/lang/String;
    //   494: invokevirtual 412	com/tencent/mm/g/b/a/bq:go	(Ljava/lang/String;)Lcom/tencent/mm/g/b/a/bq;
    //   497: pop
    //   498: aload_1
    //   499: aload_3
    //   500: getfield 283	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:axy	I
    //   503: i2l
    //   504: putfield 413	com/tencent/mm/g/b/a/bq:ddd	J
    //   507: aload_1
    //   508: aload_3
    //   509: getfield 289	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:gVs	I
    //   512: iconst_1
    //   513: iadd
    //   514: invokestatic 419	com/tencent/mm/g/b/a/bq$a:gR	(I)Lcom/tencent/mm/g/b/a/bq$a;
    //   517: putfield 423	com/tencent/mm/g/b/a/bq:ddy	Lcom/tencent/mm/g/b/a/bq$a;
    //   520: aload_1
    //   521: aload_3
    //   522: getfield 302	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC:bQe	I
    //   525: sipush 1000
    //   528: iadd
    //   529: i2l
    //   530: putfield 424	com/tencent/mm/g/b/a/bq:ddz	J
    //   533: aload_1
    //   534: aload_2
    //   535: getfield 308	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject:scene	I
    //   538: i2l
    //   539: putfield 425	com/tencent/mm/g/b/a/bq:cVR	J
    //   542: aload_1
    //   543: getstatic 323	com/tencent/mm/kernel/a/a:eKO	J
    //   546: invokevirtual 429	com/tencent/mm/g/b/a/bq:dx	(J)Lcom/tencent/mm/g/b/a/bq;
    //   549: pop
    //   550: aload_1
    //   551: getstatic 432	com/tencent/mm/plugin/appbrand/a/a:gQI	J
    //   554: invokevirtual 435	com/tencent/mm/g/b/a/bq:dy	(J)Lcom/tencent/mm/g/b/a/bq;
    //   557: pop
    //   558: aload_1
    //   559: aload_1
    //   560: getfield 436	com/tencent/mm/g/b/a/bq:ddC	J
    //   563: aload_1
    //   564: getfield 437	com/tencent/mm/g/b/a/bq:ddB	J
    //   567: lsub
    //   568: invokevirtual 440	com/tencent/mm/g/b/a/bq:dw	(J)Lcom/tencent/mm/g/b/a/bq;
    //   571: pop
    //   572: aload_1
    //   573: invokevirtual 441	com/tencent/mm/g/b/a/bq:ajK	()Z
    //   576: pop
    //   577: goto -446 -> 131
    //   580: astore_1
    //   581: ldc 140
    //   583: ldc_w 443
    //   586: iconst_1
    //   587: anewarray 144	java/lang/Object
    //   590: dup
    //   591: iconst_0
    //   592: aload_1
    //   593: aastore
    //   594: invokestatic 446	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   597: goto -466 -> 131
    //   600: aload_1
    //   601: ldc2_w 447
    //   604: putfield 451	com/tencent/mm/g/b/a/bu:dbX	J
    //   607: goto -143 -> 464
    //   610: aload_1
    //   611: ldc2_w 452
    //   614: putfield 451	com/tencent/mm/g/b/a/bu:dbX	J
    //   617: goto -153 -> 464
    //   620: aload_1
    //   621: ldc2_w 454
    //   624: putfield 451	com/tencent/mm/g/b/a/bu:dbX	J
    //   627: goto -163 -> 464
    //   630: astore_2
    //   631: goto -560 -> 71
    //
    // Exception table:
    //   from	to	target	type
    //   5	18	68	java/lang/Exception
    //   113	126	580	java/lang/Throwable
    //   195	464	580	java/lang/Throwable
    //   464	577	580	java/lang/Throwable
    //   600	607	580	java/lang/Throwable
    //   610	617	580	java/lang/Throwable
    //   620	627	580	java/lang/Throwable
    //   18	26	630	java/lang/Exception
  }

  public final void aBS()
  {
  }

  public final boolean aLZ()
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(133150);
    if (this.iIY != null)
    {
      bool2 = this.iIY.booleanValue();
      AppMethodBeat.o(133150);
    }
    Boolean localBoolean;
    while (true)
    {
      return bool2;
      Object localObject = ah.getContext().getPackageManager();
      try
      {
        localObject = ((PackageManager)localObject).getActivityInfo(getComponentName(), 128);
        if (localObject == null)
          AppMethodBeat.o(133150);
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandUI", "runInStandaloneTask, resolve info e = %s", new Object[] { localException });
          localBoolean = null;
        }
      }
    }
    if (!ah.getPackageName().equals(localBoolean.taskAffinity));
    for (bool2 = bool1; ; bool2 = false)
    {
      localBoolean = Boolean.valueOf(bool2);
      this.iIY = localBoolean;
      bool2 = localBoolean.booleanValue();
      AppMethodBeat.o(133150);
      break;
    }
  }

  protected final void aMt()
  {
    AppMethodBeat.i(133142);
    super.finish();
    AppMethodBeat.o(133142);
  }

  protected void e(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(133141);
    paramAppBrandInitConfigWC.bQn = paramAppBrandStatObject;
    ((u)com.tencent.luggage.a.e.B(u.class)).a(this, paramAppBrandInitConfigWC);
    AppMethodBeat.o(133141);
  }

  public void finish()
  {
    AppMethodBeat.i(133143);
    if ((isFinishing()) || (this.uiu))
      AppMethodBeat.o(133143);
    while (true)
    {
      return;
      try
      {
        if (Build.VERSION.SDK_INT >= 21)
          super.finishAndRemoveTask();
        while (true)
        {
          initActivityCloseAnimation();
          AppMethodBeat.o(133143);
          break;
          super.finish();
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandUI", "finish e = %s", new Object[] { localException });
        try
        {
          getIntent().removeExtra("android.view.autofill.extra.RESTORE_SESSION_TOKEN");
          super.finishAndRemoveTask();
          AppMethodBeat.o(133143);
        }
        catch (Throwable localThrowable)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandUI", "finish api27 fallback, thr = %s", new Object[] { localThrowable });
          AppMethodBeat.o(133143);
        }
      }
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void initActivityCloseAnimation()
  {
    AppMethodBeat.i(133140);
    ((u)com.tencent.luggage.a.e.B(u.class)).k(this);
    AppMethodBeat.o(133140);
  }

  // ERROR //
  public final void initActivityOpenAnimation(Intent paramIntent)
  {
    // Byte code:
    //   0: ldc_w 561
    //   3: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ifnull +107 -> 114
    //   10: aload_1
    //   11: invokevirtual 564	android/content/Intent:getComponent	()Landroid/content/ComponentName;
    //   14: ifnull +100 -> 114
    //   17: aload_1
    //   18: invokevirtual 564	android/content/Intent:getComponent	()Landroid/content/ComponentName;
    //   21: invokevirtual 569	android/content/ComponentName:getClassName	()Ljava/lang/String;
    //   24: aload_0
    //   25: invokevirtual 148	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:getLocalClassName	()Ljava/lang/String;
    //   28: invokevirtual 573	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   31: ifeq +83 -> 114
    //   34: aload_1
    //   35: ldc 112
    //   37: invokevirtual 576	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   40: checkcast 98	com/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC
    //   43: astore_2
    //   44: aload_1
    //   45: ldc 120
    //   47: invokevirtual 576	android/content/Intent:getParcelableExtra	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   50: checkcast 118	com/tencent/mm/plugin/appbrand/report/AppBrandStatObject
    //   53: astore_3
    //   54: aload_3
    //   55: ifnull +13 -> 68
    //   58: aload_2
    //   59: ifnull +9 -> 68
    //   62: aload_0
    //   63: aload_2
    //   64: aload_3
    //   65: invokevirtual 578	com/tencent/mm/plugin/appbrand/ui/AppBrandUI:e	(Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;)V
    //   68: ldc_w 561
    //   71: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: return
    //   75: astore_2
    //   76: aconst_null
    //   77: astore_2
    //   78: aconst_null
    //   79: astore_3
    //   80: goto -26 -> 54
    //   83: astore_2
    //   84: ldc 140
    //   86: ldc_w 580
    //   89: iconst_1
    //   90: anewarray 144	java/lang/Object
    //   93: dup
    //   94: iconst_0
    //   95: aload_2
    //   96: aastore
    //   97: invokestatic 218	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   100: aload_0
    //   101: aload_1
    //   102: invokespecial 581	com/tencent/mm/ui/MMActivity:initActivityOpenAnimation	(Landroid/content/Intent;)V
    //   105: ldc_w 561
    //   108: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: goto -37 -> 74
    //   114: aload_1
    //   115: ifnull -15 -> 100
    //   118: aload_1
    //   119: invokevirtual 564	android/content/Intent:getComponent	()Landroid/content/ComponentName;
    //   122: ifnull -22 -> 100
    //   125: aload_1
    //   126: invokevirtual 564	android/content/Intent:getComponent	()Landroid/content/ComponentName;
    //   129: invokestatic 586	com/tencent/mm/ui/base/b:d	(Landroid/content/ComponentName;)Ljava/lang/String;
    //   132: invokestatic 589	com/tencent/mm/ui/base/b:aqN	(Ljava/lang/String;)Z
    //   135: ifeq -35 -> 100
    //   138: aload_0
    //   139: invokestatic 593	com/tencent/mm/ui/base/b:hN	(Landroid/content/Context;)V
    //   142: ldc_w 561
    //   145: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: goto -74 -> 74
    //   151: astore_3
    //   152: goto -74 -> 78
    //
    // Exception table:
    //   from	to	target	type
    //   34	44	75	java/lang/Exception
    //   62	68	83	java/lang/Exception
    //   44	54	151	java/lang/Exception
  }

  public boolean initNavigationSwipeBack()
  {
    return false;
  }

  public boolean moveTaskToBack(boolean paramBoolean)
  {
    AppMethodBeat.i(133144);
    try
    {
      paramBoolean = super.moveTaskToBack(paramBoolean);
      initActivityCloseAnimation();
      AppMethodBeat.o(133144);
      return paramBoolean;
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
      {
        finish();
        paramBoolean = true;
        AppMethodBeat.o(133144);
      }
    }
  }

  public final boolean needShowIdcError()
  {
    return false;
  }

  public final boolean noActionBar()
  {
    return true;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(133149);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.luggage.g.e.ax(this).onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == 5)
      h.a(this, paramIntent.getStringExtra("key_jsapi_pay_err_msg"), "", getString(2131296583), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
        }
      });
    AppMethodBeat.o(133149);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(133146);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "onBackPressed %d, mEatOnBackPressed[%b]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.iIV) });
    if (this.iIV)
      AppMethodBeat.o(133146);
    while (true)
    {
      return;
      this.iIP.onBackPressed();
      AppMethodBeat.o(133146);
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(133131);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "onConfigurationChanged newConfig: %s", new Object[] { Integer.valueOf(paramConfiguration.orientation) });
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.smallestScreenWidthDp != this.iIW.smallestScreenWidthDp)
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "onConfigurationChanged by fold or unfold, last.smallestScreenWidthDp[%d], new.smallestScreenWidthDp[%d]", new Object[] { Integer.valueOf(this.iIW.smallestScreenWidthDp), Integer.valueOf(paramConfiguration.smallestScreenWidthDp) });
    while (true)
    {
      try
      {
        localObject = K(getIntent());
        paramConfiguration = (AppBrandInitConfigWC)((Pair)localObject).first;
        localObject = (AppBrandStatObject)((Pair)localObject).second;
        paramConfiguration.hgK = bo.anU();
        paramConfiguration.startTime = bo.anU();
        Intent localIntent = getIntent();
        localIntent.putExtra("key_appbrand_init_config", paramConfiguration);
        localIntent.putExtra("key_appbrand_stat_object", (Parcelable)localObject);
        AppBrandProcessSuicideLogic.auG();
        recreate();
        AppMethodBeat.o(133131);
        return;
      }
      catch (Exception paramConfiguration)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.AppBrandUI", paramConfiguration, "onConfigurationChanged by fold or unfold", new Object[0]);
        finish();
        AppMethodBeat.o(133131);
        continue;
      }
      this.iIW = new Configuration(paramConfiguration);
      Object localObject = this.iIN;
      if (paramConfiguration != null)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandFixInputIssuesActivityHelper", "onActivityConfigurationChanged, orientation %d", new Object[] { Integer.valueOf(paramConfiguration.orientation) });
        ((com.tencent.mm.plugin.appbrand.widget.input.a)localObject).aQi();
      }
      this.iIP.onConfigurationChanged(paramConfiguration);
      localObject = com.tencent.mm.plugin.appbrand.config.a.a.t(this);
      if (((com.tencent.mm.plugin.appbrand.config.a.a)localObject).hiH != null)
      {
        al.d(new b.2(((com.tencent.mm.plugin.appbrand.config.a.a)localObject).hiH));
        ((com.tencent.mm.plugin.appbrand.config.a.a)localObject).hiH = null;
      }
      ((com.tencent.mm.plugin.appbrand.config.a.a)localObject).hiG = paramConfiguration.orientation;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "onConfigurationChanged  " + ((com.tencent.mm.plugin.appbrand.config.a.a)localObject).hiG);
      ((com.tencent.mm.plugin.appbrand.config.a.a)localObject).a(((com.tencent.mm.plugin.appbrand.config.a.a)localObject).G(((com.tencent.mm.plugin.appbrand.config.a.a)localObject).hiG, com.tencent.mm.plugin.appbrand.config.a.a.ayQ()));
      localObject = this.iIP.atv();
      if (localObject != null)
        try
        {
          ((com.tencent.mm.plugin.appbrand.i)localObject).asV().getCurrentPage().onConfigurationChanged(paramConfiguration);
          AppMethodBeat.o(133131);
        }
        catch (NullPointerException paramConfiguration)
        {
        }
      else
        AppMethodBeat.o(133131);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(133127);
    com.tencent.mm.plugin.appbrand.app.b.auF();
    boolean bool;
    if (!com.tencent.mm.plugin.appbrand.app.b.auE())
      bool = true;
    while (true)
    {
      this.iIT = bool;
      try
      {
        super.onCreate(paramBundle);
        if (getIntent() == null)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandUI", "onCreate %d, null intent", new Object[] { Integer.valueOf(hashCode()) });
          finish();
          AppMethodBeat.o(133127);
          return;
          bool = false;
        }
      }
      catch (Throwable paramBundle)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.AppBrandUI", paramBundle, "%s.onCreate", new Object[] { getLocalClassName() });
          finish();
          AppMethodBeat.o(133127);
          continue;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "onCreate %d, intent.flags = %d", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(getIntent().getFlags()) });
          this.iIW = new Configuration(getResources().getConfiguration());
          Object localObject1 = this.iIN;
          Object localObject3 = this.gOD.aLY();
          if ((((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).activity == null) || (((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).activity.getWindow() == null) || (localObject3 == null))
          {
            label197: this.iIP = new l(this.gOD);
            this.iIQ = new AppBrandUI.1(this, this, this.iIP);
            localObject1 = this.iIQ;
            paramBundle = new IntentFilter();
            paramBundle.addAction("android.intent.action.SCREEN_OFF");
          }
          try
          {
            ah.getContext().registerReceiver(((f)localObject1).gWT, paramBundle);
            this.iIR = new AppBrandUI.2(this, this);
            localObject1 = this.iIR;
            paramBundle = new IntentFilter();
            paramBundle.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
          }
          catch (Exception paramBundle)
          {
            try
            {
              ah.getContext().registerReceiver(((com.tencent.mm.plugin.appbrand.b.e)localObject1).receiver, paramBundle);
              ae.hD(this);
              paramBundle = com.tencent.mm.plugin.appbrand.config.a.a.t(this);
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "init");
            }
            catch (Exception paramBundle)
            {
              try
              {
                while (true)
                {
                  paramBundle.mFinished = false;
                  this.iIS = getIntent();
                  AppMethodBeat.o(133127);
                  break;
                  if ((((View)localObject3).getParent() == null) || (!(((View)localObject3).getParent() instanceof ViewGroup)))
                    break label197;
                  ((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).jde = true;
                  paramBundle = (ViewGroup)((View)localObject3).getParent();
                  paramBundle.removeView((View)localObject3);
                  com.tencent.mm.plugin.appbrand.widget.input.n localn = new com.tencent.mm.plugin.appbrand.widget.input.n(((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).activity, (View)localObject3);
                  paramBundle.addView(localn, new ViewGroup.LayoutParams(-1, -1));
                  if (Build.VERSION.SDK_INT < 20)
                  {
                    localObject3 = ((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).activity;
                    if ((c.dqy()) && (((Activity)localObject3).getResources().getConfiguration().orientation != 2))
                    {
                      ((Activity)localObject3).getWindow().setFlags(1024, 1024);
                      ((Activity)localObject3).getWindow().addFlags(2048);
                      paramBundle.setPadding(0, ae.getStatusBarHeight((Context)localObject3), 0, 0);
                    }
                    ((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).a(localn);
                  }
                  if ((!com.tencent.mm.plugin.appbrand.widget.input.a.jdd) || (!com.tencent.mm.plugin.appbrand.widget.input.a.dp(((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1).activity)))
                    break label197;
                  am.a(paramBundle, new com.tencent.mm.plugin.appbrand.widget.input.a.1((com.tencent.mm.plugin.appbrand.widget.input.a)localObject1));
                  break label197;
                  paramBundle = paramBundle;
                  com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.BaseAppBrandUIScreenOffReceiver", "register screen off receiver e = ".concat(String.valueOf(paramBundle)));
                  continue;
                  paramBundle = paramBundle;
                  com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.BaseAppBrandUIHomePressReceiver", "register screen off receiver e = ".concat(String.valueOf(paramBundle)));
                }
              }
              finally
              {
                AppMethodBeat.o(133127);
              }
            }
          }
        }
      }
    }
  }

  public final void onCreateBeforeSetContentView()
  {
    AppMethodBeat.i(133147);
    super.onCreateBeforeSetContentView();
    supportRequestWindowFeature(10);
    supportRequestWindowFeature(1);
    com.tencent.mm.plugin.appbrand.widget.input.a locala = this.iIN;
    if ((locala.activity == null) || (locala.activity.getWindow() == null))
      AppMethodBeat.o(133147);
    while (true)
    {
      return;
      locala.activity.getWindow().setSoftInputMode(16);
      AppMethodBeat.o(133147);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(133145);
    super.onDestroy();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "onDestroy %d", new Object[] { Integer.valueOf(hashCode()) });
    Object localObject1 = this.iIP;
    Object localObject2 = new LinkedList();
    ((LinkedList)localObject2).addAll(((k)localObject1).gOB);
    ((LinkedList)localObject2).addAll(((k)localObject1).gOC.values());
    ((k)localObject1).atx();
    ??? = ((LinkedList)localObject2).iterator();
    while (((Iterator)???).hasNext())
    {
      localObject2 = (com.tencent.mm.plugin.appbrand.i)((Iterator)???).next();
      ((com.tencent.mm.plugin.appbrand.i)localObject2).gNT = false;
      ((k)localObject1).f((com.tencent.mm.plugin.appbrand.i)localObject2);
    }
    com.tencent.luggage.g.d.i("MicroMsg.AppBrandRuntimeContainer", "cleanup");
    if (this.iIR != null)
      localObject1 = this.iIR;
    try
    {
      ah.getContext().unregisterReceiver(((com.tencent.mm.plugin.appbrand.b.e)localObject1).receiver);
      if (this.iIQ != null)
        localObject1 = this.iIQ;
    }
    catch (Exception localException2)
    {
      try
      {
        ah.getContext().unregisterReceiver(((f)localObject1).gWT);
        label160: localObject1 = com.tencent.mm.plugin.appbrand.config.a.a.t(this);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "release");
      }
      catch (Exception localException2)
      {
        try
        {
          if ((((com.tencent.mm.plugin.appbrand.config.a.a)localObject1).hiA == null) && (((com.tencent.mm.plugin.appbrand.config.a.a)localObject1).hiB == null))
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "Every request is executed well");
          while (true)
          {
            return;
            localException1 = localException1;
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.BaseAppBrandUIHomePressReceiver", "unregister screen off receiver e = ".concat(String.valueOf(localException1)));
            break;
            localException2 = localException2;
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.BaseAppBrandUIScreenOffReceiver", "unregister screen off receiver e = ".concat(String.valueOf(localException2)));
            break label160;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandDeviceOrientationHandler", "Still has request not executed current[%s] pending[%s]", new Object[] { localException2.hiA, localException2.hiB });
            localException2.hiA = null;
            localException2.hiB = null;
            localException2.mFinished = true;
            synchronized (com.tencent.mm.plugin.appbrand.config.a.a.hiz)
            {
              int i = com.tencent.mm.plugin.appbrand.config.a.a.hiz.indexOfValue(localException2);
              if (i >= 0)
                com.tencent.mm.plugin.appbrand.config.a.a.hiz.removeAt(i);
            }
          }
        }
        finally
        {
          AppMethodBeat.o(133145);
        }
      }
    }
  }

  public void onEnterAnimationComplete()
  {
    AppMethodBeat.i(133132);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "onEnterAnimationComplete");
    this.iIV = false;
    AppMethodBeat.o(133132);
  }

  public void onNewIntent(Intent paramIntent)
  {
    int i = 1;
    AppMethodBeat.i(133129);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "onNewIntent %s, %d", new Object[] { paramIntent, Integer.valueOf(hashCode()) });
    try
    {
      super.onNewIntent(paramIntent);
      this.iIX = true;
      if ((paramIntent != null) && (paramIntent.getBooleanExtra("key_appbrand_bring_ui_to_front", false)))
      {
        aMs();
        AppMethodBeat.o(133129);
        return;
      }
    }
    catch (Throwable paramIntent)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.AppBrandUI", paramIntent, "%s.onNewIntent", new Object[] { getLocalClassName() });
        aMs();
        AppMethodBeat.o(133129);
        continue;
        if (paramIntent == null)
        {
          AppMethodBeat.o(133129);
        }
        else
        {
          if (paramIntent.getParcelableExtra("key_appbrand_init_config") != null)
          {
            label126: if (i != 0)
              break label187;
            if (this.iIP != null)
              break label167;
          }
          label167: for (paramIntent = null; ; paramIntent = this.iIP.atv())
          {
            if ((paramIntent == null) || (!com.tencent.mm.plugin.appbrand.g.wS(paramIntent.mAppId)))
              break label178;
            AppMethodBeat.o(133129);
            break;
            i = 0;
            break label126;
          }
          label178: AppMethodBeat.o(133129);
          continue;
          label187: this.iIS = paramIntent;
          AppMethodBeat.o(133129);
        }
      }
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(133138);
    super.onPause();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "onPause %d", new Object[] { Integer.valueOf(hashCode()) });
    this.iIV = true;
    Object localObject = this.iIP;
    com.tencent.luggage.g.d.i("MicroMsg.AppBrandRuntimeContainer", "onPause tid = %d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
    ((k)localObject).gNy.runOnUiThread(new k.3((k)localObject));
    localObject = com.tencent.mm.plugin.appbrand.config.a.a.t(this);
    if (((com.tencent.mm.plugin.appbrand.config.a.a)localObject).hiD != null);
    try
    {
      ah.getContext().getContentResolver().unregisterContentObserver(((com.tencent.mm.plugin.appbrand.config.a.a)localObject).hiD);
    }
    catch (Throwable localThrowable1)
    {
      try
      {
        while (true)
        {
          if (this.iIP.atv() != null)
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("AppBrandUI_");
            com.tencent.mm.modelstat.d.b(4, this.iIP.atv().mAppId, hashCode());
          }
          if (p.k(this.iIP.atv()))
          {
            com.tencent.mm.plugin.webview.ui.tools.widget.o.JV(2);
            if (com.tencent.mm.plugin.normsg.a.b.oTO.TO("ce_mg"))
              com.tencent.mm.plugin.normsg.a.b.oTO.TN("ce_mg");
            localObject = com.tencent.mm.plugin.normsg.a.b.oTO.TP("ce_mg");
            if (localObject != null)
              com.tencent.mm.plugin.secinforeport.a.d.qjp.o(540999682, (byte[])localObject);
          }
          AppMethodBeat.o(133138);
          return;
          localThrowable1 = localThrowable1;
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.AppBrandDeviceOrientationHandler", localThrowable1, "unregisterContentObserver", new Object[0]);
        }
      }
      catch (Throwable localThrowable2)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.AppBrandUI", localThrowable2, "[oneliang]AppBrandUI click flow exception.", new Object[0]);
      }
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(133148);
    Object localObject = this.iIP.gOB.iterator();
    while (((Iterator)localObject).hasNext())
      com.tencent.mm.plugin.appbrand.permission.n.a(((com.tencent.mm.plugin.appbrand.i)((Iterator)localObject).next()).mAppId, paramInt, paramArrayOfString, paramArrayOfInt);
    paramArrayOfString = com.tencent.luggage.g.e.ax(this);
    localObject = (e.c)paramArrayOfString.bRD.get(paramInt);
    paramArrayOfString.bRD.delete(paramInt);
    if (localObject != null)
      ((e.d)localObject).l(paramArrayOfInt);
    AppMethodBeat.o(133148);
  }

  public void onResume()
  {
    AppMethodBeat.i(133137);
    super.onResume();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "onResume %d", new Object[] { Integer.valueOf(hashCode()) });
    if (Build.VERSION.SDK_INT < 21);
    try
    {
      localObject1 = this.mController.contentView.getViewTreeObserver();
      localObject2 = new com/tencent/mm/plugin/appbrand/ui/AppBrandUI$3;
      ((AppBrandUI.3)localObject2).<init>(this);
      ((ViewTreeObserver)localObject1).addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)localObject2);
      bool = this.iIO;
      this.iIO = false;
      if (this.iIS != null)
      {
        setIntent(this.iIS);
        J(this.iIS);
        this.iIS = null;
        this.iIP.onResume();
        locala = com.tencent.mm.plugin.appbrand.config.a.a.t(this);
        locala.a(locala.hiE, null);
        localObject1 = ah.getContext().getApplicationContext().getContentResolver();
        localObject2 = Settings.System.getUriFor("accelerometer_rotation");
        locala.hiD = new com.tencent.mm.plugin.appbrand.config.a.a.1(locala, new Handler());
      }
    }
    catch (Exception localThrowable1)
    {
      try
      {
        Object localObject2;
        com.tencent.mm.plugin.appbrand.config.a.a locala;
        ((ContentResolver)localObject1).registerContentObserver((Uri)localObject2, false, locala.hiD);
      }
      catch (Throwable localThrowable1)
      {
        try
        {
          while (true)
          {
            Object localObject1;
            boolean bool;
            if (this.iIP.atv() != null)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("AppBrandUI_");
              com.tencent.mm.modelstat.d.b(3, this.iIP.atv().mAppId, hashCode());
            }
            if (p.k(this.iIP.atv()))
            {
              com.tencent.mm.plugin.webview.ui.tools.widget.o.JV(1);
              localObject1 = this.iIP.atv().mAppId;
              com.tencent.mm.plugin.normsg.a.b.oTO.fu("ce_mg", (String)localObject1);
            }
            AppMethodBeat.o(133137);
            return;
            localException = localException;
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.AppBrandUI", "onResume addOnPreDrawListener failed, invoke onEnterAnimationComplete() directly");
            onEnterAnimationComplete();
            continue;
            if ((aLZ()) && (!bool));
            for (int i = 2; ; i = 0)
            {
              com.tencent.mm.plugin.appbrand.o localo = (com.tencent.mm.plugin.appbrand.o)this.iIP.atv();
              if (localo == null)
                break;
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "onResume, appId = %s, systemRecentsReason = %d", new Object[] { localo.mAppId, Integer.valueOf(i) });
              localo.atI().hgP = i;
              break;
            }
            localThrowable1 = localThrowable1;
            com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.AppBrandDeviceOrientationHandler", localThrowable1, "registerContentObserver [Settings.System.ACCELEROMETER_ROTATION] ", new Object[0]);
          }
        }
        catch (Throwable localThrowable2)
        {
          while (true)
            com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.AppBrandUI", localThrowable2, "[oneliang]AppBrandUI click flow exception.", new Object[0]);
        }
      }
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(133135);
    super.onStart();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "onStart");
    AppMethodBeat.o(133135);
  }

  public void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(133133);
    super.onWindowAttributesChanged(paramLayoutParams);
    com.tencent.mm.plugin.appbrand.widget.input.a locala = this.iIN;
    if (paramLayoutParams == null)
      AppMethodBeat.o(133133);
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandFixInputIssuesActivityHelper", "onActivityWindowAttributesChanged, oldFlags %d, newFlags %d", new Object[] { Integer.valueOf(locala.jdf), Integer.valueOf(paramLayoutParams.flags) });
      if (paramLayoutParams.flags != locala.jdf)
      {
        locala.jdf = paramLayoutParams.flags;
        locala.aQi();
      }
      AppMethodBeat.o(133133);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(133136);
    super.onWindowFocusChanged(paramBoolean);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandUI", "onWindowFocusChanged %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
      this.iIX = false;
    AppMethodBeat.at(this, paramBoolean);
    AppMethodBeat.o(133136);
  }

  public void setTaskDescription(ActivityManager.TaskDescription paramTaskDescription)
  {
    AppMethodBeat.i(133151);
    if (aLZ());
    while (true)
    {
      try
      {
        super.setTaskDescription(paramTaskDescription);
        AppMethodBeat.o(133151);
        return;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.AppBrandUI", localException, "setTaskDescription ", new Object[0]);
        if (paramTaskDescription != null)
          try
          {
            ActivityManager.TaskDescription localTaskDescription = new android/app/ActivityManager$TaskDescription;
            localTaskDescription.<init>(paramTaskDescription.getLabel(), null, paramTaskDescription.getPrimaryColor());
            super.setTaskDescription(localTaskDescription);
            AppMethodBeat.o(133151);
          }
          catch (Exception paramTaskDescription)
          {
          }
      }
      AppMethodBeat.o(133151);
    }
  }

  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    int i = 1;
    AppMethodBeat.i(133134);
    int j;
    if ((paramIntent != null) && ((paramIntent.getFlags() & 0x10000000) > 0))
      j = 1;
    while (true)
    {
      label51: boolean bool1;
      String str;
      if ((paramIntent != null) && (com.tencent.mm.plugin.appbrand.s.e.c(paramIntent.getComponent()).equals(com.tencent.mm.plugin.appbrand.s.e.c(getComponentName()))))
      {
        bool1 = AppBrandProcessProxyUI.B(paramIntent);
        boolean bool2 = AppBrandLaunchProxyUI.D(paramIntent);
        boolean bool3 = AppBrandEmbedUI.I(paramIntent);
        if (this.iIP.atv() != null)
        {
          str = this.iIP.atv().mAppId;
          if ((!bool2) && (!bool3))
            break label157;
          com.tencent.mm.plugin.appbrand.g.a(str, g.d.gNt);
        }
      }
      try
      {
        while (true)
        {
          ((com.tencent.mm.plugin.appbrand.o)this.iIP.atv()).atJ().getReporter().F(paramIntent);
          label131: super.startActivityForResult(paramIntent, paramInt, paramBundle);
          AppMethodBeat.o(133134);
          return;
          j = 0;
          break;
          i = 0;
          break label51;
          label157: if (((j == 0) || (i != 0) || (bool1)) && (g.d.gNo == com.tencent.mm.plugin.appbrand.g.wV(str)))
            com.tencent.mm.plugin.appbrand.g.a(str, g.d.gNs);
        }
      }
      catch (Exception localException)
      {
        break label131;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandUI
 * JD-Core Version:    0.6.2
 */