package com.google.android.exoplayer2.e;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$a
{
  public final boolean bdY;
  public final String mimeType;

  public d$a(String paramString, boolean paramBoolean)
  {
    this.mimeType = paramString;
    this.bdY = paramBoolean;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(95240);
    if (this == paramObject)
      AppMethodBeat.o(95240);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (paramObject.getClass() != a.class))
      {
        AppMethodBeat.o(95240);
        bool = false;
      }
      else
      {
        paramObject = (a)paramObject;
        if ((TextUtils.equals(this.mimeType, paramObject.mimeType)) && (this.bdY == paramObject.bdY))
        {
          AppMethodBeat.o(95240);
        }
        else
        {
          AppMethodBeat.o(95240);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(95239);
    int i;
    if (this.mimeType == null)
    {
      i = 0;
      if (!this.bdY)
        break label51;
    }
    label51: for (int j = 1231; ; j = 1237)
    {
      AppMethodBeat.o(95239);
      return j + (i + 31) * 31;
      i = this.mimeType.hashCode();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.e.d.a
 * JD-Core Version:    0.6.2
 */