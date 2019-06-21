package com.tencent.xweb.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import org.xwalk.core.Log;

public class BSpatch
{
  static
  {
    AppMethodBeat.i(4000);
    k.a("bspatch_utils", BSpatch.class.getClassLoader());
    AppMethodBeat.o(4000);
  }

  public static int aH(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(3999);
    Log.i("BSpatch", "doPatch oldFile:" + paramString1 + ",patchFile:" + paramString2 + ",newFile:" + paramString3);
    long l = System.currentTimeMillis();
    f.dVh();
    int i = 0;
    String str = paramString3;
    if (paramString1.equals(paramString3))
    {
      str = paramString1 + ".temp";
      i = 1;
    }
    int j = new BSpatch().nativeDoPatch(paramString1, paramString2, str);
    if (j < 0)
    {
      Log.i("BSpatch", "doPatch failed");
      f.dVi();
    }
    while (true)
    {
      AppMethodBeat.o(3999);
      i = j;
      while (true)
      {
        return i;
        Log.i("BSpatch", "doPatch successful");
        if (i == 0)
          break label180;
        if (b.copyFile(str, paramString1))
          break;
        Log.e("BSpatch", "doPatch same path, copy failed");
        i = -1;
        AppMethodBeat.o(3999);
      }
      b.deleteFile(str);
      label180: f.nP(System.currentTimeMillis() - l);
    }
  }

  public native int nativeDoPatch(String paramString1, String paramString2, String paramString3);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.util.BSpatch
 * JD-Core Version:    0.6.2
 */