package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.firebase_messaging.zze;
import com.google.android.gms.internal.firebase_messaging.zzf;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class zzi
  implements Parcelable
{
  public static final Parcelable.Creator<zzi> CREATOR;
  private Messenger bwC;
  private zze bwD;

  static
  {
    AppMethodBeat.i(108791);
    CREATOR = new z();
    AppMethodBeat.o(108791);
  }

  public zzi(IBinder paramIBinder)
  {
    AppMethodBeat.i(108785);
    if (Build.VERSION.SDK_INT >= 21)
    {
      this.bwC = new Messenger(paramIBinder);
      AppMethodBeat.o(108785);
    }
    while (true)
    {
      return;
      this.bwD = zzf.zza(paramIBinder);
      AppMethodBeat.o(108785);
    }
  }

  private final IBinder getBinder()
  {
    AppMethodBeat.i(108787);
    IBinder localIBinder;
    if (this.bwC != null)
    {
      localIBinder = this.bwC.getBinder();
      AppMethodBeat.o(108787);
    }
    while (true)
    {
      return localIBinder;
      localIBinder = this.bwD.asBinder();
      AppMethodBeat.o(108787);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    AppMethodBeat.i(108788);
    if (paramObject == null)
      AppMethodBeat.o(108788);
    while (true)
    {
      return bool1;
      try
      {
        boolean bool2 = getBinder().equals(((zzi)paramObject).getBinder());
        bool1 = bool2;
        AppMethodBeat.o(108788);
      }
      catch (ClassCastException paramObject)
      {
        AppMethodBeat.o(108788);
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(108789);
    int i = getBinder().hashCode();
    AppMethodBeat.o(108789);
    return i;
  }

  public final void send(Message paramMessage)
  {
    AppMethodBeat.i(108786);
    if (this.bwC != null)
    {
      this.bwC.send(paramMessage);
      AppMethodBeat.o(108786);
    }
    while (true)
    {
      return;
      this.bwD.send(paramMessage);
      AppMethodBeat.o(108786);
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(108790);
    if (this.bwC != null)
    {
      paramParcel.writeStrongBinder(this.bwC.getBinder());
      AppMethodBeat.o(108790);
    }
    while (true)
    {
      return;
      paramParcel.writeStrongBinder(this.bwD.asBinder());
      AppMethodBeat.o(108790);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.zzi
 * JD-Core Version:    0.6.2
 */