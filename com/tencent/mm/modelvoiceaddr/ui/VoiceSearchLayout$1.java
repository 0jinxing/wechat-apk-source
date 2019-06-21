package com.tencent.mm.modelvoiceaddr.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;

final class VoiceSearchLayout$1
  implements ap.a
{
  VoiceSearchLayout$1(VoiceSearchLayout paramVoiceSearchLayout)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(116764);
    if (VoiceSearchLayout.a(this.gcj) == null)
      AppMethodBeat.o(116764);
    int j;
    while (true)
    {
      return true;
      if (VoiceSearchLayout.b(this.gcj) < VoiceSearchLayout.amB().length)
      {
        VoiceSearchLayout.a(this.gcj, VoiceSearchLayout.amB()[VoiceSearchLayout.c(this.gcj)]);
        AppMethodBeat.o(116764);
      }
      else
      {
        f localf = VoiceSearchLayout.a(this.gcj);
        ab.d("MicroMsg.SceneVoiceAddr", "cAmplitude " + localf.gaS);
        i = localf.gaS;
        localf.gaS = 0;
        if (i > f.cri)
          f.cri = i;
        ab.d("getMaxAmplitude", " map: " + i + " max:" + f.cri + " per:" + i * 100 / f.cri);
        i = i * 100 / f.cri;
        ab.d("MicroMsg.VoiceSearchLayout", "addr vol:".concat(String.valueOf(i)));
        j = VoiceSearchLayout.d(this.gcj);
        if (VoiceSearchLayout.d(this.gcj) != VoiceSearchLayout.e(this.gcj))
          break label340;
        if (i > 10)
          break;
        VoiceSearchLayout.f(this.gcj);
        if (VoiceSearchLayout.g(this.gcj) >= VoiceSearchLayout.amC().length)
          VoiceSearchLayout.h(this.gcj);
        VoiceSearchLayout.a(this.gcj, VoiceSearchLayout.amC()[VoiceSearchLayout.g(this.gcj)]);
        AppMethodBeat.o(116764);
      }
    }
    int k = i / 5;
    int i = k;
    if (k >= VoiceSearchLayout.amD().length)
      i = VoiceSearchLayout.amD().length - 1;
    ab.d("MicroMsg.VoiceSearchLayout", "addr mvol:".concat(String.valueOf(i)));
    VoiceSearchLayout.b(this.gcj, i);
    while (true)
    {
      VoiceSearchLayout.a(this.gcj, VoiceSearchLayout.amD()[j]);
      AppMethodBeat.o(116764);
      break;
      label340: if (VoiceSearchLayout.d(this.gcj) > VoiceSearchLayout.e(this.gcj))
        VoiceSearchLayout.i(this.gcj);
      else
        VoiceSearchLayout.j(this.gcj);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout.1
 * JD-Core Version:    0.6.2
 */