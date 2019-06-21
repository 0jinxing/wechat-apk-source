package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.b;
import com.tencent.mm.plugin.account.friend.a.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.e.b;
import java.util.LinkedList;
import junit.framework.Assert;

class NormalUserFooterPreference$c extends NormalUserFooterPreference.a
{
  public NormalUserFooterPreference$c(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
    super(paramNormalUserFooterPreference);
  }

  private void cbt()
  {
    AppMethodBeat.i(23708);
    Object localObject1 = NormalUserFooterPreference.b(this.poR).getIntent().getStringExtra("Contact_Mobile_MD5");
    Object localObject2 = NormalUserFooterPreference.b(this.poR).getIntent().getStringExtra("Contact_full_Mobile_MD5");
    String str = bo.nullAsNil((String)localObject1);
    localObject1 = bo.nullAsNil((String)localObject2);
    if ((!str.equals("")) || (!((String)localObject1).equals("")))
    {
      localObject2 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW(str);
      if (localObject2 != null)
        break label115;
      localObject2 = com.tencent.mm.plugin.account.a.getAddrUploadStg().vW((String)localObject1);
    }
    while (true)
    {
      if (localObject2 == null)
        AppMethodBeat.o(23708);
      while (true)
      {
        return;
        com.tencent.mm.plugin.account.a.getAddrUploadStg().a((String)localObject1, (com.tencent.mm.plugin.account.friend.a.a)localObject2);
        AppMethodBeat.o(23708);
      }
      label115: localObject1 = str;
    }
  }

  protected final void Xy()
  {
    AppMethodBeat.i(23704);
    super.Xy();
    AppMethodBeat.o(23704);
  }

  protected void cbn()
  {
    AppMethodBeat.i(23706);
    boolean bool;
    if (!t.nI(NormalUserFooterPreference.a(this.poR).field_username))
    {
      bool = true;
      Assert.assertTrue(bool);
      NormalUserFooterPreference.r(this.poR).setVisibility(8);
      NormalUserFooterPreference.s(this.poR).setVisibility(8);
      if (!NormalUserFooterPreference.d(this.poR))
        break label194;
      NormalUserFooterPreference.D(this.poR).setOnClickListener(new NormalUserFooterPreference.c.1(this));
      if (!com.tencent.mm.n.a.jh(NormalUserFooterPreference.a(this.poR).field_type))
        break label179;
      NormalUserFooterPreference.D(this.poR).setVisibility(0);
      label107: NormalUserFooterPreference.t(this.poR).setVisibility(8);
      NormalUserFooterPreference.f(this.poR).setVisibility(8);
      NormalUserFooterPreference.g(this.poR).setVisibility(8);
      NormalUserFooterPreference.h(this.poR).setVisibility(8);
      NormalUserFooterPreference.q(this.poR).setVisibility(8);
      AppMethodBeat.o(23706);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label179: NormalUserFooterPreference.D(this.poR).setVisibility(8);
      break label107;
      label194: NormalUserFooterPreference.t(this.poR).setOnClickListener(new NormalUserFooterPreference.c.2(this));
      if (!com.tencent.mm.n.a.jh(NormalUserFooterPreference.a(this.poR).field_type))
      {
        NormalUserFooterPreference.t(this.poR).setVisibility(0);
        NormalUserFooterPreference.f(this.poR).setVisibility(8);
        NormalUserFooterPreference.g(this.poR).setVisibility(8);
        NormalUserFooterPreference.h(this.poR).setVisibility(8);
        if (NormalUserFooterPreference.a(this.poR).Oa())
        {
          NormalUserFooterPreference.q(this.poR).setVisibility(0);
          AppMethodBeat.o(23706);
        }
      }
      else
      {
        NormalUserFooterPreference.t(this.poR).setVisibility(8);
        NormalUserFooterPreference.f(this.poR).setVisibility(0);
        if ((!this.poR.cbk()) && (!NormalUserFooterPreference.a(this.poR).field_username.equals(r.Yz())) && (!t.nI(NormalUserFooterPreference.a(this.poR).field_username)) && (!t.nB(NormalUserFooterPreference.a(this.poR).field_username)) && (!ad.aox(NormalUserFooterPreference.a(this.poR).field_username)) && (!t.mX(NormalUserFooterPreference.a(this.poR).field_username)))
          NormalUserFooterPreference.h(this.poR).setVisibility(0);
        while (true)
        {
          aw.ZK();
          if (!c.XM().aoR(NormalUserFooterPreference.a(this.poR).field_username))
            break;
          NormalUserFooterPreference.k(this.poR).setVisibility(0);
          NormalUserFooterPreference.a(this.poR, NormalUserFooterPreference.a(this.poR).getSource());
          break;
          NormalUserFooterPreference.h(this.poR).setVisibility(8);
        }
        NormalUserFooterPreference.q(this.poR).setVisibility(8);
        AppMethodBeat.o(23706);
      }
    }
  }

