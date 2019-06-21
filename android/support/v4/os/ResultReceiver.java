package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public class ResultReceiver
  implements Parcelable
{
  public static final Parcelable.Creator<ResultReceiver> CREATOR = new ResultReceiver.1();
  final boolean JZ = false;
  b Ka;
  final Handler mHandler = null;

  ResultReceiver(Parcel paramParcel)
  {
    this.Ka = b.a.e(paramParcel.readStrongBinder());
  }

  public int describeContents()
  {
    return 0;
  }

  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
  }

  public final void send(int paramInt, Bundle paramBundle)
  {
    if (this.JZ)
      if (this.mHandler != null)
        this.mHandler.post(new b(paramInt, paramBundle));
    while (true)
    {
      return;
      onReceiveResult(paramInt, paramBundle);
      continue;
      if (this.Ka != null)
        try
        {
          this.Ka.send(paramInt, paramBundle);
        }
        catch (RemoteException paramBundle)
        {
        }
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    try
    {
      if (this.Ka == null)
      {
        a locala = new android/support/v4/os/ResultReceiver$a;
        locala.<init>(this);
        this.Ka = locala;
      }
      paramParcel.writeStrongBinder(this.Ka.asBinder());
      return;
    }
    finally
    {
    }
    throw paramParcel;
  }

  final class a extends b.a
  {
    a()
    {
    }

    public final void send(int paramInt, Bundle paramBundle)
    {
      if (ResultReceiver.this.mHandler != null)
        ResultReceiver.this.mHandler.post(new ResultReceiver.b(ResultReceiver.this, paramInt, paramBundle));
      while (true)
      {
        return;
        ResultReceiver.this.onReceiveResult(paramInt, paramBundle);
      }
    }
  }

  final class b
    implements Runnable
  {
    final int Kc;
    final Bundle Kd;

    b(int paramBundle, Bundle arg3)
    {
      this.Kc = paramBundle;
      Object localObject;
      this.Kd = localObject;
    }

    public final void run()
    {
      ResultReceiver.this.onReceiveResult(this.Kc, this.Kd);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v4.os.ResultReceiver
 * JD-Core Version:    0.6.2
 */