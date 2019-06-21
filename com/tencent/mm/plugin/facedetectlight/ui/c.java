package com.tencent.mm.plugin.facedetectlight.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.plugin.facedetectlight.Utils.YTAGFaceReflectResult;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ju;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult;
import com.tencent.youtu.ytagreflectlivecheck.requester.LightDiffResponse;
import com.tencent.youtu.ytagreflectlivecheck.requester.UploadVideoRequester.UploadVideoResponse;
import com.tencent.youtu.ytfacetrace.YTFaceTraceInterface.FaceTraceingNotice;

public final class c
{
  int hGq;
  byte[] lWX;
  String mAppId;
  Context mContext;
  int mDesiredPreviewHeight;
  int mDesiredPreviewWidth;
  public int mState = 0;
  TextView mbZ;
  Rect mcb;
  Rect mcc;
  int mcd;
  int mce;
  YTFaceTraceInterface.FaceTraceingNotice mch;
  String mdC;
  public com.tencent.mm.plugin.facedetectlight.ui.a.b mdI;
  int mdQ;
  Point mdR;
  float mdS;
  float mdT;
  UploadVideoRequester.UploadVideoResponse mdU;
  t mdw;
  FaceReflectMask mdz;

  static String a(YTAGFaceReflectResult paramYTAGFaceReflectResult)
  {
    AppMethodBeat.i(800);
    if ((paramYTAGFaceReflectResult == null) || (paramYTAGFaceReflectResult.result != 0))
    {
      ab.e("MicroMsg.FaceReflectLogic", "carson  face result is null or result code not 0");
      AppMethodBeat.o(800);
      paramYTAGFaceReflectResult = null;
    }
    while (true)
    {
      return paramYTAGFaceReflectResult;
      try
      {
        String str = p.bsS();
        ju localju = new com/tencent/mm/protocal/protobuf/ju;
        localju.<init>();
        localju.vMj = com.tencent.mm.bt.b.bI(paramYTAGFaceReflectResult.sidedata);
        localju.vMk = com.tencent.mm.bt.b.bI(paramYTAGFaceReflectResult.data);
        p.d(localju.toByteArray(), str);
        AppMethodBeat.o(800);
        paramYTAGFaceReflectResult = str;
      }
      catch (Exception paramYTAGFaceReflectResult)
      {
        ab.printErrStackTrace("MicroMsg.FaceReflectLogic", paramYTAGFaceReflectResult, "", new Object[0]);
        AppMethodBeat.o(800);
        paramYTAGFaceReflectResult = null;
      }
    }
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(801);
    if ((this.mState == 0) || (this.mState == 1))
    {
      this.mdI.aB(90004, "user cancelled in processing");
      AppMethodBeat.o(801);
    }
    while (true)
    {
      return;
      if (this.mState == 2)
      {
        this.mdI.aB(90025, "user cancelled in intermediate page");
        AppMethodBeat.o(801);
      }
      else
      {
        if (this.mState == 3)
          this.mdI.aB(90006, "cancel with on stop");
        AppMethodBeat.o(801);
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(802);
    try
    {
      if ((this.mState == 0) || (this.mState == 1))
      {
        YTAGReflectLiveCheckInterface.cancel();
        AppMethodBeat.o(802);
      }
      while (true)
      {
        return;
        YTAGReflectLiveCheckInterface.releaseModel();
        AppMethodBeat.o(802);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FaceReflectLogic", localException, "release error, e: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(802);
      }
    }
  }

  public static final class a
  {
    private static c mdY;

    static
    {
      AppMethodBeat.i(799);
      mdY = new c((byte)0);
      AppMethodBeat.o(799);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.ui.c
 * JD-Core Version:    0.6.2
 */