  protected final void cbs()
  {
    AppMethodBeat.i(23707);
    Object localObject;
    if ((int)NormalUserFooterPreference.a(this.poR).ewQ == 0)
    {
      aw.ZK();
      if (c.XM().aa(NormalUserFooterPreference.a(this.poR)) != -1)
      {
        localObject = this.poR;
        aw.ZK();
        NormalUserFooterPreference.a((NormalUserFooterPreference)localObject, c.XM().aoO(NormalUserFooterPreference.a(this.poR).field_username));
      }
    }
    com.tencent.mm.pluginsdk.ui.applet.a locala;
    LinkedList localLinkedList;
    String str;
    if ((NormalUserFooterPreference.F(this.poR)) || (NormalUserFooterPreference.l(this.poR) == 12))
    {
      ab.d("MicroMsg.NormalUserFooterPreference", "qqNum " + NormalUserFooterPreference.G(this.poR) + " qqReamrk " + NormalUserFooterPreference.H(this.poR));
      if ((NormalUserFooterPreference.G(this.poR) != 0L) && (NormalUserFooterPreference.H(this.poR) != null) && (!NormalUserFooterPreference.H(this.poR).equals("")))
      {
        localObject = com.tencent.mm.plugin.account.a.getQQListStg().ge(NormalUserFooterPreference.G(this.poR));
        if (localObject == null)
        {
          localObject = new ao();
          ((ao)localObject).nickname = "";
          ((ao)localObject).gwC = NormalUserFooterPreference.G(this.poR);
          ((ao)localObject).gwK = NormalUserFooterPreference.H(this.poR);
          ((ao)localObject).username = NormalUserFooterPreference.a(this.poR).field_username;
          ((ao)localObject).aqu();
          com.tencent.mm.plugin.account.a.getQQListStg().a((ao)localObject);
        }
      }
      else
      {
        cbt();
        locala = new com.tencent.mm.pluginsdk.ui.applet.a(this.poR.mContext, new NormalUserFooterPreference.c.3(this));
        localLinkedList = new LinkedList();
        localLinkedList.add(Integer.valueOf(NormalUserFooterPreference.l(this.poR)));
        localObject = NormalUserFooterPreference.b(this.poR).getIntent().getStringExtra("source_from_user_name");
        str = NormalUserFooterPreference.b(this.poR).getIntent().getStringExtra("source_from_nick_name");
        locala.hH((String)localObject, str);
        locala.vjI = new NormalUserFooterPreference.c.4(this, (String)localObject, str);
        str = NormalUserFooterPreference.b(this.poR).getIntent().getStringExtra("room_name");
        localObject = NormalUserFooterPreference.b(this.poR).getIntent().getStringExtra(e.b.yfT);
        if (TextUtils.isEmpty((CharSequence)localObject))
          break label567;
        ab.i("MicroMsg.NormalUserFooterPreference", "add contact case 1:%s", new Object[] { localObject });
        locala.ajw((String)localObject);
        locala.c(NormalUserFooterPreference.a(this.poR).field_username, "", localLinkedList);
        AppMethodBeat.o(23707);
      }
    }
    while (true)
    {
      return;
      ((ao)localObject).gwC = NormalUserFooterPreference.G(this.poR);
      ((ao)localObject).gwK = NormalUserFooterPreference.H(this.poR);
      ((ao)localObject).username = NormalUserFooterPreference.a(this.poR).field_username;
      ((ao)localObject).aqu();
      com.tencent.mm.plugin.account.a.getQQListStg().a(NormalUserFooterPreference.G(this.poR), (ao)localObject);
      break;
      if ((NormalUserFooterPreference.l(this.poR) != 58) && (NormalUserFooterPreference.l(this.poR) != 59) && (NormalUserFooterPreference.l(this.poR) != 60))
        break;
      com.tencent.mm.plugin.account.a.getGoogleFriendStorage().ak(NormalUserFooterPreference.a(this.poR).field_username, 1);
      break;
      label567: if (TextUtils.isEmpty(str))
      {
        ab.i("MicroMsg.NormalUserFooterPreference", "add contact case 2, %s", new Object[] { NormalUserFooterPreference.a(this.poR).dus });
        locala.ajw(NormalUserFooterPreference.a(this.poR).dus);
        locala.e(NormalUserFooterPreference.a(this.poR).field_username, localLinkedList);
        AppMethodBeat.o(23707);
      }
      else if (!TextUtils.isEmpty(locala.mGZ))
      {
        ab.i("MicroMsg.NormalUserFooterPreference", "add contact case 3, %s", new Object[] { NormalUserFooterPreference.a(this.poR).dus });
        locala.ajw(NormalUserFooterPreference.a(this.poR).dus);
        locala.c(NormalUserFooterPreference.a(this.poR).field_username, str, localLinkedList);
        AppMethodBeat.o(23707);
      }
      else
      {
        aw.ZK();
        localObject = c.XM().aoO(NormalUserFooterPreference.a(this.poR).field_username);
        if (localObject != null);
        for (localObject = bo.bc(((com.tencent.mm.g.c.ap)localObject).dus, ""); ; localObject = "")
        {
          ab.i("MicroMsg.NormalUserFooterPreference", "dkverify footer add:%s chat:%s ticket:%s", new Object[] { NormalUserFooterPreference.a(this.poR).field_username, str, localObject });
          if (TextUtils.isEmpty((CharSequence)localObject))
            break label828;
          locala.ajw((String)localObject);
          locala.c(NormalUserFooterPreference.a(this.poR).field_username, str, localLinkedList);
          AppMethodBeat.o(23707);
          break;
        }
        label828: ao.a.flu.a(NormalUserFooterPreference.a(this.poR).field_username, str, new NormalUserFooterPreference.c.5(this, locala, str, localLinkedList));
        AppMethodBeat.o(23707);
      }
    }
  }

  protected void onDetach()
  {
    AppMethodBeat.i(23705);
    super.onDetach();
    AppMethodBeat.o(23705);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.c
 * JD-Core Version:    0.6.2
 */