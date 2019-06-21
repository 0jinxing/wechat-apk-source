package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.app.ProgressDialog;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.plugin.webview.luggage.ipc.b;
import com.tencent.mm.plugin.webview.luggage.k;
import com.tencent.mm.ui.MMActivity;

public final class LuggageUploadMediaFileManager
{
  private static ProgressDialog ehJ = null;
  public MMActivity knn;
  public String mAppId;
  public d uiI;
  public String ukB;
  public boolean ukC;
  public LuggageUploadMediaFileManager.b ukD;

  final void cXp()
  {
    AppMethodBeat.i(6414);
    if (this.uiI.cWH() != null)
    {
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("close_window_confirm_dialog_switch", true);
      localBundle.putString("close_window_confirm_dialog_title_cn", this.knn.getString(2131305571));
      localBundle.putString("close_window_confirm_dialog_title_eng", this.knn.getString(2131305571));
      localBundle.putString("close_window_confirm_dialog_ok_cn", this.knn.getString(2131305567));
      localBundle.putString("close_window_confirm_dialog_ok_eng", this.knn.getString(2131305567));
      localBundle.putString("close_window_confirm_dialog_cancel_cn", this.knn.getString(2131305568));
      localBundle.putString("close_window_confirm_dialog_cancel_eng", this.knn.getString(2131305568));
      this.uiI.cWH().setCloseWindowConfirmInfo(localBundle);
    }
    cXq();
    AppMethodBeat.o(6414);
  }

  final void cXq()
  {
    AppMethodBeat.i(6415);
    Object localObject;
    if (this.ukC)
    {
      localObject = new Bundle();
      ((Bundle)localObject).putString("local_id", this.ukB);
      ((Bundle)localObject).putString("app_id", this.mAppId);
      ((Bundle)localObject).putBoolean("show_progress_tips", this.ukC);
      b.a(this.knn, (Bundle)localObject, LuggageUploadMediaFileManager.c.class, new LuggageUploadMediaFileManager.3(this));
      AppMethodBeat.o(6415);
    }
    while (true)
    {
      return;
      localObject = new LuggageUploadMediaFileManager.UploadMediaFileTask();
      ((LuggageUploadMediaFileManager.UploadMediaFileTask)localObject).ukN = this.ukB;
      ((LuggageUploadMediaFileManager.UploadMediaFileTask)localObject).appId = this.mAppId;
      ((LuggageUploadMediaFileManager.UploadMediaFileTask)localObject).hww = new LuggageUploadMediaFileManager.4(this, (LuggageUploadMediaFileManager.UploadMediaFileTask)localObject);
      ((LuggageUploadMediaFileManager.UploadMediaFileTask)localObject).aBV();
      AppBrandMainProcessService.a((MainProcessTask)localObject);
      AppMethodBeat.o(6415);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager
 * JD-Core Version:    0.6.2
 */