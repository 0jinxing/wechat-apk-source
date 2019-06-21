package android.support.v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public abstract class ac
{
  static int Gd = 1048576;
  Matrix ya;

  static Bitmap a(Drawable paramDrawable)
  {
    int i = paramDrawable.getIntrinsicWidth();
    int j = paramDrawable.getIntrinsicHeight();
    if ((i <= 0) || (j <= 0))
      paramDrawable = null;
    while (true)
    {
      return paramDrawable;
      float f = Math.min(1.0F, Gd / (i * j));
      if (((paramDrawable instanceof BitmapDrawable)) && (f == 1.0F))
      {
        paramDrawable = ((BitmapDrawable)paramDrawable).getBitmap();
      }
      else
      {
        i = (int)(i * f);
        int k = (int)(j * f);
        Bitmap localBitmap = Bitmap.createBitmap(i, k, Bitmap.Config.ARGB_8888);
        Canvas localCanvas = new Canvas(localBitmap);
        Rect localRect = paramDrawable.getBounds();
        int m = localRect.left;
        int n = localRect.top;
        int i1 = localRect.right;
        j = localRect.bottom;
        paramDrawable.setBounds(0, 0, i, k);
        paramDrawable.draw(localCanvas);
        paramDrawable.setBounds(m, n, i1, j);
        paramDrawable = localBitmap;
      }
    }
  }

  public static void a(a parama)
  {
    parama.onSharedElementsReady();
  }

  public static View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
  {
    Matrix localMatrix = null;
    if ((paramParcelable instanceof Bundle))
    {
      paramParcelable = (Bundle)paramParcelable;
      Bitmap localBitmap = (Bitmap)paramParcelable.getParcelable("sharedElement:snapshot:bitmap");
      if (localBitmap == null)
      {
        paramContext = localMatrix;
        return paramContext;
      }
      paramContext = new ImageView(paramContext);
      paramContext.setImageBitmap(localBitmap);
      paramContext.setScaleType(ImageView.ScaleType.valueOf(paramParcelable.getString("sharedElement:snapshot:imageScaleType")));
      if (paramContext.getScaleType() == ImageView.ScaleType.MATRIX)
      {
        paramParcelable = paramParcelable.getFloatArray("sharedElement:snapshot:imageMatrix");
        localMatrix = new Matrix();
        localMatrix.setValues(paramParcelable);
        paramContext.setImageMatrix(localMatrix);
      }
    }
    while (true)
    {
      break;
      if ((paramParcelable instanceof Bitmap))
      {
        paramParcelable = (Bitmap)paramParcelable;
        paramContext = new ImageView(paramContext);
        paramContext.setImageBitmap(paramParcelable);
      }
      else
      {
        paramContext = null;
      }
    }
  }

  public static abstract interface a
  {
    public abstract void onSharedElementsReady();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.ac
 * JD-Core Version:    0.6.2
 */