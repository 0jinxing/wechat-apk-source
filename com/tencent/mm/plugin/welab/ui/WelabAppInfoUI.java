package com.tencent.mm.plugin.welab.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.welab.d;
import com.tencent.mm.plugin.welab.f;
import com.tencent.mm.plugin.welab.ui.widget.WelabRoundCornerImageView;
import com.tencent.mm.protocal.protobuf.axk;
import com.tencent.mm.protocal.protobuf.axl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WelabAppInfoUI extends MMActivity
{
  private String csB;
  private TextView gne;
  private TextView iKo;
  private MMSwitchBtn ixT;
  private Button mlE;
  private TextView pnu;
  private com.tencent.mm.plugin.welab.d.a.a uMg;
  private int uMh;
  private boolean uMi;
  private WelabRoundCornerImageView uMj;
  private RecyclerView uMk;
  private View uMl;
  private View uMm;
  private View uMn;
  private View uMo;
  private a uMp;
  private View.OnClickListener uMq;

  public WelabAppInfoUI()
  {
    AppMethodBeat.i(80607);
    this.uMq = new WelabAppInfoUI.5(this);
    AppMethodBeat.o(80607);
  }

  private void ddA()
  {
    AppMethodBeat.i(80614);
    Object localObject1 = this.uMg.agR("field_ImgUrl_android");
    Object localObject2 = localObject1;
    if (TextUtils.isEmpty((CharSequence)localObject1))
      localObject2 = this.uMg.agR("field_ImgUrl");
    localObject1 = f.agL((String)localObject2);
    localObject2 = ((List)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
      if (TextUtils.isEmpty((String)((Iterator)localObject2).next()))
        ((Iterator)localObject2).remove();
    if (((List)localObject1).isEmpty())
    {
      this.uMk.setVisibility(8);
      AppMethodBeat.o(80614);
    }
    while (true)
    {
      return;
      this.uMk.setVisibility(0);
      this.uMp.kFl = ((List)localObject1);
      this.uMp.aop.notifyChanged();
      AppMethodBeat.o(80614);
    }
  }

  @TargetApi(21)
  private void ddy()
  {
    AppMethodBeat.i(80609);
    if (Build.VERSION.SDK_INT >= 21)
    {
      Window localWindow = getWindow();
      localWindow.clearFlags(201326592);
      localWindow.addFlags(-2147483648);
      localWindow.setStatusBarColor(getResources().getColor(2131690690));
    }
    AppMethodBeat.o(80609);
  }

  private String ddz()
  {
    AppMethodBeat.i(80613);
    String str = "switch_" + this.uMg.field_LabsAppId;
    AppMethodBeat.o(80613);
    return str;
  }

  public final int getLayoutId()
  {
    return 2130971225;
  }

  public final void initView()
  {
    AppMethodBeat.i(80610);
    super.initView();
    if (this.uMg == null)
    {
      ab.e("WelabAppInfoUI", "info is null");
      AppMethodBeat.o(80610);
    }
    while (true)
    {
      return;
      MY(8);
      ddy();
      if (getSupportActionBar() != null)
        getSupportActionBar().getCustomView().setBackgroundColor(getResources().getColor(2131690690));
      setBackBtn(new WelabAppInfoUI.1(this));
      this.uMj = ((WelabRoundCornerImageView)findViewById(2131829200));
      this.gne = ((TextView)findViewById(2131820678));
      this.pnu = ((TextView)findViewById(2131821841));
      this.uMk = ((RecyclerView)findViewById(2131829204));
      this.uMl = findViewById(2131829205);
      this.mlE = ((Button)findViewById(2131823998));
      this.uMm = findViewById(2131829207);
      this.ixT = ((MMSwitchBtn)findViewById(2131820932));
      this.iKo = ((TextView)findViewById(2131829206));
      this.uMn = findViewById(2131829202);
      this.uMo = findViewById(2131829203);
      this.uMk.setLayoutManager(new LinearLayoutManager(0));
      this.uMk.setOverScrollMode(2);
      this.uMp = new a();
      this.uMk.setAdapter(this.uMp);
      AppMethodBeat.o(80610);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool = true;
    AppMethodBeat.i(80608);
    super.onCreate(paramBundle);
    pO(true);
    dyb();
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      this.csB = paramBundle.getStringExtra("para_appid");
      this.uMg = com.tencent.mm.plugin.welab.a.ddj().agI(this.csB);
      this.uMh = this.uMg.field_Switch;
      if (getIntent().getIntExtra("para_from_with_red_point", 0) != 1)
        break label110;
    }
    while (true)
    {
      this.uMi = bool;
      initView();
      d.t(this.csB, 2, this.uMi);
      AppMethodBeat.o(80608);
      return;
      label110: bool = false;
    }
  }

  public void onPause()
  {
    int i = 0;
    AppMethodBeat.i(80611);
    super.onPause();
    Object localObject;
    if (this.uMh != this.uMg.field_Switch)
    {
      ab.i("WelabAppInfoUI", "update welab info [%b] originSwitch[%d] newSwitch[%d]", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.welab.a.ddj().uLQ.c(this.uMg, new String[0])), Integer.valueOf(this.uMh), Integer.valueOf(this.uMg.field_Switch) });
      this.uMh = this.uMg.field_Switch;
      localObject = new axl();
      axk localaxk = new axk();
      if (!this.uMg.ddw())
        break label268;
      localaxk.wBs = i;
      localaxk.wBt = this.uMg.field_LabsAppId;
      if (this.uMg.field_Switch != 2)
        break label282;
      i = 1;
      label150: localaxk.wkB = i;
      ((axl)localObject).eow.add(localaxk);
      localObject = new j.a(207, (com.tencent.mm.bt.a)localObject);
      ((j)g.K(j.class)).XL().c((j.b)localObject);
      localObject = this.csB;
      if (this.uMg.field_Switch != 2)
        break label287;
    }
    label268: label282: label287: for (i = 4; ; i = 5)
    {
      d.t((String)localObject, i, this.uMi);
      if (this.uMg.field_Switch == 2)
      {
        localObject = new ArrayList();
        ((List)localObject).add(this.uMg);
        com.tencent.mm.plugin.welab.a.ddj();
        com.tencent.mm.plugin.welab.a.ed((List)localObject);
      }
      AppMethodBeat.o(80611);
      return;
      i = bo.ank(this.uMg.field_expId);
      break;
      i = 2;
      break label150;
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(80612);
    super.onResume();
    Object localObject;
    if ((this.uMg.ddu()) && (this.uMg.field_Type == 1))
    {
      this.uMl.setVisibility(0);
      this.iKo.setText(getResources().getString(2131305642) + this.uMg.agR("field_Title"));
      localObject = getSharedPreferences(getPackageName() + "_preferences", 0);
      this.ixT.setEnabled(true);
      if (this.uMg.field_Switch == 2)
      {
        ((SharedPreferences)localObject).edit().putBoolean(ddz(), true).commit();
        this.ixT.setCheck(true);
        this.ixT.setSwitchListener(new WelabAppInfoUI.2(this));
        label175: if (!this.uMg.ddu())
          break label454;
        this.mlE.setText(getResources().getString(2131305640) + this.uMg.agR("field_Title"));
        if (this.uMg.field_Type == 1)
          break label454;
        this.mlE.setVisibility(0);
        this.mlE.setOnClickListener(new WelabAppInfoUI.3(this));
        label262: localObject = this.gne;
        com.tencent.mm.plugin.welab.a.ddj();
        ((TextView)localObject).setText(com.tencent.mm.plugin.welab.a.a(this.uMg));
        this.pnu.setText(this.uMg.agR("field_Introduce"));
        if (!this.uMg.ddu())
          break label466;
        this.uMm.setVisibility(0);
        this.uMm.setOnClickListener(new WelabAppInfoUI.4(this));
        label332: if (!this.uMg.ddu())
          break label478;
        this.uMn.setVisibility(8);
        this.uMo.setVisibility(0);
      }
    }
    while (true)
    {
      ddA();
      this.uMj.setCornerRadiusPercent(0.5F);
      localObject = com.tencent.mm.at.a.a.ahv();
      com.tencent.mm.plugin.welab.a.ddj();
      ((com.tencent.mm.at.a.a)localObject).a(com.tencent.mm.plugin.welab.a.b(this.uMg), this.uMj, com.tencent.mm.plugin.welab.a.ddj().udB);
      AppMethodBeat.o(80612);
      return;
      ((SharedPreferences)localObject).edit().putBoolean(ddz(), false).commit();
      this.ixT.setCheck(false);
      break;
      this.uMl.setVisibility(8);
      break label175;
      label454: this.mlE.setVisibility(8);
      break label262;
      label466: this.uMm.setVisibility(8);
      break label332;
      label478: this.uMn.setVisibility(0);
      this.uMo.setVisibility(8);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends RecyclerView.a<WelabAppInfoUI.b>
  {
    public List<String> kFl;

    public a()
    {
    }

    public final int getItemCount()
    {
      AppMethodBeat.i(80604);
      int i = this.kFl.size();
      AppMethodBeat.o(80604);
      return i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.ui.WelabAppInfoUI
 * JD-Core Version:    0.6.2
 */