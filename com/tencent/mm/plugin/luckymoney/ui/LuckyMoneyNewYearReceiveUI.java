package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.emoji.model.d.a;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.luckymoney.model.an;
import com.tencent.mm.plugin.luckymoney.model.aq;
import com.tencent.mm.plugin.luckymoney.model.k;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;

@com.tencent.mm.ui.base.a(3)
public class LuckyMoneyNewYearReceiveUI extends LuckyMoneyBaseUI
{
  private String cRS;
  private String emo;
  private String imageId;
  private String imagePath;
  private TextView iqw;
  private ImageView kEn;
  private d.a kVj;
  private EmojiInfo kZa;
  private bi kua;
  private ak mHandler;
  private View nTI;
  public int nYW;
  private TextView nsq;
  private String ocI;
  private String ofA;
  private int ofB;
  private String ofC;
  private boolean ofD;
  private LuckyMoneyAutoScrollView ofi;
  private TextView ofj;
  private TextView ofk;
  private LinearLayout ofl;
  private ImageView ofm;
  private LinearLayout ofn;
  private LinearLayout ofo;
  private MMAnimateView ofp;
  private TextView ofq;
  private LinearLayout ofr;
  private TextView ofs;
  private ImageView oft;
  private ImageView ofu;
  private MMAnimateView ofv;
  private ImageView ofw;
  private View ofx;
  private BaseEmojiView ofy;
  private boolean ofz;
  private p tipDialog;

  public LuckyMoneyNewYearReceiveUI()
  {
    AppMethodBeat.i(42795);
    this.tipDialog = null;
    this.nYW = 0;
    this.ofz = false;
    this.ofA = "";
    this.imageId = "";
    this.ofC = "";
    this.imagePath = "";
    this.mHandler = new ak();
    this.ofD = false;
    this.kVj = new LuckyMoneyNewYearReceiveUI.1(this);
    AppMethodBeat.o(42795);
  }

