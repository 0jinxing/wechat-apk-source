package com.tencent.tinker.c.b;

import java.io.Closeable;
import java.util.zip.ZipFile;

public final class a
{
  public static void ah(Object paramObject)
  {
    if (paramObject == null);
    while (true)
    {
      return;
      try
      {
        if (!(paramObject instanceof Closeable))
          break label28;
        ((Closeable)paramObject).close();
      }
      catch (Throwable paramObject)
      {
      }
      continue;
      label28: if ((paramObject instanceof AutoCloseable))
        ((AutoCloseable)paramObject).close();
      else if ((paramObject instanceof ZipFile))
        ((ZipFile)paramObject).close();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.c.b.a
 * JD-Core Version:    0.6.2
 */