package com.tencent.mm.plugin.performance.elf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class b$b extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(111070);
    if ("ACTION_ELF_CHECK_RESPONSE".equals(paramIntent.getAction()))
    {
      paramIntent = (ElfCheckResponse)paramIntent.getParcelableExtra("MicroMsg.ElfCheckResponse");
      if (paramIntent == null)
      {
        ab.i("MicroMsg.ProcessElf", "[onReceive] response is null!");
        AppMethodBeat.o(111070);
        return;
      }
      if (!paramIntent.nDl)
        b.bZr().removeCallbacksAndMessages(null);
      ak localak = b.bZr();
      if ((!paramIntent.nDl) || (!paramIntent.pfo) || (!paramIntent.pfp))
        break label150;
      localak.postDelayed(new ElfCheckResponse.1(paramIntent, paramContext), paramIntent.pfs);
    }
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.ProcessElf", "[onReceive] %s, isEnable:%s, CHECK_TIME:%s", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(paramIntent.nDl), Long.valueOf(b.bZm()) });
      AppMethodBeat.o(111070);
      break;
      label150: ab.w("MicroMsg.ElfCheckResponse", "can't call process[%s]", new Object[] { paramIntent.processName });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.elf.b.b
 * JD-Core Version:    0.6.2
 */