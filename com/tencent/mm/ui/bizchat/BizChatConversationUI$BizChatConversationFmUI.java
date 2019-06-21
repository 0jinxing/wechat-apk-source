package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.aj.a.b.a;
import com.tencent.mm.aj.a.d.a;
import com.tencent.mm.aj.c.a;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.protocal.protobuf.acr;
import com.tencent.mm.protocal.protobuf.kd;
import com.tencent.mm.protocal.protobuf.uo;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.conversation.BaseConversationUI;
import com.tencent.mm.ui.conversation.BaseConversationUI.BaseConversationFmUI;
import com.tencent.mm.ui.v;
import java.util.HashMap;

public class BizChatConversationUI$BizChatConversationFmUI extends BaseConversationUI.BaseConversationFmUI
  implements com.tencent.mm.aj.n, n.b
{
  private TextView emptyTipTv;
  private String fvM;
  private boolean isCurrentActivity;
  private boolean isDeleteCancel;
  private ListView jJY;
  private n.d jKa;
  private com.tencent.mm.ui.tools.k jLO;
  private int jLX;
  private int jLY;
  private long jMj;
  private String jMp;
  private p tipDialog;
  private LinearLayout yEi;
  private b yEj;
  private com.tencent.mm.aj.a.j yEk;
  private int yEl;
  private b.a yEm;
  private d.a yEn;
  private c.a yEo;

  public BizChatConversationUI$BizChatConversationFmUI()
  {
    AppMethodBeat.i(30079);
    this.isDeleteCancel = false;
    this.yEl = 0;
    this.jLX = 0;
    this.jLY = 0;
    this.yEm = new BizChatConversationUI.BizChatConversationFmUI.11(this);
    this.yEn = new BizChatConversationUI.BizChatConversationFmUI.13(this);
    this.yEo = new BizChatConversationUI.BizChatConversationFmUI.14(this);
    AppMethodBeat.o(30079);
  }

  private void dAK()
  {
    AppMethodBeat.i(30088);
    String str = dAM();
    this.yEl = com.tencent.mm.ui.g.bK(getContext(), str);
    if ((this.yEl == 2) && (this.yEi == null))
    {
      this.yEi = ((LinearLayout)findViewById(2131823622));
      Object localObject = this.yEi.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).height = com.tencent.mm.bz.a.al(getContext(), 2131427567);
      this.yEi.setLayoutParams((ViewGroup.LayoutParams)localObject);
      View localView = v.hu(getContext()).inflate(2130969404, this.yEi, false);
      float f = com.tencent.mm.bz.a.dm(getContext());
      localObject = (ImageView)localView.findViewById(2131821226);
      int i = ((ImageView)localObject).getLayoutParams().height;
      ((ImageView)localObject).getLayoutParams().height = ((int)(i * f));
      ((ImageView)localObject).getLayoutParams().width = ((int)(f * i));
      ((ImageView)localObject).requestLayout();
      ((TextView)localView.findViewById(2131821185)).setText(2131299235);
      this.yEi.addView(localView);
      localView.setOnClickListener(new BizChatConversationUI.BizChatConversationFmUI.12(this));
      com.tencent.mm.ui.g.t(getContext(), this.jMp, 4);
      com.tencent.mm.ui.g.bL(getContext(), str);
    }
    if (this.yEi != null)
      if (this.yEl == 2)
      {
        this.yEi.setVisibility(0);
        AppMethodBeat.o(30088);
      }
    while (true)
    {
      return;
      this.yEi.setVisibility(8);
      AppMethodBeat.o(30088);
    }
  }

  private void dAL()
  {
    boolean bool = false;
    AppMethodBeat.i(30089);
    String str = z.aeV().cI(this.jMp);
    this.yEk = z.aeV().cH(str);
    Object localObject = this.jMp;
    if (this.yEk == null)
      bool = true;
    ab.i("MicroMsg.BizChatConversationFmUI", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", new Object[] { localObject, str, Boolean.valueOf(bool) });
    if ((bo.isNullOrNil(str)) || (this.yEk == null) || (this.yEk.afh()) || (bo.isNullOrNil(this.yEk.field_addMemberUrl)))
    {
      z.aeZ();
      com.tencent.mm.aj.a.h.a(this.jMp, this);
      localObject = thisActivity();
      getString(2131297061);
      this.tipDialog = com.tencent.mm.ui.base.h.b((Context)localObject, getString(2131297086), true, new BizChatConversationUI.BizChatConversationFmUI.9(this));
    }
    AppMethodBeat.o(30089);
  }

  private String dAM()
  {
    AppMethodBeat.i(30090);
    if (bo.isNullOrNil(this.fvM))
      this.fvM = z.aeR().qP(this.jMp).adX();
    String str = this.fvM;
    AppMethodBeat.o(30090);
    return str;
  }

  private void mZ(long paramLong)
  {
    AppMethodBeat.i(30091);
    Bundle localBundle = new Bundle();
    localBundle.putLong("key_biz_chat_id", paramLong);
    localBundle.putBoolean("finish_direct", false);
    localBundle.putBoolean("key_need_send_video", false);
    localBundle.putBoolean("key_is_biz_chat", true);
    this.ui.startChatting(this.jMp, localBundle, true);
    AppMethodBeat.o(30091);
  }

  public final void a(int paramInt, m paramm)
  {
    AppMethodBeat.i(30087);
    if (this.tipDialog != null)
    {
      this.tipDialog.dismiss();
      this.tipDialog = null;
    }
    if (paramm.getType() == 1355)
    {
      paramm = ((com.tencent.mm.aj.a.n)paramm).afm();
      paramm = z.aeT().rq(paramm.wcb.wku.vMV);
      if (paramm == null)
      {
        Toast.makeText(ah.getContext(), getString(2131302521), 0).show();
        AppMethodBeat.o(30087);
      }
    }
    while (true)
    {
      return;
      mZ(paramm.field_bizChatLocalId);
      AppMethodBeat.o(30087);
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
  }

  public int getLayoutId()
  {
    return 2130969403;
  }

  public String getUserName()
  {
    AppMethodBeat.i(30081);
    String str;
    if (bo.isNullOrNil(this.fvM))
    {
      str = this.jMp;
      AppMethodBeat.o(30081);
    }
    while (true)
    {
      return str;
      str = this.fvM;
      AppMethodBeat.o(30081);
    }
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    AppMethodBeat.i(30080);
    super.onActivityCreated(paramBundle);
    this.jMp = thisActivity().getIntent().getStringExtra("Contact_User");
    ab.i("MicroMsg.BizChatConversationFmUI", "[registerListener]");
    z.aeU().a(this.yEm, thisActivity().getMainLooper());
    z.aeT().a(this.yEn, thisActivity().getMainLooper());
    z.afa().a(this.yEo, thisActivity().getMainLooper());
    aw.ZK();
    com.tencent.mm.model.c.XR().a(this);
    this.emptyTipTv = ((TextView)findViewById(2131821807));
    this.emptyTipTv.setText(2131301292);
    this.jJY = ((ListView)findViewById(2131823620));
    dAK();
    this.yEj = new b(thisActivity(), new BizChatConversationUI.BizChatConversationFmUI.19(this), this.jMp);
    this.yEj.setGetViewPositionCallback(new BizChatConversationUI.BizChatConversationFmUI.20(this));
    this.yEj.setPerformItemClickListener(new BizChatConversationUI.BizChatConversationFmUI.21(this));
    this.yEj.a(new MMSlideDelView.f()
    {
      public final void bN(Object paramAnonymousObject)
      {
        AppMethodBeat.i(30056);
        if (paramAnonymousObject == null)
        {
          ab.e("MicroMsg.BizChatConversationFmUI", "onItemDel object null");
          AppMethodBeat.o(30056);
        }
        while (true)
        {
          return;
          AppMethodBeat.o(30056);
        }
      }
    });
    this.jJY.setAdapter(this.yEj);
    this.jKa = new BizChatConversationUI.BizChatConversationFmUI.15(this);
    paramBundle = new com.tencent.mm.ui.widget.b.a(thisActivity());
    this.jJY.setOnTouchListener(new BizChatConversationUI.BizChatConversationFmUI.16(this));
    this.jJY.setOnItemLongClickListener(new BizChatConversationUI.BizChatConversationFmUI.17(this, paramBundle));
    this.jJY.setOnItemClickListener(new BizChatConversationUI.BizChatConversationFmUI.18(this));
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(30057);
        BizChatConversationUI.BizChatConversationFmUI.this.finish();
        AppMethodBeat.o(30057);
        return true;
      }
    });
    addIconOptionMenu(1, 2131304082, 2131230741, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(30058);
        ab.v("MicroMsg.BizChatConversationFmUI", "search btn was clicked.");
        paramAnonymousMenuItem = new Intent(BizChatConversationUI.BizChatConversationFmUI.this.getContext(), BizChatSearchUI.class);
        paramAnonymousMenuItem.putExtra("enterprise_biz_name", BizChatConversationUI.BizChatConversationFmUI.a(BizChatConversationUI.BizChatConversationFmUI.this));
        paramAnonymousMenuItem.putExtra("biz_chat_search_scene", 1);
        paramAnonymousMenuItem.putExtra("biz_chat_search_text", "");
        paramAnonymousMenuItem.addFlags(67108864);
        BizChatConversationUI.BizChatConversationFmUI.this.startActivity(paramAnonymousMenuItem);
        AppMethodBeat.o(30058);
        return true;
      }
    });
    addIconOptionMenu(2, 2131296397, 2131230736, new BizChatConversationUI.BizChatConversationFmUI.5(this));
    dAL();
    aw.RS().m(new BizChatConversationUI.BizChatConversationFmUI.10(this), 300L);
    paramBundle = dAM();
    if (paramBundle != null)
    {
      z.afa();
      com.tencent.mm.aj.c.a(paramBundle, null);
      ab.e("MicroMsg.BizChatConversationFmUI", "update father attr from svr mainBizName:%s", new Object[] { paramBundle });
    }
    while (true)
    {
      Looper.myQueue().addIdleHandler(new BizChatConversationUI.BizChatConversationFmUI.1(this));
      paramBundle = thisActivity().getIntent();
      if (w.a(paramBundle, "biz_chat_need_to_jump_to_chatting_ui", false))
      {
        long l = paramBundle.getLongExtra("biz_chat_chat_id", -1L);
        if (l != -1L)
          mZ(l);
      }
      AppMethodBeat.o(30080);
      return;
      ab.e("MicroMsg.BizChatConversationFmUI", "mainBizName is null!!!");
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(30086);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
      AppMethodBeat.o(30086);
    while (true)
    {
      return;
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(30086);
      case 1:
      }
    }
    paramIntent = paramIntent.getBundleExtra("result_data");
    Object localObject;
    acr localacr;
    if (paramIntent != null)
    {
      ab.i("MicroMsg.BizChatConversationFmUI", "bundle != null");
      localObject = paramIntent.getString("enterprise_members");
      localacr = new acr();
      com.tencent.mm.aj.a.c localc = new com.tencent.mm.aj.a.c();
      if (this.yEk != null)
      {
        paramIntent = this.yEk.field_addMemberUrl;
        label115: localc.field_addMemberUrl = paramIntent;
        localc.field_brandUserName = this.jMp;
        if (!com.tencent.mm.aj.a.e.a(localc, (String)localObject, null, localacr))
          break label260;
        if (localc.field_bizChatLocalId == -1L)
          break label202;
        mZ(localc.field_bizChatLocalId);
        paramInt1 = 1;
      }
    }
    while (true)
    {
      if (paramInt1 == 0)
      {
        Toast.makeText(thisActivity(), getString(2131302521), 0).show();
        AppMethodBeat.o(30086);
        break;
        paramIntent = null;
        break label115;
        label202: z.aeZ();
        localObject = com.tencent.mm.aj.a.h.a(this.jMp, localacr, this);
        paramIntent = thisActivity();
        getString(2131297061);
        this.tipDialog = com.tencent.mm.ui.base.h.b(paramIntent, getString(2131297086), true, new BizChatConversationUI.BizChatConversationFmUI.6(this, (com.tencent.mm.aj.a.n)localObject));
        paramInt1 = 1;
        continue;
        label260: paramInt1 = 0;
        continue;
      }
      AppMethodBeat.o(30086);
      break;
      paramInt1 = 0;
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(30085);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenuInfo = (com.tencent.mm.aj.a.a)this.yEj.getItem(paramView.position);
    this.jMj = paramContextMenuInfo.field_bizChatId;
    if (paramContextMenuInfo.field_unReadCount <= 0)
    {
      paramContextMenu.add(paramView.position, 1, 0, 2131301283);
      z.aeU();
      if (!com.tencent.mm.aj.a.b.c(paramContextMenuInfo))
        break label126;
      paramContextMenu.add(paramView.position, 3, 1, 2131301284);
    }
    while (true)
    {
      paramContextMenu.add(paramView.position, 0, 2, 2131301288);
      AppMethodBeat.o(30085);
      return;
      paramContextMenu.add(paramView.position, 2, 0, 2131301281);
      break;
      label126: paramContextMenu.add(paramView.position, 3, 1, 2131301282);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(30082);
    ab.i("MicroMsg.BizChatConversationFmUI", "[unRegitListener]");
    z.aeU().a(this.yEm);
    z.aeT().a(this.yEn);
    z.afa().a(this.yEo);
    if (aw.RK())
    {
      aw.ZK();
      com.tencent.mm.model.c.XR().b(this);
    }
    this.yEj.bIf();
    b localb = this.yEj;
    if (localb.yDY != null)
    {
      localb.yDY.clear();
      localb.yDY = null;
    }
    super.onDestroy();
    AppMethodBeat.o(30082);
  }

  public void onPause()
  {
    AppMethodBeat.i(30084);
    ab.i("MicroMsg.BizChatConversationFmUI", "on pause");
    aw.ZK();
    com.tencent.mm.model.c.XR().apb(this.jMp);
    com.tencent.mm.aj.a.b localb = z.aeU();
    String str = this.jMp;
    if (bo.isNullOrNil(str))
      ab.e("MicroMsg.BizConversationStorage", "brandUserName is null");
    while (true)
    {
      if (this.yEj != null)
        this.yEj.onPause();
      this.isCurrentActivity = false;
      aw.getNotification().jO("");
      super.onPause();
      AppMethodBeat.o(30084);
      return;
      str = "update BizChatConversation set newUnReadCount = 0 where newUnReadCount != 0 and brandUserName = '" + str + "'";
      ab.d("MicroMsg.BizConversationStorage", "resetNewUnreadCount :%s,sql:%s", new Object[] { Boolean.valueOf(localb.bSd.hY("BizChatConversation", str)), str });
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(30083);
    super.onResume();
    ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.jMp);
    if ((localad == null) || (!com.tencent.mm.n.a.jh(localad.field_type)))
    {
      finish();
      AppMethodBeat.o(30083);
    }
    while (true)
    {
      return;
      com.tencent.mm.aj.d locald = f.qX(this.jMp);
      if ((locald != null) && (locald.field_enterpriseFather != null) && (t.mY(locald.field_enterpriseFather)))
        break;
      finish();
      AppMethodBeat.o(30083);
    }
    if (localad.DX())
      setTitleMuteIconVisibility(0);
    while (true)
    {
      this.isCurrentActivity = true;
      this.yEj.a(null, null);
      aw.getNotification().jO(this.jMp);
      AppMethodBeat.o(30083);
      break;
      setTitleMuteIconVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI
 * JD-Core Version:    0.6.2
 */