package com.tencent.mm.plugin.appbrand.widget.picker;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandMultiOptionsPicker$1
  implements YANumberPicker.b
{
  AppBrandMultiOptionsPicker$1(AppBrandMultiOptionsPicker paramAppBrandMultiOptionsPicker)
  {
  }

  public final void a(YANumberPicker paramYANumberPicker, int paramInt)
  {
    AppMethodBeat.i(126702);
    if (AppBrandMultiOptionsPicker.a(this.jkJ) != null)
    {
      int i = ((Integer)paramYANumberPicker.getTag(2131820565)).intValue();
      paramYANumberPicker = AppBrandMultiOptionsPicker.a(this.jkJ);
      if (paramYANumberPicker.jkV != null)
        paramYANumberPicker.jkV.bw(new int[] { i, paramInt });
    }
    AppMethodBeat.o(126702);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.AppBrandMultiOptionsPicker.1
 * JD-Core Version:    0.6.2
 */