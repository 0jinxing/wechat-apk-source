package com.tencent.mm.plugin.clean.ui.newui;

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
import com.tencent.mm.plugin.clean.c.b;
import com.tencent.mm.plugin.clean.c.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashSet;

public final class a extends BaseAdapter
{
  HashSet<Integer> jur;
  CleanChattingUI kyF;

  public a(CleanChattingUI paramCleanChattingUI)
  {
    AppMethodBeat.i(18841);
    this.kyF = paramCleanChattingUI;
    this.jur = new HashSet();
    AppMethodBeat.o(18841);
  }

  private static b ty(int paramInt)
  {
    AppMethodBeat.i(18843);
    b localb = (b)d.bfS().get(paramInt);
    AppMethodBeat.o(18843);
    return localb;
  }

  public final void bgh()
  {
    AppMethodBeat.i(18845);
    this.jur.clear();
    this.kyF.a(this.jur);
    AppMethodBeat.o(18845);
  }

  public final int getCount()
  {
    AppMethodBeat.i(18842);
    ArrayList localArrayList = d.bfS();
    int i;
    if (localArrayList != null)
    {
      i = localArrayList.size();
      AppMethodBeat.o(18842);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(18842);
    }
  }

  public final long getItemId(int paramInt)
  {
    return -1L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(18844);
    b localb;
    if (paramView == null)
    {
      paramView = this.kyF.getLayoutInflater().inflate(2130969143, paramViewGroup, false);
      paramViewGroup = new a.a(this);
      paramViewGroup.ejo = ((ImageView)paramView.findViewById(2131821183));
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131821185));
      paramViewGroup.gnC = ((TextView)paramView.findViewById(2131820991));
      paramViewGroup.gnD = ((CheckBox)paramView.findViewById(2131821593));
      paramViewGroup.juu = ((RelativeLayout)paramView.findViewById(2131821592));
      paramView.setTag(paramViewGroup);
      paramViewGroup.juu.setOnClickListener(new a.1(this, paramInt));
      localb = ty(paramInt);
      a.b.b(paramViewGroup.ejo, localb.username);
      paramViewGroup.gnB.setText(bo.ga(localb.jrb));
      if (!t.kH(localb.username))
        break label239;
      paramViewGroup.gnC.setText(j.b(this.kyF, s.getDisplayName(localb.username, localb.username), paramViewGroup.gnC.getTextSize()));
      label198: if (!this.jur.contains(Integer.valueOf(paramInt)))
        break label271;
      paramViewGroup.gnD.setChecked(true);
    }
    while (true)
    {
      AppMethodBeat.o(18844);
      return paramView;
      paramViewGroup = (a.a)paramView.getTag();
      break;
      label239: paramViewGroup.gnC.setText(j.b(this.kyF, s.mJ(localb.username), paramViewGroup.gnC.getTextSize()));
      break label198;
      label271: paramViewGroup.gnD.setChecked(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.a
 * JD-Core Version:    0.6.2
 */