package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Arrays;

final class a$1
  implements Runnable
{
  a$1(a parama, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8561);
    this.uCE.uCw[0][0] = this.uCD.getY();
    this.uCE.uCw[0][1] = 0.0F;
    this.uCE.uCw[1][0] = this.uCD.getX();
    this.uCE.uCw[1][1] = 0.0F;
    this.uCE.uCw[2][0] = this.uCD.getMeasuredWidth();
    this.uCE.uCw[2][1] = (this.uCD.getMeasuredWidth() + this.uCE.uCj * 2);
    ab.i("MicroMsg.FTS.SosAnimatorBaseController", "searchBarData %s", new Object[] { Arrays.toString(this.uCE.uCw) });
    AppMethodBeat.o(8561);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.a.1
 * JD-Core Version:    0.6.2
 */