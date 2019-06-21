package com.tencent.mm.plugin.emoji.ui.v2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.EmotionPrice;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.v;
import java.util.LinkedList;

final class EmojiStoreV2RewardUI$b extends BaseAdapter
{
  private LinkedList<EmotionPrice> lei;

  EmojiStoreV2RewardUI$b(EmojiStoreV2RewardUI paramEmojiStoreV2RewardUI)
  {
  }

  public final void Q(LinkedList<EmotionPrice> paramLinkedList)
  {
    AppMethodBeat.i(53706);
    if (this.lei == null)
      this.lei = new LinkedList();
    this.lei.clear();
    this.lei.addAll(paramLinkedList);
    notifyDataSetChanged();
    AppMethodBeat.o(53706);
  }

  public final int getCount()
  {
    AppMethodBeat.i(53707);
    int i;
    if (this.lei == null)
    {
      i = 0;
      AppMethodBeat.o(53707);
    }
    while (true)
    {
      return i;
      i = this.lei.size();
      AppMethodBeat.o(53707);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(53709);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = v.hu(this.leK.mController.ylL).inflate(2130969375, null);
      paramViewGroup = new EmojiStoreV2RewardUI.c(this.leK, paramView);
      paramView.setTag(paramViewGroup);
      EmotionPrice localEmotionPrice = uk(paramInt);
      if (localEmotionPrice == null)
        break label125;
      paramViewGroup.leO.setVisibility(0);
      paramViewGroup.leO.setText(localEmotionPrice.Number + localEmotionPrice.Label);
    }
    while (true)
    {
      AppMethodBeat.o(53709);
      return paramView;
      paramViewGroup = (EmojiStoreV2RewardUI.c)paramView.getTag();
      break;
      label125: paramViewGroup.leO.setVisibility(8);
    }
  }

  public final EmotionPrice uk(int paramInt)
  {
    EmotionPrice localEmotionPrice = null;
    AppMethodBeat.i(53708);
    if ((paramInt < 0) || (paramInt > getCount()))
      AppMethodBeat.o(53708);
    while (true)
    {
      return localEmotionPrice;
      if (this.lei == null)
      {
        AppMethodBeat.o(53708);
      }
      else
      {
        localEmotionPrice = (EmotionPrice)this.lei.get(paramInt);
        AppMethodBeat.o(53708);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2RewardUI.b
 * JD-Core Version:    0.6.2
 */