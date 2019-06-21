package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.q;

final class OpenFileChooserUI$1
  implements h.c
{
  OpenFileChooserUI$1(OpenFileChooserUI paramOpenFileChooserUI)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(7442);
    boolean bool = b.a(this.usf.mController.ylL, "android.permission.CAMERA", 16, "", "");
    ab.i("MicroMsg.OpenFileChooserUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG(), this.usf.mController.ylL });
    if (!bool)
      AppMethodBeat.o(7442);
    while (true)
    {
      return;
      n.c(this.usf.mController.ylL, e.euR, "microMsg." + System.currentTimeMillis() + ".jpg", 2);
      AppMethodBeat.o(7442);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI.1
 * JD-Core Version:    0.6.2
 */