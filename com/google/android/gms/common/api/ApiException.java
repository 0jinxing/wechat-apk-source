package com.google.android.gms.common.api;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class ApiException extends Exception
{
  protected final Status mStatus;

  public ApiException(Status paramStatus)
  {
  }

  public int getStatusCode()
  {
    AppMethodBeat.i(89442);
    int i = this.mStatus.getStatusCode();
    AppMethodBeat.o(89442);
    return i;
  }

  @Deprecated
  public String getStatusMessage()
  {
    AppMethodBeat.i(89443);
    String str = this.mStatus.getStatusMessage();
    AppMethodBeat.o(89443);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.ApiException
 * JD-Core Version:    0.6.2
 */