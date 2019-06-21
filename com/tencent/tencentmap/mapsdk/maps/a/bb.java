package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.c;
import com.tencent.tencentmap.mapsdk.a.e;

public final class bb extends az
{
  public bb(Context paramContext)
  {
    super(paramContext, 0, 100);
  }

  public final aa a()
  {
    AppMethodBeat.i(98542);
    c localc = c.m();
    Object localObject1 = "".getBytes();
    try
    {
      localObject1 = e.a(c(), localc, (byte[])localObject1, -1, -1);
      if (localObject1 != null)
        AppMethodBeat.o(98542);
      while (true)
      {
        return localObject1;
        AppMethodBeat.o(98542);
        localObject1 = null;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.a(localThrowable);
        ag.d("encode2RequestPackage failed", new Object[0]);
        AppMethodBeat.o(98542);
        Object localObject2 = null;
      }
    }
  }

  public final void b(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bb
 * JD-Core Version:    0.6.2
 */