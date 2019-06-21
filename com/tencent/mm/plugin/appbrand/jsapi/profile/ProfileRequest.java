package com.tencent.mm.plugin.appbrand.jsapi.profile;

import a.f.b.j;
import a.l;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/ProfileRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "scene", "", "getScene$plugin_appbrand_integration_release", "()I", "setScene$plugin_appbrand_integration_release", "(I)V", "username", "", "getUsername$plugin_appbrand_integration_release", "()Ljava/lang/String;", "setUsername$plugin_appbrand_integration_release", "(Ljava/lang/String;)V", "getTaskClass", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask;", "readParcel", "", "writeToParcel", "dest", "flags", "CREATOR", "plugin-appbrand-integration_release"})
public final class ProfileRequest extends AppBrandProxyUIProcessTask.ProcessRequest
{
  public static final ProfileRequest.a CREATOR;
  int scene;
  String username;

  static
  {
    AppMethodBeat.i(134700);
    CREATOR = new ProfileRequest.a((byte)0);
    AppMethodBeat.o(134700);
  }

  public ProfileRequest()
  {
    this.scene = 122;
  }

  public ProfileRequest(Parcel paramParcel)
  {
    AppMethodBeat.i(134699);
    this.scene = 122;
    k(paramParcel);
    AppMethodBeat.o(134699);
  }

  public final Class<? extends AppBrandProxyUIProcessTask> aCa()
  {
    return d.class;
  }

  public final void k(Parcel paramParcel)
  {
    AppMethodBeat.i(134697);
    j.p(paramParcel, "parcel");
    this.username = paramParcel.readString();
    this.scene = paramParcel.readInt();
    AppMethodBeat.o(134697);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(134698);
    j.p(paramParcel, "dest");
    paramParcel.writeString(this.username);
    paramParcel.writeInt(this.scene);
    AppMethodBeat.o(134698);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest
 * JD-Core Version:    0.6.2
 */