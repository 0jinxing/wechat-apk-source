package com.tencent.mm.plugin.emoji.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.o;
import com.tencent.mm.plugin.emoji.e.g;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.util.List;

public final class e extends ArrayAdapter<EmojiGroupInfo>
{
  private static final int kSe = 2130969348;
  private final String TAG;
  private int kSf;
  public List<EmojiGroupInfo> kSg;
  private Context mContext;

  public e(Context paramContext, List<EmojiGroupInfo> paramList)
  {
    super(paramContext, kSe, paramList);
    AppMethodBeat.i(52740);
    this.TAG = "MicroMsg.emoji.EmojiSortAdapter";
    this.kSf = paramContext.getResources().getDimensionPixelSize(2131428357);
    this.mContext = paramContext;
    this.kSg = paramList;
    AppMethodBeat.o(52740);
  }

  public final void bjz()
  {
    AppMethodBeat.i(52741);
    if (this.kSg == null)
      AppMethodBeat.o(52741);
    while (true)
    {
      return;
      int i = this.kSg.size();
      for (int j = 0; j < i; j++)
        ((EmojiGroupInfo)this.kSg.get(j)).field_idx = j;
      j.getEmojiStorageMgr().xYo.eI(this.kSg);
      EmojiGroupInfo localEmojiGroupInfo = j.getEmojiStorageMgr().xYo.bZ(EmojiGroupInfo.yad, false);
      localEmojiGroupInfo.field_sort = (this.kSg.size() + 2);
      j.getEmojiStorageMgr();
      if (!com.tencent.mm.storage.emotion.a.duE())
      {
        com.tencent.mm.storage.emotion.a locala = j.getEmojiStorageMgr().xYo;
        if (localEmojiGroupInfo != null)
        {
          ab.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks updateEmojiGroupInfo: packname: %s, lasttime: %d, sort: %d", new Object[] { localEmojiGroupInfo.field_packName, Long.valueOf(localEmojiGroupInfo.field_lastUseTime), Integer.valueOf(localEmojiGroupInfo.field_sort) });
          locala.a(localEmojiGroupInfo);
          locala.b("event_update_group", 0, bo.dpG().toString());
        }
      }
      AppMethodBeat.o(52741);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(52742);
    EmojiGroupInfo localEmojiGroupInfo;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(this.mContext).inflate(kSe, null);
      paramViewGroup = new e.a(this, paramView);
      paramView.setTag(paramViewGroup);
      localEmojiGroupInfo = (EmojiGroupInfo)getItem(paramInt);
      if (!com.tencent.mm.plugin.emoji.h.a.b(localEmojiGroupInfo))
        break label132;
      paramViewGroup.gnB.setText(2131299169);
      label73: if (!com.tencent.mm.plugin.emoji.h.a.b(localEmojiGroupInfo))
        break label147;
      paramViewGroup.iqT.setImageResource(2130839049);
    }
    while (true)
    {
      if (paramInt + 1 == getCount())
        paramViewGroup.kSh.setBackgroundResource(2130838398);
      paramView.setVisibility(0);
      AppMethodBeat.o(52742);
      return paramView;
      paramViewGroup = (e.a)paramView.getTag();
      break;
      label132: paramViewGroup.gnB.setText(localEmojiGroupInfo.field_packName);
      break label73;
      label147: o.ahp().a(localEmojiGroupInfo.field_packIconUrl, paramViewGroup.iqT, g.dH(localEmojiGroupInfo.field_productID, localEmojiGroupInfo.field_packIconUrl));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.e
 * JD-Core Version:    0.6.2
 */