package com.tencent.mm.compatible.i;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public static void a(MenuItem paramMenuItem, String paramString)
  {
    AppMethodBeat.i(93054);
    if (paramMenuItem == null)
    {
      ab.w("MicroMsg.MenuItemUtil", "fixTitleCondensed fail, item is null");
      AppMethodBeat.o(93054);
    }
    while (true)
    {
      return;
      if (paramMenuItem.getTitleCondensed() == null)
      {
        ab.w("MicroMsg.MenuItemUtil", "%s title condensed is null, fix it", new Object[] { paramString });
        paramMenuItem.setTitleCondensed("");
        AppMethodBeat.o(93054);
      }
      else if ((paramMenuItem.getTitleCondensed() instanceof String))
      {
        AppMethodBeat.o(93054);
      }
      else
      {
        ab.w("MicroMsg.MenuItemUtil", "%s title condensed is not String type, cur type[%s], cur value[%s], fix it", new Object[] { paramString, paramMenuItem.getTitleCondensed().getClass().getName(), paramMenuItem.getTitleCondensed() });
        paramMenuItem.setTitleCondensed(paramMenuItem.getTitleCondensed().toString());
        AppMethodBeat.o(93054);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.i.a
 * JD-Core Version:    0.6.2
 */