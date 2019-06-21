package com.tencent.mm.plugin.emoji.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import java.util.ArrayList;

final class EmojiStoreDetailUI$b extends EmojiStoreDetailUI.a
{
  private ArrayList<EmojiInfo> lbH;

  public EmojiStoreDetailUI$b(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
    super(paramEmojiStoreDetailUI);
    AppMethodBeat.i(53443);
    this.lbH = new ArrayList();
    this.lbH = ((ArrayList)j.getEmojiStorageMgr().xYn.Jg(com.tencent.mm.plugin.emoji.h.a.bmu()));
    AppMethodBeat.o(53443);
  }

  private EmojiInfo uf(int paramInt)
  {
    AppMethodBeat.i(53445);
    EmojiInfo localEmojiInfo;
    if (this.lbH == null)
    {
      localEmojiInfo = null;
      AppMethodBeat.o(53445);
    }
    while (true)
    {
      return localEmojiInfo;
      localEmojiInfo = (EmojiInfo)this.lbH.get(paramInt);
      AppMethodBeat.o(53445);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(53444);
    int i;
    if (this.lbH == null)
    {
      i = 0;
      AppMethodBeat.o(53444);
    }
    while (true)
    {
      return i;
      i = this.lbH.size();
      AppMethodBeat.o(53444);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(53446);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(EmojiStoreDetailUI.w(this.lbG)).inflate(2130969351, null);
      paramViewGroup = new EmojiStoreDetailUI.c(this.lbG, paramView);
      paramView.setTag(paramViewGroup);
      paramViewGroup.lbI.setBackgroundResource(2130840232);
      localObject = uf(paramInt);
      if (!bo.isNullOrNil(((EmojiInfo)localObject).getContent()))
        break label129;
    }
    label129: for (Object localObject = ((EmojiInfo)localObject).getName(); ; localObject = ((EmojiInfo)localObject).getContent())
    {
      localObject = localObject.split("\\.")[0];
      o.ahp().a((String)localObject, paramViewGroup.lbI, g.bjM());
      AppMethodBeat.o(53446);
      return paramView;
      paramViewGroup = (EmojiStoreDetailUI.c)paramView.getTag();
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.b
 * JD-Core Version:    0.6.2
 */