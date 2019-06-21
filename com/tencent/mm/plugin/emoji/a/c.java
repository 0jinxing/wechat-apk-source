package com.tencent.mm.plugin.emoji.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.a.a.d;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends com.tencent.mm.plugin.emoji.a.a.a
{
  private final String TAG = "MicroMsg.emoji.EmojiMineAdapter";
  private ProgressDialog gqo;

  public c(Context paramContext)
  {
    super(paramContext);
  }

  public final com.tencent.mm.plugin.emoji.a.a.c a(com.tencent.mm.plugin.emoji.model.f paramf)
  {
    AppMethodBeat.i(52730);
    paramf = new d(paramf);
    AppMethodBeat.o(52730);
    return paramf;
  }

  public final View b(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(52728);
    paramViewGroup = (c.a)paramView.getTag();
    Object localObject = tX(paramInt);
    if ((paramViewGroup != null) && (localObject != null))
    {
      localObject = ((com.tencent.mm.plugin.emoji.a.a.f)localObject).kTb;
      if (localObject != null)
      {
        if (!com.tencent.mm.plugin.emoji.h.a.g((EmotionSummary)localObject))
          break label83;
        paramViewGroup.bjh();
        paramViewGroup.bjj();
      }
    }
    while (true)
    {
      if (paramInt + 1 == getCount())
        paramViewGroup.kRC.setBackgroundResource(2130838398);
      AppMethodBeat.o(52728);
      return paramView;
      label83: if (!bo.isNullOrNil(((EmotionSummary)localObject).PackName))
        paramViewGroup.setTitle(((EmotionSummary)localObject).PackName);
      while (true)
      {
        if (bo.isNullOrNil(((EmotionSummary)localObject).IconUrl))
          break label157;
        o.ahp().a(((EmotionSummary)localObject).IconUrl, paramViewGroup.bji(), g.dH(((EmotionSummary)localObject).ProductID, ((EmotionSummary)localObject).IconUrl));
        break;
        paramViewGroup.setTitle(((EmotionSummary)localObject).ProductID);
      }
      label157: ab.i("MicroMsg.emoji.EmojiMineAdapter", "Icon rul is null");
      paramViewGroup.bji().setImageDrawable(null);
    }
  }

  public final void bW(String paramString, int paramInt)
  {
    AppMethodBeat.i(52731);
    if (paramInt == 7)
      super.bW(paramString, paramInt);
    AppMethodBeat.o(52731);
  }

  public final void bjv()
  {
    AppMethodBeat.i(52733);
    super.bjv();
    AppMethodBeat.o(52733);
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

  public final void clear()
  {
    AppMethodBeat.i(52732);
    if (this.gqo != null)
      this.gqo.cancel();
    super.clear();
    AppMethodBeat.o(52732);
  }

  public final a d(Context paramContext, View paramView)
  {
    AppMethodBeat.i(52729);
    paramContext = new c.a(this, paramContext, paramView);
    paramContext.a(this.kSQ);
    AppMethodBeat.o(52729);
    return paramContext;
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(52727);
    if (this.kSP == null)
      this.kSP = a(null);
    super.notifyDataSetChanged();
    AppMethodBeat.o(52727);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.c
 * JD-Core Version:    0.6.2
 */