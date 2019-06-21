package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.lang.reflect.Field;

class q$g
{
  private static Field SC;
  private static boolean SD;
  private static Field SE;
  private static boolean SF;

  private static Field O(String paramString)
  {
    Object localObject = null;
    try
    {
      Field localField = TextView.class.getDeclaredField(paramString);
      localObject = localField;
      localField.setAccessible(true);
      localObject = localField;
      return localObject;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      while (true)
        new StringBuilder("Could not retrieve ").append(paramString).append(" field.");
    }
  }

  private static int a(Field paramField, TextView paramTextView)
  {
    try
    {
      i = paramField.getInt(paramTextView);
      return i;
    }
    catch (IllegalAccessException paramTextView)
    {
      while (true)
      {
        new StringBuilder("Could not retrieve value of ").append(paramField.getName()).append(" field.");
        int i = -1;
      }
    }
  }

  public void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    paramTextView.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
  }

  public int b(TextView paramTextView)
  {
    if (!SF)
    {
      SE = O("mMaxMode");
      SF = true;
    }
    if ((SE != null) && (a(SE, paramTextView) == 1))
    {
      if (!SD)
      {
        SC = O("mMaximum");
        SD = true;
      }
      if (SC == null);
    }
    for (int i = a(SC, paramTextView); ; i = -1)
      return i;
  }

  public void b(TextView paramTextView, int paramInt)
  {
    paramTextView.setTextAppearance(paramTextView.getContext(), paramInt);
  }

  public Drawable[] c(TextView paramTextView)
  {
    return paramTextView.getCompoundDrawables();
  }

  public void d(TextView paramTextView)
  {
    if ((paramTextView instanceof b))
      ((b)paramTextView).setAutoSizeTextTypeWithDefaults(1);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.q.g
 * JD-Core Version:    0.6.2
 */