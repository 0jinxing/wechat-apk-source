package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ag;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.protocal.protobuf.aym;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindMContactAlertUI extends MMWizardActivity
{
  private int X = 0;
  private int Y = 0;
  private String cFl;
  private ProgressDialog ehJ = null;
  private String elr = null;
  private f fQS = null;
  private String gsA = null;
  private String gsB = null;
  private boolean gsC = false;
  private List<String[]> gsD = null;
  private ag gsE;
  private String gsF;
  private String gsG;
  private String gsH;
  private int gsI = 0;
  private final int gsJ = 200;
  private int gsK = 0;
  private int gsL = 0;
  private int gsM = 0;
  private int gsN = 0;
  private String gsy = "";
  private int gsz = 2;

  private c a(String paramString1, String paramString2, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(13581);
    c localc = new c(this);
    localc.setTitle(paramString2);
    localc.setMessage(paramString1);
    localc.a(2131299858, paramOnClickListener1);
    localc.b(2131299853, paramOnClickListener2);
    localc.tJz.setVisibility(0);
    localc.setCancelable(false);
    localc.show();
    localc.getWindow().clearFlags(2);
    addDialog(localc);
    AppMethodBeat.o(13581);
    return localc;
  }

  private void a(final c paramc)
  {
    AppMethodBeat.i(13583);
    paramc.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public final void onGlobalLayout()
      {
        AppMethodBeat.i(13569);
        paramc.getWindow().getDecorView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int i = paramc.getWindow().getDecorView().getMeasuredWidth();
        int j = paramc.getWindow().getDecorView().getMeasuredHeight();
        View localView = FindMContactAlertUI.a(FindMContactAlertUI.this, (ViewGroup)paramc.getWindow().getDecorView());
        if (localView != null)
          i = localView.getMeasuredWidth() * 2;
        while (true)
        {
          ab.d("MicroMsg.FindMContactAlertUI", "dialog width: %s height: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          FindMContactAlertUI.a(FindMContactAlertUI.this, i, j);
          AppMethodBeat.o(13569);
          return;
        }
      }
    });
    paramc = findViewById(2131824036);
    paramc.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public final void onGlobalLayout()
      {
        AppMethodBeat.i(13570);
        paramc.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int i = paramc.getMeasuredHeight();
        int j = paramc.getMeasuredWidth();
        ab.d("MicroMsg.FindMContactAlertUI", "bg width: %s height: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        FindMContactAlertUI.b(FindMContactAlertUI.this, j, i);
        AppMethodBeat.o(13570);
      }
    });
    AppMethodBeat.o(13583);
  }

  private void aoZ()
  {
    AppMethodBeat.i(13588);
    com.tencent.mm.plugin.b.a.wA(this.gsF);
    aqX();
    Ni(1);
    AppMethodBeat.o(13588);
  }

  private void apg()
  {
    AppMethodBeat.i(13582);
    if (this.gsC)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_200_phone,");
      g.RN();
      com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R300_200_phone") + ",1");
      com.tencent.mm.ui.base.h.a(this, false, getString(2131299834), getString(2131297061), getString(2131296994), getString(2131296868), new FindMContactAlertUI.1(this), new FindMContactAlertUI.4(this));
      AppMethodBeat.o(13582);
    }
    while (true)
    {
      return;
      if (l.apR())
      {
        a(a(this.gsH, this.gsG, new FindMContactAlertUI.5(this), new FindMContactAlertUI.6(this)));
        AppMethodBeat.o(13582);
      }
      else
      {
        api();
        AppMethodBeat.o(13582);
      }
    }
  }

  private void aph()
  {
    AppMethodBeat.i(13585);
    int i = getWindowManager().getDefaultDisplay().getHeight();
    int j = this.gsM - (getResources().getDimensionPixelSize(2131427818) + com.tencent.mm.bz.a.fromDPToPix(this, 48));
    int k = i / 2;
    int m = this.gsL / 2;
    int n = this.gsN;
    m = com.tencent.mm.bz.a.fromDPToPix(this, 20) + (k + m - (i - n));
    if ((j != this.X) || (m != this.Y))
    {
      this.X = j;
      this.Y = m;
      View localView = findViewById(2131824037);
      localView.setVisibility(0);
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localView.getLayoutParams();
      localLayoutParams.setMargins(j - localView.getMeasuredWidth() / 2, m, 0, 0);
      ab.d("MicroMsg.FindMContactAlertUI", "attachArrow x: %s y: %s view.width: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(localView.getMeasuredWidth()) });
      localView.setLayoutParams(localLayoutParams);
      localView.startAnimation(AnimationUtils.loadAnimation(this, 2131034147));
    }
    AppMethodBeat.o(13585);
  }

  private void api()
  {
    AppMethodBeat.i(13586);
    boolean bool = b.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    ab.i("MicroMsg.FindMContactAlertUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
    if (!bool)
      AppMethodBeat.o(13586);
    while (true)
    {
      return;
      Object localObject = findViewById(2131824037);
      if (localObject != null)
        ((View)localObject).setVisibility(8);
      p localp = g.Rg();
      localObject = new f()
      {
        public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.m paramAnonymousm)
        {
          AppMethodBeat.i(13571);
          if (FindMContactAlertUI.f(FindMContactAlertUI.this) != null)
          {
            FindMContactAlertUI.f(FindMContactAlertUI.this).dismiss();
            FindMContactAlertUI.g(FindMContactAlertUI.this);
          }
          if (FindMContactAlertUI.h(FindMContactAlertUI.this) != null)
          {
            g.Rg().b(431, FindMContactAlertUI.h(FindMContactAlertUI.this));
            FindMContactAlertUI.i(FindMContactAlertUI.this);
          }
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            paramAnonymousString = ((ag)paramAnonymousm).aqj();
            ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).setFriendData(paramAnonymousString);
            if ((paramAnonymousString == null) || (paramAnonymousString.size() <= 0))
              break label399;
            Iterator localIterator = paramAnonymousString.iterator();
            paramAnonymousInt1 = 0;
            while (localIterator.hasNext())
            {
              paramAnonymousm = (aym)localIterator.next();
              if (paramAnonymousm != null)
              {
                if (paramAnonymousm.jBT != 1)
                  break label396;
                paramAnonymousInt1++;
              }
            }
            if (paramAnonymousInt1 > 0)
              paramAnonymousInt2 = 1;
          }
          while (true)
          {
            int i;
            if (paramAnonymousString == null)
            {
              i = 0;
              label173: ab.d("MicroMsg.FindMContactAlertUI", "tigerreg data size=%d, addcount=%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramAnonymousInt1) });
              if ((FindMContactAlertUI.b(FindMContactAlertUI.this) == null) || (!FindMContactAlertUI.b(FindMContactAlertUI.this).contains("1")) || (paramAnonymousInt2 == 0))
                break label326;
              com.tencent.mm.plugin.b.a.wA("R300_300_phone");
              paramAnonymousString = new Intent(FindMContactAlertUI.this, FindMContactAddUI.class);
              paramAnonymousString.putExtra("regsetinfo_ticket", FindMContactAlertUI.a(FindMContactAlertUI.this));
              paramAnonymousString.putExtra("regsetinfo_NextStep", FindMContactAlertUI.b(FindMContactAlertUI.this));
              paramAnonymousString.putExtra("regsetinfo_NextStyle", FindMContactAlertUI.c(FindMContactAlertUI.this));
              paramAnonymousString.putExtra("login_type", 0);
              MMWizardActivity.J(FindMContactAlertUI.this, paramAnonymousString);
              AppMethodBeat.o(13571);
            }
            while (true)
            {
              return;
              paramAnonymousInt2 = 0;
              break;
              i = paramAnonymousString.size();
              break label173;
              label326: FindMContactAlertUI.d(FindMContactAlertUI.this);
              AppMethodBeat.o(13571);
              continue;
              Toast.makeText(FindMContactAlertUI.this, FindMContactAlertUI.this.getString(2131296906, new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) }), 0).show();
              FindMContactAlertUI.d(FindMContactAlertUI.this);
              AppMethodBeat.o(13571);
            }
            label396: break;
            label399: paramAnonymousInt2 = 0;
            paramAnonymousInt1 = 0;
          }
        }
      };
      this.fQS = ((f)localObject);
      localp.a(431, (f)localObject);
      localObject = this.mController.ylL;
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject, getString(2131296965), true, new FindMContactAlertUI.10(this));
      g.RS().a(new al.a()
      {
        public final boolean acf()
        {
          AppMethodBeat.i(13574);
          try
          {
            FindMContactAlertUI.a(FindMContactAlertUI.this, com.tencent.mm.pluginsdk.a.cJ(FindMContactAlertUI.this));
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("tigerreg mobileList size ");
            if (FindMContactAlertUI.k(FindMContactAlertUI.this) == null);
            for (int i = 0; ; i = FindMContactAlertUI.k(FindMContactAlertUI.this).size())
            {
              ab.d("MicroMsg.FindMContactAlertUI", i);
              AppMethodBeat.o(13574);
              return true;
            }
          }
          catch (Exception localException)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.FindMContactAlertUI", localException, "", new Object[0]);
          }
        }

        public final boolean acg()
        {
          AppMethodBeat.i(13573);
          if ((FindMContactAlertUI.k(FindMContactAlertUI.this) != null) && (FindMContactAlertUI.k(FindMContactAlertUI.this).size() != 0))
          {
            FindMContactAlertUI.a(FindMContactAlertUI.this, new ag(FindMContactAlertUI.a(FindMContactAlertUI.this), FindMContactAlertUI.k(FindMContactAlertUI.this)));
            g.Rg().a(FindMContactAlertUI.l(FindMContactAlertUI.this), 0);
          }
          while (true)
          {
            AppMethodBeat.o(13573);
            return false;
            if (FindMContactAlertUI.f(FindMContactAlertUI.this) != null)
            {
              FindMContactAlertUI.f(FindMContactAlertUI.this).dismiss();
              FindMContactAlertUI.g(FindMContactAlertUI.this);
            }
            FindMContactAlertUI.d(FindMContactAlertUI.this);
          }
        }

        public final String toString()
        {
          AppMethodBeat.i(13575);
          String str = super.toString() + "|doUpload";
          AppMethodBeat.o(13575);
          return str;
        }
      });
      ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).syncUploadMContactStatus(true, false);
      ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).syncAddrBookAndUpload();
      com.tencent.mm.plugin.report.service.h.pYm.e(11438, new Object[] { Integer.valueOf(1) });
      ab.i("MicroMsg.FindMContactAlertUI", "[cpan] kv report logid:%d scene:%d", new Object[] { Integer.valueOf(11438), Integer.valueOf(1) });
      AppMethodBeat.o(13586);
    }
  }

  private View g(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(13584);
    if (this.gsI >= 200)
    {
      AppMethodBeat.o(13584);
      paramViewGroup = null;
    }
    while (true)
    {
      return paramViewGroup;
      this.gsI += 1;
      int i = paramViewGroup.getChildCount();
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label117;
        View localView = paramViewGroup.getChildAt(j);
        if ((localView instanceof Button))
        {
          AppMethodBeat.o(13584);
          paramViewGroup = localView;
          break;
        }
        if ((localView instanceof ViewGroup))
        {
          localView = g((ViewGroup)localView);
          if (localView != null)
          {
            AppMethodBeat.o(13584);
            paramViewGroup = localView;
            break;
          }
        }
      }
      label117: AppMethodBeat.o(13584);
      paramViewGroup = null;
    }
  }

  public final int getLayoutId()
  {
    return 2130969557;
  }

  public final void initView()
  {
    AppMethodBeat.i(13580);
    this.gsG = getString(2131299835);
    this.gsH = getString(2131299834);
    if (!bo.isNullOrNil(this.gsA))
      this.gsG = this.gsA;
    if (!bo.isNullOrNil(this.gsB))
      this.gsH = this.gsB;
    this.cFl = ((String)g.RP().Ry().get(6, null));
    if ((this.cFl == null) || (this.cFl.equals("")))
      this.cFl = ((String)g.RP().Ry().get(4097, null));
    AppMethodBeat.o(13580);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13576);
    super.onCreate(paramBundle);
    setMMTitle(2131299851);
    com.tencent.mm.plugin.account.a.a.gkF.BV();
    this.elr = getIntent().getStringExtra("regsetinfo_ticket");
    this.gsy = getIntent().getStringExtra("regsetinfo_NextStep");
    this.gsz = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    this.gsA = getIntent().getStringExtra("alert_title");
    this.gsB = getIntent().getStringExtra("alert_message");
    boolean bool;
    if (l.apS() != l.a.gvz)
    {
      bool = true;
      this.gsC = bool;
      this.gsF = com.tencent.mm.plugin.b.a.arO();
      ab.d("MicroMsg.FindMContactAlertUI", "tigerreg mNextStep %s  mNextStyle %s ", new Object[] { this.gsy, Integer.valueOf(this.gsz) });
      if (!isFinishing())
        break label169;
      AppMethodBeat.o(13576);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label169: initView();
      apg();
      AppMethodBeat.o(13576);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13577);
    ab.d("MicroMsg.FindMContactAlertUI", "ondestroy");
    if (this.fQS != null)
    {
      g.Rg().b(431, this.fQS);
      this.fQS = null;
    }
    super.onDestroy();
    AppMethodBeat.o(13577);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(13587);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      aoZ();
      bool = true;
      AppMethodBeat.o(13587);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(13587);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(13579);
    super.onPause();
    StringBuilder localStringBuilder;
    if (this.gsC)
    {
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_100_QQ,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("R300_100_QQ") + ",2");
      AppMethodBeat.o(13579);
    }
    while (true)
    {
      return;
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",RE300_100,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(false, com.tencent.mm.kernel.a.lF("RE300_100") + ",2");
      AppMethodBeat.o(13579);
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(13589);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.FindMContactAlertUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(13589);
      return;
    }
    ab.i("MicroMsg.FindMContactAlertUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 48:
    }
    while (true)
    {
      AppMethodBeat.o(13589);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        api();
        AppMethodBeat.o(13589);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301922), getString(2131301936), getString(2131300878), getString(2131296868), false, new FindMContactAlertUI.2(this), new FindMContactAlertUI.3(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(13578);
    super.onResume();
    StringBuilder localStringBuilder;
    if (this.gsC)
    {
      com.tencent.mm.plugin.b.a.wz("R300_100_QQ");
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R300_100_QQ,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("R300_100_QQ") + ",1");
      AppMethodBeat.o(13578);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.b.a.wz("R300_100_phone");
      localStringBuilder = new StringBuilder();
      g.RN();
      localStringBuilder = localStringBuilder.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",RE300_100,");
      g.RN();
      com.tencent.mm.plugin.b.a.f(true, com.tencent.mm.kernel.a.lF("RE300_100") + ",1");
      AppMethodBeat.o(13578);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.FindMContactAlertUI
 * JD-Core Version:    0.6.2
 */