package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.plugin.emoji.e.m;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.emoji.StoreBannerEmojiView;
import com.tencent.mm.protocal.protobuf.EmotionBanner;
import com.tencent.mm.protocal.protobuf.EmotionBannerImg;
import com.tencent.mm.protocal.protobuf.EmotionBannerSet;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.base.x;
import java.util.ArrayList;
import java.util.LinkedList;

public final class i extends x
  implements View.OnClickListener
{
  public static int kSE = 60;
  public LinkedList<com.tencent.mm.plugin.emoji.model.a> kSD;
  private int kSF;
  private boolean kSG;
  private ArrayList<String> kSH;
  private i.a kSI;
  private Context mContext;

  public i(Context paramContext, LinkedList<com.tencent.mm.plugin.emoji.model.a> paramLinkedList)
  {
    AppMethodBeat.i(52766);
    this.kSF = 0;
    this.kSG = false;
    this.kSH = new ArrayList();
    this.kSI = new i.a((byte)0);
    if (paramLinkedList == null)
    {
      paramContext = new IllegalAccessError("must has emoji banner list");
      AppMethodBeat.o(52766);
      throw paramContext;
    }
    this.mContext = paramContext;
    this.kSD = new LinkedList();
    this.kSD.addAll(paramLinkedList);
    this.kSI.kSJ = this;
    AppMethodBeat.o(52766);
  }

  public final void clear()
  {
    AppMethodBeat.i(52771);
    if (this.kSD != null)
      this.kSD.clear();
    if (this.kSH != null)
      this.kSH.clear();
    this.kSG = true;
    this.kSI.kSJ = null;
    AppMethodBeat.o(52771);
  }

  public final int getCount()
  {
    int i = 1;
    AppMethodBeat.i(52767);
    if (this.kSD == null)
    {
      i = 0;
      AppMethodBeat.o(52767);
    }
    while (true)
    {
      return i;
      if (this.kSD.size() == 1)
      {
        AppMethodBeat.o(52767);
      }
      else
      {
        i = this.kSD.size() * kSE;
        AppMethodBeat.o(52767);
      }
    }
  }

  public final int getItemPosition(Object paramObject)
  {
    AppMethodBeat.i(52769);
    int i;
    if (this.kSF > 0)
    {
      this.kSF -= 1;
      i = -2;
      AppMethodBeat.o(52769);
    }
    while (true)
    {
      return i;
      i = super.getItemPosition(paramObject);
      AppMethodBeat.o(52769);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(52770);
    if (this.kSD == null)
    {
      AppMethodBeat.o(52770);
      paramView = null;
      return paramView;
    }
    int i = paramInt % this.kSD.size();
    i.b localb;
    if (paramView == null)
    {
      ab.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "getView inflate");
      paramView = View.inflate(this.mContext, 2130969387, null);
      localb = new i.b(this, paramView);
      paramView.setTag(localb);
    }
    Object localObject;
    while (true)
    {
      paramView.setTag(2131820595, Integer.valueOf(i));
      paramView.setOnClickListener(this);
      localObject = (com.tencent.mm.plugin.emoji.model.a)this.kSD.get(i);
      if (localObject != null)
        break label176;
      ab.e("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "BaseEmotionBanner is null.");
      AppMethodBeat.o(52770);
      paramView = null;
      break;
      localb = (i.b)paramView.getTag();
      int j = com.tencent.mm.plugin.emoji.ui.EmojiStoreVpHeader.db(this.mContext)[0];
      int k = j * 3 / 8;
      localb.kSL.setLayoutParams(new RelativeLayout.LayoutParams(j, k + 1));
    }
    label176: String str;
    if (((com.tencent.mm.plugin.emoji.model.a)localObject).kVa)
    {
      str = ((com.tencent.mm.plugin.emoji.model.a)localObject).kUY.BannerImg.StripUrl;
      if (bo.isNullOrNil(((com.tencent.mm.plugin.emoji.model.a)localObject).kUY.LocateUrl))
      {
        paramViewGroup = "H5";
        label214: if ((localObject != null) && (!bo.isNullOrNil(str)))
        {
          com.tencent.mm.bz.a.getDensity(this.mContext);
          localObject = EmojiLogic.r(paramViewGroup, 8, str);
          if (localObject != null)
            break label398;
          if (!this.kSH.contains(str))
            break label352;
          ab.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "url has add to list. no need to try load image.");
          localb.kSL.setImageFilePath("-");
        }
      }
    }
    while (true)
    {
      ab.d("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "position:%d allPostion:%d banner url:%s ", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), str });
      AppMethodBeat.o(52770);
      break;
      paramViewGroup = "Toptic";
      break label214;
      str = ((com.tencent.mm.plugin.emoji.model.a)localObject).kUZ.BannerImg.StripUrl;
      paramViewGroup = ((com.tencent.mm.plugin.emoji.model.a)localObject).kUZ.BannerSummary.ProductID;
      break label214;
      label352: o.ahp().a(str, null, g.j(paramViewGroup, str, new Object[] { paramViewGroup, "BANNER" }), this.kSI);
      this.kSH.add(str);
      continue;
      label398: localb.kSL.setImageFilePath(((EmojiInfo)localObject).dve());
    }
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(52768);
    if (!this.kSG)
    {
      this.kSF = getCount();
      super.notifyDataSetChanged();
      AppMethodBeat.o(52768);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "has destroy need to notify");
      AppMethodBeat.o(52768);
    }
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(52772);
    int i = ((Integer)paramView.getTag(2131820595)).intValue();
    paramView = (com.tencent.mm.plugin.emoji.model.a)this.kSD.get(i);
    EmotionSummary localEmotionSummary;
    if (paramView != null)
    {
      if (paramView.kVa)
      {
        m.a(this.mContext, paramView.kUY, true);
        AppMethodBeat.o(52772);
        return;
      }
      localEmotionSummary = paramView.kUZ.BannerSummary;
      if (localEmotionSummary != null)
        if (localEmotionSummary != null)
          break label143;
    }
    label143: for (paramView = ""; ; paramView = localEmotionSummary.ProductID)
    {
      ab.d("MicroMsg.emoji.EmojiStoreVpHeaderAdapter", "productId %s", new Object[] { paramView });
      h.pYm.e(11929, new Object[] { Integer.valueOf(0) });
      m.a(this.mContext, localEmotionSummary, 15, -1, -1, "", 8);
      AppMethodBeat.o(52772);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.i
 * JD-Core Version:    0.6.2
 */