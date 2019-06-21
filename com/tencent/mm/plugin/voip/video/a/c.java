package com.tencent.mm.plugin.voip.video.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;

public class c
{
  public static boolean loadLibSuccessed;

  static
  {
    AppMethodBeat.i(5135);
    loadLibSuccessed = false;
    checkLibraryInit();
    AppMethodBeat.o(5135);
  }

  public static void checkLibraryInit()
  {
    AppMethodBeat.i(5134);
    System.currentTimeMillis();
    if (!loadLibSuccessed);
    while (true)
    {
      try
      {
        k.a("image_filter_common", c.class.getClassLoader());
        k.a("image_filter_gpu", c.class.getClassLoader());
        k.a("format_convert", c.class.getClassLoader());
        k.a("YTCommon", c.class.getClassLoader());
        loadLibSuccessed = true;
        AppMethodBeat.o(5134);
        return;
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        loadLibSuccessed = false;
        AppMethodBeat.o(5134);
        continue;
      }
      catch (RuntimeException localRuntimeException)
      {
        loadLibSuccessed = false;
        AppMethodBeat.o(5134);
        continue;
      }
      catch (Exception localException)
      {
        loadLibSuccessed = false;
      }
      AppMethodBeat.o(5134);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.a.c
 * JD-Core Version:    0.6.2
 */