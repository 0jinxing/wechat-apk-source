package com.tencent.ttpic.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum LoadItemManager$LOAD_TYPE
{
  static
  {
    AppMethodBeat.i(81807);
    LOAD_ALL = new LOAD_TYPE("LOAD_ALL", 0);
    LOAD_PRE = new LOAD_TYPE("LOAD_PRE", 1);
    $VALUES = new LOAD_TYPE[] { LOAD_ALL, LOAD_PRE };
    AppMethodBeat.o(81807);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.cache.LoadItemManager.LOAD_TYPE
 * JD-Core Version:    0.6.2
 */