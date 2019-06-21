package com.tencent.mm.console;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public class Shell$Receiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(16121);
    paramContext = paramIntent.getAction();
    Shell.a locala = (Shell.a)Shell.Nx().get(paramContext);
    if (locala == null)
    {
      ab.e("MicroMsg.Shell", "no action found for %s", new Object[] { paramContext });
      AppMethodBeat.o(16121);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.Shell", "shell action %s", new Object[] { paramContext });
      locala.s(paramIntent);
      AppMethodBeat.o(16121);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.Receiver
 * JD-Core Version:    0.6.2
 */