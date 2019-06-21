package com.tencent.mm.loader.h;

import com.tencent.mm.loader.h.b.a;
import java.io.OutputStream;

public abstract class f<T>
{
  T data;

  f()
  {
  }

  public f(T paramT)
  {
    this.data = paramT;
  }

  public abstract a TW();

  public abstract void a(OutputStream paramOutputStream);

  public final T value()
  {
    return this.data;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.h.f
 * JD-Core Version:    0.6.2
 */