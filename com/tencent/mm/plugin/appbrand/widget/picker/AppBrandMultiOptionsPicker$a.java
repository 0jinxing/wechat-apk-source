package com.tencent.mm.plugin.appbrand.widget.picker;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AppBrandMultiOptionsPicker$a
{
  public final String[] jkK;
  public final int jkL;

  public AppBrandMultiOptionsPicker$a(String[] paramArrayOfString, int paramInt)
  {
    AppMethodBeat.i(126703);
    this.jkK = paramArrayOfString;
    this.jkL = Math.max(0, Math.min(paramInt, paramArrayOfString.length - 1));
    AppMethodBeat.o(126703);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker.a
 * JD-Core Version:    0.6.2
 */