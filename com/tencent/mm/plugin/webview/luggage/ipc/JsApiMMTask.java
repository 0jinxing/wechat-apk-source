package com.tencent.mm.plugin.webview.luggage.ipc;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.sdk.platformtools.ah;
import org.json.JSONObject;

public class JsApiMMTask extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiMMTask> CREATOR;
  public String aIm;
  public String hAP;
  public a.a ujK;
  public String ujL;
  public String ujM;

  static
  {
    AppMethodBeat.i(6263);
    CREATOR = new JsApiMMTask.2();
    AppMethodBeat.o(6263);
  }

  public JsApiMMTask()
  {
  }

  private JsApiMMTask(Parcel paramParcel)
  {
    AppMethodBeat.i(6261);
    g(paramParcel);
    AppMethodBeat.o(6261);
  }

  public final void asP()
  {
    AppMethodBeat.i(6257);
    try
    {
      bc localbc = (bc)Class.forName(this.ujL).newInstance();
      Context localContext = ah.getContext();
      String str = this.hAP;
      JsApiMMTask.1 local1 = new com/tencent/mm/plugin/webview/luggage/ipc/JsApiMMTask$1;
      local1.<init>(this);
      localbc.a(localContext, str, local1);
      AppMethodBeat.o(6257);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(6257);
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(6258);
    aBW();
    if (this.ujK != null);
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(this.ujM);
        this.ujK.a(this.aIm, localJSONObject);
        AppMethodBeat.o(6258);
        return;
      }
      catch (Exception localException)
      {
        this.ujK.a(this.aIm, null);
      }
      AppMethodBeat.o(6258);
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(6259);
    this.hAP = paramParcel.readString();
    this.ujL = paramParcel.readString();
    this.aIm = paramParcel.readString();
    this.ujM = paramParcel.readString();
    AppMethodBeat.o(6259);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(6260);
    paramParcel.writeString(this.hAP);
    paramParcel.writeString(this.ujL);
    paramParcel.writeString(this.aIm);
    paramParcel.writeString(this.ujM);
    AppMethodBeat.o(6260);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.ipc.JsApiMMTask
 * JD-Core Version:    0.6.2
 */