package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.a.ui.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.c.b.h;

final class ar$i extends c.a
{
  TextView zfC;
  View zia = null;

  public static void a(i parami, bi parambi, boolean paramBoolean, int paramInt, com.tencent.mm.ui.chatting.d.a parama, ar.h paramh, View.OnLongClickListener paramOnLongClickListener)
  {
    AppMethodBeat.i(33429);
    if (parami == null)
      AppMethodBeat.o(33429);
    while (true)
    {
      return;
      int i;
      if (parami.zby != null)
      {
        ImageView localImageView = parami.zby;
        if (parambi.field_status == 6)
        {
          i = 8;
          label41: localImageView.setVisibility(i);
        }
      }
      else
      {
        parami.jPL.setTag(new ay(parambi, parama.dFx(), paramInt, null, '\000'));
        parami.jPL.setOnClickListener(paramh);
        parami.jPL.setOnLongClickListener(paramOnLongClickListener);
        parami.jPL.setOnTouchListener(((h)parama.aF(h.class)).dCZ());
        parama = parambi.dqJ;
        if (bo.isNullOrNil(parama))
          break label155;
        parami.zfC.setText(parama);
      }
      while (true)
      {
        if (parami.zia != null)
          break label183;
        AppMethodBeat.o(33429);
        break;
        i = 0;
        break label41;
        label155: if (paramBoolean)
          parami.zfC.setText(2131304355);
        else
          parami.zfC.setText(2131304356);
      }
      label183: if ((parambi.field_content.equals(bi.xZb)) || (kE(parambi.field_content)))
      {
        parami.zia.setBackgroundResource(2131232116);
        AppMethodBeat.o(33429);
      }
      else if ((parambi.field_content.equals(bi.xZc)) || (kD(parambi.field_content)))
      {
        if (paramBoolean)
        {
          parami.zia.setBackgroundResource(2131232113);
          AppMethodBeat.o(33429);
        }
        else
        {
          parami.zia.setBackgroundResource(2131232114);
        }
      }
      else
      {
        AppMethodBeat.o(33429);
      }
    }
  }

  private static boolean kD(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(33431);
    ui localui = new ui();
    localui.cQx.cAd = 1;
    localui.cQx.content = paramString;
    com.tencent.mm.sdk.b.a.xxA.m(localui);
    if (localui.cQy.type == 2)
      AppMethodBeat.o(33431);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33431);
    }
  }

  private static boolean kE(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(33430);
    ui localui = new ui();
    localui.cQx.cAd = 1;
    localui.cQx.content = paramString;
    com.tencent.mm.sdk.b.a.xxA.m(localui);
    if (localui.cQy.type == 3)
      AppMethodBeat.o(33430);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33430);
    }
  }

  public final c.a fe(View paramView)
  {
    AppMethodBeat.i(33428);
    super.eP(paramView);
    this.enf = ((TextView)paramView.findViewById(2131820587));
    this.zfC = ((TextView)paramView.findViewById(2131822631));
    this.jPL = paramView.findViewById(2131822515);
    this.zia = paramView.findViewById(2131822630);
    this.zby = ((ImageView)paramView.findViewById(2131822629));
    this.moo = ((CheckBox)paramView.findViewById(2131820580));
    this.iVh = paramView.findViewById(2131820586);
    AppMethodBeat.o(33428);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ar.i
 * JD-Core Version:    0.6.2
 */