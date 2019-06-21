package com.tencent.mm.ui.chatting.c;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.view.MenuItem;
import android.widget.AbsListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.ls;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI;
import com.tencent.mm.ui.chatting.ac;
import com.tencent.mm.ui.chatting.c.b.ai;
import com.tencent.mm.ui.chatting.c.b.d;
import com.tencent.mm.ui.chatting.c.b.v;
import com.tencent.mm.ui.chatting.c.b.w;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.chatting.c.a.a(dFp=v.class)
@Deprecated
public class aa extends a
  implements v
{
  private List<bi> yQU;
  private int yQV;
  private boolean yQW = false;
  private Runnable yQX = null;
  private ac yQY = null;

  public final int Nr()
  {
    return this.yQV;
  }

  public final void a(MenuItem paramMenuItem, com.tencent.mm.ui.chatting.viewitems.c paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(31592);
    bi localbi = ((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).Ou(paramMenuItem.getGroupId());
    if (localbi == null)
    {
      ab.e("MicroMsg.ChattingUI.MessBoxComponent", "context item select failed, null msg");
      AppMethodBeat.o(31592);
    }
    while (true)
    {
      return;
      ((w)this.cgL.aF(w.class)).j(paramMenuItem);
      switch (paramMenuItem.getItemId())
      {
      default:
        AppMethodBeat.o(31592);
        break;
      case 122:
        ((com.tencent.mm.ui.chatting.c.b.i)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.i.class)).bc(localbi);
        AppMethodBeat.o(31592);
        break;
      case 100:
        label144: com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getContext().getString(2131298414), "", this.cgL.yTx.getContext().getString(2131298868), this.cgL.yTx.getContext().getString(2131296868), new aa.2(this, localbi), null, 2131689665);
        AppMethodBeat.o(31592);
      case 129:
      case 114:
      case 123:
      case 116:
      case 150:
      }
    }
    paramMenuItem = j.b.me(bf.b(this.cgL.dFx(), localbi.field_content, localbi.field_isSend));
    if ((paramMenuItem != null) && ((paramMenuItem.type == 6) || (paramMenuItem.type == 2)))
    {
      paramMenuItem = com.tencent.mm.pluginsdk.model.app.am.aUq().aiE(paramMenuItem.csD);
      if ((paramMenuItem != null) && (e.ct(paramMenuItem.field_fileFullPath)))
        break label950;
      bool = false;
    }
    while (true)
    {
      if (!((ai)this.cgL.aF(ai.class)).e(localbi, bool))
      {
        com.tencent.mm.ui.base.h.a(this.cgL.yTx.getContext(), this.cgL.yTx.getMMResources().getString(2131298780), "", new aa.3(this), null);
        AppMethodBeat.o(31592);
        break;
        if (localbi.drE())
        {
          o.ahl();
          if (bo.isNullOrNil(com.tencent.mm.at.g.y(localbi)))
            continue;
        }
        bool = true;
        continue;
      }
      paramMenuItem = new Intent(this.cgL.yTx.getContext(), ChattingSendDataToDeviceUI.class);
      paramMenuItem.putExtra("exdevice_open_scene_type", 1);
      paramMenuItem.putExtra("Retr_Msg_Id", localbi.field_msgId);
      this.cgL.yTx.startActivity(paramMenuItem);
      AppMethodBeat.o(31592);
      break;
      if (localbi.isText())
        com.tencent.mm.ui.chatting.am.m(bf.b(this.cgL.dFx(), localbi.field_content, localbi.field_isSend), this.cgL.yTx.getContext());
      while (true)
      {
        ab.i("MicroMsg.ChattingUI.MessBoxComponent", "type is %d", new Object[] { Integer.valueOf(localbi.getType()) });
        AppMethodBeat.o(31592);
        break;
        if (localbi.drD())
          com.tencent.mm.ui.chatting.am.b(localbi, this.cgL.yTx.getContext());
        else if (localbi.drE())
          com.tencent.mm.ui.chatting.am.a(localbi, this.cgL.yTx.getContext(), paramc.b(this.cgL, localbi), this.cgL.dFx());
        else if (localbi.bws())
          com.tencent.mm.ui.chatting.am.c(localbi, this.cgL.yTx.getContext());
        else if (localbi.bAC())
          com.tencent.mm.ui.chatting.am.n(localbi.field_content, this.cgL.yTx.getContext());
        else if (localbi.dtw())
          com.tencent.mm.ui.chatting.am.o(localbi.field_content, this.cgL.yTx.getContext());
      }
      ab.d("MicroMsg.ChattingUI.MessBoxComponent", "[oneliang][longclick_menu_revoke] type:%d,item.getGroupId:%d", new Object[] { Integer.valueOf(localbi.getType()), Integer.valueOf(paramMenuItem.getGroupId()) });
      ((com.tencent.mm.ui.chatting.c.b.y)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.y.class)).bj(localbi);
      AppMethodBeat.o(31592);
      break;
      paramMenuItem = new com.tencent.mm.plugin.fav.b.c.a(((d)this.cgL.aF(d.class)).dDm(), this.cgL.dFw(), this.cgL.getTalkerUserName(), localbi, new aa.4(this));
      if (this.yQY == null)
        this.yQY = new ac();
      this.yQY.a(this.cgL.yTx, this.cgL.yTx.getContext(), paramMenuItem);
      AppMethodBeat.o(31592);
      break;
      paramMenuItem = new Intent();
      paramMenuItem.setClassName(this.cgL.yTx.getContext(), "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
      paramMenuItem.putExtra("app_msg_id", localbi.field_msgId);
      paramMenuItem.putExtra("choose_way", true);
      this.cgL.yTx.startActivity(paramMenuItem);
      break label144;
      label950: bool = true;
    }
  }

  public final boolean arp(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(31593);
    ab.i("MicroMsg.ChattingUI.MessBoxComponent", "[writeOpLogAndMarkRead] username:%s isTContact:%s thread name:%s", new Object[] { paramString, Boolean.valueOf(ad.aou(paramString)), Thread.currentThread().getName() });
    if (!com.tencent.mm.kernel.g.RN().QY())
    {
      ab.w("MicroMsg.ChattingUI.MessBoxComponent", "account not init.");
      AppMethodBeat.o(31593);
    }
    while (true)
    {
      return bool2;
      if ((ad.aou(paramString)) || (this.cgL == null))
        break;
      paramString = (d)this.cgL.aF(d.class);
      if (paramString == null)
      {
        ab.e("MicroMsg.ChattingUI.MessBoxComponent", "[writeOpLogAndMarkRead] ");
        AppMethodBeat.o(31593);
      }
      else
      {
        bool2 = paramString.dDy();
        AppMethodBeat.o(31593);
      }
    }
    aw.ZK();
    Cursor localCursor = com.tencent.mm.model.c.XO().Rk(paramString);
    if (localCursor.getCount() > 0);
    for (bool2 = bool1; ; bool2 = false)
    {
      localCursor.close();
      if (bool2)
      {
        aw.ZK();
        com.tencent.mm.model.c.XR().apb(paramString);
        aw.ZK();
        com.tencent.mm.model.c.XO().Ri(paramString);
      }
      AppMethodBeat.o(31593);
      break;
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31585);
    super.dDh();
    aw.ZK();
    if (com.tencent.mm.model.c.XI())
      com.tencent.mm.modelsimple.y.ab(this.cgL.getTalkerUserName(), 5);
    AppMethodBeat.o(31585);
  }

  public final List<bi> dEK()
  {
    return this.yQU;
  }

  public final boolean dEL()
  {
    return this.yQW;
  }

  public final void dxA()
  {
    AppMethodBeat.i(31589);
    com.tencent.mm.pluginsdk.wallet.i.Lt(6);
    tn localtn = new tn();
    localtn.cPI.type = 0;
    if (this.cgL != null)
    {
      localtn.cPI.cPL = this.cgL.getHeaderViewsCount();
      localtn.cPI.cPJ = this.cgL.getFirstVisiblePosition();
      localtn.cPI.cPK = this.cgL.getLastVisiblePosition();
    }
    com.tencent.mm.sdk.b.a.xxA.m(localtn);
    aj.amA("keep_chatting_silent" + this.cgL.getTalkerUserName());
    aw.getNotification().jO(this.cgL.getTalkerUserName());
    MMAppMgr.BV();
    AppMethodBeat.o(31589);
  }

  public final void dxB()
  {
    AppMethodBeat.i(31590);
    tn localtn = new tn();
    localtn.cPI.type = 1;
    com.tencent.mm.sdk.b.a.xxA.m(localtn);
    aw.getNotification().jO("");
    aj.amB("keep_app_silent");
    aj.amB("keep_chatting_silent" + this.cgL.getTalkerUserName());
    AppMethodBeat.o(31590);
  }

  public final void dxC()
  {
    AppMethodBeat.i(31591);
    ab.i("MicroMsg.ChattingUI.MessBoxComponent", "[onChattingExitAnimStart]");
    Object localObject = new tn();
    ((tn)localObject).cPI.type = 3;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    com.tencent.mm.ui.chatting.d.a.dFz().removeCallbacks(this.yQX);
    aw.ZK();
    localObject = com.tencent.mm.model.c.XR().aoZ(this.cgL.getTalkerUserName());
    if (localObject != null)
    {
      aw.ZK();
      com.tencent.mm.model.c.XR().a(this.cgL.getTalkerUserName(), 33554432, false, ((at)localObject).field_attrflag);
    }
    AppMethodBeat.o(31591);
  }

  public final void dxx()
  {
    AppMethodBeat.i(31586);
    this.yQW = this.cgL.yTx.getBooleanExtra("key_is_temp_session", false).booleanValue();
    Object localObject;
    if (this.yQW)
    {
      localObject = new com.tencent.mm.modelsimple.g(this.cgL.getTalkerUserName(), this.cgL.yTx.getIntExtra("key_temp_session_scene", 5), this.cgL.yTx.getStringExtra("key_temp_session_from"));
      aw.Rg().a((m)localObject, 0);
    }
    if ((this.cgL.sRl.dsf()) && (!com.tencent.mm.n.a.jh(this.cgL.sRl.field_type)))
    {
      aw.ZK();
      localObject = com.tencent.mm.model.c.XR().aoZ(this.cgL.getTalkerUserName());
      if (localObject == null)
        if (this.yQW)
        {
          localObject = new com.tencent.mm.storage.ak(this.cgL.getTalkerUserName());
          ((com.tencent.mm.storage.ak)localObject).jj(4194304);
          ((com.tencent.mm.storage.ak)localObject).dsI();
          aw.ZK();
          com.tencent.mm.model.c.XR().d((com.tencent.mm.storage.ak)localObject);
        }
    }
    while (true)
    {
      ab.d("MicroMsg.ChattingUI.MessBoxComponent", "is temp session : %s.", new Object[] { Boolean.valueOf(this.yQW) });
      AppMethodBeat.o(31586);
      return;
      if (((com.tencent.mm.storage.ak)localObject).jl(4194304))
      {
        this.yQW = true;
      }
      else
      {
        boolean bool;
        if (((at)localObject).field_conversationTime < z.aff())
        {
          aw.ZK();
          bool = com.tencent.mm.model.c.XR().a(this.cgL.getTalkerUserName(), 4194304, true, ((at)localObject).field_attrflag);
          ab.i("MicroMsg.ChattingUI.MessBoxComponent", "It is a old version temp session, Set attr flag(talker : %s), %s", new Object[] { this.cgL.getTalkerUserName(), Boolean.valueOf(bool) });
          this.yQW = true;
        }
        else if (this.yQW)
        {
          aw.ZK();
          bool = com.tencent.mm.model.c.XR().a(this.cgL.getTalkerUserName(), 4194304, true, ((at)localObject).field_attrflag);
          ab.i("MicroMsg.ChattingUI.MessBoxComponent", "It is a temp session, Set attr flag(talker : %s), %s", new Object[] { this.cgL.getTalkerUserName(), Boolean.valueOf(bool) });
          continue;
          this.yQW = false;
        }
      }
    }
  }

  public final void dxy()
  {
    AppMethodBeat.i(31587);
    Object localObject = com.tencent.mm.booter.notification.queue.b.IP();
    String str = this.cgL.getTalkerUserName();
    if (!bo.isNullOrNil(str))
      ((com.tencent.mm.booter.notification.queue.b)localObject).eei.remove(str);
    if (this.cgL.dFx())
    {
      com.tencent.mm.bf.d.chatType = 1;
      if (this.yQU != null)
        this.yQU.clear();
      aw.ZK();
      localObject = com.tencent.mm.model.c.XR().aoZ(this.cgL.getTalkerUserName());
      if (!((d)this.cgL.aF(d.class)).dDm())
        break label172;
      this.yQU = ((d)this.cgL.aF(d.class)).dDr();
    }
    label172: 
    while ((localObject == null) || (((at)localObject).field_unReadCount <= 0))
    {
      if (this.yQU == null)
        this.yQU = new LinkedList();
      this.yQV = this.yQU.size();
      AppMethodBeat.o(31587);
      return;
      com.tencent.mm.bf.d.chatType = 0;
      break;
    }
    if (((at)localObject).field_unReadCount > 100);
    for (int i = 100; ; i = ((at)localObject).field_unReadCount)
    {
      aw.ZK();
      this.yQU = com.tencent.mm.model.c.XO().ct(this.cgL.getTalkerUserName(), i);
      break;
    }
  }

  public final void dxz()
  {
    AppMethodBeat.i(31588);
    Object localObject = new tn();
    ((tn)localObject).cPI.type = 4;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    if (this.cgL != null)
    {
      ab.i("MicroMsg.ChattingUI.MessBoxComponent", "[addActiveToolsProcessIdleHandler]");
      localObject = com.tencent.mm.ui.chatting.d.a.dFz();
      aa.1 local1 = new aa.1(this);
      this.yQX = local1;
      ((com.tencent.mm.sdk.platformtools.ak)localObject).postDelayed(local1, 3000L);
    }
    localObject = new ls();
    ((ls)localObject).cHA.talker = this.cgL.getTalkerUserName();
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    aw.ZK();
    if (com.tencent.mm.model.c.XI())
      com.tencent.mm.modelsimple.y.ab(this.cgL.getTalkerUserName(), 2);
    AppMethodBeat.o(31588);
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject = null;
    AppMethodBeat.i(31583);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    boolean bool;
    if (paramIntent == null)
    {
      bool = true;
      ab.i("MicroMsg.ChattingUI.MessBoxComponent", "onActivityResult requestCode:%d, data is null:%b  rawUserName:%s ", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(bool), this.cgL.getTalkerUserName() });
      switch (paramInt1)
      {
      case 212:
      default:
        ab.e("MicroMsg.ChattingUI.MessBoxComponent", "onActivityResult: not found this requestCode");
        label96: AppMethodBeat.o(31583);
      case 213:
      case 211:
      }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      if ((paramIntent == null) || (!paramIntent.getBooleanExtra("_delete_ok_", false)))
        break label96;
      this.cgL.yTx.dBP();
      AppMethodBeat.o(31583);
      continue;
      if (paramInt2 != -1)
        break label96;
      Uri localUri = paramIntent.getData();
      paramIntent = localObject;
      if (this.cgL != null)
        paramIntent = this.cgL.yTx.getContext().managedQuery(localUri, null, null, null, null);
      if (paramIntent.moveToFirst())
      {
        paramIntent = new Intent("android.intent.action.EDIT", Uri.parse("content://com.android.contacts/contacts/".concat(String.valueOf(paramIntent.getString(paramIntent.getColumnIndexOrThrow("_id"))))));
        this.cgL.yTx.startActivity(paramIntent);
      }
      AppMethodBeat.o(31583);
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(31584);
    super.onScrollStateChanged(paramAbsListView, paramInt);
    if (paramInt == 0)
    {
      paramAbsListView = new tn();
      paramAbsListView.cPI.type = 5;
      paramAbsListView.cPI.cPJ = this.cgL.getFirstVisiblePosition();
      paramAbsListView.cPI.cPK = this.cgL.getLastVisiblePosition();
      paramAbsListView.cPI.cPL = this.cgL.getHeaderViewsCount();
      com.tencent.mm.sdk.b.a.xxA.m(paramAbsListView);
    }
    AppMethodBeat.o(31584);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.aa
 * JD-Core Version:    0.6.2
 */