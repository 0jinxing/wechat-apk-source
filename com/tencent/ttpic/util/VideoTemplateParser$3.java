package com.tencent.ttpic.util;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

final class VideoTemplateParser$3
  implements Comparator<Pair<Float, Integer>>
{
  public final int compare(Pair<Float, Integer> paramPair1, Pair<Float, Integer> paramPair2)
  {
    AppMethodBeat.i(84231);
    int i = ((Float)paramPair1.first).compareTo((Float)paramPair2.first);
    AppMethodBeat.o(84231);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.VideoTemplateParser.3
 * JD-Core Version:    0.6.2
 */