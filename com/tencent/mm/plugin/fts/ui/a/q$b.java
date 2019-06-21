package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.ui.m;

public final class q$b extends com.tencent.mm.plugin.fts.a.d.a.a.b
{
  public q$b(q paramq)
  {
    super(paramq);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(62029);
    paramContext = LayoutInflater.from(paramContext).inflate(2130969613, paramViewGroup, false);
    paramViewGroup = (q.a)this.mLo.mLn;
    paramViewGroup.ejo = ((ImageView)paramContext.findViewById(2131821183));
    paramViewGroup.gnB = ((TextView)paramContext.findViewById(2131821185));
    paramViewGroup.gnC = ((TextView)paramContext.findViewById(2131820991));
    paramViewGroup.contentView = paramContext.findViewById(2131821182);
    paramContext.setTag(paramViewGroup);
    AppMethodBeat.o(62029);
    return paramContext;
  }

  public final void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.a.d.a.a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(62030);
    parama = (q.a)parama;
    parama1 = (q)parama1;
    m.p(parama.contentView, this.mLo.mFk);
    if ((parama1.username != null) && (parama1.username.length() > 0))
    {
      com.tencent.mm.pluginsdk.ui.a.b.b(parama.ejo, parama1.username);
      if (!com.tencent.mm.model.t.mP(parama1.username))
        break label137;
      m.a(((b)com.tencent.mm.kernel.g.K(b.class)).a(paramContext, parama1.jMY), parama.gnB);
    }
    while (true)
    {
      parama.gnB.setMaxWidth(com.tencent.mm.bz.a.fromDPToPix(paramContext, 200));
      m.a(parama1.jMZ, parama.gnC);
      AppMethodBeat.o(62030);
      return;
      parama.ejo.setImageResource(2130838444);
      break;
      label137: m.a(parama1.jMY, parama.gnB);
    }
  }

  public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.a.d.a.a parama)
  {
    AppMethodBeat.i(62031);
    parama = (q)parama;
    a(this.mLo.mDz.mDY, parama.hpS);
    Intent localIntent = new Intent().putExtra("Chat_User", parama.username).putExtra("finish_direct", true);
    if (com.tencent.mm.model.t.mP(parama.username))
    {
      com.tencent.mm.g.b.a.t localt = new com.tencent.mm.g.b.a.t();
      localt.eO(parama.username);
      localt.cXP = 3L;
      localt.ajK();
    }
    d.f(paramContext, ".ui.chatting.ChattingUI", localIntent);
    AppMethodBeat.o(62031);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.q.b
 * JD-Core Version:    0.6.2
 */