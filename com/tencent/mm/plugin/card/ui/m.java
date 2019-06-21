package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.b;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class m extends BaseAdapter
{
  private List<b> kaW;
  View.OnClickListener koa;
  boolean kob;
  private Context mContext;

  public m(Context paramContext)
  {
    AppMethodBeat.i(88685);
    this.kaW = new ArrayList();
    this.kob = false;
    this.mContext = paramContext;
    AppMethodBeat.o(88685);
  }

  private static void a(View paramView, b paramb)
  {
    AppMethodBeat.i(88690);
    if (paramb == null)
      AppMethodBeat.o(88690);
    while (true)
    {
      return;
      o(paramView, paramb.kch);
      AppMethodBeat.o(88690);
    }
  }

  private static void o(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(88691);
    Rect localRect = com.tencent.mm.plugin.card.d.m.dc(paramView);
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    if (paramBoolean)
      paramView.setBackgroundResource(2130839563);
    while (true)
    {
      paramView.setLayoutParams(localLayoutParams);
      com.tencent.mm.plugin.card.d.m.k(paramView, localRect);
      AppMethodBeat.o(88691);
      return;
      paramView.setBackgroundResource(2130839162);
    }
  }

  private b tg(int paramInt)
  {
    AppMethodBeat.i(88688);
    b localb = (b)this.kaW.get(paramInt);
    AppMethodBeat.o(88688);
    return localb;
  }

  public final int getCount()
  {
    AppMethodBeat.i(88687);
    int i = this.kaW.size();
    AppMethodBeat.o(88687);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(88689);
    final b localb = tg(paramInt);
    switch (localb.kcg)
    {
    default:
      if (paramView == null)
        break;
    case 2:
    }
    for (paramViewGroup = (m.a)paramView.getTag(); ; paramViewGroup = null)
    {
      Object localObject;
      if (paramView != null)
      {
        localObject = paramViewGroup;
        if (paramViewGroup != null);
      }
      else
      {
        paramView = View.inflate(this.mContext, 2130968898, null);
        localObject = new m.a(this, (byte)0);
        ((m.a)localObject).kne = ((TextView)paramView.findViewById(2131821951));
        ((m.a)localObject).kog = ((TextView)paramView.findViewById(2131821952));
        ((m.a)localObject).koh = ((TextView)paramView.findViewById(2131821948));
        ((m.a)localObject).koi = ((ImageView)paramView.findViewById(2131821950));
        ((m.a)localObject).jAp = paramView.findViewById(2131821949);
        ((m.a)localObject).koj = ((CheckBox)paramView.findViewById(2131821953));
        paramView.setTag(localObject);
      }
      ((m.a)localObject).kne.setText(localb.title);
      label249: int i;
      if (localb.kci)
      {
        ((m.a)localObject).koj.setVisibility(0);
        ((m.a)localObject).koj.setChecked(localb.kcj);
        ((m.a)localObject).koj.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            AppMethodBeat.i(88684);
            if (((CheckBox)paramAnonymousView).isChecked())
            {
              localb.kcj = true;
              AppMethodBeat.o(88684);
            }
            while (true)
            {
              return;
              localb.kcj = false;
              AppMethodBeat.o(88684);
            }
          }
        });
        if (!TextUtils.isEmpty(localb.kbW))
          break label602;
        ((m.a)localObject).kog.setVisibility(4);
        if ((localb.vUW & 1L) <= 0L)
          break label627;
        i = 1;
        label264: if (i == 0)
          break label633;
        ((m.a)localObject).kne.setGravity(17);
        ((m.a)localObject).kne.setTextColor(this.mContext.getResources().getColor(2131690208));
        ((m.a)localObject).kog.setVisibility(8);
        label309: if (!localb.kch)
          break label666;
        ((m.a)localObject).koh.setVisibility(0);
        label326: ((m.a)localObject).kog.setTextColor(this.mContext.getResources().getColor(2131690191));
        if (bo.isNullOrNil(localb.kKZ))
          break label679;
        i = 1;
        label360: if (i == 0)
          break label685;
        ((m.a)localObject).koi.setVisibility(0);
        com.tencent.mm.plugin.card.d.m.a(((m.a)localObject).koi, localb.kKZ, a.fromDPToPix(this.mContext, 20), 2130839644, false);
        label399: if (paramInt + 1 >= getCount())
          break label698;
        paramViewGroup = tg(paramInt);
        a(((m.a)localObject).jAp, paramViewGroup);
        paramViewGroup = tg(paramInt + 1);
        a(((m.a)localObject).jAp, paramViewGroup);
      }
      while (true)
      {
        AppMethodBeat.o(88689);
        return paramView;
        paramView = View.inflate(this.mContext, 2130968897, null);
        paramViewGroup = (TextView)paramView.findViewById(2131821943);
        localObject = (TextView)paramView.findViewById(2131821944);
        LinearLayout localLinearLayout = (LinearLayout)paramView.findViewById(2131821945);
        if (!TextUtils.isEmpty(localb.kck))
        {
          localLinearLayout.setTag(localb.kck);
          localLinearLayout.setOnClickListener(new m.1(this));
          ((ImageView)paramView.findViewById(2131821946)).setBackgroundColor(l.Hn(localb.color));
          localLinearLayout.setVisibility(0);
        }
        while (true)
        {
          paramViewGroup.setText(localb.title);
          ((TextView)localObject).setText(localb.kbW);
          AppMethodBeat.o(88689);
          break;
          localLinearLayout.setVisibility(8);
        }
        ((m.a)localObject).koj.setVisibility(8);
        break;
        label602: ((m.a)localObject).kog.setVisibility(0);
        ((m.a)localObject).kog.setText(localb.kbW);
        break label249;
        label627: i = 0;
        break label264;
        label633: ((m.a)localObject).kne.setGravity(3);
        ((m.a)localObject).kne.setTextColor(this.mContext.getResources().getColor(2131690192));
        break label309;
        label666: ((m.a)localObject).koh.setVisibility(8);
        break label326;
        label679: i = 0;
        break label360;
        label685: ((m.a)localObject).koi.setVisibility(8);
        break label399;
        label698: if (paramInt + 1 == getCount())
          if (this.kob)
            o(((m.a)localObject).jAp, true);
          else
            o(((m.a)localObject).jAp, false);
      }
    }
  }

  public final void setData(List<b> paramList)
  {
    AppMethodBeat.i(88686);
    this.kaW.clear();
    this.kaW.addAll(paramList);
    AppMethodBeat.o(88686);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.m
 * JD-Core Version:    0.6.2
 */