package com.tencent.luggage.sdk.launching;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class OnWXAppResultXPCWrapper<R extends Parcelable>
  implements Parcelable
{
  public static final Parcelable.Creator<OnWXAppResultXPCWrapper> CREATOR;
  private final ResultReceiver JF;
  private final b<R> bRf;

  static
  {
    AppMethodBeat.i(101681);
    CREATOR = new OnWXAppResultXPCWrapper.3();
    AppMethodBeat.o(101681);
  }

  private OnWXAppResultXPCWrapper(Parcel paramParcel)
  {
    AppMethodBeat.i(101680);
    this.JF = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
    this.bRf = new OnWXAppResultXPCWrapper.2(this);
    AppMethodBeat.o(101680);
  }

  private OnWXAppResultXPCWrapper(b<R> paramb)
  {
    AppMethodBeat.i(101678);
    this.bRf = paramb;
    this.JF = new OnWXAppResultXPCWrapper.1(this, new Handler(Looper.getMainLooper()), paramb);
    AppMethodBeat.o(101678);
  }

  public static <R extends Parcelable> void a(b<R> paramb, Parcel paramParcel)
  {
    AppMethodBeat.i(101676);
    if (paramb == null)
    {
      paramParcel.writeString(null);
      AppMethodBeat.o(101676);
    }
    while (true)
    {
      return;
      paramParcel.writeParcelable(new OnWXAppResultXPCWrapper(paramb), 0);
      AppMethodBeat.o(101676);
    }
  }

  public static b<?> b(Parcel paramParcel)
  {
    AppMethodBeat.i(101677);
    paramParcel = (OnWXAppResultXPCWrapper)paramParcel.readParcelable(OnWXAppResultXPCWrapper.class.getClassLoader());
    if (paramParcel != null);
    for (paramParcel = paramParcel.bRf; ; paramParcel = null)
    {
      AppMethodBeat.o(101677);
      return paramParcel;
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(101679);
    this.JF.writeToParcel(paramParcel, paramInt);
    AppMethodBeat.o(101679);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper
 * JD-Core Version:    0.6.2
 */