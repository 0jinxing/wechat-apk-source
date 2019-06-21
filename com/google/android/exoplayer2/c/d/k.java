package com.google.android.exoplayer2.c.d;

import com.google.android.exoplayer2.c.m.a;
import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k
{
  public final m.a aUO;
  public final boolean aZs;
  public final String aZt;
  public final int aZu;
  public final byte[] aZv;

  public k(boolean paramBoolean, String paramString, int paramInt1, byte[] paramArrayOfByte1, int paramInt2, int paramInt3, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(95013);
    int k;
    int m;
    if (paramInt1 == 0)
    {
      k = 1;
      if (paramArrayOfByte2 != null)
        break label98;
      m = 1;
      label30: a.checkArgument(m ^ k);
      this.aZs = paramBoolean;
      this.aZt = paramString;
      this.aZu = paramInt1;
      this.aZv = paramArrayOfByte2;
      if (paramString != null)
        break label104;
      k = j;
    }
    while (true)
    {
      label67: this.aUO = new m.a(k, paramArrayOfByte1, paramInt2, paramInt3);
      AppMethodBeat.o(95013);
      return;
      k = 0;
      break;
      label98: m = 0;
      break label30;
      label104: switch (paramString.hashCode())
      {
      default:
        paramInt1 = -1;
      case 3049879:
      case 3049895:
      case 3046605:
      case 3046671:
      }
      while (true)
      {
        label152: k = j;
        switch (paramInt1)
        {
        case 0:
        case 1:
        default:
          new StringBuilder("Unsupported protection scheme type '").append(paramString).append("'. Assuming AES-CTR crypto mode.");
          k = j;
          break label67;
          if (!paramString.equals("cenc"))
            break label152;
          paramInt1 = i;
          continue;
          if (!paramString.equals("cens"))
            break label152;
          paramInt1 = 1;
          continue;
          if (!paramString.equals("cbc1"))
            break label152;
          paramInt1 = 2;
          continue;
          if (!paramString.equals("cbcs"))
            break label152;
          paramInt1 = 3;
        case 2:
        case 3:
        }
      }
      k = 2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.k
 * JD-Core Version:    0.6.2
 */