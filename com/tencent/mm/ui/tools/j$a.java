package com.tencent.mm.ui.tools;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.a;
import com.tencent.mm.ui.base.n.b;

final class j$a extends BaseAdapter
{
  private j$a(j paramj)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(107704);
    int i = j.a(this.zFW).size();
    AppMethodBeat.o(107704);
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
    AppMethodBeat.i(107705);
    MenuItem localMenuItem;
    if (paramView == null)
    {
      paramView = j.b(this.zFW).inflate(2130970123, paramViewGroup, false);
      paramViewGroup = new j.a.a(this, (byte)0);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131820678));
      paramViewGroup.iNr = ((ImageView)paramView.findViewById(2131820915));
      paramView.setTag(paramViewGroup);
      localMenuItem = j.a(this.zFW).getItem(paramInt);
      paramViewGroup.gsf.setText(localMenuItem.getTitle());
      Drawable localDrawable = j.a(this.zFW).getItem(paramInt).getIcon();
      if (localDrawable == null)
        break label178;
      paramViewGroup.iNr.setVisibility(0);
      paramViewGroup.iNr.setImageDrawable(localDrawable);
    }
    while (true)
    {
      if (j.d(this.zFW) != null)
        j.d(this.zFW).a(paramViewGroup.gsf, localMenuItem);
      AppMethodBeat.o(107705);
      return paramView;
      paramViewGroup = (j.a.a)paramView.getTag();
      break;
      label178: if (j.c(this.zFW) != null)
      {
        paramViewGroup.iNr.setVisibility(0);
        j.c(this.zFW).a(paramViewGroup.iNr, localMenuItem);
      }
      else
      {
        paramViewGroup.iNr.setVisibility(8);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.j.a
 * JD-Core Version:    0.6.2
 */