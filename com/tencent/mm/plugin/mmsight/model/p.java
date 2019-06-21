package com.tencent.mm.plugin.mmsight.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p
{
  public static int ouQ = 480;
  public static int ouR = 640;
  public int fXd;
  public int fps;
  public int lZe;
  public int lZf;
  public int ouS;
  public int ouT;
  public int ouU;
  public int ouV;
  public int ouW;
  public String ouX;
  public String ouY;
  public String ouZ;
  public String ova;
  public String ovb;
  public int ovc;
  public int ovd;
  public int rotate;

  public static p bPJ()
  {
    AppMethodBeat.i(76561);
    p localp = new p();
    localp.fps = 30;
    localp.rotate = 0;
    localp.ouT = ouR;
    localp.ouU = ouQ;
    localp.lZf = ouR;
    localp.lZe = ouQ;
    localp.ouS = 327680;
    localp.ouV = 4;
    localp.ouW = 1;
    localp.ouX = "/sdcard/2.yuv";
    localp.ovb = "/sdcard/2.mp4";
    localp.ouY = "/sdcard/2.pcm";
    localp.ova = "/sdcard/2.x264";
    localp.ovc = 0;
    localp.fXd = 0;
    localp.ovd = 0;
    AppMethodBeat.o(76561);
    return localp;
  }

  public final String toString()
  {
    AppMethodBeat.i(76560);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("fps=").append(this.fps).append('\n');
    ((StringBuilder)localObject).append("width=").append(this.lZe).append('\n');
    ((StringBuilder)localObject).append("height=").append(this.lZf).append('\n');
    ((StringBuilder)localObject).append("bitrate=").append(this.ouS).append('\n');
    ((StringBuilder)localObject).append("rotate=").append(this.rotate).append('\n');
    ((StringBuilder)localObject).append("yuvWidth=").append(this.ouU).append('\n');
    ((StringBuilder)localObject).append("yuvHeight=").append(this.ouT).append('\n');
    ((StringBuilder)localObject).append("x264Speed=").append(this.ouV).append('\n');
    ((StringBuilder)localObject).append("x264Quality=").append(this.ouW).append('\n');
    ((StringBuilder)localObject).append("yuvFile=").append(this.ouX).append('\n');
    ((StringBuilder)localObject).append("pcmFile=").append(this.ouY).append('\n');
    ((StringBuilder)localObject).append("thuFile=").append(this.ouZ).append('\n');
    ((StringBuilder)localObject).append("x264File=").append(this.ova).append('\n');
    ((StringBuilder)localObject).append("mp4File=").append(this.ovb).append('\n');
    ((StringBuilder)localObject).append("videoFrameCnt=").append(this.ovc).append('\n');
    ((StringBuilder)localObject).append("videoLength=").append(this.fXd).append('\n');
    ((StringBuilder)localObject).append("cameraCount=").append(this.ovd).append('\n');
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(76560);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.p
 * JD-Core Version:    0.6.2
 */