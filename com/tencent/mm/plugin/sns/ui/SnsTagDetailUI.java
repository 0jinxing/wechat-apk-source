package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.v;
import com.tencent.mm.plugin.sns.model.w;
import com.tencent.mm.plugin.sns.model.x;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference.a;
import com.tencent.mm.pluginsdk.ui.applet.k.b;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SnsTagDetailUI extends MMPreference
  implements com.tencent.mm.ai.f, n.b
{
  protected String cvZ;
  protected com.tencent.mm.ui.base.preference.f ehK;
  protected ContactListExpandPreference ehS;
  protected List<String> kPL;
  protected long qJQ;
  protected String rxA;
  private boolean rxB;
  protected ContactListExpandPreference.a rxC;
  protected int scene;
  protected com.tencent.mm.ui.base.p tipDialog;

  public SnsTagDetailUI()
  {
    AppMethodBeat.i(39356);
    this.tipDialog = null;
    this.kPL = new ArrayList();
    this.rxA = "";
    this.cvZ = "";
    this.rxB = false;
    this.scene = 0;
    this.rxC = new SnsTagDetailUI.9(this);
    AppMethodBeat.o(39356);
  }

  private void ctU()
  {
    AppMethodBeat.i(39364);
    Preference localPreference = this.ehK.aqO("settings_tag_name");
    if (localPreference != null)
    {
      if (this.rxA.length() > 20)
        this.rxA = this.rxA.substring(0, 20);
      localPreference.setSummary(this.rxA);
      this.ehK.notifyDataSetChanged();
    }
    AppMethodBeat.o(39364);
  }

  private void ctV()
  {
    AppMethodBeat.i(39366);
    this.ehS = ((ContactListExpandPreference)this.ehK.aqO("roominfo_contact_anchor"));
    if (this.ehS != null)
    {
      this.ehS.a(this.ehK, this.ehS.mKey);
      this.ehS.oD(true).oE(true);
      this.ehS.u(null, this.kPL);
      this.ehS.a(new k.b()
      {
        public final boolean iD(int paramAnonymousInt)
        {
          AppMethodBeat.i(39346);
          if (!SnsTagDetailUI.this.ehS.KU(paramAnonymousInt))
            ab.d("MicroMsg.SnsTagDetailUI", "onItemLongClick ".concat(String.valueOf(paramAnonymousInt)));
          AppMethodBeat.o(39346);
          return true;
        }
      });
      this.ehS.a(this.rxC);
    }
    AppMethodBeat.o(39366);
  }

  public final int JC()
  {
    return 2131165304;
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(39362);
    paramf = paramPreference.mKey;
    if ((paramf.equals("settings_tag_name")) && ((this.qJQ >= 6L) || (this.qJQ == 0L)))
    {
      paramPreference = new Intent();
      paramPreference.putExtra("Contact_mode_name_type", 3);
      paramPreference.putExtra("Contact_Nick", bo.bc(this.rxA, " "));
      com.tencent.mm.plugin.sns.c.a.gkE.a(paramPreference, this);
    }
    if (paramf.equals("delete_tag_name"))
      h.a(this, 2131302969, 2131297061, new SnsTagDetailUI.1(this), new SnsTagDetailUI.2(this));
    AppMethodBeat.o(39362);
    return false;
  }

  protected void bKl()
  {
    AppMethodBeat.i(39369);
    if (((this.rxA + " " + bo.c(this.kPL, ",")).equals(this.cvZ)) && (this.qJQ != 0L))
    {
      finish();
      AppMethodBeat.o(39369);
    }
    while (true)
    {
      return;
      if (af.cnL().v(this.qJQ, this.rxA))
      {
        h.b(this, getString(2131303790, new Object[] { this.rxA }), getString(2131297061), true);
        AppMethodBeat.o(39369);
      }
      else
      {
        w localw = new w(3, this.qJQ, this.rxA, this.kPL.size(), this.kPL, this.scene);
        g.RQ();
        g.RO().eJo.a(localw, 0);
        getString(2131297061);
        this.tipDialog = h.b(this, getString(2131303807), true, new SnsTagDetailUI.8(this, localw));
        AppMethodBeat.o(39369);
      }
    }
  }

  protected void csO()
  {
    AppMethodBeat.i(39357);
    ab.d("MicroMsg.SnsTagDetailUI", "Base __onCreate");
    g.RQ();
    g.RO().eJo.a(290, this);
    g.RQ();
    g.RO().eJo.a(291, this);
    g.RQ();
    g.RO().eJo.a(292, this);
    g.RQ();
    g.RO().eJo.a(293, this);
    g.RQ();
    ((j)g.K(j.class)).XM().a(this);
    if (af.cnL().cru().size() == 0)
    {
      g.RQ();
      g.RO().eJo.a(new v(1), 0);
      this.rxB = true;
    }
    AppMethodBeat.o(39357);
  }

  protected void csP()
  {
    AppMethodBeat.i(39359);
    ab.d("MicroMsg.SnsTagDetailUI", "Base __onDestroy");
    g.RQ();
    g.RO().eJo.b(290, this);
    g.RQ();
    g.RO().eJo.b(291, this);
    g.RQ();
    g.RO().eJo.b(292, this);
    g.RQ();
    g.RO().eJo.b(293, this);
    g.RQ();
    if (g.RN().QY())
    {
      g.RQ();
      ((j)g.K(j.class)).XM().b(this);
    }
    AppMethodBeat.o(39359);
  }

  protected void csQ()
  {
    AppMethodBeat.i(39365);
    if (this.qJQ != 0L)
    {
      g.RQ();
      g.RO().eJo.a(new x(this.qJQ, this.rxA), 0);
    }
    getString(2131297061);
    this.tipDialog = h.b(this, getString(2131303807), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
      }
    });
    AppMethodBeat.o(39365);
  }

  protected List<String> csS()
  {
    AppMethodBeat.i(39370);
    LinkedList localLinkedList = new LinkedList();
    t localt = af.cnL().kF(this.qJQ);
    Object localObject = localLinkedList;
    if (localt.field_memberList != null)
    {
      localObject = localLinkedList;
      if (!localt.field_memberList.equals(""))
        localObject = bo.P(localt.field_memberList.split(","));
    }
    AppMethodBeat.o(39370);
    return localObject;
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(39368);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
      if (((this.rxA + " " + bo.c(this.kPL, ",")).equals(this.cvZ)) && (this.qJQ != 0L))
      {
        finish();
        bool = true;
        AppMethodBeat.o(39368);
      }
    while (true)
    {
      return bool;
      h.a(this, 2131303785, 2131297061, new SnsTagDetailUI.7(this), null);
      break;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(39368);
    }
  }

  protected void dr(List<String> paramList)
  {
    AppMethodBeat.i(39372);
    bd localbd = af.cnt();
    String str = r.Yz();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      if ((!this.kPL.contains(paramList)) && (com.tencent.mm.n.a.jh(localbd.aoO(paramList).field_type)) && (!str.equals(paramList)))
        this.kPL.add(paramList);
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
      updateTitle();
      AppMethodBeat.o(39372);
      return;
      this.ehS.oD(true).oE(false);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(39367);
    this.ehK = this.yCw;
    ctV();
    getIntent().getIntExtra("k_sns_from_settings_about_sns", 0);
    setBackBtn(new SnsTagDetailUI.5(this));
    a(0, getString(2131296944), new SnsTagDetailUI.6(this), q.b.ymu);
    AppMethodBeat.o(39367);
  }

  protected void km(String paramString)
  {
    AppMethodBeat.i(39371);
    if ((paramString == null) || (paramString.equals("")))
    {
      AppMethodBeat.o(39371);
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
      updateTitle();
      AppMethodBeat.o(39371);
      break;
      if (this.ehS != null)
        this.ehS.oD(true).oE(true);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(39373);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
      AppMethodBeat.o(39373);
    while (true)
    {
      return;
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(39373);
        break;
      case 1:
        if (paramIntent != null)
          break label70;
        AppMethodBeat.o(39373);
      case 2:
      }
    }
    label70: paramIntent = paramIntent.getStringExtra("Select_Contact");
    if (bo.nullAsNil(r.Yz()).equals(paramIntent))
      paramInt2 = 1;
    while (true)
      if (paramInt2 != 0)
      {
        h.b(this, getString(2131296416, new Object[] { Integer.valueOf(0), Integer.valueOf(0) }), getString(2131297061), true);
        AppMethodBeat.o(39373);
        break;
        if (this.kPL == null)
        {
          paramInt2 = 0;
        }
        else
        {
          Iterator localIterator = this.kPL.iterator();
          paramInt1 = 0;
          label168: paramInt2 = paramInt1;
          if (localIterator.hasNext())
          {
            if (!((String)localIterator.next()).equals(paramIntent))
              break label361;
            paramInt1 = 1;
          }
        }
      }
    label347: label361: 
    while (true)
    {
      break label168;
      paramIntent = bo.P(paramIntent.split(","));
      if (paramIntent == null)
      {
        AppMethodBeat.o(39373);
        break;
      }
      dr(paramIntent);
      while (true)
      {
        if ((!(this.rxA + " " + bo.c(this.kPL, ",")).equals(this.cvZ)) || (this.qJQ == 0L))
          break label347;
        enableOptionMenu(false);
        AppMethodBeat.o(39373);
        break;
        paramIntent = paramIntent.getStringExtra("k_sns_tag_name");
        if (paramIntent != null)
          this.rxA = paramIntent;
        updateTitle();
        ab.d("MicroMsg.SnsTagDetailUI", "updateName " + this.rxA);
      }
      enableOptionMenu(true);
      AppMethodBeat.o(39373);
      break;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39358);
    super.onCreate(paramBundle);
    csO();
    this.scene = getIntent().getIntExtra("k_tag_detail_sns_block_scene", 0);
    this.qJQ = getIntent().getLongExtra("k_sns_tag_id", 0L);
    if (this.qJQ == 4L)
      this.rxA = getString(2131303799);
    while (this.qJQ == 0L)
    {
      Object localObject = getIntent().getStringExtra("k_sns_tag_list");
      this.rxA = bo.bc(getIntent().getStringExtra("k_sns_tag_name"), "");
      bd localbd = af.cnt();
      paramBundle = r.Yz();
      localObject = bo.P(((String)localObject).split(","));
      if (localObject == null)
        break label261;
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        if ((!this.kPL.contains(localObject)) && (com.tencent.mm.n.a.jh(localbd.aoO((String)localObject).field_type)) && (!paramBundle.equals(localObject)))
          this.kPL.add(localObject);
      }
      if (this.qJQ == 5L)
        this.rxA = getString(2131303811);
      else
        this.rxA = af.cnL().kF(this.qJQ).field_tagName;
    }
    this.kPL = csS();
    label261: if ((this.rxA == null) || (this.rxA.equals("")))
    {
      this.rxA = getString(2131303798);
      this.rxA = aj.XZ(getString(2131303798));
    }
    initView();
    ctU();
    updateTitle();
    if (this.qJQ < 6L)
    {
      this.ehK.aqP("delete_tag_name");
      this.ehK.aqP("delete_tag_name_category");
      if (this.qJQ > 0L)
      {
        this.ehK.aqP("settings_tag_name");
        this.ehK.aqP("settings_tag_name_category");
      }
    }
    if (this.qJQ == 4L)
    {
      this.ehK.aqP("black");
      this.ehK.aqP("group");
      if (this.qJQ != 0L)
        break label552;
      enableOptionMenu(true);
    }
    while (true)
    {
      this.cvZ = (this.rxA + " " + bo.c(this.kPL, ","));
      AppMethodBeat.o(39358);
      return;
      if (this.qJQ == 5L)
      {
        this.ehK.aqP("outside");
        this.ehK.aqP("group");
        break;
      }
      this.ehK.aqP("black");
      this.ehK.aqP("outside");
      break;
      label552: enableOptionMenu(false);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39360);
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    csP();
    super.onDestroy();
    AppMethodBeat.o(39360);
  }

  public void onResume()
  {
    AppMethodBeat.i(39361);
    super.onResume();
    ctU();
    AppMethodBeat.o(39361);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(39374);
    ab.i("MicroMsg.SnsTagDetailUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.tipDialog != null)
      this.tipDialog.dismiss();
    switch (paramm.getType())
    {
    default:
    case 291:
    case 290:
    case 292:
    }
    while (true)
    {
      AppMethodBeat.o(39374);
      while (true)
      {
        return;
        finish();
        AppMethodBeat.o(39374);
        continue;
        finish();
        AppMethodBeat.o(39374);
      }
      if ((this.ehS != null) && (this.rxB) && (!(this instanceof SnsBlackDetailUI)))
      {
        ab.d("MicroMsg.SnsTagDetailUI", "update form net");
        paramString = (v)paramm;
        this.cvZ = (this.rxA + " " + bo.c(paramString.kk(this.qJQ), ","));
        new LinkedList();
        paramString = this.kPL;
        this.kPL = csS();
        if (paramString != null)
        {
          paramString = paramString.iterator();
          while (paramString.hasNext())
          {
            paramm = (String)paramString.next();
            if (!this.kPL.contains(paramm))
              this.kPL.add(paramm);
          }
        }
        this.ehS.ci(this.kPL);
        this.ehS.notifyChanged();
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void updateTitle()
  {
    AppMethodBeat.i(39363);
    setMMTitle(this.rxA + "(" + this.kPL.size() + ")");
    AppMethodBeat.o(39363);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTagDetailUI
 * JD-Core Version:    0.6.2
 */