package com.bumptech.glide.c.d.a;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.c.b.a.e;
import com.bumptech.glide.c.b.u;
import com.bumptech.glide.c.i;
import com.bumptech.glide.c.j;
import com.bumptech.glide.c.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

public final class r<T>
  implements k<T, Bitmap>
{
  public static final i<Long> aFJ;
  public static final i<Integer> aFK;
  private static final r.b aFL;
  private final r.c<T> aFM;
  private final r.b aFN;
  private final e awf;

  static
  {
    AppMethodBeat.i(92280);
    aFJ = i.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1L), new r.1());
    aFK = i.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", Integer.valueOf(2), new r.2());
    aFL = new r.b();
    AppMethodBeat.o(92280);
  }

  private r(e parame, r.c<T> paramc)
  {
    this(parame, paramc, aFL);
  }

  private r(e parame, r.c<T> paramc, r.b paramb)
  {
    this.awf = parame;
    this.aFM = paramc;
    this.aFN = paramb;
  }

  @TargetApi(27)
  private static Bitmap a(MediaMetadataRetriever paramMediaMetadataRetriever, long paramLong, int paramInt1, int paramInt2, int paramInt3, g paramg)
  {
    AppMethodBeat.i(92279);
    try
    {
      i = Integer.parseInt(paramMediaMetadataRetriever.extractMetadata(18));
      j = Integer.parseInt(paramMediaMetadataRetriever.extractMetadata(19));
      k = Integer.parseInt(paramMediaMetadataRetriever.extractMetadata(24));
      if ((k == 90) || (k == 270))
      {
        k = j;
        float f = paramg.l(k, i, paramInt2, paramInt3);
        paramMediaMetadataRetriever = paramMediaMetadataRetriever.getScaledFrameAtTime(paramLong, paramInt1, Math.round(k * f), Math.round(i * f));
        AppMethodBeat.o(92279);
        return paramMediaMetadataRetriever;
      }
    }
    catch (Throwable paramMediaMetadataRetriever)
    {
      while (true)
      {
        int j;
        Log.isLoggable("VideoDecoder", 3);
        paramMediaMetadataRetriever = null;
        AppMethodBeat.o(92279);
        continue;
        int k = i;
        int i = j;
      }
    }
  }

  public static k<AssetFileDescriptor, Bitmap> a(e parame)
  {
    AppMethodBeat.i(92276);
    parame = new r(parame, new r.a((byte)0));
    AppMethodBeat.o(92276);
    return parame;
  }

  public static k<ParcelFileDescriptor, Bitmap> b(e parame)
  {
    AppMethodBeat.i(92277);
    parame = new r(parame, new r.d());
    AppMethodBeat.o(92277);
    return parame;
  }

  public final u<Bitmap> a(T paramT, int paramInt1, int paramInt2, j paramj)
  {
    AppMethodBeat.i(92278);
    long l = ((Long)paramj.a(aFJ)).longValue();
    if ((l < 0L) && (l != -1L))
    {
      paramT = new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: ".concat(String.valueOf(l)));
      AppMethodBeat.o(92278);
      throw paramT;
    }
    Integer localInteger = (Integer)paramj.a(aFK);
    if (localInteger == null)
      localInteger = Integer.valueOf(2);
    while (true)
    {
      paramj = (g)paramj.a(g.aFh);
      if (paramj == null)
        paramj = g.aFg;
      while (true)
      {
        MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
        try
        {
          this.aFM.a(localMediaMetadataRetriever, paramT);
          int i = localInteger.intValue();
          localInteger = null;
          paramT = localInteger;
          if (Build.VERSION.SDK_INT >= 27)
          {
            paramT = localInteger;
            if (paramInt1 != -2147483648)
            {
              paramT = localInteger;
              if (paramInt2 != -2147483648)
              {
                paramT = localInteger;
                if (paramj != g.aFf)
                  paramT = a(localMediaMetadataRetriever, l, i, paramInt1, paramInt2, paramj);
              }
            }
          }
          paramj = paramT;
          if (paramT == null)
            paramj = localMediaMetadataRetriever.getFrameAtTime(l, i);
          localMediaMetadataRetriever.release();
          paramT = d.a(paramj, this.awf);
          AppMethodBeat.o(92278);
          return paramT;
        }
        catch (RuntimeException paramj)
        {
          paramT = new java/io/IOException;
          paramT.<init>(paramj);
          AppMethodBeat.o(92278);
          throw paramT;
        }
        finally
        {
          localMediaMetadataRetriever.release();
          AppMethodBeat.o(92278);
        }
      }
    }
  }

  public final boolean a(T paramT, j paramj)
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.d.a.r
 * JD-Core Version:    0.6.2
 */