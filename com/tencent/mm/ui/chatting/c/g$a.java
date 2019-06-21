package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class g$a
{
  public Class<? extends v> aIl;
  public Class<? extends v> yOK;

  public g$a(Class<? extends v> paramClass1, Class<? extends v> paramClass2)
  {
    this.aIl = paramClass1;
    this.yOK = paramClass2;
  }

  public final v dDK()
  {
    AppMethodBeat.i(31287);
    try
    {
      v localv = (v)this.yOK.newInstance();
      AppMethodBeat.o(31287);
      return localv;
    }
    catch (InstantiationException localInstantiationException)
    {
      while (true)
      {
        ab.printErrStackTrace("ChattingComponentFactory", localInstantiationException, "", new Object[0]);
        Object localObject = null;
        AppMethodBeat.o(31287);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
        ab.printErrStackTrace("ChattingComponentFactory", localIllegalAccessException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.g.a
 * JD-Core Version:    0.6.2
 */