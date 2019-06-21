package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class UnsupportedApiCallException extends UnsupportedOperationException
{
  private final Feature zzdr;

  public UnsupportedApiCallException(Feature paramFeature)
  {
    this.zzdr = paramFeature;
  }

  public final String getMessage()
  {
    AppMethodBeat.i(89459);
    String str = String.valueOf(this.zzdr);
    str = String.valueOf(str).length() + 8 + "Missing " + str;
    AppMethodBeat.o(89459);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.UnsupportedApiCallException
 * JD-Core Version:    0.6.2
 */