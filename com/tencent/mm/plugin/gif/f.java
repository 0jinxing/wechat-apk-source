package com.tencent.mm.plugin.gif;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class f
{
  public final int[] noD;

  public f(String paramString)
  {
    AppMethodBeat.i(62420);
    this.noD = new int[6];
    try
    {
      MMGIFJNI.recycle(MMGIFJNI.openByFilePath(paramString, this.noD));
      ab.i("MMGIFInfo", "width:%d height:%d", new Object[] { Integer.valueOf(this.noD[0]), Integer.valueOf(this.noD[1]) });
      AppMethodBeat.o(62420);
      return;
    }
    catch (MMGIFException paramString)
    {
      while (true)
      {
        ab.e("MMGIFInfo", bo.l(paramString));
        AppMethodBeat.o(62420);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.f
 * JD-Core Version:    0.6.2
 */