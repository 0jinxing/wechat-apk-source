package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.j;
import com.tencent.mm.plugin.mmsight.model.o;
import com.tencent.mm.storage.ac.a;

public final class k
{
  private static k owl;
  public SightParams owm;

  static
  {
    AppMethodBeat.i(76593);
    owl = new k();
    AppMethodBeat.o(76593);
  }

  public static k bPR()
  {
    return owl;
  }

  public static int bPT()
  {
    return j.ouz.videoBitrate;
  }

  public static int bPU()
  {
    return j.ouz.fay;
  }

  public static String bPV()
  {
    String str;
    switch (j.ouz.etz)
    {
    default:
      str = "";
    case 2:
    case 1:
    }
    while (true)
    {
      return str;
      str = "ENCODER_MEDIACODEC";
      continue;
      str = "RECORDER_TYPE_FFMPEG";
    }
  }

  public static boolean isDebug()
  {
    boolean bool = true;
    AppMethodBeat.i(76592);
    if (CaptureMMProxy.getInstance().getInt(ac.a.xPd, 0) == 1)
      AppMethodBeat.o(76592);
    while (true)
    {
      return bool;
      AppMethodBeat.o(76592);
      bool = false;
    }
  }

  public static d p(VideoTransPara paramVideoTransPara)
  {
    AppMethodBeat.i(76591);
    Object localObject = null;
    switch (j.ouz.etz)
    {
    default:
      paramVideoTransPara = localObject;
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(76591);
      return paramVideoTransPara;
      paramVideoTransPara = new n(paramVideoTransPara);
      continue;
      paramVideoTransPara = new l(paramVideoTransPara);
    }
  }

  public final SightParams bPS()
  {
    return this.owm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.k
 * JD-Core Version:    0.6.2
 */