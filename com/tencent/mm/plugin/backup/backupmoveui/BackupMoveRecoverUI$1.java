package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.d;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.d.b;
import com.tencent.mm.plugin.backup.d.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.progress.RoundProgressBtn;

final class BackupMoveRecoverUI$1
  implements b.d
{
  BackupMoveRecoverUI$1(BackupMoveRecoverUI paramBackupMoveRecoverUI)
  {
  }

  public final void aSt()
  {
  }

  public final void rj(int paramInt)
  {
    AppMethodBeat.i(17385);
    Object localObject1 = b.aSZ().aSu();
    ab.i("MicroMsg.BackupMoveRecoverUI", "onUpdateUIProgress state[%d], isActivityOnTop[%b], transferSession[%d], totalSession[%d], mergePercent[%d]", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(BackupMoveRecoverUI.access$000()), Integer.valueOf(((e)localObject1).jqX), Integer.valueOf(((e)localObject1).jqY), Integer.valueOf(((e)localObject1).jqZ) });
    switch (paramInt)
    {
    default:
    case -100:
    case 3:
    case 1:
    case 22:
    case 52:
    case 23:
    case 28:
    case 29:
    case 25:
    case 24:
    case 26:
    case 30:
    case 27:
    case 4:
    case -4:
    case -2:
    case -1:
    case -3:
    case -5:
    case -21:
    case -12:
    case -13:
    case -22:
    }
    while (true)
    {
      label264: AppMethodBeat.o(17385);
      while (true)
      {
        return;
        BackupMoveRecoverUI.a(this.jvc);
        AppMethodBeat.o(17385);
        continue;
        this.jvc.finish();
        AppMethodBeat.o(17385);
        continue;
        this.jvc.juZ.setImageResource(2131230937);
        this.jvc.juW.setText(2131297205);
        this.jvc.juX.setText(2131297236);
        this.jvc.juX.setVisibility(0);
        this.jvc.juU.setVisibility(4);
        this.jvc.juV.setVisibility(4);
        BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
        BackupMoveRecoverUI.c(this.jvc);
        AppMethodBeat.o(17385);
        continue;
        this.jvc.juZ.setImageResource(2131230937);
        this.jvc.juW.setText(2131297251);
        this.jvc.juX.setText(2131297236);
        this.jvc.juX.setTextColor(this.jvc.getResources().getColor(2131689746));
        this.jvc.juX.setVisibility(0);
        this.jvc.juU.setVisibility(4);
        this.jvc.juV.setVisibility(4);
        BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
        BackupMoveRecoverUI.d(this.jvc);
        AppMethodBeat.o(17385);
        continue;
        this.jvc.juZ.setImageResource(2131230937);
        this.jvc.juW.setText(2131297233);
        this.jvc.juU.setText(2131297235);
        this.jvc.juV.setText(2131297234);
        this.jvc.juX.setVisibility(4);
        this.jvc.juU.setVisibility(0);
        this.jvc.juV.setVisibility(0);
        BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
        this.jvc.juU.setOnClickListener(new BackupMoveRecoverUI.1.1(this));
        this.jvc.juV.setOnClickListener(new BackupMoveRecoverUI.1.12(this));
        BackupMoveRecoverUI.c(this.jvc);
        AppMethodBeat.o(17385);
        continue;
        this.jvc.juZ.setImageResource(2131230937);
        Object localObject2 = this.jvc.juW;
        Object localObject3 = this.jvc;
        int i = ((e)localObject1).jqX;
        paramInt = ((e)localObject1).jqY;
        b.aSZ().aTc();
        ((TextView)localObject2).setText(((BackupMoveRecoverUI)localObject3).getString(2131297256, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), c.aTi() }));
        this.jvc.juX.setText(2131297236);
        this.jvc.juX.setTextColor(this.jvc.getResources().getColor(2131689746));
        this.jvc.juX.setVisibility(0);
        this.jvc.juU.setVisibility(8);
        this.jvc.juV.setVisibility(4);
        BackupMoveRecoverUI.b(this.jvc).setVisibility(0);
        BackupMoveRecoverUI.b(this.jvc).setProgress(((e)localObject1).aSD());
        BackupMoveRecoverUI.b(this.jvc).setOnClickListener(new BackupMoveRecoverUI.1.15(this));
        BackupMoveRecoverUI.d(this.jvc);
        AppMethodBeat.o(17385);
        continue;
        this.jvc.juZ.setImageResource(2131230937);
        this.jvc.juW.setText(2131297239);
        this.jvc.juX.setText(2131297241);
        this.jvc.juX.setTextColor(this.jvc.getResources().getColor(2131689746));
        this.jvc.juX.setVisibility(0);
        this.jvc.juU.setVisibility(0);
        BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
        this.jvc.juU.setText(2131297240);
        this.jvc.juU.setOnClickListener(new BackupMoveRecoverUI.1.16(this));
        this.jvc.juV.setVisibility(0);
        this.jvc.juV.setText(2131297255);
        this.jvc.juV.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(17379);
            ab.i("MicroMsg.BackupMoveRecoverUI", "backupmove pause click stop move button.");
            ab.i("MicroMsg.BackupMoveRecoverUI", "backupmove pause click stop move.");
            b.aSZ().aSu().jqW = 29;
            BackupMoveRecoverUI.1.this.rj(29);
            AppMethodBeat.o(17379);
          }
        });
        BackupMoveRecoverUI.d(this.jvc);
        AppMethodBeat.o(17385);
        continue;
        this.jvc.juZ.setImageResource(2131230937);
        this.jvc.juW.setText(2131297266);
        this.jvc.juX.setText(2131297268);
        this.jvc.juX.setTextColor(this.jvc.getResources().getColor(2131689746));
        this.jvc.juX.setVisibility(0);
        this.jvc.juU.setVisibility(0);
        BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
        this.jvc.juU.setText(2131297265);
        this.jvc.juU.setOnClickListener(new BackupMoveRecoverUI.1.18(this));
        this.jvc.juV.setVisibility(0);
        this.jvc.juV.setText(2131297206);
        this.jvc.juV.setOnClickListener(new BackupMoveRecoverUI.1.19(this, paramInt));
        this.jvc.juY.setText(2131297346);
        this.jvc.juY.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(17383);
            b.aSZ().aSu().jqW = 25;
            BackupMoveRecoverUI.e(BackupMoveRecoverUI.1.this.jvc);
            AppMethodBeat.o(17383);
          }
        });
        AppMethodBeat.o(17385);
        continue;
        if (!BackupMoveRecoverUI.access$000())
          break label264;
        b.aSZ().aSu().jqW = 24;
        paramInt = 24;
        break;
        ab.i("MicroMsg.BackupMoveRecoverUI", "backupmove BACKUP_STATE_RECOVER_TRANSFER_FINISH isFromBanner[%b]", new Object[] { Boolean.valueOf(BackupMoveRecoverUI.aTx()) });
        if (BackupMoveRecoverUI.aTx())
        {
          this.jvc.juZ.setImageResource(2131230937);
          this.jvc.juW.setText(2131297257);
          this.jvc.juX.setText(2131297259);
          this.jvc.juX.setTextColor(this.jvc.getResources().getColor(2131689746));
          this.jvc.juU.setText(2131297253);
          this.jvc.juV.setText(2131297254);
          this.jvc.juY.setText(2131297346);
          this.jvc.juX.setVisibility(0);
          this.jvc.juU.setVisibility(0);
          this.jvc.juV.setVisibility(0);
          BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
          this.jvc.juU.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              AppMethodBeat.i(17384);
              ab.i("MicroMsg.BackupMoveRecoverUI", "backupmove click start merge button.");
              b.aSZ().aTc();
              if (!c.aTe())
              {
                ab.e("MicroMsg.BackupMoveRecoverUI", "miss recover merge data.");
                b.aSZ().aSu().jqW = -22;
                BackupMoveRecoverUI.1.this.rj(-22);
                com.tencent.mm.plugin.report.service.h.pYm.a(485L, 6L, 1L, false);
                AppMethodBeat.o(17384);
              }
              while (true)
              {
                return;
                b.aSZ().aTc().aSL();
                AppMethodBeat.o(17384);
              }
            }
          });
          this.jvc.juV.setOnClickListener(new BackupMoveRecoverUI.1.2(this, paramInt));
          this.jvc.juY.setOnClickListener(new BackupMoveRecoverUI.1.3(this));
          AppMethodBeat.o(17385);
        }
        else
        {
          if (!BackupMoveRecoverUI.access$000())
            break label264;
          b.aSZ().aTc();
          if (!c.aTe())
          {
            ab.e("MicroMsg.BackupMoveRecoverUI", "miss recover merge data.");
            b.aSZ().aSu().jqW = -22;
            rj(-22);
            com.tencent.mm.plugin.report.service.h.pYm.a(485L, 6L, 1L, false);
            AppMethodBeat.o(17385);
          }
          else
          {
            b.aSZ().aTc().aSL();
            AppMethodBeat.o(17385);
            continue;
            this.jvc.juZ.setImageResource(2131230943);
            this.jvc.juW.setText(this.jvc.getString(2131297248, new Object[] { Integer.valueOf(((e)localObject1).jqZ) }));
            this.jvc.juX.setText(2131297249);
            this.jvc.juX.setTextColor(this.jvc.getResources().getColor(2131689746));
            this.jvc.juX.setVisibility(0);
            this.jvc.juU.setVisibility(4);
            this.jvc.juV.setVisibility(4);
            BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
            BackupMoveRecoverUI.c(this.jvc);
            AppMethodBeat.o(17385);
            continue;
            this.jvc.juZ.setImageResource(2131230943);
            this.jvc.juW.setText(2131297345);
            this.jvc.juX.setText(2131297249);
            this.jvc.juX.setTextColor(this.jvc.getResources().getColor(2131689746));
            this.jvc.juX.setVisibility(0);
            this.jvc.juU.setVisibility(4);
            this.jvc.juV.setVisibility(4);
            BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
            BackupMoveRecoverUI.c(this.jvc);
            AppMethodBeat.o(17385);
            continue;
            this.jvc.juZ.setImageResource(2131230945);
            this.jvc.juW.setText(2131297246);
            this.jvc.juX.setText(this.jvc.getString(2131297247, new Object[] { Integer.valueOf(((e)localObject1).jqX), Integer.valueOf(((e)localObject1).jqY) }));
            this.jvc.juX.setTextColor(this.jvc.getResources().getColor(2131689746));
            this.jvc.juU.setText(2131297195);
            this.jvc.juX.setVisibility(0);
            this.jvc.juU.setVisibility(0);
            this.jvc.juV.setVisibility(4);
            BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
            this.jvc.juU.setOnClickListener(new View.OnClickListener()
            {
              public final void onClick(View paramAnonymousView)
              {
                AppMethodBeat.i(17363);
                b.aSZ().aTa().stop();
                b.aSZ().aSu().jqW = -100;
                BackupMoveRecoverUI.g(BackupMoveRecoverUI.1.this.jvc);
                AppMethodBeat.o(17363);
              }
            });
            BackupMoveRecoverUI.c(this.jvc);
            AppMethodBeat.o(17385);
            continue;
            this.jvc.juZ.setImageResource(2131230937);
            localObject3 = this.jvc.juW;
            localObject2 = this.jvc;
            paramInt = ((e)localObject1).jqX;
            i = ((e)localObject1).jqY;
            b.aSZ().aTc();
            ((TextView)localObject3).setText(((BackupMoveRecoverUI)localObject2).getString(2131297256, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), c.aTi() }));
            this.jvc.juX.setText(2131297271);
            this.jvc.juX.setTextColor(this.jvc.getResources().getColor(2131689746));
            this.jvc.juX.setVisibility(0);
            this.jvc.juU.setVisibility(8);
            this.jvc.juV.setVisibility(0);
            BackupMoveRecoverUI.b(this.jvc).setVisibility(0);
            BackupMoveRecoverUI.b(this.jvc).setProgress(((e)localObject1).aSD());
            BackupMoveRecoverUI.b(this.jvc).setOnClickListener(new BackupMoveRecoverUI.1.5(this));
            this.jvc.juV.setText(2131297272);
            this.jvc.juV.setOnClickListener(new BackupMoveRecoverUI.1.6(this));
            BackupMoveRecoverUI.d(this.jvc);
            AppMethodBeat.o(17385);
            continue;
            this.jvc.juZ.setImageResource(2131230939);
            this.jvc.juW.setText(this.jvc.getString(2131297237, new Object[] { Integer.valueOf(((e)localObject1).jqX), Integer.valueOf(((e)localObject1).jqY), "0M" }));
            this.jvc.juX.setText(2131297221);
            this.jvc.juU.setText(2131297252);
            this.jvc.juV.setText(2131297255);
            this.jvc.juU.setOnClickListener(new BackupMoveRecoverUI.1.7(this));
            this.jvc.juV.setOnClickListener(new BackupMoveRecoverUI.1.8(this, paramInt));
            this.jvc.juX.setTextColor(this.jvc.getResources().getColor(2131689745));
            this.jvc.juX.setVisibility(0);
            this.jvc.juU.setVisibility(0);
            this.jvc.juV.setVisibility(0);
            BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
            BackupMoveRecoverUI.d(this.jvc);
            AppMethodBeat.o(17385);
            continue;
            this.jvc.juZ.setImageResource(2131230939);
            this.jvc.juW.setText(2131297224);
            localObject1 = g.ds(this.jvc);
            if ((localObject1 == null) || (((String)localObject1).equals("")))
              this.jvc.juX.setText(this.jvc.getString(2131297225, new Object[] { "移动网络", b.aSZ().aTc().jtC }));
            while (true)
            {
              this.jvc.juX.setTextColor(this.jvc.getResources().getColor(2131689745));
              this.jvc.juX.setVisibility(0);
              this.jvc.juU.setVisibility(4);
              this.jvc.juV.setVisibility(4);
              BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
              BackupMoveRecoverUI.c(this.jvc);
              AppMethodBeat.o(17385);
              break;
              this.jvc.juX.setText(this.jvc.getString(2131297225, new Object[] { localObject1, b.aSZ().aTc().jtC }));
            }
            this.jvc.juZ.setImageResource(2131230939);
            this.jvc.juW.setText(2131297212);
            this.jvc.juX.setText(2131297213);
            this.jvc.juU.setText(2131297250);
            this.jvc.juV.setText(2131297255);
            this.jvc.juX.setTextColor(this.jvc.getResources().getColor(2131689745));
            this.jvc.juX.setVisibility(0);
            this.jvc.juU.setVisibility(0);
            this.jvc.juV.setVisibility(0);
            BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
            this.jvc.juU.setOnClickListener(new BackupMoveRecoverUI.1.9(this));
            this.jvc.juV.setOnClickListener(new BackupMoveRecoverUI.1.10(this, paramInt));
            BackupMoveRecoverUI.c(this.jvc);
            AppMethodBeat.o(17385);
            continue;
            this.jvc.juZ.setImageResource(2131230939);
            this.jvc.juW.setText(2131297214);
            this.jvc.juU.setText(2131297252);
            this.jvc.juV.setText(2131297255);
            this.jvc.juX.setVisibility(4);
            this.jvc.juU.setVisibility(0);
            this.jvc.juV.setVisibility(0);
            BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
            this.jvc.juU.setOnClickListener(new BackupMoveRecoverUI.1.11(this));
            this.jvc.juV.setOnClickListener(new BackupMoveRecoverUI.1.13(this, paramInt));
            BackupMoveRecoverUI.c(this.jvc);
            AppMethodBeat.o(17385);
            continue;
            this.jvc.juZ.setImageResource(2131230939);
            this.jvc.juW.setText(2131297306);
            this.jvc.juX.setVisibility(4);
            this.jvc.juU.setVisibility(4);
            this.jvc.juV.setVisibility(4);
            BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
            BackupMoveRecoverUI.c(this.jvc);
            AppMethodBeat.o(17385);
            continue;
            this.jvc.juZ.setImageResource(2131230937);
            this.jvc.juW.setText(2131297205);
            this.jvc.juX.setText(2131297236);
            this.jvc.juX.setVisibility(0);
            this.jvc.juU.setVisibility(4);
            this.jvc.juV.setVisibility(4);
            BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
            BackupMoveRecoverUI.c(this.jvc);
            com.tencent.mm.ui.base.h.a(this.jvc, 2131297220, 0, 2131297363, 0, false, new BackupMoveRecoverUI.1.14(this), null, 2131689744);
            AppMethodBeat.o(17385);
            continue;
            this.jvc.juZ.setImageResource(2131230939);
            this.jvc.juW.setText(2131297222);
            this.jvc.juX.setText(this.jvc.getString(2131297223, new Object[] { bo.ga(b.aSZ().aTc().jtJ) }));
            this.jvc.juX.setVisibility(0);
            this.jvc.juU.setVisibility(4);
            this.jvc.juV.setVisibility(4);
            BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
            BackupMoveRecoverUI.c(this.jvc);
            AppMethodBeat.o(17385);
          }
        }
      }
      this.jvc.juZ.setImageResource(2131230939);
      this.jvc.juW.setText(2131297298);
      b.aSZ().aTa().stop();
      this.jvc.juX.setVisibility(4);
      this.jvc.juU.setVisibility(4);
      this.jvc.juV.setVisibility(4);
      BackupMoveRecoverUI.b(this.jvc).setVisibility(8);
      BackupMoveRecoverUI.c(this.jvc);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveRecoverUI.1
 * JD-Core Version:    0.6.2
 */