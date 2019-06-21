package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;

public final class u
{
  public static final j uSA;
  public static final c uSB;
  public static final l uSC;
  public static final h uSD;
  public static final ArrayList<t> uSE;
  public static final b uSz;

  static
  {
    AppMethodBeat.i(26975);
    uSz = new b();
    uSA = new j();
    uSB = new c();
    uSC = new l();
    uSD = new h();
    ArrayList localArrayList = new ArrayList();
    uSE = localArrayList;
    localArrayList.add(uSz);
    uSE.add(uSB);
    uSE.add(uSC);
    uSE.add(uSA);
    AppMethodBeat.o(26975);
  }

  private static void a(WXRTEditText paramWXRTEditText, o paramo, t[] paramArrayOft)
  {
    AppMethodBeat.i(26974);
    int i = paramArrayOft.length;
    int j = 0;
    if (j < i)
      if (paramo == paramArrayOft[j])
        AppMethodBeat.o(26974);
    while (true)
    {
      return;
      j++;
      break;
      paramo.a(paramWXRTEditText, null, null);
      AppMethodBeat.o(26974);
    }
  }

  public static void a(WXRTEditText paramWXRTEditText, t[] paramArrayOft)
  {
    AppMethodBeat.i(26973);
    a(paramWXRTEditText, uSD, paramArrayOft);
    a(paramWXRTEditText, uSB, paramArrayOft);
    a(paramWXRTEditText, uSC, paramArrayOft);
    a(paramWXRTEditText, uSA, paramArrayOft);
    AppMethodBeat.o(26973);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.u
 * JD-Core Version:    0.6.2
 */