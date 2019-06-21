package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.exdevice.f.a.e;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.mq;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import java.util.ArrayList;
import java.util.List;

final class a extends BaseAdapter
{
  String igi;
  c lBs;
  private boolean lBt;
  boolean lBu;
  int lBv;
  int lBw;
  ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> lBx;
  List<mq> lBy;
  private View lBz;
  private String mAppName;
  private Context mContext;

  public a(Context paramContext, String paramString1, boolean paramBoolean, String paramString2)
  {
    this.mContext = paramContext;
    this.igi = paramString2;
    this.lBt = paramBoolean;
    this.mAppName = paramString1;
  }

  public final int getCount()
  {
    if (this.lBt);
    for (int i = this.lBv + 5 + this.lBw; ; i = 2)
      return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(20007);
    AppMethodBeat.o(20007);
    return Integer.valueOf(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    int i = 0;
    if (!this.lBt)
      if (paramInt != 0);
    while (true)
    {
      return i;
      i = 4;
      continue;
      if (paramInt != 0)
        if (paramInt == 1)
          i = 6;
        else if ((paramInt > 1) && (paramInt <= this.lBv + 1))
          i = 1;
        else if (paramInt == this.lBv + 2)
          i = 2;
        else if (paramInt == this.lBv + 3)
          i = 5;
        else if ((paramInt > this.lBv + 3) && (paramInt <= this.lBv + 3 + this.lBw))
          i = 3;
        else if (paramInt == this.lBv + this.lBw + 4)
          i = 7;
        else
          i = 5;
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(20008);
    int i = getItemViewType(paramInt);
    Object localObject;
    a.c localc;
    a.a locala;
    a.d locald;
    a.e locale;
    a.f localf;
    if (paramView == null)
      switch (i)
      {
      default:
        paramViewGroup = null;
        localObject = null;
        localc = null;
        locala = null;
        locald = null;
        locale = null;
        localf = null;
        switch (i)
        {
        case 5:
        default:
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 6:
        case 7:
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
    while (true)
    {
      AppMethodBeat.o(20008);
      return paramView;
      if (this.lBz == null)
        this.lBz = LayoutInflater.from(this.mContext).inflate(2130969432, paramViewGroup, false);
      paramView = this.lBz;
      localf = new a.f(this);
      localf.kEn = ((ImageView)paramView.findViewById(2131823698));
      paramView.setTag(localf);
      paramViewGroup = null;
      localObject = null;
      localc = null;
      locala = null;
      locald = null;
      locale = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(2130969431, paramViewGroup, false);
      locale = new a.e(this);
      locale.lBF = ((NoMeasuredTextView)paramView.findViewById(2131823689));
      locale.lBG = ((TextView)paramView.findViewById(2131823690));
      locale.kEn = ((ImageView)paramView.findViewById(2131823686));
      locale.lBB = paramView.findViewById(2131823685);
      locale.lBF.setTextSize(0, this.mContext.getResources().getDimension(2131427632));
      locale.lBF.setTextColor(this.mContext.getResources().getColor(2131690006));
      locale.lBF.setSingleLine(true);
      locale.lBF.setShouldEllipsize(true);
      paramView.setTag(locale);
      paramViewGroup = null;
      localObject = null;
      localc = null;
      locala = null;
      locald = null;
      localf = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(2130969427, paramViewGroup, false);
      locala = new a.a(this);
      locala.jao = ((TextView)paramView.findViewById(2131823672));
      locala.lBB = paramView.findViewById(2131823668);
      locala.lyB = ((ImageView)paramView.findViewById(2131823669));
      paramView.setTag(locala);
      paramViewGroup = null;
      localObject = null;
      localc = null;
      locald = null;
      locale = null;
      localf = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(2130969427, paramViewGroup, false);
      localc = new a.c(this);
      localc.jao = ((TextView)paramView.findViewById(2131823672));
      localc.lBB = paramView.findViewById(2131823668);
      localc.lyB = ((ImageView)paramView.findViewById(2131823669));
      localc.lBD = paramView.findViewById(2131823674);
      paramView.setTag(localc);
      paramViewGroup = null;
      localObject = null;
      locala = null;
      locald = null;
      locale = null;
      localf = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(2130969430, paramViewGroup, false);
      locald = new a.d(this);
      locald.lBE = ((Button)paramView.findViewById(2131823683));
      paramView.setTag(locald);
      paramViewGroup = null;
      localObject = null;
      localc = null;
      locala = null;
      locale = null;
      localf = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(2130969429, paramViewGroup, false);
      paramView.setTag(new b());
      paramViewGroup = null;
      localObject = null;
      localc = null;
      locala = null;
      locald = null;
      locale = null;
      localf = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(2130969429, paramViewGroup, false);
      localObject = new b();
      ((b)localObject).jao = ((TextView)paramView.findViewById(2131823680));
      paramView.setTag(localObject);
      paramViewGroup = null;
      localc = null;
      locala = null;
      locald = null;
      locale = null;
      localf = null;
      break;
      paramView = LayoutInflater.from(this.mContext).inflate(2130969429, paramViewGroup, false);
      paramViewGroup = new b();
      paramViewGroup.lBC = paramView.findViewById(2131823678);
      paramView.setTag(paramViewGroup);
      localObject = null;
      localc = null;
      locala = null;
      locald = null;
      locale = null;
      localf = null;
      break;
      switch (i)
      {
      default:
        paramViewGroup = null;
        localObject = null;
        localc = null;
        locala = null;
        locald = null;
        locale = null;
        localf = null;
        break;
      case 0:
        localf = (a.f)paramView.getTag();
        paramViewGroup = null;
        localObject = null;
        localc = null;
        locala = null;
        locald = null;
        locale = null;
        break;
      case 1:
        locale = (a.e)paramView.getTag();
        paramViewGroup = null;
        localObject = null;
        localc = null;
        locala = null;
        locald = null;
        localf = null;
        break;
      case 2:
        locala = (a.a)paramView.getTag();
        paramViewGroup = null;
        localObject = null;
        localc = null;
        locald = null;
        locale = null;
        localf = null;
        break;
      case 3:
        localc = (a.c)paramView.getTag();
        paramViewGroup = null;
        localObject = null;
        locala = null;
        locald = null;
        locale = null;
        localf = null;
        break;
      case 4:
        locald = (a.d)paramView.getTag();
        paramViewGroup = null;
        localObject = null;
        localc = null;
        locala = null;
        locale = null;
        localf = null;
        break;
      case 5:
        paramView.getTag();
        paramViewGroup = null;
        localObject = null;
        localc = null;
        locala = null;
        locald = null;
        locale = null;
        localf = null;
        break;
      case 6:
        localObject = (b)paramView.getTag();
        paramViewGroup = null;
        localc = null;
        locala = null;
        locald = null;
        locale = null;
        localf = null;
        break;
      case 7:
        paramViewGroup = (b)paramView.getTag();
        localObject = null;
        localc = null;
        locala = null;
        locald = null;
        locale = null;
        localf = null;
        break;
        com.tencent.mm.pluginsdk.ui.a.b.s(localf.kEn, this.igi);
        localf.kEn.setOnClickListener(new a.1(this));
        continue;
        if ((paramInt - 2 >= 0) && (!bo.ek(this.lBx)))
        {
          localObject = (com.tencent.mm.plugin.exdevice.f.b.a.c)this.lBx.get(paramInt - 2);
          if (localObject != null)
          {
            paramInt = ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject).field_step;
            paramViewGroup = ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject).field_username;
            if (((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject).field_step >= 10000)
              locale.lBG.setTextColor(this.mContext.getResources().getColor(2131690005));
            while (true)
            {
              locale.lBF.setText(j.b(this.mContext, s.mJ(paramViewGroup), locale.lBF.getTextSize()));
              locale.lBG.setText(String.valueOf(paramInt));
              com.tencent.mm.pluginsdk.ui.a.b.r(locale.kEn, paramViewGroup);
              locale.lBB.setOnClickListener(new a.2(this, paramViewGroup));
              break;
              locale.lBG.setTextColor(this.mContext.getResources().getColor(2131690004));
            }
            locala.jao.setText(this.mContext.getResources().getText(2131299349));
            locala.lyB.setImageResource(2131231210);
            locala.lBB.setOnClickListener(new a.3(this));
            continue;
            if ((paramInt - this.lBv - 4 >= 0) && (!bo.ek(this.lBy)))
            {
              localObject = (mq)this.lBy.get(paramInt - this.lBv - 4);
              if (localObject != null)
              {
                paramViewGroup = ((mq)localObject).title;
                localObject = ((mq)localObject).cIY;
                localc.jao.setText(paramViewGroup);
                if (paramInt - this.lBv - 4 != this.lBw - 1)
                  localc.lBD.setVisibility(0);
                e.a(this.mContext, localc.lyB, (String)localObject);
                localc.lBB.setOnClickListener(new a.4(this));
                continue;
                if (!this.lBu)
                {
                  aw.ZK();
                  if (com.tencent.mm.model.c.XM().aoJ(this.igi))
                  {
                    locald.lBE.setVisibility(0);
                    locald.lBE.setOnClickListener(new a.5(this));
                  }
                }
                else
                {
                  locald.lBE.setVisibility(4);
                  continue;
                  ((b)localObject).jao.setText(this.mContext.getString(2131299358));
                  continue;
                  paramViewGroup.lBC.setVisibility(0);
                }
              }
            }
          }
        }
        break;
      }
    }
  }

  public final int getViewTypeCount()
  {
    return 8;
  }

  final class b
  {
    TextView jao;
    View lBC;

    b()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.a
 * JD-Core Version:    0.6.2
 */