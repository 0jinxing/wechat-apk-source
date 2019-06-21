package com.tencent.mm.plugin.webview.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoice.q;

public class WebViewJSSDKVoiceItem extends WebViewJSSDKFileItem
{
  public static final Parcelable.Creator<WebViewJSSDKVoiceItem> CREATOR;

  static
  {
    AppMethodBeat.i(6735);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(6735);
  }

  public WebViewJSSDKVoiceItem()
  {
    this.cyQ = 2;
  }

  protected WebViewJSSDKVoiceItem(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public final WebViewJSSDKFileItem cXJ()
  {
    AppMethodBeat.i(6733);
    this.heo = q.getFullPath(this.fileName);
    this.czD = ap.aeB(this.heo);
    AppMethodBeat.o(6733);
    return this;
  }

  public final String cXK()
  {
    return "speex";
  }

  public final String cXL()
  {
    return "voice";
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(6734);
    super.writeToParcel(paramParcel, paramInt);
    AppMethodBeat.o(6734);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.WebViewJSSDKVoiceItem
 * JD-Core Version:    0.6.2
 */