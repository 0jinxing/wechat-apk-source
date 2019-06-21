package com.tencent.mm.loader.h;

import android.graphics.Bitmap;

public final class e<T>
{
  private e<?> eRU;
  private T value;

  public e()
  {
  }

  public e(T paramT)
  {
    this.value = paramT;
  }

  public final e Ue()
  {
    return this.eRU;
  }

  public final T getValue()
  {
    return this.value;
  }

  public final boolean isValid()
  {
    boolean bool;
    if (this.value == null)
      bool = false;
    while (true)
    {
      return bool;
      if ((this.value instanceof Bitmap))
      {
        if (!((Bitmap)this.value).isRecycled())
          bool = true;
        else
          bool = false;
      }
      else
        bool = true;
    }
  }

  public final T value()
  {
    return this.value;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.h.e
 * JD-Core Version:    0.6.2
 */