package com.google.android.gms.common.images.internal;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ColorFilters
{
  public static final ColorFilter COLOR_FILTER_BW;
  private static final ColorMatrix zzpv;

  static
  {
    AppMethodBeat.i(61258);
    ColorMatrix localColorMatrix = new ColorMatrix();
    zzpv = localColorMatrix;
    localColorMatrix.setSaturation(0.0F);
    COLOR_FILTER_BW = new ColorMatrixColorFilter(zzpv);
    AppMethodBeat.o(61258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.internal.ColorFilters
 * JD-Core Version:    0.6.2
 */