package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    if ((this.nE.mCancelable) && (this.nE.isShowing()))
    {
      paramView = this.nE;
      if (!paramView.nC)
      {
        if (Build.VERSION.SDK_INT >= 11)
          break label65;
        paramView.nB = true;
      }
    }
    while (true)
    {
      paramView.nC = true;
      if (paramView.nB)
        this.nE.cancel();
      return;
      label65: TypedArray localTypedArray = paramView.getContext().obtainStyledAttributes(new int[] { 16843611 });
      paramView.nB = localTypedArray.getBoolean(0, true);
      localTypedArray.recycle();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.design.widget.c.1
 * JD-Core Version:    0.6.2
 */