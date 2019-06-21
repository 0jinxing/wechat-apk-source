package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.at.e;
import com.tencent.mm.at.o;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bh;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.aa;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.c.b.j;

public final class ad$a extends c
{
  private com.tencent.mm.ui.chatting.d.a yJI;
  private ad.c zfW;

  public static void a(Context paramContext, c.a parama, bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(33234);
    if (true != paramBoolean)
      AppMethodBeat.o(33234);
    while (true)
    {
      return;
      if ((parama instanceof ad.d))
      {
        parama = (ad.d)parama;
        o.ahl().a(parama.zdN, parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(paramContext), parambi.dJw, parambi.dJx, parama.zeh, 2130838180, 1, null);
      }
      AppMethodBeat.o(33234);
    }
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33229);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969067);
      ((View)localObject).setTag(new ad.d().z((View)localObject, true));
    }
    AppMethodBeat.o(33229);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33230);
    this.yJI = parama1;
    ((j)parama1.aF(j.class)).bf(parambi);
    ad.d locald = (ad.d)parama;
    boolean bool = o.ahl().a(locald.zdN, parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(parama1.yTx.getContext()), parambi.dJw, parambi.dJx, locald.zeh, 2130838177, 1, null);
    locald.zfZ.setVisibility(0);
    locald.pyf.setVisibility(8);
    if ((!bool) && (!this.kuU))
      locald.zdN.setImageBitmap(BitmapFactory.decodeResource(parama1.yTx.getMMResources(), 2130838177));
    parama = null;
    if (parama1.dFx())
      parama = parambi.field_talker;
    locald.jPL.setTag(new ay(parambi, parama1.dFx(), paramInt, paramString, parama));
    parama = locald.jPL;
    if (this.zfW == null)
      this.zfW = new ad.c(this.yJI, this);
    parama.setOnClickListener(this.zfW);
    locald.jPL.setOnLongClickListener(c(parama1));
    locald.jPL.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
    ad.a(parambi, parama1, locald);
    AppMethodBeat.o(33230);
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33232);
    aw.ZK();
    int i;
    Object localObject1;
    Object localObject2;
    int[] arrayOfInt;
    int j;
    int k;
    if ((com.tencent.mm.model.c.isSDCardAvailable()) && (paramView != null) && (parambi != null))
    {
      i = ((ay)paramView.getTag()).position;
      localObject1 = null;
      if (parambi.field_msgId > 0L)
        localObject1 = o.ahl().fJ(parambi.field_msgId);
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((e)localObject1).fDy > 0L);
      }
      else
      {
        localObject2 = localObject1;
        if (parambi.field_msgSvrId > 0L)
          localObject2 = o.ahl().fI(parambi.field_msgSvrId);
      }
      paramContextMenu.add(i, 110, 0, paramView.getContext().getString(2131302491));
      if ((f.aey()) && (!this.yJI.dFy()))
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(2131298150));
      if (d.afj("favorite"))
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(2131301955));
      localObject1 = new dq();
      ((dq)localObject1).cxc.cvx = parambi.field_msgId;
      com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
      if ((((dq)localObject1).cxd.cwB) || (com.tencent.mm.pluginsdk.model.app.g.ad(this.yJI.yTx.getContext(), parambi.getType())))
        paramContextMenu.add(i, 129, 0, paramView.getContext().getString(2131298160));
      if ((localObject2 != null) && (((e)localObject2).status != -1))
      {
        localObject1 = paramContextMenu.add(i, 131, 0, paramView.getContext().getString(2131298118));
        arrayOfInt = new int[2];
        if (paramView == null)
          break label452;
        j = paramView.getWidth();
        k = paramView.getHeight();
        paramView.getLocationInWindow(arrayOfInt);
      }
    }
    while (true)
    {
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("img_gallery_width", j).putExtra("img_gallery_height", k).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]);
      ((MenuItem)localObject1).setIntent((Intent)localObject2);
      if (bh.o(parambi))
        paramContextMenu.clear();
      if (!this.yJI.dFy())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(2131298153));
      AppMethodBeat.o(33232);
      return true;
      label452: k = 0;
      j = 0;
    }
  }

  public final boolean a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    AppMethodBeat.i(33233);
    if (100 == paramMenuItem.getItemId())
      ad.b(parambi, parama);
    while (true)
    {
      AppMethodBeat.o(33233);
      return false;
      if (131 == paramMenuItem.getItemId())
        ad.b(parama, paramMenuItem, parambi);
      else
        ((aa)parama.aF(aa.class)).a(paramMenuItem, parambi);
    }
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if ((!paramBoolean) && ((paramInt == 39) || (paramInt == 3) || (paramInt == 23) || (paramInt == 13) || (paramInt == 33)));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, com.tencent.mm.ui.chatting.d.a parama, bi parambi)
  {
    return false;
  }

  protected final boolean b(com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(33231);
    boolean bool = parama.dFx();
    AppMethodBeat.o(33231);
    return bool;
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ad.a
 * JD-Core Version:    0.6.2
 */