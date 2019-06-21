package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DataBufferIterator<T>
  implements Iterator<T>
{
  protected final DataBuffer<T> mDataBuffer;
  protected int mPosition;

  public DataBufferIterator(DataBuffer<T> paramDataBuffer)
  {
    AppMethodBeat.i(61035);
    this.mDataBuffer = ((DataBuffer)Preconditions.checkNotNull(paramDataBuffer));
    this.mPosition = -1;
    AppMethodBeat.o(61035);
  }

  public boolean hasNext()
  {
    AppMethodBeat.i(61036);
    boolean bool;
    if (this.mPosition < this.mDataBuffer.getCount() - 1)
    {
      bool = true;
      AppMethodBeat.o(61036);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(61036);
    }
  }

  public T next()
  {
    AppMethodBeat.i(61037);
    if (!hasNext())
    {
      i = this.mPosition;
      localObject = new NoSuchElementException(46 + "Cannot advance the iterator beyond " + i);
      AppMethodBeat.o(61037);
      throw ((Throwable)localObject);
    }
    Object localObject = this.mDataBuffer;
    int i = this.mPosition + 1;
    this.mPosition = i;
    localObject = ((DataBuffer)localObject).get(i);
    AppMethodBeat.o(61037);
    return localObject;
  }

  public void remove()
  {
    AppMethodBeat.i(61038);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    AppMethodBeat.o(61038);
    throw localUnsupportedOperationException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataBufferIterator
 * JD-Core Version:    0.6.2
 */