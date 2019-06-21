package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

public final class l
{
  static final b QT;

  static
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (QT = new c(); ; QT = new a())
      return;
  }

  public static void a(ImageView paramImageView, ColorStateList paramColorStateList)
  {
    QT.a(paramImageView, paramColorStateList);
  }

  public static void a(ImageView paramImageView, PorterDuff.Mode paramMode)
  {
    QT.a(paramImageView, paramMode);
  }

  public static ColorStateList b(ImageView paramImageView)
  {
    return QT.b(paramImageView);
  }

  public static PorterDuff.Mode c(ImageView paramImageView)
  {
    return QT.c(paramImageView);
  }

  static class a
    implements l.b
  {
    public void a(ImageView paramImageView, ColorStateList paramColorStateList)
    {
      if ((paramImageView instanceof s))
        ((s)paramImageView).setSupportImageTintList(paramColorStateList);
    }

    public void a(ImageView paramImageView, PorterDuff.Mode paramMode)
    {
      if ((paramImageView instanceof s))
        ((s)paramImageView).setSupportImageTintMode(paramMode);
    }

    public ColorStateList b(ImageView paramImageView)
    {
      if ((paramImageView instanceof s));
      for (paramImageView = ((s)paramImageView).getSupportImageTintList(); ; paramImageView = null)
        return paramImageView;
    }

    public PorterDuff.Mode c(ImageView paramImageView)
    {
      if ((paramImageView instanceof s));
      for (paramImageView = ((s)paramImageView).getSupportImageTintMode(); ; paramImageView = null)
        return paramImageView;
    }
  }

  static abstract interface b
  {
    public abstract void a(ImageView paramImageView, ColorStateList paramColorStateList);

    public abstract void a(ImageView paramImageView, PorterDuff.Mode paramMode);

    public abstract ColorStateList b(ImageView paramImageView);

    public abstract PorterDuff.Mode c(ImageView paramImageView);
  }

  static final class c extends l.a
  {
    public final void a(ImageView paramImageView, ColorStateList paramColorStateList)
    {
      paramImageView.setImageTintList(paramColorStateList);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramColorStateList = paramImageView.getDrawable();
        if ((paramImageView.getImageTintList() == null) || (paramImageView.getImageTintMode() == null))
          break label64;
      }
      label64: for (int i = 1; ; i = 0)
      {
        if ((paramColorStateList != null) && (i != 0))
        {
          if (paramColorStateList.isStateful())
            paramColorStateList.setState(paramImageView.getDrawableState());
          paramImageView.setImageDrawable(paramColorStateList);
        }
        return;
      }
    }

    public final void a(ImageView paramImageView, PorterDuff.Mode paramMode)
    {
      paramImageView.setImageTintMode(paramMode);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramMode = paramImageView.getDrawable();
        if ((paramImageView.getImageTintList() == null) || (paramImageView.getImageTintMode() == null))
          break label64;
      }
      label64: for (int i = 1; ; i = 0)
      {
        if ((paramMode != null) && (i != 0))
        {
          if (paramMode.isStateful())
            paramMode.setState(paramImageView.getDrawableState());
          paramImageView.setImageDrawable(paramMode);
        }
        return;
      }
    }

    public final ColorStateList b(ImageView paramImageView)
    {
      return paramImageView.getImageTintList();
    }

    public final PorterDuff.Mode c(ImageView paramImageView)
    {
      return paramImageView.getImageTintMode();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.l
 * JD-Core Version:    0.6.2
 */