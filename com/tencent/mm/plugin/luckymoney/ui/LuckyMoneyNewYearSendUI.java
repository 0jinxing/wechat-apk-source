package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.g.b.a.l;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.luckymoney.model.ag;
import com.tencent.mm.plugin.luckymoney.model.al;
import com.tencent.mm.plugin.luckymoney.model.ao;
import com.tencent.mm.plugin.luckymoney.model.ap;
import com.tencent.mm.plugin.luckymoney.model.u;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.pluginsdk.ui.ChatFooterPanel;
import com.tencent.mm.pluginsdk.ui.chat.e.b;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.k;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

@com.tencent.mm.ui.base.a(3)
public class LuckyMoneyNewYearSendUI extends LuckyMoneyBaseUI
{
  public static int mState;
  public static int ogj = 0;
  private int cKs;
  private Dialog gII;
  private View.OnClickListener gKK;
  private EmojiInfo kZa;
  private Button leS;
  private ak mHandler;
  private String nYD;
  private int nYF;
  private int nYM;
  private LinkedList<u> nYP;
  private TextView nsq;
  private int obG;
  private String obK;
  private int obL;
  private String ocI;
  private a odS;
  private View odT;
  private ChatFooterPanel odY;
  private ViewGroup oea;
  private int oef;
  private View ofJ;
  private View ofK;
  private TextView ofL;
  private ImageView ofM;
  private TextView ofN;
  private ImageView ofO;
  private ImageView ofP;
  private TextView ofQ;
  private LinearLayout ofR;
  private MMAnimateView ofS;
  private LinearLayout ofT;
  private String ofU;
  private boolean ofV;
  private int ofW;
  private int ofX;
  private EmojiInfo ofY;
  private l ofZ;
  private LuckyMoneyAutoScrollView ofi;
  private TextView ofj;
  private ImageView ofw;
  private View ofx;
  private BaseEmojiView ofy;
  private com.tencent.mm.g.b.a.m oga;
  private int ogb;
  private int ogc;
  private int ogd;
  private int oge;
  private int ogf;
  private int ogg;
  private long ogh;
  private String ogi;
  private int ogk;
  private com.tencent.mm.emoji.d.a ogl;
  private String ogm;

