package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.n.d;

public final class g
  implements View.OnCreateContextMenuListener, AdapterView.OnItemLongClickListener, PopupWindow.OnDismissListener
{
  private Activity activity;
  private ak conversation;
  private n.d jOb;
  private int[] mtm;
  private int position;
  private String talker;
  private ListView zqz;
  private h zrd;

  public g(h paramh, ListView paramListView, Activity paramActivity, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(34261);
    this.talker = "";
    this.conversation = null;
    this.mtm = new int[2];
    this.jOb = new g.1(this);
    this.zrd = paramh;
    this.zqz = paramListView;
    this.activity = paramActivity;
    this.mtm = paramArrayOfInt;
    AppMethodBeat.o(34261);
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    int i = 1;
    AppMethodBeat.i(34264);
    paramView = this.zrd;
    ab.i("MicroMsg.ConversationWithCacheAdapter", "[frozenNotify] from:%s", new Object[] { ah.anW() });
    paramView.ztR = true;
    aw.ZK();
    ad localad = c.XM().aoO(this.talker);
    if (localad == null)
    {
      ab.e("MicroMsg.ConversationClickListener", "onCreateContextMenu, contact is null, talker = " + this.talker);
      AppMethodBeat.o(34264);
    }
    label165: label432: label560: 
    while (true)
    {
      return;
      String str = localad.Oj();
      paramView = str;
      if (str.toLowerCase().endsWith("@chatroom"))
      {
        paramView = str;
        if (ah.isNullOrNil(localad.field_nickname))
          paramView = this.activity.getString(2131298223);
      }
      paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
      paramContextMenu.setHeaderTitle(j.b(this.activity, paramView));
      int j;
      if (this.conversation != null)
      {
        j = 1;
        if ((j & t.b(this.conversation)) != 0)
        {
          paramView = this.talker;
          aw.ZK();
          paramView = c.XR().aoZ(paramView);
          if (paramView == null)
            break label438;
          if ((paramView.field_unReadCount > 0) || (paramView.jl(1048576)))
            break label432;
          j = i;
          label221: if (j == 0)
            break label444;
          paramContextMenu.add(paramContextMenuInfo.position, 8, 0, 2131301283);
        }
        label242: if ((this.conversation != null) && (t.a(this.conversation)))
        {
          aw.ZK();
          if (!c.XR().aph(this.talker))
            break label464;
          paramContextMenu.add(paramContextMenuInfo.position, 6, 0, 2131301284);
        }
      }
      while (true)
      {
        if ((localad.dsf()) && (com.tencent.mm.n.a.jh(localad.field_type)) && (!t.nJ(localad.field_username)) && (!t.nl(localad.field_username)))
        {
          paramView = f.qX(localad.field_username);
          if ((paramView != null) && (paramView.adM()))
            paramContextMenu.add(paramContextMenuInfo.position, 10, 0, 2131301280);
        }
        if ((this.conversation == null) || (this.conversation.field_conversationTime == -1L))
          break label560;
        if (!t.ne(this.talker))
          break label510;
        paramContextMenu.add(paramContextMenuInfo.position, 4, 0, 2131301291);
        AppMethodBeat.o(34264);
        break;
        j = 0;
        break label165;
        j = 0;
        break label221;
        label438: j = 0;
        break label221;
        label444: paramContextMenu.add(paramContextMenuInfo.position, 7, 0, 2131301281);
        break label242;
        label464: if (localad.dsf())
          paramContextMenu.add(paramContextMenuInfo.position, 5, 0, 2131298732);
        else
          paramContextMenu.add(paramContextMenuInfo.position, 5, 0, 2131301282);
      }
      label510: if (t.nf(this.talker))
      {
        paramContextMenu.add(paramContextMenuInfo.position, 4, 0, 2131301289);
        AppMethodBeat.o(34264);
      }
      else
      {
        paramContextMenu.add(paramContextMenuInfo.position, 4, 0, 2131301288);
        AppMethodBeat.o(34264);
      }
    }
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(34263);
    h localh = this.zrd;
    localh.ztR = false;
    localh.notifyDataSetChanged();
    AppMethodBeat.o(34263);
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(34262);
    if (paramInt < this.zqz.getHeaderViewsCount())
    {
      ab.d("MicroMsg.ConversationClickListener", "on long click header view");
      AppMethodBeat.o(34262);
    }
    while (true)
    {
      return true;
      this.position = (paramInt - this.zqz.getHeaderViewsCount());
      this.conversation = ((ak)this.zrd.MG(paramInt - this.zqz.getHeaderViewsCount()));
      if (this.conversation != null)
        break;
      ab.e("MicroMsg.ConversationClickListener", "headercount:%d, postion:%d", new Object[] { Integer.valueOf(this.zqz.getHeaderViewsCount()), Integer.valueOf(paramInt) });
      AppMethodBeat.o(34262);
    }
    this.talker = this.conversation.field_username;
    paramAdapterView = new com.tencent.mm.ui.widget.b.a(this.activity);
    paramAdapterView.a(paramView, paramInt, paramLong, this, this.jOb, this.mtm[0], this.mtm[1]);
    paramAdapterView.zHM = this;
    if (t.kH(this.talker))
      com.tencent.mm.plugin.report.service.h.pYm.e(14553, new Object[] { Integer.valueOf(1), Integer.valueOf(0), this.talker });
    while (true)
    {
      AppMethodBeat.o(34262);
      break;
      com.tencent.mm.plugin.report.service.h.pYm.e(14553, new Object[] { Integer.valueOf(0), Integer.valueOf(0), this.talker });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.g
 * JD-Core Version:    0.6.2
 */