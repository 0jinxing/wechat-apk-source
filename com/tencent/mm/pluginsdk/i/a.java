package com.tencent.mm.pluginsdk.i;

import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
public final class a
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

  public static a diE()
  {
    AppMethodBeat.i(27461);
    a locala = new a();
    locala.fps = 30;
    locala.rotate = 0;
    locala.ouT = 640;
    locala.ouU = 480;
    locala.lZf = 640;
    locala.lZe = 480;
    locala.ouS = 1440000;
    locala.ouV = 1;
    locala.ouW = 4;
    locala.ouX = "/sdcard/1.yuv";
    locala.ovb = "/sdcard/1.mp4";
    locala.ouY = "/sdcard/1.pcm";
    locala.ova = "/sdcard/1.x264";
    locala.ovc = 0;
    locala.fXd = 0;
    locala.ovd = 0;
    AppMethodBeat.o(27461);
    return locala;
  }

  public static a diF()
  {
    AppMethodBeat.i(27462);
    a locala = new a();
    locala.fps = 30;
    locala.rotate = 0;
    locala.ouT = ouR;
    locala.ouU = ouQ;
    locala.lZf = ouR;
    locala.lZe = ouQ;
    locala.ouS = 327680;
    locala.ouV = 4;
    locala.ouW = 1;
    locala.ouX = "/sdcard/2.yuv";
    locala.ovb = "/sdcard/2.mp4";
    locala.ouY = "/sdcard/2.pcm";
    locala.ova = "/sdcard/2.x264";
    locala.ovc = 0;
    locala.fXd = 0;
    locala.ovd = 0;
    AppMethodBeat.o(27462);
    return locala;
  }

  public final String toString()
  {
    AppMethodBeat.i(27460);
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
    AppMethodBeat.o(27460);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.i.a
 * JD-Core Version:    0.6.2
 */