  public LuckyMoneyNewYearSendUI()
  {
    AppMethodBeat.i(42823);
    this.gII = null;
    this.ofV = true;
    this.ofW = 0;
    this.nYM = 0;
    this.ofX = 0;
    this.mHandler = new ak();
    this.ogb = 1;
    this.oef = 0;
    this.ogc = 0;
    this.ogd = 0;
    this.oge = 0;
    this.ogf = 0;
    this.ogg = 0;
    this.ogh = 0L;
    this.ocI = "";
    this.ogi = "";
    this.gKK = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(42813);
        if (paramAnonymousView.getId() == 2131825576)
        {
          com.tencent.mm.plugin.report.service.h.pYm.e(13079, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
          ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "mSendBtn click!");
          LuckyMoneyNewYearSendUI.b(LuckyMoneyNewYearSendUI.this);
          AppMethodBeat.o(42813);
        }
        while (true)
        {
          return;
          if (paramAnonymousView.getId() == 2131825577)
          {
            LuckyMoneyNewYearSendUI.this.finish();
            com.tencent.mm.plugin.report.service.h.pYm.e(13079, new Object[] { Integer.valueOf(6), Integer.valueOf(1) });
            LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, new l());
            LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this).cVT = 11L;
            LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this).ajK();
            LuckyMoneyNewYearSendUI.d(LuckyMoneyNewYearSendUI.this);
            AppMethodBeat.o(42813);
          }
          else if ((paramAnonymousView.getId() == 2131825563) || (paramAnonymousView.getId() == 2131825564))
          {
            LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, new l());
            LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this).cVT = 3L;
            LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this).ajK();
            LuckyMoneyNewYearSendUI.e(LuckyMoneyNewYearSendUI.this);
            AppMethodBeat.o(42813);
          }
          else if (paramAnonymousView.getId() == 2131825568)
          {
            LuckyMoneyNewYearSendUI.f(LuckyMoneyNewYearSendUI.this);
            LuckyMoneyNewYearSendUI.g(LuckyMoneyNewYearSendUI.this);
            LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, 0);
            com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xPZ, "");
            com.tencent.mm.plugin.report.service.h.pYm.e(13079, new Object[] { Integer.valueOf(3), Integer.valueOf(1) });
            LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, new l());
            LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this).cVT = 5L;
            LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this).ajK();
            AppMethodBeat.o(42813);
          }
          else if (paramAnonymousView.getId() == 2131825575)
          {
            paramAnonymousView = LuckyMoneyNewYearSendUI.h(LuckyMoneyNewYearSendUI.this);
            paramAnonymousView.ocw = false;
            paramAnonymousView.ock.setVisibility(0);
            paramAnonymousView.ocl.setVisibility(0);
            paramAnonymousView.ocm.setVisibility(0);
            paramAnonymousView.ocq.setVisibility(4);
            paramAnonymousView.ocr.setVisibility(4);
            paramAnonymousView.ocs.setVisibility(4);
            LuckyMoneyNewYearSendUI.i(LuckyMoneyNewYearSendUI.this);
            com.tencent.mm.plugin.report.service.h.pYm.e(13079, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
            LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, new l());
            LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this).cVT = 2L;
            LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this).ajK();
            AppMethodBeat.o(42813);
          }
          else if (paramAnonymousView.getId() == 2131825569)
          {
            paramAnonymousView = com.tencent.mm.emoji.d.d.eAh;
            com.tencent.mm.emoji.d.d.eY(LuckyMoneyNewYearSendUI.j(LuckyMoneyNewYearSendUI.this));
            LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, false);
            LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, 4);
            AppMethodBeat.o(42813);
          }
          else
          {
            if (paramAnonymousView.getId() == 2131825567)
              LuckyMoneyNewYearSendUI.e(LuckyMoneyNewYearSendUI.this);
            AppMethodBeat.o(42813);
          }
        }
      }
    };
    this.ogk = 0;
    this.ogl = new LuckyMoneyNewYearSendUI.4(this);
    this.cKs = 0;
    this.ogm = "";
    AppMethodBeat.o(42823);
  }

  private void Qo(String paramString)
  {
    AppMethodBeat.i(42830);
    this.kZa = j.getEmojiStorageMgr().xYn.aqi(paramString);
    this.ofy.setEmojiInfo(this.kZa);
    ye(2);
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xPZ, paramString);
    AppMethodBeat.o(42830);
  }

  private void bMF()
  {
    AppMethodBeat.i(42829);
    this.ofZ = new l();
    this.ofZ.cVT = 10L;
    this.ofZ.ajK();
    this.oef = 2;
    this.odS.show();
    if (bo.gW(this.ofW, 1));
    for (int i = ChatFooterPanel.vhq; ; i = ChatFooterPanel.vhn)
    {
      com.tencent.mm.plugin.luckymoney.ui.a.a.a(this.oea, this.odY, i, new LuckyMoneyNewYearSendUI.7(this));
      AppMethodBeat.o(42829);
      return;
    }
  }

  private void bMG()
  {
    AppMethodBeat.i(42833);
    this.ogc += 1;
    int k;
    if ((this.nYP != null) && (this.nYP.size() > 0))
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RN();
      int i = com.tencent.mm.kernel.a.QF();
      int j = this.nYP.size();
      k = (int)(System.currentTimeMillis() % j);
      k = (new Random(i).nextInt(j) + k) % j;
      ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "genRandomAmountIndex retRand:".concat(String.valueOf(k)));
    }
    while (true)
    {
      this.ofX = k;
      if ((this.ofX >= 0) && (this.ofX < this.nYP.size()))
      {
        this.nYF = ((u)this.nYP.get(this.ofX)).nXX;
        this.nYD = ((u)this.nYP.get(this.ofX)).nXY;
      }
      ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "mSelectIndex:" + this.ofX + " randomAmount:" + this.nYF + " randomWishing:" + this.nYD);
      this.ofi.setFinalText(com.tencent.mm.wallet_core.ui.e.F(this.nYF / 100.0D));
      iM(false);
      this.ofi.setFocusable(false);
      this.ofi.setContentDescription("");
      this.ofi.a(new LuckyMoneyNewYearSendUI.11(this));
      AppMethodBeat.o(42833);
      return;
      ab.e("MicroMsg.LuckyMoneyNewYearSendUI", "genRandomAmountIndex yearMessList is empty!");
      k = -1;
    }
  }

  private void iM(boolean paramBoolean)
  {
    AppMethodBeat.i(42834);
    this.leS.setClickable(paramBoolean);
    if (paramBoolean)
    {
      this.leS.getBackground().mutate().setAlpha(255);
      this.leS.setTextColor(getResources().getColor(2131690248));
      AppMethodBeat.o(42834);
    }
    while (true)
    {
      return;
      this.leS.getBackground().mutate().setAlpha(128);
      this.leS.setTextColor(getResources().getColor(2131690249));
      AppMethodBeat.o(42834);
    }
  }

  private void yd(int paramInt)
  {
    AppMethodBeat.i(42828);
    this.oga = new com.tencent.mm.g.b.a.m();
    this.oga.cVU = paramInt;
    this.oga.cVV = this.ogb;
    this.oga.cVW = this.ogc;
    this.oga.cVX = this.ogd;
    this.oga.cVY = this.oge;
    this.oga.cWb = this.ogf;
    this.oga.cVZ = this.ogg;
    com.tencent.mm.g.b.a.m localm = this.oga;
    if (this.kZa == null);
    for (String str = ""; ; str = this.kZa.Aq())
    {
      localm.eE(str);
      this.oga.ajK();
      AppMethodBeat.o(42828);
      return;
    }
  }

  private void ye(int paramInt)
  {
    AppMethodBeat.i(42831);
    if (ogj != 0)
      paramInt = mState;
    if (bo.gW(this.nYM, 0))
    {
      this.ofw.setVisibility(0);
      this.ofK.setVisibility(8);
      this.ofx.setVisibility(8);
      AppMethodBeat.o(42831);
      return;
    }
    this.ofw.setVisibility(8);
    ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "exchangeExpressionState() state:%s", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(42831);
      break;
      this.ofK.setVisibility(0);
      this.ofL.setText(2131301072);
      this.ofx.setVisibility(8);
      AppMethodBeat.o(42831);
      break;
      this.ofK.setVisibility(8);
      this.ofx.setVisibility(0);
      this.ofO.setVisibility(0);
      this.ofy.setVisibility(8);
      this.ofP.setVisibility(8);
      this.ofQ.setVisibility(8);
      this.ofR.setVisibility(8);
      AppMethodBeat.o(42831);
      break;
      if (this.ofY != null)
      {
        this.ofZ = new l();
        this.ofZ.cVT = 4L;
        this.ofZ.ajK();
      }
      this.ofY = this.kZa;
      if (this.oef == 0)
        if (com.tencent.mm.plugin.emoji.h.b.x(this.kZa))
          this.ogb = 2;
      while (true)
      {
        this.ofK.setVisibility(8);
        this.ofx.setVisibility(0);
        this.ofO.setVisibility(8);
        this.ofy.setVisibility(0);
        this.ofP.setVisibility(0);
        this.ofQ.setVisibility(8);
        this.ofR.setVisibility(8);
        AppMethodBeat.o(42831);
        break;
        if (com.tencent.mm.plugin.emoji.h.b.w(this.kZa))
        {
          this.ogb = 4;
        }
        else
        {
          this.ogb = 3;
          continue;
          if (this.oef == 1)
          {
            this.ogb = 2;
            this.ogd += 1;
          }
          else if (this.oef == 2)
          {
            if (com.tencent.mm.plugin.emoji.h.b.x(this.kZa))
            {
              this.ogb = 2;
              this.ogg += 1;
            }
            else if (com.tencent.mm.plugin.emoji.h.b.w(this.kZa))
            {
              this.ogb = 4;
              this.ogf += 1;
            }
            else
            {
              this.ogb = 3;
              this.oge += 1;
            }
          }
        }
      }
      this.ofK.setVisibility(8);
      this.ofx.setVisibility(0);
      this.ofO.setVisibility(8);
      this.ofy.setVisibility(8);
      this.ofP.setVisibility(8);
      this.ofQ.setVisibility(0);
      this.ofR.setVisibility(8);
      AppMethodBeat.o(42831);
      break;
      this.ofK.setVisibility(8);
      this.ofx.setVisibility(0);
      this.ofO.setVisibility(8);
      this.ofy.setVisibility(8);
      this.ofP.setVisibility(8);
      this.ofQ.setVisibility(8);
      this.ofR.setVisibility(0);
      this.ofS.setImageResource(2131231555);
      AppMethodBeat.o(42831);
      break;
      this.ofK.setVisibility(0);
      this.ofL.setText(2131301142);
      this.ofx.setVisibility(8);
    }
  }

  private void yf(int paramInt)
  {
    AppMethodBeat.i(42832);
    ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "doSend()");
    com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(15), Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(1) });
    if (this.gII != null)
      if (!this.gII.isShowing())
        this.gII.show();
    while (true)
    {
      String str1 = r.Yz();
      String str2 = "";
      int i = 0;
      if (this.kZa != null)
      {
        str2 = this.kZa.Aq();
        i = this.kZa.field_type;
      }
      ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "doSend() mUniqueId:%s userConfirmJump:%s lastPayResult:%s mSendId:%s", new Object[] { this.ogi, Integer.valueOf(paramInt), Integer.valueOf(this.cKs), this.ocI });
      b(new ap(this.nYF, this.nYD, x.Qj(str1), this.ofU, str1, r.YB(), this.obG, str2, i, this.ogi, paramInt, this.cKs, this.ocI), false);
      AppMethodBeat.o(42832);
      return;
      this.gII = com.tencent.mm.wallet_core.ui.g.a(this.mController.ylL, true, new LuckyMoneyNewYearSendUI.10(this));
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(42835);
    ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " netsceneType:" + paramm.getType());
    label370: boolean bool;
    if ((paramm instanceof ag))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (ag)paramm;
        this.nYF = paramString.nYF;
        this.nYD = paramString.nYD;
        this.ofW = paramString.nYL;
        this.nYM = paramString.nYM;
        this.ogi = paramString.few;
        this.nYP = paramString.nYP;
        ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "enableSelfIe is %s", new Object[] { Integer.valueOf(this.ofW) });
        bMG();
        ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:updateView");
        if ((this.nYP != null) && (this.nYP.size() > 0))
        {
          ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:year mess list is valid!");
          this.ofT.setVisibility(0);
          this.nsq.getLayoutParams();
          this.nsq.setTextSize(1, 21.0F);
          this.ofj.setTextSize(1, 15.0F);
          this.ofi.eu(getResources().getDimensionPixelOffset(2131428519), getResources().getDimensionPixelOffset(2131428515));
          paramString = (LinearLayout.LayoutParams)this.ofi.getLayoutParams();
          paramString.topMargin = getResources().getDimensionPixelOffset(2131428502);
          this.ofi.setLayoutParams(paramString);
          this.ofi.invalidate();
          paramString = (LinearLayout.LayoutParams)this.ofT.getLayoutParams();
          paramString.topMargin = getResources().getDimensionPixelOffset(2131428505);
          this.ofT.setLayoutParams(paramString);
          this.ofT.invalidate();
          paramString = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xPZ, "");
          if (!bo.isNullOrNil(paramString))
            break label416;
          ye(0);
          AM(0);
          x.a(this.ofJ, null);
          AppMethodBeat.o(42835);
          bool = true;
        }
      }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:year mess list is not valid!");
      this.ofT.setVisibility(8);
      break;
      label416: Qo(paramString);
      break label370;
      finish();
      label786: 
      do
        while (true)
        {
          AppMethodBeat.o(42835);
          bool = false;
          break;
          if ((paramm instanceof ao))
          {
            if ((this.gII != null) && (this.gII.isShowing()))
              this.gII.dismiss();
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "send hb success!");
              paramm = (ao)paramm;
              this.obK = paramm.nYY;
              paramString = new PayInfo();
              paramString.czZ = paramm.nYX;
              paramString.cIf = 37;
              paramString.cIb = this.obL;
              com.tencent.mm.pluginsdk.wallet.h.a(this, paramString, 1);
              AppMethodBeat.o(42835);
              bool = true;
              break;
            }
            ab.e("MicroMsg.LuckyMoneyNewYearSendUI", "send hb failed!");
            continue;
          }
          if (!(paramm instanceof ap))
            break label786;
          if ((this.gII != null) && (this.gII.isShowing()))
            this.gII.dismiss();
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "send hb success!");
            paramString = (ap)paramm;
            this.obK = paramString.nYY;
            this.ocI = paramString.nSX;
            if (paramString.bLD())
            {
              ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() NetScenePrepareNewYearLuckyMoney show JumpRemind Alert");
              paramString.nYe.a(this, new LuckyMoneyNewYearSendUI.12(this));
              AppMethodBeat.o(42835);
              bool = true;
              break;
            }
            paramm = new PayInfo();
            paramm.czZ = paramString.nYX;
            paramm.cIf = 37;
            paramm.cIb = this.obL;
            com.tencent.mm.pluginsdk.wallet.h.a(this, paramm, 1);
            AppMethodBeat.o(42835);
            bool = true;
            break;
          }
          if (paramInt2 == 268502454)
          {
            com.tencent.mm.ui.base.h.a(this, paramString, "", new LuckyMoneyNewYearSendUI.2(this, paramm));
            AppMethodBeat.o(42835);
            bool = true;
            break;
          }
          ab.e("MicroMsg.LuckyMoneyNewYearSendUI", "send hb failed!");
        }
      while (!(paramm instanceof al));
      AppMethodBeat.o(42835);
      bool = true;
    }
  }

  public final int getLayoutId()
  {
    return 2130969989;
  }

  public final void initView()
  {
    AppMethodBeat.i(42826);
    xE(-839716110);
    AM(8);
    this.ofJ = findViewById(2131825560);
    this.ofj = ((TextView)findViewById(2131825574));
    this.ofi = ((LuckyMoneyAutoScrollView)findViewById(2131825573));
    this.nsq = ((TextView)findViewById(2131825572));
    this.leS = ((Button)findViewById(2131825576));
    this.leS.setOnClickListener(this.gKK);
    ((ImageView)findViewById(2131825577)).setOnClickListener(this.gKK);
    this.ofw = ((ImageView)findViewById(2131825561));
    this.ofK = findViewById(2131825562);
    this.ofL = ((TextView)findViewById(2131825564));
    this.ofM = ((ImageView)findViewById(2131825563));
    this.ofM.setOnClickListener(this.gKK);
    this.ofN = ((TextView)findViewById(2131825564));
    this.ofN.setOnClickListener(this.gKK);
    this.ofx = findViewById(2131825565);
    this.ofy = ((BaseEmojiView)findViewById(2131825567));
    this.ofy.setOnClickListener(this.gKK);
    this.ofP = ((ImageView)findViewById(2131825568));
    this.ofP.setOnClickListener(this.gKK);
    this.ofO = ((ImageView)findViewById(2131825566));
    this.ofQ = ((TextView)findViewById(2131825569));
    this.ofQ.setOnClickListener(this.gKK);
    this.ofR = ((LinearLayout)findViewById(2131825570));
    this.ofS = ((MMAnimateView)findViewById(2131825571));
    this.ofT = ((LinearLayout)findViewById(2131825575));
    this.ofT.setOnClickListener(this.gKK);
    this.odS = new a(this);
    this.odT = getLayoutInflater().inflate(2130969978, null);
    this.odS.setContentView(this.odT, new ViewGroup.LayoutParams(-1, -1));
    this.odT.findViewById(2131825497).setOnClickListener(new LuckyMoneyNewYearSendUI.1(this));
    this.odS.obT = new a.a()
    {
      public final void bMl()
      {
        AppMethodBeat.i(42812);
        LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this);
        AppMethodBeat.o(42812);
      }
    };
    this.oea = ((ViewGroup)this.odT.findViewById(2131825499));
    this.odY = com.tencent.mm.pluginsdk.ui.chat.e.vom.dF(this.mController.ylL);
    com.tencent.mm.plugin.luckymoney.ui.a.a.a(this.odY);
    AppMethodBeat.o(42826);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(42836);
    label38: Object localObject;
    switch (paramInt1)
    {
    default:
      AppMethodBeat.o(42836);
      return;
    case 1:
      if (paramInt2 == -1)
      {
        ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "do pay success!");
        com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(15), Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2) });
        if ((paramIntent == null) || (!paramIntent.hasExtra("key_realname_guide_helper")))
          break label823;
        localObject = (RealnameGuideHelper)paramIntent.getParcelableExtra("key_realname_guide_helper");
        if (localObject == null)
          break label823;
        if (!((RealnameGuideHelper)localObject).b(this, null, new LuckyMoneyNewYearSendUI.3(this)))
          paramInt1 = 1;
      }
      break;
    case 1111:
    }
    while (true)
    {
      label153: if (this.kZa == null)
        ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "dealXmlAddEmojiInfo() mEmojiInfo == null");
      while (true)
      {
        localObject = br.z(this.obK, "msg");
        if (localObject != null)
          break label355;
        ab.e("MicroMsg.LuckyMoneyNewYearSendUI", "luckymoneyNewYearSendUI onActivityResult values is null");
        finish();
        AppMethodBeat.o(42836);
        break;
        paramInt1 = 0;
        break label153;
        try
        {
          int i = this.obK.indexOf("<wcpayinfo>");
          if ((i > 0) && (i < this.obK.length()))
          {
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            x.a((StringBuilder)localObject, this.kZa);
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(this.obK.substring(0, i));
            String str2 = this.obK.substring(i).trim();
            localStringBuilder.append((CharSequence)localObject).append(str2);
            this.obK = localStringBuilder.toString();
          }
          ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "dealXmlAddEmojiInfo() success");
        }
        catch (Exception localException)
        {
          ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "dealXmlAddEmojiInfo() Exception:%s", new Object[] { localException.getMessage() });
        }
      }
      label355: String str1 = (String)localException.get(".msg.appmsg.wcpayinfo.paymsgid");
      if (com.tencent.mm.plugin.luckymoney.b.a.bKN().bKQ().Qh(str1))
      {
        ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "sendLocalMsg() for hb! mMsgXml:%s", new Object[] { this.obK });
        x.E(this.obK, this.ofU, 3);
        label417: if (paramInt1 == 0)
          finish();
        this.ofZ = new l();
        if (this.ogb != 1)
          break label556;
        this.ofZ.cVT = 8L;
        label454: this.ofZ.ajK();
        yd(1);
      }
      while (true)
      {
        str1 = r.Yz();
        if (paramInt2 != -1)
          break label631;
        ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult() resultCode == RESULT_OK");
        this.cKs = 1;
        this.ogm = "";
        paramIntent = new al(this.ocI, this.ogi, 1, str1, bo.nullAsNil(this.ofU));
        com.tencent.mm.kernel.g.RO().eJo.a(paramIntent, 0);
        AppMethodBeat.o(42836);
        break;
        ab.e("MicroMsg.LuckyMoneyNewYearSendUI", "it is a duplicate msg");
        break label417;
        label556: if (this.ogb == 2)
        {
          this.ofZ.cVT = 6L;
          break label454;
        }
        if (this.ogb == 3)
        {
          this.ofZ.cVT = 7L;
          break label454;
        }
        if (this.ogb != 4)
          break label454;
        this.ofZ.cVT = 14L;
        break label454;
        ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "do pay cancel or failed!");
      }
      label631: if (paramIntent != null);
      for (this.cKs = paramIntent.getIntExtra("key_pay_reslut_type", 3); ; this.cKs = 3)
      {
        this.ogm = this.ocI;
        ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult() resultCode != RESULT_OK  payType:%s", new Object[] { Integer.valueOf(this.cKs) });
        paramIntent = new al(this.ocI, this.ogi, this.cKs, str1, bo.nullAsNil(this.ofU));
        break;
        ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "doNetSceneLuckyMoneyReport() data == null");
      }
      if (paramInt2 == -1)
      {
        if (paramIntent != null)
          this.ogh = paramIntent.getLongExtra("key_enter_time", 0L);
        if (!bo.af(this.ogh, 0L))
        {
          ye(4);
          iM(false);
          paramIntent = com.tencent.mm.emoji.d.b.ezV;
          com.tencent.mm.emoji.d.b.a(this.ogh, this.ogl);
          AppMethodBeat.o(42836);
          break label38;
        }
        ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "mTimeEnter == 0L go emoji capture failed!");
        AppMethodBeat.o(42836);
        break label38;
      }
      ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "go emoji capture failed!");
      break;
      label823: paramInt1 = 0;
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(42827);
    yd(2);
    finish();
    AppMethodBeat.o(42827);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42824);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "lucky send ui create");
    this.ofU = getIntent().getStringExtra("key_username");
    this.obG = getIntent().getIntExtra("key_way", 0);
    this.obL = getIntent().getIntExtra("pay_channel", -1);
    if (bo.isNullOrNil(this.ofU))
    {
      ab.w("MicroMsg.LuckyMoneyNewYearSendUI", "name null finish");
      finish();
    }
    initView();
    n(new ag("v1.0", ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xUv, Integer.valueOf(0))).intValue()));
    com.tencent.mm.plugin.report.service.h.pYm.e(13079, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
    AppMethodBeat.o(42824);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42825);
    super.onDestroy();
    if ((this.gII != null) && (this.gII.isShowing()))
      this.gII.dismiss();
    if (this.odY != null)
    {
      ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "commentfooter release");
      this.odY.onPause();
      this.odY.AC();
      this.odY.destroy();
    }
    com.tencent.mm.emoji.d.b localb = com.tencent.mm.emoji.d.b.ezV;
    com.tencent.mm.emoji.d.b.b(this.ogh, this.ogl);
    AppMethodBeat.o(42825);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI
 * JD-Core Version:    0.6.2
 */