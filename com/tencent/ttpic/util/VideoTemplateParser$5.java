package com.tencent.ttpic.util;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

final class VideoTemplateParser$5
  implements Comparator<Pair<Float, Double>>
{
  public final int compare(Pair<Float, Double> paramPair1, Pair<Float, Double> paramPair2)
  {
    AppMethodBeat.i(84235);
    int i = ((Float)paramPair1.first).compareTo((Float)paramPair2.first);
    AppMethodBeat.o(84235);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoTemplateParser.5
 * JD-Core Version:    0.6.2
 */