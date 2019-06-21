package com.davemorrissey.labs.subscaleview.b;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import android.os.AsyncTask;
import com.davemorrissey.labs.subscaleview.a.c;
import com.davemorrissey.labs.subscaleview.a.d;
import com.davemorrissey.labs.subscaleview.c.b;
import com.davemorrissey.labs.subscaleview.c.e;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

final class c$a extends AsyncTask<Void, Void, Bitmap>
  implements b
{
  private final WeakReference<SubsamplingScaleImageView> aIp;
  private c aIu;
  private final WeakReference<d> aIx;
  private final WeakReference<e> aIy;
  private Exception exception;
  private boolean isCancelled;
  private long mStartTime;

  c$a(SubsamplingScaleImageView paramSubsamplingScaleImageView, d paramd, e parame)
  {
    AppMethodBeat.i(115628);
    this.mStartTime = -1L;
    this.isCancelled = false;
    this.aIp = new WeakReference(paramSubsamplingScaleImageView);
    this.aIx = new WeakReference(paramd);
    this.aIy = new WeakReference(parame);
    parame.aIA = true;
    AppMethodBeat.o(115628);
  }

  private void a(SubsamplingScaleImageView paramSubsamplingScaleImageView, e parame)
  {
    AppMethodBeat.i(115630);
    if ((paramSubsamplingScaleImageView != null) && (parame != null) && (this.mStartTime != -1L) && (paramSubsamplingScaleImageView.getFullImageSampleSize() == parame.sampleSize))
      paramSubsamplingScaleImageView.dq((int)(System.currentTimeMillis() - this.mStartTime));
    AppMethodBeat.o(115630);
  }

  @SuppressLint({"LongLogTag"})
  private Bitmap ow()
  {
    AppMethodBeat.i(115629);
    if ((this.aIp.get() != null) && (this.aIy.get() != null) && (((SubsamplingScaleImageView)this.aIp.get()).getFullImageSampleSize() == ((e)this.aIy.get()).sampleSize))
      this.mStartTime = System.currentTimeMillis();
    try
    {
      localSubsamplingScaleImageView = (SubsamplingScaleImageView)this.aIp.get();
      Object localObject1 = (d)this.aIx.get();
      locale = (e)this.aIy.get();
      if ((localObject1 != null) && (locale != null) && (localSubsamplingScaleImageView != null) && (((d)localObject1).isReady()) && (locale.aIB))
      {
        ab.d("MicroMsg.LegacyTileLoaderFactory", "alvinluo TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", new Object[] { locale.aIz, Integer.valueOf(locale.sampleSize) });
        localSubsamplingScaleImageView.getDecoderLock().readLock().lock();
        try
        {
          if (((d)localObject1).isReady())
          {
            localRect1 = locale.aIz;
            localRect2 = locale.aID;
            if (localSubsamplingScaleImageView.getRequiredRotation() == 0)
              localRect2.set(localRect1);
            while (true)
            {
              if (localSubsamplingScaleImageView.getsRegion() != null)
                locale.aID.offset(localSubsamplingScaleImageView.getsRegion().left, localSubsamplingScaleImageView.getsRegion().top);
              ab.d("MicroMsg.LegacyTileLoaderFactory", "alvinluo tile sampleSize: %d", new Object[] { Integer.valueOf(locale.sampleSize) });
              localObject1 = ((d)localObject1).b(locale.aID, locale.sampleSize);
              a(localSubsamplingScaleImageView, locale);
              label288: return localObject1;
              if (localSubsamplingScaleImageView.getRequiredRotation() != 90)
                break;
              localRect2.set(localRect1.top, localSubsamplingScaleImageView.aIK - localRect1.right, localRect1.bottom, localSubsamplingScaleImageView.aIK - localRect1.left);
            }
          }
        }
        finally
        {
          localSubsamplingScaleImageView.getDecoderLock().readLock().unlock();
          AppMethodBeat.o(115629);
        }
      }
    }
    catch (Exception localException)
    {
      SubsamplingScaleImageView localSubsamplingScaleImageView;
      Rect localRect1;
      Rect localRect2;
      ab.printErrStackTrace("MicroMsg.LegacyTileLoaderFactory", localException, "Failed to decode tile", new Object[0]);
      this.exception = localException;
      this.aIu = new c(5, "decode tile failed");
      while (true)
      {
        a((SubsamplingScaleImageView)this.aIp.get(), (e)this.aIy.get());
        Object localObject3 = null;
        AppMethodBeat.o(115629);
        break label288;
        if (localSubsamplingScaleImageView.getRequiredRotation() == 180)
        {
          localRect2.set(localSubsamplingScaleImageView.aIJ - localRect1.right, localSubsamplingScaleImageView.aIK - localRect1.bottom, localSubsamplingScaleImageView.aIJ - localRect1.left, localSubsamplingScaleImageView.aIK - localRect1.top);
          break;
        }
        localRect2.set(localSubsamplingScaleImageView.aIJ - localRect1.bottom, localRect1.left, localSubsamplingScaleImageView.aIJ - localRect1.top, localRect1.right);
        break;
        locale.aIA = false;
        localSubsamplingScaleImageView.getDecoderLock().readLock().unlock();
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        e locale;
        ab.printErrStackTrace("MicroMsg.LegacyTileLoaderFactory", localOutOfMemoryError, "Failed to decode tile - OutOfMemoryError", new Object[0]);
        this.exception = new RuntimeException(localOutOfMemoryError);
        this.aIu = new c(6, "decode tile OutOfMemoryError");
        SubsamplingScaleImageView.setPreferredBitmapConfig(Bitmap.Config.RGB_565);
        continue;
        if (locale != null)
          locale.aIA = false;
      }
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(115632);
    try
    {
      cancel(true);
      this.isCancelled = true;
      AppMethodBeat.o(115632);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LegacyTileLoaderFactory", localException, "alvinluo TileLoaderTask cancel exception", new Object[0]);
        AppMethodBeat.o(115632);
      }
    }
  }

  public final void ou()
  {
    AppMethodBeat.i(115631);
    executeOnExecutor(((SubsamplingScaleImageView)this.aIp.get()).executor, new Void[0]);
    AppMethodBeat.o(115631);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.b.c.a
 * JD-Core Version:    0.6.2
 */