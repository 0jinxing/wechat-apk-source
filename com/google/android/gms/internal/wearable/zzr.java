package com.google.android.gms.internal.wearable;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class zzr
{
  private static final Charset ISO_8859_1;
  protected static final Charset UTF_8;
  public static final Object zzhk;

  static
  {
    AppMethodBeat.i(70775);
    UTF_8 = Charset.forName("UTF-8");
    ISO_8859_1 = Charset.forName("ISO-8859-1");
    zzhk = new Object();
    AppMethodBeat.o(70775);
  }

  public static boolean equals(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    AppMethodBeat.i(70769);
    boolean bool;
    if ((paramArrayOfFloat1 == null) || (paramArrayOfFloat1.length == 0))
      if ((paramArrayOfFloat2 == null) || (paramArrayOfFloat2.length == 0))
      {
        bool = true;
        AppMethodBeat.o(70769);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(70769);
      continue;
      bool = Arrays.equals(paramArrayOfFloat1, paramArrayOfFloat2);
      AppMethodBeat.o(70769);
    }
  }

  public static boolean equals(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    AppMethodBeat.i(70768);
    boolean bool;
    if ((paramArrayOfLong1 == null) || (paramArrayOfLong1.length == 0))
      if ((paramArrayOfLong2 == null) || (paramArrayOfLong2.length == 0))
      {
        bool = true;
        AppMethodBeat.o(70768);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(70768);
      continue;
      bool = Arrays.equals(paramArrayOfLong1, paramArrayOfLong2);
      AppMethodBeat.o(70768);
    }
  }

  public static boolean equals(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    boolean bool = false;
    AppMethodBeat.i(70770);
    int i;
    if (paramArrayOfObject1 == null)
    {
      i = 0;
      if (paramArrayOfObject2 != null)
        break label51;
    }
    int k;
    int m;
    label51: for (int j = 0; ; j = paramArrayOfObject2.length)
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
            break label122;
          i1 = 1;
          label97: if ((n == 0) || (i1 == 0))
            break label128;
          AppMethodBeat.o(70770);
          bool = true;
        }
        while (true)
        {
          return bool;
          n = 0;
          break;
          label122: i1 = 0;
          break label97;
          label128: if (n != i1)
          {
            AppMethodBeat.o(70770);
          }
          else
          {
            if (paramArrayOfObject1[m].equals(paramArrayOfObject2[k]))
              break label165;
            AppMethodBeat.o(70770);
          }
        }
        label165: k++;
        m++;
        break;
      }
  }

  public static int hashCode(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(70772);
    int i;
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0))
    {
      i = 0;
      AppMethodBeat.o(70772);
    }
    while (true)
    {
      return i;
      i = Arrays.hashCode(paramArrayOfFloat);
      AppMethodBeat.o(70772);
    }
  }

  public static int hashCode(long[] paramArrayOfLong)
  {
    AppMethodBeat.i(70771);
    int i;
    if ((paramArrayOfLong == null) || (paramArrayOfLong.length == 0))
    {
      i = 0;
      AppMethodBeat.o(70771);
    }
    while (true)
    {
      return i;
      i = Arrays.hashCode(paramArrayOfLong);
      AppMethodBeat.o(70771);
    }
  }

  public static int hashCode(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(70773);
    int i;
    int j;
    int k;
    if (paramArrayOfObject == null)
    {
      i = 0;
      j = 0;
      k = 0;
      label15: if (j >= i)
        break label53;
      Object localObject = paramArrayOfObject[j];
      if (localObject == null)
        break label60;
      k = localObject.hashCode() + k * 31;
    }
    label53: label60: 
    while (true)
    {
      j++;
      break label15;
      i = paramArrayOfObject.length;
      break;
      AppMethodBeat.o(70773);
      return k;
    }
  }

  public static void zza(zzn paramzzn1, zzn paramzzn2)
  {
    AppMethodBeat.i(70774);
    if (paramzzn1.zzhc != null)
      paramzzn2.zzhc = ((zzp)paramzzn1.zzhc.clone());
    AppMethodBeat.o(70774);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.wearable.zzr
 * JD-Core Version:    0.6.2
 */