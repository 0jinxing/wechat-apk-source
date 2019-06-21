package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.a.a.f;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.protocal.protobuf.EmotionSummary;

public final class d extends com.tencent.mm.plugin.emoji.a.a.a
{
  public d(Context paramContext)
  {
    super(paramContext);
  }

  public final View b(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(52738);
    paramViewGroup = (d.a)paramView.getTag();
    Object localObject = tX(paramInt);
    if ((paramViewGroup != null) && (localObject != null))
    {
      ((f)localObject).kTf = false;
      ((f)localObject).kTg = false;
      localObject = ((f)localObject).kTb;
      if (localObject != null)
      {
        paramViewGroup.setTitle(((EmotionSummary)localObject).PackName);
        o.ahp().a(((EmotionSummary)localObject).IconUrl, paramViewGroup.bji(), g.dH(((EmotionSummary)localObject).ProductID, ((EmotionSummary)localObject).IconUrl));
        paramViewGroup.IQ(h.aJ("yyyy-MM-dd", ((EmotionSummary)localObject).Timestamp * 1000L));
      }
    }
    AppMethodBeat.o(52738);
    return paramView;
  }

  public final int bjw()
  {
    return 0;
  }

  public final int bjx()
  {
    return 0;
  }

  public final int bjy()
  {
    return 0;
  }

  public final a d(Context paramContext, View paramView)
  {
    AppMethodBeat.i(52737);
    paramContext = new d.a(this, paramContext, paramView);
    paramContext.a(this.kSQ);
    AppMethodBeat.o(52737);
    return paramContext;
  }

  public final void tU(int paramInt)
  {
  }

  public final void tV(int paramInt)
  {
  }

  public final void tW(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.d
 * JD-Core Version:    0.6.2
 */