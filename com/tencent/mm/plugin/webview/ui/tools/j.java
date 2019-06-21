package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.m.d.b;
import com.tencent.mm.plugin.fav.ui.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.stub.b;
import com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.a;
import com.tencent.mm.ui.base.n.b;
import com.tencent.mm.ui.widget.MMNeat7extView;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.neattextview.textview.view.NeatTextView;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class j extends a
{
  int height;
  com.tencent.mm.ui.widget.a.d iHZ;
  protected Map<String, SparseBooleanArray> utA;
  protected Map<String, Integer> utB;
  ae<String, Bitmap> utC;
  HashMap<String, String> utD;
  String utE;
  public String utF;
  HashMap<String, Integer> utG;
  public boolean utH;
  public boolean utI;
  public boolean utJ;
  Set<Integer> utK;
  ArrayList<d.b> utL;
  Boolean utM;
  int width;

  public j(WebViewUI paramWebViewUI)
  {
    super(paramWebViewUI);
    AppMethodBeat.i(7658);
    this.utA = new HashMap();
    this.utB = new HashMap();
    this.utC = new ae(12);
    this.utD = new HashMap();
    this.utE = "";
    this.utG = new HashMap();
    this.utH = true;
    this.utI = false;
    this.utJ = false;
    this.utK = new HashSet();
    this.width = paramWebViewUI.getResources().getDisplayMetrics().widthPixels;
    this.height = paramWebViewUI.getResources().getDisplayMetrics().heightPixels;
    AppMethodBeat.o(7658);
  }

  private void Jo(int paramInt)
  {
    AppMethodBeat.i(7672);
    String str1 = cZv().afN(cZv().uxh);
    if ((TextUtils.isEmpty(cZv().uxh)) || (TextUtils.isEmpty(str1)))
    {
      ab.i("MicroMsg.WebViewMenuHelper", "stev appId is null or empty");
      AppMethodBeat.o(7672);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.WebViewMenuHelper", "stev appId %s", new Object[] { str1 });
      long l = bo.anT();
      ab.d("MicroMsg.WebViewMenuHelper", "stev report(%s), clickTimestamp : %d, appID : %s, url : %s, sessionId : %s, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13377), Long.valueOf(l), str1, cZv().uxh, cZv().cvF, Integer.valueOf(3), Integer.valueOf(paramInt) });
      Object localObject = "";
      try
      {
        String str2 = q.encode(cZv().uxh, "UTF-8");
        localObject = str2;
        int i = cZv().afH(cZv().getIntent().getStringExtra("geta8key_username"));
        str2 = "";
        if ((i == 7) || (i == 56))
          str2 = cZv().getIntent().getStringExtra("geta8key_username");
        h.pYm.e(13377, new Object[] { Long.valueOf(l), str1, localObject, cZv().cvF, Integer.valueOf(3), Integer.valueOf(paramInt), Integer.valueOf(0), str2 });
        AppMethodBeat.o(7672);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.WebViewMenuHelper", localUnsupportedEncodingException, "", new Object[0]);
      }
    }
  }

  protected static boolean a(JsapiPermissionWrapper paramJsapiPermissionWrapper, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(7663);
    if (paramJsapiPermissionWrapper == null)
      AppMethodBeat.o(7663);
    while (true)
    {
      return bool;
      paramInt = paramJsapiPermissionWrapper.Lx(paramInt);
      if ((paramInt == 1) || (paramInt == 10))
      {
        AppMethodBeat.o(7663);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(7663);
      }
    }
  }

  protected static boolean b(JsapiPermissionWrapper paramJsapiPermissionWrapper, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(7664);
    if (paramJsapiPermissionWrapper == null)
      AppMethodBeat.o(7664);
    while (true)
    {
      return bool;
      if (paramJsapiPermissionWrapper.Lx(paramInt) == 10)
      {
        bool = true;
        AppMethodBeat.o(7664);
      }
      else
      {
        AppMethodBeat.o(7664);
      }
    }
  }

  private ArrayList<d.b> cZN()
  {
    AppMethodBeat.i(7669);
    Object localObject = cZv().pzf.getUrl();
    if (cZv().uwc.containsKey(localObject))
    {
      localObject = (ArrayList)cZv().uwc.get(localObject);
      AppMethodBeat.o(7669);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(7669);
    }
  }

  protected final boolean Jn(int paramInt)
  {
    AppMethodBeat.i(7662);
    SparseBooleanArray localSparseBooleanArray = (SparseBooleanArray)this.utA.get(cZv().pzf.getUrl());
    boolean bool;
    if ((localSparseBooleanArray != null) && (localSparseBooleanArray.get(paramInt, false)))
    {
      AppMethodBeat.o(7662);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(7662);
    }
  }

  public final void Kt()
  {
    AppMethodBeat.i(138038);
    if (this.utJ)
      cZM();
    AppMethodBeat.o(138038);
  }

  public final void afE(String paramString)
  {
    AppMethodBeat.i(7661);
    SparseBooleanArray localSparseBooleanArray1 = (SparseBooleanArray)this.utA.get(paramString);
    SparseBooleanArray localSparseBooleanArray2 = localSparseBooleanArray1;
    if (localSparseBooleanArray1 == null)
    {
      localSparseBooleanArray2 = new SparseBooleanArray();
      this.utA.put(paramString, localSparseBooleanArray2);
    }
    if (localSparseBooleanArray2 != null)
      localSparseBooleanArray2.put(34, true);
    AppMethodBeat.o(7661);
  }

  final void afF(String paramString)
  {
    AppMethodBeat.i(7670);
    cZv().uhz.bJ("sendAppMessage", false);
    com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald = cZv().uhz;
    if (!locald.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSendToEnterprise fail, not ready");
      AppMethodBeat.o(7670);
    }
    while (true)
    {
      return;
      Object localObject = new HashMap();
      ((HashMap)localObject).put("scene", "enterprise");
      localObject = i.a.b("menu:share:appmessage", (Map)localObject, locald.uFv, locald.uFw);
      locald.uFo.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + (String)localObject + ")", null);
      try
      {
        locald.icy.L("connector_local_send", paramString, locald.uqj);
        locald.icy.L("scene", "enterprise", locald.uqj);
        AppMethodBeat.o(7670);
      }
      catch (Exception paramString)
      {
        ab.w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + paramString.getMessage());
        AppMethodBeat.o(7670);
      }
    }
  }

  // ERROR //
  protected final void afG(String paramString)
  {
    // Byte code:
    //   0: sipush 7671
    //   3: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 183	com/tencent/mm/plugin/webview/ui/tools/a:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   10: invokevirtual 187	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:getIntent	()Landroid/content/Intent;
    //   13: ldc 189
    //   15: invokevirtual 194	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   18: astore_2
    //   19: aload_0
    //   20: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   23: invokevirtual 226	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:dae	()Ljava/lang/String;
    //   26: astore_3
    //   27: aconst_null
    //   28: astore 4
    //   30: aload_3
    //   31: invokestatic 408	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   34: ifne +12 -> 46
    //   37: aload_3
    //   38: invokestatic 609	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   41: invokevirtual 612	android/net/Uri:getHost	()Ljava/lang/String;
    //   44: astore 4
    //   46: aload 4
    //   48: invokestatic 408	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   51: ifne +490 -> 541
    //   54: aload 4
    //   56: ldc_w 614
    //   59: invokevirtual 617	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   62: ifeq +479 -> 541
    //   65: ldc_w 619
    //   68: iconst_1
    //   69: anewarray 146	java/lang/Object
    //   72: dup
    //   73: iconst_0
    //   74: aload_3
    //   75: ldc_w 621
    //   78: invokestatic 182	com/tencent/mm/compatible/util/q:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   81: aastore
    //   82: invokestatic 625	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   85: astore 4
    //   87: aload_0
    //   88: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   91: aload_0
    //   92: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   95: getfield 222	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:pzf	Lcom/tencent/mm/ui/widget/MMWebView;
    //   98: invokevirtual 411	com/tencent/mm/ui/widget/MMWebView:getUrl	()Ljava/lang/String;
    //   101: invokevirtual 127	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:afN	(Ljava/lang/String;)Ljava/lang/String;
    //   104: astore 5
    //   106: aload_0
    //   107: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   110: getfield 429	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:icz	Lcom/tencent/mm/plugin/webview/ui/tools/k;
    //   113: invokevirtual 631	com/tencent/mm/plugin/webview/ui/tools/k:cZT	()Lcom/tencent/mm/protocal/GeneralControlWrapper;
    //   116: invokevirtual 636	com/tencent/mm/protocal/GeneralControlWrapper:dmm	()Z
    //   119: istore 6
    //   121: ldc 135
    //   123: ldc_w 638
    //   126: iconst_1
    //   127: anewarray 146	java/lang/Object
    //   130: dup
    //   131: iconst_0
    //   132: iload 6
    //   134: invokestatic 643	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   137: aastore
    //   138: invokestatic 174	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   141: aload 5
    //   143: invokestatic 133	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   146: ifne +183 -> 329
    //   149: iload 6
    //   151: ifeq +178 -> 329
    //   154: aload_0
    //   155: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   158: getfield 222	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:pzf	Lcom/tencent/mm/ui/widget/MMWebView;
    //   161: invokevirtual 411	com/tencent/mm/ui/widget/MMWebView:getUrl	()Ljava/lang/String;
    //   164: invokestatic 133	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   167: ifne +162 -> 329
    //   170: invokestatic 155	com/tencent/mm/sdk/platformtools/bo:anT	()J
    //   173: lstore 7
    //   175: ldc 135
    //   177: ldc_w 645
    //   180: bipush 7
    //   182: anewarray 146	java/lang/Object
    //   185: dup
    //   186: iconst_0
    //   187: sipush 13377
    //   190: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   193: aastore
    //   194: dup
    //   195: iconst_1
    //   196: lload 7
    //   198: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   201: aastore
    //   202: dup
    //   203: iconst_2
    //   204: aload 5
    //   206: aastore
    //   207: dup
    //   208: iconst_3
    //   209: aload_0
    //   210: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   213: getfield 222	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:pzf	Lcom/tencent/mm/ui/widget/MMWebView;
    //   216: invokevirtual 411	com/tencent/mm/ui/widget/MMWebView:getUrl	()Ljava/lang/String;
    //   219: aastore
    //   220: dup
    //   221: iconst_4
    //   222: aload_0
    //   223: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   226: getfield 171	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:cvF	Ljava/lang/String;
    //   229: aastore
    //   230: dup
    //   231: iconst_5
    //   232: iconst_4
    //   233: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   236: aastore
    //   237: dup
    //   238: bipush 6
    //   240: iconst_1
    //   241: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   244: aastore
    //   245: invokestatic 174	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   248: ldc 70
    //   250: astore 9
    //   252: aload_0
    //   253: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   256: getfield 222	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:pzf	Lcom/tencent/mm/ui/widget/MMWebView;
    //   259: invokevirtual 411	com/tencent/mm/ui/widget/MMWebView:getUrl	()Ljava/lang/String;
    //   262: ldc 176
    //   264: invokestatic 182	com/tencent/mm/compatible/util/q:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   267: astore 10
    //   269: aload 10
    //   271: astore 9
    //   273: getstatic 204	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   276: sipush 13377
    //   279: bipush 6
    //   281: anewarray 146	java/lang/Object
    //   284: dup
    //   285: iconst_0
    //   286: lload 7
    //   288: invokestatic 168	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   291: aastore
    //   292: dup
    //   293: iconst_1
    //   294: aload 5
    //   296: aastore
    //   297: dup
    //   298: iconst_2
    //   299: aload 9
    //   301: aastore
    //   302: dup
    //   303: iconst_3
    //   304: aload_0
    //   305: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   308: getfield 171	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:cvF	Ljava/lang/String;
    //   311: aastore
    //   312: dup
    //   313: iconst_4
    //   314: iconst_4
    //   315: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   318: aastore
    //   319: dup
    //   320: iconst_5
    //   321: iconst_1
    //   322: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   325: aastore
    //   326: invokevirtual 208	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   329: aload 4
    //   331: astore 9
    //   333: aload 4
    //   335: invokestatic 408	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   338: ifeq +23 -> 361
    //   341: ldc_w 647
    //   344: iconst_1
    //   345: anewarray 146	java/lang/Object
    //   348: dup
    //   349: iconst_0
    //   350: bipush 34
    //   352: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   355: aastore
    //   356: invokestatic 625	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   359: astore 9
    //   361: new 191	android/content/Intent
    //   364: dup
    //   365: invokespecial 648	android/content/Intent:<init>	()V
    //   368: astore 4
    //   370: aload_1
    //   371: invokestatic 408	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   374: ifne +23 -> 397
    //   377: aload 4
    //   379: ldc_w 650
    //   382: aload_1
    //   383: ldc 176
    //   385: invokevirtual 654	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   388: bipush 11
    //   390: invokestatic 660	android/util/Base64:encodeToString	([BI)Ljava/lang/String;
    //   393: invokevirtual 664	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   396: pop
    //   397: aload 4
    //   399: ldc_w 666
    //   402: aload 9
    //   404: invokevirtual 664	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   407: pop
    //   408: aload 4
    //   410: ldc_w 668
    //   413: aload_3
    //   414: invokevirtual 664	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   417: pop
    //   418: aload 4
    //   420: ldc_w 668
    //   423: aload_0
    //   424: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   427: invokevirtual 671	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:cWL	()Ljava/lang/String;
    //   430: invokevirtual 664	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   433: pop
    //   434: aload 4
    //   436: ldc_w 673
    //   439: aload_0
    //   440: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   443: aload_2
    //   444: invokevirtual 198	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:afH	(Ljava/lang/String;)I
    //   447: invokevirtual 676	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   450: pop
    //   451: aload 4
    //   453: ldc_w 678
    //   456: iconst_0
    //   457: invokevirtual 681	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   460: pop
    //   461: aload_0
    //   462: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   465: aload_0
    //   466: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   469: ldc_w 682
    //   472: invokevirtual 683	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:getString	(I)Ljava/lang/String;
    //   475: ldc 70
    //   477: aload_0
    //   478: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   481: ldc_w 684
    //   484: invokevirtual 683	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:getString	(I)Ljava/lang/String;
    //   487: aload_0
    //   488: invokevirtual 120	com/tencent/mm/plugin/webview/ui/tools/j:cZv	()Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI;
    //   491: ldc_w 685
    //   494: invokevirtual 683	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:getString	(I)Ljava/lang/String;
    //   497: iconst_0
    //   498: new 687	com/tencent/mm/plugin/webview/ui/tools/j$5
    //   501: dup
    //   502: aload_0
    //   503: aload 4
    //   505: invokespecial 690	com/tencent/mm/plugin/webview/ui/tools/j$5:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/j;Landroid/content/Intent;)V
    //   508: new 692	com/tencent/mm/plugin/webview/ui/tools/j$6
    //   511: dup
    //   512: aload_0
    //   513: aload 4
    //   515: invokespecial 693	com/tencent/mm/plugin/webview/ui/tools/j$6:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/j;Landroid/content/Intent;)V
    //   518: invokestatic 696	com/tencent/mm/ui/base/h:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)Lcom/tencent/mm/ui/widget/a/c;
    //   521: pop
    //   522: sipush 7671
    //   525: invokestatic 112	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   528: return
    //   529: astore 4
    //   531: ldc 135
    //   533: aload 4
    //   535: invokevirtual 697	java/io/UnsupportedEncodingException:getMessage	()Ljava/lang/String;
    //   538: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   541: aconst_null
    //   542: astore 4
    //   544: goto -457 -> 87
    //   547: astore 10
    //   549: ldc 135
    //   551: aload 10
    //   553: ldc 70
    //   555: iconst_0
    //   556: anewarray 146	java/lang/Object
    //   559: invokestatic 212	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   562: goto -289 -> 273
    //   565: astore_1
    //   566: ldc 135
    //   568: new 379	java/lang/StringBuilder
    //   571: dup
    //   572: ldc_w 699
    //   575: invokespecial 383	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   578: aload_1
    //   579: invokevirtual 697	java/io/UnsupportedEncodingException:getMessage	()Ljava/lang/String;
    //   582: invokevirtual 387	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   585: invokevirtual 392	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   588: invokestatic 433	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   591: goto -194 -> 397
    //
    // Exception table:
    //   from	to	target	type
    //   65	87	529	java/io/UnsupportedEncodingException
    //   252	269	547	java/io/UnsupportedEncodingException
    //   377	397	565	java/io/UnsupportedEncodingException
  }

  public final void cZI()
  {
    AppMethodBeat.i(7660);
    this.utB.clear();
    this.utB.put("menuItem:share:brand", Integer.valueOf(0));
    this.utB.put("menuItem:share:appMessage", Integer.valueOf(1));
    this.utB.put("menuItem:share:dataMessage", Integer.valueOf(23));
    this.utB.put("menuItem:share:timeline", Integer.valueOf(2));
    this.utB.put("menuItem:favorite", Integer.valueOf(3));
    this.utB.put("menuItem:profile", Integer.valueOf(5));
    this.utB.put("menuItem:addContact", Integer.valueOf(5));
    this.utB.put("menuItem:copyUrl", Integer.valueOf(6));
    this.utB.put("menuItem:openWithSafari", Integer.valueOf(7));
    this.utB.put("menuItem:share:email", Integer.valueOf(8));
    this.utB.put("menuItem:delete", Integer.valueOf(9));
    this.utB.put("menuItem:exposeArticle", Integer.valueOf(10));
    this.utB.put("menuItem:setFont", Integer.valueOf(11));
    this.utB.put("menuItem:editTag", Integer.valueOf(12));
    this.utB.put("menuItem:readMode", Integer.valueOf(14));
    this.utB.put("menuItem:originPage", Integer.valueOf(14));
    this.utB.put("menuItem:share:qq", Integer.valueOf(20));
    this.utB.put("menuItem:share:weiboApp", Integer.valueOf(21));
    this.utB.put("menuItem:share:QZone", Integer.valueOf(22));
    this.utB.put("menuItem:share:Facebook", Integer.valueOf(33));
    this.utB.put("menuItem:share:enterprise", Integer.valueOf(24));
    this.utB.put("menuItem:refresh", Integer.valueOf(28));
    this.utB.put("menuItem:share:wework", Integer.valueOf(25));
    this.utB.put("menuItem:share:weread", Integer.valueOf(26));
    this.utB.put("menuItem:addShortcut", Integer.valueOf(29));
    this.utB.put("menuItem:search", Integer.valueOf(31));
    this.utB.put("menuItem:readArticle", Integer.valueOf(34));
    this.utB.put("menuItem:minimize", Integer.valueOf(35));
    this.utB.put("menuItem:cancelMinimize", Integer.valueOf(36));
    this.utB.put("menuItem:translate", Integer.valueOf(37));
    this.utB.put("menuItem:haoKan", Integer.valueOf(38));
    this.utB.put("menuItem:cancelHaoKan", Integer.valueOf(39));
    AppMethodBeat.o(7660);
  }

  protected final void cZJ()
  {
    AppMethodBeat.i(7665);
    if (!this.utI)
      AppMethodBeat.o(7665);
    while (true)
    {
      return;
      this.utH = false;
      cZv().uxb = false;
      this.utI = false;
      if (this.utJ)
        cZM();
      AppMethodBeat.o(7665);
    }
  }

  public final void cZK()
  {
    AppMethodBeat.i(7666);
    if (this.utJ)
      cZM();
    AppMethodBeat.o(7666);
  }

  public final void cZL()
  {
    AppMethodBeat.i(7667);
    this.utH = true;
    this.utK.clear();
    if ((cZv() instanceof GameWebViewUI))
    {
      this.utK.add(Integer.valueOf(11));
      this.utK.add(Integer.valueOf(28));
      AppMethodBeat.o(7667);
    }
    while (true)
    {
      return;
      this.utK.add(Integer.valueOf(7));
      this.utK.add(Integer.valueOf(11));
      this.utK.add(Integer.valueOf(28));
      AppMethodBeat.o(7667);
    }
  }

  protected final void cZM()
  {
    AppMethodBeat.i(7668);
    this.utL = cZN();
    boolean bool;
    label75: String str;
    label171: Object localObject1;
    Object localObject2;
    if ((this.utL != null) && (this.utL.size() > 0))
    {
      bool = true;
      this.utM = Boolean.valueOf(bool);
      if (!this.utJ)
      {
        if (!this.utM.booleanValue())
          break label318;
        this.iHZ = new com.tencent.mm.ui.widget.a.d(cZv(), 1, false);
      }
      this.iHZ.zFT = new n.a()
      {
        public final void a(ImageView paramAnonymousImageView, MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(7642);
          if (j.g(paramAnonymousMenuItem))
          {
            paramAnonymousImageView.setVisibility(8);
            AppMethodBeat.o(7642);
          }
          while (true)
          {
            return;
            paramAnonymousMenuItem = paramAnonymousMenuItem.getTitle();
            if ((j.this.utC.get(paramAnonymousMenuItem) != null) && (!((Bitmap)j.this.utC.get(paramAnonymousMenuItem)).isRecycled()))
            {
              paramAnonymousImageView.setImageBitmap((Bitmap)j.this.utC.get(paramAnonymousMenuItem));
              AppMethodBeat.o(7642);
            }
            else
            {
              ab.w("MicroMsg.WebViewMenuHelper", "on attach icon, load from cache fail");
              try
              {
                Object localObject = j.this.cZv().icy.aff(paramAnonymousMenuItem);
                if (!bo.isNullOrNil((String)localObject))
                {
                  localObject = g.afx((String)localObject);
                  if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
                  {
                    paramAnonymousImageView.setImageBitmap((Bitmap)localObject);
                    j.this.utC.put(paramAnonymousMenuItem, localObject);
                  }
                }
                AppMethodBeat.o(7642);
              }
              catch (Exception paramAnonymousImageView)
              {
                ab.w("MicroMsg.WebViewMenuHelper", "getheadimg, ex = " + paramAnonymousImageView.getMessage());
                AppMethodBeat.o(7642);
              }
            }
          }
        }
      };
      this.iHZ.zFU = new j.9(this);
      this.iHZ.rBm = new j.10(this);
      this.iHZ.zQf = new j.11(this);
      this.iHZ.rBl = new j.12(this);
      if (cZv().pzf == null)
        break label338;
      str = cZv().pzf.getUrl();
      if (bo.isNullOrNil(str))
        break label525;
      localObject1 = Uri.parse(str).getHost();
      localObject2 = cZv().getString(2131305572, new Object[] { localObject1 });
      if (!bo.isNullOrNil(this.utF))
        break label343;
      if (!bo.isNullOrNil((String)localObject1))
        this.iHZ.q((CharSequence)localObject2, 1);
      label233: if (!cZv().uvf)
        break label539;
      this.iHZ.uEO = true;
      this.iHZ.uEP = true;
      label259: if ((cZv().uvj == null) || (!cZv().uvj.isShown()))
        break label558;
      cZv().uvj.hide();
      al.n(new j.14(this), 100L);
      AppMethodBeat.o(7668);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label318: this.iHZ = new com.tencent.mm.ui.widget.a.d(cZv(), 0, true);
      break label75;
      label338: str = null;
      break label171;
      label343: View localView = LayoutInflater.from(cZv()).inflate(2130970229, null);
      TextView localTextView = (TextView)localView.findViewById(2131822938);
      localObject1 = (MMNeat7extView)localView.findViewById(2131824646);
      this.iHZ.F(localView, false);
      localTextView.setText((CharSequence)localObject2);
      localObject2 = com.tencent.mm.pluginsdk.ui.e.j.g(((MMNeat7extView)localObject1).getContext(), bo.nullAsNil(this.utF), (int)((MMNeat7extView)localObject1).getTextSize());
      ((MMNeat7extView)localObject1).ah((CharSequence)localObject2);
      localObject2 = (ClickableSpan[])((SpannableString)localObject2).getSpans(0, ((SpannableString)localObject2).length(), ClickableSpan.class);
      if ((localObject2 == null) || (localObject2.length <= 0))
        break label233;
      ab.i("MicroMsg.WebViewMenuHelper", "terry h5 apply show");
      h.pYm.e(16337, new Object[] { str, Integer.valueOf(1), Integer.valueOf(0) });
      ((MMNeat7extView)localObject1).setOnTouchListener(new j.13(this, (NeatTextView)localObject1, new m(((MMNeat7extView)localObject1).getContext()), str));
      break label233;
      label525: this.iHZ.q(" ", 1);
      break label233;
      label539: this.iHZ.uEO = false;
      this.iHZ.uEP = false;
      break label259;
      label558: cZv().aqX();
      al.n(new j.15(this), 100L);
      AppMethodBeat.o(7668);
    }
  }

  protected final void cZO()
  {
    AppMethodBeat.i(7673);
    Object localObject1 = new Bundle();
    ((Bundle)localObject1).putLong("msg_id", cZv().getIntent().getLongExtra("msg_id", -9223372036854775808L));
    ((Bundle)localObject1).putString("sns_local_id", cZv().getIntent().getStringExtra("sns_local_id"));
    ((Bundle)localObject1).putInt("news_svr_id", cZv().getIntent().getIntExtra("news_svr_id", 0));
    ((Bundle)localObject1).putString("news_svr_tweetid", cZv().getIntent().getStringExtra("news_svr_tweetid"));
    ((Bundle)localObject1).putInt("message_index", cZv().getIntent().getIntExtra("message_index", 0));
    ((Bundle)localObject1).putString("rawUrl", cZv().cOG);
    Object localObject2;
    if ((!bo.isNullOrNil(cZv().cOG)) && (cZv().cOG.endsWith("#rd")))
    {
      localObject2 = cZv().cOG.substring(0, cZv().cOG.length() - 3);
      if ((!bo.isNullOrNil(cZv().uxh)) && (!cZv().uxh.startsWith((String)localObject2)))
      {
        ((Bundle)localObject1).putString("rawUrl", cZv().uxh);
        ((Bundle)localObject1).putLong("msg_id", -9223372036854775808L);
      }
    }
    while (true)
    {
      localObject2 = cZv().getIntent();
      if (localObject2 != null)
      {
        ((Bundle)localObject1).putString("preChatName", ((Intent)localObject2).getStringExtra("preChatName"));
        ((Bundle)localObject1).putInt("preMsgIndex", ((Intent)localObject2).getIntExtra("preMsgIndex", 0));
        ((Bundle)localObject1).putString("prePublishId", ((Intent)localObject2).getStringExtra("prePublishId"));
        ((Bundle)localObject1).putString("preUsername", ((Intent)localObject2).getStringExtra("preUsername"));
      }
      try
      {
        localObject1 = cZv().icy.Z((Bundle)localObject1);
        if (((b)localObject1).cYV())
        {
          cZv().uhz.bJ("sendAppMessage", false);
          localObject1 = cZv().uhz;
          localObject2 = cZP();
          bool = ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).ready;
          if (!bool)
            try
            {
              ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).icy.L("scene", "favorite", ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).uqj);
              ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).h(((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject1).aL((Map)localObject2), "sendAppMessage");
              ab.i("MicroMsg.WebViewMenuHelper", "on favorite simple url");
              AppMethodBeat.o(7673);
              return;
              if ((bo.isNullOrNil(cZv().uxh)) || (cZv().uxh.startsWith(cZv().cOG)))
                continue;
              ((Bundle)localObject1).putString("rawUrl", cZv().uxh);
              ((Bundle)localObject1).putLong("msg_id", -9223372036854775808L);
            }
            catch (Exception localException2)
            {
              while (true)
              {
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>("jsapiBundlePutString, ex = ");
                ab.w("MicroMsg.JsApiHandler", localException2.getMessage());
              }
            }
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          boolean bool;
          ab.e("MicroMsg.WebViewMenuHelper", "edw, favoriteUrl fail, ex = " + localException1.getMessage());
          AppMethodBeat.o(7673);
          continue;
          Object localObject4 = localException1.JL(1);
          Object localObject3;
          if (localObject4 != null)
          {
            bool = ((Bundle)localObject4).getBoolean("WebViewShare_reslut", false);
            if (bool)
              try
              {
                localException1.icy.L("scene", "favorite", localException1.uqj);
                localException1.h((Bundle)localObject4, "sendAppMessage");
              }
              catch (Exception localException4)
              {
                while (true)
                {
                  localObject3 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject3).<init>("jsapiBundlePutString, ex = ");
                  ab.w("MicroMsg.JsApiHandler", localException4.getMessage());
                }
              }
          }
          else
          {
            localObject3 = new java/util/HashMap;
            ((HashMap)localObject3).<init>();
            ((HashMap)localObject3).put("scene", "favorite");
            localObject4 = i.a.b("menu:share:appmessage", (Map)localObject3, localException1.uFv, localException1.uFw);
            localObject3 = localException1.uFo;
            StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
            localStringBuilder2.<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
            ((MMWebView)localObject3).evaluateJavascript((String)localObject4 + ")", null);
            StringBuilder localStringBuilder1;
            try
            {
              localException1.icy.L("scene", "favorite", localException1.uqj);
            }
            catch (Exception localException3)
            {
              localStringBuilder1 = new java/lang/StringBuilder;
              localStringBuilder1.<init>("jsapiBundlePutString, ex = ");
              ab.w("MicroMsg.JsApiHandler", localException3.getMessage());
            }
            continue;
            c.a(localStringBuilder1.getRet(), cZv(), cZv().mUw);
            if (localStringBuilder1.getRet() == 0)
            {
              Jo(1);
              AppMethodBeat.o(7673);
            }
            else
            {
              Jo(2);
              AppMethodBeat.o(7673);
            }
          }
        }
      }
    }
  }

  public final HashMap<String, String> cZP()
  {
    AppMethodBeat.i(7674);
    Object localObject;
    if (!cZv().uxb)
    {
      localObject = null;
      AppMethodBeat.o(7674);
    }
    while (true)
    {
      return localObject;
      Intent localIntent = cZv().getIntent();
      String str1 = localIntent.getStringExtra("share_report_pre_msg_url");
      String str2 = localIntent.getStringExtra("share_report_pre_msg_title");
      String str3 = localIntent.getStringExtra("share_report_pre_msg_icon_url");
      localObject = new HashMap();
      ((HashMap)localObject).put("share_report_pre_msg_url", str1);
      ((HashMap)localObject).put("share_report_pre_msg_title", str2);
      ((HashMap)localObject).put("share_report_pre_msg_desc", localIntent.getStringExtra("share_report_pre_msg_desc"));
      ((HashMap)localObject).put("share_report_pre_msg_icon_url", str3);
      AppMethodBeat.o(7674);
    }
  }

  final boolean cZQ()
  {
    boolean bool1 = false;
    AppMethodBeat.i(7676);
    try
    {
      bool2 = cZv().icy.afj("favorite");
      AppMethodBeat.o(7676);
      return bool2;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WebViewMenuHelper", localException, "", new Object[0]);
        AppMethodBeat.o(7676);
        boolean bool2 = bool1;
      }
    }
  }

  protected final void cZR()
  {
    AppMethodBeat.i(7677);
    String str1 = cZv().afN(cZv().uxf);
    String str2 = cZv().getIntent().getStringExtra("shortcut_user_name");
    if ((bo.isNullOrNil(str1)) || (bo.isNullOrNil(str2)))
    {
      ab.e("MicroMsg.WebViewMenuHelper", "addShortcut, appid or username is null");
      AppMethodBeat.o(7677);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putString("KAppId", str1);
      localBundle.putString("shortcut_user_name", str2);
      localBundle.putInt("webviewui_binder_id", hashCode());
      try
      {
        cZv().icy.g(80, localBundle);
        AppMethodBeat.o(7677);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.WebViewMenuHelper", "addShortcut, e = " + localException.getMessage());
        AppMethodBeat.o(7677);
      }
    }
  }

  final void ec(List<String> paramList)
  {
    AppMethodBeat.i(7675);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(7675);
    while (true)
    {
      return;
      Iterator localIterator = paramList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          if (this.utC.get(str1) != null)
            ab.i("MicroMsg.WebViewMenuHelper", "find %s icon from cache ok", new Object[] { str1 });
          while (true)
          {
            if (!this.utD.containsKey(str1))
              break label205;
            ab.i("MicroMsg.WebViewMenuHelper", "find %s nick from cache ok", new Object[] { str1 });
            break;
            ab.w("MicroMsg.WebViewMenuHelper", "not found %s icon from cache, try to load", new Object[] { str1 });
            try
            {
              paramList = cZv().icy.aff(str1);
              if (!bo.isNullOrNil(paramList))
              {
                paramList = g.afx(paramList);
                if (paramList != null)
                {
                  ab.i("MicroMsg.WebViewMenuHelper", "load ok, and cache it");
                  this.utC.put(str1, paramList);
                }
              }
            }
            catch (Exception paramList)
            {
              ab.w("MicroMsg.WebViewMenuHelper", "getheadimg, ex = " + paramList.getMessage());
            }
          }
          label205: ab.w("MicroMsg.WebViewMenuHelper", "not found %s nick from cache, try to load", new Object[] { str1 });
          paramList = null;
          try
          {
            String str2 = cZv().icy.mJ(str1);
            paramList = str2;
            ab.i("MicroMsg.WebViewMenuHelper", "load nick ok");
            paramList = str2;
            this.utD.put(str1, paramList);
          }
          catch (Exception localException)
          {
            while (true)
              ab.w("MicroMsg.WebViewMenuHelper", "onAttach, ex = " + localException.getMessage());
          }
        }
      AppMethodBeat.o(7675);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(7659);
    Iterator localIterator = this.utA.values().iterator();
    while (localIterator.hasNext())
    {
      SparseBooleanArray localSparseBooleanArray = (SparseBooleanArray)localIterator.next();
      if (localSparseBooleanArray != null)
        localSparseBooleanArray.clear();
    }
    this.utA.clear();
    this.utG.clear();
    AppMethodBeat.o(7659);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.j
 * JD-Core Version:    0.6.2
 */