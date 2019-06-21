package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;

class JsApiGetContactMessageCountTask extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiGetContactMessageCountTask> CREATOR;
  public int csm;
  public Runnable hww;
  public String username;

  static
  {
    AppMethodBeat.i(131018);
    CREATOR = new JsApiGetContactMessageCountTask.1();
    AppMethodBeat.o(131018);
  }

  public JsApiGetContactMessageCountTask()
  {
  }

  public JsApiGetContactMessageCountTask(Parcel paramParcel)
  {
    AppMethodBeat.i(131013);
    g(paramParcel);
    AppMethodBeat.o(131013);
  }

  public final void asP()
  {
    AppMethodBeat.i(131014);
    ak localak = ((j)g.K(j.class)).XR().aoZ(this.username);
    if (localak == null)
    {
      this.csm = -1;
      aCb();
      AppMethodBeat.o(131014);
    }
    while (true)
    {
      return;
      this.csm = localak.field_unReadCount;
      aCb();
      AppMethodBeat.o(131014);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(131015);
    if (this.hww != null)
      this.hww.run();
    AppMethodBeat.o(131015);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(131016);
    this.username = paramParcel.readString();
    this.csm = paramParcel.readInt();
    AppMethodBeat.o(131016);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131017);
    paramParcel.writeString(this.username);
    paramParcel.writeInt(this.csm);
    AppMethodBeat.o(131017);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiGetContactMessageCountTask
 * JD-Core Version:    0.6.2
 */