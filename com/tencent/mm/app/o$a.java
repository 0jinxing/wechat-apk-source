package com.tencent.mm.app;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;

public final class o$a
{
  private static boolean ceZ = false;
  private static Class cfa;
  private static Field cfb;
  private static Class cfc;
  private static Field cfd;

  public static String h(Message paramMessage)
  {
    Object localObject1 = null;
    AppMethodBeat.i(137991);
    if (!ceZ);
    try
    {
      Object localObject2 = Class.forName("android.app.ActivityThread$ReceiverData");
      cfa = (Class)localObject2;
      localObject2 = ((Class)localObject2).getDeclaredField("intent");
      cfb = (Field)localObject2;
      ((Field)localObject2).setAccessible(true);
      localObject2 = Class.forName("android.app.ActivityThread$CreateServiceData");
      cfc = (Class)localObject2;
      localObject2 = ((Class)localObject2).getDeclaredField("intent");
      cfd = (Field)localObject2;
      ((Field)localObject2).setAccessible(true);
      ceZ = true;
      if (!ceZ)
      {
        AppMethodBeat.o(137991);
        paramMessage = localObject1;
        return paramMessage;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.PreventAccountNotReady", localThrowable, "", new Object[0]);
        continue;
        try
        {
          if (cfa.isInstance(paramMessage.obj));
          for (paramMessage = (Intent)cfb.get(paramMessage.obj); ; paramMessage = (Intent)cfd.get(paramMessage.obj))
          {
            if (paramMessage == null)
              break label195;
            paramMessage = paramMessage.getComponent().getClassName();
            AppMethodBeat.o(137991);
            break;
            if (!cfc.isInstance(paramMessage.obj))
              break label190;
          }
        }
        catch (Throwable paramMessage)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.PreventAccountNotReady", paramMessage, "", new Object[0]);
            label190: paramMessage = null;
          }
          label195: AppMethodBeat.o(137991);
          paramMessage = localObject1;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.o.a
 * JD-Core Version:    0.6.2
 */