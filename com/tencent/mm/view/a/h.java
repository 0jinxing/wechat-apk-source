package com.tencent.mm.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.e;
import com.tencent.mm.emoji.a.f;
import com.tencent.mm.ipcinvoker.h.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.t;
import java.util.List;

public final class h extends a
{
  private List<t> Abu;

  public h(Context paramContext, com.tencent.mm.view.f.a parama)
  {
    super(paramContext, parama);
  }

  private int QC(int paramInt)
  {
    AppMethodBeat.i(62994);
    if ((this.Abu != null) && (paramInt >= 0) && (paramInt < this.Abu.size()))
    {
      paramInt = ((t)this.Abu.get(paramInt)).position;
      AppMethodBeat.o(62994);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(62994);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(62992);
    int i;
    if (this.Abu == null)
    {
      i = 0;
      AppMethodBeat.o(62992);
    }
    while (true)
    {
      return i;
      i = this.Abg * this.njC;
      if (i > this.Abu.size())
      {
        i = this.Abu.size();
        AppMethodBeat.o(62992);
      }
      else
      {
        AppMethodBeat.o(62992);
      }
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(62993);
    f localf = new f();
    localf.position = QC(paramInt);
    AppMethodBeat.o(62993);
    return localf;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(62995);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970702, null);
      paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
      paramViewGroup = new h.a(this, paramView);
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      paramInt = QC(paramInt);
      Drawable localDrawable = e.dqK().qJ(paramInt);
      paramViewGroup.iqT.setImageDrawable(localDrawable);
      String str1 = e.dqK().getText(paramInt);
      String str2 = str1;
      if (bo.isNullOrNil(str1))
        str2 = paramView.getResources().getString(2131299163);
      paramViewGroup.iqT.setContentDescription(str2);
      if (localDrawable == null)
        b.i("RecentSmileyAdapter", "drawable is null. realPosition:%d description:%s", new Object[] { Integer.valueOf(paramInt), str2 });
      AppMethodBeat.o(62995);
      return paramView;
      paramViewGroup = (h.a)paramView.getTag();
    }
  }

  public final void update()
  {
    AppMethodBeat.i(62991);
    this.Abu = this.Aal.AeG;
    notifyDataSetChanged();
    AppMethodBeat.o(62991);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.h
 * JD-Core Version:    0.6.2
 */