package com.google.android.exoplayer2.g;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$a
{
  public final int aOn;
  public final String mimeType;
  public final int sampleRate;

  public c$a(int paramInt1, int paramInt2, String paramString)
  {
    this.aOn = paramInt1;
    this.sampleRate = paramInt2;
    this.mimeType = paramString;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95761);
    if (this == paramObject)
      AppMethodBeat.o(95761);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95761);
        bool = false;
      }
      else
      {
        paramObject = (a)paramObject;
        if ((this.aOn == paramObject.aOn) && (this.sampleRate == paramObject.sampleRate) && (TextUtils.equals(this.mimeType, paramObject.mimeType)))
        {
          AppMethodBeat.o(95761);
        }
        else
        {
          AppMethodBeat.o(95761);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(95762);
    int i = this.aOn;
    int j = this.sampleRate;
    if (this.mimeType != null);
    for (int k = this.mimeType.hashCode(); ; k = 0)
    {
      AppMethodBeat.o(95762);
      return k + (i * 31 + j) * 31;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.g.c.a
 * JD-Core Version:    0.6.2
 */