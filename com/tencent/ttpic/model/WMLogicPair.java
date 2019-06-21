package com.tencent.ttpic.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class WMLogicPair
  implements Comparable<WMLogicPair>
{
  public String key;
  public String value;

  public WMLogicPair(String paramString1, String paramString2)
  {
    this.key = paramString1;
    this.value = paramString2;
  }

  public int compareTo(WMLogicPair paramWMLogicPair)
  {
    AppMethodBeat.i(83602);
    int i;
    if (Integer.parseInt(this.key) > Integer.parseInt(paramWMLogicPair.key))
    {
      i = 1;
      AppMethodBeat.o(83602);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(83602);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.WMLogicPair
 * JD-Core Version:    0.6.2
 */