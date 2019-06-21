package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.shake.b.f;
import com.tencent.mm.plugin.shake.b.g;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.p;
import java.util.GregorianCalendar;

final class d extends p<f>
{
  private Context mContext;
  private LayoutInflater mInflater;
  int quL;

  public d(Context paramContext)
  {
    super(paramContext, new f());
    AppMethodBeat.i(24745);
    this.quL = 20;
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    AppMethodBeat.o(24745);
  }

  public final void CA(int paramInt)
  {
    AppMethodBeat.i(24746);
    bIf();
    this.quL = paramInt;
    KC();
    AppMethodBeat.o(24746);
  }

  public final void KC()
  {
    AppMethodBeat.i(24748);
    setCursor(m.cjT().Cv(this.quL));
    super.notifyDataSetChanged();
    AppMethodBeat.o(24748);
  }

  public final void KD()
  {
    AppMethodBeat.i(24747);
    KC();
    AppMethodBeat.o(24747);
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(24749);
    Object localObject1;
    Object localObject2;
    label141: label162: long l1;
    if (paramView == null)
    {
      paramViewGroup = this.mInflater.inflate(2130970655, paramViewGroup, false);
      localObject1 = new d.a(this);
      ((d.a)localObject1).quM = ((MMImageView)paramViewGroup.findViewById(2131827482));
      ((d.a)localObject1).iDT = ((TextView)paramViewGroup.findViewById(2131827483));
      ((d.a)localObject1).kEq = ((TextView)paramViewGroup.findViewById(2131827484));
      ((d.a)localObject1).nSC = ((TextView)paramViewGroup.findViewById(2131827485));
      paramViewGroup.setTag(localObject1);
      localObject2 = (f)getItem(paramInt);
      e.a(((d.a)localObject1).quM, ((f)localObject2).field_thumburl, 2131230820, false);
      if (!bo.isNullOrNil(((f)localObject2).field_title))
        break label234;
      ((d.a)localObject1).iDT.setVisibility(8);
      if (!bo.isNullOrNil(((f)localObject2).field_desc))
        break label274;
      ((d.a)localObject1).kEq.setVisibility(8);
      localObject1 = ((d.a)localObject1).nSC;
      paramView = this.mContext;
      l1 = ((f)localObject2).field_createtime * 1000L;
      localObject2 = new GregorianCalendar();
      if (l1 >= 3600000L)
        break label314;
      paramView = "";
    }
    while (true)
    {
      ((TextView)localObject1).setText(paramView);
      AppMethodBeat.o(24749);
      return paramViewGroup;
      localObject1 = (d.a)paramView.getTag();
      paramViewGroup = paramView;
      break;
      label234: ((d.a)localObject1).iDT.setText(j.b(this.mContext, ((f)localObject2).field_title, ((d.a)localObject1).iDT.getTextSize()));
      ((d.a)localObject1).iDT.setVisibility(0);
      break label141;
      label274: ((d.a)localObject1).kEq.setText(j.b(this.mContext, ((f)localObject2).field_desc, ((d.a)localObject1).kEq.getTextSize()));
      ((d.a)localObject1).kEq.setVisibility(0);
      break label162;
      label314: long l2 = ((GregorianCalendar)localObject2).getTimeInMillis();
      int i;
      if ((l2 - l1) / 3600000L == 0L)
      {
        i = (int)((l2 - l1) / 60000L);
        paramInt = i;
        if (i <= 0)
          paramInt = 1;
        paramView = paramView.getResources().getQuantityString(2131361802, paramInt, new Object[] { Integer.valueOf(paramInt) });
      }
      else
      {
        localObject2 = new GregorianCalendar(((GregorianCalendar)localObject2).get(1), ((GregorianCalendar)localObject2).get(2), ((GregorianCalendar)localObject2).get(5));
        long l3 = l1 - ((GregorianCalendar)localObject2).getTimeInMillis();
        if ((l3 > 0L) && (l3 <= 86400000L))
        {
          i = (int)((l2 - l1) / 3600000L);
          paramInt = i;
          if (i <= 0)
            paramInt = 1;
          paramView = paramView.getResources().getQuantityString(2131361801, paramInt, new Object[] { Integer.valueOf(paramInt) });
        }
        else
        {
          l3 = l1 - ((GregorianCalendar)localObject2).getTimeInMillis() + 86400000L;
          if ((l3 > 0L) && (l3 <= 86400000L))
          {
            paramView = paramView.getString(2131299986);
          }
          else
          {
            i = (int)((l2 - l1) / 86400000L);
            paramInt = i;
            if (i <= 0)
              paramInt = 1;
            paramView = paramView.getResources().getQuantityString(2131361803, paramInt, new Object[] { Integer.valueOf(paramInt) });
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.d
 * JD-Core Version:    0.6.2
 */