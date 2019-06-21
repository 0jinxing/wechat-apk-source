package com.tencent.mm.plugin.bbom;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.c;
import com.tencent.mm.pluginsdk.ui.e.l;
import com.tencent.mm.pluginsdk.ui.e.l.3;
import com.tencent.mm.pluginsdk.ui.e.l.4;
import com.tencent.mm.ui.tools.j;
import java.util.List;

final class PluginBigBallOfMudAsync$3
  implements c
{
  PluginBigBallOfMudAsync$3(PluginBigBallOfMudAsync paramPluginBigBallOfMudAsync)
  {
  }

  public final void a(Context paramContext, String paramString, DialogInterface.OnDismissListener paramOnDismissListener, Bundle paramBundle)
  {
    AppMethodBeat.i(18309);
    l.a(paramContext, paramString, paramOnDismissListener, paramBundle);
    AppMethodBeat.o(18309);
  }

  public final void a(Context paramContext, List<String> paramList, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    AppMethodBeat.i(18308);
    if ((paramList.isEmpty()) || (paramContext == null))
      AppMethodBeat.o(18308);
    while (true)
    {
      return;
      new j(paramContext).a(null, new l.3(paramList), new l.4(paramContext), paramOnDismissListener);
      AppMethodBeat.o(18308);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.PluginBigBallOfMudAsync.3
 * JD-Core Version:    0.6.2
 */