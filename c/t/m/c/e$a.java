package c.t.m.c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;

class e$a extends Handler
{
  private StringBuilder b;

  public e$a(e parame, Looper paramLooper)
  {
    super(paramLooper);
    AppMethodBeat.i(136343);
    this.b = new StringBuilder(1024);
    AppMethodBeat.o(136343);
  }

  public void a(Message paramMessage)
  {
    AppMethodBeat.i(136345);
    try
    {
      int i = paramMessage.what;
      switch (i)
      {
      default:
        AppMethodBeat.o(136345);
      case 10001:
      case 10002:
      case 10003:
      case 10004:
      case 10005:
        while (true)
        {
          return;
          AppMethodBeat.o(136345);
          continue;
          AppMethodBeat.o(136345);
          continue;
          AppMethodBeat.o(136345);
          continue;
          AppMethodBeat.o(136345);
          continue;
          paramMessage = new c/t/m/c/h;
          paramMessage.<init>(e.a(this.a));
          paramMessage.a();
          AppMethodBeat.o(136345);
        }
      case 10006:
      case 10007:
      }
    }
    catch (Throwable paramMessage)
    {
      while (true)
      {
        AppMethodBeat.o(136345);
        continue;
        AppMethodBeat.o(136345);
        continue;
        AppMethodBeat.o(136345);
      }
    }
  }

  public void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(136344);
    super.handleMessage(paramMessage);
    a(paramMessage);
    AppMethodBeat.o(136344);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     c.t.m.c.e.a
 * JD-Core Version:    0.6.2
 */