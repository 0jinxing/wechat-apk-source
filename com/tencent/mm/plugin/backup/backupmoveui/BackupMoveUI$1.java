package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.d;
import com.tencent.mm.plugin.backup.b.c;
import com.tencent.mm.plugin.backup.c.a;
import com.tencent.mm.plugin.backup.d.b;
import com.tencent.mm.plugin.backup.d.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class BackupMoveUI$1
  implements b.d
{
  BackupMoveUI$1(BackupMoveUI paramBackupMoveUI)
  {
  }

  public final void aSt()
  {
  }

  public final void rj(int paramInt)
  {
    AppMethodBeat.i(17408);
    Object localObject1 = b.aSZ().aSu();
    ab.i("MicroMsg.BackupMoveUI", "onUpdateUIProgress state:%d, transferSession:%d, totalSession:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(((com.tencent.mm.plugin.backup.b.e)localObject1).jqX), Integer.valueOf(((com.tencent.mm.plugin.backup.b.e)localObject1).jqY) });
    switch (paramInt)
    {
    default:
    case -100:
    case 3:
    case 1:
    case 13:
    case 12:
    case 14:
    case 15:
    case 51:
    case 4:
    case -4:
    case -11:
    case -21:
    case -23:
    }
    while (true)
    {
      AppMethodBeat.o(17408);
      while (true)
      {
        return;
        BackupMoveUI.a(this.jvk);
        AppMethodBeat.o(17408);
        continue;
        this.jvk.finish();
        AppMethodBeat.o(17408);
        continue;
        this.jvk.juZ.setImageResource(2131230937);
        this.jvk.juW.setText(2131297205);
        this.jvk.juX.setText(2131297236);
        this.jvk.juX.setVisibility(0);
        this.jvk.juU.setVisibility(4);
        this.jvk.juV.setVisibility(4);
        BackupMoveUI.b(this.jvk);
        AppMethodBeat.o(17408);
        continue;
        this.jvk.juZ.setImageResource(2131230937);
        this.jvk.juW.setText(this.jvk.getString(2131297198, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.b.e)localObject1).jqX), Integer.valueOf(((com.tencent.mm.plugin.backup.b.e)localObject1).jqY) }));
        this.jvk.juX.setText(2131297236);
        this.jvk.juX.setTextColor(this.jvk.getResources().getColor(2131689746));
        this.jvk.juX.setVisibility(0);
        this.jvk.juU.setVisibility(4);
        this.jvk.juV.setVisibility(4);
        BackupMoveUI.b(this.jvk);
        AppMethodBeat.o(17408);
        continue;
        this.jvk.juZ.setImageResource(2131230937);
        this.jvk.juW.setText(2131297242);
        this.jvk.juX.setText(2131297236);
        this.jvk.juX.setTextColor(this.jvk.getResources().getColor(2131689746));
        this.jvk.juX.setVisibility(0);
        this.jvk.juU.setVisibility(4);
        this.jvk.juV.setVisibility(4);
        BackupMoveUI.b(this.jvk);
        AppMethodBeat.o(17408);
        continue;
        this.jvk.juZ.setImageResource(2131230937);
        Object localObject2 = this.jvk.juW;
        Object localObject3 = this.jvk;
        int i = ((com.tencent.mm.plugin.backup.b.e)localObject1).jqX;
        paramInt = ((com.tencent.mm.plugin.backup.b.e)localObject1).jqY;
        b.aSZ().aTb();
        ((TextView)localObject2).setText(((BackupMoveUI)localObject3).getString(2131297270, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), d.aTq() }));
        this.jvk.juX.setText(2131297236);
        this.jvk.juX.setTextColor(this.jvk.getResources().getColor(2131689746));
        this.jvk.juX.setVisibility(0);
        this.jvk.juU.setVisibility(4);
        this.jvk.juV.setVisibility(4);
        BackupMoveUI.b(this.jvk);
        AppMethodBeat.o(17408);
        continue;
        this.jvk.juZ.setImageResource(2131230940);
        this.jvk.juW.setText(2131297231);
        this.jvk.juX.setText(this.jvk.getString(2131297232, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.b.e)localObject1).jqX), Integer.valueOf(((com.tencent.mm.plugin.backup.b.e)localObject1).jqY) }));
        this.jvk.juX.setTextColor(this.jvk.getResources().getColor(2131689746));
        this.jvk.juU.setText(2131297195);
        this.jvk.juX.setVisibility(0);
        this.jvk.juU.setVisibility(0);
        this.jvk.juV.setVisibility(4);
        this.jvk.juU.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(17407);
            b.aSZ().aTa().stop();
            b.aSZ().aTb().cancel(true);
            b.aSZ().aSu().jqW = -100;
            BackupMoveUI.c(BackupMoveUI.1.this.jvk);
            AppMethodBeat.o(17407);
          }
        });
        BackupMoveUI.b(this.jvk);
        AppMethodBeat.o(17408);
        continue;
        localObject1 = b.aSZ().aTb().bitmapData;
        this.jvk.juZ.setImageBitmap(BitmapFactory.decodeByteArray((byte[])localObject1, 0, localObject1.length));
        this.jvk.juW.setText(2131297245);
        this.jvk.juW.setTextColor(this.jvk.mController.ylL.getResources().getColor(2131689761));
        this.jvk.juX.setVisibility(4);
        this.jvk.juU.setVisibility(4);
        this.jvk.juV.setVisibility(4);
        BackupMoveUI.b(this.jvk);
        AppMethodBeat.o(17408);
        continue;
        this.jvk.juZ.setImageResource(2131230937);
        localObject3 = this.jvk.juW;
        localObject2 = this.jvk;
        paramInt = ((com.tencent.mm.plugin.backup.b.e)localObject1).jqX;
        i = ((com.tencent.mm.plugin.backup.b.e)localObject1).jqY;
        b.aSZ().aTb();
        ((TextView)localObject3).setText(((BackupMoveUI)localObject2).getString(2131297270, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), d.aTq() }));
        this.jvk.juX.setText(2131297271);
        this.jvk.juX.setTextColor(this.jvk.getResources().getColor(2131689746));
        this.jvk.juX.setVisibility(0);
        this.jvk.juU.setVisibility(4);
        this.jvk.juV.setVisibility(4);
        BackupMoveUI.b(this.jvk);
        AppMethodBeat.o(17408);
        continue;
        this.jvk.juZ.setImageResource(2131230941);
        b.aSZ().aTb().jub.start();
        this.jvk.juW.setText(this.jvk.getString(2131297237, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.b.e)localObject1).jqX), Integer.valueOf(((com.tencent.mm.plugin.backup.b.e)localObject1).jqY), "0M" }));
        this.jvk.juX.setText(2131297221);
        this.jvk.juX.setTextColor(this.jvk.mController.ylL.getResources().getColor(2131690384));
        this.jvk.juX.setVisibility(0);
        this.jvk.juU.setVisibility(4);
        this.jvk.juV.setVisibility(4);
        BackupMoveUI.d(this.jvk);
        b.aSZ().aTb().jtW = c.jqI;
        AppMethodBeat.o(17408);
        continue;
        this.jvk.juZ.setImageResource(2131230941);
        this.jvk.juW.setText(this.jvk.getString(2131297237, new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.b.e)localObject1).jqX), Integer.valueOf(((com.tencent.mm.plugin.backup.b.e)localObject1).jqY), "0M" }));
        this.jvk.juX.setText(2131297219);
        this.jvk.juX.setTextColor(this.jvk.mController.ylL.getResources().getColor(2131690384));
        this.jvk.juX.setVisibility(0);
        this.jvk.juU.setVisibility(4);
        this.jvk.juV.setVisibility(4);
        BackupMoveUI.b(this.jvk);
        AppMethodBeat.o(17408);
        continue;
        this.jvk.juZ.setImageResource(2131230939);
        this.jvk.juW.setText(2131297229);
        this.jvk.juX.setVisibility(4);
        this.jvk.juU.setVisibility(4);
        this.jvk.juV.setVisibility(4);
        BackupMoveUI.b(this.jvk);
        AppMethodBeat.o(17408);
      }
      this.jvk.juZ.setImageResource(2131230939);
      this.jvk.juW.setText(2131297215);
      this.jvk.juX.setVisibility(4);
      this.jvk.juU.setVisibility(4);
      this.jvk.juV.setVisibility(4);
      BackupMoveUI.b(this.jvk);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveUI.1
 * JD-Core Version:    0.6.2
 */