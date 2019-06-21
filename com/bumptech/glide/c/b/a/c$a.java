package com.bumptech.glide.c.b.a;

import android.graphics.Bitmap.Config;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$a
  implements m
{
  private final c.b aCs;
  private Bitmap.Config aCt;
  private int height;
  private int width;

  public c$a(c.b paramb)
  {
    this.aCs = paramb;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      bool2 = bool1;
      if (this.width == paramObject.width)
      {
        bool2 = bool1;
        if (this.height == paramObject.height)
        {
          bool2 = bool1;
          if (this.aCt == paramObject.aCt)
            bool2 = true;
        }
      }
    }
    return bool2;
  }

  public final void f(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    this.width = paramInt1;
    this.height = paramInt2;
    this.aCt = paramConfig;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(91897);
    int i = this.width;
    int j = this.height;
    if (this.aCt != null);
    for (int k = this.aCt.hashCode(); ; k = 0)
    {
      AppMethodBeat.o(91897);
      return k + (i * 31 + j) * 31;
    }
  }

  public final void mQ()
  {
    AppMethodBeat.i(91899);
    this.aCs.a(this);
    AppMethodBeat.o(91899);
  }

  public final String toString()
  {
    AppMethodBeat.i(91898);
    String str = c.e(this.width, this.height, this.aCt);
    AppMethodBeat.o(91898);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.c.a
 * JD-Core Version:    0.6.2
 */