package com.google.android.gms.common.images;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class Size
{
  private final int zzps;
  private final int zzpt;

  public Size(int paramInt1, int paramInt2)
  {
    this.zzps = paramInt1;
    this.zzpt = paramInt2;
  }

  public static Size parseSize(String paramString)
  {
    AppMethodBeat.i(61245);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("string must not be null");
      AppMethodBeat.o(61245);
      throw paramString;
    }
    int i = paramString.indexOf('*');
    int j = i;
    if (i < 0)
      j = paramString.indexOf('x');
    if (j < 0)
    {
      paramString = zzi(paramString);
      AppMethodBeat.o(61245);
      throw paramString;
    }
    try
    {
      Size localSize = new Size(Integer.parseInt(paramString.substring(0, j)), Integer.parseInt(paramString.substring(j + 1)));
      AppMethodBeat.o(61245);
      return localSize;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      paramString = zzi(paramString);
      AppMethodBeat.o(61245);
    }
    throw paramString;
  }

  private static NumberFormatException zzi(String paramString)
  {
    AppMethodBeat.i(61244);
    paramString = new NumberFormatException(String.valueOf(paramString).length() + 16 + "Invalid Size: \"" + paramString + "\"");
    AppMethodBeat.o(61244);
    throw paramString;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramObject == null)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      if (this == paramObject)
      {
        bool2 = true;
      }
      else
      {
        bool2 = bool1;
        if ((paramObject instanceof Size))
        {
          paramObject = (Size)paramObject;
          bool2 = bool1;
          if (this.zzps == paramObject.zzps)
          {
            bool2 = bool1;
            if (this.zzpt == paramObject.zzpt)
              bool2 = true;
          }
        }
      }
    }
  }

  public final int getHeight()
  {
    return this.zzpt;
  }

  public final int getWidth()
  {
    return this.zzps;
  }

  public final int hashCode()
  {
    return this.zzpt ^ (this.zzps << 16 | this.zzps >>> 16);
  }

  public final String toString()
  {
    AppMethodBeat.i(61243);
    int i = this.zzps;
    int j = this.zzpt;
    String str = 23 + i + "x" + j;
    AppMethodBeat.o(61243);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.Size
 * JD-Core Version:    0.6.2
 */