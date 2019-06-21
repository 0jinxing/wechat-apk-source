package com.tencent.mm.ui.chatting.c;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.w;
import com.tencent.mm.protocal.protobuf.bdl;
import com.tencent.mm.protocal.protobuf.bre;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.chatting.view.b.a;
import com.tencent.recovery.wx.util.NetUtil;
import java.io.IOException;

final class ab$2
  implements b.a
{
  ab$2(ab paramab, com.tencent.mm.ui.chatting.view.b paramb, bi parambi)
  {
  }

  public final void ne(long paramLong)
  {
    AppMethodBeat.i(31595);
    this.yMG.hide();
    com.tencent.mm.plugin.report.service.h.pYm.a(795L, 1L, 1L, false);
    if (!NetUtil.isConnected(this.yRa.cgL.yTx.getContext()))
    {
      com.tencent.mm.ui.base.h.b(this.yRa.cgL.yTx.getContext(), this.yRa.cgL.yTx.getMMResources().getString(2131301654), this.yRa.cgL.yTx.getMMResources().getString(2131302351), true);
      AppMethodBeat.o(31595);
    }
    while (true)
    {
      return;
      Object localObject = new bre();
      ((bre)localObject).lvf = ((int)(paramLong / 1000L));
      ((bre)localObject).jCt = 1;
      ((bre)localObject).wOI = 1;
      try
      {
        bdl localbdl = new com/tencent/mm/protocal/protobuf/bdl;
        localbdl.<init>();
        localbdl.jBB = this.yRa.cgL.getTalkerUserName();
        localbdl.ptF = this.fku.field_msgSvrId;
        localbdl.Title = ab.b(this.yRa, this.fku);
        com.tencent.mm.bt.b localb = new com/tencent/mm/bt/b;
        localb.<init>(localbdl.toByteArray());
        ((bre)localObject).wcJ = localb;
        localObject = new w(1, (bre)localObject);
        aw.Rg().a((m)localObject, 0);
        AppMethodBeat.o(31595);
      }
      catch (IOException localIOException)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.ChattingUI.MsgRemindComponent", "[onOk] %s", new Object[] { localIOException.toString() });
      }
    }
  }

  public final void onCancel()
  {
    AppMethodBeat.i(31596);
    this.yMG.hide();
    AppMethodBeat.o(31596);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ab.2
 * JD-Core Version:    0.6.2
 */