package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.al;

class JsApiStopPlayVoice$StopPlayVoice extends MainProcessTask
{
  public static final Parcelable.Creator<StopPlayVoice> CREATOR;

  static
  {
    AppMethodBeat.i(130807);
    CREATOR = new JsApiStopPlayVoice.StopPlayVoice.2();
    AppMethodBeat.o(130807);
  }

  public final void asP()
  {
    AppMethodBeat.i(130806);
    al.d(new JsApiStopPlayVoice.StopPlayVoice.1(this));
    AppMethodBeat.o(130806);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice.StopPlayVoice
 * JD-Core Version:    0.6.2
 */