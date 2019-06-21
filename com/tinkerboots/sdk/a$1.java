package com.tinkerboots.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tinkerboots.sdk.a.a.b;
import com.tinkerboots.sdk.b.c;

final class a$1
  implements MessageQueue.IdleHandler
{
  a$1(a parama, boolean paramBoolean)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(65518);
    Object localObject1 = this.ATU.ATS;
    boolean bool = this.ATT;
    Object localObject2 = c.getContext().getSharedPreferences("patch_server_config", 0);
    long l = ((SharedPreferences)localObject2).getLong("fetch_patch_last_check", 0L);
    if (l == -1L)
      com.tencent.tinker.lib.util.a.i("Tinker.ServerClient", "tinker sync is disabled, with never check flag!", new Object[0]);
    while (true)
    {
      AppMethodBeat.o(65518);
      return false;
      l = System.currentTimeMillis() - l;
      if ((bool) || (((com.tinkerboots.sdk.a.a)localObject1).isDebug) || (l >= ((com.tinkerboots.sdk.a.a)localObject1).hgu))
      {
        ((SharedPreferences)localObject2).edit().putLong("fetch_patch_last_check", System.currentTimeMillis()).commit();
        localObject2 = ((com.tinkerboots.sdk.a.a)localObject1).ATZ;
        localObject1 = ((com.tinkerboots.sdk.a.a)localObject1).ATX;
        if (localObject1 == null)
        {
          localObject2 = new RuntimeException("callback can't be null");
          AppMethodBeat.o(65518);
          throw ((Throwable)localObject2);
        }
        if (((b)localObject1).bGs())
        {
          ((b)localObject1).bGt();
          ((b)localObject1).L(((com.tinkerboots.sdk.a.b.a)localObject2).AUa.AUb);
        }
      }
      else
      {
        com.tencent.tinker.lib.util.a.i("Tinker.ServerClient", "tinker sync should wait interval %ss", new Object[] { Long.valueOf((((com.tinkerboots.sdk.a.a)localObject1).hgu - l) / 1000L) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.a.1
 * JD-Core Version:    0.6.2
 */