package com.tencent.mm.plugin.wepkg.ipc;

import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Set;

public abstract class WepkgMainProcessTask
  implements Parcelable
{
  private static final Set<Object> hvo = new HashSet();
  Messenger hvF;
  int mTaskId;

  public final void aBV()
  {
    hvo.add(this);
  }

  public final void aBW()
  {
    hvo.remove(this);
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

  public final void wM()
  {
    if (this.hvF == null);
    while (true)
    {
      return;
      Message localMessage = Message.obtain();
      localMessage.what = this.mTaskId;
      localMessage.setData(WepkgMainProcessService.c(this));
      try
      {
        this.hvF.send(localMessage);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.Wepkg.WepkgMainProcessTask", localException.getMessage());
      }
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessTask
 * JD-Core Version:    0.6.2
 */