package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;

public class GetStorageSizeTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetStorageSizeTask> CREATOR;
  public String appId;
  public Runnable hww;
  public int size;

  static
  {
    AppMethodBeat.i(102021);
    CREATOR = new GetStorageSizeTask.1();
    AppMethodBeat.o(102021);
  }

  public GetStorageSizeTask()
  {
  }

  protected GetStorageSizeTask(Parcel paramParcel)
  {
    AppMethodBeat.i(102020);
    g(paramParcel);
    AppMethodBeat.o(102020);
  }

  public final void asP()
  {
    AppMethodBeat.i(102016);
    com.tencent.mm.plugin.appbrand.appstorage.b localb;
    if (e.B(com.tencent.luggage.sdk.customize.b.class) == null)
    {
      localb = null;
      if (localb != null)
        break label47;
      aCb();
      AppMethodBeat.o(102016);
    }
    while (true)
    {
      return;
      localb = ((com.tencent.luggage.sdk.customize.b)e.B(com.tencent.luggage.sdk.customize.b.class)).xG();
      break;
      label47: this.size = localb.xT(this.appId);
      aCb();
      AppMethodBeat.o(102016);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(102017);
    if (this.hww != null)
      this.hww.run();
    AppMethodBeat.o(102017);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(102019);
    this.appId = paramParcel.readString();
    this.size = paramParcel.readInt();
    AppMethodBeat.o(102019);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(102018);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.size);
    AppMethodBeat.o(102018);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask
 * JD-Core Version:    0.6.2
 */