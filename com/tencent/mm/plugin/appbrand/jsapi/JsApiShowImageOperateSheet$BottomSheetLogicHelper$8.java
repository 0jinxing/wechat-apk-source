package com.tencent.mm.plugin.appbrand.jsapi;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;

final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$8
  implements Runnable
{
  JsApiShowImageOperateSheet$BottomSheetLogicHelper$8(JsApiShowImageOperateSheet.BottomSheetLogicHelper paramBottomSheetLogicHelper, b paramb, Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130584);
    String str1 = j.w(this.hzd.dMD());
    String str2 = j.w(this.hzd.dMD()) + "_full";
    ab.i("MicroMsg.JsApiShowImageOperateSheet", "processRecognizeQRCodeLogic capturePath:%s", new Object[] { str1 });
    JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeParam localIPCQRCodeRecognizeParam = new JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeParam();
    try
    {
      d.a(this.hze, 100, Bitmap.CompressFormat.JPEG, str2, true);
      JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeParam.a(localIPCQRCodeRecognizeParam, str2);
      if ((this.hzf != null) && (!this.hzf.isRecycled()))
      {
        d.a(this.hzf, 100, Bitmap.CompressFormat.JPEG, str1, true);
        JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeParam.a(localIPCQRCodeRecognizeParam, str1);
        JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeParam.b(localIPCQRCodeRecognizeParam, str2);
      }
      while (true)
      {
        if ((this.hzf != null) && (!this.hzf.isRecycled()))
        {
          ab.i("MicroMsg.JsApiShowImageOperateSheet", "bitmap recycle %s", new Object[] { this.hzf });
          this.hzf.recycle();
        }
        if ((this.hze != null) && (!this.hze.isRecycled()))
          this.hze.recycle();
        f.a("com.tencent.mm", localIPCQRCodeRecognizeParam, JsApiShowImageOperateSheet.BottomSheetLogicHelper.c.class, new JsApiShowImageOperateSheet.BottomSheetLogicHelper.8.1(this));
        AppMethodBeat.o(130584);
        return;
        JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeParam.b(localIPCQRCodeRecognizeParam, null);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.JsApiShowImageOperateSheet", "save temp bitmap to file failed, . exception : %s", new Object[] { localException });
        if ((this.hzf != null) && (!this.hzf.isRecycled()))
        {
          ab.i("MicroMsg.JsApiShowImageOperateSheet", "bitmap recycle %s", new Object[] { this.hzf });
          this.hzf.recycle();
        }
        if ((this.hze != null) && (!this.hze.isRecycled()))
          this.hze.recycle();
      }
    }
    finally
    {
      if ((this.hzf != null) && (!this.hzf.isRecycled()))
      {
        ab.i("MicroMsg.JsApiShowImageOperateSheet", "bitmap recycle %s", new Object[] { this.hzf });
        this.hzf.recycle();
      }
      if ((this.hze != null) && (!this.hze.isRecycled()))
        this.hze.recycle();
      AppMethodBeat.o(130584);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet.BottomSheetLogicHelper.8
 * JD-Core Version:    0.6.2
 */