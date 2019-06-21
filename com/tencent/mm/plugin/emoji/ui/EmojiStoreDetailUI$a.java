package com.tencent.mm.plugin.emoji.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.o;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.EmotionDetail;
import com.tencent.mm.protocal.protobuf.PackThumbExt;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.view.SmileySubGrid;
import java.util.LinkedList;

class EmojiStoreDetailUI$a extends BaseAdapter
  implements com.tencent.mm.view.a.g
{
  public EmojiStoreDetailUI$a(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public int getCount()
  {
    AppMethodBeat.i(53440);
    int i;
    if (EmojiStoreDetailUI.b(this.lbG) == null)
    {
      i = 0;
      AppMethodBeat.o(53440);
    }
    while (true)
    {
      return i;
      i = EmojiStoreDetailUI.b(this.lbG).PackThumbCnt;
      AppMethodBeat.o(53440);
    }
  }

  public Object getItem(int paramInt)
  {
    AppMethodBeat.i(53441);
    Object localObject;
    if ((EmojiStoreDetailUI.b(this.lbG) == null) || (EmojiStoreDetailUI.b(this.lbG).ThumbExtList == null) || (EmojiStoreDetailUI.b(this.lbG).ThumbExtList.size() <= 0) || (EmojiStoreDetailUI.b(this.lbG).ThumbExtList.get(paramInt) == null) || (((PackThumbExt)EmojiStoreDetailUI.b(this.lbG).ThumbExtList.get(paramInt)).PreviewUrl == null))
    {
      localObject = null;
      AppMethodBeat.o(53441);
    }
    while (true)
    {
      return localObject;
      ab.d("MicroMsg.emoji.EmojiStoreDetailUI", "jacks get preview : %d", new Object[] { Integer.valueOf(paramInt) });
      PackThumbExt localPackThumbExt = (PackThumbExt)EmojiStoreDetailUI.b(this.lbG).ThumbExtList.get(paramInt);
      localObject = new EmojiInfo();
      ((EmojiInfo)localObject).field_md5 = localPackThumbExt.Md5;
      ((EmojiInfo)localObject).field_thumbUrl = localPackThumbExt.ThumbUrl;
      ((EmojiInfo)localObject).field_cdnUrl = localPackThumbExt.CDNUrl;
      ((EmojiInfo)localObject).field_aeskey = localPackThumbExt.AesKey;
      ((EmojiInfo)localObject).field_encrypturl = localPackThumbExt.EncryptUrl;
      ((EmojiInfo)localObject).field_externUrl = localPackThumbExt.ExternUrl;
      ((EmojiInfo)localObject).field_externMd5 = localPackThumbExt.ExternMd5;
      ((EmojiInfo)localObject).field_activityid = localPackThumbExt.ActivityID;
      ((EmojiInfo)localObject).field_groupId = EmojiStoreDetailUI.a(this.lbG);
      ((EmojiInfo)localObject).field_catalog = 84;
      ((EmojiInfo)localObject).field_reserved4 |= EmojiInfo.yaB;
      AppMethodBeat.o(53441);
    }
  }

  public long getItemId(int paramInt)
  {
    return paramInt;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(53442);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = LayoutInflater.from(EmojiStoreDetailUI.w(this.lbG)).inflate(2130969351, null);
      paramViewGroup = new EmojiStoreDetailUI.c(this.lbG, paramView);
      paramView.setTag(paramViewGroup);
      if (!EmojiStoreDetailUI.x(this.lbG).Aba)
        break label154;
      paramViewGroup.lbI.setBackgroundResource(2130840232);
    }
    while (true)
    {
      String str = "";
      if (EmojiStoreDetailUI.b(this.lbG).PackThumbList != null)
        str = aa.a((bts)EmojiStoreDetailUI.b(this.lbG).PackThumbList.get(paramInt));
      o.ahp().a(str, paramViewGroup.lbI, com.tencent.mm.plugin.emoji.e.g.dH(EmojiStoreDetailUI.a(this.lbG), str));
      AppMethodBeat.o(53442);
      return paramView;
      paramViewGroup = (EmojiStoreDetailUI.c)paramView.getTag();
      break;
      label154: paramViewGroup.lbI.setBackgroundDrawable(null);
    }
  }

  public final boolean ui(int paramInt)
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.a
 * JD-Core Version:    0.6.2
 */