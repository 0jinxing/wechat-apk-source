package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.DownloadListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.SendAuth.Req;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.plugin.webview.stub.c;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.l;

public class OAuthUI extends WebViewUI
{
  private String appId;
  private boolean ocw = false;
  private boolean urT = true;
  private SendAuth.Req urU;
  private e urV;
  private ap urW;

  private void cZB()
  {
    AppMethodBeat.i(7435);
    aa.g(getSharedPreferences(ah.doA(), 0));
    this.urV = e.a(this, this.appId, this.urU, new OAuthUI.7(this), this.icy);
    AppMethodBeat.o(7435);
  }

  // ERROR //
  private void cZz()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: sipush 7433
    //   5: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc 49
    //   10: new 90	java/lang/StringBuilder
    //   13: dup
    //   14: ldc_w 361
    //   17: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: aload_0
    //   21: getfield 96	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:appId	Ljava/lang/String;
    //   24: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   30: invokestatic 66	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   33: aload_0
    //   34: getfield 29	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:ocw	Z
    //   37: ifeq +18 -> 55
    //   40: ldc 49
    //   42: ldc_w 363
    //   45: invokestatic 126	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: sipush 7433
    //   51: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   54: return
    //   55: aload_0
    //   56: iconst_1
    //   57: putfield 29	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:ocw	Z
    //   60: aload_0
    //   61: getfield 108	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:icy	Lcom/tencent/mm/plugin/webview/stub/d;
    //   64: aload_0
    //   65: getfield 96	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:appId	Ljava/lang/String;
    //   68: invokeinterface 113 2 0
    //   73: astore_2
    //   74: aload_0
    //   75: getfield 108	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:icy	Lcom/tencent/mm/plugin/webview/stub/d;
    //   78: invokeinterface 116 1 0
    //   83: astore_3
    //   84: aload_0
    //   85: getfield 108	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:icy	Lcom/tencent/mm/plugin/webview/stub/d;
    //   88: ldc 117
    //   90: aconst_null
    //   91: invokeinterface 121 3 0
    //   96: astore 4
    //   98: aload_2
    //   99: invokestatic 72	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   102: ifeq +74 -> 176
    //   105: ldc 49
    //   107: new 90	java/lang/StringBuilder
    //   110: dup
    //   111: ldc_w 365
    //   114: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   117: aload_0
    //   118: getfield 96	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:appId	Ljava/lang/String;
    //   121: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   127: invokestatic 126	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   130: sipush 7433
    //   133: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: goto -82 -> 54
    //   139: astore 4
    //   141: aconst_null
    //   142: astore_3
    //   143: aconst_null
    //   144: astore_2
    //   145: ldc 49
    //   147: new 90	java/lang/StringBuilder
    //   150: dup
    //   151: ldc 128
    //   153: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   156: aload 4
    //   158: invokevirtual 131	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   161: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: invokestatic 134	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   170: aload_1
    //   171: astore 4
    //   173: goto -75 -> 98
    //   176: new 148	com/tencent/mm/opensdk/modelmsg/SendAuth$Resp
    //   179: dup
    //   180: invokespecial 149	com/tencent/mm/opensdk/modelmsg/SendAuth$Resp:<init>	()V
    //   183: astore_1
    //   184: aload_1
    //   185: aload_0
    //   186: getfield 151	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:urU	Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;
    //   189: getfield 156	com/tencent/mm/opensdk/modelmsg/SendAuth$Req:transaction	Ljava/lang/String;
    //   192: putfield 157	com/tencent/mm/opensdk/modelmsg/SendAuth$Resp:transaction	Ljava/lang/String;
    //   195: aload_1
    //   196: bipush 254
    //   198: putfield 174	com/tencent/mm/opensdk/modelmsg/SendAuth$Resp:errCode	I
    //   201: aload_1
    //   202: aload_3
    //   203: putfield 160	com/tencent/mm/opensdk/modelmsg/SendAuth$Resp:lang	Ljava/lang/String;
    //   206: aload_1
    //   207: aload 4
    //   209: putfield 163	com/tencent/mm/opensdk/modelmsg/SendAuth$Resp:country	Ljava/lang/String;
    //   212: new 201	android/os/Bundle
    //   215: dup
    //   216: invokespecial 202	android/os/Bundle:<init>	()V
    //   219: astore_3
    //   220: aload_1
    //   221: aload_3
    //   222: invokevirtual 206	com/tencent/mm/opensdk/modelmsg/SendAuth$Resp:toBundle	(Landroid/os/Bundle;)V
    //   225: aload_3
    //   226: invokestatic 211	com/tencent/mm/pluginsdk/model/app/p:at	(Landroid/os/Bundle;)V
    //   229: new 213	com/tencent/mm/opensdk/channel/MMessageActV2$Args
    //   232: dup
    //   233: invokespecial 214	com/tencent/mm/opensdk/channel/MMessageActV2$Args:<init>	()V
    //   236: astore 4
    //   238: aload 4
    //   240: aload_2
    //   241: putfield 217	com/tencent/mm/opensdk/channel/MMessageActV2$Args:targetPkgName	Ljava/lang/String;
    //   244: aload 4
    //   246: aload_3
    //   247: putfield 221	com/tencent/mm/opensdk/channel/MMessageActV2$Args:bundle	Landroid/os/Bundle;
    //   250: aload_0
    //   251: aload 4
    //   253: invokestatic 227	com/tencent/mm/opensdk/channel/MMessageActV2:send	(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;)Z
    //   256: pop
    //   257: sipush 7433
    //   260: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   263: goto -209 -> 54
    //   266: astore 4
    //   268: aconst_null
    //   269: astore_3
    //   270: goto -125 -> 145
    //   273: astore 4
    //   275: goto -130 -> 145
    //
    // Exception table:
    //   from	to	target	type
    //   60	74	139	java/lang/Exception
    //   74	84	266	java/lang/Exception
    //   84	98	273	java/lang/Exception
  }

  protected final void aMh()
  {
    // Byte code:
    //   0: sipush 7429
    //   3: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokespecial 368	com/tencent/mm/plugin/webview/ui/tools/WebViewUI:aMh	()V
    //   10: aload_0
    //   11: getfield 108	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:icy	Lcom/tencent/mm/plugin/webview/stub/d;
    //   14: invokeinterface 372 1 0
    //   19: istore_1
    //   20: iload_1
    //   21: ifne +77 -> 98
    //   24: ldc 49
    //   26: ldc_w 374
    //   29: invokestatic 126	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   32: aload_0
    //   33: ldc_w 375
    //   36: iconst_1
    //   37: invokestatic 381	android/widget/Toast:makeText	(Landroid/content/Context;II)Landroid/widget/Toast;
    //   40: invokevirtual 384	android/widget/Toast:show	()V
    //   43: aload_0
    //   44: new 386	com/tencent/mm/plugin/webview/ui/tools/OAuthUI$1
    //   47: dup
    //   48: aload_0
    //   49: invokespecial 387	com/tencent/mm/plugin/webview/ui/tools/OAuthUI$1:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;)V
    //   52: invokevirtual 391	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:setBackBtn	(Landroid/view/MenuItem$OnMenuItemClickListener;)V
    //   55: aload_0
    //   56: iconst_0
    //   57: invokevirtual 395	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:enableOptionMenu	(Z)V
    //   60: sipush 7429
    //   63: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   66: return
    //   67: astore_2
    //   68: ldc 49
    //   70: new 90	java/lang/StringBuilder
    //   73: dup
    //   74: ldc_w 397
    //   77: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   80: aload_2
    //   81: invokevirtual 131	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   84: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: invokestatic 134	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   93: iconst_0
    //   94: istore_1
    //   95: goto -75 -> 20
    //   98: aload_0
    //   99: getfield 82	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:pzf	Lcom/tencent/mm/ui/widget/MMWebView;
    //   102: new 6	com/tencent/mm/plugin/webview/ui/tools/OAuthUI$2
    //   105: dup
    //   106: aload_0
    //   107: invokespecial 398	com/tencent/mm/plugin/webview/ui/tools/OAuthUI$2:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;)V
    //   110: invokevirtual 402	com/tencent/mm/ui/widget/MMWebView:setWebChromeClient	(Lcom/tencent/xweb/l;)V
    //   113: aload_0
    //   114: getfield 82	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:pzf	Lcom/tencent/mm/ui/widget/MMWebView;
    //   117: new 8	com/tencent/mm/plugin/webview/ui/tools/OAuthUI$3
    //   120: dup
    //   121: aload_0
    //   122: invokespecial 403	com/tencent/mm/plugin/webview/ui/tools/OAuthUI$3:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;)V
    //   125: invokevirtual 407	com/tencent/mm/ui/widget/MMWebView:setWebViewClient	(Lcom/tencent/xweb/s;)V
    //   128: aload_0
    //   129: getfield 82	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:pzf	Lcom/tencent/mm/ui/widget/MMWebView;
    //   132: new 10	com/tencent/mm/plugin/webview/ui/tools/OAuthUI$4
    //   135: dup
    //   136: aload_0
    //   137: invokespecial 408	com/tencent/mm/plugin/webview/ui/tools/OAuthUI$4:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;)V
    //   140: invokevirtual 412	com/tencent/mm/ui/widget/MMWebView:setDownloadListener	(Landroid/webkit/DownloadListener;)V
    //   143: aload_0
    //   144: getfield 82	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:pzf	Lcom/tencent/mm/ui/widget/MMWebView;
    //   147: invokevirtual 415	com/tencent/mm/ui/widget/MMWebView:dKH	()V
    //   150: aload_0
    //   151: new 417	com/tencent/mm/plugin/webview/ui/tools/OAuthUI$5
    //   154: dup
    //   155: aload_0
    //   156: invokespecial 418	com/tencent/mm/plugin/webview/ui/tools/OAuthUI$5:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;)V
    //   159: invokevirtual 391	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:setBackBtn	(Landroid/view/MenuItem$OnMenuItemClickListener;)V
    //   162: aload_0
    //   163: iconst_1
    //   164: aload_0
    //   165: ldc_w 419
    //   168: invokevirtual 253	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:getString	(I)Ljava/lang/String;
    //   171: new 421	com/tencent/mm/plugin/webview/ui/tools/OAuthUI$6
    //   174: dup
    //   175: aload_0
    //   176: invokespecial 422	com/tencent/mm/plugin/webview/ui/tools/OAuthUI$6:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/OAuthUI;)V
    //   179: invokevirtual 426	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:addTextOptionMenu	(ILjava/lang/String;Landroid/view/MenuItem$OnMenuItemClickListener;)V
    //   182: aload_0
    //   183: invokevirtual 430	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:getIntent	()Landroid/content/Intent;
    //   186: invokevirtual 436	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   189: astore_2
    //   190: aload_2
    //   191: ldc_w 438
    //   194: invokevirtual 440	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   197: astore_3
    //   198: aload_3
    //   199: invokestatic 72	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   202: ifeq +20 -> 222
    //   205: ldc 49
    //   207: ldc_w 442
    //   210: invokestatic 445	com/tencent/mm/sdk/platformtools/ab:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   213: sipush 7429
    //   216: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   219: goto -153 -> 66
    //   222: aload_0
    //   223: aload_3
    //   224: invokestatic 78	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   227: ldc_w 447
    //   230: invokevirtual 168	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   233: putfield 96	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:appId	Ljava/lang/String;
    //   236: ldc 49
    //   238: new 90	java/lang/StringBuilder
    //   241: dup
    //   242: ldc_w 449
    //   245: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   248: aload_0
    //   249: getfield 96	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:appId	Ljava/lang/String;
    //   252: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   258: invokestatic 66	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   261: aload_0
    //   262: getfield 108	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:icy	Lcom/tencent/mm/plugin/webview/stub/d;
    //   265: aload_0
    //   266: getfield 96	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:appId	Ljava/lang/String;
    //   269: invokeinterface 452 2 0
    //   274: aload_0
    //   275: new 153	com/tencent/mm/opensdk/modelmsg/SendAuth$Req
    //   278: dup
    //   279: aload_2
    //   280: invokespecial 454	com/tencent/mm/opensdk/modelmsg/SendAuth$Req:<init>	(Landroid/os/Bundle;)V
    //   283: putfield 151	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:urU	Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Req;
    //   286: aload_0
    //   287: getfield 458	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:uvS	Lcom/tencent/mm/plugin/webview/ui/tools/WebViewUI$m;
    //   290: invokevirtual 463	com/tencent/mm/plugin/webview/ui/tools/WebViewUI$m:daN	()V
    //   293: aload_0
    //   294: invokespecial 335	com/tencent/mm/plugin/webview/ui/tools/OAuthUI:cZB	()V
    //   297: sipush 7429
    //   300: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   303: goto -237 -> 66
    //   306: astore_3
    //   307: ldc 49
    //   309: new 90	java/lang/StringBuilder
    //   312: dup
    //   313: ldc_w 465
    //   316: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   319: aload_3
    //   320: invokevirtual 131	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   323: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   326: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   329: invokestatic 134	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   332: goto -58 -> 274
    //   335: astore_2
    //   336: ldc 49
    //   338: new 90	java/lang/StringBuilder
    //   341: dup
    //   342: ldc_w 467
    //   345: invokespecial 94	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   348: aload_2
    //   349: invokevirtual 131	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   352: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   355: invokevirtual 104	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   358: invokestatic 134	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   361: goto -68 -> 293
    //
    // Exception table:
    //   from	to	target	type
    //   10	20	67	java/lang/Exception
    //   261	274	306	java/lang/Exception
    //   286	293	335	java/lang/Exception
  }

  public final void b(c paramc)
  {
    AppMethodBeat.i(7436);
    e locale;
    int i;
    String str6;
    int m;
    boolean bool;
    if (this.urV != null)
    {
      locale = this.urV;
      if (!locale.urO)
      {
        ab.w("MicroMsg.OAuthSession", "onScenEnd, not listening");
        AppMethodBeat.o(7436);
      }
      int n;
      while (true)
      {
        return;
        i = -1;
        int j = -1;
        String str1 = null;
        String str2 = null;
        String str3 = null;
        int k = -1;
        String str4 = str3;
        String str5 = str2;
        str6 = str1;
        m = j;
        try
        {
          n = paramc.cYW();
          str4 = str3;
          str5 = str2;
          str6 = str1;
          m = j;
          i = n;
          j = paramc.cYX();
          str4 = str3;
          str5 = str2;
          str6 = str1;
          m = j;
          i = n;
          paramc.adx();
          str4 = str3;
          str5 = str2;
          str6 = str1;
          m = j;
          i = n;
          str1 = paramc.getData().getString("geta8key_result_full_url");
          str4 = str3;
          str5 = str2;
          str6 = str1;
          m = j;
          i = n;
          str2 = paramc.getData().getString("geta8key_result_head_img");
          str4 = str3;
          str5 = str2;
          str6 = str1;
          m = j;
          i = n;
          str3 = paramc.getData().getString("geta8key_result_wording");
          str4 = str3;
          str5 = str2;
          str6 = str1;
          m = j;
          i = n;
          int i1 = paramc.getData().getInt("geta8key_result_action_code", -1);
          i = i1;
          m = j;
          str6 = str1;
          str5 = str2;
          str4 = str3;
          j = i;
          ab.i("MicroMsg.OAuthSession", "onSceneEnd, errType = " + n + ", errCode = " + m + " , actionCode=" + j);
          if (locale.mzU != null)
            locale.mzU.dismiss();
          locale.urN = false;
          locale.frk.stopTimer();
          if (((m != 0) || (n != 0)) && (m != -2033))
            break label493;
          if (j == 27)
          {
            locale.urO = false;
            paramc = locale.urP;
            if (m == 0)
            {
              bool = true;
              paramc.d(bool, str6, str5, str4);
              AppMethodBeat.o(7436);
            }
          }
        }
        catch (Exception paramc)
        {
          while (true)
          {
            ab.e("MicroMsg.OAuthSession", "onSceneEnd, ex = " + paramc.getMessage());
            j = k;
            n = i;
            continue;
            bool = false;
          }
          locale.urP.a(locale, str6, false);
          AppMethodBeat.o(7436);
        }
        continue;
        label493: if ((n != 4) || (m != -100))
          break;
        locale.urQ.X(true, true);
        try
        {
          locale.icy.ao(n, m, locale.hashCode());
          AppMethodBeat.o(7436);
        }
        catch (Exception paramc)
        {
          ab.w("MicroMsg.OAuthSession", "accountExpired, ex = " + paramc.getMessage());
          AppMethodBeat.o(7436);
        }
      }
      if ((n != 1) && (n != 2) && (n != 7) && (n != 8))
        break label657;
      ab.e("MicroMsg.OAuthSession", "isNetworkAvailable false, errType = ".concat(String.valueOf(n)));
      i = 0;
      label622: if (i != 0)
        break label686;
      paramc = locale.urP;
      str6 = null;
      bool = true;
    }
    while (true)
    {
      paramc.a(locale, str6, bool);
      AppMethodBeat.o(7436);
      break;
      label657: if (!at.isConnected(locale.urQ))
      {
        ab.e("MicroMsg.OAuthSession", "isNetworkAvailable false, not connected");
        i = 0;
        break label622;
      }
      i = 1;
      break label622;
      label686: paramc = locale.urP;
      if (m == -1)
        bool = true;
      else
        bool = false;
    }
  }

  protected final boolean cZA()
  {
    return true;
  }

  public final int getLayoutId()
  {
    return 2130971216;
  }

  public final void initView()
  {
    AppMethodBeat.i(7434);
    super.initView();
    this.pzf.getSettings().setJavaScriptEnabled(true);
    this.pzf.setVerticalScrollBarEnabled(false);
    AppMethodBeat.o(7434);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7428);
    super.onCreate(paramBundle);
    if (this.ulI != null)
      this.ulI.cXX().cOG = "weixin://mark/oauth";
    AppMethodBeat.o(7428);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(7431);
    try
    {
      this.uvS.daO();
      if (this.urW != null)
        this.urW.stopTimer();
      super.onDestroy();
      AppMethodBeat.o(7431);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.w("MicroMsg.OAuthUI", "AC_REMOVE_SCENE_END, ex = " + localException.getMessage());
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(7432);
    if ((!this.urT) && (paramInt == 4) && (this.pzf.canGoBack()))
    {
      this.pzf.goBack();
      AppMethodBeat.o(7432);
    }
    while (true)
    {
      return bool;
      if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
      {
        cZz();
        finish();
        AppMethodBeat.o(7432);
      }
      else
      {
        bool = super.onKeyDown(paramInt, paramKeyEvent);
        AppMethodBeat.o(7432);
      }
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(7427);
    super.onPause();
    WebView.disablePlatformNotifications();
    AppMethodBeat.o(7427);
  }

  public void onResume()
  {
    AppMethodBeat.i(7426);
    super.onResume();
    WebView.enablePlatformNotifications();
    AppMethodBeat.o(7426);
  }

  public void onStop()
  {
    AppMethodBeat.i(7430);
    this.pzf.stopLoading();
    super.onStop();
    AppMethodBeat.o(7430);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.OAuthUI
 * JD-Core Version:    0.6.2
 */