package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.page.u;

final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$5$1
  implements Runnable
{
  JsApiShowImageOperateSheet$BottomSheetLogicHelper$5$1(JsApiShowImageOperateSheet.BottomSheetLogicHelper.5 param5, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130577);
    Intent localIntent = new Intent();
    localIntent.putExtra("Retr_File_Name", this.hyZ);
    localIntent.putExtra("Retr_Compress_Type", 0);
    localIntent.putExtra("Retr_Msg_Type", 0);
    d.f(JsApiShowImageOperateSheet.BottomSheetLogicHelper.c(this.hza.hyY).mContext, ".ui.transmit.MsgRetransmitUI", localIntent);
    AppMethodBeat.o(130577);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet.BottomSheetLogicHelper.5.1
 * JD-Core Version:    0.6.2
 */