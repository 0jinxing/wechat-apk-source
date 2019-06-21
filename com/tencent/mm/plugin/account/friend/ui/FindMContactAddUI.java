package com.tencent.mm.plugin.account.friend.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.i;
import com.tencent.mm.plugin.account.friend.a.i.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.List;

public class FindMContactAddUI extends MMWizardActivity
{
  private ProgressDialog ehJ;
  private String elr;
  private TextView emptyTipTv;
  private f fQS;
  private String gsF;
  private String gsy;
  private int gsz;
  private ListView gtT;
  private i gwQ;
  private View gwR;
  private TextView gwS;
  private TextView gwT;
  private TextView gwU;
  private TextView gwV;
  private Button gwW;
  private int gwX;
  private List<String[]> gwY;
  private boolean gwZ;
  private i.a gxa;

  public FindMContactAddUI()
  {
    AppMethodBeat.i(108526);
    this.ehJ = null;
    this.emptyTipTv = null;
    this.gwS = null;
    this.gwT = null;
    this.gwU = null;
    this.gwV = null;
    this.gwW = null;
    this.elr = null;
    this.fQS = null;
    this.gsy = "";
    this.gsz = 2;
    this.gwZ = true;
    this.gxa = new i.a()
    {
      public final void notifyDataSetChanged()
      {
        AppMethodBeat.i(108520);
        if ((FindMContactAddUI.e(FindMContactAddUI.this) != 2) && (FindMContactAddUI.e(FindMContactAddUI.this) == 1))
        {
          FindMContactAddUI.f(FindMContactAddUI.this).setText(FindMContactAddUI.this.getString(2131299829));
          if (!FindMContactAddUI.c(FindMContactAddUI.this).apN())
            break label240;
          if ((FindMContactAddUI.e(FindMContactAddUI.this) != 1) && (FindMContactAddUI.f(FindMContactAddUI.this).getVisibility() == 0) && (FindMContactAddUI.g(FindMContactAddUI.this) != null))
          {
            FindMContactAddUI.f(FindMContactAddUI.this).setVisibility(8);
            FindMContactAddUI.g(FindMContactAddUI.this).setVisibility(0);
          }
          label116: if ((FindMContactAddUI.c(FindMContactAddUI.this).getSelectCount() <= 0) || (FindMContactAddUI.e(FindMContactAddUI.this) == 1))
            break label302;
          FindMContactAddUI.h(FindMContactAddUI.this).setText(FindMContactAddUI.this.getResources().getQuantityString(2131361797, FindMContactAddUI.c(FindMContactAddUI.this).getSelectCount(), new Object[] { Integer.valueOf(FindMContactAddUI.c(FindMContactAddUI.this).getSelectCount()) }));
          AppMethodBeat.o(108520);
        }
        while (true)
        {
          return;
          FindMContactAddUI.f(FindMContactAddUI.this).setText(FindMContactAddUI.this.getString(2131299828, new Object[] { Integer.valueOf(FindMContactAddUI.c(FindMContactAddUI.this).getCount()) }));
          break;
          label240: if ((FindMContactAddUI.e(FindMContactAddUI.this) == 1) || (FindMContactAddUI.f(FindMContactAddUI.this).getVisibility() != 8) || (FindMContactAddUI.g(FindMContactAddUI.this) == null))
            break label116;
          FindMContactAddUI.f(FindMContactAddUI.this).setVisibility(0);
          FindMContactAddUI.g(FindMContactAddUI.this).setVisibility(8);
          break label116;
          label302: FindMContactAddUI.h(FindMContactAddUI.this).setText(FindMContactAddUI.this.getResources().getQuantityString(2131361800, FindMContactAddUI.c(FindMContactAddUI.this).getCount(), new Object[] { Integer.valueOf(FindMContactAddUI.c(FindMContactAddUI.this).getCount()) }));
          AppMethodBeat.o(108520);
        }
      }
    };
    AppMethodBeat.o(108526);
  }

  private void aoZ()
  {
    AppMethodBeat.i(108530);
    com.tencent.mm.plugin.b.a.wA(this.gsF);
    aqX();
    Ni(1);
    AppMethodBeat.o(108530);
  }

  private void aqv()
  {
    AppMethodBeat.i(108528);
    AppCompatActivity localAppCompatActivity = this.mController.ylL;
    getString(2131297061);
    this.ehJ = h.b(localAppCompatActivity, getString(2131301455), true, new FindMContactAddUI.1(this));
    g.RS().a(new FindMContactAddUI.6(this));
    AppMethodBeat.o(108528);
  }

  public final int getLayoutId()
  {
    return 2130969552;
  }

