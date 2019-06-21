package com.tencent.mm.plugin.account.friend.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
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
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.List;

public class FindMContactInviteUI extends MMWizardActivity
{
  private ProgressDialog ehJ;
  private TextView emptyTipTv;
  private f fQS;
  private String gsF;
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
  private String gxc;

  public FindMContactInviteUI()
  {
    AppMethodBeat.i(108551);
    this.ehJ = null;
    this.emptyTipTv = null;
    this.gwS = null;
    this.gwT = null;
    this.gwU = null;
    this.gwV = null;
    this.gwW = null;
    this.gxc = null;
    this.fQS = null;
    this.gsz = 2;
    this.gwZ = true;
    this.gxa = new FindMContactInviteUI.6(this);
    AppMethodBeat.o(108551);
  }

  private void aoZ()
  {
    AppMethodBeat.i(108554);
    com.tencent.mm.plugin.b.a.wA(this.gsF);
    aqX();
    Ni(1);
    AppMethodBeat.o(108554);
  }

  private void aqv()
  {
    AppMethodBeat.i(108556);
    AppCompatActivity localAppCompatActivity = this.mController.ylL;
    getString(2131297061);
    this.ehJ = h.b(localAppCompatActivity, getString(2131301455), true, new FindMContactInviteUI.1(this));
    g.RS().a(new FindMContactInviteUI.5(this));
    AppMethodBeat.o(108556);
  }

  public final int getLayoutId()
  {
    return 2130969552;
  }

  public final void initView()
  {
    AppMethodBeat.i(108559);
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
      this.gwT.setText(getString(2131299839));
      this.gwU.setText(getString(2131299839));
      this.gwW.setText(getString(2131299838));
    }
    while (true)
    {
      this.gwQ = new i(this, this.gxa, 2);
      this.gwW.setOnClickListener(new FindMContactInviteUI.7(this));
      if (this.gwV != null)
      {
        this.gwV.setOnClickListener(new FindMContactInviteUI.8(this));
        this.gwV.setVisibility(8);
      }
      this.gtT.addHeaderView(this.gwR);
      this.gtT.setAdapter(this.gwQ);
      this.gtT.setOnScrollListener(new com.tencent.mm.ui.applet.a());
      this.gtT.setOnTouchListener(new FindMContactInviteUI.9(this));
      addTextOptionMenu(0, getString(2131296944), new FindMContactInviteUI.10(this));
      new FindMContactInviteUI.11(this);
      AppMethodBeat.o(108559);
      return;
      this.gwR = LayoutInflater.from(this).inflate(2130969553, null);
      this.gwS = ((TextView)this.gwR.findViewById(2131824029));
      this.gwT = ((TextView)this.gwR.findViewById(2131824028));
      this.gwU = ((TextView)this.gwR.findViewById(2131824032));
      this.gwW = ((Button)this.gwR.findViewById(2131824031));
      this.gwT.setText(getString(2131299842));
      this.gwU.setText(getString(2131299839));
      this.gwW.setText(getString(2131299837, new Object[] { Integer.valueOf(0) }));
      this.gwV = ((TextView)this.gwR.findViewById(2131824030));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(108552);
    super.onCreate(paramBundle);
    setMMTitle(2131299841);
    com.tencent.mm.plugin.account.a.a.gkF.BV();
    this.gxc = getIntent().getStringExtra("regsetinfo_ticket");
    this.gwX = getIntent().getIntExtra("login_type", 0);
    this.gsz = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    this.gsF = com.tencent.mm.plugin.b.a.arO();
    initView();
    AppMethodBeat.o(108552);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(108558);
    if (this.fQS != null)
    {
      g.Rg().b(432, this.fQS);
      this.fQS = null;
    }
    if (this.gwQ != null)
    {
      i locali = this.gwQ;
      if (locali.gvm != null)
      {
        locali.gvm.detach();
        locali.gvm = null;
      }
    }
    ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).clearFriendData();
    super.onDestroy();
    AppMethodBeat.o(108558);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(108553);
    boolean bool;
    if (paramInt == 4)
    {
      aoZ();
      bool = true;
      AppMethodBeat.o(108553);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(108553);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(108557);
    super.onPause();
    StringBuilder localStringBuilder;
    if (this.gwX == 1)
    {
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_400_QQ,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R300_400_QQ") + ",2");
      AppMethodBeat.o(108557);
    }
    while (true)
    {
      return;
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_400_phone,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R300_400_phone") + ",2");
      AppMethodBeat.o(108557);
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(108560);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.FindMContactInviteUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(108560);
      return;
    }
    ab.i("MicroMsg.FindMContactInviteUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 48:
    }
    while (true)
    {
      AppMethodBeat.o(108560);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        aqv();
        AppMethodBeat.o(108560);
        break;
      }
      this.gwZ = false;
      h.a(this, getString(2131301922), getString(2131301936), getString(2131300878), getString(2131296868), false, new FindMContactInviteUI.3(this), new FindMContactInviteUI.4(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(108555);
    super.onResume();
    this.gwQ.notifyDataSetChanged();
    StringBuilder localStringBuilder;
    if (this.gwX == 1)
    {
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_400_QQ,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R300_400_QQ") + ",1");
      if (!this.gwZ)
        break label226;
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.READ_CONTACTS", 48, null, null);
      ab.i("MicroMsg.FindMContactInviteUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
      if (bool)
        break label222;
      AppMethodBeat.o(108555);
    }
    while (true)
    {
      return;
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_400_phone,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R300_400_phone") + ",1");
      break;
      label222: aqv();
      label226: AppMethodBeat.o(108555);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI
 * JD-Core Version:    0.6.2
 */