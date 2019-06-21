package com.tencent.mm.plugin.webview.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.mm.al.c;
import com.tencent.mm.i.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class WebViewJSSDKFileItem
  implements Parcelable
{
  public String appId;
  public String cHr;
  public int cyQ;
  public String czD;
  public String fileName;
  public String hGG;
  public String heo;
  public String hep;
  public boolean her;
  public boolean hes = true;
  public boolean het = true;
  public WebViewJSSDKFileItem.a umx;

  public WebViewJSSDKFileItem()
  {
  }

  protected WebViewJSSDKFileItem(Parcel paramParcel)
  {
    this.appId = paramParcel.readString();
    this.czD = paramParcel.readString();
    this.hGG = paramParcel.readString();
    this.heo = paramParcel.readString();
    this.cyQ = paramParcel.readInt();
  }

  public static WebViewJSSDKFileItem I(int paramInt, String paramString1, String paramString2)
  {
    WebViewJSSDKUpFileItem localWebViewJSSDKUpFileItem = new WebViewJSSDKUpFileItem();
    localWebViewJSSDKUpFileItem.fileType = paramInt;
    localWebViewJSSDKUpFileItem.jVi = paramString1;
    localWebViewJSSDKUpFileItem.heo = paramString2;
    localWebViewJSSDKUpFileItem.cXJ();
    localWebViewJSSDKUpFileItem.cHr = c.a("jsupfile", bo.anU(), localWebViewJSSDKUpFileItem.czD, localWebViewJSSDKUpFileItem.czD);
    ab.d("MicroMsg.WebViewJSSDKFileItem", "fileType=%d, origFilePath=%s, localId=%s", new Object[] { Integer.valueOf(paramInt), paramString2, localWebViewJSSDKUpFileItem.czD });
    return localWebViewJSSDKUpFileItem;
  }

  public static WebViewJSSDKFileItem aeu(String paramString)
  {
    WebViewJSSDKImageItem localWebViewJSSDKImageItem = new WebViewJSSDKImageItem();
    localWebViewJSSDKImageItem.heo = paramString;
    localWebViewJSSDKImageItem.cXJ();
    localWebViewJSSDKImageItem.cHr = c.a("jsupimg", bo.anU(), localWebViewJSSDKImageItem.czD, localWebViewJSSDKImageItem.czD);
    return localWebViewJSSDKImageItem;
  }

  public static WebViewJSSDKFileItem aev(String paramString)
  {
    WebViewJSSDKVoiceItem localWebViewJSSDKVoiceItem = new WebViewJSSDKVoiceItem();
    localWebViewJSSDKVoiceItem.fileName = paramString;
    localWebViewJSSDKVoiceItem.cXJ();
    localWebViewJSSDKVoiceItem.cHr = c.a("jsupvoice", bo.anU(), localWebViewJSSDKVoiceItem.czD, localWebViewJSSDKVoiceItem.czD);
    return localWebViewJSSDKVoiceItem;
  }

  public static WebViewJSSDKVideoItem aew(String paramString)
  {
    WebViewJSSDKVideoItem localWebViewJSSDKVideoItem = new WebViewJSSDKVideoItem();
    localWebViewJSSDKVideoItem.heo = paramString;
    localWebViewJSSDKVideoItem.cXJ();
    localWebViewJSSDKVideoItem.cHr = c.a("jsvideofile", bo.anU(), localWebViewJSSDKVideoItem.czD, localWebViewJSSDKVideoItem.czD);
    ab.d("MicroMsg.WebViewJSSDKFileItem", "filepath = %s, localid = %s, mediaid = %s", new Object[] { paramString, localWebViewJSSDKVideoItem.czD, localWebViewJSSDKVideoItem.cHr });
    return localWebViewJSSDKVideoItem;
  }

  public void c(d paramd)
  {
    if (this.umx == null)
      this.umx = new WebViewJSSDKFileItem.a();
    if (paramd == null)
      ab.e("MicroMsg.WebViewJSSDKFileItem", "sceneResult info is null");
    while (true)
    {
      return;
      this.umx.field_aesKey = paramd.field_aesKey;
      this.umx.field_fileId = paramd.field_fileId;
      this.umx.field_fileUrl = paramd.field_fileUrl;
      this.umx.field_fileLength = paramd.field_fileLength;
    }
  }

  public abstract WebViewJSSDKFileItem cXJ();

  public abstract String cXK();

  public abstract String cXL();

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.czD);
    paramParcel.writeString(this.hGG);
    paramParcel.writeString(this.heo);
    paramParcel.writeInt(this.cyQ);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem
 * JD-Core Version:    0.6.2
 */