package com.tencent.mm.plugin.walletlock.gesture.a;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bil;
import com.tencent.mm.protocal.protobuf.bim;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.io.IOException;

public final class d
{
  private static long tVb = -1L;

  public static void HD(int paramInt)
  {
    AppMethodBeat.i(51571);
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    if (localz != null)
    {
      localz.set(339972, Integer.valueOf(paramInt));
      localz.dsb();
    }
    AppMethodBeat.o(51571);
  }

  public static void a(bil parambil)
  {
    AppMethodBeat.i(51567);
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    if (localz != null);
    while (true)
    {
      try
      {
        localz.set(339989, Base64.encodeToString(parambil.toByteArray(), 2));
        localz.dsb();
        ab.v("MicroMsg.GestureGuardInfoManager", "alvinluo savePatternBuffer isUserSetGesturePwd: %b", new Object[] { Boolean.valueOf(e.cTz()) });
        AppMethodBeat.o(51567);
        return;
      }
      catch (IOException parambil)
      {
        ab.printErrStackTrace("MicroMsg.GestureGuardInfoManager", parambil, "", new Object[0]);
      }
      AppMethodBeat.o(51567);
    }
  }

  public static void a(bim parambim)
  {
    AppMethodBeat.i(51569);
    if (parambim != null)
      ab.i("MicroMsg.GestureGuardInfoManager", "alvinluo saveSyncedPatternInfo version: %d, status: %d", new Object[] { Integer.valueOf(parambim.wLR), Integer.valueOf(parambim.wLT) });
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    if (localz != null);
    while (true)
    {
      try
      {
        localz.set(339990, Base64.encodeToString(parambim.toByteArray(), 2));
        localz.dsb();
        AppMethodBeat.o(51569);
        return;
      }
      catch (IOException parambim)
      {
        ab.printErrStackTrace("MicroMsg.GestureGuardInfoManager", parambim, "", new Object[0]);
      }
      AppMethodBeat.o(51569);
    }
  }

  public static void ac(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(51561);
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    if (localz != null)
    {
      g localg = new g();
      localg.tVD = paramLong1;
      localg.tVE = paramLong2;
      localz.set(339969, e.by(localg.toByteArray()));
      localz.dsb();
    }
    AppMethodBeat.o(51561);
  }

  public static void ad(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(51564);
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    if (localz != null)
    {
      g localg = new g();
      localg.tVD = paramLong1;
      localg.tVE = paramLong2;
      localz.set(339971, e.by(localg.toByteArray()));
      localz.dsb();
    }
    AppMethodBeat.o(51564);
  }

  public static g cTB()
  {
    AppMethodBeat.i(51560);
    Object localObject = com.tencent.mm.kernel.g.RP().Ry();
    if (localObject == null)
    {
      localObject = new g();
      AppMethodBeat.o(51560);
    }
    while (true)
    {
      return localObject;
      localObject = ((z)localObject).get(339969, null);
      if (localObject == null)
      {
        localObject = new g();
        AppMethodBeat.o(51560);
      }
      else
      {
        localObject = new g().bz(e.stringToBytes((String)localObject));
        AppMethodBeat.o(51560);
      }
    }
  }

  public static void cTC()
  {
    AppMethodBeat.i(51562);
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    if (localz != null)
    {
      localz.set(339969, null);
      localz.dsb();
    }
    AppMethodBeat.o(51562);
  }

  public static g cTD()
  {
    AppMethodBeat.i(51563);
    Object localObject = com.tencent.mm.kernel.g.RP().Ry();
    if (localObject == null)
    {
      localObject = new g();
      AppMethodBeat.o(51563);
    }
    while (true)
    {
      return localObject;
      localObject = ((z)localObject).get(339971, null);
      if (localObject == null)
      {
        localObject = new g();
        AppMethodBeat.o(51563);
      }
      else
      {
        localObject = new g().bz(e.stringToBytes((String)localObject));
        AppMethodBeat.o(51563);
      }
    }
  }

  public static void cTE()
  {
    AppMethodBeat.i(51565);
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    if (localz != null)
    {
      localz.set(339971, null);
      localz.dsb();
    }
    AppMethodBeat.o(51565);
  }

  public static bil cTF()
  {
    AppMethodBeat.i(51566);
    Object localObject1 = com.tencent.mm.kernel.g.RP().Ry();
    if (localObject1 == null)
    {
      AppMethodBeat.o(51566);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      localObject1 = (String)((z)localObject1).get(339989, null);
      if (bo.isNullOrNil((String)localObject1))
      {
        AppMethodBeat.o(51566);
        localObject1 = null;
      }
      else
      {
        try
        {
          byte[] arrayOfByte = Base64.decode((String)localObject1, 2);
          localObject1 = new com/tencent/mm/protocal/protobuf/bil;
          ((bil)localObject1).<init>();
          localObject1 = (bil)((bil)localObject1).parseFrom(arrayOfByte);
          AppMethodBeat.o(51566);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          ab.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIllegalArgumentException, "", new Object[0]);
          AppMethodBeat.o(51566);
          Object localObject2 = null;
        }
        catch (IOException localIOException)
        {
          ab.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIOException, "", new Object[0]);
          AppMethodBeat.o(51566);
          Object localObject3 = null;
        }
      }
    }
  }

  public static bim cTG()
  {
    AppMethodBeat.i(51568);
    Object localObject1 = com.tencent.mm.kernel.g.RP().Ry();
    if (localObject1 == null)
    {
      ab.e("MicroMsg.GestureGuardInfoManager", "alvinluo configstg is null");
      AppMethodBeat.o(51568);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      localObject1 = (String)((z)localObject1).get(339990, null);
      if (bo.isNullOrNil((String)localObject1))
      {
        AppMethodBeat.o(51568);
        localObject1 = null;
      }
      else
      {
        try
        {
          localObject1 = Base64.decode((String)localObject1, 2);
          bim localbim = new com/tencent/mm/protocal/protobuf/bim;
          localbim.<init>();
          localObject1 = (bim)localbim.parseFrom((byte[])localObject1);
          AppMethodBeat.o(51568);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          ab.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIllegalArgumentException, "", new Object[0]);
          AppMethodBeat.o(51568);
          Object localObject2 = null;
        }
        catch (IOException localIOException)
        {
          ab.printErrStackTrace("MicroMsg.GestureGuardInfoManager", localIOException, "", new Object[0]);
          AppMethodBeat.o(51568);
          Object localObject3 = null;
        }
      }
    }
  }

  public static int cTH()
  {
    AppMethodBeat.i(51570);
    Object localObject = com.tencent.mm.kernel.g.RP().Ry();
    int i;
    if (localObject == null)
    {
      AppMethodBeat.o(51570);
      i = -1;
    }
    while (true)
    {
      return i;
      localObject = ((z)localObject).get(339972, null);
      if (localObject == null)
      {
        AppMethodBeat.o(51570);
        i = -1;
      }
      else
      {
        i = ((Integer)localObject).intValue();
        AppMethodBeat.o(51570);
      }
    }
  }

  public static void cTI()
  {
    AppMethodBeat.i(51572);
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    if (localz != null)
    {
      localz.set(339972, null);
      localz.dsb();
    }
    AppMethodBeat.o(51572);
  }

  public static void cTq()
  {
    tVb = -1L;
  }

  public static long cTr()
  {
    return tVb;
  }

  public static void lK(long paramLong)
  {
    tVb = paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.a.d
 * JD-Core Version:    0.6.2
 */