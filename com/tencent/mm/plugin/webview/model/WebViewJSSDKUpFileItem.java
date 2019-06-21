package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class WebViewJSSDKUpFileItem extends WebViewJSSDKFileItem
{
  public static final Parcelable.Creator<WebViewJSSDKUpFileItem> CREATOR;
  public int fileType = -1;
  public String jVi;

  static
  {
    AppMethodBeat.i(6726);
    CREATOR = new WebViewJSSDKUpFileItem.1();
    AppMethodBeat.o(6726);
  }

  public WebViewJSSDKUpFileItem()
  {
    this.cyQ = 3;
  }

  private WebViewJSSDKUpFileItem(byte paramByte)
  {
  }

  public final void c(d paramd)
  {
    AppMethodBeat.i(6725);
    super.c(paramd);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(this.fileType);
    localArrayList.add(this.jVi);
    localArrayList.add(paramd.field_fileId);
    localArrayList.add(paramd.field_aesKey);
    localArrayList.add(paramd.field_fileLength);
    Context localContext = ah.getContext();
    if (at.isWifi(localContext))
      localArrayList.add("1");
    while (true)
    {
      ab.d("MicroMsg.WebViewJSSDKVoiceItem", "fileType=%d, initUrl=%s, field_fileId=%s", new Object[] { Integer.valueOf(this.fileType), this.jVi, paramd.field_fileId });
      paramd = h.pYm;
      h.g(12018, localArrayList);
      paramd = this.heo;
      if (!bo.isNullOrNil(paramd))
      {
        paramd = new File(paramd);
        if (paramd.exists())
          paramd.delete();
      }
      AppMethodBeat.o(6725);
      return;
      if (at.is3G(localContext))
        localArrayList.add("4");
      else if (at.is4G(localContext))
        localArrayList.add("5");
      else if (at.is2G(localContext))
        localArrayList.add("3");
      else if (at.isWap(localContext))
        localArrayList.add("2");
      else
        localArrayList.add("0");
    }
  }

  public final WebViewJSSDKFileItem cXJ()
  {
    AppMethodBeat.i(6724);
    this.czD = ap.aeB(this.heo);
    AppMethodBeat.o(6724);
    return this;
  }

  public final String cXK()
  {
    return "file";
  }

  public final String cXL()
  {
    return "nomal";
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.WebViewJSSDKUpFileItem
 * JD-Core Version:    0.6.2
 */