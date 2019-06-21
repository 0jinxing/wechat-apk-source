package com.tencent.mm.plugin.mmsight.segment;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.MediaMetadataRetriever;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Locale;

public final class k
  implements d
{
  private Paint aFY;
  private Matrix aKk;
  private Canvas bmG;
  private MediaMetadataRetriever oyl;
  private int oym;
  private int oyn;
  private Bitmap reuse;

  public k()
  {
    AppMethodBeat.i(3678);
    this.reuse = null;
    this.aFY = new Paint(1);
    this.bmG = new Canvas();
    AppMethodBeat.o(3678);
  }

  private static Bitmap ex(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(3684);
    try
    {
      Bitmap localBitmap1 = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
      AppMethodBeat.o(3684);
      return localBitmap1;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        ab.e("MediaCodecThumbFetcher", "%s OutOfMemory %s", new Object[] { g.Mq(), localOutOfMemoryError.getMessage() });
        System.gc();
        try
        {
          Bitmap localBitmap2 = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
        }
        catch (Exception localException)
        {
          ab.e("MediaCodecThumbFetcher", "%s try again Exception %s", new Object[] { g.Mq(), localException.getMessage() });
          Object localObject = null;
        }
      }
    }
  }

  private int getDuration()
  {
    int i = 0;
    AppMethodBeat.i(3682);
    String str = this.oyl.extractMetadata(9);
    if (str == null)
      AppMethodBeat.o(3682);
    while (true)
    {
      return i;
      try
      {
        int j = Integer.valueOf(str).intValue();
        i = j;
        AppMethodBeat.o(3682);
      }
      catch (Exception localException)
      {
        ab.e("MediaCodecThumbFetcher", "getDuration error %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(3682);
      }
    }
  }

  public final int getDurationMs()
  {
    AppMethodBeat.i(3681);
    int i = getDuration();
    AppMethodBeat.o(3681);
    return i;
  }

  public final Bitmap getFrameAtTime(long paramLong)
  {
    AppMethodBeat.i(3680);
    long l = System.currentTimeMillis();
    Bitmap localBitmap1 = this.oyl.getFrameAtTime(1000L * paramLong);
    int i = this.oym;
    int j = this.oyn;
    if ((localBitmap1 == null) || (localBitmap1.isRecycled()) || (i <= 0) || (j <= 0));
    for (Bitmap localBitmap2 = null; ; localBitmap2 = null)
    {
      localBitmap1.recycle();
      ab.d("MediaCodecThumbFetcher", "time flee : get video thumb bitmap cost time %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(3680);
      return localBitmap2;
      ab.d("MediaCodecThumbFetcher", "scaleBitmap(60) largeBitmap(width : %d, height : %d)", new Object[] { Integer.valueOf(localBitmap1.getWidth()), Integer.valueOf(localBitmap1.getHeight()) });
      localBitmap2 = ex(i, j);
      if (localBitmap2 != null)
        break;
    }
    int k;
    int m;
    Matrix localMatrix;
    if (this.aKk == null)
    {
      k = localBitmap1.getWidth();
      m = localBitmap1.getHeight();
      localMatrix = new Matrix();
      localMatrix.reset();
      localMatrix.setTranslate((i - k) / 2.0F, (j - m) / 2.0F);
      if (m / k <= j / i)
        break label289;
    }
    label289: for (float f = i / k; ; f = j / m)
    {
      localMatrix.postScale(f, f, i / 2.0F, j / 2.0F);
      this.aKk = localMatrix;
      this.bmG.setBitmap(localBitmap2);
      this.bmG.drawBitmap(localBitmap1, this.aKk, this.aFY);
      break;
    }
  }

  public final int getScaledHeight()
  {
    return this.oyn;
  }

  public final int getScaledWidth()
  {
    return this.oym;
  }

  public final void init(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(3679);
    if ((paramInt2 <= 0) || (paramInt3 <= 0))
    {
      paramString = new IllegalArgumentException(String.format(Locale.CHINA, "destination width and height error, width %d, height %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
      AppMethodBeat.o(3679);
      throw paramString;
    }
    try
    {
      MediaMetadataRetriever localMediaMetadataRetriever = new android/media/MediaMetadataRetriever;
      localMediaMetadataRetriever.<init>();
      this.oyl = localMediaMetadataRetriever;
      this.oyl.setDataSource(paramString);
      this.oym = paramInt2;
      this.oyn = paramInt3;
      AppMethodBeat.o(3679);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace("MediaCodecThumbFetcher", paramString, "init error:%s", new Object[] { paramString.getMessage() });
    }
  }

  public final void release()
  {
    AppMethodBeat.i(3683);
    if (this.oyl != null)
      this.oyl.release();
    this.aKk = null;
    this.aFY = null;
    this.bmG = null;
    AppMethodBeat.o(3683);
  }

  public final void reuseBitmap(Bitmap paramBitmap)
  {
    this.reuse = paramBitmap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.k
 * JD-Core Version:    0.6.2
 */