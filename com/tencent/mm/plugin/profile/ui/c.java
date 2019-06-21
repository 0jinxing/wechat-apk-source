package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.aj.a.j;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.d.a;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.d.b.d;
import com.tencent.mm.aj.d.b.e;
import com.tencent.mm.aj.d.b.g;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.h.a;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.dc;
import com.tencent.mm.g.a.dc.b;
import com.tencent.mm.g.a.dg;
import com.tencent.mm.g.a.dg.b;
import com.tencent.mm.g.a.of;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf.a;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.protocal.protobuf.bbo;
import com.tencent.mm.protocal.protobuf.bos;
import com.tencent.mm.protocal.protobuf.bxr;
import com.tencent.mm.protocal.protobuf.bxs;
import com.tencent.mm.protocal.protobuf.cfr;
import com.tencent.mm.protocal.protobuf.cfs;
import com.tencent.mm.protocal.protobuf.cwa;
import com.tencent.mm.protocal.protobuf.kk;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class c
  implements com.tencent.mm.ai.f, h.a, com.tencent.mm.aj.n, com.tencent.mm.pluginsdk.b.a
{
  MMActivity crP;
  com.tencent.mm.ui.base.preference.f ehK;
  ad ehM;
  private CheckBoxPreference ehV;
  private SharedPreferences ehZ = null;
  private boolean eif;
  private List<d.a> fuX;
  private d.b fuY;
  private boolean fvf = false;
  private String fvh;
  private int gwP;
  boolean isDeleteCancel = false;
  String mGZ;
  com.tencent.mm.aj.d pkW;
  private boolean pli;
  private String pln;
  private boolean pmA = false;
  private boolean pmB = false;
  boolean pmC = false;
  private int pmD = 0;
  private String pmE;
  private boolean pmF;
  com.tencent.mm.ui.widget.a.c pmG = null;
  private Bundle pmH;
  SnsAdClick pmI = null;
  private String pmJ = null;
  private j pmx;
  private List<WxaAttributes.WxaEntryInfo> pmy;
  private uy pmz = null;
  com.tencent.mm.ui.base.p tipDialog = null;

  private c(MMActivity paramMMActivity)
  {
    this.crP = paramMMActivity;
  }

  public c(MMActivity paramMMActivity, String paramString, uy paramuy)
  {
    this(paramMMActivity);
    this.pln = paramString;
    this.pmz = paramuy;
  }

  private String Bc(int paramInt)
  {
    AppMethodBeat.i(23480);
    String str;
    switch (paramInt)
    {
    default:
      ab.w("MicroMsg.ContactWidgetBizInfo", "getVerifyStr, error type %d", new Object[] { Integer.valueOf(paramInt) });
      str = this.crP.getResources().getString(2131298552);
      AppMethodBeat.o(23480);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return str;
      str = this.crP.getResources().getString(2131298745);
      AppMethodBeat.o(23480);
      continue;
      str = this.crP.getResources().getString(2131297755);
      AppMethodBeat.o(23480);
      continue;
      str = this.crP.getResources().getString(2131297756);
      AppMethodBeat.o(23480);
    }
  }

  private static boolean Bd(int paramInt)
  {
    if ((paramInt == 81) || (paramInt == 92) || (paramInt == 93) || (paramInt == 94));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean UQ(String paramString)
  {
    AppMethodBeat.i(23484);
    try
    {
      long l = bo.getLong(paramString, 0L);
      if ((l > 0L) && (l - System.currentTimeMillis() / 1000L < 0L))
      {
        bool = true;
        AppMethodBeat.o(23484);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(23484);
        bool = false;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        AppMethodBeat.o(23484);
        boolean bool = false;
      }
    }
  }

  private void UR(String paramString)
  {
    AppMethodBeat.i(23490);
    ab.d("MicroMsg.ContactWidgetBizInfo", "updateKF %s, %b", new Object[] { paramString, Boolean.valueOf(this.pmF) });
    if (this.pmF)
      AppMethodBeat.o(23490);
    while (true)
    {
      return;
      this.pmE = paramString;
      if ((this.fuY == null) || (!this.fuY.aeq()) || (this.ehM == null))
      {
        this.ehK.ce("contact_info_kf_worker", true);
        AppMethodBeat.o(23490);
      }
      else
      {
        if (!bo.isNullOrNil(paramString))
          break;
        paramString = z.aeQ().rh(this.ehM.field_username);
        if (paramString == null)
        {
          this.ehK.ce("contact_info_kf_worker", true);
          z.aeS().a(this);
          z.aeS().ax(this.ehM.field_username, r.Yz());
          this.pmF = true;
          AppMethodBeat.o(23490);
        }
        else
        {
          ab.d("MicroMsg.ContactWidgetBizInfo", "has default kf %s", new Object[] { paramString.field_openId });
          this.ehK.ce("contact_info_kf_worker", false);
          localObject1 = (IconWidgetPreference)this.ehK.aqO("contact_info_kf_worker");
          ((IconWidgetPreference)localObject1).setSummary(paramString.field_nickname);
          localObject2 = com.tencent.mm.ah.b.a(paramString.field_openId, false, -1);
          if (localObject2 == null)
          {
            c(paramString);
            US(paramString.field_openId);
            AppMethodBeat.o(23490);
          }
          else
          {
            ((IconWidgetPreference)localObject1).O((Bitmap)localObject2);
            AppMethodBeat.o(23490);
          }
        }
      }
    }
    Object localObject1 = z.aeQ();
    Object localObject2 = ((com.tencent.mm.aj.i)localObject1).rg(paramString);
    if ((localObject2 == null) || (com.tencent.mm.aj.i.a((com.tencent.mm.aj.g)localObject2)))
    {
      z.aeS().a(this);
      z.aeS().ay(this.ehM.field_username, paramString);
      this.pmF = true;
    }
    if (localObject2 == null)
      ab.d("MicroMsg.ContactWidgetBizInfo", "no such kf, get default kf");
    for (paramString = ((com.tencent.mm.aj.i)localObject1).rh(this.ehM.field_username); ; paramString = (String)localObject2)
    {
      if (paramString == null)
      {
        this.ehK.ce("contact_info_kf_worker", true);
        AppMethodBeat.o(23490);
        break;
      }
      this.ehK.ce("contact_info_kf_worker", false);
      localObject1 = (IconWidgetPreference)this.ehK.aqO("contact_info_kf_worker");
      ((IconWidgetPreference)localObject1).setSummary(paramString.field_nickname);
      localObject2 = com.tencent.mm.ah.b.a(paramString.field_openId, false, -1);
      if (localObject2 == null)
      {
        c(paramString);
        US(paramString.field_openId);
      }
      while (true)
      {
        ab.d("MicroMsg.ContactWidgetBizInfo", "kf worker %s, %s", new Object[] { paramString.field_openId, paramString.field_nickname });
        AppMethodBeat.o(23490);
        break;
        ((IconWidgetPreference)localObject1).O((Bitmap)localObject2);
      }
    }
  }

  private void US(final String paramString)
  {
    AppMethodBeat.i(23491);
    al.n(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(23466);
        if (c.this.ehK == null)
        {
          ab.w("MicroMsg.ContactWidgetBizInfo", "LazyGetAvatar screen is null");
          AppMethodBeat.o(23466);
        }
        while (true)
        {
          return;
          IconWidgetPreference localIconWidgetPreference = (IconWidgetPreference)c.this.ehK.aqO("contact_info_kf_worker");
          if ((localIconWidgetPreference != null) && (c.this.ehK != null))
          {
            Bitmap localBitmap = com.tencent.mm.ah.b.a(paramString, false, -1);
            if (localBitmap != null)
            {
              ab.d("MicroMsg.ContactWidgetBizInfo", "LazyGetAvatar success %s, update screen", new Object[] { paramString });
              localIconWidgetPreference.O(localBitmap);
              c.this.ehK.notifyDataSetChanged();
            }
          }
          AppMethodBeat.o(23466);
        }
      }
    }
    , 2000L);
    AppMethodBeat.o(23491);
  }

  private static void c(com.tencent.mm.aj.g paramg)
  {
    AppMethodBeat.i(23492);
    long l = System.currentTimeMillis();
    com.tencent.mm.ah.i locali = o.act();
    if (locali.qo(paramg.field_openId) == null)
    {
      com.tencent.mm.ah.h localh = new com.tencent.mm.ah.h();
      localh.username = paramg.field_openId;
      localh.frV = paramg.field_headImgUrl;
      localh.cB(false);
      localh.dtR = 3;
      locali.b(localh);
    }
    o.acv().qa(paramg.field_openId);
    ab.d("MicroMsg.ContactWidgetBizInfo", "downloadKFAvatar, %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(23492);
  }

  // ERROR //
  private void caT()
  {
    // Byte code:
    //   0: sipush 23479
    //   3: invokestatic 116	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 389	com/tencent/mm/plugin/profile/ui/c:biV	()Z
    //   10: pop
    //   11: aload_0
    //   12: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   15: invokeinterface 392 1 0
    //   20: aload_0
    //   21: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   24: ldc_w 393
    //   27: invokeinterface 396 2 0
    //   32: aload_0
    //   33: getfield 86	com/tencent/mm/plugin/profile/ui/c:pmC	Z
    //   36: ifeq +16 -> 52
    //   39: aload_0
    //   40: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   43: ldc_w 398
    //   46: iconst_1
    //   47: invokeinterface 206 3 0
    //   52: aload_0
    //   53: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   56: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   59: invokestatic 404	com/tencent/mm/aj/f:qX	(Ljava/lang/String;)Lcom/tencent/mm/aj/d;
    //   62: astore_1
    //   63: aload_0
    //   64: aconst_null
    //   65: putfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   68: aload_0
    //   69: aconst_null
    //   70: putfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   73: aload_0
    //   74: aconst_null
    //   75: putfield 408	com/tencent/mm/plugin/profile/ui/c:pmy	Ljava/util/List;
    //   78: aload_1
    //   79: ifnull +11 -> 90
    //   82: aload_1
    //   83: iconst_0
    //   84: invokevirtual 414	com/tencent/mm/aj/d:cJ	(Z)Lcom/tencent/mm/aj/d$b;
    //   87: ifnonnull +5010 -> 5097
    //   90: aload_0
    //   91: getfield 78	com/tencent/mm/plugin/profile/ui/c:pmz	Lcom/tencent/mm/protocal/protobuf/uy;
    //   94: ifnull +5003 -> 5097
    //   97: new 410	com/tencent/mm/aj/d
    //   100: dup
    //   101: invokespecial 415	com/tencent/mm/aj/d:<init>	()V
    //   104: astore_1
    //   105: aload_1
    //   106: aload_0
    //   107: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   110: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   113: putfield 416	com/tencent/mm/aj/d:field_username	Ljava/lang/String;
    //   116: aload_1
    //   117: aload_0
    //   118: getfield 78	com/tencent/mm/plugin/profile/ui/c:pmz	Lcom/tencent/mm/protocal/protobuf/uy;
    //   121: getfield 421	com/tencent/mm/protocal/protobuf/uy:gvb	I
    //   124: putfield 424	com/tencent/mm/aj/d:field_brandFlag	I
    //   127: aload_1
    //   128: aload_0
    //   129: getfield 78	com/tencent/mm/plugin/profile/ui/c:pmz	Lcom/tencent/mm/protocal/protobuf/uy;
    //   132: getfield 427	com/tencent/mm/protocal/protobuf/uy:gve	Ljava/lang/String;
    //   135: putfield 430	com/tencent/mm/aj/d:field_brandIconURL	Ljava/lang/String;
    //   138: aload_1
    //   139: aload_0
    //   140: getfield 78	com/tencent/mm/plugin/profile/ui/c:pmz	Lcom/tencent/mm/protocal/protobuf/uy;
    //   143: getfield 433	com/tencent/mm/protocal/protobuf/uy:gvd	Ljava/lang/String;
    //   146: putfield 436	com/tencent/mm/aj/d:field_brandInfo	Ljava/lang/String;
    //   149: aload_1
    //   150: aload_0
    //   151: getfield 78	com/tencent/mm/plugin/profile/ui/c:pmz	Lcom/tencent/mm/protocal/protobuf/uy;
    //   154: getfield 439	com/tencent/mm/protocal/protobuf/uy:gvc	Ljava/lang/String;
    //   157: putfield 442	com/tencent/mm/aj/d:field_extInfo	Ljava/lang/String;
    //   160: aload_1
    //   161: ifnull +79 -> 240
    //   164: aload_1
    //   165: getfield 436	com/tencent/mm/aj/d:field_brandInfo	Ljava/lang/String;
    //   168: ifnonnull +72 -> 240
    //   171: aload_1
    //   172: getfield 442	com/tencent/mm/aj/d:field_extInfo	Ljava/lang/String;
    //   175: ifnonnull +65 -> 240
    //   178: aload_0
    //   179: getfield 78	com/tencent/mm/plugin/profile/ui/c:pmz	Lcom/tencent/mm/protocal/protobuf/uy;
    //   182: ifnull +58 -> 240
    //   185: aload_1
    //   186: aload_0
    //   187: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   190: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   193: putfield 416	com/tencent/mm/aj/d:field_username	Ljava/lang/String;
    //   196: aload_1
    //   197: aload_0
    //   198: getfield 78	com/tencent/mm/plugin/profile/ui/c:pmz	Lcom/tencent/mm/protocal/protobuf/uy;
    //   201: getfield 421	com/tencent/mm/protocal/protobuf/uy:gvb	I
    //   204: putfield 424	com/tencent/mm/aj/d:field_brandFlag	I
    //   207: aload_1
    //   208: aload_0
    //   209: getfield 78	com/tencent/mm/plugin/profile/ui/c:pmz	Lcom/tencent/mm/protocal/protobuf/uy;
    //   212: getfield 427	com/tencent/mm/protocal/protobuf/uy:gve	Ljava/lang/String;
    //   215: putfield 430	com/tencent/mm/aj/d:field_brandIconURL	Ljava/lang/String;
    //   218: aload_1
    //   219: aload_0
    //   220: getfield 78	com/tencent/mm/plugin/profile/ui/c:pmz	Lcom/tencent/mm/protocal/protobuf/uy;
    //   223: getfield 433	com/tencent/mm/protocal/protobuf/uy:gvd	Ljava/lang/String;
    //   226: putfield 436	com/tencent/mm/aj/d:field_brandInfo	Ljava/lang/String;
    //   229: aload_1
    //   230: aload_0
    //   231: getfield 78	com/tencent/mm/plugin/profile/ui/c:pmz	Lcom/tencent/mm/protocal/protobuf/uy;
    //   234: getfield 439	com/tencent/mm/protocal/protobuf/uy:gvc	Ljava/lang/String;
    //   237: putfield 442	com/tencent/mm/aj/d:field_extInfo	Ljava/lang/String;
    //   240: aload_0
    //   241: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   244: ldc_w 444
    //   247: invokeinterface 257 2 0
    //   252: checkcast 446	com/tencent/mm/plugin/profile/ui/BizInfoHeaderPreference
    //   255: astore_2
    //   256: aload_2
    //   257: ifnull +1244 -> 1501
    //   260: aload_0
    //   261: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   264: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   267: invokestatic 209	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   270: ifne +1231 -> 1501
    //   273: aload_2
    //   274: aload_0
    //   275: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   278: aload_0
    //   279: getfield 108	com/tencent/mm/plugin/profile/ui/c:pln	Ljava/lang/String;
    //   282: aload_1
    //   283: invokevirtual 449	com/tencent/mm/plugin/profile/ui/BizInfoHeaderPreference:a	(Lcom/tencent/mm/storage/ad;Ljava/lang/String;Lcom/tencent/mm/aj/d;)V
    //   286: aload_0
    //   287: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   290: ldc_w 451
    //   293: iconst_1
    //   294: invokeinterface 206 3 0
    //   299: aload_0
    //   300: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   303: ldc_w 453
    //   306: iconst_1
    //   307: invokeinterface 206 3 0
    //   312: aload_0
    //   313: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   316: ldc_w 455
    //   319: iconst_1
    //   320: invokeinterface 206 3 0
    //   325: aload_0
    //   326: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   329: ldc_w 457
    //   332: iconst_1
    //   333: invokeinterface 206 3 0
    //   338: aload_1
    //   339: ifnull +1836 -> 2175
    //   342: aload_1
    //   343: invokevirtual 460	com/tencent/mm/aj/d:adQ	()Z
    //   346: ifeq +1455 -> 1801
    //   349: aload_0
    //   350: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   353: ldc_w 462
    //   356: iconst_1
    //   357: invokeinterface 206 3 0
    //   362: aload_0
    //   363: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   366: ldc_w 464
    //   369: iconst_1
    //   370: invokeinterface 206 3 0
    //   375: aload_0
    //   376: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   379: ldc_w 466
    //   382: iconst_0
    //   383: invokeinterface 206 3 0
    //   388: aload_0
    //   389: aload_0
    //   390: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   393: invokevirtual 471	com/tencent/mm/storage/ad:DX	()Z
    //   396: putfield 473	com/tencent/mm/plugin/profile/ui/c:eif	Z
    //   399: aload_1
    //   400: invokevirtual 476	com/tencent/mm/aj/d:adR	()Z
    //   403: ifeq +1127 -> 1530
    //   406: aload_0
    //   407: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   410: ldc_w 478
    //   413: iconst_1
    //   414: invokeinterface 206 3 0
    //   419: aload_0
    //   420: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   423: astore_2
    //   424: aload_0
    //   425: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   428: getfield 481	com/tencent/mm/g/c/ap:field_type	I
    //   431: invokestatic 486	com/tencent/mm/n/a:jh	(I)Z
    //   434: ifne +1091 -> 1525
    //   437: iconst_1
    //   438: istore_3
    //   439: aload_2
    //   440: ldc_w 457
    //   443: iload_3
    //   444: invokeinterface 206 3 0
    //   449: aload_0
    //   450: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   453: ldc_w 457
    //   456: invokeinterface 257 2 0
    //   461: checkcast 488	com/tencent/mm/ui/base/preference/CheckBoxPreference
    //   464: astore_2
    //   465: aload_2
    //   466: aload_0
    //   467: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   470: invokevirtual 491	com/tencent/mm/storage/ad:Oe	()Z
    //   473: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   476: aload_2
    //   477: ldc_w 495
    //   480: invokevirtual 498	com/tencent/mm/ui/base/preference/CheckBoxPreference:setTitle	(I)V
    //   483: aload_0
    //   484: invokespecial 501	com/tencent/mm/plugin/profile/ui/c:caY	()V
    //   487: aload_0
    //   488: aload_0
    //   489: getfield 473	com/tencent/mm/plugin/profile/ui/c:eif	Z
    //   492: invokespecial 504	com/tencent/mm/plugin/profile/ui/c:jO	(Z)V
    //   495: aload_0
    //   496: aload_1
    //   497: putfield 506	com/tencent/mm/plugin/profile/ui/c:pkW	Lcom/tencent/mm/aj/d;
    //   500: aload_0
    //   501: aload_1
    //   502: invokevirtual 510	com/tencent/mm/aj/d:adY	()Ljava/util/List;
    //   505: putfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   508: aload_0
    //   509: aload_1
    //   510: iconst_0
    //   511: invokevirtual 414	com/tencent/mm/aj/d:cJ	(Z)Lcom/tencent/mm/aj/d$b;
    //   514: putfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   517: aload_0
    //   518: aload_0
    //   519: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   522: invokevirtual 513	com/tencent/mm/aj/d$b:getWxaEntryInfoList	()Ljava/util/List;
    //   525: putfield 408	com/tencent/mm/plugin/profile/ui/c:pmy	Ljava/util/List;
    //   528: aload_0
    //   529: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   532: invokevirtual 516	com/tencent/mm/aj/d$b:adZ	()Z
    //   535: ifeq +1576 -> 2111
    //   538: aload_0
    //   539: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   542: ldc_w 518
    //   545: invokeinterface 257 2 0
    //   550: ldc_w 519
    //   553: invokevirtual 523	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   556: aload_0
    //   557: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   560: invokevirtual 526	com/tencent/mm/aj/d$b:aef	()Ljava/lang/String;
    //   563: ifnull +1580 -> 2143
    //   566: aload_0
    //   567: iconst_1
    //   568: putfield 82	com/tencent/mm/plugin/profile/ui/c:pmB	Z
    //   571: aload_0
    //   572: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   575: invokevirtual 526	com/tencent/mm/aj/d$b:aef	()Ljava/lang/String;
    //   578: invokestatic 528	com/tencent/mm/plugin/profile/ui/c:UQ	(Ljava/lang/String;)Z
    //   581: ifeq +1546 -> 2127
    //   584: aload_0
    //   585: iconst_1
    //   586: putfield 80	com/tencent/mm/plugin/profile/ui/c:pmA	Z
    //   589: aload_0
    //   590: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   593: getfield 481	com/tencent/mm/g/c/ap:field_type	I
    //   596: invokestatic 486	com/tencent/mm/n/a:jh	(I)Z
    //   599: ifne +1528 -> 2127
    //   602: ldc 118
    //   604: ldc_w 530
    //   607: iconst_1
    //   608: anewarray 4	java/lang/Object
    //   611: dup
    //   612: iconst_0
    //   613: aload_0
    //   614: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   617: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   620: aastore
    //   621: invokestatic 132	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   624: aload_0
    //   625: invokespecial 533	com/tencent/mm/plugin/profile/ui/c:caU	()V
    //   628: aload_0
    //   629: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   632: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   635: invokestatic 538	com/tencent/mm/model/t:nG	(Ljava/lang/String;)Z
    //   638: ifne +16 -> 654
    //   641: aload_0
    //   642: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   645: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   648: invokestatic 541	com/tencent/mm/model/t:nQ	(Ljava/lang/String;)Z
    //   651: ifeq +7 -> 658
    //   654: aload_0
    //   655: invokespecial 533	com/tencent/mm/plugin/profile/ui/c:caU	()V
    //   658: aload_0
    //   659: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   662: invokevirtual 544	com/tencent/mm/aj/d$b:aec	()Ljava/lang/String;
    //   665: ifnull +27 -> 692
    //   668: aload_0
    //   669: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   672: invokevirtual 544	com/tencent/mm/aj/d$b:aec	()Ljava/lang/String;
    //   675: invokevirtual 550	java/lang/String:length	()I
    //   678: ifle +14 -> 692
    //   681: aload_0
    //   682: aload_0
    //   683: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   686: invokevirtual 544	com/tencent/mm/aj/d$b:aec	()Ljava/lang/String;
    //   689: putfield 552	com/tencent/mm/plugin/profile/ui/c:fvh	Ljava/lang/String;
    //   692: aload_0
    //   693: aload_0
    //   694: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   697: invokevirtual 555	com/tencent/mm/aj/d$b:aea	()Z
    //   700: putfield 84	com/tencent/mm/plugin/profile/ui/c:fvf	Z
    //   703: aload_0
    //   704: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   707: invokevirtual 558	com/tencent/mm/aj/d$b:aep	()Ljava/lang/String;
    //   710: invokestatic 209	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   713: ifne +1446 -> 2159
    //   716: aload_0
    //   717: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   720: ldc_w 560
    //   723: iconst_0
    //   724: invokeinterface 206 3 0
    //   729: aload_0
    //   730: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   733: ldc_w 560
    //   736: invokeinterface 257 2 0
    //   741: astore_2
    //   742: aload_2
    //   743: ifnull +31 -> 774
    //   746: aload_2
    //   747: aload_0
    //   748: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   751: invokevirtual 558	com/tencent/mm/aj/d$b:aep	()Ljava/lang/String;
    //   754: invokevirtual 561	com/tencent/mm/ui/base/preference/Preference:setSummary	(Ljava/lang/CharSequence;)V
    //   757: aload_2
    //   758: aload_0
    //   759: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   762: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   765: ldc_w 562
    //   768: invokevirtual 566	android/content/res/Resources:getColor	(I)I
    //   771: putfield 569	com/tencent/mm/ui/base/preference/Preference:ksd	I
    //   774: aload_0
    //   775: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   778: getfield 572	com/tencent/mm/g/c/ap:signature	Ljava/lang/String;
    //   781: invokestatic 209	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   784: ifne +1564 -> 2348
    //   787: aload_0
    //   788: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   791: ldc_w 574
    //   794: invokeinterface 257 2 0
    //   799: checkcast 576	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   802: astore 4
    //   804: aload 4
    //   806: ifnull +35 -> 841
    //   809: aload_0
    //   810: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   813: getfield 572	com/tencent/mm/g/c/ap:signature	Ljava/lang/String;
    //   816: invokestatic 580	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   819: invokevirtual 583	java/lang/String:trim	()Ljava/lang/String;
    //   822: invokevirtual 550	java/lang/String:length	()I
    //   825: ifgt +1374 -> 2199
    //   828: aload_0
    //   829: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   832: ldc_w 574
    //   835: iconst_1
    //   836: invokeinterface 206 3 0
    //   841: aload_0
    //   842: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   845: ifnull +1627 -> 2472
    //   848: aload_0
    //   849: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   852: invokevirtual 587	com/tencent/mm/aj/d$b:aek	()Lcom/tencent/mm/aj/d$b$d;
    //   855: ifnull +1617 -> 2472
    //   858: aload_0
    //   859: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   862: invokevirtual 587	com/tencent/mm/aj/d$b:aek	()Lcom/tencent/mm/aj/d$b$d;
    //   865: getfield 592	com/tencent/mm/aj/d$b$d:fvS	Ljava/lang/String;
    //   868: invokestatic 209	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   871: ifne +1601 -> 2472
    //   874: aload_0
    //   875: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   878: invokevirtual 587	com/tencent/mm/aj/d$b:aek	()Lcom/tencent/mm/aj/d$b$d;
    //   881: astore 5
    //   883: aload_0
    //   884: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   887: ldc_w 594
    //   890: invokeinterface 257 2 0
    //   895: checkcast 576	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   898: astore 6
    //   900: aload 6
    //   902: ifnull +1554 -> 2456
    //   905: aload 6
    //   907: iconst_0
    //   908: putfield 597	com/tencent/mm/ui/base/preference/KeyValuePreference:yCj	Z
    //   911: aload 5
    //   913: getfield 600	com/tencent/mm/aj/d$b$d:fvT	Ljava/lang/String;
    //   916: invokestatic 209	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   919: ifeq +1473 -> 2392
    //   922: aload 6
    //   924: aload_0
    //   925: aload 5
    //   927: getfield 603	com/tencent/mm/aj/d$b$d:fvR	I
    //   930: invokespecial 605	com/tencent/mm/plugin/profile/ui/c:Bc	(I)Ljava/lang/String;
    //   933: putfield 608	com/tencent/mm/ui/base/preference/KeyValuePreference:ylA	Ljava/lang/String;
    //   936: getstatic 614	com/tencent/mm/model/ao$a:flw	Lcom/tencent/mm/model/ao$c;
    //   939: ifnull +1466 -> 2405
    //   942: getstatic 614	com/tencent/mm/model/ao$a:flw	Lcom/tencent/mm/model/ao$c;
    //   945: aload_0
    //   946: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   949: getfield 617	com/tencent/mm/g/c/ap:field_verifyFlag	I
    //   952: invokeinterface 622 2 0
    //   957: fconst_2
    //   958: invokestatic 627	com/tencent/mm/sdk/platformtools/BackwardSupportUtil$b:i	(Ljava/lang/String;F)Landroid/graphics/Bitmap;
    //   961: astore_2
    //   962: aload_2
    //   963: ifnull +4123 -> 5086
    //   966: new 629	android/graphics/drawable/BitmapDrawable
    //   969: dup
    //   970: aload_0
    //   971: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   974: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   977: aload_2
    //   978: invokespecial 632	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   981: astore 4
    //   983: aload_2
    //   984: ifnonnull +1426 -> 2410
    //   987: iconst_1
    //   988: istore_3
    //   989: ldc 118
    //   991: ldc_w 634
    //   994: iconst_1
    //   995: anewarray 4	java/lang/Object
    //   998: dup
    //   999: iconst_0
    //   1000: iload_3
    //   1001: invokestatic 181	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1004: aastore
    //   1005: invokestatic 636	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1008: aload 6
    //   1010: aload 4
    //   1012: putfield 640	com/tencent/mm/ui/base/preference/KeyValuePreference:yCr	Landroid/graphics/drawable/Drawable;
    //   1015: aload 5
    //   1017: getfield 592	com/tencent/mm/aj/d$b$d:fvS	Ljava/lang/String;
    //   1020: ifnull +1425 -> 2445
    //   1023: aload 5
    //   1025: getfield 643	com/tencent/mm/aj/d$b$d:fvV	Ljava/lang/String;
    //   1028: astore 7
    //   1030: aload_0
    //   1031: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1034: aload 5
    //   1036: getfield 592	com/tencent/mm/aj/d$b$d:fvS	Ljava/lang/String;
    //   1039: invokevirtual 583	java/lang/String:trim	()Ljava/lang/String;
    //   1042: invokestatic 648	com/tencent/mm/pluginsdk/ui/e/j:b	(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/text/SpannableString;
    //   1045: astore 4
    //   1047: aload 7
    //   1049: invokestatic 209	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1052: ifne +4028 -> 5080
    //   1055: new 650	android/text/SpannableString
    //   1058: astore_2
    //   1059: new 652	java/lang/StringBuilder
    //   1062: astore 5
    //   1064: aload 5
    //   1066: invokespecial 653	java/lang/StringBuilder:<init>	()V
    //   1069: aload_2
    //   1070: aload 5
    //   1072: aload 7
    //   1074: invokevirtual 657	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1077: ldc_w 659
    //   1080: invokevirtual 657	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1083: aload 4
    //   1085: invokevirtual 662	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1088: invokevirtual 665	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1091: invokespecial 667	android/text/SpannableString:<init>	(Ljava/lang/CharSequence;)V
    //   1094: new 669	android/text/style/ForegroundColorSpan
    //   1097: astore 4
    //   1099: aload 4
    //   1101: ldc_w 670
    //   1104: invokespecial 672	android/text/style/ForegroundColorSpan:<init>	(I)V
    //   1107: aload_2
    //   1108: aload 4
    //   1110: iconst_0
    //   1111: aload 7
    //   1113: invokevirtual 550	java/lang/String:length	()I
    //   1116: bipush 17
    //   1118: invokevirtual 676	android/text/SpannableString:setSpan	(Ljava/lang/Object;III)V
    //   1121: aload 6
    //   1123: aload_2
    //   1124: invokevirtual 677	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   1127: aload_0
    //   1128: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   1131: ifnull +1445 -> 2576
    //   1134: aload_0
    //   1135: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   1138: invokevirtual 680	com/tencent/mm/aj/d$b:aee	()Ljava/lang/String;
    //   1141: invokestatic 209	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1144: ifne +1432 -> 2576
    //   1147: aload_0
    //   1148: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1151: ldc_w 682
    //   1154: invokeinterface 257 2 0
    //   1159: checkcast 576	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   1162: astore 4
    //   1164: aload 4
    //   1166: ifnull +117 -> 1283
    //   1169: aload 4
    //   1171: iconst_0
    //   1172: putfield 597	com/tencent/mm/ui/base/preference/KeyValuePreference:yCj	Z
    //   1175: getstatic 614	com/tencent/mm/model/ao$a:flw	Lcom/tencent/mm/model/ao$c;
    //   1178: ifnull +1388 -> 2566
    //   1181: ldc_w 683
    //   1184: invokestatic 689	com/tencent/mm/sdk/platformtools/d:LV	(I)Landroid/graphics/Bitmap;
    //   1187: astore_2
    //   1188: aload_2
    //   1189: ifnonnull +1382 -> 2571
    //   1192: iconst_1
    //   1193: istore_3
    //   1194: ldc 118
    //   1196: ldc_w 691
    //   1199: iconst_1
    //   1200: anewarray 4	java/lang/Object
    //   1203: dup
    //   1204: iconst_0
    //   1205: iload_3
    //   1206: invokestatic 181	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   1209: aastore
    //   1210: invokestatic 636	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1213: aload_2
    //   1214: ifnull +3861 -> 5075
    //   1217: new 629	android/graphics/drawable/BitmapDrawable
    //   1220: dup
    //   1221: aload_0
    //   1222: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1225: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   1228: aload_2
    //   1229: invokespecial 632	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   1232: astore_2
    //   1233: aload 4
    //   1235: aload_2
    //   1236: putfield 640	com/tencent/mm/ui/base/preference/KeyValuePreference:yCr	Landroid/graphics/drawable/Drawable;
    //   1239: aload 4
    //   1241: aload_0
    //   1242: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   1245: invokevirtual 680	com/tencent/mm/aj/d$b:aee	()Ljava/lang/String;
    //   1248: invokevirtual 677	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   1251: ldc 118
    //   1253: ldc_w 693
    //   1256: iconst_2
    //   1257: anewarray 4	java/lang/Object
    //   1260: dup
    //   1261: iconst_0
    //   1262: aload_0
    //   1263: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   1266: invokevirtual 680	com/tencent/mm/aj/d$b:aee	()Ljava/lang/String;
    //   1269: aastore
    //   1270: dup
    //   1271: iconst_1
    //   1272: aload_0
    //   1273: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   1276: invokevirtual 696	com/tencent/mm/aj/d$b:aed	()Ljava/lang/String;
    //   1279: aastore
    //   1280: invokestatic 184	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1283: aload_0
    //   1284: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   1287: ifnull +1313 -> 2600
    //   1290: aload_0
    //   1291: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   1294: invokevirtual 699	com/tencent/mm/aj/d$b:aeg	()Ljava/util/List;
    //   1297: ifnull +1303 -> 2600
    //   1300: aload_0
    //   1301: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   1304: invokevirtual 699	com/tencent/mm/aj/d$b:aeg	()Ljava/util/List;
    //   1307: invokeinterface 704 1 0
    //   1312: ifle +1288 -> 2600
    //   1315: aload_0
    //   1316: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1319: ldc_w 706
    //   1322: invokeinterface 257 2 0
    //   1327: checkcast 576	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   1330: astore 4
    //   1332: aload 4
    //   1334: iconst_0
    //   1335: invokevirtual 709	com/tencent/mm/ui/base/preference/KeyValuePreference:qi	(Z)V
    //   1338: aload 4
    //   1340: invokevirtual 712	com/tencent/mm/ui/base/preference/KeyValuePreference:dAC	()V
    //   1343: aload_0
    //   1344: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   1347: invokevirtual 699	com/tencent/mm/aj/d$b:aeg	()Ljava/util/List;
    //   1350: invokeinterface 716 1 0
    //   1355: astore 6
    //   1357: aload 6
    //   1359: invokeinterface 721 1 0
    //   1364: ifeq +1249 -> 2613
    //   1367: aload 6
    //   1369: invokeinterface 725 1 0
    //   1374: checkcast 727	com/tencent/mm/aj/d$b$f
    //   1377: astore 7
    //   1379: aload_0
    //   1380: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1383: ldc_w 728
    //   1386: aconst_null
    //   1387: invokestatic 734	android/view/View:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   1390: checkcast 736	android/widget/LinearLayout
    //   1393: astore 5
    //   1395: aload 5
    //   1397: ldc_w 737
    //   1400: invokevirtual 741	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   1403: checkcast 743	android/widget/ImageView
    //   1406: new 745	com/tencent/mm/plugin/profile/ui/b/c
    //   1409: dup
    //   1410: aload_0
    //   1411: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1414: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   1417: aload 7
    //   1419: getfield 748	com/tencent/mm/aj/d$b$f:iconUrl	Ljava/lang/String;
    //   1422: invokespecial 751	com/tencent/mm/plugin/profile/ui/b/c:<init>	(Landroid/content/res/Resources;Ljava/lang/String;)V
    //   1425: invokevirtual 755	android/widget/ImageView:setImageDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   1428: aload 7
    //   1430: getfield 758	com/tencent/mm/aj/d$b$f:description	Ljava/lang/String;
    //   1433: astore_2
    //   1434: aload_0
    //   1435: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1438: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   1441: aload 7
    //   1443: getfield 761	com/tencent/mm/aj/d$b$f:fwa	Ljava/lang/String;
    //   1446: ldc_w 763
    //   1449: aload_0
    //   1450: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1453: invokevirtual 766	com/tencent/mm/ui/MMActivity:getPackageName	()Ljava/lang/String;
    //   1456: invokevirtual 770	android/content/res/Resources:getIdentifier	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   1459: istore 8
    //   1461: iload 8
    //   1463: ifle +13 -> 1476
    //   1466: aload_0
    //   1467: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1470: iload 8
    //   1472: invokevirtual 771	com/tencent/mm/ui/MMActivity:getString	(I)Ljava/lang/String;
    //   1475: astore_2
    //   1476: aload 5
    //   1478: ldc_w 772
    //   1481: invokevirtual 741	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   1484: checkcast 774	android/widget/TextView
    //   1487: aload_2
    //   1488: invokevirtual 777	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1491: aload 4
    //   1493: aload 5
    //   1495: invokevirtual 781	com/tencent/mm/ui/base/preference/KeyValuePreference:eI	(Landroid/view/View;)V
    //   1498: goto -141 -> 1357
    //   1501: ldc 118
    //   1503: ldc_w 783
    //   1506: invokestatic 785	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1509: aload_0
    //   1510: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1513: ldc_w 444
    //   1516: iconst_1
    //   1517: invokeinterface 206 3 0
    //   1522: goto -1236 -> 286
    //   1525: iconst_0
    //   1526: istore_3
    //   1527: goto -1088 -> 439
    //   1530: aload_0
    //   1531: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1534: ldc_w 787
    //   1537: iconst_1
    //   1538: invokeinterface 206 3 0
    //   1543: aload_0
    //   1544: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1547: ldc_w 478
    //   1550: iconst_1
    //   1551: invokeinterface 206 3 0
    //   1556: aload_1
    //   1557: invokevirtual 790	com/tencent/mm/aj/d:adH	()Z
    //   1560: ifeq +129 -> 1689
    //   1563: aload_0
    //   1564: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1567: ldc_w 453
    //   1570: iconst_1
    //   1571: invokeinterface 206 3 0
    //   1576: aload_0
    //   1577: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1580: ldc_w 455
    //   1583: iconst_0
    //   1584: invokeinterface 206 3 0
    //   1589: aload_0
    //   1590: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1593: ldc_w 455
    //   1596: invokeinterface 257 2 0
    //   1601: ldc_w 791
    //   1604: invokevirtual 792	com/tencent/mm/ui/base/preference/Preference:setTitle	(I)V
    //   1607: aload_0
    //   1608: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1611: ldc_w 466
    //   1614: iconst_0
    //   1615: invokeinterface 206 3 0
    //   1620: aload_0
    //   1621: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1624: ldc_w 451
    //   1627: iconst_0
    //   1628: invokeinterface 206 3 0
    //   1633: aload_0
    //   1634: aload_0
    //   1635: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1638: ldc_w 451
    //   1641: invokeinterface 257 2 0
    //   1646: checkcast 488	com/tencent/mm/ui/base/preference/CheckBoxPreference
    //   1649: putfield 794	com/tencent/mm/plugin/profile/ui/c:ehV	Lcom/tencent/mm/ui/base/preference/CheckBoxPreference;
    //   1652: aload_0
    //   1653: getfield 794	com/tencent/mm/plugin/profile/ui/c:ehV	Lcom/tencent/mm/ui/base/preference/CheckBoxPreference;
    //   1656: ldc_w 795
    //   1659: invokevirtual 498	com/tencent/mm/ui/base/preference/CheckBoxPreference:setTitle	(I)V
    //   1662: aload_0
    //   1663: invokespecial 501	com/tencent/mm/plugin/profile/ui/c:caY	()V
    //   1666: aload_1
    //   1667: invokevirtual 798	com/tencent/mm/aj/d:adS	()Z
    //   1670: ifeq -1183 -> 487
    //   1673: aload_0
    //   1674: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1677: ldc_w 800
    //   1680: iconst_1
    //   1681: invokeinterface 206 3 0
    //   1686: goto -1199 -> 487
    //   1689: aload_0
    //   1690: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1693: ldc_w 453
    //   1696: iconst_0
    //   1697: invokeinterface 206 3 0
    //   1702: aload_0
    //   1703: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1706: ldc_w 455
    //   1709: iconst_1
    //   1710: invokeinterface 206 3 0
    //   1715: aload_0
    //   1716: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1719: ldc_w 453
    //   1722: invokeinterface 257 2 0
    //   1727: checkcast 802	com/tencent/mm/pluginsdk/ui/preference/ButtonPreference
    //   1730: aload_0
    //   1731: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1734: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   1737: ldc_w 803
    //   1740: invokevirtual 144	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   1743: aload_0
    //   1744: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1747: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   1750: ldc_w 804
    //   1753: invokevirtual 566	android/content/res/Resources:getColor	(I)I
    //   1756: invokevirtual 808	com/tencent/mm/pluginsdk/ui/preference/ButtonPreference:ed	(Ljava/lang/String;I)V
    //   1759: aload_0
    //   1760: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1763: ldc_w 466
    //   1766: iconst_1
    //   1767: invokeinterface 206 3 0
    //   1772: aload_0
    //   1773: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1776: ldc_w 451
    //   1779: iconst_1
    //   1780: invokeinterface 206 3 0
    //   1785: aload_0
    //   1786: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1789: ldc_w 800
    //   1792: iconst_1
    //   1793: invokeinterface 206 3 0
    //   1798: goto -1311 -> 487
    //   1801: aload_1
    //   1802: invokevirtual 811	com/tencent/mm/aj/d:adP	()Z
    //   1805: ifeq +212 -> 2017
    //   1808: aload_0
    //   1809: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1812: ldc_w 800
    //   1815: iconst_1
    //   1816: invokeinterface 206 3 0
    //   1821: aload_0
    //   1822: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1825: ldc_w 787
    //   1828: iconst_0
    //   1829: invokeinterface 206 3 0
    //   1834: aload_0
    //   1835: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1838: ldc_w 813
    //   1841: iconst_0
    //   1842: invokeinterface 206 3 0
    //   1847: aload_0
    //   1848: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1851: ldc_w 478
    //   1854: invokeinterface 257 2 0
    //   1859: checkcast 802	com/tencent/mm/pluginsdk/ui/preference/ButtonPreference
    //   1862: aload_0
    //   1863: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1866: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   1869: ldc_w 814
    //   1872: invokevirtual 144	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   1875: aload_0
    //   1876: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   1879: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   1882: ldc_w 804
    //   1885: invokevirtual 566	android/content/res/Resources:getColor	(I)I
    //   1888: invokevirtual 808	com/tencent/mm/pluginsdk/ui/preference/ButtonPreference:ed	(Ljava/lang/String;I)V
    //   1891: aload_0
    //   1892: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1895: astore_2
    //   1896: aload_0
    //   1897: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   1900: getfield 481	com/tencent/mm/g/c/ap:field_type	I
    //   1903: invokestatic 486	com/tencent/mm/n/a:jh	(I)Z
    //   1906: ifne +106 -> 2012
    //   1909: iconst_1
    //   1910: istore_3
    //   1911: aload_2
    //   1912: ldc_w 457
    //   1915: iload_3
    //   1916: invokeinterface 206 3 0
    //   1921: aload_0
    //   1922: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1925: ldc_w 457
    //   1928: invokeinterface 257 2 0
    //   1933: checkcast 488	com/tencent/mm/ui/base/preference/CheckBoxPreference
    //   1936: astore_2
    //   1937: aload_2
    //   1938: aload_0
    //   1939: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   1942: invokevirtual 491	com/tencent/mm/storage/ad:Oe	()Z
    //   1945: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   1948: aload_2
    //   1949: ldc_w 815
    //   1952: invokevirtual 498	com/tencent/mm/ui/base/preference/CheckBoxPreference:setTitle	(I)V
    //   1955: aload_0
    //   1956: invokespecial 501	com/tencent/mm/plugin/profile/ui/c:caY	()V
    //   1959: aload_0
    //   1960: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1963: ldc_w 466
    //   1966: iconst_1
    //   1967: invokeinterface 206 3 0
    //   1972: aload_0
    //   1973: aload_0
    //   1974: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   1977: invokevirtual 471	com/tencent/mm/storage/ad:DX	()Z
    //   1980: putfield 473	com/tencent/mm/plugin/profile/ui/c:eif	Z
    //   1983: aload_0
    //   1984: aload_0
    //   1985: getfield 473	com/tencent/mm/plugin/profile/ui/c:eif	Z
    //   1988: invokespecial 504	com/tencent/mm/plugin/profile/ui/c:jO	(Z)V
    //   1991: aload_0
    //   1992: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1995: ldc_w 466
    //   1998: invokeinterface 257 2 0
    //   2003: ldc_w 816
    //   2006: invokevirtual 523	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   2009: goto -1514 -> 495
    //   2012: iconst_0
    //   2013: istore_3
    //   2014: goto -103 -> 1911
    //   2017: aload_0
    //   2018: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2021: astore_2
    //   2022: aload_0
    //   2023: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   2026: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   2029: invokestatic 819	com/tencent/mm/model/t:nl	(Ljava/lang/String;)Z
    //   2032: ifne +16 -> 2048
    //   2035: aload_0
    //   2036: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   2039: getfield 481	com/tencent/mm/g/c/ap:field_type	I
    //   2042: invokestatic 486	com/tencent/mm/n/a:jh	(I)Z
    //   2045: ifne +61 -> 2106
    //   2048: iconst_1
    //   2049: istore_3
    //   2050: aload_2
    //   2051: ldc_w 457
    //   2054: iload_3
    //   2055: invokeinterface 206 3 0
    //   2060: aload_0
    //   2061: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2064: ldc_w 457
    //   2067: invokeinterface 257 2 0
    //   2072: checkcast 488	com/tencent/mm/ui/base/preference/CheckBoxPreference
    //   2075: aload_0
    //   2076: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   2079: invokevirtual 491	com/tencent/mm/storage/ad:Oe	()Z
    //   2082: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   2085: aload_0
    //   2086: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2089: ldc_w 466
    //   2092: iconst_1
    //   2093: invokeinterface 206 3 0
    //   2098: aload_0
    //   2099: iconst_0
    //   2100: putfield 473	com/tencent/mm/plugin/profile/ui/c:eif	Z
    //   2103: goto -1608 -> 495
    //   2106: iconst_0
    //   2107: istore_3
    //   2108: goto -58 -> 2050
    //   2111: aload_0
    //   2112: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2115: ldc_w 518
    //   2118: iconst_1
    //   2119: invokeinterface 206 3 0
    //   2124: goto -1568 -> 556
    //   2127: aload_0
    //   2128: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2131: ldc_w 398
    //   2134: iconst_1
    //   2135: invokeinterface 206 3 0
    //   2140: goto -1512 -> 628
    //   2143: aload_0
    //   2144: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2147: ldc_w 398
    //   2150: iconst_1
    //   2151: invokeinterface 206 3 0
    //   2156: goto -1498 -> 658
    //   2159: aload_0
    //   2160: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2163: ldc_w 560
    //   2166: iconst_1
    //   2167: invokeinterface 206 3 0
    //   2172: goto -1398 -> 774
    //   2175: aload_0
    //   2176: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2179: ldc_w 398
    //   2182: iconst_1
    //   2183: invokeinterface 206 3 0
    //   2188: ldc 118
    //   2190: ldc_w 821
    //   2193: invokestatic 824	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   2196: goto -1422 -> 774
    //   2199: aload 4
    //   2201: iconst_0
    //   2202: putfield 597	com/tencent/mm/ui/base/preference/KeyValuePreference:yCj	Z
    //   2205: aload 4
    //   2207: aload_0
    //   2208: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   2211: ldc 139
    //   2213: invokevirtual 771	com/tencent/mm/ui/MMActivity:getString	(I)Ljava/lang/String;
    //   2216: putfield 608	com/tencent/mm/ui/base/preference/KeyValuePreference:ylA	Ljava/lang/String;
    //   2219: aload 4
    //   2221: aload_0
    //   2222: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   2225: aload_0
    //   2226: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   2229: getfield 572	com/tencent/mm/g/c/ap:signature	Ljava/lang/String;
    //   2232: invokestatic 648	com/tencent/mm/pluginsdk/ui/e/j:b	(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/text/SpannableString;
    //   2235: invokevirtual 677	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   2238: aload 4
    //   2240: iconst_0
    //   2241: invokevirtual 709	com/tencent/mm/ui/base/preference/KeyValuePreference:qi	(Z)V
    //   2244: getstatic 614	com/tencent/mm/model/ao$a:flw	Lcom/tencent/mm/model/ao$c;
    //   2247: ifnull +91 -> 2338
    //   2250: getstatic 614	com/tencent/mm/model/ao$a:flw	Lcom/tencent/mm/model/ao$c;
    //   2253: aload_0
    //   2254: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   2257: getfield 617	com/tencent/mm/g/c/ap:field_verifyFlag	I
    //   2260: invokeinterface 622 2 0
    //   2265: fconst_2
    //   2266: invokestatic 627	com/tencent/mm/sdk/platformtools/BackwardSupportUtil$b:i	(Ljava/lang/String;F)Landroid/graphics/Bitmap;
    //   2269: astore_2
    //   2270: aload_2
    //   2271: ifnonnull +72 -> 2343
    //   2274: iconst_1
    //   2275: istore_3
    //   2276: ldc 118
    //   2278: ldc_w 634
    //   2281: iconst_1
    //   2282: anewarray 4	java/lang/Object
    //   2285: dup
    //   2286: iconst_0
    //   2287: iload_3
    //   2288: invokestatic 181	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   2291: aastore
    //   2292: invokestatic 636	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2295: aload_2
    //   2296: ifnull +2796 -> 5092
    //   2299: new 629	android/graphics/drawable/BitmapDrawable
    //   2302: dup
    //   2303: aload_0
    //   2304: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   2307: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   2310: aload_2
    //   2311: invokespecial 632	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   2314: astore_2
    //   2315: aload 4
    //   2317: aload_2
    //   2318: putfield 640	com/tencent/mm/ui/base/preference/KeyValuePreference:yCr	Landroid/graphics/drawable/Drawable;
    //   2321: aload 4
    //   2323: bipush 8
    //   2325: putfield 827	com/tencent/mm/ui/base/preference/KeyValuePreference:yCp	I
    //   2328: aload 4
    //   2330: bipush 8
    //   2332: invokevirtual 830	com/tencent/mm/ui/base/preference/KeyValuePreference:NW	(I)V
    //   2335: goto -1494 -> 841
    //   2338: aconst_null
    //   2339: astore_2
    //   2340: goto -70 -> 2270
    //   2343: iconst_0
    //   2344: istore_3
    //   2345: goto -69 -> 2276
    //   2348: ldc 118
    //   2350: ldc_w 832
    //   2353: invokestatic 785	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   2356: aload_0
    //   2357: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2360: ldc_w 574
    //   2363: iconst_1
    //   2364: invokeinterface 206 3 0
    //   2369: aload_0
    //   2370: getfield 80	com/tencent/mm/plugin/profile/ui/c:pmA	Z
    //   2373: ifne -1532 -> 841
    //   2376: aload_0
    //   2377: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2380: ldc_w 398
    //   2383: iconst_1
    //   2384: invokeinterface 206 3 0
    //   2389: goto -1548 -> 841
    //   2392: aload 6
    //   2394: aload 5
    //   2396: getfield 600	com/tencent/mm/aj/d$b$d:fvT	Ljava/lang/String;
    //   2399: putfield 608	com/tencent/mm/ui/base/preference/KeyValuePreference:ylA	Ljava/lang/String;
    //   2402: goto -1466 -> 936
    //   2405: aconst_null
    //   2406: astore_2
    //   2407: goto -1445 -> 962
    //   2410: iconst_0
    //   2411: istore_3
    //   2412: goto -1423 -> 989
    //   2415: astore_2
    //   2416: aload_2
    //   2417: astore 5
    //   2419: aload 4
    //   2421: astore_2
    //   2422: ldc 118
    //   2424: ldc_w 834
    //   2427: iconst_1
    //   2428: anewarray 4	java/lang/Object
    //   2431: dup
    //   2432: iconst_0
    //   2433: aload 5
    //   2435: invokevirtual 837	java/lang/IndexOutOfBoundsException:getMessage	()Ljava/lang/String;
    //   2438: aastore
    //   2439: invokestatic 839	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   2442: goto -1321 -> 1121
    //   2445: ldc 118
    //   2447: ldc_w 841
    //   2450: invokestatic 824	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   2453: goto -1326 -> 1127
    //   2456: aload_0
    //   2457: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2460: ldc_w 594
    //   2463: iconst_1
    //   2464: invokeinterface 206 3 0
    //   2469: goto -1342 -> 1127
    //   2472: aload_0
    //   2473: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   2476: ifnull +66 -> 2542
    //   2479: aload_0
    //   2480: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   2483: invokevirtual 845	com/tencent/mm/aj/d$b:ael	()Lcom/tencent/mm/aj/d$b$g;
    //   2486: ifnull +56 -> 2542
    //   2489: aload_0
    //   2490: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   2493: invokevirtual 845	com/tencent/mm/aj/d$b:ael	()Lcom/tencent/mm/aj/d$b$g;
    //   2496: getfield 850	com/tencent/mm/aj/d$b$g:fwb	Ljava/lang/String;
    //   2499: invokestatic 209	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   2502: ifne +40 -> 2542
    //   2505: aload_0
    //   2506: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2509: ldc_w 594
    //   2512: invokeinterface 257 2 0
    //   2517: checkcast 576	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   2520: astore_2
    //   2521: aload_2
    //   2522: ifnull -1395 -> 1127
    //   2525: aload_2
    //   2526: aload_0
    //   2527: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   2530: invokevirtual 845	com/tencent/mm/aj/d$b:ael	()Lcom/tencent/mm/aj/d$b$g;
    //   2533: getfield 850	com/tencent/mm/aj/d$b$g:fwb	Ljava/lang/String;
    //   2536: invokevirtual 677	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   2539: goto -1412 -> 1127
    //   2542: ldc 118
    //   2544: ldc_w 852
    //   2547: invokestatic 785	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   2550: aload_0
    //   2551: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2554: ldc_w 594
    //   2557: iconst_1
    //   2558: invokeinterface 206 3 0
    //   2563: goto -1436 -> 1127
    //   2566: aconst_null
    //   2567: astore_2
    //   2568: goto -1380 -> 1188
    //   2571: iconst_0
    //   2572: istore_3
    //   2573: goto -1379 -> 1194
    //   2576: ldc 118
    //   2578: ldc_w 854
    //   2581: invokestatic 785	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   2584: aload_0
    //   2585: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2588: ldc_w 682
    //   2591: iconst_1
    //   2592: invokeinterface 206 3 0
    //   2597: goto -1314 -> 1283
    //   2600: aload_0
    //   2601: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2604: ldc_w 706
    //   2607: iconst_1
    //   2608: invokeinterface 206 3 0
    //   2613: aload_0
    //   2614: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2617: ldc_w 856
    //   2620: invokeinterface 860 2 0
    //   2625: istore 9
    //   2627: iload 9
    //   2629: iflt +487 -> 3116
    //   2632: aload_0
    //   2633: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2636: ifnull +480 -> 3116
    //   2639: aload_0
    //   2640: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2643: invokeinterface 704 1 0
    //   2648: ifle +468 -> 3116
    //   2651: aload_0
    //   2652: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2655: invokeinterface 704 1 0
    //   2660: iconst_1
    //   2661: isub
    //   2662: istore 8
    //   2664: iload 8
    //   2666: iflt +458 -> 3124
    //   2669: aload_0
    //   2670: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2673: iload 8
    //   2675: invokeinterface 864 2 0
    //   2680: ifnull +430 -> 3110
    //   2683: aload_0
    //   2684: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   2687: ldc_w 865
    //   2690: invokevirtual 771	com/tencent/mm/ui/MMActivity:getString	(I)Ljava/lang/String;
    //   2693: aload_0
    //   2694: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2697: iload 8
    //   2699: invokeinterface 864 2 0
    //   2704: checkcast 867	com/tencent/mm/aj/d$a
    //   2707: getfield 870	com/tencent/mm/aj/d$a:title	Ljava/lang/String;
    //   2710: invokevirtual 874	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2713: ifeq +10 -> 2723
    //   2716: aload_0
    //   2717: getfield 84	com/tencent/mm/plugin/profile/ui/c:fvf	Z
    //   2720: ifeq +390 -> 3110
    //   2723: aload_0
    //   2724: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2727: iload 8
    //   2729: invokeinterface 864 2 0
    //   2734: checkcast 867	com/tencent/mm/aj/d$a
    //   2737: getfield 870	com/tencent/mm/aj/d$a:title	Ljava/lang/String;
    //   2740: invokestatic 209	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   2743: ifeq +26 -> 2769
    //   2746: aload_0
    //   2747: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2750: iload 8
    //   2752: invokeinterface 864 2 0
    //   2757: checkcast 867	com/tencent/mm/aj/d$a
    //   2760: getfield 877	com/tencent/mm/aj/d$a:fvb	Ljava/lang/String;
    //   2763: invokestatic 209	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   2766: ifne +344 -> 3110
    //   2769: new 521	com/tencent/mm/ui/base/preference/Preference
    //   2772: dup
    //   2773: aload_0
    //   2774: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   2777: invokespecial 880	com/tencent/mm/ui/base/preference/Preference:<init>	(Landroid/content/Context;)V
    //   2780: astore 5
    //   2782: aload 5
    //   2784: ldc_w 882
    //   2787: iload 8
    //   2789: invokestatic 884	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   2792: invokevirtual 887	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   2795: invokevirtual 890	com/tencent/mm/ui/base/preference/Preference:setKey	(Ljava/lang/String;)V
    //   2798: aload_0
    //   2799: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2802: iload 8
    //   2804: invokeinterface 864 2 0
    //   2809: checkcast 867	com/tencent/mm/aj/d$a
    //   2812: getfield 870	com/tencent/mm/aj/d$a:title	Ljava/lang/String;
    //   2815: astore_2
    //   2816: aload_0
    //   2817: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   2820: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   2823: aload_0
    //   2824: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2827: iload 8
    //   2829: invokeinterface 864 2 0
    //   2834: checkcast 867	com/tencent/mm/aj/d$a
    //   2837: getfield 877	com/tencent/mm/aj/d$a:fvb	Ljava/lang/String;
    //   2840: ldc_w 763
    //   2843: aload_0
    //   2844: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   2847: invokevirtual 766	com/tencent/mm/ui/MMActivity:getPackageName	()Ljava/lang/String;
    //   2850: invokevirtual 770	android/content/res/Resources:getIdentifier	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   2853: istore 10
    //   2855: iload 10
    //   2857: ifle +13 -> 2870
    //   2860: aload_0
    //   2861: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   2864: iload 10
    //   2866: invokevirtual 771	com/tencent/mm/ui/MMActivity:getString	(I)Ljava/lang/String;
    //   2869: astore_2
    //   2870: aload_2
    //   2871: astore 4
    //   2873: aload_0
    //   2874: getfield 506	com/tencent/mm/plugin/profile/ui/c:pkW	Lcom/tencent/mm/aj/d;
    //   2877: invokevirtual 893	com/tencent/mm/aj/d:adO	()Z
    //   2880: ifeq +61 -> 2941
    //   2883: ldc_w 895
    //   2886: aload_0
    //   2887: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2890: iload 8
    //   2892: invokeinterface 864 2 0
    //   2897: checkcast 867	com/tencent/mm/aj/d$a
    //   2900: getfield 877	com/tencent/mm/aj/d$a:fvb	Ljava/lang/String;
    //   2903: invokevirtual 874	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2906: ifne +23 -> 2929
    //   2909: aload_2
    //   2910: astore 4
    //   2912: aload_2
    //   2913: aload_0
    //   2914: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   2917: ldc_w 896
    //   2920: invokevirtual 771	com/tencent/mm/ui/MMActivity:getString	(I)Ljava/lang/String;
    //   2923: invokevirtual 874	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2926: ifeq +15 -> 2941
    //   2929: aload_0
    //   2930: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   2933: ldc_w 897
    //   2936: invokevirtual 771	com/tencent/mm/ui/MMActivity:getString	(I)Ljava/lang/String;
    //   2939: astore 4
    //   2941: aload 5
    //   2943: aload 4
    //   2945: invokevirtual 899	com/tencent/mm/ui/base/preference/Preference:setTitle	(Ljava/lang/CharSequence;)V
    //   2948: aload_0
    //   2949: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2952: iload 8
    //   2954: invokeinterface 864 2 0
    //   2959: checkcast 867	com/tencent/mm/aj/d$a
    //   2962: getfield 900	com/tencent/mm/aj/d$a:description	Ljava/lang/String;
    //   2965: invokestatic 209	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   2968: ifne +25 -> 2993
    //   2971: aload 5
    //   2973: aload_0
    //   2974: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2977: iload 8
    //   2979: invokeinterface 864 2 0
    //   2984: checkcast 867	com/tencent/mm/aj/d$a
    //   2987: getfield 900	com/tencent/mm/aj/d$a:description	Ljava/lang/String;
    //   2990: invokevirtual 561	com/tencent/mm/ui/base/preference/Preference:setSummary	(Ljava/lang/CharSequence;)V
    //   2993: aload_0
    //   2994: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   2997: iload 8
    //   2999: invokeinterface 864 2 0
    //   3004: checkcast 867	com/tencent/mm/aj/d$a
    //   3007: getfield 877	com/tencent/mm/aj/d$a:fvb	Ljava/lang/String;
    //   3010: invokestatic 580	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   3013: ldc_w 902
    //   3016: invokevirtual 874	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3019: ifeq +2049 -> 5068
    //   3022: aload_0
    //   3023: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3026: ldc_w 904
    //   3029: invokeinterface 860 2 0
    //   3034: istore 10
    //   3036: iload 10
    //   3038: ifle +2030 -> 5068
    //   3041: iinc 10 1
    //   3044: aload_0
    //   3045: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3048: aload 5
    //   3050: iload 10
    //   3052: invokeinterface 907 3 0
    //   3057: aload_0
    //   3058: getfield 406	com/tencent/mm/plugin/profile/ui/c:fuX	Ljava/util/List;
    //   3061: iload 8
    //   3063: invokeinterface 864 2 0
    //   3068: checkcast 867	com/tencent/mm/aj/d$a
    //   3071: getfield 877	com/tencent/mm/aj/d$a:fvb	Ljava/lang/String;
    //   3074: invokestatic 580	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   3077: ldc_w 909
    //   3080: invokevirtual 874	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3083: ifeq +27 -> 3110
    //   3086: new 911	com/tencent/mm/ui/base/preference/PreferenceSmallCategory
    //   3089: dup
    //   3090: aload_0
    //   3091: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   3094: invokespecial 912	com/tencent/mm/ui/base/preference/PreferenceSmallCategory:<init>	(Landroid/content/Context;)V
    //   3097: astore_2
    //   3098: aload_0
    //   3099: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3102: aload_2
    //   3103: iload 10
    //   3105: invokeinterface 907 3 0
    //   3110: iinc 8 255
    //   3113: goto -449 -> 2664
    //   3116: ldc 118
    //   3118: ldc_w 914
    //   3121: invokestatic 295	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   3124: aload_0
    //   3125: getfield 80	com/tencent/mm/plugin/profile/ui/c:pmA	Z
    //   3128: ifne +862 -> 3990
    //   3131: aload_0
    //   3132: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   3135: invokestatic 917	com/tencent/mm/model/t:w	(Lcom/tencent/mm/storage/ad;)Z
    //   3138: ifeq +852 -> 3990
    //   3141: aload_0
    //   3142: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   3145: getfield 920	com/tencent/mm/g/c/ap:dug	Ljava/lang/String;
    //   3148: ifnull +842 -> 3990
    //   3151: aload_0
    //   3152: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   3155: getfield 920	com/tencent/mm/g/c/ap:dug	Ljava/lang/String;
    //   3158: ldc_w 922
    //   3161: invokevirtual 874	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   3164: ifne +826 -> 3990
    //   3167: aload_0
    //   3168: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3171: ldc_w 924
    //   3174: invokeinterface 257 2 0
    //   3179: checkcast 576	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   3182: astore_2
    //   3183: aload_2
    //   3184: ifnull +82 -> 3266
    //   3187: aload_2
    //   3188: new 652	java/lang/StringBuilder
    //   3191: dup
    //   3192: invokespecial 653	java/lang/StringBuilder:<init>	()V
    //   3195: aload_0
    //   3196: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   3199: getfield 927	com/tencent/mm/g/c/ap:field_weiboNickname	Ljava/lang/String;
    //   3202: ldc_w 922
    //   3205: invokestatic 931	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   3208: invokevirtual 657	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3211: aload_0
    //   3212: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   3215: ldc_w 932
    //   3218: iconst_1
    //   3219: anewarray 4	java/lang/Object
    //   3222: dup
    //   3223: iconst_0
    //   3224: aload_0
    //   3225: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   3228: getfield 920	com/tencent/mm/g/c/ap:dug	Ljava/lang/String;
    //   3231: invokestatic 935	com/tencent/mm/model/t:nP	(Ljava/lang/String;)Ljava/lang/String;
    //   3234: aastore
    //   3235: invokevirtual 938	com/tencent/mm/ui/MMActivity:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   3238: invokevirtual 657	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3241: invokevirtual 665	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3244: invokevirtual 677	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   3247: aload_2
    //   3248: aload_0
    //   3249: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   3252: ldc_w 562
    //   3255: invokestatic 943	com/tencent/mm/bz/a:i	(Landroid/content/Context;I)I
    //   3258: putfield 569	com/tencent/mm/ui/base/preference/Preference:ksd	I
    //   3261: aload_2
    //   3262: iconst_0
    //   3263: invokevirtual 709	com/tencent/mm/ui/base/preference/KeyValuePreference:qi	(Z)V
    //   3266: aload_0
    //   3267: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3270: ifnull +784 -> 4054
    //   3273: aload_0
    //   3274: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3277: invokevirtual 947	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   3280: ifnull +774 -> 4054
    //   3283: aload_0
    //   3284: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3287: ldc_w 949
    //   3290: invokeinterface 257 2 0
    //   3295: checkcast 951	com/tencent/mm/plugin/profile/ui/BizInfoPayInfoIconPreference
    //   3298: astore_2
    //   3299: aload_0
    //   3300: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3303: invokevirtual 947	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   3306: getfield 956	com/tencent/mm/aj/d$b$e:fvW	I
    //   3309: ifle +697 -> 4006
    //   3312: aload_2
    //   3313: aload_0
    //   3314: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3317: invokevirtual 947	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   3320: getfield 956	com/tencent/mm/aj/d$b$e:fvW	I
    //   3323: invokevirtual 959	com/tencent/mm/plugin/profile/ui/BizInfoPayInfoIconPreference:AS	(I)V
    //   3326: aload_0
    //   3327: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3330: ldc_w 961
    //   3333: invokeinterface 257 2 0
    //   3338: checkcast 951	com/tencent/mm/plugin/profile/ui/BizInfoPayInfoIconPreference
    //   3341: astore_2
    //   3342: aload_0
    //   3343: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3346: invokevirtual 947	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   3349: getfield 964	com/tencent/mm/aj/d$b$e:fvY	Ljava/util/List;
    //   3352: ifnull +670 -> 4022
    //   3355: aload_0
    //   3356: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3359: invokevirtual 947	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   3362: getfield 964	com/tencent/mm/aj/d$b$e:fvY	Ljava/util/List;
    //   3365: invokeinterface 704 1 0
    //   3370: ifle +652 -> 4022
    //   3373: aload_2
    //   3374: aload_0
    //   3375: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3378: invokevirtual 947	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   3381: getfield 964	com/tencent/mm/aj/d$b$e:fvY	Ljava/util/List;
    //   3384: invokevirtual 968	com/tencent/mm/plugin/profile/ui/BizInfoPayInfoIconPreference:cC	(Ljava/util/List;)V
    //   3387: aload_0
    //   3388: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3391: ldc_w 904
    //   3394: invokeinterface 257 2 0
    //   3399: checkcast 576	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   3402: astore_2
    //   3403: aload_0
    //   3404: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3407: invokevirtual 947	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   3410: getfield 971	com/tencent/mm/aj/d$b$e:fvX	Ljava/lang/String;
    //   3413: invokestatic 209	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   3416: ifne +622 -> 4038
    //   3419: aload_2
    //   3420: aload_0
    //   3421: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3424: invokevirtual 947	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   3427: getfield 971	com/tencent/mm/aj/d$b$e:fvX	Ljava/lang/String;
    //   3430: invokevirtual 677	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   3433: aload_2
    //   3434: iconst_4
    //   3435: putfield 827	com/tencent/mm/ui/base/preference/KeyValuePreference:yCp	I
    //   3438: aload_2
    //   3439: iconst_0
    //   3440: invokevirtual 709	com/tencent/mm/ui/base/preference/KeyValuePreference:qi	(Z)V
    //   3443: aload_0
    //   3444: getfield 408	com/tencent/mm/plugin/profile/ui/c:pmy	Ljava/util/List;
    //   3447: ifnull +649 -> 4096
    //   3450: aload_0
    //   3451: getfield 408	com/tencent/mm/plugin/profile/ui/c:pmy	Ljava/util/List;
    //   3454: invokeinterface 704 1 0
    //   3459: ifle +637 -> 4096
    //   3462: aload_0
    //   3463: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3466: ldc_w 973
    //   3469: iconst_0
    //   3470: invokeinterface 206 3 0
    //   3475: aload_0
    //   3476: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3479: ldc_w 973
    //   3482: invokeinterface 257 2 0
    //   3487: checkcast 975	com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference
    //   3490: aload_0
    //   3491: getfield 506	com/tencent/mm/plugin/profile/ui/c:pkW	Lcom/tencent/mm/aj/d;
    //   3494: aload_0
    //   3495: getfield 408	com/tencent/mm/plugin/profile/ui/c:pmy	Ljava/util/List;
    //   3498: invokevirtual 978	com/tencent/mm/plugin/profile/ui/BizBindWxaInfoPreference:a	(Lcom/tencent/mm/aj/d;Ljava/util/List;)V
    //   3501: aload_0
    //   3502: aload_0
    //   3503: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   3506: invokevirtual 982	com/tencent/mm/ui/MMActivity:getIntent	()Landroid/content/Intent;
    //   3509: ldc_w 984
    //   3512: invokevirtual 989	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   3515: invokespecial 991	com/tencent/mm/plugin/profile/ui/c:UR	(Ljava/lang/String;)V
    //   3518: ldc 118
    //   3520: ldc_w 993
    //   3523: iconst_1
    //   3524: anewarray 4	java/lang/Object
    //   3527: dup
    //   3528: iconst_0
    //   3529: aload_0
    //   3530: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   3533: invokevirtual 982	com/tencent/mm/ui/MMActivity:getIntent	()Landroid/content/Intent;
    //   3536: ldc_w 995
    //   3539: iconst_0
    //   3540: invokevirtual 999	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   3543: invokestatic 181	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   3546: aastore
    //   3547: invokestatic 184	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3550: aload_0
    //   3551: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   3554: invokevirtual 982	com/tencent/mm/ui/MMActivity:getIntent	()Landroid/content/Intent;
    //   3557: ifnull +844 -> 4401
    //   3560: aload_0
    //   3561: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   3564: invokevirtual 982	com/tencent/mm/ui/MMActivity:getIntent	()Landroid/content/Intent;
    //   3567: ldc_w 995
    //   3570: iconst_0
    //   3571: invokevirtual 999	android/content/Intent:getBooleanExtra	(Ljava/lang/String;Z)Z
    //   3574: ifeq +827 -> 4401
    //   3577: ldc 118
    //   3579: ldc_w 1001
    //   3582: invokestatic 295	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   3585: aload_0
    //   3586: invokespecial 1004	com/tencent/mm/plugin/profile/ui/c:caW	()Z
    //   3589: istore_3
    //   3590: ldc 118
    //   3592: ldc_w 1006
    //   3595: iconst_2
    //   3596: anewarray 4	java/lang/Object
    //   3599: dup
    //   3600: iconst_0
    //   3601: aload_0
    //   3602: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   3605: getfield 481	com/tencent/mm/g/c/ap:field_type	I
    //   3608: invokestatic 486	com/tencent/mm/n/a:jh	(I)Z
    //   3611: invokestatic 181	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   3614: aastore
    //   3615: dup
    //   3616: iconst_1
    //   3617: iload_3
    //   3618: invokestatic 181	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   3621: aastore
    //   3622: invokestatic 184	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3625: aload_0
    //   3626: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   3629: getfield 481	com/tencent/mm/g/c/ap:field_type	I
    //   3632: invokestatic 486	com/tencent/mm/n/a:jh	(I)Z
    //   3635: ifeq +603 -> 4238
    //   3638: iload_3
    //   3639: ifeq +599 -> 4238
    //   3642: aload_1
    //   3643: ifnull +553 -> 4196
    //   3646: aload_0
    //   3647: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3650: ldc_w 787
    //   3653: invokeinterface 257 2 0
    //   3658: checkcast 488	com/tencent/mm/ui/base/preference/CheckBoxPreference
    //   3661: astore_2
    //   3662: aload_0
    //   3663: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3666: ldc_w 800
    //   3669: invokeinterface 257 2 0
    //   3674: checkcast 488	com/tencent/mm/ui/base/preference/CheckBoxPreference
    //   3677: astore 4
    //   3679: aload_1
    //   3680: invokevirtual 476	com/tencent/mm/aj/d:adR	()Z
    //   3683: ifeq +445 -> 4128
    //   3686: invokestatic 1010	com/tencent/mm/aj/z:aeV	()Lcom/tencent/mm/aj/a/k;
    //   3689: aload_1
    //   3690: getfield 416	com/tencent/mm/aj/d:field_username	Ljava/lang/String;
    //   3693: invokevirtual 1015	com/tencent/mm/aj/a/k:cI	(Ljava/lang/String;)Ljava/lang/String;
    //   3696: astore 5
    //   3698: aload_0
    //   3699: invokestatic 1010	com/tencent/mm/aj/z:aeV	()Lcom/tencent/mm/aj/a/k;
    //   3702: aload 5
    //   3704: invokevirtual 1019	com/tencent/mm/aj/a/k:cH	(Ljava/lang/String;)Lcom/tencent/mm/aj/a/j;
    //   3707: putfield 1021	com/tencent/mm/plugin/profile/ui/c:pmx	Lcom/tencent/mm/aj/a/j;
    //   3710: aload_0
    //   3711: getfield 1021	com/tencent/mm/plugin/profile/ui/c:pmx	Lcom/tencent/mm/aj/a/j;
    //   3714: ifnull +403 -> 4117
    //   3717: aload_0
    //   3718: getfield 1021	com/tencent/mm/plugin/profile/ui/c:pmx	Lcom/tencent/mm/aj/a/j;
    //   3721: iconst_4
    //   3722: invokevirtual 1026	com/tencent/mm/aj/a/j:lc	(I)Z
    //   3725: ifne +387 -> 4112
    //   3728: iconst_1
    //   3729: istore_3
    //   3730: aload_2
    //   3731: iload_3
    //   3732: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   3735: aload_1
    //   3736: invokevirtual 790	com/tencent/mm/aj/d:adH	()Z
    //   3739: ifeq +416 -> 4155
    //   3742: aload_0
    //   3743: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3746: ifnonnull +16 -> 3762
    //   3749: aload_1
    //   3750: ifnull +12 -> 3762
    //   3753: aload_0
    //   3754: aload_1
    //   3755: iconst_0
    //   3756: invokevirtual 414	com/tencent/mm/aj/d:cJ	(Z)Lcom/tencent/mm/aj/d$b;
    //   3759: putfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3762: aload_0
    //   3763: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3766: ifnull +373 -> 4139
    //   3769: aload_0
    //   3770: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   3773: invokevirtual 1029	com/tencent/mm/aj/d$b:aeb	()Z
    //   3776: ifeq +363 -> 4139
    //   3779: ldc_w 1031
    //   3782: invokestatic 1036	com/tencent/mm/bp/d:afj	(Ljava/lang/String;)Z
    //   3785: ifeq +354 -> 4139
    //   3788: aload_0
    //   3789: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3792: ldc_w 1038
    //   3795: iconst_0
    //   3796: invokeinterface 206 3 0
    //   3801: aload_1
    //   3802: iconst_0
    //   3803: invokevirtual 414	com/tencent/mm/aj/d:cJ	(Z)Lcom/tencent/mm/aj/d$b;
    //   3806: invokevirtual 1041	com/tencent/mm/aj/d$b:adL	()Z
    //   3809: ifeq +362 -> 4171
    //   3812: aload 4
    //   3814: aload_1
    //   3815: invokevirtual 1044	com/tencent/mm/aj/d:adI	()Z
    //   3818: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   3821: aload_0
    //   3822: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3825: ldc_w 1046
    //   3828: iconst_1
    //   3829: invokeinterface 206 3 0
    //   3834: aload_0
    //   3835: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3838: ldc_w 462
    //   3841: iconst_1
    //   3842: invokeinterface 206 3 0
    //   3847: aload_0
    //   3848: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   3851: invokevirtual 1049	com/tencent/mm/storage/ad:Oj	()Ljava/lang/String;
    //   3854: astore_2
    //   3855: aload_2
    //   3856: ifnull +11 -> 3867
    //   3859: aload_0
    //   3860: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   3863: aload_2
    //   3864: invokevirtual 1052	com/tencent/mm/ui/MMActivity:setMMTitle	(Ljava/lang/String;)V
    //   3867: aload_0
    //   3868: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   3871: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   3874: invokestatic 819	com/tencent/mm/model/t:nl	(Ljava/lang/String;)Z
    //   3877: ifeq +57 -> 3934
    //   3880: aload_0
    //   3881: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3884: ldc_w 478
    //   3887: invokeinterface 257 2 0
    //   3892: checkcast 802	com/tencent/mm/pluginsdk/ui/preference/ButtonPreference
    //   3895: aload_0
    //   3896: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   3899: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   3902: ldc_w 1053
    //   3905: invokevirtual 144	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   3908: aload_0
    //   3909: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   3912: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   3915: ldc_w 804
    //   3918: invokevirtual 566	android/content/res/Resources:getColor	(I)I
    //   3921: invokevirtual 808	com/tencent/mm/pluginsdk/ui/preference/ButtonPreference:ed	(Ljava/lang/String;I)V
    //   3924: aload_0
    //   3925: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   3928: ldc_w 1054
    //   3931: invokevirtual 1056	com/tencent/mm/ui/MMActivity:setMMTitle	(I)V
    //   3934: aload_0
    //   3935: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   3938: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   3941: invokestatic 538	com/tencent/mm/model/t:nG	(Ljava/lang/String;)Z
    //   3944: ifne +39 -> 3983
    //   3947: aload_0
    //   3948: getfield 506	com/tencent/mm/plugin/profile/ui/c:pkW	Lcom/tencent/mm/aj/d;
    //   3951: ifnull +32 -> 3983
    //   3954: aload_0
    //   3955: getfield 506	com/tencent/mm/plugin/profile/ui/c:pkW	Lcom/tencent/mm/aj/d;
    //   3958: invokevirtual 460	com/tencent/mm/aj/d:adQ	()Z
    //   3961: ifne +22 -> 3983
    //   3964: aload_0
    //   3965: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   3968: iconst_0
    //   3969: ldc_w 1057
    //   3972: new 1059	com/tencent/mm/plugin/profile/ui/c$17
    //   3975: dup
    //   3976: aload_0
    //   3977: invokespecial 1060	com/tencent/mm/plugin/profile/ui/c$17:<init>	(Lcom/tencent/mm/plugin/profile/ui/c;)V
    //   3980: invokevirtual 1064	com/tencent/mm/ui/MMActivity:addIconOptionMenu	(IILandroid/view/MenuItem$OnMenuItemClickListener;)V
    //   3983: sipush 23479
    //   3986: invokestatic 147	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   3989: return
    //   3990: aload_0
    //   3991: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   3994: ldc_w 924
    //   3997: iconst_1
    //   3998: invokeinterface 206 3 0
    //   4003: goto -737 -> 3266
    //   4006: aload_0
    //   4007: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4010: ldc_w 949
    //   4013: iconst_1
    //   4014: invokeinterface 206 3 0
    //   4019: goto -693 -> 3326
    //   4022: aload_0
    //   4023: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4026: ldc_w 961
    //   4029: iconst_1
    //   4030: invokeinterface 206 3 0
    //   4035: goto -648 -> 3387
    //   4038: aload_0
    //   4039: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4042: ldc_w 904
    //   4045: iconst_1
    //   4046: invokeinterface 206 3 0
    //   4051: goto -608 -> 3443
    //   4054: aload_0
    //   4055: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4058: ldc_w 949
    //   4061: iconst_1
    //   4062: invokeinterface 206 3 0
    //   4067: aload_0
    //   4068: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4071: ldc_w 961
    //   4074: iconst_1
    //   4075: invokeinterface 206 3 0
    //   4080: aload_0
    //   4081: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4084: ldc_w 904
    //   4087: iconst_1
    //   4088: invokeinterface 206 3 0
    //   4093: goto -650 -> 3443
    //   4096: aload_0
    //   4097: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4100: ldc_w 973
    //   4103: iconst_1
    //   4104: invokeinterface 206 3 0
    //   4109: goto -608 -> 3501
    //   4112: iconst_0
    //   4113: istore_3
    //   4114: goto -384 -> 3730
    //   4117: ldc 118
    //   4119: ldc_w 1066
    //   4122: invokestatic 785	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   4125: goto -390 -> 3735
    //   4128: aload_2
    //   4129: aload_1
    //   4130: invokevirtual 790	com/tencent/mm/aj/d:adH	()Z
    //   4133: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   4136: goto -401 -> 3735
    //   4139: aload_0
    //   4140: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4143: ldc_w 1038
    //   4146: iconst_1
    //   4147: invokeinterface 206 3 0
    //   4152: goto -351 -> 3801
    //   4155: aload_0
    //   4156: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4159: ldc_w 1038
    //   4162: iconst_1
    //   4163: invokeinterface 206 3 0
    //   4168: goto -367 -> 3801
    //   4171: aload_0
    //   4172: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4175: ldc_w 800
    //   4178: iconst_1
    //   4179: invokeinterface 206 3 0
    //   4184: aload 4
    //   4186: aload_1
    //   4187: invokevirtual 1044	com/tencent/mm/aj/d:adI	()Z
    //   4190: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   4193: goto -372 -> 3821
    //   4196: aload_0
    //   4197: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4200: ldc_w 787
    //   4203: iconst_1
    //   4204: invokeinterface 206 3 0
    //   4209: aload_0
    //   4210: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4213: ldc_w 800
    //   4216: iconst_1
    //   4217: invokeinterface 206 3 0
    //   4222: aload_0
    //   4223: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4226: ldc_w 1038
    //   4229: iconst_1
    //   4230: invokeinterface 206 3 0
    //   4235: goto -414 -> 3821
    //   4238: ldc 118
    //   4240: ldc_w 1068
    //   4243: iconst_1
    //   4244: anewarray 4	java/lang/Object
    //   4247: dup
    //   4248: iconst_0
    //   4249: aload_0
    //   4250: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   4253: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   4256: aastore
    //   4257: invokestatic 132	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4260: aload_0
    //   4261: invokespecial 533	com/tencent/mm/plugin/profile/ui/c:caU	()V
    //   4264: aload_0
    //   4265: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4268: ldc_w 462
    //   4271: invokeinterface 257 2 0
    //   4276: astore_2
    //   4277: ldc 118
    //   4279: ldc_w 1070
    //   4282: iconst_1
    //   4283: anewarray 4	java/lang/Object
    //   4286: dup
    //   4287: iconst_0
    //   4288: aload_0
    //   4289: getfield 82	com/tencent/mm/plugin/profile/ui/c:pmB	Z
    //   4292: invokestatic 181	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   4295: aastore
    //   4296: invokestatic 184	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4299: aload_2
    //   4300: ifnull +14 -> 4314
    //   4303: iload_3
    //   4304: ifeq +49 -> 4353
    //   4307: aload_2
    //   4308: ldc_w 1071
    //   4311: invokevirtual 792	com/tencent/mm/ui/base/preference/Preference:setTitle	(I)V
    //   4314: aload_0
    //   4315: getfield 1073	com/tencent/mm/plugin/profile/ui/c:gwP	I
    //   4318: invokestatic 1075	com/tencent/mm/plugin/profile/ui/c:Bd	(I)Z
    //   4321: ifeq +15 -> 4336
    //   4324: aload_1
    //   4325: ifnonnull +38 -> 4363
    //   4328: ldc 118
    //   4330: ldc_w 1077
    //   4333: invokestatic 824	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   4336: aload_0
    //   4337: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   4340: iconst_0
    //   4341: invokevirtual 1080	com/tencent/mm/ui/MMActivity:showOptionMenu	(Z)V
    //   4344: sipush 23479
    //   4347: invokestatic 147	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   4350: goto -361 -> 3989
    //   4353: aload_2
    //   4354: ldc_w 1081
    //   4357: invokevirtual 792	com/tencent/mm/ui/base/preference/Preference:setTitle	(I)V
    //   4360: goto -46 -> 4314
    //   4363: aload_0
    //   4364: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4367: ldc_w 787
    //   4370: invokeinterface 257 2 0
    //   4375: checkcast 488	com/tencent/mm/ui/base/preference/CheckBoxPreference
    //   4378: aload_1
    //   4379: invokevirtual 790	com/tencent/mm/aj/d:adH	()Z
    //   4382: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   4385: aload_0
    //   4386: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4389: ldc_w 787
    //   4392: iconst_0
    //   4393: invokeinterface 206 3 0
    //   4398: goto -62 -> 4336
    //   4401: aload_0
    //   4402: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   4405: getfield 481	com/tencent/mm/g/c/ap:field_type	I
    //   4408: invokestatic 486	com/tencent/mm/n/a:jh	(I)Z
    //   4411: ifeq +518 -> 4929
    //   4414: aload_1
    //   4415: ifnull +472 -> 4887
    //   4418: aload_0
    //   4419: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4422: ldc_w 787
    //   4425: invokeinterface 257 2 0
    //   4430: checkcast 488	com/tencent/mm/ui/base/preference/CheckBoxPreference
    //   4433: astore_2
    //   4434: aload_0
    //   4435: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4438: ldc_w 800
    //   4441: invokeinterface 257 2 0
    //   4446: checkcast 488	com/tencent/mm/ui/base/preference/CheckBoxPreference
    //   4449: astore 5
    //   4451: aload_1
    //   4452: invokevirtual 476	com/tencent/mm/aj/d:adR	()Z
    //   4455: ifeq +322 -> 4777
    //   4458: aload_2
    //   4459: ldc_w 1082
    //   4462: invokevirtual 498	com/tencent/mm/ui/base/preference/CheckBoxPreference:setTitle	(I)V
    //   4465: invokestatic 1010	com/tencent/mm/aj/z:aeV	()Lcom/tencent/mm/aj/a/k;
    //   4468: aload_1
    //   4469: getfield 416	com/tencent/mm/aj/d:field_username	Ljava/lang/String;
    //   4472: invokevirtual 1015	com/tencent/mm/aj/a/k:cI	(Ljava/lang/String;)Ljava/lang/String;
    //   4475: astore 4
    //   4477: aload_0
    //   4478: invokestatic 1010	com/tencent/mm/aj/z:aeV	()Lcom/tencent/mm/aj/a/k;
    //   4481: aload 4
    //   4483: invokevirtual 1019	com/tencent/mm/aj/a/k:cH	(Ljava/lang/String;)Lcom/tencent/mm/aj/a/j;
    //   4486: putfield 1021	com/tencent/mm/plugin/profile/ui/c:pmx	Lcom/tencent/mm/aj/a/j;
    //   4489: aload_0
    //   4490: getfield 1021	com/tencent/mm/plugin/profile/ui/c:pmx	Lcom/tencent/mm/aj/a/j;
    //   4493: ifnull +273 -> 4766
    //   4496: aload_0
    //   4497: getfield 1021	com/tencent/mm/plugin/profile/ui/c:pmx	Lcom/tencent/mm/aj/a/j;
    //   4500: iconst_4
    //   4501: invokevirtual 1026	com/tencent/mm/aj/a/j:lc	(I)Z
    //   4504: ifne +257 -> 4761
    //   4507: iconst_1
    //   4508: istore_3
    //   4509: aload_2
    //   4510: iload_3
    //   4511: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   4514: aload_1
    //   4515: invokevirtual 790	com/tencent/mm/aj/d:adH	()Z
    //   4518: ifeq +328 -> 4846
    //   4521: aload_0
    //   4522: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   4525: ifnonnull +16 -> 4541
    //   4528: aload_1
    //   4529: ifnull +12 -> 4541
    //   4532: aload_0
    //   4533: aload_1
    //   4534: iconst_0
    //   4535: invokevirtual 414	com/tencent/mm/aj/d:cJ	(Z)Lcom/tencent/mm/aj/d$b;
    //   4538: putfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   4541: aload_0
    //   4542: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   4545: ifnull +285 -> 4830
    //   4548: aload_0
    //   4549: getfield 188	com/tencent/mm/plugin/profile/ui/c:fuY	Lcom/tencent/mm/aj/d$b;
    //   4552: invokevirtual 1029	com/tencent/mm/aj/d$b:aeb	()Z
    //   4555: ifeq +275 -> 4830
    //   4558: ldc_w 1031
    //   4561: invokestatic 1036	com/tencent/mm/bp/d:afj	(Ljava/lang/String;)Z
    //   4564: ifeq +266 -> 4830
    //   4567: aload_0
    //   4568: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4571: ldc_w 1038
    //   4574: iconst_0
    //   4575: invokeinterface 206 3 0
    //   4580: aload_1
    //   4581: iconst_0
    //   4582: invokevirtual 414	com/tencent/mm/aj/d:cJ	(Z)Lcom/tencent/mm/aj/d$b;
    //   4585: invokevirtual 1041	com/tencent/mm/aj/d$b:adL	()Z
    //   4588: ifeq +274 -> 4862
    //   4591: aload 5
    //   4593: aload_1
    //   4594: invokevirtual 1044	com/tencent/mm/aj/d:adI	()Z
    //   4597: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   4600: aload_0
    //   4601: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4604: ldc_w 1046
    //   4607: iconst_1
    //   4608: invokeinterface 206 3 0
    //   4613: aload_0
    //   4614: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4617: ldc_w 462
    //   4620: iconst_1
    //   4621: invokeinterface 206 3 0
    //   4626: aload_0
    //   4627: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   4630: invokevirtual 1049	com/tencent/mm/storage/ad:Oj	()Ljava/lang/String;
    //   4633: astore_2
    //   4634: aload_2
    //   4635: ifnull +11 -> 4646
    //   4638: aload_0
    //   4639: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   4642: aload_2
    //   4643: invokevirtual 1052	com/tencent/mm/ui/MMActivity:setMMTitle	(Ljava/lang/String;)V
    //   4646: aload_0
    //   4647: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   4650: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   4653: invokestatic 819	com/tencent/mm/model/t:nl	(Ljava/lang/String;)Z
    //   4656: ifeq +57 -> 4713
    //   4659: aload_0
    //   4660: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4663: ldc_w 478
    //   4666: invokeinterface 257 2 0
    //   4671: checkcast 802	com/tencent/mm/pluginsdk/ui/preference/ButtonPreference
    //   4674: aload_0
    //   4675: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   4678: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   4681: ldc_w 1053
    //   4684: invokevirtual 144	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   4687: aload_0
    //   4688: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   4691: invokevirtual 138	com/tencent/mm/ui/MMActivity:getResources	()Landroid/content/res/Resources;
    //   4694: ldc_w 804
    //   4697: invokevirtual 566	android/content/res/Resources:getColor	(I)I
    //   4700: invokevirtual 808	com/tencent/mm/pluginsdk/ui/preference/ButtonPreference:ed	(Ljava/lang/String;I)V
    //   4703: aload_0
    //   4704: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   4707: ldc_w 1054
    //   4710: invokevirtual 1056	com/tencent/mm/ui/MMActivity:setMMTitle	(I)V
    //   4713: aload_0
    //   4714: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   4717: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   4720: invokestatic 538	com/tencent/mm/model/t:nG	(Ljava/lang/String;)Z
    //   4723: ifne +29 -> 4752
    //   4726: aload_0
    //   4727: getfield 506	com/tencent/mm/plugin/profile/ui/c:pkW	Lcom/tencent/mm/aj/d;
    //   4730: ifnull +22 -> 4752
    //   4733: aload_0
    //   4734: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   4737: iconst_0
    //   4738: ldc_w 1057
    //   4741: new 1084	com/tencent/mm/plugin/profile/ui/c$18
    //   4744: dup
    //   4745: aload_0
    //   4746: invokespecial 1085	com/tencent/mm/plugin/profile/ui/c$18:<init>	(Lcom/tencent/mm/plugin/profile/ui/c;)V
    //   4749: invokevirtual 1064	com/tencent/mm/ui/MMActivity:addIconOptionMenu	(IILandroid/view/MenuItem$OnMenuItemClickListener;)V
    //   4752: sipush 23479
    //   4755: invokestatic 147	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   4758: goto -769 -> 3989
    //   4761: iconst_0
    //   4762: istore_3
    //   4763: goto -254 -> 4509
    //   4766: ldc 118
    //   4768: ldc_w 1066
    //   4771: invokestatic 785	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   4774: goto -260 -> 4514
    //   4777: aload_1
    //   4778: invokevirtual 811	com/tencent/mm/aj/d:adP	()Z
    //   4781: ifeq +38 -> 4819
    //   4784: aload_2
    //   4785: ldc_w 1086
    //   4788: invokevirtual 498	com/tencent/mm/ui/base/preference/CheckBoxPreference:setTitle	(I)V
    //   4791: invokestatic 1090	com/tencent/mm/aj/z:afa	()Lcom/tencent/mm/aj/c;
    //   4794: aload_1
    //   4795: getfield 416	com/tencent/mm/aj/d:field_username	Ljava/lang/String;
    //   4798: invokevirtual 1095	com/tencent/mm/aj/c:qG	(Ljava/lang/String;)Z
    //   4801: ifne +13 -> 4814
    //   4804: iconst_1
    //   4805: istore_3
    //   4806: aload_2
    //   4807: iload_3
    //   4808: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   4811: goto -297 -> 4514
    //   4814: iconst_0
    //   4815: istore_3
    //   4816: goto -10 -> 4806
    //   4819: aload_2
    //   4820: aload_1
    //   4821: invokevirtual 790	com/tencent/mm/aj/d:adH	()Z
    //   4824: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   4827: goto -313 -> 4514
    //   4830: aload_0
    //   4831: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4834: ldc_w 1038
    //   4837: iconst_1
    //   4838: invokeinterface 206 3 0
    //   4843: goto -263 -> 4580
    //   4846: aload_0
    //   4847: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4850: ldc_w 1038
    //   4853: iconst_1
    //   4854: invokeinterface 206 3 0
    //   4859: goto -279 -> 4580
    //   4862: aload_0
    //   4863: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4866: ldc_w 800
    //   4869: iconst_1
    //   4870: invokeinterface 206 3 0
    //   4875: aload 5
    //   4877: aload_1
    //   4878: invokevirtual 1044	com/tencent/mm/aj/d:adI	()Z
    //   4881: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   4884: goto -284 -> 4600
    //   4887: aload_0
    //   4888: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4891: ldc_w 787
    //   4894: iconst_1
    //   4895: invokeinterface 206 3 0
    //   4900: aload_0
    //   4901: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4904: ldc_w 800
    //   4907: iconst_1
    //   4908: invokeinterface 206 3 0
    //   4913: aload_0
    //   4914: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4917: ldc_w 1038
    //   4920: iconst_1
    //   4921: invokeinterface 206 3 0
    //   4926: goto -326 -> 4600
    //   4929: ldc 118
    //   4931: ldc_w 1097
    //   4934: iconst_1
    //   4935: anewarray 4	java/lang/Object
    //   4938: dup
    //   4939: iconst_0
    //   4940: aload_0
    //   4941: getfield 196	com/tencent/mm/plugin/profile/ui/c:ehM	Lcom/tencent/mm/storage/ad;
    //   4944: getfield 220	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   4947: aastore
    //   4948: invokestatic 132	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   4951: aload_0
    //   4952: invokespecial 533	com/tencent/mm/plugin/profile/ui/c:caU	()V
    //   4955: aload_0
    //   4956: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   4959: ldc_w 462
    //   4962: invokeinterface 257 2 0
    //   4967: astore_2
    //   4968: aload_2
    //   4969: ifnull +17 -> 4986
    //   4972: aload_0
    //   4973: getfield 82	com/tencent/mm/plugin/profile/ui/c:pmB	Z
    //   4976: ifeq +10 -> 4986
    //   4979: aload_2
    //   4980: ldc_w 1071
    //   4983: invokevirtual 792	com/tencent/mm/ui/base/preference/Preference:setTitle	(I)V
    //   4986: aload_0
    //   4987: getfield 1073	com/tencent/mm/plugin/profile/ui/c:gwP	I
    //   4990: invokestatic 1075	com/tencent/mm/plugin/profile/ui/c:Bd	(I)Z
    //   4993: ifeq +15 -> 5008
    //   4996: aload_1
    //   4997: ifnonnull +28 -> 5025
    //   5000: ldc 118
    //   5002: ldc_w 1077
    //   5005: invokestatic 824	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   5008: aload_0
    //   5009: getfield 102	com/tencent/mm/plugin/profile/ui/c:crP	Lcom/tencent/mm/ui/MMActivity;
    //   5012: iconst_0
    //   5013: invokevirtual 1080	com/tencent/mm/ui/MMActivity:showOptionMenu	(Z)V
    //   5016: sipush 23479
    //   5019: invokestatic 147	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   5022: goto -1033 -> 3989
    //   5025: aload_0
    //   5026: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   5029: ldc_w 787
    //   5032: invokeinterface 257 2 0
    //   5037: checkcast 488	com/tencent/mm/ui/base/preference/CheckBoxPreference
    //   5040: aload_1
    //   5041: invokevirtual 790	com/tencent/mm/aj/d:adH	()Z
    //   5044: putfield 494	com/tencent/mm/ui/base/preference/CheckBoxPreference:uOT	Z
    //   5047: aload_0
    //   5048: getfield 198	com/tencent/mm/plugin/profile/ui/c:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   5051: ldc_w 787
    //   5054: iconst_0
    //   5055: invokeinterface 206 3 0
    //   5060: goto -52 -> 5008
    //   5063: astore 5
    //   5065: goto -2643 -> 2422
    //   5068: iload 9
    //   5070: istore 10
    //   5072: goto -2028 -> 3044
    //   5075: aconst_null
    //   5076: astore_2
    //   5077: goto -3844 -> 1233
    //   5080: aload 4
    //   5082: astore_2
    //   5083: goto -3962 -> 1121
    //   5086: aconst_null
    //   5087: astore 4
    //   5089: goto -4106 -> 983
    //   5092: aconst_null
    //   5093: astore_2
    //   5094: goto -2779 -> 2315
    //   5097: goto -4937 -> 160
    //
    // Exception table:
    //   from	to	target	type
    //   1055	1094	2415	java/lang/IndexOutOfBoundsException
    //   1094	1121	5063	java/lang/IndexOutOfBoundsException
  }

  private void caU()
  {
    AppMethodBeat.i(23481);
    if ((this.ehM != null) && (com.tencent.mm.n.a.jh(this.ehM.field_type)) && (!t.nl(this.ehM.field_username)) && (!t.nQ(this.ehM.field_username)))
    {
      this.ehK.ce("contact_is_mute", false);
      this.ehK.ce("contact_info_verifyuser_weibo", true);
      this.ehK.ce("contact_info_subscribe_bizinfo", true);
      this.ehK.ce("contact_info_template_recv", true);
      this.ehK.ce("contact_info_locate", true);
      if (this.pmA)
        break label304;
      this.ehK.ce("contact_info_time_expired", true);
      label137: if ((this.ehM == null) || ((!t.nG(this.ehM.field_username)) && (!t.nQ(this.ehM.field_username))) || (!com.tencent.mm.n.a.jh(this.ehM.field_type)))
        break label320;
      this.ehK.ce("contact_info_biz_go_chatting", false);
    }
    while (true)
    {
      if (t.nQ(this.ehM.field_username))
        this.ehK.ce("contact_info_user_desc", true);
      AppMethodBeat.o(23481);
      return;
      this.ehK.ce("contact_is_mute", true);
      if ((this.ehM != null) && (!com.tencent.mm.n.a.jh(this.ehM.field_type)) && (Bd(this.gwP)))
      {
        this.ehK.ce("contact_info_expose_btn", false);
        break;
      }
      this.ehK.ce("contact_info_expose_btn", true);
      break;
      label304: this.ehK.ce("contact_info_biz_add", true);
      break label137;
      label320: this.ehK.ce("contact_info_biz_go_chatting", true);
    }
  }

  private boolean caW()
  {
    AppMethodBeat.i(23487);
    boolean bool;
    if (this.crP.getIntent() == null)
    {
      bool = false;
      AppMethodBeat.o(23487);
    }
    while (true)
    {
      return bool;
      String str1 = this.crP.getIntent().getStringExtra("device_id");
      String str2 = this.crP.getIntent().getStringExtra("device_type");
      dg localdg = new dg();
      localdg.cwu.ceI = str1;
      localdg.cwu.cws = str2;
      com.tencent.mm.sdk.b.a.xxA.m(localdg);
      bool = localdg.cwv.cww;
      AppMethodBeat.o(23487);
    }
  }

  private void caY()
  {
    AppMethodBeat.i(23496);
    ab.d("MicroMsg.ContactWidgetBizInfo", "updatePlaceTop");
    if (this.ehZ == null)
      this.ehZ = this.crP.getSharedPreferences(this.crP.getPackageName() + "_preferences", 0);
    if (this.ehV != null)
    {
      if (this.ehM == null)
        break label119;
      this.ehZ.edit().putBoolean("biz_placed_to_the_top", this.ehM.Oe()).commit();
    }
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(23496);
      return;
      label119: this.ehZ.edit().putBoolean("biz_placed_to_the_top", false).commit();
    }
  }

  private void jO(boolean paramBoolean)
  {
    AppMethodBeat.i(23489);
    if (this.ehM != null)
      if (this.crP != null)
      {
        if ((!paramBoolean) || (com.tencent.mm.aj.f.kq(this.ehM.field_username)))
          break label77;
        this.crP.setTitleMuteIconVisibility(0);
      }
    while (true)
    {
      CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("contact_is_mute");
      if (localCheckBoxPreference != null)
        localCheckBoxPreference.uOT = paramBoolean;
      AppMethodBeat.o(23489);
      return;
      label77: this.crP.setTitleMuteIconVisibility(8);
    }
  }

  public final boolean IO(String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(23475);
    boolean bool2;
    if (paramString == null)
    {
      AppMethodBeat.o(23475);
      bool2 = false;
    }
    Object localObject1;
    label226: Object localObject2;
    while (true)
    {
      return bool2;
      if (paramString.equals("contact_info_verifyuser_weibo"))
      {
        new com.tencent.mm.plugin.profile.ui.a.a(this.crP).fF(this.ehM.dug, this.ehM.field_username);
        AppMethodBeat.o(23475);
        bool2 = bool1;
      }
      else if ("contact_info_biz_go_chatting".endsWith(paramString))
      {
        if (this.pmI != null)
        {
          paramString = new of();
          this.pmI.fPZ = 5;
          paramString.cKy.cKz = this.pmI;
          com.tencent.mm.sdk.b.a.xxA.m(paramString);
        }
        if ((this.pkW != null) && ((this.pkW.adP()) || (this.pkW.adR())))
        {
          localObject1 = new Intent();
          if (this.pkW.adR())
          {
            paramString = this.pkW.adX();
            if (bo.isNullOrNil(paramString))
            {
              ab.w("MicroMsg.ContactWidgetBizInfo", "contact_info_biz_go_chatting fatherUserName is empty");
              AppMethodBeat.o(23475);
              bool2 = false;
              continue;
            }
            ((Intent)localObject1).putExtra("enterprise_biz_name", paramString);
            ((Intent)localObject1).putExtra("enterprise_biz_display_name", s.mJ(paramString));
            ((Intent)localObject1).addFlags(67108864);
            com.tencent.mm.bp.d.f(this.crP, ".ui.conversation.EnterpriseConversationUI", (Intent)localObject1);
            this.crP.finish();
          }
        }
        else
        {
          while (true)
          {
            aV(5, null);
            AppMethodBeat.o(23475);
            bool2 = bool1;
            break;
            ((Intent)localObject1).putExtra("enterprise_biz_name", this.ehM.field_username);
            ((Intent)localObject1).putExtra("enterprise_biz_display_name", s.mJ(this.ehM.field_username));
            break label226;
            paramString = new Intent();
            if (this.crP.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false))
              paramString.setFlags(268435456);
            if (this.pli)
            {
              paramString.putExtra("Chat_User", this.ehM.field_username);
              paramString.putExtra("Chat_Mode", 1);
              this.crP.setResult(-1, paramString);
            }
            else
            {
              paramString.putExtra("Chat_User", this.ehM.field_username);
              paramString.putExtra("Chat_Mode", 1);
              paramString.putExtra("finish_direct", true);
              com.tencent.mm.plugin.profile.b.gkE.d(paramString, this.crP);
            }
          }
        }
      }
      else
      {
        if ("contact_info_biz_add".endsWith(paramString))
        {
          if (!com.tencent.mm.model.gdpr.c.aaZ())
            caV();
          while (true)
          {
            if (this.pmD != 0)
              com.tencent.mm.plugin.report.service.h.pYm.e(11263, new Object[] { Integer.valueOf(this.pmD), this.ehM.field_username });
            AppMethodBeat.o(23475);
            bool2 = bool1;
            break;
            com.tencent.mm.model.gdpr.c.a(this.crP, com.tencent.mm.model.gdpr.a.fol, this.ehM.field_username, new c.4(this));
          }
        }
        if ("contact_info_biz_read_msg_online".endsWith(paramString))
        {
          AppMethodBeat.o(23475);
          bool2 = bool1;
        }
        else
        {
          if ("contact_info_stick_biz".equals(paramString))
          {
            if (((CheckBoxPreference)this.ehK.aqO("contact_info_stick_biz")).isChecked())
            {
              com.tencent.mm.plugin.report.service.h.pYm.e(13307, new Object[] { this.ehM.field_username, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0) });
              com.tencent.mm.model.i.mn(this.ehM.field_username);
            }
            while (true)
            {
              AppMethodBeat.o(23475);
              bool2 = bool1;
              break;
              t.x(this.ehM.field_username, true);
              com.tencent.mm.plugin.report.service.h.pYm.e(13307, new Object[] { this.ehM.field_username, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(0) });
            }
          }
          if (("contact_info_guarantee_info".equals(paramString)) && (this.fuY.aei() != null) && (!bo.isNullOrNil(this.fuY.aei().fvZ)))
          {
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("rawUrl", this.fuY.aei().fvZ);
            ((Intent)localObject1).putExtra("useJs", true);
            ((Intent)localObject1).putExtra("vertical_scroll", true);
            ((Intent)localObject1).putExtra("geta8key_scene", 3);
            com.tencent.mm.bp.d.b(this.crP, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
          }
          int i;
          if (paramString.startsWith("contact_info_bizinfo_external#"))
          {
            i = bo.getInt(paramString.replace("contact_info_bizinfo_external#", ""), -1);
            if ((i >= 0) && (i < this.fuX.size()))
            {
              paramString = (d.a)this.fuX.get(i);
              localObject2 = paramString.url;
              localObject1 = new Intent();
              ((Intent)localObject1).putExtra("rawUrl", (String)localObject2);
              ((Intent)localObject1).putExtra("useJs", true);
              ((Intent)localObject1).putExtra("vertical_scroll", true);
              ((Intent)localObject1).putExtra("geta8key_scene", 3);
              ((Intent)localObject1).putExtra("KPublisherId", "brand_profile");
              ((Intent)localObject1).putExtra("prePublishId", "brand_profile");
              if (((this.pmH != null) && ((this.gwP == 39) || (this.gwP == 56) || (this.gwP == 35))) || (this.gwP == 87) || (this.gwP == 89) || (this.gwP == 85) || (this.gwP == 88))
              {
                ab.d("MicroMsg.ContactWidgetBizInfo", "from biz search.");
                localObject2 = new Bundle();
                ((Bundle)localObject2).putBoolean("KFromBizSearch", true);
                ((Bundle)localObject2).putBundle("KBizSearchExtArgs", this.pmH);
                ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject2);
                if (!com.tencent.mm.n.a.jh(this.ehM.field_type))
                  break label1172;
              }
              label1172: for (i = 7; ; i = 6)
              {
                int j = this.crP.getResources().getIdentifier(paramString.fvb, "string", this.crP.getPackageName());
                paramString = paramString.title;
                if (j > 0)
                  paramString = this.crP.getString(j);
                aV(i, paramString);
                com.tencent.mm.bp.d.b(this.crP, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
                AppMethodBeat.o(23475);
                bool2 = bool1;
                break;
              }
            }
          }
          if (("contact_info_subscribe_bizinfo".endsWith(paramString)) || ("contact_info_show_brand".endsWith(paramString)) || ("contact_info_locate".endsWith(paramString)))
          {
            localObject1 = this.pkW;
            label1296: label1702: if (localObject1 == null)
            {
              AppMethodBeat.o(23475);
              bool2 = bool1;
            }
            else
            {
              if ("contact_info_subscribe_bizinfo".endsWith(paramString))
                if (((com.tencent.mm.aj.d)localObject1).adO())
                  if (localObject1 != null)
                  {
                    if (!((com.tencent.mm.aj.d)localObject1).adR())
                      break label1407;
                    aw.Rg().a(1363, this);
                    if (!((CheckBoxPreference)this.ehK.aqO("contact_info_subscribe_bizinfo")).isChecked())
                      break label1401;
                    i = 0;
                    localObject2 = new com.tencent.mm.plugin.profile.b.c(((com.tencent.mm.aj.d)localObject1).field_username, i);
                    aw.Rg().a((m)localObject2, 0);
                    paramString = this.crP;
                    this.crP.getString(2131297061);
                    this.tipDialog = com.tencent.mm.ui.base.h.b(paramString, this.crP.getString(2131297086), true, new c.15(this, (com.tencent.mm.plugin.profile.b.c)localObject2));
                  }
              label1594: label1757: 
              while (true)
              {
                if ((!((com.tencent.mm.aj.d)localObject1).adR()) && (!((com.tencent.mm.aj.d)localObject1).adP()))
                  a((com.tencent.mm.aj.d)localObject1, false);
                AppMethodBeat.o(23475);
                bool2 = bool1;
                break;
                label1401: i = 4;
                break label1296;
                label1407: if (((com.tencent.mm.aj.d)localObject1).adP())
                {
                  paramString = (CheckBoxPreference)this.ehK.aqO("contact_info_subscribe_bizinfo");
                  z.afa();
                  localObject2 = ((com.tencent.mm.aj.d)localObject1).field_username;
                  if (!paramString.isChecked());
                  for (bool2 = true; ; bool2 = false)
                  {
                    paramString = com.tencent.mm.aj.c.a((String)localObject2, bool2, this);
                    localObject2 = this.crP;
                    this.crP.getString(2131297061);
                    this.tipDialog = com.tencent.mm.ui.base.h.b((Context)localObject2, this.crP.getString(2131297086), true, new c.16(this, paramString));
                    break;
                  }
                  if (((com.tencent.mm.aj.d)localObject1).adH())
                  {
                    ((com.tencent.mm.aj.d)localObject1).field_brandFlag |= 1;
                    if ((this.fuY == null) && (localObject1 != null))
                      this.fuY = ((com.tencent.mm.aj.d)localObject1).cJ(false);
                    if ((this.fuY != null) && (this.fuY.aeb()) && (com.tencent.mm.bp.d.afj("brandservice")))
                    {
                      this.ehK.ce("contact_info_template_recv", false);
                      paramString = com.tencent.mm.plugin.report.service.h.pYm;
                      localObject2 = ((com.tencent.mm.aj.d)localObject1).field_username;
                      if (!((com.tencent.mm.aj.d)localObject1).adH())
                        break label1702;
                    }
                  }
                  for (i = 3; ; i = 4)
                  {
                    paramString.e(13307, new Object[] { localObject2, Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(0) });
                    break;
                    this.ehK.ce("contact_info_template_recv", true);
                    break label1594;
                    ((com.tencent.mm.aj.d)localObject1).field_brandFlag &= -2;
                    this.ehK.ce("contact_info_template_recv", true);
                    break label1594;
                  }
                  if ("contact_info_show_brand".endsWith(paramString))
                  {
                    if ((((com.tencent.mm.aj.d)localObject1).field_brandFlag & 0x2) == 0);
                    for (i = 1; ; i = 0)
                    {
                      if (i == 0)
                        break label1757;
                      ((com.tencent.mm.aj.d)localObject1).field_brandFlag |= 2;
                      break;
                    }
                    ((com.tencent.mm.aj.d)localObject1).field_brandFlag &= -3;
                  }
                  else if ("contact_info_locate".endsWith(paramString))
                  {
                    if (((com.tencent.mm.aj.d)localObject1).adI())
                      ((com.tencent.mm.aj.d)localObject1).field_brandFlag &= -5;
                    else
                      this.pmG = com.tencent.mm.ui.base.h.a(this.crP, this.crP.getString(2131298076, new Object[] { this.ehM.Oj() }), this.crP.getString(2131297061), new c.1(this, (com.tencent.mm.aj.d)localObject1), new c.12(this, (com.tencent.mm.aj.d)localObject1));
                  }
                }
              }
            }
          }
          else if ("contact_info_verifyuser".endsWith(paramString))
          {
            paramString = this.pkW;
            if (paramString == null)
            {
              AppMethodBeat.o(23475);
              bool2 = bool1;
            }
            else
            {
              localObject2 = paramString.cJ(false);
              if (localObject2 == null)
              {
                AppMethodBeat.o(23475);
                bool2 = bool1;
              }
              else
              {
                localObject1 = null;
                if ((((d.b)localObject2).aek() != null) && (!bo.isNullOrNil(((d.b)localObject2).aek().fvU)))
                  paramString = ((d.b)localObject2).aek().fvU;
                while (true)
                {
                  if (!bo.isNullOrNil(paramString))
                  {
                    localObject1 = new Intent();
                    ((Intent)localObject1).putExtra("rawUrl", paramString);
                    ((Intent)localObject1).putExtra("useJs", true);
                    ((Intent)localObject1).putExtra("vertical_scroll", true);
                    ((Intent)localObject1).putExtra("geta8key_scene", 3);
                    com.tencent.mm.bp.d.b(this.crP, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
                  }
                  AppMethodBeat.o(23475);
                  bool2 = bool1;
                  break;
                  paramString = (String)localObject1;
                  if (((d.b)localObject2).ael() != null)
                  {
                    paramString = (String)localObject1;
                    if (!bo.isNullOrNil(((d.b)localObject2).ael().fwc))
                      paramString = ((d.b)localObject2).ael().fwc;
                  }
                }
              }
            }
          }
          else
          {
            if (!"contact_info_trademark".endsWith(paramString))
              break;
            paramString = this.pkW;
            if (paramString == null)
            {
              AppMethodBeat.o(23475);
              bool2 = bool1;
            }
            else
            {
              if ((paramString.cJ(false) != null) && (!bo.isNullOrNil(paramString.cJ(false).aed())))
              {
                localObject1 = new Intent();
                ((Intent)localObject1).putExtra("rawUrl", paramString.cJ(false).aed());
                ((Intent)localObject1).putExtra("useJs", true);
                ((Intent)localObject1).putExtra("vertical_scroll", true);
                ((Intent)localObject1).putExtra("geta8key_scene", 3);
                com.tencent.mm.bp.d.b(this.crP, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
              }
              AppMethodBeat.o(23475);
              bool2 = bool1;
            }
          }
        }
      }
    }
    if ("contact_is_mute".endsWith(paramString))
    {
      if (!this.eif)
      {
        bool2 = true;
        label2237: this.eif = bool2;
        if (!this.eif)
          break label2699;
        t.o(this.ehM);
        label2256: jO(this.eif);
      }
    }
    else
    {
      if ("enterprise_contact_info_enter".equals(paramString))
      {
        if (this.crP != null)
          break label2709;
        ab.e("MicroMsg.ContactWidgetBizInfo", "EnterEnterprise context is null");
      }
      label2289: if ("contact_info_biz_disable".equals(paramString))
      {
        localObject1 = this.crP.getString(2131299218);
        localObject2 = this.crP.getString(2131299217);
        com.tencent.mm.ui.base.h.d(this.crP, (String)localObject1, "", (String)localObject2, this.crP.getString(2131296868), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(23468);
            c.this.jN(false);
            AppMethodBeat.o(23468);
          }
        }
        , null);
      }
      if ("contact_info_biz_enable".equals(paramString))
        jN(true);
      if ("contact_info_template_recv".equals(paramString))
      {
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("enterprise_biz_name", this.pkW.field_username);
        com.tencent.mm.bp.d.b(this.crP, "brandservice", ".ui.ReceiveTemplateMsgMgrUI", (Intent)localObject1);
      }
      if ("contact_info_service_phone".equals(paramString))
      {
        localObject1 = this.ehK.aqO("contact_info_service_phone");
        if ((localObject1 != null) && (((Preference)localObject1).getSummary() != null) && (!bo.isNullOrNil(((Preference)localObject1).getSummary().toString())))
        {
          localObject1 = ((Preference)localObject1).getSummary().toString();
          com.tencent.mm.ui.base.h.a(this.crP, true, (String)localObject1, "", this.crP.getString(2131298504), this.crP.getString(2131296868), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              AppMethodBeat.i(23463);
              paramAnonymousDialogInterface = new Intent("android.intent.action.DIAL");
              paramAnonymousDialogInterface.setFlags(268435456);
              paramAnonymousDialogInterface.setData(Uri.parse("tel:" + this.kod));
              if (bo.k(c.this.crP, paramAnonymousDialogInterface))
                c.this.crP.startActivity(paramAnonymousDialogInterface);
              AppMethodBeat.o(23463);
            }
          }
          , null);
        }
      }
      if ("contact_info_expose_btn".equals(paramString))
        caX();
      if (paramString.equals("biz_placed_to_the_top"))
      {
        ab.d("MicroMsg.ContactWidgetBizInfo", "changePlacedTop");
        if (this.ehZ == null)
          this.ehZ = this.crP.getSharedPreferences(this.crP.getPackageName() + "_preferences", 0);
        if (this.ehM != null)
        {
          if (!this.ehM.Oe())
            break label2779;
          ab.d("MicroMsg.ContactWidgetBizInfo", "unSetPlaceTop:%s", new Object[] { this.ehM.field_username });
          t.x(this.ehM.field_username, true);
          this.ehZ.edit().putBoolean("biz_placed_to_the_top", false).commit();
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(23475);
      bool2 = bool1;
      break;
      bool2 = false;
      break label2237;
      label2699: t.p(this.ehM);
      break label2256;
      label2709: if (this.pkW == null)
      {
        ab.e("MicroMsg.ContactWidgetBizInfo", "EnterEnterprise bizInfo is null");
        break label2289;
      }
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("enterprise_biz_name", this.pkW.field_username);
      ((Intent)localObject1).addFlags(67108864);
      com.tencent.mm.bp.d.b(this.crP, "brandservice", ".ui.EnterpriseBizContactListUI", (Intent)localObject1);
      break label2289;
      label2779: com.tencent.mm.model.i.mn(this.ehM.field_username);
      ab.d("MicroMsg.ContactWidgetBizInfo", "setPlaceTop:%s", new Object[] { this.ehM.field_username });
      this.ehZ.edit().putBoolean("biz_placed_to_the_top", true).commit();
    }
  }

  public final void a(int paramInt, m paramm)
  {
    AppMethodBeat.i(23495);
    if ((this.pkW == null) || (!this.pkW.adR()))
      AppMethodBeat.o(23495);
    while (true)
    {
      return;
      if (paramm.getType() == 1354)
      {
        paramm = (CheckBoxPreference)this.ehK.aqO("contact_info_subscribe_bizinfo");
        String str = z.aeV().cI(this.pkW.field_username);
        this.pmx = z.aeV().cH(str);
        if (this.pmx != null)
        {
          if (!this.pmx.lc(4));
          for (boolean bool = true; ; bool = false)
          {
            paramm.uOT = bool;
            this.ehK.notifyDataSetChanged();
            AppMethodBeat.o(23495);
            break;
          }
        }
        ab.w("MicroMsg.ContactWidgetBizInfo", "bizChatMyuser bizChatUserInfo is null after GetBizChatMyUserInfo");
      }
      AppMethodBeat.o(23495);
    }
  }

  final void a(com.tencent.mm.aj.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(23477);
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.ehK.aqO("contact_info_subscribe_bizinfo");
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)this.ehK.aqO("contact_info_locate");
    bbo localbbo = new bbo();
    localbbo.gvb = paramd.field_brandFlag;
    localbbo.jBB = this.ehM.field_username;
    if (Bd(this.gwP))
    {
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new j.a(58, localbbo));
    }
    while (true)
    {
      z.aeR().c(paramd, new String[0]);
      localCheckBoxPreference1.uOT = paramd.adH();
      if (localCheckBoxPreference2 != null)
        localCheckBoxPreference2.uOT = paramd.adI();
      if (paramBoolean)
        caT();
      AppMethodBeat.o(23477);
      return;
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new j.a(47, localbbo));
    }
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(23478);
    boolean bool;
    if (paramad != null)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (bo.nullAsNil(paramad.field_username).length() <= 0)
        break label289;
      bool = true;
      label34: Assert.assertTrue(bool);
      if (paramf == null)
        break label295;
      bool = true;
      label46: Assert.assertTrue(bool);
      this.ehK = paramf;
      this.ehM = paramad;
      this.pli = paramBoolean;
      this.gwP = paramInt;
      this.pmD = this.crP.getIntent().getIntExtra("add_more_friend_search_scene", 0);
      this.pmI = ((SnsAdClick)this.crP.getIntent().getParcelableExtra("KSnsAdTag"));
      this.pmH = this.crP.getIntent().getBundleExtra("Contact_Ext_Args");
      this.pmJ = this.crP.getIntent().getStringExtra("key_add_contact_report_info");
      caT();
      paramf = this.crP.getIntent().getStringExtra("Contact_BIZ_PopupInfoMsg");
      if (!bo.isNullOrNil(paramf))
      {
        this.crP.getIntent().putExtra("Contact_BIZ_PopupInfoMsg", "");
        com.tencent.mm.ui.base.h.a(this.crP, paramf, "", this.crP.getString(2131296994), null);
      }
      if (paramad != null)
      {
        z.afd().qB(paramad.field_username);
        if (com.tencent.mm.aj.f.ra(paramad.field_username))
        {
          paramf = paramad.field_username;
          if (!com.tencent.mm.aj.f.kq(paramf))
            break label301;
          z.aeZ();
          com.tencent.mm.aj.a.h.a(paramf, this);
          paramf = com.tencent.mm.aj.f.qX(paramf).adX();
          if (paramf != null)
            z.afd().qB(paramf);
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(23478);
      return true;
      bool = false;
      break;
      label289: bool = false;
      break label34;
      label295: bool = false;
      break label46;
      label301: if (com.tencent.mm.aj.f.rc(paramf))
      {
        z.afa();
        com.tencent.mm.aj.c.a(paramf, this);
        z.aeR();
        paramf = e.qT(paramf);
        if (paramf != null)
          z.afd().qB(paramf);
      }
    }
  }

  final void aV(int paramInt, String paramString)
  {
    AppMethodBeat.i(23485);
    if ((this.pmH == null) || ((this.gwP != 39) && (this.gwP != 56) && (this.gwP != 35) && (this.gwP != 87) && (this.gwP != 88) && (this.gwP != 89) && (this.gwP != 85)))
    {
      ab.d("MicroMsg.ContactWidgetBizInfo", "mExtArgs is null or the add contact action is not from biz search.");
      AppMethodBeat.o(23485);
    }
    while (true)
    {
      return;
      if (this.ehM != null)
        break;
      ab.i("MicroMsg.ContactWidgetBizInfo", "contact is null.");
      AppMethodBeat.o(23485);
    }
    String str1 = this.pmH.getString("Contact_Ext_Args_Search_Id");
    String str2 = bo.nullAsNil(this.pmH.getString("Contact_Ext_Args_Query_String"));
    int i = this.pmH.getInt("Contact_Ext_Args_Index");
    int j;
    label211: String str3;
    switch (this.gwP)
    {
    default:
      j = 0;
      str3 = bo.nullAsNil(this.pmH.getString("Contact_Ext_Extra_Params"));
      str2 = str2 + "," + paramInt + "," + bo.nullAsNil(this.ehM.field_username) + "," + i + "," + System.currentTimeMillis() / 1000L + "," + str1 + "," + j;
      if (bo.isNullOrNil(paramString))
        break;
    case 35:
    case 87:
    case 88:
    case 89:
    case 85:
    }
    for (paramString = str2 + "," + paramString + "," + str3; ; paramString = str2 + ",," + str3)
    {
      ab.v("MicroMsg.ContactWidgetBizInfo", "report 10866: %s", new Object[] { paramString });
      com.tencent.mm.plugin.report.service.h.pYm.X(10866, paramString);
      AppMethodBeat.o(23485);
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

  public final String aeI()
  {
    return "MicroMsg.ContactWidgetBizInfo";
  }

  public final boolean biV()
  {
    AppMethodBeat.i(23482);
    BizInfoHeaderPreference localBizInfoHeaderPreference = (BizInfoHeaderPreference)this.ehK.aqO("contact_info_header_bizinfo");
    if (localBizInfoHeaderPreference != null)
      localBizInfoHeaderPreference.onDetach();
    AppMethodBeat.o(23482);
    return true;
  }

  final void caV()
  {
    AppMethodBeat.i(23486);
    Object localObject1;
    if ((this.crP.getIntent() != null) && (this.crP.getIntent().getBooleanExtra("KIsHardDevice", false)))
    {
      localObject1 = this.crP.getIntent().getStringExtra("KHardDeviceBindTicket");
      if (!bo.isNullOrNil((String)localObject1))
        break label163;
      ab.i("MicroMsg.ContactWidgetBizInfo", "bindTicket is null, means it is not switch from QRcode scan, just add contact");
    }
    while (true)
    {
      localObject1 = new com.tencent.mm.pluginsdk.ui.applet.a(this.crP, new c.6(this));
      Object localObject2 = new LinkedList();
      ((LinkedList)localObject2).add(Integer.valueOf(this.gwP));
      if (this.fvh != null)
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).vjK = this.fvh;
      if (!bo.isNullOrNil(this.mGZ))
        ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).mGZ = this.mGZ;
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).vjP = true;
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).a(this.ehM.field_username, (LinkedList)localObject2, this.pmJ);
      AppMethodBeat.o(23486);
      while (true)
      {
        return;
        label163: if (caW())
          break;
        ab.d("MicroMsg.ContactWidgetBizInfo", "IsHardDevice, bindTicket = %s", new Object[] { localObject1 });
        aw.Rg().a(536, this);
        localObject2 = new dc();
        ((dc)localObject2).cwj.cwl = ((String)localObject1);
        ((dc)localObject2).cwj.opType = 1;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        localObject1 = ((dc)localObject2).cwk.cwn;
        localObject2 = this.crP;
        this.crP.getString(2131297061);
        this.tipDialog = com.tencent.mm.ui.base.h.b((Context)localObject2, this.crP.getString(2131297086), true, new c.5(this, (m)localObject1));
        AppMethodBeat.o(23486);
      }
    }
  }

  final void caX()
  {
    AppMethodBeat.i(23488);
    if ((this.ehM == null) || (bo.isNullOrNil(this.ehM.field_username)))
      AppMethodBeat.o(23488);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", String.format("https://mp.weixin.qq.com/mp/infringement?username=%s&from=1#wechat_redirect", new Object[] { this.ehM.field_username }));
      localIntent.putExtra("showShare", false);
      com.tencent.mm.bp.d.b(this.crP, "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(23488);
    }
  }

  public final void e(LinkedList<cwa> paramLinkedList)
  {
    AppMethodBeat.i(23494);
    z.aeS().b(this);
    if (this.ehK == null)
    {
      ab.e("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, screen is null");
      AppMethodBeat.o(23494);
    }
    while (true)
    {
      return;
      if (this.ehM == null)
      {
        ab.e("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, contact is null");
        AppMethodBeat.o(23494);
      }
      else if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
      {
        ab.w("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, worker is null");
        AppMethodBeat.o(23494);
      }
      else
      {
        if (!bo.isNullOrNil(this.pmE))
        {
          Iterator localIterator = paramLinkedList.iterator();
          while (true)
          {
            Object localObject;
            if (localIterator.hasNext())
            {
              localObject = (cwa)localIterator.next();
              if ((((cwa)localObject).xrU != null) && (((cwa)localObject).xrU.equals(this.pmE)))
              {
                this.ehK.ce("contact_info_kf_worker", false);
                this.ehK.aqO("contact_info_kf_worker").setSummary(((cwa)localObject).wCW);
                AppMethodBeat.o(23494);
                break;
              }
            }
          }
        }
        this.ehK.ce("contact_info_kf_worker", false);
        localObject = this.ehK.aqO("contact_info_kf_worker");
        if ((localObject != null) && (paramLinkedList != null) && (paramLinkedList.get(0) != null))
          ((Preference)localObject).setSummary(((cwa)paramLinkedList.get(0)).wCW);
        AppMethodBeat.o(23494);
      }
    }
  }

  final void jN(boolean paramBoolean)
  {
    AppMethodBeat.i(23476);
    Object localObject = this.pkW.field_username;
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      com.tencent.mm.plugin.profile.b.d locald = new com.tencent.mm.plugin.profile.b.d((String)localObject, paramBoolean);
      aw.Rg().a(1394, this);
      aw.Rg().a(locald, 0);
      localObject = this.crP;
      this.crP.getString(2131297061);
      this.tipDialog = com.tencent.mm.ui.base.h.b((Context)localObject, this.crP.getString(2131297086), true, new c.14(this, locald));
      AppMethodBeat.o(23476);
      return;
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(23483);
    if (this.crP == null)
    {
      ab.e("MicroMsg.ContactWidgetBizInfo", "null == context");
      AppMethodBeat.o(23483);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ContactWidgetBizInfo", "onActivityResult, requestCode = %d, resultCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(23483);
        break;
      case 1:
        if ((paramInt2 == -1) && (paramIntent != null))
        {
          String str1 = paramIntent.getStringExtra("be_send_card_name");
          String str2 = paramIntent.getStringExtra("received_card_name");
          boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
          paramIntent = paramIntent.getStringExtra("custom_send_text");
          com.tencent.mm.plugin.messenger.a.g.bOk().q(str1, str2, bool);
          com.tencent.mm.plugin.messenger.a.g.bOk().eZ(paramIntent, str2);
          com.tencent.mm.ui.widget.snackbar.b.i(this.crP, this.crP.getString(2131299884));
          AppMethodBeat.o(23483);
        }
        else
        {
          AppMethodBeat.o(23483);
        }
        break;
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    Object localObject1 = null;
    AppMethodBeat.i(23493);
    ab.d("MicroMsg.ContactWidgetBizInfo", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    this.pmF = false;
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    if (paramm == null)
    {
      ab.e("MicroMsg.ContactWidgetBizInfo", "scene == null");
      AppMethodBeat.o(23493);
    }
    while (true)
    {
      return;
      aw.Rg().b(paramm.getType(), this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.ContactWidgetBizInfo", "scene.getType() = %s", new Object[] { Integer.valueOf(paramm.getType()) });
        AppMethodBeat.o(23493);
      }
      else
      {
        ab.d("MicroMsg.ContactWidgetBizInfo", "scene.getType() = %s", new Object[] { Integer.valueOf(paramm.getType()) });
        if (paramm.getType() == 536)
        {
          aw.Rg().b(536, this);
          caT();
          AppMethodBeat.o(23493);
        }
        else if (paramm.getType() == 1363)
        {
          paramString = (com.tencent.mm.plugin.profile.b.c)paramm;
          if ((paramString.ehh != null) && (paramString.ehh.fsH.fsP != null));
          Object localObject2;
          for (paramString = (bxs)paramString.ehh.fsH.fsP; ; paramString = null)
          {
            localObject2 = (com.tencent.mm.plugin.profile.b.c)paramm;
            paramm = (m)localObject1;
            if (((com.tencent.mm.plugin.profile.b.c)localObject2).ehh != null)
            {
              paramm = (m)localObject1;
              if (((com.tencent.mm.plugin.profile.b.c)localObject2).ehh.fsG.fsP != null)
                paramm = (bxr)((com.tencent.mm.plugin.profile.b.c)localObject2).ehh.fsG.fsP;
            }
            if ((paramString != null) && (paramString.vNh != null) && (paramString.vNh.ret == 0) && (paramString.vNe != null) && (!bo.isNullOrNil(paramString.vNe.vNc)))
              break label421;
            if ((paramString == null) || (paramString.vNh == null))
              break label404;
            ab.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd err:code:%s", new Object[] { Integer.valueOf(paramString.vNh.ret) });
            AppMethodBeat.o(23493);
            break;
          }
          label404: ab.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd err:resp == null");
          AppMethodBeat.o(23493);
          continue;
          label421: if (paramString.vNe == null)
          {
            ab.w("MicroMsg.ContactWidgetBizInfo", "willen onSceneEnd resp.user == null");
            AppMethodBeat.o(23493);
          }
          else
          {
            localObject2 = z.aeV().cH(paramString.vNe.vNc);
            localObject1 = localObject2;
            if (localObject2 == null)
            {
              localObject1 = new j();
              ((j)localObject1).field_userId = paramString.vNe.vNc;
            }
            ((j)localObject1).field_userName = paramString.vNe.kfT;
            ((j)localObject1).field_brandUserName = paramm.vNb;
            ((j)localObject1).field_UserVersion = paramString.vNe.ver;
            ((j)localObject1).field_headImageUrl = paramString.vNe.vMW;
            ((j)localObject1).field_profileUrl = paramString.vNe.vNk;
            ((j)localObject1).field_bitFlag = paramString.vNe.vMX;
            ((j)localObject1).field_addMemberUrl = paramString.vNe.vNa;
            ((j)localObject1).field_needToUpdate = false;
            if (!z.aeV().b((j)localObject1))
              z.aeV().a((j)localObject1);
            AppMethodBeat.o(23493);
          }
        }
        else if (paramm.getType() == 1394)
        {
          localObject1 = ((com.tencent.mm.plugin.profile.b.d)paramm).caz();
          paramString = ((com.tencent.mm.plugin.profile.b.d)paramm).cay();
          if ((paramString == null) || (paramString.vNh == null) || (paramString.vNh.ret != 0))
          {
            if ((paramString != null) && (paramString.vNh != null))
            {
              ab.w("MicroMsg.ContactWidgetBizInfo", "chuangchen onSceneEnd type:%s, err:code:%s", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramString.vNh.ret) });
              AppMethodBeat.o(23493);
            }
            else
            {
              ab.w("MicroMsg.ContactWidgetBizInfo", "chuangchen onSceneEnd type:%s, err:resp == null", new Object[] { Integer.valueOf(paramm.getType()) });
              AppMethodBeat.o(23493);
            }
          }
          else
          {
            if (!((cfr)localObject1).xeS)
            {
              paramInt1 = 1;
              label756: if (paramInt1 == 0)
                break label990;
              paramString = this.pkW;
              paramString.field_brandFlag &= -2;
              a(paramString, true);
              aw.ZK();
              if (com.tencent.mm.model.c.XR().aoZ(paramString.field_username) == null)
              {
                localObject1 = new ak(paramString.field_username);
                ((ak)localObject1).jj(bo.nullAsNil(this.pkW.adX()));
                aw.ZK();
                paramm = com.tencent.mm.model.c.XO().Rb(paramString.field_username);
                if (paramm == null)
                  break label944;
                aw.ZK();
                com.tencent.mm.model.c.XR().d((ak)localObject1);
                aw.ZK();
                com.tencent.mm.model.c.XR().aq(paramm);
              }
            }
            while (true)
            {
              aw.ZK();
              if (com.tencent.mm.model.c.XR().aoZ(paramString.field_enterpriseFather) != null)
                break label967;
              paramString = new ak(paramString.field_enterpriseFather);
              paramString.dsI();
              aw.ZK();
              com.tencent.mm.model.c.XR().d(paramString);
              AppMethodBeat.o(23493);
              break;
              paramInt1 = 0;
              break label756;
              label944: ((ak)localObject1).dsI();
              aw.ZK();
              com.tencent.mm.model.c.XR().d((ak)localObject1);
            }
            label967: aw.ZK();
            com.tencent.mm.model.c.XQ().aoj(paramString.field_enterpriseFather);
            AppMethodBeat.o(23493);
            continue;
            label990: paramString = this.pkW;
            paramString.field_brandFlag |= 1;
            a(paramString, true);
            aw.ZK();
            com.tencent.mm.model.c.XR().aoX(paramString.field_username);
            aw.ZK();
            if (com.tencent.mm.model.c.XR().apl(paramString.field_enterpriseFather) <= 0)
            {
              aw.ZK();
              com.tencent.mm.model.c.XR().aoX(paramString.field_enterpriseFather);
              AppMethodBeat.o(23493);
            }
            else
            {
              aw.ZK();
              com.tencent.mm.model.c.XQ().aoj(paramString.field_enterpriseFather);
              AppMethodBeat.o(23493);
            }
          }
        }
        else if (paramm.getType() == 1343)
        {
          caT();
          AppMethodBeat.o(23493);
        }
        else
        {
          if (paramm.getType() == 1228)
            caT();
          AppMethodBeat.o(23493);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.c
 * JD-Core Version:    0.6.2
 */