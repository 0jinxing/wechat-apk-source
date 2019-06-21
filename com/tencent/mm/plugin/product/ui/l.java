package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.plugin.product.b.n.a;
import java.util.List;

public final class l extends BaseAdapter
{
  private Context mContext;
  List<n.a> pjG;

  public l(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private n.a AR(int paramInt)
  {
    AppMethodBeat.i(44134);
    n.a locala = (n.a)this.pjG.get(paramInt);
    AppMethodBeat.o(44134);
    return locala;
  }

  public final int getCount()
  {
    AppMethodBeat.i(44133);
    int i;
    if (this.pjG != null)
    {
      i = this.pjG.size();
      AppMethodBeat.o(44133);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(44133);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(44135);
    Object localObject = AR(paramInt);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramViewGroup = new m();
      paramView = View.inflate(this.mContext, 2130970398, null);
      paramViewGroup.gne = ((TextView)paramView.findViewById(2131826616));
      paramViewGroup.iyo = ((ImageView)paramView.findViewById(2131826615));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      paramViewGroup.pjH = ((n.a)localObject);
      paramViewGroup.gne.setText(((n.a)localObject).title);
      localObject = x.a(new c(((n.a)localObject).iconUrl));
      paramViewGroup.iyo.setImageBitmap((Bitmap)localObject);
      x.a(paramViewGroup);
      AppMethodBeat.o(44135);
      return paramView;
      paramViewGroup = (m)paramView.getTag();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.l
 * JD-Core Version:    0.6.2
 */