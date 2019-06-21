package com.tencent.mm.ui;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.r;

final class aa$a extends BaseAdapter
{
  private aa$a(aa paramaa)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(29843);
    int i = aa.a(this.ypL).size();
    AppMethodBeat.o(29843);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(29844);
    paramView = (aa.c)aa.a(this.ypL).get(paramInt);
    paramViewGroup = aa.b(this.ypL).inflate(2130970220, paramViewGroup, false);
    Object localObject = (TextView)paramViewGroup.findViewById(2131820678);
    if (!bo.isNullOrNil(paramView.ypP.ypQ))
      ((TextView)localObject).setText(paramView.ypP.ypQ);
    if (paramView.ypP.textColor > 0)
      ((TextView)localObject).setTextColor(a.i(ah.getContext(), paramView.ypP.textColor));
    localObject = (ImageView)paramViewGroup.findViewById(2131820915);
    View localView1;
    View localView2;
    if (paramView.ypP.icon > 0)
    {
      ((ImageView)localObject).setVisibility(0);
      ((ImageView)localObject).setImageResource(((aa.c)aa.a(this.ypL).get(paramInt)).ypP.icon);
      if (!bo.isNullOrNil(paramView.ypP.ypR))
        ((ImageView)localObject).setContentDescription(paramView.ypP.ypR);
      localView1 = paramViewGroup.findViewById(2131823549);
      localObject = (TextView)paramViewGroup.findViewById(2131826100);
      ((TextView)localObject).setBackgroundResource(r.ik(aa.c(this.ypL)));
      localView2 = paramViewGroup.findViewById(2131825070);
      if (!paramView.ypN)
        break label266;
      localView1.setVisibility(0);
      label232: if (paramInt != getCount() - 1)
        break label385;
      paramViewGroup.setBackgroundResource(2130840366);
    }
    while (true)
    {
      AppMethodBeat.o(29844);
      return paramViewGroup;
      ((ImageView)localObject).setVisibility(8);
      break;
      label266: if (paramView.csm > 0)
      {
        ((TextView)localObject).setVisibility(0);
        if (paramView.csm > 99)
        {
          ((TextView)localObject).setText("");
          ((TextView)localObject).setBackgroundResource(2131230952);
          break label232;
        }
        ((TextView)localObject).setText(paramView.csm);
        ((TextView)localObject).setBackgroundResource(r.ik(aa.c(this.ypL)));
        break label232;
      }
      if (paramView.ypO)
      {
        localView2.setVisibility(0);
        break label232;
      }
      localView1.setVisibility(8);
      ((TextView)localObject).setVisibility(8);
      localView2.setVisibility(8);
      break label232;
      label385: paramViewGroup.setBackgroundResource(2130840365);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.aa.a
 * JD-Core Version:    0.6.2
 */