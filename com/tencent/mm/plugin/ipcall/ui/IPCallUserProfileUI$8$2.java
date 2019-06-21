package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.ui.applet.a.b;
import com.tencent.mm.ui.e.b;

final class IPCallUserProfileUI$8$2
  implements a.b
{
  IPCallUserProfileUI$8$2(IPCallUserProfileUI.8 param8)
  {
  }

  public final boolean vQ(String paramString)
  {
    AppMethodBeat.i(22379);
    Intent localIntent = new Intent();
    localIntent.putExtra("Contact_User", IPCallUserProfileUI.c(this.nGt.nGq));
    localIntent.putExtra("Contact_Scene", 13);
    localIntent.putExtra(e.b.yfT, paramString);
    d.b(this.nGt.nGq, "profile", ".ui.SayHiWithSnsPermissionUI", localIntent);
    AppMethodBeat.o(22379);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI.8.2
 * JD-Core Version:    0.6.2
 */