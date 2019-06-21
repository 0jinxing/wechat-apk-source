package com.tencent.mm.plugin.d.a.b.a;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.b.h;
import com.tencent.mm.sdk.platformtools.ab;

@TargetApi(18)
public class f extends a
{
  static final String TAG;
  public static String jIf;
  public static String jIg;
  public int jIh = -1;
  public int jIi = -1;
  public int jIj = -1;
  public long jIk = 0L;
  public long jIl = 0L;

  static
  {
    AppMethodBeat.i(18473);
    TAG = f.class.getName();
    jIf = h.jGK;
    jIg = h.jGL;
    AppMethodBeat.o(18473);
  }

  public f()
  {
    this.jHc = null;
    this.jHd = 8;
    this.jGw = 1L;
  }

  public final byte[] aVE()
  {
    AppMethodBeat.i(18472);
    byte[] arrayOfByte;
    if (this.jIh < 0)
    {
      ab.e(TAG, "stepCount is invalid");
      arrayOfByte = null;
      AppMethodBeat.o(18472);
      return arrayOfByte;
    }
    if (this.jIi >= 0);
    for (int i = 7; ; i = 4)
    {
      int j = i;
      if (this.jIj >= 0)
        j = i + 3;
      arrayOfByte = new byte[j];
      arrayOfByte[0] = ((byte)1);
      j = 0;
      i = 1;
      while (j < 3)
      {
        arrayOfByte[i] = ((byte)(byte)(this.jIh >> j * 8 & 0xFF));
        i++;
        j++;
      }
      j = i;
      int k;
      if (this.jIi >= 0)
      {
        arrayOfByte[0] = ((byte)(byte)(arrayOfByte[0] | 0x2));
        for (k = 0; ; k++)
        {
          j = i;
          if (k >= 3)
            break;
          arrayOfByte[i] = ((byte)(byte)(this.jIi >> k * 8 & 0xFF));
          i++;
        }
      }
      if (this.jIj >= 0)
      {
        arrayOfByte[0] = ((byte)4);
        k = 0;
        i = j;
        j = k;
        while (j < 3)
        {
          arrayOfByte[i] = ((byte)(byte)(this.jIj >> j * 8 & 0xFF));
          j++;
          i++;
        }
      }
      AppMethodBeat.o(18472);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.a.f
 * JD-Core Version:    0.6.2
 */