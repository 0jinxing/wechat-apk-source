package com.google.android.exoplayer2.f.e;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.f.a;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

final class e
  implements com.google.android.exoplayer2.f.d
{
  private final b bod;
  private final long[] boe;
  private final Map<String, d> bof;
  private final Map<String, c> bog;

  public e(b paramb, Map<String, d> paramMap, Map<String, c> paramMap1)
  {
    AppMethodBeat.i(95694);
    this.bod = paramb;
    this.bog = paramMap1;
    this.bof = Collections.unmodifiableMap(paramMap);
    this.boe = paramb.tb();
    AppMethodBeat.o(95694);
  }

  public final int aj(long paramLong)
  {
    AppMethodBeat.i(95695);
    int i = v.a(this.boe, paramLong, false, false);
    if (i < this.boe.length)
      AppMethodBeat.o(95695);
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(95695);
    }
  }

  public final List<a> ak(long paramLong)
  {
    AppMethodBeat.i(95696);
    Object localObject1 = this.bod;
    Object localObject2 = this.bof;
    Map localMap = this.bog;
    Object localObject3 = new TreeMap();
    ((b)localObject1).a(paramLong, false, ((b)localObject1).bnN, (Map)localObject3);
    ((b)localObject1).b((Map)localObject2, (Map)localObject3);
    localObject1 = new ArrayList();
    localObject2 = ((TreeMap)localObject3).entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (Map.Entry)((Iterator)localObject2).next();
      c localc = (c)localMap.get(((Map.Entry)localObject3).getKey());
      ((List)localObject1).add(new a(b.a((SpannableStringBuilder)((Map.Entry)localObject3).getValue()), null, localc.bkW, localc.lineType, localc.bkX, localc.bkY, -2147483648, localc.width));
    }
    AppMethodBeat.o(95696);
    return localObject1;
  }

  public final long et(int paramInt)
  {
    return this.boe[paramInt];
  }

  public final int sG()
  {
    return this.boe.length;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.e.e
 * JD-Core Version:    0.6.2
 */