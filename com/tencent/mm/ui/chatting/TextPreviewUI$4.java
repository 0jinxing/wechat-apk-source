package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.modelsimple.w;
import com.tencent.mm.protocal.protobuf.bdl;
import com.tencent.mm.protocal.protobuf.bre;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.AllRemindMsgUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.view.b.a;
import com.tencent.mm.ui.q;
import com.tencent.recovery.wx.util.NetUtil;
import java.io.IOException;

final class TextPreviewUI$4
  implements b.a
{
  TextPreviewUI$4(TextPreviewUI paramTextPreviewUI, com.tencent.mm.ui.chatting.view.b paramb, bi parambi)
  {
  }

  public final void ne(long paramLong)
  {
    AppMethodBeat.i(31046);
    this.yMG.hide();
    com.tencent.mm.plugin.report.service.h.pYm.a(795L, 1L, 1L, false);
    if (!NetUtil.isConnected(this.yMF.mController.ylL))
    {
      com.tencent.mm.ui.base.h.b(this.yMF.mController.ylL, this.yMF.getString(2131301654), this.yMF.getString(2131302351), true);
      AppMethodBeat.o(31046);
    }
    while (true)
    {
      return;
      bre localbre = new bre();
      localbre.lvf = ((int)(paramLong / 1000L));
      localbre.jCt = 1;
      localbre.wOI = 1;
      try
      {
        bdl localbdl = new com/tencent/mm/protocal/protobuf/bdl;
        localbdl.<init>();
        localbdl.jBB = this.fku.field_talker;
        localbdl.ptF = this.fku.field_msgSvrId;
        Object localObject1 = this.yMF;
        Object localObject2 = this.fku;
        if ((((bi)localObject2).isText()) || (((bi)localObject2).dtz()))
        {
          localObject2 = ((cy)localObject2).field_content;
          int i = bf.ox((String)localObject2);
          localObject1 = localObject2;
          if (i != -1)
            localObject1 = ((String)localObject2).substring(i + 1).trim();
        }
        while (true)
        {
          localbdl.Title = ((String)localObject1);
          localObject1 = new com/tencent/mm/bt/b;
          ((com.tencent.mm.bt.b)localObject1).<init>(localbdl.toByteArray());
          localbre.wcJ = ((com.tencent.mm.bt.b)localObject1);
          localObject1 = new w(1, localbre);
          aw.Rg().a((m)localObject1, 0);
          AppMethodBeat.o(31046);
          break;
          localObject1 = AllRemindMsgUI.a(((MMActivity)localObject1).mController.ylL, ((bi)localObject2).getType(), ((cy)localObject2).field_content, ((cy)localObject2).field_isSend);
          ab.i("MicroMsg.TextPreviewUI", "[getRemindTitle] msgId:%s type:%s title:%s", new Object[] { Long.valueOf(((cy)localObject2).field_msgId), Integer.valueOf(((bi)localObject2).getType()), localObject1 });
        }
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.e("MicroMsg.TextPreviewUI", "[onOk] %s", new Object[] { localIOException.toString() });
      }
    }
  }

  public final void onCancel()
  {
    AppMethodBeat.i(31047);
    this.yMG.hide();
    AppMethodBeat.o(31047);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.TextPreviewUI.4
 * JD-Core Version:    0.6.2
 */