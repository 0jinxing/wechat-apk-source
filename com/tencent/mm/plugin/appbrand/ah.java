package com.tencent.mm.plugin.appbrand;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class ah extends aj
{
  protected final void dx(boolean paramBoolean)
  {
  }

  public final int getType()
  {
    return 3;
  }

  protected final int y(Intent paramIntent)
  {
    int i = -1;
    AppMethodBeat.i(129170);
    int j = paramIntent.getIntExtra("SCENE", -1);
    if (j == 2)
    {
      i = 1114;
      AppMethodBeat.o(129170);
    }
    while (true)
    {
      return i;
      if (j == 1)
      {
        i = 1113;
        AppMethodBeat.o(129170);
      }
      else
      {
        AppMethodBeat.o(129170);
      }
    }
  }

  protected final boolean z(Intent paramIntent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(129171);
    boolean bool2 = super.z(paramIntent);
    int i;
    if (y(paramIntent) == -1)
    {
      i = 1;
      if (i != 0)
        ab.i("MiroMsg.WxaManufacturerShortcutEntry", "invalid scene ");
      if ((i != 0) || (!bool2))
        break label59;
      AppMethodBeat.o(129171);
    }
    while (true)
    {
      return bool1;
      i = 0;
      break;
      label59: AppMethodBeat.o(129171);
      bool1 = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ah
 * JD-Core Version:    0.6.2
 */