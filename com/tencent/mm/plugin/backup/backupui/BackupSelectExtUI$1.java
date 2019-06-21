package com.tencent.mm.plugin.backup.backupui;

import android.app.DatePickerDialog.OnDateSetListener;
import android.widget.DatePicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.text.SimpleDateFormat;
import java.util.Date;

final class BackupSelectExtUI$1
  implements DatePickerDialog.OnDateSetListener
{
  BackupSelectExtUI$1(BackupSelectExtUI paramBackupSelectExtUI, int paramInt)
  {
  }

  public final void onDateSet(DatePicker paramDatePicker, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(17726);
    paramDatePicker = new StringBuffer().append(String.format("%02d", new Object[] { Integer.valueOf(paramInt1) })).append(String.format("%02d", new Object[] { Integer.valueOf(paramInt2 + 1) })).append(String.format("%02d", new Object[] { Integer.valueOf(paramInt3) }));
    switch (this.val$id)
    {
    default:
      AppMethodBeat.o(17726);
      return;
    case 1:
      l = g.Ff("000000");
      BackupSelectExtUI.a(this.jyR, l / 1000L * 1000L);
      BackupSelectExtUI.b(this.jyR).setSummary(BackupSelectExtUI.a(this.jyR).format(new Date(l)));
      BackupSelectExtUI.c(this.jyR).notifyDataSetChanged();
      paramDatePicker = this.jyR;
      if ((BackupSelectExtUI.d(this.jyR) != 0L) && (BackupSelectExtUI.e(this.jyR) != 0L));
      for (bool = true; ; bool = false)
      {
        paramDatePicker.enableOptionMenu(bool);
        AppMethodBeat.o(17726);
        break;
      }
    case 2:
    }
    long l = g.Ff("000000");
    BackupSelectExtUI.b(this.jyR, l / 1000L * 1000L + 86400000L);
    BackupSelectExtUI.f(this.jyR).setSummary(BackupSelectExtUI.a(this.jyR).format(new Date(l)));
    BackupSelectExtUI.c(this.jyR).notifyDataSetChanged();
    paramDatePicker = this.jyR;
    if ((BackupSelectExtUI.d(this.jyR) != 0L) && (BackupSelectExtUI.e(this.jyR) != 0L));
    for (boolean bool = true; ; bool = false)
    {
      paramDatePicker.enableOptionMenu(bool);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backupui.BackupSelectExtUI.1
 * JD-Core Version:    0.6.2
 */