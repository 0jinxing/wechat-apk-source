package com.tencent.mm.d.a;

import com.eclipsesource.v8.MultiContextV8;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class v extends a
{
  private MultiContextV8 chm;

  v(String paramString, byte[] paramArrayOfByte)
  {
    super(paramString, paramArrayOfByte);
  }

  static v CD()
  {
    AppMethodBeat.i(113900);
    v localv = new v(null, null);
    AppMethodBeat.o(113900);
    return localv;
  }

  static v k(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(113901);
    paramString = new v(paramString, paramArrayOfByte);
    AppMethodBeat.o(113901);
    return paramString;
  }

  final MultiContextV8 Co()
  {
    AppMethodBeat.i(113902);
    this.chm = MultiContextV8.createMultiContextV8(this.chs, this.cht);
    this.cht = null;
    MultiContextV8 localMultiContextV8 = this.chm;
    AppMethodBeat.o(113902);
    return localMultiContextV8;
  }

  d Cp()
  {
    AppMethodBeat.i(113903);
    w localw = w.CE();
    AppMethodBeat.o(113903);
    return localw;
  }

  final void Cq()
  {
    AppMethodBeat.i(113904);
    try
    {
      this.chm.release();
      AppMethodBeat.o(113904);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.V8JSRuntime", "commonCleanUp exp = %s", new Object[] { localException });
        AppMethodBeat.o(113904);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.v
 * JD-Core Version:    0.6.2
 */