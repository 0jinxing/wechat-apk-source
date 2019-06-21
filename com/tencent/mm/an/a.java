package com.tencent.mm.an;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.model.cb;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private static boolean active;
  private static final c fAg;
  private static boolean fAh;
  private static long fAi;
  private static long fAj;
  private static Thread thread;

  static
  {
    AppMethodBeat.i(58336);
    thread = null;
    active = false;
    fAg = new c();
    fAh = true;
    fAi = 0L;
    fAj = 0L;
    AppMethodBeat.o(58336);
  }

  private static a.a a(c.a parama, int paramInt)
  {
    AppMethodBeat.i(58335);
    if (parama == null)
    {
      parama = null;
      AppMethodBeat.o(58335);
    }
    while (true)
    {
      return parama;
      a.a locala = new a.a();
      locala.fAk = parama.fAk;
      locala.startTime = parama.time;
      locala.endTime = parama.time;
      locala.type = paramInt;
      locala.fAo = parama.type;
      AppMethodBeat.o(58335);
      parama = locala;
    }
  }

  private static a.a a(c.d paramd, int paramInt)
  {
    AppMethodBeat.i(58334);
    if (paramd == null)
    {
      paramd = null;
      AppMethodBeat.o(58334);
    }
    while (true)
    {
      return paramd;
      a.a locala = new a.a();
      locala.fAk = paramd.fAG;
      locala.startTime = paramd.startTime;
      locala.endTime = paramd.endTime;
      locala.type = paramInt;
      locala.pid = paramd.pid;
      locala.fAm = paramd.fAm;
      if (paramInt == 1)
      {
        locala.fAl = paramd.fAl;
        locala.fAn = paramd.fAn;
      }
      AppMethodBeat.o(58334);
      paramd = locala;
    }
  }

  public static void a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    AppMethodBeat.i(58331);
    if (!fAh)
      AppMethodBeat.o(58331);
    while (true)
    {
      return;
      c localc = fAg;
      c.c localc1 = new c.c(Process.myPid(), paramLong1, paramLong2, paramLong3, paramLong4, paramLong5);
      ab.i("MicroMsg.ActiveDetector.ProcessDetector", "[oneliang]delayed msg[%s]", new Object[] { localc1.toString() });
      localc.fAu.fAE.add(localc1);
      AppMethodBeat.o(58331);
    }
  }

  public static List<a.a> afS()
  {
    Object localObject1 = null;
    AppMethodBeat.i(58332);
    if (!ah.bqo())
      AppMethodBeat.o(58332);
    while (true)
    {
      return localObject1;
      Object localObject3 = fAg.fAy;
      localObject1 = (String)localObject3 + "/mm";
      Object localObject5 = (String)localObject3 + "/push";
      try
      {
        localObject3 = new java/io/FileInputStream;
        ((FileInputStream)localObject3).<init>((String)localObject1);
        localObject3 = (c.b)b.x((InputStream)localObject3);
      }
      catch (Exception localException2)
      {
        try
        {
          while (true)
          {
            localObject1 = new java/io/FileInputStream;
            ((FileInputStream)localObject1).<init>((String)localObject5);
            localObject1 = (c.b)b.x((InputStream)localObject1);
            localObject5 = new ArrayList();
            if (localObject3 == null)
              break label422;
            localObject6 = ((c.b)localObject3).fAB.iterator();
            while (((Iterator)localObject6).hasNext())
            {
              localObject7 = a((c.d)((Iterator)localObject6).next(), 0);
              if (localObject7 != null)
                ((List)localObject5).add(localObject7);
            }
            localException2 = localException2;
            ab.e("MicroMsg.ActiveDetector", "%s,read exception:" + localException2.getMessage(), new Object[] { localObject1 });
            localObject4 = null;
          }
        }
        catch (Exception localException1)
        {
          Object localObject4;
          while (true)
          {
            ab.e("MicroMsg.ActiveDetector", "%s,read exception:" + localException1.getMessage(), new Object[] { localObject5 });
            localObject2 = null;
          }
          Object localObject7 = ((c.b)localObject4).fAD.iterator();
          while (((Iterator)localObject7).hasNext())
          {
            localObject6 = a((c.a)((Iterator)localObject7).next(), 3);
            if (localObject6 != null)
              ((List)localObject5).add(localObject6);
          }
          Object localObject6 = ((c.b)localObject4).fAE.iterator();
          label420: 
          while (((Iterator)localObject6).hasNext())
          {
            localObject7 = (c.c)((Iterator)localObject6).next();
            if (localObject7 == null)
              localObject4 = null;
            while (true)
            {
              if (localObject4 == null)
                break label420;
              ((List)localObject5).add(localObject4);
              break;
              localObject4 = new a.a();
              ((a.a)localObject4).pid = ((c.c)localObject7).pid;
              ((a.a)localObject4).fAk = ((c.c)localObject7).fAk;
              ((a.a)localObject4).startTime = ((c.c)localObject7).fAF;
              ((a.a)localObject4).endTime = ((c.c)localObject7).fAF;
              ((a.a)localObject4).type = 4;
              ((a.a)localObject4).fAp = ((c.c)localObject7).fAp;
              ((a.a)localObject4).fAq = ((c.c)localObject7).fAq;
              ((a.a)localObject4).fAr = ((c.c)localObject7).fAr;
            }
          }
          label422: if (localObject2 != null)
          {
            localObject6 = ((c.b)localObject2).fAB.iterator();
            while (((Iterator)localObject6).hasNext())
            {
              localObject4 = a((c.d)((Iterator)localObject6).next(), 1);
              if (localObject4 != null)
                ((List)localObject5).add(localObject4);
            }
            localObject4 = ((c.b)localObject2).fAC.iterator();
            while (((Iterator)localObject4).hasNext())
            {
              localObject2 = a((c.a)((Iterator)localObject4).next(), 2);
              if (localObject2 != null)
                ((List)localObject5).add(localObject2);
            }
          }
          Collections.sort((List)localObject5);
          AppMethodBeat.o(58332);
          Object localObject2 = localObject5;
        }
      }
    }
  }

  public static final void cL(boolean paramBoolean)
  {
    AppMethodBeat.i(58328);
    boolean bool;
    if (!ah.getContext().getSharedPreferences("system_config_prefs", h.Mu()).getBoolean("msg_delay_close_detect", false))
    {
      bool = true;
      fAh = bool;
      if (bool)
        break label49;
      AppMethodBeat.o(58328);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label49: active = paramBoolean;
      if (paramBoolean)
      {
        ab.i("MicroMsg.ActiveDetector", "[oneliang]active, time%s, pid:%s", new Object[] { Long.valueOf(System.currentTimeMillis()), Integer.valueOf(Process.myPid()) });
        if (thread != null)
          thread.interrupt();
        ab.i("MicroMsg.ActiveDetector", "active, interrupt end, time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
        thread = null;
        fAg.clear();
        ab.i("MicroMsg.ActiveDetector", "active, processDetector.clear end, time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
        fAi = cb.aaD();
        AppMethodBeat.o(58328);
      }
      else
      {
        ab.i("MicroMsg.ActiveDetector", "[oneliang]unactive, time%s, pid:%s", new Object[] { Long.valueOf(System.currentTimeMillis()), Integer.valueOf(Process.myPid()) });
        if (thread == null)
        {
          Thread localThread = d.h(fAg, "ProcessDetector_" + Process.myPid());
          thread = localThread;
          localThread.start();
          fAg.fAA = true;
        }
        fAj = cb.aaD();
        AppMethodBeat.o(58328);
      }
    }
  }

  public static boolean fE(long paramLong)
  {
    boolean bool = true;
    if ((fAi <= 0L) || (fAj <= 0L) || (paramLong <= 0L))
      bool = false;
    while (true)
    {
      return bool;
      if (fAi >= fAj)
      {
        if (paramLong < fAi)
          bool = false;
      }
      else if (paramLong >= fAj)
        bool = false;
    }
  }

  static String fF(long paramLong)
  {
    AppMethodBeat.i(58333);
    Object localObject = new Date(paramLong);
    localObject = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format((Date)localObject);
    AppMethodBeat.o(58333);
    return localObject;
  }

  public static boolean isActive()
  {
    return active;
  }

  public static void ll(int paramInt)
  {
    AppMethodBeat.i(58329);
    if (!fAh)
      AppMethodBeat.o(58329);
    while (true)
    {
      return;
      if (active)
      {
        AppMethodBeat.o(58329);
      }
      else
      {
        c localc = fAg;
        c.a locala = new c.a(cb.aaD(), System.currentTimeMillis(), paramInt);
        localc.fAu.fAC.add(locala);
        AppMethodBeat.o(58329);
      }
    }
  }

  public static void lm(int paramInt)
  {
    AppMethodBeat.i(58330);
    if (!fAh)
      AppMethodBeat.o(58330);
    while (true)
    {
      return;
      if (active)
      {
        AppMethodBeat.o(58330);
      }
      else
      {
        c localc = fAg;
        c.a locala = new c.a(cb.aaD(), System.currentTimeMillis(), paramInt);
        localc.fAu.fAD.add(locala);
        AppMethodBeat.o(58330);
      }
    }
  }

  public static void ln(int paramInt)
  {
    fAg.fAs = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.an.a
 * JD-Core Version:    0.6.2
 */