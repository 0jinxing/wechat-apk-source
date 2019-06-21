package com.tencent.mm.booter;

import android.content.SharedPreferences;
import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.mars.comm.WakerLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.aa;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Set;
import java.util.concurrent.locks.Lock;

public final class NotifyReceiver$a
  implements com.tencent.mm.ai.f
{
  private static long ecj = 0L;

  private void eO(long paramLong)
  {
    AppMethodBeat.i(57785);
    if (!aa.anh().getBoolean("is_in_notify_mode", false))
      AppMethodBeat.o(57785);
    while (true)
    {
      return;
      new ak(Looper.myLooper()).postDelayed(new NotifyReceiver.a.2(this), paramLong);
      AppMethodBeat.o(57785);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String arg3, m paramm)
  {
    AppMethodBeat.i(57784);
    long l = paramm.hashCode();
    if (paramm.getType() == 268369922)
      l = ((com.tencent.mm.modelmulti.f)paramm).fHM;
    while (true)
      try
      {
        NotifyReceiver.Is().lock();
        synchronized (NotifyReceiver.access$400())
        {
          int i = paramm.getType();
          boolean bool1 = NotifyReceiver.It().contains(Long.valueOf(l));
          if (NotifyReceiver.Ir() != null)
          {
            bool2 = NotifyReceiver.Ir().isLocking();
            ab.i("MicroMsg.NotifyReceiver", "NotifyReceiver onSceneEnd type:%d syncHash: %d hashInMemo: %b isLocking: %b", new Object[] { Integer.valueOf(i), Long.valueOf(l), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
            NotifyReceiver.It().remove(Long.valueOf(l));
          }
        }
      }
      finally
      {
        try
        {
          boolean bool2;
          NotifyReceiver.Is().unlock();
          try
          {
            NotifyReceiver.Is().lock();
            if (NotifyReceiver.It().isEmpty())
              synchronized (NotifyReceiver.access$400())
              {
                if (NotifyReceiver.Ir() != null)
                  NotifyReceiver.Ir().unLock();
                ab.i("MicroMsg.NotifyReceiver", "all scene done, unlock wakelock.");
              }
          }
          finally
          {
            try
            {
              NotifyReceiver.Is().unlock();
              switch (paramm.getType())
              {
              default:
                eO(7000L);
                AppMethodBeat.o(57784);
                return;
                bool2 = false;
                continue;
                paramm = finally;
                AppMethodBeat.o(57784);
                throw paramm;
                ??? = finally;
              case 138:
              }
            }
            catch (Exception )
            {
              try
              {
                NotifyReceiver.Is().unlock();
                AppMethodBeat.o(57784);
                throw ???;
                paramm = finally;
                AppMethodBeat.o(57784);
                throw paramm;
                ??? = finally;
                try
                {
                  NotifyReceiver.Is().unlock();
                  AppMethodBeat.o(57784);
                  throw ???;
                  ab.i("MicroMsg.NotifyReceiver", "rest %d scene undone, keep wakelock.", new Object[] { Integer.valueOf(NotifyReceiver.It().size()) });
                  continue;
                  if (!g.RN().QY())
                    continue;
                  Looper.myQueue().addIdleHandler(new NotifyReceiver.a.1(this));
                  if ((paramInt1 != 0) || (paramInt2 != 0) || (!com.tencent.mm.model.a.XF()))
                    continue;
                  try
                  {
                    g.RQ();
                    paramm = g.RN().eIQ;
                    if (paramm.fkb > -1L)
                      paramm.fkb += 1L;
                    ab.i("MicroMsg.AccInfoCacheInWorker", "countNormalCgi :%s ", new Object[] { Long.valueOf(paramm.fkb) });
                    if ((paramm.fkb != 2L) && (paramm.fkb != 5L))
                      continue;
                    ??? = e.pXa;
                    if (paramm.fkb != 2L)
                      continue;
                    l = 37L;
                    ???.a(226L, l, 1L, false);
                    e.pXa.e(11098, new Object[] { Integer.valueOf(2001), Long.valueOf(paramm.fkb) });
                  }
                  catch (Throwable )
                  {
                    ab.e("MicroMsg.AccInfoCacheInWorker", "tryBackupToWorker Exception:%s", new Object[] { bo.l(???) });
                  }
                  continue;
                  l = 38L;
                  continue;
                }
                catch (Exception paramm)
                {
                  continue;
                }
                ??? = ???;
              }
              catch (Exception paramm)
              {
              }
            }
          }
        }
        catch (Exception )
        {
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.NotifyReceiver.a
 * JD-Core Version:    0.6.2
 */