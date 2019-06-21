package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;

final class JsApiPrivateAddContact$AddContactRequest extends AppBrandProxyUIProcessTask.ProcessRequest
{
  public static final Parcelable.Creator<AddContactRequest> CREATOR;
  int hyy;
  int scene;
  String userName;

  static
  {
    AppMethodBeat.i(73160);
    CREATOR = new JsApiPrivateAddContact.AddContactRequest.1();
    AppMethodBeat.o(73160);
  }

  JsApiPrivateAddContact$AddContactRequest()
  {
  }

  JsApiPrivateAddContact$AddContactRequest(Parcel paramParcel)
  {
    AppMethodBeat.i(73157);
    k(paramParcel);
    AppMethodBeat.o(73157);
  }

  public final Class<? extends AppBrandProxyUIProcessTask> aCa()
  {
    return JsApiPrivateAddContact.a.class;
  }

  public final void k(Parcel paramParcel)
  {
    AppMethodBeat.i(73158);
    this.userName = paramParcel.readString();
    this.scene = paramParcel.readInt();
    this.hyy = paramParcel.readInt();
    AppMethodBeat.o(73158);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(73159);
    paramParcel.writeString(this.userName);
    paramParcel.writeInt(this.scene);
    paramParcel.writeInt(this.hyy);
    AppMethodBeat.o(73159);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact.AddContactRequest
 * JD-Core Version:    0.6.2
 */