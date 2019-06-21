package com.bumptech.glide.c.b.a;

import android.graphics.Bitmap.Config;
import com.bumptech.glide.h.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class n$a
  implements m
{
  private final n.b aCW;
  private Bitmap.Config aCt;
  int size;

  public n$a(n.b paramb)
  {
    this.aCW = paramb;
  }

  public final void b(int paramInt, Bitmap.Config paramConfig)
  {
    this.size = paramInt;
    this.aCt = paramConfig;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(91959);
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      if ((this.size == paramObject.size) && (j.h(this.aCt, paramObject.aCt)))
      {
        bool = true;
        AppMethodBeat.o(91959);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(91959);
      continue;
      AppMethodBeat.o(91959);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(91960);
    int i = this.size;
    if (this.aCt != null);
    for (int j = this.aCt.hashCode(); ; j = 0)
    {
      AppMethodBeat.o(91960);
      return j + i * 31;
    }
  }

  public final void mQ()
  {
    AppMethodBeat.i(91957);
    this.aCW.a(this);
    AppMethodBeat.o(91957);
  }

  public final String toString()
  {
    AppMethodBeat.i(91958);
    String str = n.a(this.size, this.aCt);
    AppMethodBeat.o(91958);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.a.n.a
 * JD-Core Version:    0.6.2
 */