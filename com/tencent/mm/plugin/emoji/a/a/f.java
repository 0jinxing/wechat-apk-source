package com.tencent.mm.plugin.emoji.a.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.EmotionBannerSet;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ar;

public final class f
{
  public int EV;
  public f.a kTa;
  public EmotionSummary kTb;
  public EmotionBannerSet kTc;
  public int kTd;
  public String kTe;
  public boolean kTf;
  public boolean kTg = true;
  public boolean kTh = false;
  public int mStatus;

  public f(EmotionBannerSet paramEmotionBannerSet)
  {
    this.kTc = paramEmotionBannerSet;
    this.kTa = f.a.kTj;
  }

  public f(EmotionSummary paramEmotionSummary)
  {
    this.kTb = paramEmotionSummary;
    this.kTa = f.a.kTi;
  }

  public final void a(boolean paramBoolean1, ar paramar, boolean paramBoolean2)
  {
    AppMethodBeat.i(52806);
    EmotionSummary localEmotionSummary = this.kTb;
    if (localEmotionSummary == null)
      AppMethodBeat.o(52806);
    while (true)
    {
      return;
      if (!paramBoolean2)
        break;
      setStatus(7);
      AppMethodBeat.o(52806);
    }
    paramBoolean2 = e.a(localEmotionSummary);
    boolean bool1 = e.b(localEmotionSummary);
    boolean bool2 = e.e(localEmotionSummary);
    boolean bool3 = TextUtils.isEmpty(localEmotionSummary.PackPrice);
    if ((bool2) && (bool1))
      setStatus(8);
    while (true)
    {
      if ((paramBoolean1) && (paramar != null) && (!bo.isNullOrNil(paramar.xYb)))
      {
        this.kTb.PackPrice = paramar.xYb;
        this.kTb.PriceNum = paramar.xYa;
        this.kTb.PriceType = paramar.xXZ;
      }
      AppMethodBeat.o(52806);
      break;
      if (paramBoolean2)
      {
        setStatus(3);
        if ((bool1) || ((!paramBoolean1) && (bool3)))
          this.kTd = 0;
        else
          this.kTd = 1;
      }
      else if ((bool1) || ((!paramBoolean1) && (bool3)))
      {
        setStatus(3);
        this.kTd = 0;
      }
      else
      {
        this.kTd = 1;
        if ((paramBoolean1) && (paramar != null));
        switch (paramar.xXX)
        {
        default:
          if ((paramar.xXV != 7) && (paramar.xXV != 6) && (paramar.xXV != 3))
            setStatus(10);
          break;
        case 11:
          setStatus(11);
          break;
        case 12:
          setStatus(4);
          continue;
          if (paramBoolean1)
            setStatus(11);
          else
            setStatus(4);
          break;
        }
      }
    }
  }

  public final void setStatus(int paramInt)
  {
    if ((paramInt == 7) && (this.mStatus == 6) && (this.kTg))
      this.kTf = true;
    this.mStatus = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.a.f
 * JD-Core Version:    0.6.2
 */