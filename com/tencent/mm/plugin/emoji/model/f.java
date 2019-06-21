package com.tencent.mm.plugin.emoji.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.EmotionBanner;
import com.tencent.mm.protocal.protobuf.EmotionBannerSet;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.ArrayList;
import java.util.List;

public final class f
{
  public int kVp;
  public List<com.tencent.mm.plugin.emoji.a.a.f> kVq;
  public EmotionBanner kVr;
  public List<EmotionBanner> kVs;
  public List<EmotionBannerSet> kVt;
  public List<EmotionBannerSet> kVu;

  public final void bke()
  {
    AppMethodBeat.i(53047);
    if (this.kVu == null)
      AppMethodBeat.o(53047);
    while (true)
    {
      return;
      if (this.kVu.isEmpty())
      {
        AppMethodBeat.o(53047);
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll(this.kVu);
        for (int i = localArrayList.size() - 1; i >= 0; i--)
        {
          this.kVq.add(0, new com.tencent.mm.plugin.emoji.a.a.f((EmotionBannerSet)localArrayList.get(i)));
          this.kVp += 1;
          this.kVu.remove(localArrayList.get(i));
        }
        AppMethodBeat.o(53047);
      }
    }
  }

  public final void br(List<com.tencent.mm.plugin.emoji.a.a.f> paramList)
  {
    AppMethodBeat.i(53048);
    if (this.kVq == null)
      this.kVq = new ArrayList();
    while (true)
    {
      this.kVq.addAll(paramList);
      AppMethodBeat.o(53048);
      return;
      int i = this.kVq.size() - 1;
      if ((i >= 0) && (i < this.kVq.size()))
      {
        com.tencent.mm.plugin.emoji.a.a.f localf = (com.tencent.mm.plugin.emoji.a.a.f)this.kVq.get(i);
        if ((localf != null) && (localf.kTb != null) && (!bo.isNullOrNil(localf.kTb.ProductID)) && (localf.kTb.ProductID.equals(EmojiGroupInfo.yac)))
          this.kVq.remove(localf);
      }
    }
  }

  public final void ue(int paramInt)
  {
    this.kVp += paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.f
 * JD-Core Version:    0.6.2
 */