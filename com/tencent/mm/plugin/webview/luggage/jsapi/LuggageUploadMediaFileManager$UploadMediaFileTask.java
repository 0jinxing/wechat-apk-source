package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.a;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.ak;
import com.tencent.mm.plugin.webview.modeltools.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public class LuggageUploadMediaFileManager$UploadMediaFileTask extends MainProcessTask
{
  public static final Parcelable.Creator<UploadMediaFileTask> CREATOR;
  public String appId;
  public String cHr;
  public Runnable hww;
  public boolean success;
  private LuggageUploadMediaFileManager.a ukK;
  public String ukN;
  public String ukO;

  static
  {
    AppMethodBeat.i(6413);
    CREATOR = new LuggageUploadMediaFileManager.UploadMediaFileTask.2();
    AppMethodBeat.o(6413);
  }

  public LuggageUploadMediaFileManager$UploadMediaFileTask()
  {
  }

  private LuggageUploadMediaFileManager$UploadMediaFileTask(Parcel paramParcel)
  {
    AppMethodBeat.i(6411);
    g(paramParcel);
    AppMethodBeat.o(6411);
  }

  public final void asP()
  {
    AppMethodBeat.i(6407);
    ab.i("MicroMsg.UploadMediaTask", "runInMainProcess");
    if (this.ukK == null)
      this.ukK = new LuggageUploadMediaFileManager.UploadMediaFileTask.1(this);
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = g.cYF().aex(this.ukN);
    if (localWebViewJSSDKFileItem == null)
    {
      aCb();
      AppMethodBeat.o(6407);
    }
    while (true)
    {
      return;
      switch (localWebViewJSSDKFileItem.cyQ)
      {
      case 2:
      case 3:
      default:
        LuggageUploadMediaFileManager.a(ah.getContext(), this.appId, this.ukN, a.efK, false, this.ukK);
        AppMethodBeat.o(6407);
        break;
      case 1:
        LuggageUploadMediaFileManager.a(ah.getContext(), localWebViewJSSDKFileItem, this.appId, this.ukN, a.efJ, false, this.ukK);
        AppMethodBeat.o(6407);
        break;
      case 4:
        LuggageUploadMediaFileManager.a(ah.getContext(), this.appId, this.ukN, a.efK, false, this.ukK);
        AppMethodBeat.o(6407);
      }
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(6408);
    if (this.hww != null)
      this.hww.run();
    AppMethodBeat.o(6408);
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(6409);
    this.ukN = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.cHr = paramParcel.readString();
    this.ukO = paramParcel.readString();
    if (paramParcel.readByte() == 1);
    while (true)
    {
      this.success = bool;
      AppMethodBeat.o(6409);
      return;
      bool = false;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(6410);
    paramParcel.writeString(this.ukN);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.cHr);
    paramParcel.writeString(this.ukO);
    if (this.success);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      AppMethodBeat.o(6410);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager.UploadMediaFileTask
 * JD-Core Version:    0.6.2
 */