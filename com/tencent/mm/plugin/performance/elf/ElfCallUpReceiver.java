package com.tencent.mm.plugin.performance.elf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class ElfCallUpReceiver extends BroadcastReceiver
{
  public static int pfn = -1;

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(111046);
    ab.i("MicroMsg.ElfCallUpReceiver", "[onReceive] call up! ");
    if (getClass().getName().equals(paramIntent.getAction()))
      pfn = paramIntent.getIntExtra("processId", 0);
    AppMethodBeat.o(111046);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.elf.ElfCallUpReceiver
 * JD-Core Version:    0.6.2
 */