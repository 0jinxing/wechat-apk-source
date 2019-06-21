package com.tencent.mm.plugin.welab.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.welab.e.b;
import com.tencent.mm.plugin.welab.ui.WelabMainUI;

public final class c
  implements com.tencent.mm.plugin.welab.a.a.c
{
  public final void D(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(80572);
    paramIntent.setClass(paramContext, WelabMainUI.class);
    if ((ddn()) || (ddo()));
    for (int i = 1; ; i = 0)
    {
      paramIntent.putExtra("para_from_with_red_point", i);
      paramContext.startActivity(paramIntent);
      AppMethodBeat.o(80572);
      return;
    }
  }

  public final boolean ddn()
  {
    AppMethodBeat.i(80573);
    b.ddC();
    boolean bool;
    if ((b.ddE()) && (!ddo()))
    {
      bool = true;
      AppMethodBeat.o(80573);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80573);
    }
  }

  public final boolean ddo()
  {
    AppMethodBeat.i(80574);
    b.ddC();
    boolean bool;
    if (!b.ddF())
    {
      b.ddC();
      if (b.ddE())
      {
        bool = true;
        AppMethodBeat.o(80574);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80574);
    }
  }

  public final boolean ddp()
  {
    AppMethodBeat.i(80575);
    boolean bool;
    if (!ddo())
    {
      bool = true;
      AppMethodBeat.o(80575);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80575);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.a.c
 * JD-Core Version:    0.6.2
 */