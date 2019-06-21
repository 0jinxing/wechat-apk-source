package com.davemorrissey.labs.subscaleview.a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class e
  implements d
{
  private BitmapRegionDecoder aIn;
  private final ReadWriteLock aIo;
  private final Bitmap.Config ayC;

  public e()
  {
    this((byte)0);
  }

  private e(byte paramByte)
  {
    AppMethodBeat.i(115608);
    this.aIo = new ReentrantReadWriteLock(true);
    Bitmap.Config localConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
    if (localConfig != null)
    {
      this.ayC = localConfig;
      AppMethodBeat.o(115608);
    }
    while (true)
    {
      return;
      this.ayC = Bitmap.Config.RGB_565;
      AppMethodBeat.o(115608);
    }
  }

  private Lock os()
  {
    AppMethodBeat.i(115613);
    Lock localLock;
    if (Build.VERSION.SDK_INT < 21)
    {
      localLock = this.aIo.writeLock();
      AppMethodBeat.o(115613);
    }
    while (true)
    {
      return localLock;
      localLock = this.aIo.readLock();
      AppMethodBeat.o(115613);
    }
  }

  public final Bitmap b(Rect paramRect, int paramInt)
  {
    AppMethodBeat.i(115610);
    os().lock();
    try
    {
      if ((this.aIn == null) || (this.aIn.isRecycled()))
        break label116;
      BitmapFactory.Options localOptions = new android/graphics/BitmapFactory$Options;
      localOptions.<init>();
      localOptions.inSampleSize = paramInt;
      localOptions.inPreferredConfig = this.ayC;
      paramRect = this.aIn.decodeRegion(paramRect, localOptions);
      if (paramRect == null)
      {
        paramRect = new java/lang/RuntimeException;
        paramRect.<init>("Skia image decoder returned null bitmap - image format may not be supported");
        AppMethodBeat.o(115610);
        throw paramRect;
      }
    }
    finally
    {
      os().unlock();
      AppMethodBeat.o(115610);
    }
    os().unlock();
    AppMethodBeat.o(115610);
    return paramRect;
    label116: paramRect = new java/lang/IllegalStateException;
    paramRect.<init>("Cannot decode region after decoder has been recycled");
    AppMethodBeat.o(115610);
    throw paramRect;
  }

  public final Point c(Context paramContext, Uri paramUri)
  {
    AppMethodBeat.i(115609);
    Object localObject = paramUri.toString();
    String str;
    int i;
    if (((String)localObject).startsWith("android.resource://"))
    {
      str = paramUri.getAuthority();
      if (paramContext.getPackageName().equals(str))
      {
        localObject = paramContext.getResources();
        paramUri = paramUri.getPathSegments();
        i = paramUri.size();
        if ((i != 2) || (!((String)paramUri.get(0)).equals("drawable")))
          break label158;
        i = ((Resources)localObject).getIdentifier((String)paramUri.get(1), "drawable", str);
        label99: this.aIn = BitmapRegionDecoder.newInstance(paramContext.getResources().openRawResource(i), false);
      }
    }
    while (true)
    {
      while (true)
      {
        paramContext = new Point(this.aIn.getWidth(), this.aIn.getHeight());
        AppMethodBeat.o(115609);
        return paramContext;
        localObject = paramContext.getPackageManager().getResourcesForApplication(str);
        break;
        label158: if ((i == 1) && (TextUtils.isDigitsOnly((CharSequence)paramUri.get(0))))
          try
          {
            i = bo.getInt((String)paramUri.get(0), 0);
          }
          catch (NumberFormatException paramUri)
          {
          }
      }
      i = 0;
      break label99;
      if (((String)localObject).startsWith("file:///android_asset/"))
      {
        paramUri = ((String)localObject).substring(22);
        this.aIn = BitmapRegionDecoder.newInstance(paramContext.getAssets().open(paramUri, 1), false);
      }
      else if (((String)localObject).startsWith("file://"))
      {
        this.aIn = BitmapRegionDecoder.newInstance(((String)localObject).substring(7), false);
      }
      else
      {
        localObject = null;
        try
        {
          paramContext = paramContext.getContentResolver().openInputStream(paramUri);
          localObject = paramContext;
          this.aIn = BitmapRegionDecoder.newInstance(paramContext, false);
          if (paramContext != null)
            try
            {
              paramContext.close();
            }
            catch (Exception paramContext)
            {
            }
        }
        finally
        {
          if (localObject == null);
        }
      }
    }
    try
    {
      ((InputStream)localObject).close();
      label314: AppMethodBeat.o(115609);
      throw paramContext;
    }
    catch (Exception paramUri)
    {
      break label314;
    }
  }

  public final boolean isReady()
  {
    try
    {
      AppMethodBeat.i(115611);
      boolean bool;
      if ((this.aIn != null) && (!this.aIn.isRecycled()))
      {
        bool = true;
        AppMethodBeat.o(115611);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(115611);
      }
    }
    finally
    {
    }
  }

  public final void recycle()
  {
    try
    {
      AppMethodBeat.i(115612);
      this.aIo.writeLock().lock();
      try
      {
        this.aIn.recycle();
        this.aIn = null;
        this.aIo.writeLock().unlock();
        AppMethodBeat.o(115612);
        return;
      }
      finally
      {
        localObject1 = finally;
        this.aIo.writeLock().unlock();
        AppMethodBeat.o(115612);
        throw localObject1;
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.a.e
 * JD-Core Version:    0.6.2
 */