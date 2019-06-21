package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.c.a;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bbo;
import com.tencent.mm.protocal.protobuf.bos;
import com.tencent.mm.protocal.protobuf.cfr;
import com.tencent.mm.protocal.protobuf.cfs;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.k;
import com.tencent.mm.ui.v;
import java.util.HashMap;
import java.util.LinkedList;

public class EnterpriseConversationUI extends BaseConversationUI
{
  private View contentView;

  public void finish()
  {
    AppMethodBeat.i(34458);
    if ((this.conversationFm != null) && ((this.conversationFm instanceof EnterpriseConversationFmUI)))
      ((EnterpriseConversationFmUI)this.conversationFm).fRR = (System.currentTimeMillis() / 1000L);
    super.finish();
    AppMethodBeat.o(34458);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(34457);
    super.onCreate(paramBundle);
    this.contentView = v.hu(this).inflate(2130968881, null);
    setContentView(this.contentView);
    this.conversationFm = new EnterpriseConversationFmUI();
    getSupportFragmentManager().beginTransaction().a(2131821892, this.conversationFm).commit();
    com.tencent.mm.pluginsdk.f.a(this, this.contentView);
    AppMethodBeat.o(34457);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public static class EnterpriseConversationFmUI extends BaseConversationUI.BaseConversationFmUI
    implements com.tencent.mm.ai.f, n.b
  {
    private com.tencent.mm.ui.tools.j contextMenuHelper;
    private long edh;
    private TextView emptyTipTv;
    long fRR;
    private int fromScene;
    private String fuO;
    private boolean isDeleteCancel;
    private String jMa;
    private n.d jOb;
    private long jrh;
    private com.tencent.mm.ui.base.p tipDialog;
    private LinearLayout yEi;
    private int yEl;
    private c.a yEo;
    private ListView zqO;
    private String zqQ;
    private k zum;
    private View zun;
    private i zuo;
    private String zup;
    private com.tencent.mm.sdk.platformtools.ak zuq;
    private int zur;
    private String zus;

    public EnterpriseConversationFmUI()
    {
      AppMethodBeat.i(34439);
      this.yEi = null;
      this.zun = null;
      this.zup = null;
      this.jMa = "";
      this.yEl = 0;
      this.isDeleteCancel = false;
      this.edh = 0L;
      this.fRR = 0L;
      this.zur = -2;
      this.jrh = 0L;
      this.zus = null;
      this.yEo = new EnterpriseConversationUI.EnterpriseConversationFmUI.10(this);
      AppMethodBeat.o(34439);
    }

    private void dAK()
    {
      AppMethodBeat.i(34445);
      this.yEl = com.tencent.mm.ui.g.bK(getContext(), this.fuO);
      TextView localTextView;
      if ((this.yEl == 2) && (this.yEi == null))
      {
        this.yEi = ((LinearLayout)findViewById(2131823622));
        Object localObject = this.yEi.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = com.tencent.mm.bz.a.al(getContext(), 2131427567);
        this.yEi.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.zun = v.hu(getContext()).inflate(2130969404, this.yEi, false);
        float f = com.tencent.mm.bz.a.dm(getContext());
        localObject = (ImageView)this.zun.findViewById(2131821226);
        int i = ((ImageView)localObject).getLayoutParams().height;
        ((ImageView)localObject).getLayoutParams().height = ((int)(i * f));
        ((ImageView)localObject).getLayoutParams().width = ((int)(f * i));
        ((ImageView)localObject).requestLayout();
        localTextView = (TextView)this.zun.findViewById(2131821185);
        localObject = z.afa().qC(this.fuO);
        z.afa();
        z.afa();
        String str = com.tencent.mm.aj.c.lb(0);
        if ((localObject != null) && (!((com.tencent.mm.aj.b)localObject).field_chatOpen) && (!((com.tencent.mm.aj.b)localObject).field_use_preset_banner_tips) && (str != null))
        {
          localTextView.setText(str);
          com.tencent.mm.ui.g.at(this.fuO, 1, 2);
          this.yEi.addView(this.zun);
          this.zun.setOnClickListener(new EnterpriseConversationUI.EnterpriseConversationFmUI.13(this));
          com.tencent.mm.ui.g.t(getContext(), this.fuO, 3);
          com.tencent.mm.ui.g.bL(getContext(), this.fuO);
        }
      }
      else
      {
        if (this.yEi == null)
          break label342;
        if (this.yEl != 2)
          break label333;
        this.yEi.setVisibility(0);
        dIM();
        AppMethodBeat.o(34445);
      }
      while (true)
      {
        return;
        localTextView.setText(2131299239);
        break;
        label333: this.yEi.setVisibility(8);
        label342: AppMethodBeat.o(34445);
      }
    }

    private void dIM()
    {
      AppMethodBeat.i(34446);
      com.tencent.mm.aj.b localb = z.afa().qC(this.fuO);
      int i;
      int j;
      label35: long l1;
      if (localb != null)
      {
        i = localb.field_qyUin;
        if (localb == null)
          break label184;
        j = localb.field_userUin;
        if (localb == null)
          break label189;
        l1 = localb.field_wwCorpId;
        label45: if (localb == null)
          break label195;
      }
      label184: label189: label195: for (long l2 = localb.field_wwUserVid; ; l2 = 0L)
      {
        h.pYm.e(13656, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(6), Integer.valueOf(3), Long.valueOf(l1), Long.valueOf(l2) });
        ab.d("MicroMsg.EnterpriseConversationUI", "expose wework btn on session list  report: %s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(6), Integer.valueOf(3), Long.valueOf(l1), Long.valueOf(l2) });
        AppMethodBeat.o(34446);
        return;
        i = 0;
        break;
        j = 0;
        break label35;
        l1 = 0L;
        break label45;
      }
    }

    public final void a(int paramInt, n paramn, Object paramObject)
    {
    }

    public int getLayoutId()
    {
      return 2130969403;
    }

    public String getUserName()
    {
      return this.fuO;
    }

    public void onActivityCreated(Bundle paramBundle)
    {
      AppMethodBeat.i(34440);
      super.onActivityCreated(paramBundle);
      this.fuO = thisActivity().getIntent().getStringExtra("enterprise_biz_name");
      this.zqQ = thisActivity().getIntent().getStringExtra("enterprise_biz_display_name");
      this.fromScene = thisActivity().getIntent().getIntExtra("enterprise_from_scene", 5);
      setMMTitle(this.zqQ);
      this.zqO = ((ListView)findViewById(2131823620));
      this.emptyTipTv = ((TextView)findViewById(2131821807));
      this.emptyTipTv.setText(2131299222);
      setBackBtn(new EnterpriseConversationUI.EnterpriseConversationFmUI.1(this));
      setToTop(new EnterpriseConversationUI.EnterpriseConversationFmUI.11(this));
      if (com.tencent.mm.aj.f.qX(this.fuO) != null)
      {
        dAK();
        if (this.fuO != null)
        {
          paramBundle = new EnterpriseConversationUI.EnterpriseConversationFmUI.12(this);
          z.afa();
          com.tencent.mm.aj.c.a(this.fuO, paramBundle);
          ab.e("MicroMsg.EnterpriseConversationUI", "update father attr from svr bizName:%s", new Object[] { this.fuO });
          addIconOptionMenu(1, 2131304082, 2131230741, new EnterpriseConversationUI.EnterpriseConversationFmUI.14(this));
          addIconOptionMenu(2, 2131296397, 2131230736, new EnterpriseConversationUI.EnterpriseConversationFmUI.15(this));
          this.zuo = new i(thisActivity(), this.fuO, new EnterpriseConversationUI.EnterpriseConversationFmUI.16(this));
          this.zuo.setGetViewPositionCallback(new EnterpriseConversationUI.EnterpriseConversationFmUI.17(this));
          this.zuo.setPerformItemClickListener(new EnterpriseConversationUI.EnterpriseConversationFmUI.18(this));
          this.zuo.a(new EnterpriseConversationUI.EnterpriseConversationFmUI.2(this));
          this.zqO.setAdapter(this.zuo);
          this.zqO.setOnItemClickListener(new EnterpriseConversationUI.EnterpriseConversationFmUI.3(this));
          this.contextMenuHelper = new com.tencent.mm.ui.tools.j(thisActivity());
          this.jOb = new EnterpriseConversationUI.EnterpriseConversationFmUI.4(this);
          this.zqO.setOnItemLongClickListener(new EnterpriseConversationUI.EnterpriseConversationFmUI.5(this));
        }
      }
      else
      {
        this.edh = (System.currentTimeMillis() / 1000L);
        aw.ZK();
        paramBundle = com.tencent.mm.model.c.XR().aoZ(this.fuO);
        if (paramBundle != null)
        {
          this.zur = paramBundle.field_unReadCount;
          if ((this.zur == 0) && (paramBundle.field_unReadMuteCount > 0))
            this.zur = -1;
          this.jrh = (paramBundle.field_conversationTime / 1000L);
          if (paramBundle.field_isSend != 1)
            break label558;
          paramBundle = null;
          label454: this.zus = paramBundle;
        }
        z.afa().a(this.yEo, thisActivity().getMainLooper());
        aw.ZK();
        com.tencent.mm.model.c.XR().a(this);
        aw.ZK();
        com.tencent.mm.model.c.XM().a(this);
        if (this.zuo != null)
        {
          if (this.zuq != null)
            break label566;
          this.zuq = new com.tencent.mm.sdk.platformtools.ak()
          {
            public final void handleMessage(Message paramAnonymousMessage)
            {
              AppMethodBeat.i(34427);
              int i;
              LinkedList localLinkedList;
              int j;
              int k;
              int m;
              int n;
              com.tencent.mm.storage.ak localak;
              Object localObject;
              int i1;
              if ((paramAnonymousMessage != null) && (paramAnonymousMessage.what == 1) && (EnterpriseConversationUI.EnterpriseConversationFmUI.this.thisActivity() != null) && (!EnterpriseConversationUI.EnterpriseConversationFmUI.this.thisActivity().isFinishing()))
              {
                i = EnterpriseConversationUI.EnterpriseConversationFmUI.f(EnterpriseConversationUI.EnterpriseConversationFmUI.this).getCount();
                localLinkedList = new LinkedList();
                paramAnonymousMessage = new LinkedList();
                j = 0;
                k = 0;
                m = 0;
                n = 0;
                if (n < i)
                {
                  localak = (com.tencent.mm.storage.ak)EnterpriseConversationUI.EnterpriseConversationFmUI.f(EnterpriseConversationUI.EnterpriseConversationFmUI.this).getItem(n);
                  if (localak == null)
                    break label906;
                  localObject = localak.field_username;
                  if (localObject == null)
                    break label906;
                  if ((!t.mY((String)localObject)) || (!com.tencent.mm.aj.f.re((String)localObject)))
                  {
                    ab.d("MicroMsg.EnterpriseConversationUI", "checkEnterpriseChildConv delete conv %s", new Object[] { localObject });
                    localLinkedList.add(localObject);
                    i1 = m;
                    m = k;
                    k = i1;
                  }
                }
              }
              while (true)
              {
                i1 = n + 1;
                n = m;
                m = k;
                k = n;
                n = i1;
                break;
                ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO((String)localObject);
                boolean bool = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().aph((String)localObject);
                if ((localad != null) && ((localad.field_type & 0x800) != 0))
                {
                  i1 = 1;
                  label259: if ((i1 == 0) || (bool))
                    break label352;
                  ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().apf((String)localObject);
                }
                while (true)
                {
                  if (com.tencent.mm.aj.f.rd((String)localObject))
                    paramAnonymousMessage.add(localObject);
                  if (localak.field_unReadCount <= 0)
                    break label906;
                  if (!t.nN((String)localObject))
                    break label386;
                  i1 = j + 1;
                  j = m;
                  m = k;
                  k = j;
                  j = i1;
                  break;
                  i1 = 0;
                  break label259;
                  label352: if ((i1 == 0) && (bool))
                    ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().apg((String)localObject);
                }
                label386: i1 = k + 1;
                k = localak.field_unReadCount + m;
                m = i1;
                continue;
                localObject = z.afa().qC(EnterpriseConversationUI.EnterpriseConversationFmUI.c(EnterpriseConversationUI.EnterpriseConversationFmUI.this));
                long l1;
                if (localObject != null)
                {
                  n = ((com.tencent.mm.aj.b)localObject).field_qyUin;
                  if (localObject == null)
                    break label888;
                  l1 = ((com.tencent.mm.aj.b)localObject).field_wwCorpId;
                  label448: if (localObject == null)
                    break label894;
                }
                label888: label894: for (long l2 = ((com.tencent.mm.aj.b)localObject).field_wwUserVid; ; l2 = 0L)
                {
                  i1 = 0;
                  if (!bo.isNullOrNil(EnterpriseConversationUI.EnterpriseConversationFmUI.l(EnterpriseConversationUI.EnterpriseConversationFmUI.this)))
                    i1 = z.afa().qE(EnterpriseConversationUI.EnterpriseConversationFmUI.l(EnterpriseConversationUI.EnterpriseConversationFmUI.this));
                  h.pYm.e(12892, new Object[] { EnterpriseConversationUI.EnterpriseConversationFmUI.c(EnterpriseConversationUI.EnterpriseConversationFmUI.this), Integer.valueOf(EnterpriseConversationUI.EnterpriseConversationFmUI.m(EnterpriseConversationUI.EnterpriseConversationFmUI.this)), Integer.valueOf(i), "", Integer.valueOf(EnterpriseConversationUI.EnterpriseConversationFmUI.n(EnterpriseConversationUI.EnterpriseConversationFmUI.this)), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(EnterpriseConversationUI.EnterpriseConversationFmUI.o(EnterpriseConversationUI.EnterpriseConversationFmUI.this)), Integer.valueOf(i1), Integer.valueOf(n), Long.valueOf(l1), Long.valueOf(l2) });
                  ab.d("MicroMsg.EnterpriseConversationUI", "enter biz enterprise father report: %s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { EnterpriseConversationUI.EnterpriseConversationFmUI.c(EnterpriseConversationUI.EnterpriseConversationFmUI.this), Integer.valueOf(EnterpriseConversationUI.EnterpriseConversationFmUI.m(EnterpriseConversationUI.EnterpriseConversationFmUI.this)), Integer.valueOf(i), "", Integer.valueOf(EnterpriseConversationUI.EnterpriseConversationFmUI.n(EnterpriseConversationUI.EnterpriseConversationFmUI.this)), Integer.valueOf(m), Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(EnterpriseConversationUI.EnterpriseConversationFmUI.o(EnterpriseConversationUI.EnterpriseConversationFmUI.this)), Integer.valueOf(i1), Integer.valueOf(n), Long.valueOf(l1), Long.valueOf(l2) });
                  if (localLinkedList.size() > 0)
                  {
                    aw.ZK();
                    com.tencent.mm.model.c.XR().aF(localLinkedList);
                    EnterpriseConversationUI.EnterpriseConversationFmUI.f(EnterpriseConversationUI.EnterpriseConversationFmUI.this).KC();
                  }
                  if (z.afd().qB(EnterpriseConversationUI.EnterpriseConversationFmUI.c(EnterpriseConversationUI.EnterpriseConversationFmUI.this)))
                  {
                    z.afa();
                    com.tencent.mm.aj.c.a(EnterpriseConversationUI.EnterpriseConversationFmUI.c(EnterpriseConversationUI.EnterpriseConversationFmUI.this), null);
                  }
                  z.afd().qB(EnterpriseConversationUI.EnterpriseConversationFmUI.p(EnterpriseConversationUI.EnterpriseConversationFmUI.this));
                  if (paramAnonymousMessage.size() <= 0)
                    break label900;
                  for (k = 0; k < paramAnonymousMessage.size(); k++)
                    z.afd().qB((String)paramAnonymousMessage.get(k));
                  n = 0;
                  break;
                  l1 = 0L;
                  break label448;
                }
                label900: AppMethodBeat.o(34427);
                return;
                label906: i1 = k;
                k = m;
                m = i1;
              }
            }
          };
        }
      }
      while (true)
      {
        this.zuq.sendEmptyMessageDelayed(1, 500L);
        AppMethodBeat.o(34440);
        return;
        ab.e("MicroMsg.EnterpriseConversationUI", "bizName is null!!!");
        break;
        label558: paramBundle = paramBundle.field_digestUser;
        break label454;
        label566: this.zuq.removeMessages(1);
      }
    }

    public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    {
      AppMethodBeat.i(34444);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(34444);
      case 1:
      }
      while (true)
      {
        return;
        if ((paramInt2 == -1) && (paramIntent != null))
        {
          String str1 = paramIntent.getStringExtra("be_send_card_name");
          String str2 = paramIntent.getStringExtra("received_card_name");
          boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
          paramIntent = paramIntent.getStringExtra("custom_send_text");
          com.tencent.mm.plugin.messenger.a.g.bOk().q(str1, str2, bool);
          com.tencent.mm.plugin.messenger.a.g.bOk().eZ(paramIntent, str2);
          com.tencent.mm.ui.widget.snackbar.b.i(thisActivity(), getContext().getString(2131299884));
          AppMethodBeat.o(34444);
        }
        else
        {
          AppMethodBeat.o(34444);
        }
      }
    }

    public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
    {
      AppMethodBeat.i(34448);
      super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
      aw.ZK();
      ad localad = com.tencent.mm.model.c.XM().aoO(this.jMa);
      if (localad == null)
      {
        ab.e("MicroMsg.EnterpriseConversationUI", "onCreateContextMenu, contact is null, talker = " + this.jMa);
        AppMethodBeat.o(34448);
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
      if (localad.Oe())
        paramContextMenu.add(paramContextMenuInfo.position, 3, 0, 2131301284);
      while (true)
      {
        paramContextMenu.add(paramContextMenuInfo.position, 2, 1, 2131299226);
        paramContextMenu.add(paramContextMenuInfo.position, 1, 2, 2131301288);
        AppMethodBeat.o(34448);
        break;
        paramContextMenu.add(paramContextMenuInfo.position, 3, 0, 2131299233);
      }
    }

    public void onDestroy()
    {
      AppMethodBeat.i(34441);
      z.afa().a(this.yEo);
      if (aw.RK())
      {
        aw.ZK();
        com.tencent.mm.model.c.XR().b(this);
        aw.ZK();
        com.tencent.mm.model.c.XM().b(this);
      }
      if (this.zuo != null)
      {
        localObject = this.zuo;
        ((i)localObject).zrC.stopTimer();
        if (((i)localObject).yDY != null)
        {
          ((i)localObject).yDY.clear();
          ((i)localObject).yDY = null;
        }
        ((i)localObject).bIf();
        ((i)localObject).dww();
        aw.ZK();
        com.tencent.mm.model.c.XR().b((n.b)localObject);
      }
      aw.Rg().b(1394, this);
      if ((this.edh <= 0L) || (this.fRR <= 0L))
      {
        super.onDestroy();
        AppMethodBeat.o(34441);
        return;
      }
      long l = this.fRR - this.edh;
      Object localObject = z.afa().qC(this.fuO);
      int i;
      if (localObject != null)
      {
        i = ((com.tencent.mm.aj.b)localObject).field_qyUin;
        label177: if (localObject == null)
          break label301;
      }
      label301: for (int j = ((com.tencent.mm.aj.b)localObject).field_userUin; ; j = 0)
      {
        h.pYm.e(13465, new Object[] { "", Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(1), Long.valueOf(l) });
        ab.d("MicroMsg.EnterpriseConversationUI", "quit biz enterprise father report: %s,%s,%s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(1), Long.valueOf(l) });
        break;
        i = 0;
        break label177;
      }
    }

    public void onPause()
    {
      AppMethodBeat.i(34443);
      ab.v("MicroMsg.EnterpriseConversationUI", "on pause");
      aw.ZK();
      com.tencent.mm.model.c.XR().apb(this.fuO);
      if (this.zuo != null)
        this.zuo.onPause();
      super.onPause();
      AppMethodBeat.o(34443);
    }

    public void onResume()
    {
      AppMethodBeat.i(34442);
      ab.v("MicroMsg.EnterpriseConversationUI", "on resume");
      if (this.zuo != null)
        this.zuo.onResume();
      super.onResume();
      if (!t.mY(this.fuO))
        finish();
      AppMethodBeat.o(34442);
    }

    public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
    {
      AppMethodBeat.i(34447);
      if ((this.tipDialog != null) && (this.tipDialog.isShowing()))
        this.tipDialog.dismiss();
      if ((paramInt1 != 0) || (paramInt2 != 0))
        AppMethodBeat.o(34447);
      while (true)
      {
        return;
        if (paramm.getType() == 1394)
        {
          paramString = ((com.tencent.mm.plugin.profile.b.d)paramm).caz();
          Object localObject = ((com.tencent.mm.plugin.profile.b.d)paramm).cay();
          if ((localObject == null) || (((cfs)localObject).vNh == null) || (((cfs)localObject).vNh.ret != 0))
          {
            if ((localObject != null) && (((cfs)localObject).vNh != null))
            {
              ab.w("MicroMsg.EnterpriseConversationUI", "chuangchen onSceneEnd type:%s, err:code:%s", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(((cfs)localObject).vNh.ret) });
              AppMethodBeat.o(34447);
            }
            else
            {
              ab.w("MicroMsg.EnterpriseConversationUI", "chuangchen onSceneEnd type:%s, err:resp == null", new Object[] { Integer.valueOf(paramm.getType()) });
              AppMethodBeat.o(34447);
            }
          }
          else if (!paramString.xeS)
          {
            AppMethodBeat.o(34447);
          }
          else
          {
            localObject = com.tencent.mm.aj.f.qX(paramString.vNb);
            ((com.tencent.mm.aj.d)localObject).field_brandFlag |= 1;
            paramm = new bbo();
            paramm.gvb = ((com.tencent.mm.aj.d)localObject).field_brandFlag;
            paramm.jBB = paramString.vNb;
            aw.ZK();
            com.tencent.mm.model.c.XL().c(new j.a(47, paramm));
            z.aeR().c((com.tencent.mm.sdk.e.c)localObject, new String[0]);
            aw.ZK();
            com.tencent.mm.model.c.XR().aoX(((com.tencent.mm.aj.d)localObject).field_username);
            aw.ZK();
            if (com.tencent.mm.model.c.XR().apl(((com.tencent.mm.aj.d)localObject).field_enterpriseFather) <= 0)
            {
              aw.ZK();
              com.tencent.mm.model.c.XR().aoX(((com.tencent.mm.aj.d)localObject).field_enterpriseFather);
              AppMethodBeat.o(34447);
            }
            else
            {
              aw.ZK();
              com.tencent.mm.model.c.XQ().aoj(((com.tencent.mm.aj.d)localObject).field_enterpriseFather);
            }
          }
        }
        else
        {
          AppMethodBeat.o(34447);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.EnterpriseConversationUI
 * JD-Core Version:    0.6.2
 */