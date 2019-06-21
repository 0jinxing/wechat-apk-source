package android.support.v7.widget;

import android.view.View;

final class at
{
  static int a(RecyclerView.s params, am paramam, View paramView1, View paramView2, RecyclerView.i parami, boolean paramBoolean)
  {
    int i;
    if ((parami.getChildCount() == 0) || (params.getItemCount() == 0) || (paramView1 == null) || (paramView2 == null))
      i = 0;
    while (true)
    {
      return i;
      if (!paramBoolean)
      {
        i = Math.abs(RecyclerView.i.bt(paramView1) - RecyclerView.i.bt(paramView2)) + 1;
      }
      else
      {
        i = paramam.bg(paramView2);
        int j = paramam.bf(paramView1);
        i = Math.min(paramam.jg(), i - j);
      }
    }
  }

  static int a(RecyclerView.s params, am paramam, View paramView1, View paramView2, RecyclerView.i parami, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    int j = i;
    if (parami.getChildCount() != 0)
    {
      j = i;
      if (params.getItemCount() != 0)
      {
        j = i;
        if (paramView1 != null)
        {
          if (paramView2 != null)
            break label45;
          j = i;
        }
      }
    }
    return j;
    label45: j = Math.min(RecyclerView.i.bt(paramView1), RecyclerView.i.bt(paramView2));
    i = Math.max(RecyclerView.i.bt(paramView1), RecyclerView.i.bt(paramView2));
    if (paramBoolean2);
    for (i = Math.max(0, params.getItemCount() - i - 1); ; i = Math.max(0, j))
    {
      j = i;
      if (!paramBoolean1)
        break;
      j = Math.abs(paramam.bg(paramView2) - paramam.bf(paramView1));
      int k = Math.abs(RecyclerView.i.bt(paramView1) - RecyclerView.i.bt(paramView2));
      float f = j / (k + 1);
      j = Math.round(i * f + (paramam.je() - paramam.bf(paramView1)));
      break;
    }
  }

  static int b(RecyclerView.s params, am paramam, View paramView1, View paramView2, RecyclerView.i parami, boolean paramBoolean)
  {
    int i;
    if ((parami.getChildCount() == 0) || (params.getItemCount() == 0) || (paramView1 == null) || (paramView2 == null))
      i = 0;
    while (true)
    {
      return i;
      if (!paramBoolean)
      {
        i = params.getItemCount();
      }
      else
      {
        int j = paramam.bg(paramView2);
        i = paramam.bf(paramView1);
        int k = Math.abs(RecyclerView.i.bt(paramView1) - RecyclerView.i.bt(paramView2));
        i = (int)((j - i) / (k + 1) * params.getItemCount());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.at
 * JD-Core Version:    0.6.2
 */