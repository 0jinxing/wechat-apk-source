package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ae;
import com.tencent.mm.plugin.account.friend.a.af;
import com.tencent.mm.plugin.account.friend.ui.InviteFriendUI;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.auz;
import com.tencent.mm.protocal.protobuf.ayl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class GoogleFriendUI extends MMActivity
  implements AdapterView.OnItemClickListener, d.a, f, a.a
{
  private String gqI;
  private boolean gql;
  private String gqn;
  private ProgressDialog gqo;
  private int gqq;
  private TextView gqv;
  private ListView gti;
  private a gtj;
  private String gtk;
  private String gtl;
  private af gtm;
  private ArrayList<com.tencent.mm.plugin.account.friend.a.n> gtn;
  private HashMap<String, com.tencent.mm.plugin.account.friend.a.n> gto;
  private boolean xH;

  public GoogleFriendUI()
  {
    AppMethodBeat.i(13668);
    this.gql = false;
    this.xH = false;
    this.gtn = new ArrayList();
    this.gto = new HashMap();
    AppMethodBeat.o(13668);
  }

  private void a(Cursor paramCursor, com.tencent.mm.plugin.account.friend.a.n paramn)
  {
    AppMethodBeat.i(13683);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    if (paramCursor != null)
    {
      paramCursor.moveToFirst();
      int i = paramCursor.getCount();
      for (int j = 0; j < i; j++)
      {
        localObject = new com.tencent.mm.plugin.account.friend.a.n();
        ((com.tencent.mm.plugin.account.friend.a.n)localObject).d(paramCursor);
        localArrayList1.add(((com.tencent.mm.plugin.account.friend.a.n)localObject).field_googlegmail);
        localArrayList2.add(Integer.valueOf(j));
        localArrayList3.add(localObject);
        paramCursor.moveToNext();
      }
      localArrayList2.add(Integer.valueOf(-1));
    }
    Object localObject = this.mController.ylL;
    paramCursor = getResources().getString(2131300375);
    getResources().getString(2131296868);
    h.a((Context)localObject, paramCursor, localArrayList1, localArrayList2, new GoogleFriendUI.4(this, localArrayList3, paramn));
    AppMethodBeat.o(13683);
  }

  private void a(com.tencent.mm.plugin.account.friend.a.n paramn1, com.tencent.mm.plugin.account.friend.a.n paramn2)
  {
    AppMethodBeat.i(13684);
    Object localObject = new ArrayList();
    ((ArrayList)localObject).add(paramn1.field_googlegmail);
    localObject = new ae((ArrayList)localObject);
    ab.d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", new Object[] { paramn1.field_googleitemid });
    g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
    if (paramn2 == null)
    {
      ((ae)localObject).gwh = paramn1.field_googleitemid;
      paramn1.field_googlecgistatus = 0;
      ((com.tencent.mm.plugin.account.friend.a.o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).b(paramn1);
    }
    while (true)
    {
      this.gtj.KC();
      AppMethodBeat.o(13684);
      return;
      ((ae)localObject).gwh = paramn2.field_googleitemid;
      paramn2.field_googlecgistatus = 0;
      ((com.tencent.mm.plugin.account.friend.a.o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).b(paramn2);
    }
  }

  private void a(ayl paramayl)
  {
    try
    {
      AppMethodBeat.i(13687);
      ab.i("MicroMsg.GoogleContact.GoogleFriendUI", "handleListGoogleContactCGIResponse Count:%d", new Object[] { Integer.valueOf(paramayl.jBv) });
      if (this.gtj != null)
        this.gtj.KC();
      AppMethodBeat.o(13687);
      return;
    }
    finally
    {
    }
    throw paramayl;
  }

  private void aoW()
  {
    AppMethodBeat.i(13689);
    if ((this.gqo == null) || (!this.gqo.isShowing()))
    {
      getString(2131297061);
      this.gqo = h.b(this, getString(2131297086), true, new GoogleFriendUI.5(this));
    }
    AppMethodBeat.o(13689);
  }

  private void aoX()
  {
    AppMethodBeat.i(13690);
    if ((this.gqo != null) && (this.gqo.isShowing()))
      this.gqo.dismiss();
    AppMethodBeat.o(13690);
  }

  private void apj()
  {
    AppMethodBeat.i(13676);
    ab.d("MicroMsg.GoogleContact.GoogleFriendUI", "updateToken");
    apk();
    if ((TextUtils.isEmpty(this.gtl)) || ((!this.gql) && (TextUtils.isEmpty(this.gqI))))
    {
      aA(BindGoogleContactUI.class);
      finish();
      AppMethodBeat.o(13676);
    }
    while (true)
    {
      return;
      apl();
      AppMethodBeat.o(13676);
    }
  }

  private void apk()
  {
    AppMethodBeat.i(13681);
    if (this.gql)
    {
      this.gtl = ((String)g.RP().Ry().get(208901, null));
      AppMethodBeat.o(13681);
    }
    while (true)
    {
      return;
      this.gtl = ((String)g.RP().Ry().get(208902, null));
      this.gqI = ((String)g.RP().Ry().get(208904, null));
      AppMethodBeat.o(13681);
    }
  }

  private void apl()
  {
    AppMethodBeat.i(13682);
    if (this.gql)
    {
      apn();
      AppMethodBeat.o(13682);
    }
    while (true)
    {
      return;
      apm();
      AppMethodBeat.o(13682);
    }
  }

  private void apm()
  {
    AppMethodBeat.i(13685);
    aoW();
    new GoogleFriendUI.c(this, this.gqI).execute(new Void[0]);
    AppMethodBeat.o(13685);
  }

  private void apn()
  {
    AppMethodBeat.i(13686);
    this.xH = false;
    aoW();
    new GoogleFriendUI.b(this, this, this.gtl, (byte)0).execute(new Void[0]);
    AppMethodBeat.o(13686);
  }

  private void dk(boolean paramBoolean)
  {
    AppMethodBeat.i(13688);
    this.gqv.setVisibility(0);
    String str;
    if (!at.isConnected(this))
      str = getString(2131300374);
    while (true)
    {
      this.gqv.setText(str);
      AppMethodBeat.o(13688);
      return;
      if (paramBoolean)
        str = getString(2131300367);
      else
        str = getString(2131300366);
    }
  }

  public final int getLayoutId()
  {
    return 2130969797;
  }

  public final void initView()
  {
    AppMethodBeat.i(13673);
    setMMTitle(2131300368);
    setBackBtn(new GoogleFriendUI.1(this));
    this.gqv = ((TextView)findViewById(2131821749));
    this.gti = ((ListView)findViewById(2131824661));
    this.gti.setAdapter(this.gtj);
    this.gti.setOnItemClickListener(this);
    com.tencent.mm.ui.tools.o localo = new com.tencent.mm.ui.tools.o((byte)0);
    localo.zHa = new GoogleFriendUI.2(this);
    a(localo);
    AppMethodBeat.o(13673);
  }

  public final void mS(int paramInt)
  {
    AppMethodBeat.i(13677);
    if (this.gtj == null)
      AppMethodBeat.o(13677);
    com.tencent.mm.plugin.account.friend.a.n localn;
    while (true)
    {
      return;
      localn = (com.tencent.mm.plugin.account.friend.a.n)this.gtj.getItem(paramInt);
      if (localn != null)
        break;
      AppMethodBeat.o(13677);
    }
    switch (localn.field_status)
    {
    default:
    case 0:
    case 1:
    }
    label266: 
    while (true)
    {
      AppMethodBeat.o(13677);
      break;
      Object localObject1 = new com.tencent.mm.pluginsdk.ui.applet.a(this, new GoogleFriendUI.3(this));
      Object localObject2 = localn.field_googleitemid;
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).vjO = false;
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).vjN = true;
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).gyj = ((String)localObject2);
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).vjO = false;
      localObject2 = new LinkedList();
      ((LinkedList)localObject2).add(Integer.valueOf(58));
      ((com.tencent.mm.pluginsdk.ui.applet.a)localObject1).b(localn.field_username, (LinkedList)localObject2, true);
      localn.field_googlecgistatus = 0;
      ((com.tencent.mm.plugin.account.friend.a.o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).b(localn);
      this.gtj.KC();
      AppMethodBeat.o(13677);
      break;
      localObject1 = localn.field_googleid;
      localObject1 = ((com.tencent.mm.plugin.account.friend.a.o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).wg((String)localObject1);
      if ((localObject1 == null) || (((Cursor)localObject1).getCount() <= 1))
        a(localn, null);
      while (true)
      {
        if (localObject1 == null)
          break label266;
        ((Cursor)localObject1).close();
        break;
        a((Cursor)localObject1, localn);
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(13675);
    ab.i("MicroMsg.GoogleContact.GoogleFriendUI", "requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt1 == 2005)
      if (paramInt2 == -1)
      {
        this.gql = paramIntent.getBooleanExtra("gpservices", false);
        apj();
        AppMethodBeat.o(13675);
      }
    while (true)
    {
      return;
      this.gql = paramIntent.getBooleanExtra("gpservices", false);
      finish();
      AppMethodBeat.o(13675);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(13680);
    super.onBackPressed();
    AppMethodBeat.o(13680);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13669);
    super.onCreate(paramBundle);
    this.gqn = ((String)g.RP().Ry().get(208903, null));
    if (TextUtils.isEmpty(this.gqn))
      finish();
    this.gqq = getIntent().getIntExtra("enter_scene", 0);
    this.gtj = new a(this, this.gqn);
    this.gtj.gsZ = this;
    initView();
    this.gql = com.tencent.mm.plugin.account.friend.a.m.cx(this);
    if (this.gql)
    {
      ab.d("MicroMsg.GoogleContact.GoogleFriendUI", "startActivityCheckGooglePlayServices");
      startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 2005);
    }
    while (true)
    {
      ((com.tencent.mm.plugin.account.friend.a.o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).clear();
      AppMethodBeat.o(13669);
      return;
      apj();
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13672);
    super.onDestroy();
    ((com.tencent.mm.plugin.account.friend.a.o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).clear();
    AppMethodBeat.o(13672);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(13674);
    ab.d("MicroMsg.GoogleContact.GoogleFriendUI", "onItemClick position:%d,", new Object[] { Integer.valueOf(paramInt) });
    Object localObject;
    if (this.gtj != null)
    {
      int i = this.gti.getHeaderViewsCount();
      paramAdapterView = (com.tencent.mm.plugin.account.friend.a.n)this.gtj.getItem(paramInt - i);
      if (paramAdapterView != null)
      {
        paramView = paramAdapterView.field_username;
        ab.d("MicroMsg.GoogleContact.GoogleFriendUI", "jumpToProfile email:%s, username:%s", new Object[] { paramAdapterView.field_googlegmail, paramView });
        localObject = ((j)g.K(j.class)).XM().aoO(paramView);
        if (((localObject != null) && (com.tencent.mm.n.a.jh(((ap)localObject).field_type))) || (!TextUtils.isEmpty(paramAdapterView.field_nickname)))
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("Contact_User", paramView);
          ((Intent)localObject).putExtra("Contact_Nick", paramAdapterView.field_nickname);
          ((Intent)localObject).putExtra("Contact_ShowFMessageList", true);
          ((Intent)localObject).putExtra("verify_gmail", paramAdapterView.field_googlegmail);
          ((Intent)localObject).putExtra("profileName", paramAdapterView.field_googlename);
          ((Intent)localObject).putExtra("Contact_Source_FMessage", 58);
          ((Intent)localObject).putExtra("Contact_Scene", 58);
          if ((paramView != null) && (paramView.length() > 0))
            com.tencent.mm.plugin.account.a.a.gkE.c((Intent)localObject, this.mController.ylL);
          AppMethodBeat.o(13674);
        }
      }
    }
    while (true)
    {
      return;
      localObject = new Intent(this, InviteFriendUI.class);
      ((Intent)localObject).putExtra("friend_type", 2);
      ((Intent)localObject).putExtra("friend_user_name", paramView);
      ((Intent)localObject).putExtra("friend_num", paramAdapterView.field_googlegmail);
      ((Intent)localObject).putExtra("friend_nick", paramAdapterView.field_googlename);
      ((Intent)localObject).putExtra("friend_weixin_nick", paramAdapterView.field_nickname);
      ((Intent)localObject).putExtra("friend_googleID", paramAdapterView.field_googleid);
      ((Intent)localObject).putExtra("friend_googleItemID", paramAdapterView.field_googleitemid);
      ((Intent)localObject).putExtra("friend_scene", 58);
      ((Intent)localObject).putExtra("Contact_Scene", 58);
      startActivity((Intent)localObject);
      AppMethodBeat.o(13674);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(13670);
    super.onResume();
    g.Rg().a(488, this);
    g.Rg().a(489, this);
    com.tencent.mm.ah.o.acd().d(this);
    if (this.gtj != null)
      this.gtj.KC();
    AppMethodBeat.o(13670);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(13678);
    String str;
    int i;
    if (TextUtils.isEmpty(paramString))
    {
      str = "";
      ab.i("MicroMsg.GoogleContact.GoogleFriendUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str });
      i = paramm.getType();
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label305;
      switch (i)
      {
      default:
        ab.w("MicroMsg.GoogleContact.GoogleFriendUI", "Unknow scene type.");
      case 489:
      case 30:
      case 137:
      case 488:
      }
    }
    while (true)
    {
      aoX();
      AppMethodBeat.o(13678);
      return;
      str = paramString;
      break;
      if (this.gtj != null)
      {
        paramString = (ae)paramm;
        ab.i("MicroMsg.GoogleContact.GoogleFriendUI", "count:%d", new Object[] { Integer.valueOf(paramString.aqh().jBv) });
        paramString = paramString.gwh;
        ab.d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", new Object[] { paramString });
        ((com.tencent.mm.plugin.account.friend.a.o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).aj(paramString, 1);
        this.gtj.KC();
        continue;
        if (this.gtj != null)
        {
          paramString = ((com.tencent.mm.pluginsdk.model.m)paramm).gwh;
          ab.d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", new Object[] { paramString });
          ((com.tencent.mm.plugin.account.friend.a.o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).aj(paramString, 1);
          this.gtj.KC();
          continue;
          a(((af)paramm).aqi());
          continue;
          switch (i)
          {
          default:
            ab.w("MicroMsg.GoogleContact.GoogleFriendUI", "Unknow scene type.");
            break;
          case 489:
            if (this.gtj != null)
            {
              paramString = (ae)paramm;
              ab.i("MicroMsg.GoogleContact.GoogleFriendUI", "count:%d", new Object[] { Integer.valueOf(paramString.aqh().jBv) });
              paramString = paramString.gwh;
              ab.d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", new Object[] { paramString });
              ((com.tencent.mm.plugin.account.friend.a.o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).aj(paramString, 1);
              this.gtj.KC();
            }
            break;
          case 30:
          case 137:
            if (paramInt2 == -87)
              h.b(this, getString(2131298465), "", true);
            while (this.gtj != null)
            {
              paramString = ((com.tencent.mm.pluginsdk.model.m)paramm).gwh;
              ab.d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", new Object[] { paramString });
              ((com.tencent.mm.plugin.account.friend.a.o)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getGoogleFriendStorage()).aj(paramString, 2);
              this.gtj.KC();
              break;
              if (((paramInt2 == -24) || (paramInt2 == -101)) && (!bo.isNullOrNil(paramString)))
                Toast.makeText(this, paramString, 1).show();
            }
          case 488:
            label305: dk(false);
          }
        }
      }
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(13671);
    super.onStop();
    g.Rg().b(488, this);
    g.Rg().b(489, this);
    com.tencent.mm.ah.o.acd().e(this);
    AppMethodBeat.o(13671);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(13679);
    if (this.gtj != null)
      this.gtj.notifyDataSetChanged();
    AppMethodBeat.o(13679);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI
 * JD-Core Version:    0.6.2
 */