package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.d.dl;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.LinkedList;
import java.util.List;

final class GameDetailRankLikedUI$a extends BaseAdapter
{
  private Context mContext;
  List<dl> ngC;

  public GameDetailRankLikedUI$a(Context paramContext)
  {
    AppMethodBeat.i(111825);
    this.ngC = new LinkedList();
    this.mContext = paramContext;
    AppMethodBeat.o(111825);
  }

  private dl wH(int paramInt)
  {
    AppMethodBeat.i(111827);
    dl localdl = (dl)this.ngC.get(paramInt);
    AppMethodBeat.o(111827);
    return localdl;
  }

  public final int getCount()
  {
    AppMethodBeat.i(111826);
    int i = this.ngC.size();
    AppMethodBeat.o(111826);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(111828);
    dl localdl;
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.mContext).inflate(2130969698, paramViewGroup, false);
      paramViewGroup = new GameDetailRankLikedUI.a.a((byte)0);
      paramViewGroup.gvq = ((ImageView)paramView.findViewById(2131824462));
      paramViewGroup.ngn = ((TextView)paramView.findViewById(2131824463));
      paramViewGroup.ngD = ((TextView)paramView.findViewById(2131824464));
      paramView.setTag(paramViewGroup);
      localdl = wH(paramInt);
      a.b.a(paramViewGroup.gvq, localdl.ndG, 0.5F, false);
      Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(localdl.ndG);
      if (localObject == null)
        break label196;
      localObject = new SpannableString(com.tencent.mm.pluginsdk.ui.e.j.b(this.mContext, ((ad)localObject).Oj(), paramViewGroup.ngn.getTextSize()));
      paramViewGroup.ngn.setText((CharSequence)localObject);
    }
    while (true)
    {
      paramViewGroup.ngD.setText(localdl.ndH);
      AppMethodBeat.o(111828);
      return paramView;
      paramViewGroup = (GameDetailRankLikedUI.a.a)paramView.getTag();
      break;
      label196: paramViewGroup.ngn.setText("");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI.a
 * JD-Core Version:    0.6.2
 */