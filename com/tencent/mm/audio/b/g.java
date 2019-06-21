package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class g
{
  public static final String cqq;
  public static final String cqr;

  static
  {
    AppMethodBeat.i(55760);
    cqq = com.tencent.mm.compatible.util.e.eSn + "test.wav";
    cqr = com.tencent.mm.compatible.util.e.eSn + "test.pcm";
    AppMethodBeat.o(55760);
  }

  public static int x(String paramString, int paramInt)
  {
    AppMethodBeat.i(55759);
    try
    {
      int i = bo.getInt(((a)com.tencent.mm.kernel.g.K(a.class)).Nu().getValue(paramString), paramInt);
      paramInt = i;
      AppMethodBeat.o(55759);
      return paramInt;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.RecorderUtil", "getIntValFromDynamicConfig parseInt failed, key: ".concat(String.valueOf(paramString)));
    }
    catch (Error localError)
    {
      while (true)
        ab.e("MicroMsg.RecorderUtil", "error on parseInt failed, key: ".concat(String.valueOf(paramString)));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.g
 * JD-Core Version:    0.6.2
 */