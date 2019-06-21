package com.tencent.xweb.xwalk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.util.f;
import java.io.File;

public final class b extends c
{
  public final int a(d paramd)
  {
    AppMethodBeat.i(4177);
    int i;
    if (com.tencent.xweb.util.d.gA(paramd.path, paramd.cvZ))
    {
      SD(paramd.version);
      i = 0;
      AppMethodBeat.o(4177);
    }
    while (true)
    {
      return i;
      paramd = new File(paramd.path);
      if (paramd.exists())
        paramd.delete();
      f.dVt();
      i = -1;
      AppMethodBeat.o(4177);
    }
  }

  public final String aM(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(4176);
    String str = SE(paramInt);
    if ((str == null) || (str.isEmpty()))
    {
      str = "";
      AppMethodBeat.o(4176);
    }
    while (true)
    {
      return str;
      if (!paramBoolean)
      {
        str = str + File.separator + "xweb_fullscreen_video.js";
        AppMethodBeat.o(4176);
      }
      else
      {
        str = str + File.separator + "patch";
        AppMethodBeat.o(4176);
      }
    }
  }

  public final String dVM()
  {
    return "FullScreenVideo";
  }

  public final boolean dVN()
  {
    return true;
  }

  public final boolean dVO()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.a.b
 * JD-Core Version:    0.6.2
 */