package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cm
{
  private bl a = null;

  cm(bl parambl)
  {
    this.a = parambl;
  }

  public final Bitmap a(Context paramContext)
  {
    AppMethodBeat.i(100947);
    if (this.a == null)
    {
      paramContext = null;
      AppMethodBeat.o(100947);
    }
    while (true)
    {
      return paramContext;
      paramContext = this.a.a(paramContext);
      AppMethodBeat.o(100947);
    }
  }

  public final bl a()
  {
    return this.a;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.cm
 * JD-Core Version:    0.6.2
 */