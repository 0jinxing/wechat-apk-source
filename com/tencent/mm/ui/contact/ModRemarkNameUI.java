package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.e.k;
import com.tencent.mm.pluginsdk.ui.tools.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bv;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTagPanel;
import java.util.ArrayList;

public class ModRemarkNameUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private String cIS;
  private ad ehM;
  private int gwP;
  private String hHV;
  private bv pCq;
  private ArrayList<String> plC;
  private String pml;
  private MMTagPanel ppy;
  private TextView zlL;
  private View zlM;
  private View zlN;
  private TextView zlV;
  private EditText znO;
  private int znP;
  private String znQ;
  private TextView znR;
  private EditText znS;
  private TextView znT;
  private String znU;
  private boolean znV;
  private ModRemarkNameUI.a znW;
  private View znX;

  public ModRemarkNameUI()
  {
    AppMethodBeat.i(33752);
    this.znQ = "";
    this.hHV = "";
    this.znR = null;
    this.znS = null;
    this.znT = null;
    this.znU = "";
    this.znV = false;
    this.gwP = 9;
    this.znW = new ModRemarkNameUI.a(this, (byte)0);
    AppMethodBeat.o(33752);
  }

  private boolean JO()
  {
    AppMethodBeat.i(33757);
    String str = this.ehM.field_nickname;
    boolean bool;
    if ((ah.isNullOrNil(str)) || (str.length() > 50))
    {
      bool = false;
      AppMethodBeat.o(33757);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(33757);
    }
  }

  private void dIi()
  {
    AppMethodBeat.i(33756);
    com.tencent.mm.plugin.account.friend.a.a locala = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(this.ehM.field_username);
    if ((locala == null) || (ah.isNullOrNil(locala.apA())) || (locala.apA().equals(this.znO.getText())))
      AppMethodBeat.o(33756);
    while (true)
    {
      return;
      this.zlL = ((TextView)findViewById(2131823122));
      this.zlM = findViewById(2131823121);
      this.zlM.setVisibility(0);
      this.zlL.setText(ah.nullAsNil(getString(2131298672, new Object[] { locala.apA() })));
      k localk = new k(getString(2131305682));
      localk.setSpan(new ModRemarkNameUI.c(this, locala.apA()), 0, localk.length(), 17);
      this.zlL.append(" ");
      this.zlL.append(localk);
      this.zlL.setMovementMethod(LinkMovementMethod.getInstance());
      AppMethodBeat.o(33756);
    }
  }

  public final int getLayoutId()
  {
    return 2130970241;
  }

  public final void initView()
  {
    AppMethodBeat.i(33754);
    this.cIS = getIntent().getStringExtra("Contact_User");
    if ((this.cIS != null) && (this.cIS.length() > 0))
    {
      aw.ZK();
      this.ehM = com.tencent.mm.model.c.XM().aoO(this.cIS);
      aw.ZK();
      this.pCq = com.tencent.mm.model.c.XN().RB(this.cIS);
      if ((this.ehM == null) || (ah.isNullOrNil(this.ehM.field_username)))
      {
        this.ehM = new ad(this.cIS);
        this.ehM.iB(ah.nullAsNil(this.znQ));
        this.ehM.iz(ah.nullAsNil(this.hHV));
      }
    }
    this.znO = ((EditText)findViewById(2131823119));
    ModRemarkNameUI.1 local1 = new ModRemarkNameUI.1(this);
    Object localObject = new g.a();
    ((g.a)localObject).vuS = local1;
    this.znO.addTextChangedListener((TextWatcher)localObject);
    com.tencent.mm.ui.tools.b.c.d(this.znO).PM(100).a(null);
    if ((this.ehM != null) && (this.znP != 3))
    {
      if (this.znP == 4)
      {
        this.znO.setText(j.b(this, ah.nullAsNil(this.znQ), this.znO.getTextSize()));
        this.znO.setSelection(this.znO.getText().length());
      }
    }
    else
    {
      if (this.znP != 0)
        break label919;
      setMMTitle(2131298589);
      dIi();
      label285: addTextOptionMenu(0, getString(2131297038), new ModRemarkNameUI.2(this));
      if ((this.znO == null) || (this.znO.getText().toString().trim().length() <= 0))
        break label1052;
      enableOptionMenu(true);
    }
    while (true)
    {
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(33746);
          ModRemarkNameUI.this.finish();
          AppMethodBeat.o(33746);
          return true;
        }
      });
      this.znR = ((TextView)findViewById(2131823130));
      this.znS = ((EditText)findViewById(2131823128));
      this.znT = ((TextView)findViewById(2131823129));
      this.zlN = findViewById(2131823127);
      com.tencent.mm.ui.tools.b.c.d(this.znS).PM(800).a(null);
      this.znT.setText(com.tencent.mm.ui.tools.f.bP(800, this.znS.getEditableText().toString()));
      this.znS.append(j.b(this, ah.nullAsNil(this.znU), this.znS.getTextSize()));
      this.znR.append(j.b(this, ah.nullAsNil(this.znU), this.znR.getTextSize()));
      if (this.pCq != null)
      {
        this.znS.setText(j.b(this, ah.nullAsNil(this.pCq.field_conDescription), this.znS.getTextSize()));
        this.znR.setText(j.b(this, ah.nullAsNil(this.pCq.field_conDescription), this.znS.getTextSize()));
      }
      this.znS.addTextChangedListener(new ModRemarkNameUI.b(this, (byte)0));
      this.znR.setOnClickListener(new ModRemarkNameUI.4(this));
      AppMethodBeat.o(33754);
      return;
      if (!ah.isNullOrNil(this.ehM.field_conRemark))
      {
        if ((this.znP == 0) && (!ah.isNullOrNil(this.hHV)))
        {
          this.znO.setText(j.b(this, this.hHV, this.znO.getTextSize()));
          break;
        }
        this.znO.setText(j.b(this, ah.nullAsNil(this.ehM.field_conRemark), this.znO.getTextSize()));
        break;
      }
      if (!ah.isNullOrNil(this.hHV))
      {
        this.znO.setText(j.b(this, ah.nullAsNil(this.hHV), this.znO.getTextSize()));
        break;
      }
      if (!ah.isNullOrNil(this.ehM.field_nickname))
      {
        if ((this.znP == 0) && (!ah.isNullOrNil(this.znQ)) && (!com.tencent.mm.n.a.jh(this.ehM.field_type)))
        {
          this.znO.setText(j.b(this, ah.nullAsNil(this.znQ), this.znO.getTextSize()));
          break;
        }
        this.znO.setText(j.b(this, ah.nullAsNil(this.ehM.field_nickname), this.znO.getTextSize()));
        break;
      }
      if (!ah.isNullOrNil(this.znQ))
      {
        this.znO.setText(j.b(this, ah.nullAsNil(this.znQ), this.znO.getTextSize()));
        break;
      }
      if (JO())
      {
        this.znO.setText(j.b(this, ah.nullAsNil(this.ehM.Oj()), this.znO.getTextSize()));
        break;
      }
      this.znO.setText("");
      break;
      label919: if (this.znP == 3)
      {
        setMMTitle(2131303991);
        this.znO.setHint("");
        if (!ah.isNullOrNil(this.znQ))
          this.znO.setText(this.znQ);
        localObject = (TextView)findViewById(2131823118);
        ((TextView)localObject).setText(2131302971);
        ((TextView)localObject).setVisibility(0);
        findViewById(2131826139).setVisibility(8);
        break label285;
      }
      if (this.znP != 4)
        break label285;
      setMMTitle(2131302580);
      this.znO.setHint("");
      localObject = (TextView)findViewById(2131823118);
      ((TextView)localObject).setText(2131302630);
      ((TextView)localObject).setVisibility(0);
      break label285;
      label1052: enableOptionMenu(false);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(33753);
    super.onCreate(paramBundle);
    this.gwP = getIntent().getIntExtra("Contact_Scene", 9);
    this.znP = getIntent().getIntExtra("Contact_mode_name_type", 0);
    this.znQ = ah.nullAsNil(getIntent().getStringExtra("Contact_Nick"));
    this.hHV = ah.nullAsNil(getIntent().getStringExtra("Contact_RemarkName"));
    this.znV = getIntent().getBooleanExtra("Contact_ModStrangerRemark", true);
    initView();
    this.znX = findViewById(2131826138);
    int j;
    if (this.znP != 0)
    {
      this.znX.setVisibility(8);
      this.ppy = ((MMTagPanel)findViewById(2131823125));
      this.ppy.setPanelClickable(false);
      this.zlV = ((TextView)findViewById(2131823124));
      this.zlV.setText(2131301480);
      this.ppy.setOnClickListener(this.znW);
      this.zlV.setOnClickListener(this.znW);
      if ((this.ehM == null) || (!ad.aox(this.ehM.field_username)))
        break label243;
      j = 1;
      label214: if (j == 0)
        break label313;
      if (this.znO != null)
        break label248;
      AppMethodBeat.o(33753);
    }
    while (true)
    {
      return;
      this.znX.setVisibility(0);
      break;
      label243: j = 0;
      break label214;
      label248: ViewGroup localViewGroup = (ViewGroup)this.znO.getParent();
      int k = localViewGroup.getChildCount();
      for (j = i; j < k; j++)
      {
        paramBundle = localViewGroup.getChildAt(j);
        i = paramBundle.getId();
        if ((i != 2131823118) && (i != 2131823119))
          paramBundle.setVisibility(8);
      }
      label313: AppMethodBeat.o(33753);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(33758);
    super.onDestroy();
    AppMethodBeat.o(33758);
  }

  public void onResume()
  {
    AppMethodBeat.i(33755);
    super.onResume();
    aw.ZK();
    this.pCq = com.tencent.mm.model.c.XN().RB(this.cIS);
    if (this.pCq != null)
    {
      this.pml = this.pCq.field_contactLabels;
      this.plC = ((ArrayList)com.tencent.mm.plugin.label.a.a.bJa().PF(this.pml));
    }
    if (!ah.isNullOrNil(this.pml))
    {
      this.ppy.setVisibility(0);
      this.zlV.setVisibility(8);
      if ((this.plC == null) || (this.plC.isEmpty()))
        break label150;
      this.ppy.a(this.plC, this.plC);
      AppMethodBeat.o(33755);
    }
    while (true)
    {
      return;
      this.ppy.setVisibility(8);
      this.zlV.setVisibility(0);
      label150: AppMethodBeat.o(33755);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(33759);
    ab.i("MiroMsg.ModRemarkName", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paramm.getType() == 44)
    {
      if ((paramInt1 != 0) && (paramInt2 < 0))
      {
        ab.d("MiroMsg.ModRemarkName", "addRoomCard Error!");
        Toast.makeText(this, getString(2131302619, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      }
      finish();
    }
    AppMethodBeat.o(33759);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ModRemarkNameUI
 * JD-Core Version:    0.6.2
 */