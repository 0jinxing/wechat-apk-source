package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.aj.d.a;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.dc;
import com.tencent.mm.g.a.dc.b;
import com.tencent.mm.g.a.dg;
import com.tencent.mm.g.a.dg.b;
import com.tencent.mm.g.a.of;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.plugin.profile.ui.ContactInfoUI;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.protocal.protobuf.kt;
import com.tencent.mm.protocal.protobuf.ku;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.e.a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class b
  implements com.tencent.mm.ai.f, com.tencent.mm.pluginsdk.b.a
{
  public long edh;
  com.tencent.mm.ui.base.preference.f ehK;
  public ad ehM;
  public long endTime;
  private List<d.a> fuX;
  private d.b fuY;
  private String fvh;
  public int gwP;
  public String mGZ;
  public com.tencent.mm.aj.d pkW;
  boolean pli;
  private String pln;
  private int pmD = 0;
  private Bundle pmH;
  SnsAdClick pmI = null;
  private String pmJ = null;
  public List<WxaAttributes.WxaEntryInfo> pmy;
  private uy pmz;
  ContactInfoUI ppM;
  public com.tencent.mm.plugin.profile.ui.newbizinfo.b.d ppN;
  private com.tencent.mm.ui.base.p tipDialog = null;

  public b(ContactInfoUI paramContactInfoUI, String paramString, uy paramuy)
  {
    this.ppM = paramContactInfoUI;
    this.pln = paramString;
    this.pmz = paramuy;
  }

  private void caU()
  {
    AppMethodBeat.i(23816);
    if ((this.ehM != null) && ((t.nG(this.ehM.field_username)) || (t.nQ(this.ehM.field_username))) && (com.tencent.mm.n.a.jh(this.ehM.field_type)))
    {
      this.ehK.ce("contact_info_biz_go_chatting", false);
      AppMethodBeat.o(23816);
    }
    while (true)
    {
      return;
      this.ehK.ce("contact_info_biz_go_chatting", true);
      AppMethodBeat.o(23816);
    }
  }

  private boolean caW()
  {
    AppMethodBeat.i(23824);
    boolean bool;
    if (this.ppM.getIntent() == null)
    {
      bool = false;
      AppMethodBeat.o(23824);
    }
    while (true)
    {
      return bool;
      String str1 = this.ppM.getIntent().getStringExtra("device_id");
      String str2 = this.ppM.getIntent().getStringExtra("device_type");
      dg localdg = new dg();
      localdg.cwu.ceI = str1;
      localdg.cwu.cws = str2;
      com.tencent.mm.sdk.b.a.xxA.m(localdg);
      bool = localdg.cwv.cww;
      AppMethodBeat.o(23824);
    }
  }

  private void cbE()
  {
    AppMethodBeat.i(23812);
    com.tencent.mm.aj.d locald1 = com.tencent.mm.aj.f.qX(this.ehM.field_username);
    this.fuX = null;
    this.fuY = null;
    this.pmy = null;
    com.tencent.mm.aj.d locald2;
    if (locald1 != null)
    {
      locald2 = locald1;
      if (locald1.cJ(false) != null);
    }
    else
    {
      locald2 = locald1;
      if (this.pmz != null)
      {
        locald2 = new com.tencent.mm.aj.d();
        locald2.field_username = this.ehM.field_username;
        locald2.field_brandFlag = this.pmz.gvb;
        locald2.field_brandIconURL = this.pmz.gve;
        locald2.field_brandInfo = this.pmz.gvd;
        locald2.field_extInfo = this.pmz.gvc;
        locald2.field_type = locald2.cJ(false).getServiceType();
      }
    }
    if ((locald2 != null) && (locald2.field_brandInfo == null) && (locald2.field_extInfo == null) && (this.pmz != null))
    {
      locald2.field_username = this.ehM.field_username;
      locald2.field_brandFlag = this.pmz.gvb;
      locald2.field_brandIconURL = this.pmz.gve;
      locald2.field_brandInfo = this.pmz.gvd;
      locald2.field_extInfo = this.pmz.gvc;
      locald2.field_type = locald2.cJ(false).getServiceType();
    }
    if (locald2 != null)
    {
      this.pkW = locald2;
      this.fuX = locald2.adY();
      this.fuY = locald2.cJ(false);
      this.pmy = this.fuY.getWxaEntryInfoList();
      if ((this.fuY.aec() != null) && (this.fuY.aec().length() > 0))
        this.fvh = this.fuY.aec();
    }
    AppMethodBeat.o(23812);
  }

  private boolean cbF()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(23815);
    try
    {
      String str = this.fuY.aef();
      boolean bool3 = bo.isNullOrNil(str);
      if (bool3)
      {
        AppMethodBeat.o(23815);
        bool1 = bool2;
        return bool1;
      }
      long l = bo.getLong(str, 0L);
      if ((l > 0L) && (l - System.currentTimeMillis() / 1000L < 0L));
      while (true)
      {
        ab.d("MicroMsg.ContactWidgetNewBizInfo", "isBizAccountTimeExpired:%b", new Object[] { Boolean.valueOf(bool1) });
        AppMethodBeat.o(23815);
        break;
        bool1 = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(23815);
        bool1 = bool2;
      }
    }
  }

  private d.a cbG()
  {
    AppMethodBeat.i(23817);
    d.a locala;
    if ((this.fuX == null) || (this.fuX.size() < 0))
    {
      ab.w("MicroMsg.ContactWidgetNewBizInfo", "brandInfoList is null not show all message");
      AppMethodBeat.o(23817);
      locala = null;
    }
    while (true)
    {
      return locala;
      Iterator localIterator = this.fuX.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          locala = (d.a)localIterator.next();
          if (locala.fvb.equals("__mp_wording__brandinfo_history_massmsg"))
          {
            AppMethodBeat.o(23817);
            break;
          }
        }
      ab.w("MicroMsg.ContactWidgetNewBizInfo", "brandInfoList is null not show all message");
      AppMethodBeat.o(23817);
      locala = null;
    }
  }

  // ERROR //
  private void cbH()
  {
    // Byte code:
    //   0: sipush 23822
    //   3: invokestatic 78	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 65	com/tencent/mm/plugin/profile/ui/newbizinfo/b:ppM	Lcom/tencent/mm/plugin/profile/ui/ContactInfoUI;
    //   10: invokevirtual 147	com/tencent/mm/plugin/profile/ui/ContactInfoUI:getIntent	()Landroid/content/Intent;
    //   13: astore_1
    //   14: aload_1
    //   15: ldc_w 336
    //   18: iconst_0
    //   19: invokevirtual 340	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   22: invokestatic 346	com/tencent/mm/plugin/profile/ui/newbizinfo/b/c:Bk	(I)I
    //   25: istore_2
    //   26: aload_1
    //   27: ldc_w 348
    //   30: invokevirtual 155	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   33: astore_3
    //   34: aload_1
    //   35: ldc_w 350
    //   38: invokevirtual 155	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   41: astore 4
    //   43: aload_1
    //   44: ldc_w 352
    //   47: iconst_0
    //   48: invokevirtual 340	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   51: aload_3
    //   52: invokestatic 356	com/tencent/mm/plugin/profile/ui/newbizinfo/b/c:aW	(ILjava/lang/String;)I
    //   55: istore 5
    //   57: aload_1
    //   58: ldc_w 358
    //   61: invokevirtual 155	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   64: astore 6
    //   66: aload_1
    //   67: ldc_w 360
    //   70: invokevirtual 155	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   73: astore 7
    //   75: aload_1
    //   76: ldc_w 362
    //   79: invokevirtual 366	android/content/Intent:getBundleExtra	(Ljava/lang/String;)Landroid/os/Bundle;
    //   82: astore 8
    //   84: ldc_w 368
    //   87: astore 9
    //   89: aload 8
    //   91: ifnull +16 -> 107
    //   94: aload 8
    //   96: ldc_w 370
    //   99: ldc_w 368
    //   102: invokevirtual 376	android/os/Bundle:getString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   105: astore 9
    //   107: aload_1
    //   108: ldc_w 378
    //   111: iconst_m1
    //   112: invokevirtual 340	android/content/Intent:getIntExtra	(Ljava/lang/String;I)I
    //   115: invokestatic 383	com/tencent/mm/ui/e$a:MQ	(I)I
    //   118: istore 10
    //   120: aload_0
    //   121: getfield 87	com/tencent/mm/plugin/profile/ui/newbizinfo/b:ehM	Lcom/tencent/mm/storage/ad;
    //   124: getfield 92	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   127: astore 11
    //   129: aload 9
    //   131: invokestatic 266	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   134: ifne +185 -> 319
    //   137: aload 9
    //   139: invokestatic 386	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   142: ldc_w 388
    //   145: invokestatic 393	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   148: astore 9
    //   150: aload 6
    //   152: astore_1
    //   153: aload 6
    //   155: invokestatic 386	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   158: ldc_w 388
    //   161: invokestatic 393	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   164: astore 6
    //   166: aload 6
    //   168: astore_1
    //   169: aload 7
    //   171: invokestatic 386	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   174: ldc_w 388
    //   177: invokestatic 393	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   180: astore 8
    //   182: aload 8
    //   184: astore_1
    //   185: getstatic 399	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   188: sipush 16232
    //   191: bipush 9
    //   193: anewarray 4	java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: iload_2
    //   199: invokestatic 404	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   202: aastore
    //   203: dup
    //   204: iconst_1
    //   205: iload 5
    //   207: invokestatic 404	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   210: aastore
    //   211: dup
    //   212: iconst_2
    //   213: aload_3
    //   214: aastore
    //   215: dup
    //   216: iconst_3
    //   217: aload 4
    //   219: aastore
    //   220: dup
    //   221: iconst_4
    //   222: aload 6
    //   224: aastore
    //   225: dup
    //   226: iconst_5
    //   227: aload_1
    //   228: aastore
    //   229: dup
    //   230: bipush 6
    //   232: aload 9
    //   234: aastore
    //   235: dup
    //   236: bipush 7
    //   238: iload 10
    //   240: invokestatic 404	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   243: aastore
    //   244: dup
    //   245: bipush 8
    //   247: aload 11
    //   249: aastore
    //   250: invokevirtual 408	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   253: aload_0
    //   254: getfield 61	com/tencent/mm/plugin/profile/ui/newbizinfo/b:pmJ	Ljava/lang/String;
    //   257: invokestatic 266	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   260: ifne +16 -> 276
    //   263: getstatic 399	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   266: sipush 16697
    //   269: aload_0
    //   270: getfield 61	com/tencent/mm/plugin/profile/ui/newbizinfo/b:pmJ	Ljava/lang/String;
    //   273: invokevirtual 412	com/tencent/mm/plugin/report/service/h:X	(ILjava/lang/String;)V
    //   276: sipush 23822
    //   279: invokestatic 110	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   282: return
    //   283: astore 8
    //   285: ldc_w 368
    //   288: astore 9
    //   290: ldc_w 280
    //   293: aload 8
    //   295: ldc_w 368
    //   298: iconst_0
    //   299: anewarray 4	java/lang/Object
    //   302: invokestatic 416	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   305: aload 7
    //   307: astore_1
    //   308: goto -123 -> 185
    //   311: astore 8
    //   313: aload_1
    //   314: astore 6
    //   316: goto -26 -> 290
    //   319: ldc_w 368
    //   322: astore 9
    //   324: aload 7
    //   326: astore_1
    //   327: goto -142 -> 185
    //
    // Exception table:
    //   from	to	target	type
    //   137	150	283	java/io/UnsupportedEncodingException
    //   153	166	311	java/io/UnsupportedEncodingException
    //   169	182	311	java/io/UnsupportedEncodingException
  }

  final void Bj(int paramInt)
  {
    AppMethodBeat.i(23825);
    if ((this.pmH == null) || ((this.gwP != 39) && (this.gwP != 56) && (this.gwP != 35) && (this.gwP != 87) && (this.gwP != 88) && (this.gwP != 89) && (this.gwP != 85)))
    {
      ab.d("MicroMsg.ContactWidgetNewBizInfo", "mExtArgs is null or the add contact action is not from biz search.");
      AppMethodBeat.o(23825);
    }
    while (true)
    {
      return;
      if (this.ehM != null)
        break;
      ab.i("MicroMsg.ContactWidgetNewBizInfo", "contact is null.");
      AppMethodBeat.o(23825);
    }
    String str1 = this.pmH.getString("Contact_Ext_Args_Search_Id");
    String str2 = bo.nullAsNil(this.pmH.getString("Contact_Ext_Args_Query_String"));
    int i = this.pmH.getInt("Contact_Ext_Args_Index");
    int j;
    switch (this.gwP)
    {
    default:
      j = 0;
      label211: str3 = bo.nullAsNil(this.pmH.getString("Contact_Ext_Extra_Params"));
      str2 = str2 + "," + paramInt + "," + bo.nullAsNil(this.ehM.field_username) + "," + i + "," + System.currentTimeMillis() / 1000L + "," + str1 + "," + j;
      if (bo.isNullOrNil(null))
        break;
    case 35:
    case 87:
    case 88:
    case 89:
    case 85:
    }
    for (String str3 = str2 + "," + null + "," + str3; ; str3 = str2 + ",," + str3)
    {
      ab.v("MicroMsg.ContactWidgetNewBizInfo", "report 10866: %s", new Object[] { str3 });
      com.tencent.mm.plugin.report.service.h.pYm.X(10866, str3);
      AppMethodBeat.o(23825);
      break;
      j = 1;
      break label211;
      j = 2;
      break label211;
      j = 3;
      break label211;
      j = 4;
      break label211;
      j = 5;
      break label211;
    }
  }

  public final boolean IO(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(23820);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.ContactWidgetNewBizInfo", "handleEvent key is null, return");
      AppMethodBeat.o(23820);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.ContactWidgetNewBizInfo", "handleEvent key:%s", new Object[] { paramString });
      if ("contact_info_biz_add".endsWith(paramString))
      {
        if (!com.tencent.mm.model.gdpr.c.aaZ())
          caV();
        while (true)
        {
          if (this.pmD != 0)
            com.tencent.mm.plugin.report.service.h.pYm.e(11263, new Object[] { Integer.valueOf(this.pmD), this.ehM.field_username });
          com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(this.ehM.field_username, 200);
          AppMethodBeat.o(23820);
          bool = true;
          break;
          com.tencent.mm.model.gdpr.c.a(this.ppM, com.tencent.mm.model.gdpr.a.fol, this.ehM.field_username, new b.5(this));
        }
      }
      if ("contact_info_all_message_newbizinfo".endsWith(paramString))
      {
        String str = this.ppN.field_historyArticlesUrl;
        ab.i("MicroMsg.ContactWidgetNewBizInfo", "contact_info_all_message_newbizinfo click:%s", new Object[] { this.ppN.field_historyArticlesUrl });
        paramString = new Intent();
        paramString.putExtra("rawUrl", str);
        paramString.putExtra("useJs", true);
        paramString.putExtra("vertical_scroll", true);
        paramString.putExtra("geta8key_scene", 3);
        str = this.ppM.getIntent().getStringExtra("prePublishId");
        if (!bo.isNullOrNil(str))
        {
          paramString.putExtra("prePublishId", str);
          paramString.putExtra("preUsername", this.ppM.getIntent().getStringExtra("preUsername"));
          paramString.putExtra("preChatName", this.ppM.getIntent().getStringExtra("preChatName"));
        }
        while (true)
        {
          paramString.putExtra("preChatTYPE", this.ppM.getIntent().getIntExtra("preChatTYPE", 0));
          com.tencent.mm.bp.d.b(this.ppM, "webview", ".ui.tools.WebViewUI", paramString);
          com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(this.ehM.field_username, 400);
          AppMethodBeat.o(23820);
          bool = true;
          break;
          paramString.putExtra("prePublishId", "brand_profile");
        }
      }
      AppMethodBeat.o(23820);
      bool = true;
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(23811);
    if (this.ppM.isFinishing())
    {
      AppMethodBeat.o(23811);
      return true;
    }
    boolean bool;
    if (paramad != null)
    {
      bool = true;
      label31: Assert.assertTrue(bool);
      if (bo.nullAsNil(paramad.field_username).length() <= 0)
        break label430;
      bool = true;
      label52: Assert.assertTrue(bool);
      if (paramf == null)
        break label436;
      bool = true;
      label64: Assert.assertTrue(bool);
      this.ehK = paramf;
      this.ehM = paramad;
      this.pli = paramBoolean;
      this.gwP = paramInt;
      this.pmI = ((SnsAdClick)this.ppM.getIntent().getParcelableExtra("KSnsAdTag"));
      this.pmJ = this.ppM.getIntent().getStringExtra("key_add_contact_report_info");
      this.pmD = this.ppM.getIntent().getIntExtra("add_more_friend_search_scene", 0);
      this.pmH = this.ppM.getIntent().getBundleExtra("Contact_Ext_Args");
      this.ppM.setMMTitle("");
      this.ppM.ta(-16777216);
      this.ppM.pO(false);
      this.ppM.xE(-1);
      this.ppM.dyb();
      this.ppM.setBackBtn(new b.1(this), 2131230737);
      paramf = this.ppM.getResources().getDrawable(2130839555);
      paramf.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
      this.ppM.a(0, "", paramf, new b.2(this));
      this.ppN = com.tencent.mm.plugin.profile.c.cap().Va(this.ehM.field_username);
      caT();
      paramf = paramad.field_username;
      if (this.ppN == null)
        break label448;
      localObject1 = this.ppN;
      if (System.currentTimeMillis() - ((com.tencent.mm.plugin.profile.ui.newbizinfo.b.d)localObject1).field_cacheTime >= 60000L)
        break label442;
    }
    label430: label436: label442: for (paramInt = 1; ; paramInt = 0)
    {
      if (paramInt == 0)
        break label448;
      ab.i("MicroMsg.ContactWidgetNewBizInfo", "not obtailBizInfoFromCgi, use cache");
      paramf = this.ppM.getIntent().getStringExtra("Contact_BIZ_PopupInfoMsg");
      if (!bo.isNullOrNil(paramf))
      {
        this.ppM.getIntent().putExtra("Contact_BIZ_PopupInfoMsg", "");
        com.tencent.mm.ui.base.h.a(this.ppM, paramf, "", this.ppM.getString(2131296994), null);
      }
      if (paramad != null)
        z.afd().qB(paramad.field_username);
      AppMethodBeat.o(23811);
      break;
      bool = false;
      break label31;
      bool = false;
      break label52;
      bool = false;
      break label64;
    }
    label448: Object localObject1 = new b.a();
    ((b.a)localObject1).fsI = 2656;
    ((b.a)localObject1).uri = "/cgi-bin/mmbiz-bin/bizattr/bizprofile";
    ((b.a)localObject1).fsL = 0;
    ((b.a)localObject1).fsM = 0;
    Object localObject2 = new kt();
    ((kt)localObject2).vMR = paramf;
    ((kt)localObject2).vOl = com.tencent.mm.storage.s.getSessionId();
    ((kt)localObject2).Scene = this.gwP;
    ((b.a)localObject1).fsJ = ((com.tencent.mm.bt.a)localObject2);
    ((b.a)localObject1).fsK = new ku();
    localObject2 = ((b.a)localObject1).acD();
    localObject1 = new w.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.b paramAnonymousb, m paramAnonymousm)
      {
        AppMethodBeat.i(23807);
        ab.i("MicroMsg.ContactWidgetNewBizInfo", "callback, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        paramAnonymousString = (ku)paramAnonymousb.fsH.fsP;
        boolean bool;
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && (paramAnonymousString != null))
        {
          ab.d("MicroMsg.ContactWidgetNewBizInfo", "BizProfileResp:%d", new Object[] { Integer.valueOf(paramAnonymousString.vKQ.size()) });
          b.this.ppN = com.tencent.mm.plugin.profile.ui.newbizinfo.b.d.a(b.this.ehM.field_username, paramAnonymousString);
          if (b.this.ppN != null)
          {
            paramAnonymousString = com.tencent.mm.plugin.profile.c.cap();
            paramAnonymousb = b.this.ppN;
            if (paramAnonymousb != null)
              break label222;
            ab.e("MicroMsg.ProfileInfoStorage", "profileInfo is null, err");
            bool = false;
          }
        }
        while (true)
        {
          ab.i("MicroMsg.ContactWidgetNewBizInfo", "username:%s insert db :%b", new Object[] { b.this.ppN.field_username, Boolean.valueOf(bool) });
          b.this.caT();
          paramAnonymousString = b.this;
          if ((paramAnonymousString.ehM != null) && (paramAnonymousString.pkW != null) && (paramAnonymousString.ppN != null))
            break;
          ab.w("MicroMsg.ContactWidgetNewBizInfo", "reportUpdate fail, err");
          AppMethodBeat.o(23807);
          return 0;
          label222: paramAnonymousm = new com.tencent.mm.plugin.profile.ui.newbizinfo.b.d();
          paramAnonymousm.field_username = paramAnonymousb.field_username;
          bool = paramAnonymousString.b(paramAnonymousm, new String[0]);
          ab.i("MicroMsg.ProfileInfoStorage", "insertOrUpdate username:%s", new Object[] { paramAnonymousb.field_username });
          if (bool)
            bool = paramAnonymousString.c(paramAnonymousb, new String[0]);
          else
            bool = paramAnonymousString.b(paramAnonymousb);
        }
        paramAnonymousb = paramAnonymousString.ehM.field_username;
        int i = paramAnonymousString.gwP;
        int j = paramAnonymousString.pkW.field_type;
        long l = paramAnonymousString.edh;
        label348: int k;
        int m;
        if (com.tencent.mm.n.a.jh(paramAnonymousString.ehM.field_type))
        {
          paramAnonymousInt1 = 1;
          k = paramAnonymousString.ppN.field_originalArticleCount;
          m = paramAnonymousString.ppN.field_friendSubscribeCount;
          if (paramAnonymousString.pmy == null)
            break label538;
        }
        label538: for (paramAnonymousInt2 = paramAnonymousString.pmy.size(); ; paramAnonymousInt2 = 0)
        {
          com.tencent.mm.plugin.profile.ui.newbizinfo.c.a.a(paramAnonymousb, i, j, l, paramAnonymousInt1, k, m, paramAnonymousInt2, com.tencent.mm.plugin.profile.ui.newbizinfo.c.a.cE(paramAnonymousString.ppN.cbL()), com.tencent.mm.plugin.profile.ui.newbizinfo.c.a.cF(paramAnonymousString.ppN.cbM()), paramAnonymousString.ppN.field_decryptUserName);
          if ((paramAnonymousString.ppN != null) && (paramAnonymousString.ppN.cbR()))
            com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(paramAnonymousString.ehM.field_username, 104);
          if ((paramAnonymousString.ppN != null) && (paramAnonymousString.ppN.cbO()))
            com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(paramAnonymousString.ehM.field_username, 101);
          if ((paramAnonymousString.ppN == null) || (!paramAnonymousString.isNormal()) || (paramAnonymousString.pmy == null) || (paramAnonymousString.pmy.size() <= 0))
            break;
          com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(paramAnonymousString.ehM.field_username, 105);
          break;
          paramAnonymousInt1 = 0;
          break label348;
        }
      }
    };
    if ((this.ppM instanceof com.tencent.mm.vending.e.b));
    for (paramf = this.ppM; ; paramf = null)
    {
      w.a((com.tencent.mm.ai.b)localObject2, (w.a)localObject1, false, paramf);
      break;
    }
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23818);
    if (this.ehK == null)
      AppMethodBeat.o(23818);
    while (true)
    {
      return true;
      NewBizInfoHeaderPreference localNewBizInfoHeaderPreference = (NewBizInfoHeaderPreference)this.ehK.aqO("contact_info_header_newbizinfo");
      if (localNewBizInfoHeaderPreference != null)
        localNewBizInfoHeaderPreference.onDetach();
      AppMethodBeat.o(23818);
    }
  }

  final void caT()
  {
    AppMethodBeat.i(23813);
    biV();
    cbE();
    this.ehK.removeAll();
    this.ehK.addPreferencesFromResource(2131165213);
    Object localObject = (NewBizInfoHeaderPreference)this.ehK.aqO("contact_info_header_newbizinfo");
    if ((localObject != null) && (!bo.isNullOrNil(this.ehM.field_username)))
    {
      ((NewBizInfoHeaderPreference)localObject).a(this.ehM, this.pln, this.pkW, this.ppN);
      ((NewBizInfoDescPreference)this.ehK.aqO("contact_info_desc_newbizinfo")).ppN = this.ppN;
      this.ehK.ce("contact_info_footer_space", false);
      this.ehK.ce("contact_info_biz_space", true);
      if ((this.ppN == null) || (!this.ppN.cbQ()))
        break label809;
      if (!com.tencent.mm.n.a.jh(this.ehM.field_type))
        break label781;
      this.ehK.ce("contact_info_biz_add", true);
      this.ehK.ce("contact_info_biz_go_chatting", false);
      ((NewBizInfoFollowPreference)this.ehK.aqO("contact_info_biz_go_chatting")).plh = this;
      label210: if ((this.ppN != null) && (TextUtils.isEmpty(this.ppN.field_newBanReason)))
        break label850;
      this.ehK.ce("contact_info_biz_loading", false);
      ((NewBizInfoLoadingPreference)this.ehK.aqO("contact_info_biz_loading")).a(this.ppN, cbF());
      label269: if ((this.ppN != null) && (!isNormal()) && (!com.tencent.mm.n.a.jh(this.ehM.field_type)))
        this.ppM.showOptionMenu(false);
      if ((this.ppN == null) || (!this.ppN.cbR()))
        break label866;
      this.ehK.ce("contact_info_biz_menu_newbizinfo", false);
      if (this.ppN != null)
        ((NewBizInfoMenuPreference)this.ehK.aqO("contact_info_biz_menu_newbizinfo")).a(this.ppN, this.ehM);
      label367: if ((this.ppN == null) || (!this.ppN.cbO()))
        break label882;
      this.ehK.ce("contact_info_message_newbizinfo", false);
      ((NewBizInfoMessagePreference)this.ehK.aqO("contact_info_message_newbizinfo")).a(this.ppN, this.ehM);
      label423: if ((this.ppN == null) || (!this.ppN.cbN()) || (cbG() == null))
        break label898;
      this.ehK.ce("contact_info_all_message_newbizinfo", false);
      ((NewBizInfoAllMessagePreference)this.ehK.aqO("contact_info_all_message_newbizinfo")).ppN = this.ppN;
      label482: if ((this.ppN == null) || (!isNormal()) || (this.pmy == null) || (this.pmy.size() <= 0))
        break label914;
      this.ehK.ce("contact_info_new_bindwxainfo", false);
      ((NewBizBindWxaInfoPreference)this.ehK.aqO("contact_info_new_bindwxainfo")).a(this.pkW, this.pmy);
      label554: ab.d("MicroMsg.ContactWidgetNewBizInfo", "KIsardDevice(%b)", new Object[] { Boolean.valueOf(this.ppM.getIntent().getBooleanExtra("KIsHardDevice", false)) });
      if ((this.ppM.getIntent() == null) || (!this.ppM.getIntent().getBooleanExtra("KIsHardDevice", false)))
        break label946;
      ab.d("MicroMsg.ContactWidgetNewBizInfo", "Hard device biz...");
      boolean bool = caW();
      ab.d("MicroMsg.ContactWidgetNewBizInfo", "contact.isContact()(%b), isHarDeviceBound(%b)", new Object[] { Boolean.valueOf(com.tencent.mm.n.a.jh(this.ehM.field_type)), Boolean.valueOf(bool) });
      if ((com.tencent.mm.n.a.jh(this.ehM.field_type)) && (bool))
        break label937;
      ab.w("MicroMsg.ContactWidgetNewBizInfo", "%s is not my hard biz contact", new Object[] { this.ehM.field_username });
      caU();
      localObject = this.ehK.aqO("contact_info_biz_add");
      this.ehK.ce("contact_info_biz_add", false);
      if (localObject == null)
        break label937;
      if (!bool)
        break label930;
      ((Preference)localObject).setTitle(2131298471);
      AppMethodBeat.o(23813);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.ContactWidgetNewBizInfo", "head pref is null");
      this.ehK.ce("contact_info_header_bizinfo", true);
      break;
      label781: this.ehK.ce("contact_info_biz_add", false);
      this.ehK.ce("contact_info_biz_go_chatting", true);
      break label210;
      label809: this.ehK.ce("contact_info_biz_add", true);
      this.ehK.ce("contact_info_biz_go_chatting", true);
      this.ehK.ce("contact_info_biz_space", false);
      break label210;
      label850: this.ehK.ce("contact_info_biz_loading", true);
      break label269;
      label866: this.ehK.ce("contact_info_biz_menu_newbizinfo", true);
      break label367;
      label882: this.ehK.ce("contact_info_message_newbizinfo", true);
      break label423;
      label898: this.ehK.ce("contact_info_all_message_newbizinfo", true);
      break label482;
      label914: this.ehK.ce("contact_info_new_bindwxainfo", true);
      break label554;
      label930: ((Preference)localObject).setTitle(2131298457);
      label937: AppMethodBeat.o(23813);
      continue;
      label946: if (cbF())
      {
        this.ehK.ce("contact_info_biz_loading", false);
        this.ehK.ce("contact_info_biz_add", true);
        this.ehK.ce("contact_info_biz_go_chatting", true);
        this.ehK.ce("contact_info_message_newbizinfo", true);
        this.ehK.ce("contact_info_biz_menu_newbizinfo", true);
        this.ehK.ce("contact_info_all_message_newbizinfo", true);
        this.ehK.ce("contact_info_new_bindwxainfo", true);
      }
      AppMethodBeat.o(23813);
    }
  }

  final void caV()
  {
    AppMethodBeat.i(23821);
    if ((NewBizInfoHeaderPreference)this.ehK.aqO("contact_info_header_newbizinfo") != null)
      NewBizInfoHeaderPreference.jy(System.currentTimeMillis());
    Object localObject1;
    if ((this.ppM.getIntent() != null) && (this.ppM.getIntent().getBooleanExtra("KIsHardDevice", false)))
    {
      localObject1 = this.ppM.getIntent().getStringExtra("KHardDeviceBindTicket");
      if (!bo.isNullOrNil((String)localObject1))
        break label230;
      ab.i("MicroMsg.ContactWidgetNewBizInfo", "bindTicket is null, means it is not switch from QRcode scan, just add contact");
    }
    while (true)
    {
      Object localObject2 = new com.tencent.mm.pluginsdk.ui.applet.a(this.ppM, new a.a()
      {
        public final void a(boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2, String paramAnonymousString1, String paramAnonymousString2)
        {
          AppMethodBeat.i(23810);
          ad localad;
          if (paramAnonymousBoolean1)
          {
            com.tencent.mm.ui.base.h.bQ(b.this.ppM, b.this.ppM.getString(2131298468));
            b.this.ehK.ce("contact_info_time_expired", true);
            localad = b.this.ehM;
            if ((localad != null) && (!bo.isNullOrNil(paramAnonymousString1)))
              break label380;
            ab.e("MicroMsg.ContactWidgetNewBizInfo", "respUsername == " + paramAnonymousString1 + ", contact = " + localad);
            if (b.this.pmI != null)
            {
              paramAnonymousString1 = new of();
              b.this.pmI.fPZ = 4;
              paramAnonymousString1.cKy.cKz = b.this.pmI;
              com.tencent.mm.sdk.b.a.xxA.m(paramAnonymousString1);
            }
            paramAnonymousString1 = z.aeR().qP(b.this.ehM.field_username);
            paramAnonymousString1.field_status = 1;
            if ((!bo.isNullOrNil(paramAnonymousString1.field_extInfo)) || (bo.isNullOrNil(paramAnonymousString1.field_username)) || (b.this.pkW == null) || (!paramAnonymousString1.field_username.equals(bo.nullAsNil(b.this.pkW.field_username))))
              break label668;
            z.aeR().e(b.this.pkW);
            label240: paramAnonymousBoolean1 = b.this.ppM.getIntent().getBooleanExtra("key_biz_profile_stay_after_follow_op", false);
            paramAnonymousBoolean2 = b.this.ppM.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false);
            if (!paramAnonymousString1.adP())
              break label679;
            paramAnonymousString1 = new Intent();
            paramAnonymousString1.putExtra("enterprise_biz_name", b.this.ehM.field_username);
            paramAnonymousString1.putExtra("enterprise_biz_display_name", com.tencent.mm.model.s.mJ(b.this.ehM.field_username));
            paramAnonymousString1.putExtra("enterprise_from_scene", 7);
            paramAnonymousString1.addFlags(67108864);
            com.tencent.mm.bp.d.f(b.this.ppM, ".ui.conversation.EnterpriseConversationUI", paramAnonymousString1);
          }
          label609: 
          while (true)
          {
            label355: b.this.ppM.finish();
            label380: 
            do
            {
              b.this.Bj(3);
              AppMethodBeat.o(23810);
              return;
              paramAnonymousString2 = null;
              if (t.mX(localad.field_username))
              {
                String str = bo.nullAsNil(localad.field_username);
                paramAnonymousString2 = com.tencent.mm.aj.f.qX(str);
                if (paramAnonymousString2 != null)
                  paramAnonymousString2.field_username = paramAnonymousString1;
                z.aeR().delete(str);
                localad.iH(str);
              }
              localad.setUsername(paramAnonymousString1);
              if ((int)localad.ewQ == 0)
              {
                aw.ZK();
                com.tencent.mm.model.c.XM().aa(localad);
              }
              if ((int)localad.ewQ <= 0)
              {
                ab.e("MicroMsg.ContactWidgetNewBizInfo", "addContact : insert contact failed");
                break;
              }
              t.q(localad);
              aw.ZK();
              paramAnonymousString1 = com.tencent.mm.model.c.XM().aoO(localad.field_username);
              if (paramAnonymousString2 != null)
              {
                z.aeR().d(paramAnonymousString2);
                break;
              }
              paramAnonymousString2 = com.tencent.mm.aj.f.qX(paramAnonymousString1.field_username);
              if ((paramAnonymousString1.dsf()) && (com.tencent.mm.aj.a.adG()));
              for (int i = 1; ; i = 0)
              {
                if ((paramAnonymousString2 != null) && ((!paramAnonymousString2.adJ()) || (i != 0)))
                  break label609;
                ab.d("MicroMsg.ContactWidgetNewBizInfo", "shouldUpdate");
                ao.a.flu.ai(paramAnonymousString1.field_username, "");
                com.tencent.mm.ah.b.pY(paramAnonymousString1.field_username);
                break;
              }
              if ((!paramAnonymousString1.dsi()) || (i != 0))
                break;
              ab.d("MicroMsg.ContactWidgetNewBizInfo", "update contact, last check time=%d", new Object[] { Integer.valueOf(paramAnonymousString1.duj) });
              ao.a.flu.ai(paramAnonymousString1.field_username, "");
              com.tencent.mm.ah.b.pY(paramAnonymousString1.field_username);
              break;
              z.aeR().e(paramAnonymousString1);
              break label240;
              paramAnonymousString1 = new Intent();
              paramAnonymousString1.putExtra("Chat_User", b.this.ehM.field_username);
              paramAnonymousString1.putExtra("key_has_add_contact", true);
              paramAnonymousString1.putExtra("finish_direct", true);
              if (paramAnonymousBoolean2)
                paramAnonymousString1.addFlags(268435456);
              com.tencent.mm.storage.s.aom(b.this.ehM.field_username);
              com.tencent.mm.plugin.profile.b.gkE.d(paramAnonymousString1, b.this.ppM);
              if (paramAnonymousBoolean1)
                break label355;
            }
            while (!paramAnonymousBoolean2);
          }
        }
      });
      localObject1 = new LinkedList();
      ((LinkedList)localObject1).add(Integer.valueOf(this.gwP));
      if (this.fvh != null)
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).vjK = this.fvh;
      if (!bo.isNullOrNil(this.mGZ))
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).mGZ = this.mGZ;
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).vjP = true;
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).vjQ = this.ppM.getIntent().getStringExtra("url");
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).jSW = e.a.MQ(this.ppM.getIntent().getIntExtra("qbarScene", -1));
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject2).a(this.ehM.field_username, (LinkedList)localObject1, this.pmJ);
      cbH();
      AppMethodBeat.o(23821);
      while (true)
      {
        return;
        label230: if (caW())
          break;
        ab.d("MicroMsg.ContactWidgetNewBizInfo", "IsHardDevice, bindTicket = %s", new Object[] { localObject1 });
        aw.Rg().a(536, this);
        localObject2 = new dc();
        ((dc)localObject2).cwj.cwl = ((String)localObject1);
        ((dc)localObject2).cwj.opType = 1;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        localObject2 = ((dc)localObject2).cwk.cwn;
        localObject1 = this.ppM;
        this.ppM.getString(2131297061);
        this.tipDialog = com.tencent.mm.ui.base.h.b((Context)localObject1, this.ppM.getString(2131297086), true, new b.6(this, (m)localObject2));
        AppMethodBeat.o(23821);
      }
    }
  }

  final boolean isNormal()
  {
    AppMethodBeat.i(23814);
    boolean bool;
    if ((this.ppN != null) && (this.ppN.isNormal()) && (!cbF()))
    {
      bool = true;
      AppMethodBeat.o(23814);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(23814);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(23819);
    if (this.ppM == null)
    {
      ab.e("MicroMsg.ContactWidgetNewBizInfo", "null == context");
      AppMethodBeat.o(23819);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ContactWidgetNewBizInfo", "onActivityResult, requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(23819);
        break;
      case 1:
        if ((paramInt2 == -1) && (paramIntent != null))
        {
          String str1 = paramIntent.getStringExtra("be_send_card_name");
          String str2 = paramIntent.getStringExtra("received_card_name");
          boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
          paramIntent = paramIntent.getStringExtra("custom_send_text");
          g.bOk().q(str1, str2, bool);
          g.bOk().eZ(paramIntent, str2);
          com.tencent.mm.ui.widget.snackbar.b.i(this.ppM, this.ppM.getString(2131299884));
          AppMethodBeat.o(23819);
        }
        else
        {
          AppMethodBeat.o(23819);
        }
        break;
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(23823);
    ab.d("MicroMsg.ContactWidgetNewBizInfo", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    if (paramm == null)
    {
      ab.e("MicroMsg.ContactWidgetNewBizInfo", "scene == null");
      AppMethodBeat.o(23823);
    }
    while (true)
    {
      return;
      aw.Rg().b(paramm.getType(), this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.ContactWidgetNewBizInfo", "scene.getType() = %s", new Object[] { Integer.valueOf(paramm.getType()) });
        AppMethodBeat.o(23823);
      }
      else
      {
        ab.d("MicroMsg.ContactWidgetNewBizInfo", "scene.getType() = %s", new Object[] { Integer.valueOf(paramm.getType()) });
        if (paramm.getType() == 536)
        {
          aw.Rg().b(536, this);
          caT();
        }
        AppMethodBeat.o(23823);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.b
 * JD-Core Version:    0.6.2
 */