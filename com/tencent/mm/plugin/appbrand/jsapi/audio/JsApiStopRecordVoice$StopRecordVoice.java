package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.al;

class JsApiStopRecordVoice$StopRecordVoice extends MainProcessTask
{
  public static final Parcelable.Creator<StopRecordVoice> CREATOR;

  static
  {
    AppMethodBeat.i(130813);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(130813);
  }

  public final void asP()
  {
    AppMethodBeat.i(130812);
    m.aNS().aa(new JsApiStopRecordVoice.StopRecordVoice.1(this));
    AppMethodBeat.o(130812);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice.StopRecordVoice
 * JD-Core Version:    0.6.2
 */