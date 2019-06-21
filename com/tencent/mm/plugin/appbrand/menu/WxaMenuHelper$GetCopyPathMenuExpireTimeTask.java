package com.tencent.mm.plugin.appbrand.menu;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i.f;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

public class WxaMenuHelper$GetCopyPathMenuExpireTimeTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetCopyPathMenuExpireTimeTask> CREATOR;
  private long inh;
  private String mAppId;

  static
  {
    AppMethodBeat.i(132259);
    CREATOR = new WxaMenuHelper.GetCopyPathMenuExpireTimeTask.1();
    AppMethodBeat.o(132259);
  }

  public WxaMenuHelper$GetCopyPathMenuExpireTimeTask(Parcel paramParcel)
  {
    AppMethodBeat.i(132255);
    this.inh = 0L;
    g(paramParcel);
    AppMethodBeat.o(132255);
  }

  public WxaMenuHelper$GetCopyPathMenuExpireTimeTask(String paramString)
  {
    this.inh = 0L;
    this.mAppId = paramString;
  }

  public final void asP()
  {
    AppMethodBeat.i(132256);
    Object localObject = f.inF;
    localObject = f.cF(this.mAppId, "copypath");
    if (localObject == null)
    {
      this.inh = 0L;
      AppMethodBeat.o(132256);
    }
    while (true)
    {
      return;
      this.inh = ((Long)localObject).longValue();
      AppMethodBeat.o(132256);
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(132257);
    this.inh = paramParcel.readLong();
    this.mAppId = paramParcel.readString();
    AppMethodBeat.o(132257);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(132258);
    paramParcel.writeLong(this.inh);
    paramParcel.writeString(this.mAppId);
    AppMethodBeat.o(132258);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.WxaMenuHelper.GetCopyPathMenuExpireTimeTask
 * JD-Core Version:    0.6.2
 */