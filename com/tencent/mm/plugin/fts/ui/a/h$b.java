package com.tencent.mm.plugin.fts.ui.a;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.fts.a.a.g;
import com.tencent.mm.plugin.fts.a.d.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.a;
import com.tencent.mm.plugin.fts.a.d.a.a.b;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.sdk.platformtools.bo;

final class h$b extends a.b
{
  private h$b(h paramh)
  {
    super(paramh);
  }

  public final View a(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(61990);
    paramViewGroup = LayoutInflater.from(paramContext).inflate(2130969616, paramViewGroup, false);
    paramContext = (h.a)this.mKE.mKD;
    paramContext.gnC = ((TextView)paramViewGroup.findViewById(2131820991));
    paramViewGroup.setTag(paramContext);
    AppMethodBeat.o(61990);
    return paramViewGroup;
  }

  public final void a(Context paramContext, a.a parama, a parama1, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(61991);
    paramContext = (h.a)parama;
    m.a(this.mKE.mKB, paramContext.gnC);
    AppMethodBeat.o(61991);
  }

  public final boolean a(Context paramContext, a parama)
  {
    AppMethodBeat.i(61992);
    parama = new Intent();
    parama.putExtra("query_phrase_list", bo.P(this.mKE.mDz.mEa));
    parama.putExtra("go_to_chatroom_direct", true);
    parama.putExtra("scene_from", 3);
    d.f(paramContext, ".ui.transmit.MMCreateChatroomUI", parama);
    AppMethodBeat.o(61992);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.h.b
 * JD-Core Version:    0.6.2
 */