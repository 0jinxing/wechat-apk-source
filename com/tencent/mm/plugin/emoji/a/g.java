package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.a.a.a;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.storage.at;

public final class g extends f
{
  private int kSp = 0;
  private int kSq = 0;
  private int kSr = 0;

  public g(Context paramContext)
  {
    super(paramContext);
  }

  public final View b(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(52752);
    f.a locala = (f.a)paramView.getTag();
    if (this.kSp > 0)
      if (paramInt == 0)
      {
        locala.kRO.setVisibility(0);
        locala.kRO.setText(this.mContext.getString(2131299113));
      }
    while (true)
    {
      if (locala.kRQ != null)
        locala.kRQ.postDelayed(new g.1(this, locala), 100L);
      paramView = super.b(paramInt, paramView, paramViewGroup);
      AppMethodBeat.o(52752);
      return paramView;
      if ((this.kSq > 0) && (paramInt == this.kSp))
      {
        locala.kRO.setVisibility(0);
        locala.kRO.setText(this.mContext.getString(2131299134));
      }
      else if (paramInt == this.kSp + this.kSq)
      {
        locala.kRO.setVisibility(0);
        if (j.getEmojiStorageMgr().dta())
          locala.kRO.setText(2131299133);
        else
          locala.kRO.setText(this.mContext.getString(2131299093));
      }
      else
      {
        locala.kRO.setVisibility(8);
        continue;
        if (this.kSq > 0)
        {
          if (paramInt == 0)
          {
            locala.kRO.setVisibility(0);
            locala.kRO.setText(this.mContext.getString(2131299134));
          }
          else if (paramInt == this.kSp + this.kSq)
          {
            locala.kRO.setVisibility(0);
            if (j.getEmojiStorageMgr().dta())
              locala.kRO.setText(2131299133);
            else
              locala.kRO.setText(this.mContext.getString(2131299093));
          }
          else
          {
            locala.kRO.setVisibility(8);
          }
        }
        else if (paramInt == 0)
        {
          locala.kRO.setVisibility(0);
          if (j.getEmojiStorageMgr().dta())
            locala.kRO.setText(2131299133);
          else
            locala.kRO.setText(this.mContext.getString(2131299093));
        }
        else
        {
          locala.kRO.setVisibility(8);
        }
      }
    }
  }

  protected final boolean bjA()
  {
    AppMethodBeat.i(52754);
    boolean bool = j.getEmojiStorageMgr().dta();
    AppMethodBeat.o(52754);
    return bool;
  }

  public final int bjw()
  {
    return this.kSp;
  }

  public final int bjx()
  {
    return this.kSq;
  }

  public final int bjy()
  {
    return this.kSr;
  }

  public final int getCount()
  {
    AppMethodBeat.i(52751);
    int i = super.getCount();
    AppMethodBeat.o(52751);
    return i;
  }

  public final void tU(int paramInt)
  {
    this.kSp = paramInt;
  }

  public final void tV(int paramInt)
  {
    this.kSq = paramInt;
  }

  public final void tW(int paramInt)
  {
    this.kSr = paramInt;
  }

  public final com.tencent.mm.plugin.emoji.a.a.f tX(int paramInt)
  {
    AppMethodBeat.i(52753);
    com.tencent.mm.plugin.emoji.a.a.f localf = super.tX(paramInt);
    AppMethodBeat.o(52753);
    return localf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.g
 * JD-Core Version:    0.6.2
 */