package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.ai.w;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.he;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.qt;
import com.tencent.mm.protocal.protobuf.qu;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.ChattingUI;
import java.util.ArrayList;
import java.util.LinkedList;

public class CheckCanSubscribeBizUI extends MMActivity
  implements com.tencent.mm.ai.f, k.a, n.b
{
  private String appId;
  private int cvd;
  private String cyv;
  private String extInfo;
  private boolean foa = false;
  private int fromScene;
  private String mGZ;
  private int scene;
  private String toUserName;
  private int yfB;
  private LinkedList<bts> yfC;
  private boolean yfD = false;
  private boolean yfE = false;
  private boolean yfF = false;
  private boolean yfG = false;
  private String yfH;
  private int yfI = 0;

  private boolean aAk()
  {
    boolean bool = false;
    AppMethodBeat.i(29149);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      ab.e("MicroMsg.CheckCanSubscribeBizUI", "intent is null.");
      AppMethodBeat.o(29149);
    }
    while (true)
    {
      return bool;
      this.appId = localIntent.getStringExtra("appId");
      this.toUserName = localIntent.getStringExtra("toUserName");
      if (bo.isNullOrNil(this.toUserName))
      {
        ab.e("MicroMsg.CheckCanSubscribeBizUI", "toUserName is null.");
        AppMethodBeat.o(29149);
      }
      else
      {
        this.extInfo = localIntent.getStringExtra("extInfo");
        this.cvd = localIntent.getIntExtra("source", -1);
        this.scene = localIntent.getIntExtra("scene", 0);
        this.yfI = localIntent.getIntExtra("jump_profile_type", 0);
        switch (this.cvd)
        {
        default:
          ab.e("MicroMsg.CheckCanSubscribeBizUI", "source(%d) is invalidated.", new Object[] { Integer.valueOf(this.cvd) });
          AppMethodBeat.o(29149);
          break;
        case 1:
          if (bo.isNullOrNil(this.appId))
          {
            ab.e("MicroMsg.CheckCanSubscribeBizUI", "appId is null.");
            AppMethodBeat.o(29149);
          }
          else
          {
            this.fromScene = 68;
            ArrayList localArrayList = localIntent.getStringArrayListExtra("androidPackNameList");
            if ((localArrayList == null) || (localArrayList.size() == 0))
            {
              ab.e("MicroMsg.CheckCanSubscribeBizUI", "androidPackNameList is null or nil.");
              AppMethodBeat.o(29149);
            }
            else
            {
              this.yfC = new LinkedList();
              for (int i = 0; i < localArrayList.size(); i++)
              {
                String str = (String)localArrayList.get(i);
                if (!bo.isNullOrNil(str))
                {
                  ab.i("MicroMsg.CheckCanSubscribeBizUI", "packName(%d) : %s", new Object[] { Integer.valueOf(i), str });
                  this.yfC.add(aa.vy(str));
                }
              }
              if (this.yfC.size() != 0)
                break label355;
              ab.e("MicroMsg.CheckCanSubscribeBizUI", "androidPackNameList is nil.");
              AppMethodBeat.o(29149);
            }
          }
          break;
        case 2:
        }
      }
    }
    label355: this.yfB = this.yfC.size();
    while (true)
    {
      this.cyv = localIntent.getStringExtra("fromURL");
      AppMethodBeat.o(29149);
      bool = true;
      break;
      this.fromScene = 69;
    }
  }

  private void bpI()
  {
    AppMethodBeat.i(29156);
    if (this.cvd == 1)
      LauncherUI.ho(this);
    AppMethodBeat.o(29156);
  }

  private void dwq()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(29151);
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("dealSuccess..,canJump = ");
        ab.i("MicroMsg.CheckCanSubscribeBizUI", this.yfD);
        if (this.scene == 1)
        {
          localObject1 = new android/content/Intent;
          ((Intent)localObject1).<init>();
          ((Intent)localObject1).putExtra("rawUrl", this.yfH);
          com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
          finish();
          AppMethodBeat.o(29151);
          return;
        }
        if ((this.scene != 0) || (this.yfI != 1))
          break label181;
        if (this.yfF)
        {
          ab.i("MicroMsg.CheckCanSubscribeBizUI", "has jump ignore this scene");
          AppMethodBeat.o(29151);
          continue;
        }
      }
      finally
      {
      }
      this.yfF = true;
      aw.Rg().a(233, this);
      Object localObject3 = new com/tencent/mm/modelsimple/h;
      ((h)localObject3).<init>(this.extInfo, null, 4, 0, (int)System.currentTimeMillis(), new byte[0]);
      aw.Rg().a((com.tencent.mm.ai.m)localObject3, 0);
      AppMethodBeat.o(29151);
      continue;
      label181: if ((dwr()) && (this.yfD))
      {
        if (!this.yfF)
        {
          ab.i("MicroMsg.CheckCanSubscribeBizUI", "jump to ChattingUI");
          localObject3 = new android/content/Intent;
          ((Intent)localObject3).<init>();
          localObject3 = ((Intent)localObject3).putExtra("Chat_User", this.toUserName);
          ((Intent)localObject3).putExtra("finish_direct", true);
          if (bo.isNullOrNil(this.toUserName))
            com.tencent.mm.ui.contact.e.a((Intent)localObject3, this.toUserName);
          ((Intent)localObject3).setClass(this, ChattingUI.class);
          if (!this.yfE)
          {
            setResult(-1);
            this.yfF = true;
            startActivity((Intent)localObject3);
            finish();
          }
        }
        AppMethodBeat.o(29151);
      }
      else
      {
        if ((this.yfD) && (!this.yfF))
        {
          ab.i("MicroMsg.CheckCanSubscribeBizUI", "jump to ContactInfoUI");
          ad localad = ((j)g.K(j.class)).XM().aoO(this.toUserName);
          localObject3 = new android/content/Intent;
          ((Intent)localObject3).<init>();
          ((Intent)localObject3).putExtra("Contact_Scene", this.fromScene);
          ((Intent)localObject3).putExtra("Verify_ticket", this.mGZ);
          if (localad != null)
          {
            ((Intent)localObject3).putExtra("Contact_Alias", localad.Hq());
            ((Intent)localObject3).putExtra("Contact_Nick", localad.field_nickname);
            ((Intent)localObject3).putExtra("Contact_Signature", localad.signature);
            ((Intent)localObject3).putExtra("Contact_RegionCode", localad.dui);
            ((Intent)localObject3).putExtra("Contact_Sex", localad.dtS);
            ((Intent)localObject3).putExtra("Contact_VUser_Info", localad.duh);
            ((Intent)localObject3).putExtra("Contact_VUser_Info_Flag", localad.field_verifyFlag);
            ((Intent)localObject3).putExtra("Contact_KWeibo_flag", localad.field_weiboFlag);
            ((Intent)localObject3).putExtra("Contact_KWeibo", localad.dug);
            ((Intent)localObject3).putExtra("Contact_KWeiboNick", localad.field_weiboNickname);
          }
          com.tencent.mm.ui.contact.e.r((Intent)localObject3, this.toUserName);
          if (!this.yfE)
          {
            setResult(-1);
            this.yfF = true;
            com.tencent.mm.bp.d.b(this, "profile", ".ui.ContactInfoUI", (Intent)localObject3);
            finish();
          }
        }
        AppMethodBeat.o(29151);
      }
    }
  }

  private boolean dwr()
  {
    while (true)
    {
      Object localObject1;
      int i;
      boolean bool;
      try
      {
        AppMethodBeat.i(29152);
        localObject1 = ((j)g.K(j.class)).XM().aoO(this.toUserName);
        if ((localObject1 != null) && ((int)((com.tencent.mm.n.a)localObject1).ewQ != 0))
          break label322;
        ab.w("MicroMsg.CheckCanSubscribeBizUI", "contact is null.");
        i = 1;
        Object localObject2 = null;
        if (i == 0)
          localObject2 = com.tencent.mm.aj.f.qX(this.toUserName);
        Object localObject4;
        if ((localObject2 == null) || (((com.tencent.mm.aj.d)localObject2).adJ()))
        {
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("BizInfo(");
          ab.e("MicroMsg.CheckCanSubscribeBizUI", localObject2 + ") is null or should update.");
          i = 1;
        }
        if (this.yfG)
        {
          if (localObject1 == null)
          {
            this.yfD = false;
            setResult(5);
            dwt();
            finish();
            AppMethodBeat.o(29152);
            bool = false;
            return bool;
          }
          this.yfD = true;
          this.foa = true;
          if (com.tencent.mm.n.a.jh(((ap)localObject1).field_type))
            break label300;
          AppMethodBeat.o(29152);
          bool = false;
          continue;
        }
        if (i != 0)
        {
          if (this.yfD)
          {
            setResult(5);
            dwt();
            finish();
            AppMethodBeat.o(29152);
            bool = false;
            continue;
          }
          localObject2 = ao.a.flu;
          localObject1 = this.toUserName;
          localObject4 = new com/tencent/mm/ui/CheckCanSubscribeBizUI$1;
          ((CheckCanSubscribeBizUI.1)localObject4).<init>(this);
          ((ao.b)localObject2).a((String)localObject1, "", (ao.b.a)localObject4);
          continue;
        }
      }
      finally
      {
      }
      if (!com.tencent.mm.n.a.jh(((ap)localObject1).field_type))
      {
        ab.w("MicroMsg.CheckCanSubscribeBizUI", "is not contact.");
        this.yfD = true;
        AppMethodBeat.o(29152);
        bool = false;
      }
      else
      {
        label300: this.yfD = true;
        this.foa = true;
        AppMethodBeat.o(29152);
        bool = true;
        continue;
        label322: i = 0;
      }
    }
  }

  private void dws()
  {
    AppMethodBeat.i(29154);
    Toast.makeText(this, getString(2131304229), 1).show();
    bpI();
    AppMethodBeat.o(29154);
  }

  private void dwt()
  {
    AppMethodBeat.i(29155);
    Toast.makeText(this, 2131302317, 1).show();
    bpI();
    AppMethodBeat.o(29155);
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(29158);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      ab.d("MicroMsg.CheckCanSubscribeBizUI", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramn, paramObject });
      AppMethodBeat.o(29158);
    }
    while (true)
    {
      return;
      a((String)paramObject, null);
      AppMethodBeat.o(29158);
    }
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(29157);
    new ak().post(new CheckCanSubscribeBizUI.3(this, paramString));
    AppMethodBeat.o(29157);
  }

  protected final int getLayoutId()
  {
    return 2130969910;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29144);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    if ((!aw.ZM()) || (aw.QT()))
    {
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent());
      finish();
      AppMethodBeat.o(29144);
    }
    while (true)
    {
      return;
      aw.Rg().a(605, this);
      ((j)g.K(j.class)).XM().a(this);
      z.aeR().c(this);
      if (aAk())
      {
        String str1 = this.appId;
        paramBundle = this.toUserName;
        String str2 = this.extInfo;
        int i = this.yfB;
        LinkedList localLinkedList = this.yfC;
        String str3 = this.cyv;
        int j = this.cvd;
        int k = this.scene;
        Object localObject = new b.a();
        ((b.a)localObject).fsJ = new qt();
        ((b.a)localObject).fsK = new qu();
        ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/checkcansubscribebiz";
        ((b.a)localObject).fsI = 605;
        localObject = ((b.a)localObject).acD();
        qt localqt = (qt)((b)localObject).fsG.fsP;
        localqt.mZr = str1;
        localqt.ndF = paramBundle;
        localqt.ndT = str2;
        localqt.vXK = i;
        localqt.vXL = localLinkedList;
        localqt.vXM = null;
        localqt.vXN = str3;
        localqt.vFH = j;
        localqt.Scene = k;
        ab.i("MicroMsg.CheckCanSubscribeBizUI", "appId(%s) , toUsername(%s) , extInfo(%s) , packNum(%d), scene(%d)", new Object[] { str1, paramBundle, str2, Integer.valueOf(i), Integer.valueOf(k) });
        w.a((b)localObject, new CheckCanSubscribeBizUI.2(this));
        AppMethodBeat.o(29144);
      }
      else
      {
        setResult(2);
        dwt();
        finish();
        AppMethodBeat.o(29144);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(29147);
    super.onDestroy();
    if (this.yfC != null)
      this.yfC.clear();
    if (aw.RK())
    {
      aw.Rg().b(605, this);
      z.aeR().d(this);
      ((j)g.K(j.class)).XM().b(this);
    }
    AppMethodBeat.o(29147);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(29153);
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      this.yfE = true;
      if (this.yfF)
        AppMethodBeat.o(29153);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(29153);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(29148);
    super.onPause();
    AppMethodBeat.o(29148);
  }

  public void onResume()
  {
    AppMethodBeat.i(29146);
    super.onResume();
    AppMethodBeat.o(29146);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(29150);
    ab.d("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (paramm.getType() != 605)
      if (paramm.getType() == 233)
      {
        aw.Rg().b(233, this);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = (h)paramm;
          paramInt1 = paramString.aiV();
          ab.i("MicroMsg.CheckCanSubscribeBizUI", "geta8key, action code = %d", new Object[] { Integer.valueOf(paramInt1) });
          if (paramInt1 == 15)
          {
            paramString = paramString.aiT();
            ab.d("MicroMsg.CheckCanSubscribeBizUI", "actionCode = %s, url = %s", new Object[] { Integer.valueOf(paramInt1), paramString });
            paramm = new he();
            paramm.cBW.actionCode = paramInt1;
            paramm.cBW.result = paramString;
            paramm.cBW.context = this;
            com.tencent.mm.sdk.b.a.xxA.a(paramm, Looper.myLooper());
            finish();
            AppMethodBeat.o(29150);
          }
        }
      }
    while (true)
    {
      return;
      dws();
      AppMethodBeat.o(29150);
      continue;
      dws();
      AppMethodBeat.o(29150);
      continue;
      ab.e("MicroMsg.CheckCanSubscribeBizUI", "un support scene type : %d", new Object[] { Integer.valueOf(paramm.getType()) });
      AppMethodBeat.o(29150);
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(29145);
    super.onStart();
    AppMethodBeat.o(29145);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.CheckCanSubscribeBizUI
 * JD-Core Version:    0.6.2
 */