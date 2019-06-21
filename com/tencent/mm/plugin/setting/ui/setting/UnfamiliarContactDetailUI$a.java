package com.tencent.mm.plugin.setting.ui.setting;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

final class UnfamiliarContactDetailUI$a extends RecyclerView.a
{
  UnfamiliarContactDetailUI$a(UnfamiliarContactDetailUI paramUnfamiliarContactDetailUI)
  {
  }

  public final UnfamiliarContactDetailUI.b Cr(int paramInt)
  {
    AppMethodBeat.i(127657);
    UnfamiliarContactDetailUI.b localb;
    if (UnfamiliarContactDetailUI.f(this.qpX).size() > paramInt)
    {
      localb = (UnfamiliarContactDetailUI.b)UnfamiliarContactDetailUI.f(this.qpX).get(paramInt);
      AppMethodBeat.o(127657);
    }
    while (true)
    {
      return localb;
      localb = new UnfamiliarContactDetailUI.b(this.qpX, new ad());
      AppMethodBeat.o(127657);
    }
  }

  public final RecyclerView.v a(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(127654);
    paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970976, paramViewGroup, false);
    paramViewGroup = new UnfamiliarContactDetailUI.c(this.qpX, paramViewGroup);
    AppMethodBeat.o(127654);
    return paramViewGroup;
  }

  public final void a(RecyclerView.v paramv, int paramInt)
  {
    AppMethodBeat.i(127655);
    int i;
    if ((paramv instanceof UnfamiliarContactDetailUI.c))
    {
      paramv = (UnfamiliarContactDetailUI.c)paramv;
      paramv.qqh.setTag(Integer.valueOf(paramInt));
      paramv.apJ.setTag(Integer.valueOf(paramInt));
      Object localObject = (UnfamiliarContactDetailUI.b)UnfamiliarContactDetailUI.f(this.qpX).get(paramInt);
      a.b.b((ImageView)paramv.emP.getContentView(), ((UnfamiliarContactDetailUI.b)localObject).ehM.field_username);
      paramv.jXx.setText(j.b(this.qpX.mController.ylL, ((UnfamiliarContactDetailUI.b)localObject).eoz, paramv.jXx.getTextSize()));
      ImageView localImageView = paramv.qqg;
      if (((UnfamiliarContactDetailUI.b)localObject).ehM.Od())
      {
        i = 0;
        localImageView.setVisibility(i);
        localImageView = paramv.qqf;
        String str = ((UnfamiliarContactDetailUI.b)localObject).ehM.field_username;
        if ((n.qFA != null) && (UnfamiliarContactDetailUI.n(this.qpX).size() == 0))
        {
          localObject = n.qFA.jT(5L);
          UnfamiliarContactDetailUI.n(this.qpX).addAll((Collection)localObject);
        }
        if (!UnfamiliarContactDetailUI.n(this.qpX).contains(str))
          break label348;
        i = 0;
        label207: localImageView.setVisibility(i);
        if (!UnfamiliarContactDetailUI.m(this.qpX).containsKey(Integer.valueOf(paramInt)))
          break label355;
        paramv.qqe.setVisibility(0);
        paramv.qqe.setText((CharSequence)UnfamiliarContactDetailUI.m(this.qpX).get(Integer.valueOf(paramInt)));
        label263: if (!UnfamiliarContactDetailUI.a(this.qpX))
          break label378;
        paramv.qqi.setPadding(paramv.qqi.getPaddingLeft(), paramv.qqi.getPaddingTop(), 0, paramv.qqi.getPaddingBottom());
        if (!UnfamiliarContactDetailUI.b(this.qpX).contains(Integer.valueOf(paramInt)))
          break label367;
        paramv.moo.setChecked(true);
        label327: paramv.qqh.setVisibility(0);
        AppMethodBeat.o(127655);
      }
    }
    while (true)
    {
      return;
      i = 8;
      break;
      label348: i = 8;
      break label207;
      label355: paramv.qqe.setVisibility(8);
      break label263;
      label367: paramv.moo.setChecked(false);
      break label327;
      label378: paramv.qqi.setPadding(paramv.qqi.getPaddingLeft(), paramv.qqi.getPaddingTop(), (int)this.qpX.getResources().getDimension(2131427785), paramv.qqi.getPaddingBottom());
      paramv.qqh.setVisibility(8);
      AppMethodBeat.o(127655);
    }
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(127656);
    int i = UnfamiliarContactDetailUI.f(this.qpX).size();
    AppMethodBeat.o(127656);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.a
 * JD-Core Version:    0.6.2
 */