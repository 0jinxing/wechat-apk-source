package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.h;
import com.tencent.mm.ui.chatting.d.a;

public final class ab extends c
{
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    AppMethodBeat.i(33219);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null);
    }
    else
    {
      localObject = new v(paramLayoutInflater, 2130969076);
      ((View)localObject).setTag(new ab.a(this).fg((View)localObject));
    }
    AppMethodBeat.o(33219);
    return localObject;
  }

  public final void a(c.a parama, int paramInt, a parama1, bi parambi, String paramString)
  {
    AppMethodBeat.i(33220);
    ab.a locala = (ab.a)parama;
    com.tencent.mm.af.j localj = am.dhN().ma(parambi.field_msgId);
    String str = parambi.field_content;
    if ((localj != null) && (str != null))
    {
      paramString = j.b.X(str, parambi.field_reserved);
      parambi = new ay(parambi, parama1.dFx(), paramInt, null, '\000');
      if ((paramString != null) && ((paramString.showType == 2) || (paramString.fhn == 2) || (paramString.fhn == 4)))
      {
        a.b.s(locala.gvq, paramString.fhr);
        locala.zfS.setTextSize(0, parama1.yTx.getMMResources().getDimension(2131427813));
        locala.zfS.setTextColor(Color.parseColor("#BF000000"));
        locala.zfS.setEllipsize(TextUtils.TruncateAt.END);
        locala.zfS.setSingleLine(true);
        locala.zfS.setShouldEllipsize(true);
        locala.zfS.setText(com.tencent.mm.pluginsdk.ui.e.j.b(parama1.yTx.getContext(), paramString.fhq));
      }
      parama.jPL.setOnLongClickListener(c(parama1));
      parama.jPL.setOnTouchListener(((h)parama1.aF(h.class)).dCZ());
      parama.jPL.setTag(parambi);
      parama.jPL.setOnClickListener(d(parama1));
      AppMethodBeat.o(33220);
      return;
    }
    if (localj == null);
    for (boolean bool = true; ; bool = false)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicrMsg.ChattingItemHardDeviceMsgLike", "amessage:%b, %s, %d, %s", new Object[] { Boolean.valueOf(bool), str, Long.valueOf(parambi.field_msgId), paramString });
      paramString = null;
      break;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, bi parambi)
  {
    AppMethodBeat.i(33221);
    paramContextMenu.add(((ay)paramView.getTag()).position, 100, 0, paramView.getContext().getString(2131298154));
    AppMethodBeat.o(33221);
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, a parama, bi parambi)
  {
    AppMethodBeat.i(33222);
    paramMenuItem.getItemId();
    AppMethodBeat.o(33222);
    return false;
  }

  public final boolean aH(int paramInt, boolean paramBoolean)
  {
    if (paramInt == -1879048183);
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  public final boolean b(View paramView, a parama, bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(33223);
    com.tencent.mm.sdk.platformtools.ab.i("MicrMsg.ChattingItemHardDeviceMsgLike", "hy: user clicked on the like item");
    if (parambi == null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, msg is null.");
      AppMethodBeat.o(33223);
    }
    String str;
    while (true)
    {
      return bool;
      str = parambi.field_content;
      paramView = j.b.X(str, parambi.field_reserved);
      if (paramView == null)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, content is null.");
        AppMethodBeat.o(33223);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, url is (%s).", new Object[] { paramView.url });
        if (ah.isNullOrNil(paramView.url))
          break;
        parambi = new Intent();
        parambi.putExtra("rawUrl", paramView.url);
        com.tencent.mm.bp.d.b(parama.yTx.getContext(), "webview", ".ui.tools.WebViewUI", parambi);
        AppMethodBeat.o(33223);
        bool = true;
      }
    }
    aw.ZK();
    if (com.tencent.mm.model.c.XM().aoO(paramView.fhr).Ob())
      com.tencent.mm.sdk.platformtools.ab.i("MicrMsg.ChattingItemHardDeviceMsgLike", "we run black user");
    while (true)
    {
      AppMethodBeat.o(33223);
      break;
      if (paramView.showType == 2)
      {
        if (!ah.isNullOrNil(paramView.fha))
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
          localIntent.putExtra("locate_to_username", paramView.fhr);
          com.tencent.mm.bp.d.b(parama.yTx.getContext(), "exdevice", ".ui.ExdeviceRankInfoUI", localIntent);
        }
        while (true)
        {
          com.tencent.mm.plugin.sport.a.d.kT(30);
          break;
          parambi = new Intent();
          parambi.putExtra("key_is_latest", true);
          parambi.putExtra("app_username", paramView.appName);
          parambi.putExtra("device_type", paramView.fho);
          parambi.putExtra("locate_to_username", paramView.fhr);
          com.tencent.mm.bp.d.b(parama.yTx.getContext(), "exdevice", ".ui.ExdeviceRankInfoUI", parambi);
        }
      }
      if (paramView.showType == 4)
      {
        parambi = new Intent();
        parambi.putExtra("username", paramView.fhr);
        parambi.putExtra("app_username", "gh_43f2581f6fd6");
        com.tencent.mm.bp.d.b(parama.yTx.getContext(), "exdevice", ".ui.ExdeviceProfileUI", parambi);
        com.tencent.mm.plugin.sport.a.d.kT(29);
      }
    }
  }

  public final boolean dHk()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ab
 * JD-Core Version:    0.6.2
 */