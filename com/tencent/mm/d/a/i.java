package com.tencent.mm.d.a;

import com.eclipsesource.v8.MultiContextNodeJS;
import com.eclipsesource.v8.MultiContextV8;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends a
{
  private MultiContextNodeJS chC;
  public volatile l chD;

  static
  {
    AppMethodBeat.i(113821);
    MultiContextNodeJS.setGetTmpFileDirectoryDelegate(new i.1());
    AppMethodBeat.o(113821);
  }

  private i()
  {
  }

  private i(String paramString, byte[] paramArrayOfByte)
  {
    super(paramString, paramArrayOfByte);
  }

  static i j(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(113817);
    paramString = new i(paramString, paramArrayOfByte);
    AppMethodBeat.o(113817);
    return paramString;
  }

  final MultiContextV8 Co()
  {
    AppMethodBeat.i(113818);
    this.chC = MultiContextNodeJS.createMultiContextNodeJS(1, this.chs, this.cht);
    this.cht = null;
    MultiContextV8 localMultiContextV8 = this.chC.getRuntime();
    AppMethodBeat.o(113818);
    return localMultiContextV8;
  }

  final d Cp()
  {
    AppMethodBeat.i(113819);
    j localj = j.a(new i.2(this));
    AppMethodBeat.o(113819);
    return localj;
  }

  final void Cq()
  {
    AppMethodBeat.i(113820);
    ab.i("MicroMsg.NodeJSRuntime", "cleanUpRuntimeWhenThreadEnd");
    try
    {
      this.chC.release();
      ab.i("MicroMsg.NodeJSRuntime", "cleanUpRuntimeWhenThreadEnd done");
      AppMethodBeat.o(113820);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.NodeJSRuntime", "cleanUpWhenThreadEnd exp = %s", new Object[] { localException });
        AppMethodBeat.o(113820);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.i
 * JD-Core Version:    0.6.2
 */