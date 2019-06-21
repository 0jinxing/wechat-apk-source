package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class zzacc
{
  private static final Charset ISO_8859_1;
  protected static final Charset UTF_8;
  public static final Object zzbxg;

  static
  {
    AppMethodBeat.i(3511);
    UTF_8 = Charset.forName("UTF-8");
    ISO_8859_1 = Charset.forName("ISO-8859-1");
    zzbxg = new Object();
    AppMethodBeat.o(3511);
  }

  public static boolean equals(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    AppMethodBeat.i(3504);
    boolean bool;
    if ((paramArrayOfInt1 == null) || (paramArrayOfInt1.length == 0))
      if ((paramArrayOfInt2 == null) || (paramArrayOfInt2.length == 0))
      {
        bool = true;
        AppMethodBeat.o(3504);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3504);
      continue;
      bool = Arrays.equals(paramArrayOfInt1, paramArrayOfInt2);
      AppMethodBeat.o(3504);
    }
  }

  public static boolean equals(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    AppMethodBeat.i(3505);
    boolean bool;
    if ((paramArrayOfLong1 == null) || (paramArrayOfLong1.length == 0))
      if ((paramArrayOfLong2 == null) || (paramArrayOfLong2.length == 0))
      {
        bool = true;
        AppMethodBeat.o(3505);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(3505);
      continue;
      bool = Arrays.equals(paramArrayOfLong1, paramArrayOfLong2);
      AppMethodBeat.o(3505);
    }
  }

  public static boolean equals(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    boolean bool = false;
    AppMethodBeat.i(3506);
    int i;
    if (paramArrayOfObject1 == null)
    {
      i = 0;
      if (paramArrayOfObject2 != null)
        break label52;
    }
    int k;
    int m;
    label52: for (int j = 0; ; j = paramArrayOfObject2.length)
    {
      k = 0;
      for (m = 0; (m < i) && (paramArrayOfObject1[m] == null); m++);
      i = paramArrayOfObject1.length;
      break;
    }
    while (true)
      if ((k < j) && (paramArrayOfObject2[k] == null))
      {
        k++;
      }
      else
      {
        int n;
        int i1;
        if (m >= i)
        {
          n = 1;
          if (k < j)
            break label124;
          i1 = 1;
          label98: if ((n == 0) || (i1 == 0))
            break label130;
          AppMethodBeat.o(3506);
          bool = true;
        }
        while (true)
        {
          return bool;
          n = 0;
          break;
          label124: i1 = 0;
          break label98;
          label130: if (n != i1)
          {
            AppMethodBeat.o(3506);
          }
          else
          {
            if (paramArrayOfObject1[m].equals(paramArrayOfObject2[k]))
              break label169;
            AppMethodBeat.o(3506);
          }
        }
        label169: k++;
        m++;
        break;
      }
  }

  public static int hashCode(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(3507);
    int i;
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      i = 0;
      AppMethodBeat.o(3507);
    }
    while (true)
    {
      return i;
      i = Arrays.hashCode(paramArrayOfInt);
      AppMethodBeat.o(3507);
    }
  }

  public static int hashCode(long[] paramArrayOfLong)
  {
    AppMethodBeat.i(3508);
    int i;
    if ((paramArrayOfLong == null) || (paramArrayOfLong.length == 0))
    {
      i = 0;
      AppMethodBeat.o(3508);
    }
    while (true)
    {
      return i;
      i = Arrays.hashCode(paramArrayOfLong);
      AppMethodBeat.o(3508);
    }
  }

  public static int hashCode(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(3509);
    int i;
    int j;
    int k;
    if (paramArrayOfObject == null)
    {
      i = 0;
      j = 0;
      k = 0;
      label16: if (j >= i)
        break label54;
      Object localObject = paramArrayOfObject[j];
      if (localObject == null)
        break label62;
      k = localObject.hashCode() + k * 31;
    }
    label54: label62: 
    while (true)
    {
      j++;
      break label16;
      i = paramArrayOfObject.length;
      break;
      AppMethodBeat.o(3509);
      return k;
    }
  }

  public static void zza(zzaby paramzzaby1, zzaby paramzzaby2)
  {
    AppMethodBeat.i(3510);
    if (paramzzaby1.zzbww != null)
      paramzzaby2.zzbww = ((zzaca)paramzzaby1.zzbww.clone());
    AppMethodBeat.o(3510);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzacc
 * JD-Core Version:    0.6.2
 */