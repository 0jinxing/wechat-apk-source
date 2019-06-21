package com.tencent.mm.plugin.kitchen.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.kitchen.ui.KvInfoUI;

public final class a
  implements com.tencent.mm.plugin.kitchen.a.a
{
  public final void w(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(114439);
    paramIntent.setClass(paramContext, KvInfoUI.class);
    paramContext.startActivity(paramIntent);
    AppMethodBeat.o(114439);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.kitchen.b.a
 * JD-Core Version:    0.6.2
 */