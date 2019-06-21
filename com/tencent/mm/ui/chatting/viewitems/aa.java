package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.HardDeviceChattingItemView;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;

public final class aa extends c
{
  private a yJI;

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33213);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969077);
      ((View)localObject).setTag(new aa.a(this).ff((View)localObject));
    }
    AppMethodBeat.o(33213);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33214);
    this.yJI = parama1;
    aa.a locala = (aa.a)parama;
    Object localObject1 = am.dhN().ma(parambi.field_msgId);
    Object localObject2 = parambi.field_content;
    if ((localObject1 != null) && (localObject2 != null))
      paramString = j.b.X((String)localObject2, parambi.field_reserved);
    while (true)
    {
      ay localay = new ay(parambi, parama1.dFx(), paramInt, null, '\000');
      HardDeviceChattingItemView localHardDeviceChattingItemView = (HardDeviceChattingItemView)parama.jPL;
      int i;
      int j;
      int k;
      if ((paramString != null) && ((paramString.showType == 1) || (paramString.fhn == 1)))
        if (ah.isNullOrNil(paramString.fhi))
        {
          localObject2 = paramString.color;
          Object localObject3 = paramString.fhf;
          if (!bo.isNullOrNil((String)localObject2))
          {
            localObject1 = localObject3;
            parambi = (bi)localObject2;
            if (!bo.isNullOrNil((String)localObject3));
          }
          else
          {
            ab.e("MicroMsg.HardDeviceChattingItemView", "color is null or highlight color is null, color = %s, highlight color = %s", new Object[] { localObject2, localObject3 });
            parambi = "#ffffff";
            localObject1 = "#ffffff";
          }
          localObject2 = new StateListDrawable();
          localObject3 = new ColorDrawable(Color.parseColor((String)localObject1));
          ((StateListDrawable)localObject2).addState(new int[] { 16842919 }, (Drawable)localObject3);
          localObject1 = new ColorDrawable(Color.parseColor((String)localObject1));
          ((StateListDrawable)localObject2).addState(new int[] { 16842908 }, (Drawable)localObject1);
          localObject1 = new ColorDrawable(Color.parseColor(parambi));
          ((StateListDrawable)localObject2).addState(new int[] { 16842766 }, (Drawable)localObject1);
          parambi = new ColorDrawable(Color.parseColor(parambi));
          ((StateListDrawable)localObject2).addState(new int[0], parambi);
          localHardDeviceChattingItemView.setBackgroundDrawable((Drawable)localObject2);
          paramString.fhi = "#ffffff";
          parambi = paramString.fhg;
          localObject1 = paramString.fhh;
          i = 2131690691;
          j = 2131690691;
          k = j;
          paramInt = i;
          if (!ah.isNullOrNil(parambi))
          {
            k = j;
            paramInt = i;
            if (!ah.isNullOrNil((String)localObject1))
              paramInt = i;
          }
        }
      try
      {
        k = Color.parseColor(parambi);
        paramInt = k;
        i = Color.parseColor((String)localObject1);
        paramInt = k;
        k = i;
        parambi = new StateListDrawable();
        localObject1 = new ColorDrawable(k);
        parambi.addState(new int[] { 16842919 }, (Drawable)localObject1);
        localObject1 = new ColorDrawable(k);
        parambi.addState(new int[] { 16842908 }, (Drawable)localObject1);
        localObject1 = new ColorDrawable(paramInt);
        parambi.addState(new int[] { 16842766 }, (Drawable)localObject1);
        localObject1 = new ColorDrawable(paramInt);
        parambi.addState(new int[0], (Drawable)localObject1);
        locala.zfP.setBackgroundDrawable(parambi);
        parambi = paramString.fhi;
        if (locala != null)
        {
          k = 2131690691;
          paramInt = k;
          if (ah.isNullOrNil(parambi));
        }
      }
      catch (IllegalArgumentException parambi)
      {
        try
        {
          paramInt = Color.parseColor(parambi);
          locala.zfM.setTextColor(paramInt);
          locala.zfN.setTextColor(paramInt);
          locala.zfK.setTextColor(paramInt);
          locala.zfL.setTextColor(paramInt);
          locala.zfO.setTextColor(paramInt);
          locala.zfM.setText(paramString.fhb);
          locala.zfN.setText(paramString.fgZ);
          locala.zfK.setText(paramString.fhd);
          locala.zfL.setText(paramString.fhc);
          locala.zfO.setText(paramString.fhe);
          if (!ah.isNullOrNil(paramString.fhj))
          {
            locala.zfQ.setVisibility(0);
            a.b.s(locala.zfQ, paramString.fhj);
            parama.jPL.setOnLongClickListener(c(parama1));
            parama.jPL.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
            parama.jPL.setTag(localay);
            parama.jPL.setOnClickListener(d(parama1));
            AppMethodBeat.o(33214);
            return;
            if (localObject1 == null);
            for (boolean bool = true; ; bool = false)
            {
              ab.e("MicroMsg.ChattingItemHardDeviceMsg", "amessage:%b, %s, %d, %s", new Object[] { Boolean.valueOf(bool), localObject2, Long.valueOf(parambi.field_msgId), paramString });
              paramString = null;
              break;
            }
            parambi = parambi;
            ab.w("MicroMsg.ChattingItemHardDeviceMsg", "hy: line color given color is incorrect. use default");
            k = j;
          }
        }
        catch (IllegalArgumentException parambi)
        {
          while (true)
          {
            ab.w("MicroMsg.ChattingItemHardDeviceMsg", "hy: given color is incorrect.use default");
            paramInt = k;
            continue;
            locala.zfQ.setVisibility(8);
          }
        }
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33215);
    paramContextMenu.add(((ay)paramView.getTag()).position, 100, 0, this.yJI.yTx.getMMResources().getString(2131298154));
    AppMethodBeat.o(33215);
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    AppMethodBeat.i(33216);
    paramMenuItem.getItemId();
    AppMethodBeat.o(33216);
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if (paramInt == -1879048185);
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(33217);
    String str = parambi.field_content;
    paramView = j.b.X(str, parambi.field_reserved);
    if (paramView == null)
    {
      ab.i("MicroMsg.ChattingItemHardDeviceMsg", "onItemClick, content is null.");
      AppMethodBeat.o(33217);
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.ChattingItemHardDeviceMsg", "onItemClick, url is (%s).", new Object[] { paramView.url });
      if (ah.isNullOrNil(paramView.url))
        break;
      parambi = new Intent();
      parambi.putExtra("rawUrl", paramView.url);
      com.tencent.mm.bp.d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", parambi);
      AppMethodBeat.o(33217);
      bool = true;
    }
    if (!ah.isNullOrNil(paramView.fha))
    {
      int j = paramView.fhp;
      if (System.currentTimeMillis() - j * 1000L >= 2592000000L)
        i = 1;
      if (i == 0)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("key_rank_info", str);
        localIntent.putExtra("key_rank_semi", parambi.field_reserved);
        localIntent.putExtra("key_rank_title", paramView.fhk);
        localIntent.putExtra("key_champion_info", paramView.fhl);
        localIntent.putExtra("key_champion_coverimg", paramView.fhl);
        localIntent.putExtra("rank_id", paramView.fha);
        localIntent.putExtra("app_username", paramView.appName);
        localIntent.putExtra("device_type", paramView.fho);
        localIntent.putExtra("key_champioin_username", paramView.fhj);
        com.tencent.mm.bp.d.b(parama.yTx.getContext(), "exdevice", ".ui.ExdeviceRankInfoUI", localIntent);
        com.tencent.mm.plugin.sport.a.d.kT(28);
      }
    }
    while (true)
    {
      AppMethodBeat.o(33217);
      bool = true;
      break;
      com.tencent.mm.bp.d.H(parama.yTx.getContext(), "exdevice", ".ui.ExdeviceExpireUI");
    }
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.aa
 * JD-Core Version:    0.6.2
 */