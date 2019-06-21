package com.tencent.wcdb.database;

import java.io.Closeable;

public abstract class SQLiteClosable
  implements Closeable
{
  private int mReferenceCount = 1;

  public void acquireReference()
  {
    try
    {
      if (this.mReferenceCount <= 0)
      {
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("attempt to re-open an already-closed object: ".concat(String.valueOf(this)));
        throw localIllegalStateException;
      }
    }
    finally
    {
    }
    this.mReferenceCount += 1;
  }

  public void close()
  {
    releaseReference();
  }

  protected abstract void onAllReferencesReleased();

  @Deprecated
  protected void onAllReferencesReleasedFromContainer()
  {
    onAllReferencesReleased();
  }

  public void releaseReference()
  {
    try
    {
      int i = this.mReferenceCount - 1;
      this.mReferenceCount = i;
      if (i == 0);
      for (i = 1; ; i = 0)
      {
        if (i != 0)
          onAllReferencesReleased();
        return;
      }
    }
    finally
    {
    }
  }

  @Deprecated
  public void releaseReferenceFromContainer()
  {
    try
    {
      int i = this.mReferenceCount - 1;
      this.mReferenceCount = i;
      if (i == 0);
      for (i = 1; ; i = 0)
      {
        if (i != 0)
          onAllReferencesReleased();
        return;
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.database.SQLiteClosable
 * JD-Core Version:    0.6.2
 */