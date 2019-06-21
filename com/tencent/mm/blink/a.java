package com.tencent.mm.blink;

import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;

public final class a
{
  public static final int[] eaB;
  public static final int[] eaC;
  public static final int[] eaD;
  public static final int[] eaE;
  public static final int[] eaF;
  public static final int[] eaG;
  public static final int[] eaH;
  public static final int[] eaI;
  public static final int[] eaJ;
  public static final int[] eaK;
  public static final int[] eaL;
  public static final int[] eaM;
  private static final int[] eaN;
  private static final int[] eaO;
  private static final int[] eaP;
  private static final int[] eaQ;
  private static final int[] eaR;
  private static final int[] eaS;
  private static final int[] eaT;
  private static final int[] eaU;
  private static final ArrayList<long[]> eaV;
  private static final ArrayList<Object[]> eaW;
  private static long eaX;
  private static boolean eaY;
  private static long eaZ;
  private static long eba;
  private static long ebb;
  private static long ebc;
  private static byte ebd;

  static
  {
    AppMethodBeat.i(57701);
    eaB = new int[] { 0, 1, 2 };
    eaC = new int[] { 3, 13, 23 };
    eaD = new int[] { 4, 14, 24 };
    eaE = new int[] { 5, 15, 25 };
    eaF = new int[] { 6, 16, 26 };
    eaG = new int[] { 7, 17, 27 };
    eaH = new int[] { 8, 18, 28 };
    eaI = new int[] { 9, 19, 29 };
    eaJ = new int[] { 63, 69, 75 };
    eaK = new int[] { 64, 70, 76 };
    eaL = new int[] { 65, 71, 77 };
    eaM = new int[] { 66, 72, 78 };
    eaN = new int[] { 0 };
    eaO = new int[] { 3 };
    eaP = new int[] { 9 };
    eaQ = new int[] { 10 };
    eaR = new int[] { 11 };
    eaS = new int[] { 12 };
    eaT = new int[] { 13 };
    eaU = new int[] { 14 };
    eaV = new ArrayList();
    eaW = new ArrayList();
    eaX = 0L;
    eaY = false;
    eaZ = 0L;
    eba = 0L;
    ebb = 0L;
    ebc = 0L;
    ebd = (byte)0;
    AppMethodBeat.o(57701);
  }

  public static void BO()
  {
    AppMethodBeat.i(57691);
    jdMethod_if(512);
    AppMethodBeat.o(57691);
  }

  public static void HJ()
  {
    AppMethodBeat.i(57688);
    eaX = System.currentTimeMillis();
    AppMethodBeat.o(57688);
  }

  public static void HK()
  {
    AppMethodBeat.i(57689);
    if (jdMethod_if(1024))
    {
      s(1L, System.currentTimeMillis() - eaX);
      s(2L, 1L);
    }
    AppMethodBeat.o(57689);
  }

  public static void HL()
  {
    AppMethodBeat.i(138426);
    jdMethod_if(512);
    eaY = false;
    AppMethodBeat.o(138426);
  }

  public static boolean HM()
  {
    AppMethodBeat.i(57696);
    boolean bool;
    if (!eaY)
    {
      bool = false;
      AppMethodBeat.o(57696);
    }
    while (true)
    {
      return bool;
      bool = jdMethod_if(256);
      AppMethodBeat.o(57696);
    }
  }

  public static void HN()
  {
    AppMethodBeat.i(57700);
    long l = System.currentTimeMillis() - eaZ;
    a(eaI, l);
    if (l <= 3000L)
    {
      a(eaJ, 1L);
      a(eaB, 1L);
      l = SystemClock.elapsedRealtime() - eba;
      b(eaO, l);
      if (l > 2000L)
        break label181;
      b(eaP, 1L);
    }
    while (true)
    {
      b(eaN, 1L);
      eaW.add(new Object[] { Integer.valueOf(15854), { Long.valueOf(l) } });
      AppMethodBeat.o(57700);
      return;
      if ((l > 3000L) && (l <= 6000L))
      {
        a(eaK, 1L);
        break;
      }
      if ((l > 6000L) && (l <= 10000L))
      {
        a(eaL, 1L);
        break;
      }
      a(eaM, 1L);
      break;
      label181: if ((l > 2000L) && (l <= 4000L))
        b(eaQ, 1L);
      else if ((l > 4000L) && (l <= 6000L))
        b(eaR, 1L);
      else if ((l > 6000L) && (l <= 8000L))
        b(eaS, 1L);
      else if ((l > 8000L) && (l <= 10000L))
        b(eaT, 1L);
      else
        b(eaU, 1L);
    }
  }

