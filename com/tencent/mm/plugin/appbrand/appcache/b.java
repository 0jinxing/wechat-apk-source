package com.tencent.mm.plugin.appbrand.appcache;

import android.content.res.Resources;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.sdk.platformtools.ah;

public final class b
{
  private static final SparseIntArray gSe;

  static
  {
    AppMethodBeat.i(129321);
    SparseIntArray localSparseIntArray = new SparseIntArray(3);
    gSe = localSparseIntArray;
    localSparseIntArray.put(0, 2131296899);
    gSe.put(1, 2131296554);
    gSe.put(2, 2131296553);
    AppMethodBeat.o(129321);
  }

  public static String no(int paramInt)
  {
    AppMethodBeat.i(129319);
    paramInt = gSe.get(paramInt, 2131296899);
    String str = ah.getResources().getString(paramInt);
    AppMethodBeat.o(129319);
    return str;
  }

  public static String xm(String paramString)
  {
    AppMethodBeat.i(129320);
    paramString = LaunchParcel.Cm(paramString);
    AppMethodBeat.o(129320);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b
 * JD-Core Version:    0.6.2
 */