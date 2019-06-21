package com.tencent.mm.chatroom.f;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public static int bP(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(104481);
    switch (paramInt1)
    {
    default:
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("Invalid Month");
      AppMethodBeat.o(104481);
      throw localIllegalArgumentException;
    case 0:
    case 2:
    case 4:
    case 6:
    case 7:
    case 9:
    case 11:
      paramInt1 = 31;
      AppMethodBeat.o(104481);
    case 3:
    case 5:
    case 8:
    case 10:
    case 1:
    }
    while (true)
    {
      return paramInt1;
      paramInt1 = 30;
      AppMethodBeat.o(104481);
      continue;
      if (((paramInt2 % 4 == 0) && (paramInt2 % 100 != 0)) || (paramInt2 % 400 == 0))
      {
        paramInt1 = 29;
        AppMethodBeat.o(104481);
      }
      else
      {
        paramInt1 = 28;
        AppMethodBeat.o(104481);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.f.a
 * JD-Core Version:    0.6.2
 */