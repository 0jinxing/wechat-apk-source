package com.tencent.mm.ui.conversation;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.at;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf.a;
import com.tencent.mm.model.t;
import com.tencent.mm.protocal.protobuf.brm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.d;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.p.a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BizConversationUI$BizConversationFmUI extends BaseConversationUI.BaseConversationFmUI
{
  private ak conversation;
  private int cvd;
  private TextView emptyTipTv;
  private String fuO;
  private boolean isDeleteCancel;
  private int jLX;
  private int jLY;
  private com.tencent.mm.ui.widget.b.a jMO;
  private long jOA;
  private com.tencent.mm.sdk.b.c jOJ;
  private n.d jOb;
  private String talker;
  private com.tencent.mm.ui.base.p tipDialog;
  private ListView zqO;
  private a zqP;
  private String zqQ;

  public BizConversationUI$BizConversationFmUI()
  {
    AppMethodBeat.i(34140);
    this.cvd = 1;
    this.talker = "";
    this.jOA = 0L;
    this.jLX = 0;
    this.jLY = 0;
    this.tipDialog = null;
    this.isDeleteCancel = false;
    this.jOb = new BizConversationUI.BizConversationFmUI.9(this);
    this.jOJ = new BizConversationUI.BizConversationFmUI.10(this);
    AppMethodBeat.o(34140);
  }

  public int getLayoutId()
  {
    return 2130970930;
  }

  public String getUserName()
  {
    return this.fuO;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    AppMethodBeat.i(34141);
    super.onActivityCreated(paramBundle);
    this.fuO = thisActivity().getIntent().getStringExtra("enterprise_biz_name");
    if (bo.isNullOrNil(this.fuO))
      this.fuO = "officialaccounts";
    this.cvd = thisActivity().getIntent().getIntExtra("biz_enter_source", 1);
    if (bo.nullAsNil(this.fuO).equals("officialaccounts"))
      com.tencent.mm.plugin.report.service.h.pYm.e(11404, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf((int)(System.currentTimeMillis() / 1000L)), Integer.valueOf(this.cvd) });
    this.zqQ = thisActivity().getIntent().getStringExtra("enterprise_biz_display_name");
    if (bo.isNullOrNil(this.zqQ))
      this.zqQ = getString(2131297643);
    setMMTitle(this.zqQ);
    this.zqO = ((ListView)findViewById(2131823620));
    this.emptyTipTv = ((TextView)findViewById(2131821807));
    this.emptyTipTv.setText(2131299203);
    setBackBtn(new BizConversationUI.BizConversationFmUI.13(this));
    setToTop(new BizConversationUI.BizConversationFmUI.14(this));
    this.zqP = new a(thisActivity(), this.fuO, new BizConversationUI.BizConversationFmUI.15(this));
    this.zqP.setGetViewPositionCallback(new BizConversationUI.BizConversationFmUI.16(this));
    this.zqP.setPerformItemClickListener(new BizConversationUI.BizConversationFmUI.17(this));
    this.zqO.setAdapter(this.zqP);
    this.jMO = new com.tencent.mm.ui.widget.b.a(thisActivity());
    this.zqO.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(34135);
        BizConversationUI.BizConversationFmUI.a(BizConversationUI.BizConversationFmUI.this, (ak)BizConversationUI.BizConversationFmUI.e(BizConversationUI.BizConversationFmUI.this).getItem(paramAnonymousInt));
        BizConversationUI.BizConversationFmUI.a(BizConversationUI.BizConversationFmUI.this, BizConversationUI.BizConversationFmUI.f(BizConversationUI.BizConversationFmUI.this).field_username);
        paramAnonymousAdapterView = BizConversationUI.BizConversationFmUI.f(BizConversationUI.BizConversationFmUI.this);
        if (paramAnonymousAdapterView == null)
        {
          ab.e("MicroMsg.BizConversationUI", "user should not be null. position:%d, size:%d", new Object[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(BizConversationUI.BizConversationFmUI.e(BizConversationUI.BizConversationFmUI.this).getCount()) });
          BizConversationUI.BizConversationFmUI.e(BizConversationUI.BizConversationFmUI.this).notifyDataSetChanged();
          AppMethodBeat.o(34135);
        }
        while (true)
        {
          return;
          paramAnonymousView = new Bundle();
          paramAnonymousView.putInt("biz_click_item_unread_count", BizConversationUI.BizConversationFmUI.f(BizConversationUI.BizConversationFmUI.this).field_unReadCount);
          paramAnonymousView.putInt("biz_click_item_position", paramAnonymousInt + 1);
          paramAnonymousView.putInt("KOpenArticleSceneFromScene", 131);
          paramAnonymousView.putInt("specific_chat_from_scene", 1);
          BizConversationUI.BizConversationFmUI.this.ui.startChatting(paramAnonymousAdapterView.field_username, paramAnonymousView, true);
          BizConversationUI.BizConversationFmUI.e(BizConversationUI.BizConversationFmUI.this).a(paramAnonymousAdapterView, paramAnonymousInt);
          AppMethodBeat.o(34135);
        }
      }
    });
    this.zqO.setOnTouchListener(new BizConversationUI.BizConversationFmUI.2(this));
    this.zqO.setOnItemLongClickListener(new BizConversationUI.BizConversationFmUI.3(this));
    this.zqP.setGetViewPositionCallback(new BizConversationUI.BizConversationFmUI.4(this));
    this.zqP.setPerformItemClickListener(new BizConversationUI.BizConversationFmUI.5(this));
    this.zqP.a(new BizConversationUI.BizConversationFmUI.6(this));
    if ("officialaccounts".equals(this.fuO))
    {
      paramBundle = com.tencent.mm.model.c.c.abi().ll("100045");
      if ((!paramBundle.isValid()) || (!"1".equals(paramBundle.dru().get("isOpenSearch"))))
        break label589;
    }
    label589: for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.BizConversationUI", "open search entrance:%b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
        addIconOptionMenu(1, 2131304082, 2131230741, new BizConversationUI.BizConversationFmUI.1(this));
      aw.ZK();
      com.tencent.mm.model.c.XR().a(this.zqP);
      this.jOA = System.currentTimeMillis();
      com.tencent.mm.sdk.b.a.xxA.c(this.jOJ);
      Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
      {
        public final boolean queueIdle()
        {
          AppMethodBeat.i(34128);
          Looper.myQueue().removeIdleHandler(this);
          com.tencent.mm.cj.c.aNX();
          AppMethodBeat.o(34128);
          return false;
        }
      });
      AppMethodBeat.o(34141);
      return;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(34145);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((this.talker != null) && (!this.talker.isEmpty()))
      this.talker = "";
    if (paramInt2 != -1)
      AppMethodBeat.o(34145);
    while (true)
    {
      return;
      AppMethodBeat.o(34145);
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(34146);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    aw.ZK();
    ad localad = com.tencent.mm.model.c.XM().aoO(this.talker);
    if (localad == null)
    {
      ab.e("MicroMsg.BizConversationUI", "onCreateContextMenu, contact is null, talker = " + this.talker);
      AppMethodBeat.o(34146);
      return;
    }
    String str = localad.Oj();
    paramView = str;
    if (str.toLowerCase().endsWith("@chatroom"))
    {
      paramView = str;
      if (bo.isNullOrNil(localad.field_nickname))
        paramView = getString(2131298223);
    }
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.e.j.b(thisActivity(), paramView));
    if (com.tencent.mm.n.a.jh(localad.field_type))
    {
      if (!localad.Oe())
        break label210;
      paramContextMenu.add(paramContextMenuInfo.position, 1, 0, 2131301284);
    }
    while (true)
    {
      paramContextMenu.add(paramContextMenuInfo.position, 2, 0, 2131301280);
      paramContextMenu.add(paramContextMenuInfo.position, 3, 0, 2131301288);
      AppMethodBeat.o(34146);
      break;
      label210: paramContextMenu.add(paramContextMenuInfo.position, 1, 0, 2131298732);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(34142);
    aw.RS().aa(new BizConversationUI.BizConversationFmUI.12(this));
    com.tencent.mm.sdk.b.a.xxA.d(this.jOJ);
    if (aw.RK())
    {
      aw.ZK();
      com.tencent.mm.model.c.XR().b(this.zqP);
    }
    if (this.zqP != null)
      this.zqP.onDestroy();
    super.onDestroy();
    AppMethodBeat.o(34142);
  }

  public void onPause()
  {
    AppMethodBeat.i(34144);
    ab.i("MicroMsg.BizConversationUI", "on pause");
    aw.ZK();
    com.tencent.mm.model.c.XR().apb(this.fuO);
    if (this.zqP != null)
      this.zqP.onPause();
    super.onPause();
    AppMethodBeat.o(34144);
  }

  public void onResume()
  {
    AppMethodBeat.i(34143);
    ab.v("MicroMsg.BizConversationUI", "on resume");
    if (this.zqP != null)
      this.zqP.onResume();
    super.onResume();
    AppMethodBeat.o(34143);
  }

  static final class a extends e
  {
    private String cIe;
    HashMap<String, BizConversationUI.BizConversationFmUI.b> jOf;

    public a(Context paramContext, String paramString, p.a parama)
    {
      super(parama);
      AppMethodBeat.i(34136);
      this.cIe = paramString;
      this.jOf = new HashMap();
      AppMethodBeat.o(34136);
    }

    public final void KC()
    {
      AppMethodBeat.i(34137);
      aw.ZK();
      setCursor(com.tencent.mm.model.c.XR().c(t.fkP, this.elZ, this.cIe));
      if (this.yle != null)
        this.yle.apt();
      super.notifyDataSetChanged();
      AppMethodBeat.o(34137);
    }

    public final void a(ak paramak, int paramInt)
    {
      AppMethodBeat.i(34139);
      aw.ZK();
      a(paramak, com.tencent.mm.model.c.XR().g(paramak), paramInt, true);
      AppMethodBeat.o(34139);
    }

    protected final void a(ak paramak, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
    {
      AppMethodBeat.i(34138);
      if (paramak == null)
      {
        AppMethodBeat.o(34138);
        return;
      }
      BizConversationUI.BizConversationFmUI.b localb = (BizConversationUI.BizConversationFmUI.b)this.jOf.get(paramak.field_username);
      if (localb == null)
      {
        localb = new BizConversationUI.BizConversationFmUI.b((byte)0);
        this.jOf.put(paramak.field_username, localb);
      }
      while (true)
      {
        while (true)
        {
          if (localb.fPZ > 0)
          {
            AppMethodBeat.o(34138);
            break;
          }
          localb.wTL = paramBoolean1;
          if ((localb.wTO) || (paramak.field_unReadCount > 0));
          for (paramBoolean1 = true; ; paramBoolean1 = false)
          {
            localb.wTO = paramBoolean1;
            localb.ndr = (paramInt + 1);
            if (paramBoolean2)
              localb.fPZ = localb.ndr;
            localb.wTN = ((int)(System.currentTimeMillis() / 1000L));
            if (paramak.field_lastSeq != localb.wYf)
              break label167;
            AppMethodBeat.o(34138);
            break;
          }
          label167: localb.wYf = paramak.field_lastSeq;
          paramak = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rb(paramak.field_username);
          if ((paramak != null) && (paramak.drC()))
          {
            paramak = ((com.tencent.mm.plugin.biz.a.a)g.K(com.tencent.mm.plugin.biz.a.a.class)).b(paramak.field_msgId, paramak.field_content);
            if ((paramak != null) && (!bo.ek(paramak.fjr)) && (!bo.isNullOrNil(((com.tencent.mm.af.p)paramak.fjr.get(0)).url)))
              try
              {
                paramak = Uri.parse(((com.tencent.mm.af.p)paramak.fjr.get(0)).url);
                localb.wTJ = bo.getLong(paramak.getQueryParameter("mid"), 0L);
                localb.wTK = bo.getInt(paramak.getQueryParameter("idx"), 0);
                AppMethodBeat.o(34138);
              }
              catch (UnsupportedOperationException paramak)
              {
                ab.w("MicroMsg.ConversationAdapter", "exposeLog exp %s", new Object[] { paramak.getMessage() });
                AppMethodBeat.o(34138);
              }
              catch (Exception paramak)
              {
                ab.w("MicroMsg.ConversationAdapter", "exposeLog exp %s", new Object[] { paramak.getMessage() });
              }
          }
        }
        AppMethodBeat.o(34138);
        break;
      }
    }
  }

  static final class b extends brm
  {
    public int fPZ = -1;
    public long wYf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BizConversationUI.BizConversationFmUI
 * JD-Core Version:    0.6.2
 */