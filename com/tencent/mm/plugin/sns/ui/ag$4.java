package com.tencent.mm.plugin.sns.ui;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.Exif;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

final class ag$4
  implements Runnable
{
  ag$4(ag paramag)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38480);
    long l = System.currentTimeMillis();
    Iterator localIterator = this.rlW.rlP.rma.iterator();
    Exif localExif;
    int i;
    label75: String str2;
    int j;
    int k;
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      localExif = Exif.fromFile(str1);
      if ((localExif.latitude >= 0.0D) && (localExif.longitude >= 0.0D))
      {
        i = 1;
        str2 = localExif.model;
        j = localExif.imageWidth;
        k = localExif.imageHeight;
        if ((j > 0) && (k > 0))
          break label241;
        BitmapFactory.Options localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str1, localOptions);
        j = localOptions.outWidth;
        k = localOptions.outHeight;
      }
    }
    label241: 
    while (true)
    {
      int m = (int)localExif.getUxtimeDatatimeOriginal();
      h.pYm.e(15523, new Object[] { Integer.valueOf(i), str2, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
      break;
      i = 0;
      break label75;
      ab.d("MicroMsg.PicWidget", "report photo info cost " + (System.currentTimeMillis() - l));
      AppMethodBeat.o(38480);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ag.4
 * JD-Core Version:    0.6.2
 */