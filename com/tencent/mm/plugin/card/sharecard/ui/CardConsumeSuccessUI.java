package com.tencent.mm.plugin.card.sharecard.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.g.a.cb;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.r;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.j;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CardConsumeSuccessUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private final String TAG;
  private View WL;
  private com.tencent.mm.ui.base.p ejZ;
  private View.OnClickListener gKK;
  ak ilv;
  private String kaE;
  private String kbQ;
  private TextView kgD;
  private TextView kgE;
  private TextView kgF;
  private TextView kgG;
  private ImageView kgH;
  private Button kgI;
  private CheckBox kgJ;
  private j kgK;
  private String kgL;
  private String kgM;
  int kgN;
  int kgO;
  public int kgP;
  private String kgQ;
  private String kgR;
  public ArrayList<String> kgS;
  public ArrayList<String> kgT;
  private TextView kgq;
  private TextView kgr;
  private long mStartTime;

  public CardConsumeSuccessUI()
  {
    AppMethodBeat.i(88121);
    this.TAG = "MicroMsg.CardConsumeSuccessUI";
    this.kaE = "";
    this.kgL = "";
    this.kbQ = "";
    this.kgM = "";
    this.kgN = 0;
    this.kgO = 0;
    this.kgP = 0;
    this.kgQ = "";
    this.kgR = "";
    this.kgS = new ArrayList();
    this.kgT = new ArrayList();
    this.mStartTime = 0L;
    this.ilv = new ak(Looper.getMainLooper());
    this.ejZ = null;
    this.gKK = new CardConsumeSuccessUI.2(this);
    AppMethodBeat.o(88121);
  }

  private boolean GM(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(88124);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the consumed json is empty!");
      AppMethodBeat.o(88124);
    }
    while (true)
    {
      return bool;
      this.kgK = r.Hv(paramString);
      if (this.kgK == null)
      {
        ab.e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the mConsumedInfo is null! json is ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(88124);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(88124);
      }
    }
  }

  @TargetApi(16)
  private void GN(String paramString)
  {
    AppMethodBeat.i(88130);
    int i = l.Hn(paramString);
    this.WL.setBackgroundColor(i);
    xE(i);
    if (com.tencent.mm.compatible.util.d.iW(16))
      this.kgI.setBackground(l.dI(i, getResources().getDimensionPixelSize(2131428150) / 2));
    while (true)
    {
      this.WL.invalidate();
      AppMethodBeat.o(88130);
      return;
      this.kgI.setBackgroundDrawable(l.dI(i, getResources().getDimensionPixelSize(2131428150) / 2));
    }
  }

  private void GO(String paramString)
  {
    AppMethodBeat.i(88132);
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
      str = getString(2131297796);
    com.tencent.mm.ui.base.h.a(this, str, "", false, new CardConsumeSuccessUI.4(this));
    AppMethodBeat.o(88132);
  }

  private void bbE()
  {
    AppMethodBeat.i(88129);
    this.mController.contentView.setBackgroundColor(getResources().getColor(2131689822));
    findViewById(2131821993).setVisibility(4);
    AppMethodBeat.o(88129);
  }

  private String bbF()
  {
    AppMethodBeat.i(88136);
    String str;
    if ((!TextUtils.isEmpty(this.kgQ)) && (!TextUtils.isEmpty(this.kgR)))
    {
      str = this.kgQ + "," + l.Hq(this.kgR);
      AppMethodBeat.o(88136);
    }
    while (true)
    {
      return str;
      if (!TextUtils.isEmpty(this.kgQ))
      {
        str = this.kgQ;
        AppMethodBeat.o(88136);
      }
      else if (!TextUtils.isEmpty(this.kgR))
      {
        str = l.Hq(this.kgR);
        AppMethodBeat.o(88136);
      }
      else
      {
        str = "";
        AppMethodBeat.o(88136);
      }
    }
  }

  private void cu()
  {
    AppMethodBeat.i(88128);
    if (this.kgK == null)
    {
      ab.e("MicroMsg.CardConsumeSuccessUI", "don't updateView() , mConsumedInfo is null");
      AppMethodBeat.o(88128);
    }
    while (true)
    {
      return;
      findViewById(2131821993).setVisibility(0);
      label87: oi localoi;
      if ((!TextUtils.isEmpty(this.kgK.kfE)) && (!TextUtils.isEmpty(this.kgK.kfF)))
      {
        this.kgJ.setText(this.kgK.kfE);
        this.kgJ.setVisibility(0);
        if ((this.kgK.ckx == null) || (this.kgK.ckx.size() <= 0))
          break label419;
        this.kgE.setText(getString(2131297825, new Object[] { Integer.valueOf(this.kgK.ckx.size()) }));
        localoi = ((com.tencent.mm.plugin.card.sharecard.model.q)this.kgK.ckx.get(0)).kcY;
        if (localoi == null)
          break label402;
        GN(localoi.color);
        this.kgq.setText(localoi.kdg);
        this.kgr.setText(localoi.title);
        int i = getResources().getDimensionPixelSize(2131428175);
        if (TextUtils.isEmpty(localoi.kbV))
          break label353;
        Object localObject = new c.a();
        ((c.a)localObject).ePK = e.eSn;
        o.ahq();
        ((c.a)localObject).ePY = null;
        ((c.a)localObject).ePJ = com.tencent.mm.plugin.card.model.m.Gz(localoi.kbV);
        ((c.a)localObject).ePH = true;
        ((c.a)localObject).eQf = true;
        ((c.a)localObject).ePF = true;
        ((c.a)localObject).ePO = i;
        ((c.a)localObject).ePN = i;
        ((c.a)localObject).ePT = 2130839644;
        localObject = ((c.a)localObject).ahG();
        o.ahp().a(localoi.kbV, this.kgH, (c)localObject);
      }
      while (true)
      {
        if (!TextUtils.isEmpty(localoi.vUf))
          break label374;
        this.kgI.setText(2131297822);
        AppMethodBeat.o(88128);
        break;
        this.kgJ.setVisibility(8);
        ab.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.subscribe_wording is empty or subscribe_app_username is empty!");
        break label87;
        label353: ab.e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo.logo_url is empty!");
        this.kgH.setImageResource(2130839644);
      }
      label374: ab.e("MicroMsg.CardConsumeSuccessUI", "accept_wording is empty!");
      this.kgI.setText(localoi.vUf);
      AppMethodBeat.o(88128);
      continue;
      label402: ab.e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo is null!");
      AppMethodBeat.o(88128);
      continue;
      label419: this.kgI.setEnabled(false);
      ab.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.list is null!");
      AppMethodBeat.o(88128);
    }
  }

  private void fE(boolean paramBoolean)
  {
    AppMethodBeat.i(88122);
    if (paramBoolean)
    {
      this.ejZ = com.tencent.mm.ui.base.p.b(this, getString(2131300968), true, null);
      AppMethodBeat.o(88122);
    }
    while (true)
    {
      return;
      if ((this.ejZ != null) && (this.ejZ.isShowing()))
      {
        this.ejZ.dismiss();
        this.ejZ = null;
      }
      AppMethodBeat.o(88122);
    }
  }

  private static void sW(int paramInt)
  {
    AppMethodBeat.i(88134);
    ab.i("MicroMsg.CardConsumeSuccessUI", "pushConsumedEvent resultCode is ".concat(String.valueOf(paramInt)));
    cb localcb = new cb();
    localcb.cvk.bFZ = paramInt;
    com.tencent.mm.sdk.b.a.xxA.m(localcb);
    AppMethodBeat.o(88134);
  }

  public final int getLayoutId()
  {
    return 2130968908;
  }

  public final void initView()
  {
    AppMethodBeat.i(88127);
    setBackBtn(new CardConsumeSuccessUI.1(this));
    this.WL = this.mController.contentView;
    this.kgq = ((TextView)findViewById(2131821915));
    this.kgr = ((TextView)findViewById(2131821917));
    this.kgD = ((TextView)findViewById(2131821918));
    this.kgE = ((TextView)findViewById(2131821996));
    this.kgF = ((TextView)findViewById(2131821999));
    this.kgG = ((TextView)findViewById(2131822000));
    this.kgH = ((ImageView)findViewById(2131821914));
    this.kgI = ((Button)findViewById(2131821997));
    this.kgJ = ((CheckBox)findViewById(2131821998));
    this.kgI.setOnClickListener(this.gKK);
    this.kgJ.setOnClickListener(this.gKK);
    this.kgF.setOnClickListener(this.gKK);
    if (this.kgK != null)
      cu();
    AppMethodBeat.o(88127);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(88135);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(88135);
      while (true)
      {
        return;
        if (paramInt2 != -1)
        {
          AppMethodBeat.o(88135);
        }
        else
        {
          this.kgP = paramIntent.getIntExtra("Ktag_range_index", 0);
          ab.i("MicroMsg.CardConsumeSuccessUI", "mPrivateSelelct : %d", new Object[] { Integer.valueOf(this.kgP) });
          if (this.kgP < 2)
            break;
          this.kgQ = paramIntent.getStringExtra("Klabel_name_list");
          this.kgR = paramIntent.getStringExtra("Kother_user_name_list");
          ab.d("MicroMsg.CardConsumeSuccessUI", "mPrivateSelect : %d, names : %s", new Object[] { Integer.valueOf(this.kgP), this.kgQ });
          if ((TextUtils.isEmpty(this.kgQ)) && (TextUtils.isEmpty(this.kgR)))
          {
            ab.e("MicroMsg.CardConsumeSuccessUI", "mLabelNameList and mPrivateTmpUsers by getIntent is empty");
            AppMethodBeat.o(88135);
          }
          else
          {
            paramIntent = Arrays.asList(this.kgQ.split(","));
            this.kgT = l.bl(paramIntent);
            this.kgS = l.bk(paramIntent);
            if ((this.kgR != null) && (this.kgR.length() > 0))
            {
              paramIntent = Arrays.asList(this.kgR.split(","));
              this.kgS.addAll(paramIntent);
            }
            if (this.kgT != null)
              ab.i("MicroMsg.CardConsumeSuccessUI", "mPrivateIdsList size is " + this.kgT.size());
            if (this.kgS != null)
            {
              ab.i("MicroMsg.CardConsumeSuccessUI", "mPrivateNamesList size is " + this.kgS.size());
              paramIntent = this.kgS.iterator();
              while (paramIntent.hasNext())
                ab.d("MicroMsg.CardConsumeSuccessUI", "username : %s", new Object[] { (String)paramIntent.next() });
            }
            if (this.kgP == 2)
            {
              this.kgG.setVisibility(0);
              this.kgG.setText(getString(2131297971, new Object[] { bbF() }));
              AppMethodBeat.o(88135);
            }
            else if (this.kgP == 3)
            {
              this.kgG.setVisibility(0);
              this.kgG.setText(getString(2131297970, new Object[] { bbF() }));
              AppMethodBeat.o(88135);
            }
            else
            {
              this.kgG.setVisibility(8);
              AppMethodBeat.o(88135);
            }
          }
        }
      }
      this.kgG.setVisibility(8);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(88123);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.CardConsumeSuccessUI", "onCreate()");
    this.mStartTime = System.currentTimeMillis();
    setMMTitle("");
    setResult(0);
    com.tencent.mm.kernel.g.RO().eJo.a(902, this);
    com.tencent.mm.kernel.g.RO().eJo.a(910, this);
    paramBundle = "";
    this.kgN = getIntent().getIntExtra("key_from_scene", 0);
    if (this.kgN == 1)
    {
      ab.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_JS");
      this.kgL = getIntent().getStringExtra("key_consumed_card_id");
      this.kgM = getIntent().getStringExtra("key_consumed_Code");
      if (TextUtils.isEmpty(this.kgL))
      {
        ab.e("MicroMsg.CardConsumeSuccessUI", "the mConsumdeCardId is empty!");
        sW(0);
        finish();
        AppMethodBeat.o(88123);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.CardConsumeSuccessUI", "the mConsumdeCode is " + this.kgM);
      fE(true);
      localObject = new com.tencent.mm.plugin.card.sharecard.model.d("", this.kgL, this.kgM);
      com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject, 0);
      bbE();
      for (this.kgO = 7; ; this.kgO = 4)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(11324, new Object[] { "CardConsumeSuccessUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(this.kgO), "", Integer.valueOf(0), "" });
        initView();
        if (!TextUtils.isEmpty(paramBundle))
          GN(paramBundle);
        AppMethodBeat.o(88123);
        break;
        if (this.kgN != 2)
          break label462;
        ab.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_MSG_UI");
        this.kaE = getIntent().getStringExtra("key_card_id");
        if (TextUtils.isEmpty(this.kaE))
        {
          ab.e("MicroMsg.CardConsumeSuccessUI", "the mCardId is empty!");
          sW(0);
          finish();
          AppMethodBeat.o(88123);
          break;
        }
        ab.i("MicroMsg.CardConsumeSuccessUI", "the mCardId is " + this.kaE);
        fE(true);
        localObject = new com.tencent.mm.plugin.card.sharecard.model.d(this.kaE, "", "");
        com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject, 0);
        bbE();
      }
      label462: ab.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_CONSUMED_CODE");
      this.kaE = getIntent().getStringExtra("KEY_CARD_ID");
      if (GM(getIntent().getStringExtra("KEY_CARD_CONSUMED_JSON")))
        break;
      ab.e("MicroMsg.CardConsumeSuccessUI", "the mCardId is empty!");
      sW(0);
      finish();
      AppMethodBeat.o(88123);
    }
    if ((this.kgK != null) && (!bo.ek(this.kgK.ckx)))
    {
      paramBundle = ((com.tencent.mm.plugin.card.sharecard.model.q)this.kgK.ckx.get(0)).kcY;
      if (paramBundle == null);
    }
    for (Object localObject = paramBundle.color; ; localObject = "")
    {
      paramBundle = (Bundle)localObject;
      if (bo.isNullOrNil((String)localObject))
        paramBundle = getIntent().getStringExtra("KEY_CARD_COLOR");
      this.kgO = getIntent().getIntExtra("key_stastic_scene", 0);
      break;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(88126);
    com.tencent.mm.kernel.g.RO().eJo.b(902, this);
    com.tencent.mm.kernel.g.RO().eJo.b(910, this);
    long l = System.currentTimeMillis() - this.mStartTime;
    if (!TextUtils.isEmpty(this.kaE))
      com.tencent.mm.plugin.report.service.h.pYm.e(13219, new Object[] { "CardConsumeSuccessUI", Integer.valueOf(this.kgN), this.kbQ, this.kaE, Long.valueOf(l) });
    while (true)
    {
      super.onDestroy();
      AppMethodBeat.o(88126);
      return;
      com.tencent.mm.plugin.report.service.h.pYm.e(13219, new Object[] { "CardConsumeSuccessUI", Integer.valueOf(this.kgN), this.kbQ, this.kgL, Long.valueOf(l) });
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(88133);
    if (paramInt == 4)
    {
      ab.e("MicroMsg.CardConsumeSuccessUI", "onKeyDown finishUI");
      sW(0);
      finish();
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(88133);
    return bool;
  }

  public void onResume()
  {
    AppMethodBeat.i(88125);
    super.onResume();
    AppMethodBeat.o(88125);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(88131);
    ab.i("MicroMsg.CardConsumeSuccessUI", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2 + " scene cmd is " + paramm.getType());
    fE(false);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof com.tencent.mm.plugin.card.sharecard.model.g))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.g)paramm;
        if (paramString.kdT == 0)
        {
          com.tencent.mm.ui.base.h.bQ(this, getString(2131297798));
          setResult(-1);
          this.kgI.setEnabled(false);
          l.beD();
          ab.i("MicroMsg.CardConsumeSuccessUI", "finish UI!");
          sW(-1);
          paramString = ((com.tencent.mm.plugin.card.sharecard.model.g)paramm).kdS;
          paramm = new ShareCardInfo();
          com.tencent.mm.plugin.card.d.f.a(paramm, paramString);
          l.a(paramm);
          am.bbd().aVU();
          finish();
          AppMethodBeat.o(88131);
        }
      }
    while (true)
    {
      return;
      ab.e("MicroMsg.CardConsumeSuccessUI", "shareNetscene.getRetCode() is " + paramString.kdT);
      com.tencent.mm.plugin.card.d.d.c(this, paramString.kdU);
      com.tencent.mm.ui.base.h.bQ(this, getString(2131297794));
      AppMethodBeat.o(88131);
      continue;
      if ((paramm instanceof com.tencent.mm.plugin.card.sharecard.model.d))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.d)paramm;
        if (paramString.kdT == 0)
        {
          if ((!TextUtils.isEmpty(paramString.kdS)) && (GM(paramString.kdS)))
          {
            ab.i("MicroMsg.CardConsumeSuccessUI", "consumed return json is valid, update ui");
            this.ilv.post(new CardConsumeSuccessUI.3(this));
            AppMethodBeat.o(88131);
          }
          else
          {
            ab.e("MicroMsg.CardConsumeSuccessUI", "consumed return json is empty, finish ui!");
            if (this.kgN == 1)
            {
              sW(0);
              finish();
              AppMethodBeat.o(88131);
            }
            else
            {
              bbE();
              GO(paramString.kdU);
              if (bo.isNullOrNil(paramString.kdU))
              {
                com.tencent.mm.ui.base.h.bQ(this, getString(2131297796));
                AppMethodBeat.o(88131);
              }
              else
              {
                com.tencent.mm.ui.base.h.bQ(this, paramString.kdU);
                AppMethodBeat.o(88131);
              }
            }
          }
        }
        else if (this.kgN == 1)
        {
          sW(0);
          finish();
          AppMethodBeat.o(88131);
        }
        else
        {
          ab.e("MicroMsg.CardConsumeSuccessUI", "succScene.getRetCode() is " + paramString.kdT);
          bbE();
          GO(paramString.kdU);
          AppMethodBeat.o(88131);
          continue;
          if (((paramm instanceof com.tencent.mm.plugin.card.sharecard.model.d)) && (this.kgN == 1))
          {
            sW(0);
            finish();
            AppMethodBeat.o(88131);
          }
          else
          {
            com.tencent.mm.plugin.card.d.d.c(this, paramString);
          }
        }
      }
      else
      {
        AppMethodBeat.o(88131);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI
 * JD-Core Version:    0.6.2
 */