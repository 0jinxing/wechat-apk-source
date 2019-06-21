package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class RoomRightUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private ProgressDialog ehJ = null;
  private com.tencent.mm.ui.base.preference.f ehK;
  private String ekC = "";
  private int ekD = 0;

  private void Ke()
  {
    AppMethodBeat.i(104208);
    int i = bo.a((Integer)g.RP().Ry().get(135175, null), 0);
    Object localObject1 = this.ehK.aqO("settings_room_size");
    if ((localObject1 != null) && (i > 0))
    {
      ((Preference)localObject1).setSummary(getResources().getQuantityString(2131361818, i, new Object[] { Integer.valueOf(i) }));
      ((Preference)localObject1).setEnabled(false);
    }
    label163: label436: 
    while (true)
    {
      this.ehK.aqO("room_right_max_tip").setTitle(getString(2131302612, new Object[] { Integer.valueOf(i) }));
      int j = bo.a((Integer)g.RP().Ry().get(135176, null), 0);
      Object localObject2 = (RoomGrantPreference)this.ehK.aqO("settings_room_grant");
      Preference localPreference;
      if ((localObject2 != null) && (j <= 0))
      {
        this.ehK.d((Preference)localObject2);
        localPreference = this.ehK.aqO("room_right_tip");
        localObject1 = this.ehK.aqO("room_right_grant_tip");
        if (j > 0)
          break label360;
        if (localPreference != null)
          this.ehK.d(localPreference);
        if (localObject1 != null)
          this.ehK.d((Preference)localObject1);
        localObject1 = this.ehK.aqO("room_grant_to_friend");
        if (localObject1 != null)
          this.ehK.d((Preference)localObject1);
        if (localObject2 != null)
          this.ehK.d((Preference)localObject2);
        AppMethodBeat.o(104208);
      }
      while (true)
      {
        return;
        if (localObject1 == null)
          break label436;
        this.ehK.d((Preference)localObject1);
        break;
        if (localObject2 == null)
          break label163;
        ((RoomGrantPreference)localObject2).setEnabled(false);
        localObject1 = getString(2131302615, new Object[] { Integer.valueOf(j) });
        ((RoomGrantPreference)localObject2).ekv = ((String)localObject1);
        if (((RoomGrantPreference)localObject2).eku == null)
          break label163;
        ((RoomGrantPreference)localObject2).eku.setText((CharSequence)localObject1);
        break label163;
        label360: localObject2 = getString(2131302616, new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        if (localPreference != null)
          localPreference.setTitle((CharSequence)localObject2);
        localObject2 = getString(2131302609, new Object[] { Integer.valueOf(this.ekD) });
        if (localObject1 != null)
          ((Preference)localObject1).setTitle((CharSequence)localObject2);
        AppMethodBeat.o(104208);
      }
    }
  }

  private void a(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(104215);
    if (paramLinkedList.size() > 0);
    String str;
    LinkedList localLinkedList;
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      str = ah.getContext().getString(2131298068);
      paramLinkedList.size();
      localLinkedList = new LinkedList();
      if (!g.RK())
        break;
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
        localLinkedList.add(s.mJ((String)localIterator.next()));
    }
    h.a(this, getString(2131302613, new Object[] { bo.c(localLinkedList, str) }), getString(2131297061), new RoomRightUI.3(this, paramLinkedList));
    AppMethodBeat.o(104215);
  }

  public final int JC()
  {
    return 2131165261;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(104211);
    if (paramPreference.mKey.equals("room_grant_to_friend"))
    {
      paramf = new Intent();
      paramf.setClassName(ah.getPackageName(), ah.getPackageName() + ".ui.contact.SelectContactUI");
      paramf.putExtra("Contact_GroupFilter_Type", "@all.contact.without.chatroom");
      paramf.putExtra("List_Type", 4);
      paramf.putExtra("select_contact_pick_result", true);
      paramPreference = new LinkedList();
      paramPreference.add("officialaccounts");
      paramf.putExtra("Block_list", bo.c(paramPreference, ","));
      paramf.putExtra("Add_SendCard", true);
      paramf.putExtra("is_multi_select", false);
      startActivityForResult(paramf, 1);
    }
    AppMethodBeat.o(104211);
    return false;
  }

  public final void initView()
  {
    AppMethodBeat.i(104213);
    this.ehK = this.yCw;
    setMMTitle(2131303241);
    setBackBtn(new RoomRightUI.1(this));
    AppMethodBeat.o(104213);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(104214);
    ab.i("MicroMsg.RoomRightUI", "onAcvityResult requestCode: %d", new Object[] { Integer.valueOf(paramInt1) });
    if ((paramInt2 != -1) || (paramIntent == null))
    {
      AppMethodBeat.o(104214);
      return;
    }
    switch (paramInt1)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(104214);
      break;
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      ab.d("MicroMsg.RoomRightUI", "pick user %s", new Object[] { paramIntent });
      if (bo.isNullOrNil(paramIntent))
      {
        AppMethodBeat.o(104214);
        break;
      }
      this.ekC = paramIntent;
      String str = this.ekC;
      paramIntent = getString(2131302546, new Object[] { ((j)g.K(j.class)).XM().aoO(str).Oj(), Integer.valueOf(this.ekD) });
      h.a(this.mController.ylL, paramIntent, "", new RoomRightUI.2(this, str), null);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104209);
    super.onCreate(paramBundle);
    this.ekD = bo.a((Integer)g.RP().Ry().get(135177, null), 0);
    g.RO().eJo.a(339, this);
    g.RO().eJo.a(30, this);
    g.RP().Ry().set(135184, Boolean.FALSE);
    initView();
    AppMethodBeat.o(104209);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104212);
    super.onDestroy();
    g.RO().eJo.b(339, this);
    g.RO().eJo.b(30, this);
    AppMethodBeat.o(104212);
  }

  public void onResume()
  {
    AppMethodBeat.i(104210);
    super.onResume();
    Ke();
    this.ehK.notifyDataSetChanged();
    AppMethodBeat.o(104210);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(104216);
    ab.i("MicroMsg.RoomRightUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.ehJ != null)
      this.ehJ.dismiss();
    if (paramm.getType() != 339)
      AppMethodBeat.o(104216);
    while (true)
    {
      return;
      paramString = ((j)g.K(j.class)).XM().aoO(this.ekC);
      if ((paramString == null) || ((int)paramString.ewQ == 0));
      for (paramString = this.ekC; ; paramString = paramString.Oj())
      {
        if ((paramInt1 != 0) || (paramInt2 != 0))
          break label194;
        h.b(this, getString(2131302549, new Object[] { paramString }), getString(2131297061), true);
        if (this.ehK != null)
        {
          Ke();
          this.ehK.notifyDataSetChanged();
        }
        AppMethodBeat.o(104216);
        break;
      }
      label194: if (paramInt2 == -251)
      {
        h.b(this, getString(2131302547, new Object[] { paramString, Integer.valueOf(this.ekD) }), getString(2131297061), true);
        AppMethodBeat.o(104216);
      }
      else if (paramInt2 == -44)
      {
        paramString = new LinkedList();
        paramString.add(this.ekC);
        a(paramString);
        AppMethodBeat.o(104216);
      }
      else if (paramInt2 == -22)
      {
        h.b(this, getString(2131302548, new Object[] { paramString }), getString(2131297061), true);
        AppMethodBeat.o(104216);
      }
      else
      {
        Toast.makeText(this, "err :" + paramInt1 + " ," + paramInt2, 0).show();
        AppMethodBeat.o(104216);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomRightUI
 * JD-Core Version:    0.6.2
 */