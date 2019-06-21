package c.t.m.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class o
{
  public static boolean a(Handler paramHandler)
  {
    AppMethodBeat.i(136395);
    if (paramHandler == null);
    for (paramHandler = null; ; paramHandler = paramHandler.getLooper())
    {
      boolean bool = a(paramHandler);
      AppMethodBeat.o(136395);
      return bool;
    }
  }

  public static boolean a(Handler paramHandler, Message paramMessage)
  {
    AppMethodBeat.i(136397);
    boolean bool = a(paramHandler, paramMessage, 0L);
    AppMethodBeat.o(136397);
    return bool;
  }

  public static boolean a(Handler paramHandler, Message paramMessage, long paramLong)
  {
    AppMethodBeat.i(136398);
    boolean bool;
    if ((paramMessage != null) && (a(paramHandler)))
    {
      bool = paramHandler.sendMessageDelayed(paramMessage, paramLong);
      AppMethodBeat.o(136398);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136398);
    }
  }

  public static boolean a(Looper paramLooper)
  {
    AppMethodBeat.i(136396);
    boolean bool;
    if ((paramLooper != null) && (paramLooper.getThread().isAlive()))
    {
      bool = true;
      AppMethodBeat.o(136396);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136396);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     c.t.m.c.o
 * JD-Core Version:    0.6.2
 */