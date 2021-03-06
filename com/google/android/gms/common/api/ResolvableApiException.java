package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ResolvableApiException extends ApiException
{
  public ResolvableApiException(Status paramStatus)
  {
    super(paramStatus);
  }

  public PendingIntent getResolution()
  {
    AppMethodBeat.i(89446);
    PendingIntent localPendingIntent = this.mStatus.getResolution();
    AppMethodBeat.o(89446);
    return localPendingIntent;
  }

  public void startResolutionForResult(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(89445);
    this.mStatus.startResolutionForResult(paramActivity, paramInt);
    AppMethodBeat.o(89445);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.ResolvableApiException
 * JD-Core Version:    0.6.2
 */