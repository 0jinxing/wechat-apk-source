package com.google.android.exoplayer2.a;

import android.media.AudioAttributes;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public static final b aPz;
  public final int aPA;
  public final int aPB;
  AudioAttributes aPC;
  public final int flags;

  static
  {
    AppMethodBeat.i(94644);
    b.a locala = new b.a();
    aPz = new b(locala.aPA, locala.flags, locala.aPB, (byte)0);
    AppMethodBeat.o(94644);
  }

  private b(int paramInt1, int paramInt2, int paramInt3)
  {
    this.aPA = paramInt1;
    this.flags = paramInt2;
    this.aPB = paramInt3;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(94643);
    if (this == paramObject)
      AppMethodBeat.o(94643);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(94643);
        bool = false;
      }
      else
      {
        paramObject = (b)paramObject;
        if ((this.aPA == paramObject.aPA) && (this.flags == paramObject.flags) && (this.aPB == paramObject.aPB))
        {
          AppMethodBeat.o(94643);
        }
        else
        {
          AppMethodBeat.o(94643);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    return ((this.aPA + 527) * 31 + this.flags) * 31 + this.aPB;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.a.b
 * JD-Core Version:    0.6.2
 */