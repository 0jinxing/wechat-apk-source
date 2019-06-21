package com.tencent.mm.plugin.normsg;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;

public final class Normsg$a extends Normsg
{
  public static String Ai(int paramInt)
  {
    AppMethodBeat.i(10263);
    String str = Normsg.J2CBridge.access$1200(paramInt);
    AppMethodBeat.o(10263);
    return str;
  }

  public static boolean a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, PInt paramPInt1, PInt paramPInt2, PByteArray paramPByteArray)
  {
    AppMethodBeat.i(10264);
    boolean bool = Normsg.J2CBridge.access$1300(paramInt1, paramArrayOfByte, paramInt2, paramInt3, paramPInt1, paramPInt2, paramPByteArray);
    AppMethodBeat.o(10264);
    return bool;
  }

  public static String bVH()
  {
    AppMethodBeat.i(10262);
    String str = Normsg.J2CBridge.access$1100();
    AppMethodBeat.o(10262);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.Normsg.a
 * JD-Core Version:    0.6.2
 */