package com.tencent.mm.plugin.facedetectaction.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.facedetect.e.a;
import com.tencent.mm.plugin.facedetect.e.a.3;
import com.tencent.mm.plugin.mmsight.api.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class d$2
  implements Runnable
{
  d$2(d paramd, byte[][] paramArrayOfByte, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(692);
    d.a(this.mcB, new e(d.a(this.mcB), d.b(this.mcB), d.c(this.mcB), d.d(this.mcB), d.e(this.mcB)));
    d.g(this.mcB).mcE = new d.2.1(this);
    e locale = d.g(this.mcB);
    Object localObject = this.mcC;
    int i = this.hHo;
    int j = this.hHp;
    VideoTransPara localVideoTransPara;
    int k;
    int m;
    a locala;
    int n;
    int i1;
    if ((localObject != null) && (i > 0) && (j > 0))
    {
      ab.i("MicroMsg.FaceCheckVideoRecordMgr", "recordAllPostDetectFrames, width: %s, height: %s, frames.size: %s, cameraFrameWidth: %s, cameraFrameHeight: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localObject.length), Integer.valueOf(locale.mcz), Integer.valueOf(locale.mcA) });
      localVideoTransPara = new VideoTransPara();
      localVideoTransPara.isDefault = true;
      localVideoTransPara.width = i;
      localVideoTransPara.height = j;
      localVideoTransPara.fps = 30;
      localVideoTransPara.videoBitrate = 12000000;
      localVideoTransPara.fzT = 10;
      localVideoTransPara.fzS = 64000;
      localVideoTransPara.fzU = 2;
      localVideoTransPara.fzV = 1;
      localVideoTransPara.audioSampleRate = 16000;
      localVideoTransPara.duration = 15;
      k = localObject.length;
      m = localVideoTransPara.fps;
      localVideoTransPara.videoBitrate = 3686400;
      if (locale.mcu > 0.0F)
        localVideoTransPara.videoBitrate = ((int)(localVideoTransPara.videoBitrate * locale.mcu));
      ab.i("MicroMsg.FaceCheckVideoRecordMgr", "final video bitrate: %s", new Object[] { Integer.valueOf(localVideoTransPara.videoBitrate) });
      if ((locale.mcz == i) && (locale.mcA == j))
        break label557;
      ab.e("MicroMsg.FaceCheckVideoRecordMgr", "camera frame size and sdk output size not match!!!");
      if ((localObject == null) || (localObject[0] == null))
        break label557;
      locala = localObject[0];
      ab.i("MicroMsg.FaceCheckVideoRecordMgr", "first frame size: %s", new Object[] { Integer.valueOf(locala.length) });
      if ((locala.length == i * j * 3 / 2) || (locala.length != locale.mcz * locale.mcA * 3 / 2))
        break label557;
      n = locale.mcz;
      i1 = locale.mcA;
    }
    while (true)
    {
      locala = a.btw();
      int i2 = locale.orientation;
      localObject = new e.1(locale, k * m, localVideoTransPara, (byte[][])localObject);
      ab.i("MicroMsg.FaceVideoRecorder", "initRecorderForActionVerify");
      ab.i("MicroMsg.FaceVideoRecorder", "hy: cameraOrientation: %d, previewWidth: %d, previewHeight: %d,isLandscape: %b,  degree: %d, param: %s", new Object[] { Integer.valueOf(i2), Integer.valueOf(n), Integer.valueOf(i1), Boolean.FALSE, Integer.valueOf(0), localVideoTransPara });
      locala.lZh.b(locala.ext, localVideoTransPara);
      locala.lYU.aa(new a.3(locala, i2, i1, n, i, j, (Runnable)localObject));
      AppMethodBeat.o(692);
      return;
      label557: i1 = j;
      n = i;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.b.d.2
 * JD-Core Version:    0.6.2
 */