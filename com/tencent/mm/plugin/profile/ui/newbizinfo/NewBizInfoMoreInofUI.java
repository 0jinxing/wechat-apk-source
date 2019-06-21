package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.o;
import com.tencent.mm.aj.d.a;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.d.b.d;
import com.tencent.mm.aj.d.b.e;
import com.tencent.mm.aj.d.b.g;
import com.tencent.mm.aj.g;
import com.tencent.mm.aj.h.a;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.profile.ui.IconWidgetPreference;
import com.tencent.mm.protocal.protobuf.cwa;
import com.tencent.mm.protocal.protobuf.uy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NewBizInfoMoreInofUI extends MMPreference
  implements h.a
{
  private com.tencent.mm.ui.base.preference.f ehK;
  private ad ehM;
  private List<d.a> fuX;
  private d.b fuY;
  private boolean fvf = false;
  private int gwP;
  private com.tencent.mm.aj.d pkW;
  private String pmE;
  private boolean pmF;
  private Bundle pmH;
  private uy pmz;

  private String Bc(int paramInt)
  {
    AppMethodBeat.i(23908);
    String str;
    switch (paramInt)
    {
    default:
      ab.w("MicroMsg.NewBizInfoMoreInofUI", "getVerifyStr, error type %d", new Object[] { Integer.valueOf(paramInt) });
      str = getResources().getString(2131298552);
      AppMethodBeat.o(23908);
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return str;
      str = getResources().getString(2131298745);
      AppMethodBeat.o(23908);
      continue;
      str = getResources().getString(2131298474);
      AppMethodBeat.o(23908);
      continue;
      str = getResources().getString(2131298475);
      AppMethodBeat.o(23908);
    }
  }

  private void UR(String paramString)
  {
    AppMethodBeat.i(23904);
    ab.d("MicroMsg.NewBizInfoMoreInofUI", "updateKF %s, %b", new Object[] { paramString, Boolean.valueOf(this.pmF) });
    if (this.pmF)
      AppMethodBeat.o(23904);
    while (true)
    {
      return;
      this.pmE = paramString;
      if ((this.fuY == null) || (!this.fuY.aeq()) || (this.ehM == null))
      {
        this.ehK.ce("contact_info_kf_worker", true);
        AppMethodBeat.o(23904);
      }
      else
      {
        if (!bo.isNullOrNil(paramString))
          break;
        localObject1 = z.aeQ().rh(this.ehM.field_username);
        if (localObject1 == null)
        {
          this.ehK.ce("contact_info_kf_worker", true);
          z.aeS().a(this);
          z.aeS().ax(this.ehM.field_username, r.Yz());
          this.pmF = true;
          AppMethodBeat.o(23904);
        }
        else
        {
          ab.d("MicroMsg.NewBizInfoMoreInofUI", "has default kf %s", new Object[] { ((g)localObject1).field_openId });
          this.ehK.ce("contact_info_kf_worker", false);
          localObject2 = (IconWidgetPreference)this.ehK.aqO("contact_info_kf_worker");
          ((IconWidgetPreference)localObject2).setSummary(((g)localObject1).field_nickname);
          paramString = b.a(((g)localObject1).field_openId, false, -1);
          if (paramString == null)
          {
            c((g)localObject1);
            US(((g)localObject1).field_openId);
            AppMethodBeat.o(23904);
          }
          else
          {
            ((IconWidgetPreference)localObject2).O(paramString);
            AppMethodBeat.o(23904);
          }
        }
      }
    }
    Object localObject2 = z.aeQ();
    Object localObject1 = ((com.tencent.mm.aj.i)localObject2).rg(paramString);
    if ((localObject1 == null) || (com.tencent.mm.aj.i.a((g)localObject1)))
    {
      z.aeS().a(this);
      z.aeS().ay(this.ehM.field_username, paramString);
      this.pmF = true;
    }
    if (localObject1 == null)
      ab.d("MicroMsg.NewBizInfoMoreInofUI", "no such kf, get default kf");
    for (paramString = ((com.tencent.mm.aj.i)localObject2).rh(this.ehM.field_username); ; paramString = (String)localObject1)
    {
      if (paramString == null)
      {
        this.ehK.ce("contact_info_kf_worker", true);
        AppMethodBeat.o(23904);
        break;
      }
      this.ehK.ce("contact_info_kf_worker", false);
      localObject2 = (IconWidgetPreference)this.ehK.aqO("contact_info_kf_worker");
      ((IconWidgetPreference)localObject2).setSummary(paramString.field_nickname);
      localObject1 = b.a(paramString.field_openId, false, -1);
      if (localObject1 == null)
      {
        c(paramString);
        US(paramString.field_openId);
      }
      while (true)
      {
        ab.d("MicroMsg.NewBizInfoMoreInofUI", "kf worker %s, %s", new Object[] { paramString.field_openId, paramString.field_nickname });
        AppMethodBeat.o(23904);
        break;
        ((IconWidgetPreference)localObject2).O((Bitmap)localObject1);
      }
    }
  }

  private void US(final String paramString)
  {
    AppMethodBeat.i(23906);
    al.n(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(23898);
        if (NewBizInfoMoreInofUI.a(NewBizInfoMoreInofUI.this) == null)
        {
          ab.w("MicroMsg.NewBizInfoMoreInofUI", "LazyGetAvatar screen is null");
          AppMethodBeat.o(23898);
        }
        while (true)
        {
          return;
          IconWidgetPreference localIconWidgetPreference = (IconWidgetPreference)NewBizInfoMoreInofUI.a(NewBizInfoMoreInofUI.this).aqO("contact_info_kf_worker");
          if ((localIconWidgetPreference != null) && (NewBizInfoMoreInofUI.a(NewBizInfoMoreInofUI.this) != null))
          {
            Bitmap localBitmap = b.a(paramString, false, -1);
            if (localBitmap != null)
            {
              ab.d("MicroMsg.NewBizInfoMoreInofUI", "LazyGetAvatar success %s, update screen", new Object[] { paramString });
              localIconWidgetPreference.O(localBitmap);
              NewBizInfoMoreInofUI.a(NewBizInfoMoreInofUI.this).notifyDataSetChanged();
            }
          }
          AppMethodBeat.o(23898);
        }
      }
    }
    , 2000L);
    AppMethodBeat.o(23906);
  }

  private void aV(int paramInt, String paramString)
  {
    AppMethodBeat.i(23911);
    if ((this.pmH == null) || ((this.gwP != 39) && (this.gwP != 56) && (this.gwP != 35) && (this.gwP != 87) && (this.gwP != 88) && (this.gwP != 89) && (this.gwP != 85)))
    {
      ab.d("MicroMsg.NewBizInfoMoreInofUI", "mExtArgs is null or the add contact action is not from biz search.");
      AppMethodBeat.o(23911);
    }
    while (true)
    {
      return;
      if (this.ehM != null)
        break;
      ab.i("MicroMsg.NewBizInfoMoreInofUI", "contact is null.");
      AppMethodBeat.o(23911);
    }
    String str1 = this.pmH.getString("Contact_Ext_Args_Search_Id");
    String str2 = bo.nullAsNil(this.pmH.getString("Contact_Ext_Args_Query_String"));
    int i = this.pmH.getInt("Contact_Ext_Args_Index");
    int j;
    label207: String str3;
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
      ab.v("MicroMsg.NewBizInfoMoreInofUI", "report 10866: %s", new Object[] { paramString });
      com.tencent.mm.plugin.report.service.h.pYm.X(10866, paramString);
      AppMethodBeat.o(23911);
      break;
      j = 1;
      break label207;
      j = 2;
      break label207;
      j = 3;
      break label207;
      j = 4;
      break label207;
      j = 5;
      break label207;
    }
  }

  private boolean adV()
  {
    AppMethodBeat.i(23909);
    boolean bool;
    if (this.pkW == null)
    {
      bool = true;
      AppMethodBeat.o(23909);
    }
    while (true)
    {
      return bool;
      bool = this.pkW.adV();
      AppMethodBeat.o(23909);
    }
  }

  private static void c(g paramg)
  {
    AppMethodBeat.i(23905);
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
    ab.d("MicroMsg.NewBizInfoMoreInofUI", "downloadKFAvatar, %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    AppMethodBeat.o(23905);
  }

  private void cbE()
  {
    AppMethodBeat.i(23901);
    com.tencent.mm.aj.d locald1 = com.tencent.mm.aj.f.qX(this.ehM.field_username);
    this.fuX = null;
    this.fuY = null;
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
      this.fvf = this.fuY.aea();
    }
    AppMethodBeat.o(23901);
  }

  private d.a cbJ()
  {
    AppMethodBeat.i(23903);
    d.a locala;
    if ((this.fuX == null) || (this.fuX.size() < 0))
    {
      ab.w("MicroMsg.NewBizInfoMoreInofUI", "brandInfoList is null not show location");
      AppMethodBeat.o(23903);
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
          if ((locala.fvb.equals("__mp_wording__brandinfo_location")) || (getString(2131298482).equals(locala.title)))
          {
            AppMethodBeat.o(23903);
            break;
          }
        }
      ab.w("MicroMsg.NewBizInfoMoreInofUI", "brandInfoList is null not show location");
      AppMethodBeat.o(23903);
      locala = null;
    }
  }

  public final int JC()
  {
    return 2131165253;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    int i = 6;
    boolean bool = true;
    AppMethodBeat.i(23910);
    paramPreference = paramPreference.mKey;
    ab.i("MicroMsg.NewBizInfoMoreInofUI", paramPreference + " item has been clicked!");
    if ("contact_info_see_locate".endsWith(paramPreference))
    {
      paramf = cbJ();
      if (paramf == null)
      {
        ab.e("MicroMsg.NewBizInfoMoreInofUI", "[onPreferenceTreeClick] info is null, err");
        AppMethodBeat.o(23910);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      Object localObject = paramf.url;
      paramPreference = new Intent();
      paramPreference.putExtra("rawUrl", (String)localObject);
      paramPreference.putExtra("useJs", true);
      paramPreference.putExtra("vertical_scroll", true);
      paramPreference.putExtra("geta8key_scene", 3);
      paramPreference.putExtra("KPublisherId", "brand_profile");
      paramPreference.putExtra("prePublishId", "brand_profile");
      if (((this.pmH != null) && ((this.gwP == 39) || (this.gwP == 56) || (this.gwP == 35))) || (this.gwP == 87) || (this.gwP == 89) || (this.gwP == 85) || (this.gwP == 88))
      {
        ab.d("MicroMsg.NewBizInfoMoreInofUI", "from biz search.");
        localObject = new Bundle();
        ((Bundle)localObject).putBoolean("KFromBizSearch", true);
        ((Bundle)localObject).putBundle("KBizSearchExtArgs", this.pmH);
        paramPreference.putExtra("jsapiargs", (Bundle)localObject);
        if (!com.tencent.mm.n.a.jh(this.ehM.field_type))
          break label351;
      }
      int j;
      label351: for (i = 7; ; i = 6)
      {
        j = getResources().getIdentifier(paramf.fvb, "string", getPackageName());
        paramf = paramf.title;
        if (j > 0)
          paramf = getString(j);
        aV(i, paramf);
        com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
        AppMethodBeat.o(23910);
        break;
      }
      if ("contact_info_verifyuser".endsWith(paramPreference))
      {
        paramf = this.pkW;
        if (paramf == null)
        {
          AppMethodBeat.o(23910);
        }
        else
        {
          localObject = paramf.cJ(false);
          if (localObject == null)
          {
            AppMethodBeat.o(23910);
          }
          else
          {
            paramPreference = null;
            if ((((d.b)localObject).aek() != null) && (!bo.isNullOrNil(((d.b)localObject).aek().fvU)))
              paramf = ((d.b)localObject).aek().fvU;
            while (true)
            {
              if (!bo.isNullOrNil(paramf))
              {
                paramPreference = new Intent();
                paramPreference.putExtra("rawUrl", paramf);
                paramPreference.putExtra("useJs", true);
                paramPreference.putExtra("vertical_scroll", true);
                paramPreference.putExtra("geta8key_scene", 3);
                com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
              }
              com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.cP(this.ehM.field_username, 1200);
              AppMethodBeat.o(23910);
              break;
              paramf = paramPreference;
              if (((d.b)localObject).ael() != null)
              {
                paramf = paramPreference;
                if (!bo.isNullOrNil(((d.b)localObject).ael().fwc))
                  paramf = ((d.b)localObject).ael().fwc;
              }
            }
          }
        }
      }
      else if ("contact_info_trademark".endsWith(paramPreference))
      {
        paramf = this.pkW;
        if (paramf == null)
        {
          AppMethodBeat.o(23910);
        }
        else
        {
          if ((paramf.cJ(false) != null) && (!bo.isNullOrNil(paramf.cJ(false).aed())))
          {
            paramPreference = new Intent();
            paramPreference.putExtra("rawUrl", paramf.cJ(false).aed());
            paramPreference.putExtra("useJs", true);
            paramPreference.putExtra("vertical_scroll", true);
            paramPreference.putExtra("geta8key_scene", 3);
            com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
          }
          AppMethodBeat.o(23910);
        }
      }
      else
      {
        if ("contact_info_service_phone".equals(paramPreference))
        {
          paramf = paramf.aqO("contact_info_service_phone");
          if ((paramf != null) && (paramf.getSummary() != null) && (!bo.isNullOrNil(paramf.getSummary().toString())))
          {
            paramf = paramf.getSummary().toString();
            com.tencent.mm.ui.base.h.a(this, true, paramf, "", getString(2131298504), getString(2131296868), new NewBizInfoMoreInofUI.4(this, paramf), null);
          }
        }
        if (paramPreference.startsWith("contact_info_bizinfo_external#"))
        {
          j = bo.getInt(paramPreference.replace("contact_info_bizinfo_external#", ""), -1);
          if ((j >= 0) && (j < this.fuX.size()))
          {
            paramf = (d.a)this.fuX.get(j);
            localObject = paramf.url;
            paramPreference = new Intent();
            paramPreference.putExtra("rawUrl", (String)localObject);
            paramPreference.putExtra("useJs", true);
            paramPreference.putExtra("vertical_scroll", true);
            paramPreference.putExtra("geta8key_scene", 3);
            paramPreference.putExtra("KPublisherId", "brand_profile");
            paramPreference.putExtra("prePublishId", "brand_profile");
            if (((this.pmH != null) && ((this.gwP == 39) || (this.gwP == 56) || (this.gwP == 35))) || (this.gwP == 87) || (this.gwP == 89) || (this.gwP == 85) || (this.gwP == 88))
            {
              ab.d("MicroMsg.NewBizInfoMoreInofUI", "from biz search.");
              localObject = new Bundle();
              ((Bundle)localObject).putBoolean("KFromBizSearch", true);
              ((Bundle)localObject).putBundle("KBizSearchExtArgs", this.pmH);
              paramPreference.putExtra("jsapiargs", (Bundle)localObject);
              if (com.tencent.mm.n.a.jh(this.ehM.field_type))
                i = 7;
              j = getResources().getIdentifier(paramf.fvb, "string", getPackageName());
              paramf = paramf.title;
              if (j > 0)
                paramf = getString(j);
              aV(i, paramf);
            }
            com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
            AppMethodBeat.o(23910);
          }
        }
        else
        {
          if (!paramPreference.equals("contact_info_verifyuser_weibo"))
            break;
          new com.tencent.mm.plugin.profile.ui.a.a(this).fF(this.ehM.dug, this.ehM.field_username);
          AppMethodBeat.o(23910);
        }
      }
    }
    if (("contact_info_guarantee_info".equals(paramPreference)) && (this.fuY.aei() != null) && (!bo.isNullOrNil(this.fuY.aei().fvZ)))
    {
      paramf = new Intent();
      paramf.putExtra("rawUrl", this.fuY.aei().fvZ);
      paramf.putExtra("useJs", true);
      paramf.putExtra("vertical_scroll", true);
      paramf.putExtra("geta8key_scene", 3);
      com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
    }
    if ((!"contact_info_expose_btn".equals(paramPreference)) || (this.ehM == null) || (bo.isNullOrNil(this.ehM.field_username)));
    while (true)
    {
      AppMethodBeat.o(23910);
      bool = false;
      break;
      paramf = new Intent();
      paramf.putExtra("rawUrl", String.format("https://mp.weixin.qq.com/mp/infringement?username=%s&from=1#wechat_redirect", new Object[] { this.ehM.field_username }));
      paramf.putExtra("showShare", false);
      com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
    }
  }

  public final String aeI()
  {
    return "MicroMsg.NewBizInfoMoreInofUI";
  }

  public final void e(LinkedList<cwa> paramLinkedList)
  {
    AppMethodBeat.i(23907);
    z.aeS().b(this);
    if (this.ehK == null)
    {
      ab.e("MicroMsg.NewBizInfoMoreInofUI", "onKFSceneEnd, screen is null");
      AppMethodBeat.o(23907);
    }
    while (true)
    {
      return;
      if (this.ehM == null)
      {
        ab.e("MicroMsg.NewBizInfoMoreInofUI", "onKFSceneEnd, contact is null");
        AppMethodBeat.o(23907);
      }
      else if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
      {
        ab.w("MicroMsg.NewBizInfoMoreInofUI", "onKFSceneEnd, worker is null");
        AppMethodBeat.o(23907);
      }
      else
      {
        if (!bo.isNullOrNil(this.pmE))
        {
          Iterator localIterator = paramLinkedList.iterator();
          while (true)
            if (localIterator.hasNext())
            {
              cwa localcwa = (cwa)localIterator.next();
              if ((localcwa.xrU != null) && (localcwa.xrU.equals(this.pmE)))
              {
                this.ehK.ce("contact_info_kf_worker", false);
                this.ehK.aqO("contact_info_kf_worker").setSummary(localcwa.wCW);
                AppMethodBeat.o(23907);
                break;
              }
            }
        }
        this.ehK.ce("contact_info_kf_worker", false);
        this.ehK.aqO("contact_info_kf_worker").setSummary(((cwa)paramLinkedList.get(0)).wCW);
        AppMethodBeat.o(23907);
      }
    }
  }

  // ERROR //
  public final void initView()
  {
    // Byte code:
    //   0: sipush 23902
    //   3: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   10: ldc_w 683
    //   13: iconst_1
    //   14: invokeinterface 115 3 0
    //   19: aload_0
    //   20: invokespecial 685	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:cbE	()V
    //   23: aload_0
    //   24: getfield 105	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehM	Lcom/tencent/mm/storage/ad;
    //   27: getfield 524	com/tencent/mm/g/c/ap:field_type	I
    //   30: invokestatic 530	com/tencent/mm/n/a:jh	(I)Z
    //   33: ifeq +807 -> 840
    //   36: aload_0
    //   37: invokespecial 686	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:adV	()Z
    //   40: ifeq +800 -> 840
    //   43: aload_0
    //   44: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   47: ldc_w 688
    //   50: invokeinterface 169 2 0
    //   55: checkcast 690	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   58: astore_1
    //   59: aload_0
    //   60: getfield 105	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehM	Lcom/tencent/mm/storage/ad;
    //   63: invokevirtual 695	com/tencent/mm/storage/ad:Hq	()Ljava/lang/String;
    //   66: invokestatic 121	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   69: ifne +666 -> 735
    //   72: aload_0
    //   73: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   76: ldc_w 688
    //   79: iconst_0
    //   80: invokeinterface 115 3 0
    //   85: aload_1
    //   86: aload_0
    //   87: aload_0
    //   88: getfield 105	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehM	Lcom/tencent/mm/storage/ad;
    //   91: invokevirtual 695	com/tencent/mm/storage/ad:Hq	()Ljava/lang/String;
    //   94: invokestatic 700	com/tencent/mm/pluginsdk/ui/e/j:b	(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/text/SpannableString;
    //   97: invokevirtual 701	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   100: aload_1
    //   101: new 703	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI$2
    //   104: dup
    //   105: aload_0
    //   106: aload_1
    //   107: invokespecial 706	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI$2:<init>	(Lcom/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI;Lcom/tencent/mm/ui/base/preference/KeyValuePreference;)V
    //   110: putfield 710	com/tencent/mm/ui/base/preference/Preference:yCY	Lcom/tencent/mm/ui/base/preference/Preference$c;
    //   113: aload_0
    //   114: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   117: ifnull +821 -> 938
    //   120: aload_0
    //   121: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   124: invokevirtual 556	com/tencent/mm/aj/d$b:aek	()Lcom/tencent/mm/aj/d$b$d;
    //   127: ifnull +811 -> 938
    //   130: aload_0
    //   131: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   134: invokevirtual 556	com/tencent/mm/aj/d$b:aek	()Lcom/tencent/mm/aj/d$b$d;
    //   137: getfield 713	com/tencent/mm/aj/d$b$d:fvS	Ljava/lang/String;
    //   140: invokestatic 121	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   143: ifne +795 -> 938
    //   146: aload_0
    //   147: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   150: invokevirtual 556	com/tencent/mm/aj/d$b:aek	()Lcom/tencent/mm/aj/d$b$d;
    //   153: astore_2
    //   154: aload_0
    //   155: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   158: ldc_w 552
    //   161: invokeinterface 169 2 0
    //   166: checkcast 690	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   169: astore_3
    //   170: aload_3
    //   171: ifnull +751 -> 922
    //   174: aload_3
    //   175: invokevirtual 716	com/tencent/mm/ui/base/preference/KeyValuePreference:dAD	()V
    //   178: aload_3
    //   179: iconst_0
    //   180: putfield 719	com/tencent/mm/ui/base/preference/KeyValuePreference:yCj	Z
    //   183: aload_2
    //   184: getfield 722	com/tencent/mm/aj/d$b$d:fvT	Ljava/lang/String;
    //   187: invokestatic 121	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   190: ifeq +666 -> 856
    //   193: aload_3
    //   194: aload_0
    //   195: aload_2
    //   196: getfield 725	com/tencent/mm/aj/d$b$d:fvR	I
    //   199: invokespecial 727	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:Bc	(I)Ljava/lang/String;
    //   202: putfield 730	com/tencent/mm/ui/base/preference/KeyValuePreference:ylA	Ljava/lang/String;
    //   205: getstatic 736	com/tencent/mm/model/ao$a:flw	Lcom/tencent/mm/model/ao$c;
    //   208: ifnull +659 -> 867
    //   211: getstatic 736	com/tencent/mm/model/ao$a:flw	Lcom/tencent/mm/model/ao$c;
    //   214: aload_0
    //   215: getfield 105	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehM	Lcom/tencent/mm/storage/ad;
    //   218: getfield 739	com/tencent/mm/g/c/ap:field_verifyFlag	I
    //   221: invokeinterface 744 2 0
    //   226: fconst_2
    //   227: invokestatic 749	com/tencent/mm/sdk/platformtools/BackwardSupportUtil$b:i	(Ljava/lang/String;F)Landroid/graphics/Bitmap;
    //   230: astore 4
    //   232: aload 4
    //   234: ifnull +2077 -> 2311
    //   237: ldc_w 750
    //   240: invokestatic 756	com/tencent/mm/sdk/platformtools/d:LV	(I)Landroid/graphics/Bitmap;
    //   243: astore_1
    //   244: new 758	android/graphics/drawable/BitmapDrawable
    //   247: dup
    //   248: aload_0
    //   249: invokevirtual 67	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getResources	()Landroid/content/res/Resources;
    //   252: aload_1
    //   253: invokespecial 761	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   256: astore_1
    //   257: aload 4
    //   259: ifnonnull +614 -> 873
    //   262: iconst_1
    //   263: istore 5
    //   265: ldc 47
    //   267: ldc_w 763
    //   270: iconst_1
    //   271: anewarray 51	java/lang/Object
    //   274: dup
    //   275: iconst_0
    //   276: iload 5
    //   278: invokestatic 90	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   281: aastore
    //   282: invokestatic 765	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   285: aload_3
    //   286: aload_1
    //   287: putfield 769	com/tencent/mm/ui/base/preference/KeyValuePreference:yCr	Landroid/graphics/drawable/Drawable;
    //   290: aload_2
    //   291: getfield 713	com/tencent/mm/aj/d$b$d:fvS	Ljava/lang/String;
    //   294: ifnull +617 -> 911
    //   297: aload_2
    //   298: getfield 772	com/tencent/mm/aj/d$b$d:fvV	Ljava/lang/String;
    //   301: astore 6
    //   303: aload_0
    //   304: aload_2
    //   305: getfield 713	com/tencent/mm/aj/d$b$d:fvS	Ljava/lang/String;
    //   308: invokevirtual 775	java/lang/String:trim	()Ljava/lang/String;
    //   311: invokestatic 700	com/tencent/mm/pluginsdk/ui/e/j:b	(Landroid/content/Context;Ljava/lang/CharSequence;)Landroid/text/SpannableString;
    //   314: astore_1
    //   315: aload 6
    //   317: invokestatic 121	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   320: ifne +1985 -> 2305
    //   323: new 777	android/text/SpannableString
    //   326: astore 4
    //   328: new 255	java/lang/StringBuilder
    //   331: astore_2
    //   332: aload_2
    //   333: invokespecial 256	java/lang/StringBuilder:<init>	()V
    //   336: aload 4
    //   338: aload_2
    //   339: aload 6
    //   341: invokevirtual 260	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: ldc_w 779
    //   347: invokevirtual 260	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: aload_1
    //   351: invokevirtual 782	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   354: invokevirtual 279	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   357: invokespecial 784	android/text/SpannableString:<init>	(Ljava/lang/CharSequence;)V
    //   360: new 786	android/text/style/ForegroundColorSpan
    //   363: astore_1
    //   364: aload_1
    //   365: ldc_w 787
    //   368: invokespecial 789	android/text/style/ForegroundColorSpan:<init>	(I)V
    //   371: aload 4
    //   373: aload_1
    //   374: iconst_0
    //   375: aload 6
    //   377: invokevirtual 792	java/lang/String:length	()I
    //   380: bipush 17
    //   382: invokevirtual 796	android/text/SpannableString:setSpan	(Ljava/lang/Object;III)V
    //   385: aload_3
    //   386: aload 4
    //   388: invokevirtual 701	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   391: aload_0
    //   392: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   395: ifnull +652 -> 1047
    //   398: aload_0
    //   399: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   402: invokevirtual 799	com/tencent/mm/aj/d$b:aee	()Ljava/lang/String;
    //   405: invokestatic 121	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   408: ifne +639 -> 1047
    //   411: aload_0
    //   412: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   415: ldc_w 578
    //   418: invokeinterface 169 2 0
    //   423: checkcast 690	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   426: astore_1
    //   427: aload_1
    //   428: ifnull +123 -> 551
    //   431: aload_1
    //   432: invokevirtual 716	com/tencent/mm/ui/base/preference/KeyValuePreference:dAD	()V
    //   435: aload_1
    //   436: iconst_0
    //   437: putfield 719	com/tencent/mm/ui/base/preference/KeyValuePreference:yCj	Z
    //   440: getstatic 736	com/tencent/mm/model/ao$a:flw	Lcom/tencent/mm/model/ao$c;
    //   443: ifnull +592 -> 1035
    //   446: ldc_w 800
    //   449: invokestatic 756	com/tencent/mm/sdk/platformtools/d:LV	(I)Landroid/graphics/Bitmap;
    //   452: astore 4
    //   454: aload 4
    //   456: ifnonnull +585 -> 1041
    //   459: iconst_1
    //   460: istore 5
    //   462: ldc 47
    //   464: ldc_w 802
    //   467: iconst_1
    //   468: anewarray 51	java/lang/Object
    //   471: dup
    //   472: iconst_0
    //   473: iload 5
    //   475: invokestatic 90	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   478: aastore
    //   479: invokestatic 765	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   482: aload 4
    //   484: ifnull +1815 -> 2299
    //   487: new 758	android/graphics/drawable/BitmapDrawable
    //   490: dup
    //   491: aload_0
    //   492: invokevirtual 67	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getResources	()Landroid/content/res/Resources;
    //   495: aload 4
    //   497: invokespecial 761	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    //   500: astore 4
    //   502: aload_1
    //   503: aload 4
    //   505: putfield 769	com/tencent/mm/ui/base/preference/KeyValuePreference:yCr	Landroid/graphics/drawable/Drawable;
    //   508: aload_1
    //   509: aload_0
    //   510: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   513: invokevirtual 799	com/tencent/mm/aj/d$b:aee	()Ljava/lang/String;
    //   516: invokevirtual 701	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   519: ldc 47
    //   521: ldc_w 804
    //   524: iconst_2
    //   525: anewarray 51	java/lang/Object
    //   528: dup
    //   529: iconst_0
    //   530: aload_0
    //   531: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   534: invokevirtual 799	com/tencent/mm/aj/d$b:aee	()Ljava/lang/String;
    //   537: aastore
    //   538: dup
    //   539: iconst_1
    //   540: aload_0
    //   541: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   544: invokevirtual 581	com/tencent/mm/aj/d$b:aed	()Ljava/lang/String;
    //   547: aastore
    //   548: invokestatic 93	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   551: aload_0
    //   552: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   555: ifnull +516 -> 1071
    //   558: aload_0
    //   559: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   562: invokevirtual 807	com/tencent/mm/aj/d$b:aeg	()Ljava/util/List;
    //   565: ifnull +506 -> 1071
    //   568: aload_0
    //   569: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   572: invokevirtual 807	com/tencent/mm/aj/d$b:aeg	()Ljava/util/List;
    //   575: invokeinterface 417 1 0
    //   580: ifle +491 -> 1071
    //   583: aload_0
    //   584: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   587: ldc_w 809
    //   590: invokeinterface 169 2 0
    //   595: checkcast 690	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   598: astore_2
    //   599: aload_2
    //   600: invokevirtual 716	com/tencent/mm/ui/base/preference/KeyValuePreference:dAD	()V
    //   603: aload_2
    //   604: iconst_0
    //   605: invokevirtual 812	com/tencent/mm/ui/base/preference/KeyValuePreference:qi	(Z)V
    //   608: aload_2
    //   609: invokevirtual 815	com/tencent/mm/ui/base/preference/KeyValuePreference:dAC	()V
    //   612: aload_0
    //   613: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   616: invokevirtual 807	com/tencent/mm/aj/d$b:aeg	()Ljava/util/List;
    //   619: invokeinterface 425 1 0
    //   624: astore 4
    //   626: aload 4
    //   628: invokeinterface 430 1 0
    //   633: ifeq +451 -> 1084
    //   636: aload 4
    //   638: invokeinterface 434 1 0
    //   643: checkcast 817	com/tencent/mm/aj/d$b$f
    //   646: astore_3
    //   647: aload_0
    //   648: ldc_w 818
    //   651: aconst_null
    //   652: invokestatic 824	android/view/View:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   655: checkcast 826	android/widget/LinearLayout
    //   658: astore_1
    //   659: aload_1
    //   660: ldc_w 827
    //   663: invokevirtual 831	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   666: checkcast 833	android/widget/ImageView
    //   669: new 835	com/tencent/mm/plugin/profile/ui/b/c
    //   672: dup
    //   673: aload_0
    //   674: invokevirtual 67	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getResources	()Landroid/content/res/Resources;
    //   677: aload_3
    //   678: getfield 838	com/tencent/mm/aj/d$b$f:iconUrl	Ljava/lang/String;
    //   681: invokespecial 841	com/tencent/mm/plugin/profile/ui/b/c:<init>	(Landroid/content/res/Resources;Ljava/lang/String;)V
    //   684: invokevirtual 845	android/widget/ImageView:setImageDrawable	(Landroid/graphics/drawable/Drawable;)V
    //   687: aload_3
    //   688: getfield 848	com/tencent/mm/aj/d$b$f:description	Ljava/lang/String;
    //   691: astore 6
    //   693: aload_0
    //   694: invokevirtual 67	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getResources	()Landroid/content/res/Resources;
    //   697: aload_3
    //   698: getfield 851	com/tencent/mm/aj/d$b$f:fwa	Ljava/lang/String;
    //   701: ldc_w 532
    //   704: aload_0
    //   705: invokevirtual 535	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getPackageName	()Ljava/lang/String;
    //   708: invokevirtual 539	android/content/res/Resources:getIdentifier	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   711: pop
    //   712: aload_1
    //   713: ldc_w 852
    //   716: invokevirtual 831	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   719: checkcast 854	android/widget/TextView
    //   722: aload 6
    //   724: invokevirtual 857	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   727: aload_2
    //   728: aload_1
    //   729: invokevirtual 861	com/tencent/mm/ui/base/preference/KeyValuePreference:eI	(Landroid/view/View;)V
    //   732: goto -106 -> 626
    //   735: aload_0
    //   736: getfield 105	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehM	Lcom/tencent/mm/storage/ad;
    //   739: getfield 132	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   742: invokestatic 864	com/tencent/mm/storage/ad:aoA	(Ljava/lang/String;)Z
    //   745: ifne +79 -> 824
    //   748: aload_0
    //   749: getfield 105	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehM	Lcom/tencent/mm/storage/ad;
    //   752: getfield 132	com/tencent/mm/g/c/ap:field_username	Ljava/lang/String;
    //   755: invokestatic 869	com/tencent/mm/model/t:mX	(Ljava/lang/String;)Z
    //   758: ifne +66 -> 824
    //   761: aload_0
    //   762: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   765: ldc_w 688
    //   768: iconst_0
    //   769: invokeinterface 115 3 0
    //   774: aload_0
    //   775: getfield 105	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehM	Lcom/tencent/mm/storage/ad;
    //   778: invokevirtual 872	com/tencent/mm/storage/ad:Ok	()Ljava/lang/String;
    //   781: invokestatic 245	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   784: astore 4
    //   786: aload_1
    //   787: new 255	java/lang/StringBuilder
    //   790: dup
    //   791: invokespecial 256	java/lang/StringBuilder:<init>	()V
    //   794: aload_0
    //   795: getfield 878	com/tencent/mm/ui/MMActivity:mController	Lcom/tencent/mm/ui/q;
    //   798: getfield 884	com/tencent/mm/ui/q:ylL	Landroid/support/v7/app/AppCompatActivity;
    //   801: ldc_w 885
    //   804: invokevirtual 888	android/support/v7/app/AppCompatActivity:getString	(I)Ljava/lang/String;
    //   807: invokevirtual 260	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   810: aload 4
    //   812: invokevirtual 260	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   815: invokevirtual 279	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   818: invokevirtual 701	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   821: goto -721 -> 100
    //   824: aload_0
    //   825: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   828: ldc_w 688
    //   831: iconst_1
    //   832: invokeinterface 115 3 0
    //   837: goto -737 -> 100
    //   840: aload_0
    //   841: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   844: ldc_w 688
    //   847: iconst_1
    //   848: invokeinterface 115 3 0
    //   853: goto -740 -> 113
    //   856: aload_3
    //   857: aload_2
    //   858: getfield 722	com/tencent/mm/aj/d$b$d:fvT	Ljava/lang/String;
    //   861: putfield 730	com/tencent/mm/ui/base/preference/KeyValuePreference:ylA	Ljava/lang/String;
    //   864: goto -659 -> 205
    //   867: aconst_null
    //   868: astore 4
    //   870: goto -638 -> 232
    //   873: iconst_0
    //   874: istore 5
    //   876: goto -611 -> 265
    //   879: astore 4
    //   881: aload_1
    //   882: astore_2
    //   883: aload 4
    //   885: astore_1
    //   886: aload_2
    //   887: astore 4
    //   889: ldc 47
    //   891: ldc_w 890
    //   894: iconst_1
    //   895: anewarray 51	java/lang/Object
    //   898: dup
    //   899: iconst_0
    //   900: aload_1
    //   901: invokevirtual 893	java/lang/IndexOutOfBoundsException:getMessage	()Ljava/lang/String;
    //   904: aastore
    //   905: invokestatic 895	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   908: goto -523 -> 385
    //   911: ldc 47
    //   913: ldc_w 897
    //   916: invokestatic 474	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   919: goto -528 -> 391
    //   922: aload_0
    //   923: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   926: ldc_w 552
    //   929: iconst_1
    //   930: invokeinterface 115 3 0
    //   935: goto -544 -> 391
    //   938: aload_0
    //   939: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   942: ifnull +69 -> 1011
    //   945: aload_0
    //   946: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   949: invokevirtual 571	com/tencent/mm/aj/d$b:ael	()Lcom/tencent/mm/aj/d$b$g;
    //   952: ifnull +59 -> 1011
    //   955: aload_0
    //   956: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   959: invokevirtual 571	com/tencent/mm/aj/d$b:ael	()Lcom/tencent/mm/aj/d$b$g;
    //   962: getfield 900	com/tencent/mm/aj/d$b$g:fwb	Ljava/lang/String;
    //   965: invokestatic 121	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   968: ifne +43 -> 1011
    //   971: aload_0
    //   972: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   975: ldc_w 552
    //   978: invokeinterface 169 2 0
    //   983: checkcast 690	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   986: astore 4
    //   988: aload 4
    //   990: ifnull -599 -> 391
    //   993: aload 4
    //   995: aload_0
    //   996: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   999: invokevirtual 571	com/tencent/mm/aj/d$b:ael	()Lcom/tencent/mm/aj/d$b$g;
    //   1002: getfield 900	com/tencent/mm/aj/d$b$g:fwb	Ljava/lang/String;
    //   1005: invokevirtual 701	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   1008: goto -617 -> 391
    //   1011: ldc 47
    //   1013: ldc_w 902
    //   1016: invokestatic 421	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1019: aload_0
    //   1020: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1023: ldc_w 552
    //   1026: iconst_1
    //   1027: invokeinterface 115 3 0
    //   1032: goto -641 -> 391
    //   1035: aconst_null
    //   1036: astore 4
    //   1038: goto -584 -> 454
    //   1041: iconst_0
    //   1042: istore 5
    //   1044: goto -582 -> 462
    //   1047: ldc 47
    //   1049: ldc_w 904
    //   1052: invokestatic 421	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1055: aload_0
    //   1056: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1059: ldc_w 578
    //   1062: iconst_1
    //   1063: invokeinterface 115 3 0
    //   1068: goto -517 -> 551
    //   1071: aload_0
    //   1072: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1075: ldc_w 809
    //   1078: iconst_1
    //   1079: invokeinterface 115 3 0
    //   1084: aload_0
    //   1085: aload_0
    //   1086: invokevirtual 908	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getIntent	()Landroid/content/Intent;
    //   1089: ldc_w 910
    //   1092: invokevirtual 913	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   1095: invokespecial 915	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:UR	(Ljava/lang/String;)V
    //   1098: aload_0
    //   1099: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1102: ifnull +1008 -> 2110
    //   1105: aload_0
    //   1106: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1109: invokevirtual 918	com/tencent/mm/aj/d$b:aep	()Ljava/lang/String;
    //   1112: invokestatic 121	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1115: ifne +995 -> 2110
    //   1118: aload_0
    //   1119: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1122: ldc_w 583
    //   1125: iconst_0
    //   1126: invokeinterface 115 3 0
    //   1131: aload_0
    //   1132: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1135: ldc_w 583
    //   1138: invokeinterface 169 2 0
    //   1143: astore 4
    //   1145: aload 4
    //   1147: ifnull +30 -> 1177
    //   1150: aload 4
    //   1152: aload_0
    //   1153: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1156: invokevirtual 918	com/tencent/mm/aj/d$b:aep	()Ljava/lang/String;
    //   1159: invokevirtual 675	com/tencent/mm/ui/base/preference/Preference:setSummary	(Ljava/lang/CharSequence;)V
    //   1162: aload 4
    //   1164: aload_0
    //   1165: invokevirtual 67	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getResources	()Landroid/content/res/Resources;
    //   1168: ldc_w 919
    //   1171: invokevirtual 923	android/content/res/Resources:getColor	(I)I
    //   1174: putfield 926	com/tencent/mm/ui/base/preference/Preference:ksd	I
    //   1177: aload_0
    //   1178: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1181: ifnull +993 -> 2174
    //   1184: aload_0
    //   1185: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1188: invokevirtual 637	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   1191: ifnull +983 -> 2174
    //   1194: aload_0
    //   1195: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1198: ldc_w 928
    //   1201: invokeinterface 169 2 0
    //   1206: checkcast 930	com/tencent/mm/plugin/profile/ui/BizInfoPayInfoIconPreference
    //   1209: astore 4
    //   1211: aload_0
    //   1212: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1215: invokevirtual 637	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   1218: getfield 933	com/tencent/mm/aj/d$b$e:fvW	I
    //   1221: ifle +905 -> 2126
    //   1224: aload 4
    //   1226: aload_0
    //   1227: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1230: invokevirtual 637	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   1233: getfield 933	com/tencent/mm/aj/d$b$e:fvW	I
    //   1236: invokevirtual 936	com/tencent/mm/plugin/profile/ui/BizInfoPayInfoIconPreference:AS	(I)V
    //   1239: aload_0
    //   1240: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1243: ldc_w 633
    //   1246: invokeinterface 169 2 0
    //   1251: checkcast 930	com/tencent/mm/plugin/profile/ui/BizInfoPayInfoIconPreference
    //   1254: astore 4
    //   1256: aload_0
    //   1257: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1260: invokevirtual 637	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   1263: getfield 939	com/tencent/mm/aj/d$b$e:fvY	Ljava/util/List;
    //   1266: ifnull +876 -> 2142
    //   1269: aload_0
    //   1270: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1273: invokevirtual 637	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   1276: getfield 939	com/tencent/mm/aj/d$b$e:fvY	Ljava/util/List;
    //   1279: invokeinterface 417 1 0
    //   1284: ifle +858 -> 2142
    //   1287: aload 4
    //   1289: aload_0
    //   1290: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1293: invokevirtual 637	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   1296: getfield 939	com/tencent/mm/aj/d$b$e:fvY	Ljava/util/List;
    //   1299: invokevirtual 943	com/tencent/mm/plugin/profile/ui/BizInfoPayInfoIconPreference:cC	(Ljava/util/List;)V
    //   1302: aload_0
    //   1303: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1306: ldc_w 945
    //   1309: invokeinterface 169 2 0
    //   1314: checkcast 690	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   1317: astore 4
    //   1319: aload_0
    //   1320: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1323: invokevirtual 637	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   1326: getfield 948	com/tencent/mm/aj/d$b$e:fvX	Ljava/lang/String;
    //   1329: invokestatic 121	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1332: ifne +826 -> 2158
    //   1335: aload 4
    //   1337: aload_0
    //   1338: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1341: invokevirtual 637	com/tencent/mm/aj/d$b:aei	()Lcom/tencent/mm/aj/d$b$e;
    //   1344: getfield 948	com/tencent/mm/aj/d$b$e:fvX	Ljava/lang/String;
    //   1347: invokevirtual 701	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   1350: aload 4
    //   1352: iconst_4
    //   1353: putfield 951	com/tencent/mm/ui/base/preference/KeyValuePreference:yCp	I
    //   1356: aload 4
    //   1358: iconst_0
    //   1359: invokevirtual 812	com/tencent/mm/ui/base/preference/KeyValuePreference:qi	(Z)V
    //   1362: aload_0
    //   1363: getfield 105	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehM	Lcom/tencent/mm/storage/ad;
    //   1366: invokestatic 954	com/tencent/mm/model/t:w	(Lcom/tencent/mm/storage/ad;)Z
    //   1369: ifeq +847 -> 2216
    //   1372: aload_0
    //   1373: getfield 105	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehM	Lcom/tencent/mm/storage/ad;
    //   1376: getfield 628	com/tencent/mm/g/c/ap:dug	Ljava/lang/String;
    //   1379: ifnull +837 -> 2216
    //   1382: aload_0
    //   1383: getfield 105	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehM	Lcom/tencent/mm/storage/ad;
    //   1386: getfield 628	com/tencent/mm/g/c/ap:dug	Ljava/lang/String;
    //   1389: ldc_w 592
    //   1392: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1395: ifne +821 -> 2216
    //   1398: aload_0
    //   1399: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1402: ldc_w 620
    //   1405: invokeinterface 169 2 0
    //   1410: checkcast 690	com/tencent/mm/ui/base/preference/KeyValuePreference
    //   1413: astore 4
    //   1415: aload 4
    //   1417: ifnull +79 -> 1496
    //   1420: aload 4
    //   1422: new 255	java/lang/StringBuilder
    //   1425: dup
    //   1426: invokespecial 256	java/lang/StringBuilder:<init>	()V
    //   1429: aload_0
    //   1430: getfield 105	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehM	Lcom/tencent/mm/storage/ad;
    //   1433: getfield 957	com/tencent/mm/g/c/ap:field_weiboNickname	Ljava/lang/String;
    //   1436: ldc_w 592
    //   1439: invokestatic 961	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1442: invokevirtual 260	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1445: aload_0
    //   1446: ldc_w 962
    //   1449: iconst_1
    //   1450: anewarray 51	java/lang/Object
    //   1453: dup
    //   1454: iconst_0
    //   1455: aload_0
    //   1456: getfield 105	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehM	Lcom/tencent/mm/storage/ad;
    //   1459: getfield 628	com/tencent/mm/g/c/ap:dug	Ljava/lang/String;
    //   1462: invokestatic 965	com/tencent/mm/model/t:nP	(Ljava/lang/String;)Ljava/lang/String;
    //   1465: aastore
    //   1466: invokevirtual 968	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getString	(I[Ljava/lang/Object;)Ljava/lang/String;
    //   1469: invokevirtual 260	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1472: invokevirtual 279	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1475: invokevirtual 701	com/tencent/mm/ui/base/preference/KeyValuePreference:setSummary	(Ljava/lang/CharSequence;)V
    //   1478: aload 4
    //   1480: aload_0
    //   1481: ldc_w 919
    //   1484: invokestatic 973	com/tencent/mm/bz/a:i	(Landroid/content/Context;I)I
    //   1487: putfield 926	com/tencent/mm/ui/base/preference/Preference:ksd	I
    //   1490: aload 4
    //   1492: iconst_0
    //   1493: invokevirtual 812	com/tencent/mm/ui/base/preference/KeyValuePreference:qi	(Z)V
    //   1496: aload_0
    //   1497: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1500: ifnull +732 -> 2232
    //   1503: aload_0
    //   1504: getfield 97	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuY	Lcom/tencent/mm/aj/d$b;
    //   1507: invokevirtual 976	com/tencent/mm/aj/d$b:adZ	()Z
    //   1510: ifeq +722 -> 2232
    //   1513: aload_0
    //   1514: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1517: ldc_w 978
    //   1520: invokeinterface 169 2 0
    //   1525: ldc_w 979
    //   1528: invokevirtual 981	com/tencent/mm/ui/base/preference/Preference:setSummary	(I)V
    //   1531: aload_0
    //   1532: invokespecial 469	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:cbJ	()Lcom/tencent/mm/aj/d$a;
    //   1535: ifnull +713 -> 2248
    //   1538: aload_0
    //   1539: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1542: ldc_w 464
    //   1545: iconst_0
    //   1546: invokeinterface 115 3 0
    //   1551: aload_0
    //   1552: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   1555: ldc_w 983
    //   1558: invokeinterface 986 2 0
    //   1563: istore 7
    //   1565: iload 7
    //   1567: iflt +704 -> 2271
    //   1570: aload_0
    //   1571: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1574: ifnull +697 -> 2271
    //   1577: aload_0
    //   1578: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1581: invokeinterface 417 1 0
    //   1586: ifle +685 -> 2271
    //   1589: aload_0
    //   1590: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1593: invokeinterface 417 1 0
    //   1598: iconst_1
    //   1599: isub
    //   1600: istore 8
    //   1602: iload 8
    //   1604: iflt +660 -> 2264
    //   1607: aload_0
    //   1608: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1611: iload 8
    //   1613: invokeinterface 618 2 0
    //   1618: ifnull +486 -> 2104
    //   1621: aload_0
    //   1622: ldc_w 987
    //   1625: invokevirtual 449	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getString	(I)Ljava/lang/String;
    //   1628: aload_0
    //   1629: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1632: iload 8
    //   1634: invokeinterface 618 2 0
    //   1639: checkcast 436	com/tencent/mm/aj/d$a
    //   1642: getfield 452	com/tencent/mm/aj/d$a:title	Ljava/lang/String;
    //   1645: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1648: ifeq +10 -> 1658
    //   1651: aload_0
    //   1652: getfield 36	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fvf	Z
    //   1655: ifeq +449 -> 2104
    //   1658: aload_0
    //   1659: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1662: iload 8
    //   1664: invokeinterface 618 2 0
    //   1669: checkcast 436	com/tencent/mm/aj/d$a
    //   1672: getfield 452	com/tencent/mm/aj/d$a:title	Ljava/lang/String;
    //   1675: invokestatic 121	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1678: ifeq +26 -> 1704
    //   1681: aload_0
    //   1682: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1685: iload 8
    //   1687: invokeinterface 618 2 0
    //   1692: checkcast 436	com/tencent/mm/aj/d$a
    //   1695: getfield 439	com/tencent/mm/aj/d$a:fvb	Ljava/lang/String;
    //   1698: invokestatic 121	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1701: ifne +403 -> 2104
    //   1704: aload_0
    //   1705: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1708: iload 8
    //   1710: invokeinterface 618 2 0
    //   1715: checkcast 436	com/tencent/mm/aj/d$a
    //   1718: getfield 439	com/tencent/mm/aj/d$a:fvb	Ljava/lang/String;
    //   1721: ldc_w 441
    //   1724: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1727: ifne +377 -> 2104
    //   1730: aload_0
    //   1731: ldc_w 448
    //   1734: invokevirtual 449	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getString	(I)Ljava/lang/String;
    //   1737: aload_0
    //   1738: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1741: iload 8
    //   1743: invokeinterface 618 2 0
    //   1748: checkcast 436	com/tencent/mm/aj/d$a
    //   1751: getfield 452	com/tencent/mm/aj/d$a:title	Ljava/lang/String;
    //   1754: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1757: ifne +347 -> 2104
    //   1760: aload_0
    //   1761: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1764: iload 8
    //   1766: invokeinterface 618 2 0
    //   1771: checkcast 436	com/tencent/mm/aj/d$a
    //   1774: getfield 439	com/tencent/mm/aj/d$a:fvb	Ljava/lang/String;
    //   1777: ldc_w 989
    //   1780: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1783: ifne +321 -> 2104
    //   1786: new 457	com/tencent/mm/ui/base/preference/Preference
    //   1789: dup
    //   1790: aload_0
    //   1791: invokespecial 992	com/tencent/mm/ui/base/preference/Preference:<init>	(Landroid/content/Context;)V
    //   1794: astore_2
    //   1795: aload_2
    //   1796: ldc_w 604
    //   1799: iload 8
    //   1801: invokestatic 994	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1804: invokevirtual 997	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1807: invokevirtual 1000	com/tencent/mm/ui/base/preference/Preference:setKey	(Ljava/lang/String;)V
    //   1810: aload_0
    //   1811: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1814: iload 8
    //   1816: invokeinterface 618 2 0
    //   1821: checkcast 436	com/tencent/mm/aj/d$a
    //   1824: getfield 452	com/tencent/mm/aj/d$a:title	Ljava/lang/String;
    //   1827: astore 4
    //   1829: aload_0
    //   1830: invokevirtual 67	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getResources	()Landroid/content/res/Resources;
    //   1833: aload_0
    //   1834: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1837: iload 8
    //   1839: invokeinterface 618 2 0
    //   1844: checkcast 436	com/tencent/mm/aj/d$a
    //   1847: getfield 439	com/tencent/mm/aj/d$a:fvb	Ljava/lang/String;
    //   1850: ldc_w 532
    //   1853: aload_0
    //   1854: invokevirtual 535	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getPackageName	()Ljava/lang/String;
    //   1857: invokevirtual 539	android/content/res/Resources:getIdentifier	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   1860: istore 9
    //   1862: iload 9
    //   1864: ifle +11 -> 1875
    //   1867: aload_0
    //   1868: iload 9
    //   1870: invokevirtual 449	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getString	(I)Ljava/lang/String;
    //   1873: astore 4
    //   1875: aload 4
    //   1877: astore_1
    //   1878: aload_0
    //   1879: getfield 298	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:pkW	Lcom/tencent/mm/aj/d;
    //   1882: invokevirtual 1003	com/tencent/mm/aj/d:adO	()Z
    //   1885: ifeq +55 -> 1940
    //   1888: ldc_w 989
    //   1891: aload_0
    //   1892: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1895: iload 8
    //   1897: invokeinterface 618 2 0
    //   1902: checkcast 436	com/tencent/mm/aj/d$a
    //   1905: getfield 439	com/tencent/mm/aj/d$a:fvb	Ljava/lang/String;
    //   1908: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1911: ifne +21 -> 1932
    //   1914: aload 4
    //   1916: astore_1
    //   1917: aload 4
    //   1919: aload_0
    //   1920: ldc_w 1004
    //   1923: invokevirtual 449	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getString	(I)Ljava/lang/String;
    //   1926: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1929: ifeq +11 -> 1940
    //   1932: aload_0
    //   1933: ldc_w 1005
    //   1936: invokevirtual 449	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:getString	(I)Ljava/lang/String;
    //   1939: astore_1
    //   1940: aload_2
    //   1941: aload_1
    //   1942: invokevirtual 1008	com/tencent/mm/ui/base/preference/Preference:setTitle	(Ljava/lang/CharSequence;)V
    //   1945: aload_0
    //   1946: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1949: iload 8
    //   1951: invokeinterface 618 2 0
    //   1956: checkcast 436	com/tencent/mm/aj/d$a
    //   1959: getfield 1009	com/tencent/mm/aj/d$a:description	Ljava/lang/String;
    //   1962: invokestatic 121	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   1965: ifne +24 -> 1989
    //   1968: aload_2
    //   1969: aload_0
    //   1970: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1973: iload 8
    //   1975: invokeinterface 618 2 0
    //   1980: checkcast 436	com/tencent/mm/aj/d$a
    //   1983: getfield 1009	com/tencent/mm/aj/d$a:description	Ljava/lang/String;
    //   1986: invokevirtual 675	com/tencent/mm/ui/base/preference/Preference:setSummary	(Ljava/lang/CharSequence;)V
    //   1989: aload_0
    //   1990: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   1993: iload 8
    //   1995: invokeinterface 618 2 0
    //   2000: checkcast 436	com/tencent/mm/aj/d$a
    //   2003: getfield 439	com/tencent/mm/aj/d$a:fvb	Ljava/lang/String;
    //   2006: invokestatic 245	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   2009: ldc_w 1011
    //   2012: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2015: ifeq +277 -> 2292
    //   2018: aload_0
    //   2019: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2022: ldc_w 945
    //   2025: invokeinterface 986 2 0
    //   2030: istore 9
    //   2032: iload 9
    //   2034: ifle +258 -> 2292
    //   2037: iinc 9 1
    //   2040: aload_0
    //   2041: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2044: aload_2
    //   2045: iload 9
    //   2047: invokeinterface 1014 3 0
    //   2052: aload_0
    //   2053: getfield 362	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:fuX	Ljava/util/List;
    //   2056: iload 8
    //   2058: invokeinterface 618 2 0
    //   2063: checkcast 436	com/tencent/mm/aj/d$a
    //   2066: getfield 439	com/tencent/mm/aj/d$a:fvb	Ljava/lang/String;
    //   2069: invokestatic 245	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   2072: ldc_w 1016
    //   2075: invokevirtual 447	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2078: ifeq +26 -> 2104
    //   2081: new 1018	com/tencent/mm/ui/base/preference/PreferenceSmallCategory
    //   2084: dup
    //   2085: aload_0
    //   2086: invokespecial 1019	com/tencent/mm/ui/base/preference/PreferenceSmallCategory:<init>	(Landroid/content/Context;)V
    //   2089: astore 4
    //   2091: aload_0
    //   2092: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2095: aload 4
    //   2097: iload 9
    //   2099: invokeinterface 1014 3 0
    //   2104: iinc 8 255
    //   2107: goto -505 -> 1602
    //   2110: aload_0
    //   2111: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2114: ldc_w 583
    //   2117: iconst_1
    //   2118: invokeinterface 115 3 0
    //   2123: goto -946 -> 1177
    //   2126: aload_0
    //   2127: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2130: ldc_w 928
    //   2133: iconst_1
    //   2134: invokeinterface 115 3 0
    //   2139: goto -900 -> 1239
    //   2142: aload_0
    //   2143: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2146: ldc_w 633
    //   2149: iconst_1
    //   2150: invokeinterface 115 3 0
    //   2155: goto -853 -> 1302
    //   2158: aload_0
    //   2159: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2162: ldc_w 945
    //   2165: iconst_1
    //   2166: invokeinterface 115 3 0
    //   2171: goto -809 -> 1362
    //   2174: aload_0
    //   2175: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2178: ldc_w 928
    //   2181: iconst_1
    //   2182: invokeinterface 115 3 0
    //   2187: aload_0
    //   2188: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2191: ldc_w 633
    //   2194: iconst_1
    //   2195: invokeinterface 115 3 0
    //   2200: aload_0
    //   2201: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2204: ldc_w 945
    //   2207: iconst_1
    //   2208: invokeinterface 115 3 0
    //   2213: goto -851 -> 1362
    //   2216: aload_0
    //   2217: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2220: ldc_w 620
    //   2223: iconst_1
    //   2224: invokeinterface 115 3 0
    //   2229: goto -733 -> 1496
    //   2232: aload_0
    //   2233: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2236: ldc_w 978
    //   2239: iconst_1
    //   2240: invokeinterface 115 3 0
    //   2245: goto -714 -> 1531
    //   2248: aload_0
    //   2249: getfield 107	com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoMoreInofUI:ehK	Lcom/tencent/mm/ui/base/preference/f;
    //   2252: ldc_w 464
    //   2255: iconst_1
    //   2256: invokeinterface 115 3 0
    //   2261: goto -710 -> 1551
    //   2264: sipush 23902
    //   2267: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2270: return
    //   2271: ldc 47
    //   2273: ldc_w 1021
    //   2276: invokestatic 207	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   2279: sipush 23902
    //   2282: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2285: goto -15 -> 2270
    //   2288: astore_1
    //   2289: goto -1400 -> 889
    //   2292: iload 7
    //   2294: istore 9
    //   2296: goto -256 -> 2040
    //   2299: aconst_null
    //   2300: astore 4
    //   2302: goto -1800 -> 502
    //   2305: aload_1
    //   2306: astore 4
    //   2308: goto -1923 -> 385
    //   2311: aconst_null
    //   2312: astore_1
    //   2313: goto -2056 -> 257
    //
    // Exception table:
    //   from	to	target	type
    //   323	360	879	java/lang/IndexOutOfBoundsException
    //   360	385	2288	java/lang/IndexOutOfBoundsException
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(23900);
    super.onCreate(paramBundle);
    this.ehK = this.yCw;
    xE(a.ppL);
    setMMTitle(2131298467);
    ta(-16777216);
    dyb();
    pO(false);
    setBackBtn(new NewBizInfoMoreInofUI.1(this), 2131230737);
    paramBundle = bo.nullAsNil(getIntent().getStringExtra("Contact_User"));
    String str1 = bo.nullAsNil(getIntent().getStringExtra("Contact_Alias"));
    int i = getIntent().getIntExtra("Contact_VUser_Info_Flag", 0);
    int j = getIntent().getIntExtra("Contact_KWeibo_flag", 0);
    Object localObject = getIntent().getStringExtra("Contact_KWeibo");
    String str2 = getIntent().getStringExtra("Contact_KWeiboNick");
    aw.ZK();
    this.ehM = com.tencent.mm.model.c.XM().aoO(paramBundle);
    if ((this.ehM == null) || ((int)this.ehM.ewQ == 0) || (bo.nullAsNil(this.ehM.field_username).length() <= 0))
    {
      this.ehM = new ad();
      this.ehM.setUsername(paramBundle);
      this.ehM.iy(str1);
      this.ehM.hw(i);
      this.ehM.iU((String)localObject);
      this.ehM.hv(j);
      this.ehM.iE(str2);
    }
    while (true)
    {
      this.pkW = com.tencent.mm.aj.f.qX(this.ehM.field_username);
      localObject = getIntent().getByteArrayExtra("Contact_customInfo");
      if (localObject == null)
        paramBundle = null;
      try
      {
        while (true)
        {
          this.pmz = paramBundle;
          this.gwP = getIntent().getIntExtra("Contact_Scene", 9);
          this.pmH = getIntent().getBundleExtra("Contact_Ext_Args");
          initView();
          AppMethodBeat.o(23900);
          return;
          if (i == 0)
            break;
          this.ehM.hw(i);
          break;
          paramBundle = new com/tencent/mm/protocal/protobuf/uy;
          paramBundle.<init>();
          paramBundle = (uy)paramBundle.parseFrom((byte[])localObject);
        }
      }
      catch (IOException paramBundle)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.NewBizInfoMoreInofUI", paramBundle, "", new Object[0]);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMoreInofUI
 * JD-Core Version:    0.6.2
 */