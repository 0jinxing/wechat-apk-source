package com.tencent.mm.plugin.expt.hellhound.core.v2.activity;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  static void KO(String paramString)
  {
    AppMethodBeat.i(73388);
    ab.i("ActivityActionWrapper", "habbyge-mali, setFinishAction_resume: ".concat(String.valueOf(paramString)));
    b.bqC().lMN.KO(paramString);
    AppMethodBeat.o(73388);
  }

  static void KP(String paramString)
  {
    AppMethodBeat.i(73389);
    ab.i("ActivityActionWrapper", "habbyge-mali, setFinishAction_pause: ".concat(String.valueOf(paramString)));
    b.bqC().lMN.KP(paramString);
    AppMethodBeat.o(73389);
  }

  public static int bqA()
  {
    AppMethodBeat.i(73391);
    int i = b.bqC().lMN.bqA();
    AppMethodBeat.o(73391);
    return i;
  }

  public static void uX(int paramInt)
  {
    AppMethodBeat.i(73390);
    ab.d("ActivityActionWrapper", "habbyge-mali, setActivityMethod: ".concat(String.valueOf(paramInt)));
    b.bqC().lMN.uX(paramInt);
    AppMethodBeat.o(73390);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.core.v2.activity.a
 * JD-Core Version:    0.6.2
 */