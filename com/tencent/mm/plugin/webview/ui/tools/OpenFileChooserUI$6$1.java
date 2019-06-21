package com.tencent.mm.plugin.webview.ui.tools;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class OpenFileChooserUI$6$1
  implements Runnable
{
  OpenFileChooserUI$6$1(OpenFileChooserUI.6 param6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7448);
    if ((OpenFileChooserUI.b(this.usg.usf) == 7) && (OpenFileChooserUI.c(this.usg.usf) == 2))
    {
      h.a(this.usg.usf, this.usg.usf.getString(2131305558), this.usg.usf.getString(2131297061), this.usg.usf.getString(2131296955), false, new OpenFileChooserUI.6.1.1(this));
      AppMethodBeat.o(7448);
    }
    while (true)
    {
      return;
      Toast.makeText(this.usg.usf, this.usg.usf.getString(2131304249), 0).show();
      this.usg.usf.setResult(1);
      this.usg.usf.finish();
      AppMethodBeat.o(7448);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.OpenFileChooserUI.6.1
 * JD-Core Version:    0.6.2
 */