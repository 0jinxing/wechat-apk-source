package com.tencent.mm.ui.chatting;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.base.p;
import java.util.ArrayList;

final class SendImgProxyUI$1
  implements Runnable
{
  SendImgProxyUI$1(SendImgProxyUI paramSendImgProxyUI, boolean paramBoolean, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31003);
    ab.i("MicroMsg.SendImgProxyUI", "test before sendMutiImage");
    SendImgProxyUI.a(this.yMj, this.yMj.getIntent());
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(-1));
    aw.RS().doM();
    ab.i("MicroMsg.SendImgProxyUI", "test before finish");
    SendImgProxyUI.a(this.yMj).dismiss();
    this.yMj.setResult(-1, this.yMj.getIntent().putIntegerArrayListExtra("GalleryUI_ImgIdList", localArrayList));
    SendImgProxyUI.aMr();
    this.yMj.finish();
    if (at.isWifi(this.yMj) == this.yMi)
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcSendPicMsgEnable, this.fJz);
    AppMethodBeat.o(31003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.SendImgProxyUI.1
 * JD-Core Version:    0.6.2
 */