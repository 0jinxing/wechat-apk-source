package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.hu;
import com.tencent.mm.g.a.hu.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

class JsApiCheckIsSupportSoterAuthentication$GetIsSupportSoterTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetIsSupportSoterTask> CREATOR;
  private int bOs;
  private JsApiCheckIsSupportSoterAuthentication hDg;
  private int hDh;
  private c hzz;

  static
  {
    AppMethodBeat.i(3222);
    CREATOR = new JsApiCheckIsSupportSoterAuthentication.GetIsSupportSoterTask.1();
    AppMethodBeat.o(3222);
  }

  protected JsApiCheckIsSupportSoterAuthentication$GetIsSupportSoterTask(Parcel paramParcel)
  {
    AppMethodBeat.i(3220);
    this.hzz = null;
    this.bOs = -1;
    this.hDh = 0;
    g(paramParcel);
    AppMethodBeat.o(3220);
  }

  public JsApiCheckIsSupportSoterAuthentication$GetIsSupportSoterTask(c paramc, int paramInt, JsApiCheckIsSupportSoterAuthentication paramJsApiCheckIsSupportSoterAuthentication)
  {
    this.hzz = null;
    this.bOs = -1;
    this.hDh = 0;
    this.hzz = paramc;
    this.bOs = paramInt;
    this.hDg = paramJsApiCheckIsSupportSoterAuthentication;
  }

  public final void asP()
  {
    AppMethodBeat.i(3218);
    hu localhu = new hu();
    com.tencent.mm.sdk.b.a.xxA.m(localhu);
    this.hDh = localhu.cCM.cCN;
    ab.i("MicroMsg.GetIsSupportSoterTask", "hy: supportMode: %d", new Object[] { Integer.valueOf(this.hDh) });
    aCb();
    AppMethodBeat.o(3218);
  }

  public final void asQ()
  {
    AppMethodBeat.i(3217);
    super.asQ();
    ab.d("MicroMsg.GetIsSupportSoterTask", "hy: callback. supportMode: %d", new Object[] { Integer.valueOf(this.hDh) });
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("supportMode", a.oc(this.hDh));
    this.hzz.M(this.bOs, this.hDg.j("ok", localHashMap));
    h.at(this);
    AppMethodBeat.o(3217);
  }

  public int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(3221);
    super.g(paramParcel);
    this.hDh = paramParcel.readInt();
    AppMethodBeat.o(3221);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(3219);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.hDh);
    AppMethodBeat.o(3219);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication.GetIsSupportSoterTask
 * JD-Core Version:    0.6.2
 */