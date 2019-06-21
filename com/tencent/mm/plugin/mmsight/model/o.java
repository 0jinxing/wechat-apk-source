package com.tencent.mm.plugin.mmsight.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.ab;

public final class o
{
  public int etz = 1;
  public int fay = -1;
  public VideoTransPara fcY;
  public int gLM = -1;
  public int ouK = -1;
  public boolean ouL = false;
  public boolean ouM = false;
  public boolean ouN = true;
  public boolean ouO = false;
  g.b ouP;
  public boolean ouw = false;
  public int videoBitrate;

  public o()
  {
  }

  private o(int paramInt, VideoTransPara paramVideoTransPara)
  {
    this.fcY = paramVideoTransPara;
    this.etz = paramInt;
    this.videoBitrate = paramVideoTransPara.videoBitrate;
    this.fay = paramVideoTransPara.width;
  }

  public static o a(int paramInt, VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76546);
    switch (paramInt)
    {
    default:
      paramVideoTransPara = null;
      AppMethodBeat.o(76546);
      return paramVideoTransPara;
    case 1:
      paramVideoTransPara = d(paramVideoTransPara);
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    }
    while (true)
    {
      if (paramVideoTransPara != null)
        paramVideoTransPara.ouK = paramInt;
      AppMethodBeat.o(76546);
      break;
      paramVideoTransPara = e(paramVideoTransPara);
      continue;
      paramVideoTransPara = f(paramVideoTransPara);
      continue;
      paramVideoTransPara = g(paramVideoTransPara);
      continue;
      paramVideoTransPara = h(paramVideoTransPara);
      continue;
      paramVideoTransPara = i(paramVideoTransPara);
      continue;
      paramVideoTransPara = j(paramVideoTransPara);
      continue;
      paramVideoTransPara = k(paramVideoTransPara);
      continue;
      paramVideoTransPara = l(paramVideoTransPara);
      continue;
      paramVideoTransPara = m(paramVideoTransPara);
      continue;
      paramVideoTransPara = n(paramVideoTransPara);
      continue;
      paramVideoTransPara = o(paramVideoTransPara);
    }
  }

  private o bPH()
  {
    this.fay = 1080;
    if ((this.gLM > 0) && (this.fay > this.gLM))
      this.fay = this.gLM;
    return this;
  }

  private static o d(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76547);
    ab.i("MicroMsg.RecoderParameter", "setToPresetConfig1");
    paramVideoTransPara = new o(2, paramVideoTransPara);
    paramVideoTransPara.ouM = false;
    AppMethodBeat.o(76547);
    return paramVideoTransPara;
  }

  private static o e(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76548);
    ab.i("MicroMsg.RecoderParameter", "setToPresetConfig2");
    paramVideoTransPara = new o(2, paramVideoTransPara);
    paramVideoTransPara.ouM = false;
    paramVideoTransPara = paramVideoTransPara.bPF().bPE();
    AppMethodBeat.o(76548);
    return paramVideoTransPara;
  }

  private static o f(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76549);
    ab.i("MicroMsg.RecoderParameter", "setToPresetConfig3");
    paramVideoTransPara = new o(1, paramVideoTransPara);
    paramVideoTransPara.ouM = false;
    AppMethodBeat.o(76549);
    return paramVideoTransPara;
  }

  private static o g(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76550);
    ab.i("MicroMsg.RecoderParameter", "setToPresetConfig4");
    paramVideoTransPara = new o(1, paramVideoTransPara);
    paramVideoTransPara.ouM = false;
    paramVideoTransPara = paramVideoTransPara.bPF().bPE();
    AppMethodBeat.o(76550);
    return paramVideoTransPara;
  }

  private static o h(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76551);
    ab.i("MicroMsg.RecoderParameter", "setToPresetConfig5");
    paramVideoTransPara = new o(2, paramVideoTransPara);
    paramVideoTransPara.ouM = true;
    paramVideoTransPara.ouL = false;
    paramVideoTransPara = paramVideoTransPara.bPE();
    AppMethodBeat.o(76551);
    return paramVideoTransPara;
  }

  private static o i(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76552);
    ab.i("MicroMsg.RecoderParameter", "setToPresetConfig6");
    paramVideoTransPara = new o(1, paramVideoTransPara);
    paramVideoTransPara.ouM = true;
    paramVideoTransPara = paramVideoTransPara.bPE();
    AppMethodBeat.o(76552);
    return paramVideoTransPara;
  }

  private static o j(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76553);
    ab.i("MicroMsg.RecoderParameter", "setToPresetConfig7");
    paramVideoTransPara = new o(2, paramVideoTransPara);
    paramVideoTransPara.ouM = true;
    paramVideoTransPara = paramVideoTransPara.bPG();
    paramVideoTransPara.ouL = false;
    AppMethodBeat.o(76553);
    return paramVideoTransPara;
  }

  private static o k(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76554);
    ab.i("MicroMsg.RecoderParameter", "setToPresetConfig8");
    paramVideoTransPara = new o(2, paramVideoTransPara);
    paramVideoTransPara.ouM = true;
    paramVideoTransPara = paramVideoTransPara.bPG();
    paramVideoTransPara.ouL = true;
    AppMethodBeat.o(76554);
    return paramVideoTransPara;
  }

  private static o l(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76555);
    paramVideoTransPara = new o(1, paramVideoTransPara);
    paramVideoTransPara.ouM = true;
    paramVideoTransPara = paramVideoTransPara.bPG();
    paramVideoTransPara.ouL = false;
    AppMethodBeat.o(76555);
    return paramVideoTransPara;
  }

  private static o m(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76556);
    ab.i("MicroMsg.RecoderParameter", "setToPresetConfig10");
    paramVideoTransPara = new o(1, paramVideoTransPara);
    paramVideoTransPara.ouM = true;
    paramVideoTransPara = paramVideoTransPara.bPG();
    paramVideoTransPara.ouL = true;
    AppMethodBeat.o(76556);
    return paramVideoTransPara;
  }

  private static o n(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76557);
    ab.i("MicroMsg.RecoderParameter", "setToPresetConfig10");
    paramVideoTransPara = new o(2, paramVideoTransPara);
    paramVideoTransPara.ouM = true;
    paramVideoTransPara = paramVideoTransPara.bPG();
    paramVideoTransPara.ouL = false;
    paramVideoTransPara = paramVideoTransPara.bPF();
    AppMethodBeat.o(76557);
    return paramVideoTransPara;
  }

  private static o o(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76558);
    ab.i("MicroMsg.RecoderParameter", "setToPresetConfig10");
    paramVideoTransPara = new o(2, paramVideoTransPara);
    paramVideoTransPara.ouM = true;
    paramVideoTransPara = paramVideoTransPara.bPH();
    paramVideoTransPara.ouL = false;
    paramVideoTransPara = paramVideoTransPara.bPF();
    AppMethodBeat.o(76558);
    return paramVideoTransPara;
  }

  public final o bPE()
  {
    this.fay = 720;
    if ((this.gLM > 0) && (this.fay > this.gLM))
      this.fay = this.gLM;
    return this;
  }

  public final o bPF()
  {
    this.videoBitrate = (this.fcY.videoBitrate * 2);
    this.ouO = true;
    return this;
  }

  public final o bPG()
  {
    this.fay = (this.fcY.width * 2);
    if ((this.gLM > 0) && (this.fay > this.gLM))
      this.fay = this.gLM;
    return this;
  }

  public final boolean bPI()
  {
    if (this.fcY.width < this.fay);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String toString()
  {
    AppMethodBeat.i(76559);
    String str = String.format("mediatype %s videoBitrate : %s isEnableLandscapeMode %s needRotateEachFrame %s isNeedRealtimeScale %s resolutionLimit %s videoParams %s", new Object[] { Integer.valueOf(this.etz), Integer.valueOf(this.videoBitrate), Boolean.valueOf(this.ouw), Boolean.valueOf(this.ouL), Boolean.valueOf(this.ouM), Integer.valueOf(this.fay), this.fcY });
    AppMethodBeat.o(76559);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.o
 * JD-Core Version:    0.6.2
 */