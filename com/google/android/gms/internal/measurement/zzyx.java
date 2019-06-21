package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzyx
  implements Iterator
{
  private final int limit;
  private int position;

  zzyx(zzyw paramzzyw)
  {
    AppMethodBeat.i(3548);
    this.position = 0;
    this.limit = this.zzbqz.size();
    AppMethodBeat.o(3548);
  }

  private final byte nextByte()
  {
    AppMethodBeat.i(3549);
    try
    {
      zzyw localzzyw = this.zzbqz;
      int i = this.position;
      this.position = (i + 1);
      byte b = localzzyw.zzae(i);
      AppMethodBeat.o(3549);
      return b;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      NoSuchElementException localNoSuchElementException = new NoSuchElementException(localIndexOutOfBoundsException.getMessage());
      AppMethodBeat.o(3549);
      throw localNoSuchElementException;
    }
  }

  public final boolean hasNext()
  {
    if (this.position < this.limit);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void remove()
  {
    AppMethodBeat.i(3550);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException();
    AppMethodBeat.o(3550);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzyx
 * JD-Core Version:    0.6.2
 */