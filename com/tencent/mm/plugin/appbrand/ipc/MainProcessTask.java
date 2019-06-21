package com.tencent.mm.plugin.appbrand.ipc;

import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Set;

public abstract class MainProcessTask
  implements Parcelable
{
  private static final Set<Object> hvE = new HashSet();
  Messenger hvF;
  protected String hvr = Process.myPid() + hashCode();

  public final void aBV()
  {
    hvE.add(this);
  }

  public final void aBW()
  {
    hvE.remove(this);
  }

  public final boolean aCb()
  {
    boolean bool = false;
    if (this.hvF == null);
    while (true)
    {
      return bool;
      Message localMessage = Message.obtain();
      localMessage.setData(AppBrandMainProcessService.a(this, false));
      try
      {
        this.hvF.send(localMessage);
        bool = true;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MainProcessTask", localException.getMessage());
      }
    }
  }

  public abstract void asP();

  public void asQ()
  {
  }

  public int describeContents()
  {
    return 0;
  }

  public void g(Parcel paramParcel)
  {
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
 * JD-Core Version:    0.6.2
 */