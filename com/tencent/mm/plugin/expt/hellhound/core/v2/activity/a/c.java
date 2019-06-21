package com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.hellhound.core.a.b;
import com.tencent.mm.protocal.protobuf.bb;
import com.tencent.mm.sdk.platformtools.ab;

final class c extends a
{
  private static void a(bb parambb)
  {
    AppMethodBeat.i(73440);
    try
    {
      b.v("hell_aty_action_mmkv_key", parambb.toByteArray());
      AppMethodBeat.o(73440);
      return;
    }
    catch (Exception parambb)
    {
      while (true)
      {
        ab.printErrStackTrace("ActivityDao_MMKV", parambb, "habbyge-mali, HellhoundDao writeBack", new Object[0]);
        AppMethodBeat.o(73440);
      }
    }
  }

  private static bb bqD()
  {
    AppMethodBeat.i(73441);
    byte[] arrayOfByte = b.getBytes("hell_aty_action_mmkv_key");
    bb localbb;
    if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
    {
      AppMethodBeat.o(73441);
      localbb = null;
    }
    while (true)
    {
      return localbb;
      localbb = new bb();
      try
      {
        localbb.parseFrom(arrayOfByte);
        AppMethodBeat.o(73441);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("ActivityDao_MMKV", localException, "habbyge-mali, HellhoundDao _doRead parse", new Object[0]);
          Object localObject = null;
        }
      }
    }
  }

  final void KO(String paramString)
  {
    AppMethodBeat.i(73432);
    Object localObject1 = bqD();
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = new bb();
    ((bb)localObject2).vCT = true;
    localObject1 = paramString;
    if (paramString == null)
      localObject1 = "";
    ((bb)localObject2).vCX = ((String)localObject1);
    a((bb)localObject2);
    AppMethodBeat.o(73432);
  }

  final void KP(String paramString)
  {
    AppMethodBeat.i(73436);
    Object localObject1 = bqD();
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = new bb();
    ((bb)localObject2).vCV = true;
    localObject1 = paramString;
    if (paramString == null)
      localObject1 = "";
    ((bb)localObject2).vCZ = ((String)localObject1);
    a((bb)localObject2);
    AppMethodBeat.o(73436);
  }

  final void KQ(String paramString)
  {
    AppMethodBeat.i(73430);
    Object localObject1 = bqD();
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = new bb();
    ((bb)localObject2).vCS = true;
    localObject1 = paramString;
    if (paramString == null)
      localObject1 = "";
    ((bb)localObject2).vCW = ((String)localObject1);
    a((bb)localObject2);
    AppMethodBeat.o(73430);
  }

  final boolean KR(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(73431);
    bb localbb = bqD();
    if (localbb == null)
      AppMethodBeat.o(73431);
    while (true)
    {
      return bool1;
      boolean bool2 = localbb.vCS;
      String str = localbb.vCW;
      bool1 = bool2;
      if (bool2)
      {
        bool1 = bool2;
        if (!TextUtils.isEmpty(str))
        {
          bool1 = bool2;
          if (!str.equals(paramString))
            bool1 = false;
        }
        localbb.vCS = false;
        localbb.vCW = "";
        a(localbb);
      }
      AppMethodBeat.o(73431);
    }
  }

  final void KS(String paramString)
  {
    AppMethodBeat.i(73434);
    ab.i("ActivityDao_MMKV", "habbyge-mali, ActivityDao, setStartActivityAction_pause: ".concat(String.valueOf(paramString)));
    Object localObject1 = bqD();
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = new bb();
    ((bb)localObject2).vCU = true;
    localObject1 = paramString;
    if (paramString == null)
      localObject1 = "";
    ((bb)localObject2).vCY = ((String)localObject1);
    a((bb)localObject2);
    AppMethodBeat.o(73434);
  }

  final boolean KT(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(73435);
    ab.i("ActivityDao_MMKV", "habbyge-mali, isStartActivityAction_pause: ".concat(String.valueOf(paramString)));
    paramString = bqD();
    if (paramString == null)
      AppMethodBeat.o(73435);
    while (true)
    {
      return bool;
      bool = paramString.vCU;
      if (bool)
      {
        paramString.vCU = false;
        paramString.vCY = "";
        a(paramString);
      }
      AppMethodBeat.o(73435);
    }
  }

  final boolean KU(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(73437);
    bb localbb = bqD();
    if (localbb == null)
      AppMethodBeat.o(73437);
    while (true)
    {
      return bool1;
      boolean bool2 = localbb.vCV;
      String str = localbb.vCZ;
      bool1 = bool2;
      if (bool2)
      {
        bool1 = bool2;
        if (!TextUtils.isEmpty(str))
        {
          bool1 = bool2;
          if (!str.equals(paramString))
            bool1 = false;
        }
        localbb.vCV = false;
        localbb.vCZ = "";
        a(localbb);
      }
      AppMethodBeat.o(73437);
    }
  }

  final int bqA()
  {
    AppMethodBeat.i(73439);
    bb localbb = bqD();
    int i;
    if (localbb == null)
    {
      i = -1;
      AppMethodBeat.o(73439);
    }
    while (true)
    {
      return i;
      i = localbb.vDa;
      AppMethodBeat.o(73439);
    }
  }

  final boolean bqB()
  {
    boolean bool = false;
    AppMethodBeat.i(73433);
    bb localbb = bqD();
    if (localbb == null)
      AppMethodBeat.o(73433);
    while (true)
    {
      return bool;
      bool = localbb.vCT;
      if (bool)
      {
        localbb.vCT = false;
        localbb.vCX = "";
        a(localbb);
      }
      AppMethodBeat.o(73433);
    }
  }

  final void reset()
  {
    AppMethodBeat.i(73429);
    ab.i("ActivityDao_MMKV", "habbyge-mali, ActivityDao_MMKV reset");
    b.v("hell_aty_action_mmkv_key", new byte[0]);
    AppMethodBeat.o(73429);
  }

  final void uX(int paramInt)
  {
    AppMethodBeat.i(73438);
    bb localbb1 = bqD();
    bb localbb2 = localbb1;
    if (localbb1 == null)
      localbb2 = new bb();
    localbb2.vDa = paramInt;
    a(localbb2);
    AppMethodBeat.o(73438);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.c
 * JD-Core Version:    0.6.2
 */