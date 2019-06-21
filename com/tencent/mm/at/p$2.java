package com.tencent.mm.at;

import android.graphics.Bitmap.CompressFormat;
import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;

final class p$2 extends AsyncTask<p.b, Integer, Integer>
{
  p$2(p paramp)
  {
  }

  private static Integer a(p.b[] paramArrayOfb)
  {
    AppMethodBeat.i(78397);
    if ((paramArrayOfb.length == 0) || (bo.isNullOrNil(paramArrayOfb[0].path)) || (paramArrayOfb[0].bitmap == null))
    {
      ab.e("MicroMsg.UrlImageCacheService", "nothing to save");
      AppMethodBeat.o(78397);
    }
    while (true)
    {
      return null;
      try
      {
        d.a(paramArrayOfb[0].bitmap, 100, Bitmap.CompressFormat.PNG, paramArrayOfb[0].path, false);
        AppMethodBeat.o(78397);
      }
      catch (IOException paramArrayOfb)
      {
        while (true)
          ab.e("MicroMsg.UrlImageCacheService", "save bitmap to image failed: " + paramArrayOfb.toString());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.p.2
 * JD-Core Version:    0.6.2
 */