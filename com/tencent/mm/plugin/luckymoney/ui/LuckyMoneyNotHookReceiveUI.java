package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.emoji.decode.MMGIFJNIFactory;
import com.tencent.mm.emoji.decode.MMGIFJNIFactory.Companion;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.kernel.i;
import com.tencent.mm.plugin.emoji.model.d.a;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.luckymoney.model.af;
import com.tencent.mm.plugin.luckymoney.model.an;
import com.tencent.mm.plugin.luckymoney.model.aq;
import com.tencent.mm.plugin.luckymoney.model.au;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.luckymoney.model.z;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.protocal.protobuf.atc;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import java.io.IOException;

@i
@com.tencent.mm.ui.base.a(7)
public class LuckyMoneyNotHookReceiveUI extends LuckyMoneyBaseUI
{
  private ViewGroup ius;
  private TextView kGq;
  private d.a kVj;
  private String kWO;
  private EmojiInfo kZa;
  private String mXq;
  private int maxSize;
  private ImageView nSM;
  private TextView nTD;
  Button nTE;
  private View nTF;
  private ImageView nTG;
  private TextView nTH;
  private ImageView nVJ;
  public int nZk;
  aq nZs;
  private TextView nsq;
  private String ocI;
  private String ocK;
  private RelativeLayout odG;
  private BaseEmojiView odH;
  private TextView odI;
  private LinearLayout odJ;
  private MMAnimateView odK;
  private int odX;
  private com.tencent.mm.g.b.a.aa oec;
  private long oes;
  private int oeu;
  private f oev;
  private int oex;
  private LinearLayout ogp;
  private View ogq;
  private ImageView ogr;
  private ImageView ogs;
  private RelativeLayout ogt;
  private com.tencent.mm.plugin.wallet_core.model.ab ogu;
  private String ogv;
  private boolean ogw;
  private int textSize;
  private com.tencent.mm.ui.base.p tipDialog;

  public LuckyMoneyNotHookReceiveUI()
  {
    AppMethodBeat.i(42860);
    this.tipDialog = null;
    this.maxSize = 0;
    this.textSize = 0;
    this.ogu = null;
    this.nZk = 0;
    this.ogw = false;
    this.kVj = new LuckyMoneyNotHookReceiveUI.1(this);
    this.oes = 0L;
    this.oeu = 3;
    this.oex = 0;
    this.oev = new LuckyMoneyNotHookReceiveUI.9(this);
    AppMethodBeat.o(42860);
  }

