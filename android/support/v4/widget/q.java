package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.os.a;
import android.widget.TextView;

public final class q
{
  static final q.g SB;

  static
  {
    if (a.isAtLeastOMR1())
      SB = new q.f();
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT >= 26)
        SB = new q.e();
      else if (Build.VERSION.SDK_INT >= 23)
        SB = new q.d();
      else if (Build.VERSION.SDK_INT >= 18)
        SB = new q.c();
      else if (Build.VERSION.SDK_INT >= 17)
        SB = new q.b();
      else if (Build.VERSION.SDK_INT >= 16)
        SB = new q.a();
      else
        SB = new q.g();
    }
  }

  public static void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    SB.a(paramTextView, paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }

  public static int b(TextView paramTextView)
  {
    return SB.b(paramTextView);
  }

  public static void b(TextView paramTextView, int paramInt)
  {
    SB.b(paramTextView, paramInt);
  }

  public static Drawable[] c(TextView paramTextView)
  {
    return SB.c(paramTextView);
  }

  public static void d(TextView paramTextView)
  {
    SB.d(paramTextView);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.q
 * JD-Core Version:    0.6.2
 */