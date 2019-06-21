package com.tencent.mm.plugin.recharge.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet.a.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.List;

public final class b extends BaseAdapter
{
  ArrayList<q> pGL;
  b.a pGM;
  private List<String> pGN;

  public b()
  {
    AppMethodBeat.i(44248);
    this.pGL = null;
    this.pGM = null;
    this.pGN = new ArrayList(bo.hT((String)g.RP().Ry().get(ac.a.xVQ, ""), ","));
    AppMethodBeat.o(44248);
  }

  public final int getCount()
  {
    AppMethodBeat.i(44249);
    int i;
    if (this.pGL == null)
    {
      i = 0;
      AppMethodBeat.o(44249);
    }
    while (true)
    {
      return i;
      i = this.pGL.size();
      AppMethodBeat.o(44249);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(44250);
    Object localObject = this.pGL.get(paramInt);
    AppMethodBeat.o(44250);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(44251);
    q localq = (q)getItem(paramInt);
    b.b localb;
    if (paramView == null)
    {
      paramView = v.hu(paramViewGroup.getContext()).inflate(2130970477, paramViewGroup, false);
      localb = new b.b(this, (byte)0);
      localb.hrg = ((TextView)paramView.findViewById(2131821095));
      localb.gtb = ((TextView)paramView.findViewById(2131820735));
      localb.pGR = ((TextView)paramView.findViewById(2131826895));
      localb.pGS = ((ImageView)paramView.findViewById(2131826894));
      paramView.setTag(localb);
      localb.gtb.setText(localq.name);
      if (bo.isNullOrNil(localq.desc))
        break label655;
      localb.hrg.setVisibility(0);
      localb.hrg.setText(localq.desc);
      label153: if (bo.isNullOrNil(localq.tnu))
        break label668;
      localb.pGR.setVisibility(0);
      localb.pGR.setText(localq.tnu);
      label186: if (localq.status != 1)
        break label681;
      paramView.setEnabled(true);
      localb.hrg.setEnabled(true);
      localb.gtb.setEnabled(true);
    }
    while (true)
    {
      if ((localq.tny == 1) && (!this.pGN.contains(localq.tnz)))
      {
        ab.d("MicroMsg.PhoneRechargeAdapter", "show recommendid: %s", new Object[] { localq.tnz });
        localb.pGS.setVisibility(0);
      }
      if ((localq.type == 1) && (localq.tnv.equals("1")) && (!localq.tnw.equals("0")))
      {
        Object localObject1 = paramViewGroup.getContext();
        paramInt = Color.parseColor(localq.tnw);
        Object localObject2 = new GradientDrawable();
        ((GradientDrawable)localObject2).setShape(0);
        ((GradientDrawable)localObject2).setCornerRadius(a.fromDPToPix((Context)localObject1, 2));
        ((GradientDrawable)localObject2).setColor(paramInt);
        Object localObject3 = new GradientDrawable();
        ((GradientDrawable)localObject3).setShape(0);
        ((GradientDrawable)localObject3).setCornerRadius(a.fromDPToPix((Context)localObject1, 2));
        ((GradientDrawable)localObject3).setStroke(2, a.i((Context)localObject1, 2131690376));
        Object localObject4 = new GradientDrawable();
        ((GradientDrawable)localObject4).setShape(0);
        ((GradientDrawable)localObject4).setCornerRadius(a.fromDPToPix((Context)localObject1, 2));
        ((GradientDrawable)localObject4).setColor(a.i((Context)localObject1, 2131690374));
        ((GradientDrawable)localObject4).setStroke(2, paramInt);
        localObject1 = new StateListDrawable();
        ((StateListDrawable)localObject1).addState(new int[] { 16842919 }, (Drawable)localObject2);
        ((StateListDrawable)localObject1).addState(new int[] { -16842910 }, (Drawable)localObject3);
        ((StateListDrawable)localObject1).addState(new int[0], (Drawable)localObject4);
        paramViewGroup = paramViewGroup.getContext();
        int i = Color.parseColor(localq.tnw);
        localObject4 = new int[] { 16842919 };
        localObject2 = new int[] { -16842910 };
        localObject3 = new int[0];
        int j = a.i(paramViewGroup, 2131690691);
        paramInt = a.i(paramViewGroup, 2131690372);
        paramViewGroup = new ColorStateList(new int[][] { localObject4, localObject2, localObject3 }, new int[] { j, paramInt, i });
        localb.hrg.setTextColor(paramViewGroup);
        localb.gtb.setTextColor(paramViewGroup);
        paramView.setBackground((Drawable)localObject1);
      }
      paramView.setOnClickListener(new b.1(this, localq, localb));
      AppMethodBeat.o(44251);
      return paramView;
      localb = (b.b)paramView.getTag();
      break;
      label655: localb.hrg.setVisibility(8);
      break label153;
      label668: localb.pGR.setVisibility(8);
      break label186;
      label681: paramView.setEnabled(false);
      localb.hrg.setEnabled(false);
      localb.gtb.setEnabled(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.b
 * JD-Core Version:    0.6.2
 */