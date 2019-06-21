package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.Releasable;
import java.util.Iterator;

public abstract interface DataBuffer<T> extends Releasable, Iterable<T>
{
  @Deprecated
  public abstract void close();

  public abstract T get(int paramInt);

  public abstract int getCount();

  public abstract Bundle getMetadata();

  @Deprecated
  public abstract boolean isClosed();

  public abstract Iterator<T> iterator();

  public abstract void release();

  public abstract Iterator<T> singleRefIterator();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataBuffer
 * JD-Core Version:    0.6.2
 */