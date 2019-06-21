package com.tencent.mm.plugin.masssend.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelcontrol.d;
import com.tencent.mm.plugin.mmsight.model.l;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.sdk.platformtools.al;

final class MassSendMsgUI$15
  implements Runnable
{
  MassSendMsgUI$15(MassSendMsgUI paramMassSendMsgUI, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22850);
    VideoTransPara localVideoTransPara = d.afF().afG();
    baa localbaa = new baa();
    localbaa.wDP = true;
    if (l.a(this.mqo, localVideoTransPara, localbaa, new MassSendMsgUI.15.1(this)))
      l.b(this.mqo, localVideoTransPara, localbaa, new MassSendMsgUI.15.2(this));
    al.d(new MassSendMsgUI.15.3(this));
    AppMethodBeat.o(22850);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.15
 * JD-Core Version:    0.6.2
 */