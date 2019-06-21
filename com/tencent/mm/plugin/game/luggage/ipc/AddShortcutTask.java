package com.tencent.mm.plugin.game.luggage.ipc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.webview.model.at;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public class AddShortcutTask extends MainProcessTask
{
  public static final Parcelable.Creator<AddShortcutTask> CREATOR;
  public String appId;
  public Runnable hww;
  public boolean success;
  public String username;

  static
  {
    AppMethodBeat.i(135854);
    CREATOR = new AddShortcutTask.2();
    AppMethodBeat.o(135854);
  }

  public AddShortcutTask()
  {
  }

  private AddShortcutTask(Parcel paramParcel)
  {
    AppMethodBeat.i(135852);
    g(paramParcel);
    AppMethodBeat.o(135852);
  }

  public final void asP()
  {
    AppMethodBeat.i(135848);
    if ((bo.isNullOrNil(this.appId)) || (bo.isNullOrNil(this.username)))
    {
      ab.e("MicroMsg.AddShortcutTask", "appid or username is null");
      this.success = false;
      AppMethodBeat.o(135848);
    }
    while (true)
    {
      return;
      at.a(ah.getContext(), this.username, this.appId, new AddShortcutTask.1(this));
      AppMethodBeat.o(135848);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(135849);
    if (this.hww != null)
      this.hww.run();
    AppMethodBeat.o(135849);
  }

  public int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(135850);
    this.username = paramParcel.readString();
    this.appId = paramParcel.readString();
    if (paramParcel.readByte() == 1);
    while (true)
    {
      this.success = bool;
      AppMethodBeat.o(135850);
      return;
      bool = false;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(135851);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.appId);
    if (this.success);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(135851);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask
 * JD-Core Version:    0.6.2
 */