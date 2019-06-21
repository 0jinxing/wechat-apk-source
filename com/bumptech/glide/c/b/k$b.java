package com.bumptech.glide.c.b;

import android.os.Handler.Callback;
import android.os.Message;
import com.bumptech.glide.f.f;
import com.bumptech.glide.h.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class k$b
  implements Handler.Callback
{
  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(91822);
    k localk = (k)paramMessage.obj;
    switch (paramMessage.what)
    {
    default:
      paramMessage = new IllegalStateException("Unrecognized message: " + paramMessage.what);
      AppMethodBeat.o(91822);
      throw paramMessage;
    case 1:
      localk.aAq.oq();
      if (localk.isCancelled)
      {
        localk.azR.recycle();
        localk.mI();
      }
      break;
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(91822);
      return true;
      if (localk.aBH.isEmpty())
      {
        paramMessage = new IllegalStateException("Received a resource without any callbacks to notify");
        AppMethodBeat.o(91822);
        throw paramMessage;
      }
      if (localk.aBL)
      {
        paramMessage = new IllegalStateException("Already have resource");
        AppMethodBeat.o(91822);
        throw paramMessage;
      }
      localk.aBP = new o(localk.azR, localk.azQ, true);
      localk.aBL = true;
      localk.aBP.acquire();
      localk.aBz.a(localk, localk.azP, localk.aBP);
      int i = localk.aBH.size();
      for (int j = 0; j < i; j++)
      {
        paramMessage = (f)localk.aBH.get(j);
        if (!localk.b(paramMessage))
        {
          localk.aBP.acquire();
          paramMessage.c(localk.aBP, localk.aAL);
        }
      }
      localk.aBP.release();
      localk.mI();
      continue;
      localk.mJ();
      continue;
      localk.aAq.oq();
      if (!localk.isCancelled)
      {
        paramMessage = new IllegalStateException("Not cancelled");
        AppMethodBeat.o(91822);
        throw paramMessage;
      }
      localk.aBz.a(localk, localk.azP);
      localk.mI();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.k.b
 * JD-Core Version:    0.6.2
 */