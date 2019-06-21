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
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class d extends a
{
  public d(Context paramContext, com.tencent.mm.view.f.a parama)
  {
    super(paramContext, parama);
  }

  public final int QC(int paramInt)
  {
    return (this.Abd - 1) * this.Abe + paramInt;
  }

  public int getCount()
  {
    return this.Abd;
  }

  public Object getItem(int paramInt)
  {
    AppMethodBeat.i(62977);
    f localf = new f();
    if (paramInt == getCount() - 1);
    for (localf.position = -1; ; localf.position = QC(paramInt))
    {
      AppMethodBeat.o(62977);
      return localf;
    }
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(62979);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(paramViewGroup.getContext()).inflate(2130970702, null);
      paramView.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
      paramViewGroup = new d.a(this, paramView);
      paramView.setTag(paramViewGroup);
      if (paramInt != getCount() - 1)
        break label111;
      paramViewGroup.iqT.setImageResource(2130838450);
      paramViewGroup.iqT.setContentDescription(this.mContext.getString(2131298865));
    }
    while (true)
    {
      AppMethodBeat.o(62979);
      return paramView;
      paramViewGroup = (d.a)paramView.getTag();
      break;
      label111: paramInt = QC(paramInt);
      if (paramInt > this.emW - 1)
      {
        paramViewGroup.iqT.setImageDrawable(null);
        paramViewGroup.iqT.setContentDescription("");
        ab.i("MicroMsg.emoji.DefaultSmileyAdapter", "real position is bigger real count.");
      }
      else
      {
        Drawable localDrawable = e.dqK().qJ(paramInt);
        paramViewGroup.iqT.setImageDrawable(localDrawable);
        String str1 = e.dqK().getText(paramInt);
        String str2 = str1;
        if (bo.isNullOrNil(str1))
          str2 = paramView.getResources().getString(2131299163);
        paramViewGroup.iqT.setContentDescription(str2);
        if (localDrawable == null)
          ab.i("MicroMsg.emoji.DefaultSmileyAdapter", "drawable is null. realPosition:%d description:%s", new Object[] { Integer.valueOf(paramInt), str2 });
      }
    }
  }

  public boolean ui(int paramInt)
  {
    AppMethodBeat.i(62978);
    boolean bool;
    if (paramInt != getCount() - 1)
    {
      bool = true;
      AppMethodBeat.o(62978);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62978);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.a.d
 * JD-Core Version:    0.6.2
 */