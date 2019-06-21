package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.f;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.o;

public class CommonChatroomInfoUI extends MMBaseSelectContactUI
{
  private ad ehM;
  private a pld;
  private b ple;

  public final void Kh()
  {
    AppMethodBeat.i(23324);
    super.Kh();
    String str = getIntent().getStringExtra("Select_Talker_Name");
    aw.ZK();
    this.ehM = c.XM().aoO(str);
    AppMethodBeat.o(23324);
  }

  public final m aoA()
  {
    AppMethodBeat.i(23328);
    if (this.ple == null)
      this.ple = new b(this, this.scene, this.ehM);
    b localb = this.ple;
    AppMethodBeat.o(23328);
    return localb;
  }

  public final boolean aow()
  {
    return true;
  }

  public final boolean aox()
  {
    return false;
  }

  public final String aoy()
  {
    AppMethodBeat.i(23326);
    String str;
    if (this.ehM.dtS == 1)
    {
      str = getString(2131298495);
      AppMethodBeat.o(23326);
    }
    while (true)
    {
      return str;
      if (this.ehM.dtS == 2)
      {
        str = getString(2131298494);
        AppMethodBeat.o(23326);
      }
      else
      {
        str = getString(2131298499);
        AppMethodBeat.o(23326);
      }
    }
  }

  public final o aoz()
  {
    AppMethodBeat.i(23327);
    if (this.pld == null)
      this.pld = new a(this, this.scene, this.ehM);
    a locala = this.pld;
    AppMethodBeat.o(23327);
    return locala;
  }

  public final void initView()
  {
    AppMethodBeat.i(23325);
    super.initView();
    a locala = this.pld;
    i locali = new i();
    locali.query = locala.ehM.field_username;
    locali.mEw = locala;
    locali.handler = locala.handler;
    locali.hbo = 6;
    locali.mEv = new a.a((byte)0);
    ((n)g.M(n.class)).search(2, locali);
    AppMethodBeat.o(23325);
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(23329);
    f localf = (f)getContentLV().getAdapter().getItem(paramInt);
    if (localf != null)
      d.f(this, ".ui.chatting.ChattingUI", new Intent().putExtra("Chat_User", localf.ehM.field_username).putExtra("finish_direct", true));
    AppMethodBeat.o(23329);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.CommonChatroomInfoUI
 * JD-Core Version:    0.6.2
 */