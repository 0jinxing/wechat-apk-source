package com.tencent.mm.plugin.exdevice.ui;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.exdevice.f.b.a.e;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import java.util.ArrayList;

final class ExdeviceLikeUI$a extends BaseAdapter
{
  ExdeviceLikeUI$a(ExdeviceLikeUI paramExdeviceLikeUI)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(19972);
    int i;
    if (ExdeviceLikeUI.c(this.lAY) == null)
    {
      i = 0;
      AppMethodBeat.o(19972);
    }
    while (true)
    {
      return i;
      i = ExdeviceLikeUI.c(this.lAY).size();
      AppMethodBeat.o(19972);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(19973);
    Object localObject = ExdeviceLikeUI.c(this.lAY).get(paramInt);
    AppMethodBeat.o(19973);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(19974);
    e locale = (e)ExdeviceLikeUI.c(this.lAY).get(paramInt);
    if (paramView == null)
      if (ExdeviceLikeUI.d(this.lAY))
      {
        paramView = LayoutInflater.from(this.lAY).inflate(2130969422, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.eks = ((ImageView)paramView.findViewById(2131823658));
        paramViewGroup.lAZ = ((NoMeasuredTextView)paramView.findViewById(2131823660));
        paramViewGroup.gJE = ((TextView)paramView.findViewById(2131823661));
        paramViewGroup.timeTv = ((TextView)paramView.findViewById(2131823659));
        paramViewGroup.lAZ.setTextSize(0, this.lAY.getResources().getDimension(2131427813));
        paramViewGroup.lAZ.setTextColor(this.lAY.getResources().getColor(2131689761));
        paramViewGroup.lAZ.setSingleLine(true);
        paramViewGroup.lAZ.setShouldEllipsize(true);
        paramView.setTag(paramViewGroup);
        label172: a.b.s(paramViewGroup.eks, locale.field_username);
        paramViewGroup.lAZ.setText(j.b(this.lAY, s.mJ(locale.field_username), paramViewGroup.lAZ.getTextSize()));
        if ((bo.isNullOrNil(locale.field_liketips)) || (paramViewGroup.gJE == null))
          break label343;
        paramViewGroup.gJE.setVisibility(0);
        paramViewGroup.gJE.setText(locale.field_liketips);
        label251: paramInt = (int)((System.currentTimeMillis() / 1000L - locale.field_timestamp) / 60L + 1L);
        if (paramInt > 30)
          break label362;
        paramViewGroup.timeTv.setText(this.lAY.getString(2131299331, new Object[] { Integer.valueOf(paramInt) }));
      }
    while (true)
    {
      AppMethodBeat.o(19974);
      return paramView;
      paramView = LayoutInflater.from(this.lAY).inflate(2130969421, paramViewGroup, false);
      break;
      paramViewGroup = (a)paramView.getTag();
      break label172;
      label343: if (paramViewGroup.gJE == null)
        break label251;
      paramViewGroup.gJE.setVisibility(8);
      break label251;
      label362: paramViewGroup.timeTv.setText(h.c(this.lAY, locale.field_timestamp * 1000L, true));
    }
  }

  final class a
  {
    ImageView eks;
    TextView gJE;
    NoMeasuredTextView lAZ;
    TextView timeTv;

    a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI.a
 * JD-Core Version:    0.6.2
 */