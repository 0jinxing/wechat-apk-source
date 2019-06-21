package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.e.k;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.protocal.protobuf.bck;
import com.tencent.mm.protocal.protobuf.bkf;
import com.tencent.mm.protocal.protobuf.bkg;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMClearEditText;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ContactRemarkInfoModUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private String bCv;
  private String dul;
  private ad ehM;
  private String fNa;
  private ProgressDialog fsh;
  private int gwP;
  private String nIM;
  private n.b ppA;
  private MMTagPanel ppy;
  private List<String> ppz;
  private String username;
  private String vrd;
  private MMClearEditText zlC;
  private TextView zlD;
  private MMEditText zlE;
  private TextView zlF;
  private TextView zlG;
  private TextView zlH;
  private TextView zlI;
  private ImageView zlJ;
  private ImageView zlK;
  private TextView zlL;
  private View zlM;
  private View zlN;
  private String zlO;
  private boolean zlP;
  private boolean zlQ;
  private boolean zlR;
  private boolean zlS;
  private boolean zlT;
  private ContactRemarkInfoModUI.a zlU;
  private TextView zlV;
  private ScrollView zlW;
  private ProfileEditPhoneNumberView zlX;
  private String zlY;
  private String zlZ;
  private TextWatcher zma;
  private ContactRemarkInfoModUI.b zmb;
  private String zmc;
  boolean zmd;
  boolean zme;
  private boolean zmf;

  public ContactRemarkInfoModUI()
  {
    AppMethodBeat.i(33651);
    this.zlP = false;
    this.zlQ = false;
    this.zlR = false;
    this.zlS = false;
    this.zlT = false;
    this.zlU = new ContactRemarkInfoModUI.a(this, (byte)0);
    this.zma = new ContactRemarkInfoModUI.1(this);
    this.zmb = new ContactRemarkInfoModUI.b(this, (byte)0);
    this.ppA = new ContactRemarkInfoModUI.10(this);
    this.zmd = true;
    this.zme = false;
    this.zmf = false;
    AppMethodBeat.o(33651);
  }

  private void I(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(33657);
    if (this.zlR)
    {
      this.zlF.setVisibility(8);
      if ((paramBoolean) && (ah.isNullOrNil(this.dul)))
      {
        this.zlG.setVisibility(0);
        this.zlN.setVisibility(8);
      }
    }
    label132: 
    while (true)
    {
      this.zlC.setVisibility(0);
      AppMethodBeat.o(33657);
      while (true)
      {
        return;
        if (paramInt != 2131823130)
          break label132;
        this.zlG.setVisibility(8);
        this.zlN.setVisibility(0);
        break;
        this.zlF.setVisibility(0);
        this.zlG.setVisibility(0);
        this.zlC.setVisibility(8);
        this.zlN.setVisibility(8);
        AppMethodBeat.o(33657);
      }
    }
  }

  private void JZ()
  {
    AppMethodBeat.i(33652);
    ProfileEditPhoneNumberView localProfileEditPhoneNumberView = this.zlX;
    Object localObject = localProfileEditPhoneNumberView.getPhoneNumberList();
    boolean bool;
    if ((localObject == null) || (((ArrayList)localObject).isEmpty()))
    {
      if (localProfileEditPhoneNumberView.vio == null)
        break label159;
      bool = true;
      this.zmf = bool;
      if ((!dHM()) && (!dHN()) && (!qD(false)) && (!this.zmf))
        break label164;
      enableOptionMenu(true);
      AppMethodBeat.o(33652);
    }
    while (true)
    {
      return;
      if (localProfileEditPhoneNumberView.vio == null)
      {
        bool = true;
        break;
      }
      if (((ArrayList)localObject).size() != localProfileEditPhoneNumberView.vio.length)
      {
        bool = true;
        break;
      }
      localObject = ((ArrayList)localObject).iterator();
      for (int i = 0; ; i++)
      {
        if (!((Iterator)localObject).hasNext())
          break label159;
        if (!((String)((Iterator)localObject).next()).equals(localProfileEditPhoneNumberView.vio[i]))
        {
          bool = true;
          break;
        }
      }
      label159: bool = false;
      break;
      label164: enableOptionMenu(false);
      AppMethodBeat.o(33652);
    }
  }

  private void arO(String paramString)
  {
    AppMethodBeat.i(33662);
    if (ah.isNullOrNil(paramString))
      AppMethodBeat.o(33662);
    while (true)
    {
      return;
      paramString = new com.tencent.mm.vfs.b(paramString);
      if (!paramString.exists())
      {
        AppMethodBeat.o(33662);
      }
      else if (paramString.length() > 204800L)
      {
        h.b(this, getString(2131298486), null, true);
        AppMethodBeat.o(33662);
      }
      else
      {
        float f = com.tencent.mm.bz.a.getDensity(this);
        paramString = BackwardSupportUtil.b.i(this.zlO, f);
        if (paramString != null)
        {
          this.zlH.setVisibility(8);
          this.zlK.setVisibility(8);
          this.zlJ.setVisibility(0);
          this.zlJ.setImageBitmap(paramString);
          this.zlP = true;
        }
        AppMethodBeat.o(33662);
      }
    }
  }

  private String arP(String paramString)
  {
    AppMethodBeat.i(33674);
    if (!e.ct(paramString))
    {
      AppMethodBeat.o(33674);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      int i = BackwardSupportUtil.ExifHelper.bJ(paramString);
      Object localObject = new StringBuilder();
      com.tencent.mm.bc.c.aiB();
      localObject = com.tencent.mm.bc.c.sW(this.username) + ".tmp";
      if (!d.a(paramString, 960, 960, Bitmap.CompressFormat.JPEG, 70, (String)localObject))
      {
        ab.e("MiroMsg.ContactRemarkInfoModUI", "createThumbNail big pic fail");
        AppMethodBeat.o(33674);
        paramString = null;
      }
      else if ((i != 0) && (!d.a((String)localObject, i, Bitmap.CompressFormat.JPEG, 70, (String)localObject)))
      {
        ab.e("MiroMsg.ContactRemarkInfoModUI", "rotate big pic fail");
        AppMethodBeat.o(33674);
        paramString = null;
      }
      else
      {
        AppMethodBeat.o(33674);
        paramString = (String)localObject;
      }
    }
  }

  private void cbA()
  {
    AppMethodBeat.i(33675);
    if (!ah.isNullOrNil(this.nIM))
    {
      this.ppy.setVisibility(0);
      this.zlV.setVisibility(8);
      this.ppy.a(this.ppz, this.ppz);
      AppMethodBeat.o(33675);
    }
    while (true)
    {
      return;
      this.ppy.setVisibility(8);
      this.zlV.setVisibility(0);
      AppMethodBeat.o(33675);
    }
  }

  private boolean cbB()
  {
    AppMethodBeat.i(33663);
    com.tencent.mm.plugin.account.friend.a.a locala = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(this.ehM.field_username);
    if ((locala == null) || (ah.isNullOrNil(locala.apA())) || (locala.apA().equals(this.zlC.getText().toString())))
      AppMethodBeat.o(33663);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      this.zlL = ((TextView)findViewById(2131823122));
      this.zlM = findViewById(2131823121);
      this.zlM.setVisibility(0);
      this.zlL.setText(ah.nullAsNil(getString(2131298672, new Object[] { locala.apA() })));
      k localk = new k(getString(2131305682));
      localk.setSpan(new ContactRemarkInfoModUI.c(this, locala.apA()), 0, localk.length(), 17);
      this.zlL.append(" ");
      this.zlL.append(localk);
      this.zlL.setMovementMethod(LinkMovementMethod.getInstance());
      AppMethodBeat.o(33663);
    }
  }

  private void cbz()
  {
    AppMethodBeat.i(33676);
    aw.ZK();
    this.ehM = com.tencent.mm.model.c.XM().aoO(this.username);
    this.nIM = this.ehM.field_contactLabelIds;
    this.ppz = com.tencent.mm.plugin.label.a.a.bJa().PG(this.nIM);
    cbA();
    AppMethodBeat.o(33676);
  }

  private void dHH()
  {
    AppMethodBeat.i(33659);
    this.zlD.setFocusableInTouchMode(true);
    this.zlD.requestFocus();
    this.zlC.clearFocus();
    this.zlE.clearFocus();
    this.zlX.clearFocus();
    aqX();
    AppMethodBeat.o(33659);
  }

  private void dHI()
  {
    AppMethodBeat.i(33660);
    com.tencent.mm.bc.c.aiB();
    if (!com.tencent.mm.bc.c.sX(this.username))
    {
      com.tencent.mm.bc.c.aiB().a(this.username, this.fNa, new com.tencent.mm.bc.c.a()
      {
        public final void cP(boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(33634);
          ContactRemarkInfoModUI.u(ContactRemarkInfoModUI.this).post(new ContactRemarkInfoModUI.6.1(this, paramAnonymousBoolean));
          AppMethodBeat.o(33634);
        }
      });
      AppMethodBeat.o(33660);
    }
    while (true)
    {
      return;
      dHJ();
      AppMethodBeat.o(33660);
    }
  }

  private void dHJ()
  {
    AppMethodBeat.i(33661);
    com.tencent.mm.bc.c.aiB();
    Bitmap localBitmap = com.tencent.mm.bc.c.sZ(this.username);
    if (localBitmap != null)
    {
      this.zlH.setVisibility(8);
      this.zlK.setVisibility(8);
      this.zlJ.setVisibility(0);
      this.zlJ.setImageBitmap(localBitmap);
    }
    this.zlP = true;
    AppMethodBeat.o(33661);
  }

  private boolean dHK()
  {
    AppMethodBeat.i(33664);
    if ((this.gwP != 14) || (ah.isNullOrNil(this.vrd)) || (this.vrd.equals(this.zlC.getText().toString())))
      AppMethodBeat.o(33664);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      this.zlL = ((TextView)findViewById(2131823122));
      this.zlM = findViewById(2131823121);
      this.zlM.setVisibility(0);
      this.zlL.setText(j.b(this, ah.nullAsNil(getString(2131298671, new Object[] { this.vrd })), this.zlL.getTextSize()));
      k localk = new k(getString(2131305682));
      localk.setSpan(new ContactRemarkInfoModUI.c(this, this.vrd), 0, localk.length(), 17);
      this.zlL.append(" ");
      this.zlL.append(localk);
      this.zlL.setMovementMethod(LinkMovementMethod.getInstance());
      AppMethodBeat.o(33664);
    }
  }

  private void dHL()
  {
    AppMethodBeat.i(33665);
    if (!this.zmf)
      AppMethodBeat.o(33665);
    while (true)
    {
      return;
      bck localbck = new bck();
      localbck.wGA = this.username;
      Object localObject1 = new bkg();
      Object localObject2 = this.zlX.getPhoneNumberList();
      if (localObject2 == null);
      Iterator localIterator;
      for (int i = 0; ; i = ((ArrayList)localObject2).size())
      {
        ((bkg)localObject1).jBv = i;
        ((bkg)localObject1).wNu = new LinkedList();
        if (localObject2 == null)
          break;
        localIterator = ((ArrayList)localObject2).iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          bkf localbkf = new bkf();
          localbkf.wNt = str;
          ((bkg)localObject1).wNu.add(localbkf);
        }
      }
      localbck.wGw = ((bkg)localObject1);
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new j.a(60, localbck));
      aw.ZK();
      localObject1 = com.tencent.mm.model.c.XM().aoO(this.username);
      if ((localObject1 != null) && ((int)((com.tencent.mm.n.a)localObject1).ewQ > 0) && (com.tencent.mm.n.a.jh(((ap)localObject1).field_type)))
      {
        if (localObject2 != null)
        {
          localIterator = ((ArrayList)localObject2).iterator();
          for (localObject2 = ""; ; localObject2 = (String)localObject2 + ",")
          {
            localObject1 = localObject2;
            if (!localIterator.hasNext())
              break;
            localObject1 = (String)localIterator.next();
            localObject2 = (String)localObject2 + (String)localObject1;
          }
        }
        localObject1 = "";
        ab.i("MiroMsg.ContactRemarkInfoModUI", "[dealModPhoneNumberList] username:%s %s", new Object[] { this.username, localObject1 });
        this.ehM.jd((String)localObject1);
        aw.ZK();
        com.tencent.mm.model.c.XM().Y(this.ehM);
      }
      AppMethodBeat.o(33665);
    }
  }

  private boolean dHM()
  {
    AppMethodBeat.i(33667);
    String str = this.zlE.getText().toString();
    boolean bool;
    if (((this.dul == null) || (!this.dul.equals(str))) && ((!ah.isNullOrNil(this.dul)) || (!ah.isNullOrNil(str))))
    {
      bool = true;
      AppMethodBeat.o(33667);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33667);
    }
  }

  private boolean dHN()
  {
    AppMethodBeat.i(33668);
    boolean bool;
    if ((!ah.isNullOrNil(this.zlO)) || (this.zlT))
    {
      bool = true;
      AppMethodBeat.o(33668);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33668);
    }
  }

  private void dHO()
  {
    AppMethodBeat.i(33672);
    this.zlT = true;
    this.zlK.setVisibility(8);
    this.zlH.setVisibility(0);
    this.zlJ.setVisibility(8);
    this.zlJ.setImageBitmap(null);
    JZ();
    AppMethodBeat.o(33672);
  }

  private void goBack()
  {
    AppMethodBeat.i(33669);
    boolean bool1 = dHN();
    boolean bool2 = qD(true);
    boolean bool3 = dHM();
    if ((bool1) || (bool2) || (bool3))
    {
      h.d(this, getString(2131298645), null, getString(2131298647), getString(2131298646), new ContactRemarkInfoModUI.9(this), new ContactRemarkInfoModUI.11(this));
      AppMethodBeat.o(33669);
    }
    while (true)
    {
      return;
      aqX();
      finish();
      AppMethodBeat.o(33669);
    }
  }

  private boolean qD(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(33666);
    String str = this.zlC.getText().toString();
    if (!paramBoolean)
      if (((this.bCv == null) || (!this.bCv.equals(str))) && ((!ah.isNullOrNil(this.bCv)) || (!ah.isNullOrNil(str))))
      {
        AppMethodBeat.o(33666);
        paramBoolean = bool;
      }
    while (true)
    {
      return paramBoolean;
      AppMethodBeat.o(33666);
      paramBoolean = false;
      continue;
      if (((this.bCv == null) || (!this.bCv.equals(str))) && ((!ah.isNullOrNil(this.bCv)) || (!ah.isNullOrNil(str))));
      for (int i = 1; ; i = 0)
      {
        if ((i == 0) || ((str != null) && (str.equals(this.ehM.field_nickname))))
          break label157;
        AppMethodBeat.o(33666);
        paramBoolean = bool;
        break;
      }
      label157: AppMethodBeat.o(33666);
      paramBoolean = false;
    }
  }

  public final int getLayoutId()
  {
    return 2130969235;
  }

  public final void initView()
  {
    AppMethodBeat.i(33658);
    this.zlD = ((TextView)findViewById(2131823118));
    this.zlF = ((TextView)findViewById(2131823120));
    this.zlG = ((TextView)findViewById(2131823130));
    this.zlH = ((TextView)findViewById(2131823131));
    this.zlC = ((MMClearEditText)findViewById(2131823119));
    this.zlE = ((MMEditText)findViewById(2131823128));
    this.zlJ = ((ImageView)findViewById(2131823133));
    this.zlK = ((ImageView)findViewById(2131823132));
    this.zlI = ((TextView)findViewById(2131823129));
    this.zlN = findViewById(2131823127);
    this.zlX = ((ProfileEditPhoneNumberView)findViewById(2131823126));
    this.zlX.ldh = this.ehM;
    this.zlX.hF(this.zlY, this.zlZ);
    this.zlX.vir = new ContactRemarkInfoModUI.12(this);
    this.ppy = ((MMTagPanel)findViewById(2131823125));
    this.ppy.setPanelClickable(false);
    this.zlW = ((ScrollView)findViewById(2131823117));
    this.zlV = ((TextView)findViewById(2131823124));
    this.zlV.setText(2131301480);
    this.ppy.setOnClickListener(this.zlU);
    this.zlV.setOnClickListener(this.zlU);
    setMMTitle(2131298589);
    if (!ah.isNullOrNil(this.bCv))
    {
      this.zlC.setText(j.b(this, ah.nullAsNil(this.bCv), this.zlC.getTextSize()));
      this.zlF.setText(j.b(this, ah.nullAsNil(this.bCv), this.zlF.getTextSize()));
      this.zlC.setSelection(this.zlC.getText().length());
      SpannableString localSpannableString = j.b(this, ah.nullAsNil(this.dul), this.zlG.getTextSize());
      this.zlE.setText(localSpannableString);
      this.zlE.setSelection(this.zlE.getText().length());
      if (!ah.isNullOrNil(this.dul))
      {
        this.zlG.setText(j.b(this, ah.nullAsNil(this.dul), this.zlG.getTextSize()));
        this.zlG.setTextColor(getResources().getColor(2131690316));
      }
      this.zlF.setOnClickListener(new ContactRemarkInfoModUI.13(this));
      this.zlG.setOnClickListener(new ContactRemarkInfoModUI.14(this));
      this.zlC.addTextChangedListener(this.zma);
      this.zlI.setText(com.tencent.mm.ui.tools.f.bP(800, this.zlE.getEditableText().toString()));
      this.zlE.setOnFocusChangeListener(new ContactRemarkInfoModUI.15(this));
      this.zlE.addTextChangedListener(this.zmb);
      if (ah.isNullOrNil(this.fNa))
        break label792;
      this.zlH.setVisibility(8);
      this.zlJ.setVisibility(0);
      dHI();
      label597: this.zlJ.setOnClickListener(new ContactRemarkInfoModUI.16(this));
      this.zlH.setOnClickListener(new ContactRemarkInfoModUI.17(this));
      if (!cbB())
        dHK();
      a(0, getString(2131296944), new ContactRemarkInfoModUI.18(this), q.b.ymu);
      setBackBtn(new ContactRemarkInfoModUI.2(this));
      if (!ah.isNullOrNil(this.bCv))
        break label812;
      enableOptionMenu(true);
    }
    while (true)
    {
      this.zlK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(33630);
          ContactRemarkInfoModUI.a(ContactRemarkInfoModUI.this, true);
          ContactRemarkInfoModUI.k(ContactRemarkInfoModUI.this);
          AppMethodBeat.o(33630);
        }
      });
      if (!this.zlS)
      {
        this.zlR = true;
        I(true, -1);
      }
      dHH();
      AppMethodBeat.o(33658);
      return;
      this.zlC.setText(j.b(this, ah.nullAsNil(this.ehM.Oi()), this.zlC.getTextSize()));
      this.zlF.setText(j.b(this, ah.nullAsNil(this.ehM.Oi()), this.zlC.getTextSize()));
      break;
      label792: this.zlH.setVisibility(0);
      this.zlJ.setVisibility(8);
      break label597;
      label812: enableOptionMenu(false);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(33671);
    ab.i("MiroMsg.ContactRemarkInfoModUI", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramIntent == null)
    {
      ab.e("MiroMsg.ContactRemarkInfoModUI", "data shouldnot be null");
      AppMethodBeat.o(33671);
    }
    while (true)
    {
      return;
      Context localContext;
      switch (paramInt1)
      {
      default:
        AppMethodBeat.o(33671);
        break;
      case 100:
        localContext = getApplicationContext();
        aw.ZK();
        paramIntent = n.h(localContext, paramIntent, com.tencent.mm.model.c.XW());
        if (paramIntent == null)
        {
          AppMethodBeat.o(33671);
        }
        else
        {
          this.zlO = arP(paramIntent);
          arO(this.zlO);
          this.zlQ = true;
          this.zlT = false;
          JZ();
          AppMethodBeat.o(33671);
        }
        break;
      case 200:
        localContext = getApplicationContext();
        aw.ZK();
        paramIntent = com.tencent.mm.ui.tools.a.i(localContext, paramIntent, com.tencent.mm.model.c.XW());
        if (paramIntent == null)
        {
          AppMethodBeat.o(33671);
        }
        else
        {
          this.zlO = arP(paramIntent);
          arO(this.zlO);
          this.zlQ = true;
          this.zlT = false;
          JZ();
          AppMethodBeat.o(33671);
        }
        break;
      case 400:
        if (paramIntent.getBooleanExtra("response_delete", false))
          dHO();
        AppMethodBeat.o(33671);
        break;
      case 600:
        if ((qD(true)) || (dHM()) || (dHN()) || (paramIntent.getBooleanExtra("hasLableChange", false)))
        {
          enableOptionMenu(true);
          AppMethodBeat.o(33671);
        }
        else
        {
          enableOptionMenu(false);
          AppMethodBeat.o(33671);
        }
        break;
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(33653);
    super.onCreate(paramBundle);
    aw.Rg().a(575, this);
    aw.Rg().a(576, this);
    this.gwP = getIntent().getIntExtra("Contact_Scene", 9);
    this.vrd = getIntent().getStringExtra("Contact_RoomNickname");
    this.zlS = getIntent().getBooleanExtra("view_mode", false);
    this.zmc = getIntent().getStringExtra("contact_auto_app_phone_from_chatting");
    this.zlY = getIntent().getStringExtra("contact_phone_number_by_md5");
    this.zlZ = getIntent().getStringExtra("contact_phone_number_list");
    this.username = getIntent().getStringExtra("Contact_User");
    if (ah.isNullOrNil(this.username))
    {
      finish();
      AppMethodBeat.o(33653);
    }
    while (true)
    {
      return;
      aw.ZK();
      this.ehM = com.tencent.mm.model.c.XM().aoO(this.username);
      this.bCv = this.ehM.field_conRemark;
      this.dul = this.ehM.dul;
      this.fNa = this.ehM.dum;
      this.nIM = this.ehM.field_contactLabelIds;
      this.ppz = com.tencent.mm.plugin.label.a.a.bJa().PG(this.nIM);
      initView();
      JZ();
      int j;
      if ((this.ehM != null) && (ad.aox(this.ehM.field_username)))
        j = 1;
      while (true)
        if (j != 0)
        {
          if (this.zlC == null)
          {
            AppMethodBeat.o(33653);
            break;
            j = 0;
            continue;
          }
          ViewGroup localViewGroup = (ViewGroup)this.zlC.getParent();
          paramBundle = (ViewGroup)localViewGroup.getParent();
          int k = paramBundle.getChildCount();
          for (j = i; j < k; j++)
          {
            View localView = paramBundle.getChildAt(j);
            if (localView != localViewGroup)
              localView.setVisibility(8);
          }
        }
      AppMethodBeat.o(33653);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(33656);
    aw.Rg().b(575, this);
    aw.Rg().b(576, this);
    this.zlC.removeTextChangedListener(this.zma);
    this.zlE.removeTextChangedListener(this.zmb);
    super.onDestroy();
    AppMethodBeat.o(33656);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(33670);
    boolean bool;
    if (paramKeyEvent.getKeyCode() == 4)
    {
      goBack();
      bool = true;
      AppMethodBeat.o(33670);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(33670);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(33655);
    aw.ZK();
    com.tencent.mm.model.c.XM().b(this.ppA);
    super.onPause();
    AppMethodBeat.o(33655);
  }

  public void onResume()
  {
    AppMethodBeat.i(33654);
    super.onResume();
    aw.ZK();
    com.tencent.mm.model.c.XM().a(this.ppA);
    cbz();
    AppMethodBeat.o(33654);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(33673);
    ab.i("MiroMsg.ContactRemarkInfoModUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.fsh != null)
    {
      this.fsh.dismiss();
      this.fsh = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      h.b(this, getString(2131296905), null, true);
      AppMethodBeat.o(33673);
      return;
    }
    if (paramm.getType() == 575)
    {
      if (this.zlO != null)
      {
        paramString = new com.tencent.mm.vfs.b(this.zlO);
        if (paramString.exists())
        {
          com.tencent.mm.bc.c.aiB();
          paramString.o(new com.tencent.mm.vfs.b(com.tencent.mm.bc.c.sW(this.username)));
        }
      }
      paramString = ((com.tencent.mm.bc.b)paramm).fNa;
      if (!ah.isNullOrNil(paramString))
        this.fNa = paramString;
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(33673);
      break;
      if (paramm.getType() == 576)
      {
        this.zlO = null;
        this.fNa = null;
        this.zlP = false;
        aw.ZK();
        this.ehM = com.tencent.mm.model.c.XM().aoO(this.username);
        this.ehM.iY("");
        aw.ZK();
        com.tencent.mm.model.c.XM().b(this.username, this.ehM);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactRemarkInfoModUI
 * JD-Core Version:    0.6.2
 */