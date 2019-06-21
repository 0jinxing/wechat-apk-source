package com.tencent.mm.plugin.appbrand.jsapi.profile;

import a.f.b.j;
import a.l;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/profile/ProfileResult;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessResult;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "okFlag", "", "getOkFlag$plugin_appbrand_integration_release", "()I", "setOkFlag$plugin_appbrand_integration_release", "(I)V", "resultCode", "getResultCode$plugin_appbrand_integration_release", "setResultCode$plugin_appbrand_integration_release", "username", "", "getUsername$plugin_appbrand_integration_release", "()Ljava/lang/String;", "setUsername$plugin_appbrand_integration_release", "(Ljava/lang/String;)V", "describeContents", "readParcel", "", "writeToParcel", "dest", "flags", "CREATOR", "plugin-appbrand-integration_release"})
public final class ProfileResult extends AppBrandProxyUIProcessTask.ProcessResult
{
  public static final ProfileResult.a CREATOR;
  int bFZ;
  int hUO;
  String username;

  static
  {
    AppMethodBeat.i(134705);
    CREATOR = new ProfileResult.a((byte)0);
    AppMethodBeat.o(134705);
  }

  public ProfileResult()
  {
  }

  public ProfileResult(Parcel paramParcel)
  {
    AppMethodBeat.i(134704);
    k(paramParcel);
    AppMethodBeat.o(134704);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void k(Parcel paramParcel)
  {
    AppMethodBeat.i(134702);
    j.p(paramParcel, "parcel");
    this.bFZ = paramParcel.readInt();
    this.hUO = paramParcel.readInt();
    this.username = paramParcel.readString();
    AppMethodBeat.o(134702);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(134703);
    j.p(paramParcel, "dest");
    paramParcel.writeInt(this.bFZ);
    paramParcel.writeInt(this.hUO);
    paramParcel.writeString(this.username);
    AppMethodBeat.o(134703);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult
 * JD-Core Version:    0.6.2
 */