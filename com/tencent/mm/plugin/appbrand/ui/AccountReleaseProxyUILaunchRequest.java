package com.tencent.mm.plugin.appbrand.ui;

import a.l;
import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/AccountReleaseProxyUILaunchRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "describeContents", "", "getTaskClass", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask;", "CREATOR", "plugin-appbrand-integration_release"})
final class AccountReleaseProxyUILaunchRequest extends AppBrandProxyUIProcessTask.ProcessRequest
{
  public static final AccountReleaseProxyUILaunchRequest.a CREATOR;

  static
  {
    AppMethodBeat.i(134983);
    CREATOR = new AccountReleaseProxyUILaunchRequest.a((byte)0);
    AppMethodBeat.o(134983);
  }

  public AccountReleaseProxyUILaunchRequest()
  {
  }

  public AccountReleaseProxyUILaunchRequest(Parcel paramParcel)
  {
    this();
    AppMethodBeat.i(134982);
    AppMethodBeat.o(134982);
  }

  public final Class<? extends AppBrandProxyUIProcessTask> aCa()
  {
    return a.class;
  }

  public final int describeContents()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AccountReleaseProxyUILaunchRequest
 * JD-Core Version:    0.6.2
 */