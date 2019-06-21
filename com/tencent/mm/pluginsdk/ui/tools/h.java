package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aj;

public final class h
{
  public static boolean fR(Context paramContext)
  {
    AppMethodBeat.i(79947);
    boolean bool;
    if (!aj.amA("network_doctor_shown"))
    {
      bool = false;
      AppMethodBeat.o(79947);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.ui.base.h.a(paramContext, 2131301665, 2131297061, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(79946);
          this.val$context.startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
          AppMethodBeat.o(79946);
        }
      }
      , null);
      bool = true;
      AppMethodBeat.o(79947);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.h
 * JD-Core Version:    0.6.2
 */