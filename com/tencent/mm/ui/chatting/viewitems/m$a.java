package com.tencent.mm.ui.chatting.viewitems;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.ui.e.f;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class m$a extends c.a
{
  private ProgressBar pyf;
  private MMNeat7extView zdZ;

  public static void a(a parama, int paramInt, a parama1, bi parambi, c paramc)
  {
    AppMethodBeat.i(32968);
    Object localObject1 = null;
    Object localObject2 = parambi.field_content;
    Object localObject3 = localObject2;
    if (parama1.dFx())
    {
      int i = parambi.field_content.indexOf(':');
      localObject3 = localObject2;
      if (i != -1)
        localObject3 = parambi.field_content.substring(i + 1);
    }
    if (localObject3 != null)
      localObject1 = j.b.X((String)localObject3, parambi.field_reserved);
    if ((localObject1 != null) && (((j.b)localObject1).type == 47))
    {
      localObject3 = ((j.b)localObject1).content;
      localObject2 = new Bundle();
      ((Bundle)localObject2).putString("rawUrl", ((j.b)localObject1).url);
      ((Bundle)localObject2).putString("sender_name", parambi.field_talker);
      localObject1 = j.a(ah.getContext(), (CharSequence)localObject3, (int)parama.zdZ.getTextSize(), localObject2, true);
      parama.zdZ.a((CharSequence)localObject1, TextView.BufferType.SPANNABLE);
      parama.zdZ.setTag(new ay(parambi, parama1.dFx(), paramInt, parambi.field_talker, '\000'));
      aw.ZK();
      if (com.tencent.mm.model.c.isSDCardAvailable())
        parama.zdZ.setOnLongClickListener(paramc.c(parama1));
    }
    AppMethodBeat.o(32968);
  }

  public final a eX(View paramView)
  {
    AppMethodBeat.i(32967);
    super.eP(paramView);
    this.zdZ = ((MMNeat7extView)paramView.findViewById(2131821103));
    this.zdZ.setOnTouchListener(new f(this.zdZ, new m(this.zdZ.getContext())));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    this.pyf = ((ProgressBar)paramView.findViewById(2131822660));
    AppMethodBeat.o(32967);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.m.a
 * JD-Core Version:    0.6.2
 */