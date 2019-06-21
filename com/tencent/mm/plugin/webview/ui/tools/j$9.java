package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.b;
import java.util.HashMap;

final class j$9
  implements n.b
{
  j$9(j paramj)
  {
  }

  public final void a(TextView paramTextView, MenuItem paramMenuItem)
  {
    AppMethodBeat.i(7650);
    paramMenuItem = paramMenuItem.getTitle();
    String str;
    if (paramTextView != null)
    {
      str = (String)this.utN.utD.get(paramMenuItem);
      if (bo.isNullOrNil(str))
      {
        paramTextView.setText(paramMenuItem);
        AppMethodBeat.o(7650);
      }
    }
    while (true)
    {
      return;
      paramTextView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.utN.cZv(), str, paramTextView.getTextSize()));
      AppMethodBeat.o(7650);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.j.9
 * JD-Core Version:    0.6.2
 */