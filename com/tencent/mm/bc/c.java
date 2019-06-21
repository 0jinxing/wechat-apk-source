package com.tencent.mm.bc;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.v.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.j;
import java.io.File;

public final class c
{
  private static c fNb;
  private az fNc = null;

  public static c aiB()
  {
    AppMethodBeat.i(136864);
    if (fNb == null)
      fNb = new c();
    c localc = fNb;
    AppMethodBeat.o(136864);
    return localc;
  }

  public static String sW(String paramString)
  {
    AppMethodBeat.i(136865);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(136865);
    }
    while (true)
    {
      return paramString;
      paramString = j.b(a.ceV(), "remark_", g.x((paramString + "ZnVjaw==").getBytes()), ".png", 1);
      AppMethodBeat.o(136865);
    }
  }

  public static boolean sX(String paramString)
  {
    AppMethodBeat.i(136866);
    String str = sW(paramString);
    ab.d("MicroMsg.RemarkImageStorage", "remove remark image: %s, path:%s", new Object[] { paramString, str });
    boolean bool = new File(str).exists();
    AppMethodBeat.o(136866);
    return bool;
  }

  public static boolean sY(String paramString)
  {
    AppMethodBeat.i(136867);
    String str = sW(paramString);
    ab.d("MicroMsg.RemarkImageStorage", "remove remark image: %s, path:%s", new Object[] { paramString, str });
    boolean bool = e.deleteFile(str);
    AppMethodBeat.o(136867);
    return bool;
  }

  public static Bitmap sZ(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(136868);
    paramString = d.ap(sW(paramString), 0, 0);
    int j = i;
    if (paramString != null)
    {
      j = i;
      if (!paramString.isRecycled())
        j = 1;
    }
    if (j != 0)
      AppMethodBeat.o(136868);
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(136868);
    }
  }

  public final void a(String paramString1, String paramString2, c.a parama)
  {
    AppMethodBeat.i(136869);
    if ((!bo.isNullOrNil(paramString2)) && (!sX(paramString1)))
    {
      if ((this.fNc == null) || (this.fNc.dpg()))
        this.fNc = new az(1, "download-remark-img", 1);
      this.fNc.e(new c.b(this, paramString1, paramString2, parama));
    }
    AppMethodBeat.o(136869);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bc.c
 * JD-Core Version:    0.6.2
 */