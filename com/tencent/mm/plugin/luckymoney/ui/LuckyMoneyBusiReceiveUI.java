package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.m.g;
import com.tencent.mm.plugin.luckymoney.model.ac;
import com.tencent.mm.plugin.luckymoney.model.ad;
import com.tencent.mm.plugin.luckymoney.model.af;
import com.tencent.mm.plugin.luckymoney.model.ar;
import com.tencent.mm.plugin.luckymoney.model.k;
import com.tencent.mm.plugin.luckymoney.model.s;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.luckymoney.model.y;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.a;
import java.io.IOException;

@a(3)
public class LuckyMoneyBusiReceiveUI extends LuckyMoneyBaseUI
{
  private TextView nSD;
  private ImageView nSM;
  private TextView nTD;
  private Button nTE;
  private View nTI;
  private ImageView nVJ;
  private String ocI = null;
  private String ocK = null;
  private int ocM = 0;
  private TextView ocU;
  private TextView ocV;
  private View ocW;
  private ImageView ocX;
  private TextView ocY;
  private View ocZ;
  private TextView oda;
  private Button odb;
  private TextView odc;
  private CheckBox odd;
  private int ode;
  private String odf = null;
  private int odg = 0;
  private ad odh;
  private RealnameGuideHelper odi;
  private p tipDialog = null;

  private void aO(int paramInt, String paramString)
  {
    AppMethodBeat.i(42634);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyBusiReceiveUI", "markResult resultCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    Intent localIntent = new Intent();
    localIntent.putExtra("key_result_errmsg", paramString);
    setResult(paramInt, localIntent);
    AppMethodBeat.o(42634);
  }

