package com.tencent.mm.modelvoice;

import android.content.ComponentName;
import android.media.AudioManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class RemoteController
{
  private static Method fZj;
  private static Method fZk;
  private AudioManager fZh;
  private ComponentName fZi;

  static
  {
    AppMethodBeat.i(116588);
    try
    {
      if (fZj == null)
        fZj = AudioManager.class.getMethod("registerMediaButtonEventReceiver", new Class[] { ComponentName.class });
      if (fZk == null)
        fZk = AudioManager.class.getMethod("unregisterMediaButtonEventReceiver", new Class[] { ComponentName.class });
      AppMethodBeat.o(116588);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      while (true)
        AppMethodBeat.o(116588);
    }
  }

  protected final void finalize()
  {
    AppMethodBeat.i(116587);
    try
    {
      localObject = fZk;
      if (localObject == null);
      while (true)
      {
        super.finalize();
        AppMethodBeat.o(116587);
        return;
        fZk.invoke(this.fZh, new Object[] { this.fZi });
        RemoteController.RemoteControlReceiver.alQ();
      }
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      Object localObject = localInvocationTargetException.getCause();
      if ((localObject instanceof RuntimeException))
      {
        localObject = (RuntimeException)localObject;
        AppMethodBeat.o(116587);
        throw ((Throwable)localObject);
      }
      if ((localObject instanceof Error))
      {
        localObject = (Error)localObject;
        AppMethodBeat.o(116587);
        throw ((Throwable)localObject);
      }
      localObject = new RuntimeException(localInvocationTargetException);
      AppMethodBeat.o(116587);
      throw ((Throwable)localObject);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
        ab.e("MicroMsg.RemoteControlReceiver", "unexpected ".concat(String.valueOf(localIllegalAccessException)));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.RemoteController
 * JD-Core Version:    0.6.2
 */