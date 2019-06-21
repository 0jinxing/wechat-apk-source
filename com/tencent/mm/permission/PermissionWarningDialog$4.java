package com.tencent.mm.permission;

import android.content.Context;
import android.media.AudioManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.widget.a.e.c;

final class PermissionWarningDialog$4
  implements e.c
{
  PermissionWarningDialog$4(PermissionWarningDialog paramPermissionWarningDialog)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(16649);
    if (paramBoolean)
    {
      ab.i("MicroMsg.PermissionWarningDialog", "set MicroPhone unmute.");
      ((AudioManager)ah.getContext().getSystemService("audio")).setMicrophoneMute(false);
    }
    this.ggG.finish();
    AppMethodBeat.o(16649);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.permission.PermissionWarningDialog.4
 * JD-Core Version:    0.6.2
 */