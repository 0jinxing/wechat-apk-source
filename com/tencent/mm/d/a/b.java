package com.tencent.mm.d.a;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b extends v
{
  private b(String paramString, byte[] paramArrayOfByte)
  {
    super(paramString, paramArrayOfByte);
  }

  static v f(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(113797);
    paramString = new b(paramString, paramArrayOfByte);
    AppMethodBeat.o(113797);
    return paramString;
  }

  final d Cp()
  {
    AppMethodBeat.i(113798);
    Looper.prepare();
    h localh = new h(Looper.myLooper());
    AppMethodBeat.o(113798);
    return localh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.b
 * JD-Core Version:    0.6.2
 */