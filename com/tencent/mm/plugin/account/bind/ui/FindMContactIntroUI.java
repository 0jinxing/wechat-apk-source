package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ag;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.List;

public class FindMContactIntroUI extends MMWizardActivity
{
  private String cFl;
  private ProgressDialog ehJ = null;
  private String elr = null;
  private f fQS = null;
  private boolean gsC = false;
  private List<String[]> gsD = null;
  private ag gsE;
  private String gsF;
  private Button gsR;
  private TextView gsS;
  private TextView gsT;
  private String gsy = "";
  private int gsz = 2;

  private void aoZ()
  {
    AppMethodBeat.i(13617);
    com.tencent.mm.plugin.b.a.wA(this.gsF);
    aqX();
    Ni(1);
    AppMethodBeat.o(13617);
  }

  private void api()
  {
    AppMethodBeat.i(13615);
    boolean bool = b.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    ab.i("MicroMsg.FindMContactIntroUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
    if (!bool)
      AppMethodBeat.o(13615);
    while (true)
    {
      return;
      Object localObject = g.Rg();
      FindMContactIntroUI.9 local9 = new FindMContactIntroUI.9(this);
      this.fQS = local9;
      ((p)localObject).a(431, local9);
      localObject = this.mController.ylL;
      getString(2131297061);
      this.ehJ = h.b((Context)localObject, getString(2131296965), true, new FindMContactIntroUI.10(this));
      g.RS().a(new FindMContactIntroUI.11(this));
      AppMethodBeat.o(13615);
    }
  }

  public final int getLayoutId()
  {
    return 2130969555;
  }

  public final void initView()
  {
    AppMethodBeat.i(13614);
    this.gsR = ((Button)findViewById(2131824033));
    this.gsT = ((TextView)findViewById(2131824035));
    this.gsS = ((TextView)findViewById(2131824034));
    if ((this.gsy != null) && (this.gsy.contains("2")))
      this.gsS.setText(getString(2131299831));
    while (true)
    {
      this.cFl = ((String)g.RP().Ry().get(6, null));
      if ((this.cFl == null) || (this.cFl.equals("")))
        this.cFl = ((String)g.RP().Ry().get(4097, null));
      this.gsR.setOnClickListener(new FindMContactIntroUI.1(this));
      this.gsT.setOnClickListener(new FindMContactIntroUI.4(this));
      AppMethodBeat.o(13614);
      return;
      this.gsS.setText(getString(2131299832));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13610);
    super.onCreate(paramBundle);
    setMMTitle(2131299851);
    com.tencent.mm.plugin.account.a.a.gkF.BV();
    this.elr = getIntent().getStringExtra("regsetinfo_ticket");
    this.gsy = getIntent().getStringExtra("regsetinfo_NextStep");
    this.gsz = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    if (l.apS() != l.a.gvz);
    for (boolean bool = true; ; bool = false)
    {
      this.gsC = bool;
      this.gsF = com.tencent.mm.plugin.b.a.arO();
      ab.d("MicroMsg.FindMContactIntroUI", "tigerreg mNextStep %s  mNextStyle %s ", new Object[] { this.gsy, Integer.valueOf(this.gsz) });
      AppMethodBeat.o(13610);
      return;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13611);
    if (this.fQS != null)
    {
      g.Rg().b(431, this.fQS);
      this.fQS = null;
    }
    super.onDestroy();
    AppMethodBeat.o(13611);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(13616);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      aoZ();
      bool = true;
      AppMethodBeat.o(13616);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(13616);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(13613);
    super.onPause();
    com.tencent.mm.plugin.b.a.wA("RE900_100");
    StringBuilder localStringBuilder;
    if (this.gsC)
    {
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_100_QQ,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R300_100_QQ") + ",4");
      AppMethodBeat.o(13613);
    }
    while (true)
    {
      return;
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_100_phone,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R300_100_phone") + ",4");
      AppMethodBeat.o(13613);
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(13618);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.FindMContactIntroUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(13618);
      return;
    }
    ab.i("MicroMsg.FindMContactIntroUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 48:
    }
    while (true)
    {
      AppMethodBeat.o(13618);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        api();
        AppMethodBeat.o(13618);
        break;
      }
      h.a(this, getString(2131301922), getString(2131301936), getString(2131300878), getString(2131296868), false, new FindMContactIntroUI.2(this), new FindMContactIntroUI.3(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(13612);
    super.onResume();
    initView();
    StringBuilder localStringBuilder;
    if (this.gsC)
    {
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_100_QQ,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R300_100_QQ") + ",1");
      com.tencent.mm.plugin.b.a.wz("R300_100_QQ");
      AppMethodBeat.o(13612);
    }
    while (true)
    {
      return;
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_100_phone,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R300_100_phone") + ",1");
      com.tencent.mm.plugin.b.a.wz("R300_100_phone");
      AppMethodBeat.o(13612);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactIntroUI
 * JD-Core Version:    0.6.2
 */