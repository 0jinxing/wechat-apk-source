package com.davemorrissey.labs.subscaleview.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
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

final class b$a extends AsyncTask<Void, Void, int[]>
  implements com.davemorrissey.labs.subscaleview.c.b
{
  private final WeakReference<SubsamplingScaleImageView> aIp;
  private final WeakReference<Context> aIq;
  private final WeakReference<com.davemorrissey.labs.subscaleview.a.b<? extends d>> aIr;
  private final Uri aIs;
  private c aIu;
  private long aIv;
  private d aIw;
  private Exception exception;

  b$a(SubsamplingScaleImageView paramSubsamplingScaleImageView, Context paramContext, com.davemorrissey.labs.subscaleview.a.b<? extends d> paramb, Uri paramUri)
  {
    AppMethodBeat.i(115621);
    this.aIp = new WeakReference(paramSubsamplingScaleImageView);
    this.aIq = new WeakReference(paramContext);
    this.aIr = new WeakReference(paramb);
    this.aIs = paramUri;
    AppMethodBeat.o(115621);
  }

  private void a(SubsamplingScaleImageView paramSubsamplingScaleImageView)
  {
    AppMethodBeat.i(115623);
    if ((paramSubsamplingScaleImageView != null) && (this.aIv != -1L))
      paramSubsamplingScaleImageView.jdMethod_do((int)(System.currentTimeMillis() - this.aIv));
    AppMethodBeat.o(115623);
  }

  @SuppressLint({"LongLogTag"})
  private int[] ov()
  {
    AppMethodBeat.i(115622);
    ab.d("MicroMsg.LegacyTileInitLoaderFactory", "alvinluo TileInitTask doInBackground");
    this.aIv = System.currentTimeMillis();
    try
    {
      String str = this.aIs.toString();
      Object localObject1 = (Context)this.aIq.get();
      Object localObject2 = (com.davemorrissey.labs.subscaleview.a.b)this.aIr.get();
      Object localObject3 = (SubsamplingScaleImageView)this.aIp.get();
      if ((localObject1 != null) && (localObject2 != null) && (localObject3 != null))
      {
        this.aIw = ((d)((com.davemorrissey.labs.subscaleview.a.b)localObject2).or());
        localObject2 = this.aIw.c((Context)localObject1, this.aIs);
        int i = ((Point)localObject2).x;
        int j = ((Point)localObject2).y;
        int k = ((SubsamplingScaleImageView)localObject3).h((Context)localObject1, str);
        int m = i;
        int n = j;
        if (((SubsamplingScaleImageView)localObject3).getsRegion() != null)
        {
          localObject1 = ((SubsamplingScaleImageView)localObject3).getsRegion();
          ((Rect)localObject1).left = Math.max(0, ((Rect)localObject1).left);
          ((Rect)localObject1).top = Math.max(0, ((Rect)localObject1).top);
          ((Rect)localObject1).right = Math.min(i, ((Rect)localObject1).right);
          ((Rect)localObject1).bottom = Math.min(j, ((Rect)localObject1).bottom);
          m = ((Rect)localObject1).width();
          n = ((Rect)localObject1).height();
          ((SubsamplingScaleImageView)localObject3).setsRegion((Rect)localObject1);
        }
        a((SubsamplingScaleImageView)localObject3);
        localObject3 = new int[3];
        localObject3[0] = m;
        localObject3[1] = n;
        localObject3[2] = k;
        AppMethodBeat.o(115622);
        return localObject3;
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LegacyTileInitLoaderFactory", localFileNotFoundException, "alvinluo Failed to initialise bitmap decoder", new Object[0]);
        this.exception = localFileNotFoundException;
        this.aIu = new c(1, "tile init file not found");
        a((SubsamplingScaleImageView)this.aIp.get());
        Object localObject4 = null;
        AppMethodBeat.o(115622);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LegacyTileInitLoaderFactory", localException, "alvinluo Failed to initialise bitmap decoder", new Object[0]);
        this.exception = localException;
        this.aIu = new c(4, "tile init failed");
      }
    }
  }

  public final void cancel()
  {
  }

  public final void ou()
  {
    AppMethodBeat.i(115624);
    executeOnExecutor(((SubsamplingScaleImageView)this.aIp.get()).executor, new Void[0]);
    AppMethodBeat.o(115624);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.b.b.a
 * JD-Core Version:    0.6.2
 */