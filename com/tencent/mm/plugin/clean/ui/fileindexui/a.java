package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.List;

public final class a extends BaseAdapter
{
  private List<c> dataList;
  HashSet<Integer> jur;
  CleanChattingUI kxj;

  public a(CleanChattingUI paramCleanChattingUI, List<c> paramList)
  {
    AppMethodBeat.i(18740);
    this.kxj = paramCleanChattingUI;
    this.jur = new HashSet();
    this.dataList = paramList;
    AppMethodBeat.o(18740);
  }

  public final void bgh()
  {
    AppMethodBeat.i(18744);
    this.jur.clear();
    this.kxj.a(this.jur);
    AppMethodBeat.o(18744);
  }

  public final int getCount()
  {
    AppMethodBeat.i(18741);
    int i = this.dataList.size();
    AppMethodBeat.o(18741);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return -1L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(18743);
    c localc2;
    if (paramView == null)
    {
      paramView = this.kxj.getLayoutInflater().inflate(2130969143, paramViewGroup, false);
      paramViewGroup = new a.a(this);
      paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131821183));
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131821185));
      paramViewGroup.gnC = ((TextView)paramView.findViewById(2131820991));
      paramViewGroup.gnD = ((CheckBox)paramView.findViewById(2131821593));
      paramViewGroup.juu = ((RelativeLayout)paramView.findViewById(2131821592));
      paramView.setTag(paramViewGroup);
      paramViewGroup.juu.setOnClickListener(new a.1(this, paramInt));
      c localc1 = tu(paramInt);
      localc2 = localc1;
      if (localc1 == null)
      {
        ab.e("MicroMsg.CleanChattingAdapter", "get item is null. [%d]", new Object[] { Integer.valueOf(paramInt) });
        localc2 = new c();
        localc2.size = 0L;
        localc2.username = "";
      }
      a.b.b(paramViewGroup.ejo, localc2.username);
      paramViewGroup.gnB.setText(bo.ga(localc2.size));
      if (!t.kH(localc2.username))
        break label289;
      paramViewGroup.gnC.setText(j.b(this.kxj, s.getDisplayName(localc2.username, localc2.username), paramViewGroup.gnC.getTextSize()));
      label248: if (!this.jur.contains(Integer.valueOf(paramInt)))
        break label321;
      paramViewGroup.gnD.setChecked(true);
    }
    while (true)
    {
      AppMethodBeat.o(18743);
      return paramView;
      paramViewGroup = (a.a)paramView.getTag();
      break;
      label289: paramViewGroup.gnC.setText(j.b(this.kxj, s.mJ(localc2.username), paramViewGroup.gnC.getTextSize()));
      break label248;
      label321: paramViewGroup.gnD.setChecked(false);
    }
  }

  public final c tu(int paramInt)
  {
    AppMethodBeat.i(18742);
    c localc;
    if ((paramInt < 0) || (paramInt >= this.dataList.size()))
    {
      localc = null;
      AppMethodBeat.o(18742);
    }
    while (true)
    {
      return localc;
      localc = (c)this.dataList.get(paramInt);
      AppMethodBeat.o(18742);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.a
 * JD-Core Version:    0.6.2
 */