package com.tencent.mm.plugin.expt.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum c$a
{
  public int value;

  static
  {
    AppMethodBeat.i(128627);
    lLV = new a("MM_DEFAULT", 0, 0);
    lLW = new a("MMAppMgr_Activated", 1, 1);
    lLX = new a("MMAppMgr_Deactivated", 2, 2);
    lLY = new a("MMLifeCall_OnResume", 3, 3);
    lLZ = new a("MMLifeCall_OnPause", 4, 4);
    lMa = new a("MMActivity_OnResume", 5, 5);
    lMb = new a("MMActivity_OnPause", 6, 6);
    lMc = new a("MMActivity_Back2Front", 7, 7);
    lMd = new a("MMActivity_Front2Back", 8, 8);
    lMe = new a[] { lLV, lLW, lLX, lLY, lLZ, lMa, lMb, lMc, lMd };
    AppMethodBeat.o(128627);
  }

  private c$a(int paramInt)
  {
    this.value = paramInt;
  }

  public static a uW(int paramInt)
  {
    a locala;
    switch (paramInt)
    {
    default:
      locala = lLV;
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
      return locala;
      locala = lLW;
      continue;
      locala = lLX;
      continue;
      locala = lLY;
      continue;
      locala = lLZ;
      continue;
      locala = lMa;
      continue;
      locala = lMb;
      continue;
      locala = lMc;
      continue;
      locala = lMd;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.a.c.a
 * JD-Core Version:    0.6.2
 */