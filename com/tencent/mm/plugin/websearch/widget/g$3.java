package com.tencent.mm.plugin.websearch.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.t;
import com.tencent.mm.ui.widget.picker.a;
import com.tencent.mm.ui.widget.picker.a.a;
import java.text.SimpleDateFormat;
import java.util.Date;

final class g$3
  implements a.a
{
  g$3(g paramg, a parama, SimpleDateFormat paramSimpleDateFormat, Bundle paramBundle, t paramt)
  {
  }

  public final void b(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(91453);
    this.tGk.hide();
    Object localObject = new Date(paramInt1 - 1900, paramInt2 - 1, paramInt3);
    localObject = this.udw.format((Date)localObject);
    Bundle localBundle = this.udv;
    if (paramBoolean);
    while (true)
    {
      localBundle.putString("value", (String)localObject);
      if (this.uds != null)
        this.uds.b(paramBoolean, "", this.udv);
      AppMethodBeat.o(91453);
      return;
      localObject = "";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.g.3
 * JD-Core Version:    0.6.2
 */