package com.tencent.luggage.sdk.launching;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ActivityStarterIpcDelegate
  implements Parcelable
{
  public static final Parcelable.Creator<ActivityStarterIpcDelegate> CREATOR;
  public final ResultReceiver bRc;

  static
  {
    AppMethodBeat.i(101668);
    CREATOR = new ActivityStarterIpcDelegate.2();
    AppMethodBeat.o(101668);
  }

  public ActivityStarterIpcDelegate(Activity paramActivity)
  {
    AppMethodBeat.i(101665);
    this.bRc = new ActivityStarterIpcDelegate.1(this, new Handler(Looper.getMainLooper()), paramActivity);
    AppMethodBeat.o(101665);
  }

  private ActivityStarterIpcDelegate(Parcel paramParcel)
  {
    AppMethodBeat.i(101667);
    this.bRc = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
    AppMethodBeat.o(101667);
  }

  public static ActivityStarterIpcDelegate aw(Context paramContext)
  {
    AppMethodBeat.i(101664);
    if ((paramContext instanceof Activity))
    {
      paramContext = new ActivityStarterIpcDelegate((Activity)paramContext);
      AppMethodBeat.o(101664);
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(101664);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(101666);
    this.bRc.writeToParcel(paramParcel, paramInt);
    AppMethodBeat.o(101666);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate
 * JD-Core Version:    0.6.2
 */