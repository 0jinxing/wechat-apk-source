package com.google.android.gms.internal.measurement;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzabg
{
  static String zza(zzyw paramzzyw)
  {
    AppMethodBeat.i(3410);
    paramzzyw = new zzabh(paramzzyw);
    StringBuilder localStringBuilder = new StringBuilder(paramzzyw.size());
    int i = 0;
    if (i < paramzzyw.size())
    {
      int j = paramzzyw.zzae(i);
      switch (j)
      {
      default:
        if ((j >= 32) && (j <= 126))
          localStringBuilder.append((char)j);
        break;
      case 7:
      case 8:
      case 12:
      case 10:
      case 13:
      case 9:
      case 11:
      case 92:
      case 39:
      case 34:
      }
      while (true)
      {
        i++;
        break;
        localStringBuilder.append("\\a");
        continue;
        localStringBuilder.append("\\b");
        continue;
        localStringBuilder.append("\\f");
        continue;
        localStringBuilder.append("\\n");
        continue;
        localStringBuilder.append("\\r");
        continue;
        localStringBuilder.append("\\t");
        continue;
        localStringBuilder.append("\\v");
        continue;
        localStringBuilder.append("\\\\");
        continue;
        localStringBuilder.append("\\'");
        continue;
        localStringBuilder.append("\\\"");
        continue;
        localStringBuilder.append('\\');
        localStringBuilder.append((char)((j >>> 6 & 0x3) + 48));
        localStringBuilder.append((char)((j >>> 3 & 0x7) + 48));
        localStringBuilder.append((char)((j & 0x7) + 48));
      }
    }
    paramzzyw = localStringBuilder.toString();
    AppMethodBeat.o(3410);
    return paramzzyw;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.measurement.zzabg
 * JD-Core Version:    0.6.2
 */