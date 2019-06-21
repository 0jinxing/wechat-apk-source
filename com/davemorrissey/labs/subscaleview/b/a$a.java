package com.davemorrissey.labs.subscaleview.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import com.davemorrissey.labs.subscaleview.a.c;
import com.davemorrissey.labs.subscaleview.a.d;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;

final class a$a extends AsyncTask<Void, Void, Integer>
  implements com.davemorrissey.labs.subscaleview.c.b
{
  private final WeakReference<SubsamplingScaleImageView> aIp;
  private final WeakReference<Context> aIq;
  private final WeakReference<com.davemorrissey.labs.subscaleview.a.b<? extends d>> aIr;
  private final Uri aIs;
  private final boolean aIt;
  private c aIu;
  private long aIv;
  private Bitmap bitmap;
  private Exception exception;
  private Rect mRect;

  a$a(SubsamplingScaleImageView paramSubsamplingScaleImageView, Context paramContext, com.davemorrissey.labs.subscaleview.a.b<? extends d> paramb, Uri paramUri, boolean paramBoolean)
  {
    AppMethodBeat.i(115614);
    this.aIv = -1L;
    this.aIp = new WeakReference(paramSubsamplingScaleImageView);
    this.aIq = new WeakReference(paramContext);
    this.aIr = new WeakReference(paramb);
    this.aIs = paramUri;
    this.aIt = paramBoolean;
    paramSubsamplingScaleImageView = new BitmapFactory.Options();
    paramSubsamplingScaleImageView.inJustDecodeBounds = true;
    BitmapFactory.decodeFile(paramUri.getPath(), paramSubsamplingScaleImageView);
    this.mRect = new Rect(0, 0, paramSubsamplingScaleImageView.outWidth, paramSubsamplingScaleImageView.outHeight);
    AppMethodBeat.o(115614);
  }

  private void a(SubsamplingScaleImageView paramSubsamplingScaleImageView)
  {
    AppMethodBeat.i(115616);
    if ((paramSubsamplingScaleImageView != null) && (this.aIt) && (this.aIv != -1L))
    {
      ab.i("MicroMsg.LegacyBitmapLoaderFactory", "alvinluo preview decode onEnd %d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      paramSubsamplingScaleImageView.dp((int)(System.currentTimeMillis() - this.aIv));
    }
    AppMethodBeat.o(115616);
  }

  @SuppressLint({"LongLogTag"})
  private Integer ot()
  {
    AppMethodBeat.i(115615);
    ab.i("MicroMsg.LegacyBitmapLoaderFactory", "alvinluo preview decode start");
    if (this.aIt)
      this.aIv = System.currentTimeMillis();
    try
    {
      Object localObject1 = this.aIs.toString();
      Context localContext = (Context)this.aIq.get();
      Object localObject3 = (com.davemorrissey.labs.subscaleview.a.b)this.aIr.get();
      SubsamplingScaleImageView localSubsamplingScaleImageView = (SubsamplingScaleImageView)this.aIp.get();
      if ((localContext != null) && (localObject3 != null) && (localSubsamplingScaleImageView != null))
      {
        localSubsamplingScaleImageView.j("BitmapLoadTask.doInBackground", new Object[0]);
        localObject3 = (d)((com.davemorrissey.labs.subscaleview.a.b)localObject3).or();
        ((d)localObject3).c(localContext, this.aIs);
        this.bitmap = ((d)localObject3).b(this.mRect, 1);
        localObject1 = Integer.valueOf(localSubsamplingScaleImageView.h(localContext, (String)localObject1));
        ((d)localObject3).recycle();
        a(localSubsamplingScaleImageView);
        AppMethodBeat.o(115615);
        return localObject1;
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LegacyBitmapLoaderFactory", localFileNotFoundException, "alvinluo Failed to initialise bitmap decoder", new Object[0]);
        this.exception = localFileNotFoundException;
        this.aIu = new c(1, "tile init file not found");
        a((SubsamplingScaleImageView)this.aIp.get());
        Object localObject2 = null;
        AppMethodBeat.o(115615);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LegacyBitmapLoaderFactory", localException, "Failed to load bitmap", new Object[0]);
        this.exception = localException;
        this.aIu = new c(2, "bitmap decode failed");
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LegacyBitmapLoaderFactory", localOutOfMemoryError, "Failed to load bitmap - OutOfMemoryError", new Object[0]);
        this.exception = new RuntimeException(localOutOfMemoryError);
        this.aIu = new c(3, "bitmap decode OutOfMemoryError");
        SubsamplingScaleImageView.setPreferredBitmapConfig(Bitmap.Config.RGB_565);
      }
    }
  }

  public final void cancel()
  {
  }

  public final void ou()
  {
    AppMethodBeat.i(115617);
    executeOnExecutor(((SubsamplingScaleImageView)this.aIp.get()).executor, new Void[0]);
    AppMethodBeat.o(115617);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.b.a.a
 * JD-Core Version:    0.6.2
 */