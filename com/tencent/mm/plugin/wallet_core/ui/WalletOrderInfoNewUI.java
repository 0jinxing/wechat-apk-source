package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ap;
import com.tencent.mm.g.a.gq;
import com.tencent.mm.g.a.iy;
import com.tencent.mm.g.a.iy.a;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.g.a.uv.a;
import com.tencent.mm.g.b.a.bg;
import com.tencent.mm.plugin.fingerprint.b.i;
import com.tencent.mm.plugin.wallet_core.c.aa;
import com.tencent.mm.plugin.wallet_core.c.k;
import com.tencent.mm.plugin.wallet_core.c.n;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.Promotions;
import com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.RemarksInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.SimpleCashierInfo;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.aeq;
import com.tencent.mm.protocal.protobuf.bnu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.c.z;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class WalletOrderInfoNewUI extends WalletOrderInfoUI
{
  private String igi;
  private String mAppId;
  private String oXY;
  private d.a.a.c pSK;
  private WalletSuccPageAwardWidget pSL;
  private ViewGroup pSM;
  private ViewGroup pSN;
  private ViewGroup pSO;
  private TextView pSP;
  private boolean pSQ;
  private com.tencent.mm.sdk.b.c<uv> pSR;
  private PayInfo pVL;
  private String pVl;
  private TextView pWB;
  private com.tencent.mm.sdk.b.c pap;
  private String pdC;
  private boolean tEC;
  private String tED;
  private String tEE;
  private WalletOrderInfoNewUI.b tEG;
  private HashMap<String, WalletOrderInfoNewUI.a> tEH;
  private String tEI;
  private String tEK;
  private Button tEL;
  private ImageView tEM;
  private ViewGroup tEN;
  private CdnImageView tEO;
  private TextView tEP;
  private TextView tEQ;
  private View tER;
  private Button tES;
  private ViewGroup tET;
  private boolean tEU;
  private boolean tEV;
  private boolean tEW;
  private com.tencent.mm.wallet_core.c tEX;
  protected Set<String> tIc;
  private List<Orders.Commodity> tId;
  private Orders.RecommendTinyAppInfo tIe;
  private String tIf;
  private Orders.Promotions tIg;
  private TextView tIh;
  private TextView tIi;
  private WalletTextView tIj;
  private ViewGroup tIk;
  private ViewGroup tIl;
  private ViewGroup tIm;
  private ViewGroup tIn;
  private ViewGroup tIo;
  private ViewGroup tIp;
  private TextView tIq;
  private CheckBox tIr;
  private ViewGroup tIs;
  private CdnImageView tIt;
  private TextView tIu;
  private TextView tIv;
  private Button tIw;
  private boolean tIx;
  private com.tencent.mm.sdk.b.c tIy;
  private Orders tog;
  private int tzY;

  public WalletOrderInfoNewUI()
  {
    AppMethodBeat.i(47450);
    this.igi = null;
    this.pdC = null;
    this.tEC = false;
    this.tIc = null;
    this.mAppId = "";
    this.tId = null;
    this.tEH = new HashMap();
    this.tIg = null;
    this.tEK = "-1";
    this.tEU = false;
    this.tEV = false;
    this.tIx = false;
    this.tEW = false;
    this.pap = new WalletOrderInfoNewUI.1(this);
    this.tIy = new WalletOrderInfoNewUI.9(this);
    this.pSQ = false;
    this.pSR = new WalletOrderInfoNewUI.14(this);
    AppMethodBeat.o(47450);
  }

  private void c(Orders paramOrders)
  {
    AppMethodBeat.i(47464);
    this.tIc.clear();
    if ((paramOrders == null) || (paramOrders.tAq == null))
    {
      ab.w("MicroMsg.WalletOrderInfoNewUI", "hy: orders is null");
      AppMethodBeat.o(47464);
    }
    while (true)
    {
      return;
      paramOrders = paramOrders.tAq.iterator();
      while (paramOrders.hasNext())
      {
        Orders.Commodity localCommodity = (Orders.Commodity)paramOrders.next();
        if ((localCommodity.tAh == 2) && (!bo.isNullOrNil(localCommodity.tAS)))
        {
          ab.i("MicroMsg.WalletOrderInfoNewUI", "hy: has username and is force recommend");
          this.tIc.add(localCommodity.tAS);
        }
      }
      AppMethodBeat.o(47464);
    }
  }

  private void cRE()
  {
    AppMethodBeat.i(47457);
    this.tIk.setVisibility(8);
    this.pSN.setVisibility(8);
    this.pSM.setVisibility(8);
    this.pSO.setVisibility(8);
    if ((this.tog != null) && (this.tId != null) && (this.tId.size() > 0))
    {
      Orders.Commodity localCommodity = (Orders.Commodity)this.tId.get(0);
      List localList = localCommodity.tAU;
      int i;
      label142: Orders.DiscountInfo localDiscountInfo;
      TextView localTextView;
      if (localList != null)
      {
        i = localList.size();
        ab.i("MicroMsg.WalletOrderInfoNewUI", "discountInfoList: %s, size: %s", new Object[] { localList, Integer.valueOf(i) });
        if ((localList == null) || (localList.size() <= 0))
          break label328;
        this.pSN.removeAllViews();
        i = 0;
        if (i >= localList.size())
          break label304;
        localDiscountInfo = (Orders.DiscountInfo)localList.get(i);
        localTextView = new TextView(this.mController.ylL);
        localTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        localTextView.setTextSize(1, 14.0F);
        localTextView.setTextColor(Color.parseColor("#FA962A"));
        if (localDiscountInfo.tBm <= 0.0D)
          break label291;
        localTextView.setText(localDiscountInfo.pOz + e.e(localDiscountInfo.tBm / 100.0D, this.tog.pcl));
      }
      while (true)
      {
        this.pSN.addView(localTextView);
        i++;
        break label142;
        i = 0;
        break;
        label291: localTextView.setText(localDiscountInfo.pOz);
      }
      label304: this.pSN.setVisibility(0);
      this.tIk.setVisibility(0);
      this.pSM.setVisibility(0);
      label328: if ((localCommodity.tAR >= 0.0D) && (localCommodity.kCJ < localCommodity.tAR))
      {
        this.pSP.setText(e.e(localCommodity.tAR, localCommodity.pcl));
        this.pSP.getPaint().setFlags(16);
        this.pSO.setVisibility(0);
        this.tIk.setVisibility(0);
      }
    }
    AppMethodBeat.o(47457);
  }

  private void cRF()
  {
    AppMethodBeat.i(47458);
    this.tIp.setVisibility(8);
    Orders.Commodity localCommodity;
    Orders.Promotions localPromotions;
    if (this.tog != null)
    {
      c(this.tog);
      if ((this.tId != null) && (this.tId.size() > 0))
      {
        localCommodity = (Orders.Commodity)this.tId.get(0);
        ab.i("MicroMsg.WalletOrderInfoNewUI", "setSubscribeBizInfo, hasSubscribeBiz: %s", new Object[] { Boolean.valueOf(localCommodity.tBb) });
        if ((localCommodity.tBb) && (localCommodity.tBa != null) && (localCommodity.tBa.size() > 0))
        {
          Iterator localIterator = localCommodity.tBa.iterator();
          do
          {
            if (!localIterator.hasNext())
              break;
            localPromotions = (Orders.Promotions)localIterator.next();
          }
          while (localPromotions.type != Orders.tAP);
        }
      }
    }
    while (true)
    {
      ab.i("MicroMsg.WalletOrderInfoNewUI", "subscribePromotions: %s", new Object[] { localPromotions });
      if ((localPromotions != null) && (!bo.isNullOrNil(localPromotions.pcm)))
      {
        this.pVl = localCommodity.cAa;
        com.tencent.mm.plugin.report.service.h.pYm.e(13033, new Object[] { Integer.valueOf(1), localPromotions.pcm, localPromotions.url, localPromotions.name, this.pVl });
        this.tIq.setText(getString(2131305076, new Object[] { localPromotions.name }));
        this.tIf = localPromotions.pcm;
        this.tIr.setVisibility(0);
        if (!this.tIc.contains(localPromotions.pcm))
          break label331;
        this.tIr.setChecked(true);
      }
      while (true)
      {
        this.tIp.setOnClickListener(new WalletOrderInfoNewUI.20(this));
        this.tIp.setVisibility(0);
        AppMethodBeat.o(47458);
        return;
        label331: this.tIr.setChecked(false);
      }
      localPromotions = null;
    }
  }

  private void cRG()
  {
    AppMethodBeat.i(47459);
    this.tIo.setVisibility(8);
    this.tIo.removeAllViews();
    Iterator localIterator;
    if ((this.tog != null) && (this.tog.tAC == 1) && (this.tog.tAE != null) && (this.tog.tAE.size() > 0))
    {
      ab.i("MicroMsg.WalletOrderInfoNewUI", "orders.showInfoList: %s %s", new Object[] { this.tog.tAE, Integer.valueOf(this.tog.tAE.size()) });
      localIterator = this.tog.tAE.iterator();
    }
    while (true)
    {
      Orders.ShowInfo localShowInfo;
      LinearLayout localLinearLayout;
      TextView localTextView1;
      TextView localTextView2;
      if (localIterator.hasNext())
      {
        localShowInfo = (Orders.ShowInfo)localIterator.next();
        ab.i("MicroMsg.WalletOrderInfoNewUI", "showInfo: %s", new Object[] { localShowInfo });
        localLinearLayout = (LinearLayout)getLayoutInflater().inflate(2130971143, this.tIo, false);
        localTextView1 = (TextView)localLinearLayout.findViewById(2131823382);
        localTextView2 = (TextView)localLinearLayout.findViewById(2131828952);
        if (!bo.isNullOrNil(localShowInfo.name))
          localTextView1.setText(localShowInfo.name);
        if (bo.isNullOrNil(localShowInfo.mVA));
      }
      try
      {
        localTextView1.setTextColor(Color.parseColor(localShowInfo.mVA));
        label231: if (!bo.isNullOrNil(localShowInfo.value))
          localTextView2.setText(localShowInfo.value);
        if (localShowInfo.tBK == 1)
          localTextView2.getPaint().setFlags(16);
        if (!bo.isNullOrNil(localShowInfo.tBF));
        try
        {
          localTextView2.setTextColor(Color.parseColor(localShowInfo.tBF));
          label290: if (localShowInfo.tBG == 1)
            if (!bo.isNullOrNil(localShowInfo.tBJ))
              localLinearLayout.setOnClickListener(new WalletOrderInfoNewUI.2(this, localShowInfo));
          while (true)
          {
            this.tIo.addView(localLinearLayout);
            break;
            if ((localShowInfo.tBG == 2) && (!bo.isNullOrNil(localShowInfo.tBH)))
              localLinearLayout.setOnClickListener(new WalletOrderInfoNewUI.3(this, localShowInfo));
          }
          this.tIk.setVisibility(0);
          this.tIo.setVisibility(0);
          AppMethodBeat.o(47459);
          return;
        }
        catch (Exception localException2)
        {
          break label290;
        }
      }
      catch (Exception localException1)
      {
        break label231;
      }
    }
  }

  private void cRn()
  {
    AppMethodBeat.i(47455);
    int i = 0;
    if (this.tEN.getVisibility() == 0)
      i = 1;
    int j = i;
    if (this.tIk.getVisibility() == 0)
      j = i + 1;
    i = j;
    if (this.tIp.getVisibility() == 0)
      i = j + 1;
    if (this.tIs.getVisibility() == 0);
    for (j = i + 1; ; j = i)
    {
      ViewGroup.MarginLayoutParams localMarginLayoutParams1 = (ViewGroup.MarginLayoutParams)this.tEM.getLayoutParams();
      ViewGroup.MarginLayoutParams localMarginLayoutParams2 = (ViewGroup.MarginLayoutParams)this.tIh.getLayoutParams();
      if (j >= 3)
      {
        j = com.tencent.mm.bz.a.fromDPToPix(this, 40);
        localMarginLayoutParams1.topMargin = j;
      }
      for (localMarginLayoutParams2.topMargin = j; ; localMarginLayoutParams2.topMargin = j)
      {
        this.tEM.setLayoutParams(localMarginLayoutParams1);
        this.tIh.setLayoutParams(localMarginLayoutParams2);
        this.tET.post(new WalletOrderInfoNewUI.17(this));
        AppMethodBeat.o(47455);
        return;
        j = com.tencent.mm.bz.a.fromDPToPix(this, 70);
        localMarginLayoutParams1.topMargin = j;
      }
    }
  }

  private void cRo()
  {
    AppMethodBeat.i(47456);
    if ((this.tog != null) && (this.tId != null) && (this.tId.size() > 0))
    {
      Iterator localIterator = this.tId.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!"1".equals(((Orders.Commodity)localIterator.next()).pce));
    }
    for (int i = 0; ; i = 1)
    {
      this.pWB.setVisibility(0);
      if (i != 0)
        if ((!bo.isNullOrNil(this.tog.tAj)) && (!bo.isNullOrNil(this.tog.tAj.trim())))
        {
          this.pWB.setText(this.tog.tAj);
          AppMethodBeat.o(47456);
        }
      while (true)
      {
        return;
        if (this.tog.tuo != 1)
        {
          this.pWB.setText(2131305069);
          AppMethodBeat.o(47456);
        }
        else
        {
          this.pWB.setText(2131305068);
          AppMethodBeat.o(47456);
          continue;
          this.pWB.setText(2131305070);
          AppMethodBeat.o(47456);
        }
      }
    }
  }

  private void nk(boolean paramBoolean)
  {
    AppMethodBeat.i(47460);
    this.tEN.setVisibility(8);
    this.tEV = false;
    this.tEU = false;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (this.tog != null)
      if ((this.tId != null) && (this.tId.size() > 0))
      {
        localObject1 = (Orders.Commodity)this.tId.get(0);
        if (localObject1 != null)
        {
          ab.i("MicroMsg.WalletOrderInfoNewUI", "setTinyAppActivityInfo, hasSubscribeBiz: %s", new Object[] { Boolean.valueOf(((Orders.Commodity)localObject1).tBb) });
          if ((((Orders.Commodity)localObject1).tBa == null) || (((Orders.Commodity)localObject1).tBa.size() <= 0))
            break label1580;
          localObject2 = ((Orders.Commodity)localObject1).tBa.iterator();
          do
          {
            if (!((Iterator)localObject2).hasNext())
              break;
            localObject3 = (Orders.Promotions)((Iterator)localObject2).next();
          }
          while (((Orders.Promotions)localObject3).type != Orders.tAQ);
        }
      }
    while (true)
    {
      ab.i("MicroMsg.WalletOrderInfoNewUI", "activityPromotions: %s", new Object[] { localObject3 });
      if ((localObject3 != null) && (((Orders.Promotions)localObject3).ttW > 0L) && (!bo.isNullOrNil(((Orders.Promotions)localObject3).tzS)))
      {
        this.tIg = ((Orders.Promotions)localObject3);
        this.tER.setVisibility(8);
        this.tEO.setRoundCorner(true);
        this.tES.setEnabled(true);
        this.tES.setBackgroundResource(2130838000);
        this.tEQ.setCompoundDrawables(null, null, null, null);
        localObject4 = (WalletOrderInfoNewUI.a)this.tEH.get(((Orders.Promotions)localObject3).ttW);
        if (localObject4 != null)
        {
          if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject4).cIY))
            this.tEO.setUrl(((WalletOrderInfoNewUI.a)localObject4).cIY);
          if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject4).cEh))
            this.tEP.setText(((WalletOrderInfoNewUI.a)localObject4).cEh);
          if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject4).tID))
          {
            this.tES.setText(((WalletOrderInfoNewUI.a)localObject4).tID);
            this.tES.setBackgroundResource(2130840727);
          }
          if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject4).tzW))
            this.tIg.tBr = ((WalletOrderInfoNewUI.a)localObject4).tzW;
          if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject4).ttg))
            this.tIg.tBs = ((WalletOrderInfoNewUI.a)localObject4).ttg;
          if (((WalletOrderInfoNewUI.a)localObject4).tIE > 0)
            this.tIg.tBt = ((WalletOrderInfoNewUI.a)localObject4).tIE;
          localObject2 = (RelativeLayout.LayoutParams)this.tEQ.getLayoutParams();
          if ((localObject4 == null) || (bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject4).title)))
            break label865;
          this.tEQ.setText(((WalletOrderInfoNewUI.a)localObject4).title);
          ((RelativeLayout.LayoutParams)localObject2).addRule(15, 0);
          this.tEQ.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          this.tES.setVisibility(0);
          this.tES.setOnClickListener(new WalletOrderInfoNewUI.4(this));
          if (((Orders.Promotions)localObject3).tBo != 1)
            this.tEN.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                AppMethodBeat.i(47430);
                ab.i("MicroMsg.WalletOrderInfoNewUI", "click activity layout");
                WalletOrderInfoNewUI.q(WalletOrderInfoNewUI.this);
                AppMethodBeat.o(47430);
              }
            });
          localObject2 = this.tEK;
          i = -1;
          switch (((String)localObject2).hashCode())
          {
          default:
            switch (i)
            {
            default:
              localObject4 = (ViewGroup.MarginLayoutParams)this.tEN.getLayoutParams();
              localObject2 = ((Orders.Commodity)localObject1).tAU;
              if (((((Orders.Commodity)localObject1).tAR >= 0.0D) && (((Orders.Commodity)localObject1).kCJ < ((Orders.Commodity)localObject1).tAR)) || ((localObject2 != null) && (((List)localObject2).size() > 0)))
              {
                ((ViewGroup.MarginLayoutParams)localObject4).topMargin = 0;
                this.tEN.setLayoutParams((ViewGroup.LayoutParams)localObject4);
                this.tEN.setVisibility(0);
                if (paramBoolean)
                {
                  localObject4 = com.tencent.mm.plugin.report.service.h.pYm;
                  localObject2 = this.pVl;
                  i = ((Orders.Promotions)localObject3).tBo;
                  if (!this.tEK.equals("-1"))
                    break label1037;
                  localObject1 = Integer.valueOf(5);
                  ((com.tencent.mm.plugin.report.service.h)localObject4).e(13471, new Object[] { localObject2, Integer.valueOf(1), Integer.valueOf(i), localObject1, Long.valueOf(((Orders.Promotions)localObject3).ttW), Long.valueOf(((Orders.Promotions)localObject3).tzR) });
                }
              }
              break;
            case 0:
            }
            break;
          case 48:
          case 1444:
          case 51:
          case 52:
          case 50:
          case 49:
          }
        }
      }
      label865: 
      while ((((Orders.Commodity)localObject1).tAY == null) || (bo.isNullOrNil(((Orders.Commodity)localObject1).tAY.tzW)))
        while (true)
        {
          Object localObject4;
          int i;
          if (this.tEP.getVisibility() == 0)
          {
            this.tEP.setSingleLine();
            this.tEP.post(new WalletOrderInfoNewUI.7(this));
          }
          AppMethodBeat.o(47460);
          return;
          this.tEO.setUrl(((Orders.Promotions)localObject3).pia);
          this.tEP.setText(((Orders.Promotions)localObject3).name);
          this.tES.setText(((Orders.Promotions)localObject3).tzS);
          continue;
          if (!bo.isNullOrNil(((Orders.Promotions)localObject3).title))
          {
            this.tEQ.setText(((Orders.Promotions)localObject3).title);
            ((RelativeLayout.LayoutParams)localObject2).addRule(15, 0);
          }
          else
          {
            this.tEQ.setVisibility(8);
            ((RelativeLayout.LayoutParams)localObject2).addRule(15, -1);
            continue;
            if (((String)localObject2).equals("0"))
            {
              i = 0;
              continue;
              if (((String)localObject2).equals("-1"))
              {
                i = 1;
                continue;
                if (((String)localObject2).equals("3"))
                {
                  i = 2;
                  continue;
                  if (((String)localObject2).equals("4"))
                  {
                    i = 3;
                    continue;
                    if (((String)localObject2).equals("2"))
                    {
                      i = 4;
                      continue;
                      if (((String)localObject2).equals("1"))
                      {
                        i = 5;
                        continue;
                        this.tES.setEnabled(false);
                        continue;
                        ((ViewGroup.MarginLayoutParams)localObject4).topMargin = com.tencent.mm.bz.a.fromDPToPix(this, 50);
                        continue;
                        localObject1 = this.tEK;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      label1037: this.tED = ((Orders.Commodity)localObject1).tAY.tzW;
      this.tEE = ((Orders.Commodity)localObject1).tAY.ttg;
      this.tzY = ((Orders.Commodity)localObject1).tAY.tzY;
      this.tIe = ((Orders.Commodity)localObject1).tAY;
      this.tEO.setUrl(((Orders.Commodity)localObject1).tAY.tzU);
      this.tEP.setText(((Orders.Commodity)localObject1).tAY.tzV);
      this.tEQ.setText(getString(2131304516));
      this.tEQ.setVisibility(0);
      this.tEO.setRoundCorner(true);
      this.tES.setEnabled(true);
      this.tES.setBackgroundResource(2130838000);
      localObject3 = (RelativeLayout.LayoutParams)this.tEQ.getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject3).addRule(15, 0);
      this.tEQ.setLayoutParams((ViewGroup.LayoutParams)localObject3);
      if (((Orders.Commodity)localObject1).tAY.tBx > 0L)
      {
        if (!bo.isNullOrNil(((Orders.Commodity)localObject1).tAY.tzX))
        {
          this.tES.setVisibility(0);
          this.tES.setText(((Orders.Commodity)localObject1).tAY.tzX);
          this.tER.setVisibility(8);
        }
        localObject3 = (WalletOrderInfoNewUI.a)this.tEH.get(((Orders.Commodity)localObject1).tAY.tBx);
        if (localObject3 != null)
        {
          if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject3).tzU))
            this.tEO.setUrl(((WalletOrderInfoNewUI.a)localObject3).tzU);
          if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject3).tzV))
            this.tEP.setText(((WalletOrderInfoNewUI.a)localObject3).tzV);
          if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject3).tzX))
          {
            this.tES.setText(((WalletOrderInfoNewUI.a)localObject3).tzX);
            this.tES.setBackgroundResource(2130840727);
          }
          if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject3).tzW))
            this.tED = ((WalletOrderInfoNewUI.a)localObject3).tzW;
          if (!bo.isNullOrNil(((WalletOrderInfoNewUI.a)localObject3).ttg))
            this.tEE = ((WalletOrderInfoNewUI.a)localObject3).ttg;
          if (((WalletOrderInfoNewUI.a)localObject3).tIE > 0)
            this.tzY = ((WalletOrderInfoNewUI.a)localObject3).tIE;
        }
        label1440: localObject3 = new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(47431);
            ab.i("MicroMsg.WalletOrderInfoNewUI", "click tiny app, userName: %s, path: %s, version: %s", new Object[] { WalletOrderInfoNewUI.n(WalletOrderInfoNewUI.this), WalletOrderInfoNewUI.o(WalletOrderInfoNewUI.this), Integer.valueOf(WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this)) });
            paramAnonymousView = new se();
            paramAnonymousView.cOf.userName = WalletOrderInfoNewUI.n(WalletOrderInfoNewUI.this);
            paramAnonymousView.cOf.cOh = bo.bc(WalletOrderInfoNewUI.o(WalletOrderInfoNewUI.this), "");
            paramAnonymousView.cOf.scene = 1034;
            paramAnonymousView.cOf.cOi = 0;
            if (WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this) > 0)
              paramAnonymousView.cOf.axy = WalletOrderInfoNewUI.r(WalletOrderInfoNewUI.this);
            paramAnonymousView.cOf.context = WalletOrderInfoNewUI.this;
            com.tencent.mm.sdk.b.a.xxA.m(paramAnonymousView);
            paramAnonymousView = WalletOrderInfoNewUI.this;
            boolean bool;
            if ((!bo.isNullOrNil(this.tIB.tAY.tzX)) && (this.tIB.tAY.tBx > 0L))
            {
              bool = true;
              WalletOrderInfoNewUI.a(paramAnonymousView, bool);
              if (!WalletOrderInfoNewUI.p(WalletOrderInfoNewUI.this))
                break label256;
              com.tencent.mm.plugin.report.service.h.pYm.e(14118, new Object[] { WalletOrderInfoNewUI.m(WalletOrderInfoNewUI.this), WalletOrderInfoNewUI.this.cNH(), Integer.valueOf(3) });
              AppMethodBeat.o(47431);
            }
            while (true)
            {
              return;
              bool = false;
              break;
              label256: com.tencent.mm.plugin.report.service.h.pYm.e(14118, new Object[] { WalletOrderInfoNewUI.m(WalletOrderInfoNewUI.this), WalletOrderInfoNewUI.this.cNH(), Integer.valueOf(1) });
              AppMethodBeat.o(47431);
            }
          }
        };
        this.tEN.setOnClickListener((View.OnClickListener)localObject3);
        this.tES.setOnClickListener((View.OnClickListener)localObject3);
        localObject2 = (ViewGroup.MarginLayoutParams)this.tEN.getLayoutParams();
        localObject3 = ((Orders.Commodity)localObject1).tAU;
        if (((((Orders.Commodity)localObject1).tAR < 0.0D) || (((Orders.Commodity)localObject1).kCJ >= ((Orders.Commodity)localObject1).tAR)) && ((localObject3 == null) || (((List)localObject3).size() <= 0)))
          break label1567;
      }
      label1567: for (((ViewGroup.MarginLayoutParams)localObject2).topMargin = 0; ; ((ViewGroup.MarginLayoutParams)localObject2).topMargin = com.tencent.mm.bz.a.fromDPToPix(this, 50))
      {
        this.tEN.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        this.tEN.setVisibility(0);
        break;
        this.tES.setVisibility(8);
        this.tER.setVisibility(8);
        break label1440;
      }
      label1580: localObject3 = null;
    }
  }

  public final void AM(int paramInt)
  {
    AppMethodBeat.i(47471);
    this.mController.contentView.setVisibility(paramInt);
    AppMethodBeat.o(47471);
  }

  protected final void acZ(String paramString)
  {
    AppMethodBeat.i(47461);
    ab.i("MicroMsg.WalletOrderInfoNewUI", "jumpToH5: %s", new Object[] { paramString });
    cRq();
    e.n(this, paramString, true);
    AppMethodBeat.o(47461);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(47470);
    ab.i("MicroMsg.WalletOrderInfoNewUI", "onSceneEnd, errType: %s, errCode: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramm });
    boolean bool;
    if ((WalletSuccPageAwardWidget.a(this.pSK)) && (this.pSL.c(paramInt1, paramInt2, paramString, paramm)))
    {
      AppMethodBeat.o(47470);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((paramm instanceof aa))
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramm = (aa)paramm;
          paramString = new WalletOrderInfoNewUI.a(paramm.hwh);
          if (this.tEG != null)
          {
            this.tEH.put(paramm.tuv, paramString);
            nk(false);
            cRn();
          }
        }
        else
        {
          label140: this.tIx = false;
        }
      label288: 
      do
      {
        AppMethodBeat.o(47470);
        bool = false;
        break;
        if (!this.tEU)
          break label140;
        this.tEH.put(paramm.tuv, paramString);
        nk(false);
        cRn();
        break label140;
        if ((paramm instanceof k))
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            paramString = (k)paramm;
            paramm = paramString.tuc;
            if (paramm.kdT == 0)
            {
              paramm = new WalletOrderInfoNewUI.a(paramm);
              if (this.tEG == null)
                break label288;
              this.tEH.put(paramString.ssr, paramm);
              nk(false);
              cRn();
            }
          }
          while (true)
          {
            this.tIx = false;
            break;
            if (this.tEU)
            {
              this.tEH.put(paramString.ssr, paramm);
              nk(false);
              cRn();
            }
          }
        }
        if ((paramm instanceof n))
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            paramString = (n)paramm;
            paramm = paramString.tud;
            if ((this.tIg != null) && (this.tIg.ttW == paramString.tug.ttW))
            {
              ab.i("MicroMsg.WalletOrderInfoNewUI", "activityAwardState: %s", new Object[] { this.tIg });
              this.tEK = paramm;
              ab.d("MicroMsg.WalletOrderInfoNewUI", "btnName: %s", new Object[] { paramString.tug.tzS });
              nk(false);
              cRn();
              if ((!bo.isNullOrNil(paramString.ehr)) && (!"3".equals(paramm)))
                this.tES.setText(paramString.ehr);
            }
            if ((!"-1".equals(paramm)) && (!"0".equals(paramm)) && (!bo.isNullOrNil(paramString.tue)))
              com.tencent.mm.ui.base.h.b(this, paramString.tue, "", true);
            while (!"0".equals(paramm))
            {
              AppMethodBeat.o(47470);
              bool = true;
              break;
            }
            if (!bo.isNullOrNil(paramString.tue));
            for (paramString = paramString.tue; ; paramString = getString(2131305156))
            {
              Toast.makeText(this, paramString, 0).show();
              break;
            }
          }
          paramm = paramString;
          if (bo.isNullOrNil(paramString))
            paramm = getString(2131305389);
          com.tencent.mm.ui.base.h.a(this, paramm, null, false, new WalletOrderInfoNewUI.12(this));
          AppMethodBeat.o(47470);
          bool = true;
          break;
        }
      }
      while (!(paramm instanceof com.tencent.mm.plugin.wallet_core.c.h));
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (com.tencent.mm.plugin.wallet_core.c.h)paramm;
        aeq localaeq = paramString.ttV;
        if (localaeq.kdT == 0)
        {
          paramm = localaeq.wms;
          if ((this.tIg != null) && (this.tIg.ttW == paramString.ttW))
          {
            ab.i("MicroMsg.WalletOrderInfoNewUI", "activityAwardState: %s", new Object[] { this.tIg });
            this.tEK = paramm;
            ab.d("MicroMsg.WalletOrderInfoNewUI", "btnName: %s", new Object[] { localaeq.wmu });
            nk(false);
            cRn();
            if ((!bo.isNullOrNil(localaeq.wmu)) && (!"3".equals(paramm)))
              this.tES.setText(localaeq.wmu);
          }
          if (("-1".equals(paramm)) || ("0".equals(paramm)) || (bo.isNullOrNil(localaeq.wmt)))
            break label850;
          com.tencent.mm.ui.base.h.b(this, localaeq.wmt, "", true);
        }
        label850: 
        while (!"0".equals(paramm))
        {
          AppMethodBeat.o(47470);
          bool = true;
          break;
        }
        if (!bo.isNullOrNil(localaeq.wmt));
        for (paramString = localaeq.wmt; ; paramString = getString(2131305156))
        {
          Toast.makeText(this, paramString, 0).show();
          break;
        }
      }
      paramm = paramString;
      if (bo.isNullOrNil(paramString))
        paramm = getString(2131305389);
      com.tencent.mm.ui.base.h.a(this, paramm, null, false, new WalletOrderInfoNewUI.13(this));
      AppMethodBeat.o(47470);
      bool = true;
    }
  }

  public final void cRH()
  {
    AppMethodBeat.i(47466);
    cRq();
    Object localObject1 = new ap();
    ((ap)localObject1).ctF.ctG = true;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    localObject1 = new gq();
    ((gq)localObject1).cBo.cBp = "ok";
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    Bundle localBundle = new Bundle();
    localBundle.putInt("intent_pay_end_errcode", this.mBundle.getInt("intent_pay_end_errcode"));
    localBundle.putString("intent_pay_app_url", this.mBundle.getString("intent_pay_app_url"));
    localBundle.putBoolean("intent_pay_end", this.mBundle.getBoolean("intent_pay_end"));
    ab.i("MicroMsg.WalletOrderInfoNewUI", "pay done...feedbackData errCode:" + this.mBundle.getInt("intent_pay_end_errcode"));
    Object localObject2 = this.tIc.iterator();
    if (((Iterator)localObject2).hasNext())
    {
      String str1 = (String)((Iterator)localObject2).next();
      if (!bo.isNullOrNil(str1))
      {
        ab.i("MicroMsg.WalletOrderInfoNewUI", "hy: doing netscene subscribe...appName: %s", new Object[] { str1 });
        if ((this.tog == null) || (this.pVL == null))
          break label360;
        p localp = com.tencent.mm.kernel.g.RO().eJo;
        String str2 = this.tog.czZ;
        if (this.tog.tAq.size() <= 0)
          break label354;
        localObject1 = ((Orders.Commodity)this.tog.tAq.get(0)).cAa;
        label271: localp.a(new com.tencent.mm.wallet_core.c.r(str1, str2, (String)localObject1, this.pVL.cIf, this.pVL.cIb, this.tog.tAh), 0);
      }
      while (true)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(13033, new Object[] { Integer.valueOf(2), str1, "", "", "" });
        break;
        label354: localObject1 = "";
        break label271;
        label360: com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.wallet_core.c.r(str1), 0);
      }
    }
    if (this.tEX != null)
    {
      this.tEX.a(this, 0, localBundle);
      this.tEX = null;
      if ((this.pVL == null) || ((this.pVL.cIf != 46) && (this.pVL.cIf != 3)))
        break label906;
      localObject1 = new bg();
      if (this.pVL.cIf != 46)
        break label806;
      ((bg)localObject1).dcc = 2L;
      label462: if ((this.tog == null) || (this.tog.tAD != 0))
        break label825;
      ((bg)localObject1).dcd = 1L;
    }
    while (true)
    {
      if ((this.pVL != null) && (this.pVL.vwh != null))
      {
        localObject2 = this.pVL.vwh.getString("extinfo_key_20", "");
        if (!bo.isNullOrNil((String)localObject2))
          ((bg)localObject1).fY((String)localObject2);
        localObject2 = this.pVL.vwh.getString("extinfo_key_21", "");
        if (!bo.isNullOrNil((String)localObject2))
          ((bg)localObject1).ga((String)localObject2);
        localObject2 = this.pVL.vwh.getString("extinfo_key_22", "");
        if (!bo.isNullOrNil((String)localObject2))
          ((bg)localObject1).fZ((String)localObject2);
      }
      if ((this.tog != null) && (this.tog.tAD == 0) && (!bo.isNullOrNil(this.tog.tAG)) && (!bo.isNullOrNil(this.tog.tAF)))
      {
        ((bg)localObject1).gc(this.tog.tAG);
        ((bg)localObject1).gb(this.tog.tAF);
      }
      ((bg)localObject1).ajK();
      if ((this.tog == null) || (this.tog.tAD != 0) || (bo.isNullOrNil(this.tog.tAG)) || (bo.isNullOrNil(this.tog.tAF)))
        break label906;
      localObject1 = new se();
      ((se)localObject1).cOf.userName = this.tog.tAF;
      ((se)localObject1).cOf.cOh = this.tog.tAG;
      ((se)localObject1).cOf.scene = 1060;
      ((se)localObject1).cOf.cst = this.oXY;
      ((se)localObject1).cOf.cOi = 0;
      ((se)localObject1).cOf.context = this;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      AppMethodBeat.o(47466);
      return;
      ab.i("MicroMsg.WalletOrderInfoNewUI", "process is null! finish directly");
      finish();
      break;
      label806: if (this.pVL.cIf != 3)
        break label462;
      ((bg)localObject1).dcc = 1L;
      break label462;
      label825: if ((this.tog != null) && (this.tog.tAD == 1))
        ((bg)localObject1).dcd = 2L;
      else if ((this.tog != null) && (this.tog.tAD == 0) && (!bo.isNullOrNil(this.tog.tAG)) && (!bo.isNullOrNil(this.tog.tAF)))
        ((bg)localObject1).dcd = 3L;
    }
    label906: if ((this.tog != null) && (!bo.isNullOrNil(this.tog.lvz)))
      if (this.tog.tAq.size() <= 0)
        break label1076;
    label1076: for (localObject1 = ((Orders.Commodity)this.tog.tAq.get(0)).cAa; ; localObject1 = "")
    {
      localObject1 = d(this.tog.lvz, this.tog.czZ, (String)localObject1, this.pVL.kck, this.pVL.hHV);
      ab.d("MicroMsg.WalletOrderInfoNewUI", "url = ".concat(String.valueOf(localObject1)));
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
      ((Intent)localObject2).putExtra("showShare", false);
      ((Intent)localObject2).putExtra("geta8key_username", com.tencent.mm.model.r.Yz());
      ((Intent)localObject2).putExtra("stastic_scene", 8);
      com.tencent.mm.bp.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject2);
      AppMethodBeat.o(47466);
      break;
    }
  }

  protected void cRq()
  {
    int i = 0;
    AppMethodBeat.i(47469);
    if (!this.tEC)
    {
      iy localiy = new iy();
      localiy.cEc.requestCode = 4;
      iy.a locala = localiy.cEc;
      if (this.mBundle.getBoolean("intent_pay_end", false))
        i = -1;
      locala.bFZ = i;
      localiy.cEc.cEd = new Intent();
      if (this.tog != null)
        localiy.cEc.cEd.putExtra("key_jsapi_close_page_after_pay", this.tog.tAD);
      if ((this.tog != null) && (this.tog.tAD == 0) && (!bo.isNullOrNil(this.tog.tAG)) && (!bo.isNullOrNil(this.tog.tAF)))
        localiy.cEc.cEd.putExtra("key_jsapi_close_page_after_pay", 1);
      if (this.tEX != null)
        localiy.cEc.cEd.putExtra("key_is_clear_failure", this.tEX.mqu.getInt("key_is_clear_failure", -1));
      com.tencent.mm.sdk.b.a.xxA.m(localiy);
      this.tEC = true;
    }
    AppMethodBeat.o(47469);
  }

  protected final boolean cgg()
  {
    return false;
  }

  public void done()
  {
    AppMethodBeat.i(47465);
    if (this.mBundle.containsKey("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)this.mBundle.getParcelable("key_realname_guide_helper");
      if (localRealnameGuideHelper != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("realname_verify_process_jump_activity", ".ui.WalletOrderInfoNewUI");
        localBundle.putString("realname_verify_process_jump_plugin", "wallet_core");
        boolean bool1 = localRealnameGuideHelper.b(this, localBundle, new WalletOrderInfoNewUI.10(this));
        boolean bool2 = localRealnameGuideHelper.a(this, localBundle, new WalletOrderInfoNewUI.11(this));
        this.mBundle.remove("key_realname_guide_helper");
        if ((!bool1) && (!bool2))
          cRH();
      }
      AppMethodBeat.o(47465);
    }
    while (true)
    {
      return;
      cRH();
      AppMethodBeat.o(47465);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(47451);
    ab.i("MicroMsg.WalletOrderInfoNewUI", "finish this %s %s", new Object[] { this, bo.dpG() });
    if (this.pSQ)
      AppMethodBeat.o(47451);
    while (true)
    {
      return;
      super.finish();
      this.pSQ = true;
      AppMethodBeat.o(47451);
    }
  }

  public final int getLayoutId()
  {
    return 2130971144;
  }

  public final void initView()
  {
    AppMethodBeat.i(47454);
    if (getSupportActionBar() != null)
      getSupportActionBar().hide();
    this.tEM = ((ImageView)findViewById(2131828704));
    this.pWB = ((TextView)findViewById(2131828705));
    this.tIh = ((TextView)findViewById(2131828953));
    this.tIi = ((TextView)findViewById(2131828955));
    this.tIj = ((WalletTextView)findViewById(2131828956));
    this.pSP = ((TextView)findViewById(2131826987));
    this.tEL = ((Button)findViewById(2131828708));
    showHomeBtn(false);
    enableBackMenu(false);
    Object localObject1 = getString(2131296944);
    Object localObject2;
    int i;
    label667: label753: Object localObject3;
    if ((this.pVL != null) && (this.pVL.cIf == 2))
      if ((this.tog != null) && (!bo.isNullOrNil(this.tog.tAB)))
      {
        localObject2 = this.tog.tAB;
        this.tEL.setText((CharSequence)localObject2);
        this.tEL.setOnClickListener(new WalletOrderInfoNewUI.15(this));
        this.tIk = ((ViewGroup)findViewById(2131828957));
        this.pSN = ((ViewGroup)findViewById(2131826978));
        this.tET = ((ViewGroup)findViewById(2131828707));
        this.pSM = ((ViewGroup)findViewById(2131826977));
        this.pSO = ((ViewGroup)findViewById(2131826986));
        this.tIl = ((ViewGroup)findViewById(2131828959));
        this.tIm = ((ViewGroup)findViewById(2131828961));
        this.tIo = ((ViewGroup)findViewById(2131828958));
        this.tIn = ((ViewGroup)findViewById(2131828963));
        this.tEN = ((ViewGroup)findViewById(2131827111));
        this.tEO = ((CdnImageView)findViewById(2131827112));
        this.tEO.setUseSdcardCache(true);
        this.tEP = ((TextView)findViewById(2131827114));
        this.tEQ = ((TextView)findViewById(2131827113));
        this.tES = ((Button)findViewById(2131827115));
        this.tER = findViewById(2131826995);
        this.tIp = ((ViewGroup)findViewById(2131828966));
        this.tIq = ((TextView)findViewById(2131828968));
        this.tIr = ((CheckBox)findViewById(2131828967));
        this.tIs = ((ViewGroup)findViewById(2131828969));
        this.tIt = ((CdnImageView)findViewById(2131828970));
        this.tIt.setUseSdcardCache(true);
        this.tIv = ((TextView)findViewById(2131828972));
        this.tIu = ((TextView)findViewById(2131828971));
        this.tIw = ((Button)findViewById(2131828973));
        this.tET.setVisibility(4);
        this.pSL = ((WalletSuccPageAwardWidget)findViewById(2131826996));
        cRo();
        if ((this.tog != null) && (this.tId != null) && (this.tId.size() > 0))
        {
          localObject2 = (Orders.Commodity)this.tId.get(0);
          this.tIh.setText(((Orders.Commodity)localObject2).pca);
          this.tIi.setText(e.atq(((Orders.Commodity)localObject2).pcl));
          this.tIj.setText(String.format("%.2f", new Object[] { Double.valueOf(((Orders.Commodity)localObject2).kCJ) }));
        }
        if (this.tog != null)
          break label1211;
        i = 0;
        ab.i("MicroMsg.WalletOrderInfoNewUI", "is_use_show_info: %s", new Object[] { Integer.valueOf(i) });
        if ((this.tog == null) || (this.tog.tAC != 1))
          break label1222;
        this.tIl.setVisibility(8);
        this.tIm.setVisibility(8);
        this.pSO.setVisibility(8);
        this.pSM.setVisibility(8);
        this.tIn.setVisibility(8);
        cRG();
        cRF();
        if ((this.tId == null) || (this.tId.size() <= 0))
          break label1523;
        localObject2 = (Orders.Commodity)this.tId.get(0);
        if ((localObject2 == null) || (((Orders.Commodity)localObject2).tBa == null) || (((Orders.Commodity)localObject2).tBa.size() <= 0))
          break label1520;
        localObject1 = ((Orders.Commodity)localObject2).tBa.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (Orders.Promotions)((Iterator)localObject1).next();
          if ((((Orders.Promotions)localObject3).tBw != null) && (((Orders.Promotions)localObject3).tBo == 5))
          {
            this.pSK = ((Orders.Promotions)localObject3).tBw;
            ab.i("MicroMsg.WalletOrderInfoNewUI", "get exposureInfo: %s, from promotion: %s", new Object[] { this.pSK, Integer.valueOf(((Orders.Promotions)localObject3).tBo) });
          }
        }
      }
    while (true)
    {
      if (WalletSuccPageAwardWidget.a(this.pSK))
        if (localObject2 != null)
        {
          localObject1 = (ViewGroup.MarginLayoutParams)this.pSL.getLayoutParams();
          localObject3 = ((Orders.Commodity)localObject2).tAU;
          if (((((Orders.Commodity)localObject2).tAR >= 0.0D) && (((Orders.Commodity)localObject2).kCJ < ((Orders.Commodity)localObject2).tAR)) || ((localObject3 != null) && (((List)localObject3).size() > 0)))
          {
            ((ViewGroup.MarginLayoutParams)localObject1).topMargin = 0;
            label971: this.pSL.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          }
        }
        else
        {
          this.pSL.a(this, this.pSK, this.oXY, false, (ImageView)findViewById(2131824036));
          this.pSL.init();
          this.pSL.setVisibility(0);
          localObject2 = (ImageView)findViewById(2131824036);
          ((ImageView)localObject2).post(new WalletOrderInfoNewUI.16(this, (ImageView)localObject2));
        }
      while (true)
      {
        cRn();
        AppMethodBeat.o(47454);
        return;
        if (!bo.isNullOrNil(this.pVL.tRb))
        {
          localObject2 = getString(2131296530) + this.pVL.tRb;
          break;
        }
        localObject2 = localObject1;
        if (bo.isNullOrNil(this.pVL.appId))
          break;
        localObject2 = localObject1;
        if (bo.isNullOrNil(com.tencent.mm.pluginsdk.model.app.g.t(this, this.pVL.appId)))
          break;
        localObject2 = getString(2131296530) + com.tencent.mm.pluginsdk.model.app.g.t(this, this.pVL.appId);
        break;
        localObject2 = localObject1;
        if (this.tog == null)
          break;
        localObject2 = localObject1;
        if (bo.isNullOrNil(this.tog.tAB))
          break;
        localObject2 = this.tog.tAB;
        break;
        label1211: i = this.tog.tAC;
        break label667;
        label1222: cRE();
        if ((this.tog != null) && (this.tId != null) && (this.tId.size() > 0))
        {
          localObject3 = (Orders.Commodity)this.tId.get(0);
          if (((Orders.Commodity)localObject3).tAZ != null)
          {
            localObject2 = (TextView)this.tIn.findViewById(2131828964);
            localObject1 = (TextView)this.tIn.findViewById(2131828965);
            ((TextView)localObject2).setText(((Orders.Commodity)localObject3).tAZ.tBD);
            ((TextView)localObject1).setText(((Orders.Commodity)localObject3).tAZ.tBE);
            this.tIn.setVisibility(0);
            this.tIk.setVisibility(0);
          }
        }
        this.tIm.setVisibility(8);
        this.tIl.setVisibility(8);
        if ((this.tog == null) || (this.tId == null) || (this.tId.size() <= 0))
          break label753;
        localObject2 = (Orders.Commodity)this.tId.get(0);
        if (!bo.isNullOrNil(((Orders.Commodity)localObject2).tAX))
        {
          ((TextView)findViewById(2131828960)).setText(((Orders.Commodity)localObject2).tAX);
          this.tIl.setVisibility(0);
          this.tIk.setVisibility(0);
        }
        if (bo.isNullOrNil(((Orders.Commodity)localObject2).tAV))
          break label753;
        ((TextView)findViewById(2131828962)).setText(((Orders.Commodity)localObject2).tAV);
        this.tIm.setVisibility(0);
        this.tIk.setVisibility(0);
        break label753;
        ((ViewGroup.MarginLayoutParams)localObject1).topMargin = com.tencent.mm.bz.a.fromDPToPix(this, 50);
        break label971;
        nk(true);
        this.pSL.setVisibility(8);
      }
      label1520: continue;
      label1523: localObject2 = null;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(47462);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.WalletOrderInfoNewUI", "onActivityResult %d %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 1)
    {
      ab.i("MicroMsg.WalletOrderInfoNewUI", "do query pay arawrd, query_award_status_params==null: %s, isCallQueryPayAward: %s", new Object[] { Boolean.valueOf(bo.isNullOrNil(this.tEG.tIJ)), Boolean.valueOf(this.tIx) });
      if (this.tIx)
        AppMethodBeat.o(47462);
    }
    while (true)
    {
      return;
      this.tIx = true;
      if (bo.isNullOrNil(this.tEG.tIJ))
      {
        a(new aa(this.tEG.tuv, this.tEG.tIF, this.tEG.tIG, this.tEG.tIH, this.tEG.cBT, this.tEG.pQe, this.tEG.tBC), true, true);
        AppMethodBeat.o(47462);
      }
      else
      {
        a(new k(this.tEG.tIJ, this.tEG.tuv), true, true);
        AppMethodBeat.o(47462);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47452);
    super.onCreate(paramBundle);
    label220: Object localObject;
    boolean bool2;
    label248: int k;
    label255: uv localuv;
    if (com.tencent.mm.compatible.util.d.iW(21))
    {
      if (com.tencent.mm.compatible.util.d.iW(23))
      {
        getWindow().setStatusBarColor(-1);
        getWindow().getDecorView().setSystemUiVisibility(8192);
      }
    }
    else
    {
      AM(4);
      this.tIc = new HashSet();
      paramBundle = com.tencent.mm.wallet_core.a.aE(this);
      this.pVL = ((PayInfo)this.mBundle.getParcelable("key_pay_info"));
      this.oXY = this.mBundle.getString("key_trans_id");
      this.mBundle.getInt("key_pay_type", -1);
      ab.i("MicroMsg.WalletOrderInfoNewUI", "mTransId %s", new Object[] { this.oXY });
      this.tog = cRD();
      if (this.tog == null)
        break label842;
      AM(0);
      c(this.tog);
      if ((paramBundle != null) && (this.tog != null) && (this.pVL != null))
      {
        this.mAppId = this.pVL.appId;
        boolean bool1 = paramBundle.dNG();
        com.tencent.mm.plugin.wallet_core.utils.d.a(this, this.mBundle, 7);
        if (this.mBundle.getInt("key_support_bankcard", 1) != 2)
          break label787;
        i = 2;
        localObject = com.tencent.mm.plugin.report.service.h.pYm;
        int j = this.pVL.cIf;
        if (this.pVL.cIf != 3)
          break label792;
        bool2 = true;
        if (!bool1)
          break label798;
        k = 1;
        ((com.tencent.mm.plugin.report.service.h)localObject).e(10691, new Object[] { Integer.valueOf(j), Boolean.valueOf(bool2), Integer.valueOf(k), Integer.valueOf(z.dNX()), Integer.valueOf((int)(this.tog.pTN * 100.0D)), this.tog.pcl, Integer.valueOf(i) });
      }
      if (((!com.tencent.mm.plugin.wallet_core.model.r.cPI().cQg()) && (paramBundle != null) && (paramBundle.dNG())) || (!com.tencent.mm.model.r.YI()))
        com.tencent.mm.model.r.YJ();
      if ((this.tog == null) || (this.tog.tAq == null) || (this.tog.tAq.size() <= 0))
        break label804;
      this.tId = this.tog.tAq;
      ab.i("MicroMsg.WalletOrderInfoNewUI", "init data commoditys size: %s", new Object[] { Integer.valueOf(this.tId.size()) });
      this.oXY = ((Orders.Commodity)this.tId.get(0)).cAa;
      this.pVl = ((Orders.Commodity)this.tId.get(0)).cAa;
      if ((this.pVL != null) && (paramBundle != null) && ((paramBundle.dNF()) || (paramBundle.dNG())))
        a(new y(cNH(), 21), true, true);
      label520: ((i)com.tencent.mm.kernel.g.K(i.class)).g(this);
      label536: initView();
      this.tEX = dOD();
      cRo();
      if ((this.pVL != null) && (this.pVL.cIf == 46))
      {
        ab.i("MicroMsg.WalletOrderInfoNewUI", "early send result");
        localuv = new uv();
        paramBundle = new Intent();
        paramBundle.putExtras(this.mBundle);
        if (this.tog != null)
          paramBundle.putExtra("key_total_fee", this.tog.pTN);
        if (this.tEX != null)
          paramBundle.putExtra("key_is_clear_failure", this.tEX.mqu.getInt("key_is_clear_failure", -1));
        localuv.cRF.intent = paramBundle;
        localuv.cRF.cRH = 1;
        localuv.cRF.czZ = cNH();
        localObject = localuv.cRF;
        if (!paramBundle.getBooleanExtra("intent_pay_end", false))
          break label880;
      }
    }
    label787: label792: label798: label804: label842: label880: for (int i = -1; ; i = 0)
    {
      ((uv.a)localObject).result = i;
      com.tencent.mm.sdk.b.a.xxA.m(localuv);
      if ((this.tog == null) || (this.tog.tAO == null) || (this.tog.tAO.tBL != 1))
        break label885;
      ab.i("MicroMsg.WalletOrderInfoNewUI", "simple cashier");
      cRH();
      AppMethodBeat.o(47452);
      return;
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
      break;
      i = 1;
      break label220;
      bool2 = false;
      break label248;
      k = 2;
      break label255;
      ab.c("MicroMsg.WalletOrderInfoNewUI", "mOrders info is Illegal!", new Object[0]);
      com.tencent.mm.ui.base.h.a(this.mController.ylL, 2131305049, 0, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(47444);
          WalletOrderInfoNewUI.this.done();
          AppMethodBeat.o(47444);
        }
      });
      break label520;
      ab.c("MicroMsg.WalletOrderInfoNewUI", "mOrders info is Illegal!", new Object[0]);
      com.tencent.mm.ui.base.h.a(this.mController.ylL, 2131305049, 0, new WalletOrderInfoNewUI.19(this));
      break label536;
    }
    label885: nf(1979);
    nf(2948);
    nf(2710);
    com.tencent.mm.sdk.b.a.xxA.c(this.tIy);
    com.tencent.mm.sdk.b.a.xxA.c(this.pap);
    this.pSR.dnU();
    this.tEW = true;
    if (this.pVL == null)
    {
      i = 0;
      label950: if (this.pVL != null)
        break label989;
    }
    label989: for (paramBundle = ""; ; paramBundle = this.pVL.czZ)
    {
      ad.e(i, paramBundle, 16, "");
      AppMethodBeat.o(47452);
      break;
      i = this.pVL.cIf;
      break label950;
    }
  }

  @Deprecated
  public Dialog onCreateDialog(int paramInt)
  {
    AppMethodBeat.i(47463);
    Dialog localDialog = com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131305064), getResources().getStringArray(2131755065), "", new h.c()
    {
      public final void iE(int paramAnonymousInt)
      {
        AppMethodBeat.i(47433);
        switch (paramAnonymousInt)
        {
        default:
        case 0:
        }
        while (true)
        {
          AppMethodBeat.o(47433);
          return;
          Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + WalletOrderInfoNewUI.u(WalletOrderInfoNewUI.this)));
          localIntent.addFlags(268435456);
          WalletOrderInfoNewUI.this.startActivity(localIntent);
        }
      }
    });
    AppMethodBeat.o(47463);
    return localDialog;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47468);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.xxA.d(this.tIy);
    com.tencent.mm.sdk.b.a.xxA.d(this.pap);
    ng(1979);
    ng(2948);
    ng(2710);
    this.pSR.dead();
    if (WalletSuccPageAwardWidget.a(this.pSK))
      this.pSL.onDestroy();
    AppMethodBeat.o(47468);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(47467);
    boolean bool;
    if (paramInt == 4)
    {
      done();
      bool = true;
      AppMethodBeat.o(47467);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(47467);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(47453);
    super.onResume();
    ab.i("MicroMsg.WalletOrderInfoNewUI", "onResume, isFirstInit: %s activityPromotions: %s, isClickTinyappActivity: %s, isClickActivity: %s, recommendTinyAppInfo: %s, exposureInfo: %s", new Object[] { Boolean.valueOf(this.tEW), this.tIg, Boolean.valueOf(this.tEU), Boolean.valueOf(this.tEV), this.tIe, this.pSK });
    if (WalletSuccPageAwardWidget.a(this.pSK))
    {
      this.pSL.onResume();
      AppMethodBeat.o(47453);
    }
    while (true)
    {
      return;
      if (this.tEW)
      {
        this.tEW = false;
        AppMethodBeat.o(47453);
      }
      else if ((this.tIg != null) && (this.tEV))
      {
        ab.i("MicroMsg.WalletOrderInfoNewUI", "do query payAward, queryAwardStatusParams==null: %s %s, isCallQueryPayAward: %s", new Object[] { Boolean.valueOf(bo.isNullOrNil(this.tIg.tBv)), this.tIg.tBv, Boolean.valueOf(this.tIx) });
        if (this.tIx)
        {
          AppMethodBeat.o(47453);
        }
        else
        {
          this.tIx = true;
          if (bo.isNullOrNil(this.tIg.tBv))
          {
            a(new aa(this.tIg.ttW, this.tIg.tBp, this.tIg.tzP, this.tIg.tzQ, cNH(), this.pVl, this.tIg.tzR), true, true);
            AppMethodBeat.o(47453);
          }
          else
          {
            a(new k(this.tIg.tBv, this.tIg.ttW), true, true);
            AppMethodBeat.o(47453);
          }
        }
      }
      else
      {
        if ((this.tEU) && (this.tIe != null))
          a(new aa(this.tIe.tBx, this.tIe.tBz, this.tIe.tBA, this.tIe.tBB, cNH(), this.pVl, this.tIe.tBC), true, true);
        AppMethodBeat.o(47453);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI
 * JD-Core Version:    0.6.2
 */