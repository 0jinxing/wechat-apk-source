package com.tencent.mm.plugin.label.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.label.b.d;
import com.tencent.mm.plugin.label.c;
import com.tencent.mm.plugin.label.e;
import com.tencent.mm.plugin.label.ui.widget.MMLabelPanel;
import com.tencent.mm.protocal.protobuf.cmh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.af;
import com.tencent.mm.storage.ai;
import com.tencent.mm.ui.base.MMTagPanel.a;
import com.tencent.mm.ui.base.MMTagPanelScrollView;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class ContactLabelUI extends ContactLabelBaseUI
  implements com.tencent.mm.ai.f
{
  private String edV;
  private MMTagPanelScrollView nIC;
  private MMLabelPanel nID;
  private TextView nIE;
  private View nIF;
  private View nIG;
  private TextView nIH;
  private MMLabelPanel nII;
  private ListView nIJ;
  private ScrollView nIK;
  private b nIL;
  private String nIM;
  private ArrayList<String> nIN;
  private HashSet<String> nIO;
  private HashSet<String> nIP;
  private ArrayList<String> nIQ;
  private ContactLabelUI.a nIR;
  private boolean nIS;
  private ArrayList<String> nIT;
  private boolean nId;

  public ContactLabelUI()
  {
    AppMethodBeat.i(22680);
    this.nIO = new HashSet();
    this.nIP = new HashSet();
    this.nIQ = new ArrayList();
    this.nIR = ContactLabelUI.a.nIW;
    this.nIS = false;
    this.nId = true;
    AppMethodBeat.o(22680);
  }

  private void a(ContactLabelUI.a parama)
  {
    AppMethodBeat.i(22688);
    this.nIR = parama;
    switch (ContactLabelUI.4.nIV[this.nIR.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(22688);
      while (true)
      {
        return;
        this.nIJ.setVisibility(8);
        if ((this.nIQ != null) && (this.nIQ.size() > 0))
        {
          this.nIF.setVisibility(0);
          this.nIK.setVisibility(0);
        }
        while (true)
        {
          this.nIE.setVisibility(8);
          AppMethodBeat.o(22688);
          break;
          this.nIK.setVisibility(8);
          this.nIF.setVisibility(8);
        }
        this.nIK.setVisibility(8);
        this.nIJ.setVisibility(0);
        this.nIF.setVisibility(8);
        this.nIE.setVisibility(8);
        AppMethodBeat.o(22688);
        continue;
        this.nIJ.setVisibility(8);
        this.nIK.setVisibility(8);
        this.nIF.setVisibility(8);
        this.nIE.setVisibility(0);
        this.nIE.setText(2131300895);
        AppMethodBeat.o(22688);
      }
      this.nIJ.setVisibility(8);
      this.nIK.setVisibility(8);
      this.nIF.setVisibility(8);
      this.nIE.setVisibility(0);
      this.nIE.setText(2131300895);
    }
  }

  private void aR(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(22689);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.Label.ContactLabelUI", "tag is empty");
      AppMethodBeat.o(22689);
    }
    while (true)
    {
      return;
      paramString = paramString.trim();
      if (!bo.isNullOrNil(paramString))
        break;
      ab.w("MicroMsg.Label.ContactLabelUI", "new tag is empty");
      AppMethodBeat.o(22689);
    }
    af localaf = e.bIZ().aoE(paramString);
    if (paramBoolean)
      if ((this.nIQ == null) || (!this.nIQ.contains(paramString)) || (localaf == null))
        this.nIP.add(paramString);
    while (true)
    {
      if ((this.nIO != null) && (this.nIO.contains(paramString)))
        this.nIO.remove(paramString);
      if (bJn())
        enableOptionMenu(true);
      AppMethodBeat.o(22689);
      break;
      if ((this.nIQ == null) || (!this.nIQ.contains(paramString)) || ((localaf != null) && (localaf.field_isTemporary)))
        this.nIP.add(paramString);
    }
  }

  private void bJf()
  {
    AppMethodBeat.i(22692);
    bJc();
    JN(getString(2131296405));
    AppMethodBeat.o(22692);
  }

  private void bJl()
  {
    AppMethodBeat.i(22690);
    ab.i("MicroMsg.Label.ContactLabelUI", "cpan[saveContact]");
    if (this.nID != null)
    {
      ab.i("MicroMsg.Label.ContactLabelUI", "cpan[saveContact] doScene");
      Object localObject1 = "";
      Object localObject2 = this.nID.getTagList();
      Object localObject3 = localObject1;
      if (localObject2 != null)
      {
        localObject3 = localObject1;
        if (((ArrayList)localObject2).size() > 0)
          localObject3 = c.cf(e.bIZ().ai((ArrayList)localObject2));
      }
      localObject2 = new LinkedList();
      localObject1 = new cmh();
      ((cmh)localObject1).wcD = ((String)localObject3);
      ((cmh)localObject1).jBB = this.edV;
      ((LinkedList)localObject2).add(localObject1);
      localObject3 = new d((LinkedList)localObject2);
      aw.Rg().a((m)localObject3, 0);
      if (this.nIP == null)
        break label334;
    }
    label334: for (int i = this.nIP.size(); ; i = 0)
    {
      if (this.nIN != null);
      for (int j = this.nIN.size(); ; j = 0)
      {
        if (this.nIO != null);
        for (int k = this.nIO.size(); ; k = 0)
        {
          j = k + this.nID.getTagList().size() - j - i;
          if ((i > 0) || (j > 0))
          {
            ab.d("MicroMsg.Label.ContactLabelUI", "cpan[saveContact]addLabelNum:%d,updateLabelNum:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            com.tencent.mm.plugin.report.service.h.pYm.e(11220, new Object[] { r.Yz(), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(0), Integer.valueOf(0) });
          }
          if (i > 0)
            com.tencent.mm.plugin.report.service.h.pYm.e(16097, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(1) });
          AppMethodBeat.o(22690);
          return;
        }
      }
    }
  }

  private void bJm()
  {
    AppMethodBeat.i(22691);
    bJc();
    this.nIP.clear();
    this.nIO.clear();
    finish();
    AppMethodBeat.o(22691);
  }

  private boolean bJn()
  {
    boolean bool = true;
    AppMethodBeat.i(22693);
    if (this.nID != null)
      if ((this.nIN != null) && (this.nIN.size() > 0))
        if ((this.nID.getTagList() == null) && (this.nID.getTagList().size() <= 0))
          AppMethodBeat.o(22693);
    while (true)
    {
      return bool;
      ArrayList localArrayList = this.nID.getTagList();
      Collections.sort(this.nIN);
      Collections.sort(localArrayList);
      if (!this.nIN.equals(localArrayList))
      {
        AppMethodBeat.o(22693);
      }
      else
      {
        AppMethodBeat.o(22693);
        bool = false;
        continue;
        if ((this.nID.getTagList() != null) && (this.nID.getTagList().size() > 0))
        {
          AppMethodBeat.o(22693);
        }
        else
        {
          AppMethodBeat.o(22693);
          bool = false;
        }
      }
    }
  }

  public void finish()
  {
    AppMethodBeat.i(22694);
    if (this.nID != null)
      this.nID.dAd();
    Intent localIntent = new Intent();
    if (bJn())
      localIntent.putExtra("hasLableChange", true);
    while (true)
    {
      setResult(-1, localIntent);
      super.finish();
      AppMethodBeat.o(22694);
      return;
      localIntent.putExtra("hasLableChange", false);
    }
  }

  public final int getLayoutId()
  {
    return 2130969230;
  }

  public final void initView()
  {
    AppMethodBeat.i(22681);
    setMMTitle(getString(2131296408));
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(22658);
        ContactLabelUI.this.onBackPressed();
        AppMethodBeat.o(22658);
        return false;
      }
    });
    a(0, getString(2131297038), new ContactLabelUI.5(this), q.b.ymu);
    this.nIC = ((MMTagPanelScrollView)findViewById(2131823070));
    this.nIC.setMaxLine(3);
    this.nID = ((MMLabelPanel)findViewById(2131823071));
    this.nIE = ((TextView)findViewById(2131823072));
    this.nIF = findViewById(2131823074);
    this.nIG = findViewById(2131823076);
    this.nIG.setBackgroundDrawable(null);
    this.nIH = ((TextView)this.nIG.findViewById(16908310));
    this.nIH.setText(2131300894);
    this.nII = ((MMLabelPanel)findViewById(2131823077));
    this.nIJ = ((ListView)findViewById(2131823078));
    this.nIK = ((ScrollView)findViewById(2131823073));
    if (this.nIK != null)
      this.nIK.setOnTouchListener(new ContactLabelUI.6(this));
    this.nID.yxp = true;
    this.nID.qe(true);
    this.nID.setTagEditTextBG(2130840373);
    this.nID.setCallBack(new MMTagPanel.a()
    {
      public final void JR(String paramAnonymousString)
      {
        AppMethodBeat.i(22664);
        ab.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagUnSelected] tag:%s", new Object[] { paramAnonymousString });
        ContactLabelUI.b(ContactLabelUI.this).removeTag(paramAnonymousString);
        if (ContactLabelUI.c(ContactLabelUI.this) != null)
          ContactLabelUI.c(ContactLabelUI.this).cd(paramAnonymousString, false);
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString);
        AppMethodBeat.o(22664);
      }

      public final void JS(String paramAnonymousString)
      {
        AppMethodBeat.i(22665);
        ab.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagSelected] tag:%s", new Object[] { paramAnonymousString });
        AppMethodBeat.o(22665);
      }

      public final void JT(String paramAnonymousString)
      {
        AppMethodBeat.i(22666);
        ab.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagRemove] tag:%s", new Object[] { paramAnonymousString });
        if (ContactLabelUI.c(ContactLabelUI.this) != null)
          ContactLabelUI.c(ContactLabelUI.this).cd(paramAnonymousString, false);
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString);
        AppMethodBeat.o(22666);
      }

      public final void JU(String paramAnonymousString)
      {
        AppMethodBeat.i(22668);
        ab.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagEditTextChange] curText:%s", new Object[] { paramAnonymousString });
        ContactLabelUI.b(ContactLabelUI.this, paramAnonymousString);
        AppMethodBeat.o(22668);
      }

      public final void JV(String paramAnonymousString)
      {
        AppMethodBeat.i(22669);
        ab.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagCreate] tag:%s", new Object[] { String.valueOf(paramAnonymousString) });
        if (bo.isNullOrNil(paramAnonymousString))
        {
          ab.d("MicroMsg.Label.ContactLabelUI", "tag is null.");
          AppMethodBeat.o(22669);
        }
        while (true)
        {
          return;
          ContactLabelUI.b(ContactLabelUI.this).cc(paramAnonymousString, true);
          if (ContactLabelUI.c(ContactLabelUI.this) != null)
            ContactLabelUI.c(ContactLabelUI.this).cd(paramAnonymousString, true);
          ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString, ContactLabelUI.d(ContactLabelUI.this));
          AppMethodBeat.o(22669);
        }
      }

      public final void bmm()
      {
        AppMethodBeat.i(22667);
        ab.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagEditTextClick]");
        AppMethodBeat.o(22667);
      }

      public final void q(boolean paramAnonymousBoolean, int paramAnonymousInt)
      {
        AppMethodBeat.i(22670);
        ab.d("MicroMsg.Label.ContactLabelUI", "cpan[Input onTagLengthMax] match:%s exceedCount:%d", new Object[] { String.valueOf(paramAnonymousBoolean), Integer.valueOf(paramAnonymousInt) });
        if (paramAnonymousBoolean)
        {
          ContactLabelUI.this.enableOptionMenu(false);
          ContactLabelUI.e(ContactLabelUI.this).setVisibility(0);
          ContactLabelUI.e(ContactLabelUI.this).setText(2131300895);
          ContactLabelUI.e(ContactLabelUI.this).setText(String.format(ContactLabelUI.this.getString(2131300895), new Object[] { Integer.valueOf(com.tencent.mm.ui.tools.f.bP(36, "")), Integer.valueOf(paramAnonymousInt) }));
          AppMethodBeat.o(22670);
        }
        while (true)
        {
          return;
          ContactLabelUI.this.enableOptionMenu(true);
          ContactLabelUI.e(ContactLabelUI.this).setVisibility(8);
          AppMethodBeat.o(22670);
        }
      }
    });
    this.nII.qe(false);
    this.nII.setCallBack(new MMTagPanel.a()
    {
      public final void JR(String paramAnonymousString)
      {
        AppMethodBeat.i(22671);
        ab.d("MicroMsg.Label.ContactLabelUI", "cpan[All onTagUnSelected] tag:%s", new Object[] { String.valueOf(paramAnonymousString) });
        if (ContactLabelUI.b(ContactLabelUI.this) != null)
          ContactLabelUI.b(ContactLabelUI.this).removeTag(paramAnonymousString);
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString);
        AppMethodBeat.o(22671);
      }

      public final void JS(String paramAnonymousString)
      {
        AppMethodBeat.i(22672);
        ab.d("MicroMsg.Label.ContactLabelUI", "cpan[All onTagSelected] tag:%s", new Object[] { String.valueOf(paramAnonymousString) });
        if (ContactLabelUI.b(ContactLabelUI.this) != null)
          ContactLabelUI.b(ContactLabelUI.this).cc(paramAnonymousString, true);
        ContactLabelUI.a(ContactLabelUI.this, paramAnonymousString, ContactLabelUI.d(ContactLabelUI.this));
        AppMethodBeat.o(22672);
      }

      public final void JT(String paramAnonymousString)
      {
      }

      public final void JU(String paramAnonymousString)
      {
      }

      public final void JV(String paramAnonymousString)
      {
      }

      public final void bmm()
      {
      }

      public final void q(boolean paramAnonymousBoolean, int paramAnonymousInt)
      {
      }
    });
    this.nIJ.setAdapter(this.nIL);
    this.nIJ.setOnItemClickListener(new ContactLabelUI.9(this));
    enableOptionMenu(false);
    AppMethodBeat.o(22681);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(22687);
    if (bJn())
    {
      com.tencent.mm.ui.base.h.d(this, getString(2131302710), "", getString(2131297761), getString(2131297762), new ContactLabelUI.2(this), new ContactLabelUI.3(this));
      AppMethodBeat.o(22687);
    }
    while (true)
    {
      return;
      super.onBackPressed();
      AppMethodBeat.o(22687);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22682);
    super.onCreate(paramBundle);
    this.nIM = getIntent().getStringExtra("label_id_list");
    this.nIN = getIntent().getStringArrayListExtra("label_str_list");
    this.edV = getIntent().getStringExtra("label_username");
    this.nIS = getIntent().getBooleanExtra("is_stranger", false);
    this.nIL = new b(this);
    initView();
    if ((!bo.isNullOrNil(this.nIM)) && (this.nIN != null) && (this.nIN.size() > 0))
      this.nID.a(this.nIN, this.nIN);
    if (this.nIS)
    {
      this.nIT = getIntent().getStringArrayListExtra("label_str_list");
      this.nID.a(this.nIT, this.nIT);
    }
    com.tencent.mm.plugin.report.service.h.pYm.e(16097, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1) });
    AppMethodBeat.o(22682);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22685);
    super.onDestroy();
    AppMethodBeat.o(22685);
  }

  public void onPause()
  {
    AppMethodBeat.i(22684);
    aw.Rg().b(635, this);
    aw.Rg().b(638, this);
    super.onPause();
    AppMethodBeat.o(22684);
  }

  public void onResume()
  {
    AppMethodBeat.i(22683);
    aw.Rg().a(635, this);
    aw.Rg().a(638, this);
    al.d(new ContactLabelUI.12(this));
    super.onResume();
    AppMethodBeat.o(22683);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(22686);
    ab.i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paramm.getType())
    {
    case 636:
    case 637:
    default:
      ab.w("MicroMsg.Label.ContactLabelUI", "unknow type.");
      AppMethodBeat.o(22686);
    case 635:
    case 638:
    }
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        bJl();
        AppMethodBeat.o(22686);
      }
      else
      {
        bJf();
        AppMethodBeat.o(22686);
        continue;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          ab.i("MicroMsg.Label.ContactLabelUI", "cpan[onSceneEnd] success.");
          bJm();
          AppMethodBeat.o(22686);
        }
        else
        {
          bJf();
          AppMethodBeat.o(22686);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelUI
 * JD-Core Version:    0.6.2
 */