package com.tencent.tencentmap.mapsdk.a;

import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class dx
{
  public static boolean a;
  public static final String b;

  static
  {
    AppMethodBeat.i(101330);
    a = false;
    b = a() + "/js/nicolas/xkun/dynamic_map";
    AppMethodBeat.o(101330);
  }

  public static String a()
  {
    AppMethodBeat.i(101329);
    File localFile = Environment.getExternalStorageDirectory();
    String str = "/sdcard";
    if (localFile != null)
      str = localFile.getPath();
    AppMethodBeat.o(101329);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.dx
 * JD-Core Version:    0.6.2
 */