package com.tencent.mm.plugin.offline.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cm;
import com.tencent.mm.g.a.lf;
import com.tencent.mm.g.a.lg;
import com.tencent.mm.g.a.lu;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.g.a.us;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.platformtools.x.a;
import com.tencent.mm.plugin.offline.a.n;
import com.tencent.mm.plugin.offline.a.s;
import com.tencent.mm.plugin.offline.a.s.a;
import com.tencent.mm.plugin.offline.a.s.b;
import com.tencent.mm.plugin.offline.a.s.c;
import com.tencent.mm.plugin.offline.a.s.d;
import com.tencent.mm.plugin.offline.a.s.e;
import com.tencent.mm.plugin.offline.a.s.f;
import com.tencent.mm.plugin.offline.a.s.g;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ac;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.bc.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.kernel.i
public class WalletOfflineCoinPurseUI extends WalletBaseUI
  implements x.a, s.a, com.tencent.mm.plugin.offline.b, a, bc.a
{
  private static int jpc = 0;
  private int emC;
  private View.OnClickListener gKK;
  private int gwj;
  private boolean kXv;
  private boolean kjx;
  private int lTe;
  private long mLastTime;
  private int mState;
  private String oWS;
  private ap oXA;
  private String oXv;
  private com.tencent.mm.plugin.offline.a.m oXx;
  private int oXz;
  Bitmap oZA;
  private WalletOfflineCoinPurseUI.a oZB;
  private boolean oZC;
  private boolean oZD;
  private ArrayList<String> oZE;
  private ArrayList<String> oZF;
  private ArrayList<Boolean> oZG;
  private View oZH;
  private ImageView oZI;
  private ImageView oZJ;
  private TextView oZK;
  private String oZL;
  private View oZM;
  private TextView oZN;
  private ImageView oZO;
  private RelativeLayout oZP;
  private LinearLayout oZQ;
  private LinearLayout oZR;
  private LinearLayout oZS;
  private LinearLayout oZT;
  private LinearLayout oZU;
  private Dialog oZV;
  private String oZW;
  private boolean oZX;
  private com.tencent.mm.plugin.offline.g oZY;
  private boolean oZZ;
  private HashMap<String, View> oZx;
  private HashMap<String, Integer> oZy;
  Bitmap oZz;
  private boolean paa;
  private boolean pab;
  private boolean pac;
  private ArrayList<Bitmap> pad;
  private ArrayList<Bitmap> pae;
  private com.tencent.mm.wallet_core.ui.c paf;
  private c pag;
  private OfflineAlertView pah;
  private boolean pai;
  com.tencent.mm.sdk.b.c<uv> paj;
  private com.tencent.mm.sdk.b.c<cm> pak;
  private com.tencent.mm.sdk.b.c<lu> pal;
  private com.tencent.mm.sdk.b.c<lf> pam;
  private com.tencent.mm.sdk.b.c<lg> pan;
  private com.tencent.mm.sdk.b.c pao;
  private com.tencent.mm.sdk.b.c pap;
  private com.tencent.mm.sdk.b.c paq;
  public boolean par;
  private HashMap<String, Integer> pas;
  private ap pat;
  private ap pau;

  public WalletOfflineCoinPurseUI()
  {
    AppMethodBeat.i(43561);
    this.mLastTime = 0L;
    this.mState = 3;
    this.oZx = new HashMap();
    this.oZy = new HashMap();
    this.gwj = -1;
    this.oZz = null;
    this.oZA = null;
    this.oZC = false;
    this.oZD = false;
    this.oZE = new ArrayList();
    this.oZF = new ArrayList();
    this.oZG = new ArrayList();
    this.oWS = "";
    this.oZW = "";
    this.oXv = "";
    this.kjx = true;
    this.oZX = false;
    this.oZZ = false;
    this.paa = false;
    this.pab = false;
    this.pac = false;
    this.pad = new ArrayList();
    this.pae = new ArrayList();
    this.pai = false;
    this.paj = new com.tencent.mm.sdk.b.c()
    {
    };
    this.pak = new WalletOfflineCoinPurseUI.12(this);
    this.pal = new WalletOfflineCoinPurseUI.23(this);
    this.pam = new WalletOfflineCoinPurseUI.36(this);
    this.pan = new WalletOfflineCoinPurseUI.37(this);
    this.pao = new WalletOfflineCoinPurseUI.38(this);
    this.pap = new com.tencent.mm.sdk.b.c()
    {
    };
    this.paq = new WalletOfflineCoinPurseUI.40(this);
    this.gKK = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(43521);
        long l;
        if ((paramAnonymousView.getId() == 2131828886) || (paramAnonymousView.getId() == 2131828885) || (paramAnonymousView.getId() == 2131828884))
        {
          if ((paramAnonymousView.getId() == 2131828886) && (WalletOfflineCoinPurseUI.t(WalletOfflineCoinPurseUI.this) != null) && (WalletOfflineCoinPurseUI.t(WalletOfflineCoinPurseUI.this).isShowing()))
          {
            ab.i("MicroMsg.WalletOfflineCoinPurseUI", "offlineAlertView is showing");
            AppMethodBeat.o(43521);
            return;
          }
          l = System.currentTimeMillis();
          if (((WalletOfflineCoinPurseUI.t(WalletOfflineCoinPurseUI.this) == null) || (!WalletOfflineCoinPurseUI.t(WalletOfflineCoinPurseUI.this).isShowing())) && (l - WalletOfflineCoinPurseUI.u(WalletOfflineCoinPurseUI.this) >= 400L) && (com.tencent.mm.plugin.offline.c.a.bYd()) && (!WalletOfflineCoinPurseUI.v(WalletOfflineCoinPurseUI.this)))
          {
            if (paramAnonymousView.getId() != 2131828886)
              break label206;
            WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, false);
          }
        }
        while (true)
        {
          if (WalletOfflineCoinPurseUI.w(WalletOfflineCoinPurseUI.this) != null)
          {
            WalletOfflineCoinPurseUI.x(WalletOfflineCoinPurseUI.this);
            WalletOfflineCoinPurseUI.w(WalletOfflineCoinPurseUI.this).G(paramAnonymousView, WalletOfflineCoinPurseUI.y(WalletOfflineCoinPurseUI.this));
          }
          WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, l);
          AppMethodBeat.o(43521);
          break;
          label206: if ((paramAnonymousView.getId() == 2131828885) || (paramAnonymousView.getId() == 2131828884))
          {
            com.tencent.mm.plugin.report.service.h.pYm.e(13958, new Object[] { Integer.valueOf(4) });
            WalletOfflineCoinPurseUI.a(WalletOfflineCoinPurseUI.this, true);
          }
        }
      }
    };
    this.par = false;
    this.pas = new HashMap();
    this.oXz = 60000;
    this.oXA = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(43542);
        if (!WalletOfflineCoinPurseUI.L(WalletOfflineCoinPurseUI.this))
        {
          WalletOfflineCoinPurseUI.C(WalletOfflineCoinPurseUI.this);
          WalletOfflineCoinPurseUI.D(WalletOfflineCoinPurseUI.this);
        }
        ap localap = WalletOfflineCoinPurseUI.N(WalletOfflineCoinPurseUI.this);
        long l = WalletOfflineCoinPurseUI.M(WalletOfflineCoinPurseUI.this);
        localap.ae(l, l);
        AppMethodBeat.o(43542);
        return false;
      }
    }
    , false);
    this.pat = new ap(new WalletOfflineCoinPurseUI.33(this), false);
    this.pau = new ap(new WalletOfflineCoinPurseUI.35(this), false);
    AppMethodBeat.o(43561);
  }

  private void Az(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(43586);
    if (!com.tencent.mm.plugin.offline.c.a.bYd())
    {
      ab.w("MicroMsg.WalletOfflineCoinPurseUI", "offline is not create!");
      AppMethodBeat.o(43586);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.offline.k.bXg();
      Object localObject = com.tencent.mm.plugin.offline.k.bXi().q(this.gwj, paramInt, this.oZL);
      this.oXv = ((String)localObject);
      this.oZW = ((String)localObject);
      ab.v("MicroMsg.WalletOfflineCoinPurseUI", "updateCode isSnapshot:%s mBarcode:%s mQRcode:%s stack: %s", new Object[] { Integer.valueOf(paramInt), this.oXv, this.oZW, bo.dpG().toString() });
      bhw();
      if (bo.isNullOrNil((String)localObject))
      {
        localObject = com.tencent.mm.plugin.report.service.h.pYm;
        if (com.tencent.mm.plugin.offline.c.a.eA(ah.getContext()));
        for (paramInt = 0; ; paramInt = 1)
        {
          if (at.isNetworkConnected(getBaseContext()))
            i = 1;
          ((com.tencent.mm.plugin.report.service.h)localObject).e(14163, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt), Integer.valueOf(i) });
          com.tencent.mm.plugin.report.service.h.pYm.a(135L, 26L, 1L, true);
          if (!at.isNetworkConnected(getBaseContext()))
            break label225;
          com.tencent.mm.plugin.report.service.h.pYm.a(135L, 28L, 1L, true);
          AppMethodBeat.o(43586);
          break;
        }
        label225: com.tencent.mm.plugin.report.service.h.pYm.a(135L, 27L, 1L, true);
      }
      AppMethodBeat.o(43586);
    }
  }

  private void E(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(43576);
    if (com.tencent.mm.plugin.offline.c.a.jH(true).size() > 0)
    {
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshUI tempList size > 0");
      bXN();
      bXM();
      this.oZM.setVisibility(0);
    }
    while (true)
    {
      if (paramBoolean1)
        Az(0);
      jG(paramBoolean2);
      bcQ();
      bXD();
      AppMethodBeat.o(43576);
      return;
      this.oZM.setVisibility(0);
      ab.e("MicroMsg.WalletOfflineCoinPurseUI", "refreshUI tempList== null or size is 0");
    }
  }

  private void a(Bankcard paramBankcard)
  {
    AppMethodBeat.i(43606);
    if (TextUtils.isEmpty(this.oWS))
    {
      ab.e("MicroMsg.WalletOfflineCoinPurseUI", "updateBankLogo() mBindSerial is null");
      AppMethodBeat.o(43606);
    }
    while (true)
    {
      return;
      if (paramBankcard.cPg())
      {
        ab.i("MicroMsg.WalletOfflineCoinPurseUI", "show local hy logo");
        this.oZO.setImageDrawable(com.tencent.mm.svg.a.a.f(this.mController.ylL.getResources(), 2131231368));
        AppMethodBeat.o(43606);
      }
      else
      {
        String str1 = com.tencent.mm.plugin.offline.c.a.Ul(this.oWS);
        String str2 = str1;
        if (paramBankcard.cPd())
        {
          str2 = str1;
          if (paramBankcard.txc != null)
            str2 = paramBankcard.txc.oRi;
        }
        if (TextUtils.isEmpty(str2))
        {
          ab.e("MicroMsg.WalletOfflineCoinPurseUI", "updateBankLogo() icon_url == null, can not find this icon_url");
          AppMethodBeat.o(43606);
        }
        else
        {
          e(this.oZO, str2, getResources().getDimensionPixelOffset(2131428760));
          AppMethodBeat.o(43606);
        }
      }
    }
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    AppMethodBeat.i(43572);
    if (((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTP, Boolean.FALSE)).booleanValue())
    {
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "no need scroll");
      AppMethodBeat.o(43572);
    }
    while (true)
    {
      return;
      getWindow().getDecorView().post(new WalletOfflineCoinPurseUI.6(this, paramBoolean1, paramBoolean4, paramBoolean2, paramBoolean3, paramBoolean5));
      AppMethodBeat.o(43572);
    }
  }

  private void bLh()
  {
    AppMethodBeat.i(43580);
    Bitmap localBitmap = this.oZz;
    this.oZz = bXJ();
    this.oZI.setImageBitmap(this.oZz);
    if (bXF())
      this.oZI.setAlpha(10);
    while (true)
    {
      this.pad.add(0, localBitmap);
      AppMethodBeat.o(43580);
      return;
      this.oZI.setAlpha(255);
    }
  }

  private void bXA()
  {
    AppMethodBeat.i(43571);
    bXE();
    E(true, false);
    AppMethodBeat.o(43571);
  }

  private void bXB()
  {
    AppMethodBeat.i(43573);
    this.oZQ = ((LinearLayout)findViewById(2131828892));
    this.oZR = ((LinearLayout)findViewById(2131828898));
    this.oZS = ((LinearLayout)findViewById(2131828900));
    this.oZT = ((LinearLayout)findViewById(2131828896));
    this.oZU = ((LinearLayout)findViewById(2131828902));
    if ((this.gwj == 3) || (this.gwj == 10) || (this.gwj == 11) || (this.gwj == 12))
    {
      this.oZQ.setVisibility(8);
      this.oZR.setVisibility(8);
      this.oZS.setVisibility(8);
      this.oZT.setVisibility(8);
      AppMethodBeat.o(43573);
      return;
    }
    this.oZT.setVisibility(0);
    this.oZU.setVisibility(0);
    boolean bool1 = com.tencent.mm.x.c.PK().b(ac.a.xTK, ac.a.xSL);
    boolean bool2 = com.tencent.mm.x.c.PK().b(ac.a.xTL, ac.a.xSL);
    boolean bool3 = com.tencent.mm.x.c.PK().b(ac.a.xTM, ac.a.xSL);
    boolean bool4 = com.tencent.mm.x.c.PK().b(ac.a.xTN, ac.a.xSL);
    boolean bool5 = com.tencent.mm.x.c.PK().b(ac.a.xTO, ac.a.xSL);
    final ImageView localImageView1 = (ImageView)this.oZR.findViewById(2131828899);
    ImageView localImageView2 = (ImageView)this.oZQ.findViewById(2131828893);
    ImageView localImageView3 = (ImageView)this.oZS.findViewById(2131828901);
    ImageView localImageView4 = (ImageView)this.oZT.findViewById(2131828897);
    TextView localTextView = (TextView)this.oZQ.findViewById(2131828894);
    ImageView localImageView5 = (ImageView)this.oZQ.findViewById(2131828895);
    ImageView localImageView6 = (ImageView)this.oZU.findViewById(2131828903);
    if (bool1)
      localImageView1.setVisibility(0);
    if (bool2)
    {
      com.tencent.mm.kernel.g.RQ();
      String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTb, "");
      if (bo.isNullOrNil(str))
        break label547;
      localTextView.setText(str);
      localTextView.setVisibility(0);
      localImageView5.setVisibility(0);
    }
    while (true)
    {
      if (bool3)
        localImageView3.setVisibility(0);
      if (bool4)
        localImageView4.setVisibility(0);
      if (bool5)
        localImageView6.setVisibility(0);
      a(bool2, bool1, bool3, bool4, bool5);
      this.oZQ.setOnClickListener(new WalletOfflineCoinPurseUI.7(this, localImageView2, localTextView, localImageView5));
      this.oZR.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(43512);
          ab.i("MicroMsg.WalletOfflineCoinPurseUI", "click aa");
          com.tencent.mm.plugin.report.service.h.pYm.e(14021, new Object[] { Integer.valueOf(3), Integer.valueOf(WalletOfflineCoinPurseUI.p(WalletOfflineCoinPurseUI.this)) });
          paramAnonymousView = new Intent();
          if (WalletOfflineCoinPurseUI.c(WalletOfflineCoinPurseUI.this) == 1)
            paramAnonymousView.putExtra("enter_scene", 2);
          while (true)
          {
            com.tencent.mm.bp.d.b(WalletOfflineCoinPurseUI.this.mController.ylL, "aa", ".ui.AAEntranceUI", paramAnonymousView);
            if (com.tencent.mm.x.c.PK().b(ac.a.xTK, ac.a.xSL))
            {
              com.tencent.mm.x.c.PK().c(ac.a.xTK, ac.a.xSL);
              localImageView1.setVisibility(8);
              com.tencent.mm.plugin.report.service.h.pYm.e(14396, new Object[] { Integer.valueOf(4) });
            }
            AppMethodBeat.o(43512);
            return;
            if (WalletOfflineCoinPurseUI.c(WalletOfflineCoinPurseUI.this) == 2)
              paramAnonymousView.putExtra("enter_scene", 4);
            else
              ab.w("MicroMsg.WalletOfflineCoinPurseUI", "unknown scene: %s", new Object[] { Integer.valueOf(WalletOfflineCoinPurseUI.c(WalletOfflineCoinPurseUI.this)) });
          }
        }
      });
      this.oZS.setOnClickListener(new WalletOfflineCoinPurseUI.9(this, localImageView3));
      this.oZT.setOnClickListener(new WalletOfflineCoinPurseUI.10(this, localImageView4));
      this.oZU.setOnClickListener(new WalletOfflineCoinPurseUI.11(this, localImageView6));
      AppMethodBeat.o(43573);
      break;
      label547: localImageView2.setVisibility(0);
    }
  }

  private void bXC()
  {
    AppMethodBeat.i(43574);
    this.oZH = findViewById(2131828883);
    this.oZI = ((ImageView)findViewById(2131828886));
    this.oZJ = ((ImageView)findViewById(2131828885));
    this.oZK = ((TextView)findViewById(2131828884));
    this.oZM = findViewById(2131828887);
    this.oZN = ((TextView)findViewById(2131828889));
    this.oZO = ((ImageView)findViewById(2131828888));
    this.oZP = ((RelativeLayout)findViewById(2131828882));
    this.oZP.setOnClickListener(new WalletOfflineCoinPurseUI.13(this));
    this.oZI.setOnClickListener(this.gKK);
    this.oZJ.setOnClickListener(this.gKK);
    this.oZK.setOnClickListener(this.gKK);
    this.oZM.setClickable(true);
    this.oZM.setOnClickListener(new WalletOfflineCoinPurseUI.14(this));
    this.mLastTime = System.currentTimeMillis();
    AppMethodBeat.o(43574);
  }

  private void bXD()
  {
    AppMethodBeat.i(43577);
    if ((!this.par) && (!at.isNetworkConnected(getBaseContext())))
    {
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.bXi();
      if (com.tencent.mm.plugin.offline.e.bWZ() == 0)
      {
        this.par = true;
        b.T(this);
        ab.e("MicroMsg.WalletOfflineCoinPurseUI", "network disconnect and code count == 0");
      }
    }
    AppMethodBeat.o(43577);
  }

  private void bXE()
  {
    AppMethodBeat.i(43578);
    int i = com.tencent.mm.plugin.offline.c.a.bYi();
    Bankcard localBankcard = com.tencent.mm.plugin.offline.c.a.bYg();
    if (c.bXw())
    {
      this.mState = 7;
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FREEZE");
      AppMethodBeat.o(43578);
    }
    while (true)
    {
      return;
      if (!at.isNetworkConnected(getBaseContext()))
      {
        ab.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_DISCONNECT_NETWORK");
        this.mState = 6;
        AppMethodBeat.o(43578);
      }
      else if (com.tencent.mm.plugin.offline.c.a.bYd())
      {
        if (i == 0)
        {
          ab.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is create bindCount == 0");
          this.mState = 1;
          AppMethodBeat.o(43578);
        }
        else if ((i != 0) && (localBankcard == null))
        {
          ab.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is create bindCount != 0 && bankcard == null");
          this.mState = 2;
          AppMethodBeat.o(43578);
        }
        else
        {
          ab.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FEE_CAN_USE");
          this.mState = 5;
          AppMethodBeat.o(43578);
        }
      }
      else if (i == 0)
      {
        ab.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is not create bindCount == 0");
        this.mState = 1;
        AppMethodBeat.o(43578);
      }
      else if ((i != 0) && (localBankcard == null))
      {
        ab.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState offline is not create bindCount != 0 && bankcard == null");
        this.mState = 2;
        AppMethodBeat.o(43578);
      }
      else
      {
        ab.i("MicroMsg.WalletOfflineCoinPurseUI", "refreshState STATE_FEE_CAN_USE");
        this.mState = 5;
        AppMethodBeat.o(43578);
      }
    }
  }

  private boolean bXF()
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (this.mState != 2)
    {
      bool2 = bool1;
      if (this.mState != 1)
        if (this.mState != 7)
          break label35;
    }
    label35: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  private void bXG()
  {
    AppMethodBeat.i(43581);
    Bitmap localBitmap = this.oZA;
    this.oZA = bXI();
    this.oZJ.setImageBitmap(this.oZA);
    if (bXF())
      this.oZJ.setAlpha(10);
    while (true)
    {
      this.pae.add(0, localBitmap);
      AppMethodBeat.o(43581);
      return;
      this.oZJ.setAlpha(255);
    }
  }

  private void bXH()
  {
    AppMethodBeat.i(43582);
    if (this.paf != null)
    {
      this.paf.iw(this.oZW, this.oXv);
      this.paf.oZz = this.oZz;
      this.paf.oZA = this.oZA;
      this.paf.dOv();
    }
    AppMethodBeat.o(43582);
  }

  private Bitmap bXI()
  {
    AppMethodBeat.i(43584);
    Bitmap localBitmap;
    if (TextUtils.isEmpty(this.oXv))
    {
      ab.e("MicroMsg.WalletOfflineCoinPurseUI", "getBarcodeBitmap mBarcode == null");
      localBitmap = null;
      AppMethodBeat.o(43584);
    }
    while (true)
    {
      return localBitmap;
      localBitmap = com.tencent.mm.bw.a.a.b(this, this.oXv, 5, 0);
      AppMethodBeat.o(43584);
    }
  }

  private Bitmap bXJ()
  {
    AppMethodBeat.i(43585);
    Bitmap localBitmap;
    if (TextUtils.isEmpty(this.oZW))
    {
      ab.e("MicroMsg.WalletOfflineCoinPurseUI", "getBitmap mQRcode == null");
      localBitmap = null;
      AppMethodBeat.o(43585);
    }
    while (true)
    {
      return localBitmap;
      localBitmap = com.tencent.mm.bw.a.a.b(this, this.oZW, 12, 3);
      AppMethodBeat.o(43585);
    }
  }

  private void bXK()
  {
    AppMethodBeat.i(43589);
    if ((this.oZV != null) && (this.oZV.isShowing()))
      this.oZV.dismiss();
    AppMethodBeat.o(43589);
  }

  private void bXL()
  {
    AppMethodBeat.i(43590);
    a(new n(System.currentTimeMillis(), com.tencent.mm.plugin.offline.c.a.pbe), false, false);
    AppMethodBeat.o(43590);
  }

  private void bXN()
  {
    AppMethodBeat.i(43595);
    Bankcard localBankcard = com.tencent.mm.plugin.offline.c.a.bYf();
    if (localBankcard != null)
    {
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "initBindSerial() have bankcard");
      com.tencent.mm.plugin.offline.c.a.Ue(localBankcard.field_bindSerial);
      this.oWS = localBankcard.field_bindSerial;
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.bXi().oWS = this.oWS;
      AppMethodBeat.o(43595);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.WalletOfflineCoinPurseUI", "initBindSerial() fail,  bankcard == null");
      AppMethodBeat.o(43595);
    }
  }

  private void bXO()
  {
    AppMethodBeat.i(43596);
    if (this.oZZ)
      AppMethodBeat.o(43596);
    while (true)
    {
      return;
      if (!this.pah.Ay(4))
      {
        AppMethodBeat.o(43596);
      }
      else
      {
        com.tencent.mm.kernel.g.RQ();
        if ((!((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xOS, Boolean.FALSE)).booleanValue()) && (!this.pah.isShowing()))
          bXP();
        AppMethodBeat.o(43596);
      }
    }
  }

  private void bXP()
  {
    AppMethodBeat.i(43597);
    if (!this.pah.Ay(4))
      AppMethodBeat.o(43597);
    while (true)
    {
      return;
      this.pah.dq(this.oZH);
      AppMethodBeat.o(43597);
    }
  }

  private void bXQ()
  {
    AppMethodBeat.i(43598);
    if (!this.pah.Ay(1))
      AppMethodBeat.o(43598);
    while (true)
    {
      return;
      if (this.pah.oZe == 1)
        this.pah.dismiss();
      boolean bool1 = com.tencent.mm.plugin.wallet_core.model.r.cPI().cQi();
      boolean bool2 = com.tencent.mm.plugin.wallet_core.model.r.cPI().cQh();
      if ((bool1) || (bool2))
      {
        ab.i("MicroMsg.WalletOfflineCoinPurseUI", "unreg: %B, simplereg: %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        this.pah.a(this.oZH, new WalletOfflineCoinPurseUI.24(this), 1);
      }
      AppMethodBeat.o(43598);
    }
  }

  private void bXR()
  {
    AppMethodBeat.i(43599);
    if (!this.pah.Ay(3))
    {
      AppMethodBeat.o(43599);
      return;
    }
    if (this.pah.oZe == 3)
      this.pah.dismiss();
    com.tencent.mm.plugin.offline.k.bXg();
    String str1 = com.tencent.mm.plugin.offline.k.Ax(196617);
    com.tencent.mm.wallet_core.c.b.dNJ();
    boolean bool1 = com.tencent.mm.wallet_core.c.b.isCertExist(str1);
    boolean bool2 = com.tencent.mm.plugin.offline.c.a.bYd();
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "show unopened alert, %B, %B", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
    if ((!bool1) || (!bool2))
      if (!bool1)
      {
        com.tencent.mm.kernel.g.RQ();
        String str2 = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xIK, "");
        if ((str2 == null) || (!str2.equals(com.tencent.mm.compatible.e.q.LK())))
          break label214;
        ab.i("MicroMsg.WalletOfflineCoinPurseUI", " WalletOfflineEntranceUI iemi is same between create and getToken");
      }
    while (true)
    {
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "WalletOfflineEntranceUI CertUtil.getInstance().isCertExist(cn) is false ,cn == " + str1 + " ,recreate offline");
      com.tencent.mm.plugin.offline.c.a.bYo();
      this.pah.a(this.oZH, new WalletOfflineCoinPurseUI.25(this), 3);
      AppMethodBeat.o(43599);
      break;
      label214: ab.i("MicroMsg.WalletOfflineCoinPurseUI", " WalletOfflineEntranceUI iemi is diff between create and getToken");
    }
  }

  private void bXS()
  {
    AppMethodBeat.i(43600);
    if (!this.pah.Ay(5))
      AppMethodBeat.o(43600);
    while (true)
    {
      return;
      if (this.pah.oZe == 5)
        this.pah.dismiss();
      this.pah.b(this.oZH, new WalletOfflineCoinPurseUI.26(this));
      com.tencent.mm.plugin.report.service.h.pYm.a(135L, 73L, 1L, true);
      AppMethodBeat.o(43600);
    }
  }

  private void bXU()
  {
    AppMethodBeat.i(43602);
    if ((this.pah.isShowing()) && (this.pah.oZe == 5))
      this.pah.dismiss();
    AppMethodBeat.o(43602);
  }

  private boolean bXV()
  {
    boolean bool = false;
    AppMethodBeat.i(43603);
    if (!this.pah.Ay(2))
      AppMethodBeat.o(43603);
    while (true)
    {
      return bool;
      if (this.pah.oZe == 2)
        this.pah.dismiss();
      List localList = com.tencent.mm.plugin.offline.c.a.bYj();
      if (localList.size() <= 0)
      {
        ab.e("MicroMsg.WalletOfflineCoinPurseUI", "getBindBankCardList == null or size < 1");
        AppMethodBeat.o(43603);
      }
      else
      {
        for (int i = 0; ; i++)
        {
          if (i >= localList.size())
            break label141;
          Bankcard localBankcard = (Bankcard)localList.get(i);
          if ((localBankcard != null) && (localBankcard.field_support_micropay) && (bo.isNullOrNil(localBankcard.field_forbidWord)))
          {
            bool = true;
            AppMethodBeat.o(43603);
            break;
          }
        }
        label141: this.pah.dismiss();
        this.pah.a(this.oZH, new WalletOfflineCoinPurseUI.28(this), new WalletOfflineCoinPurseUI.29(this));
        AppMethodBeat.o(43603);
      }
    }
  }

  private void bXW()
  {
    AppMethodBeat.i(43604);
    if (!com.tencent.mm.plugin.offline.c.a.bYd())
    {
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "unOpen %s", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.offline.c.a.bYd()) });
      AppMethodBeat.o(43604);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.offline.c.a.jH(false).size() <= 0)
      {
        ab.e("MicroMsg.WalletOfflineCoinPurseUI", "getBindBankCardList == null or size < 1");
        this.oZN.setVisibility(8);
        AppMethodBeat.o(43604);
      }
      else
      {
        ArrayList localArrayList = ac.ne(true);
        com.tencent.mm.ui.widget.a.d locald = new com.tencent.mm.ui.widget.a.d(this, 2, true);
        int i = 0;
        int k;
        for (int j = 0; i < localArrayList.size(); j = k)
        {
          localObject = (Bankcard)localArrayList.get(i);
          k = j;
          if (!bo.isNullOrNil(((Bankcard)localObject).field_bindSerial))
          {
            k = j;
            if (this.oWS.equals(((Bankcard)localObject).field_bindSerial))
              k = i;
          }
          i++;
        }
        locald.rBl = new WalletOfflineCoinPurseUI.30(this, localArrayList, locald);
        locald.rBm = new WalletOfflineCoinPurseUI.31(this, locald, localArrayList);
        Object localObject = View.inflate(this, 2130971128, null);
        locald.pIf = true;
        locald.zQA = j;
        locald.zQy = true;
        locald.F((View)localObject, false);
        locald.cpD();
        com.tencent.mm.plugin.report.service.h.pYm.e(13955, new Object[] { Integer.valueOf(3) });
        AppMethodBeat.o(43604);
      }
    }
  }

  private static void bXX()
  {
    AppMethodBeat.i(43605);
    if (!com.tencent.mm.plugin.offline.c.a.bYw())
    {
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "WalletOfflineUtil.isSameMD5ForBindSerial() return false, token is invalid, do doNetSceneToken");
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.bXj().eO(3, 3);
    }
    AppMethodBeat.o(43605);
  }

  private void bXY()
  {
    AppMethodBeat.i(43611);
    if ((com.tencent.mm.plugin.offline.c.a.pbe == 3) && (com.tencent.mm.plugin.offline.c.a.pbh))
    {
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from card detail ui, is marked!");
      int i = com.tencent.mm.plugin.offline.c.a.pbf;
      long l1 = com.tencent.mm.plugin.offline.c.a.pbg;
      long l2 = System.currentTimeMillis();
      long l3 = i * 1000 + l1 - l2;
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "expire_time:" + i + " beginTime:" + l1 + " now:" + l2 + " interval:" + l3);
      if ((com.tencent.mm.plugin.offline.c.a.pbf > 0) && (com.tencent.mm.plugin.offline.c.a.pbg > 0L) && (l3 > 0L))
      {
        if (!this.pau.doT())
          this.pau.stopTimer();
        this.pau.ae(l3, l3);
        ab.i("MicroMsg.WalletOfflineCoinPurseUI", "start card expire timer!");
        AppMethodBeat.o(43611);
      }
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.WalletOfflineCoinPurseUI", "not to start card expire timer!");
      AppMethodBeat.o(43611);
      continue;
      if (com.tencent.mm.plugin.offline.c.a.pbe == 3)
      {
        ab.i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from card detail ui, not need to mark!");
        AppMethodBeat.o(43611);
      }
      else
      {
        ab.i("MicroMsg.WalletOfflineCoinPurseUI", "The scene is from %d, not need to start timer!", new Object[] { Integer.valueOf(com.tencent.mm.plugin.offline.c.a.pbe) });
        AppMethodBeat.o(43611);
      }
    }
  }

  private void bXy()
  {
    AppMethodBeat.i(43563);
    bXQ();
    bXV();
    bXR();
    bXO();
    AppMethodBeat.o(43563);
  }

  private void bXz()
  {
    AppMethodBeat.i(43565);
    com.tencent.mm.wallet_core.ui.e.QS(32);
    com.tencent.mm.pluginsdk.wallet.h.ai(this, this.lTe);
    AppMethodBeat.o(43565);
  }

  private void bcQ()
  {
    AppMethodBeat.i(43575);
    if (com.tencent.mm.plugin.offline.c.a.bYd())
    {
      this.oZP.setVisibility(0);
      AppMethodBeat.o(43575);
    }
    while (true)
    {
      return;
      this.oZP.setVisibility(4);
      AppMethodBeat.o(43575);
    }
  }

  private void bds()
  {
    AppMethodBeat.i(43583);
    int i;
    if (this.pad.size() >= 2)
      for (i = this.pad.size() - 1; i > 1; i--)
        com.tencent.mm.wallet_core.ui.e.K((Bitmap)this.pad.remove(i));
    if (this.pae.size() >= 2)
      for (i = this.pae.size() - 1; i > 1; i--)
        com.tencent.mm.wallet_core.ui.e.K((Bitmap)this.pae.remove(i));
    AppMethodBeat.o(43583);
  }

  private void bhw()
  {
    AppMethodBeat.i(43612);
    aw localaw = com.tencent.mm.plugin.wallet_core.model.k.cPy();
    Object localObject = new StringBuilder().append(this.oZW);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN();
    localObject = ag.ck(com.tencent.mm.a.p.getString(com.tencent.mm.kernel.a.QF()));
    if (localaw != null)
      com.tencent.mm.plugin.report.service.h.pYm.e(13444, new Object[] { localaw.vCF, localaw.vCG, Long.valueOf(localaw.vCE), localObject, localaw.vCH, localaw.vCI });
    AppMethodBeat.o(43612);
  }

  private void e(ImageView paramImageView, String paramString, int paramInt)
  {
    AppMethodBeat.i(43591);
    if ((paramImageView == null) || (TextUtils.isEmpty(paramString)))
      AppMethodBeat.o(43591);
    while (true)
    {
      return;
      Bitmap localBitmap = x.a(new com.tencent.mm.plugin.wallet_core.ui.view.c(paramString));
      if (localBitmap != null)
        paramImageView.setImageBitmap(com.tencent.mm.sdk.platformtools.d.a(localBitmap, paramInt, paramInt, true, false));
      this.oZx.put(paramString, paramImageView);
      this.oZy.put(paramString, Integer.valueOf(paramInt));
      AppMethodBeat.o(43591);
    }
  }

  private void jG(boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(43579);
    long l = System.currentTimeMillis();
    int j;
    if ((paramBoolean) && ((bo.isNullOrNil(this.oZW)) || (bo.isNullOrNil(this.oXv))))
    {
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "empty code!");
      bXS();
      bLh();
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "doRefresh cost time for fresh qrcode is " + (System.currentTimeMillis() - l));
      bXG();
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "doRefresh cost time for fresh is " + (System.currentTimeMillis() - l));
      bds();
      bXH();
      com.tencent.mm.wallet_core.c.z.hL(10, 0);
      com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
      if (!com.tencent.mm.plugin.offline.c.a.eA(ah.getContext()))
        break label276;
      j = 0;
      label142: if (at.isNetworkConnected(ah.getContext()))
        i = 1;
      com.tencent.mm.plugin.offline.k.bXg();
      com.tencent.mm.plugin.offline.k.bXi();
      localh.e(14163, new Object[] { Integer.valueOf(3), Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(com.tencent.mm.plugin.offline.e.bWZ()) });
      com.tencent.mm.plugin.report.service.h.pYm.a(135L, 67L, 1L, true);
      if (!at.isNetworkConnected(ah.getContext()))
        break label282;
      com.tencent.mm.plugin.report.service.h.pYm.a(135L, 32L, 1L, true);
      label241: if (!com.tencent.mm.plugin.offline.c.a.eA(this))
        break label299;
      com.tencent.mm.plugin.report.service.h.pYm.a(135L, 34L, 1L, true);
      AppMethodBeat.o(43579);
    }
    while (true)
    {
      return;
      bXU();
      break;
      label276: j = 1;
      break label142;
      label282: com.tencent.mm.plugin.report.service.h.pYm.a(135L, 33L, 1L, true);
      break label241;
      label299: com.tencent.mm.plugin.report.service.h.pYm.a(135L, 35L, 1L, true);
      AppMethodBeat.o(43579);
    }
  }

  public final boolean a(s.c paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(43587);
    if (paramc == null)
    {
      ab.e("MicroMsg.WalletOfflineCoinPurseUI", "onNotify msg == null");
      AppMethodBeat.o(43587);
      return bool;
    }
    bXK();
    this.paf.dismiss();
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "msgtype=" + paramc.oYS);
    int i;
    if (4 == paramc.oYS)
    {
      this.oZX = false;
      i = 0;
    }
    while (true)
    {
      label81: Object localObject1 = this.pag;
      if (paramc == null)
        ab.e("MicroMsg.OfflineLogicMgr", "onNotify msg == null");
      while (true)
      {
        if ((this.paa) && (!this.pab))
        {
          this.paa = false;
          this.oZX = false;
        }
        if (i != 0)
        {
          Az(0);
          jG(true);
        }
        AppMethodBeat.o(43587);
        bool = true;
        break;
        if (5 == paramc.oYS)
        {
          this.oZX = true;
          this.paa = true;
          this.pab = false;
          if (this.pat.doT())
            break label428;
          this.pat.stopTimer();
          i = 0;
          break label81;
        }
        if (6 == paramc.oYS)
        {
          if (!this.pat.doT())
            this.pat.stopTimer();
          if (!this.oXA.doT())
            this.oXA.stopTimer();
          this.oZX = false;
          if (!com.tencent.mm.plugin.offline.c.a.bYe())
            break label1454;
          i = 0;
          break label81;
        }
        if (8 == paramc.oYS)
        {
          if (this.pat.doT())
            break label1454;
          this.pat.stopTimer();
          i = 1;
          break label81;
        }
        if (23 == paramc.oYS)
        {
          if (this.pat.doT())
            break label428;
          this.pat.stopTimer();
          i = 0;
          break label81;
        }
        if (20 == paramc.oYS)
        {
          this.oZX = false;
          if (this.pat.doT())
            break label428;
          this.pat.stopTimer();
          i = 0;
          break label81;
        }
        if (24 != paramc.oYS)
          break label1454;
        if (com.tencent.mm.plugin.offline.c.a.bYE())
        {
          this.oZX = true;
          if (com.tencent.mm.plugin.offline.c.a.bYE())
          {
            if (this.oZV != null)
              break label433;
            this.oZV = com.tencent.mm.wallet_core.ui.g.a(this.mController.ylL, false, new WalletOfflineCoinPurseUI.18(this));
          }
        }
        while (true)
        {
          localObject1 = this.pat;
          long l = com.tencent.mm.plugin.offline.g.bXb();
          ((ap)localObject1).ae(l, l);
          label428: i = 0;
          break;
          label433: if (!this.oZV.isShowing())
            this.oZV.show();
        }
        ab.i("MicroMsg.OfflineLogicMgr", "onNotify OfflineMsg type :" + paramc.oYS);
        if (paramc.oYS == 24)
          ((c)localObject1).kgA.vibrate(50L);
        if (4 == paramc.oYS)
        {
          ((c)localObject1).a((s.b)paramc);
          com.tencent.mm.plugin.offline.g.bXc();
        }
        else
        {
          if (5 == paramc.oYS)
          {
            paramc = (s.e)paramc;
            if (paramc != null)
            {
              ab.i("MicroMsg.OfflineLogicMgr", "showNotifyMsg msg.wxRetCode:" + paramc.oYV + " msg.wxRetMsg:" + paramc.oYW + " msg.cftRetCode:" + paramc.oYV + " msg.cftRetMsg:" + paramc.oYU);
              if ((!TextUtils.isEmpty(paramc.oYV)) || (!TextUtils.isEmpty(paramc.oYW)) || (!TextUtils.isEmpty(paramc.oYT)) || (!TextUtils.isEmpty(paramc.oYU)))
              {
                if ((!TextUtils.isEmpty(paramc.oYV)) || (!TextUtils.isEmpty(paramc.oYW)) || (TextUtils.isEmpty(paramc.oYT)) || (TextUtils.isEmpty(paramc.oYU)))
                  break label714;
                b.b(((c)localObject1).mActivity, paramc.oYU);
              }
            }
            while (true)
            {
              com.tencent.mm.plugin.offline.g.bXc();
              com.tencent.mm.plugin.report.service.h.pYm.a(135L, 0L, 1L, true);
              break;
              label714: if ((!TextUtils.isEmpty(paramc.oYV)) && (com.tencent.mm.plugin.offline.c.a.isNumeric(paramc.oYV)))
                ((c)localObject1).a(null, Integer.valueOf(paramc.oYV).intValue(), paramc.oYW, paramc.oYX);
              else
                b.b(((c)localObject1).mActivity, paramc.oYW);
            }
          }
          Object localObject2;
          if (6 == paramc.oYS)
          {
            paramc = (s.f)paramc;
            int j;
            if (paramc != null)
            {
              ab.i("MicroMsg.OfflineLogicMgr", "showOrderSuccessUI transid : " + paramc.oYZ);
              com.tencent.mm.plugin.offline.k.bXg();
              localObject2 = com.tencent.mm.plugin.offline.k.bXk().TY(paramc.oZa.czZ);
              if (localObject2 == null)
                break label957;
              if (((com.tencent.mm.plugin.offline.a.r)localObject2).field_status != com.tencent.mm.plugin.offline.g.oXg)
                break label951;
              j = 1;
            }
            while (true)
            {
              if (j == 0)
              {
                com.tencent.mm.plugin.offline.g.cM(paramc.oZa.czZ, com.tencent.mm.plugin.offline.g.oXg);
                com.tencent.mm.plugin.offline.c.a.a(((c)localObject1).mActivity, paramc);
                ((c)localObject1).mActivity.setResult(-1);
                ((c)localObject1).mActivity.finish();
              }
              com.tencent.mm.plugin.offline.g.bXc();
              com.tencent.mm.plugin.report.service.h.pYm.a(135L, 7L, 1L, true);
              if (com.tencent.mm.plugin.offline.c.a.pbe != 4)
                break;
              ab.i("MicroMsg.OfflineLogicMgr", "hy: is from ext");
              com.tencent.mm.plugin.report.service.h.pYm.e(13412, new Object[0]);
              break;
              label951: j = 0;
              continue;
              label957: j = 0;
            }
          }
          Object localObject3;
          if (8 == paramc.oYS)
          {
            paramc = (s.g)paramc;
            ab.i("MicroMsg.OfflineLogicMgr", "showPayConfirmMsg msg id:" + paramc.id);
            if (paramc.kKC == 0)
            {
              localObject3 = ((c)localObject1).mActivity.getLayoutInflater().inflate(2130971135, null);
              localObject2 = (TextView)((View)localObject3).findViewById(2131828916);
              TextView localTextView = (TextView)((View)localObject3).findViewById(2131828917);
              ((TextView)localObject2).setText(paramc.oZc);
              localTextView.setText(paramc.oZb);
              com.tencent.mm.plugin.offline.g.cM(paramc.cBT, com.tencent.mm.plugin.offline.g.oXi);
              com.tencent.mm.ui.base.h.a(((c)localObject1).mActivity, "", (View)localObject3, ((c)localObject1).getString(2131305458), ((c)localObject1).getString(2131296868), new c.11((c)localObject1, paramc), new c.12((c)localObject1, paramc));
            }
            else if (paramc.kKC == 1)
            {
              if (((c)localObject1).oZo != null)
                ((c)localObject1).oZo.show();
              com.tencent.mm.plugin.report.service.h.pYm.e(13955, new Object[] { Integer.valueOf(1) });
              ab.i("MicroMsg.OfflineLogicMgr", "launchPwdDialog msg id:" + paramc.id);
              com.tencent.mm.plugin.offline.g.cM(paramc.cBT, com.tencent.mm.plugin.offline.g.oXi);
              ((c)localObject1).oZo = com.tencent.mm.plugin.wallet_core.ui.q.a(((c)localObject1).mActivity, paramc.oZb, paramc.oZc, new c.13((c)localObject1, paramc), new c.14((c)localObject1), new c.15((c)localObject1, paramc));
              ((c)localObject1).oZo.qcc.setVisibility(0);
              ((c)localObject1).oZo.pUA.setVisibility(8);
            }
          }
          else
          {
            if (23 == paramc.oYS)
            {
              paramc = (s.d)paramc;
              localObject2 = new PayInfo();
              ((PayInfo)localObject2).czZ = paramc.cBT;
              ((PayInfo)localObject2).cIf = 8;
              ((PayInfo)localObject2).vwn = 1;
              ((PayInfo)localObject2).vwh = new Bundle();
              ((PayInfo)localObject2).vwh.putLong("extinfo_key_9", System.currentTimeMillis());
              paramc = new c.1((c)localObject1, (PayInfo)localObject2);
              com.tencent.mm.sdk.b.a.xxA.b(paramc);
              localObject3 = ((c)localObject1).mActivity;
              if (((c)localObject1).oZn == null);
              for (paramc = ""; ; paramc = ((c)localObject1).oZn.bXt())
              {
                com.tencent.mm.pluginsdk.wallet.h.a((Context)localObject3, false, "", paramc, (PayInfo)localObject2, "", new Intent(), 1);
                break;
              }
            }
            if (20 == paramc.oYS)
              com.tencent.mm.plugin.offline.g.bXc();
          }
        }
      }
      label1454: i = 1;
    }
  }

  public final void aNW()
  {
    AppMethodBeat.i(43593);
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "setScreenShotCallback");
    Az(1);
    jG(true);
    com.tencent.mm.wallet_core.ui.e.QS(40);
    com.tencent.mm.plugin.report.service.h.pYm.a(135L, 21L, 1L, true);
    if (this.paf.gKG.isShowing())
      if (this.paf.kjx)
      {
        this.paf.dOw();
        AppMethodBeat.o(43593);
      }
    while (true)
    {
      return;
      this.paf.dismiss();
      bXP();
      AppMethodBeat.o(43593);
    }
  }

  public final void addDialog(Dialog paramDialog)
  {
    AppMethodBeat.i(43588);
    if (((paramDialog instanceof com.tencent.mm.ui.widget.a.c)) && (this.paa))
    {
      this.pab = true;
      paramDialog.setOnDismissListener(new WalletOfflineCoinPurseUI.17(this, ((com.tencent.mm.ui.widget.a.c)paramDialog).zPV));
    }
    super.addDialog(paramDialog);
    AppMethodBeat.o(43588);
  }

  public final boolean bNf()
  {
    return false;
  }

  public final void bXM()
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(43594);
    Bankcard localBankcard = com.tencent.mm.plugin.offline.c.a.bYf();
    findViewById(2131828890).setVisibility(0);
    this.oZN.setTextSize(0, getResources().getDimensionPixelSize(2131427813));
    String str;
    Object localObject;
    if ((this.oZN != null) && (localBankcard != null))
    {
      str = getString(2131305431, new Object[] { localBankcard.field_desc });
      localObject = com.tencent.mm.plugin.wallet_core.model.r.cPI().cQC();
      if ((localObject == null) || (bo.isNullOrNil(localBankcard.field_forbidWord)))
        break label323;
      Iterator localIterator = ((List)localObject).iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localObject = (com.tencent.mm.plugin.wallet_core.model.c)localIterator.next();
      }
      while (!((com.tencent.mm.plugin.wallet_core.model.c)localObject).pbo.equals(localBankcard.field_bindSerial));
    }
    while (true)
    {
      if ((localObject != null) && (!bo.isNullOrNil(((com.tencent.mm.plugin.wallet_core.model.c)localObject).twE)))
      {
        localObject = localBankcard.field_desc + ((com.tencent.mm.plugin.wallet_core.model.c)localObject).twE;
        findViewById(2131828890).setVisibility(8);
        com.tencent.mm.plugin.report.service.h.pYm.e(14515, new Object[] { Integer.valueOf(2) });
        this.oZN.setTextSize(0, getResources().getDimensionPixelSize(2131427762));
      }
      while (true)
      {
        this.oZN.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mController.ylL, (CharSequence)localObject, this.oZN.getTextSize()));
        while (true)
        {
          if (localBankcard != null)
            a(localBankcard);
          if (i != 0)
            this.oZO.setImageResource(2131231247);
          AppMethodBeat.o(43594);
          return;
          i = j;
          if (localBankcard == null)
          {
            ab.e("MicroMsg.WalletOfflineCoinPurseUI", "setChangeBankcardText bankcard == null");
            i = j;
          }
        }
        localObject = str;
        i = 0;
      }
      label323: localObject = null;
    }
  }

  public final void bXT()
  {
    AppMethodBeat.i(43601);
    this.oZP.setVisibility(4);
    this.pah.a(this.oZH, new WalletOfflineCoinPurseUI.27(this));
    AppMethodBeat.o(43601);
  }

  public final void bXr()
  {
    AppMethodBeat.i(43609);
    bXW();
    AppMethodBeat.o(43609);
  }

  public final void bXs()
  {
    AppMethodBeat.i(43610);
    a(new com.tencent.mm.plugin.offline.a.j(""), false, false);
    AppMethodBeat.o(43610);
  }

  public final String bXt()
  {
    return this.oWS;
  }

  public final void bXu()
  {
    AppMethodBeat.i(43614);
    if (!this.oXA.doT())
      this.oXA.stopTimer();
    Az(0);
    jG(true);
    this.oZX = false;
    ap localap = this.oXA;
    long l = this.oXz;
    localap.ae(l, l);
    AppMethodBeat.o(43614);
  }

  public final void bap()
  {
    AppMethodBeat.i(43607);
    Az(0);
    jG(true);
    AppMethodBeat.o(43607);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(43569);
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "errType:" + paramInt1 + "  errCode" + paramInt2 + " errMsg:" + paramString + " scene: " + paramm);
    if (((paramm instanceof com.tencent.mm.plugin.offline.a.f)) && (((paramInt1 == 0) && (paramInt2 == 0)) || (paramInt1 != 0)))
    {
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "onSceneEnd NetSceneOfflineVerifyToken errType %d errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      this.oXx.bXn();
      this.oXx = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof y))
      {
        if (com.tencent.mm.plugin.offline.c.a.bYd())
        {
          if (com.tencent.mm.plugin.offline.c.a.bYg() != null)
            bXL();
          bXX();
        }
        bXV();
        if ((!(paramm instanceof y)) && (!(paramm instanceof n)) && (!(paramm instanceof com.tencent.mm.plugin.offline.a.a)) && (!(paramm instanceof com.tencent.mm.plugin.offline.a.e)))
          break label842;
        bXE();
        E(false, true);
      }
    while (true)
    {
      AppMethodBeat.o(43569);
      return true;
      if ((paramm instanceof com.tencent.mm.plugin.offline.a.m))
      {
        this.oXx = ((com.tencent.mm.plugin.offline.a.m)paramm);
        paramString = this.oXx.oYz;
        com.tencent.mm.plugin.offline.k.bXg();
        paramString = new com.tencent.mm.plugin.offline.a.f(paramString, com.tencent.mm.plugin.offline.k.Ax(196617));
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
        break;
      }
      if ((paramm instanceof com.tencent.mm.plugin.offline.a.j))
      {
        bXE();
        bXy();
        break;
      }
      if ((paramm instanceof n))
      {
        paramString = (n)paramm;
        if ("1".equals(paramString.oYE))
        {
          ab.w("MicroMsg.WalletOfflineCoinPurseUI", "hy: should pause. showFirstPostTip alert to finish");
          if (bo.isNullOrNil(paramString.oYF));
          for (paramString = getString(2131304763); ; paramString = paramString.oYF)
          {
            com.tencent.mm.ui.base.h.a(this, paramString, "", false, new WalletOfflineCoinPurseUI.2(this));
            AppMethodBeat.o(43569);
            break;
          }
        }
        if (paramString.oXZ == 0)
        {
          c localc = this.pag;
          localc.oZp = com.tencent.mm.plugin.offline.c.a.bYk();
          localc.oZp = localc.oZp;
          if (!"1".equals(paramString.oYD))
            break;
          ab.i("MicroMsg.WalletOfflineCoinPurseUI", "hy: should refresh codes. doscene");
          a(new com.tencent.mm.plugin.offline.a.m((int)(System.currentTimeMillis() / 1000L), 8), false, false);
          break;
        }
        if (paramString.oXZ == 0)
          break;
        this.pag.a(paramString, paramString.oXZ, paramString.oYa);
        break;
      }
      if ((paramm instanceof com.tencent.mm.plugin.offline.a.a))
        break;
      if ((paramm instanceof com.tencent.mm.plugin.offline.a.e))
      {
        this.pag.c(paramInt1, paramInt2, paramString, paramm);
        break;
      }
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.f))
      {
        if ((this.oZV != null) && (this.oZV.isShowing()))
          this.oZV.dismiss();
        paramString = (com.tencent.mm.plugin.wallet_core.id_verify.model.f)paramm;
        if (("1".equals(paramString.tvH)) || (("2".equals(paramString.tvH)) && (!bo.isNullOrNil(paramString.tvI))))
        {
          paramString = new Bundle();
          paramString.putString("realname_verify_process_jump_activity", ".ui.WalletOfflineCoinPurseUI");
          paramString.putString("realname_verify_process_jump_plugin", "offline");
          com.tencent.mm.plugin.wallet_core.id_verify.util.a.a(this, paramString, null, 1006);
        }
        while (true)
        {
          AppMethodBeat.o(43569);
          break;
          if ("collect".equals(paramString.tvL))
            bXz();
          else if ("reward".equals(paramString.tvL))
            com.tencent.mm.bp.d.H(this.mController.ylL, "collect", ".reward.ui.QrRewardMainUI");
          else
            ab.w("MicroMsg.WalletOfflineCoinPurseUI", "unknown scene: %s", new Object[] { paramString.tvL });
        }
      }
      if (!(paramm instanceof com.tencent.mm.plugin.offline.a.q))
        break;
      paramString = (com.tencent.mm.plugin.offline.a.q)paramm;
      if ((paramString.bLD()) && (!this.pac) && (paramString.nYe.a(this, new WalletOfflineCoinPurseUI.3(this))))
        this.pac = true;
      c(paramString.oYK.errType, paramString.oYK.errCode, paramString.oYK.aIm, paramString.oYI);
      c(paramString.oYJ.errType, paramString.oYJ.errCode, paramString.oYJ.aIm, paramString.oYH);
      break;
      label842: if ((paramm instanceof com.tencent.mm.plugin.offline.a.f))
      {
        bXE();
        E(true, true);
        continue;
        if ((paramm instanceof n))
        {
          bXE();
          E(false, true);
          if (411 == paramInt2)
            this.pag.a(paramm, paramInt2, paramString);
        }
        else if ((paramm instanceof com.tencent.mm.plugin.offline.a.e))
        {
          this.pag.c(paramInt1, paramInt2, paramString, paramm);
        }
        else if (!(paramm instanceof com.tencent.mm.plugin.offline.a.j))
        {
          if ((paramm instanceof com.tencent.mm.plugin.offline.a.f))
          {
            this.oXx = null;
          }
          else if ((paramm instanceof com.tencent.mm.plugin.wallet_core.id_verify.model.f))
          {
            if ((this.oZV != null) && (this.oZV.isShowing()))
              this.oZV.dismiss();
          }
          else if ((paramm instanceof com.tencent.mm.plugin.offline.a.q))
          {
            bXE();
            E(false, true);
            if (411 == paramInt2)
              this.pag.a(paramm, paramInt2, paramString);
          }
        }
      }
    }
  }

  public final void e(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(43608);
    a(new com.tencent.mm.plugin.offline.a.e(paramInt, paramString1, paramString2, paramString3), com.tencent.mm.plugin.offline.c.a.bYe(), false);
    AppMethodBeat.o(43608);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130971130;
  }

  public final void initView()
  {
    AppMethodBeat.i(43570);
    this.pah = ((OfflineAlertView)findViewById(2131828891));
    this.pah.dismiss();
    this.pah.setDialogState(new WalletOfflineCoinPurseUI.4(this));
    com.tencent.mm.wallet_core.c.b.dNJ();
    com.tencent.mm.wallet_core.c.b.init(getApplicationContext());
    if ((this.gwj == 3) || (this.gwj == 10) || (this.gwj == 11) || (this.gwj == 12))
      setMMTitle(2131305445);
    while (true)
    {
      this.pag = new c(this, this);
      this.pag.init();
      this.paf = new com.tencent.mm.wallet_core.ui.c(this, true);
      this.paf.ase();
      bXC();
      bXB();
      if ((com.tencent.mm.plugin.offline.c.a.bYd()) && (c.bXw()))
      {
        localObject = this.pag;
        com.tencent.mm.plugin.offline.k.bXg();
        ((c)localObject).a(com.tencent.mm.plugin.offline.k.bXh().oYL);
      }
      bXA();
      Object localObject = this.oXA;
      long l = this.oXz;
      ((ap)localObject).ae(l, l);
      bXY();
      bXD();
      localObject = new uo();
      ((uo)localObject).cQJ.cQL = "5";
      ((uo)localObject).callback = new WalletOfflineCoinPurseUI.5(this, (uo)localObject);
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      AppMethodBeat.o(43570);
      return;
      setMMTitle(2131305446);
    }
  }

  public final void m(String paramString, Bitmap paramBitmap)
  {
    AppMethodBeat.i(43592);
    if ((TextUtils.isEmpty(paramString)) || (paramBitmap == null) || (paramBitmap.isRecycled()))
      AppMethodBeat.o(43592);
    while (true)
    {
      return;
      ImageView localImageView = (ImageView)this.oZx.get(paramString);
      paramString = (Integer)this.oZy.get(paramString);
      if ((localImageView == null) || (paramString == null))
      {
        AppMethodBeat.o(43592);
      }
      else
      {
        new com.tencent.mm.sdk.platformtools.ak(getMainLooper()).post(new WalletOfflineCoinPurseUI.19(this, paramString, paramBitmap, localImageView));
        AppMethodBeat.o(43592);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(43562);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.offline.k.oXK = true;
    com.tencent.mm.wallet_core.ui.e.QS(41);
    paramBundle = getIntent();
    this.oZZ = paramBundle.getBooleanExtra("is_offline_create", false);
    if ((paramBundle != null) && (paramBundle.hasExtra("key_entry_scene")))
      this.gwj = paramBundle.getIntExtra("key_entry_scene", this.gwj);
    this.emC = paramBundle.getIntExtra("key_from_scene", 0);
    this.oZL = bo.bc(paramBundle.getStringExtra("key_business_attach"), "");
    this.lTe = 1;
    if (this.gwj == 2)
      this.lTe = 1;
    while (true)
    {
      getWindow().addFlags(8192);
      ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.walletlock.a.b.class)).a(this, null);
      AM(0);
      xE(getResources().getColor(2131690638));
      dyb();
      paramBundle = getWindow().getAttributes();
      if (paramBundle.screenBrightness < 0.85F)
      {
        paramBundle.screenBrightness = 0.85F;
        getWindow().setAttributes(paramBundle);
      }
      setBackBtn(new WalletOfflineCoinPurseUI.34(this));
      try
      {
        bc.a(this, this);
        i = 1;
        if (i != 0)
          bc.a(this, null);
        com.tencent.mm.wallet_core.ui.e.dOK();
        if (!com.tencent.mm.plugin.offline.a.q.isEnabled())
          a(new y(null, 8), false, false);
        if (com.tencent.mm.plugin.wallet_core.model.r.cPI().cQl())
        {
          ab.e("MicroMsg.WalletOfflineCoinPurseUI", "coin purse onCreate data is invalid");
          initView();
          x.a(this);
          com.tencent.mm.plugin.offline.k.bXg();
          com.tencent.mm.plugin.offline.k.bXh().a(this);
          nf(606);
          nf(609);
          nf(1501);
          com.tencent.mm.plugin.offline.k.bXg();
          com.tencent.mm.plugin.offline.k.bXi().cl(this);
          com.tencent.mm.sdk.b.a.xxA.c(this.paq);
          com.tencent.mm.plugin.offline.c.a.bYp();
          com.tencent.mm.sdk.b.a.xxA.b(this.pao);
          com.tencent.mm.sdk.b.a.xxA.b(this.pam);
          com.tencent.mm.sdk.b.a.xxA.b(this.paj);
          this.pak.dnU();
          this.pal.dnU();
          this.oZY = new com.tencent.mm.plugin.offline.g();
          paramBundle = new lg();
          paramBundle.cHi.aBR = hashCode();
          com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
          this.pan.dnU();
          AppMethodBeat.o(43562);
          return;
          if (this.gwj == 1)
          {
            this.lTe = 2;
            continue;
          }
          if (this.gwj == 8)
          {
            this.lTe = 4;
            continue;
          }
          if (this.gwj == 4)
          {
            this.lTe = 6;
            continue;
          }
          ab.i("MicroMsg.WalletOfflineCoinPurseUI", "unknown scene: %d", new Object[] { Integer.valueOf(this.lTe) });
        }
      }
      catch (Exception paramBundle)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.WalletOfflineCoinPurseUI", paramBundle, "", new Object[0]);
          getWindow().setFlags(8192, 8192);
          int i = 0;
          continue;
          if (com.tencent.mm.plugin.wallet_core.model.r.cPI().cQi())
          {
            ab.e("MicroMsg.WalletOfflineCoinPurseUI", "coin purse onCreate data is isUnreg");
            com.tencent.mm.plugin.offline.c.a.bYo();
            com.tencent.mm.plugin.offline.k.bXg();
            com.tencent.mm.plugin.offline.k.aT(196648, "0");
          }
          else if ((com.tencent.mm.plugin.wallet_core.model.r.cPI().cQg()) && (com.tencent.mm.plugin.offline.c.a.bYd()))
          {
            bXX();
          }
        }
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(43568);
    com.tencent.mm.plugin.offline.k.oXK = false;
    com.tencent.mm.wallet_core.ui.e.K(this.oZz);
    com.tencent.mm.wallet_core.ui.e.K(this.oZA);
    com.tencent.mm.wallet_core.ui.e.ar(this.pad);
    com.tencent.mm.wallet_core.ui.e.ar(this.pae);
    this.pad.clear();
    this.pae.clear();
    this.oZE.clear();
    this.oZF.clear();
    this.oZG.clear();
    x.c(this);
    com.tencent.mm.plugin.offline.k.bXg();
    com.tencent.mm.plugin.offline.k.bXh().b(this);
    ng(606);
    ng(609);
    ng(1501);
    com.tencent.mm.plugin.offline.k.bXg();
    com.tencent.mm.plugin.offline.k.bXi().cm(this);
    com.tencent.mm.sdk.b.a.xxA.d(this.paq);
    com.tencent.mm.sdk.b.a.xxA.d(this.pao);
    com.tencent.mm.sdk.b.a.xxA.d(this.paj);
    if (!this.oXA.doT())
      this.oXA.stopTimer();
    if (!this.pau.doT())
      this.pau.stopTimer();
    if (this.paf != null)
      this.paf.release();
    if (this.pag != null)
    {
      localObject = this.pag;
      ((c)localObject).kgA.cancel();
      ((c)localObject).mActivity = null;
    }
    com.tencent.mm.sdk.b.a.xxA.d(this.pam);
    this.pak.dead();
    this.pal.dead();
    Object localObject = this.oZY;
    ((com.tencent.mm.plugin.offline.g)localObject).stop();
    com.tencent.mm.plugin.offline.g.bXc();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(385, ((com.tencent.mm.plugin.offline.g)localObject).oXk);
    ((com.tencent.mm.plugin.offline.g)localObject).oXm = null;
    this.pan.dead();
    super.onDestroy();
    AppMethodBeat.o(43568);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(43613);
    boolean bool;
    if ((paramInt == 4) && (this.pah != null) && (this.pah.getVisibility() == 0) && (this.pah.oZg))
    {
      this.pah.dismiss();
      bool = true;
      AppMethodBeat.o(43613);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(43613);
    }
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(43566);
    super.onNewIntent(paramIntent);
    ab.i("MicroMsg.WalletOfflineCoinPurseUI", "hy: on new intent");
    this.oZC = true;
    AppMethodBeat.o(43566);
  }

  public void onPause()
  {
    AppMethodBeat.i(43567);
    com.tencent.mm.plugin.offline.k.bXg();
    com.tencent.mm.plugin.offline.i locali = com.tencent.mm.plugin.offline.k.bXj();
    locali.mHandler.removeCallbacks(locali.oXy);
    bc.a(this, null);
    this.kXv = false;
    com.tencent.mm.sdk.b.a.xxA.d(this.pap);
    this.oZY.stop();
    super.onPause();
    AppMethodBeat.o(43567);
  }

  public void onResume()
  {
    AppMethodBeat.i(43564);
    super.onResume();
    com.tencent.mm.sdk.b.a.xxA.c(this.pap);
    try
    {
      bc.a(this, this);
      if (!this.pai)
      {
        bXy();
        this.pai = true;
      }
      ab.i("MicroMsg.WalletOfflineCoinPurseUI", "hy: on resume");
      this.kXv = true;
      Object localObject = (com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.walletlock.a.b.class);
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).a(this, ((com.tencent.mm.plugin.walletlock.a.b)localObject).cTi(), null);
      if (at.isNetworkConnected(getBaseContext()))
      {
        if (com.tencent.mm.plugin.wallet_core.model.r.cPI().cQl())
          a(new y(null, 8), true, false);
        if (com.tencent.mm.plugin.offline.c.a.bYd())
        {
          com.tencent.mm.plugin.offline.k.bXg();
          com.tencent.mm.plugin.offline.k.bXj().jF(false);
          if (!c.bXw())
          {
            if (!com.tencent.mm.plugin.offline.a.q.isEnabled())
              break label399;
            a(new com.tencent.mm.plugin.offline.a.q(com.tencent.mm.plugin.offline.c.a.pbe), false, false);
          }
        }
      }
      bXE();
      localObject = com.tencent.mm.plugin.offline.c.a.bYf();
      if ((localObject != null) && (((Bankcard)localObject).field_bindSerial != null) && (!((Bankcard)localObject).field_bindSerial.equals(this.oWS)))
      {
        this.oWS = ((Bankcard)localObject).field_bindSerial;
        com.tencent.mm.plugin.offline.k.bXg();
        com.tencent.mm.plugin.offline.k.bXi().oWS = this.oWS;
        i = 1;
        if ((i != 0) || ((this.oZD) && (this.oZC)))
        {
          ab.i("MicroMsg.WalletOfflineCoinPurseUI", "onresume BindSerial isChange");
          this.oZD = false;
          this.oZC = false;
          bXM();
          Az(0);
          jG(true);
        }
        localObject = this.oZY;
        if (!com.tencent.mm.plugin.offline.c.a.bYE())
          break label440;
        ab.i(com.tencent.mm.plugin.offline.g.TAG, "OFFLINEGETMSGLOGIN START; IS stopped=" + ((com.tencent.mm.plugin.offline.g)localObject).oXm.doT());
        if ((((com.tencent.mm.plugin.offline.g)localObject).oXm != null) && (!((com.tencent.mm.plugin.offline.g)localObject).oXm.doT()))
          break label449;
        ((com.tencent.mm.plugin.offline.g)localObject).status = 1;
        com.tencent.mm.plugin.report.service.h.pYm.a(135L, 61L, 1L, true);
        if (!((com.tencent.mm.plugin.offline.g)localObject).oXl)
          break label411;
        com.tencent.mm.plugin.offline.g.bXc();
        localObject = ((com.tencent.mm.plugin.offline.g)localObject).oXm;
        l = com.tencent.mm.plugin.offline.g.oWV;
        ((ap)localObject).ae(l, l);
        i = com.tencent.mm.plugin.offline.g.oWV;
        AppMethodBeat.o(43564);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletOfflineCoinPurseUI", localException, "", new Object[0]);
        continue;
        label399: bXL();
        continue;
        int i = 0;
        continue;
        label411: ap localap = localException.oXm;
        long l = com.tencent.mm.plugin.offline.g.oXj;
        localap.ae(l, l);
        i = com.tencent.mm.plugin.offline.g.oXj;
        AppMethodBeat.o(43564);
        continue;
        label440: ab.i(com.tencent.mm.plugin.offline.g.TAG, "OfflineGetMsg is not in abtest");
        label449: AppMethodBeat.o(43564);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI
 * JD-Core Version:    0.6.2
 */