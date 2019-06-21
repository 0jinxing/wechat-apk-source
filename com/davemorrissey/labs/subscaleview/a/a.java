package com.davemorrissey.labs.subscaleview.a;

import android.graphics.Bitmap.Config;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;

public final class a<T>
  implements b<T>
{
  private Class<? extends T> aIl;
  private Bitmap.Config ayC;

  public a(Class<? extends T> paramClass)
  {
    this(paramClass, (byte)0);
  }

  private a(Class<? extends T> paramClass, byte paramByte)
  {
    this.aIl = paramClass;
    this.ayC = null;
  }

  public final T or()
  {
    AppMethodBeat.i(115606);
    Object localObject;
    if (this.ayC == null)
    {
      localObject = this.aIl.newInstance();
      AppMethodBeat.o(115606);
    }
    while (true)
    {
      return localObject;
      localObject = this.aIl.getConstructor(new Class[] { Bitmap.Config.class }).newInstance(new Object[] { this.ayC });
      AppMethodBeat.o(115606);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.a.a
 * JD-Core Version:    0.6.2
 */