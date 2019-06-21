package com.tencent.mm.vending.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

final class Vending$h<K, V> extends HashMap<K, V>
{
  Vending.f zXy = null;

  public final void clear()
  {
    AppMethodBeat.i(126170);
    super.clear();
    if (this.zXy != null)
      this.zXy.a();
    AppMethodBeat.o(126170);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.base.Vending.h
 * JD-Core Version:    0.6.2
 */