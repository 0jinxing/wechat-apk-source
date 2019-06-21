package com.tencent.mm.plugin.expt.hellhound.core.stack;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.hellhound.core.a.b;
import com.tencent.mm.protocal.protobuf.bf;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
{
  public static void a(bf parambf)
  {
    AppMethodBeat.i(73360);
    if (parambf == null)
      AppMethodBeat.o(73360);
    while (true)
    {
      return;
      Object localObject = null;
      try
      {
        parambf = parambf.toByteArray();
        b.v("hell_astackd_mmkv_key", parambf);
        AppMethodBeat.o(73360);
      }
      catch (Exception parambf)
      {
        while (true)
        {
          ab.printErrStackTrace("ActivityStackDao", parambf, "ActivityStackDao write", new Object[0]);
          parambf = localObject;
        }
      }
    }
  }

  public static bf bqs()
  {
    AppMethodBeat.i(73359);
    bf localbf1 = bqt();
    bf localbf2 = localbf1;
    if (localbf1 == null)
    {
      localbf2 = new bf();
      a(localbf2);
    }
    AppMethodBeat.o(73359);
    return localbf2;
  }

  private static bf bqt()
  {
    AppMethodBeat.i(73361);
    byte[] arrayOfByte = b.getBytes("hell_astackd_mmkv_key");
    bf localbf;
    if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
    {
      AppMethodBeat.o(73361);
      localbf = null;
    }
    while (true)
    {
      return localbf;
      localbf = new bf();
      try
      {
        localbf.parseFrom(arrayOfByte);
        AppMethodBeat.o(73361);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("ActivityStackDao", localException, "ActivityStackDao read", new Object[0]);
        AppMethodBeat.o(73361);
        Object localObject = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.stack.c
 * JD-Core Version:    0.6.2
 */