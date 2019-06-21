package android.support.v4.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.content.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.List;
import java.util.Map;

public final class a extends b
{
  private static b BP;

  public static void a(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 16)
      paramActivity.startActivityForResult(paramIntent, paramInt, paramBundle);
    while (true)
    {
      return;
      paramActivity.startActivityForResult(paramIntent, paramInt);
    }
  }

  public static void a(Activity paramActivity, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 16)
      paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
    while (true)
    {
      return;
      paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
    }
  }

  public static void a(Activity paramActivity, ac paramac)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (Build.VERSION.SDK_INT >= 23)
    {
      if (paramac != null)
        localObject2 = new e(paramac);
      paramActivity.setEnterSharedElementCallback((SharedElementCallback)localObject2);
    }
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject2 = localObject1;
        if (paramac != null)
          localObject2 = new d(paramac);
        paramActivity.setEnterSharedElementCallback((SharedElementCallback)localObject2);
      }
    }
  }

  public static void a(final Activity paramActivity, String[] paramArrayOfString, final int paramInt)
  {
    if ((BP != null) && (BP.de()));
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 23)
      {
        if ((paramActivity instanceof c))
          ((c)paramActivity).validateRequestPermissionsRequestCode(paramInt);
        paramActivity.requestPermissions(paramArrayOfString, paramInt);
      }
      else if ((paramActivity instanceof a))
      {
        new Handler(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            int[] arrayOfInt = new int[this.BQ.length];
            PackageManager localPackageManager = paramActivity.getPackageManager();
            String str = paramActivity.getPackageName();
            int i = this.BQ.length;
            for (int j = 0; j < i; j++)
              arrayOfInt[j] = localPackageManager.checkPermission(this.BQ[j], str);
            ((a.a)paramActivity).onRequestPermissionsResult(paramInt, this.BQ, arrayOfInt);
          }
        });
      }
    }
  }

  public static boolean a(Activity paramActivity, String paramString)
  {
    if (Build.VERSION.SDK_INT >= 23);
    for (boolean bool = paramActivity.shouldShowRequestPermissionRationale(paramString); ; bool = false)
      return bool;
  }

  public static void b(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 16)
      paramActivity.finishAffinity();
    while (true)
    {
      return;
      paramActivity.finish();
    }
  }

  public static void b(Activity paramActivity, ac paramac)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (Build.VERSION.SDK_INT >= 23)
    {
      if (paramac != null)
        localObject2 = new e(paramac);
      paramActivity.setExitSharedElementCallback((SharedElementCallback)localObject2);
    }
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject2 = localObject1;
        if (paramac != null)
          localObject2 = new d(paramac);
        paramActivity.setExitSharedElementCallback((SharedElementCallback)localObject2);
      }
    }
  }

  public static void c(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 21)
      paramActivity.finishAfterTransition();
    while (true)
    {
      return;
      paramActivity.finish();
    }
  }

  public static void d(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 21)
      paramActivity.postponeEnterTransition();
  }

  public static b dd()
  {
    return BP;
  }

  public static void e(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 21)
      paramActivity.startPostponedEnterTransition();
  }

  public static abstract interface a
  {
    public abstract void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt);
  }

  public static abstract interface b
  {
    public abstract boolean de();

    public abstract boolean df();
  }

  public static abstract interface c
  {
    public abstract void validateRequestPermissionsRequestCode(int paramInt);
  }

  static class d extends SharedElementCallback
  {
    protected ac BR;

    d(ac paramac)
    {
      this.BR = paramac;
    }

    public Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF)
    {
      ac localac = this.BR;
      ImageView localImageView;
      Object localObject2;
      if ((paramView instanceof ImageView))
      {
        localImageView = (ImageView)paramView;
        Object localObject1 = localImageView.getDrawable();
        localObject2 = localImageView.getBackground();
        if ((localObject1 != null) && (localObject2 == null))
        {
          localObject1 = ac.a((Drawable)localObject1);
          if (localObject1 != null)
          {
            localObject2 = new Bundle();
            ((Bundle)localObject2).putParcelable("sharedElement:snapshot:bitmap", (Parcelable)localObject1);
            ((Bundle)localObject2).putString("sharedElement:snapshot:imageScaleType", localImageView.getScaleType().toString());
            if (localImageView.getScaleType() == ImageView.ScaleType.MATRIX)
            {
              paramMatrix = localImageView.getImageMatrix();
              paramView = new float[9];
              paramMatrix.getValues(paramView);
              ((Bundle)localObject2).putFloatArray("sharedElement:snapshot:imageMatrix", paramView);
            }
          }
        }
      }
      while (true)
      {
        return localObject2;
        int i = Math.round(paramRectF.width());
        int j = Math.round(paramRectF.height());
        localImageView = null;
        localObject2 = localImageView;
        if (i > 0)
        {
          localObject2 = localImageView;
          if (j > 0)
          {
            float f = Math.min(1.0F, ac.Gd / (i * j));
            i = (int)(i * f);
            j = (int)(j * f);
            if (localac.ya == null)
              localac.ya = new Matrix();
            localac.ya.set(paramMatrix);
            localac.ya.postTranslate(-paramRectF.left, -paramRectF.top);
            localac.ya.postScale(f, f);
            localObject2 = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
            paramMatrix = new Canvas((Bitmap)localObject2);
            paramMatrix.concat(localac.ya);
            paramView.draw(paramMatrix);
          }
        }
      }
    }

    public View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
    {
      return ac.onCreateSnapshotView(paramContext, paramParcelable);
    }

    public void onMapSharedElements(List<String> paramList, Map<String, View> paramMap)
    {
    }

    public void onRejectSharedElements(List<View> paramList)
    {
    }

    public void onSharedElementEnd(List<String> paramList, List<View> paramList1, List<View> paramList2)
    {
    }

    public void onSharedElementStart(List<String> paramList, List<View> paramList1, List<View> paramList2)
    {
    }
  }

  static final class e extends a.d
  {
    e(ac paramac)
    {
      super();
    }

    public final void onSharedElementsArrived(List<String> paramList, List<View> paramList1, final SharedElementCallback.OnSharedElementsReadyListener paramOnSharedElementsReadyListener)
    {
      ac.a(new ac.a()
      {
        public final void onSharedElementsReady()
        {
          paramOnSharedElementsReadyListener.onSharedElementsReady();
        }
      });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.a
 * JD-Core Version:    0.6.2
 */