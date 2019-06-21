package com.tencent.mm.plugin.aa.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.aa.a.d;
import com.tencent.mm.plugin.aa.a.k;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LaunchAAUI extends BaseAAPresenterActivity
{
  private String chatroomName;
  private TextView gng;
  private Dialog gnn;
  private com.tencent.mm.plugin.aa.a.c.e goH;
  private boolean goI;
  private MMEditText goJ;
  private TextView goK;
  private TextView goL;
  private TextView goM;
  private TextView goN;
  private WalletFormView goO;
  private TextView goP;
  private TextView goQ;
  private ViewGroup goR;
  private ViewGroup goS;
  private List<String> goT;
  private ViewGroup goU;
  private ViewGroup goV;
  private TextView goW;
  private ViewGroup goX;
  private Map<String, Double> goY;
  private Map<String, LaunchAAByPersonNameAmountRow> goZ;
  private boolean gor;
  private Button gpa;
  private TextView gpb;
  private TextView gpc;
  private d gpd;
  private int gpe;
  private int gpf;
  private boolean gpg;
  private String gph;
  private String gpi;
  private int mode;
  private long timestamp;

  public LaunchAAUI()
  {
    AppMethodBeat.i(40842);
    this.goH = ((com.tencent.mm.plugin.aa.a.c.e)V(com.tencent.mm.plugin.aa.a.c.e.class));
    this.mode = com.tencent.mm.plugin.aa.a.a.gkU;
    this.chatroomName = null;
    this.goI = false;
    this.gor = false;
    this.goT = new ArrayList();
    this.goY = new HashMap();
    this.goZ = new HashMap();
    this.gpd = new d();
    this.gpe = 0;
    this.gpf = 0;
    this.gpg = false;
    this.timestamp = 0L;
    AppMethodBeat.o(40842);
  }

  private void aoF()
  {
    AppMethodBeat.i(40844);
    String str;
    Object localObject1;
    Object localObject2;
    if (this.mode == com.tencent.mm.plugin.aa.a.a.gkU)
    {
      str = getString(2131300909);
      localObject1 = getString(2131300910);
      localObject2 = new SpannableStringBuilder("");
      ((SpannableStringBuilder)localObject2).append(str);
      ((SpannableStringBuilder)localObject2).append((CharSequence)localObject1);
      ((SpannableStringBuilder)localObject2).setSpan(new a(new LaunchAAUI.20(this)), str.length(), ((SpannableStringBuilder)localObject2).length(), 18);
      this.goM.setText((CharSequence)localObject2);
      AppMethodBeat.o(40844);
    }
    while (true)
    {
      return;
      if (this.mode == com.tencent.mm.plugin.aa.a.a.gkV)
      {
        localObject2 = getString(2131300920);
        str = getString(2131300921);
        localObject1 = new SpannableStringBuilder("");
        ((SpannableStringBuilder)localObject1).append((CharSequence)localObject2);
        ((SpannableStringBuilder)localObject1).append(str);
        ((SpannableStringBuilder)localObject1).setSpan(new a(new LaunchAAUI.2(this)), ((String)localObject2).length(), ((SpannableStringBuilder)localObject1).length(), 18);
        this.goM.setText((CharSequence)localObject1);
      }
      AppMethodBeat.o(40844);
    }
  }

  private void aoG()
  {
    AppMethodBeat.i(40846);
    this.gpg = false;
    if (this.gpb.getVisibility() != 8)
    {
      this.gpb.startAnimation(AnimationUtils.loadAnimation(this, 2131034213));
      this.gpb.setVisibility(8);
    }
    AppMethodBeat.o(40846);
  }

  private void aoH()
  {
    AppMethodBeat.i(40847);
    if (this.mode == com.tencent.mm.plugin.aa.a.a.gkU)
      if (bo.isNullOrNil(this.goO.getText()))
      {
        dg(false);
        AppMethodBeat.o(40847);
      }
    while (true)
    {
      return;
      if (this.gor)
      {
        dg(false);
        AppMethodBeat.o(40847);
      }
      else if ((this.goT == null) || (this.goT.size() == 0))
      {
        dg(false);
        AppMethodBeat.o(40847);
      }
      else if ((this.goT.size() > d.aoi()) || (this.goI))
      {
        dg(false);
        AppMethodBeat.o(40847);
      }
      else
      {
        double d = com.tencent.mm.plugin.aa.a.h.a(this.goO.getText(), this.goT.size(), 5, 4);
        ab.d("MicroMsg.LaunchAAUI", "b1: %s, b2: %s, avg: %s", new Object[] { this.goO.getText(), Integer.valueOf(this.goT.size()), Double.valueOf(d) });
        if (d < 0.01D)
        {
          ab.i("MicroMsg.LaunchAAUI", "less than 0.01");
          dg(false);
          AppMethodBeat.o(40847);
          continue;
          if ((this.goY == null) || (this.goY.size() == 0))
          {
            dg(false);
            AppMethodBeat.o(40847);
          }
          else if ((this.goY.size() > d.aoi()) || (this.goI))
          {
            dg(false);
            AppMethodBeat.o(40847);
          }
        }
        else
        {
          dg(true);
          AppMethodBeat.o(40847);
        }
      }
    }
  }

  private void aoI()
  {
    AppMethodBeat.i(40849);
    double d;
    if (this.mode == com.tencent.mm.plugin.aa.a.a.gkU)
      if ((this.goT != null) && (this.goT.size() > 0))
      {
        d = com.tencent.mm.plugin.aa.a.h.a(this.goO.getText(), this.goT.size(), 2, 2);
        this.gng.setText(getString(2131296331, new Object[] { Double.valueOf(d) }));
        this.goK.setText(2131300911);
        AppMethodBeat.o(40849);
      }
    while (true)
    {
      return;
      this.gng.setText(getString(2131296333));
      break;
      if ((this.goY == null) || (this.goY.size() == 0))
      {
        this.goK.setText(getString(2131300922, new Object[] { Integer.valueOf(0) }));
        this.gng.setText(getString(2131296333));
        AppMethodBeat.o(40849);
      }
      else
      {
        Iterator localIterator = this.goY.values().iterator();
        for (d = 0.0D; localIterator.hasNext(); d = ((Double)localIterator.next()).doubleValue() + d);
        this.gng.setText(getString(2131296331, new Object[] { Double.valueOf(d) }));
        this.goK.setText(getString(2131300922, new Object[] { Integer.valueOf(this.goY.size()) }));
        AppMethodBeat.o(40849);
      }
    }
  }

  private void aoJ()
  {
    AppMethodBeat.i(40850);
    ((com.tencent.mm.pluginsdk.wallet.b)com.tencent.mm.kernel.g.K(com.tencent.mm.pluginsdk.wallet.b.class)).eA(7, 5);
    com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(3), Integer.valueOf(3) });
    Object localObject1 = new HashMap();
    try
    {
      String str = this.goJ.getText().toString();
      if (bo.isNullOrNil(str))
      {
        str = getString(2131300925);
        ArrayList localArrayList1 = new java/util/ArrayList;
        localArrayList1.<init>();
        ArrayList localArrayList2 = new java/util/ArrayList;
        localArrayList2.<init>();
        Iterator localIterator = this.goY.keySet().iterator();
        long l2;
        for (long l1 = 0L; localIterator.hasNext(); l1 = l2 + l1)
        {
          Object localObject2 = (String)localIterator.next();
          double d = ((Double)this.goY.get(localObject2)).doubleValue();
          localObject3 = new com/tencent/mm/protocal/protobuf/j;
          ((com.tencent.mm.protocal.protobuf.j)localObject3).<init>();
          ((com.tencent.mm.protocal.protobuf.j)localObject3).cSh = com.tencent.mm.wallet_core.ui.e.iz(String.valueOf(d), "100");
          ((com.tencent.mm.protocal.protobuf.j)localObject3).username = ((String)localObject2);
          localArrayList1.add(localObject3);
          l2 = ((com.tencent.mm.protocal.protobuf.j)localObject3).cSh;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localArrayList2.add(((com.tencent.mm.protocal.protobuf.j)localObject3).cSh);
        }
        Object localObject3 = new com/tencent/mm/protocal/protobuf/j;
        ((com.tencent.mm.protocal.protobuf.j)localObject3).<init>();
        ((com.tencent.mm.protocal.protobuf.j)localObject3).username = r.Yz();
        ((com.tencent.mm.protocal.protobuf.j)localObject3).cSh = l1;
        ((Map)localObject1).put(k.glP, str);
        ((Map)localObject1).put(k.glQ, Long.valueOf(l1));
        ((Map)localObject1).put(k.glV, localArrayList1);
        ((Map)localObject1).put(k.glT, this.chatroomName);
        ((Map)localObject1).put(k.glW, Long.valueOf(this.timestamp));
        if (this.gnn != null)
          this.gnn.dismiss();
        this.gnn = com.tencent.mm.wallet_core.ui.g.b(this, false, null);
        localObject3 = this.goH.gmK;
        localObject1 = f.cU(localObject1).c((com.tencent.mm.vending.c.a)localObject3);
        localObject3 = new com/tencent/mm/plugin/aa/ui/LaunchAAUI$11;
        ((LaunchAAUI.11)localObject3).<init>(this);
        localObject3 = ((c)localObject1).f((com.tencent.mm.vending.c.a)localObject3);
        localObject1 = new com/tencent/mm/plugin/aa/ui/LaunchAAUI$10;
        ((LaunchAAUI.10)localObject1).<init>(this);
        ((c)localObject3).a((d.a)localObject1);
        com.tencent.mm.plugin.report.service.h.pYm.e(13723, new Object[] { Integer.valueOf(2), Integer.valueOf(com.tencent.mm.plugin.aa.a.h.vE(this.chatroomName).size()), Integer.valueOf(localArrayList1.size() + 1), Long.valueOf(l1), str, bo.c(localArrayList2, ",") });
        AppMethodBeat.o(40850);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.LaunchAAUI", "launchAAByPerson error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(40850);
      }
    }
  }

  private void aoK()
  {
    AppMethodBeat.i(40852);
    if ((this.goI) && (!this.gpg))
      if (this.mode == com.tencent.mm.plugin.aa.a.a.gkU)
      {
        vJ(getString(2131300919, new Object[] { Integer.valueOf(d.aoi()) }));
        AppMethodBeat.o(40852);
      }
    while (true)
    {
      return;
      vJ(getString(2131300919, new Object[] { Integer.valueOf(d.aoh()) }));
      AppMethodBeat.o(40852);
      continue;
      if ((this.gor) && (!this.gpg))
      {
        vJ(getString(2131300927, new Object[] { Float.valueOf((float)d.aoj() / 100.0F) }));
        AppMethodBeat.o(40852);
      }
      else
      {
        if ((!this.goI) && (!this.gor))
          aoG();
        AppMethodBeat.o(40852);
      }
    }
  }

  private void dg(boolean paramBoolean)
  {
    AppMethodBeat.i(40848);
    this.gpa.setEnabled(paramBoolean);
    if (!paramBoolean)
    {
      this.goK.setTextColor(getResources().getColor(2131689626));
      this.gng.setTextColor(getResources().getColor(2131689626));
      this.goL.setTextColor(getResources().getColor(2131689626));
      AppMethodBeat.o(40848);
    }
    while (true)
    {
      return;
      this.goK.setTextColor(getResources().getColor(2131689761));
      this.gng.setTextColor(getResources().getColor(2131689761));
      this.goL.setTextColor(getResources().getColor(2131689761));
      AppMethodBeat.o(40848);
    }
  }

  private void vJ(String paramString)
  {
    AppMethodBeat.i(40845);
    this.gpg = true;
    this.gpb.setVisibility(0);
    this.gpb.startAnimation(AnimationUtils.loadAnimation(this, 2131034193));
    this.gpb.setText(paramString);
    AppMethodBeat.o(40845);
  }

  public final boolean aoE()
  {
    return false;
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969922;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(40853);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    label202: double d;
    if (paramInt1 == 233)
    {
      if (paramInt2 != -1)
        break label487;
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      if (this.mode == com.tencent.mm.plugin.aa.a.a.gkU)
      {
        if (!bo.isNullOrNil(paramIntent))
        {
          paramIntent = paramIntent.split(",");
          this.goT.clear();
          this.goT.addAll(Arrays.asList(paramIntent));
        }
        paramIntent = com.tencent.mm.plugin.aa.a.h.vE(this.chatroomName);
        if ((paramIntent == null) || (this.goT == null) || (this.goT.size() != paramIntent.size()) || (!t.kH(this.chatroomName)))
          break label296;
        paramIntent = this.goQ;
        if (this.goT != null)
        {
          paramInt1 = this.goT.size();
          paramIntent.setText(getString(2131300907, new Object[] { Integer.valueOf(paramInt1) }));
        }
      }
      else
      {
        aoG();
        if ((this.goT == null) || (this.goT.size() <= d.aoi()))
          break label348;
        this.goI = true;
        d = bo.getDouble(this.goO.getText(), 0.0D);
        if ((this.goT == null) || (d * 100.0D / this.goT.size() <= d.aoj()))
          break label356;
        this.gor = true;
        com.tencent.mm.plugin.report.service.h.pYm.e(13722, new Object[] { Integer.valueOf(2) });
        label272: aoH();
        aoI();
        aoK();
        AppMethodBeat.o(40853);
      }
    }
    while (true)
    {
      return;
      paramInt1 = 0;
      break;
      label296: paramIntent = this.goQ;
      if (this.goT != null);
      for (paramInt1 = this.goT.size(); ; paramInt1 = 0)
      {
        paramIntent.setText(getString(2131300912, new Object[] { Integer.valueOf(paramInt1) }));
        break;
      }
      label348: this.goI = false;
      break label202;
      label356: this.gor = false;
      break label272;
      if ((paramInt1 == 236) && (paramInt2 == -1))
      {
        paramIntent = paramIntent.getStringArrayListExtra("selectUI");
        this.goY.clear();
        if (paramIntent != null)
          try
          {
            if (paramIntent.size() <= 0)
              break label496;
            paramIntent = paramIntent.iterator();
            while (paramIntent.hasNext())
            {
              localObject = ((String)paramIntent.next()).split(",");
              d = bo.getDouble(localObject[1], 0.0D);
              this.goY.put(localObject[0], Double.valueOf(d));
            }
          }
          catch (Exception paramIntent)
          {
            ab.e("MicroMsg.LaunchAAUI", "onActivityResult, SELECT_AMOUNT_SELECT_REQUEST_CODE error: %s", new Object[] { paramIntent.getMessage() });
          }
      }
      else
      {
        label487: AppMethodBeat.o(40853);
        continue;
      }
      label496: if ((this.goY != null) && (this.goY.size() > 0))
      {
        this.goW.setText(getString(2131300924, new Object[] { Integer.valueOf(this.goY.size()) }));
        this.goW.setTextColor(getResources().getColor(2131689761));
        paramInt1 = (int)getResources().getDimension(2131427901);
        paramInt2 = (int)getResources().getDimension(2131427898);
        int i = (int)getResources().getDimension(2131427899);
        this.goX.setPadding(paramInt1, paramInt2, paramInt1, i);
        this.goX.setBackgroundResource(2130839146);
        this.goV.setVisibility(0);
      }
      while (true)
      {
        this.goV.removeAllViews();
        this.goZ.clear();
        if ((this.goY == null) || (this.goY.size() <= 0))
          break;
        Iterator localIterator = this.goY.keySet().iterator();
        for (paramInt1 = 0; localIterator.hasNext(); paramInt1++)
        {
          localObject = (String)localIterator.next();
          d = ((Double)this.goY.get(localObject)).doubleValue();
          paramIntent = new com/tencent/mm/plugin/aa/ui/LaunchAAByPersonNameAmountRow;
          paramIntent.<init>(this);
          if (paramInt1 >= this.goY.size() - 1)
            paramIntent.setDividerVisible(false);
          String str = this.chatroomName;
          paramIntent.goa.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramIntent.getContext(), ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).getDisplayName((String)localObject, str), paramIntent.goa.getTextSize()));
          paramIntent.gng.setText(paramIntent.getContext().getString(2131296331, new Object[] { Double.valueOf(d) }));
          this.goV.addView(paramIntent);
          this.goZ.put(localObject, paramIntent);
        }
        this.goW.setText(2131300923);
        this.goW.setTextColor(getResources().getColor(2131689625));
        paramInt1 = (int)getResources().getDimension(2131427901);
        this.goX.setPadding(paramInt1, paramInt1, paramInt1, paramInt1);
        this.goX.setBackgroundResource(2130839148);
        this.goV.setVisibility(8);
      }
      if (this.gnR != null)
        this.gnR.requestLayout();
      this.gpf = 0;
      Object localObject = this.goN;
      paramIntent = new com/tencent/mm/plugin/aa/ui/LaunchAAUI$13;
      paramIntent.<init>(this);
      ((TextView)localObject).post(paramIntent);
      aoI();
      aoH();
      AppMethodBeat.o(40853);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(40843);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.LaunchAAUI", "LaunchAAUI onCreate");
    setBackBtn(new LaunchAAUI.1(this));
    this.timestamp = (System.currentTimeMillis() / 1000L);
    setMMTitle(2131300931);
    paramBundle = this.goH.gmL;
    f.dMn().c(paramBundle).f(new LaunchAAUI.18(this)).a(new LaunchAAUI.17(this));
    this.chatroomName = getIntent().getStringExtra("chatroom_name");
    this.gph = getIntent().getStringExtra("amount");
    this.gpi = getIntent().getStringExtra("title");
    if (bo.isNullOrNil(this.chatroomName))
    {
      ab.e("MicroMsg.LaunchAAUI", "chatroomName is null!!!");
      this.chatroomName = "";
    }
    paramBundle = this.chatroomName;
    if (!bo.isNullOrNil(paramBundle))
      if (t.kH(paramBundle))
      {
        this.chatroomName = paramBundle;
        this.gnR = findViewById(2131823601);
        this.gnR.setOnTouchListener(new LaunchAAUI.12(this));
        this.goM = ((TextView)findViewById(2131825225));
        this.goM.setClickable(true);
        this.goM.setOnTouchListener(new m(this));
        aoF();
        this.gpa = ((Button)findViewById(2131825234));
        this.gpa.setOnClickListener(new LaunchAAUI.14(this));
        this.gpb = ((TextView)findViewById(2131825236));
        this.gpc = ((TextView)findViewById(2131825235));
        this.goJ = ((MMEditText)findViewById(2131825230));
        this.goK = ((TextView)findViewById(2131825231));
        this.gng = ((TextView)findViewById(2131825233));
        this.goL = ((TextView)findViewById(2131825232));
        this.goK.setText(2131300911);
        this.mode = com.tencent.mm.plugin.aa.a.a.gkU;
        this.goN = ((TextView)findViewById(2131824949));
        this.goN.setClickable(true);
        this.goN.setOnTouchListener(new m());
        paramBundle = new SpannableString(getString(2131298266));
        paramBundle.setSpan(new a(new LaunchAAUI.15(this)), 0, paramBundle.length(), 18);
        this.goN.setText(paramBundle);
        this.goN.setVisibility(8);
        this.goJ.addTextChangedListener(new LaunchAAUI.16(this));
        this.goO = ((WalletFormView)findViewById(2131825220));
        this.goO.a(new LaunchAAUI.4(this));
        a(this.goO, 2, false, false);
        this.goQ = ((TextView)findViewById(2131825228));
        this.goP = ((TextView)findViewById(2131825227));
        if (!t.kH(this.chatroomName))
          break label1025;
        paramBundle = com.tencent.mm.plugin.aa.a.h.vE(this.chatroomName);
        label578: this.goT = paramBundle;
        if (this.goT.size() <= d.aoi())
          break label1077;
        this.goT.clear();
        this.goQ.setText(getString(2131301904));
        aoH();
        label625: this.goQ.setOnClickListener(new LaunchAAUI.5(this, paramBundle));
        this.goR = ((ViewGroup)findViewById(2131825226));
        this.goS = ((ViewGroup)findViewById(2131825219));
        this.goO.requestFocus();
        this.goI = false;
        this.goW = ((TextView)findViewById(2131825223));
        this.goW.setText(2131300923);
        this.goW.setTextColor(getResources().getColor(2131689625));
        this.goU = ((ViewGroup)findViewById(2131825221));
        this.goV = ((ViewGroup)findViewById(2131825224));
        this.goX = ((ViewGroup)findViewById(2131825222));
        this.goX.setOnClickListener(new LaunchAAUI.6(this));
        if (!bo.isNullOrNil(this.gpi))
        {
          ab.i("MicroMsg.LaunchAAUI", "default title: %s", new Object[] { this.gpi });
          this.goJ.setText(this.gpi);
          if (this.gpi.length() <= 20)
            break label1153;
        }
      }
    label1025: label1153: for (int i = 20; ; i = this.gpi.length())
    {
      this.goJ.setSelection(i);
      if (!bo.isNullOrNil(this.gph))
      {
        ab.i("MicroMsg.LaunchAAUI", "default amount: %s", new Object[] { this.gph });
        paramBundle = com.tencent.mm.wallet_core.ui.e.b(new StringBuilder().append(this.gph).toString(), "100", RoundingMode.HALF_UP);
        this.goO.setText(paramBundle);
        this.goO.setSelection(paramBundle.length());
      }
      aoH();
      com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
      AppMethodBeat.o(40843);
      return;
      paramBundle = bo.P(paramBundle.split(","));
      if (paramBundle != null)
      {
        paramBundle.remove(r.Yz());
        if (paramBundle.size() > 0)
        {
          paramBundle = (String)paramBundle.get(0);
          break;
        }
      }
      paramBundle = "";
      break;
      ab.i("MicroMsg.LaunchAAUI", "is single chat: %s", new Object[] { this.chatroomName });
      paramBundle = new ArrayList();
      paramBundle.add(r.Yz());
      paramBundle.add(this.chatroomName);
      break label578;
      label1077: if (t.kH(this.chatroomName))
      {
        this.goQ.setText(getString(2131300907, new Object[] { Integer.valueOf(paramBundle.size()) }));
        break label625;
      }
      this.goQ.setText(getString(2131300912, new Object[] { Integer.valueOf(paramBundle.size()) }));
      break label625;
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(40851);
    super.onStop();
    if (this.goZ != null)
      this.goZ.clear();
    AppMethodBeat.o(40851);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAUI
 * JD-Core Version:    0.6.2
 */