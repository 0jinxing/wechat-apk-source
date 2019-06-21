package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.view.View;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ay.a.b;
import com.tencent.mm.ba.b;
import com.tencent.mm.ba.r;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.x;
import com.tencent.neattextview.textview.view.NeatTextView;
import java.util.LinkedList;

final class ag
  implements ai.a
{
  public final void b(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi)
  {
    AppMethodBeat.i(33270);
    ai.b localb = (ai.b)parama;
    a.b localb1 = (a.b)parama1.aF(x.class);
    int i = localb.zgE.getContext().getResources().getColor(2131690208);
    int j = localb.zgE.getContext().getResources().getColor(2131690209);
    com.tencent.mm.ay.a locala = parambi.dtX();
    if (locala == null)
    {
      localb.mRR.setVisibility(8);
      parama = r.aiy().sU(parama1.getTalkerUserName());
      aw.ZK();
      paramInt = ((Integer)c.Ry().get(12311, Integer.valueOf(-2))).intValue();
      if (((parama == null) || (parama.fLV == -2)) && ((parama != null) || (paramInt == -2)))
        break label683;
      localb.zgE.setTextColor(parama1.yTx.getContext().getResources().getColor(2131689764));
      localb.zgE.setBackground(parama1.yTx.getContext().getResources().getDrawable(2130838200));
    }
    while (true)
    {
      localb.zgE.invalidate();
      AppMethodBeat.o(33270);
      return;
      localb.mRR.setVisibility(0);
      localb.zgE.a(j.b(localb.zgE.getContext(), bo.nullAsNil(locala.fKW), localb.zgE.getTextSize()), TextView.BufferType.SPANNABLE);
      Object localObject;
      int k;
      if ((locala.TYPE.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApplication")) || (locala.TYPE.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApproval")))
      {
        i = localb.zgE.getContext().getResources().getColor(2131689776);
        j = localb.zgE.getContext().getResources().getColor(2131689778);
        if (!parambi.dtS())
        {
          parama = Spannable.Factory.getInstance().newSpannable("    " + localb.zgE.dPr());
          localObject = localb.zgE.getContext().getResources().getDrawable(2131231514);
          ((Drawable)localObject).setBounds(0, 0, ((Drawable)localObject).getIntrinsicWidth(), ((Drawable)localObject).getIntrinsicHeight());
          com.tencent.mm.ui.widget.a locala1 = new com.tencent.mm.ui.widget.a((Drawable)localObject);
          locala1.zLT = ((int)((((Drawable)localObject).getIntrinsicHeight() - localb.zgE.getTextSize() + com.tencent.mm.bz.a.fromDPToPix(localb.zgE.getContext(), 2)) / 2.0F));
          parama.setSpan(locala1, 0, 3, 33);
          k = 4;
        }
      }
      while (true)
      {
        for (int m = 0; m < locala.fKY.size(); m++)
        {
          localObject = new ag.a();
          ((ag.a)localObject).zgl = new ag.1(this, i, j, locala, localb1, localb, parambi, paramInt, m);
          ((ag.a)localObject).start = ((Integer)locala.fKZ.get(m)).intValue();
          ((ag.a)localObject).end = ((Integer)locala.fLa.get(m)).intValue();
          parama.setSpan(((ag.a)localObject).zgl, ((ag.a)localObject).start + k, ((ag.a)localObject).end + k, 18);
        }
        i = localb.zgE.getContext().getResources().getColor(2131689776);
        j = localb.zgE.getContext().getResources().getColor(2131689778);
        parama = Spannable.Factory.getInstance().newSpannable(localb.zgE.dPr());
        k = 0;
        continue;
        parama = Spannable.Factory.getInstance().newSpannable(localb.zgE.dPr());
        k = 0;
      }
      localb.zgE.a(parama, TextView.BufferType.SPANNABLE);
      localb.zgE.setOnClickListener(new ag.2(this));
      break;
      label683: localb.zgE.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690556));
      localb.zgE.setBackground(parama1.yTx.getContext().getResources().getDrawable(2130838199));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ag
 * JD-Core Version:    0.6.2
 */