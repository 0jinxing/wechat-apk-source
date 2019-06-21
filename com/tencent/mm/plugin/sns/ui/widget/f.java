package com.tencent.mm.plugin.sns.ui.widget;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.e.k;

public final class f
{
  public static k a(Context paramContext, String paramString, float paramFloat, boolean paramBoolean)
  {
    AppMethodBeat.i(40523);
    paramContext = new k(j.a(paramContext, paramString, (int)paramFloat, 2, paramBoolean));
    AppMethodBeat.o(40523);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.f
 * JD-Core Version:    0.6.2
 */