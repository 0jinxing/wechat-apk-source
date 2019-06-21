package android.support.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

final class h$a
  implements j.a
{
  public final void A(View paramView)
  {
    paramView = h.z(paramView);
    if (paramView != null)
    {
      paramView.yG -= 1;
      if (paramView.yG <= 0)
      {
        Object localObject = paramView.getParent();
        if ((localObject instanceof ViewGroup))
        {
          localObject = (ViewGroup)localObject;
          ((ViewGroup)localObject).endViewTransition(paramView);
          ((ViewGroup)localObject).removeView(paramView);
        }
      }
    }
  }

  public final j a(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix)
  {
    h localh = h.z(paramView);
    paramMatrix = localh;
    if (localh == null)
      if (!(paramViewGroup instanceof FrameLayout))
      {
        paramViewGroup = paramViewGroup.getParent();
        if (!(paramViewGroup instanceof ViewGroup))
        {
          paramViewGroup = null;
          label35: if (paramViewGroup != null)
            break label59;
          paramMatrix = null;
        }
      }
    while (true)
    {
      return paramMatrix;
      paramViewGroup = (ViewGroup)paramViewGroup;
      break;
      paramViewGroup = (FrameLayout)paramViewGroup;
      break label35;
      label59: paramMatrix = new h(paramView);
      paramViewGroup.addView(paramMatrix);
      paramMatrix.yG += 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.transition.h.a
 * JD-Core Version:    0.6.2
 */