  public static ArrayList<long[]> HO()
  {
    return eaV;
  }

  public static ArrayList<Object[]> HP()
  {
    return eaW;
  }

  private static void a(int[] paramArrayOfInt, long paramLong)
  {
    AppMethodBeat.i(57694);
    ab.i("MicroMsg.BlinkStartup", "%s %s", new Object[] { Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(paramLong) });
    r(paramArrayOfInt[0], paramLong);
    if (com.tencent.mm.f.a.wY)
    {
      r(paramArrayOfInt[1], paramLong);
      AppMethodBeat.o(57694);
    }
    while (true)
    {
      return;
      r(paramArrayOfInt[2], paramLong);
      AppMethodBeat.o(57694);
    }
  }

  private static void b(int[] paramArrayOfInt, long paramLong)
  {
    AppMethodBeat.i(57695);
    ab.i("MicroMsg.BlinkStartup", "%s %s", new Object[] { Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(paramLong) });
    long l = paramArrayOfInt[0];
    eaV.add(new long[] { 910L, l, paramLong });
    AppMethodBeat.o(57695);
  }

  public static void cZ(String paramString)
  {
    AppMethodBeat.i(57690);
    if ((jdMethod_if(512)) && (ah.doy().equals(paramString)))
    {
      eaY = true;
      ab.i("MicroMsg.BlinkStartup", "report this time");
    }
    AppMethodBeat.o(57690);
  }

  public static void eM(long paramLong)
  {
    AppMethodBeat.i(57692);
    if (System.currentTimeMillis() - paramLong > 200L)
    {
      jdMethod_if(512);
      eaY = false;
    }
    AppMethodBeat.o(57692);
  }

  private static void eN(long paramLong)
  {
    AppMethodBeat.i(57698);
    if (paramLong > 10000L)
      HL();
    AppMethodBeat.o(57698);
  }

  public static void h(String paramString, long paramLong)
  {
    AppMethodBeat.i(57684);
    j.h(paramString, paramLong);
    AppMethodBeat.o(57684);
  }

  private static boolean jdMethod_if(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(57697);
    if ((ebd & paramInt) == 0)
    {
      ebd = (byte)(byte)(ebd | paramInt);
      ab.i("MicroMsg.BlinkStartup", "checkAndMark bit 0x%x", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(57697);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(57697);
      bool = false;
    }
  }

  public static void ig(int paramInt)
  {
    AppMethodBeat.i(57699);
    if (ebb == 0L)
    {
      ab.e("MicroMsg.BlinkStartup", "sLastPhaseTimestamp is 0");
      AppMethodBeat.o(57699);
      return;
    }
    long l = System.currentTimeMillis() - ebb;
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(57699);
      break;
      if (jdMethod_if(1))
      {
        a(eaC, l);
        ebb = System.currentTimeMillis();
        AppMethodBeat.o(57699);
        break;
        if (jdMethod_if(2))
        {
          a(eaD, l);
          ebb = System.currentTimeMillis();
          AppMethodBeat.o(57699);
          break;
          if (jdMethod_if(4))
          {
            a(eaE, l);
            ebb = System.currentTimeMillis();
            AppMethodBeat.o(57699);
            break;
            if (jdMethod_if(8))
            {
              a(eaF, l);
              ebb = System.currentTimeMillis();
              AppMethodBeat.o(57699);
              break;
              if (jdMethod_if(16))
              {
                eN(l);
                a(eaG, l);
                ebb = System.currentTimeMillis();
                AppMethodBeat.o(57699);
                break;
                if (jdMethod_if(32))
                {
                  eN(l);
                  a(eaH, l);
                  ebb = System.currentTimeMillis();
                }
              }
            }
          }
        }
      }
    }
  }

  public static void jD(String paramString)
  {
    AppMethodBeat.i(57685);
    j.jD(paramString);
    AppMethodBeat.o(57685);
  }

  public static void q(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(57683);
    j.q(paramLong1, paramLong2);
    AppMethodBeat.o(57683);
  }

  public static void r(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(57686);
    eaV.add(new long[] { 709L, paramLong1, paramLong2 });
    AppMethodBeat.o(57686);
  }

  public static void s(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(57687);
    eaV.add(new long[] { 783L, paramLong1, paramLong2 });
    AppMethodBeat.o(57687);
  }

  public static void t(long paramLong1, long paramLong2)
  {
    eaZ = paramLong1;
    eba = paramLong2;
    ebb = eaZ;
    ebc = eba;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.blink.a
 * JD-Core Version:    0.6.2
 */