package com.google.android.gms.common.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ResourceUtils
{
  private static final Uri zzuw;

  static
  {
    AppMethodBeat.i(89720);
    zzuw = new Uri.Builder().scheme("android.resource").authority("com.google.android.gms").appendPath("drawable").build();
    AppMethodBeat.o(89720);
  }

  public static Uri getDrawableUri(String paramString)
  {
    AppMethodBeat.i(89719);
    Preconditions.checkNotNull(paramString, "Resource name must not be null.");
    paramString = zzuw.buildUpon().appendPath(paramString).build();
    AppMethodBeat.o(89719);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ResourceUtils
 * JD-Core Version:    0.6.2
 */