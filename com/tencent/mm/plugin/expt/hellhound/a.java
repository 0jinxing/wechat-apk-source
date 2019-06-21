package com.tencent.mm.plugin.expt.hellhound;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.expt.e.c;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  private static PBool lMf = null;
  private static PBool lMg = null;
  private static PBool lMh = null;
  private static PBool lMi = null;

  public static boolean bqj()
  {
    AppMethodBeat.i(73323);
    PBool localPBool;
    if (lMf == null)
    {
      c.bru();
      String str = c.a(a.a.lHX, "", false);
      localPBool = new PBool();
      lMf = localPBool;
      if (bo.getInt(str, 0) <= 0)
        break label89;
    }
    label89: for (boolean bool = true; ; bool = false)
    {
      localPBool.value = bool;
      ab.i("HellhoundConfig", "habbyge-mali, HellhoundConfig, hellhoundSwitch: [%b]", new Object[] { Boolean.valueOf(lMf.value) });
      bool = lMf.value;
      AppMethodBeat.o(73323);
      return bool;
    }
  }

  public static boolean bqk()
  {
    AppMethodBeat.i(73324);
    PBool localPBool;
    if (lMg == null)
    {
      c.bru();
      String str = c.a(a.a.lHY, "", false);
      localPBool = new PBool();
      lMg = localPBool;
      if (bo.getInt(str, 0) <= 0)
        break label89;
    }
    label89: for (boolean bool = true; ; bool = false)
    {
      localPBool.value = bool;
      ab.i("HellhoundConfig", "habbyge-mali, HellhoundConfig, frongbackSwitch: [%b]", new Object[] { Boolean.valueOf(lMg.value) });
      bool = lMg.value;
      AppMethodBeat.o(73324);
      return bool;
    }
  }

  public static boolean bql()
  {
    boolean bool = false;
    AppMethodBeat.i(73325);
    if (lMi == null)
    {
      c.bru();
      String str = c.a(a.a.lIa, "", false);
      PBool localPBool = new PBool();
      lMi = localPBool;
      if (bo.getInt(str, 0) > 0)
        bool = true;
      localPBool.value = bool;
    }
    bool = lMi.value;
    AppMethodBeat.o(73325);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.a
 * JD-Core Version:    0.6.2
 */