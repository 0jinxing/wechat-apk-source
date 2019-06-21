package com.tencent.mm.bu;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.ttpic.PTFaceAttr;
import com.tencent.ttpic.PTFaceDetector;
import com.tencent.ttpic.util.BenchUtil;
import com.tencent.ttpic.util.VideoFilterUtil;
import com.tencent.ttpic.util.youtu.VideoPreviewFaceOutlineDetector;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/ptsdk/PTFaceDetectorProcess;", "", "faceDetectWidth", "", "(I)V", "faceDetector", "Lcom/tencent/ttpic/PTFaceDetector;", "lastHasFace", "", "lastRotation", "destroy", "", "detectFace", "Lcom/tencent/ttpic/PTFaceAttr;", "frame", "Lcom/tencent/filter/Frame;", "needGesture", "sync", "isAllFrameDetect", "getFaceDetector", "Lcom/tencent/ttpic/util/youtu/VideoPreviewFaceOutlineDetector;", "getPhotoAngle", "", "init", "updateFaceDetector", "Companion", "plugin-ptsdk_release"})
public final class b
{
  public static final b.a xtS;
  private int cjS;
  public PTFaceDetector xtP;
  private boolean xtQ;
  private final int xtR = 180;

  static
  {
    AppMethodBeat.i(71507);
    xtS = new b.a((byte)0);
    AppMethodBeat.o(71507);
  }

  private b()
  {
  }

  public b(char paramChar)
  {
    this((byte)0);
  }

  private final void dmC()
  {
    AppMethodBeat.i(71506);
    Object localObject = this.xtP;
    if (localObject != null)
    {
      localObject = ((PTFaceDetector)localObject).getFaceDetector();
      if (localObject != null)
      {
        ((VideoPreviewFaceOutlineDetector)localObject).clearActionCounter();
        AppMethodBeat.o(71506);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(71506);
    }
  }

  public final PTFaceAttr a(com.tencent.filter.h paramh, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(71503);
    j.p(paramh, "frame");
    try
    {
      int i = (VideoFilterUtil.get4DirectionAngle(getPhotoAngle()) + 360) % 360;
      double d = this.xtR * 1.0D / paramh.width;
      BenchUtil.benchStart("PTFaceDetector");
      PTFaceDetector localPTFaceDetector = this.xtP;
      if (localPTFaceDetector != null)
      {
        if (this.xtQ)
          i = this.cjS;
        paramh = localPTFaceDetector.detectFrame(paramh, null, i, true, paramBoolean1, false, d, paramBoolean2, paramBoolean3);
        if (paramh == null)
          break label147;
        if (paramh.getFaceCount() <= 0)
          break label142;
        paramBoolean1 = true;
        label104: this.xtQ = paramBoolean1;
        if (this.xtQ)
          this.cjS = paramh.getRotation();
      }
      while (true)
      {
        BenchUtil.benchEnd("PTFaceDetector");
        AppMethodBeat.o(71503);
        return paramh;
        paramh = null;
        break;
        label142: paramBoolean1 = false;
        break label104;
        label147: this.xtQ = false;
      }
    }
    catch (Exception paramh)
    {
      while (true)
      {
        com.tencent.mm.plugin.report.service.h.pYm.z(1012L, 50L);
        paramh = null;
        AppMethodBeat.o(71503);
      }
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(71505);
    ab.i("MicroMsg.PTFaceDetectorProcess", "destroy");
    try
    {
      PTFaceDetector localPTFaceDetector = this.xtP;
      if (localPTFaceDetector != null)
        localPTFaceDetector.destroy();
      this.xtP = null;
      AppMethodBeat.o(71505);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.mm.plugin.report.service.h.pYm.z(1012L, 51L);
    }
  }

  public final float getPhotoAngle()
  {
    AppMethodBeat.i(71502);
    Object localObject = this.xtP;
    float f;
    if (localObject != null)
    {
      localObject = ((PTFaceDetector)localObject).getFaceDetector();
      if (localObject != null)
      {
        f = ((VideoPreviewFaceOutlineDetector)localObject).getPhotoAngle();
        AppMethodBeat.o(71502);
      }
    }
    while (true)
    {
      return f;
      f = 0.0F;
      AppMethodBeat.o(71502);
    }
  }

  public final void init()
  {
    AppMethodBeat.i(71501);
    ab.i("MicroMsg.PTFaceDetectorProcess", "init");
    try
    {
      PTFaceDetector localPTFaceDetector = new com/tencent/ttpic/PTFaceDetector;
      localPTFaceDetector.<init>();
      this.xtP = localPTFaceDetector;
      localPTFaceDetector = this.xtP;
      if (localPTFaceDetector != null)
        localPTFaceDetector.init();
      dmC();
      AppMethodBeat.o(71501);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.plugin.report.service.h.pYm.z(1012L, 49L);
        AppMethodBeat.o(71501);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bu.b
 * JD-Core Version:    0.6.2
 */