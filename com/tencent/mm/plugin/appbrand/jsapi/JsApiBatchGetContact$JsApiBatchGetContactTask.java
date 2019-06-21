package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

class JsApiBatchGetContact$JsApiBatchGetContactTask extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiBatchGetContactTask> CREATOR;
  private String aIm;
  private String hwA;
  private q hwf;
  private int hwi;
  public ArrayList<String> hwy;
  private m hwz;

  static
  {
    AppMethodBeat.i(130404);
    CREATOR = new JsApiBatchGetContact.JsApiBatchGetContactTask.2();
    AppMethodBeat.o(130404);
  }

  public JsApiBatchGetContact$JsApiBatchGetContactTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130395);
    g(paramParcel);
    AppMethodBeat.o(130395);
  }

  public JsApiBatchGetContact$JsApiBatchGetContactTask(m paramm, q paramq, int paramInt, ArrayList<String> paramArrayList)
  {
    this.hwz = paramm;
    this.hwf = paramq;
    this.hwi = paramInt;
    this.hwy = paramArrayList;
  }

  public final void asP()
  {
    AppMethodBeat.i(130397);
    d.post(new JsApiBatchGetContact.JsApiBatchGetContactTask.1(this), "AppBrandJsApiBatchGetContact");
    AppMethodBeat.o(130397);
  }

  public final void asQ()
  {
    AppMethodBeat.i(130396);
    if (!bo.isNullOrNil(this.hwA))
      this.hwf.M(this.hwi, this.hwA);
    while (true)
    {
      aBW();
      AppMethodBeat.o(130396);
      return;
      this.hwf.M(this.hwi, this.hwz.j(this.aIm, null));
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130398);
    this.hwy = paramParcel.readArrayList(getClass().getClassLoader());
    this.hwA = paramParcel.readString();
    this.aIm = paramParcel.readString();
    AppMethodBeat.o(130398);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130399);
    paramParcel.writeList(this.hwy);
    paramParcel.writeString(this.hwA);
    paramParcel.writeString(this.aIm);
    AppMethodBeat.o(130399);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiBatchGetContact.JsApiBatchGetContactTask
 * JD-Core Version:    0.6.2
 */