  private void init()
  {
    AppMethodBeat.i(42628);
    this.tipDialog = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131300968), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(42616);
        if ((LuckyMoneyBusiReceiveUI.a(LuckyMoneyBusiReceiveUI.this) != null) && (LuckyMoneyBusiReceiveUI.a(LuckyMoneyBusiReceiveUI.this).isShowing()))
          LuckyMoneyBusiReceiveUI.a(LuckyMoneyBusiReceiveUI.this).dismiss();
        LuckyMoneyBusiReceiveUI.this.ocz.bLz();
        if ((LuckyMoneyBusiReceiveUI.b(LuckyMoneyBusiReceiveUI.this).getVisibility() == 8) || (LuckyMoneyBusiReceiveUI.c(LuckyMoneyBusiReceiveUI.this).getVisibility() == 4))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyBusiReceiveUI", "user cancel & finish");
          LuckyMoneyBusiReceiveUI.this.finish();
        }
        AppMethodBeat.o(42616);
      }
    });
    if (this.ode == 3)
      b(new com.tencent.mm.plugin.luckymoney.model.ab(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url")), false);
    while (true)
    {
      aO(0, "");
      AppMethodBeat.o(42628);
      return;
      if (this.ode == 4)
      {
        b(new com.tencent.mm.plugin.luckymoney.model.ab(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("key_wxapi_sign"), getIntent().getStringExtra("key_wxapi_package_name")), false);
        continue;
      }
      try
      {
        this.ocI = Uri.parse(bo.nullAsNil(this.ocK)).getQueryParameter("sendid");
        label244: if (!bo.isNullOrNil(this.ocI))
        {
          b(new ad(this.ocI, this.ocK, this.ode, getIntent().getStringExtra("packageExt")), false);
          continue;
        }
        finish();
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.LuckyMoneyBusiReceiveUI", "sendid null & finish");
      }
      catch (Exception localException)
      {
        break label244;
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(42632);
    boolean bool;
    if ((paramm instanceof ad))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label1781;
      this.odh = ((ad)paramm);
      this.ocI = this.odh.nSX;
      this.odg = this.odh.cRT;
      com.tencent.mm.plugin.report.service.h.pYm.e(13050, new Object[] { Integer.valueOf(this.ocM), Integer.valueOf(1), this.odh.nYl });
      if (this.odh.cRV == 2)
      {
        aO(-1, "");
        b(new af(this.ocI, 11, 0, this.ocK, "v1.0"), false);
        bool = true;
        AppMethodBeat.o(42632);
      }
    }
    while (true)
    {
      return bool;
      if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
        this.tipDialog.hide();
      x.k(this.nSM, this.odh.nYp);
      x.a(this.mController.ylL, this.nTD, this.odh.nYf);
      x.h(this.ocX, this.odh.nXg);
      if ((this.odh.cRV != 1) && (this.odh.cRU != 4) && (this.odh.cRU != 5) && (this.odh.cRU != 1))
        if (!bo.isNullOrNil(this.odh.nYl))
        {
          this.odf = this.odh.nYl;
          if (this.odh.nYm == 1)
            this.odd.setVisibility(8);
        }
        else
        {
          this.nTE.setOnClickListener(new LuckyMoneyBusiReceiveUI.4(this));
          if (bo.isNullOrNil(this.odh.nWO))
            break label476;
          this.ocU.setText(this.odh.nWO);
          label352: if (bo.isNullOrNil(this.odh.nYq))
            break label488;
          this.ocV.setText(this.odh.nYq);
        }
      while (true)
      {
        x.a(this.nTI, null);
        this.mController.contentView.setVisibility(0);
        break;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyBusiReceiveUI", "show checkbox for " + this.odh.nYl);
        if (this.odh.nYj == 1)
          this.odd.setChecked(true);
        while (true)
        {
          this.odd.setText(this.odh.nYk);
          break;
          this.odd.setChecked(false);
        }
        label476: this.ocU.setVisibility(8);
        break label352;
        label488: this.ocV.setVisibility(8);
        continue;
        com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(11), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
        this.ocU.setVisibility(4);
        this.ocV.setText(this.odh.nWO);
        this.nTE.setVisibility(8);
        if (this.odg == 1)
        {
          this.ocY.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(42620);
              com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(11), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4) });
              paramAnonymousView = new Intent();
              paramAnonymousView.setClass(LuckyMoneyBusiReceiveUI.this.mController.ylL, LuckyMoneyBusiDetailUI.class);
              paramAnonymousView.putExtra("key_native_url", LuckyMoneyBusiReceiveUI.j(LuckyMoneyBusiReceiveUI.this));
              paramAnonymousView.putExtra("key_sendid", LuckyMoneyBusiReceiveUI.h(LuckyMoneyBusiReceiveUI.this).nSX);
              paramAnonymousView.putExtra("key_static_from_scene", LuckyMoneyBusiReceiveUI.g(LuckyMoneyBusiReceiveUI.this));
              LuckyMoneyBusiReceiveUI.this.startActivity(paramAnonymousView);
              LuckyMoneyBusiReceiveUI.this.finish();
              AppMethodBeat.o(42620);
            }
          });
          this.ocY.setVisibility(0);
        }
        else
        {
          this.ocY.setVisibility(8);
        }
      }
      if ((paramm instanceof ac))
      {
        x.d(this.nTE);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          aO(-1, "");
          paramm = (ac)paramm;
          if (paramm.cRV == 2)
          {
            if ((paramm.kCd <= 1) || ((paramm.nXd != null) && (paramm.nXd.erD != 1)))
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyBusiReceiveUI", "can not atomic go detail");
              paramString = new Intent();
              paramString.putExtra("key_sendid", paramm.nSX);
              paramString.putExtra("key_static_from_scene", this.ocM);
              if (paramm.nTN != null)
                paramString.putExtra("key_realname_guide_helper", paramm.nTN);
              try
              {
                paramString.putExtra("key_detail_info", paramm.nYn.toByteArray());
                paramString.putExtra("key_jump_from", 2);
                if (g.Nu().getInt("PlayCoinSound", 0) > 0)
                  paramString.putExtra("play_sound", true);
                d.b(this.mController.ylL, "luckymoney", ".ui.LuckyMoneyBusiDetailUI", paramString);
                finish();
                bool = true;
                AppMethodBeat.o(42632);
              }
              catch (IOException paramm)
              {
                while (true)
                  com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.LuckyMoneyBusiReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + paramm.getLocalizedMessage());
              }
            }
            else
            {
              paramString = findViewById(2131825420);
              TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, -paramString.getHeight());
              localTranslateAnimation.setDuration(400L);
              localTranslateAnimation.setFillAfter(true);
              localTranslateAnimation.setAnimationListener(new LuckyMoneyBusiReceiveUI.6(this, paramString));
              paramString.startAnimation(localTranslateAnimation);
              this.nSD.setText(com.tencent.mm.wallet_core.ui.e.F(paramm.cSh / 100.0D));
              this.nTD.setText(paramm.nYf);
              this.ocU.setVisibility(8);
              this.ocV.setVisibility(8);
              this.ocW.setVisibility(0);
              this.nTE.setVisibility(8);
              if (!bo.isNullOrNil(paramm.nYi))
              {
                paramString = paramm.nYi;
                label1018: this.odb.setText(paramString);
                this.odc.setVisibility(0);
                com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyBusiReceiveUI", "totalNum:" + paramm.kCd);
                if ((paramm.kCd <= 1) && ((paramm.nXd == null) || (paramm.nXd.erD != 1)))
                  break label1203;
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyBusiReceiveUI", "can atomic");
                this.odi = paramm.nTN;
                this.odb.setOnClickListener(new LuckyMoneyBusiReceiveUI.7(this, paramm));
                label1172: this.odb.setVisibility(0);
              }
            }
          }
          else
            while (true)
            {
              bool = true;
              AppMethodBeat.o(42632);
              break;
              paramString = getString(2131301198);
              break label1018;
              label1203: this.odb.setOnClickListener(new LuckyMoneyBusiReceiveUI.8(this));
              break label1172;
              this.ocU.setVisibility(4);
              this.ocV.setText(paramm.nWO);
              this.nTE.setVisibility(8);
              if (this.odg == 1)
              {
                this.ocY.setOnClickListener(new LuckyMoneyBusiReceiveUI.9(this, paramm));
                this.ocY.setVisibility(0);
              }
              else
              {
                this.ocY.setVisibility(8);
              }
            }
        }
        else if (paramInt2 == 416)
        {
          if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
            this.tipDialog.hide();
          paramString = new Bundle();
          paramString.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiReceiveUI");
          paramString.putString("realname_verify_process_jump_plugin", "luckymoney");
          this.nTE.setBackgroundResource(2130838808);
          new LuckyMoneyBusiReceiveUI.10(this);
          bool = x.a(this, paramInt2, paramm, paramString, false, new c.a()
          {
            public final Intent n(int paramAnonymousInt, Bundle paramAnonymousBundle)
            {
              AppMethodBeat.i(42617);
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyBusiReceiveUI", "re");
              AppMethodBeat.o(42617);
              return null;
            }
          }
          , 1005);
          AppMethodBeat.o(42632);
        }
      }
      else if ((paramm instanceof ar))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.ui.base.h.bQ(this, getString(2131300520));
          com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(4) });
          finish();
          bool = true;
          AppMethodBeat.o(42632);
        }
        else
        {
          com.tencent.mm.ui.base.h.bQ(this, paramString);
          bool = true;
          AppMethodBeat.o(42632);
        }
      }
      else if ((paramm instanceof com.tencent.mm.plugin.luckymoney.model.ab))
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          n(new ad(this.ocI, this.ocK, this.ode, getIntent().getStringExtra("packageExt")));
          bool = true;
          AppMethodBeat.o(42632);
        }
      }
      else if ((paramm instanceof y))
      {
        bool = true;
        AppMethodBeat.o(42632);
      }
      else if ((paramm instanceof af))
      {
        if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
          this.tipDialog.hide();
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramm = (af)paramm;
          paramString = new Intent();
          paramString.setClass(this.mController.ylL, LuckyMoneyBusiDetailUI.class);
          try
          {
            paramString.putExtra("key_detail_info", paramm.nYn.toByteArray());
            paramString.putExtra("key_jump_from", 2);
            paramString.putExtra("key_native_url", this.ocK);
            paramString.putExtra("key_sendid", this.ocI);
            paramString.putExtra("key_static_from_scene", this.ocM);
            startActivity(paramString);
            finish();
            bool = true;
            AppMethodBeat.o(42632);
          }
          catch (IOException paramm)
          {
            while (true)
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.LuckyMoneyBusiReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + paramm.getLocalizedMessage());
          }
        }
      }
      else
      {
        label1781: if ((paramInt1 != 0) || (paramInt2 != 0))
          aO(2, paramString);
        bool = false;
        AppMethodBeat.o(42632);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969971;
  }

  public final void initView()
  {
    AppMethodBeat.i(42631);
    this.nTI = findViewById(2131825419);
    this.nSM = ((ImageView)findViewById(2131825422));
    this.nTD = ((TextView)findViewById(2131825423));
    this.ocV = ((TextView)findViewById(2131825431));
    this.ocU = ((TextView)findViewById(2131825424));
    this.nTE = ((Button)findViewById(2131825432));
    this.nVJ = ((ImageView)findViewById(2131825436));
    this.ocW = findViewById(2131825428);
    this.nSD = ((TextView)findViewById(2131825429));
    this.ocX = ((ImageView)findViewById(2131825421));
    this.ocY = ((TextView)findViewById(2131825435));
    this.ocZ = findViewById(2131825425);
    this.oda = ((TextView)findViewById(2131825426));
    this.odb = ((Button)findViewById(2131825433));
    this.odc = ((TextView)findViewById(2131825430));
    this.odd = ((CheckBox)findViewById(2131825434));
    this.nVJ.setOnClickListener(new LuckyMoneyBusiReceiveUI.3(this));
    AM(8);
    AppMethodBeat.o(42631);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(42633);
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(42633);
      return;
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        String str = paramIntent.getStringExtra("Select_Conv_User");
        com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(12), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3), str });
        if (!bo.isNullOrNil(str))
          n(new ar(str, this.ocI, "v1.0"));
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42627);
    super.onCreate(paramBundle);
    this.ocK = getIntent().getStringExtra("key_native_url");
    this.ode = getIntent().getIntExtra("key_way", 5);
    this.ocM = getIntent().getIntExtra("key_static_from_scene", 0);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyBusiReceiveUI", "nativeurl=" + bo.nullAsNil(this.ocK) + ", mWay=" + this.ode);
    init();
    com.tencent.mm.plugin.report.service.h.pYm.e(11701, new Object[] { Integer.valueOf(10), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    initView();
    nf(980);
    AppMethodBeat.o(42627);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42630);
    super.onDestroy();
    if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
      this.tipDialog.dismiss();
    ng(980);
    AppMethodBeat.o(42630);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(42629);
    if ((paramIntent != null) && (paramIntent.hasExtra("key_is_realname_verify_process")))
      if (paramIntent.getIntExtra("realname_verify_process_ret", 0) == -1)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyBusiReceiveUI", "new intent from realname verify process succ");
        init();
        AppMethodBeat.o(42629);
      }
    while (true)
    {
      return;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.LuckyMoneyBusiReceiveUI", "new intent from realname verify process cancel");
      aO(-1, "");
      finish();
      AppMethodBeat.o(42629);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI
 * JD-Core Version:    0.6.2
 */