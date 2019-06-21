package com.google.android.exoplayer2.c.d;

import android.util.Pair;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.UUID;

public final class h
{
  public static UUID n(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(95006);
    paramArrayOfByte = o(paramArrayOfByte);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(95006);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = (UUID)paramArrayOfByte.first;
      AppMethodBeat.o(95006);
    }
  }

  private static Pair<UUID, byte[]> o(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = null;
    AppMethodBeat.i(95007);
    l locall = new l(paramArrayOfByte);
    if (locall.limit < 32)
    {
      AppMethodBeat.o(95007);
      paramArrayOfByte = arrayOfByte;
    }
    while (true)
    {
      return paramArrayOfByte;
      locall.setPosition(0);
      if (locall.readInt() != locall.tB() + 4)
      {
        AppMethodBeat.o(95007);
        paramArrayOfByte = arrayOfByte;
      }
      else if (locall.readInt() != a.aWB)
      {
        AppMethodBeat.o(95007);
        paramArrayOfByte = arrayOfByte;
      }
      else
      {
        int i = a.dT(locall.readInt());
        if (i > 1)
        {
          AppMethodBeat.o(95007);
          paramArrayOfByte = arrayOfByte;
        }
        else
        {
          paramArrayOfByte = new UUID(locall.readLong(), locall.readLong());
          if (i == 1)
            locall.eM(locall.tI() * 16);
          i = locall.tI();
          if (i != locall.tB())
          {
            AppMethodBeat.o(95007);
            paramArrayOfByte = arrayOfByte;
          }
          else
          {
            arrayOfByte = new byte[i];
            locall.readBytes(arrayOfByte, 0, i);
            paramArrayOfByte = Pair.create(paramArrayOfByte, arrayOfByte);
            AppMethodBeat.o(95007);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.h
 * JD-Core Version:    0.6.2
 */