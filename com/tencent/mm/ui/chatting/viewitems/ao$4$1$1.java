package com.tencent.mm.ui.chatting.viewitems;

import android.app.ProgressDialog;
import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.pluginsdk.model.app.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.vfs.e;

final class ao$4$1$1
  implements f
{
  ao$4$1$1(ao.4.1 param1)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(33386);
    ab.d("MicroMsg.ChattingItemVoiceRemindConfirm", "errType " + paramInt1 + " errCode " + paramInt2 + "  scene " + paramm.getType());
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.zhQ.zhP.zhK.field_content;
      if (paramString == null)
        break label330;
    }
    label330: for (paramString = j.b.me(paramString); ; paramString = null)
    {
      if (paramString != null)
      {
        long l = this.zhQ.zhP.zhK.field_msgId;
        paramString = am.aUq().lZ(l);
        if (paramString != null)
          ab.i("MicroMsg.AppMsgLogic", "summerapp deleteAttachInfoAndFile deleteFile[%b] deleteInfo[%b] msgInfoId[%d] mediaSvrId[%s] path[%s] stack[%s]", new Object[] { Boolean.valueOf(e.deleteFile(paramString.field_fileFullPath)), Boolean.valueOf(am.aUq().a(paramString, new String[] { "msgInfoId" })), Long.valueOf(paramString.field_msgInfoId), paramString.field_mediaSvrId, paramString.field_fileFullPath, bo.dpG() });
      }
      bf.fm(this.zhQ.zhP.zhK.field_msgId);
      Toast.makeText(ao.a(this.zhQ.zhP.zhM).yTx.getContext(), ao.a(this.zhQ.zhP.zhM).yTx.getMMResources().getString(2131298142), 0).show();
      aw.Rg().b(331, ao.b(this.zhQ.zhP.zhM));
      ao.a(this.zhQ.zhP.zhM, null);
      if (ao.c(this.zhQ.zhP.zhM) != null)
        ao.c(this.zhQ.zhP.zhM).dismiss();
      AppMethodBeat.o(33386);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ao.4.1.1
 * JD-Core Version:    0.6.2
 */