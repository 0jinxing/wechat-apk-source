package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.hs;
import com.tencent.mm.g.a.hs.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

class JsApiCheckBioEnrollment$GetIsEnrolledTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetIsEnrolledTask> CREATOR;
  private int bOs;
  private JsApiCheckBioEnrollment hDc;
  private int hDd;
  private int hDe;
  private c hzz;

  static
  {
    AppMethodBeat.i(3214);
    CREATOR = new JsApiCheckBioEnrollment.GetIsEnrolledTask.1();
    AppMethodBeat.o(3214);
  }

  protected JsApiCheckBioEnrollment$GetIsEnrolledTask(Parcel paramParcel)
  {
    AppMethodBeat.i(3212);
    this.hzz = null;
    this.bOs = -1;
    this.hDd = -1;
    this.hDe = -1;
    g(paramParcel);
    AppMethodBeat.o(3212);
  }

  public JsApiCheckBioEnrollment$GetIsEnrolledTask(c paramc, int paramInt1, int paramInt2, JsApiCheckBioEnrollment paramJsApiCheckBioEnrollment)
  {
    this.hzz = null;
    this.bOs = -1;
    this.hDd = -1;
    this.hDe = -1;
    this.hzz = paramc;
    this.bOs = paramInt1;
    this.hDc = paramJsApiCheckBioEnrollment;
    this.hDd = paramInt2;
  }

  public final void asP()
  {
    AppMethodBeat.i(3210);
    hs localhs = new hs();
    localhs.cCD.cCF = this.hDd;
    a.xxA.m(localhs);
    this.hDe = localhs.cCE.cCG;
    ab.i("MicroMsg.GetIsEnrolledTask", "hy: enrollResult: %d", new Object[] { Integer.valueOf(this.hDe) });
    aCb();
    AppMethodBeat.o(3210);
  }

  public final void asQ()
  {
    boolean bool = false;
    AppMethodBeat.i(3209);
    super.asQ();
    ab.d("MicroMsg.GetIsEnrolledTask", "hy: callback. enrollResult: %d", new Object[] { Integer.valueOf(this.hDe) });
    HashMap localHashMap = new HashMap(2);
    if (this.hDe == 1)
      bool = true;
    localHashMap.put("isEnrolled", Boolean.valueOf(bool));
    if (this.hDe == 0)
      this.hzz.M(this.bOs, this.hDc.j("ok", localHashMap));
    while (true)
    {
      h.at(this);
      AppMethodBeat.o(3209);
      return;
      if (this.hDe == -1)
        this.hzz.M(this.bOs, this.hDc.j("fail not support", localHashMap));
      else if (this.hDe == 1)
        this.hzz.M(this.bOs, this.hDc.j("ok", localHashMap));
      else
        this.hzz.M(this.bOs, this.hDc.j("fail unknown error", localHashMap));
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(3213);
    super.g(paramParcel);
    this.hDe = paramParcel.readInt();
    this.hDd = paramParcel.readInt();
    AppMethodBeat.o(3213);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(3211);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.hDe);
    paramParcel.writeInt(this.hDd);
    AppMethodBeat.o(3211);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment.GetIsEnrolledTask
 * JD-Core Version:    0.6.2
 */