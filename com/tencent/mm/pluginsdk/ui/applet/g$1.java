package com.tencent.mm.pluginsdk.ui.applet;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.a.c.a.c;
import java.util.ArrayList;
import java.util.List;

final class g$1
  implements c.a.c
{
  g$1(View paramView, ArrayList paramArrayList, String paramString, List paramList)
  {
  }

  public final void djv()
  {
    AppMethodBeat.i(27639);
    bo.hideVKB(this.vkh);
    if ((this.vki.size() == 0) && (!bo.isNullOrNil(this.cgl)))
      g.a(this.vki, this.hhK);
    AppMethodBeat.o(27639);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.g.1
 * JD-Core Version:    0.6.2
 */