package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

class q$b extends q.a
{
  public void a(TextView paramTextView, Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    int i;
    Drawable localDrawable;
    if (paramTextView.getLayoutDirection() == 1)
    {
      i = 1;
      if (i == 0)
        break label42;
      localDrawable = paramDrawable3;
      label20: if (i == 0)
        break label48;
    }
    while (true)
    {
      paramTextView.setCompoundDrawables(localDrawable, paramDrawable2, paramDrawable1, paramDrawable4);
      return;
      i = 0;
      break;
      label42: localDrawable = paramDrawable1;
      break label20;
      label48: paramDrawable1 = paramDrawable3;
    }
  }

  public Drawable[] c(TextView paramTextView)
  {
    int i = 1;
    if (paramTextView.getLayoutDirection() == 1);
    while (true)
    {
      Drawable[] arrayOfDrawable = paramTextView.getCompoundDrawables();
      if (i != 0)
      {
        Drawable localDrawable = arrayOfDrawable[2];
        paramTextView = arrayOfDrawable[0];
        arrayOfDrawable[0] = localDrawable;
        arrayOfDrawable[2] = paramTextView;
      }
      return arrayOfDrawable;
      i = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.widget.q.b
 * JD-Core Version:    0.6.2
 */