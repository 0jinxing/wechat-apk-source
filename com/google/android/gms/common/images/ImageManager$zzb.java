package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.Asserts;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

final class ImageManager$zzb
  implements Runnable
{
  private final Uri mUri;
  private final ParcelFileDescriptor zzph;

  public ImageManager$zzb(ImageManager paramImageManager, Uri paramUri, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.mUri = paramUri;
    this.zzph = paramParcelFileDescriptor;
  }

  public final void run()
  {
    AppMethodBeat.i(61211);
    Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
    boolean bool1 = false;
    boolean bool2 = false;
    Bitmap localBitmap = null;
    CountDownLatch localCountDownLatch = null;
    if (this.zzph != null);
    try
    {
      localBitmap = BitmapFactory.decodeFileDescriptor(this.zzph.getFileDescriptor());
      bool1 = bool2;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      try
      {
        while (true)
        {
          this.zzph.close();
          label46: localCountDownLatch = new CountDownLatch(1);
          ImageManager.zzg(this.zzpg).post(new ImageManager.zze(this.zzpg, this.mUri, localBitmap, bool1, localCountDownLatch));
          try
          {
            localCountDownLatch.await();
            AppMethodBeat.o(61211);
            return;
            localOutOfMemoryError = localOutOfMemoryError;
            Object localObject = String.valueOf(this.mUri);
            new StringBuilder(String.valueOf(localObject).length() + 34).append("OOM while loading bitmap for uri: ").append((String)localObject);
            bool1 = true;
            localObject = localCountDownLatch;
          }
          catch (InterruptedException localInterruptedException)
          {
            while (true)
            {
              String str = String.valueOf(this.mUri);
              new StringBuilder(String.valueOf(str).length() + 32).append("Latch interrupted while posting ").append(str);
              AppMethodBeat.o(61211);
            }
          }
        }
      }
      catch (IOException localIOException)
      {
        break label46;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.zzb
 * JD-Core Version:    0.6.2
 */