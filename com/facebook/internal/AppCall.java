package com.facebook.internal;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.UUID;

public class AppCall
{
  private static AppCall currentPendingCall;
  private UUID callId;
  private int requestCode;
  private Intent requestIntent;

  public AppCall(int paramInt)
  {
    this(paramInt, UUID.randomUUID());
    AppMethodBeat.i(96611);
    AppMethodBeat.o(96611);
  }

  public AppCall(int paramInt, UUID paramUUID)
  {
    this.callId = paramUUID;
    this.requestCode = paramInt;
  }

  public static AppCall finishPendingCall(UUID paramUUID, int paramInt)
  {
    try
    {
      AppMethodBeat.i(96609);
      AppCall localAppCall = getCurrentPendingCall();
      if ((localAppCall == null) || (!localAppCall.getCallId().equals(paramUUID)) || (localAppCall.getRequestCode() != paramInt))
        AppMethodBeat.o(96609);
      for (paramUUID = null; ; paramUUID = localAppCall)
      {
        return paramUUID;
        setCurrentPendingCall(null);
        AppMethodBeat.o(96609);
      }
    }
    finally
    {
    }
    throw paramUUID;
  }

  public static AppCall getCurrentPendingCall()
  {
    return currentPendingCall;
  }

  private static boolean setCurrentPendingCall(AppCall paramAppCall)
  {
    try
    {
      AppMethodBeat.i(96610);
      AppCall localAppCall = getCurrentPendingCall();
      currentPendingCall = paramAppCall;
      boolean bool;
      if (localAppCall != null)
      {
        bool = true;
        AppMethodBeat.o(96610);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(96610);
      }
    }
    finally
    {
    }
    throw paramAppCall;
  }

  public UUID getCallId()
  {
    return this.callId;
  }

  public int getRequestCode()
  {
    return this.requestCode;
  }

  public Intent getRequestIntent()
  {
    return this.requestIntent;
  }

  public boolean setPending()
  {
    AppMethodBeat.i(96612);
    boolean bool = setCurrentPendingCall(this);
    AppMethodBeat.o(96612);
    return bool;
  }

  public void setRequestCode(int paramInt)
  {
    this.requestCode = paramInt;
  }

  public void setRequestIntent(Intent paramIntent)
  {
    this.requestIntent = paramIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.facebook.internal.AppCall
 * JD-Core Version:    0.6.2
 */