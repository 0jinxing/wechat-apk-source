package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.support.v4.view.b;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;
import java.util.List;

final class ActivityChooserView$b
  implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  ActivityChooserView$b(ActivityChooserView paramActivityChooserView)
  {
  }

  public final void onClick(View paramView)
  {
    if (paramView == this.aeQ.aeG)
    {
      this.aeQ.hr();
      paramView = this.aeQ.aeA.aeR.hh();
      int i = this.aeQ.aeA.aeR.a(paramView);
      paramView = this.aeQ.aeA.aeR.bv(i);
      if (paramView != null)
      {
        paramView.addFlags(524288);
        this.aeQ.getContext().startActivity(paramView);
      }
    }
    while (true)
    {
      return;
      if (paramView != this.aeQ.aeE)
        break;
      this.aeQ.aeN = false;
      this.aeQ.bw(this.aeQ.aeO);
    }
    throw new IllegalArgumentException();
  }

  public final void onDismiss()
  {
    if (this.aeQ.aaN != null)
      this.aeQ.aaN.onDismiss();
    if (this.aeQ.aeJ != null)
      this.aeQ.aeJ.E(false);
  }

  public final void onItemClick(AdapterView<?> arg1, View paramView, int paramInt, long paramLong)
  {
    switch (((ActivityChooserView.a)???.getAdapter()).getItemViewType(paramInt))
    {
    default:
      throw new IllegalArgumentException();
    case 1:
      this.aeQ.bw(2147483647);
    case 0:
    }
    do
    {
      return;
      this.aeQ.hr();
      if (!this.aeQ.aeN)
        break;
    }
    while (paramInt <= 0);
    paramView = this.aeQ.aeA.aeR;
    while (true)
    {
      synchronized (paramView.aen)
      {
        paramView.hj();
        Object localObject1 = (e.a)paramView.aeo.get(paramInt);
        Object localObject2 = (e.a)paramView.aeo.get(0);
        if (localObject2 != null)
        {
          f = ((e.a)localObject2).weight - ((e.a)localObject1).weight + 5.0F;
          localObject2 = new android/content/ComponentName;
          ((ComponentName)localObject2).<init>(((e.a)localObject1).resolveInfo.activityInfo.packageName, ((e.a)localObject1).resolveInfo.activityInfo.name);
          localObject1 = new android/support/v7/widget/e$c;
          ((e.c)localObject1).<init>((ComponentName)localObject2, System.currentTimeMillis(), f);
          paramView.a((e.c)localObject1);
        }
      }
      float f = 1.0F;
    }
    if (this.aeQ.aeA.aeT);
    while (true)
    {
      ??? = this.aeQ.aeA.aeR.bv(paramInt);
      if (??? == null)
        break;
      ???.addFlags(524288);
      this.aeQ.getContext().startActivity(???);
      break;
      paramInt++;
    }
  }

  public final boolean onLongClick(View paramView)
  {
    if (paramView == this.aeQ.aeG)
    {
      if (this.aeQ.aeA.getCount() > 0)
      {
        this.aeQ.aeN = true;
        this.aeQ.bw(this.aeQ.aeO);
      }
      return true;
    }
    throw new IllegalArgumentException();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ActivityChooserView.b
 * JD-Core Version:    0.6.2
 */