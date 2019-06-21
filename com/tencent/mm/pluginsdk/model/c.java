package com.tencent.mm.pluginsdk.model;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.v;
import com.tencent.mm.ui.widget.snackbar.a.b;

public final class c
  implements v
{
  public final void a(int paramInt, Activity paramActivity, a.b paramb)
  {
    AppMethodBeat.i(27235);
    com.tencent.mm.plugin.fav.ui.c.a(paramInt, paramActivity, paramb);
    AppMethodBeat.o(27235);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.c
 * JD-Core Version:    0.6.2
 */