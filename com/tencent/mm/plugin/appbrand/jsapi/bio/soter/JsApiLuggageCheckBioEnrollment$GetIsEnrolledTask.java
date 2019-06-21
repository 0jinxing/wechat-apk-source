package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.content.Context;
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

class JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetIsEnrolledTask> CREATOR;
  private int bOs;
  private int hDd;
  private int hDe;
  private JsApiLuggageCheckBioEnrollment hDk;
  private c hzz;

  static
  {
    AppMethodBeat.i(73782);
    CREATOR = new JsApiLuggageCheckBioEnrollment.GetIsEnrolledTask.1();
    AppMethodBeat.o(73782);
  }

  protected JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask(Parcel paramParcel)
  {
    AppMethodBeat.i(73780);
    this.hzz = null;
    this.bOs = -1;
    this.hDd = -1;
    this.hDe = -1;
    g(paramParcel);
    AppMethodBeat.o(73780);
  }

  public JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask(c paramc, int paramInt1, int paramInt2, JsApiLuggageCheckBioEnrollment paramJsApiLuggageCheckBioEnrollment)
  {
    this.hzz = null;
    this.bOs = -1;
    this.hDd = -1;
    this.hDe = -1;
    this.hzz = paramc;
    this.bOs = paramInt1;
    this.hDk = paramJsApiLuggageCheckBioEnrollment;
    this.hDd = paramInt2;
  }

  public final void asP()
  {
    AppMethodBeat.i(73778);
    Context localContext = JsApiLuggageCheckBioEnrollment.access$000();
    int i;
    if (this.hDd == 1)
      if (a.iR(localContext))
        i = 1;
    while (true)
    {
      this.hDe = i;
      ab.i("MicroMsg.GetIsEnrolledTask", "hy: enrollResult: %d", new Object[] { Integer.valueOf(this.hDe) });
      aCb();
      AppMethodBeat.o(73778);
      return;
      i = 0;
      continue;
      i = -1;
    }
  }

  public final void asQ()
  {
    boolean bool = false;
    AppMethodBeat.i(73777);
    super.asQ();
    ab.d("MicroMsg.GetIsEnrolledTask", "hy: callback. enrollResult: %d", new Object[] { Integer.valueOf(this.hDe) });
    HashMap localHashMap = new HashMap(2);
    if (this.hDe == 1)
      bool = true;
    localHashMap.put("isEnrolled", Boolean.valueOf(bool));
    if (this.hDe == 0)
      this.hzz.M(this.bOs, this.hDk.j("ok", localHashMap));
    while (true)
    {
      h.at(this);
      AppMethodBeat.o(73777);
      return;
      if (this.hDe == -1)
        this.hzz.M(this.bOs, this.hDk.j("fail not support", localHashMap));
      else if (this.hDe == 1)
        this.hzz.M(this.bOs, this.hDk.j("ok", localHashMap));
      else
        this.hzz.M(this.bOs, this.hDk.j("fail unknown error", localHashMap));
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(73781);
    super.g(paramParcel);
    this.hDe = paramParcel.readInt();
    this.hDd = paramParcel.readInt();
    AppMethodBeat.o(73781);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(73779);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.hDe);
    paramParcel.writeInt(this.hDd);
    AppMethodBeat.o(73779);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckBioEnrollment.GetIsEnrolledTask
 * JD-Core Version:    0.6.2
 */