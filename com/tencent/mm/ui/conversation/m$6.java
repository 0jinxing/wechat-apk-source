package com.tencent.mm.ui.conversation;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class m$6
  implements DialogInterface.OnClickListener
{
  m$6(SharedPreferences paramSharedPreferences, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34584);
    this.zvv.edit().putInt("show_rating_flag", 4).commit();
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    m.dIX();
    h.pYm.e(11216, new Object[] { Integer.valueOf(1), Integer.valueOf(this.zvx), Integer.valueOf(this.zvy) });
    AppMethodBeat.o(34584);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.m.6
 * JD-Core Version:    0.6.2
 */