package com.tencent.mm.plugin.exdevice.service;

import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class a$a extends ak
{
  public a$a(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(19521);
    switch (paramMessage.what)
    {
    default:
      AppMethodBeat.o(19521);
    case 2:
    case 1:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 10:
    case 8:
    case 9:
    case 11:
    case 12:
    }
    while (true)
    {
      return;
      a.a(this.lwk).a(2, 0, null, null, null, 0, null);
      AppMethodBeat.o(19521);
      continue;
      paramMessage = (a.c)paramMessage.obj;
      a.a(this.lwk).a(1, 0, null, paramMessage.jJe, paramMessage.mDeviceName, paramMessage.hGc, paramMessage.jJf);
      AppMethodBeat.o(19521);
      continue;
      paramMessage = (a.e)paramMessage.obj;
      a.a(this.lwk).c(paramMessage.lwo, paramMessage.lqL, paramMessage.lqz, paramMessage.hxN);
      AppMethodBeat.o(19521);
      continue;
      paramMessage = (a.d)paramMessage.obj;
      a.a(this.lwk).b(paramMessage.jJa, paramMessage.lwm, paramMessage.lwn, paramMessage.lqz);
      AppMethodBeat.o(19521);
      continue;
      ??? = (a.b)paramMessage.obj;
      a.a(this.lwk).a(paramMessage.arg1, ((a.b)???).jJa, ((a.b)???).lqG, ((a.b)???).lwl, ((a.b)???).lqA);
      AppMethodBeat.o(19521);
      continue;
      AppMethodBeat.o(19521);
      continue;
      AppMethodBeat.o(19521);
      continue;
      paramMessage = (a.f)paramMessage.obj;
      a.a(this.lwk, paramMessage.jJa, paramMessage.mData);
      AppMethodBeat.o(19521);
      continue;
      paramMessage = (a.g)paramMessage.obj;
      a.a(this.lwk, paramMessage.lwo, paramMessage.lwp);
      AppMethodBeat.o(19521);
      continue;
      a.hQ(((Long)paramMessage.obj).longValue());
      AppMethodBeat.o(19521);
      continue;
      synchronized (a.b(this.lwk))
      {
        a.a(this.lwk, ((Long)paramMessage.obj).longValue());
        AppMethodBeat.o(19521);
      }
      synchronized (a.b(this.lwk))
      {
        a.b(this.lwk, ((Long)paramMessage.obj).longValue());
        AppMethodBeat.o(19521);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.a.a
 * JD-Core Version:    0.6.2
 */