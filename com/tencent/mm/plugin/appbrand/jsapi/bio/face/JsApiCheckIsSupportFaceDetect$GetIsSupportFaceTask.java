package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ht;
import com.tencent.mm.g.a.ht.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.r.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

class JsApiCheckIsSupportFaceDetect$GetIsSupportFaceTask extends MainProcessTask
{
  public static final Parcelable.Creator<GetIsSupportFaceTask> CREATOR;
  private String aIm;
  private int bOs;
  private boolean cOQ;
  private int errCode;
  private JsApiCheckIsSupportFaceDetect hCX;
  private int hCY;
  private c hzz;

  static
  {
    AppMethodBeat.i(3199);
    CREATOR = new JsApiCheckIsSupportFaceDetect.GetIsSupportFaceTask.1();
    AppMethodBeat.o(3199);
  }

  protected JsApiCheckIsSupportFaceDetect$GetIsSupportFaceTask(Parcel paramParcel)
  {
    AppMethodBeat.i(3197);
    this.hzz = null;
    this.bOs = -1;
    this.cOQ = false;
    this.errCode = -1;
    this.aIm = "not returned";
    this.hCY = -1;
    g(paramParcel);
    AppMethodBeat.o(3197);
  }

  public JsApiCheckIsSupportFaceDetect$GetIsSupportFaceTask(c paramc, int paramInt, JsApiCheckIsSupportFaceDetect paramJsApiCheckIsSupportFaceDetect)
  {
    this.hzz = null;
    this.bOs = -1;
    this.cOQ = false;
    this.errCode = -1;
    this.aIm = "not returned";
    this.hCY = -1;
    this.hzz = paramc;
    this.bOs = paramInt;
    this.hCX = paramJsApiCheckIsSupportFaceDetect;
  }

  public final void asP()
  {
    AppMethodBeat.i(3195);
    ht localht = new ht();
    a.xxA.m(localht);
    this.cOQ = localht.cCH.cCI;
    this.errCode = localht.cCH.cCJ;
    this.aIm = localht.cCH.cCK;
    this.hCY = localht.cCH.cCL;
    ab.i("MicroMsg.GetIsSupportFaceTask", "hy: is support: %b, errCode: %d, errMsg: %s, ilbVersion: %d", new Object[] { Boolean.valueOf(this.cOQ), Integer.valueOf(this.errCode), this.aIm, Integer.valueOf(this.hCY) });
    aCb();
    AppMethodBeat.o(3195);
  }

  public final void asQ()
  {
    AppMethodBeat.i(3194);
    super.asQ();
    ab.d("MicroMsg.GetIsSupportFaceTask", "hy: callback. isSupport: %b, errCode: %d, errMsg: %s, libVersion: %d", new Object[] { Boolean.valueOf(this.cOQ), Integer.valueOf(this.errCode), this.aIm, Integer.valueOf(this.hCY) });
    HashMap localHashMap = new HashMap(3);
    localHashMap.put("errCode", Integer.valueOf(this.errCode));
    localHashMap.put("libVersionCode", Integer.valueOf(this.hCY));
    if (this.errCode == 0)
      this.hzz.M(this.bOs, this.hCX.j("ok", localHashMap));
    while (true)
    {
      h.at(this);
      AppMethodBeat.o(3194);
      return;
      this.hzz.M(this.bOs, this.hCX.j("fail " + this.aIm, localHashMap));
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(3198);
    super.g(paramParcel);
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.cOQ = bool;
      this.errCode = paramParcel.readInt();
      this.aIm = paramParcel.readString();
      this.hCY = paramParcel.readInt();
      AppMethodBeat.o(3198);
      return;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(3196);
    super.writeToParcel(paramParcel, paramInt);
    if (this.cOQ)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeInt(this.errCode);
      paramParcel.writeString(this.aIm);
      paramParcel.writeInt(this.hCY);
      AppMethodBeat.o(3196);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect.GetIsSupportFaceTask
 * JD-Core Version:    0.6.2
 */