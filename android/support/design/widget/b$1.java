package android.support.design.widget;

import android.animation.ValueAnimator;
import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.view.s;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

final class b$1
  implements Handler.Callback
{
  public final boolean handleMessage(Message paramMessage)
  {
    boolean bool;
    switch (paramMessage.what)
    {
    default:
      bool = false;
      return bool;
    case 0:
      paramMessage = (b)paramMessage.obj;
      if (paramMessage.mM.getParent() == null)
      {
        localObject = paramMessage.mM.getLayoutParams();
        if ((localObject instanceof CoordinatorLayout.d))
        {
          CoordinatorLayout.d locald = (CoordinatorLayout.d)localObject;
          localObject = new b.a(paramMessage);
          ((n)localObject).rK = n.p(0.1F);
          ((n)localObject).rL = n.p(0.6F);
          ((n)localObject).rI = 0;
          ((n)localObject).rE = new b.5(paramMessage);
          locald.a((CoordinatorLayout.Behavior)localObject);
          locald.pL = 80;
        }
        paramMessage.mL.addView(paramMessage.mM);
      }
      paramMessage.mM.setOnAttachStateChangeListener(new b.6(paramMessage));
      if (s.as(paramMessage.mM))
        if (paramMessage.bG())
          paramMessage.bD();
      while (true)
      {
        bool = true;
        break;
        paramMessage.bE();
        continue;
        paramMessage.mM.setOnLayoutChangeListener(new b.7(paramMessage));
      }
    case 1:
    }
    Object localObject = (b)paramMessage.obj;
    int i = paramMessage.arg1;
    if ((((b)localObject).bG()) && (((b)localObject).mM.getVisibility() == 0))
      if (Build.VERSION.SDK_INT >= 12)
      {
        paramMessage = new ValueAnimator();
        paramMessage.setIntValues(new int[] { 0, ((b)localObject).mM.getHeight() });
        paramMessage.setInterpolator(a.mg);
        paramMessage.setDuration(250L);
        paramMessage.addListener(new b.2((b)localObject, i));
        paramMessage.addUpdateListener(new b.3((b)localObject));
        paramMessage.start();
      }
    while (true)
    {
      bool = true;
      break;
      paramMessage = AnimationUtils.loadAnimation(((b)localObject).mM.getContext(), 2131034157);
      paramMessage.setInterpolator(a.mg);
      paramMessage.setDuration(250L);
      paramMessage.setAnimationListener(new b.4((b)localObject, i));
      ((b)localObject).mM.startAnimation(paramMessage);
      continue;
      ((b)localObject).bF();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.widget.b.1
 * JD-Core Version:    0.6.2
 */