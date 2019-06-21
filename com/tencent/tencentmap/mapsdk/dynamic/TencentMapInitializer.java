package com.tencent.tencentmap.mapsdk.dynamic;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class TencentMapInitializer
  implements IInitializer
{
  private static volatile TencentMapInitializer b;
  private IInitializer a;

  private TencentMapInitializer(Context paramContext)
  {
    AppMethodBeat.i(101278);
    this.a = a.a(paramContext);
    AppMethodBeat.o(101278);
  }

  public static TencentMapInitializer getInstance(Context paramContext)
  {
    AppMethodBeat.i(101279);
    if (b == null);
    try
    {
      if (b == null)
      {
        TencentMapInitializer localTencentMapInitializer = new com/tencent/tencentmap/mapsdk/dynamic/TencentMapInitializer;
        localTencentMapInitializer.<init>(paramContext);
        b = localTencentMapInitializer;
      }
      paramContext = b;
      AppMethodBeat.o(101279);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(101279);
    }
    throw paramContext;
  }

  public void downLoadVectorMapResource()
  {
    AppMethodBeat.i(101280);
    if (this.a == null)
      AppMethodBeat.o(101280);
    while (true)
    {
      return;
      this.a.downLoadVectorMapResource();
      AppMethodBeat.o(101280);
    }
  }

  public boolean isVectorMapValid()
  {
    AppMethodBeat.i(101281);
    boolean bool;
    if (this.a == null)
    {
      bool = false;
      AppMethodBeat.o(101281);
    }
    while (true)
    {
      return bool;
      bool = this.a.isVectorMapValid();
      AppMethodBeat.o(101281);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.dynamic.TencentMapInitializer
 * JD-Core Version:    0.6.2
 */