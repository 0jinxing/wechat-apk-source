package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.core.a;
import java.util.HashMap;
import java.util.Map;

class JsApiLuggageCheckIsSupportSoterAuthentication$GetIsSupportSoterTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetIsSupportSoterTask> CREATOR;
  private int bOs;
  private JsApiLuggageCheckIsSupportSoterAuthentication hDm;
  private String hDn;
  private c hzz;

  static
  {
    AppMethodBeat.i(73790);
    CREATOR = new JsApiLuggageCheckIsSupportSoterAuthentication.GetIsSupportSoterTask.1();
    AppMethodBeat.o(73790);
  }

  protected JsApiLuggageCheckIsSupportSoterAuthentication$GetIsSupportSoterTask(Parcel paramParcel)
  {
    AppMethodBeat.i(73788);
    this.hzz = null;
    this.bOs = -1;
    this.hDn = "";
    g(paramParcel);
    AppMethodBeat.o(73788);
  }

  public JsApiLuggageCheckIsSupportSoterAuthentication$GetIsSupportSoterTask(c paramc, int paramInt, JsApiLuggageCheckIsSupportSoterAuthentication paramJsApiLuggageCheckIsSupportSoterAuthentication)
  {
    this.hzz = null;
    this.bOs = -1;
    this.hDn = "";
    this.hzz = paramc;
    this.bOs = paramInt;
    this.hDm = paramJsApiLuggageCheckIsSupportSoterAuthentication;
  }

  public final void asP()
  {
    AppMethodBeat.i(73786);
    this.hDn = a.dQT();
    ab.i("MicroMsg.GetIsSupportSoterTask", "hy: verifyRemoteStr: %s", new Object[] { this.hDn });
    aCb();
    AppMethodBeat.o(73786);
  }

  public final void asQ()
  {
    AppMethodBeat.i(73785);
    super.asQ();
    ab.d("MicroMsg.GetIsSupportSoterTask", "hy: callback. verifyRemoteStr: %s", new Object[] { this.hDn });
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("verifyRemote", this.hDn);
    localHashMap.put("nativeSupport", Boolean.valueOf(a.dQN()));
    ab.i("MicroMsg.GetIsSupportSoterTask", "hy: nativeSupport:" + a.dQN());
    this.hzz.M(this.bOs, this.hDm.j("ok", localHashMap));
    h.at(this);
    AppMethodBeat.o(73785);
  }

  public int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(73789);
    super.g(paramParcel);
    this.hDn = paramParcel.readString();
    AppMethodBeat.o(73789);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(73787);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.hDn);
    AppMethodBeat.o(73787);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckIsSupportSoterAuthentication.GetIsSupportSoterTask
 * JD-Core Version:    0.6.2
 */