  private void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(42803);
    b(new an(paramInt1, paramInt2, paramString1, paramString2, x.bLC(), r.YB(), getIntent().getStringExtra("key_username"), "v1.0", paramString3), false);
    AppMethodBeat.o(42803);
  }

  private void bMD()
  {
    AppMethodBeat.i(42800);
    this.ofq.setVisibility(8);
    this.kZa = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().xYn.aqi(this.ofA);
    if (this.kZa == null)
    {
      ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "showExpression() mEmojiInfo == null ");
      AppMethodBeat.o(42800);
    }
    while (true)
    {
      return;
      if ((com.tencent.mm.vfs.e.asZ(this.kZa.dve()) > 0L) || (this.kZa.xy()) || (this.kZa.duS()))
      {
        this.ofy.setVisibility(0);
        this.ofy.setEmojiInfo(this.kZa);
        AppMethodBeat.o(42800);
      }
      else
      {
        this.ofy.setVisibility(8);
        this.ofo.setVisibility(0);
        this.ofp.setImageResource(2131231555);
        com.tencent.mm.plugin.emoji.model.j.bkh().kVj = this.kVj;
        com.tencent.mm.plugin.emoji.model.j.bkh().s(this.kZa);
        AppMethodBeat.o(42800);
      }
    }
  }

  private void bME()
  {
    AppMethodBeat.i(42801);
    this.ofv.setImageResource(2131231556);
    AppMethodBeat.o(42801);
  }

  private void iL(boolean paramBoolean)
  {
    AppMethodBeat.i(42805);
    if (paramBoolean)
    {
      this.ofr.setVisibility(0);
      ((RelativeLayout.LayoutParams)this.ofr.getLayoutParams()).addRule(3, 2131825589);
      this.ofs.setText(getString(2131301181));
      this.ofr.setOnClickListener(new LuckyMoneyNewYearReceiveUI.8(this));
      AppMethodBeat.o(42805);
    }
    while (true)
    {
      return;
      this.ofr.setVisibility(0);
      this.ofr.setOnClickListener(new LuckyMoneyNewYearReceiveUI.9(this));
      this.ofs.setText(getString(2131301179));
      AppMethodBeat.o(42805);
    }
  }

  private void yc(int paramInt)
  {
    AppMethodBeat.i(42804);
    ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() localReceiveStatus:%s newStatus:%s", new Object[] { Integer.valueOf(this.ofB), Integer.valueOf(paramInt) });
    if (this.kua == null)
    {
      ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() mEmojiInfo == null");
      AppMethodBeat.o(42804);
    }
    while (true)
    {
      return;
      if ((bo.gW(this.ofB, paramInt)) || (bo.gW(this.ofB, 2)))
        AppMethodBeat.o(42804);
      else
        try
        {
          Object localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>(this.kua.field_content);
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          int i = ((StringBuilder)localObject1).indexOf("<localreceivestatus>");
          StringBuilder localStringBuilder;
          if ((i > 0) && (i < ((StringBuilder)localObject1).length()))
          {
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(((StringBuilder)localObject1).substring(0, i + 20));
            localObject2 = ((StringBuilder)localObject1).substring(i + 21);
            localStringBuilder.append(paramInt).append((String)localObject2);
          }
          while (true)
          {
            this.kua.setContent(localStringBuilder.toString());
            ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(this.kua.field_msgId, this.kua);
            ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() success msgXml:%s", new Object[] { localStringBuilder });
            AppMethodBeat.o(42804);
            break;
            i = ((StringBuilder)localObject1).indexOf("<emoji>");
            if ((i > 0) && (i < ((StringBuilder)localObject1).length()))
            {
              ((StringBuilder)localObject2).append("<localreceivestatus>").append(paramInt).append("</localreceivestatus>");
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>(((StringBuilder)localObject1).substring(0, i + 7));
              localObject1 = ((StringBuilder)localObject1).substring(i + 7).trim();
              localStringBuilder.append((CharSequence)localObject2).append((String)localObject1);
            }
            else
            {
              i = ((StringBuilder)localObject1).indexOf("<wcpayinfo>");
              ((StringBuilder)localObject2).append("<emoji><localreceivestatus>").append(paramInt).append("</localreceivestatus></emoji>");
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>(((StringBuilder)localObject1).substring(0, i));
              localObject1 = ((StringBuilder)localObject1).substring(i).trim();
              localStringBuilder.append((CharSequence)localObject2).append((String)localObject1);
            }
          }
        }
        catch (Exception localException)
        {
          ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() Exception:%s", new Object[] { localException.getMessage() });
          AppMethodBeat.o(42804);
        }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(42802);
    ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "onSceneEnd() errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " netsceneType:" + paramm.getType());
    label261: label326: boolean bool;
    if ((paramm instanceof aq))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (aq)paramm;
        this.nYW = paramString.nYW;
        if (paramString.nWZ == 1)
        {
          paramInt1 = 1;
          if (paramInt1 == 0)
            break label674;
          ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "is Sender hb!");
          if (paramString.cRU != 4)
            this.ofn.setVisibility(8);
          if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
            this.tipDialog.dismiss();
          if (paramString.cRU == 5)
            break label602;
          paramm = com.tencent.mm.wallet_core.ui.e.F(paramString.nZh / 100.0D);
          this.ofi.setContentDescription(paramm);
          this.ofi.setFinalText(paramm);
          this.ofi.bMn();
          x.a(this.mController.ylL, this.nsq, paramString.nSd);
          this.ofl.setVisibility(8);
          this.ofn.setVisibility(0);
          if (paramString.cRU != 4)
            break label590;
          a.b.r(this.kEn, this.emo);
          yc(2);
          this.ofk.setText(paramString.nWO);
          this.ofk.setTextSize(1, 16.0F);
          paramm = (RelativeLayout.LayoutParams)this.ofn.getLayoutParams();
          paramm.bottomMargin = com.tencent.mm.bz.a.fromDPToPix(this, 82);
          this.ofn.setLayoutParams(paramm);
          this.ofn.invalidate();
          bME();
          AM(0);
          x.a(this.nTI, null);
          this.oft.setVisibility(0);
          this.ofu.setVisibility(8);
          bool = true;
          if ((paramString.cRU == 5) || (paramString.cRU == 1))
            bool = false;
          ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "receiveScene.hbStatus is " + paramString.cRU + ", isValidStatus is " + bool);
          if ((!bo.gW(this.nYW, 1)) || (bo.isNullOrNil(this.ofA)))
            break label1257;
          paramInt1 = 1;
          label437: if ((paramInt1 == 0) || (!bool))
            break label1262;
          this.ofx.setVisibility(0);
          this.ofw.setVisibility(8);
          bMD();
          label467: if ((paramInt1 == 0) || (!bool))
            break label1282;
          this.nsq.getLayoutParams();
          this.nsq.setTextSize(1, 21.0F);
          this.ofj.setTextSize(1, 15.0F);
          this.ofi.eu(getResources().getDimensionPixelOffset(2131428519), getResources().getDimensionPixelOffset(2131428515));
          paramString = (LinearLayout.LayoutParams)this.ofi.getLayoutParams();
          paramString.topMargin = getResources().getDimensionPixelOffset(2131428502);
          this.ofi.setLayoutParams(paramString);
          this.ofi.invalidate();
          label573: bool = true;
          AppMethodBeat.o(42802);
        }
      }
    while (true)
    {
      return bool;
      paramInt1 = 0;
      break;
      label590: this.kEn.setVisibility(8);
      break label261;
      label602: findViewById(2131825582).setVisibility(8);
      ((TextView)findViewById(2131825589)).setText(paramString.nWO);
      ((TextView)findViewById(2131825589)).setVisibility(0);
      ((TextView)findViewById(2131825589)).setTextSize(24.0F);
      iL(true);
      yc(1);
      break label326;
      label674: ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "is receiver hb!");
      label713: Object localObject;
      if (!TextUtils.isEmpty(getIntent().getStringExtra("key_username")))
      {
        a.b.r(this.kEn, getIntent().getStringExtra("key_username"));
        this.ofk.setTextSize(1, 16.0F);
        x.a(this.mController.ylL, this.ofk, paramString.nZg + getString(2131301146));
        paramm = (RelativeLayout.LayoutParams)this.ofn.getLayoutParams();
        paramm.bottomMargin = com.tencent.mm.bz.a.fromDPToPix(this, 30);
        this.ofn.setLayoutParams(paramm);
        this.ofn.invalidate();
        this.ofn.setVisibility(0);
        this.ofl.setVisibility(8);
        if ((paramString.cRV != 0) || (paramString.cRU == 4) || (paramString.cRU == 5) || (paramString.cRU == 1))
          break label1062;
        if (!"0".equals(paramString.nYs))
          break label1035;
        localObject = this.ocz;
        String str1 = paramString.nYt;
        paramm = paramString.nYu;
        String str2 = paramString.nYv;
        String str3 = paramString.nYw;
        LuckyMoneyNewYearReceiveUI.6 local6 = new LuckyMoneyNewYearReceiveUI.6(this, paramString);
        new com.tencent.mm.plugin.wallet_core.id_verify.util.a().a(this, (com.tencent.mm.wallet_core.d.e)localObject, str1, paramm, str2, str3, local6, true, 1005);
      }
      while (true)
      {
        paramm = (LinearLayout.LayoutParams)this.ofl.getLayoutParams();
        paramm.topMargin = getResources().getDimensionPixelOffset(2131428523);
        this.ofl.setLayoutParams(paramm);
        this.ofl.invalidate();
        this.iqw.setTextSize(1, 12.0F);
        this.oft.setVisibility(8);
        this.ofu.setVisibility(0);
        break;
        if (TextUtils.isEmpty(paramString.nWR))
          break label713;
        x.b(this.kEn, paramString.nWR, paramString.nXl);
        break label713;
        label1035: a(paramString.msgType, paramString.cdf, paramString.nSX, paramString.cRS, paramString.nZl);
      }
      label1062: if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
        this.tipDialog.dismiss();
      if (paramString.cRU != 5)
      {
        paramm = com.tencent.mm.wallet_core.ui.e.F(paramString.nZh / 100.0D);
        this.ofi.setContentDescription(paramm);
        this.ofi.setFinalText(paramm);
        this.ofi.bMn();
        x.a(this.mController.ylL, this.nsq, paramString.nSd);
        yc(2);
        bME();
        iL(false);
      }
      while (true)
      {
        AM(0);
        x.a(this.nTI, null);
        break;
        this.ofr.setVisibility(8);
        findViewById(2131825582).setVisibility(8);
        ((TextView)findViewById(2131825589)).setText(paramString.nWO);
        ((TextView)findViewById(2131825589)).setVisibility(0);
        ((TextView)findViewById(2131825589)).setTextSize(24.0F);
        yc(1);
      }
      label1257: paramInt1 = 0;
      break label437;
      label1262: this.ofx.setVisibility(8);
      this.ofw.setVisibility(0);
      break label467;
      label1282: this.nsq.setTextSize(1, 21.0F);
      this.ofj.setTextSize(1, 18.0F);
      this.ofi.eu(getResources().getDimensionPixelOffset(2131428520), getResources().getDimensionPixelOffset(2131428516));
      this.ofi.invalidate();
      break label573;
      if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
        this.tipDialog.dismiss();
      bool = false;
      AppMethodBeat.o(42802);
      continue;
      if ((paramm instanceof an))
      {
        if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
          this.tipDialog.dismiss();
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          localObject = (an)paramm;
          this.nYW = ((an)localObject).nYW;
          if (!bo.gW(this.nYW, 1))
          {
            this.ofx.setVisibility(8);
            this.ofw.setVisibility(0);
          }
          paramString = ((an)localObject).nYn;
          this.iqw.setText(((an)localObject).nYn.nWO);
          paramm = com.tencent.mm.wallet_core.ui.e.F(((an)localObject).nYn.cSh / 100.0D);
          this.ofi.setContentDescription(paramm);
          this.ofi.setFinalText(paramm);
          this.ofi.a(new LuckyMoneyNewYearReceiveUI.7(this, (an)localObject));
          if ((paramString.cRU == 4) && (!TextUtils.isEmpty(((an)localObject).nYn.nWO)))
            this.ofm.setVisibility(8);
          iL(false);
          AM(0);
          x.a(this.nTI, null);
          yc(2);
          bME();
          bool = true;
          AppMethodBeat.o(42802);
        }
        else if (paramInt2 == 416)
        {
          if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
            this.tipDialog.dismiss();
          this.ofD = true;
          paramString = new Bundle();
          paramString.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyNewYearReceiveUI");
          paramString.putString("realname_verify_process_jump_plugin", "luckymoney");
          bool = x.a(this, paramInt2, paramm, paramString, true, null, 1004);
          AppMethodBeat.o(42802);
        }
      }
      else
      {
        bool = false;
        AppMethodBeat.o(42802);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969990;
  }

  public final void initView()
  {
    AppMethodBeat.i(42799);
    xE(-839716110);
    this.nTI = findViewById(2131825578);
    this.ofi = ((LuckyMoneyAutoScrollView)findViewById(2131825584));
    this.ofj = ((TextView)findViewById(2131825574));
    this.nsq = ((TextView)findViewById(2131825583));
    this.kEn = ((ImageView)findViewById(2131825594));
    this.ofl = ((LinearLayout)findViewById(2131825585));
    this.iqw = ((TextView)findViewById(2131825587));
    this.ofm = ((ImageView)findViewById(2131825586));
    this.ofk = ((TextView)findViewById(2131825595));
    this.ofn = ((LinearLayout)findViewById(2131825593));
    this.ofv = ((MMAnimateView)findViewById(2131825588));
    this.ofw = ((ImageView)findViewById(2131825561));
    this.ofx = findViewById(2131825565);
    this.ofy = ((BaseEmojiView)findViewById(2131825567));
    this.ofq = ((TextView)findViewById(2131825580));
    this.ofo = ((LinearLayout)findViewById(2131825581));
    this.ofp = ((MMAnimateView)findViewById(2131825571));
    this.ofr = ((LinearLayout)findViewById(2131825590));
    this.ofs = ((TextView)findViewById(2131825591));
    this.ofq.setOnClickListener(new LuckyMoneyNewYearReceiveUI.2(this));
    this.oft = ((ImageView)findViewById(2131825577));
    this.oft.setOnClickListener(new LuckyMoneyNewYearReceiveUI.3(this));
    this.ofu = ((ImageView)findViewById(2131825596));
    this.ofu.setOnClickListener(new LuckyMoneyNewYearReceiveUI.4(this));
    AM(8);
    this.tipDialog = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131300968), true, new LuckyMoneyNewYearReceiveUI.5(this));
    AppMethodBeat.o(42799);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42796);
    super.onCreate(paramBundle);
    this.emo = getIntent().getStringExtra("key_username");
    this.ofA = getIntent().getStringExtra("key_emoji_md5");
    long l = getIntent().getLongExtra("key_msgid", 0L);
    this.kua = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(l);
    this.ofB = getIntent().getIntExtra("key_msg_newyear_localreceivestatus", 0);
    this.cRS = getIntent().getStringExtra("key_native_url");
    ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "emojiMd5:" + this.ofA);
    Uri localUri = Uri.parse(bo.nullAsNil(this.cRS));
    try
    {
      this.ocI = localUri.getQueryParameter("sendid");
      initView();
      if (!bo.isNullOrNil(this.ocI))
      {
        b(new aq(bo.getInt(localUri.getQueryParameter("channelid"), 1), this.ocI, this.cRS, 1, "v1.0"), false);
        if (this.tipDialog != null)
          this.tipDialog.show();
        AppMethodBeat.o(42796);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "onCreate() Exception:%s", new Object[] { paramBundle.getMessage() });
        continue;
        finish();
        ab.w("MicroMsg.LuckyMoneyNewYearReceiveUI", "sendid null & finish");
        AppMethodBeat.o(42796);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42798);
    super.onDestroy();
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    com.tencent.mm.plugin.emoji.model.j.bkh().kVj = null;
    AppMethodBeat.o(42798);
  }

  public void onResume()
  {
    AppMethodBeat.i(42797);
    super.onResume();
    if (this.ofD)
      finish();
    AppMethodBeat.o(42797);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI
 * JD-Core Version:    0.6.2
 */