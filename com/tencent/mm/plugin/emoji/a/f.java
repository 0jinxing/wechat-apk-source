package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.a.a.e;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.protocal.protobuf.EmotionBannerSet;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.sdk.platformtools.bo;

public class f extends com.tencent.mm.plugin.emoji.a.a.a
{
  private final String TAG = "MicroMsg.emoji.EmojiStoreMainAdapter";
  public boolean kSk = false;
  public boolean kSl = true;
  public boolean kSm = false;
  public boolean kSn = true;

  public f(Context paramContext)
  {
    super(paramContext);
  }

  public View b(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 1;
    AppMethodBeat.i(52749);
    f.a locala = (f.a)paramView.getTag();
    paramViewGroup = tX(paramInt);
    if (this.kSm)
    {
      paramViewGroup.kTh = true;
      paramViewGroup.kTf = false;
      paramViewGroup.kTg = false;
    }
    EmotionBannerSet localEmotionBannerSet;
    label128: boolean bool;
    if ((locala != null) && (paramViewGroup != null))
    {
      paramViewGroup.kTg = this.kSn;
      localEmotionBannerSet = paramViewGroup.kTc;
      if (localEmotionBannerSet != null)
        break label240;
      locala.tT(0);
      paramInt = 0;
      if (paramInt == 0)
      {
        paramViewGroup = paramViewGroup.kTb;
        if (paramViewGroup != null)
        {
          locala.setTitle(paramViewGroup.PackName);
          if (!com.tencent.mm.plugin.emoji.h.a.g(paramViewGroup))
            break label363;
          o.ahp().a("", locala.bji());
          locala.bjj();
          bool = e.dR(paramViewGroup.PackType, 2);
          if (TextUtils.isEmpty(paramViewGroup.TagUri))
            break label392;
          locala.bjk().setImageDrawable(null);
          locala.bjk().setVisibility(0);
          o.ahp().a(paramViewGroup.TagUri, locala.bjk(), g.dH("", paramViewGroup.TagUri));
          label190: if (!bjA())
            break label421;
        }
      }
    }
    label392: label421: for (paramViewGroup = paramViewGroup.ExptDesc; ; paramViewGroup = paramViewGroup.Introduce)
    {
      locala.IR(paramViewGroup);
      if ((this.kSk) && (locala.kRC != null))
        locala.kRC.setBackgroundResource(2130838398);
      AppMethodBeat.o(52749);
      return paramView;
      label240: locala.setTitle(localEmotionBannerSet.Title);
      locala.IR(localEmotionBannerSet.Desc);
      if (!bo.isNullOrNil(localEmotionBannerSet.IconUrl))
        o.ahp().a(localEmotionBannerSet.IconUrl, locala.bji(), g.dH("", localEmotionBannerSet.IconUrl));
      if (!bo.isNullOrNil(localEmotionBannerSet.TagUrl))
      {
        o.ahp().a(localEmotionBannerSet.TagUrl, locala.bjk(), g.dH("", localEmotionBannerSet.TagUrl));
        locala.tS(0);
      }
      while (true)
      {
        locala.tT(8);
        paramInt = i;
        break;
        locala.tS(8);
      }
      label363: o.ahp().a(paramViewGroup.IconUrl, locala.bji(), g.dH(paramViewGroup.ProductID, paramViewGroup.IconUrl));
      break label128;
      if (bool)
      {
        locala.tS(0);
        locala.bjl();
        break label190;
      }
      locala.tS(8);
      break label190;
    }
  }

  protected boolean bjA()
  {
    return false;
  }

  public int bjw()
  {
    return 0;
  }

  public int bjx()
  {
    return 0;
  }

  public int bjy()
  {
    return 0;
  }

  public final void clear()
  {
    AppMethodBeat.i(52748);
    super.clear();
    AppMethodBeat.o(52748);
  }

  public final a d(Context paramContext, View paramView)
  {
    AppMethodBeat.i(52747);
    paramContext = new f.a(this, paramContext, paramView);
    paramContext.a(this.kSQ);
    AppMethodBeat.o(52747);
    return paramContext;
  }

  public void tU(int paramInt)
  {
  }

  public void tV(int paramInt)
  {
  }

  public void tW(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.f
 * JD-Core Version:    0.6.2
 */