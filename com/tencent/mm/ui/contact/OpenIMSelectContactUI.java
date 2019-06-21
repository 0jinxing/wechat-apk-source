package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.m.e;
import com.tencent.mm.model.r;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.k;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class OpenIMSelectContactUI extends MMBaseSelectContactUI
{
  private String csB;
  private List<String> elZ;
  private HashSet<String> gnG;
  private String title;
  private int zkf;
  private HashSet<String> zol;
  private HashSet<String> zom;
  private int zon;
  private boolean zoo;
  private SelectContactUI.a zop;

  public OpenIMSelectContactUI()
  {
    AppMethodBeat.i(33825);
    this.zoo = true;
    this.zop = new SelectContactUI.a();
    AppMethodBeat.o(33825);
  }

  private void Kt()
  {
    AppMethodBeat.i(33832);
    if ((s.hr(this.zon, 64)) && (this.gnG.size() > 0))
    {
      updateOptionMenuText(1, getString(2131296870) + "(" + this.gnG.size() + ")");
      int i = getIntent().getIntExtra("min_limit_num", 0);
      if ((s.hr(this.zon, 262144)) && (this.gnG.size() < i))
      {
        enableOptionMenu(1, false);
        AppMethodBeat.o(33832);
      }
    }
    while (true)
    {
      return;
      enableOptionMenu(1, true);
      AppMethodBeat.o(33832);
      continue;
      updateOptionMenuText(1, getString(2131296870));
      enableOptionMenu(1, false);
      AppMethodBeat.o(33832);
    }
  }

  private void ajq(String paramString)
  {
    AppMethodBeat.i(33833);
    if (this.opo == null)
      AppMethodBeat.o(33833);
    while (true)
    {
      return;
      this.opo.ajq(paramString);
      AppMethodBeat.o(33833);
    }
  }

  private boolean q(List<String> paramList1, List<String> paramList2)
  {
    AppMethodBeat.i(33834);
    ab.i("OpenIMSelectContactUI", "handleSelect %s, cancel %s", new Object[] { paramList1, paramList2 });
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Contact", bo.c(paramList1, ","));
    localIntent.putExtra("Cancel_Select_Contact", bo.c(paramList2, ","));
    setResult(-1, localIntent);
    finish();
    AppMethodBeat.o(33834);
    return true;
  }

  protected final void Kh()
  {
    AppMethodBeat.i(33827);
    super.Kh();
    this.csB = getIntent().getStringExtra("openim_appid");
    this.title = getIntent().getStringExtra("titile");
    this.zkf = getIntent().getIntExtra("list_type", -1);
    this.zon = getIntent().getIntExtra("list_attr", s.znD);
    this.elZ = new ArrayList();
    this.gnG = new HashSet();
    this.zom = new HashSet();
    this.zol = new HashSet();
    Object localObject = getIntent().getStringExtra("always_select_contact");
    if (!bo.isNullOrNil((String)localObject))
      this.zol.addAll(bo.P(((String)localObject).split(",")));
    localObject = getIntent().getStringExtra("already_select_contact");
    if (!bo.isNullOrNil((String)localObject))
    {
      this.gnG.addAll(bo.P(((String)localObject).split(",")));
      this.zom.addAll(this.gnG);
    }
    localObject = new HashSet();
    String str = getIntent().getStringExtra("block_contact");
    if (!bo.isNullOrNil(str))
      ((HashSet)localObject).addAll(bo.P(str.split(",")));
    localObject = new HashSet((Collection)localObject);
    ((HashSet)localObject).addAll(s.dIf());
    ((HashSet)localObject).addAll(s.dIg());
    this.elZ.addAll((Collection)localObject);
    AppMethodBeat.o(33827);
  }

  public final boolean a(a parama)
  {
    AppMethodBeat.i(33836);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.gnG.contains(parama.ehM.field_username);
      AppMethodBeat.o(33836);
    }
    while (true)
    {
      return bool;
      if ((parama.zmX) && (parama.ehM != null))
      {
        bool = this.gnG.contains(parama.ehM.field_username);
        AppMethodBeat.o(33836);
      }
      else if ((parama instanceof k))
      {
        bool = this.gnG.isEmpty();
        AppMethodBeat.o(33836);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(33836);
      }
    }
  }

  protected final m aoA()
  {
    AppMethodBeat.i(33830);
    q localq = new q(this, this.elZ, s.hr(this.zon, 64), this.scene);
    AppMethodBeat.o(33830);
    return localq;
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
    AppMethodBeat.i(33828);
    if (bo.isNullOrNil(this.title))
      this.title = ((b)com.tencent.mm.kernel.g.K(b.class)).a(this.csB, "openim_acct_type_title", b.a.geR);
    String str = this.title;
    AppMethodBeat.o(33828);
    return str;
  }

  protected final o aoz()
  {
    AppMethodBeat.i(33829);
    boolean bool = s.hr(this.zon, 64);
    w localw = new w(this.csB, this, this.elZ, bool);
    AppMethodBeat.o(33829);
    return localw;
  }

  public final boolean b(a parama)
  {
    AppMethodBeat.i(33837);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.zol.contains(parama.ehM.field_username);
      AppMethodBeat.o(33837);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33837);
    }
  }

  public final boolean dId()
  {
    return false;
  }

  public final void mO(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(33831);
    int j = paramInt - getContentLV().getHeaderViewsCount();
    if (j < 0)
    {
      ab.i("OpenIMSelectContactUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", new Object[] { Integer.valueOf(j), Integer.valueOf(paramInt) });
      AppMethodBeat.o(33831);
    }
    while (true)
    {
      return;
      Object localObject = dHV().Pn(j);
      if (localObject == null)
      {
        AppMethodBeat.o(33831);
      }
      else if (((a)localObject).ehM == null)
      {
        AppMethodBeat.o(33831);
      }
      else if (((a)localObject).ehM.field_deleteFlag == 1)
      {
        AppMethodBeat.o(33831);
      }
      else
      {
        localObject = ((a)localObject).ehM.field_username;
        ab.i("OpenIMSelectContactUI", "ClickUser=%s", new Object[] { localObject });
        if (s.hr(this.zon, 64))
        {
          if ((s.hr(this.zon, 131072)) && (this.gnG.size() >= getIntent().getIntExtra("max_limit_num", 2147483647)))
            if (!this.zol.contains(localObject))
            {
              dIb();
              if (this.gnG.contains(localObject))
              {
                ajq((String)localObject);
                this.gnG.remove(localObject);
              }
            }
            else
            {
              label236: Kt();
              if ((this.zoo) && ((this.zkf == 1) || (this.zkf == 0)))
                if (this.zol == null)
                  break label479;
            }
          label479: for (paramInt = this.zol.size(); ; paramInt = 0)
          {
            if (this.gnG != null)
              i = this.gnG.size();
            j = bo.ank(com.tencent.mm.m.g.Nu().getValue("ChatRoomInviteStartCount"));
            this.zop.e(this, paramInt + i, j);
            dHW().notifyDataSetChanged();
            AppMethodBeat.o(33831);
            break;
            String str = getIntent().getStringExtra("too_many_member_tip_string");
            localObject = str;
            if (bo.isNullOrNil(str))
              localObject = getString(2131302884, new Object[] { Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10)) });
            h.a(this.mController.ylL, (String)localObject, getString(2131297031), new OpenIMSelectContactUI.2(this));
            break label236;
            if (this.zol.contains(localObject))
              break label236;
            dIb();
            ajq((String)localObject);
            if (this.gnG.contains(localObject))
            {
              this.gnG.remove(localObject);
              break label236;
            }
            this.gnG.add(localObject);
            break label236;
          }
        }
        q(bo.P(new String[] { localObject }), new ArrayList(0));
        AppMethodBeat.o(33831);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33826);
    super.onCreate(paramBundle);
    if (s.hr(this.zon, 64))
      a(1, getString(2131296994), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(33824);
          ArrayList localArrayList = OpenIMSelectContactUI.a(OpenIMSelectContactUI.this, s.hr(OpenIMSelectContactUI.a(OpenIMSelectContactUI.this), 8192));
          localArrayList.remove(r.Yz());
          paramAnonymousMenuItem = new ArrayList(OpenIMSelectContactUI.b(OpenIMSelectContactUI.this));
          paramAnonymousMenuItem.removeAll(localArrayList);
          boolean bool = OpenIMSelectContactUI.a(OpenIMSelectContactUI.this, localArrayList, paramAnonymousMenuItem);
          AppMethodBeat.o(33824);
          return bool;
        }
      }
      , q.b.ymu);
    Kt();
    paramBundle = this.gnG.iterator();
    while (paramBundle.hasNext())
      ajq((String)paramBundle.next());
    AppMethodBeat.o(33826);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void vI(String paramString)
  {
    AppMethodBeat.i(33835);
    this.gnG.remove(paramString);
    dHV().notifyDataSetChanged();
    Kt();
    AppMethodBeat.o(33835);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.OpenIMSelectContactUI
 * JD-Core Version:    0.6.2
 */