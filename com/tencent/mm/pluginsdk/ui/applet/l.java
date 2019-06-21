package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import java.util.List;

public final class l extends BaseAdapter
{
  private List<String> gnO;
  private Context mContext;
  private List<String> vli;

  public l(Context paramContext, List<String> paramList1, List<String> paramList2)
  {
    this.mContext = paramContext;
    this.gnO = paramList2;
    this.vli = paramList1;
  }

  private static l.a ex(View paramView)
  {
    AppMethodBeat.i(27720);
    l.a locala = new l.a((byte)0);
    locala.ejo = ((ImageView)paramView.findViewById(2131822361));
    locala.gxi = ((TextView)paramView.findViewById(2131822362));
    paramView.setTag(locala);
    AppMethodBeat.o(27720);
    return locala;
  }

  public final int getCount()
  {
    AppMethodBeat.i(27717);
    int i = this.gnO.size();
    AppMethodBeat.o(27717);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(27718);
    Object localObject = this.gnO.get(paramInt);
    AppMethodBeat.o(27718);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(27719);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, 2130969006, null);
      paramViewGroup = ex(paramView);
    }
    label260: 
    while (true)
    {
      int i = this.gnO.size();
      if ((paramInt >= 0) && (paramInt < this.gnO.size()) && (paramInt < this.vli.size()))
      {
        paramViewGroup.ejo.setVisibility(0);
        paramViewGroup.gxi.setVisibility(0);
        a.b.b(paramViewGroup.ejo, (String)this.vli.get(paramInt));
        paramViewGroup.gxi.setText((CharSequence)this.gnO.get(paramInt));
        paramViewGroup.gxi.setText(((com.tencent.mm.plugin.emoji.b.a)g.K(com.tencent.mm.plugin.emoji.b.a.class)).a(this.mContext, (CharSequence)this.gnO.get(paramInt), paramViewGroup.gxi.getTextSize()));
        if ((this.gnO.size() <= 12) || (paramInt < this.gnO.size() - i % 4))
          break label246;
        paramViewGroup.gxi.setPadding(0, 0, 0, com.tencent.mm.bz.a.al(this.mContext, 2131427569));
      }
      while (true)
      {
        AppMethodBeat.o(27719);
        return paramView;
        paramViewGroup = (l.a)paramView.getTag();
        if (paramViewGroup != null)
          break label260;
        paramViewGroup = ex(paramView);
        break;
        label246: paramViewGroup.gxi.setPadding(0, 0, 0, 0);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.l
 * JD-Core Version:    0.6.2
 */