package com.tencent.mm.plugin.facedetectaction.b;

import android.content.res.Resources;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.DisplayMetrics;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.youtu.ytfacetrace.YTFaceTraceInterface.FaceTraceingNotice;
import com.tencent.youtu.ytfacetrace.jni.YTFaceTraceJNIInterface.FaceStatus;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectResult;

public final class a$1
  implements YTFaceTraceInterface.FaceTraceingNotice
{
  public a$1(a parama)
  {
  }

  public final void onTracing(int paramInt, YTFaceTraceJNIInterface.FaceStatus paramFaceStatus, Rect paramRect, byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(678);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(678);
    case 0:
    case 2:
    case 1:
    }
    a locala;
    while (true)
    {
      return;
      ab.i("MicroMsg.FaceActionLogic", "Face mState：init");
      YTPoseDetectInterface.start(ah.getContext(), this.mcj.mCamera, this.mcj.hGq, new YTPoseDetectInterface.PoseDetectResult()
      {
        public final void onFailed(int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
        {
          AppMethodBeat.i(677);
          ab.i("MicroMsg.FaceActionLogic", "YTPoseDetectInterface start failed：[%s],[%s]", new Object[] { paramAnonymousString1, paramAnonymousString2 });
          AppMethodBeat.o(677);
        }

        public final void onSuccess()
        {
          AppMethodBeat.i(676);
          ab.i("MicroMsg.FaceActionLogic", "YTPoseDetectInterface start success");
          AppMethodBeat.o(676);
        }
      });
      AppMethodBeat.o(678);
      continue;
      ab.i("MicroMsg.FaceActionLogic", "Face mState：stop detect");
      AppMethodBeat.o(678);
      continue;
      ab.i("MicroMsg.FaceActionLogic", "Face mState：detecting");
      paramCamera = this.mcj;
      ab.i("MicroMsg.FaceActionLogic", "setFaceRect（）");
      paramCamera.mcd = paramCamera.mbY.getResources().getDisplayMetrics().widthPixels;
      paramCamera.mce = paramCamera.mbY.getResources().getDisplayMetrics().heightPixels;
      paramCamera.mcc.left = ((int)(paramCamera.mcd * 0.15D));
      paramCamera.mcc.right = ((int)(paramCamera.mcd * 0.85D));
      paramCamera.mcc.top = ((int)(paramCamera.mce * 0.2D));
      paramCamera.mcc.bottom = ((int)(paramCamera.mce * 0.65D));
      paramCamera = this.mcj;
      ab.i("MicroMsg.FaceActionLogic", "setFaceLiveRect（）");
      ab.i("MicroMsg.FaceActionLogic", "faceInPreviewFrame is".concat(String.valueOf(paramRect)));
      if (paramRect != null)
      {
        int i = paramCamera.mcd;
        int j = paramCamera.mce;
        int k = paramCamera.mDesiredPreviewWidth;
        paramInt = paramCamera.mDesiredPreviewHeight;
        paramCamera.mcf = (i / paramInt);
        paramCamera.mcg = (j / k);
        paramCamera.mcb.left = ((int)(paramRect.left * paramCamera.mcf));
        paramCamera.mcb.right = ((int)(paramRect.right * paramCamera.mcf));
        paramCamera.mcb.top = ((int)(paramRect.top * paramCamera.mcg));
        paramCamera.mcb.bottom = ((int)(paramRect.bottom * paramCamera.mcg));
        ab.i("MicroMsg.FaceActionLogic", "mUiWidth：" + paramCamera.mcd);
        ab.i("MicroMsg.FaceActionLogic", "mUiHeight：" + paramCamera.mce);
        ab.i("MicroMsg.FaceActionLogic", "previewWidth：".concat(String.valueOf(k)));
        ab.i("MicroMsg.FaceActionLogic", "previewHeight：".concat(String.valueOf(paramInt)));
        ab.i("MicroMsg.FaceActionLogic", "faceInPreviewFrame.right：" + paramRect.right);
        ab.i("MicroMsg.FaceActionLogic", "mWidthRatio：" + paramCamera.mcf);
      }
      locala = this.mcj;
      paramRect = this.mcj.mcc;
      paramCamera = this.mcj.mcb;
      ab.i("MicroMsg.FaceActionLogic", "getFacePreviewAdvise（）");
      if (paramFaceStatus == null)
      {
        ab.i("MicroMsg.FaceActionLogic", "status == null");
        locala.mbZ.setText(2131299502);
        AppMethodBeat.o(678);
      }
      else
      {
        boolean bool = paramRect.contains(paramCamera);
        float f = (paramCamera.right - paramCamera.left) * (paramCamera.bottom - paramCamera.top) / ((paramRect.right - paramRect.left) * (paramRect.bottom - paramRect.top));
        ab.i("MicroMsg.FaceActionLogic", "faceInScreen left is ：" + paramCamera.left);
        ab.i("MicroMsg.FaceActionLogic", "faceInScreen right is ：" + paramCamera.right);
        ab.i("MicroMsg.FaceActionLogic", "faceInScreen top is ：" + paramCamera.top);
        ab.i("MicroMsg.FaceActionLogic", "faceInScreen bottom is ：" + paramCamera.bottom);
        ab.i("MicroMsg.FaceActionLogic", "checkRect left is ：" + paramRect.left);
        ab.i("MicroMsg.FaceActionLogic", "checkRect right is ：" + paramRect.right);
        ab.i("MicroMsg.FaceActionLogic", "checkRect top is ：" + paramRect.top);
        ab.i("MicroMsg.FaceActionLogic", "checkRect bottom is ：" + paramRect.bottom);
        ab.i("MicroMsg.FaceActionLogic", "faceProportion ：".concat(String.valueOf(f)));
        ab.i("MicroMsg.FaceActionLogic", "isInRect？ ：".concat(String.valueOf(bool)));
        ab.i("MicroMsg.FaceActionLogic", "status".concat(String.valueOf(paramFaceStatus)));
        if (f < 0.3D)
        {
          ab.i("MicroMsg.FaceActionLogic", "Detecting result：too far");
          locala.mbZ.setText(2131299507);
          AppMethodBeat.o(678);
        }
        else if (f > 0.75D)
        {
          ab.i("MicroMsg.FaceActionLogic", "Detecting result：too close");
          locala.mbZ.setText(2131299506);
          AppMethodBeat.o(678);
        }
        else
        {
          if (bool)
            break;
          ab.i("MicroMsg.FaceActionLogic", "Detecting result：out of rect");
          locala.mbZ.setText(2131299502);
          AppMethodBeat.o(678);
        }
      }
    }
    ab.i("MicroMsg.FaceActionLogic", "Detecting result：normal");
    ab.i("MicroMsg.FaceActionLogic", "action：%s,mActionHint:%s", new Object[] { Integer.valueOf(locala.mbW), locala.mbX });
    if (locala.mbX != null)
      locala.mbZ.setText(locala.mbX);
    while (true)
    {
      locala.mca.a(paramFaceStatus, paramArrayOfByte);
      break;
      switch (locala.mbW)
      {
      default:
        break;
      case 0:
        locala.mbZ.setText(2131299431);
        break;
      case 1:
        locala.mbZ.setText(2131299429);
        break;
      case 2:
        locala.mbZ.setText(2131299430);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.b.a.1
 * JD-Core Version:    0.6.2
 */