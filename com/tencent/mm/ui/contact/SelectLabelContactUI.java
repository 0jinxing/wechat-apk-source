package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import java.util.HashSet;

public class SelectLabelContactUI extends MMBaseSelectContactUI
{
  private HashSet<String> gnG;
  private String label;
  private HashSet<String> zol;
  private int zon;

  private void Kt()
  {
    AppMethodBeat.i(33910);
    if ((s.hr(this.zon, 64)) && (this.gnG.size() > 0))
    {
      updateOptionMenuText(1, getString(2131296994) + "(" + this.gnG.size() + ")");
      enableOptionMenu(1, true);
      AppMethodBeat.o(33910);
    }
    while (true)
    {
      return;
      updateOptionMenuText(1, getString(2131296994));
      enableOptionMenu(1, false);
      AppMethodBeat.o(33910);
    }
  }

  private void arS(String paramString)
  {
    AppMethodBeat.i(33911);
    Intent localIntent;
    if (s.hr(this.zon, 16384))
    {
      localIntent = new Intent();
      localIntent.putExtra("Select_Contact", paramString);
      setResult(-1, localIntent);
      finish();
      AppMethodBeat.o(33911);
    }
    while (true)
    {
      return;
      localIntent = new Intent();
      localIntent.setClass(this, ChattingUI.class);
      localIntent.putExtra("Chat_User", paramString);
      localIntent.putExtra("finish_direct", true);
      startActivity(localIntent);
      finish();
      AppMethodBeat.o(33911);
    }
  }

  protected final void Kh()
  {
    AppMethodBeat.i(33907);
    super.Kh();
    this.label = getIntent().getStringExtra("label");
    this.zon = getIntent().getIntExtra("list_attr", 0);
    this.gnG = new HashSet();
    this.zol = new HashSet();
    String str = getIntent().getStringExtra("always_select_contact");
    if (!bo.isNullOrNil(str))
      this.zol.addAll(bo.P(str.split(",")));
    str = getIntent().getStringExtra("already_select_contact");
    if (!bo.isNullOrNil(str))
      this.gnG.addAll(bo.P(str.split(",")));
    AppMethodBeat.o(33907);
  }

  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    AppMethodBeat.i(33913);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.gnG.contains(parama.ehM.field_username);
      AppMethodBeat.o(33913);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33913);
    }
  }

  protected final m aoA()
  {
    return null;
  }

  protected final boolean aow()
  {
    return false;
  }

  protected final boolean aox()
  {
    return false;
  }

  protected final String aoy()
  {
    return this.label;
  }

  protected final o aoz()
  {
    AppMethodBeat.i(33912);
    Object localObject = com.tencent.mm.plugin.label.a.a.bJa().PE(this.label);
    localObject = new h(this, s.hr(this.zon, 64), com.tencent.mm.plugin.label.a.a.bJa().PH((String)localObject));
    AppMethodBeat.o(33912);
    return localObject;
  }

  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    AppMethodBeat.i(33914);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.zol.contains(parama.ehM.field_username);
      AppMethodBeat.o(33914);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33914);
    }
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(33909);
    int i = getContentLV().getHeaderViewsCount();
    n localn = dHV();
    Object localObject = localn.Pn(paramInt - i);
    if (localObject == null)
      AppMethodBeat.o(33909);
    while (true)
    {
      return;
      if (((com.tencent.mm.ui.contact.a.a)localObject).ehM == null)
      {
        AppMethodBeat.o(33909);
      }
      else
      {
        localObject = ((com.tencent.mm.ui.contact.a.a)localObject).ehM.field_username;
        ab.i("MicroMsg.SelectLabelContactUI", "ClickUser=%s", new Object[] { localObject });
        if (s.hr(this.zon, 64))
        {
          if ((!this.zol.contains(localObject)) && (!this.gnG.contains(localObject)) && (s.hr(this.zon, 131072)) && (this.zol.size() + this.gnG.size() >= getIntent().getIntExtra("max_limit_num", 2147483647)))
          {
            com.tencent.mm.ui.base.h.a(this.mController.ylL, getString(2131302884, new Object[] { Integer.valueOf(getIntent().getIntExtra("max_limit_num", 2147483647)) }), getString(2131297031), new SelectLabelContactUI.2(this));
            AppMethodBeat.o(33909);
          }
          else
          {
            if (!this.zol.contains(localObject))
            {
              if (!this.gnG.contains(localObject))
                break label269;
              this.gnG.remove(localObject);
            }
            while (true)
            {
              Kt();
              localn.notifyDataSetChanged();
              AppMethodBeat.o(33909);
              break;
              label269: this.gnG.add(localObject);
            }
          }
        }
        else
        {
          arS((String)localObject);
          AppMethodBeat.o(33909);
        }
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33908);
    super.onCreate(paramBundle);
    if (s.hr(this.zon, 64))
      a(1, getString(2131296994), new SelectLabelContactUI.1(this), q.b.ymu);
    Kt();
    AppMethodBeat.o(33908);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectLabelContactUI
 * JD-Core Version:    0.6.2
 */