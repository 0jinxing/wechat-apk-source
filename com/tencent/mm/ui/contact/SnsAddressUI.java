package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SnsAddressUI extends MMBaseSelectContactUI
{
  private List<String> elZ;
  private HashSet<String> gnG;

  private void Kt()
  {
    AppMethodBeat.i(33932);
    String str;
    if (this.gnG.size() == 0)
    {
      str = String.format("%s", new Object[] { getString(2131296994) });
      updateOptionMenuText(1, str);
      if (this.gnG.size() < 0)
        break label108;
    }
    label108: for (boolean bool = true; ; bool = false)
    {
      enableOptionMenu(1, bool);
      AppMethodBeat.o(33932);
      return;
      str = String.format("%s(%d/%d)", new Object[] { getString(2131296994), Integer.valueOf(this.gnG.size()), Integer.valueOf(com.tencent.mm.storage.ab.xID) });
      break;
    }
  }

  protected final void Kh()
  {
    AppMethodBeat.i(33926);
    super.Kh();
    this.elZ = new ArrayList();
    ArrayList localArrayList = bo.P(bo.bc(getIntent().getStringExtra("Block_list"), "").split(","));
    Object localObject = s.dIf();
    ((HashSet)localObject).addAll(localArrayList);
    this.elZ.addAll((Collection)localObject);
    this.elZ.addAll(s.dIg());
    this.gnG = new HashSet();
    localObject = bo.bc(getIntent().getStringExtra("Select_Contact"), "");
    if (!bo.isNullOrNil((String)localObject))
      this.gnG.addAll(bo.P(((String)localObject).split(",")));
    AppMethodBeat.o(33926);
  }

  protected final void QA(String paramString)
  {
    AppMethodBeat.i(33934);
    Intent localIntent = new Intent();
    localIntent.setClassName(this, "com.tencent.mm.ui.contact.SelectLabelContactUI");
    localIntent.putExtra("label", paramString);
    paramString = new HashSet();
    paramString.addAll(this.gnG);
    localIntent.putExtra("always_select_contact", bo.c(new ArrayList(paramString), ","));
    localIntent.putExtra("list_attr", s.C(new int[] { 16384, 64 }));
    startActivityForResult(localIntent, 3);
    AppMethodBeat.o(33934);
  }

  public final boolean a(a parama)
  {
    AppMethodBeat.i(33935);
    boolean bool;
    if ((parama.zmW) && (parama.ehM != null))
    {
      bool = this.gnG.contains(parama.ehM.field_username);
      AppMethodBeat.o(33935);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33935);
    }
  }

  protected final m aoA()
  {
    AppMethodBeat.i(33931);
    q localq = new q(this, this.elZ, true, this.scene);
    AppMethodBeat.o(33931);
    return localq;
  }

  protected final boolean aow()
  {
    return false;
  }

  protected final boolean aox()
  {
    return true;
  }

  protected final String aoy()
  {
    AppMethodBeat.i(33929);
    String str = bo.bc(getIntent().getStringExtra("Add_address_titile"), "");
    AppMethodBeat.o(33929);
    return str;
  }

  protected final o aoz()
  {
    AppMethodBeat.i(33930);
    Object localObject = new c.a();
    ((c.a)localObject).zkR = true;
    ((c.a)localObject).zkY = true;
    ((c.a)localObject).zla = getString(2131296469);
    ((c.a)localObject).zkZ = bo.bc(getIntent().getStringExtra("Add_get_from_sns"), "");
    ((c.a)localObject).zjx = "@all.contact.without.chatroom.without.openim.without.openimfavour";
    localObject = new c(this, this.elZ, true, (c.a)localObject);
    AppMethodBeat.o(33930);
    return localObject;
  }

  public final int[] bMP()
  {
    return new int[] { 131072 };
  }

  protected final boolean bOd()
  {
    return true;
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(33928);
    n localn = dHV();
    Object localObject = localn.Pn(paramInt - getContentLV().getHeaderViewsCount());
    if (localObject == null)
      AppMethodBeat.o(33928);
    while (true)
    {
      return;
      if (((a)localObject).ehM != null)
        break;
      AppMethodBeat.o(33928);
    }
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsAddressUI", "ClickUser=%s", new Object[] { ((a)localObject).ehM.field_username });
    localObject = ((a)localObject).ehM.field_username;
    dIb();
    if (this.gnG.contains(localObject))
    {
      this.gnG.remove(localObject);
      this.opo.ajq((String)localObject);
    }
    while (true)
    {
      Kt();
      localn.notifyDataSetChanged();
      AppMethodBeat.o(33928);
      break;
      if (this.gnG.size() < com.tencent.mm.storage.ab.xID)
      {
        this.gnG.add(localObject);
        this.opo.ajq((String)localObject);
      }
      else
      {
        Toast.makeText(this, 2131303714, 0).show();
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsAddressUI", "select user size equal max size:%d", new Object[] { Integer.valueOf(com.tencent.mm.storage.ab.xID) });
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    AppMethodBeat.i(33933);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      AppMethodBeat.o(33933);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(33933);
      break;
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      if (bo.isNullOrNil(paramIntent))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsAddressUI", "GET_LABEL_USERS return usernames is null or empty");
        AppMethodBeat.o(33933);
        break;
      }
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsAddressUI", "GET_LABEL_USERS select username=%s", new Object[] { paramIntent });
      String[] arrayOfString = paramIntent.split(",");
      paramInt2 = arrayOfString.length;
      for (paramInt1 = i; paramInt1 < paramInt2; paramInt1++)
      {
        paramIntent = arrayOfString[paramInt1];
        if (this.gnG.add(paramIntent))
          this.opo.ajq(paramIntent);
      }
      Kt();
      dHV().notifyDataSetChanged();
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33927);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.SnsAddressUI", "Create!");
    a(1, getString(2131296994), new SnsAddressUI.1(this), q.b.ymu);
    setBackBtn(new SnsAddressUI.2(this));
    Iterator localIterator = this.gnG.iterator();
    while (localIterator.hasNext())
    {
      paramBundle = (String)localIterator.next();
      this.opo.ajq(paramBundle);
    }
    this.opo.setOnContactDeselectListener(new SnsAddressUI.3(this));
    Kt();
    AppMethodBeat.o(33927);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void vI(String paramString)
  {
    AppMethodBeat.i(33936);
    this.gnG.remove(paramString);
    dHV().notifyDataSetChanged();
    Kt();
    AppMethodBeat.o(33936);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsAddressUI
 * JD-Core Version:    0.6.2
 */