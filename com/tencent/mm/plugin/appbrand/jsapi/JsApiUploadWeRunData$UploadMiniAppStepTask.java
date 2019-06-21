package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.protocal.protobuf.cli;
import com.tencent.mm.protocal.protobuf.clj;
import com.tencent.mm.sdk.platformtools.ab;

class JsApiUploadWeRunData$UploadMiniAppStepTask extends MainProcessTask
{
  public static final Parcelable.Creator<UploadMiniAppStepTask> CREATOR;
  private String appId;
  private boolean cwB;
  private int hwi;
  private m hwz;
  private c hxS;
  private int hzv;
  private boolean hzw;

  static
  {
    AppMethodBeat.i(130630);
    CREATOR = new JsApiUploadWeRunData.UploadMiniAppStepTask.2();
    AppMethodBeat.o(130630);
  }

  public JsApiUploadWeRunData$UploadMiniAppStepTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130624);
    g(paramParcel);
    AppMethodBeat.o(130624);
  }

  public JsApiUploadWeRunData$UploadMiniAppStepTask(m paramm, c paramc, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(130623);
    ab.d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask");
    this.hwz = paramm;
    this.hxS = paramc;
    this.hwi = paramInt1;
    this.hzv = paramInt2;
    this.hzw = paramBoolean;
    this.appId = paramc.getAppId();
    AppMethodBeat.o(130623);
  }

  public final void asP()
  {
    AppMethodBeat.i(130625);
    long l1 = cb.aaD();
    ab.d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask currentTime %d", new Object[] { Long.valueOf(l1 / 1000L) });
    long l2 = l1;
    if (l1 == 0L)
      l2 = System.currentTimeMillis();
    b.a locala = new b.a();
    cli localcli = new cli();
    locala.fsJ = localcli;
    locala.fsK = new clj();
    locala.uri = "/cgi-bin/mmoc-bin/hardware/uploadminiappstep";
    locala.fsI = 1949;
    locala.fsL = 0;
    locala.fsM = 0;
    localcli.fKh = this.appId;
    localcli.jCs = this.hzv;
    localcli.xiZ = this.hzw;
    localcli.nbj = ((int)(l2 / 1000L));
    w.a(locala.acD(), new w.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb, com.tencent.mm.ai.m paramAnonymousm)
      {
        AppMethodBeat.i(130621);
        if (paramAnonymousm.getType() != 1949)
        {
          AppMethodBeat.o(130621);
          return 0;
        }
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          JsApiUploadWeRunData.UploadMiniAppStepTask.a(JsApiUploadWeRunData.UploadMiniAppStepTask.this, true);
          ab.d("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask ok.");
        }
        while (true)
        {
          JsApiUploadWeRunData.UploadMiniAppStepTask.a(JsApiUploadWeRunData.UploadMiniAppStepTask.this);
          AppMethodBeat.o(130621);
          break;
          JsApiUploadWeRunData.UploadMiniAppStepTask.a(JsApiUploadWeRunData.UploadMiniAppStepTask.this, false);
          ab.i("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask fail: errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        }
      }
    }
    , true);
    AppMethodBeat.o(130625);
  }

  public final void asQ()
  {
    AppMethodBeat.i(130626);
    if (this.cwB)
      this.hxS.M(this.hwi, this.hwz.j("ok", null));
    while (true)
    {
      aBW();
      AppMethodBeat.o(130626);
      return;
      this.hxS.M(this.hwi, this.hwz.j("fail", null));
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool1 = true;
    AppMethodBeat.i(130627);
    this.hzv = paramParcel.readInt();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.hzw = bool2;
      if (paramParcel.readByte() == 0)
        break label62;
    }
    label62: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.cwB = bool2;
      this.appId = paramParcel.readString();
      AppMethodBeat.o(130627);
      return;
      bool2 = false;
      break;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(130628);
    paramParcel.writeInt(this.hzv);
    int i;
    if (this.hzw)
    {
      i = 1;
      byte b = i;
      paramParcel.writeByte(b);
      if (!this.cwB)
        break label71;
    }
    label71: int k;
    for (int j = paramInt; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      paramParcel.writeString(this.appId);
      AppMethodBeat.o(130628);
      return;
      i = 0;
      j = i;
      break;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData.UploadMiniAppStepTask
 * JD-Core Version:    0.6.2
 */