package com.tencent.mm.booter;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$b extends e.d
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(15841);
    if ((paramContext == null) || (paramIntent == null))
      AppMethodBeat.o(15841);
    while (true)
    {
      return;
      super.onReceive(paramContext, paramIntent);
      AppMethodBeat.o(15841);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.e.b
 * JD-Core Version:    0.6.2
 */