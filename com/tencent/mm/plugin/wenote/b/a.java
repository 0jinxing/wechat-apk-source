package com.tencent.mm.plugin.wenote.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class a
{
  public static boolean dfJ()
  {
    AppMethodBeat.i(26976);
    String str = (String)com.tencent.mm.model.c.c.abi().ll("100352").dru().get("Close");
    if (!bo.isNullOrNil(str));
    for (int i = bo.getInt(str, 0); ; i = 0)
    {
      boolean bool;
      if (i == 0)
      {
        bool = true;
        AppMethodBeat.o(26976);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(26976);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.b.a
 * JD-Core Version:    0.6.2
 */