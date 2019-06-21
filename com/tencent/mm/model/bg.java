package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.an.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class bg
{
  private static final Queue<Integer> fmJ;
  private static final long[] fmK;
  private static final int[] fmL;
  private static final int[] fmM;

  static
  {
    AppMethodBeat.i(59923);
    fmJ = new ConcurrentLinkedQueue();
    fmK = new long[] { 0L, 2000L, 5000L, 10000L, 30000L, 60000L, 180000L, 300000L, 600000L, 1800000L, 3600000L };
    fmL = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    fmM = new int[] { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
    AppMethodBeat.o(59923);
  }

  public static void a(String paramString, long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(59922);
    if (paramString == null)
      AppMethodBeat.o(59922);
    int i;
    long l1;
    while (true)
    {
      return;
      try
      {
        Object localObject = r.Yz();
        if (localObject != null)
        {
          bool = ((String)localObject).equals(paramString);
          if (bool)
            AppMethodBeat.o(59922);
        }
        else
        {
          localObject = ((j)g.K(j.class)).XM().aoO(paramString);
          if (paramString.endsWith("@chatroom"))
          {
            i = ((ap)localObject).dua;
            if (i == 0)
              AppMethodBeat.o(59922);
            else
              ab.i("MicroMsg.MsgReporter", "[oneliang]it is a normal chatroom? username:%s", new Object[] { paramString });
          }
          else
          {
            do
            {
              l1 = cb.aaD();
              if (l1 > 0L)
                break label220;
              ab.i("MicroMsg.MsgReporter", "[oneliang]current server time is 0l,then return");
              AppMethodBeat.o(59922);
              break;
              if ((t.nF(paramString)) || (ad.aou(paramString)) || (ad.aow(paramString)) || (t.nB(paramString)) || (ad.mR(paramString)))
                break label185;
              bool = ((ad)localObject).dsf();
            }
            while (!bool);
            label185: AppMethodBeat.o(59922);
          }
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.MsgReporter", "[oneliang]something about contact has exception:%s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(59922);
      }
    }
    label220: long l2 = System.currentTimeMillis();
    long l3 = l1 - paramLong2;
    ab.i("MicroMsg.MsgReporter", "[oneliang]current server time:%s, msg server time:%s, intervalTime:%s, username:%s, msg server id:%s,msg type:%s", new Object[] { Long.valueOf(l1), Long.valueOf(paramLong2), Long.valueOf(l3), paramString, Long.valueOf(paramLong1), Integer.valueOf(paramInt) });
    boolean bool = a.fE(paramLong2);
    if (bool)
    {
      e.pXa.a(780L, 100L, 1L, false);
      label310: i = fmK.length - 1;
      label318: if (i >= 0)
      {
        if (l3 < fmK[i])
          break label478;
        if (!bool)
          break label457;
        e.pXa.a(780L, fmL[i], 1L, false);
        label358: if (l3 >= 2000L)
          a.a(l1, l2, paramLong2, l3, paramLong1);
      }
      switch (paramInt)
      {
      default:
      case 1:
      case 34:
      case 3:
      case 47:
      case 43:
      }
    }
    while (true)
    {
      AppMethodBeat.o(59922);
      break;
      e.pXa.a(780L, 101L, 1L, false);
      break label310;
      label457: e.pXa.a(780L, fmM[i], 1L, false);
      break label358;
      label478: i--;
      break label318;
      if (l3 >= 60000L)
      {
        if (bool)
        {
          e.pXa.a(780L, 113L, 1L, false);
          AppMethodBeat.o(59922);
          break;
        }
        e.pXa.a(780L, 118L, 1L, false);
        AppMethodBeat.o(59922);
        break;
      }
      if (l3 >= 30000L)
      {
        if (bool)
        {
          e.pXa.a(780L, 112L, 1L, false);
          AppMethodBeat.o(59922);
          break;
        }
        e.pXa.a(780L, 117L, 1L, false);
        AppMethodBeat.o(59922);
        break;
      }
      if (l3 >= 10000L)
      {
        if (bool)
        {
          e.pXa.a(780L, 111L, 1L, false);
          AppMethodBeat.o(59922);
          break;
        }
        e.pXa.a(780L, 116L, 1L, false);
        AppMethodBeat.o(59922);
        break;
      }
      if (l3 >= 0L)
      {
        if (bool)
        {
          e.pXa.a(780L, 110L, 1L, false);
          AppMethodBeat.o(59922);
          break;
        }
        e.pXa.a(780L, 115L, 1L, false);
        AppMethodBeat.o(59922);
        break;
        if (l3 >= 60000L)
        {
          if (bool)
          {
            e.pXa.a(780L, 123L, 1L, false);
            AppMethodBeat.o(59922);
            break;
          }
          e.pXa.a(780L, 128L, 1L, false);
          AppMethodBeat.o(59922);
          break;
        }
        if (l3 >= 30000L)
        {
          if (bool)
          {
            e.pXa.a(780L, 122L, 1L, false);
            AppMethodBeat.o(59922);
            break;
          }
          e.pXa.a(780L, 127L, 1L, false);
          AppMethodBeat.o(59922);
          break;
        }
        if (l3 >= 10000L)
        {
          if (bool)
          {
            e.pXa.a(780L, 121L, 1L, false);
            AppMethodBeat.o(59922);
            break;
          }
          e.pXa.a(780L, 126L, 1L, false);
          AppMethodBeat.o(59922);
          break;
        }
        if (l3 >= 0L)
        {
          if (bool)
          {
            e.pXa.a(780L, 120L, 1L, false);
            AppMethodBeat.o(59922);
            break;
          }
          e.pXa.a(780L, 125L, 1L, false);
          AppMethodBeat.o(59922);
          break;
          if (l3 >= 60000L)
          {
            if (bool)
            {
              e.pXa.a(780L, 133L, 1L, false);
              AppMethodBeat.o(59922);
              break;
            }
            e.pXa.a(780L, 138L, 1L, false);
            AppMethodBeat.o(59922);
            break;
          }
          if (l3 >= 30000L)
          {
            if (bool)
            {
              e.pXa.a(780L, 132L, 1L, false);
              AppMethodBeat.o(59922);
              break;
            }
            e.pXa.a(780L, 137L, 1L, false);
            AppMethodBeat.o(59922);
            break;
          }
          if (l3 >= 10000L)
          {
            if (bool)
            {
              e.pXa.a(780L, 131L, 1L, false);
              AppMethodBeat.o(59922);
              break;
            }
            e.pXa.a(780L, 136L, 1L, false);
            AppMethodBeat.o(59922);
            break;
          }
          if (l3 >= 0L)
          {
            if (bool)
            {
              e.pXa.a(780L, 130L, 1L, false);
              AppMethodBeat.o(59922);
              break;
            }
            e.pXa.a(780L, 135L, 1L, false);
            AppMethodBeat.o(59922);
            break;
            if (l3 >= 60000L)
            {
              if (bool)
              {
                e.pXa.a(780L, 143L, 1L, false);
                AppMethodBeat.o(59922);
                break;
              }
              e.pXa.a(780L, 148L, 1L, false);
              AppMethodBeat.o(59922);
              break;
            }
            if (l3 >= 30000L)
            {
              if (bool)
              {
                e.pXa.a(780L, 142L, 1L, false);
                AppMethodBeat.o(59922);
                break;
              }
              e.pXa.a(780L, 147L, 1L, false);
              AppMethodBeat.o(59922);
              break;
            }
            if (l3 >= 10000L)
            {
              if (bool)
              {
                e.pXa.a(780L, 141L, 1L, false);
                AppMethodBeat.o(59922);
                break;
              }
              e.pXa.a(780L, 146L, 1L, false);
              AppMethodBeat.o(59922);
              break;
            }
            if (l3 >= 0L)
            {
              if (bool)
              {
                e.pXa.a(780L, 140L, 1L, false);
                AppMethodBeat.o(59922);
                break;
              }
              e.pXa.a(780L, 145L, 1L, false);
              AppMethodBeat.o(59922);
              break;
              if (l3 >= 60000L)
              {
                if (bool)
                {
                  e.pXa.a(780L, 153L, 1L, false);
                  AppMethodBeat.o(59922);
                  break;
                }
                e.pXa.a(780L, 158L, 1L, false);
                AppMethodBeat.o(59922);
                break;
              }
              if (l3 >= 30000L)
              {
                if (bool)
                {
                  e.pXa.a(780L, 152L, 1L, false);
                  AppMethodBeat.o(59922);
                  break;
                }
                e.pXa.a(780L, 157L, 1L, false);
                AppMethodBeat.o(59922);
                break;
              }
              if (l3 >= 10000L)
              {
                if (bool)
                {
                  e.pXa.a(780L, 151L, 1L, false);
                  AppMethodBeat.o(59922);
                  break;
                }
                e.pXa.a(780L, 156L, 1L, false);
                AppMethodBeat.o(59922);
                break;
              }
              if (l3 >= 0L)
              {
                if (bool)
                {
                  e.pXa.a(780L, 150L, 1L, false);
                  AppMethodBeat.o(59922);
                  break;
                }
                e.pXa.a(780L, 155L, 1L, false);
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bg
 * JD-Core Version:    0.6.2
 */