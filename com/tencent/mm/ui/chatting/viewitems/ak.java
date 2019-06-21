package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ba.b;
import com.tencent.mm.ba.r;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.a.e;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.chatting.AppBrandServiceChattingUI.AppBrandServiceChattingFmUI;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.neattextview.textview.view.NeatTextView;
import java.lang.ref.WeakReference;

final class ak
  implements ai.a
{
  public final void b(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi)
  {
    AppMethodBeat.i(33284);
    String str1 = parama1.getTalkerUserName();
    parama = (ai.b)parama;
    Bundle localBundle = new Bundle();
    localBundle.putString("conv_talker_username", str1);
    if ((parama1.yTx instanceof AppBrandServiceChattingUI.AppBrandServiceChattingFmUI))
    {
      paramInt = 10;
      localBundle.putInt("scene", paramInt);
      localBundle.putLong("msg_id", parambi.field_msgId);
      localBundle.putLong("msg_sever_id", parambi.field_msgSvrId);
      localBundle.putString("send_msg_username", parambi.field_talker);
      localBundle.putString("local_session", parama1.yTA);
      e locale = (e)g.K(e.class);
      String str2 = parambi.field_content;
      parambi = new WeakReference(parama1.yTx.getContext());
      new WeakReference(parama.zgE);
      parambi = locale.a(str2, localBundle, parambi);
      if ((parambi != null) && (parambi.length() != 0))
        break label350;
      parama.mRR.setVisibility(8);
      label186: parambi = r.aiy().sU(str1);
      aw.ZK();
      paramInt = ((Integer)c.Ry().get(12311, Integer.valueOf(-2))).intValue();
      if (((parambi == null) || (parambi.fLV == -2)) && ((parambi != null) || (paramInt == -2)))
        break label370;
      parama.zgE.setTextColor(parama1.yTx.getContext().getResources().getColor(2131689764));
      parama.zgE.setBackground(parama1.yTx.getContext().getResources().getDrawable(2130838200));
    }
    while (true)
    {
      parama.zgE.setOnClickListener(new ak.1(this));
      parama.zgE.invalidate();
      AppMethodBeat.o(33284);
      return;
      if (parama1.dFx())
      {
        paramInt = 2;
        break;
      }
      if (t.mZ(str1))
      {
        paramInt = 7;
        break;
      }
      paramInt = 1;
      break;
      label350: parama.mRR.setVisibility(0);
      parama.zgE.ah(parambi);
      break label186;
      label370: parama.zgE.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690556));
      parama.zgE.setBackground(parama1.yTx.getContext().getResources().getDrawable(2130838199));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ak
 * JD-Core Version:    0.6.2
 */