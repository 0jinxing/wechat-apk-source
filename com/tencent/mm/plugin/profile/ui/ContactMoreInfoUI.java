package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.m.e;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.a;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.profile.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ContactMoreInfoUI extends MMActivity
  implements View.OnClickListener, com.tencent.mm.plugin.fts.a.l
{
  private String edV;
  u eih;
  private String ejD;
  boolean ejU;
  private ak handler;
  private ad ldh;
  private b pkh;
  private ProfileNormalItemView plQ;
  private ProfileNormalItemView plR;
  private ProfileNormalItemView plS;
  private ProfileNormalItemView plT;
  private ProfileNormalItemView plU;
  private ProfileNormalItemView plV;
  private ProfileNormalItemView plW;
  private ProfileNormalItemView plX;
  private String plY;
  private String plZ;
  private String pma;
  private String pmb;
  private long pmc;
  private String pmd;
  String pme;

  public ContactMoreInfoUI()
  {
    AppMethodBeat.i(23410);
    this.pme = null;
    this.ejU = false;
    this.handler = new ak(Looper.getMainLooper());
    AppMethodBeat.o(23410);
  }

  private boolean L(ad paramad)
  {
    AppMethodBeat.i(23413);
    if (r.Yz().equals(paramad.field_username))
    {
      aw.ZK();
      paramad = (String)c.Ry().get(ac.a.xLU, null);
      if (bo.isNullOrNil(paramad))
        break label166;
    }
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramad);
        this.pme = localJSONObject.optString("ShopUrl");
        paramad = localJSONObject.optString("ShopName");
        if (bo.isNullOrNil(this.pme))
          break label171;
        this.plV.setVisibility(0);
        this.plV.ppl = paramad;
        this.plV.Bi(getResources().getColor(2131690764));
        paramad = this.plV;
        paramad.ppm = new ContactMoreInfoUI.2(this);
        paramad.cby();
        bool = true;
        AppMethodBeat.o(23413);
        return bool;
        paramad = paramad.duq;
      }
      catch (JSONException paramad)
      {
        ab.printErrStackTrace("MicroMsg.ContactMoreInfoUI", paramad, "", new Object[0]);
      }
      label166: paramad = null;
      continue;
      label171: this.plV.setVisibility(8);
      AppMethodBeat.o(23413);
      boolean bool = false;
    }
  }

  private boolean M(ad paramad)
  {
    AppMethodBeat.i(23420);
    boolean bool;
    if (paramad.field_username.equals(r.Yz()))
    {
      this.plU.setVisibility(8);
      bool = false;
      AppMethodBeat.o(23420);
      return bool;
    }
    if (paramad.dtS == 1)
      this.plU.Bg(2131298495);
    while (true)
    {
      this.plU.cby();
      i locali = new i();
      locali.query = paramad.field_username;
      locali.mEw = this;
      locali.handler = this.handler;
      locali.hbo = 5;
      ((n)com.tencent.mm.kernel.g.M(n.class)).search(2, locali);
      AppMethodBeat.o(23420);
      bool = true;
      break;
      if (paramad.dtS == 2)
        this.plU.Bg(2131298494);
      else
        this.plU.Bg(2131298499);
    }
  }

  private boolean caN()
  {
    boolean bool = false;
    AppMethodBeat.i(23414);
    Object localObject = com.tencent.mm.m.g.Nu().getValue("LinkedinPluginClose");
    int i;
    if ((bo.isNullOrNil((String)localObject)) || (Integer.valueOf((String)localObject).intValue() == 0))
    {
      i = 1;
      if ((i == 0) || (bo.isNullOrNil(this.ldh.dun)))
        break label137;
      this.plQ.setVisibility(0);
      if (bo.isNullOrNil(this.plY))
        this.plY = this.ldh.duo;
      localObject = this.plQ;
      ((ProfileNormalItemView)localObject).ppl = this.plY;
      ((ProfileNormalItemView)localObject).ppm = new ContactMoreInfoUI.3(this);
      bool = ((ProfileNormalItemView)localObject).Bi(getResources().getColor(2131690764)).cby();
      AppMethodBeat.o(23414);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label137: this.plQ.setVisibility(8);
      AppMethodBeat.o(23414);
    }
  }

  private boolean caO()
  {
    AppMethodBeat.i(23415);
    this.plR.setVisibility(0);
    ProfileNormalItemView localProfileNormalItemView = this.plR;
    localProfileNormalItemView.ppl = this.pma;
    boolean bool = localProfileNormalItemView.cby();
    AppMethodBeat.o(23415);
    return bool;
  }

  private boolean caP()
  {
    AppMethodBeat.i(23416);
    aw.ZK();
    int i = bo.h((Integer)c.Ry().get(9, null));
    this.pmc = getIntent().getLongExtra("Contact_Uin", 0L);
    this.pmd = getIntent().getStringExtra("Contact_QQNick");
    boolean bool;
    if ((this.pmc != 0L) && (i != 0))
    {
      if ((this.pmd == null) || (this.pmd.length() == 0))
      {
        localObject = jx(this.pmc);
        if (localObject != null)
          this.pmd = ((ao)localObject).getDisplayName();
      }
      Object localObject = bo.nullAsNil(this.pmd);
      localObject = (String)localObject + " " + new p(this.pmc).longValue();
      this.plS.setVisibility(0);
      ProfileNormalItemView localProfileNormalItemView = this.plS;
      localProfileNormalItemView.ppl = ((CharSequence)localObject);
      localProfileNormalItemView.ppm = new ContactMoreInfoUI.4(this);
      bool = localProfileNormalItemView.cby();
      AppMethodBeat.o(23416);
    }
    while (true)
    {
      return bool;
      this.plS.setVisibility(8);
      AppMethodBeat.o(23416);
      bool = false;
    }
  }

  private boolean caQ()
  {
    AppMethodBeat.i(23418);
    ProfileNormalItemView localProfileNormalItemView = this.plW;
    localProfileNormalItemView.ppl = com.tencent.mm.pluginsdk.ui.e.j.b(this, this.ldh.signature);
    boolean bool = localProfileNormalItemView.cby();
    AppMethodBeat.o(23418);
    return bool;
  }

  private boolean caR()
  {
    AppMethodBeat.i(23419);
    ab.i("MicroMsg.ContactMoreInfoUI", "[initFriendSource] source:%s", new Object[] { Integer.valueOf(this.ldh.getSource()) });
    switch (this.ldh.getSource())
    {
    default:
      this.plX.ppl = null;
    case 4:
    case 12:
    case 1:
    case 3:
    case 17:
    case 18:
    case 30:
    case 48:
    case 8:
    case 14:
    case 22:
    case 23:
    case 24:
    case 26:
    case 27:
    case 28:
    case 29:
    case 34:
    case 58:
    case 59:
    case 60:
    case 76:
    case 13:
    case 10:
    case 25:
    case 15:
    }
    while (true)
    {
      boolean bool = this.plX.cby();
      AppMethodBeat.o(23419);
      return bool;
      this.plX.Bh(2131299903);
      continue;
      if (this.ldh.Ol() > 1000000)
      {
        this.plX.Bh(2131298718);
      }
      else
      {
        this.plX.Bh(2131298717);
        continue;
        if (this.ldh.Ol() > 1000000)
        {
          this.plX.Bh(2131298721);
        }
        else
        {
          this.plX.Bh(2131298720);
          continue;
          if (this.ldh.Ol() > 1000000)
          {
            this.plX.Bh(2131298698);
          }
          else
          {
            this.plX.Bh(2131298695);
            continue;
            if (this.ldh.Ol() > 1000000)
            {
              this.plX.Bh(2131298706);
            }
            else
            {
              this.plX.Bh(2131298705);
              continue;
              if (this.ldh.Ol() > 1000000)
              {
                this.plX.Bh(2131298711);
              }
              else
              {
                this.plX.Bh(2131298710);
                continue;
                this.plX.Bh(2131298713);
                continue;
                if (this.ldh.Ol() > 1000000)
                {
                  this.plX.Bh(2131298702);
                }
                else
                {
                  this.plX.Bh(2131298701);
                  continue;
                  if (this.ldh.Ol() > 1000000)
                  {
                    this.plX.Bh(2131298724);
                  }
                  else
                  {
                    this.plX.Bh(2131298723);
                    continue;
                    this.plX.Bh(2131298690);
                    continue;
                    this.plX.Bh(2131300369);
                    continue;
                    this.plX.Bh(2131298708);
                    continue;
                    if (this.ldh.Ol() > 1000000)
                    {
                      this.plX.Bh(2131298727);
                    }
                    else
                    {
                      this.plX.Bh(2131298726);
                      continue;
                      if (this.ldh.Ol() > 1000000)
                      {
                        this.plX.Bh(2131298727);
                      }
                      else
                      {
                        this.plX.Bh(2131298726);
                        continue;
                        if (this.ldh.Ol() > 1000000)
                        {
                          this.plX.Bh(2131298693);
                        }
                        else
                        {
                          this.plX.Bh(2131298692);
                          continue;
                          if (this.ldh.Ol() > 1000000)
                            this.plX.Bh(2131298715);
                          else
                            this.plX.Bh(2131298714);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  private static ao jx(long paramLong)
  {
    AppMethodBeat.i(23417);
    ao localao = a.getQQListStg().ge(paramLong);
    if (localao == null)
    {
      localao = null;
      AppMethodBeat.o(23417);
    }
    while (true)
    {
      return localao;
      AppMethodBeat.o(23417);
    }
  }

  public final void b(com.tencent.mm.plugin.fts.a.a.j paramj)
  {
    AppMethodBeat.i(23421);
    if (paramj.bFZ == 0)
    {
      int i = ((Integer)((com.tencent.mm.plugin.fts.a.a.l)paramj.mEy.get(0)).userData).intValue();
      this.plU.ppl = getString(2131298498, new Object[] { Integer.valueOf(i) });
      this.plU.ppm = new ContactMoreInfoUI.5(this, i);
    }
    while (true)
    {
      this.plU.cby();
      AppMethodBeat.o(23421);
      return;
      this.plU.ppl = getString(2131298498, new Object[] { Integer.valueOf(0) });
    }
  }

  public final int getLayoutId()
  {
    return 2130969218;
  }

  public final void initView()
  {
    AppMethodBeat.i(23412);
    super.initView();
    setMMTitle(2131296975);
    setBackBtn(new ContactMoreInfoUI.1(this));
    this.plQ = ((ProfileNormalItemView)findViewById(2131823055));
    this.plR = ((ProfileNormalItemView)findViewById(2131823057));
    this.plS = ((ProfileNormalItemView)findViewById(2131823058));
    this.plT = ((ProfileNormalItemView)findViewById(2131821046));
    this.plT.setVisibility(8);
    this.plT.mTitle = getString(2131298505);
    this.plW = ((ProfileNormalItemView)findViewById(2131823053));
    this.plW.Bg(2131298678);
    this.plW.cbw();
    this.plX = ((ProfileNormalItemView)findViewById(2131823054));
    this.plX.Bg(2131298730);
    this.plV = ((ProfileNormalItemView)findViewById(2131823056));
    this.plU = ((ProfileNormalItemView)findViewById(2131823052));
    this.plU.cbx();
    caN();
    caO();
    caP();
    caQ();
    caR();
    L(this.ldh);
    if (!this.ldh.field_username.equals(r.Yz()))
      M(this.ldh);
    AppMethodBeat.o(23412);
  }

  public void onClick(View paramView)
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(23411);
    super.onCreate(paramBundle);
    this.ejU = getIntent().getBooleanExtra("Is_RoomOwner", false);
    this.ejD = getIntent().getStringExtra("Contact_ChatRoomId");
    this.edV = getIntent().getStringExtra("Contact_User");
    aw.ZK();
    this.ldh = c.XM().aoO(this.edV);
    this.plY = getIntent().getStringExtra("KLinkedInAddFriendNickName");
    this.plZ = getIntent().getStringExtra("KLinkedInAddFriendPubUrl");
    this.pma = getIntent().getStringExtra("verify_gmail");
    this.pmb = getIntent().getStringExtra("profileName");
    if (!bo.isNullOrNil(this.ejD))
    {
      aw.ZK();
      this.eih = c.XV().oa(this.ejD);
    }
    this.pkh = new b(this, this.ldh);
    initView();
    AppMethodBeat.o(23411);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI
 * JD-Core Version:    0.6.2
 */