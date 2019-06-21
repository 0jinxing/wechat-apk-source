package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.plugin.emoji.ui.SquareImageView;
import com.tencent.mm.protocal.protobuf.EmotionDonor;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.io.IOException;
import java.util.LinkedList;

final class EmojiStoreV2RewardDetailUI$a extends BaseAdapter
{
  private Bitmap cdX;
  int iWJ;
  private int kSw;
  int lcR;
  private LinkedList<EmotionDonor> lei;
  boolean lej;
  private Context mContext;
  private int mNumColumns;

  public EmojiStoreV2RewardDetailUI$a(EmojiStoreV2RewardDetailUI paramEmojiStoreV2RewardDetailUI, Context paramContext)
  {
    AppMethodBeat.i(53672);
    this.lej = false;
    this.mNumColumns = 1;
    this.cdX = null;
    this.mContext = paramContext;
    this.lcR = com.tencent.mm.bz.a.al(paramEmojiStoreV2RewardDetailUI.mController.ylL, 2131428341);
    int i = com.tencent.mm.bz.a.gd(paramEmojiStoreV2RewardDetailUI.mController.ylL) - com.tencent.mm.bz.a.al(paramEmojiStoreV2RewardDetailUI.mController.ylL, 2131427776) * 2;
    int j = this.lcR;
    int k = com.tencent.mm.bz.a.al(paramEmojiStoreV2RewardDetailUI.mController.ylL, 2131427786);
    int m = i / (j + k);
    int n = m;
    if (i - m * j - k * (m - 1) > j)
      n = m + 1;
    this.mNumColumns = n;
    this.kSw = com.tencent.mm.bz.a.gd(this.mContext);
    this.iWJ = ((int)((this.kSw - this.mNumColumns * this.lcR) / (this.mNumColumns + 1.0F)));
    try
    {
      this.cdX = BackwardSupportUtil.b.b(this.mContext.getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.bz.a.getDensity(null));
      AppMethodBeat.o(53672);
      return;
    }
    catch (IOException paramEmojiStoreV2RewardDetailUI)
    {
      while (true)
      {
        ab.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "decode stream default avatar failed. %s", new Object[] { bo.dpG() });
        AppMethodBeat.o(53672);
      }
    }
  }

  private EmotionDonor uj(int paramInt)
  {
    AppMethodBeat.i(53675);
    int i;
    EmotionDonor localEmotionDonor;
    if (this.lei != null)
    {
      if (this.lei == null)
      {
        i = 0;
        if (paramInt < i)
          break label46;
      }
    }
    else
    {
      localEmotionDonor = null;
      AppMethodBeat.o(53675);
    }
    while (true)
    {
      return localEmotionDonor;
      i = this.lei.size();
      break;
      label46: localEmotionDonor = (EmotionDonor)this.lei.get(paramInt);
      AppMethodBeat.o(53675);
    }
  }

  public final void Q(LinkedList<EmotionDonor> paramLinkedList)
  {
    AppMethodBeat.i(53673);
    if (this.lei == null)
      this.lei = new LinkedList();
    if (this.lej)
    {
      this.lei.clear();
      this.lej = false;
    }
    this.lei.addAll(paramLinkedList);
    notifyDataSetChanged();
    AppMethodBeat.o(53673);
  }

  public final int getCount()
  {
    AppMethodBeat.i(53674);
    int i;
    if (this.lei == null)
    {
      i = 0;
      if (i <= 0)
        break label50;
      i = (int)Math.ceil(i / this.mNumColumns);
      AppMethodBeat.o(53674);
    }
    while (true)
    {
      return i;
      i = this.lei.size();
      break;
      label50: AppMethodBeat.o(53674);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(53676);
    Object localObject1;
    Object localObject2;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      localObject1 = new LinearLayout(this.mContext);
      paramView = new AbsListView.LayoutParams(-1, -2);
      ((LinearLayout)localObject1).setBackgroundResource(2130840857);
      ((LinearLayout)localObject1).setOrientation(0);
      ((LinearLayout)localObject1).setLayoutParams(paramView);
      ((LinearLayout)localObject1).setPadding(0, 0, 0, this.iWJ);
      localObject2 = new EmojiStoreV2RewardDetailUI.b(this.leh);
      ((EmojiStoreV2RewardDetailUI.b)localObject2).kSC = ((LinearLayout)localObject1);
      ((View)localObject1).setTag(localObject2);
      for (i = 0; ; i++)
      {
        paramViewGroup = (ViewGroup)localObject2;
        paramView = (View)localObject1;
        if (i >= this.mNumColumns)
          break;
        paramView = new LinearLayout.LayoutParams(this.lcR, this.lcR);
        paramView.leftMargin = this.iWJ;
        paramViewGroup = new SquareImageView(this.mContext);
        ((EmojiStoreV2RewardDetailUI.b)localObject2).kSC.addView(paramViewGroup, i, paramView);
      }
    }
    paramViewGroup = (EmojiStoreV2RewardDetailUI.b)paramView.getTag();
    int i = 0;
    if (i < this.mNumColumns)
    {
      int j = this.mNumColumns;
      localObject1 = (SquareImageView)paramViewGroup.kSC.getChildAt(i);
      localObject2 = uj(j * paramInt + i);
      if (localObject2 != null)
      {
        ((SquareImageView)localObject1).setVisibility(0);
        if (!bo.isNullOrNil(((EmotionDonor)localObject2).HeadUrl))
          o.ahp().a(((EmotionDonor)localObject2).HeadUrl, (ImageView)localObject1, g.u(EmojiStoreV2RewardDetailUI.c(this.leh), ((EmotionDonor)localObject2).HeadUrl, this.lcR));
      }
      while (true)
      {
        i++;
        break;
        ((SquareImageView)localObject1).setImageBitmap(this.cdX);
        continue;
        ((SquareImageView)localObject1).setVisibility(8);
      }
    }
    AppMethodBeat.o(53676);
    return paramView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardDetailUI.a
 * JD-Core Version:    0.6.2
 */