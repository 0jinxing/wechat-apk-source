package com.tencent.mm.plugin.facedetect.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.facedetect.model.d.b;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.plugin.mmsight.api.b;
import com.tencent.mm.plugin.mmsight.api.b.a;
import com.tencent.mm.plugin.mmsight.model.a.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;

public class a
{
  private static volatile a lYT;
  private static final String lZi;
  public static final String lZj;
  private static final String lZk;
  public com.tencent.mm.remoteservice.d ext;
  private com.tencent.mm.plugin.mmsight.model.a.d gLs;
  public al lYU;
  private final int lYV;
  private final int lYW;
  private final int lYX;
  private a.a lYY;
  private int lYZ;
  private boolean lZa;
  private int lZb;
  public boolean lZc;
  private a.b lZd;
  private int lZe;
  private int lZf;
  private String lZg;
  public b lZh;
  private d.b lZl;
  private d.a lZm;
  private String mFilePath;
  private final Object mLock;

  static
  {
    AppMethodBeat.i(571);
    lYT = null;
    lZi = p.bsO() + '/' + "fdv_";
    lZj = p.bsO() + '/' + "video_temp_test.mp4";
    lZk = p.bsO() + '/' + "fdv_t_";
    AppMethodBeat.o(571);
  }

  private a()
  {
    AppMethodBeat.i(559);
    this.mLock = new Object();
    this.lYU = null;
    this.lYV = 960;
    this.lYW = 540;
    this.lYX = 15;
    this.lYY = a.a.lZH;
    this.lYZ = 0;
    this.lZa = false;
    this.lZb = 0;
    this.lZc = false;
    this.lZd = null;
    this.lZe = -1;
    this.lZf = -1;
    this.mFilePath = "";
    this.lZg = "";
    this.ext = new com.tencent.mm.remoteservice.d(ah.getContext());
    this.lZh = b.ota.asm();
    this.lZl = new a.9(this);
    this.lZm = new a.2(this);
    this.lYU = new al("face_video_handler");
    AppMethodBeat.o(559);
  }

  private VideoTransPara btA()
  {
    AppMethodBeat.i(567);
    VideoTransPara localVideoTransPara = new VideoTransPara();
    localVideoTransPara.isDefault = true;
    localVideoTransPara.width = this.lZe;
    localVideoTransPara.height = this.lZf;
    localVideoTransPara.fps = 30;
    localVideoTransPara.videoBitrate = 1200000;
    localVideoTransPara.fzT = 10;
    localVideoTransPara.fzS = 64000;
    localVideoTransPara.fzU = 2;
    localVideoTransPara.fzV = 1;
    localVideoTransPara.audioSampleRate = 16000;
    localVideoTransPara.duration = 15;
    AppMethodBeat.o(567);
    return localVideoTransPara;
  }

  public static a btw()
  {
    AppMethodBeat.i(560);
    if (lYT == null);
    while (true)
    {
      try
      {
        if (lYT == null)
        {
          locala1 = new com/tencent/mm/plugin/facedetect/e/a;
          locala1.<init>();
          lYT = locala1;
        }
        a locala1 = lYT;
        return locala1;
      }
      finally
      {
        AppMethodBeat.o(560);
      }
      a locala2 = lYT;
      AppMethodBeat.o(560);
    }
  }

  public final boolean EL()
  {
    AppMethodBeat.i(563);
    ab.e("MicroMsg.FaceVideoRecorder", "carson: start Record Video");
    this.lYU.aa(new a.6(this));
    AppMethodBeat.o(563);
    return true;
  }

  public final void a(a.b paramb)
  {
    AppMethodBeat.i(565);
    ab.e("MicroMsg.FaceVideoRecorder", "carson: stop Record Video");
    this.lYU.aa(new a.8(this, paramb));
    AppMethodBeat.o(565);
  }

  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    AppMethodBeat.i(561);
    ab.i("MicroMsg.FaceVideoRecorder", "hy: init record");
    ab.i("MicroMsg.FaceVideoRecorder", "hy: cameraOrientation: %d, previewWidth: %d, previewHeight: %d,isLandscape: %b,  degree: %d, acceptVoiceFromOutside: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.FALSE, Integer.valueOf(0), Boolean.valueOf(paramBoolean) });
    VideoTransPara localVideoTransPara = btA();
    this.lZh.a(this.ext, localVideoTransPara);
    this.lYU.aa(new a.1(this, paramInt1, paramInt3, paramInt2, paramBoolean, paramInt4, paramInt5));
    AppMethodBeat.o(561);
    return true;
  }

  public final void aU(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(566);
    this.lYU.aa(new a.10(this, paramArrayOfByte));
    AppMethodBeat.o(566);
  }

  public final c.a btx()
  {
    AppMethodBeat.i(562);
    c.a locala;
    if (this.gLs != null)
    {
      locala = this.gLs.WQ();
      AppMethodBeat.o(562);
    }
    while (true)
    {
      return locala;
      ab.w("MicroMsg.FaceVideoRecorder", "hy: no media recorder");
      locala = null;
      AppMethodBeat.o(562);
    }
  }

  public final void bty()
  {
    AppMethodBeat.i(564);
    ab.e("MicroMsg.FaceVideoRecorder", "carson: cancel Record Video");
    this.lYU.aa(new a.7(this));
    AppMethodBeat.o(564);
  }

  public final a.a btz()
  {
    synchronized (this.mLock)
    {
      a.a locala = this.lYY;
      return locala;
    }
  }

  public final boolean isStarted()
  {
    synchronized (this.mLock)
    {
      if (this.lYY == a.a.lZJ)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.e.a
 * JD-Core Version:    0.6.2
 */