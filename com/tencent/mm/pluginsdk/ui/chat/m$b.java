package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.pluginsdk.a.d;
import com.tencent.mm.pluginsdk.ui.emoji.PreViewEmojiView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;

final class m$b extends BaseAdapter
{
  ArrayList<EmojiInfo> mData;

  m$b(m paramm)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(62460);
    int i;
    if (this.mData == null)
    {
      i = 0;
      AppMethodBeat.o(62460);
    }
    while (true)
    {
      return i;
      i = this.mData.size();
      AppMethodBeat.o(62460);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(62462);
    EmojiInfo localEmojiInfo;
    String str;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.voP.mContext).inflate(2130969025, null);
      paramViewGroup = new m.c(this.voP, paramView);
      paramView.setTag(paramViewGroup);
      localEmojiInfo = uf(paramInt);
      paramViewGroup.voQ.setSize(this.voP.voC);
      paramViewGroup.voQ.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
      str = "";
      if (localEmojiInfo != null)
        str = ((PluginEmoji)g.M(PluginEmoji.class)).getEmojiMgr().Jh(localEmojiInfo.Aq());
      if (!bo.isNullOrNil(str))
        break label199;
      paramViewGroup.voQ.setContentDescription(this.voP.mContext.getString(2131299163));
      label141: if (localEmojiInfo == null)
        break label225;
      if (!localEmojiInfo.duS())
        break label211;
      paramViewGroup.voQ.b(EmojiInfo.bJ(this.voP.mContext, localEmojiInfo.getName()), localEmojiInfo.getName());
    }
    while (true)
    {
      AppMethodBeat.o(62462);
      return paramView;
      paramViewGroup = (m.c)paramView.getTag();
      break;
      label199: paramViewGroup.voQ.setContentDescription(str);
      break label141;
      label211: paramViewGroup.voQ.a(localEmojiInfo, "");
      continue;
      label225: ab.w("MicroMsg.emoji.SuggestEmoticonBubble", "emoji info is null.");
    }
  }

  public final EmojiInfo uf(int paramInt)
  {
    AppMethodBeat.i(62461);
    EmojiInfo localEmojiInfo;
    if ((this.mData != null) && (this.mData.size() > paramInt))
    {
      localEmojiInfo = (EmojiInfo)this.mData.get(paramInt);
      AppMethodBeat.o(62461);
    }
    while (true)
    {
      return localEmojiInfo;
      localEmojiInfo = null;
      AppMethodBeat.o(62461);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.m.b
 * JD-Core Version:    0.6.2
 */