  private void a(an paraman)
  {
    AppMethodBeat.i(42872);
    com.tencent.mm.plugin.luckymoney.model.k localk = paraman.nYn;
    Object localObject;
    if (localk.cRV == 2)
    {
      localObject = new Intent();
      ((Intent)localObject).setClass(this.mController.ylL, LuckyMoneyBeforeDetailUI.class);
      ((Intent)localObject).putExtra("key_lucky_money_can_received", true);
    }
    while (true)
    {
      try
      {
        ((Intent)localObject).putExtra("key_detail_info", paraman.nYn.toByteArray());
        ((Intent)localObject).putExtra("key_jump_from", 2);
        ((Intent)localObject).putExtra("key_native_url", paraman.cRS);
        ((Intent)localObject).putExtra("key_sendid", paraman.nSX);
        if (com.tencent.mm.m.g.Nu().getInt("PlayCoinSound", 0) > 0)
          ((Intent)localObject).putExtra("play_sound", true);
        if (paraman.nTN != null)
          ((Intent)localObject).putExtra("key_realname_guide_helper", paraman.nTN);
        ((Intent)localObject).putExtra("key_username", getIntent().getStringExtra("key_username"));
        ((Intent)localObject).putExtra("key_emoji_switch", paraman.nYC);
        ((Intent)localObject).putExtra("key_detail_emoji_md5", paraman.nYA);
        ((Intent)localObject).putExtra("key_detail_emoji_type", paraman.nYB);
        startActivity((Intent)localObject);
        finish();
        paraman = new com.tencent.mm.plugin.wallet_core.model.ab();
        paraman.field_mNativeUrl = this.ocK;
        paraman.field_hbType = localk.cRT;
        paraman.field_receiveAmount = localk.cSh;
        paraman.field_receiveTime = System.currentTimeMillis();
        paraman.field_hbStatus = localk.cRU;
        paraman.field_receiveStatus = localk.cRV;
        if (paraman.field_receiveAmount > 0L)
          com.tencent.mm.plugin.wallet_core.model.r.cPF().a(paraman);
        AppMethodBeat.o(42872);
        return;
      }
      catch (IOException localIOException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.LuckyMoneyNotHookReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + localIOException.getLocalizedMessage());
        continue;
      }
      this.nTE.setBackgroundResource(2130839389);
      this.nTE.setText(2131301157);
      this.nTE.setOnClickListener(null);
      this.nTE.setVisibility(8);
      if (!bo.isNullOrNil(localk.nUk))
      {
        this.kGq.setText(localk.nUk);
        this.kGq.setVisibility(0);
      }
      while (true)
      {
        this.nsq.setText(localk.nWO);
        localObject = (RelativeLayout.LayoutParams)this.nTF.getLayoutParams();
        ((RelativeLayout.LayoutParams)localObject).bottomMargin = BackwardSupportUtil.b.b(this.mController.ylL, 30.0F);
        this.nTF.setLayoutParams((ViewGroup.LayoutParams)localObject);
        if ((!com.tencent.mm.model.r.Yz().equals(this.mXq)) && (localk.cRT != 1))
          break label485;
        this.nTF.setVisibility(0);
        this.nTF.setOnClickListener(new LuckyMoneyNotHookReceiveUI.5(this, paraman));
        this.nTG.setVisibility(8);
        AppMethodBeat.o(42872);
        break;
        this.kGq.setVisibility(8);
      }
      label485: this.nTF.setVisibility(8);
      this.nTG.setVisibility(0);
      AppMethodBeat.o(42872);
    }
  }

  private void bLf()
  {
    AppMethodBeat.i(42867);
    if (this.nTE == null)
      AppMethodBeat.o(42867);
    while (true)
    {
      return;
      com.tencent.mm.plugin.normsg.a.b.oTO.Ao(this.nTE.getId());
      Object localObject = ah.getContext().getSharedPreferences(ah.doA(), 0);
      ah.getContext();
      localObject = com.tencent.mm.sdk.platformtools.aa.g((SharedPreferences)localObject);
      if ((localObject != null) && (((String)localObject).length() > 0) && ((((String)localObject).equals("zh_CN")) || (((String)localObject).equals("zh_TW")) || (((String)localObject).equals("zh_HK"))))
      {
        AppMethodBeat.o(42867);
      }
      else
      {
        this.nTE.setBackgroundResource(2130839404);
        this.nTE.setText(2131301160);
        AppMethodBeat.o(42867);
      }
    }
  }

  private int bMH()
  {
    AppMethodBeat.i(42873);
    int i;
    if (com.tencent.mm.model.r.Yz().equals(this.mXq))
    {
      i = 1;
      AppMethodBeat.o(42873);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(42873);
    }
  }

  private void iK(boolean paramBoolean)
  {
    AppMethodBeat.i(42868);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "showEmoji() circle:%s", new Object[] { Boolean.TRUE });
    this.odI.setVisibility(8);
    this.oex = 1;
    if (paramBoolean)
    {
      this.oeu = 3;
      this.kZa = j.getEmojiStorageMgr().xYn.aqi(this.kWO);
      if (this.kZa == null)
        break label197;
      if ((com.tencent.mm.vfs.e.asZ(this.kZa.dve()) <= 0L) && (!this.kZa.xy()) && (!this.kZa.duS()))
        break label230;
      this.odH.setVisibility(0);
      z(this.kZa);
      yg(3);
      AppMethodBeat.o(42868);
    }
    while (true)
    {
      return;
      this.oeu -= 1;
      if (this.oeu != 0)
        break;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "showEmoji() circle fail!");
      this.odJ.setVisibility(8);
      this.odI.setVisibility(0);
      yg(1);
      this.oex = 2;
      AppMethodBeat.o(42868);
      continue;
      label197: this.kZa = new EmojiInfo();
      this.kZa.field_md5 = this.kWO;
      this.kZa.field_type = this.odX;
      label230: if (paramBoolean)
      {
        this.odH.setVisibility(8);
        yg(2);
        this.odJ.setVisibility(0);
        this.odK.setImageResource(2131231555);
        j.bkh().kVj = this.kVj;
      }
      j.bkh().s(this.kZa);
      com.tencent.mm.kernel.g.RO().eJo.a(697, this.oev);
      AppMethodBeat.o(42868);
    }
  }

  private void yg(int paramInt)
  {
    AppMethodBeat.i(42870);
    Object localObject = (LinearLayout.LayoutParams)this.ogp.getLayoutParams();
    switch (paramInt)
    {
    default:
      paramInt = BackwardSupportUtil.b.b(this, 53.0F);
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      ((LinearLayout.LayoutParams)localObject).topMargin = paramInt;
      this.ogp.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.ogp.invalidate();
      localObject = (RelativeLayout.LayoutParams)this.ogt.getLayoutParams();
      ((RelativeLayout.LayoutParams)localObject).topMargin = (paramInt - BackwardSupportUtil.b.b(this, 53.0F));
      this.ogt.setLayoutParams((ViewGroup.LayoutParams)localObject);
      this.ogt.invalidate();
      AppMethodBeat.o(42870);
      return;
      paramInt = BackwardSupportUtil.b.b(this, 113.0F);
      continue;
      paramInt = BackwardSupportUtil.b.b(this, 97.0F);
      continue;
      com.tencent.mm.emoji.decode.b localb = MMGIFJNIFactory.Companion.getDecoder(this.kZa);
      int i = (int)(localb.Ov() * this.odH.getEmojiDensityScale());
      localb.destroy();
      paramInt = BackwardSupportUtil.b.b(this, 150.0F);
      if ((i >= paramInt) || (bo.gW(i, 0)))
      {
        paramInt = BackwardSupportUtil.b.b(this, 53.0F);
      }
      else
      {
        int j = BackwardSupportUtil.b.b(this, 53.0F);
        paramInt = (paramInt - i) / 2 + j;
      }
    }
  }

  private static int yh(int paramInt)
  {
    int i = 1;
    if (paramInt == 1)
      paramInt = i;
    while (true)
    {
      return paramInt;
      if (paramInt == 0)
        paramInt = 2;
      else
        paramInt = 0;
    }
  }

  private void z(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(42869);
    this.oex = 4;
    this.odH.setEmojiInfo(paramEmojiInfo);
    this.ogs.setVisibility(0);
    this.oec = new com.tencent.mm.g.b.a.aa();
    this.oec.cVT = 8L;
    this.oec.ajK();
    AppMethodBeat.o(42869);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(42871);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "onSceneEnd() errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " netsceneType:" + paramm.getType());
    boolean bool;
    if ((paramm instanceof aq))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.nZs = ((aq)paramm);
        this.nZk = this.nZs.nZk;
        com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(5), Integer.valueOf(yh(this.nZs.cRT)), Integer.valueOf(bMH()), Integer.valueOf(0), Integer.valueOf(1) });
        paramString = new com.tencent.mm.plugin.wallet_core.model.ab();
        paramString.field_mNativeUrl = this.ocK;
        paramString.field_hbType = this.nZs.cRT;
        paramString.field_hbStatus = this.nZs.cRU;
        paramString.field_receiveStatus = this.nZs.cRV;
        com.tencent.mm.plugin.wallet_core.model.r.cPF().a(paramString);
        if (this.nZs.cRV == 2)
        {
          b(new af(this.ocI, 11, 0, this.ocK, "v1.0"), false);
          bool = true;
          AppMethodBeat.o(42871);
        }
      }
    while (true)
    {
      return bool;
      if (!bo.isNullOrNil(this.nZs.nYA))
      {
        this.oec = new com.tencent.mm.g.b.a.aa();
        this.oec.cVT = 7L;
        this.oec.ajK();
      }
      x.b(this.nSM, this.nZs.nWR, this.nZs.nXl);
      x.a(this.mController.ylL, this.nTD, getString(2131301215, new Object[] { this.nZs.nZg }));
      this.ogp.post(new LuckyMoneyNotHookReceiveUI.10(this));
      if ((this.nZs.cRV != 1) && (this.nZs.cRU != 4) && (this.nZs.cRU != 5) && (this.nZs.cRU != 1))
      {
        if (!bo.isNullOrNil(this.nZs.nWO))
        {
          this.kGq.setText(this.nZs.nWO);
          this.kGq.setVisibility(0);
        }
        if (!bo.isNullOrNil(this.nZs.nSd))
        {
          x.a(this.mController.ylL, this.nsq, this.nZs.nSd);
          this.nsq.setVisibility(0);
          this.kGq.setVisibility(8);
        }
        if ((!bo.isNullOrNil(this.nZs.nYA)) && (bo.gW(this.nZk, 1)))
        {
          paramString = (LinearLayout.LayoutParams)this.ogp.getLayoutParams();
          paramString.topMargin = BackwardSupportUtil.b.b(this.mController.ylL, 53.0F);
          this.ogp.setLayoutParams(paramString);
          this.kWO = this.nZs.nYA;
          this.odX = this.nZs.nYB;
          this.odG.setVisibility(0);
          iK(true);
          label604: this.nTE.setOnClickListener(new LuckyMoneyNotHookReceiveUI.11(this));
          bool = false;
          if ((!com.tencent.mm.model.r.Yz().equals(this.mXq)) && ((this.nZs.cRT != 1) || (!bool)))
            break label1325;
          if (this.nZs.cRT == 1)
            this.nTH.setText(2131301093);
          this.nTF.setVisibility(0);
          this.nTF.setOnClickListener(new LuckyMoneyNotHookReceiveUI.12(this, bool));
          this.nTG.setVisibility(8);
          label706: if ((this.nZs.nZm != null) && (this.nZs.nZm.nZq != null))
          {
            paramString = this.nZs.nZm.nZq;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "render envelope");
            if (paramString != null)
            {
              ((com.tencent.mm.plugin.luckymoney.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.luckymoney.a.a.class)).a(this.ogr, paramString, null);
              this.ogr.setVisibility(0);
              this.nTG.setVisibility(8);
              this.ogw = true;
            }
            if (this.nZs.nZm.nZq.wwQ == null)
              break label1345;
          }
        }
      }
      label1313: label1325: label1345: for (paramString = this.nZs.nZm.nZq.wwQ.wwW; ; paramString = "")
      {
        paramm = getIntent().getStringExtra("key_username");
        if (!bo.isNullOrNil(this.nZs.nZm.nZq.wwP))
          this.ogv = this.nZs.nZm.nZq.wwP;
        com.tencent.mm.plugin.report.service.h.pYm.e(16598, new Object[] { Integer.valueOf(2), this.ogv, paramString, paramm });
        if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
        {
          this.tipDialog.setOnDismissListener(new LuckyMoneyNotHookReceiveUI.2(this));
          this.tipDialog.dismiss();
        }
        this.ius.setBackgroundResource(2131690237);
        ae.m(this, getResources().getColor(2131690237));
        this.mController.contentView.setVisibility(0);
        this.ogq.setVisibility(0);
        x.dn(this.ogq);
        break;
        paramm = (LinearLayout.LayoutParams)this.ogp.getLayoutParams();
        paramm.topMargin = BackwardSupportUtil.b.b(this.mController.ylL, 106.0F);
        this.ogp.setLayoutParams(paramm);
        paramString = (RelativeLayout.LayoutParams)this.ogt.getLayoutParams();
        paramString.topMargin = (paramm.topMargin - BackwardSupportUtil.b.b(this, 53.0F));
        this.ogt.setLayoutParams(paramString);
        this.ogt.invalidate();
        break label604;
        this.nTE.setVisibility(8);
        if (!bo.isNullOrNil(this.nZs.nUk))
        {
          this.kGq.setText(this.nZs.nUk);
          this.kGq.setVisibility(0);
          label1132: if (bo.isNullOrNil(this.nZs.nWO))
            break label1313;
          this.nsq.setText(this.nZs.nWO);
          this.nsq.setVisibility(0);
          this.nsq.setSingleLine(false);
        }
        while (true)
        {
          paramString = (LinearLayout.LayoutParams)this.ogp.getLayoutParams();
          paramString.topMargin = BackwardSupportUtil.b.b(this.mController.ylL, 106.0F);
          this.ogp.setLayoutParams(paramString);
          paramm = (RelativeLayout.LayoutParams)this.nTF.getLayoutParams();
          paramm.bottomMargin = BackwardSupportUtil.b.b(this.mController.ylL, 30.0F);
          this.nTF.setLayoutParams(paramm);
          paramm = (RelativeLayout.LayoutParams)this.ogt.getLayoutParams();
          paramm.topMargin = (paramString.topMargin - BackwardSupportUtil.b.b(this, 53.0F));
          this.ogt.setLayoutParams(paramm);
          this.ogt.invalidate();
          bool = true;
          break;
          this.kGq.setVisibility(8);
          break label1132;
          this.nsq.setVisibility(8);
        }
        this.nTF.setVisibility(8);
        this.nTG.setVisibility(0);
        break label706;
      }
      if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
        this.tipDialog.dismiss();
      bool = false;
      AppMethodBeat.o(42871);
      continue;
      if ((paramm instanceof an))
      {
        x.d(this.nTE);
        this.nTE.setClickable(true);
        bLf();
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = (an)paramm;
          k.a(this, k.a.oiu);
          if ((paramString.bLD()) && (paramString.nYe.a(this, new LuckyMoneyNotHookReceiveUI.3(this, paramString))))
          {
            bool = true;
            AppMethodBeat.o(42871);
          }
          else
          {
            a(paramString);
            if (this.ogw)
              com.tencent.mm.plugin.report.service.h.pYm.k(991L, 13L, 1L);
            bool = true;
            AppMethodBeat.o(42871);
          }
        }
        else if (paramInt2 == 416)
        {
          if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
            this.tipDialog.dismiss();
          paramString = new Bundle();
          paramString.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyNotHookReceiveUI");
          paramString.putString("realname_verify_process_jump_plugin", "luckymoney");
          this.nTE.setBackgroundResource(2130838808);
          new LuckyMoneyNotHookReceiveUI.4(this);
          bool = x.a(this, paramInt2, paramm, paramString, false, null, 1003);
          AppMethodBeat.o(42871);
        }
      }
      else if ((paramm instanceof af))
      {
        if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
          this.tipDialog.dismiss();
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = (af)paramm;
          paramm = new Intent();
          paramm.setClass(this.mController.ylL, LuckyMoneyBeforeDetailUI.class);
          paramm.putExtra("key_lucky_money_can_received", true);
          try
          {
            paramm.putExtra("key_detail_info", paramString.nYn.toByteArray());
            paramm.putExtra("key_jump_from", 2);
            paramm.putExtra("key_native_url", this.ocK);
            paramm.putExtra("key_sendid", this.ocI);
            paramm.putExtra("key_anim_slide", true);
            paramm.putExtra("key_detail_emoji_md5", paramString.nYA);
            paramm.putExtra("key_detail_emoji_type", paramString.nYB);
            paramm.putExtra("key_username", getIntent().getStringExtra("key_username"));
            paramm.putExtra("key_emoji_switch", paramString.nYC);
            startActivity(paramm);
            finish();
            bool = true;
            AppMethodBeat.o(42871);
          }
          catch (IOException localIOException)
          {
            while (true)
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.LuckyMoneyNotHookReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + localIOException.getLocalizedMessage());
          }
        }
        else
        {
          com.tencent.mm.ui.base.h.bQ(this, paramString);
          finish();
          bool = true;
          AppMethodBeat.o(42871);
        }
      }
      else
      {
        bool = false;
        AppMethodBeat.o(42871);
      }
    }
  }

  public boolean enableActivityAnimation()
  {
    return false;
  }

  public void finish()
  {
    AppMethodBeat.i(42865);
    super.finish();
    overridePendingTransition(0, 2131034179);
    AppMethodBeat.o(42865);
  }

  public final int getLayoutId()
  {
    return 2130969995;
  }

  public final void initView()
  {
    AppMethodBeat.i(42866);
    xE(-839716110);
    this.ogq = findViewById(2131825642);
    this.ius = ((ViewGroup)findViewById(2131825641));
    this.ogp = ((LinearLayout)findViewById(2131825649));
    this.nSM = ((ImageView)findViewById(2131825516));
    this.nTD = ((TextView)findViewById(2131825517));
    this.kGq = ((TextView)findViewById(2131825522));
    this.nsq = ((TextView)findViewById(2131825650));
    this.odG = ((RelativeLayout)findViewById(2131825469));
    this.odH = ((BaseEmojiView)findViewById(2131825470));
    this.odI = ((TextView)findViewById(2131825471));
    this.odJ = ((LinearLayout)findViewById(2131825472));
    this.odK = ((MMAnimateView)findViewById(2131825473));
    this.nTE = ((Button)findViewById(2131825651));
    this.nTH = ((TextView)findViewById(2131825653));
    this.nTF = findViewById(2131825652);
    this.nTG = ((ImageView)findViewById(2131825523));
    this.ogr = ((ImageView)findViewById(2131825643));
    this.nVJ = ((ImageView)findViewById(2131825524));
    this.nVJ.setOnClickListener(new LuckyMoneyNotHookReceiveUI.6(this));
    this.ogs = ((ImageView)findViewById(2131825648));
    this.ogt = ((RelativeLayout)findViewById(2131825645));
    this.odI.setOnClickListener(new LuckyMoneyNotHookReceiveUI.7(this));
    this.kGq.setLines(2);
    android.support.v4.widget.q.d(this.kGq);
    this.maxSize = ((int)(com.tencent.mm.bz.a.am(this.mController.ylL, 2131428494) * 1.375F));
    this.textSize = com.tencent.mm.bz.a.al(this.mController.ylL, 2131428494);
    if (this.textSize > this.maxSize);
    for (int i = this.maxSize; ; i = this.textSize)
    {
      this.textSize = i;
      this.mController.contentView.setVisibility(8);
      this.tipDialog = com.tencent.mm.ui.base.h.a(this.mController.ylL, 3, 2131493296, getString(2131300968), true, new LuckyMoneyNotHookReceiveUI.8(this));
      bLf();
      AppMethodBeat.o(42866);
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42861);
    this.yll = true;
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21)
    {
      paramBundle = getWindow();
      paramBundle.addFlags(-2147483648);
      paramBundle.setStatusBarColor(getResources().getColor(2131690597));
    }
    this.ocK = getIntent().getStringExtra("key_native_url");
    this.ogv = getIntent().getStringExtra("key_cropname");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "nativeUrl= " + bo.nullAsNil(this.ocK));
    initView();
    Uri localUri = Uri.parse(bo.nullAsNil(this.ocK));
    try
    {
      this.ocI = localUri.getQueryParameter("sendid");
      label132: this.ogu = com.tencent.mm.plugin.wallet_core.model.r.cPF().acN(this.ocK);
      if ((this.ogu != null) && (this.ogu.field_receiveAmount > 0L) && (bo.gb(this.ogu.field_receiveTime) < 86400000L))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "use cache this item %s %s", new Object[] { Long.valueOf(this.ogu.field_receiveTime), bo.nullAsNil(this.ocK) });
        paramBundle = new Intent();
        paramBundle.setClass(this.mController.ylL, LuckyMoneyBeforeDetailUI.class);
        paramBundle.putExtra("key_native_url", this.ogu.field_mNativeUrl);
        paramBundle.putExtra("key_sendid", this.ocI);
        paramBundle.putExtra("key_anim_slide", true);
        paramBundle.putExtra("key_lucky_money_can_received", true);
        paramBundle.putExtra("key_username", getIntent().getStringExtra("key_username"));
        startActivity(paramBundle);
        finish();
        AppMethodBeat.o(42861);
      }
      while (true)
      {
        return;
        if (!bo.isNullOrNil(this.ocI))
        {
          int i = bo.getInt(localUri.getQueryParameter("channelid"), 1);
          this.mXq = localUri.getQueryParameter("sendusername");
          b(new aq(i, this.ocI, this.ocK, getIntent().getIntExtra("key_way", 0), "v1.0"), false);
          if (this.tipDialog != null)
            this.tipDialog.show();
          AppMethodBeat.o(42861);
        }
        else
        {
          finish();
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.LuckyMoneyNotHookReceiveUI", "sendid null & finish");
          AppMethodBeat.o(42861);
        }
      }
    }
    catch (Exception paramBundle)
    {
      break label132;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42862);
    super.onDestroy();
    if ((this.oex == 1) || (this.oex == 2))
    {
      this.oec = new com.tencent.mm.g.b.a.aa();
      this.oec.cVT = 9L;
      this.oec.ajK();
    }
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    j.bkh().kVj = null;
    com.tencent.mm.kernel.g.RO().eJo.b(697, this.oev);
    AppMethodBeat.o(42862);
  }

  public void onPause()
  {
    AppMethodBeat.i(42864);
    super.onPause();
    com.tencent.mm.modelstat.d.h("LuckyMoneyReceiveUI", this.oes, bo.anT());
    AppMethodBeat.o(42864);
  }

  public void onResume()
  {
    AppMethodBeat.i(42863);
    super.onResume();
    this.oes = bo.anT();
    AppMethodBeat.o(42863);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI
 * JD-Core Version:    0.6.2
 */