package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class m$3
  implements DialogInterface.OnClickListener
{
  m$3(SharedPreferences paramSharedPreferences, Context paramContext, boolean paramBoolean, int paramInt1, int paramInt2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34581);
    this.zvv.edit().putInt("show_rating_flag", 4).commit();
    String str = "market://details?id=" + ah.getPackageName();
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(str));
    this.val$context.startActivity(localIntent);
    ab.d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]start market intent");
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    this.zvv.edit().putBoolean("show_rating_again", false).commit();
    m.dIX();
    if (this.zvw)
    {
      h.pYm.e(11216, new Object[] { Integer.valueOf(5), Integer.valueOf(this.zvx), Integer.valueOf(this.zvy) });
      AppMethodBeat.o(34581);
    }
    while (true)
    {
      return;
      h.pYm.e(11216, new Object[] { Integer.valueOf(4), Integer.valueOf(this.zvx), Integer.valueOf(this.zvy) });
      AppMethodBeat.o(34581);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.m.3
 * JD-Core Version:    0.6.2
 */