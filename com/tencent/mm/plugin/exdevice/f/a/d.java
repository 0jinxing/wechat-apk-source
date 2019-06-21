package com.tencent.mm.plugin.exdevice.f.a;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;

public final class d
{
  private static final String lvq;
  private static final String lvr;

  static
  {
    AppMethodBeat.i(19438);
    lvq = e.euZ + "uploaded_photos/";
    lvr = e.euZ + "temp/";
    AppMethodBeat.o(19438);
  }

  public static String Km(String paramString)
  {
    AppMethodBeat.i(19436);
    if (bo.isNullOrNil(paramString));
    for (String str = ""; ; str = j.w(new b(bpj(), str).dMD()))
    {
      com.tencent.mm.sdk.platformtools.d.c(paramString, 640, 640, Bitmap.CompressFormat.JPEG, 100, str);
      System.currentTimeMillis();
      AppMethodBeat.o(19436);
      return str;
      str = ag.ck(paramString);
      str = str + "_t";
    }
  }

  public static b bpj()
  {
    AppMethodBeat.i(19437);
    b localb = new b(lvq);
    if ((!localb.exists()) || (!localb.isDirectory()))
      localb.mkdirs();
    AppMethodBeat.o(19437);
    return localb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.d
 * JD-Core Version:    0.6.2
 */