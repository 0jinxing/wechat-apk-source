package com.tencent.mm.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.e;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.view.f.a;

public final class f extends d
{
  public int Abr = 1;
  private ImageView Abs;
  private ImageView Abt;

  public f(Context paramContext, a parama)
  {
    super(paramContext, parama);
  }

  public final boolean QD(int paramInt)
  {
    if ((this.Abr == 0) && (paramInt == this.njC * this.Abg - 5));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void bv(float paramFloat)
  {
    AppMethodBeat.i(62989);
    if ((paramFloat >= 0.0F) && (paramFloat <= 1.0F))
      if (this.Abs != null)
      {
        if (paramFloat <= 0.01F)
          this.Abs.setVisibility(4);
      }
      else
      {
        if (this.Abt == null)
          break label112;
        if (paramFloat < 0.99F)
          break label90;
        this.Abt.setVisibility(4);
        AppMethodBeat.o(62989);
      }
    while (true)
    {
      return;
      this.Abs.setVisibility(0);
      this.Abs.setImageAlpha((int)(255.0F * paramFloat));
      break;
      label90: this.Abt.setVisibility(0);
      this.Abt.setImageAlpha((int)((1.0F - paramFloat) * 255.0F));
      label112: AppMethodBeat.o(62989);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(62988);
    if (paramInt == this.njC * this.Abg - 5)
    {
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970700, null);
      paramViewGroup.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
      this.Abs = ((ImageView)paramViewGroup.findViewById(2131827576));
      this.Abt = ((ImageView)paramViewGroup.findViewById(2131827575));
      paramInt = QC(paramInt);
      paramView = e.dqK().qJ(paramInt);
      this.Abs.setImageDrawable(paramView);
      String str = e.dqK().getText(paramInt);
      paramView = str;
      if (bo.isNullOrNil(str))
        paramView = paramViewGroup.getResources().getString(2131299163);
      this.Abs.setContentDescription(paramView);
      this.Abt.setImageResource(2130838450);
      this.Abt.setContentDescription(this.mContext.getString(2131298865));
      bv(this.Abr);
    }
    for (paramView = paramViewGroup; ; paramView = super.getView(paramInt, paramView, paramViewGroup))
    {
      AppMethodBeat.o(62988);
      return paramView;
    }
  }

  public final boolean ui(int paramInt)
  {
    AppMethodBeat.i(62987);
    boolean bool;
    if ((super.ui(paramInt)) && (!QD(paramInt)))
    {
      bool = true;
      AppMethodBeat.o(62987);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62987);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.f
 * JD-Core Version:    0.6.2
 */