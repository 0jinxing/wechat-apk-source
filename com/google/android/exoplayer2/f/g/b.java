package com.google.android.exoplayer2.f.g;

import com.google.android.exoplayer2.f.a;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;

public final class b extends com.google.android.exoplayer2.f.b
{
  private static final int bou;
  private static final int bov;
  private static final int bow;
  private final l bbj;
  private final e.a box;

  static
  {
    AppMethodBeat.i(95719);
    bou = v.aT("payl");
    bov = v.aT("sttg");
    bow = v.aT("vttc");
    AppMethodBeat.o(95719);
  }

  public b()
  {
    super("Mp4WebvttDecoder");
    AppMethodBeat.i(95716);
    this.bbj = new l();
    this.box = new e.a();
    AppMethodBeat.o(95716);
  }

  private static a a(l paraml, e.a parama, int paramInt)
  {
    AppMethodBeat.i(95717);
    parama.reset();
    while (paramInt > 0)
    {
      if (paramInt < 8)
      {
        paraml = new com.google.android.exoplayer2.f.f("Incomplete vtt cue box header found.");
        AppMethodBeat.o(95717);
        throw paraml;
      }
      int i = paraml.readInt();
      int j = paraml.readInt();
      i -= 8;
      String str = new String(paraml.data, paraml.position, i);
      paraml.eM(i);
      i = paramInt - 8 - i;
      if (j == bov)
      {
        f.a(str, parama);
        paramInt = i;
      }
      else
      {
        paramInt = i;
        if (j == bou)
        {
          f.a(null, str.trim(), parama, Collections.emptyList());
          paramInt = i;
        }
      }
    }
    paraml = parama.tc();
    AppMethodBeat.o(95717);
    return paraml;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.g.b
 * JD-Core Version:    0.6.2
 */