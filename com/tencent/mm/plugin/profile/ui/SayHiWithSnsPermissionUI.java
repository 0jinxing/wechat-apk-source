package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ro;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.an;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.ui.e.k;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bv;
import com.tencent.mm.storage.u;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SayHiWithSnsPermissionUI extends MMActivity
  implements f
{
  private String bCu;
  private String bCv;
  private String chatroomName;
  private ProgressDialog ehJ;
  private int[] gCr;
  private int gwP;
  private String nIM;
  private String oPy;
  private n.b ppA;
  private CharSequence ppB;
  private EditText ppp;
  private EditText ppq;
  private View ppr;
  private TextView pps;
  private MMSwitchBtn ppt;
  private boolean ppu;
  private boolean ppv;
  private boolean ppw;
  private TextView ppx;
  private MMTagPanel ppy;
  private List<String> ppz;
  private String userName;

  public SayHiWithSnsPermissionUI()
  {
    AppMethodBeat.i(23779);
    this.ehJ = null;
    this.gCr = new int[8];
    this.ppA = new SayHiWithSnsPermissionUI.1(this);
    this.ppB = null;
    AppMethodBeat.o(23779);
  }

  private void cbA()
  {
    AppMethodBeat.i(23786);
    if (!bo.isNullOrNil(this.nIM))
    {
      this.ppy.setVisibility(0);
      this.ppx.setVisibility(4);
      this.ppy.a(this.ppz, this.ppz);
      AppMethodBeat.o(23786);
    }
    while (true)
    {
      return;
      this.ppy.setVisibility(4);
      this.ppx.setVisibility(0);
      AppMethodBeat.o(23786);
    }
  }

  private boolean cbB()
  {
    boolean bool = true;
    AppMethodBeat.i(23787);
    com.tencent.mm.plugin.account.friend.a.a locala = com.tencent.mm.plugin.account.a.getAddrUploadStg().vT(this.userName);
    if ((locala == null) || (bo.isNullOrNil(locala.apA())) || (locala.apA().equals(this.ppq.getText().toString())))
    {
      AppMethodBeat.o(23787);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.ppr.setVisibility(0);
      this.pps.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, bo.nullAsNil(getString(2131298672, new Object[] { locala.apA() })), this.pps.getTextSize()));
      k localk = new k(getString(2131305682));
      localk.setSpan(new SayHiWithSnsPermissionUI.a(this, locala.apA()), 0, localk.length(), 17);
      this.pps.append(" ");
      this.pps.append(localk);
      this.pps.setMovementMethod(LinkMovementMethod.getInstance());
      this.gCr[3] = 1;
      AppMethodBeat.o(23787);
    }
  }

  private boolean cbC()
  {
    boolean bool = true;
    AppMethodBeat.i(23788);
    if ((bo.isNullOrNil(this.oPy)) || (this.oPy.equals(this.ppq.getText().toString())))
    {
      AppMethodBeat.o(23788);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.ppr.setVisibility(0);
      this.pps.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, bo.nullAsNil(getString(2131298671, new Object[] { this.oPy })), this.pps.getTextSize()));
      k localk = new k(getString(2131305682));
      localk.setSpan(new SayHiWithSnsPermissionUI.a(this, this.oPy), 0, localk.length(), 17);
      this.pps.append(" ");
      this.pps.append(localk);
      this.pps.setMovementMethod(LinkMovementMethod.getInstance());
      this.gCr[3] = 2;
      AppMethodBeat.o(23788);
    }
  }

  private boolean cbD()
  {
    AppMethodBeat.i(23789);
    Object localObject1 = com.tencent.mm.bi.d.akO().apx(this.userName);
    boolean bool;
    if (localObject1 == null)
    {
      AppMethodBeat.o(23789);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject2 = com.tencent.mm.pluginsdk.ui.preference.b.b(this, (ax)localObject1);
      if ((bo.isNullOrNil(((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).fjz)) || (((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).fjz.equals(getString(2131299907))))
      {
        AppMethodBeat.o(23789);
        bool = false;
      }
      else
      {
        String str = getString(2131302956).substring(0, getString(2131302956).indexOf("%s"));
        localObject1 = ((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).fjz;
        if (((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).fjz.startsWith(str))
          localObject1 = ((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).fjz.substring(str.length());
        this.ppr.setVisibility(0);
        this.pps.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this, bo.nullAsNil(getString(2131298674, new Object[] { ((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).fjz })), this.pps.getTextSize()));
        localObject2 = new k(getString(2131305682));
        ((k)localObject2).setSpan(new SayHiWithSnsPermissionUI.a(this, (String)localObject1), 0, ((k)localObject2).length(), 17);
        this.pps.append(" ");
        this.pps.append((CharSequence)localObject2);
        this.pps.setMovementMethod(LinkMovementMethod.getInstance());
        this.gCr[3] = 3;
        AppMethodBeat.o(23789);
        bool = true;
      }
    }
  }

  private void cbz()
  {
    AppMethodBeat.i(23785);
    com.tencent.mm.model.aw.ZK();
    bv localbv = com.tencent.mm.model.c.XN().RB(this.userName);
    if (localbv != null)
    {
      this.nIM = localbv.field_contactLabels;
      this.ppz = ((ArrayList)com.tencent.mm.plugin.label.a.a.bJa().PF(this.nIM));
    }
    if (this.ppw)
      cbA();
    AppMethodBeat.o(23785);
  }

  public final int getLayoutId()
  {
    return 2130970537;
  }

  public final void initView()
  {
    AppMethodBeat.i(23784);
    this.ppt = ((MMSwitchBtn)findViewById(2131827185).findViewById(2131820932));
    boolean bool = getIntent().getBooleanExtra("sayhi_with_sns_permission", false);
    this.ppt.setCheck(bool);
    this.ppu = getIntent().getBooleanExtra("sayhi_with_sns_perm_send_verify", false);
    this.ppv = getIntent().getBooleanExtra("sayhi_with_sns_perm_add_remark", false);
    this.ppw = getIntent().getBooleanExtra("sayhi_with_sns_perm_set_label", false);
    this.userName = getIntent().getStringExtra("Contact_User");
    this.gwP = getIntent().getIntExtra("Contact_Scene", 9);
    this.chatroomName = getIntent().getStringExtra("room_name");
    this.bCv = getIntent().getStringExtra("Contact_RemarkName");
    this.bCu = getIntent().getStringExtra("Contact_Nick");
    this.oPy = getIntent().getStringExtra("Contact_RoomNickname");
    this.ppr = findViewById(2131827180);
    this.pps = ((TextView)findViewById(2131827181));
    setMMTitle(getString(2131296982));
    Object localObject1;
    if (ad.aox(this.userName))
    {
      localObject1 = findViewById(2131827184);
      if (localObject1 != null)
        ((View)localObject1).setVisibility(8);
    }
    String str1;
    Object localObject2;
    String str2;
    if (this.ppu)
    {
      setMMTitle(getString(2131302966));
      this.ppp = ((EditText)findViewById(2131827175));
      this.ppp.setMinHeight(this.mController.ylL.getResources().getDimensionPixelSize(2131427787));
      com.tencent.mm.ui.tools.b.c.d(this.ppp).PM(100).a(null);
      this.ppp.setFilters(com.tencent.mm.pluginsdk.ui.tools.g.vuR);
      ((LinearLayout)this.ppp.getParent()).setVisibility(0);
      com.tencent.mm.model.aw.ZK();
      str1 = (String)com.tencent.mm.model.c.Ry().get(294913, null);
      localObject2 = r.YB();
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = "";
      str2 = getString(2131302956);
      if (str2.length() + ((String)localObject1).length() <= 50)
        break label1241;
      localObject1 = ((String)localObject1).substring(0, 50 - str2.length());
    }
    label1241: 
    while (true)
    {
      localObject2 = str1;
      if (!bo.isNullOrNil(this.chatroomName))
      {
        ad localad = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.chatroomName);
        localObject2 = str1;
        if (localad != null)
        {
          localObject2 = str1;
          if (!bo.isNullOrNil(localad.field_nickname))
          {
            str1 = ((com.tencent.mm.plugin.chatroom.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class)).XV().ob(this.chatroomName).mJ(r.Yz());
            localObject2 = str1;
            if (bo.ac(str1))
              localObject2 = localObject1;
            ab.i("MicroMsg.SayHiWithSnsPermissionUI", "chatroomName:%s nick:%s", new Object[] { this.chatroomName, localad.field_nickname });
            localObject2 = com.tencent.mm.pluginsdk.ui.e.j.b(this.mController.ylL, getResources().getString(2131302957, new Object[] { localad.field_nickname, localObject2 }), this.ppp.getTextSize());
            this.ppB = ((CharSequence)localObject2);
          }
        }
      }
      if (bo.ac(this.ppB))
        this.ppB = com.tencent.mm.pluginsdk.ui.e.j.b(this.mController.ylL, String.format(str2, new Object[] { localObject1 }), this.ppp.getTextSize());
      if (bo.ac((CharSequence)localObject2))
        this.ppp.setText(this.ppB);
      while (true)
      {
        this.ppp.requestFocus();
        this.ppp.postDelayed(new SayHiWithSnsPermissionUI.2(this), 100L);
        if (this.ppv)
        {
          this.ppq = ((EditText)findViewById(2131827179));
          ((LinearLayout)this.ppq.getParent()).setVisibility(0);
          if (!this.ppu)
            this.ppq.clearFocus();
          this.ppq.setMinHeight(this.mController.ylL.getResources().getDimensionPixelSize(2131427787));
          com.tencent.mm.ui.tools.b.c.d(this.ppq).PM(100).a(null);
          this.ppq.setFilters(com.tencent.mm.pluginsdk.ui.tools.g.vuR);
          if (!this.ppu)
          {
            this.gCr[0] = 1;
            setMMTitle(getString(2131298776));
            localObject1 = (LinearLayout.LayoutParams)((View)this.ppq.getParent()).getLayoutParams();
            ((LinearLayout.LayoutParams)localObject1).setMargins(((LinearLayout.LayoutParams)localObject1).leftMargin, 0, ((LinearLayout.LayoutParams)localObject1).rightMargin, ((LinearLayout.LayoutParams)localObject1).bottomMargin);
          }
          if (bo.isNullOrNil(this.bCv))
            break;
          this.ppq.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.mController.ylL, this.bCv, this.ppq.getTextSize()));
          this.gCr[6] = 1;
        }
        if (ad.aox(this.userName))
          this.ppw = false;
        if (this.ppw)
        {
          this.ppx = ((TextView)findViewById(2131827182));
          this.ppy = ((MMTagPanel)findViewById(2131827183));
          this.ppy.setPanelClickable(false);
          ((LinearLayout)((FrameLayout)this.ppy.getParent()).getParent()).setVisibility(0);
          this.ppx.setOnClickListener(new SayHiWithSnsPermissionUI.4(this));
          this.ppy.setOnClickListener(new SayHiWithSnsPermissionUI.5(this));
        }
        cbz();
        if (!bo.isNullOrNil(this.nIM))
          this.gCr[7] = 1;
        localObject1 = getString(2131297041);
        if (!this.ppu)
          localObject1 = getString(2131296944);
        a(0, (String)localObject1, new SayHiWithSnsPermissionUI.6(this), q.b.ymu);
        setBackBtn(new SayHiWithSnsPermissionUI.7(this));
        AppMethodBeat.o(23784);
        return;
        localObject1 = com.tencent.mm.pluginsdk.ui.e.j.b(this.mController.ylL, (CharSequence)localObject2, this.ppp.getTextSize());
        this.ppp.setText((CharSequence)localObject1);
      }
      if (!bo.isNullOrNil(this.bCu))
      {
        this.ppq.setHint(com.tencent.mm.pluginsdk.ui.e.j.b(this.mController.ylL, this.bCu, this.ppq.getTextSize()));
        this.ppq.setOnFocusChangeListener(new SayHiWithSnsPermissionUI.3(this));
      }
      switch (this.gwP)
      {
      case 9:
      case 12:
      default:
        bool = false;
      case 10:
      case 11:
      case 13:
      case 8:
      case 14:
      }
      while ((!this.ppu) && (!bool))
      {
        cbD();
        break;
        bool = cbB();
        continue;
        bool = cbC();
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(23780);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(23780);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(23783);
    com.tencent.mm.plugin.report.service.h.pYm.e(14036, new Object[] { Integer.valueOf(this.gCr[0]), Integer.valueOf(this.gCr[1]), Integer.valueOf(this.gCr[2]), Integer.valueOf(this.gCr[3]), Integer.valueOf(this.gCr[4]), Integer.valueOf(this.gCr[5]), Integer.valueOf(this.gCr[6]), Integer.valueOf(this.gCr[7]) });
    super.onDestroy();
    this.mController.removeAllOptionMenu();
    AppMethodBeat.o(23783);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(23791);
    if (paramInt == 4)
    {
      this.gCr[0] = 1;
      finish();
      AppMethodBeat.o(23791);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(23791);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(23781);
    if (this.ppw)
    {
      com.tencent.mm.model.aw.ZK();
      com.tencent.mm.model.c.XM().a(this.ppA);
      cbz();
    }
    com.tencent.mm.model.aw.Rg().a(30, this);
    com.tencent.mm.model.aw.Rg().a(243, this);
    com.tencent.mm.model.aw.Rg().a(853, this);
    super.onResume();
    AppMethodBeat.o(23781);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(23790);
    long l = System.currentTimeMillis();
    ab.i("MicroMsg.SayHiWithSnsPermissionUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    while (true)
    {
      try
      {
        if (this.ehJ != null)
        {
          this.ehJ.dismiss();
          this.ehJ = null;
        }
        if (this.ppu)
        {
          localObject = this.ppp.getText().toString().trim();
          if ((bo.isNullOrNil((String)localObject)) || (((String)localObject).equals(this.ppB)) || (!bo.isNullOrNil(this.chatroomName)))
          {
            com.tencent.mm.model.aw.ZK();
            com.tencent.mm.model.c.Ry().set(294913, "");
          }
          switch (paramInt2)
          {
          default:
            i = 0;
            if (i != 0)
            {
              return;
              com.tencent.mm.model.aw.ZK();
              com.tencent.mm.model.c.Ry().set(294913, localObject);
              continue;
            }
            break;
          case -22:
          case -34:
          case -24:
          }
        }
      }
      catch (Exception paramString)
      {
        Object localObject;
        paramm = new java/lang/StringBuilder;
        paramm.<init>("exception in onSceneEnd : ");
        ab.e("MicroMsg.SayHiWithSnsPermissionUI", paramString.getMessage());
        ab.i("MicroMsg.SayHiWithSnsPermissionUI", "[onCreate] %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(23790);
        continue;
        Toast.makeText(this, 2131302960, 0).show();
        int i = 1;
        continue;
        Toast.makeText(this, 2131299915, 0).show();
        i = 1;
        continue;
        if ((paramInt1 != 0) || (paramInt2 != 0))
          break label1092;
        com.tencent.mm.ui.base.h.bQ(this, getString(2131302961));
        if (this.ppv)
        {
          paramString = "";
          if (this.ppq.getText() != null)
            paramString = this.ppq.getText().toString();
          localObject = paramString;
          if (!bo.isNullOrNil(paramString))
          {
            localObject = paramString;
            if (paramString.length() > 50)
              localObject = paramString.substring(0, 50);
          }
          if (bo.isNullOrNil((String)localObject))
            continue;
          com.tencent.mm.model.aw.ZK();
          ad localad = com.tencent.mm.model.c.XM().aoO(this.userName);
          localad.iz((String)localObject);
          com.tencent.mm.model.aw.ZK();
          paramString = com.tencent.mm.model.c.XN().RB(this.userName);
          paramString.field_encryptUsername = this.userName;
          paramString.field_conRemark = ((String)localObject);
          com.tencent.mm.model.aw.ZK();
          com.tencent.mm.model.c.XN().a(paramString);
          com.tencent.mm.model.aw.ZK();
          com.tencent.mm.model.c.XM().Y(localad);
          this.gCr[2] = 1;
          if ((!bo.isNullOrNil(this.bCu)) && (!((String)localObject).equals(this.bCu)))
            this.gCr[5] = 1;
          paramString = new java/util/LinkedList;
          paramString.<init>();
          if (!(paramm instanceof com.tencent.mm.pluginsdk.model.m))
            break label1018;
          paramInt1 = ((com.tencent.mm.pluginsdk.model.m)paramm).cAd;
          paramString = ((com.tencent.mm.pluginsdk.model.m)paramm).vbm;
          if ((paramInt1 == 3) || ((paramm instanceof com.tencent.mm.openim.b.q)))
          {
            localObject = com.tencent.mm.bi.d.akO().apx(this.userName);
            com.tencent.mm.model.aw.ZK();
            paramm = com.tencent.mm.model.c.XM().aoO(this.userName);
            if ((paramString != null) && (paramString.contains(this.userName)))
            {
              paramString = paramm;
              if ((int)paramm.ewQ != 0)
                break label1046;
              paramm = com.tencent.mm.pluginsdk.ui.preference.b.a((ax)localObject);
              com.tencent.mm.model.aw.ZK();
              paramString = paramm;
              if (com.tencent.mm.model.c.XM().Z(paramm))
                break label1046;
              ab.e("MicroMsg.SayHiWithSnsPermissionUI", "canAddContact fail, insert fail");
            }
            com.tencent.mm.model.aw.ZK();
            paramm = com.tencent.mm.model.c.XM().aoO(this.userName);
            paramString = new com/tencent/mm/g/a/ro;
            paramString.<init>();
            paramString.cNw.cNy = true;
            paramString.cNw.cNx = false;
            paramString.cNw.username = this.userName;
            com.tencent.mm.sdk.b.a.xxA.m(paramString);
            if (!this.ppt.zMU)
              break label1084;
            t.k(paramm);
            if (getIntent().getBooleanExtra("sayhi_with_jump_to_profile", false))
            {
              paramString = new android/content/Intent;
              paramString.<init>();
              paramString.putExtra("friend_message_transfer_username", this.userName);
              paramm = new java/lang/StringBuilder;
              paramm.<init>("friend_message_accept_");
              paramString.setAction(this.userName);
              paramString.putExtra("MMActivity.OverrideEnterAnimation", 2131034265);
              paramString.putExtra("MMActivity.OverrideExitAnimation", 2131034262);
              com.tencent.mm.bp.d.b(this, "subapp", ".ui.friend.FMessageTransferUI", paramString);
            }
          }
        }
        getIntent().putExtra("CONTACT_INFO_UI_SOURCE", 7);
        com.tencent.mm.plugin.report.service.h.pYm.e(16055, new Object[] { Integer.valueOf(com.tencent.mm.plugin.profile.c.am(getIntent())), Integer.valueOf(1) });
        setResult(-1, getIntent());
        finish();
        ab.i("MicroMsg.SayHiWithSnsPermissionUI", "[onCreate] %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(23790);
        continue;
        if (!bo.isNullOrNil(this.bCu))
        {
          this.gCr[2] = 0;
          continue;
        }
      }
      finally
      {
        ab.i("MicroMsg.SayHiWithSnsPermissionUI", "[onCreate] %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(23790);
      }
      this.gCr[2] = 2;
      continue;
      label1018: if ((paramm instanceof com.tencent.mm.openim.b.q))
        paramString.add(((com.tencent.mm.openim.b.q)paramm).geZ);
      paramInt1 = 0;
      continue;
      label1046: t.q(paramString);
      com.tencent.mm.model.aw.getNotification().IH();
      com.tencent.mm.bi.d.akP().ep(this.userName, 1);
      com.tencent.mm.pluginsdk.ui.preference.b.bG(this.userName, this.gwP);
      continue;
      label1084: t.l(paramm);
      continue;
      label1092: if ((paramInt1 == 4) && (paramInt2 == -24) && (!bo.isNullOrNil(paramString)))
        Toast.makeText(this, paramString, 1).show();
      else if ((paramInt1 == 4) && ((paramInt2 == -2) || (paramInt2 == -101)) && (!bo.isNullOrNil(paramString)))
        com.tencent.mm.ui.base.h.a(this, paramString, getString(2131297061), getString(2131296994), null);
      else
        Toast.makeText(this, 2131302960, 0).show();
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(23782);
    com.tencent.mm.model.aw.Rg().b(30, this);
    com.tencent.mm.model.aw.Rg().b(243, this);
    com.tencent.mm.model.aw.Rg().b(853, this);
    if (this.ppw)
    {
      com.tencent.mm.model.aw.ZK();
      com.tencent.mm.model.c.XM().b(this.ppA);
    }
    super.onStop();
    AppMethodBeat.o(23782);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI
 * JD-Core Version:    0.6.2
 */