package com.tencent.mm.plugin.expt.hellhound.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.hellhound.core.a.b;
import com.tencent.mm.protocal.protobuf.acp;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  static void a(acp paramacp)
  {
    AppMethodBeat.i(73448);
    try
    {
      b.v("hell_fntbck_pter_mmkv_key", paramacp.toByteArray());
      AppMethodBeat.o(73448);
      return;
    }
    catch (Exception paramacp)
    {
      while (true)
      {
        ab.printErrStackTrace("FrontBackDao", paramacp, "habbyge-mali, writeBackFrontBack", new Object[0]);
        AppMethodBeat.o(73448);
      }
    }
  }

  static acp bqE()
  {
    AppMethodBeat.i(73449);
    byte[] arrayOfByte = b.getBytes("hell_fntbck_pter_mmkv_key");
    acp localacp;
    if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
    {
      AppMethodBeat.o(73449);
      localacp = null;
    }
    while (true)
    {
      return localacp;
      localacp = new acp();
      try
      {
        localacp.parseFrom(arrayOfByte);
        AppMethodBeat.o(73449);
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.printErrStackTrace("FrontBackDao", localException, "habbyge-mali, _doReadFrontBack parse", new Object[0]);
          Object localObject = null;
        }
      }
    }
  }

  public static void gR(boolean paramBoolean)
  {
    AppMethodBeat.i(73446);
    acp localacp1 = bqE();
    acp localacp2 = localacp1;
    if (localacp1 == null)
      localacp2 = new acp();
    localacp2.wkq = paramBoolean;
    ab.d("FrontBackDao", "habbyge-mali, logout8EventFromAdd: " + localacp2.wkq);
    a(localacp2);
    AppMethodBeat.o(73446);
  }

  public static void uY(int paramInt)
  {
    AppMethodBeat.i(73447);
    acp localacp1 = bqE();
    acp localacp2 = localacp1;
    if (localacp1 == null)
      localacp2 = new acp();
    localacp2.wkl = paramInt;
    ab.d("FrontBackDao", "habbyge-mali, setFrontBackEvent_LastTime: ".concat(String.valueOf(paramInt)));
    a(localacp2);
    AppMethodBeat.o(73447);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.a.a.a
 * JD-Core Version:    0.6.2
 */