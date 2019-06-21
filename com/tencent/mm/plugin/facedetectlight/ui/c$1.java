package com.tencent.mm.plugin.facedetectlight.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.DisplayMetrics;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.e.a;
import com.tencent.mm.plugin.facedetectlight.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.youtu.ytfacetrace.YTFaceTraceInterface;
import com.tencent.youtu.ytfacetrace.YTFaceTraceInterface.FaceTraceingNotice;
import com.tencent.youtu.ytfacetrace.jni.YTFaceTraceJNIInterface.FaceStatus;

final class c$1
  implements YTFaceTraceInterface.FaceTraceingNotice
{
  c$1(c paramc)
  {
  }

  public final void onTracing(int paramInt, YTFaceTraceJNIInterface.FaceStatus paramFaceStatus, Rect paramRect, byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(788);
    ab.i("MicroMsg.FaceReflectLogic", "facePreviewState：".concat(String.valueOf(paramFaceStatus)));
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(788);
    case 0:
    case 2:
      while (true)
      {
        return;
        ab.i("MicroMsg.FaceReflectLogic", "Face mState：init");
        AppMethodBeat.o(788);
        continue;
        ab.i("MicroMsg.FaceReflectLogic", "Face mState：stop detect");
        AppMethodBeat.o(788);
      }
    case 1:
    }
    ab.i("MicroMsg.FaceReflectLogic", "Face mState：detecting");
    paramArrayOfByte = this.mdV;
    ab.i("MicroMsg.FaceReflectLogic", "setFaceRect（）");
    paramArrayOfByte.mcd = paramArrayOfByte.mContext.getResources().getDisplayMetrics().widthPixels;
    paramArrayOfByte.mce = paramArrayOfByte.mContext.getResources().getDisplayMetrics().heightPixels;
    paramArrayOfByte.mcc.left = ((int)(paramArrayOfByte.mcd * 0.15D));
    paramArrayOfByte.mcc.right = ((int)(paramArrayOfByte.mcd * 0.85D));
    paramArrayOfByte.mcc.top = ((int)(paramArrayOfByte.mce * 0.2D));
    paramArrayOfByte.mcc.bottom = ((int)(paramArrayOfByte.mce * 0.65D));
    paramArrayOfByte = this.mdV;
    ab.i("MicroMsg.FaceReflectLogic", "setFaceLiveRect（）");
    ab.i("MicroMsg.FaceReflectLogic", "faceInPreviewFrame is".concat(String.valueOf(paramRect)));
    if (paramRect != null)
    {
      int i = paramArrayOfByte.mcd;
      paramInt = paramArrayOfByte.mce;
      int j = paramArrayOfByte.mDesiredPreviewWidth;
      int k = paramArrayOfByte.mDesiredPreviewHeight;
      paramArrayOfByte.mdS = (i / k);
      paramArrayOfByte.mdT = (paramInt / j);
      paramArrayOfByte.mcb.left = ((int)(paramRect.left * paramArrayOfByte.mdS));
      paramArrayOfByte.mcb.right = ((int)(paramRect.right * paramArrayOfByte.mdS));
      paramArrayOfByte.mcb.top = ((int)(paramRect.top * paramArrayOfByte.mdT));
      paramArrayOfByte.mcb.bottom = ((int)(paramRect.bottom * paramArrayOfByte.mdT));
      ab.i("MicroMsg.FaceReflectLogic", "mUiWidth：" + paramArrayOfByte.mcd);
      ab.i("MicroMsg.FaceReflectLogic", "mUiHeight：" + paramArrayOfByte.mce);
      ab.i("MicroMsg.FaceReflectLogic", "previewWidth：".concat(String.valueOf(j)));
      ab.i("MicroMsg.FaceReflectLogic", "previewHeight：".concat(String.valueOf(k)));
      ab.i("MicroMsg.FaceReflectLogic", "faceInPreviewFrame.right：" + paramRect.right);
      ab.i("MicroMsg.FaceReflectLogic", "mReflectWidthRatio：" + paramArrayOfByte.mdS);
    }
    paramRect = this.mdV;
    paramCamera = this.mdV.mcc;
    paramArrayOfByte = this.mdV.mcb;
    ab.i("MicroMsg.FaceReflectLogic", "getFacePreviewAdvise（）");
    if (paramFaceStatus == null)
    {
      ab.i("MicroMsg.FaceReflectLogic", "status == null");
      paramRect.mbZ.setText(2131299502);
    }
    while (true)
    {
      ab.i("MicroMsg.FaceReflectLogic", "Face end");
      break;
      boolean bool = paramCamera.contains(paramArrayOfByte);
      float f = (paramArrayOfByte.right - paramArrayOfByte.left) * (paramArrayOfByte.bottom - paramArrayOfByte.top) / ((paramCamera.right - paramCamera.left) * (paramCamera.bottom - paramCamera.top));
      ab.i("MicroMsg.FaceReflectLogic", "faceInScreen left is ：" + paramArrayOfByte.left);
      ab.i("MicroMsg.FaceReflectLogic", "faceInScreen right is ：" + paramArrayOfByte.right);
      ab.i("MicroMsg.FaceReflectLogic", "faceInScreen top is ：" + paramArrayOfByte.top);
      ab.i("MicroMsg.FaceReflectLogic", "faceInScreen bottom is ：" + paramArrayOfByte.bottom);
      ab.i("MicroMsg.FaceReflectLogic", "checkRect left is ：" + paramCamera.left);
      ab.i("MicroMsg.FaceReflectLogic", "checkRect right is ：" + paramCamera.right);
      ab.i("MicroMsg.FaceReflectLogic", "checkRect top is ：" + paramCamera.top);
      ab.i("MicroMsg.FaceReflectLogic", "checkRect bottom is ：" + paramCamera.bottom);
      ab.i("MicroMsg.FaceReflectLogic", "faceProportion ：".concat(String.valueOf(f)));
      ab.i("MicroMsg.FaceReflectLogic", "isInRect？ ：".concat(String.valueOf(bool)));
      ab.i("MicroMsg.FaceReflectLogic", "status".concat(String.valueOf(paramFaceStatus)));
      if (f < 0.3D)
      {
        ab.i("MicroMsg.FaceReflectLogic", "Detecting result：too far");
        paramRect.mbZ.setText(2131299507);
      }
      else if (f > 0.75D)
      {
        ab.i("MicroMsg.FaceReflectLogic", "Detecting result：too close");
        paramRect.mbZ.setText(2131299506);
      }
      else if (!bool)
      {
        ab.i("MicroMsg.FaceReflectLogic", "Detecting result：out of rect");
        paramRect.mbZ.setText(2131299502);
      }
      else if ((Math.abs(paramFaceStatus.pitch) > 15.0F) || (Math.abs(paramFaceStatus.yaw) > 15.0F) || (Math.abs(paramFaceStatus.roll) > 15.0F))
      {
        ab.i("MicroMsg.FaceReflectLogic", "Detecting result：INCORRECT_POSTURE");
        paramRect.mbZ.setText(2131299504);
      }
      else
      {
        ab.i("MicroMsg.FaceReflectLogic", "Detecting result：normal");
        paramRect.mbZ.setText(2131299503);
        paramRect.mdI.buc();
        YTFaceTraceInterface.stop();
        ab.i("MicroMsg.FaceReflectLogic", "YTFacePreviewInterface.stop()");
        if (a.btw().lZc)
          a.btw().EL();
        al.n(new c.2(paramRect), 2000L);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.c.1
 * JD-Core Version:    0.6.2
 */