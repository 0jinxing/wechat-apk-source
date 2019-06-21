package com.tencent.mm.plugin.masssend.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.c;
import com.tencent.mm.ui.contact.c.a;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.q;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MassSendSelectContactUI extends MMBaseSelectContactUI
{
  private List<String> elZ;
  private HashSet<String> gnG;
  private Button opm;
  private boolean opn;
  private MultiSelectContactView opo;

  private void yu(int paramInt)
  {
    AppMethodBeat.i(22879);
    if (paramInt > 0)
    {
      updateOptionMenuText(1, getString(2131301411) + "(" + this.gnG.size() + ")");
      enableOptionMenu(1, true);
      AppMethodBeat.o(22879);
    }
    while (true)
    {
      return;
      updateOptionMenuText(1, getString(2131301411));
      enableOptionMenu(1, false);
      AppMethodBeat.o(22879);
    }
  }

  public final void Kh()
  {
    AppMethodBeat.i(22877);
    super.Kh();
    this.elZ = new ArrayList();
    this.elZ.addAll(s.dIf());
    this.elZ.addAll(s.dIg());
    this.elZ.add(r.Yz());
    this.gnG = new HashSet();
    AppMethodBeat.o(22877);
  }

  public final void QA(String paramString)
  {
    AppMethodBeat.i(22880);
    h.pYm.e(11225, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
    Intent localIntent = new Intent();
    localIntent.putExtra("label", paramString);
    localIntent.putExtra("always_select_contact", bo.c(new ArrayList(this.gnG), ","));
    localIntent.putExtra("list_attr", s.C(new int[] { 16384, 64 }));
    d.b(this, ".ui.contact.SelectLabelContactUI", localIntent, 0);
    AppMethodBeat.o(22880);
  }

  public final boolean a(a parama)
  {
    AppMethodBeat.i(22886);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.gnG.contains(parama.ehM.field_username);
      AppMethodBeat.o(22886);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(22886);
    }
  }

  public final m aoA()
  {
    AppMethodBeat.i(22885);
    q localq = new q(this, this.elZ, true, this.scene);
    AppMethodBeat.o(22885);
    return localq;
  }

  public final boolean aow()
  {
    return false;
  }

  public final boolean aox()
  {
    return true;
  }

  public final String aoy()
  {
    AppMethodBeat.i(22883);
    String str = getString(2131301413);
    AppMethodBeat.o(22883);
    return str;
  }

  public final com.tencent.mm.ui.contact.o aoz()
  {
    AppMethodBeat.i(22884);
    Object localObject = new c.a();
    ((c.a)localObject).zkR = true;
    ((c.a)localObject).zjx = "@all.contact.without.chatroom.without.openim.without.openimfavour";
    localObject = new c(this, this.elZ, true, (c.a)localObject);
    AppMethodBeat.o(22884);
    return localObject;
  }

  public final int[] bMP()
  {
    return new int[] { 131072 };
  }

  public final boolean bOd()
  {
    return true;
  }

  public final int getLayoutId()
  {
    return 2130970077;
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(22882);
    n localn = dHV();
    Object localObject = localn.Pn(paramInt - getContentLV().getHeaderViewsCount());
    if (localObject == null)
      AppMethodBeat.o(22882);
    while (true)
    {
      return;
      if (((a)localObject).ehM != null)
        break;
      AppMethodBeat.o(22882);
    }
    ab.i("MicroMsg.MassSendSelectContactUI", "ClickUser=%s", new Object[] { ((a)localObject).ehM.field_username });
    localObject = ((a)localObject).ehM.field_username;
    dIb();
    if (this.gnG.contains(localObject))
    {
      this.gnG.remove(localObject);
      this.opo.ajq((String)localObject);
    }
    while (true)
    {
      yu(this.gnG.size());
      localn.notifyDataSetChanged();
      dIb();
      dIc();
      AppMethodBeat.o(22882);
      break;
      this.gnG.add(localObject);
      this.opo.ajq((String)localObject);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    AppMethodBeat.i(22881);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.MassSendSelectContactUI", "requestCode=%d | resultCode=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(22881);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(22881);
      break;
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      if (bo.isNullOrNil(paramIntent))
      {
        ab.i("MicroMsg.MassSendSelectContactUI", "GET_LABEL_USERS return usernames is null or empty");
        AppMethodBeat.o(22881);
        break;
      }
      ab.i("MicroMsg.MassSendSelectContactUI", "GET_LABEL_USERS select username=%s", new Object[] { paramIntent });
      String[] arrayOfString = paramIntent.split(",");
      paramInt2 = arrayOfString.length;
      for (paramInt1 = i; paramInt1 < paramInt2; paramInt1++)
      {
        paramIntent = arrayOfString[paramInt1];
        if (this.gnG.add(paramIntent))
          this.opo.ajq(paramIntent);
      }
      yu(this.gnG.size());
      dHV().notifyDataSetChanged();
      if (this.elS != null)
      {
        this.elS.clearFocus();
        this.elS.dJS();
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22878);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.MassSendSelectContactUI", "create!");
    this.opo = this.opo;
    if (this.opo == null)
    {
      finish();
      AppMethodBeat.o(22878);
    }
    while (true)
    {
      return;
      this.opo.setBackgroundDrawable(null);
      a(1, getString(2131301411), new MassSendSelectContactUI.1(this), q.b.ymu);
      this.opm = ((Button)findViewById(2131825939));
      this.opm.setOnClickListener(new MassSendSelectContactUI.2(this));
      this.opo.setOnContactDeselectListener(new MassSendSelectContactUI.3(this));
      yu(this.gnG.size());
      AppMethodBeat.o(22878);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI
 * JD-Core Version:    0.6.2
 */