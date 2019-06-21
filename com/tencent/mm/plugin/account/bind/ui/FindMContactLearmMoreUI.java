package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
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
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.List;

public class FindMContactLearmMoreUI extends MMWizardActivity
{
  private String cFl;
  private ProgressDialog ehJ = null;
  private String elr = null;
  private f fQS = null;
  private List<String[]> gsD = null;
  private ag gsE;
  private Button gsW;
  private TextView gsX;
  private String gsy = "";
  private int gsz = 2;

  private void aoZ()
  {
    AppMethodBeat.i(13638);
    aqX();
    Ni(1);
    AppMethodBeat.o(13638);
  }

  private void api()
  {
    AppMethodBeat.i(13636);
    boolean bool = b.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    ab.i("MicroMsg.FindMContactLearmMoreUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
    if (!bool)
      AppMethodBeat.o(13636);
    while (true)
    {
      return;
      Object localObject = g.Rg();
      FindMContactLearmMoreUI.3 local3 = new FindMContactLearmMoreUI.3(this);
      this.fQS = local3;
      ((p)localObject).a(431, local3);
      localObject = this.mController.ylL;
      getString(2131297061);
      this.ehJ = h.b((Context)localObject, getString(2131296965), true, new FindMContactLearmMoreUI.4(this));
      g.RS().a(new al.a()
      {
        public final boolean acf()
        {
          AppMethodBeat.i(13627);
          try
          {
            FindMContactLearmMoreUI.a(FindMContactLearmMoreUI.this, com.tencent.mm.pluginsdk.a.cJ(FindMContactLearmMoreUI.this));
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("tigerreg mobileList size ");
            if (FindMContactLearmMoreUI.j(FindMContactLearmMoreUI.this) == null);
            for (int i = 0; ; i = FindMContactLearmMoreUI.j(FindMContactLearmMoreUI.this).size())
            {
              ab.d("MicroMsg.FindMContactLearmMoreUI", i);
              AppMethodBeat.o(13627);
              return true;
            }
          }
          catch (Exception localException)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.FindMContactLearmMoreUI", localException, "", new Object[0]);
          }
        }

        public final boolean acg()
        {
          AppMethodBeat.i(13626);
          if ((FindMContactLearmMoreUI.j(FindMContactLearmMoreUI.this) != null) && (FindMContactLearmMoreUI.j(FindMContactLearmMoreUI.this).size() != 0))
          {
            FindMContactLearmMoreUI.a(FindMContactLearmMoreUI.this, new ag(FindMContactLearmMoreUI.h(FindMContactLearmMoreUI.this), FindMContactLearmMoreUI.j(FindMContactLearmMoreUI.this)));
            g.Rg().a(FindMContactLearmMoreUI.k(FindMContactLearmMoreUI.this), 0);
          }
          while (true)
          {
            AppMethodBeat.o(13626);
            return false;
            if (FindMContactLearmMoreUI.c(FindMContactLearmMoreUI.this) != null)
            {
              FindMContactLearmMoreUI.c(FindMContactLearmMoreUI.this).dismiss();
              FindMContactLearmMoreUI.d(FindMContactLearmMoreUI.this);
            }
            FindMContactLearmMoreUI.b(FindMContactLearmMoreUI.this);
          }
        }

        public final String toString()
        {
          AppMethodBeat.i(13628);
          String str = super.toString() + "|doUpload";
          AppMethodBeat.o(13628);
          return str;
        }
      });
      ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).syncUploadMContactStatus(true, false);
      ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).syncAddrBookAndUpload();
      AppMethodBeat.o(13636);
    }
  }

  public final int getLayoutId()
  {
    return 2130969556;
  }

  public final void initView()
  {
    AppMethodBeat.i(13635);
    setMMTitle(2131299860);
    this.gsW = ((Button)findViewById(2131823196));
    this.gsX = ((TextView)findViewById(2131822819));
    this.gsW.setOnClickListener(new FindMContactLearmMoreUI.1(this));
    this.gsX.setOnClickListener(new FindMContactLearmMoreUI.2(this));
    g.RP().Ry().set(12323, Boolean.TRUE);
    this.cFl = ((String)g.RP().Ry().get(6, null));
    if ((this.cFl == null) || (this.cFl.equals("")))
      this.cFl = ((String)g.RP().Ry().get(4097, null));
    AppMethodBeat.o(13635);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13631);
    super.onCreate(paramBundle);
    this.elr = getIntent().getStringExtra("regsetinfo_ticket");
    this.gsy = getIntent().getStringExtra("regsetinfo_NextStep");
    this.gsz = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    initView();
    AppMethodBeat.o(13631);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13632);
    if (this.fQS != null)
    {
      g.Rg().b(431, this.fQS);
      this.fQS = null;
    }
    super.onDestroy();
    AppMethodBeat.o(13632);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(13637);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      aoZ();
      bool = true;
      AppMethodBeat.o(13637);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(13637);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(13634);
    super.onPause();
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",RE300_600,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("RE300_600") + ",2");
    AppMethodBeat.o(13634);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(13639);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.FindMContactLearmMoreUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(13639);
      return;
    }
    ab.i("MicroMsg.FindMContactLearmMoreUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 48:
    }
    while (true)
    {
      AppMethodBeat.o(13639);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        api();
        AppMethodBeat.o(13639);
        break;
      }
      h.a(this, getString(2131301922), getString(2131301936), getString(2131300878), getString(2131296868), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(13629);
          paramAnonymousDialogInterface.dismiss();
          FindMContactLearmMoreUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          AppMethodBeat.o(13629);
        }
      }
      , new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(13630);
          paramAnonymousDialogInterface.dismiss();
          AppMethodBeat.o(13630);
        }
      });
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(13633);
    super.onResume();
    com.tencent.mm.plugin.b.a.wz("R300_100_phone");
    StringBuilder localStringBuilder = new StringBuilder();
    g.RN();
    localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",RE300_600,");
    g.RN();
    com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("RE300_600") + ",1");
    AppMethodBeat.o(13633);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactLearmMoreUI
 * JD-Core Version:    0.6.2
 */