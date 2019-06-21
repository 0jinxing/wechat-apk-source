package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class y
{
  public static int yAS = -1;

  public static void activateBroadcast(boolean paramBoolean)
  {
    AppMethodBeat.i(107085);
    d(paramBoolean, null);
    AppMethodBeat.o(107085);
  }

  public static void d(boolean paramBoolean, Intent paramIntent)
  {
    AppMethodBeat.i(107086);
    if (!qf(paramBoolean))
    {
      ab.w("MicroMsg.UIStatusUtil", "isRealSend = false,just return!");
      AppMethodBeat.o(107086);
      return;
    }
    Intent localIntent = paramIntent;
    if (paramIntent == null)
      localIntent = new Intent();
    if (paramBoolean);
    for (paramIntent = "com.tencent.mm.ui.ACTION_ACTIVE"; ; paramIntent = "com.tencent.mm.ui.ACTION_DEACTIVE")
    {
      localIntent.setAction(paramIntent);
      localIntent.putExtra("_application_context_process_", ah.getProcessName());
      localIntent.putExtra("process_id", Process.myPid());
      localIntent.putExtra("process_is_mm", ah.bqo());
      ah.getContext().sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
      AppMethodBeat.o(107086);
      break;
    }
  }

  private static boolean qf(boolean paramBoolean)
  {
    boolean bool = true;
    int i;
    if (paramBoolean)
    {
      i = 1;
      if (yAS == i)
        break label28;
    }
    label28: for (paramBoolean = bool; ; paramBoolean = false)
    {
      yAS = i;
      return paramBoolean;
      i = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.y
 * JD-Core Version:    0.6.2
 */