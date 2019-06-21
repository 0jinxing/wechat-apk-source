package com.tencent.mm.plugin.fts;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import java.io.File;
import java.io.IOException;

final class c$d
  implements Runnable
{
  private c.a mBb;

  public c$d(c paramc, c.a parama)
  {
    this.mBb = parama;
  }

  public final void run()
  {
    AppMethodBeat.i(136526);
    ab.d("MicroMsg.FTS.FTSImageLoader", "Start to run save bitmap job");
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(this.mBb.cHg);
      if (!localFile.exists())
        if ((this.mBb.bitmap != null) && (!this.mBb.bitmap.isRecycled()))
        {
          long l = System.currentTimeMillis();
          d.a(this.mBb.bitmap, 100, Bitmap.CompressFormat.PNG, this.mBb.cHg, false);
          ab.d("MicroMsg.FTS.FTSImageLoader", "Save bitmap use time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          AppMethodBeat.o(136526);
        }
      while (true)
      {
        return;
        ab.d("MicroMsg.FTS.FTSImageLoader", "Save Bitmap is Recycled");
        AppMethodBeat.o(136526);
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FTS.FTSImageLoader", localIOException, "", new Object[0]);
        AppMethodBeat.o(136526);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.c.d
 * JD-Core Version:    0.6.2
 */