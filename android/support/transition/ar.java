package android.support.transition;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

class ar
  implements at
{
  protected ar.a Bb = new ar.a(paramContext, paramViewGroup, paramView, this);

  ar(Context paramContext, ViewGroup paramViewGroup, View paramView)
  {
  }

  private static ViewGroup H(View paramView)
  {
    if (paramView != null)
      if ((paramView.getId() != 16908290) || (!(paramView instanceof ViewGroup)));
    for (paramView = (ViewGroup)paramView; ; paramView = null)
    {
      return paramView;
      if (!(paramView.getParent() instanceof ViewGroup))
        break;
      paramView = (ViewGroup)paramView.getParent();
      break;
    }
  }

  static ar I(View paramView)
  {
    ViewGroup localViewGroup = H(paramView);
    int j;
    if (localViewGroup != null)
    {
      int i = localViewGroup.getChildCount();
      j = 0;
      if (j < i)
      {
        View localView = localViewGroup.getChildAt(j);
        if ((localView instanceof ar.a))
          paramView = ((ar.a)localView).Bg;
      }
    }
    while (true)
    {
      return paramView;
      j++;
      break;
      paramView = new ak(localViewGroup.getContext(), localViewGroup, paramView);
      continue;
      paramView = null;
    }
  }

  public final void add(Drawable paramDrawable)
  {
    ar.a locala = this.Bb;
    if (locala.Bf == null)
      locala.Bf = new ArrayList();
    if (!locala.Bf.contains(paramDrawable))
    {
      locala.Bf.add(paramDrawable);
      locala.invalidate(paramDrawable.getBounds());
      paramDrawable.setCallback(locala);
    }
  }

  public final void remove(Drawable paramDrawable)
  {
    ar.a locala = this.Bb;
    if (locala.Bf != null)
    {
      locala.Bf.remove(paramDrawable);
      locala.invalidate(paramDrawable.getBounds());
      paramDrawable.setCallback(null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.transition.ar
 * JD-Core Version:    0.6.2
 */