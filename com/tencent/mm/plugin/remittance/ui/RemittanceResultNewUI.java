package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.uv;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.s.w;
import com.tencent.mm.plugin.fingerprint.b.i;
import com.tencent.mm.plugin.remittance.model.aa;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.protobuf.ow;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class RemittanceResultNewUI extends RemittanceResultUI
{
  private static int[] pWN = null;
  private int jLX;
  private int jLY;
  private com.tencent.mm.ui.widget.b.a jMO;
  private n.d lCi;
  private View.OnTouchListener mlU;
  private View.OnLongClickListener mlV;
  private PayInfo pGr;
  private int pQY;
  private LinearLayout pRn;
  private d.a.a.c pSK;
  private WalletSuccPageAwardWidget pSL;
  private boolean pSQ;
  private com.tencent.mm.sdk.b.c<uv> pSR;
  private LinearLayout pUF;
  private LinearLayout pUG;
  private LinearLayout pUH;
  private TextView pUI;
  private TextView pUJ;
  private TextView pUK;
  private TextView pUL;
  private TextView pUM;
  private int pVv;
  private boolean pWA;
  private TextView pWB;
  private ViewGroup pWC;
  private TextView pWD;
  private WalletTextView pWE;
  private ViewGroup pWF;
  private ViewGroup pWG;
  private ViewGroup pWH;
  private TextView pWI;
  private TextView pWJ;
  private WalletTextView pWK;
  private ow pWL;
  private Button pWM;
  private Orders pWy;
  private String pWz;

  public RemittanceResultNewUI()
  {
    AppMethodBeat.i(45123);
    this.pSQ = false;
    this.pSR = new RemittanceResultNewUI.1(this);
    this.jMO = null;
    this.pVv = 0;
    this.lCi = new RemittanceResultNewUI.3(this);
    this.mlU = new RemittanceResultNewUI.4(this);
    this.mlV = new RemittanceResultNewUI.5(this);
    AppMethodBeat.o(45123);
  }

  private ViewGroup bd(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(45132);
    ab.i("MicroMsg.RemittanceResultNewUI", "setF2FNameView");
    ViewGroup localViewGroup;
    Object localObject1;
    Object localObject2;
    if (paramBoolean)
    {
      localViewGroup = (ViewGroup)getLayoutInflater().inflate(2130969456, this.pWG, false);
      localObject1 = (ImageView)localViewGroup.findViewById(2131823740);
      localObject2 = (TextView)localViewGroup.findViewById(2131823741);
      a.b.a((ImageView)localObject1, this.pWz, 0.06F, false);
      ((TextView)localObject2).setText(paramString);
      this.pWG.addView(localViewGroup);
      AppMethodBeat.o(45132);
    }
    for (paramString = localViewGroup; ; paramString = localViewGroup)
    {
      return paramString;
      localViewGroup = (ViewGroup)getLayoutInflater().inflate(2130969455, this.pWG, false);
      localObject2 = (ImageView)localViewGroup.findViewById(2131823740);
      localObject1 = (TextView)localViewGroup.findViewById(2131823741);
      a.b.a((ImageView)localObject2, this.pWz, 0.06F, false);
      ((TextView)localObject1).setText(paramString);
      this.pWG.addView(localViewGroup);
      AppMethodBeat.o(45132);
    }
  }

  private void cfY()
  {
    AppMethodBeat.i(45128);
    Object localObject = e.mJ(this.pWz);
    if ((this.pQY == 31) || (this.pQY == 5))
    {
      this.pWJ.setText(e.atq(this.pWy.pcl));
      this.pWK.setText(e.F(this.pWy.pTN));
      if (this.pQY == 31)
      {
        localObject = getString(2131302461, new Object[] { localObject });
        if (!bo.isNullOrNil((String)localObject))
          this.pWI.setText(j.b(this, (CharSequence)localObject, this.pWI.getTextSize()));
        while (true)
        {
          this.pWH.setVisibility(0);
          if (this.pWy.pPp > 0.0D)
          {
            cgc();
            ((ViewGroup.MarginLayoutParams)this.pWF.getLayoutParams()).topMargin = com.tencent.mm.bz.a.fromDPToPix(this, 20);
            this.pWF.setVisibility(0);
            this.pWG.setVisibility(0);
          }
          AppMethodBeat.o(45128);
          return;
          this.pWI.setVisibility(8);
        }
      }
      if ((this.pGr.vwh == null) || (!this.pGr.vwh.getBoolean("extinfo_key_10")))
        break label432;
    }
    label432: for (boolean bool = true; ; bool = false)
      while (true)
      {
        ab.i("MicroMsg.RemittanceResultNewUI", "isEmojiReward: %s", new Object[] { Boolean.valueOf(bool) });
        if (bool)
        {
          this.pWI.setText(getString(2131302421));
          break;
        }
        if ((this.pWy.tAq == null) || (this.pWy.tAq.get(0) == null) || (TextUtils.isEmpty(((Orders.Commodity)this.pWy.tAq.get(0)).pca)))
          break;
        this.pWI.setText(((Orders.Commodity)this.pWy.tAq.get(0)).pca);
        break;
        localObject = this.mBundle.getByteArray("key_succpage_resp");
        if (localObject != null)
          this.pWL = new ow();
        try
        {
          this.pWL.parseFrom((byte[])localObject);
          this.pSK = this.pWL.tBw;
          cfZ();
          AppMethodBeat.o(45128);
        }
        catch (Exception localException)
        {
          while (true)
          {
            this.pWL = null;
            this.pSK = null;
            ab.printErrStackTrace("MicroMsg.RemittanceResultNewUI", localException, "parse f2FPaySucPageResp error: %s", new Object[] { localException.getMessage() });
          }
        }
      }
  }

  private void cfZ()
  {
    AppMethodBeat.i(45131);
    Object localObject1 = e.mJ(this.pWz);
    this.pWD.setText(e.atq(this.pWy.pcl));
    this.pWE.setText(e.F(this.pWy.pTN));
    this.pWG.removeAllViews();
    String str;
    Object localObject2;
    if ((this.pQY == 32) || (this.pQY == 33) || (this.pQY == 48))
    {
      str = "";
      if (this.pGr.vwh != null)
        str = this.pGr.vwh.getString("extinfo_key_2");
      localObject2 = localObject1;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((String)localObject1).length() > 10)
          localObject2 = ((String)localObject1).substring(0, 10) + "...";
      }
      if (bo.isNullOrNil(str))
        break label451;
      if (bo.isNullOrNil((String)localObject2))
        break label420;
      str = e.att(str);
      localObject2 = (String)localObject2 + "(" + str + ")";
    }
    label420: label451: 
    while (true)
    {
      localObject1 = cga();
      View localView1 = cgb();
      View localView2 = cgc();
      if ((localObject1 != null) || (localView1 != null) || (localView2 != null));
      for (boolean bool = false; ; bool = true)
      {
        this.pWF.setVisibility(0);
        this.pWG.setVisibility(0);
        if (WalletSuccPageAwardWidget.a(this.pSK))
        {
          str = "";
          if (this.pWy.tAq.size() > 0)
            str = ((Orders.Commodity)this.pWy.tAq.get(0)).cAa;
          ab.i("MicroMsg.RemittanceResultNewUI", "transId: %s", new Object[] { str });
          this.pSL.a(this, this.pSK, str, true, (ImageView)findViewById(2131824036));
          this.pSL.init();
          this.pSL.setVisibility(0);
          bd((String)localObject2, false);
        }
        while (true)
        {
          if (localObject1 != null)
            this.pWG.addView((View)localObject1);
          if (localView1 != null)
            this.pWG.addView(localView1);
          if (localView2 != null)
            this.pWG.addView(localView2);
          this.pWC.setVisibility(0);
          AppMethodBeat.o(45131);
          return;
          localObject2 = str;
          break;
          this.pSL.setVisibility(8);
          bd((String)localObject2, bool);
        }
      }
    }
  }

  private View cga()
  {
    AppMethodBeat.i(45133);
    ab.i("MicroMsg.RemittanceResultNewUI", "setF2FReceiverRemarkView");
    String str1 = this.pGr.vwh.getString("extinfo_key_3");
    String str2 = this.pGr.vwh.getString("extinfo_key_8");
    ViewGroup localViewGroup;
    TextView localTextView1;
    if (!bo.isNullOrNil(str1))
    {
      localViewGroup = (ViewGroup)getLayoutInflater().inflate(2130969454, this.pWG, false);
      localTextView1 = (TextView)localViewGroup.findViewById(2131821185);
      TextView localTextView2 = (TextView)localViewGroup.findViewById(2131820991);
      if (!bo.isNullOrNil(str2))
      {
        localTextView1.setText(str2);
        localTextView2.setText(str1);
        AppMethodBeat.o(45133);
      }
    }
    while (true)
    {
      return localViewGroup;
      localTextView1.setText(getString(2131298359));
      break;
      localViewGroup = null;
      AppMethodBeat.o(45133);
    }
  }

  private View cgb()
  {
    AppMethodBeat.i(45134);
    ab.i("MicroMsg.RemittanceResultNewUI", "setF2FPayerRemarkView");
    String str1 = this.pGr.vwh.getString("extinfo_key_6");
    String str2 = this.pGr.vwh.getString("extinfo_key_7");
    ViewGroup localViewGroup;
    TextView localTextView1;
    if (!bo.isNullOrNil(str2))
    {
      localViewGroup = (ViewGroup)getLayoutInflater().inflate(2130969454, this.pWG, false);
      localTextView1 = (TextView)localViewGroup.findViewById(2131821185);
      TextView localTextView2 = (TextView)localViewGroup.findViewById(2131820991);
      if (!bo.isNullOrNil(str1))
      {
        localTextView1.setText(str1);
        localTextView2.setText(str2);
        AppMethodBeat.o(45134);
      }
    }
    while (true)
    {
      return localViewGroup;
      localTextView1.setText(getString(2131298358));
      break;
      localViewGroup = null;
      AppMethodBeat.o(45134);
    }
  }

  private View cgc()
  {
    boolean bool = true;
    AppMethodBeat.i(45135);
    ViewGroup localViewGroup;
    if (this.pWy != null)
      if (this.pWy.pPp > 0.0D)
      {
        ab.i("MicroMsg.RemittanceResultNewUI", "need set charge fee: %s", new Object[] { Boolean.valueOf(bool) });
        if (this.pWy.pPp <= 0.0D)
          break label185;
        String str1 = getString(2131302458);
        String str2 = e.e(this.pWy.pPp, this.pWy.pcl);
        localViewGroup = (ViewGroup)getLayoutInflater().inflate(2130969453, this.pWG, false);
        TextView localTextView1 = (TextView)localViewGroup.findViewById(2131821185);
        ImageView localImageView = (ImageView)localViewGroup.findViewById(2131821183);
        TextView localTextView2 = (TextView)localViewGroup.findViewById(2131820991);
        localTextView1.setText(str1);
        localImageView.setVisibility(8);
        localTextView2.setText(str2);
        this.pWG.addView(localViewGroup);
        AppMethodBeat.o(45135);
      }
    while (true)
    {
      return localViewGroup;
      bool = false;
      break;
      label185: localViewGroup = null;
      AppMethodBeat.o(45135);
    }
  }

  private void cgd()
  {
    AppMethodBeat.i(45136);
    ab.i("MicroMsg.RemittanceResultNewUI", "endRemittance");
    if (this.mBundle.containsKey("key_realname_guide_helper"))
    {
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)this.mBundle.getParcelable("key_realname_guide_helper");
      if (localRealnameGuideHelper != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceResultUI");
        localBundle.putString("realname_verify_process_jump_plugin", "remittance");
        localRealnameGuideHelper.b(this, localBundle, new RemittanceResultNewUI.6(this));
        localRealnameGuideHelper.a(this, localBundle, new RemittanceResultNewUI.7(this));
        this.mBundle.remove("key_realname_guide_helper");
      }
      AppMethodBeat.o(45136);
    }
    while (true)
    {
      return;
      cge();
      AppMethodBeat.o(45136);
    }
  }

  private void cge()
  {
    AppMethodBeat.i(45137);
    ab.i("MicroMsg.RemittanceResultNewUI", "doEndRemittance");
    dOD().b(this, this.mBundle);
    new ak().postDelayed(new RemittanceResultNewUI.8(this), 100L);
    AppMethodBeat.o(45137);
  }

  private void cgf()
  {
    AppMethodBeat.i(45138);
    ((i)g.K(i.class)).g(this);
    AppMethodBeat.o(45138);
  }

  public static int n(Context paramContext, String paramString, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(45129);
    int j = com.tencent.mm.bz.a.fromDPToPix(paramContext, 16);
    if (pWN == null)
      pWN = w.db(paramContext);
    j = (pWN[0] - com.tencent.mm.bz.a.fromDPToPix(paramContext, 88) - paramInt) / j;
    int k = paramString.length();
    paramInt = k / j;
    if (paramInt > 2)
    {
      paramInt = i;
      if (paramInt == 0)
        break label106;
      paramInt = j * 2 - 5;
      AppMethodBeat.o(45129);
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 2)
      {
        paramInt = i;
        if (k % j > 0)
          break;
      }
      paramInt = 0;
      break;
      label106: paramInt = paramString.length();
      AppMethodBeat.o(45129);
    }
  }

  public final void AM(int paramInt)
  {
    AppMethodBeat.i(45140);
    this.mController.contentView.setVisibility(paramInt);
    AppMethodBeat.o(45140);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45139);
    boolean bool;
    if (WalletSuccPageAwardWidget.a(this.pSK))
    {
      bool = this.pSL.c(paramInt1, paramInt2, paramString, paramm);
      AppMethodBeat.o(45139);
    }
    while (true)
    {
      return bool;
      bool = super.c(paramInt1, paramInt2, paramString, paramm);
      AppMethodBeat.o(45139);
    }
  }

  protected final boolean cgg()
  {
    return false;
  }

  public void finish()
  {
    AppMethodBeat.i(45124);
    ab.i("MicroMsg.RemittanceResultNewUI", "finish this %s %s", new Object[] { this, bo.dpG() });
    if (this.pSQ)
      AppMethodBeat.o(45124);
    while (true)
    {
      return;
      super.finish();
      this.pSQ = true;
      AppMethodBeat.o(45124);
    }
  }

  public final int getLayoutId()
  {
    return 2130970517;
  }

  public final void initView()
  {
    AppMethodBeat.i(45127);
    setBackBtn(null);
    showHomeBtn(false);
    enableBackMenu(false);
    this.pWB = ((TextView)findViewById(2131826971));
    this.pWC = ((ViewGroup)findViewById(2131827101));
    this.pWD = ((TextView)findViewById(2131827102));
    this.pWE = ((WalletTextView)findViewById(2131827103));
    this.pWF = ((ViewGroup)findViewById(2131827110));
    this.pWG = ((ViewGroup)findViewById(2131826979));
    this.pWH = ((ViewGroup)findViewById(2131827104));
    this.pWI = ((TextView)findViewById(2131827105));
    this.pWJ = ((TextView)findViewById(2131827106));
    this.pWK = ((WalletTextView)findViewById(2131827107));
    this.pWM = ((Button)findViewById(2131827116));
    this.pWM.setOnClickListener(new RemittanceResultNewUI.2(this));
    this.pSL = ((WalletSuccPageAwardWidget)findViewById(2131826996));
    this.pUF = ((LinearLayout)findViewById(2131827028));
    this.pUG = ((LinearLayout)findViewById(2131822843));
    this.pRn = ((LinearLayout)findViewById(2131827032));
    this.pUH = ((LinearLayout)findViewById(2131827109));
    this.pUI = ((TextView)findViewById(2131827030));
    this.pUJ = ((TextView)findViewById(2131827031));
    this.pUK = ((TextView)findViewById(2131827035));
    this.pUL = ((TextView)findViewById(2131827036));
    this.pUM = ((TextView)findViewById(2131827037));
    cfY();
    cgf();
    AppMethodBeat.o(45127);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45125);
    super.onCreate(paramBundle);
    if (d.iW(21))
    {
      if (d.iW(23))
      {
        getWindow().setStatusBarColor(-1);
        getWindow().getDecorView().setSystemUiVisibility(8192);
      }
    }
    else
    {
      if (getSupportActionBar() != null)
        getSupportActionBar().hide();
      this.pSR.dnU();
      this.pWy = ((Orders)this.mBundle.getParcelable("key_orders"));
      this.pGr = ((PayInfo)this.mBundle.getParcelable("key_pay_info"));
      if (this.pGr != null)
        break label146;
      ab.e("MicroMsg.RemittanceResultNewUI", "payInfo is null!!!");
      finish();
      AppMethodBeat.o(45125);
    }
    while (true)
    {
      return;
      getWindow().setStatusBarColor(Color.parseColor("#E5E5E5"));
      break;
      label146: paramBundle = "";
      String str = "";
      if (this.pGr.vwh != null)
      {
        this.pWA = this.pGr.vwh.getBoolean("extinfo_key_4");
        paramBundle = this.pGr.vwh.getString("extinfo_key_1");
        str = this.pGr.vwh.getString("extinfo_key_16");
      }
      int i = this.pGr.cIf;
      this.pQY = i;
      this.pWz = paramBundle;
      ab.i("MicroMsg.RemittanceResultNewUI", "payScene: %s", new Object[] { Integer.valueOf(i) });
      initView();
      if (this.pQY == 31)
      {
        ab.i("MicroMsg.RemittanceResultNewUI", "transId: %s", new Object[] { str });
        com.tencent.mm.plugin.remittance.a.c.ceW().ceZ().fN(str, this.pWz);
      }
      AppMethodBeat.o(45125);
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(45130);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramContextMenu.add(0, 0, 0, getString(2131296875));
    AppMethodBeat.o(45130);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45142);
    super.onDestroy();
    this.pSR.dead();
    if (WalletSuccPageAwardWidget.a(this.pSK))
      this.pSL.onDestroy();
    AppMethodBeat.o(45142);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(45126);
    if (paramInt == 4)
      cgd();
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(45126);
    return bool;
  }

  public void onResume()
  {
    AppMethodBeat.i(45141);
    super.onResume();
    if (WalletSuccPageAwardWidget.a(this.pSK))
      this.pSL.onResume();
    AppMethodBeat.o(45141);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceResultNewUI
 * JD-Core Version:    0.6.2
 */