package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.m.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.protobuf.aqq;
import com.tencent.mm.protocal.protobuf.crw;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.LinkedList;

public class IPCallShareCouponUI extends MMActivity
  implements f
{
  private String eeO;
  private String mTitle;
  private com.tencent.mm.sdk.b.c nBm;
  private ProgressDialog nBv;
  private String nEP;
  private String nEQ;
  private String nER;
  private String nES;
  private String nET;
  private String nEU;
  private String nEV;
  private String nEW;
  private ImageView nFA;
  private TextView nFB;
  private TextView nFC;
  private View nFD;
  private IPCallDynamicTextView nFE;
  private com.tencent.mm.plugin.ipcall.a.e.b nFF;
  private LinkedList<crw> nFG;
  private boolean nFH;
  private RelativeLayout nFk;
  private TextView nFl;
  private ImageView nFm;
  private RelativeLayout nFn;
  private TextView nFo;
  private ImageView nFp;
  private LinearLayout nFq;
  private LinearLayout nFr;
  private LinearLayout nFs;
  private LinearLayout nFt;
  private ImageView nFu;
  private LinearLayout nFv;
  private ImageView nFw;
  private TextView nFx;
  private TextView nFy;
  private TextView nFz;

  public IPCallShareCouponUI()
  {
    AppMethodBeat.i(22334);
    this.nFF = new com.tencent.mm.plugin.ipcall.a.e.b();
    this.nEP = null;
    this.eeO = null;
    this.nEQ = null;
    this.mTitle = null;
    this.nER = null;
    this.nES = null;
    this.nET = null;
    this.nEU = null;
    this.nEV = null;
    this.nEW = null;
    this.nFG = null;
    this.nBm = new IPCallShareCouponUI.1(this);
    this.nFH = false;
    AppMethodBeat.o(22334);
  }

  private void a(aqq paramaqq)
  {
    this.nEP = paramaqq.wut;
    this.eeO = paramaqq.Desc;
    this.nEQ = paramaqq.wuu;
    this.mTitle = paramaqq.Title;
    this.nER = paramaqq.nzz;
    this.nES = paramaqq.wuv;
    this.nEU = paramaqq.wuw;
    this.nEV = paramaqq.wux;
    this.nEW = paramaqq.wuy;
    this.nFG = paramaqq.wuh;
  }

  private void refreshView()
  {
    AppMethodBeat.i(22338);
    if (!bo.isNullOrNil(this.nEU))
    {
      if (this.nET == null)
      {
        this.nFE.setValue(this.nEU, this.nEU);
        this.nET = this.nEU;
      }
    }
    else
    {
      this.nFB.getText();
      this.nFB.setText(this.nEV);
      if (!bo.isNullOrNil(this.nEV))
        break label188;
      this.nFB.setVisibility(8);
    }
    StringBuffer localStringBuffer;
    while (true)
    {
      localStringBuffer = new StringBuffer("");
      if ((this.nFG == null) || (this.nFG.size() <= 0))
        break label199;
      Iterator localIterator = this.nFG.iterator();
      while (localIterator.hasNext())
      {
        crw localcrw = (crw)localIterator.next();
        if ((localcrw != null) && (!bo.isNullOrNil(localcrw.xpw)))
          localStringBuffer.append(localcrw.xpw).append('\n');
      }
      this.nFE.setValue(this.nET, this.nEU);
      break;
      label188: this.nFB.setVisibility(0);
    }
    label199: if (!bo.isNullOrNil(localStringBuffer.toString()))
    {
      if (localStringBuffer.charAt(localStringBuffer.length() - 1) == '\n')
        localStringBuffer.deleteCharAt(localStringBuffer.length() - 1);
      this.nFC.setText(localStringBuffer.toString());
      this.nFC.setVisibility(0);
      if ((this.nFB.getVisibility() != 0) || (this.nFC.getVisibility() != 0))
        break label311;
      this.nFD.setVisibility(0);
      AppMethodBeat.o(22338);
    }
    while (true)
    {
      return;
      this.nFC.setText("");
      this.nFC.setVisibility(8);
      break;
      label311: this.nFD.setVisibility(8);
      AppMethodBeat.o(22338);
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969887;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22335);
    super.onCreate(paramBundle);
    aw.Rg().a(257, this);
    a.xxA.c(this.nBm);
    setMMTitle(2131300790);
    setBackBtn(new IPCallShareCouponUI.8(this));
    this.mController.removeAllOptionMenu();
    addIconOptionMenu(0, 2130839555, new IPCallShareCouponUI.6(this));
    this.nFE = ((IPCallDynamicTextView)findViewById(2131825050));
    this.nFk = ((RelativeLayout)findViewById(2131825055));
    this.nFl = ((TextView)findViewById(2131825056));
    this.nFm = ((ImageView)findViewById(2131825057));
    aw.ZK();
    if (((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xLy, Boolean.FALSE)).booleanValue())
      this.nFm.setVisibility(0);
    aw.ZK();
    paramBundle = (String)com.tencent.mm.model.c.Ry().get(ac.a.xLx, "");
    this.nFl.setText(paramBundle);
    this.nFn = ((RelativeLayout)findViewById(2131825058));
    this.nFo = ((TextView)findViewById(2131825059));
    this.nFp = ((ImageView)findViewById(2131825060));
    aw.ZK();
    paramBundle = (String)com.tencent.mm.model.c.Ry().get(ac.a.xLz, "");
    this.nFo.setText(paramBundle);
    this.nFB = ((TextView)findViewById(2131825051));
    this.nFC = ((TextView)findViewById(2131825053));
    this.nFD = findViewById(2131825052);
    this.nFq = ((LinearLayout)findViewById(2131825069));
    this.nFA = ((ImageView)findViewById(2131825070));
    aw.ZK();
    if (((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xLA, Boolean.FALSE)).booleanValue())
      this.nFA.setVisibility(0);
    this.nFx = ((TextView)findViewById(2131825074));
    this.nFy = ((TextView)findViewById(2131825075));
    this.nFz = ((TextView)findViewById(2131825073));
    this.nFr = ((LinearLayout)findViewById(2131825062));
    this.nFs = ((LinearLayout)findViewById(2131825064));
    this.nFv = ((LinearLayout)findViewById(2131825071));
    this.nFw = ((ImageView)findViewById(2131825072));
    this.nFt = ((LinearLayout)findViewById(2131825067));
    this.nFu = ((ImageView)findViewById(2131825068));
    aw.ZK();
    if (((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xLG, Boolean.FALSE)).booleanValue())
      this.nFu.setVisibility(0);
    int i;
    label562: label590: label596: label617: Object localObject1;
    label782: Object localObject2;
    if (com.tencent.mm.plugin.ipcall.b.c.bIT())
    {
      i = 1;
      if (i != 0)
        this.nFk.setVisibility(8);
      if ((com.tencent.mm.plugin.ipcall.b.c.bIT()) || (com.tencent.mm.m.g.Nu().getInt("WCOPackagePurchaseSwitch", 0) == 0))
        break label1062;
      i = 1;
      if (i != 0)
        this.nFn.setVisibility(0);
      if (com.tencent.mm.m.g.Nu().getInt("WCOAccountDetailSwitch", 0) != 1)
        break label1067;
      i = 1;
      if (i == 0)
        break label1072;
      i = 1;
      if (i != 0)
        this.nFq.setVisibility(8);
      if (!com.tencent.mm.plugin.ipcall.b.c.bIT())
        break label1077;
      i = 1;
      if (i != 0)
        this.nFr.setVisibility(8);
      this.nFx.setOnClickListener(new IPCallShareCouponUI.9(this));
      this.nFy.setOnClickListener(new IPCallShareCouponUI.10(this));
      this.nFq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(22329);
          IPCallShareCouponUI.f(IPCallShareCouponUI.this);
          AppMethodBeat.o(22329);
        }
      });
      this.nFr.setOnClickListener(new IPCallShareCouponUI.12(this));
      this.nFt.setOnClickListener(new IPCallShareCouponUI.13(this));
      this.nFs.setOnClickListener(new IPCallShareCouponUI.14(this));
      this.nFk.setOnClickListener(new IPCallShareCouponUI.15(this));
      this.nFn.setOnClickListener(new IPCallShareCouponUI.2(this));
      this.nFv.setOnClickListener(new IPCallShareCouponUI.3(this));
      paramBundle = com.tencent.mm.plugin.ipcall.b.c.bIU();
      if (paramBundle == null)
        break label1112;
      a(paramBundle);
      refreshView();
      if (!com.tencent.mm.plugin.ipcall.b.c.bIT())
        break label1186;
      paramBundle = getString(2131300846);
      localObject1 = getString(2131300845);
      localObject2 = paramBundle + (String)localObject1;
      localObject1 = new IPCallShareCouponUI.5(this);
      localObject2 = Spannable.Factory.getInstance().newSpannable((CharSequence)localObject2);
      int j = paramBundle.length();
      i = ((Spannable)localObject2).length();
      if ((j < 0) || (j >= i) || (i < 0) || (i > ((Spannable)localObject2).length()))
        break label1165;
      ((Spannable)localObject2).setSpan(localObject1, j, i, 33);
      label896: this.nFz.setText((CharSequence)localObject2);
      this.nFz.setMovementMethod(LinkMovementMethod.getInstance());
      this.nFz.setVisibility(0);
    }
    while (true)
    {
      paramBundle = (LinearLayout)findViewById(2131825054);
      if ((paramBundle != null) && (this.nFk.getVisibility() == 8) && (this.nFn.getVisibility() == 8))
        paramBundle.setVisibility(8);
      paramBundle = (LinearLayout)findViewById(2131825061);
      if ((paramBundle != null) && (this.nFr.getVisibility() == 8) && (this.nFs.getVisibility() == 8))
        paramBundle.setVisibility(8);
      this.nFF.start();
      AppMethodBeat.o(22335);
      return;
      if (com.tencent.mm.m.g.Nu().getInt("WCOPurchaseSwitch", 0) == 1);
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label1057;
        i = 1;
        break;
      }
      label1057: i = 0;
      break;
      label1062: i = 0;
      break label562;
      label1067: i = 0;
      break label590;
      label1072: i = 0;
      break label596;
      label1077: if (com.tencent.mm.m.g.Nu().getInt("WCOInviteFriend", 0) == 1);
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label1107;
        i = 1;
        break;
      }
      label1107: i = 0;
      break label617;
      label1112: this.nFE.setText("0");
      paramBundle = this.mController.ylL;
      getString(2131297061);
      this.nBv = h.b(paramBundle, getString(2131300739), true, new IPCallShareCouponUI.4(this));
      break label782;
      label1165: ((Spannable)localObject2).setSpan(localObject1, 0, ((Spannable)localObject2).length(), 33);
      break label896;
      label1186: this.nFz.setVisibility(8);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22337);
    super.onDestroy();
    aw.Rg().b(257, this);
    a.xxA.d(this.nBm);
    this.nFF.nyL = bo.anU();
    this.nFF.finish();
    AppMethodBeat.o(22337);
  }

  public void onResume()
  {
    AppMethodBeat.i(22336);
    super.onResume();
    com.tencent.mm.plugin.ipcall.a.f.b.bHU().it(false);
    AppMethodBeat.o(22336);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(22339);
    if ((paramm instanceof com.tencent.mm.plugin.ipcall.a.d.g))
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        a(((com.tencent.mm.plugin.ipcall.a.d.g)paramm).nyt);
        refreshView();
        if ((this.nBv != null) && (this.nBv.isShowing()))
          this.nBv.dismiss();
        AppMethodBeat.o(22339);
      }
    while (true)
    {
      return;
      if ((this.nBv != null) && (this.nBv.isShowing()))
      {
        this.nBv.dismiss();
        h.a(this.mController.ylL, getString(2131300737), getString(2131300730), new IPCallShareCouponUI.7(this));
      }
      AppMethodBeat.o(22339);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI
 * JD-Core Version:    0.6.2
 */