  public final void initView()
  {
    AppMethodBeat.i(108534);
    this.emptyTipTv = ((TextView)findViewById(2131824026));
    this.emptyTipTv.setText(2131301453);
    this.gtT = ((ListView)findViewById(2131824012));
    if ((this.gsz != 2) && (this.gsz == 1))
    {
      this.gwR = LayoutInflater.from(this).inflate(2130969554, null);
      this.gwS = ((TextView)this.gwR.findViewById(2131824029));
      this.gwT = ((TextView)this.gwR.findViewById(2131824028));
      this.gwU = ((TextView)this.gwR.findViewById(2131824032));
      this.gwW = ((Button)this.gwR.findViewById(2131824031));
      this.gwT.setText(getString(2131299861));
      this.gwU.setText(getString(2131299862));
      this.gwW.setText(getString(2131299829));
    }
    while (true)
    {
      this.gwQ = new i(this, this.gxa, 1);
      this.gwW.setOnClickListener(new FindMContactAddUI.8(this));
      if (this.gwV != null)
      {
        this.gwV.setOnClickListener(new FindMContactAddUI.9(this));
        this.gwV.setVisibility(8);
      }
      this.gtT.addHeaderView(this.gwR);
      this.gtT.setAdapter(this.gwQ);
      addTextOptionMenu(0, getString(2131296989), new FindMContactAddUI.10(this));
      new FindMContactAddUI.11(this);
      AppMethodBeat.o(108534);
      return;
      this.gwR = LayoutInflater.from(this).inflate(2130969553, null);
      this.gwS = ((TextView)this.gwR.findViewById(2131824029));
      this.gwT = ((TextView)this.gwR.findViewById(2131824028));
      this.gwU = ((TextView)this.gwR.findViewById(2131824032));
      this.gwW = ((Button)this.gwR.findViewById(2131824031));
      this.gwT.setText(getString(2131299861));
      this.gwU.setText(getString(2131299862));
      this.gwW.setText(getString(2131299828, new Object[] { Integer.valueOf(0) }));
      this.gwV = ((TextView)this.gwR.findViewById(2131824030));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(108527);
    super.onCreate(paramBundle);
    setMMTitle(2131299833);
    com.tencent.mm.plugin.account.a.a.gkF.BV();
    this.elr = getIntent().getStringExtra("regsetinfo_ticket");
    this.gsy = getIntent().getStringExtra("regsetinfo_NextStep");
    this.gsz = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    this.gwX = getIntent().getIntExtra("login_type", 0);
    this.gsF = com.tencent.mm.plugin.b.a.arO();
    initView();
    AppMethodBeat.o(108527);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(108533);
    if (this.fQS != null)
    {
      g.Rg().b(30, this.fQS);
      this.fQS = null;
    }
    super.onDestroy();
    AppMethodBeat.o(108533);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(108529);
    boolean bool;
    if (paramInt == 4)
    {
      aoZ();
      bool = true;
      AppMethodBeat.o(108529);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(108529);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(108532);
    super.onPause();
    StringBuilder localStringBuilder;
    if (this.gwX == 1)
    {
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_300_QQ,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R300_300_QQ") + ",2");
      AppMethodBeat.o(108532);
    }
    while (true)
    {
      return;
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_300_phone,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R300_300_phone") + ",2");
      AppMethodBeat.o(108532);
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(108535);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.FindMContactAddUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(108535);
      return;
    }
    ab.i("MicroMsg.FindMContactAddUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 48:
    }
    while (true)
    {
      AppMethodBeat.o(108535);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        aqv();
        AppMethodBeat.o(108535);
        break;
      }
      this.gwZ = false;
      h.a(this, getString(2131301922), getString(2131301936), getString(2131300878), getString(2131296868), false, new FindMContactAddUI.4(this), new FindMContactAddUI.5(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(108531);
    super.onResume();
    this.gwQ.notifyDataSetChanged();
    StringBuilder localStringBuilder;
    if (this.gwX == 1)
    {
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_300_QQ,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R300_300_QQ") + ",1");
      com.tencent.mm.plugin.b.a.wz("R300_300_QQ");
      if (!this.gwZ)
        break label238;
      boolean bool = b.a(this, "android.permission.READ_CONTACTS", 48, null, null);
      ab.i("MicroMsg.FindMContactAddUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
      if (bool)
        break label234;
      AppMethodBeat.o(108531);
    }
    while (true)
    {
      return;
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_300_phone,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R300_300_phone") + ",1");
      com.tencent.mm.plugin.b.a.wz("R300_300_phone");
      break;
      label234: aqv();
      label238: AppMethodBeat.o(108531);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI
 * JD-Core Version:    0.6.2
 */