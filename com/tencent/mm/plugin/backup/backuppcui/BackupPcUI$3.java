package com.tencent.mm.plugin.backup.backuppcui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.b.c;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.backuppcmodel.b;
import com.tencent.mm.plugin.backup.backuppcmodel.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class BackupPcUI$3
  implements b.c
{
  BackupPcUI$3(BackupPcUI paramBackupPcUI)
  {
  }

  private void aTQ()
  {
    AppMethodBeat.i(17615);
    BackupPcUI.h(this.jwP).setText(2131297194);
    BackupPcUI.h(this.jwP).setOnClickListener(new BackupPcUI.3.7(this));
    AppMethodBeat.o(17615);
  }

  private void aTR()
  {
    AppMethodBeat.i(17616);
    BackupPcUI.h(this.jwP).setText(2131297196);
    BackupPcUI.h(this.jwP).setOnClickListener(new BackupPcUI.3.8(this));
    AppMethodBeat.o(17616);
  }

  private void rv(int paramInt)
  {
    AppMethodBeat.i(17614);
    if ((2 == paramInt) || (4 == paramInt))
    {
      BackupPcUI.b(this.jwP).setImageResource(2131230949);
      AppMethodBeat.o(17614);
    }
    while (true)
    {
      return;
      BackupPcUI.b(this.jwP).setImageResource(2131230946);
      AppMethodBeat.o(17614);
    }
  }

  public final void aSs()
  {
    AppMethodBeat.i(17612);
    int i = b.aTD().aTE().jwa;
    ab.i("MicroMsg.BackupPcUI", "onBackupPcUpdateUICallback onBackupPcStart, commandMode[%d]", new Object[] { Integer.valueOf(i) });
    switch (i)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(17612);
      while (true)
      {
        return;
        b.aTD().aSu().jqW = 11;
        rj(11);
        AppMethodBeat.o(17612);
        continue;
        b.aTD().aSu().jqW = 21;
        rj(21);
        AppMethodBeat.o(17612);
        continue;
        b.aTD().aSu().jqW = 12;
        rj(12);
        AppMethodBeat.o(17612);
      }
      b.aTD().aSu().jqW = 22;
      rj(22);
    }
  }

  public final void aSt()
  {
  }

  public final void rj(int paramInt)
  {
    AppMethodBeat.i(17613);
    int i = b.aTD().aTE().jwa;
    ab.i("MicroMsg.BackupPcUI", "onUpdateUIProgress backupPcState:%d, commandMode:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    Object localObject1 = b.aTD().aSu();
    switch (paramInt)
    {
    default:
    case -100:
    case 1:
    case 11:
    case 12:
    case 14:
    case 15:
    case 21:
    case 22:
    case 23:
    case 25:
    case 24:
    case 26:
    case 30:
    case 27:
    case 4:
    case 5:
    case -4:
    case -2:
    case -1:
    case -3:
    case -5:
    case -21:
    case -13:
    case -22:
    case -23:
    }
    while (true)
    {
      label260: AppMethodBeat.o(17613);
      while (true)
      {
        return;
        BackupPcUI.a(this.jwP);
        AppMethodBeat.o(17613);
        continue;
        BackupPcUI.b(this.jwP).setImageResource(2131230948);
        BackupPcUI.c(this.jwP).setText(2131297284);
        BackupPcUI.d(this.jwP).setVisibility(4);
        BackupPcUI.e(this.jwP).setVisibility(4);
        BackupPcUI.f(this.jwP).setVisibility(4);
        aTQ();
        AppMethodBeat.o(17613);
        continue;
        BackupPcUI.b(this.jwP).setImageResource(2131230948);
        BackupPcUI.c(this.jwP).setText(2131297338);
        BackupPcUI.d(this.jwP).setText(2131297337);
        BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689746));
        BackupPcUI.e(this.jwP).setText(2131297335);
        BackupPcUI.f(this.jwP).setText(2131297336);
        BackupPcUI.d(this.jwP).setVisibility(0);
        BackupPcUI.e(this.jwP).setVisibility(0);
        BackupPcUI.f(this.jwP).setVisibility(0);
        aTQ();
        BackupPcUI.e(this.jwP).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(17591);
            aw.ZK();
            boolean bool = ((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xPH, Boolean.FALSE)).booleanValue();
            ab.i("MicroMsg.BackupPcUI", "onBackupPcUpdateUICallback onUpdateUIProgress startbackup all, hasMove:%s", new Object[] { Boolean.valueOf(bool) });
            if (bool)
            {
              com.tencent.mm.ui.base.h.a(BackupPcUI.3.this.jwP, 2131297311, 0, 2131297363, 0, false, new BackupPcUI.3.1.1(this), null, 2131689744);
              AppMethodBeat.o(17591);
            }
            while (true)
            {
              return;
              b.aTD().aTE().rs(2);
              b.aTD().aSu().jqW = 12;
              BackupPcUI.3.this.rj(12);
              b.aTD().aTH().cancel();
              b.aTD().aTH().aTC();
              b.aTD().aTH().fn(true);
              com.tencent.mm.plugin.report.service.h.pYm.a(400L, 7L, 1L, false);
              com.tencent.mm.plugin.report.service.h.pYm.e(13735, new Object[] { Integer.valueOf(9), Integer.valueOf(b.aTD().aTE().jwg) });
              AppMethodBeat.o(17591);
            }
          }
        });
        BackupPcUI.f(this.jwP).setOnClickListener(new BackupPcUI.3.9(this));
        AppMethodBeat.o(17613);
        continue;
        BackupPcUI.b(this.jwP).setImageResource(2131230948);
        BackupPcUI.c(this.jwP).setText(2131297314);
        BackupPcUI.d(this.jwP).setText(2131297315);
        BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689746));
        BackupPcUI.d(this.jwP).setVisibility(0);
        BackupPcUI.e(this.jwP).setVisibility(4);
        BackupPcUI.f(this.jwP).setVisibility(4);
        aTR();
        AppMethodBeat.o(17613);
        continue;
        BackupPcUI.b(this.jwP).setImageResource(2131230948);
        Object localObject2 = BackupPcUI.c(this.jwP);
        Object localObject3 = this.jwP;
        paramInt = ((e)localObject1).jqX;
        i = ((e)localObject1).jqY;
        b.aTD().aTE();
        ((TextView)localObject2).setText(((BackupPcUI)localObject3).getString(2131297342, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), com.tencent.mm.plugin.backup.backuppcmodel.c.aTJ() }));
        BackupPcUI.d(this.jwP).setText(2131297315);
        BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689746));
        BackupPcUI.d(this.jwP).setVisibility(0);
        BackupPcUI.e(this.jwP).setVisibility(4);
        BackupPcUI.f(this.jwP).setVisibility(4);
        aTR();
        AppMethodBeat.o(17613);
        continue;
        BackupPcUI.b(this.jwP).setImageResource(2131230947);
        BackupPcUI.c(this.jwP).setText(2131297275);
        BackupPcUI.d(this.jwP).setText(this.jwP.getString(2131297276, new Object[] { Integer.valueOf(((e)localObject1).jqX), Integer.valueOf(((e)localObject1).jqY) }));
        BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689746));
        BackupPcUI.e(this.jwP).setText(2131297195);
        BackupPcUI.d(this.jwP).setVisibility(0);
        BackupPcUI.e(this.jwP).setVisibility(0);
        BackupPcUI.f(this.jwP).setVisibility(4);
        BackupPcUI.e(this.jwP).setOnClickListener(new BackupPcUI.3.10(this));
        aTQ();
        AppMethodBeat.o(17613);
        continue;
        BackupPcUI.b(this.jwP).setImageResource(2131230951);
        BackupPcUI.c(this.jwP).setText(2131297324);
        BackupPcUI.e(this.jwP).setText(2131297323);
        BackupPcUI.d(this.jwP).setVisibility(4);
        BackupPcUI.e(this.jwP).setVisibility(0);
        BackupPcUI.f(this.jwP).setVisibility(4);
        BackupPcUI.e(this.jwP).setOnClickListener(new BackupPcUI.3.11(this));
        aTQ();
        AppMethodBeat.o(17613);
        continue;
        BackupPcUI.b(this.jwP).setImageResource(2131230951);
        BackupPcUI.c(this.jwP).setText(2131297314);
        BackupPcUI.d(this.jwP).setText(2131297315);
        BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689746));
        BackupPcUI.d(this.jwP).setVisibility(0);
        BackupPcUI.e(this.jwP).setVisibility(4);
        BackupPcUI.f(this.jwP).setVisibility(4);
        aTR();
        AppMethodBeat.o(17613);
        continue;
        BackupPcUI.b(this.jwP).setImageResource(2131230951);
        localObject3 = BackupPcUI.c(this.jwP);
        localObject2 = this.jwP;
        paramInt = ((e)localObject1).jqX;
        i = ((e)localObject1).jqY;
        b.aTD().aTE();
        ((TextView)localObject3).setText(((BackupPcUI)localObject2).getString(2131297326, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), com.tencent.mm.plugin.backup.backuppcmodel.c.aTJ() }));
        BackupPcUI.d(this.jwP).setText(2131297315);
        BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689746));
        BackupPcUI.d(this.jwP).setVisibility(0);
        BackupPcUI.e(this.jwP).setVisibility(4);
        BackupPcUI.f(this.jwP).setVisibility(4);
        aTR();
        AppMethodBeat.o(17613);
        continue;
        if (!bo.cv(this.jwP))
          break label260;
        b.aTD().aSu().jqW = 24;
        paramInt = 24;
        break;
        if (BackupPcUI.access$700())
        {
          BackupPcUI.b(this.jwP).setImageResource(2131230951);
          BackupPcUI.c(this.jwP).setText(2131297327);
          BackupPcUI.d(this.jwP).setText(2131297329);
          BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689746));
          BackupPcUI.e(this.jwP).setText(2131297322);
          BackupPcUI.f(this.jwP).setText(2131297325);
          BackupPcUI.h(this.jwP).setText(2131297346);
          BackupPcUI.d(this.jwP).setVisibility(0);
          BackupPcUI.e(this.jwP).setVisibility(0);
          BackupPcUI.f(this.jwP).setVisibility(0);
          BackupPcUI.e(this.jwP).setOnClickListener(new BackupPcUI.3.12(this));
          BackupPcUI.f(this.jwP).setOnClickListener(new BackupPcUI.3.13(this));
          BackupPcUI.h(this.jwP).setOnClickListener(new BackupPcUI.3.14(this));
          AppMethodBeat.o(17613);
        }
        else
        {
          if (!bo.cv(this.jwP))
            break label260;
          b.aTD().aTG();
          if (!d.aTe())
          {
            b.aTD().aSu().jqW = -22;
            rj(-22);
            com.tencent.mm.plugin.report.service.h.pYm.a(400L, 64L, 1L, false);
            AppMethodBeat.o(17613);
          }
          else
          {
            b.aTD().aTG().aSL();
            AppMethodBeat.o(17613);
            continue;
            BackupPcUI.b(this.jwP).setImageResource(2131230951);
            BackupPcUI.c(this.jwP).setText(this.jwP.getString(2131297321, new Object[] { Integer.valueOf(((e)localObject1).jqZ) }));
            BackupPcUI.d(this.jwP).setText(2131297320);
            BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689746));
            BackupPcUI.h(this.jwP).setText(2131297325);
            BackupPcUI.d(this.jwP).setVisibility(0);
            BackupPcUI.e(this.jwP).setVisibility(4);
            BackupPcUI.f(this.jwP).setVisibility(4);
            aTQ();
            AppMethodBeat.o(17613);
            continue;
            BackupPcUI.b(this.jwP).setImageResource(2131230943);
            BackupPcUI.c(this.jwP).setText(2131297345);
            BackupPcUI.d(this.jwP).setText(2131297249);
            BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689746));
            BackupPcUI.d(this.jwP).setVisibility(0);
            BackupPcUI.e(this.jwP).setVisibility(4);
            BackupPcUI.f(this.jwP).setVisibility(4);
            aTQ();
            AppMethodBeat.o(17613);
            continue;
            BackupPcUI.b(this.jwP).setImageResource(2131230950);
            BackupPcUI.c(this.jwP).setText(2131297318);
            BackupPcUI.d(this.jwP).setText(this.jwP.getString(2131297319, new Object[] { Integer.valueOf(((e)localObject1).jqX), Integer.valueOf(((e)localObject1).jqY) }));
            BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689746));
            BackupPcUI.e(this.jwP).setText(2131297195);
            BackupPcUI.d(this.jwP).setVisibility(0);
            BackupPcUI.e(this.jwP).setVisibility(0);
            BackupPcUI.f(this.jwP).setVisibility(4);
            BackupPcUI.e(this.jwP).setOnClickListener(new BackupPcUI.3.15(this));
            aTQ();
            AppMethodBeat.o(17613);
            continue;
            switch (i)
            {
            default:
            case 1:
            case 3:
            case 2:
            case 4:
            }
            while (true)
            {
              BackupPcUI.d(this.jwP).setText(2131297344);
              BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689745));
              BackupPcUI.d(this.jwP).setVisibility(0);
              BackupPcUI.e(this.jwP).setVisibility(4);
              BackupPcUI.f(this.jwP).setVisibility(4);
              aTR();
              AppMethodBeat.o(17613);
              break;
              BackupPcUI.b(this.jwP).setImageResource(2131230948);
              localObject3 = BackupPcUI.c(this.jwP);
              localObject2 = this.jwP;
              paramInt = ((e)localObject1).jqX;
              i = ((e)localObject1).jqY;
              b.aTD().aTE();
              ((TextView)localObject3).setText(((BackupPcUI)localObject2).getString(2131297342, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), com.tencent.mm.plugin.backup.backuppcmodel.c.aTJ() }));
              continue;
              BackupPcUI.b(this.jwP).setImageResource(2131230951);
              localObject2 = BackupPcUI.c(this.jwP);
              localObject3 = this.jwP;
              i = ((e)localObject1).jqX;
              paramInt = ((e)localObject1).jqY;
              b.aTD().aTE();
              ((TextView)localObject2).setText(((BackupPcUI)localObject3).getString(2131297326, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), com.tencent.mm.plugin.backup.backuppcmodel.c.aTJ() }));
            }
            switch (i)
            {
            default:
            case 1:
            case 3:
            case 2:
            case 4:
            }
            while (true)
            {
              BackupPcUI.d(this.jwP).setText(2131297343);
              BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689745));
              BackupPcUI.d(this.jwP).setVisibility(0);
              BackupPcUI.e(this.jwP).setVisibility(4);
              BackupPcUI.f(this.jwP).setVisibility(0);
              aTR();
              AppMethodBeat.o(17613);
              break;
              BackupPcUI.b(this.jwP).setImageResource(2131230948);
              localObject3 = BackupPcUI.c(this.jwP);
              localObject2 = this.jwP;
              paramInt = ((e)localObject1).jqX;
              i = ((e)localObject1).jqY;
              b.aTD().aTE();
              ((TextView)localObject3).setText(((BackupPcUI)localObject2).getString(2131297342, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), com.tencent.mm.plugin.backup.backuppcmodel.c.aTJ() }));
              BackupPcUI.f(this.jwP).setText(2131297339);
              BackupPcUI.f(this.jwP).setOnClickListener(new BackupPcUI.3.16(this));
              continue;
              BackupPcUI.b(this.jwP).setImageResource(2131230951);
              localObject2 = BackupPcUI.c(this.jwP);
              localObject3 = this.jwP;
              i = ((e)localObject1).jqX;
              paramInt = ((e)localObject1).jqY;
              b.aTD().aTE();
              ((TextView)localObject2).setText(((BackupPcUI)localObject3).getString(2131297326, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), com.tencent.mm.plugin.backup.backuppcmodel.c.aTJ() }));
              BackupPcUI.f(this.jwP).setText(2131297341);
              BackupPcUI.f(this.jwP).setOnClickListener(new BackupPcUI.3.2(this));
            }
            if ((1 == i) || (3 == i))
            {
              BackupPcUI.b(this.jwP).setImageResource(2131230946);
              BackupPcUI.c(this.jwP).setText(this.jwP.getString(2131297342, new Object[] { Integer.valueOf(((e)localObject1).jqX), Integer.valueOf(((e)localObject1).jqY), "0M" }));
              BackupPcUI.d(this.jwP).setText(2131297299);
              BackupPcUI.f(this.jwP).setText(2131297339);
              BackupPcUI.f(this.jwP).setOnClickListener(new BackupPcUI.3.3(this));
            }
            while (true)
            {
              BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689745));
              BackupPcUI.d(this.jwP).setVisibility(0);
              BackupPcUI.e(this.jwP).setVisibility(4);
              BackupPcUI.f(this.jwP).setVisibility(0);
              aTR();
              AppMethodBeat.o(17613);
              break;
              if ((2 == i) || (4 == i))
              {
                BackupPcUI.b(this.jwP).setImageResource(2131230949);
                BackupPcUI.c(this.jwP).setText(this.jwP.getString(2131297326, new Object[] { Integer.valueOf(((e)localObject1).jqX), Integer.valueOf(((e)localObject1).jqY), "0M" }));
                BackupPcUI.d(this.jwP).setText(2131297307);
                BackupPcUI.f(this.jwP).setText(2131297341);
                BackupPcUI.f(this.jwP).setOnClickListener(new BackupPcUI.3.4(this));
              }
            }
            rv(i);
            BackupPcUI.c(this.jwP).setText(2131297304);
            localObject1 = g.ds(this.jwP);
            if ((localObject1 == null) || (((String)localObject1).equals("")))
              BackupPcUI.d(this.jwP).setText(this.jwP.getString(2131297305, new Object[] { b.aTD().aTE().jwb, "移动网络" }));
            while (true)
            {
              BackupPcUI.d(this.jwP).setTextColor(this.jwP.getResources().getColor(2131689745));
              BackupPcUI.f(this.jwP).setText(2131297309);
              BackupPcUI.d(this.jwP).setVisibility(0);
              BackupPcUI.e(this.jwP).setVisibility(4);
              BackupPcUI.f(this.jwP).setVisibility(0);
              BackupPcUI.f(this.jwP).setOnClickListener(new BackupPcUI.3.5(this));
              aTQ();
              AppMethodBeat.o(17613);
              break;
              BackupPcUI.d(this.jwP).setText(this.jwP.getString(2131297305, new Object[] { b.aTD().aTE().jwb, localObject1 }));
            }
            rv(i);
            BackupPcUI.c(this.jwP).setText(2131297293);
            BackupPcUI.f(this.jwP).setText(2131297309);
            BackupPcUI.d(this.jwP).setVisibility(4);
            BackupPcUI.e(this.jwP).setVisibility(4);
            BackupPcUI.f(this.jwP).setVisibility(0);
            BackupPcUI.f(this.jwP).setOnClickListener(new BackupPcUI.3.6(this));
            aTQ();
            AppMethodBeat.o(17613);
            continue;
            rv(i);
            BackupPcUI.c(this.jwP).setText(2131297294);
            BackupPcUI.d(this.jwP).setVisibility(4);
            BackupPcUI.e(this.jwP).setVisibility(4);
            BackupPcUI.f(this.jwP).setVisibility(4);
            aTQ();
            AppMethodBeat.o(17613);
            continue;
            rv(i);
            BackupPcUI.c(this.jwP).setText(2131297306);
            BackupPcUI.d(this.jwP).setVisibility(4);
            BackupPcUI.e(this.jwP).setVisibility(4);
            BackupPcUI.f(this.jwP).setVisibility(4);
            aTQ();
            AppMethodBeat.o(17613);
            continue;
            rv(i);
            BackupPcUI.c(this.jwP).setText(2131297303);
            b.aTD().aTa().stop();
            BackupPcUI.d(this.jwP).setVisibility(4);
            BackupPcUI.e(this.jwP).setVisibility(4);
            BackupPcUI.f(this.jwP).setVisibility(4);
            aTQ();
            AppMethodBeat.o(17613);
            continue;
            rv(i);
            BackupPcUI.c(this.jwP).setText(2131297298);
            b.aTD().aTa().stop();
            BackupPcUI.d(this.jwP).setVisibility(4);
            BackupPcUI.e(this.jwP).setVisibility(4);
            BackupPcUI.f(this.jwP).setVisibility(4);
            aTQ();
            AppMethodBeat.o(17613);
          }
        }
      }
      rv(i);
      BackupPcUI.c(this.jwP).setText(2131297295);
      BackupPcUI.d(this.jwP).setVisibility(4);
      BackupPcUI.e(this.jwP).setVisibility(4);
      BackupPcUI.f(this.jwP).setVisibility(4);
      aTQ();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcui.BackupPcUI.3
 * JD-Core Version:    0.6.2
 */