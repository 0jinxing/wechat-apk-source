package android.support.v4.a.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

final class c extends b
{
  protected c(Resources paramResources, Bitmap paramBitmap)
  {
    super(paramResources, paramBitmap);
  }

  final void a(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2)
  {
    Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, 0);
  }

  public final void getOutline(Outline paramOutline)
  {
    dz();
    paramOutline.setRoundRect(this.Hx, this.rf);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.v4.a.a.c
 * JD-Core Version:    0.6.2
 */