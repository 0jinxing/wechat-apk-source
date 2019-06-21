package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Asserts;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class ImageManager$zze
  implements Runnable
{
  private final Bitmap mBitmap;
  private final Uri mUri;
  private final CountDownLatch zzfd;
  private boolean zzpj;

  public ImageManager$zze(ImageManager paramImageManager, Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
  {
    this.mUri = paramUri;
    this.mBitmap = paramBitmap;
    this.zzpj = paramBoolean;
    this.zzfd = paramCountDownLatch;
  }

  public final void run()
  {
    AppMethodBeat.i(61215);
    Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
    int i;
    if (this.mBitmap != null)
    {
      i = 1;
      if (ImageManager.zzh(this.zzpg) == null)
        break label107;
      if (!this.zzpj)
        break label77;
      ImageManager.zzh(this.zzpg).evictAll();
      System.gc();
      this.zzpj = false;
      ImageManager.zzg(this.zzpg).post(this);
      AppMethodBeat.o(61215);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label77: if (i != 0)
        ImageManager.zzh(this.zzpg).put(new ImageRequest.zza(this.mUri), this.mBitmap);
      label107: ??? = (ImageManager.ImageReceiver)ImageManager.zze(this.zzpg).remove(this.mUri);
      if (??? != null)
      {
        ArrayList localArrayList = ImageManager.ImageReceiver.zza((ImageManager.ImageReceiver)???);
        int j = localArrayList.size();
        int k = 0;
        if (k < j)
        {
          ??? = (ImageRequest)localArrayList.get(k);
          if (i != 0)
            ((ImageRequest)???).zza(ImageManager.zzb(this.zzpg), this.mBitmap, false);
          while (true)
          {
            if (!(??? instanceof ImageRequest.ListenerImageRequest))
              ImageManager.zza(this.zzpg).remove(???);
            k++;
            break;
            ImageManager.zzd(this.zzpg).put(this.mUri, Long.valueOf(SystemClock.elapsedRealtime()));
            ((ImageRequest)???).zza(ImageManager.zzb(this.zzpg), ImageManager.zzc(this.zzpg), false);
          }
        }
      }
      this.zzfd.countDown();
      synchronized (ImageManager.zzcm())
      {
        ImageManager.zzcn().remove(this.mUri);
        AppMethodBeat.o(61215);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.zze
 * JD-Core Version:    0.6.2
 */