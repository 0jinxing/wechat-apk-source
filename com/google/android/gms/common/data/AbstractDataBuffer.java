package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

public abstract class AbstractDataBuffer<T>
  implements DataBuffer<T>
{
  protected final DataHolder mDataHolder;

  protected AbstractDataBuffer(DataHolder paramDataHolder)
  {
    this.mDataHolder = paramDataHolder;
  }

  @Deprecated
  public final void close()
  {
    release();
  }

  public abstract T get(int paramInt);

  public int getCount()
  {
    if (this.mDataHolder == null);
    for (int i = 0; ; i = this.mDataHolder.getCount())
      return i;
  }

  public Bundle getMetadata()
  {
    return this.mDataHolder.getMetadata();
  }

  @Deprecated
  public boolean isClosed()
  {
    if ((this.mDataHolder == null) || (this.mDataHolder.isClosed()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public Iterator<T> iterator()
  {
    return new DataBufferIterator(this);
  }

  public void release()
  {
    if (this.mDataHolder != null)
      this.mDataHolder.close();
  }

  public Iterator<T> singleRefIterator()
  {
    return new SingleRefDataBufferIterator(this);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.AbstractDataBuffer
 * JD-Core Version:    0.6.2
 */