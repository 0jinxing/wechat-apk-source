package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.c.i;
import com.tencent.mm.plugin.wallet_core.c.j;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.akm;
import com.tencent.mm.protocal.protobuf.xq;
import com.tencent.mm.protocal.protobuf.zc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.xweb.util.d;
import d.a.a.b;
import d.a.a.f;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class WalletSuccPageAwardWidget extends FrameLayout
{
  private static final String tOJ;
  private ak fbD;
  private TextView gtb;
  private TextView hrg;
  private String kBE;
  private CdnImageView kqn;
  private d.a.a.c pSK;
  private boolean qgo;
  private ViewGroup sis;
  private WalletScratchShakeView tOA;
  private WalletAwardShakeAnimView tOB;
  private d.a.a.g tOC;
  private WalletBaseUI tOD;
  private boolean tOE;
  private boolean tOF;
  private boolean tOG;
  private d.a.a.a tOH;
  private boolean tOI;
  private Button tOx;
  private ImageView tOy;
  private ImageView tOz;
  private boolean ttT;

  static
  {
    AppMethodBeat.i(47982);
    tOJ = com.tencent.mm.compatible.util.e.eSn + "wallet/images/";
    AppMethodBeat.o(47982);
  }

  public WalletSuccPageAwardWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(47958);
    this.tOE = false;
    this.tOF = false;
    this.qgo = true;
    this.tOG = false;
    this.tOH = null;
    this.fbD = new ak(Looper.getMainLooper());
    this.tOI = false;
    init(paramContext);
    AppMethodBeat.o(47958);
  }

  public WalletSuccPageAwardWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(47959);
    this.tOE = false;
    this.tOF = false;
    this.qgo = true;
    this.tOG = false;
    this.tOH = null;
    this.fbD = new ak(Looper.getMainLooper());
    this.tOI = false;
    init(paramContext);
    AppMethodBeat.o(47959);
  }

  public static boolean a(d.a.a.c paramc)
  {
    AppMethodBeat.i(47957);
    boolean bool;
    if ((paramc != null) && (((paramc.wew != null) && (paramc.wew.size() > 0)) || (paramc.BTF != null)))
    {
      bool = true;
      AppMethodBeat.o(47957);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(47957);
    }
  }

  private static String adh(String paramString)
  {
    AppMethodBeat.i(47971);
    if (!bo.Q(new String[0]))
    {
      com.tencent.mm.vfs.e.tf(tOJ);
      String str = tOJ + d.x(paramString.getBytes());
      ab.i("MicroMsg.WalletSuccPageAwardWidget", "buildImagePathByUrl, url: %s, path: %s", new Object[] { paramString, str });
      AppMethodBeat.o(47971);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(47971);
    }
  }

  private static String b(d.a.a.c paramc)
  {
    AppMethodBeat.i(47976);
    JSONObject localJSONObject1;
    JSONArray localJSONArray;
    Object localObject;
    JSONObject localJSONObject2;
    if (paramc != null)
      try
      {
        localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>();
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        if ((paramc.wew != null) && (paramc.wew.size() > 0))
        {
          localObject = paramc.wew.iterator();
          while (((Iterator)localObject).hasNext())
          {
            d.a.a.g localg = (d.a.a.g)((Iterator)localObject).next();
            localJSONObject2 = new org/json/JSONObject;
            localJSONObject2.<init>();
            localJSONObject2.put("logo", localg.pia);
            localJSONObject2.put("award_name", localg.BTP);
            localJSONObject2.put("award_description", localg.BTQ);
            localJSONObject2.put("background_img", localg.BTR);
            localJSONObject2.put("award_name_color", localg.BTS);
            localJSONObject2.put("award_description_color", localg.BTT);
            localJSONArray.put(localJSONObject2);
          }
        }
      }
      catch (Exception paramc)
      {
        paramc = "";
        AppMethodBeat.o(47976);
      }
    while (true)
    {
      return paramc;
      localJSONObject1.put("single_exposure_info_list", localJSONArray);
      localJSONObject1.put("is_query_others", paramc.BTA);
      localJSONObject1.put("draw_lottery_params", paramc.wdr);
      localJSONObject1.put("is_show_btn", paramc.wex);
      localJSONObject2 = new org/json/JSONObject;
      localJSONObject2.<init>();
      if (paramc.wey != null)
      {
        localJSONObject2.put("btn_words", paramc.wey.BTs);
        localJSONObject2.put("btn_color", paramc.wey.BTt);
        localJSONObject2.put("btn_op_type", paramc.wey.BTu);
        localJSONObject2.put("url", paramc.wey.url);
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>();
        if (paramc.wey.BTv != null)
        {
          ((JSONObject)localObject).put("activity_tinyapp_username", paramc.wey.BTv.wMk);
          ((JSONObject)localObject).put("activity_tinyapp_path", paramc.wey.BTv.wMl);
          ((JSONObject)localObject).put("activity_tinyapp_version", paramc.wey.BTv.wMm);
        }
        localJSONObject2.put("mini_app_info", localObject);
        localJSONObject2.put("get_lottery_params", paramc.wey.wqf);
      }
      localJSONObject1.put("btn_info", localJSONObject2);
      localJSONObject1.put("exposure_info_modify_params", paramc.wev);
      localJSONObject1.put("user_opertaion_type", paramc.BTB);
      localJSONObject1.put("is_show_layer", paramc.BTC);
      localJSONObject1.put("background_img_whole", paramc.BTE);
      if (paramc.BTF != null)
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>();
        ((JSONObject)localObject).put("animation_wording", paramc.BTF.BTw);
        ((JSONObject)localObject).put("animation_wording_color", paramc.BTF.BTx);
        ((JSONObject)localObject).put("url", paramc.BTF.url);
        ((JSONObject)localObject).put("op_type", paramc.BTF.xis);
        ((JSONObject)localObject).put("after_animation_wording", paramc.BTF.BTy);
        ((JSONObject)localObject).put("after_animation_wording_color", paramc.BTF.BTz);
        localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
        if (paramc.BTF.BTv != null)
        {
          localJSONObject2.put("activity_tinyapp_username", paramc.BTF.BTv.wMk);
          localJSONObject2.put("activity_tinyapp_path", paramc.BTF.BTv.wMl);
          localJSONObject2.put("activity_tinyapp_version", paramc.BTF.BTv.wMm);
        }
        ((JSONObject)localObject).put("mini_app_info", localJSONObject2);
        localJSONObject1.put("draw_lottery_info", localObject);
      }
      paramc = localJSONObject1.toString();
      AppMethodBeat.o(47976);
      continue;
      paramc = "";
      AppMethodBeat.o(47976);
    }
  }

  private void cSG()
  {
    int i = 2;
    AppMethodBeat.i(47962);
    ab.i("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, exposureInfo: %s, isFirstShow: %s", new Object[] { b(this.pSK), Boolean.valueOf(this.qgo) });
    if (this.pSK == null)
    {
      ab.e("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, exposureInfo is null!");
      AppMethodBeat.o(47962);
    }
    while (true)
    {
      return;
      ab.c("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, user_operation_type: %s, single_exposure_info_list size: %s, isClickH5OrTinyApp: %s", new Object[] { Integer.valueOf(this.pSK.BTB), Integer.valueOf(this.pSK.wew.size()), Boolean.valueOf(this.tOE) });
      if ((this.pSK.BTB <= 0) || (this.pSK.BTB > 5))
      {
        AppMethodBeat.o(47962);
      }
      else
      {
        if (a(this.pSK))
          break;
        AppMethodBeat.o(47962);
      }
    }
    label177: h localh;
    if (this.pSK.BTB == 4)
    {
      cSK();
      if ((this.qgo) || (this.tOE))
      {
        localh = h.pYm;
        if (!this.tOE)
          break label299;
      }
    }
    while (true)
    {
      localh.e(15225, new Object[] { Integer.valueOf(3), Integer.valueOf(i) });
      this.qgo = false;
      AppMethodBeat.o(47962);
      break;
      if ((this.pSK.BTB == 1) || (this.pSK.BTB == 2) || (this.pSK.BTB == 3))
      {
        cSJ();
        break label177;
      }
      if (this.pSK.BTB != 5)
        break label177;
      cSL();
      break label177;
      label299: i = 1;
    }
  }

  private void cSH()
  {
    AppMethodBeat.i(47963);
    ab.i("MicroMsg.WalletSuccPageAwardWidget", "showNetFailedView");
    RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)this.gtb.getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams2 = (RelativeLayout.LayoutParams)this.hrg.getLayoutParams();
    localLayoutParams1.addRule(15, -1);
    localLayoutParams2.addRule(15, 0);
    this.gtb.setLayoutParams(localLayoutParams1);
    this.hrg.setLayoutParams(localLayoutParams2);
    this.gtb.setVisibility(0);
    this.hrg.setVisibility(8);
    this.gtb.setText(2131305369);
    this.gtb.setTextColor(Color.parseColor("#353535"));
    this.hrg.setTextColor(Color.parseColor("#B2B2B2"));
    this.tOy.setVisibility(8);
    findViewById(2131826989).setVisibility(0);
    findViewById(2131826994).setVisibility(0);
    this.tOx.setVisibility(8);
    this.kqn.setVisibility(0);
    this.kqn.setImageResource(2130840729);
    this.tOA.setVisibility(8);
    this.tOA.onDestroy();
    this.tOB.setVisibility(8);
    this.tOB.destroy();
    AppMethodBeat.o(47963);
  }

  private void cSI()
  {
    AppMethodBeat.i(47967);
    ab.i("MicroMsg.WalletSuccPageAwardWidget", "updateViewAfterMiniAppReturn");
    if ((this.pSK.BTF != null) && (this.pSK.BTF.xis != 1))
    {
      this.tOA.setVisibility(8);
      this.tOA.onDestroy();
      this.tOB.setVisibility(8);
      this.tOB.destroy();
    }
    cSN();
    AppMethodBeat.o(47967);
  }

  private void cSJ()
  {
    AppMethodBeat.i(47968);
    cSM();
    if (this.tOB.getVisibility() != 8)
    {
      this.tOB.setVisibility(8);
      this.tOB.destroy();
    }
    if (this.tOA.getVisibility() != 0)
    {
      this.tOA.setVisibility(0);
      this.tOA.post(new WalletSuccPageAwardWidget.1(this));
    }
    AppMethodBeat.o(47968);
  }

  private void cSK()
  {
    AppMethodBeat.i(47969);
    cSM();
    if (this.tOA.getVisibility() != 8)
    {
      this.tOA.setVisibility(8);
      this.tOA.onDestroy();
    }
    if (this.tOB.getVisibility() != 8)
    {
      this.tOB.setVisibility(8);
      this.tOB.destroy();
    }
    AppMethodBeat.o(47969);
  }

  private void cSL()
  {
    AppMethodBeat.i(47970);
    cSM();
    if (this.tOA.getVisibility() != 8)
    {
      this.tOA.setVisibility(8);
      this.tOA.onDestroy();
    }
    if (this.pSK.BTF != null)
    {
      ab.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, op_type: %s", new Object[] { Integer.valueOf(this.pSK.BTF.xis) });
      switch (this.pSK.BTF.xis)
      {
      default:
        this.tOB.setVisibility(8);
        this.tOB.destroy();
        AppMethodBeat.o(47970);
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      return;
      if (this.tOB.getVisibility() != 0)
      {
        this.tOB.setVisibility(0);
        this.tOB.post(new WalletSuccPageAwardWidget.4(this));
      }
      this.tOB.destroy();
      if (!bo.isNullOrNil(this.pSK.BTF.BTw))
      {
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "animation_wording: %s", new Object[] { this.pSK.BTF.BTw });
        this.tOB.setShakeHintWording(this.pSK.BTF.BTw);
      }
      if (!bo.isNullOrNil(this.pSK.BTF.BTx));
      try
      {
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "animation_wording_color: %s", new Object[] { this.pSK.BTF.BTx });
        this.tOB.setShakeHintWordingColor(Color.parseColor(this.pSK.BTF.BTx));
        if (!bo.isNullOrNil(this.pSK.BTF.BTy))
        {
          ab.i("MicroMsg.WalletSuccPageAwardWidget", "after_animation_wording: %s", new Object[] { this.pSK.BTF.BTy });
          this.tOB.setAfterHintWording(this.pSK.BTF.BTy);
        }
        if (!bo.isNullOrNil(this.pSK.BTF.BTz))
          ab.i("MicroMsg.WalletSuccPageAwardWidget", "after_animation_wording_color: %s", new Object[] { this.pSK.BTF.BTz });
      }
      catch (Exception localException1)
      {
        try
        {
          this.tOB.setAfterHintWordingColor(Color.parseColor(this.pSK.BTF.BTz));
          this.tOB.setShakeOrClickCallback(new WalletSuccPageAwardWidget.5(this));
          this.tOB.cSw();
          AppMethodBeat.o(47970);
          continue;
          localException1 = localException1;
          ab.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", localException1, "parse animation_wording_color %s error %s", new Object[] { this.pSK.BTF.BTx, localException1.getMessage() });
        }
        catch (Exception localException2)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", localException2, "parse after_animation_wording_color %s error %s", new Object[] { this.pSK.BTF.BTz, localException2.getMessage() });
        }
      }
      f localf = this.pSK.BTF.BTv;
      if (localf != null)
      {
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, jump tiny app, userName: %s, path: %s, version: %s", new Object[] { localf.wMk, localf.wMl, Integer.valueOf(localf.wMm) });
        se localse = new se();
        localse.cOf.userName = localf.wMk;
        localse.cOf.cOh = bo.bc(localf.wMl, "");
        localse.cOf.scene = 1060;
        localse.cOf.cst = this.kBE;
        localse.cOf.cOi = 0;
        if (localf.wMm > 0)
          localse.cOf.axy = localf.wMm;
        localse.cOf.context = this.tOD;
        com.tencent.mm.sdk.b.a.xxA.m(localse);
        this.tOE = true;
        this.tOI = false;
        this.fbD.postDelayed(new WalletSuccPageAwardWidget.6(this), 3000L);
        AppMethodBeat.o(47970);
        continue;
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, goto h5, url: %s", new Object[] { this.pSK.BTF.url });
        com.tencent.mm.wallet_core.ui.e.n(this.tOD, this.pSK.BTF.url, false);
        this.tOE = true;
        this.tOI = false;
        this.fbD.postDelayed(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(47947);
            WalletSuccPageAwardWidget.g(WalletSuccPageAwardWidget.this);
            AppMethodBeat.o(47947);
          }
        }
        , 3000L);
        AppMethodBeat.o(47970);
        continue;
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, directly show info");
        this.tOA.setVisibility(8);
        this.tOA.onDestroy();
        this.tOB.setVisibility(8);
        this.tOB.destroy();
      }
      else
      {
        AppMethodBeat.o(47970);
      }
    }
  }

  private void cSM()
  {
    AppMethodBeat.i(47972);
    ab.i("MicroMsg.WalletSuccPageAwardWidget", "initBaseLotteryView");
    Object localObject1 = this.pSK.wew;
    int i;
    if (localObject1 != null)
    {
      i = ((List)localObject1).size();
      ab.i("MicroMsg.WalletSuccPageAwardWidget", "singleExposureInfoList %s, size: %s", new Object[] { localObject1, Integer.valueOf(i) });
      if ((localObject1 != null) && (((List)localObject1).size() > 0))
      {
        this.tOC = ((d.a.a.g)((List)localObject1).get(0));
        ab.i("MicroMsg.WalletSuccPageAwardWidget", "singleExposureInfo %s, award_name: %s, award_description: %s, logo: %s", new Object[] { Integer.valueOf(0), this.tOC.BTP, this.tOC.BTQ, this.tOC.pia });
        this.kqn.setUrl(this.tOC.pia);
        if (!bo.isNullOrNil(this.tOC.pia))
          this.kqn.setVisibility(0);
        if (bo.isNullOrNil(this.tOC.BTP))
          break label1223;
        this.gtb.setText(this.tOC.BTP);
        this.gtb.setVisibility(0);
      }
    }
    while (true)
    {
      Object localObject2;
      try
      {
        if (!bo.isNullOrNil(this.tOC.BTS))
          this.gtb.setTextColor(Color.parseColor(this.tOC.BTS));
        i = 1;
        if (!bo.isNullOrNil(this.tOC.BTQ))
        {
          this.hrg.setText(this.tOC.BTQ);
          this.hrg.setVisibility(0);
        }
      }
      catch (Exception localException1)
      {
        try
        {
          if (!bo.isNullOrNil(this.tOC.BTT))
            this.hrg.setTextColor(Color.parseColor(this.tOC.BTT));
          i = 1;
          if (i != 0)
          {
            localObject3 = (RelativeLayout.LayoutParams)this.gtb.getLayoutParams();
            localObject1 = (RelativeLayout.LayoutParams)this.hrg.getLayoutParams();
            if ((!bo.isNullOrNil(this.tOC.BTP)) && (bo.isNullOrNil(this.tOC.BTQ)))
            {
              ((RelativeLayout.LayoutParams)localObject3).addRule(15, -1);
              ((RelativeLayout.LayoutParams)localObject1).addRule(15, 0);
              this.gtb.setLayoutParams((ViewGroup.LayoutParams)localObject3);
              this.hrg.setLayoutParams((ViewGroup.LayoutParams)localObject1);
              this.gtb.setVisibility(0);
              this.hrg.setVisibility(8);
            }
          }
          else
          {
            if (bo.isNullOrNil(this.tOC.BTR))
              continue;
            ab.i("MicroMsg.WalletSuccPageAwardWidget", "background_img: %s", new Object[] { this.tOC.BTR });
            localObject1 = new c.a();
            ((c.a)localObject1).ePH = true;
            ((c.a)localObject1).ePG = true;
            ((c.a)localObject1).ePJ = adh(this.tOC.BTR);
            localObject1 = ((c.a)localObject1).ahG();
            o.ahp().a(this.tOC.BTR, null, (com.tencent.mm.at.a.a.c)localObject1, new WalletSuccPageAwardWidget.8(this));
            i = this.pSK.wex;
            localObject3 = this.pSK.wey;
            if (this.pSK.wey == null)
              continue;
            localObject1 = this.pSK.wey.BTs;
            ab.i("MicroMsg.WalletSuccPageAwardWidget", "is_show_btn: %s, btn_info: %s, btn_words: %s", new Object[] { Integer.valueOf(i), localObject3, localObject1 });
            if ((this.pSK.wex != 0) && (this.pSK.wey != null) && (!bo.isNullOrNil(this.pSK.wey.BTs)))
              continue;
            this.tOx.setVisibility(8);
            if (this.gtb.getVisibility() == 0)
            {
              this.gtb.setSingleLine();
              this.gtb.post(new WalletSuccPageAwardWidget.10(this));
            }
            if (this.tOx.getVisibility() != 0)
              this.gtb.setEllipsize(TextUtils.TruncateAt.END);
            if (this.pSK.BTC != 0)
              ab.i("MicroMsg.WalletSuccPageAwardWidget", "exposureInfo.is_show_layer is true: %s, direct show layer", new Object[] { Integer.valueOf(this.pSK.BTC) });
            if (!bo.isNullOrNil(this.pSK.BTE))
            {
              ab.i("MicroMsg.WalletSuccPageAwardWidget", "background_img_whole: %s", new Object[] { this.pSK.BTE });
              if (this.tOz != null)
              {
                this.tOz.setVisibility(0);
                localObject1 = new c.a();
                ((c.a)localObject1).ePH = true;
                ((c.a)localObject1).ePG = true;
                ((c.a)localObject1).ePJ = adh(this.pSK.BTE);
                localObject1 = ((c.a)localObject1).ahG();
                o.ahp().a(this.pSK.BTE, null, (com.tencent.mm.at.a.a.c)localObject1, new WalletSuccPageAwardWidget.11(this));
              }
            }
            AppMethodBeat.o(47972);
            return;
            i = 0;
            break;
            localException1 = localException1;
            ab.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", localException1, "parse award_name_color error: %s", new Object[] { localException1.getMessage() });
          }
        }
        catch (Exception localException2)
        {
          Object localObject3;
          ab.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", localException2, "parse award_description_color error: %s", new Object[] { localException2.getMessage() });
          continue;
          if ((bo.isNullOrNil(this.tOC.BTP)) && (!bo.isNullOrNil(this.tOC.BTQ)))
          {
            ((RelativeLayout.LayoutParams)localObject3).addRule(15, 0);
            localException2.addRule(15, -1);
            this.gtb.setLayoutParams((ViewGroup.LayoutParams)localObject3);
            this.hrg.setLayoutParams(localException2);
            this.gtb.setVisibility(8);
            this.hrg.setVisibility(0);
            continue;
          }
          ((RelativeLayout.LayoutParams)localObject3).addRule(15, 0);
          localException2.addRule(15, 0);
          this.gtb.setLayoutParams((ViewGroup.LayoutParams)localObject3);
          this.hrg.setLayoutParams(localException2);
          this.gtb.setVisibility(0);
          this.hrg.setVisibility(0);
          continue;
          this.tOy.setVisibility(8);
          findViewById(2131826989).setVisibility(0);
          findViewById(2131826994).setVisibility(0);
          continue;
          localObject2 = "";
          continue;
          localObject2 = this.pSK.wey;
          if (localObject2 == null)
            continue;
          ab.i("MicroMsg.WalletSuccPageAwardWidget", "btn_words: %s, type: %s, color: %s, url: %s", new Object[] { ((d.a.a.a)localObject2).BTs, Integer.valueOf(((d.a.a.a)localObject2).BTu), ((d.a.a.a)localObject2).BTt, ((d.a.a.a)localObject2).url });
          this.tOx.setText(((d.a.a.a)localObject2).BTs);
          if (!bo.isNullOrNil(((d.a.a.a)localObject2).BTt))
          {
            localObject3 = getContext().getResources().getDrawable(2130838000);
            ((Drawable)localObject3).setColorFilter(Color.parseColor(((d.a.a.a)localObject2).BTt), PorterDuff.Mode.SRC);
            this.tOx.setBackground((Drawable)localObject3);
          }
          this.tOx.setOnClickListener(new WalletSuccPageAwardWidget.9(this));
          this.tOx.setVisibility(0);
          if ((!this.qgo) && (!this.tOE))
            continue;
          localObject2 = h.pYm;
          if (!this.tOE);
        }
      }
      for (i = 2; ; i = 1)
      {
        ((h)localObject2).e(15225, new Object[] { Integer.valueOf(1), Integer.valueOf(i) });
        break;
      }
      label1223: i = 0;
    }
  }

  private void cSN()
  {
    AppMethodBeat.i(47973);
    ab.i("MicroMsg.WalletSuccPageAwardWidget", "tryDoModifyExposure, isClickH5OrTinyApp: %s", new Object[] { Boolean.valueOf(this.tOE) });
    if (this.tOE)
    {
      j localj = new j(this.pSK.wev, this.ttT);
      this.tOD.a(localj, false, false);
    }
    AppMethodBeat.o(47973);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(47960);
    v.hu(paramContext).inflate(2130971171, this, true);
    this.sis = ((ViewGroup)findViewById(2131821686));
    this.kqn = ((CdnImageView)findViewById(2131829062));
    this.gtb = ((TextView)findViewById(2131821227));
    this.hrg = ((TextView)findViewById(2131820991));
    this.tOx = ((Button)findViewById(2131820869));
    this.tOA = ((WalletScratchShakeView)findViewById(2131829063));
    this.tOy = ((ImageView)findViewById(2131824036));
    this.tOB = ((WalletAwardShakeAnimView)findViewById(2131829064));
    this.kqn.setRoundCorner(true);
    this.kqn.setUseSdcardCache(true);
    AppMethodBeat.o(47960);
  }

  public final void a(WalletBaseUI paramWalletBaseUI, d.a.a.c paramc, String paramString, boolean paramBoolean, ImageView paramImageView)
  {
    boolean bool1 = true;
    AppMethodBeat.i(47961);
    String str = b(paramc);
    boolean bool2;
    if ((paramc == null) || (paramc.BTD == null))
    {
      bool2 = true;
      if (paramImageView != null)
        break label129;
    }
    while (true)
    {
      ab.i("MicroMsg.WalletSuccPageAwardWidget", "setWidgetData, exposureInfo: %s, layerInfo==null: %s, hostUIBackgroundView==null:%s, isClickH5OrTinyApp: %s, isF2F: %s", new Object[] { str, Boolean.valueOf(bool2), Boolean.valueOf(bool1), Boolean.valueOf(this.tOE), Boolean.valueOf(paramBoolean) });
      this.tOD = paramWalletBaseUI;
      this.pSK = paramc;
      this.ttT = paramBoolean;
      this.kBE = paramString;
      this.tOz = paramImageView;
      cSG();
      AppMethodBeat.o(47961);
      return;
      bool2 = false;
      break;
      label129: bool1 = false;
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(47974);
    ab.i("MicroMsg.WalletSuccPageAwardWidget", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, paramm });
    if ((paramm instanceof i))
    {
      paramString = (i)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = paramString.ttY;
        if (paramString == null)
        {
          ab.e("MicroMsg.WalletSuccPageAwardWidget", "getLottery end, response is null!!");
          AppMethodBeat.o(47974);
          bool = true;
        }
      }
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.WalletSuccPageAwardWidget", "getLottery ret_code: %s, ret_msg: %s, alert_wording: %s, exposure_info: %s", new Object[] { Integer.valueOf(paramString.kdT), paramString.kdU, paramString.wmt, paramString.tBw });
      if (paramString.kdT == 0)
      {
        if (!bo.isNullOrNil(paramString.wmt))
        {
          Toast.makeText(getContext(), paramString.wmt, 1).show();
          AppMethodBeat.o(47974);
          bool = true;
        }
        else if (paramString.tBw != null)
        {
          if (this.pSK.wey != null)
          {
            paramInt1 = this.pSK.wey.BTu;
            label213: this.pSK = paramString.tBw;
            if ((paramString.tBw.wey != null) && (this.pSK.wey != null))
            {
              ab.i("MicroMsg.WalletSuccPageAwardWidget", "getLottery end, btn_op_type: %s", new Object[] { Integer.valueOf(paramString.tBw.wey.BTu) });
              if (paramString.tBw.wey.BTu == 4)
              {
                ab.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                this.pSK.wey.BTu = paramInt1;
              }
            }
            ab.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo");
            cSG();
          }
        }
        else
        {
          if ((this.tOH != null) && (this.tOG))
          {
            if (this.tOH.BTu != 8)
              break label390;
            ab.i("MicroMsg.WalletSuccPageAwardWidget", "on getLotteryEnd, btn_op_type==GET_LOTTERY_AND_JUMP_URL, goto h5");
            com.tencent.mm.wallet_core.ui.e.n(this.tOD, this.tOH.url, false);
            this.tOE = true;
          }
          label368: this.tOH = null;
        }
      }
      else
      {
        while (true)
        {
          AppMethodBeat.o(47974);
          bool = true;
          break;
          paramInt1 = 0;
          break label213;
          label390: if (this.tOH.BTu != 9)
            break label368;
          paramm = this.tOH.BTv;
          if (paramm == null)
            break label368;
          ab.i("MicroMsg.WalletSuccPageAwardWidget", "on getLotteryEnd, btn_op_type==GET_LOTTERY_AND_JUMP_MINI_APP, jump tiny app, userName: %s, path: %s, version: %s", new Object[] { paramm.wMk, paramm.wMl, Integer.valueOf(paramm.wMm) });
          paramString = new se();
          paramString.cOf.userName = paramm.wMk;
          paramString.cOf.cOh = bo.bc(paramm.wMl, "");
          paramString.cOf.scene = 1060;
          paramString.cOf.cst = this.kBE;
          paramString.cOf.cOi = 0;
          if (paramm.wMm > 0)
            paramString.cOf.axy = paramm.wMm;
          paramString.cOf.context = this.tOD;
          com.tencent.mm.sdk.b.a.xxA.m(paramString);
          this.tOE = true;
          this.tOI = false;
          this.fbD.postDelayed(new WalletSuccPageAwardWidget.3(this), 3000L);
          break label368;
          ab.i("MicroMsg.WalletSuccPageAwardWidget", "getLotteryFailed");
          cSH();
        }
        Object localObject1;
        Object localObject2;
        if ((paramm instanceof j))
        {
          paramString = (j)paramm;
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            paramm = paramString.tua;
            if (paramm == null)
            {
              ab.e("MicroMsg.WalletSuccPageAwardWidget", "modifyExposure end, response is null!!");
              AppMethodBeat.o(47974);
              bool = true;
            }
            else
            {
              i = paramm.kdT;
              paramString = paramm.kdU;
              localObject1 = paramm.wew;
              paramInt2 = paramm.wex;
              localObject2 = paramm.wey;
              if (paramm.wey != null)
              {
                paramInt1 = paramm.wey.BTu;
                label711: ab.i("MicroMsg.WalletSuccPageAwardWidget", "modifyExposure, ret_code: %s, ret_msg: %s, single_exposure_info_list: %s, is_show_btn: %s, btn_info: %s, btn_op_type: %s", new Object[] { Integer.valueOf(i), paramString, localObject1, Integer.valueOf(paramInt2), localObject2, Integer.valueOf(paramInt1) });
                if (paramm.kdT == 0)
                {
                  this.pSK.wew = paramm.wew;
                  this.pSK.wex = paramm.wex;
                  if (this.pSK.wey == null)
                    break label922;
                }
              }
            }
          }
          else
          {
            label922: for (paramInt1 = this.pSK.wey.BTu; ; paramInt1 = 0)
            {
              if (paramm.wey != null)
              {
                this.pSK.wey = paramm.wey;
                if ((this.pSK.wey != null) && (paramm.wey.BTu == 4))
                {
                  ab.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                  this.pSK.wey.BTu = paramInt1;
                }
              }
              ab.i("MicroMsg.WalletSuccPageAwardWidget", "after modify, exposureInfo: %s", new Object[] { b(this.pSK) });
              cSM();
              this.tOE = false;
              AppMethodBeat.o(47974);
              bool = true;
              break;
              paramInt1 = 0;
              break label711;
            }
          }
        }
        else if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.g))
        {
          paramString = (com.tencent.mm.plugin.wallet_core.c.g)paramm;
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            paramm = paramString.ttS;
            if (paramm == null)
            {
              ab.e("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, response is null!!");
              AppMethodBeat.o(47974);
              bool = true;
            }
            else
            {
              paramInt1 = paramm.kdT;
              localObject1 = paramm.kdU;
              localObject2 = paramm.tBw;
              if (paramm.tBw != null)
              {
                paramString = paramm.tBw.wew;
                label1017: ab.i("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, retcode: %s, retmsg: %s, exposure_info: %s, single_exposure_info_list: %s", new Object[] { Integer.valueOf(paramInt1), localObject1, localObject2, paramString });
                if ((paramm.tBw == null) || (paramm.tBw.wew == null) || (paramm.tBw.wew.size() <= 0))
                  break label1266;
                localObject2 = paramm.tBw;
                paramString = paramm.tBw.wey;
                if (paramm.tBw.wey == null)
                  break label1261;
                paramInt1 = paramm.tBw.wey.BTu;
                label1122: ab.i("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, exposureInfo: %s, btninfo: %s, btn_op_type: %s", new Object[] { localObject2, paramString, Integer.valueOf(paramInt1) });
                paramInt1 = i;
                if (this.pSK.wey != null)
                  paramInt1 = this.pSK.wey.BTu;
                this.pSK = paramm.tBw;
                if ((this.pSK.wey != null) && (paramm.tBw.wey != null) && (paramm.tBw.wey.BTu == 4))
                {
                  ab.i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                  this.pSK.wey.BTu = paramInt1;
                }
                cSG();
              }
            }
          }
          else
          {
            while (true)
            {
              AppMethodBeat.o(47974);
              bool = true;
              break;
              paramString = "";
              break label1017;
              label1261: paramInt1 = 0;
              break label1122;
              label1266: cSH();
              continue;
              cSH();
            }
          }
        }
        else
        {
          AppMethodBeat.o(47974);
        }
      }
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(47975);
    boolean bool2;
    boolean bool3;
    if ((this.tOA != null) && (this.tOA.getVisibility() == 0))
    {
      bool2 = bool1;
      if (this.tOA != null)
      {
        WalletScratchShakeView localWalletScratchShakeView = this.tOA;
        if (localWalletScratchShakeView.tNW == null)
          break label130;
        bool2 = localWalletScratchShakeView.tNW.K(paramMotionEvent);
        if (bool2);
        localWalletScratchShakeView = this.tOA;
        if (localWalletScratchShakeView.tNW == null)
          break label135;
        bool3 = localWalletScratchShakeView.tNW.tOq;
        label86: bool2 = bool1;
        if (!bool3)
          bool2 = this.tOA.dispatchTouchEvent(paramMotionEvent);
      }
      if ((this.sis != null) && (!bool2))
      {
        bool2 = this.sis.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(47975);
      }
    }
    while (true)
    {
      return bool2;
      label130: bool2 = false;
      break;
      label135: bool3 = true;
      break label86;
      bool2 = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(47975);
    }
  }

  public final void init()
  {
    AppMethodBeat.i(47964);
    if (this.tOD != null)
    {
      ab.i("MicroMsg.WalletSuccPageAwardWidget", "init");
      this.tOD.nf(1859);
      this.tOD.nf(2547);
      this.tOD.nf(2803);
      this.tOD.nf(2508);
      this.tOD.nf(2529);
      this.tOD.nf(2888);
    }
    AppMethodBeat.o(47964);
  }

  public final void onDestroy()
  {
    int i = 2;
    AppMethodBeat.i(47965);
    Object localObject;
    if (this.tOD != null)
    {
      this.tOD.ng(1859);
      this.tOD.ng(2547);
      this.tOD.ng(2803);
      this.tOD.ng(2508);
      this.tOD.ng(2529);
      this.tOD.ng(2888);
      ab.i("MicroMsg.WalletSuccPageAwardWidget", "onDestroy, isShakeOrScratch: %s, isClickAwardButton: %s", new Object[] { Boolean.valueOf(this.tOF), Boolean.valueOf(this.tOG) });
      if ((!this.tOF) && (!this.tOG))
      {
        localObject = h.pYm;
        if (!this.tOE)
          break label231;
      }
    }
    while (true)
    {
      ((h)localObject).e(15225, new Object[] { Integer.valueOf(6), Integer.valueOf(i) });
      ab.i("MicroMsg.WalletSuccPageAwardWidget", "user do nothing and quit ui, call drawlottery");
      localObject = new com.tencent.mm.plugin.wallet_core.c.g(this.pSK.wdr, 4, this.ttT);
      this.tOD.a((m)localObject, false, false);
      if (this.tOA != null)
        this.tOA.onDestroy();
      if (this.tOB != null)
        this.tOB.destroy();
      AppMethodBeat.o(47965);
      return;
      label231: i = 1;
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(47966);
    ab.i("MicroMsg.WalletSuccPageAwardWidget", "onResume, isClickH5OrTinyApp: %s, exposureInfo: %s, isMiniAppReturn: %s", new Object[] { Boolean.valueOf(this.tOE), b(this.pSK), Boolean.valueOf(this.tOI) });
    if (!this.tOI)
    {
      this.tOI = true;
      cSI();
    }
    AppMethodBeat.o(47966);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget
 * JD-Core Version:    0.6.2
 */