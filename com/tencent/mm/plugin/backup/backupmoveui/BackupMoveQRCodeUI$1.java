package com.tencent.mm.plugin.backup.backupmoveui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.d;
import com.tencent.mm.plugin.backup.d.b;
import com.tencent.mm.plugin.backup.d.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class BackupMoveQRCodeUI$1
  implements b.d
{
  BackupMoveQRCodeUI$1(BackupMoveQRCodeUI paramBackupMoveQRCodeUI)
  {
  }

  public final void aSt()
  {
  }

  public final void rj(int paramInt)
  {
    AppMethodBeat.i(17345);
    ab.i("MicroMsg.BackupMoveQRCodeUI", "onUpdateUIProgress backupState:%d", new Object[] { Integer.valueOf(paramInt) });
    if (BackupMoveQRCodeUI.a(this.juS))
    {
      AppMethodBeat.o(17345);
      return;
    }
    switch (paramInt)
    {
    default:
    case 2:
    case 51:
    case -11:
    case -4:
    case -31:
    case -32:
    case -12:
    case -33:
    }
    while (true)
    {
      AppMethodBeat.o(17345);
      break;
      ab.i("MicroMsg.BackupMoveQRCodeUI", "auth success. go to BackupMoveUI.");
      b.aSZ().aSu().jqW = 12;
      Object localObject = new Intent(this.juS, BackupMoveUI.class);
      MMWizardActivity.J(this.juS, (Intent)localObject);
      AppMethodBeat.o(17345);
      break;
      localObject = b.aSZ().aTb().bitmapData;
      BackupMoveQRCodeUI.b(this.juS).setImageBitmap(BitmapFactory.decodeByteArray((byte[])localObject, 0, localObject.length));
      BackupMoveQRCodeUI.c(this.juS).setText(2131297245);
      BackupMoveQRCodeUI.c(this.juS).setTextColor(this.juS.mController.ylL.getResources().getColor(2131689761));
      BackupMoveQRCodeUI.d(this.juS).setVisibility(4);
      AppMethodBeat.o(17345);
      break;
      BackupMoveQRCodeUI.c(this.juS).setText(2131297219);
      BackupMoveQRCodeUI.c(this.juS).setTextColor(this.juS.mController.ylL.getResources().getColor(2131690384));
      BackupMoveQRCodeUI.b(this.juS).setImageResource(2131230942);
      BackupMoveQRCodeUI.d(this.juS).setVisibility(4);
      AppMethodBeat.o(17345);
      break;
      BackupMoveQRCodeUI.a(this.juS, true);
      h.a(this.juS, 2131297228, 0, 2131297188, 2131297189, false, new BackupMoveQRCodeUI.1.1(this), new BackupMoveQRCodeUI.1.2(this), 2131689744);
      AppMethodBeat.o(17345);
      break;
      BackupMoveQRCodeUI.a(this.juS, true);
      h.a(this.juS, 2131297227, 0, 2131297187, 2131297189, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(17340);
          ab.i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_SELECT_TIME, user click move all.");
          BackupMoveQRCodeUI.a(BackupMoveQRCodeUI.1.this.juS, false);
          b.aSZ().aTb().fl(true);
          AppMethodBeat.o(17340);
        }
      }
      , new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(17341);
          ab.i("MicroMsg.BackupMoveQRCodeUI", "CLIENT_NOT_SUPPORT_SELECT_TIME, user click cancel.");
          BackupMoveQRCodeUI.e(BackupMoveQRCodeUI.1.this.juS);
          AppMethodBeat.o(17341);
        }
      }
      , 2131689744);
      AppMethodBeat.o(17345);
      break;
      h.a(this.juS, 2131297230, 0, 2131297363, 0, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(17342);
          ab.i("MicroMsg.BackupMoveQRCodeUI", "move phone old version");
          AppMethodBeat.o(17342);
        }
      }
      , null, 2131689744);
      AppMethodBeat.o(17345);
      break;
      BackupMoveQRCodeUI.a(this.juS, true);
      h.a(this.juS, 2131297226, 0, 2131297188, 2131297189, false, new BackupMoveQRCodeUI.1.6(this), new BackupMoveQRCodeUI.1.7(this), 2131689744);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupmoveui.BackupMoveQRCodeUI.1
 * JD-Core Version:    0.6.2
 */