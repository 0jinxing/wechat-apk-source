package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.t;
import com.tencent.mm.openim.PluginOpenIM;
import com.tencent.mm.openim.b.i;
import com.tencent.mm.openim.e.e;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;
import java.util.List;

public class SeeAccessVerifyInfoUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private u eih;
  private boolean elA = false;
  private boolean elB = false;
  private SeeAccessVerifyInfoUI.b eld;
  private String ele;
  private String elf;
  private String elg;
  private String elh;
  private String eli;
  private String elj;
  private String elk;
  private String ell;
  private String elm;
  private long eln;
  private long elo;
  private String elp;
  private String elq;
  private String elr;
  private TextView els;
  private TextView elt;
  private ImageView elu;
  private TextView elv;
  private TextView elw;
  private TextView elx;
  private GridView ely;
  private boolean elz = false;
  private com.tencent.mm.ui.base.p tipDialog;

  private SpannableString a(String paramString, TextView paramTextView)
  {
    String str = null;
    AppMethodBeat.i(104278);
    if (paramTextView == null)
      AppMethodBeat.o(104278);
    ad localad;
    for (paramString = str; ; paramString = str)
    {
      return paramString;
      localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(bo.nullAsNil(paramString));
      if (localad != null)
        break;
      ab.w("MicroMsg.SeeAccessVerifyInfoUI", "ct == null");
      AppMethodBeat.o(104278);
    }
    if (!bo.isNullOrNil(localad.field_conRemark))
      paramString = localad.field_conRemark;
    while (true)
    {
      str = paramString;
      if (bo.isNullOrNil(paramString))
        str = localad.field_conRemark;
      paramString = str;
      if (bo.isNullOrNil(str))
        paramString = localad.Oi();
      paramString = com.tencent.mm.pluginsdk.ui.e.j.b(this, bo.nullAsNil(paramString), paramTextView.getTextSize());
      AppMethodBeat.o(104278);
      break;
      if (this.eih != null)
        paramString = this.eih.mJ(paramString);
      else
        paramString = null;
    }
  }

  protected final SeeAccessVerifyInfoUI.c cd(View paramView)
  {
    AppMethodBeat.i(104279);
    SeeAccessVerifyInfoUI.c localc = new SeeAccessVerifyInfoUI.c(this);
    localc.ejo = ((ImageView)paramView.findViewById(2131827163));
    localc.elJ = ((TextView)paramView.findViewById(2131827168));
    localc.elK = ((TextView)paramView.findViewById(2131827169));
    AppMethodBeat.o(104279);
    return localc;
  }

  public final int getLayoutId()
  {
    return 2130970580;
  }

  public final void initView()
  {
    AppMethodBeat.i(104276);
    this.els = ((TextView)findViewById(2131827300));
    this.elt = ((TextView)findViewById(2131827301));
    this.elv = ((TextView)findViewById(2131827168));
    this.elw = ((TextView)findViewById(2131827169));
    this.elu = ((ImageView)findViewById(2131827163));
    this.elx = ((TextView)findViewById(2131827303));
    this.ely = ((GridView)findViewById(2131827302));
    this.ely.setAdapter(this.eld);
    if (this.elu != null)
      this.elu.setOnClickListener(new SeeAccessVerifyInfoUI.2(this));
    this.ely.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        return true;
      }
    });
    this.ely.postDelayed(new SeeAccessVerifyInfoUI.4(this), 100L);
    if (this.elu != null)
      a.b.b(this.elu, bo.nullAsNil(this.elk));
    if (this.elv != null)
      this.elv.setText(a(bo.nullAsNil(this.elk), this.elv));
    e locale;
    if (this.elw != null)
    {
      if ((!t.mP(this.elp)) || (!ad.aox(this.elk)))
        break label645;
      locale = new e();
      locale.field_appid = this.ell;
      locale.field_wordingId = this.elm;
      locale.field_language = aa.gw(ah.getContext());
      g.RQ();
      ((PluginOpenIM)g.M(PluginOpenIM.class)).getWordingInfoStg().b(locale, new String[] { "appid", "wordingId", "language" });
      if (TextUtils.isEmpty(locale.field_wording))
        break label565;
      this.elw.setVisibility(0);
      this.elw.setText("＠" + locale.field_wording);
    }
    while (true)
    {
      if (this.els != null)
        this.els.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, bo.nullAsNil(this.elj)));
      if ((this.elt != null) && (!bo.isNullOrNil(this.elq)))
        this.elt.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, "\"" + bo.nullAsNil(this.elq) + "\""));
      if (this.elx != null)
        this.elx.setOnClickListener(new SeeAccessVerifyInfoUI.5(this));
      if ((this.elx != null) && (((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(this.eln).dtS()))
      {
        this.elx.setBackgroundResource(2130838002);
        this.elx.setTextColor(getResources().getColor(2131690149));
        this.elx.setText(getString(2131300517));
        this.elx.setEnabled(false);
      }
      AppMethodBeat.o(104276);
      return;
      label565: if ((!bo.isNullOrNil(this.elm)) && (!bo.isNullOrNil(this.ell)))
      {
        this.elB = true;
        LinkedList localLinkedList = new LinkedList();
        localLinkedList.add(this.elm);
        g.RO().eJo.a(new i(this.ell, locale.field_language, localLinkedList), 0);
      }
      this.elw.setVisibility(4);
      continue;
      label645: this.elw.setVisibility(8);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104273);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.SeeAccessVerifyInfoUI", "[onCreate]");
    setMMTitle(getString(2131296385));
    this.eln = getIntent().getLongExtra("msgLocalId", 0L);
    this.elo = getIntent().getLongExtra("msgSvrId", 0L);
    this.elj = getIntent().getStringExtra("invitertitle");
    this.elk = getIntent().getStringExtra("inviterusername");
    this.ell = getIntent().getStringExtra("inviterappid");
    this.elm = getIntent().getStringExtra("inviterdescid");
    this.elp = getIntent().getStringExtra("chatroom");
    this.elq = getIntent().getStringExtra("invitationreason");
    this.elr = getIntent().getStringExtra("ticket");
    this.elf = getIntent().getStringExtra("username");
    this.ele = getIntent().getStringExtra("nickname");
    this.elg = getIntent().getStringExtra("descid");
    this.elh = getIntent().getStringExtra("appid");
    this.eli = getIntent().getStringExtra("headimgurl");
    this.eih = ((c)g.K(c.class)).XV().ob(bo.nullAsNil(this.elp));
    this.eld = new SeeAccessVerifyInfoUI.b(this, this);
    paramBundle = this.elf.split(",");
    if ((paramBundle != null) && (paramBundle.length > 0))
    {
      paramBundle = paramBundle[0];
      ab.i("MicroMsg.SeeAccessVerifyInfoUI", "[%s] has been in chatroom![%s]", new Object[] { paramBundle, this.elp });
      if ((this.eih.afg() != null) && (this.eih.afg().contains(paramBundle)))
      {
        paramBundle = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(this.eln);
        if (!paramBundle.dtS())
        {
          paramBundle.dtQ();
          ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(this.eln, paramBundle);
        }
      }
    }
    initView();
    setBackBtn(new SeeAccessVerifyInfoUI.1(this));
    AppMethodBeat.o(104273);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104275);
    super.onDestroy();
    g.RO().eJo.b(453, this);
    AppMethodBeat.o(104275);
  }

  public void onResume()
  {
    AppMethodBeat.i(104274);
    ab.i("MicroMsg.SeeAccessVerifyInfoUI", "[onResume]");
    g.RO().eJo.a(453, this);
    super.onResume();
    AppMethodBeat.o(104274);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(104277);
    if (((paramm instanceof i)) && (paramInt1 == 0) && (paramInt2 == 0))
      if ((this.elB) && (bo.ac(this.elw.getText())))
      {
        this.elB = false;
        paramString = new e();
        paramString.field_appid = this.ell;
        paramString.field_wordingId = this.elm;
        paramString.field_language = aa.gw(ah.getContext());
        g.RQ();
        ((PluginOpenIM)g.M(PluginOpenIM.class)).getWordingInfoStg().b(paramString, new String[] { "appid", "wordingId", "language" });
        if (TextUtils.isEmpty(paramString.field_wording))
          break label190;
        this.elw.setVisibility(0);
        this.elw.setText("＠" + paramString.field_wording);
      }
    while (true)
    {
      if (this.elA)
        this.eld.notifyDataSetChanged();
      AppMethodBeat.o(104277);
      return;
      label190: if ((!bo.isNullOrNil(this.elm)) && (!bo.isNullOrNil(this.ell)))
      {
        paramm = new LinkedList();
        paramm.add(this.elm);
        g.RO().eJo.a(new i(this.ell, paramString.field_language, paramm), 0);
      }
      this.elw.setVisibility(4);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI
 * JD-Core Version:    0.6.2
 */