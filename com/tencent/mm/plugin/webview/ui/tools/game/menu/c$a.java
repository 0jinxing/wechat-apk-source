package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public enum c$a
{
  private static EnumMap<a, Integer> uEG;
  int code;

  static
  {
    AppMethodBeat.i(8815);
    uEx = new a("HVGAME_MENU_ACTION_DEFAULT", 0, 0);
    uEy = new a("HVGAME_MENU_ACTION_JUMP_H5", 1, 1);
    uEz = new a("HVGAME_MENU_ACTION_EXIT", 2, 2);
    uEA = new a("HVGAME_MENU_ACTION_SHARE_TO_FRIEND", 3, 3);
    uEB = new a("HVGAME_MENU_ACTION_COLLECT", 4, 4);
    uEC = new a("HVGAME_MENU_ACTION_REFRESH", 5, 7);
    uED = new a("HVGAME_MENU_ACTION_ADD_TO_DESKTOP", 6, 8);
    uEE = new a("HVGAME_MENU_ACTION_COMPLAINT", 7, 9);
    uEF = new a("HVGAME_MENU_ACTION_CUSTOM", 8, 10);
    uEH = new a[] { uEx, uEy, uEz, uEA, uEB, uEC, uED, uEE, uEF };
    uEG = new EnumMap(a.class);
    Iterator localIterator = EnumSet.allOf(a.class).iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      uEG.put(locala, Integer.valueOf(locala.code));
    }
    AppMethodBeat.o(8815);
  }

  private c$a(int paramInt)
  {
    this.code = paramInt;
  }

  public static boolean JH(int paramInt)
  {
    AppMethodBeat.i(8813);
    boolean bool = uEG.containsValue(Integer.valueOf(paramInt));
    AppMethodBeat.o(8813);
    return bool;
  }

  public static a JI(int paramInt)
  {
    AppMethodBeat.i(8814);
    Iterator localIterator = uEG.entrySet().iterator();
    Object localObject;
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      if (((Integer)((Map.Entry)localObject).getValue()).intValue() == paramInt)
      {
        localObject = (a)((Map.Entry)localObject).getKey();
        AppMethodBeat.o(8814);
      }
    }
    while (true)
    {
      return localObject;
      localObject = uEx;
      AppMethodBeat.o(8814);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.menu.c.a
 * JD-Core Version:    0.6.2
 */