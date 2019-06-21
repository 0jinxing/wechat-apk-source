package com.tencent.mm.plugin.topstory.ui.home;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.th;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class TopStorySettingVisibilityDetailUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  protected String cvZ;
  protected com.tencent.mm.ui.base.preference.f ehK;
  protected ContactListExpandPreference ehS;
  protected List<String> kPL;
  protected long qJQ;
  protected String rxA;
  protected ContactListExpandPreference.a rxC;
  protected Preference sCJ;
  protected Preference sCK;
  protected List<String> sCL;
  protected List<String> sCM;
  private Set<com.tencent.mm.plugin.topstory.a.c.h> sCN;
  protected com.tencent.mm.ui.base.p tipDialog;

  public TopStorySettingVisibilityDetailUI()
  {
    AppMethodBeat.i(1645);
    this.kPL = new ArrayList();
    this.sCL = new ArrayList();
    this.sCM = new ArrayList();
    this.rxA = "";
    this.cvZ = "";
    this.tipDialog = null;
    this.rxC = new TopStorySettingVisibilityDetailUI.6(this);
    this.sCN = new HashSet();
    AppMethodBeat.o(1645);
  }

  private boolean cFG()
  {
    AppMethodBeat.i(1650);
    boolean bool;
    if ((this.rxA + " " + bo.c(this.kPL, ",")).equals(this.cvZ))
    {
      finish();
      bool = true;
      AppMethodBeat.o(1650);
    }
    while (true)
    {
      return bool;
      int i = 2131306034;
      if (this.tipDialog != null)
        i = 2131306036;
      com.tencent.mm.ui.base.h.d(this, getString(i), "", getString(2131306040), getString(2131296868), new TopStorySettingVisibilityDetailUI.4(this), null);
      bool = false;
      AppMethodBeat.o(1650);
    }
  }

  @SuppressLint({"StringFormatMatches"})
  private void cFH()
  {
    AppMethodBeat.i(1654);
    if (this.sCM.isEmpty())
    {
      this.ehK.ce("revert_pref", true);
      AppMethodBeat.o(1654);
    }
    while (true)
    {
      return;
      this.ehK.ce("revert_pref", false);
      this.sCK.setTitle(getString(2131306037, new Object[] { Integer.valueOf(this.sCM.size()) }));
      AppMethodBeat.o(1654);
    }
  }

  private void ctV()
  {
    AppMethodBeat.i(1652);
    this.ehS = ((ContactListExpandPreference)this.ehK.aqO("roominfo_contact_anchor"));
    if (this.ehS != null)
    {
      this.ehS.a(this.ehK, this.ehS.mKey);
      this.ehS.oD(true).oE(true);
      this.ehS.u(null, this.kPL);
      this.ehS.a(new TopStorySettingVisibilityDetailUI.5(this));
      this.ehS.a(this.rxC);
    }
    this.sCJ = this.ehK.aqO("desc");
    this.sCK = this.ehK.aqO("revert_pref");
    this.ehK.ce("revert_pref", true);
    AppMethodBeat.o(1652);
  }

  private void h(List<String> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(1657);
    if (paramList == null);
    for (int i = -1; ; i = paramList.size())
    {
      ab.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "dealOnAddContact %s", new Object[] { Integer.valueOf(i) });
      g.RQ();
      bd localbd = ((j)g.K(j.class)).XM();
      String str1 = r.Yz();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        String str2 = (String)paramList.next();
        if ((!this.kPL.contains(str2)) && (!str1.equals(str2)) && ((com.tencent.mm.n.a.jh(localbd.aoO(str2).field_type)) || (!paramBoolean)))
        {
          this.kPL.add(str2);
          this.sCM.add(str2);
        }
      }
    }
    if (this.ehS != null)
    {
      this.ehS.ci(this.kPL);
      this.ehS.notifyChanged();
    }
    if (this.kPL.size() > 0)
      this.ehS.oD(true).oE(true);
    while (true)
    {
      cFH();
      updateTitle();
      AppMethodBeat.o(1657);
      return;
      this.ehS.oD(true).oE(false);
    }
  }

  public final int JC()
  {
    return 2131165306;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(1646);
    if ("revert_pref".equals(paramPreference.mKey))
      com.tencent.mm.ui.base.h.d(this, getString(2131306034), "", getString(2131306040), getString(2131296868), new TopStorySettingVisibilityDetailUI.1(this), null);
    AppMethodBeat.o(1646);
    return false;
  }

  protected final void bKl()
  {
    AppMethodBeat.i(1658);
    int i;
    if (((com.tencent.mm.kernel.b.h)g.RM().Rn()).SG())
    {
      i = g.Rg().acS();
      if ((i == 4) || (i == 6))
      {
        i = 1;
        if (i != 0)
          break label101;
        t.makeText(this, 2131306039, 0).show();
        AppMethodBeat.o(1658);
      }
    }
    while (true)
    {
      return;
      i = 0;
      break;
      if (at.isConnected(ah.getContext()));
      for (i = 6; ; i = 0)
      {
        if (i != 6)
          break label96;
        i = 1;
        break;
      }
      label96: i = 0;
      break;
      label101: if (((this.rxA + " " + bo.c(this.kPL, ",")).equals(this.cvZ)) && (this.qJQ != 0L))
      {
        finish();
        AppMethodBeat.o(1658);
      }
      else
      {
        Object localObject1 = new ArrayList();
        Object localObject2 = new ArrayList();
        Object localObject3 = this.kPL.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (String)((Iterator)localObject3).next();
          if (!this.sCL.contains(localObject4))
          {
            ((List)localObject1).add(localObject4);
            if (this.qJQ == 1L)
              ((List)localObject2).add(Integer.valueOf(3));
            else
              ((List)localObject2).add(Integer.valueOf(1));
          }
        }
        Object localObject4 = this.sCL.iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject3 = (String)((Iterator)localObject4).next();
          if (!this.kPL.contains(localObject3))
          {
            ((List)localObject1).add(localObject3);
            if (this.qJQ == 1L)
              ((List)localObject2).add(Integer.valueOf(4));
            else
              ((List)localObject2).add(Integer.valueOf(2));
          }
        }
        getString(2131297061);
        this.tipDialog = com.tencent.mm.ui.base.h.b(this, getString(2131306042), true, new TopStorySettingVisibilityDetailUI.7(this));
        this.sCN.clear();
        ArrayList localArrayList = new ArrayList();
        localObject4 = new ArrayList();
        int j = 0;
        while (j < ((List)localObject1).size())
        {
          localArrayList.clear();
          ((List)localObject4).clear();
          for (i = 0; (j < ((List)localObject1).size()) && (i < 50); i++)
          {
            localArrayList.add(((List)localObject1).get(j));
            ((List)localObject4).add(((List)localObject2).get(j));
            j++;
          }
          localObject3 = new com.tencent.mm.plugin.topstory.a.c.h(localArrayList, (List)localObject4);
          this.sCN.add(localObject3);
        }
        ab.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "batch doNetscene, size: %s", new Object[] { Integer.valueOf(this.sCN.size()) });
        localObject2 = this.sCN.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (com.tencent.mm.plugin.topstory.a.c.h)((Iterator)localObject2).next();
          g.RO().eJo.a((m)localObject1, 0);
        }
        AppMethodBeat.o(1658);
      }
    }
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(1651);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      cFG();
      bool = true;
      AppMethodBeat.o(1651);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(1651);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(1649);
    this.ehK = this.yCw;
    ctV();
    getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
    setBackBtn(new TopStorySettingVisibilityDetailUI.2(this));
    a(0, getString(2131296944), new TopStorySettingVisibilityDetailUI.3(this), q.b.ymu);
    AppMethodBeat.o(1649);
  }

  protected final void km(String paramString)
  {
    AppMethodBeat.i(1655);
    ab.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "dealDelChatRoomMember");
    if ((paramString == null) || (paramString.equals("")))
    {
      AppMethodBeat.o(1655);
      return;
    }
    this.kPL.remove(paramString);
    if (this.ehS != null)
    {
      this.ehS.ci(this.kPL);
      this.ehS.notifyChanged();
    }
    if ((this.kPL.size() == 0) && (this.ehS != null))
    {
      this.ehS.djD();
      this.ehS.oD(true).oE(false);
      this.ehK.notifyDataSetChanged();
    }
    while (true)
    {
      this.sCM.clear();
      cFH();
      updateTitle();
      AppMethodBeat.o(1655);
      break;
      if (this.ehS != null)
        this.ehS.oD(true).oE(true);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(1656);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
      AppMethodBeat.o(1656);
    while (true)
    {
      return;
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(1656);
        break;
      case 1:
        if (paramIntent != null)
          break label66;
        AppMethodBeat.o(1656);
      }
    }
    label66: Object localObject = paramIntent.getStringExtra("Select_Contact");
    if (bo.nullAsNil(r.Yz()).equals(localObject))
      paramInt2 = 1;
    while (true)
      if (paramInt2 != 0)
      {
        com.tencent.mm.ui.base.h.b(this, getString(2131296416), "", true);
        AppMethodBeat.o(1656);
        break;
        if (this.kPL == null)
        {
          paramInt2 = 0;
        }
        else
        {
          Iterator localIterator = this.kPL.iterator();
          paramInt1 = 0;
          label144: paramInt2 = paramInt1;
          if (localIterator.hasNext())
          {
            if (!((String)localIterator.next()).equals(localObject))
              break label328;
            paramInt1 = 1;
          }
        }
      }
    label314: label328: 
    while (true)
    {
      break label144;
      localObject = bo.P(((String)localObject).split(","));
      if (localObject == null)
      {
        AppMethodBeat.o(1656);
        break;
      }
      paramIntent = paramIntent.getStringExtra("App_MsgId");
      if ((!bo.isNullOrNil(paramIntent)) && (paramIntent.equals("fromSns")))
        h((List)localObject, false);
      while (true)
      {
        if ((!(this.rxA + " " + bo.c(this.kPL, ",")).equals(this.cvZ)) || (this.qJQ == 0L))
          break label314;
        enableOptionMenu(false);
        AppMethodBeat.o(1656);
        break;
        h((List)localObject, true);
      }
      enableOptionMenu(true);
      AppMethodBeat.o(1656);
      break;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(1647);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("k_topstory_user_list");
    if (!bo.isNullOrNil(paramBundle))
    {
      this.sCL = Arrays.asList(paramBundle.split(","));
      paramBundle = this.sCL.iterator();
      while (paramBundle.hasNext())
      {
        String str = (String)paramBundle.next();
        if (!bo.isNullOrNil(str))
          this.kPL.add(str);
      }
    }
    initView();
    this.qJQ = getIntent().getIntExtra("k_topstory_type", 0);
    if (this.qJQ == 1L)
    {
      this.rxA = getString(2131306043);
      this.sCJ.setTitle(2131306044);
    }
    while (true)
    {
      g.Rg().a(2859, this);
      enableOptionMenu(false);
      updateTitle();
      this.cvZ = (this.rxA + " " + bo.c(this.kPL, ","));
      AppMethodBeat.o(1647);
      return;
      this.rxA = getString(2131306032);
      this.sCJ.setTitle(2131306033);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(1648);
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    g.Rg().b(2859, this);
    super.onDestroy();
    AppMethodBeat.o(1648);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(1659);
    ab.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.topstory.a.c.h))
    {
      paramString = (com.tencent.mm.plugin.topstory.a.c.h)paramm;
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label298;
      bool = true;
      if (!bool)
        break label304;
      paramInt1 = ((th)paramString.ehh.fsH.fsP).BaseResponse.Ret;
      if (paramInt1 == 0)
        break label304;
      ab.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd ret:%s", new Object[] { Integer.valueOf(paramInt1) });
      bool = false;
    }
    label298: label304: 
    while (true)
    {
      ab.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd succ:%s", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        paramString.fLW += 1;
        if (paramString.fLW < 2)
        {
          paramString = new com.tencent.mm.plugin.topstory.a.c.h(paramString);
          g.RO().eJo.a(paramString, 0);
          this.sCN.add(paramString);
        }
      }
      if (this.sCN.contains(paramm))
      {
        this.sCN.remove(paramm);
        ab.i("MicroMsg.TopStory.TopStorySettingVisibilityDetailUI", "onSceneEnd netSceneSet remove, size:%s", new Object[] { Integer.valueOf(this.sCN.size()) });
        if (this.sCN.isEmpty())
        {
          if (this.tipDialog != null)
          {
            this.tipDialog.dismiss();
            this.tipDialog = null;
          }
          finish();
        }
      }
      AppMethodBeat.o(1659);
      return;
      bool = false;
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void updateTitle()
  {
    AppMethodBeat.i(1653);
    setMMTitle(this.rxA + "(" + this.kPL.size() + ")");
    AppMethodBeat.o(1653);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.TopStorySettingVisibilityDetailUI
 * JD-Core Version:    0.6.2
 */