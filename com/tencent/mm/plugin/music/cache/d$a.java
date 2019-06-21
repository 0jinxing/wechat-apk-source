package com.tencent.mm.plugin.music.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.BitSet;

public final class d$a
{
  public static byte[] a(BitSet paramBitSet)
  {
    AppMethodBeat.i(137402);
    byte[] arrayOfByte = new byte[paramBitSet.size() / 8];
    int i = 0;
    if (i < paramBitSet.size())
    {
      int j = i / 8;
      int k = arrayOfByte[j];
      if (paramBitSet.get(i));
      for (int m = 1; ; m = 0)
      {
        arrayOfByte[j] = ((byte)(byte)(m << 7 - i % 8 | k));
        i++;
        break;
      }
    }
    AppMethodBeat.o(137402);
    return arrayOfByte;
  }

  public static BitSet bb(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(137403);
    BitSet localBitSet = new BitSet(paramArrayOfByte.length * 8);
    int i = 0;
    int j = 0;
    while (i < paramArrayOfByte.length)
    {
      int k = 7;
      if (k >= 0)
      {
        if ((paramArrayOfByte[i] & 1 << k) >> k == 1);
        for (boolean bool = true; ; bool = false)
        {
          localBitSet.set(j, bool);
          k--;
          j++;
          break;
        }
      }
      i++;
    }
    AppMethodBeat.o(137403);
    return localBitSet;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.cache.d.a
 * JD-Core Version:    0.6.2
 */