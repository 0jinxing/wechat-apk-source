package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class o
{
  private int aBR;
  public final Format[] bhv;
  public final int length;

  public o(Format[] paramArrayOfFormat)
  {
    AppMethodBeat.i(95552);
    if (paramArrayOfFormat.length > 0);
    for (boolean bool = true; ; bool = false)
    {
      a.checkState(bool);
      this.bhv = paramArrayOfFormat;
      this.length = paramArrayOfFormat.length;
      AppMethodBeat.o(95552);
      return;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95554);
    if (this == paramObject)
      AppMethodBeat.o(95554);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95554);
        bool = false;
      }
      else
      {
        paramObject = (o)paramObject;
        if ((this.length == paramObject.length) && (Arrays.equals(this.bhv, paramObject.bhv)))
        {
          AppMethodBeat.o(95554);
        }
        else
        {
          AppMethodBeat.o(95554);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(95553);
    if (this.aBR == 0)
      this.aBR = (Arrays.hashCode(this.bhv) + 527);
    int i = this.aBR;
    AppMethodBeat.o(95553);
    return i;
  }

  public final int j(Format paramFormat)
  {
    int i = 0;
    if (i < this.bhv.length)
      if (paramFormat != this.bhv[i]);
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.o
 * JD-Core Version:    0.6.2
 */