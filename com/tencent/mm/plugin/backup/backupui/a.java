package com.tencent.mm.plugin.backup.backupui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.a;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMWizardActivity;
import java.lang.ref.WeakReference;

public final class a extends com.tencent.mm.pluginsdk.ui.b.b
{
  private static String TAG = "MicroMsg.BackupChatBanner";
  private TextView gne;
  private View jyC;
  private View jyD;
  private int jyE;
  private int jyF;
  private b.a jyG;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(17713);
    this.jyC = null;
    this.gne = null;
    this.jyE = 100;
    this.jyF = 100;
    this.jyG = new a.a(this);
    ab.i(TAG, "BackupChatBanner.");
    com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aSu().jqW = -100;
    com.tencent.mm.plugin.backup.d.b.aSZ().aSu().jqW = -100;
    ab.i(TAG, "initialize");
    this.gne = ((TextView)this.view.findViewById(2131821632));
    this.jyC = this.view.findViewById(2131821630);
    this.jyD = this.view.findViewById(2131821629);
    if (this.view != null)
    {
      this.jyC = this.view.findViewById(2131821630);
      this.jyC.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(17710);
          int i = d.aSx();
          ab.i(a.TAG, "backupbanner onclick, backupMode[%d]", new Object[] { Integer.valueOf(i) });
          switch (i)
          {
          default:
            AppMethodBeat.o(17710);
          case 1:
          case 22:
          }
          while (true)
          {
            return;
            i = com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aSu().jqW;
            ab.i(a.TAG, "backupbanner onclick, backupPcState[%d]", new Object[] { Integer.valueOf(i) });
            switch (i)
            {
            default:
              ab.i(a.TAG, "click backup banner, BackupPcState[%d]", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aSu().jqW) });
              AppMethodBeat.o(17710);
              break;
            case -4:
            case 4:
            case 5:
            case 12:
            case 14:
            case 15:
            case 22:
            case 23:
            case 28:
              ab.i(a.TAG, "click backup banner skipToBackupPcUI,BackupPcState[%d]", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aSu().jqW) });
              a.a(a.this, false);
              AppMethodBeat.o(17710);
              break;
            case 24:
            case 25:
              ab.i(a.TAG, "click backup banner skipToBackupPcUI,BackupPcState[%d]", new Object[] { Integer.valueOf(com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aSu().jqW) });
              a.a(a.this, true);
              AppMethodBeat.o(17710);
              continue;
              i = com.tencent.mm.plugin.backup.d.b.aSZ().aSu().jqW;
              ab.i(a.TAG, "backupbanner onclick, backupMoveState[%d]", new Object[] { Integer.valueOf(i) });
              switch (i)
              {
              default:
                ab.i(a.TAG, "click backup banner,backupMoveState[%d]", new Object[] { Integer.valueOf(i) });
                break;
              case -4:
              case 4:
              case 5:
              case 12:
              case 22:
              case 23:
              case 28:
              case 52:
                ab.i(a.TAG, "click backup banner skipToBackupMoveRecoverUI, backupMoveState[%d]", new Object[] { Integer.valueOf(i) });
                a.b(a.this, false);
                AppMethodBeat.o(17710);
                break;
              case 24:
              case 25:
                ab.i(a.TAG, "click backup banner skipToBackupMoveRecoverUI, backupMoveState[%d]", new Object[] { Integer.valueOf(i) });
                a.b(a.this, true);
                AppMethodBeat.o(17710);
              }
              break;
            }
          }
        }
      });
    }
    aMN();
    com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTF().jwn = this.jyG;
    com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTG().jwn = this.jyG;
    com.tencent.mm.plugin.backup.d.b.aSZ().aTc().jtn = this.jyG;
    AppMethodBeat.o(17713);
  }

  private void fp(boolean paramBoolean)
  {
    AppMethodBeat.i(17714);
    ab.i(TAG, "jumpToBackupPcUI");
    if (bo.cv((Context)this.vlu.get()))
    {
      Intent localIntent = new Intent().setClassName((Context)this.vlu.get(), "com.tencent.mm.plugin.backup.backuppcui.BackupPcUI");
      localIntent.putExtra("isRecoverTransferFinishFromBanner", paramBoolean);
      MMWizardActivity.J((Context)this.vlu.get(), localIntent);
    }
    AppMethodBeat.o(17714);
  }

  private void fq(boolean paramBoolean)
  {
    AppMethodBeat.i(17715);
    ab.i(TAG, "jumpToBackupMoveRecoverUI, isRecoverTransferFinishFromBanner[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
    if (bo.cv((Context)this.vlu.get()))
    {
      Intent localIntent = new Intent().setClassName((Context)this.vlu.get(), "com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI");
      localIntent.putExtra("isRecoverTransferFinishFromBanner", paramBoolean);
      MMWizardActivity.J((Context)this.vlu.get(), localIntent);
    }
    AppMethodBeat.o(17715);
  }

  private boolean rB(int paramInt)
  {
    AppMethodBeat.i(17717);
    if ((paramInt != -100) || (paramInt != this.jyE))
    {
      ab.i(TAG, "refreshPcState backupMode[%d], backupPcState[%d]", new Object[] { Integer.valueOf(d.aSx()), Integer.valueOf(paramInt) });
      this.jyE = paramInt;
    }
    e locale = com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aSu();
    boolean bool;
    switch (paramInt)
    {
    default:
      this.jyC.setVisibility(8);
      AppMethodBeat.o(17717);
      bool = false;
    case 12:
    case 22:
    case 14:
    case 15:
    case 23:
    case 25:
    case 24:
    case 4:
    case 5:
    case -4:
    case 28:
    case 26:
    case 27:
    }
    while (true)
    {
      return bool;
      this.jyC.setVisibility(0);
      if ((1 == com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE().jwa) || (3 == com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE().jwa))
        ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231458, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
      while (true)
      {
        ((TextView)this.view.findViewById(2131821632)).setText(com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131297314));
        AppMethodBeat.o(17717);
        bool = true;
        break;
        if ((2 == com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE().jwa) || (4 == com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE().jwa))
          ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231458, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
      }
      this.jyC.setVisibility(0);
      ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231458, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
      Object localObject1 = (TextView)this.view.findViewById(2131821632);
      Object localObject2 = com.tencent.mm.sdk.platformtools.ah.getContext();
      paramInt = locale.jqX;
      int i = locale.jqY;
      com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE();
      ((TextView)localObject1).setText(((Context)localObject2).getString(2131297342, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), com.tencent.mm.plugin.backup.backuppcmodel.c.aTJ() }));
      AppMethodBeat.o(17717);
      bool = true;
      continue;
      this.jyC.setVisibility(0);
      ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231458, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
      ((TextView)this.view.findViewById(2131821632)).setText(com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131297275));
      AppMethodBeat.o(17717);
      bool = true;
      continue;
      this.jyC.setVisibility(0);
      ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231458, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
      localObject2 = (TextView)this.view.findViewById(2131821632);
      localObject1 = com.tencent.mm.sdk.platformtools.ah.getContext();
      paramInt = locale.jqX;
      i = locale.jqY;
      com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE();
      ((TextView)localObject2).setText(((Context)localObject1).getString(2131297326, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), com.tencent.mm.plugin.backup.backuppcmodel.c.aTJ() }));
      AppMethodBeat.o(17717);
      bool = true;
      continue;
      this.jyC.setVisibility(0);
      ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231458, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
      ((TextView)this.view.findViewById(2131821632)).setText(com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131297328));
      AppMethodBeat.o(17717);
      bool = true;
      continue;
      fp(true);
      AppMethodBeat.o(17717);
      bool = true;
      continue;
      this.jyC.setVisibility(0);
      if ((1 == com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE().jwa) || (3 == com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE().jwa))
      {
        ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231458, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
        localObject2 = (TextView)this.view.findViewById(2131821632);
        localObject1 = com.tencent.mm.sdk.platformtools.ah.getContext();
        i = locale.jqX;
        paramInt = locale.jqY;
        com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE();
        ((TextView)localObject2).setText(((Context)localObject1).getString(2131297342, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), com.tencent.mm.plugin.backup.backuppcmodel.c.aTJ() }));
      }
      while (true)
      {
        AppMethodBeat.o(17717);
        bool = true;
        break;
        if ((2 == com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE().jwa) || (4 == com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE().jwa))
        {
          ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231458, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
          localObject2 = (TextView)this.view.findViewById(2131821632);
          localObject1 = com.tencent.mm.sdk.platformtools.ah.getContext();
          i = locale.jqX;
          paramInt = locale.jqY;
          com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE();
          ((TextView)localObject2).setText(((Context)localObject1).getString(2131297326, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), com.tencent.mm.plugin.backup.backuppcmodel.c.aTJ() }));
        }
      }
      this.jyC.setVisibility(0);
      if ((1 == com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE().jwa) || (3 == com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE().jwa))
      {
        ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231458, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
        ((TextView)this.view.findViewById(2131821632)).setText(com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131297291));
      }
      while (true)
      {
        AppMethodBeat.o(17717);
        bool = true;
        break;
        if ((2 == com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE().jwa) || (4 == com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aTE().jwa))
        {
          ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231458, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
          ((TextView)this.view.findViewById(2131821632)).setText(com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131297292));
        }
      }
      this.jyC.setVisibility(8);
      if (bo.cv((Context)this.vlu.get()))
        fp(true);
      AppMethodBeat.o(17717);
      bool = true;
    }
  }

  private boolean rC(int paramInt)
  {
    AppMethodBeat.i(17718);
    if ((paramInt != -100) || (paramInt != this.jyF))
    {
      ab.i(TAG, "refreshMoveRecoverState backupMode[%d], backupMoveState[%d]", new Object[] { Integer.valueOf(d.aSx()), Integer.valueOf(paramInt) });
      this.jyF = paramInt;
    }
    e locale = com.tencent.mm.plugin.backup.d.b.aSZ().aSu();
    boolean bool;
    switch (paramInt)
    {
    default:
      this.jyC.setVisibility(8);
      AppMethodBeat.o(17718);
      bool = false;
    case 22:
    case 4:
    case 5:
    case 23:
    case 25:
    case 24:
    case 52:
    case -4:
    case 28:
    case 26:
    case 27:
    }
    while (true)
    {
      return bool;
      this.jyC.setVisibility(0);
      ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231468, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
      ((TextView)this.view.findViewById(2131821632)).setText(com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131297251));
      AppMethodBeat.o(17718);
      bool = true;
      continue;
      this.jyC.setVisibility(0);
      ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231468, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
      TextView localTextView = (TextView)this.view.findViewById(2131821632);
      Context localContext = com.tencent.mm.sdk.platformtools.ah.getContext();
      paramInt = locale.jqX;
      int i = locale.jqY;
      com.tencent.mm.plugin.backup.d.b.aSZ().aTc();
      localTextView.setText(localContext.getString(2131297256, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), com.tencent.mm.plugin.backup.d.c.aTi() }));
      AppMethodBeat.o(17718);
      bool = true;
      continue;
      this.jyC.setVisibility(0);
      ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231468, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
      ((TextView)this.view.findViewById(2131821632)).setText(com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131297258));
      AppMethodBeat.o(17718);
      bool = true;
      continue;
      if (bo.cv((Context)this.vlu.get()))
        fq(true);
      AppMethodBeat.o(17718);
      bool = true;
      continue;
      this.jyC.setVisibility(0);
      ((ImageView)this.view.findViewById(2131821631)).setImageDrawable(com.tencent.mm.ui.ah.f((Context)this.vlu.get(), 2131231468, ((Context)this.vlu.get()).getResources().getColor(2131690581)));
      ((TextView)this.view.findViewById(2131821632)).setText(com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131297211));
      AppMethodBeat.o(17718);
      bool = true;
      continue;
      this.jyC.setVisibility(8);
      if (bo.cv((Context)this.vlu.get()))
        fq(true);
      AppMethodBeat.o(17718);
      bool = true;
    }
  }

  public final boolean aMN()
  {
    AppMethodBeat.i(17716);
    boolean bool;
    if ((this.nfA) && (this.eVH))
    {
      this.jyD.setBackgroundResource(2130840456);
      this.jyC.setBackground(null);
      this.gne.setBackground(null);
      switch (d.aSx())
      {
      default:
        this.jyC.setVisibility(8);
        bool = false;
        AppMethodBeat.o(17716);
      case 1:
      case 22:
      }
    }
    while (true)
    {
      return bool;
      if (this.nfA)
      {
        this.jyD.setBackgroundResource(2130839165);
        this.jyC.setBackgroundResource(2130839164);
        this.gne.setBackgroundResource(2130839162);
        break;
      }
      if (this.eVH)
      {
        this.jyD.setBackgroundResource(2130839165);
        this.jyC.setBackgroundResource(2130839162);
        this.gne.setBackground(null);
        break;
      }
      this.jyD.setBackgroundResource(2130839165);
      this.jyC.setBackground(null);
      this.gne.setBackgroundResource(2130839162);
      break;
      bool = rB(com.tencent.mm.plugin.backup.backuppcmodel.b.aTD().aSu().jqW);
      AppMethodBeat.o(17716);
      continue;
      bool = rC(com.tencent.mm.plugin.backup.d.b.aSZ().aSu().jqW);
      AppMethodBeat.o(17716);
    }
  }

  public final void destroy()
  {
  }

  public final int getLayoutId()
  {
    return 2130968811;
  }

  public final int getOrder()
  {
    return 3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupui.a
 * JD-Core Version:    0.6.2
 */