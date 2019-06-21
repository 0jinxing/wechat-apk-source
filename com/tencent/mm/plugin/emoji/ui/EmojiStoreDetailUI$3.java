package com.tencent.mm.plugin.emoji.ui;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;

final class EmojiStoreDetailUI$3
  implements AdapterView.OnItemClickListener
{
  EmojiStoreDetailUI$3(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(53423);
    paramAdapterView = paramAdapterView.getAdapter().getItem(paramInt);
    if ((paramAdapterView instanceof EmojiInfo))
    {
      paramView = (EmojiInfo)paramAdapterView;
      paramAdapterView = new xx();
      if ((bo.isNullOrNil(paramAdapterView.Md5)) || (paramAdapterView.Md5.equals(paramView.field_md5)))
      {
        paramAdapterView.Md5 = b.dN(paramView.field_md5, paramAdapterView.Md5);
        paramAdapterView.Url = b.dN(paramView.field_cdnUrl, paramAdapterView.Url);
        paramAdapterView.ThumbUrl = b.dN(paramView.field_thumbUrl, paramAdapterView.ThumbUrl);
        paramAdapterView.wdC = b.dN(paramView.field_designerID, paramAdapterView.wdC);
        paramAdapterView.EncryptUrl = b.dN(paramView.field_encrypturl, paramAdapterView.EncryptUrl);
        paramAdapterView.AesKey = b.dN(paramView.field_aeskey, paramAdapterView.AesKey);
        paramAdapterView.ProductID = b.dN(paramView.field_groupId, paramAdapterView.ProductID);
        paramAdapterView.ExternUrl = b.dN(paramView.field_externUrl, paramAdapterView.ExternUrl);
        paramAdapterView.ExternMd5 = b.dN(paramView.field_externMd5, paramAdapterView.ExternMd5);
        paramAdapterView.ActivityID = b.dN(paramView.field_activityid, paramAdapterView.ActivityID);
        paramAdapterView.wdD = b.dN(paramView.field_attachedText, paramAdapterView.wdD);
        paramAdapterView.wdE = b.dN(paramView.field_attachTextColor, paramAdapterView.wdE);
        paramAdapterView.wdF = b.dN(paramView.field_lensId, paramAdapterView.wdF);
      }
      EmojiStoreDetailUI.a(this.lbG, paramAdapterView);
      h.pYm.e(12787, new Object[] { Integer.valueOf(0), Integer.valueOf(0), paramView.field_md5, Long.valueOf(EmojiStoreDetailUI.d(this.lbG)), paramView.field_designerID, paramView.field_groupId, Integer.valueOf(26) });
    }
    AppMethodBeat.o(53423);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.3
 * JD-Core Version:    0.6.2
 */