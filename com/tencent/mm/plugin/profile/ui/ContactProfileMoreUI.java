package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.e;
import com.tencent.mm.plugin.profile.a.b;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.List;

public class ContactProfileMoreUI extends MMPreference
  implements com.tencent.mm.plugin.fts.a.l
{
  private String edV;
  u eih;
  private String ejD;
  boolean ejU = false;
  private f iFE;
  private ad ldh;
  private b pkh;

  public final int JC()
  {
    return 2131165230;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    boolean bool = false;
    AppMethodBeat.i(23423);
    if (paramPreference.mKey.equals("common_chatroom"))
    {
      int i = paramPreference.getExtras().getInt("count", 0);
      e.vW(i);
      if (i > 0)
      {
        paramf = new Intent(this, CommonChatroomInfoUI.class);
        paramf.putExtra("Select_Talker_Name", this.ldh.field_username);
        startActivity(paramf);
      }
      bool = true;
      AppMethodBeat.o(23423);
      return bool;
    }
    if (paramPreference.mKey.equals("weishop"))
    {
      paramf = new Intent();
      paramf.putExtra("rawUrl", paramPreference.getExtras().getString("shopUrl"));
      paramf.putExtra("geta8key_username", r.Yz());
      d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
    }
    while (true)
    {
      AppMethodBeat.o(23423);
      break;
      if (paramPreference.mKey.equals("send_to_friend"))
        this.pkh.caw();
      else if (paramPreference.mKey.equals("add_to_black"))
        this.pkh.jL(false);
      else if (paramPreference.mKey.equals("expose"))
        this.pkh.cax();
      else if (paramPreference.mKey.equals("delete_contact"))
        this.pkh.cav();
    }
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(23425);
    Preference localPreference = this.iFE.aqO("common_chatroom");
    if (paramj.bFZ == 0)
    {
      int i = ((Integer)((com.tencent.mm.plugin.fts.a.a.l)paramj.mEy.get(0)).userData).intValue();
      localPreference.setSummary(getString(2131298498, new Object[] { Integer.valueOf(i) }));
      localPreference.getExtras().putInt("count", i);
    }
    while (true)
    {
      this.iFE.notifyDataSetChanged();
      AppMethodBeat.o(23425);
      return;
      localPreference.setSummary(getString(2131298498, new Object[] { Integer.valueOf(0) }));
    }
  }

  // ERROR //
  public void onCreate(Bundle paramBundle)
  {
    // Byte code:
    //   0: sipush 23424
    //   3: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: aload_1
    //   8: invokespecial 211	com/tencent/mm/ui/base/preference/MMPreference:onCreate	(Landroid/os/Bundle;)V
    //   11: aload_0
    //   12: ldc 212
    //   14: invokevirtual 215	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:setMMTitle	(I)V
    //   17: aload_0
    //   18: new 217	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI$1
    //   21: dup
    //   22: aload_0
    //   23: invokespecial 220	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI$1:<init>	(Lcom/tencent/mm/plugin/profile/ui/ContactProfileMoreUI;)V
    //   26: invokevirtual 224	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:setBackBtn	(Landroid/view/MenuItem$OnMenuItemClickListener;)V
    //   29: aload_0
    //   30: aload_0
    //   31: invokevirtual 228	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:getIntent	()Landroid/content/Intent;
    //   34: ldc 230
    //   36: iconst_0
    //   37: invokevirtual 234	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   40: putfield 25	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ejU	Z
    //   43: aload_0
    //   44: aload_0
    //   45: invokevirtual 228	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:getIntent	()Landroid/content/Intent;
    //   48: ldc 236
    //   50: invokevirtual 239	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   53: putfield 241	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ejD	Ljava/lang/String;
    //   56: aload_0
    //   57: aload_0
    //   58: invokevirtual 228	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:getIntent	()Landroid/content/Intent;
    //   61: ldc 243
    //   63: invokevirtual 239	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   66: putfield 245	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:edV	Ljava/lang/String;
    //   69: invokestatic 251	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   72: pop
    //   73: aload_0
    //   74: invokestatic 257	com/tencent/mm/model/c:XM	()Lcom/tencent/mm/storage/bd;
    //   77: aload_0
    //   78: getfield 245	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:edV	Ljava/lang/String;
    //   81: invokeinterface 263 2 0
    //   86: putfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   89: aload_0
    //   90: getfield 241	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ejD	Ljava/lang/String;
    //   93: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   96: ifne +23 -> 119
    //   99: invokestatic 251	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   102: pop
    //   103: aload_0
    //   104: invokestatic 273	com/tencent/mm/model/c:XV	()Lcom/tencent/mm/model/ag;
    //   107: aload_0
    //   108: getfield 241	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ejD	Ljava/lang/String;
    //   111: invokeinterface 279 2 0
    //   116: putfield 281	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:eih	Lcom/tencent/mm/storage/u;
    //   119: aload_0
    //   120: new 129	com/tencent/mm/plugin/profile/a/b
    //   123: dup
    //   124: aload_0
    //   125: aload_0
    //   126: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   129: invokespecial 284	com/tencent/mm/plugin/profile/a/b:<init>	(Lcom/tencent/mm/ui/MMActivity;Lcom/tencent/mm/storage/ad;)V
    //   132: putfield 127	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:pkh	Lcom/tencent/mm/plugin/profile/a/b;
    //   135: aload_0
    //   136: getfield 288	com/tencent/mm/ui/base/preference/MMPreference:yCw	Lcom/tencent/mm/ui/base/preference/h;
    //   139: astore_2
    //   140: aload_0
    //   141: aload_2
    //   142: putfield 151	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:iFE	Lcom/tencent/mm/ui/base/preference/f;
    //   145: aload_0
    //   146: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   149: astore_1
    //   150: aload_2
    //   151: ldc 44
    //   153: invokeinterface 157 2 0
    //   158: astore_3
    //   159: aload_1
    //   160: getfield 83	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   163: invokestatic 293	com/tencent/mm/storage/ad:aox	(Ljava/lang/String;)Z
    //   166: ifne +16 -> 182
    //   169: aload_1
    //   170: getfield 83	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   173: invokestatic 113	com/tencent/mm/model/r:Yz	()Ljava/lang/String;
    //   176: invokevirtual 50	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   179: ifeq +584 -> 763
    //   182: iconst_1
    //   183: istore 4
    //   185: iload 4
    //   187: ifeq +582 -> 769
    //   190: aload_2
    //   191: ldc 44
    //   193: iconst_1
    //   194: invokeinterface 297 3 0
    //   199: aload_0
    //   200: getfield 151	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:iFE	Lcom/tencent/mm/ui/base/preference/f;
    //   203: ldc_w 299
    //   206: invokeinterface 157 2 0
    //   211: astore_1
    //   212: aload_0
    //   213: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   216: invokevirtual 302	com/tencent/mm/storage/ad:getSource	()I
    //   219: lookupswitch	default:+217->436, 1:+663->882, 3:+696->915, 4:+653->872, 8:+838->1057, 10:+967->1186, 12:+653->872, 13:+934->1153, 14:+838->1057, 15:+1033->1252, 17:+729->948, 18:+762->981, 22:+871->1090, 23:+871->1090, 24:+871->1090, 25:+1000->1219, 26:+871->1090, 27:+871->1090, 28:+871->1090, 29:+871->1090, 30:+795->1014, 34:+904->1123, 48:+828->1047, 58:+914->1133, 59:+914->1133, 60:+914->1133, 76:+924->1143
    //   437: aconst_null
    //   438: invokevirtual 198	com/tencent/mm/ui/base/preference/Preference:setSummary	(Ljava/lang/CharSequence;)V
    //   441: aload_1
    //   442: invokevirtual 306	com/tencent/mm/ui/base/preference/Preference:getSummary	()Ljava/lang/CharSequence;
    //   445: invokestatic 310	com/tencent/mm/sdk/platformtools/bo:ac	(Ljava/lang/CharSequence;)Z
    //   448: ifeq +13 -> 461
    //   451: aload_2
    //   452: ldc_w 299
    //   455: iconst_1
    //   456: invokeinterface 297 3 0
    //   461: aload_2
    //   462: ldc_w 312
    //   465: invokeinterface 157 2 0
    //   470: astore_3
    //   471: new 314	java/lang/StringBuilder
    //   474: dup
    //   475: invokespecial 315	java/lang/StringBuilder:<init>	()V
    //   478: aload_0
    //   479: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   482: invokevirtual 318	com/tencent/mm/storage/ad:getProvince	()Ljava/lang/String;
    //   485: invokestatic 323	com/tencent/mm/model/s:mL	(Ljava/lang/String;)Ljava/lang/String;
    //   488: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   491: astore 5
    //   493: aload_0
    //   494: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   497: invokevirtual 330	com/tencent/mm/storage/ad:getCity	()Ljava/lang/String;
    //   500: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   503: ifeq +782 -> 1285
    //   506: ldc_w 332
    //   509: astore_1
    //   510: aload_3
    //   511: aload 5
    //   513: aload_1
    //   514: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   517: invokevirtual 335	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   520: invokevirtual 198	com/tencent/mm/ui/base/preference/Preference:setSummary	(Ljava/lang/CharSequence;)V
    //   523: aload_3
    //   524: invokevirtual 306	com/tencent/mm/ui/base/preference/Preference:getSummary	()Ljava/lang/CharSequence;
    //   527: invokestatic 310	com/tencent/mm/sdk/platformtools/bo:ac	(Ljava/lang/CharSequence;)Z
    //   530: ifeq +13 -> 543
    //   533: aload_2
    //   534: ldc_w 312
    //   537: iconst_1
    //   538: invokeinterface 297 3 0
    //   543: aload_2
    //   544: ldc_w 337
    //   547: invokeinterface 157 2 0
    //   552: astore_1
    //   553: aload_1
    //   554: aload_0
    //   555: aload_0
    //   556: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   559: getfield 339	com/tencent/mm/g/c/ap:signature	Ljava/lang/String;
    //   562: invokestatic 344	com/tencent/mm/pluginsdk/ui/e/j:b	(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/text/SpannableString;
    //   565: invokevirtual 198	com/tencent/mm/ui/base/preference/Preference:setSummary	(Ljava/lang/CharSequence;)V
    //   568: aload_1
    //   569: invokevirtual 306	com/tencent/mm/ui/base/preference/Preference:getSummary	()Ljava/lang/CharSequence;
    //   572: invokestatic 310	com/tencent/mm/sdk/platformtools/bo:ac	(Ljava/lang/CharSequence;)Z
    //   575: ifeq +13 -> 588
    //   578: aload_2
    //   579: ldc_w 312
    //   582: iconst_1
    //   583: invokeinterface 297 3 0
    //   588: aload_0
    //   589: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   592: astore_1
    //   593: aload_2
    //   594: ldc 96
    //   596: invokeinterface 157 2 0
    //   601: astore 5
    //   603: invokestatic 113	com/tencent/mm/model/r:Yz	()Ljava/lang/String;
    //   606: aload_1
    //   607: getfield 83	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   610: invokevirtual 50	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   613: ifeq +699 -> 1312
    //   616: invokestatic 251	com/tencent/mm/model/aw:ZK	()Lcom/tencent/mm/model/c;
    //   619: pop
    //   620: invokestatic 348	com/tencent/mm/model/c:Ry	()Lcom/tencent/mm/storage/z;
    //   623: getstatic 354	com/tencent/mm/storage/ac$a:xLU	Lcom/tencent/mm/storage/ac$a;
    //   626: aconst_null
    //   627: invokevirtual 359	com/tencent/mm/storage/z:get	(Lcom/tencent/mm/storage/ac$a;Ljava/lang/Object;)Ljava/lang/Object;
    //   630: checkcast 46	java/lang/String
    //   633: astore_1
    //   634: aload_1
    //   635: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   638: ifne +721 -> 1359
    //   641: new 361	org/json/JSONObject
    //   644: astore_3
    //   645: aload_3
    //   646: aload_1
    //   647: invokespecial 364	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   650: aload_3
    //   651: ldc_w 366
    //   654: invokevirtual 369	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   657: astore_1
    //   658: aload_3
    //   659: ldc_w 371
    //   662: invokevirtual 369	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   665: astore_3
    //   666: aload_1
    //   667: invokestatic 269	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   670: ifne +35 -> 705
    //   673: aload 5
    //   675: aload_3
    //   676: invokevirtual 198	com/tencent/mm/ui/base/preference/Preference:setSummary	(Ljava/lang/CharSequence;)V
    //   679: aload 5
    //   681: aload_0
    //   682: invokevirtual 375	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:getResources	()Landroid/content/res/Resources;
    //   685: ldc_w 376
    //   688: invokevirtual 382	android/content/res/Resources:getColor	(I)I
    //   691: putfield 385	com/tencent/mm/ui/base/preference/Preference:ksd	I
    //   694: aload 5
    //   696: invokevirtual 54	com/tencent/mm/ui/base/preference/Preference:getExtras	()Landroid/os/Bundle;
    //   699: ldc 101
    //   701: aload_1
    //   702: invokevirtual 389	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   705: aload 5
    //   707: invokevirtual 306	com/tencent/mm/ui/base/preference/Preference:getSummary	()Ljava/lang/CharSequence;
    //   710: invokestatic 310	com/tencent/mm/sdk/platformtools/bo:ac	(Ljava/lang/CharSequence;)Z
    //   713: ifeq +629 -> 1342
    //   716: aload_2
    //   717: ldc 96
    //   719: iconst_1
    //   720: invokeinterface 297 3 0
    //   725: aload_2
    //   726: ldc_w 391
    //   729: iconst_1
    //   730: invokeinterface 297 3 0
    //   735: aload_2
    //   736: ldc 134
    //   738: invokeinterface 157 2 0
    //   743: checkcast 393	com/tencent/mm/ui/base/preference/CheckBoxPreference
    //   746: aload_0
    //   747: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   750: invokevirtual 397	com/tencent/mm/storage/ad:Oa	()Z
    //   753: putfield 400	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   756: sipush 23424
    //   759: invokestatic 94	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   762: return
    //   763: iconst_0
    //   764: istore 4
    //   766: goto -581 -> 185
    //   769: aload_1
    //   770: getfield 403	com/tencent/mm/g/c/ap:dtS	I
    //   773: iconst_1
    //   774: if_icmpne +70 -> 844
    //   777: aload_3
    //   778: ldc_w 404
    //   781: invokevirtual 407	com/tencent/mm/ui/base/preference/Preference:setTitle	(I)V
    //   784: new 409	com/tencent/mm/plugin/fts/a/a/i
    //   787: dup
    //   788: invokespecial 410	com/tencent/mm/plugin/fts/a/a/i:<init>	()V
    //   791: astore_3
    //   792: aload_3
    //   793: aload_1
    //   794: getfield 83	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   797: putfield 413	com/tencent/mm/plugin/fts/a/a/i:query	Ljava/lang/String;
    //   800: aload_3
    //   801: aload_0
    //   802: putfield 417	com/tencent/mm/plugin/fts/a/a/i:mEw	Lcom/tencent/mm/plugin/fts/a/l;
    //   805: aload_3
    //   806: new 419	com/tencent/mm/sdk/platformtools/ak
    //   809: dup
    //   810: invokestatic 425	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   813: invokespecial 428	com/tencent/mm/sdk/platformtools/ak:<init>	(Landroid/os/Looper;)V
    //   816: putfield 432	com/tencent/mm/plugin/fts/a/a/i:handler	Lcom/tencent/mm/sdk/platformtools/ak;
    //   819: aload_3
    //   820: iconst_5
    //   821: putfield 435	com/tencent/mm/plugin/fts/a/a/i:hbo	I
    //   824: ldc_w 437
    //   827: invokestatic 443	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   830: checkcast 437	com/tencent/mm/plugin/fts/a/n
    //   833: iconst_2
    //   834: aload_3
    //   835: invokeinterface 447 3 0
    //   840: pop
    //   841: goto -642 -> 199
    //   844: aload_1
    //   845: getfield 403	com/tencent/mm/g/c/ap:dtS	I
    //   848: iconst_2
    //   849: if_icmpne +13 -> 862
    //   852: aload_3
    //   853: ldc_w 448
    //   856: invokevirtual 407	com/tencent/mm/ui/base/preference/Preference:setTitle	(I)V
    //   859: goto -75 -> 784
    //   862: aload_3
    //   863: ldc_w 449
    //   866: invokevirtual 407	com/tencent/mm/ui/base/preference/Preference:setTitle	(I)V
    //   869: goto -85 -> 784
    //   872: aload_1
    //   873: ldc_w 450
    //   876: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   879: goto -438 -> 441
    //   882: aload_0
    //   883: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   886: invokevirtual 455	com/tencent/mm/storage/ad:Ol	()I
    //   889: ldc_w 456
    //   892: if_icmple +13 -> 905
    //   895: aload_1
    //   896: ldc_w 457
    //   899: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   902: goto -461 -> 441
    //   905: aload_1
    //   906: ldc_w 458
    //   909: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   912: goto -471 -> 441
    //   915: aload_0
    //   916: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   919: invokevirtual 455	com/tencent/mm/storage/ad:Ol	()I
    //   922: ldc_w 456
    //   925: if_icmple +13 -> 938
    //   928: aload_1
    //   929: ldc_w 459
    //   932: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   935: goto -494 -> 441
    //   938: aload_1
    //   939: ldc_w 460
    //   942: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   945: goto -504 -> 441
    //   948: aload_0
    //   949: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   952: invokevirtual 455	com/tencent/mm/storage/ad:Ol	()I
    //   955: ldc_w 456
    //   958: if_icmple +13 -> 971
    //   961: aload_1
    //   962: ldc_w 461
    //   965: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   968: goto -527 -> 441
    //   971: aload_1
    //   972: ldc_w 462
    //   975: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   978: goto -537 -> 441
    //   981: aload_0
    //   982: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   985: invokevirtual 455	com/tencent/mm/storage/ad:Ol	()I
    //   988: ldc_w 456
    //   991: if_icmple +13 -> 1004
    //   994: aload_1
    //   995: ldc_w 463
    //   998: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1001: goto -560 -> 441
    //   1004: aload_1
    //   1005: ldc_w 464
    //   1008: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1011: goto -570 -> 441
    //   1014: aload_0
    //   1015: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   1018: invokevirtual 455	com/tencent/mm/storage/ad:Ol	()I
    //   1021: ldc_w 456
    //   1024: if_icmple +13 -> 1037
    //   1027: aload_1
    //   1028: ldc_w 465
    //   1031: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1034: goto -593 -> 441
    //   1037: aload_1
    //   1038: ldc_w 466
    //   1041: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1044: goto -603 -> 441
    //   1047: aload_1
    //   1048: ldc_w 467
    //   1051: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1054: goto -613 -> 441
    //   1057: aload_0
    //   1058: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   1061: invokevirtual 455	com/tencent/mm/storage/ad:Ol	()I
    //   1064: ldc_w 456
    //   1067: if_icmple +13 -> 1080
    //   1070: aload_1
    //   1071: ldc_w 468
    //   1074: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1077: goto -636 -> 441
    //   1080: aload_1
    //   1081: ldc_w 469
    //   1084: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1087: goto -646 -> 441
    //   1090: aload_0
    //   1091: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   1094: invokevirtual 455	com/tencent/mm/storage/ad:Ol	()I
    //   1097: ldc_w 456
    //   1100: if_icmple +13 -> 1113
    //   1103: aload_1
    //   1104: ldc_w 470
    //   1107: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1110: goto -669 -> 441
    //   1113: aload_1
    //   1114: ldc_w 471
    //   1117: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1120: goto -679 -> 441
    //   1123: aload_1
    //   1124: ldc_w 472
    //   1127: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1130: goto -689 -> 441
    //   1133: aload_1
    //   1134: ldc_w 473
    //   1137: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1140: goto -699 -> 441
    //   1143: aload_1
    //   1144: ldc_w 474
    //   1147: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1150: goto -709 -> 441
    //   1153: aload_0
    //   1154: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   1157: invokevirtual 455	com/tencent/mm/storage/ad:Ol	()I
    //   1160: ldc_w 456
    //   1163: if_icmple +13 -> 1176
    //   1166: aload_1
    //   1167: ldc_w 475
    //   1170: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1173: goto -732 -> 441
    //   1176: aload_1
    //   1177: ldc_w 476
    //   1180: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1183: goto -742 -> 441
    //   1186: aload_0
    //   1187: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   1190: invokevirtual 455	com/tencent/mm/storage/ad:Ol	()I
    //   1193: ldc_w 456
    //   1196: if_icmple +13 -> 1209
    //   1199: aload_1
    //   1200: ldc_w 475
    //   1203: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1206: goto -765 -> 441
    //   1209: aload_1
    //   1210: ldc_w 476
    //   1213: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1216: goto -775 -> 441
    //   1219: aload_0
    //   1220: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   1223: invokevirtual 455	com/tencent/mm/storage/ad:Ol	()I
    //   1226: ldc_w 456
    //   1229: if_icmple +13 -> 1242
    //   1232: aload_1
    //   1233: ldc_w 477
    //   1236: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1239: goto -798 -> 441
    //   1242: aload_1
    //   1243: ldc_w 478
    //   1246: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1249: goto -808 -> 441
    //   1252: aload_0
    //   1253: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   1256: invokevirtual 455	com/tencent/mm/storage/ad:Ol	()I
    //   1259: ldc_w 456
    //   1262: if_icmple +13 -> 1275
    //   1265: aload_1
    //   1266: ldc_w 479
    //   1269: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1272: goto -831 -> 441
    //   1275: aload_1
    //   1276: ldc_w 480
    //   1279: invokevirtual 452	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1282: goto -841 -> 441
    //   1285: new 314	java/lang/StringBuilder
    //   1288: dup
    //   1289: ldc_w 482
    //   1292: invokespecial 483	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1295: aload_0
    //   1296: getfield 78	com/tencent/mm/plugin/profile/ui/ContactProfileMoreUI:ldh	Lcom/tencent/mm/storage/ad;
    //   1299: invokevirtual 330	com/tencent/mm/storage/ad:getCity	()Ljava/lang/String;
    //   1302: invokevirtual 327	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1305: invokevirtual 335	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1308: astore_1
    //   1309: goto -799 -> 510
    //   1312: aload_1
    //   1313: getfield 486	com/tencent/mm/g/c/ap:duq	Ljava/lang/String;
    //   1316: astore_1
    //   1317: goto -683 -> 634
    //   1320: astore_3
    //   1321: aconst_null
    //   1322: astore_1
    //   1323: ldc_w 488
    //   1326: aload_3
    //   1327: ldc_w 332
    //   1330: iconst_0
    //   1331: anewarray 187	java/lang/Object
    //   1334: invokestatic 494	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1337: aconst_null
    //   1338: astore_3
    //   1339: goto -673 -> 666
    //   1342: aload_2
    //   1343: ldc_w 391
    //   1346: iconst_0
    //   1347: invokeinterface 297 3 0
    //   1352: goto -617 -> 735
    //   1355: astore_3
    //   1356: goto -33 -> 1323
    //   1359: aconst_null
    //   1360: astore_1
    //   1361: aconst_null
    //   1362: astore_3
    //   1363: goto -697 -> 666
    //
    // Exception table:
    //   from	to	target	type
    //   641	658	1320	org/json/JSONException
    //   658	666	1355	org/json/JSONException
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactProfileMoreUI
 * JD-Core Version:    0.6.2
 */