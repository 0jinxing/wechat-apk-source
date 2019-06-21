package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class h$1 extends Handler
{
  h$1(h paramh, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(94777);
    Object localObject = this.aNl;
    switch (paramMessage.what)
    {
    default:
      paramMessage = new IllegalStateException();
      AppMethodBeat.o(94777);
      throw paramMessage;
    case 0:
      ((h)localObject).aNb -= 1;
      AppMethodBeat.o(94777);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    }
    while (true)
    {
      return;
      ((h)localObject).aMZ = paramMessage.arg1;
      paramMessage = ((h)localObject).aMU.iterator();
      while (paramMessage.hasNext())
        ((q.a)paramMessage.next()).c(((h)localObject).aMY, ((h)localObject).aMZ);
      AppMethodBeat.o(94777);
      continue;
      if (paramMessage.arg1 != 0);
      for (boolean bool = true; ; bool = false)
      {
        ((h)localObject).isLoading = bool;
        paramMessage = ((h)localObject).aMU.iterator();
        while (paramMessage.hasNext())
          ((q.a)paramMessage.next()).aH(((h)localObject).isLoading);
      }
      AppMethodBeat.o(94777);
      continue;
      if (((h)localObject).aNb == 0)
      {
        paramMessage = (i)paramMessage.obj;
        ((h)localObject).aMX = true;
        ((h)localObject).aNe = paramMessage.bpG;
        ((h)localObject).aNf = paramMessage.bpH;
        ((h)localObject).aMR.ae(paramMessage.info);
        paramMessage = ((h)localObject).aMU.iterator();
        while (paramMessage.hasNext())
          paramMessage.next();
        AppMethodBeat.o(94777);
        continue;
        int i = ((h)localObject).aNa - 1;
        ((h)localObject).aNa = i;
        if (i == 0)
        {
          ((h)localObject).aNh = ((i.b)paramMessage.obj);
          if (((h)localObject).aNc.isEmpty())
          {
            ((h)localObject).aNj = 0;
            ((h)localObject).aNi = 0;
            ((h)localObject).aNk = 0L;
          }
          if (paramMessage.arg1 != 0)
          {
            paramMessage = ((h)localObject).aMU.iterator();
            while (paramMessage.hasNext())
              ((q.a)paramMessage.next()).qe();
            AppMethodBeat.o(94777);
            continue;
            if (((h)localObject).aNa == 0)
            {
              ((h)localObject).aNh = ((i.b)paramMessage.obj);
              paramMessage = ((h)localObject).aMU.iterator();
              while (paramMessage.hasNext())
                ((q.a)paramMessage.next()).qe();
              AppMethodBeat.o(94777);
              continue;
              paramMessage = (i.d)paramMessage.obj;
              ((h)localObject).aNa -= paramMessage.aNX;
              if (((h)localObject).aNb == 0)
              {
                ((h)localObject).aNc = paramMessage.aNc;
                ((h)localObject).aNd = paramMessage.aNd;
                ((h)localObject).aNh = paramMessage.aNh;
                if ((((h)localObject).aNa == 0) && (((h)localObject).aNc.isEmpty()))
                {
                  ((h)localObject).aNj = 0;
                  ((h)localObject).aNi = 0;
                  ((h)localObject).aNk = 0L;
                }
                paramMessage = ((h)localObject).aMU.iterator();
                while (paramMessage.hasNext())
                  paramMessage.next();
                AppMethodBeat.o(94777);
                continue;
                paramMessage = (p)paramMessage.obj;
                if (!((h)localObject).aNg.equals(paramMessage))
                {
                  ((h)localObject).aNg = paramMessage;
                  localObject = ((h)localObject).aMU.iterator();
                  while (((Iterator)localObject).hasNext())
                    ((q.a)((Iterator)localObject).next()).a(paramMessage);
                  AppMethodBeat.o(94777);
                  continue;
                  paramMessage = (e)paramMessage.obj;
                  localObject = ((h)localObject).aMU.iterator();
                  while (((Iterator)localObject).hasNext())
                    ((q.a)((Iterator)localObject).next()).a(paramMessage);
                  AppMethodBeat.o(94777);
                }
              }
            }
          }
        }
      }
      else
      {
        AppMethodBeat.o(94777);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.1
 * JD-Core Version:    0.6.2
 */