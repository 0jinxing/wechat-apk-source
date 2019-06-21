package com.tencent.mm.plugin.webview.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WebViewJSSDKVideoItem extends WebViewJSSDKFileItem
  implements Parcelable
{
  public static final Parcelable.Creator<WebViewJSSDKVideoItem> CREATOR;
  public int duration;
  public int height;
  public int size;
  public int width;

  static
  {
    AppMethodBeat.i(6731);
    CREATOR = new WebViewJSSDKVideoItem.1();
    AppMethodBeat.o(6731);
  }

  public WebViewJSSDKVideoItem()
  {
    this.cyQ = 4;
  }

  protected WebViewJSSDKVideoItem(Parcel paramParcel)
  {
    super(paramParcel);
    AppMethodBeat.i(6729);
    this.cyQ = paramParcel.readInt();
    this.duration = paramParcel.readInt();
    this.size = paramParcel.readInt();
    this.width = paramParcel.readInt();
    this.height = paramParcel.readInt();
    AppMethodBeat.o(6729);
  }

  public final WebViewJSSDKFileItem cXJ()
  {
    AppMethodBeat.i(6728);
    this.czD = ap.aeB(this.heo);
    AppMethodBeat.o(6728);
    return this;
  }

  public final String cXK()
  {
    return "mp4";
  }

  public final String cXL()
  {
    return "video";
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(6730);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.cyQ);
    paramParcel.writeInt(this.duration);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
    AppMethodBeat.o(6730);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem
 * JD-Core Version:    0.6.2
 */