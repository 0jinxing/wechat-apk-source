package com.tencent.mm.plugin.wepkg.model;

import android.os.Parcel;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessTask;

public abstract class BaseWepkgProcessTask extends WepkgMainProcessTask
{
  public boolean csN = false;

  public abstract void a(Parcel paramParcel, int paramInt);

  public final void g(Parcel paramParcel)
  {
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.csN = bool;
      m(paramParcel);
      return;
    }
  }

  public abstract void m(Parcel paramParcel);

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (this.csN);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeByte((byte)i);
      a(paramParcel, paramInt);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask
 * JD-Core Version:    0.6.2
 */