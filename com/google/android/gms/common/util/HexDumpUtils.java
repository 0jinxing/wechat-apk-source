package com.google.android.gms.common.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.util.StringTokenizer;

public final class HexDumpUtils
{
  public static byte[] bytesFromString(String paramString)
  {
    AppMethodBeat.i(90210);
    paramString = new StringTokenizer(paramString, " \t\n");
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    while (true)
      if (paramString.hasMoreTokens())
        try
        {
          localByteArrayOutputStream.write(Integer.parseInt(paramString.nextToken(), 16) & 0xFF);
        }
        catch (NumberFormatException paramString)
        {
          paramString = null;
          AppMethodBeat.o(90210);
        }
    while (true)
    {
      return paramString;
      paramString = localByteArrayOutputStream.toByteArray();
      AppMethodBeat.o(90210);
    }
  }

  public static String dump(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(90209);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0) || (paramInt1 < 0) || (paramInt2 <= 0) || (paramInt1 + paramInt2 > paramArrayOfByte.length))
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(90209);
      return paramArrayOfByte;
    }
    int i = 57;
    if (paramBoolean)
      i = 75;
    StringBuilder localStringBuilder = new StringBuilder(i * ((paramInt2 + 16 - 1) / 16));
    int j = 0;
    int k = 0;
    int m = paramInt2;
    label81: if (m > 0)
    {
      if (j == 0)
        if (paramInt2 < 65536)
        {
          localStringBuilder.append(String.format("%04X:", new Object[] { Integer.valueOf(paramInt1) }));
          i = paramInt1;
        }
      int n;
      while (true)
      {
        localStringBuilder.append(String.format(" %02X", new Object[] { Integer.valueOf(paramArrayOfByte[paramInt1] & 0xFF) }));
        m--;
        k = j + 1;
        if ((!paramBoolean) || ((k != 16) && (m != 0)))
          break label351;
        n = 16 - k;
        if (n <= 0)
          break;
        for (j = 0; j < n; j++)
          localStringBuilder.append("   ");
        localStringBuilder.append(String.format("%08X:", new Object[] { Integer.valueOf(paramInt1) }));
        i = paramInt1;
        continue;
        i = k;
        if (j == 8)
        {
          localStringBuilder.append(" -");
          i = k;
        }
      }
      if (n >= 8)
        localStringBuilder.append("  ");
      localStringBuilder.append("  ");
      j = 0;
      if (j < k)
      {
        n = (char)paramArrayOfByte[(i + j)];
        if ((n >= 32) && (n <= 126));
        for (int i1 = n; ; i1 = n)
        {
          localStringBuilder.append(i1);
          j++;
          break;
          n = 46;
        }
      }
      label351: if ((k != 16) && (m != 0))
        break label398;
      localStringBuilder.append('\n');
    }
    label398: for (j = 0; ; j = k)
    {
      paramInt1++;
      k = i;
      break label81;
      paramArrayOfByte = localStringBuilder.toString();
      AppMethodBeat.o(90209);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.HexDumpUtils
 * JD-Core Version:    0.6.2
 */