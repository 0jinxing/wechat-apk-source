package com.tencent.mm.plugin.webview.model;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import java.io.File;

public class WebViewJSSDKImageItem extends WebViewJSSDKFileItem
  implements Parcelable
{
  public static final Parcelable.Creator<WebViewJSSDKImageItem> CREATOR;

  static
  {
    AppMethodBeat.i(6722);
    CREATOR = new WebViewJSSDKImageItem.1();
    AppMethodBeat.o(6722);
  }

  public WebViewJSSDKImageItem()
  {
    this.cyQ = 1;
  }

  protected WebViewJSSDKImageItem(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public final WebViewJSSDKFileItem cXJ()
  {
    AppMethodBeat.i(6720);
    this.czD = ap.aeB(this.heo);
    cXN();
    AppMethodBeat.o(6720);
    return this;
  }

  public final String cXK()
  {
    return "jpeg";
  }

  public final String cXL()
  {
    return "image";
  }

  public final void cXN()
  {
    AppMethodBeat.i(6719);
    if (!new File(this.heo).exists())
    {
      ab.i("MicroMsg.WebViewJSSDkImageItem", "Original file not existed");
      AppMethodBeat.o(6719);
    }
    while (true)
    {
      return;
      this.hGG = ap.aez(System.currentTimeMillis());
      Bitmap localBitmap = d.d(this.heo, 640, 640, false);
      if (localBitmap != null)
      {
        ab.i("MicroMsg.WebViewJSSDkImageItem", "extract thumbnail bitmap");
        localBitmap = d.b(localBitmap, BackwardSupportUtil.ExifHelper.bJ(this.heo));
        if (localBitmap == null);
      }
      try
      {
        d.a(localBitmap, 100, Bitmap.CompressFormat.JPEG, this.hGG, true);
        ab.i("MicroMsg.WebViewJSSDkImageItem", "Thumb Path: %s", new Object[] { this.hGG });
        AppMethodBeat.o(6719);
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.WebViewJSSDkImageItem", "save bitmap to file failed : %s", new Object[] { localException.getMessage() });
      }
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(6721);
    super.writeToParcel(paramParcel, paramInt);
    AppMethodBeat.o(6721);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem
 * JD-Core Version:    0.6.2
 */