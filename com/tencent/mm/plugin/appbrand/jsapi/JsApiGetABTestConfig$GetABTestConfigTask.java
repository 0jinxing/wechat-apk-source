package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.d;
import java.util.HashMap;
import java.util.Map;

public class JsApiGetABTestConfig$GetABTestConfigTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetABTestConfigTask> CREATOR;
  private String hwO;
  private Map<String, String> hwP;

  static
  {
    AppMethodBeat.i(130421);
    CREATOR = new JsApiGetABTestConfig.GetABTestConfigTask.1();
    AppMethodBeat.o(130421);
  }

  JsApiGetABTestConfig$GetABTestConfigTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130416);
    this.hwP = new HashMap();
    g(paramParcel);
    AppMethodBeat.o(130416);
  }

  JsApiGetABTestConfig$GetABTestConfigTask(String paramString)
  {
    AppMethodBeat.i(138127);
    this.hwP = new HashMap();
    this.hwO = paramString;
    AppMethodBeat.o(138127);
  }

  public final void asP()
  {
    AppMethodBeat.i(130417);
    ab.i("MicroMsg.JsApiGetABTestConfig", "runInMainProcess");
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll(this.hwO);
    if (localc.isValid())
      this.hwP.putAll(localc.dru());
    aCb();
    AppMethodBeat.o(130417);
  }

  public final void asQ()
  {
    AppMethodBeat.i(130418);
    AppMethodBeat.o(130418);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130419);
    this.hwP.clear();
    this.hwP.putAll(paramParcel.readHashMap(HashMap.class.getClassLoader()));
    this.hwO = paramParcel.readString();
    AppMethodBeat.o(130419);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130420);
    paramParcel.writeMap(this.hwP);
    paramParcel.writeString(this.hwO);
    AppMethodBeat.o(130420);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiGetABTestConfig.GetABTestConfigTask
 * JD-Core Version:    0.6.2
 */