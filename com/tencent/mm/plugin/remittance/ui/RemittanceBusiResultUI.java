package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bt.b;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.plugin.remittance.model.BusiRemittanceResp;
import com.tencent.mm.plugin.remittance.model.f;
import com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.cz;
import com.tencent.mm.protocal.protobuf.lo;
import com.tencent.mm.protocal.protobuf.lx;
import com.tencent.mm.protocal.protobuf.mr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class RemittanceBusiResultUI extends WalletBaseUI
{
  private TextView iDT;
  private Button nsJ;
  private String oXY;
  private int obL;
  private int pOx;
  private String pOy;
  private String pQW;
  private String pRC;
  private String pSA;
  private int pSB;
  private String pSC;
  private String pSD;
  private b pSE;
  private boolean pSF;
  private String pSG;
  private BusiRemittanceResp pSH;
  private cz pSI;
  private int pSJ;
  private d.a.a.c pSK;
  private WalletSuccPageAwardWidget pSL;
  private ViewGroup pSM;
  private ViewGroup pSN;
  private ViewGroup pSO;
  private TextView pSP;
  private boolean pSQ;
  private com.tencent.mm.sdk.b.c<uv> pSR;
  private boolean pSS;
  private Runnable pST;
  private TextView pSi;
  private TextView pSj;
  private TextView pSk;
  private CdnImageView pSl;
  private TextView pSm;
  private TextView pSn;
  private Button pSo;
  private ViewGroup pSp;
  private ViewGroup pSq;
  private ViewGroup pSr;
  private View pSs;
  private LinearLayout pSt;
  private String pSu;
  private String pSv;
  private String pSw;
  private double pSx;
  private String pSy;
  private String pSz;

  public RemittanceBusiResultUI()
  {
    AppMethodBeat.i(44877);
    this.pSF = false;
    this.pSI = new cz();
    this.pSQ = false;
    this.pSR = new RemittanceBusiResultUI.1(this);
    this.pSS = true;
    this.pST = new RemittanceBusiResultUI.8(this);
    AppMethodBeat.o(44877);
  }

  private void a(com.tencent.mm.plugin.remittance.model.j paramj)
  {
    AppMethodBeat.i(44889);
    this.pSt.removeAllViews();
    Object localObject1;
    Object localObject2;
    if (!bo.isNullOrNil(this.pQW))
    {
      localObject1 = e.eK(this.pQW, 6);
      localObject2 = localObject1;
      if (bo.isNullOrNil(this.pSG))
        break label541;
      localObject2 = getString(2131302377, new Object[] { localObject1, this.pSG });
    }
    label524: label541: 
    while (true)
    {
      if ((du(this.pSp)) && (du(this.pSq)) && (du(this.pSO)) && (du(this.pSr)) && (!WalletSuccPageAwardWidget.a(this.pSK)) && (du(findViewById(2131826974))) && (du(this.pSM)))
      {
        localObject1 = (ViewGroup)getLayoutInflater().inflate(2130969456, this.pSt, false);
        this.pSt.addView((View)localObject1);
        paramj = (CdnImageView)((ViewGroup)localObject1).findViewById(2131823740);
        localObject1 = (TextView)((ViewGroup)localObject1).findViewById(2131823741);
        if (!bo.isNullOrNil(this.pOy))
        {
          if (this.pSJ == 1)
            paramj.setRoundCorner(true);
          paramj.setUrl(this.pOy);
          label215: ((TextView)localObject1).setText((CharSequence)localObject2);
        }
      }
      while (true)
      {
        dv(this.pSt);
        AppMethodBeat.o(44889);
        return;
        localObject1 = e.eK(e.mJ(this.pSw), 6);
        localObject2 = localObject1;
        if (bo.isNullOrNil(this.pSG))
          break label541;
        localObject2 = getString(2131302377, new Object[] { localObject1, this.pSG });
        break;
        if (this.pSJ == 1)
        {
          a.b.r(paramj, this.pSw);
          break label215;
        }
        a.b.b(paramj, this.pSw);
        break label215;
        localObject1 = (ViewGroup)getLayoutInflater().inflate(2130970507, this.pSt, false);
        this.pSt.addView((View)localObject1);
        CdnImageView localCdnImageView = (CdnImageView)findViewById(2131823740);
        localObject1 = (TextView)findViewById(2131823741);
        View localView = findViewById(2131826968);
        TextView localTextView = (TextView)findViewById(2131826969);
        ((TextView)localObject1).setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, (CharSequence)localObject2));
        localCdnImageView.setVisibility(0);
        if (!bo.isNullOrNil(this.pOy))
        {
          if (this.pSJ == 1)
            localCdnImageView.setRoundCorner(true);
          localCdnImageView.setUrl(this.pOy);
        }
        while (true)
        {
          localView.setVisibility(8);
          localTextView.setVisibility(8);
          if (paramj == null)
            break;
          if (paramj.pOW.vPT != 1)
            break label524;
          localView.setVisibility(0);
          localTextView.setVisibility(0);
          localTextView.setText(e.G(paramj.pOW.vPQ / 100.0D));
          break;
          if (this.pSJ == 1)
            a.b.r(localCdnImageView, this.pSw);
          else
            a.b.b(localCdnImageView, this.pSw);
        }
        localView.setVisibility(8);
        localTextView.setVisibility(8);
      }
    }
  }

  private void cfQ()
  {
    AppMethodBeat.i(44888);
    al.n(this.pST, 500L);
    AppMethodBeat.o(44888);
  }

  private static boolean du(View paramView)
  {
    AppMethodBeat.i(44883);
    boolean bool;
    if ((paramView == null) || (paramView.getVisibility() == 8))
    {
      bool = true;
      AppMethodBeat.o(44883);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(44883);
    }
  }

  private void dv(View paramView)
  {
    AppMethodBeat.i(44887);
    findViewById(2131821222).setVisibility(8);
    paramView.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(44875);
        RemittanceBusiResultUI.e(RemittanceBusiResultUI.this);
        AppMethodBeat.o(44875);
      }
    });
    AppMethodBeat.o(44887);
  }

  public final void AM(int paramInt)
  {
    AppMethodBeat.i(44886);
    this.mController.contentView.setVisibility(paramInt);
    AppMethodBeat.o(44886);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44882);
    com.tencent.mm.plugin.remittance.model.j localj;
    Object localObject;
    TextView localTextView1;
    View localView;
    LinkedList localLinkedList;
    int i;
    label282: String str;
    int j;
    if ((paramm instanceof com.tencent.mm.plugin.remittance.model.j))
    {
      localj = (com.tencent.mm.plugin.remittance.model.j)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (localj.pOW.kdT == 0)
        {
          ab.i("MicroMsg.RemittanceBusiResultUI", "exposure info: %s", new Object[] { localj.pOW.tBw });
          this.pSK = localj.pOW.tBw;
          if (WalletSuccPageAwardWidget.a(this.pSK))
          {
            ab.i("MicroMsg.RemittanceBusiResultUI", "setAwardWidget, mTransId: %s", new Object[] { this.oXY });
            this.pSL.a(this, this.pSK, this.oXY, true, (ImageView)findViewById(2131824036));
            this.pSL.init();
            this.pSL.setVisibility(0);
            localObject = (ImageView)findViewById(2131824036);
            ((ImageView)localObject).post(new RemittanceBusiResultUI.3(this, (ImageView)localObject));
            dv(this.pSL);
            this.pSN.setVisibility(8);
            this.pSM.setVisibility(8);
            this.pSO.setVisibility(8);
            localTextView1 = (TextView)findViewById(2131826975);
            localView = findViewById(2131826974);
            if ((localj == null) || (localj.pOW == null) || (localj.pOW.vPR.size() <= 0))
              break label695;
            localLinkedList = localj.pOW.vPR;
            if (localLinkedList == null)
              break label587;
            i = localLinkedList.size();
            ab.i("MicroMsg.RemittanceBusiResultUI", "discountInfoList: %s, size: %s received_amount: %s", new Object[] { localLinkedList, Integer.valueOf(i), Long.valueOf(localj.pOW.vPQ) });
            str = "";
            j = localLinkedList.size();
            localObject = str;
            if (localLinkedList == null)
              break label609;
            localObject = str;
            if (localLinkedList.size() <= 0)
              break label609;
            this.pSN.removeAllViews();
            this.pSM.setOnClickListener(null);
            if (j <= 1)
              break label1130;
            localObject = localj.pOW.vPU;
            this.pSS = true;
            localView.setOnClickListener(new RemittanceBusiResultUI.5(this, localView));
            this.pSM.setOnClickListener(new RemittanceBusiResultUI.6(this, localView));
          }
        }
    }
    while (true)
    {
      if ((j == 1) && (localLinkedList.get(0) != null))
        localObject = (String)localLinkedList.get(0);
      while (true)
      {
        i = 0;
        while (true)
          if (i < localLinkedList.size())
          {
            str = (String)localLinkedList.get(i);
            TextView localTextView2 = new TextView(this.mController.ylL);
            LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
            localLayoutParams.bottomMargin = com.tencent.mm.bz.a.fromDPToPix(this, 6);
            localTextView2.setLayoutParams(localLayoutParams);
            localTextView2.setTextSize(1, 12.0F);
            localTextView2.setTextColor(Color.parseColor("#FA962A"));
            localTextView2.setText(str);
            this.pSN.addView(localTextView2);
            i++;
            continue;
            this.pSL.setVisibility(8);
            break;
            label587: i = 0;
            break label282;
          }
        this.pSN.setVisibility(0);
        this.pSM.setVisibility(0);
        label609: boolean bool;
        if (this.pSS)
        {
          localView.setVisibility(0);
          localObject = bo.bc((String)localObject, "");
          localObject = new SpannableString((String)localObject + " ");
          if (j > 1)
          {
            findViewById(2131826976).setVisibility(0);
            localTextView1.setText((CharSequence)localObject);
            this.pSM.setVisibility(8);
          }
        }
        else
        {
          label695: al.af(this.pST);
          a(localj);
          label708: bool = false;
          if (this.pSK != null)
            bool = this.pSL.c(paramInt1, paramInt2, paramString, paramm);
          if ((!du(this.pSp)) || (!du(this.pSq)) || (!du(this.pSO)))
            break label1116;
          this.pSs.setVisibility(8);
        }
        while (true)
        {
          AppMethodBeat.o(44882);
          return bool;
          findViewById(2131826976).setVisibility(8);
          break;
          ab.e("MicroMsg.RemittanceBusiResultUI", "result response: %s, %s", new Object[] { Integer.valueOf(localj.pOW.kdT), localj.pOW.kdU });
          break label708;
          ab.e("MicroMsg.RemittanceBusiResultUI", "net error: %s", new Object[] { localj });
          break label708;
          if (!(paramm instanceof f))
            break label708;
          localObject = (f)paramm;
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            if (((f)localObject).pOJ.kdT == 0)
            {
              localObject = ((f)localObject).pOJ.vPf;
              if (localObject != null)
              {
                this.pSl.setUrl(((mr)localObject).cIY);
                this.pSm.setText(((mr)localObject).title);
                this.pSn.setText(((mr)localObject).tzT);
                this.pSo.setText(((mr)localObject).tID);
                this.pSo.setOnClickListener(new RemittanceBusiResultUI.4(this, (mr)localObject));
                this.pSo.setBackgroundResource(2130840018);
                this.pSo.setTextColor(getResources().getColor(2131690694));
                this.pSr.setVisibility(0);
                dv(this.pSr);
                break label708;
              }
              ab.i("MicroMsg.RemittanceBusiResultUI", "app info is null");
              this.pSr.setVisibility(8);
              break label708;
            }
            ab.e("MicroMsg.RemittanceBusiResultUI", "qry response: %s, %s", new Object[] { Integer.valueOf(((f)localObject).pOJ.kdT), ((f)localObject).pOJ.kdU });
            Toast.makeText(this, ((f)localObject).pOJ.kdU, 1).show();
            break label708;
          }
          ab.e("MicroMsg.RemittanceBusiResultUI", "net error: %s", new Object[] { localObject });
          break label708;
          label1116: this.pSs.setVisibility(0);
        }
      }
      label1130: localObject = "";
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(44879);
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(44879);
    return bool;
  }

  public void finish()
  {
    AppMethodBeat.i(44878);
    ab.i("MicroMsg.RemittanceBusiResultUI", "finish this %s %s", new Object[] { this, bo.dpG() });
    if (this.pSQ)
      AppMethodBeat.o(44878);
    while (true)
    {
      return;
      super.finish();
      this.pSQ = true;
      AppMethodBeat.o(44878);
    }
  }

  public final int getLayoutId()
  {
    return 2130970508;
  }

  public final void initView()
  {
    AppMethodBeat.i(44881);
    this.iDT = ((TextView)findViewById(2131826972));
    this.pSi = ((TextView)findViewById(2131826973));
    this.pSj = ((TextView)findViewById(2131826983));
    this.pSk = ((TextView)findViewById(2131826985));
    this.pSp = ((LinearLayout)findViewById(2131826982));
    this.pSq = ((LinearLayout)findViewById(2131826984));
    this.pSl = ((CdnImageView)findViewById(2131826990));
    this.pSm = ((TextView)findViewById(2131826991));
    this.pSn = ((TextView)findViewById(2131826992));
    this.pSo = ((Button)findViewById(2131826993));
    this.pSr = ((ViewGroup)findViewById(2131826988));
    this.nsJ = ((Button)findViewById(2131826998));
    this.pSs = findViewById(2131826981);
    this.pSt = ((LinearLayout)findViewById(2131826980));
    this.pSi.setText(e.F(this.pSx));
    cfQ();
    if (!bo.isNullOrNil(this.pSu))
    {
      this.pSj.setText(this.pSu);
      this.pSp.setVisibility(0);
      if (bo.isNullOrNil(this.pSv))
        break label379;
      this.pSk.setText(this.pSv);
      this.pSq.setVisibility(0);
    }
    while (true)
    {
      this.nsJ.setOnClickListener(new RemittanceBusiResultUI.2(this));
      this.pSL = ((WalletSuccPageAwardWidget)findViewById(2131826996));
      this.pSM = ((ViewGroup)findViewById(2131826977));
      this.pSN = ((ViewGroup)findViewById(2131826978));
      this.pSO = ((ViewGroup)findViewById(2131826986));
      this.pSP = ((TextView)findViewById(2131826987));
      AppMethodBeat.o(44881);
      return;
      this.pSp.setVisibility(8);
      break;
      label379: this.pSq.setVisibility(8);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(44880);
    super.onCreate(paramBundle);
    nf(1537);
    nf(1680);
    nf(2504);
    this.pSR.dnU();
    if (d.iW(21))
    {
      if (!d.iW(23))
        break label446;
      getWindow().setStatusBarColor(-1);
      getWindow().getDecorView().setSystemUiVisibility(8192);
    }
    while (true)
    {
      if (getSupportActionBar() != null)
        getSupportActionBar().hide();
      setBackBtn(null);
      showHomeBtn(false);
      enableBackMenu(false);
      this.pQW = getIntent().getStringExtra("key_mch_name");
      this.pSH = ((BusiRemittanceResp)getIntent().getParcelableExtra("BusiRemittanceResp"));
      this.pSx = getIntent().getDoubleExtra("key_money", 0.0D);
      this.pSw = getIntent().getStringExtra("key_rcver_name");
      this.pSG = getIntent().getStringExtra("key_rcver_true_name");
      this.pSu = getIntent().getStringExtra("key_rcv_desc");
      this.pSv = getIntent().getStringExtra("key_pay_desc");
      this.pSy = getIntent().getStringExtra("key_f2f_id");
      this.oXY = getIntent().getStringExtra("key_trans_id");
      this.pRC = getIntent().getStringExtra("key_rcvr_open_id");
      this.pSD = getIntent().getStringExtra("key_check_sign");
      this.pSz = getIntent().getStringExtra("key_pay_desc");
      this.pSA = getIntent().getStringExtra("key_rcv_desc");
      this.pSB = getIntent().getIntExtra("key_scan_sceen", 0);
      this.obL = getIntent().getIntExtra("key_channel", 0);
      this.pSC = getIntent().getStringExtra("key_succ_page_extend");
      paramBundle = getIntent().getByteArrayExtra("AfterPlaceOrderCommReq");
      try
      {
        this.pSI.parseFrom(paramBundle);
        this.pSJ = getIntent().getIntExtra("key_succ_show_avatar_type", 0);
        this.pOx = getIntent().getIntExtra("key_succ_show_avatar_show", 0);
        this.pOy = getIntent().getStringExtra("key_succ_show_avatar_url");
        this.pSF = false;
        ab.i("MicroMsg.RemittanceBusiResultUI", "fetch data");
        a(new com.tencent.mm.plugin.remittance.model.j(this.pSI, this.pSC), true, true);
        initView();
        AppMethodBeat.o(44880);
        return;
        label446: getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
      }
      catch (Exception paramBundle)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.RemittanceBusiResultUI", paramBundle, "", new Object[0]);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(44885);
    super.onDestroy();
    ng(1537);
    ng(1680);
    ng(2504);
    this.pSR.dead();
    if (this.pSK != null)
      this.pSL.onDestroy();
    AppMethodBeat.o(44885);
  }

  public void onResume()
  {
    AppMethodBeat.i(44884);
    super.onResume();
    if (this.pSF)
    {
      ab.i("MicroMsg.RemittanceBusiResultUI", "do act qry");
      int i = (int)Math.round(this.pSx * 100.0D);
      a(new f(this.pSy, this.oXY, this.pRC, i, this.pSE, this.pSD), false, false);
      this.pSF = false;
    }
    if (this.pSK != null)
      this.pSL.onResume();
    AppMethodBeat.o(44884);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI
 * JD-Core Version:    0.6.2
 */