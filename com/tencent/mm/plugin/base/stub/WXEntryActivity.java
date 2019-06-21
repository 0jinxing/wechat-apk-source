package com.tencent.mm.plugin.base.stub;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXEnterpriseCardObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.s.a.a.a;
import com.tencent.mm.pluginsdk.model.app.ReportUtil;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.protocal.protobuf.ciq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.u.a;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.Map;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class WXEntryActivity extends AutoLoginActivity
  implements com.tencent.mm.ai.f
{
  private String Iw;
  private String appId;
  private String authority;
  private String content;
  private ProgressDialog ehJ;
  private int jDs;
  private Boolean jEb = null;
  private int jEc = 0;
  private String token;
  private Uri uri;

  private void Fw(String paramString)
  {
    AppMethodBeat.i(18208);
    findViewById(2131827254).setVisibility(0);
    setMMTitle(2131303499);
    TextView localTextView = (TextView)findViewById(2131827255);
    if (!ah.isNullOrNil(paramString))
    {
      str = paramString;
      if (paramString.startsWith("autoauth_errmsg_"))
        str = paramString.substring(16);
      paramString = str;
      if (str.startsWith("<e>"))
      {
        Map localMap = br.z(str, "e");
        paramString = str;
        if (localMap != null)
        {
          paramString = str;
          if (!ah.isNullOrNil((String)localMap.get(".e.Content")))
            paramString = (String)localMap.get(".e.Content");
        }
      }
      localTextView.setText(getString(2131303500, new Object[] { paramString }));
    }
    paramString = (Button)findViewById(2131827256);
    String str = com.tencent.mm.pluginsdk.model.app.g.t(this, this.appId);
    ab.i("MicroMsg.WXEntryActivity", "appName = %s", new Object[] { str });
    if (!ah.isNullOrNil(str))
      paramString.setText(getString(2131303497) + str);
    while (true)
    {
      paramString.setOnClickListener(new WXEntryActivity.3(this));
      AppMethodBeat.o(18208);
      return;
      paramString.setText(2131303497);
    }
  }

  private boolean P(Intent paramIntent)
  {
    boolean bool = true;
    AppMethodBeat.i(18199);
    this.jDs = w.a(paramIntent, "_mmessage_sdkVersion", 0);
    this.content = w.n(paramIntent, "_mmessage_content");
    if (this.content != null)
    {
      this.uri = Uri.parse(this.content);
      this.authority = this.uri.getAuthority();
    }
    while (true)
    {
      try
      {
        this.appId = this.uri.getQueryParameter("appid");
        this.Iw = w.n(paramIntent, "_mmessage_appPackage");
        this.token = w.n(paramIntent, "_message_token");
        AppMethodBeat.o(18199);
        return bool;
      }
      catch (Exception paramIntent)
      {
        ab.e("MicroMsg.WXEntryActivity", "init: %s", new Object[] { paramIntent.toString() });
        AppMethodBeat.o(18199);
        bool = false;
        continue;
      }
      AppMethodBeat.o(18199);
      bool = false;
    }
  }

  private boolean aVn()
  {
    boolean bool = false;
    AppMethodBeat.i(18204);
    if (this.jEb != null)
    {
      bool = this.jEb.booleanValue();
      AppMethodBeat.o(18204);
    }
    while (true)
    {
      return bool;
      if (ah.isNullOrNil(this.token))
      {
        ab.i("MicroMsg.WXEntryActivity", "token is null");
        this.jEb = Boolean.FALSE;
        this.jEc = 1;
        AppMethodBeat.o(18204);
      }
      else
      {
        Object localObject = v.Zp().nV(this.token);
        if (localObject != null)
        {
          localObject = ((v.b)localObject).getString("open_sdk_token_package_name", "");
          if (((String)localObject).equals(this.Iw))
          {
            ab.i("MicroMsg.WXEntryActivity", "token check success");
            this.jEb = Boolean.TRUE;
            AppMethodBeat.o(18204);
            bool = true;
          }
          else
          {
            ab.w("MicroMsg.WXEntryActivity", "token check fail %s/%s", new Object[] { localObject, this.Iw });
            this.jEb = Boolean.FALSE;
            this.jEc = 3;
            AppMethodBeat.o(18204);
          }
        }
        else
        {
          this.jEb = Boolean.FALSE;
          this.jEc = 2;
          ab.i("MicroMsg.WXEntryActivity", "keyValueSet is null");
          AppMethodBeat.o(18204);
        }
      }
    }
  }

  private void aVo()
  {
    AppMethodBeat.i(18211);
    ReportUtil.a(this, ReportUtil.c(w.aM(getIntent()), -2));
    finish();
    AppMethodBeat.o(18211);
  }

  private void aVp()
  {
    AppMethodBeat.i(18212);
    ReportUtil.a(this, ReportUtil.c(w.aM(getIntent()), -6), false);
    finish();
    AppMethodBeat.o(18212);
  }

  private static boolean checkSumConsistent(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    boolean bool = false;
    AppMethodBeat.i(18206);
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length == 0) || (paramArrayOfByte2 == null) || (paramArrayOfByte2.length == 0))
    {
      ab.e("MicroMsg.WXEntryActivity", "checkSumConsistent fail, invalid arguments");
      AppMethodBeat.o(18206);
    }
    while (true)
    {
      return bool;
      if (paramArrayOfByte1.length != paramArrayOfByte2.length)
      {
        ab.e("MicroMsg.WXEntryActivity", "checkSumConsistent fail, length is different");
        AppMethodBeat.o(18206);
      }
      else
      {
        for (int i = 0; ; i++)
        {
          if (i >= paramArrayOfByte1.length)
            break label98;
          if (paramArrayOfByte1[i] != paramArrayOfByte2[i])
          {
            AppMethodBeat.o(18206);
            break;
          }
        }
        label98: bool = true;
        AppMethodBeat.o(18206);
      }
    }
  }

  private void goBack()
  {
    AppMethodBeat.i(18210);
    View localView = findViewById(2131827254);
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      aVp();
      AppMethodBeat.o(18210);
    }
    while (true)
    {
      return;
      aVo();
      AppMethodBeat.o(18210);
    }
  }

  // ERROR //
  private boolean i(m paramm)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: sipush 18203
    //   5: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokevirtual 275	com/tencent/mm/plugin/base/stub/WXEntryActivity:getIntent	()Landroid/content/Intent;
    //   12: astore_3
    //   13: aload_0
    //   14: invokevirtual 275	com/tencent/mm/plugin/base/stub/WXEntryActivity:getIntent	()Landroid/content/Intent;
    //   17: invokevirtual 322	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   20: ldc_w 324
    //   23: invokestatic 328	com/tencent/mm/sdk/platformtools/w:k	(Landroid/os/Bundle;Ljava/lang/String;)I
    //   26: istore 4
    //   28: ldc 127
    //   30: ldc_w 330
    //   33: iconst_2
    //   34: anewarray 106	java/lang/Object
    //   37: dup
    //   38: iconst_0
    //   39: iload 4
    //   41: invokestatic 336	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   44: aastore
    //   45: dup
    //   46: iconst_1
    //   47: aload_0
    //   48: getfield 198	com/tencent/mm/plugin/base/stub/WXEntryActivity:authority	Ljava/lang/String;
    //   51: aastore
    //   52: invokestatic 134	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: ldc_w 338
    //   58: aload_0
    //   59: getfield 198	com/tencent/mm/plugin/base/stub/WXEntryActivity:authority	Ljava/lang/String;
    //   62: invokevirtual 258	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   65: ifne +16 -> 81
    //   68: ldc_w 340
    //   71: aload_0
    //   72: getfield 198	com/tencent/mm/plugin/base/stub/WXEntryActivity:authority	Ljava/lang/String;
    //   75: invokevirtual 258	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   78: ifeq +1050 -> 1128
    //   81: invokestatic 345	com/tencent/mm/model/aw:RK	()Z
    //   84: ifne +19 -> 103
    //   87: ldc 127
    //   89: ldc_w 347
    //   92: invokestatic 349	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   95: sipush 18203
    //   98: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   101: iload_2
    //   102: ireturn
    //   103: aload_0
    //   104: getfield 119	com/tencent/mm/plugin/base/stub/WXEntryActivity:appId	Ljava/lang/String;
    //   107: iconst_1
    //   108: invokestatic 353	com/tencent/mm/pluginsdk/model/app/g:bT	(Ljava/lang/String;Z)Lcom/tencent/mm/pluginsdk/model/app/f;
    //   111: astore 5
    //   113: aload 5
    //   115: ifnonnull +20 -> 135
    //   118: ldc 127
    //   120: ldc_w 355
    //   123: invokestatic 349	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   126: sipush 18203
    //   129: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: goto -31 -> 101
    //   135: aload_0
    //   136: aload 5
    //   138: aload_0
    //   139: getfield 208	com/tencent/mm/plugin/base/stub/WXEntryActivity:Iw	Ljava/lang/String;
    //   142: iconst_1
    //   143: invokestatic 360	com/tencent/mm/pluginsdk/model/app/p:a	(Landroid/content/Context;Lcom/tencent/mm/pluginsdk/model/app/f;Ljava/lang/String;Z)Z
    //   146: ifne +329 -> 475
    //   149: ldc 127
    //   151: ldc_w 362
    //   154: iconst_1
    //   155: anewarray 106	java/lang/Object
    //   158: dup
    //   159: iconst_0
    //   160: aload_0
    //   161: getfield 119	com/tencent/mm/plugin/base/stub/WXEntryActivity:appId	Ljava/lang/String;
    //   164: aastore
    //   165: invokestatic 217	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   168: invokestatic 368	com/tencent/mm/pluginsdk/model/app/am:bYI	()Lcom/tencent/mm/pluginsdk/model/app/h;
    //   171: aload_0
    //   172: getfield 119	com/tencent/mm/plugin/base/stub/WXEntryActivity:appId	Ljava/lang/String;
    //   175: invokevirtual 373	com/tencent/mm/pluginsdk/model/app/h:aiH	(Ljava/lang/String;)V
    //   178: aload_0
    //   179: invokespecial 300	com/tencent/mm/plugin/base/stub/WXEntryActivity:aVp	()V
    //   182: aload_0
    //   183: getfield 208	com/tencent/mm/plugin/base/stub/WXEntryActivity:Iw	Ljava/lang/String;
    //   186: astore_3
    //   187: aload_0
    //   188: aload_3
    //   189: invokestatic 377	com/tencent/mm/pluginsdk/model/app/p:bx	(Landroid/content/Context;Ljava/lang/String;)[Landroid/content/pm/Signature;
    //   192: astore 6
    //   194: ldc 249
    //   196: astore 7
    //   198: aload 7
    //   200: astore_1
    //   201: aload 6
    //   203: ifnull +78 -> 281
    //   206: aload 7
    //   208: astore_1
    //   209: aload 6
    //   211: arraylength
    //   212: ifle +69 -> 281
    //   215: aload 6
    //   217: arraylength
    //   218: istore 8
    //   220: iconst_0
    //   221: istore 9
    //   223: aload 7
    //   225: astore_1
    //   226: iload 9
    //   228: iload 8
    //   230: if_icmpge +51 -> 281
    //   233: aload 6
    //   235: iload 9
    //   237: aaload
    //   238: astore_1
    //   239: new 136	java/lang/StringBuilder
    //   242: dup
    //   243: invokespecial 137	java/lang/StringBuilder:<init>	()V
    //   246: aload 7
    //   248: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   251: aload_1
    //   252: invokevirtual 383	android/content/pm/Signature:toByteArray	()[B
    //   255: invokestatic 389	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   258: invokestatic 394	com/tencent/mm/pluginsdk/model/app/q:aiQ	(Ljava/lang/String;)Ljava/lang/String;
    //   261: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: ldc_w 396
    //   267: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   270: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   273: astore 7
    //   275: iinc 9 1
    //   278: goto -55 -> 223
    //   281: aload_1
    //   282: astore 7
    //   284: aload_1
    //   285: invokevirtual 399	java/lang/String:length	()I
    //   288: iconst_1
    //   289: if_icmple +16 -> 305
    //   292: aload_1
    //   293: iconst_0
    //   294: aload_1
    //   295: invokevirtual 399	java/lang/String:length	()I
    //   298: iconst_1
    //   299: isub
    //   300: invokevirtual 402	java/lang/String:substring	(II)Ljava/lang/String;
    //   303: astore 7
    //   305: new 404	org/json/JSONObject
    //   308: dup
    //   309: invokespecial 405	org/json/JSONObject:<init>	()V
    //   312: astore_1
    //   313: aload_1
    //   314: ldc_w 407
    //   317: aload_3
    //   318: ldc 249
    //   320: invokestatic 412	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   323: invokevirtual 416	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   326: pop
    //   327: aload_1
    //   328: ldc_w 418
    //   331: aload 5
    //   333: getfield 423	com/tencent/mm/pluginsdk/model/app/f:field_packageName	Ljava/lang/String;
    //   336: ldc 249
    //   338: invokestatic 412	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   341: invokevirtual 416	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   344: pop
    //   345: aload_1
    //   346: ldc_w 425
    //   349: aload 7
    //   351: invokevirtual 416	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   354: pop
    //   355: aload_1
    //   356: ldc_w 427
    //   359: aload 5
    //   361: getfield 430	com/tencent/mm/pluginsdk/model/app/f:field_signature	Ljava/lang/String;
    //   364: ldc 249
    //   366: invokestatic 412	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   369: invokevirtual 416	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   372: pop
    //   373: aload_1
    //   374: ldc_w 432
    //   377: iload 4
    //   379: invokevirtual 435	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   382: pop
    //   383: new 437	com/tencent/mm/g/a/hc
    //   386: dup
    //   387: invokespecial 438	com/tencent/mm/g/a/hc:<init>	()V
    //   390: astore 7
    //   392: aload 7
    //   394: getfield 442	com/tencent/mm/g/a/hc:cBN	Lcom/tencent/mm/g/a/hc$a;
    //   397: aload 5
    //   399: getfield 445	com/tencent/mm/pluginsdk/model/app/f:field_appId	Ljava/lang/String;
    //   402: putfield 448	com/tencent/mm/g/a/hc$a:appId	Ljava/lang/String;
    //   405: aload 7
    //   407: getfield 442	com/tencent/mm/g/a/hc:cBN	Lcom/tencent/mm/g/a/hc$a;
    //   410: iconst_3
    //   411: putfield 451	com/tencent/mm/g/a/hc$a:opType	I
    //   414: aload 7
    //   416: getfield 442	com/tencent/mm/g/a/hc:cBN	Lcom/tencent/mm/g/a/hc$a;
    //   419: aload_1
    //   420: invokevirtual 452	org/json/JSONObject:toString	()Ljava/lang/String;
    //   423: putfield 455	com/tencent/mm/g/a/hc$a:cvq	Ljava/lang/String;
    //   426: getstatic 461	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   429: aload 7
    //   431: invokevirtual 465	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   434: pop
    //   435: sipush 18203
    //   438: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   441: goto -340 -> 101
    //   444: astore 7
    //   446: ldc 127
    //   448: new 136	java/lang/StringBuilder
    //   451: dup
    //   452: ldc_w 467
    //   455: invokespecial 469	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   458: aload 7
    //   460: invokevirtual 472	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   463: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   466: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   469: invokestatic 232	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   472: goto -89 -> 383
    //   475: new 474	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req
    //   478: dup
    //   479: aload_3
    //   480: invokevirtual 322	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   483: invokespecial 477	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:<init>	(Landroid/os/Bundle;)V
    //   486: astore 6
    //   488: aload_1
    //   489: ifnull +696 -> 1185
    //   492: aload_1
    //   493: checkcast 479	com/tencent/mm/modelsimple/z
    //   496: invokevirtual 483	com/tencent/mm/modelsimple/z:ajE	()Lcom/tencent/mm/protocal/protobuf/ciq;
    //   499: astore 7
    //   501: aload 7
    //   503: ifnull +674 -> 1177
    //   506: aload 7
    //   508: getfield 488	com/tencent/mm/protocal/protobuf/ciq:xhx	Ljava/lang/String;
    //   511: invokestatic 74	com/tencent/mm/platformtools/ah:isNullOrNil	(Ljava/lang/String;)Z
    //   514: ifne +663 -> 1177
    //   517: aload 7
    //   519: getfield 488	com/tencent/mm/protocal/protobuf/ciq:xhx	Ljava/lang/String;
    //   522: invokestatic 191	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   525: astore 7
    //   527: ldc_w 490
    //   530: aload 7
    //   532: ldc_w 492
    //   535: invokevirtual 204	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   538: invokevirtual 258	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   541: istore 10
    //   543: ldc_w 490
    //   546: aload 7
    //   548: ldc_w 494
    //   551: invokevirtual 204	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   554: invokevirtual 258	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   557: istore 11
    //   559: iload 11
    //   561: istore_2
    //   562: iload 10
    //   564: istore 12
    //   566: aload 6
    //   568: getfield 496	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:scene	I
    //   571: iconst_3
    //   572: if_icmpne +26 -> 598
    //   575: aload_3
    //   576: ldc_w 498
    //   579: aload 7
    //   581: ldc_w 500
    //   584: invokevirtual 204	android/net/Uri:getQueryParameter	(Ljava/lang/String;)Ljava/lang/String;
    //   587: invokevirtual 504	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   590: pop
    //   591: iload 10
    //   593: istore 12
    //   595: iload 11
    //   597: istore_2
    //   598: invokestatic 241	com/tencent/mm/model/v:Zp	()Lcom/tencent/mm/model/v;
    //   601: ldc_w 506
    //   604: iconst_1
    //   605: invokevirtual 510	com/tencent/mm/model/v:y	(Ljava/lang/String;Z)Lcom/tencent/mm/model/v$b;
    //   608: astore 7
    //   610: aload 7
    //   612: ldc_w 512
    //   615: aload 5
    //   617: getfield 445	com/tencent/mm/pluginsdk/model/app/f:field_appId	Ljava/lang/String;
    //   620: invokevirtual 516	com/tencent/mm/model/v$b:j	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/model/v$b;
    //   623: pop
    //   624: aload 7
    //   626: ldc_w 518
    //   629: iload 12
    //   631: invokestatic 521	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   634: invokevirtual 516	com/tencent/mm/model/v$b:j	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/model/v$b;
    //   637: pop
    //   638: aload 7
    //   640: ldc_w 523
    //   643: aload 6
    //   645: getfield 527	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:message	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   648: invokevirtual 532	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:getType	()I
    //   651: invokestatic 336	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   654: invokevirtual 516	com/tencent/mm/model/v$b:j	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/model/v$b;
    //   657: pop
    //   658: aload 7
    //   660: ldc_w 534
    //   663: aload 6
    //   665: getfield 496	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:scene	I
    //   668: invokestatic 336	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   671: invokevirtual 516	com/tencent/mm/model/v$b:j	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/model/v$b;
    //   674: pop
    //   675: aload 6
    //   677: getfield 496	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:scene	I
    //   680: iconst_2
    //   681: if_icmpne +203 -> 884
    //   684: new 318	android/content/Intent
    //   687: dup
    //   688: invokespecial 535	android/content/Intent:<init>	()V
    //   691: astore_1
    //   692: aload_1
    //   693: ldc_w 536
    //   696: invokevirtual 540	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   699: ldc_w 541
    //   702: invokevirtual 540	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   705: pop
    //   706: aload_1
    //   707: aload_3
    //   708: invokevirtual 322	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   711: invokevirtual 545	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   714: pop
    //   715: aload 6
    //   717: getfield 527	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:message	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   720: ifnull +108 -> 828
    //   723: aload 6
    //   725: getfield 527	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:message	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   728: invokevirtual 532	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:getType	()I
    //   731: iconst_5
    //   732: if_icmpne +96 -> 828
    //   735: ldc 127
    //   737: ldc_w 547
    //   740: iconst_1
    //   741: anewarray 106	java/lang/Object
    //   744: dup
    //   745: iconst_0
    //   746: aload 5
    //   748: getfield 445	com/tencent/mm/pluginsdk/model/app/f:field_appId	Ljava/lang/String;
    //   751: aastore
    //   752: invokestatic 550	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   755: new 136	java/lang/StringBuilder
    //   758: dup
    //   759: ldc_w 552
    //   762: invokespecial 469	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   765: aload 5
    //   767: getfield 445	com/tencent/mm/pluginsdk/model/app/f:field_appId	Ljava/lang/String;
    //   770: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   773: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   776: invokestatic 555	com/tencent/mm/model/v:nW	(Ljava/lang/String;)Ljava/lang/String;
    //   779: astore 7
    //   781: invokestatic 241	com/tencent/mm/model/v:Zp	()Lcom/tencent/mm/model/v;
    //   784: aload 7
    //   786: iconst_1
    //   787: invokevirtual 510	com/tencent/mm/model/v:y	(Ljava/lang/String;Z)Lcom/tencent/mm/model/v$b;
    //   790: ldc_w 557
    //   793: new 136	java/lang/StringBuilder
    //   796: dup
    //   797: ldc_w 552
    //   800: invokespecial 469	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   803: aload 5
    //   805: getfield 445	com/tencent/mm/pluginsdk/model/app/f:field_appId	Ljava/lang/String;
    //   808: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   811: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   814: invokevirtual 516	com/tencent/mm/model/v$b:j	(Ljava/lang/String;Ljava/lang/Object;)Lcom/tencent/mm/model/v$b;
    //   817: pop
    //   818: aload_1
    //   819: ldc_w 559
    //   822: aload 7
    //   824: invokevirtual 504	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   827: pop
    //   828: aload_0
    //   829: ldc_w 561
    //   832: ldc_w 563
    //   835: aload_1
    //   836: invokestatic 568	com/tencent/mm/bp/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    //   839: sipush 18203
    //   842: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   845: iconst_1
    //   846: istore_2
    //   847: goto -746 -> 101
    //   850: astore 7
    //   852: iconst_0
    //   853: istore_2
    //   854: iconst_0
    //   855: istore 10
    //   857: ldc 127
    //   859: ldc_w 570
    //   862: iconst_1
    //   863: anewarray 106	java/lang/Object
    //   866: dup
    //   867: iconst_0
    //   868: aload 7
    //   870: invokevirtual 472	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   873: aastore
    //   874: invokestatic 217	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   877: iload 10
    //   879: istore 12
    //   881: goto -283 -> 598
    //   884: aload_1
    //   885: ifnull +120 -> 1005
    //   888: aload 6
    //   890: getfield 527	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:message	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   893: ifnull +112 -> 1005
    //   896: aload_1
    //   897: checkcast 479	com/tencent/mm/modelsimple/z
    //   900: invokevirtual 483	com/tencent/mm/modelsimple/z:ajE	()Lcom/tencent/mm/protocal/protobuf/ciq;
    //   903: astore_1
    //   904: aload 6
    //   906: getfield 527	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:message	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   909: invokevirtual 532	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:getType	()I
    //   912: bipush 7
    //   914: if_icmpne +157 -> 1071
    //   917: aload_1
    //   918: ifnull +87 -> 1005
    //   921: aload_1
    //   922: getfield 574	com/tencent/mm/protocal/protobuf/ciq:xhz	Lcom/tencent/mm/protocal/protobuf/bzl;
    //   925: ifnull +80 -> 1005
    //   928: aload_1
    //   929: getfield 574	com/tencent/mm/protocal/protobuf/ciq:xhz	Lcom/tencent/mm/protocal/protobuf/bzl;
    //   932: getfield 579	com/tencent/mm/protocal/protobuf/bzl:url	Ljava/lang/String;
    //   935: invokestatic 74	com/tencent/mm/platformtools/ah:isNullOrNil	(Ljava/lang/String;)Z
    //   938: ifne +67 -> 1005
    //   941: ldc 127
    //   943: ldc_w 581
    //   946: iconst_1
    //   947: anewarray 106	java/lang/Object
    //   950: dup
    //   951: iconst_0
    //   952: aload_1
    //   953: getfield 574	com/tencent/mm/protocal/protobuf/ciq:xhz	Lcom/tencent/mm/protocal/protobuf/bzl;
    //   956: getfield 579	com/tencent/mm/protocal/protobuf/bzl:url	Ljava/lang/String;
    //   959: aastore
    //   960: invokestatic 134	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   963: aload 6
    //   965: getfield 527	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:message	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   968: new 583	com/tencent/mm/opensdk/modelmsg/WXWebpageObject
    //   971: dup
    //   972: aload_1
    //   973: getfield 574	com/tencent/mm/protocal/protobuf/ciq:xhz	Lcom/tencent/mm/protocal/protobuf/bzl;
    //   976: getfield 579	com/tencent/mm/protocal/protobuf/bzl:url	Ljava/lang/String;
    //   979: invokespecial 584	com/tencent/mm/opensdk/modelmsg/WXWebpageObject:<init>	(Ljava/lang/String;)V
    //   982: putfield 588	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:mediaObject	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;
    //   985: new 590	android/os/Bundle
    //   988: dup
    //   989: invokespecial 591	android/os/Bundle:<init>	()V
    //   992: astore_1
    //   993: aload 6
    //   995: aload_1
    //   996: invokevirtual 594	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:toBundle	(Landroid/os/Bundle;)V
    //   999: aload_3
    //   1000: aload_1
    //   1001: invokevirtual 545	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   1004: pop
    //   1005: aload_3
    //   1006: ldc_w 596
    //   1009: aload_0
    //   1010: invokespecial 598	com/tencent/mm/plugin/base/stub/WXEntryActivity:aVn	()Z
    //   1013: invokevirtual 601	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1016: pop
    //   1017: aload_3
    //   1018: ldc_w 603
    //   1021: iload_2
    //   1022: invokevirtual 601	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   1025: pop
    //   1026: aload_0
    //   1027: new 318	android/content/Intent
    //   1030: dup
    //   1031: aload_0
    //   1032: ldc_w 605
    //   1035: invokespecial 608	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   1038: ldc_w 536
    //   1041: invokevirtual 540	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   1044: ldc_w 541
    //   1047: invokevirtual 540	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   1050: aload_3
    //   1051: invokevirtual 322	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   1054: invokevirtual 545	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   1057: invokevirtual 612	com/tencent/mm/plugin/base/stub/WXEntryActivity:startActivity	(Landroid/content/Intent;)V
    //   1060: sipush 18203
    //   1063: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1066: iconst_1
    //   1067: istore_2
    //   1068: goto -967 -> 101
    //   1071: aload 6
    //   1073: getfield 527	com/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req:message	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   1076: invokevirtual 532	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:getType	()I
    //   1079: bipush 38
    //   1081: if_icmpne -76 -> 1005
    //   1084: aload_1
    //   1085: ifnull -80 -> 1005
    //   1088: aload_1
    //   1089: getfield 574	com/tencent/mm/protocal/protobuf/ciq:xhz	Lcom/tencent/mm/protocal/protobuf/bzl;
    //   1092: ifnull -87 -> 1005
    //   1095: aload_3
    //   1096: ldc_w 614
    //   1099: aload_1
    //   1100: getfield 574	com/tencent/mm/protocal/protobuf/ciq:xhz	Lcom/tencent/mm/protocal/protobuf/bzl;
    //   1103: getfield 617	com/tencent/mm/protocal/protobuf/bzl:wYt	I
    //   1106: invokevirtual 620	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1109: pop
    //   1110: aload_3
    //   1111: ldc_w 622
    //   1114: aload_1
    //   1115: getfield 574	com/tencent/mm/protocal/protobuf/ciq:xhz	Lcom/tencent/mm/protocal/protobuf/bzl;
    //   1118: getfield 625	com/tencent/mm/protocal/protobuf/bzl:wYu	I
    //   1121: invokevirtual 620	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   1124: pop
    //   1125: goto -120 -> 1005
    //   1128: ldc 127
    //   1130: new 136	java/lang/StringBuilder
    //   1133: dup
    //   1134: ldc_w 627
    //   1137: invokespecial 469	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1140: aload_0
    //   1141: getfield 198	com/tencent/mm/plugin/base/stub/WXEntryActivity:authority	Ljava/lang/String;
    //   1144: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1147: invokevirtual 148	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1150: invokestatic 306	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1153: sipush 18203
    //   1156: invokestatic 161	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1159: goto -1058 -> 101
    //   1162: astore 7
    //   1164: iconst_0
    //   1165: istore_2
    //   1166: goto -309 -> 857
    //   1169: astore 7
    //   1171: iload 11
    //   1173: istore_2
    //   1174: goto -317 -> 857
    //   1177: iconst_0
    //   1178: istore_2
    //   1179: iconst_0
    //   1180: istore 12
    //   1182: goto -584 -> 598
    //   1185: iconst_0
    //   1186: istore_2
    //   1187: goto -512 -> 675
    //
    // Exception table:
    //   from	to	target	type
    //   313	383	444	java/lang/Exception
    //   517	543	850	java/lang/Exception
    //   543	559	1162	java/lang/Exception
    //   566	591	1169	java/lang/Exception
  }

  private static String kX(String paramString)
  {
    AppMethodBeat.i(18202);
    if (ah.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(18202);
    }
    while (true)
    {
      return paramString;
      try
      {
        String str = URLEncoder.encode(paramString);
        paramString = str;
        AppMethodBeat.o(18202);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.WXEntryActivity", "urlEncode fail, str = %s, ex = %s", new Object[] { paramString, localException.getMessage() });
        AppMethodBeat.o(18202);
      }
    }
  }

  private static byte[] p(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(18205);
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString1 != null)
      localStringBuffer.append(paramString1);
    localStringBuffer.append(paramInt);
    localStringBuffer.append(paramString2);
    localStringBuffer.append("mMcShCsTr");
    paramString1 = com.tencent.mm.a.g.x(localStringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    AppMethodBeat.o(18205);
    return paramString1;
  }

  private static boolean rL(int paramInt)
  {
    if (paramInt >= 553713665);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean O(Intent paramIntent)
  {
    boolean bool = false;
    AppMethodBeat.i(18200);
    if (!P(paramIntent))
    {
      ab.e("MicroMsg.WXEntryActivity", "Init failed");
      finish();
      AppMethodBeat.o(18200);
    }
    while (true)
    {
      return bool;
      if ((!aw.RK()) || (aw.QT()))
      {
        ab.w("MicroMsg.WXEntryActivity", "preLogin not login, save the appid : %s", new Object[] { this.appId });
        com.tencent.mm.pluginsdk.model.app.p.aiP(this.appId);
      }
      if (!rL(this.jDs))
      {
        ab.e("MicroMsg.WXEntryActivity", "sdk version is not supported, sdkVersion = " + this.jDs);
        finish();
        AppMethodBeat.o(18200);
      }
      else if (this.uri == null)
      {
        ab.e("MicroMsg.WXEntryActivity", "check appid failed, null content");
        finish();
        AppMethodBeat.o(18200);
      }
      else
      {
        ab.i("MicroMsg.WXEntryActivity", "preLogin, appId = " + this.appId);
        if (ah.isNullOrNil(this.appId))
        {
          ab.e("MicroMsg.WXEntryActivity", "invalid appid, ignore");
          finish();
          AppMethodBeat.o(18200);
        }
        else
        {
          ab.i("MicroMsg.WXEntryActivity", "preLogin, pkg = " + this.Iw);
          if (ah.isNullOrNil(this.Iw))
          {
            ab.e("MicroMsg.WXEntryActivity", "unknown package, ignore");
            finish();
            AppMethodBeat.o(18200);
          }
          else if (!checkSumConsistent(w.o(paramIntent, "_mmessage_checksum"), p(this.content, this.jDs, this.Iw)))
          {
            ab.e("MicroMsg.WXEntryActivity", "checksum fail");
            finish();
            AppMethodBeat.o(18200);
          }
          else
          {
            AppMethodBeat.o(18200);
            bool = true;
          }
        }
      }
    }
  }

  public final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    AppMethodBeat.i(18201);
    ab.d("MicroMsg.WXEntryActivity", "postLogin, loginResult = ".concat(String.valueOf(parama)));
    P(paramIntent);
    int k;
    label283: label353: WXMediaMessage localWXMediaMessage;
    switch (WXEntryActivity.4.jDI[parama.ordinal()])
    {
    default:
      ab.e("MicroMsg.WXEntryActivity", "postLogin, unknown login result = ".concat(String.valueOf(parama)));
      finish();
      AppMethodBeat.o(18201);
    case 1:
      SharedPreferences localSharedPreferences;
      while (true)
      {
        return;
        if ((getIntent() == null) || (getIntent().getExtras() == null))
        {
          ab.e("MicroMsg.WXEntryActivity", "checkCanShare fail, invalid intent/extras");
          finish();
          AppMethodBeat.o(18201);
        }
        else
        {
          int i = w.k(getIntent().getExtras(), "_wxapi_command_type");
          ab.i("MicroMsg.WXEntryActivity", "checkCanShare, cmd = %d, token = %s", new Object[] { Integer.valueOf(i), this.token });
          parama = com.tencent.mm.plugin.report.service.h.pYm;
          int j = this.jDs;
          if (aVn());
          for (k = 0; ; k = this.jEc)
          {
            parama.e(15587, new Object[] { Integer.valueOf(0), Integer.valueOf(620954368), Integer.valueOf(j), Integer.valueOf(k), this.appId });
            if (aVn())
              break label353;
            if (this.jDs >= 620824064)
              break label283;
            bool = false;
            if (!bool)
              break label353;
            Fw("");
            AppMethodBeat.o(18201);
            break;
          }
          parama = com.tencent.mm.model.c.c.abi().ll("100414");
          if ((parama.isValid()) && ("1".equals(parama.dru().get("blockInNewSDK"))));
          for (boolean bool = true; ; bool = false)
          {
            ab.d("MicroMsg.WXEntryActivity", "blockInvalidToken block %b", new Object[] { Boolean.valueOf(bool) });
            break;
          }
          if (i == 1)
          {
            ab.i("MicroMsg.WXEntryActivity", "it is auth, just dealrequest");
            i(null);
            finish();
            AppMethodBeat.o(18201);
          }
          else
          {
            parama = new SendMessageToWX.Req(getIntent().getExtras());
            localWXMediaMessage = parama.message;
            if (localWXMediaMessage == null)
            {
              ab.e("MicroMsg.WXEntryActivity", "wxmsg is null, how could it be?, directly deal request");
              i(null);
              finish();
              AppMethodBeat.o(18201);
            }
            else
            {
              if ((localWXMediaMessage.getType() != 38) || (localWXMediaMessage.mediaObject == null) || (!(localWXMediaMessage.mediaObject instanceof WXVideoFileObject)))
                break label579;
              paramIntent = (WXVideoFileObject)localWXMediaMessage.mediaObject;
              if (paramIntent.shareScene != 1)
                break label579;
              localSharedPreferences = getSharedPreferences("opensdk_shareTicket", 0);
              String str = localSharedPreferences.getString(this.Iw, "");
              if (bo.isEqual(str, paramIntent.shareTicket))
                break;
              ab.w("MicroMsg.WXEntryActivity", "shareTicket is wrong %s/%s", new Object[] { str, paramIntent.shareTicket });
              aVp();
              AppMethodBeat.o(18201);
            }
          }
        }
      }
      localSharedPreferences.edit().remove(this.Iw).apply();
      label579: if (((localWXMediaMessage.getType() == 36) || (localWXMediaMessage.getType() == 46) || (localWXMediaMessage.getType() == 45)) && (parama.scene != 3))
        parama.scene = 0;
      if (parama.scene == 2)
        k = 3;
      break;
    case 2:
    case 3:
    }
    while (true)
    {
      label633: if (localWXMediaMessage.getType() == 1)
      {
        paramIntent = (WXTextObject)localWXMediaMessage.mediaObject;
        parama = String.format("weixin://dl/business/share/?appid=%s&type=%s&txt=%s&url=%s&msgType=%s&userOpenid=%s", new Object[] { this.appId, Integer.valueOf(k), kX(paramIntent.text), "", localWXMediaMessage.getType(), ah.nullAsNil(parama.userOpenId) });
      }
      while (true)
      {
        paramIntent = parama;
        if (!ah.isNullOrNil(localWXMediaMessage.mediaTagName))
        {
          paramIntent = parama;
          if (!ah.isNullOrNil(parama))
            paramIntent = parama + "&mediaTagName=" + kX(localWXMediaMessage.mediaTagName);
        }
        this.ehJ = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131297086), true, new WXEntryActivity.2(this));
        aw.Rg().a(1200, this);
        parama = new z(paramIntent, 1, new LinkedList());
        aw.Rg().a(parama, 0);
        AppMethodBeat.o(18201);
        break;
        if (parama.scene == 1)
        {
          k = 2;
          break label633;
        }
        if (parama.scene == 0)
        {
          k = 1;
          break label633;
        }
        if (parama.scene != 3)
          break label1375;
        k = 5;
        break label633;
        if (localWXMediaMessage.getType() == 5)
        {
          paramIntent = (WXWebpageObject)localWXMediaMessage.mediaObject;
          parama = String.format("weixin://dl/business/share/?appid=%s&type=%s&txt=%s&url=%s&msgType=%s&userOpenid=%s", new Object[] { this.appId, Integer.valueOf(k), kX(localWXMediaMessage.description), kX(paramIntent.webpageUrl), localWXMediaMessage.getType(), ah.nullAsNil(parama.userOpenId) });
        }
        else if ((localWXMediaMessage.getType() == 36) || (localWXMediaMessage.getType() == 46))
        {
          paramIntent = (WXMiniProgramObject)localWXMediaMessage.mediaObject;
          ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).a(paramIntent.userName, null);
          parama = String.format("weixin://dl/business/share/?appid=%s&type=%s&txt=%s&url=%s&msgType=%s&appbrandusername=%s&appbrandpath=%s&userOpenid=%s", new Object[] { this.appId, Integer.valueOf(k), kX(localWXMediaMessage.description), kX(paramIntent.webpageUrl), localWXMediaMessage.getType(), paramIntent.userName, kX(paramIntent.path), ah.nullAsNil(parama.userOpenId) });
        }
        else if (localWXMediaMessage.getType() == 45)
        {
          paramIntent = (WXEnterpriseCardObject)localWXMediaMessage.mediaObject;
          parama = String.format("weixin://dl/business/share/?appid=%s&type=%s&txt=%s&url=%s&msgType=%s&userOpenid=%s", new Object[] { this.appId, Integer.valueOf(k), kX(paramIntent.cardInfo), "", localWXMediaMessage.getType(), ah.nullAsNil(parama.userOpenId) });
        }
        else
        {
          parama = String.format("weixin://dl/business/share/?appid=%s&type=%s&txt=%s&url=%s&msgType=%s&userOpenid=%s", new Object[] { this.appId, Integer.valueOf(k), kX(localWXMediaMessage.description), "", localWXMediaMessage.getType(), ah.nullAsNil(parama.userOpenId) });
        }
      }
      aVo();
      ab.e("MicroMsg.WXEntryActivity", "postLogin fail, loginResult = ".concat(String.valueOf(parama)));
      break;
      ReportUtil.a(this, ReportUtil.c(w.aM(getIntent()), -1), false);
      finish();
      ab.e("MicroMsg.WXEntryActivity", "postLogin fail, loginResult = ".concat(String.valueOf(parama)));
      break;
      label1375: k = 0;
    }
  }

  public final int getLayoutId()
  {
    return 2130970561;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18198);
    w.b(getIntent(), "key_auto_login_wizard_exit", true);
    super.onCreate(paramBundle);
    setBackBtn(new WXEntryActivity.1(this));
    AppMethodBeat.o(18198);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(18213);
    super.onDestroy();
    aw.Rg().b(1200, this);
    AppMethodBeat.o(18213);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(18209);
    boolean bool;
    if ((paramKeyEvent.getRepeatCount() == 0) && (paramKeyEvent.getKeyCode() == 4))
    {
      ab.i("MicroMsg.WXEntryActivity", "user click back button");
      goBack();
      bool = true;
      AppMethodBeat.o(18209);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(18209);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(18207);
    ab.i("MicroMsg.WXEntryActivity", "onSceneEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    aw.Rg().b(1200, this);
    if ((this.ehJ != null) && (this.ehJ.isShowing()))
      this.ehJ.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (z)paramm;
      if (paramString.ajE() == null)
        break label286;
    }
    label286: for (paramInt1 = paramString.ajE().version; ; paramInt1 = 0)
    {
      ab.i("MicroMsg.WXEntryActivity", "server appversion = %d", new Object[] { Integer.valueOf(paramInt1) });
      paramString = com.tencent.mm.pluginsdk.model.app.g.bT(this.appId, false);
      if (paramString == null)
      {
        ab.e("MicroMsg.WXEntryActivity", "null appinfo");
        a.a.bYQ().Us(this.appId);
        i(paramm);
        finish();
        AppMethodBeat.o(18207);
      }
      while (true)
      {
        return;
        paramInt2 = paramString.field_appVersion;
        ab.i("MicroMsg.WXEntryActivity", "local appversion = %d", new Object[] { Integer.valueOf(paramInt2) });
        if (paramInt2 >= paramInt1)
          break;
        a.a.bYQ().Us(this.appId);
        break;
        if (u.a.a(this, paramInt1, paramInt2, null, 4))
        {
          ab.i("MicroMsg.WXEntryActivity", "mm error processor process this errcode");
          finish();
          AppMethodBeat.o(18207);
        }
        else if (com.tencent.mm.kernel.a.QT())
        {
          ab.w("MicroMsg.WXEntryActivity", "account is hold, do finish");
          finish();
          AppMethodBeat.o(18207);
        }
        else
        {
          Fw(paramString);
          AppMethodBeat.o(18207);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXEntryActivity
 * JD-Core Version:    0.6.2
 */