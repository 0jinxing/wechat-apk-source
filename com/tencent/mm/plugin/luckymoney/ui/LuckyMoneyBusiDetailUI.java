package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.hq;
import com.tencent.mm.plugin.luckymoney.model.af;
import com.tencent.mm.plugin.luckymoney.model.am;
import com.tencent.mm.plugin.luckymoney.model.ar;
import com.tencent.mm.plugin.luckymoney.model.as;
import com.tencent.mm.plugin.luckymoney.model.w;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class LuckyMoneyBusiDetailUI extends LuckyMoneyBaseUI
{
  private int Lp;
  private View abB;
  private boolean hZu;
  private TextView kEq;
  private TextView kGq;
  private View kZq;
  private TextView nSD;
  private ListView nSL;
  private ImageView nSM;
  private TextView nSN;
  private View nSP;
  private View nSQ;
  AbsListView.OnScrollListener nSS;
  private List<w> nSx;
  private TextView nsq;
  private LuckyMoneyWishFooter ocC;
  private ImageView ocD;
  private View ocE;
  private ImageView ocF;
  private boolean ocG;
  private int ocH;
  private String ocI;
  private String ocJ;
  private String ocK;
  private String ocL;
  private int ocM;
  private Map<String, Integer> ocN;
  private i ocO;
  private String ocP;
  private boolean ocQ;

  public LuckyMoneyBusiDetailUI()
  {
    AppMethodBeat.i(42597);
    this.Lp = 0;
    this.ocG = true;
    this.hZu = false;
    this.ocM = 0;
    this.nSx = new LinkedList();
    this.ocN = new HashMap();
    this.ocP = "";
    this.ocQ = false;
    this.nSS = new LuckyMoneyBusiDetailUI.1(this);
    AppMethodBeat.o(42597);
  }

  private void a(com.tencent.mm.plugin.luckymoney.model.k paramk)
  {
    AppMethodBeat.i(42605);
    if (paramk == null)
      AppMethodBeat.o(42605);
    while (true)
    {
      return;
      if (paramk.nXa == 1);
      LinkedList localLinkedList;
      for (boolean bool = true; ; bool = false)
      {
        this.ocG = bool;
        if (this.Lp == 0)
        {
          this.ocJ = paramk.nWX;
          this.ocO.nSy = this.ocJ;
          this.ocO.nSA = paramk.nXi;
          b(paramk);
          d(paramk);
          com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(xW(paramk.nXi)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
        }
        c(paramk);
        localLinkedList = paramk.nXj;
        if (localLinkedList == null)
          break label268;
        for (int i = 0; i < localLinkedList.size(); i++)
        {
          w localw = (w)localLinkedList.get(i);
          if (!this.ocN.containsKey(localw.nWX))
          {
            this.nSx.add(localLinkedList.get(i));
            this.ocN.put(localw.nWX, Integer.valueOf(1));
          }
        }
      }
      this.Lp += localLinkedList.size();
      this.hZu = false;
      this.ocO.ck(this.nSx);
      label268: eW(paramk.nXh, paramk.nXk);
      com.tencent.mm.plugin.report.service.h.pYm.e(13051, new Object[] { Integer.valueOf(this.ocM), Integer.valueOf(1), paramk.nXh, x.cl(paramk.nXe), "", "", "", "", paramk.nWQ, Integer.valueOf(paramk.resourceId) });
      AppMethodBeat.o(42605);
    }
  }

  private void b(com.tencent.mm.plugin.luckymoney.model.k paramk)
  {
    AppMethodBeat.i(42606);
    AppCompatActivity localAppCompatActivity;
    if (paramk != null)
    {
      localAppCompatActivity = this.mController.ylL;
      if (paramk.nXi == 2)
      {
        this.nSM.setImageResource(2130839243);
        if (paramk.resourceId != 0)
        {
          ab.i("MicroMsg.LuckyMoneyDetailUI", "busi logo load from file:" + paramk.resourceId);
          hq localhq = new hq();
          localhq.cCx.cCz = paramk.resourceId;
          localhq.callback = new LuckyMoneyBusiDetailUI.3(this, localhq, paramk);
          com.tencent.mm.sdk.b.a.xxA.a(localhq, Looper.myLooper());
        }
      }
    }
    label259: label275: label413: label427: 
    while (true)
    {
      x.a(localAppCompatActivity, this.nSN, paramk.nWQ);
      x.a(localAppCompatActivity, this.nsq, paramk.nSd);
      if ((paramk.cRV == 2) && (this.ocH != 3))
      {
        this.nSD.setText(com.tencent.mm.wallet_core.ui.e.F(paramk.cSh / 100.0D));
        if (paramk.nWY != 1)
        {
          this.ocO.nSz = true;
          label183: this.nSP.setVisibility(0);
          label191: if (bo.isNullOrNil(paramk.nUj))
            break label393;
          this.nSQ.setVisibility(0);
          this.kGq.setText(paramk.nUj);
          if (paramk.nUh != 1)
            break label365;
          if ((TextUtils.isEmpty(paramk.nUi)) || (paramk.nUi.startsWith("weixin://wxpay")))
            break label353;
          this.ocD.setVisibility(0);
          this.kGq.setOnClickListener(new LuckyMoneyBusiDetailUI.4(this, paramk));
          if (bo.isNullOrNil(paramk.nXb))
            break label413;
          this.kEq.setText(paramk.nXb);
          AppMethodBeat.o(42606);
        }
      }
      while (true)
      {
        return;
        if (bo.isNullOrNil(paramk.nWR))
          break label427;
        x.b(this.nSM, paramk.nWR, paramk.nXl);
        break;
        this.ocO.nSz = false;
        break label183;
        this.nSP.setVisibility(8);
        break label191;
        label353: this.ocD.setVisibility(8);
        break label259;
        label365: ab.e("MicroMsg.LuckyMoneyDetailUI", "detail.jumpChange is false");
        this.kGq.setTextColor(getResources().getColor(2131690252));
        break label275;
        ab.e("MicroMsg.LuckyMoneyDetailUI", "detail.changeWording is empty");
        this.nSQ.setVisibility(8);
        break label275;
        this.kEq.setText(null);
        AppMethodBeat.o(42606);
      }
    }
  }

  private void bMr()
  {
    AppMethodBeat.i(42604);
    this.hZu = true;
    if ((this.Lp > 0) && (this.nSx.size() > 0) && (this.nSx.get(this.nSx.size() - 1) != null))
    {
      n(new af(this.ocI, this.Lp, this.ocK, bo.getLong(((w)this.nSx.get(this.nSx.size() - 1)).nXN, 0L), "v1.0", this.ocP));
      AppMethodBeat.o(42604);
    }
    while (true)
    {
      return;
      this.ocP = "";
      n(new af(this.ocI, 11, this.Lp, this.ocK, "v1.0", this.ocP));
      AppMethodBeat.o(42604);
    }
  }

  private void bMs()
  {
    AppMethodBeat.i(42608);
    new DisplayMetrics();
    Object localObject = ah.getContext().getResources().getDisplayMetrics();
    if (localObject == null)
      AppMethodBeat.o(42608);
    while (true)
    {
      return;
      int i = (int)((((DisplayMetrics)localObject).widthPixels - getResources().getDimensionPixelSize(2131428482) * 2 - getResources().getDimensionPixelSize(2131428481) * 2) * 0.75F);
      localObject = this.ocF.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = i;
      this.ocF.setLayoutParams((ViewGroup.LayoutParams)localObject);
      AppMethodBeat.o(42608);
    }
  }

  private void bMt()
  {
    AppMethodBeat.i(42611);
    if ((this.ocC != null) && (this.ocC.getVisibility() != 8))
      this.ocC.setVisibility(8);
    AppMethodBeat.o(42611);
  }

  private void c(com.tencent.mm.plugin.luckymoney.model.k paramk)
  {
    AppMethodBeat.i(42609);
    if (paramk == null)
    {
      AppMethodBeat.o(42609);
      return;
    }
    int i;
    label58: int j;
    label91: TextView localTextView1;
    label215: TextView localTextView2;
    if (((paramk.cRU == 3) || (paramk.cRU == 2)) && (paramk.nWZ == 1) && (!this.ocG) && (paramk.nXc == 1))
    {
      i = 1;
      if ((paramk.nXd == null) || (paramk.nXd.erD != 1) || (bo.isNullOrNil(paramk.nXd.nWy)))
        break label311;
      j = 1;
      localTextView1 = (TextView)this.kZq.findViewById(2131825392);
      if ((i == 0) && (j == 0))
        break label316;
      localTextView1.setOnClickListener(new LuckyMoneyBusiDetailUI.5(this, paramk));
      if (j != 0)
      {
        this.ocL = paramk.nXd.nWy;
        localTextView1.setText(paramk.nXd.nWz);
      }
      com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(xW(paramk.nXi)), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2) });
      localTextView1.setVisibility(0);
      localTextView2 = (TextView)this.kZq.findViewById(2131825393);
      if ((this.ocH == 1) || (this.ocH == 3) || (localTextView1.getVisibility() == 0))
        break label326;
      localTextView2.setOnClickListener(new LuckyMoneyBusiDetailUI.6(this, paramk));
      localTextView2.setVisibility(0);
    }
    while (true)
    {
      if (!this.ocQ)
      {
        this.nSL.addFooterView(this.kZq);
        this.ocQ = true;
      }
      AppMethodBeat.o(42609);
      break;
      i = 0;
      break label58;
      label311: j = 0;
      break label91;
      label316: localTextView1.setVisibility(8);
      break label215;
      label326: localTextView2.setVisibility(8);
    }
  }

  private void d(com.tencent.mm.plugin.luckymoney.model.k paramk)
  {
    AppMethodBeat.i(42610);
    if (paramk != null)
    {
      LinkedList localLinkedList = paramk.nXe;
      if ((localLinkedList != null) && (localLinkedList.size() > 0))
      {
        View localView1 = this.abB.findViewById(2131825406);
        View localView2 = this.abB.findViewById(2131825409);
        View localView3 = this.abB.findViewById(2131825412);
        ViewGroup localViewGroup1 = (ViewGroup)this.abB.findViewById(2131825407);
        ViewGroup localViewGroup2 = (ViewGroup)this.abB.findViewById(2131825410);
        ViewGroup localViewGroup3 = (ViewGroup)this.abB.findViewById(2131825413);
        localObject1 = this.abB.findViewById(2131825408);
        View localView4 = this.abB.findViewById(2131825411);
        localObject2 = new h.c();
        ((h.c)localObject2).textColor = getResources().getColor(2131690229);
        ((h.c)localObject2).ogL = true;
        ((h.c)localObject2).resourceId = paramk.resourceId;
        ((h.c)localObject2).ogM = this.ocM;
        if (localLinkedList.size() > 0)
        {
          h.a(this, localViewGroup1, (as)localLinkedList.get(0), (h.c)localObject2);
          localView1.setVisibility(0);
        }
        if (localLinkedList.size() > 1)
        {
          h.a(this, localViewGroup2, (as)localLinkedList.get(1), (h.c)localObject2);
          localView2.setVisibility(0);
        }
        if (localLinkedList.size() > 2)
        {
          h.a(this, localViewGroup3, (as)localLinkedList.get(2), (h.c)localObject2);
          localView3.setVisibility(0);
        }
        if ((localView1.getVisibility() == 0) && ((localView2.getVisibility() == 0) || (localView3.getVisibility() == 0)))
          ((View)localObject1).setVisibility(0);
        if ((localView2.getVisibility() == 0) && (localView3.getVisibility() == 0))
          localView4.setVisibility(0);
        if ((localView1.getVisibility() == 0) || (localView2.getVisibility() == 0) || (localView3.getVisibility() == 0))
        {
          this.ocE.requestLayout();
          this.ocE.setVisibility(0);
        }
      }
      Object localObject2 = (ViewGroup)this.kZq.findViewById(2131825394);
      Object localObject1 = new h.c();
      ((h.c)localObject1).textColor = getResources().getColor(2131690229);
      ((h.c)localObject1).textSize = getResources().getDimensionPixelSize(2131427864);
      h.a(this, (ViewGroup)localObject2, paramk.nXf, (h.c)localObject1);
    }
    AppMethodBeat.o(42610);
  }

  private void eW(String paramString1, String paramString2)
  {
    AppMethodBeat.i(42607);
    this.ocF.setImageResource(2130839242);
    if (bo.isNullOrNil(paramString1))
    {
      ab.i("MicroMsg.LuckyMoneyDetailUI", "renderAdImage: no adImage");
      this.ocF.setVisibility(8);
      AppMethodBeat.o(42607);
    }
    while (true)
    {
      return;
      bMs();
      x.a(this.ocF, paramString1, paramString2);
      this.ocF.setVisibility(0);
      AppMethodBeat.o(42607);
    }
  }

  public static void fixBackgroundRepeat(View paramView)
  {
    AppMethodBeat.i(42599);
    if (paramView == null)
      AppMethodBeat.o(42599);
    while (true)
    {
      return;
      paramView = paramView.getBackground();
      if (paramView == null)
      {
        AppMethodBeat.o(42599);
      }
      else if (!(paramView instanceof BitmapDrawable))
      {
        AppMethodBeat.o(42599);
      }
      else
      {
        paramView = (BitmapDrawable)paramView;
        paramView.mutate();
        paramView.setTileModeX(Shader.TileMode.REPEAT);
        AppMethodBeat.o(42599);
      }
    }
  }

  private static int xW(int paramInt)
  {
    if (paramInt == 2);
    for (paramInt = 13; ; paramInt = 7)
      return paramInt;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(42601);
    if ((paramm instanceof af))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramm = (af)paramm;
        paramString = paramm.nYn;
        this.ocP = paramm.nYz;
        a(paramString);
        AppMethodBeat.o(42601);
        bool = true;
      }
    while (true)
    {
      return bool;
      com.tencent.mm.ui.base.h.bQ(this, paramString);
      AppMethodBeat.o(42601);
      bool = true;
      continue;
      if ((paramm instanceof am))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.ui.base.h.bQ(this, getString(2131300520));
          this.ocO.nSz = false;
          bMt();
          paramm = (am)paramm;
          if (this.nSx != null);
          for (paramInt1 = 0; ; paramInt1++)
            if (paramInt1 < this.nSx.size())
            {
              paramString = (w)this.nSx.get(paramInt1);
              if (paramString.nWX.equalsIgnoreCase(paramm.nWX))
              {
                paramString.nYb = paramm.nSd;
                this.ocO.notifyDataSetChanged();
              }
            }
            else
            {
              AppMethodBeat.o(42601);
              bool = true;
              break;
            }
        }
        com.tencent.mm.ui.base.h.bQ(this, paramString);
        AppMethodBeat.o(42601);
        bool = true;
      }
      else if ((paramm instanceof ar))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.ui.base.h.bQ(this, getString(2131300520));
          AppMethodBeat.o(42601);
          bool = true;
        }
        else
        {
          com.tencent.mm.ui.base.h.bQ(this, paramString);
          AppMethodBeat.o(42601);
          bool = true;
        }
      }
      else
      {
        AppMethodBeat.o(42601);
      }
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(42600);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (this.ocC.getVisibility() == 0))
    {
      this.ocC.setVisibility(8);
      bool = true;
      AppMethodBeat.o(42600);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(42600);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(42603);
    if (getIntent().hasExtra("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)getIntent().getParcelableExtra("key_realname_guide_helper");
      Bundle localBundle = new Bundle();
      localBundle.putString("realname_verify_process_jump_plugin", "luckymoney");
      localBundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiDetailUI");
      boolean bool = localRealnameGuideHelper.b(this, localBundle, new LuckyMoneyBusiDetailUI.2(this));
      getIntent().removeExtra("key_realname_guide_helper");
      if (!bool)
        super.finish();
      AppMethodBeat.o(42603);
    }
    while (true)
    {
      return;
      super.finish();
      AppMethodBeat.o(42603);
    }
  }

  public final int getLayoutId()
  {
    return 2130969970;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(42602);
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(42602);
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        String str = paramIntent.getStringExtra("Select_Conv_User");
        if (!bo.isNullOrNil(str))
          if ((this.ocL != null) && (this.ocL.startsWith("wxpay://c2cbizmessagehandler/hongbao/festivalhongbao")))
            ab.i("MicroMsg.LuckyMoneyDetailUI", "Not expected branch since 2015 fesitval");
          else
            n(new ar(str.replaceAll(",", "|"), this.ocI, "v1.0"));
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42598);
    super.onCreate(paramBundle);
    this.nSL = ((ListView)findViewById(2131825416));
    this.ocO = new i(this.mController.ylL);
    this.abB = LayoutInflater.from(this).inflate(2130969969, null);
    this.nSL.addHeaderView(this.abB);
    this.nSL.setAdapter(this.ocO);
    this.abB.setOnClickListener(new LuckyMoneyBusiDetailUI.7(this));
    this.nSL.setOnScrollListener(this.nSS);
    this.nSL.setOnItemClickListener(new LuckyMoneyBusiDetailUI.8(this));
    this.kZq = LayoutInflater.from(this).inflate(2130969968, null);
    this.nSM = ((ImageView)this.abB.findViewById(2131825397));
    this.nSN = ((TextView)this.abB.findViewById(2131825398));
    this.nsq = ((TextView)this.abB.findViewById(2131825399));
    this.nSP = this.abB.findViewById(2131825400);
    this.nSD = ((TextView)this.abB.findViewById(2131825401));
    this.nSQ = this.abB.findViewById(2131825402);
    this.kGq = ((TextView)this.abB.findViewById(2131825404));
    this.ocD = ((ImageView)this.abB.findViewById(2131825403));
    this.kEq = ((TextView)this.abB.findViewById(2131825414));
    this.ocE = this.abB.findViewById(2131825405);
    this.ocF = ((ImageView)this.abB.findViewById(2131825396));
    paramBundle = (ImageView)findViewById(2131825415);
    this.ocC = ((LuckyMoneyWishFooter)findViewById(2131825418));
    this.ocC.a(new LuckyMoneyBusiDetailUI.9(this));
    this.ocC.setOnWishSendImp(new LuckyMoneyBusiDetailUI.10(this));
    this.ocC.post(new LuckyMoneyBusiDetailUI.11(this));
    this.ocC.setOnkbdStateListener(new LuckyMoneyBusiDetailUI.12(this));
    this.ocO.ohU = new LuckyMoneyBusiDetailUI.13(this);
    Object localObject = this.ocO;
    ((i)localObject).ohV = new i.a((i)localObject);
    this.ocC.setMaxLength(25);
    paramBundle.setOnClickListener(new LuckyMoneyBusiDetailUI.14(this));
    fixBackgroundRepeat(findViewById(2131825417));
    this.ocI = getIntent().getStringExtra("key_sendid");
    this.ocK = getIntent().getStringExtra("key_native_url");
    this.ocH = getIntent().getIntExtra("key_jump_from", 2);
    this.ocM = getIntent().getIntExtra("key_static_from_scene", 0);
    ab.i("MicroMsg.LuckyMoneyDetailUI", "initData: sendid=%s , nativeurl=%s, jumpFrom=%d", new Object[] { this.ocI, this.ocK, Integer.valueOf(this.ocH) });
    if (this.ocH == 2);
    while (true)
    {
      try
      {
        paramBundle = getIntent().getByteArrayExtra("key_detail_info");
        if (paramBundle != null)
        {
          localObject = new com/tencent/mm/plugin/luckymoney/model/k;
          ((com.tencent.mm.plugin.luckymoney.model.k)localObject).<init>();
          paramBundle = (com.tencent.mm.plugin.luckymoney.model.k)((com.tencent.mm.plugin.luckymoney.model.k)localObject).parseFrom(paramBundle);
          if (paramBundle != null)
          {
            a(paramBundle);
            if (getIntent().getBooleanExtra("play_sound", false))
              k.a(this, k.a.oiu);
            AppMethodBeat.o(42598);
            return;
          }
        }
      }
      catch (Exception paramBundle)
      {
        ab.w("MicroMsg.LuckyMoneyDetailUI", "initData: parse LuckyMoneyDetail fail!" + paramBundle.getLocalizedMessage());
      }
      if ((bo.isNullOrNil(this.ocI)) && (!bo.isNullOrNil(this.ocK)))
        paramBundle = Uri.parse(this.ocK);
      try
      {
        this.ocI = paramBundle.getQueryParameter("sendid");
        if (!bo.isNullOrNil(this.ocI))
          bMr();
      }
      catch (Exception paramBundle)
      {
        while (true)
          ab.w("MicroMsg.LuckyMoneyDetailUI", "initData: parse uri exp:" + paramBundle.getLocalizedMessage());
        ab.w("MicroMsg.LuckyMoneyDetailUI", "sendid null or nil, finish");
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42612);
    super.onDestroy();
    if (this.ocC != null)
      this.ocC.bMO();
    AppMethodBeat.o(42612);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiDetailUI
 * JD-Core Version:    0.6.2
 */