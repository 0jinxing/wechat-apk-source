package com.tencent.mm.ui.conversation;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class m$4
  implements DialogInterface.OnClickListener
{
  m$4(SharedPreferences paramSharedPreferences, boolean paramBoolean, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34582);
    this.zvv.edit().putInt("show_rating_flag", 4).commit();
    if (this.zvw)
    {
      this.zvv.edit().putBoolean("show_rating_again", false).commit();
      h.pYm.e(11216, new Object[] { Integer.valueOf(3), Integer.valueOf(this.zvx), Integer.valueOf(this.zvy) });
    }
    while (true)
    {
      if (paramDialogInterface != null)
        paramDialogInterface.dismiss();
      m.dIX();
      AppMethodBeat.o(34582);
      return;
      ab.d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]need to show rating dialog again.");
      this.zvv.edit().putBoolean("show_rating_again", true).commit();
      h.pYm.e(11216, new Object[] { Integer.valueOf(6), Integer.valueOf(this.zvx), Integer.valueOf(this.zvy) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.m.4
 * JD-Core Version:    0.6.2
 */