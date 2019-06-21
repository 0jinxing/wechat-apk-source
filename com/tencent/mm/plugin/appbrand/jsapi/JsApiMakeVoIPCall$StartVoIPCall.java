package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

class JsApiMakeVoIPCall$StartVoIPCall extends MainProcessTask
{
  public static final Parcelable.Creator<StartVoIPCall> CREATOR;
  private int hwi;
  private m hwz;
  private c hxS;
  private com.tencent.mm.sdk.b.c hxT;
  public int status;

  static
  {
    AppMethodBeat.i(130492);
    CREATOR = new JsApiMakeVoIPCall.StartVoIPCall.2();
    AppMethodBeat.o(130492);
  }

  public JsApiMakeVoIPCall$StartVoIPCall(Parcel paramParcel)
  {
    AppMethodBeat.i(130486);
    this.hxT = new JsApiMakeVoIPCall.StartVoIPCall.1(this);
    g(paramParcel);
    AppMethodBeat.o(130486);
  }

  public JsApiMakeVoIPCall$StartVoIPCall(m paramm, c paramc, int paramInt)
  {
    AppMethodBeat.i(130485);
    this.hxT = new JsApiMakeVoIPCall.StartVoIPCall.1(this);
    this.hwz = paramm;
    this.hxS = paramc;
    this.hwi = paramInt;
    AppMethodBeat.o(130485);
  }

  public final void asP()
  {
    AppMethodBeat.i(130487);
    a.xxA.c(this.hxT);
    AppMethodBeat.o(130487);
  }

  public final void asQ()
  {
    AppMethodBeat.i(130488);
    aBW();
    ab.i("MicroMsg.JsApiMakeVoIPCall", "makeVoIPCall = %d", new Object[] { Integer.valueOf(this.status) });
    if (this.status == 1)
    {
      this.hxS.M(this.hwi, this.hwz.j("cancel", null));
      AppMethodBeat.o(130488);
    }
    while (true)
    {
      return;
      if (this.status == 2)
      {
        this.hxS.M(this.hwi, this.hwz.j("ok", null));
        AppMethodBeat.o(130488);
      }
      else if (this.status == 3)
      {
        this.hxS.M(this.hwi, this.hwz.j("fail:network error", null));
        AppMethodBeat.o(130488);
      }
      else if (this.status == 4)
      {
        this.hxS.M(this.hwi, this.hwz.j("fail:param not match", null));
        AppMethodBeat.o(130488);
      }
      else
      {
        this.hxS.M(this.hwi, this.hwz.j("fail:unknow", null));
        AppMethodBeat.o(130488);
      }
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130489);
    this.status = paramParcel.readInt();
    AppMethodBeat.o(130489);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130490);
    paramParcel.writeInt(this.status);
    AppMethodBeat.o(130490);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiMakeVoIPCall.StartVoIPCall
 * JD-Core Version:    0.6.2
 */