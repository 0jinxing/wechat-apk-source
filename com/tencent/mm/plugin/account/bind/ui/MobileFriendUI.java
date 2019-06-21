package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.a.e;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.a.al;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.o;
import java.util.List;

public class MobileFriendUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private ProgressDialog ehJ = null;
  private TextView emptyTipTv = null;
  private ListView gtT;
  b gtU;
  private View gtV;
  private al gtW;
  String gtX;
  private TextView gtY = null;

  private void aps()
  {
    AppMethodBeat.i(13735);
    if (com.tencent.luggage.g.b.yj())
    {
      boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.WRITE_CONTACTS", 48, null, null);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MobileFriendUI", "onCreateAfterMPermissionGranted() checkContacts(android.Manifest.permission.WRITE_CONTACTS)[%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
        AppMethodBeat.o(13735);
    }
    while (true)
    {
      return;
      getData();
      AppMethodBeat.o(13735);
    }
  }

  private void getData()
  {
    AppMethodBeat.i(13737);
    Object localObject;
    if (!l.apR())
    {
      localObject = this.mController.ylL;
      getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject, getString(2131301455), true, new MobileFriendUI.9(this));
      if (this.gtU.getCount() == 0)
      {
        if ((!((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).syncAddrBook(new MobileFriendUI.10(this))) && (this.ehJ != null))
        {
          this.ehJ.dismiss();
          this.ehJ = null;
        }
        AppMethodBeat.o(13737);
      }
    }
    while (true)
    {
      return;
      List localList = l.aqb();
      localObject = l.aqa();
      if ((localList.size() != 0) || (((List)localObject).size() != 0))
      {
        this.gtW = new al(l.aqb(), l.aqa());
        com.tencent.mm.kernel.g.Rg().a(this.gtW, 0);
        AppMethodBeat.o(13737);
      }
      else
      {
        localObject = new com.tencent.mm.plugin.account.friend.a.ab();
        com.tencent.mm.kernel.g.Rg().a((m)localObject, 0);
        AppMethodBeat.o(13737);
      }
    }
  }

  public final void b(com.tencent.mm.plugin.account.friend.a.a parama)
  {
    AppMethodBeat.i(13742);
    if (bo.isNullOrNil(parama.getUsername()))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MobileFriendUI", "username is null");
      AppMethodBeat.o(13742);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("Contact_User", parama.getUsername());
      localIntent.putExtra("Contact_Nick", parama.apD());
      localIntent.putExtra("Contact_Mobile_MD5", parama.Aq());
      localIntent.putExtra("Contact_Alias", parama.guS);
      localIntent.putExtra("Contact_Sex", parama.guN);
      localIntent.putExtra("Contact_Signature", parama.guQ);
      localIntent.putExtra("Contact_RegionCode", RegionCodeDecoder.aC(parama.guW, parama.guO, parama.guP));
      localIntent.putExtra("Contact_Scene", 13);
      localIntent.putExtra("Contact_ShowUserName", false);
      com.tencent.mm.plugin.account.a.a.gkE.c(localIntent, this);
      AppMethodBeat.o(13742);
    }
  }

  public final int getLayoutId()
  {
    return 2130970235;
  }

  public final void initView()
  {
    AppMethodBeat.i(13741);
    this.emptyTipTv = ((TextView)findViewById(2131824026));
    this.emptyTipTv.setText(2131301453);
    this.gtY = ((TextView)findViewById(2131824027));
    this.gtY.setText(2131301472);
    this.gtV = findViewById(2131824014);
    this.gtT = ((ListView)findViewById(2131824012));
    Object localObject = new o((byte)0);
    ((o)localObject).zHa = new MobileFriendUI.11(this);
    a((o)localObject);
    boolean bool;
    if (com.tencent.mm.model.a.g.aaK().oP("2") != null)
    {
      localObject = com.tencent.mm.model.a.g.aaK().oP("2").value;
      if (((String)localObject).equals("0"))
      {
        bool = false;
        com.tencent.mm.model.a.f.oT("2");
      }
    }
    while (true)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MobileFriendUI", "ABTest Type, NEW(%B)", new Object[] { Boolean.valueOf(bool) });
      if (!bool);
      for (this.gtU = new c(this, new MobileFriendUI.12(this)); ; this.gtU = new d(this, new MobileFriendUI.13(this)))
      {
        this.gtT.setAdapter(this.gtU);
        this.gtT.setOnItemClickListener(new MobileFriendUI.14(this));
        this.gtU.a(new MobileFriendUI.15(this));
        if ((l.apS() != l.a.gvz) && (l.apS() != l.a.gvA))
        {
          this.gtV = findViewById(2131824014);
          this.gtV.setVisibility(0);
          this.gtV.setOnClickListener(new MobileFriendUI.2(this));
          this.gtT.setVisibility(8);
        }
        setBackBtn(new MobileFriendUI.3(this));
        new MobileFriendUI.4(this);
        if ((!r.Zc()) || (l.apR()))
          com.tencent.mm.ui.base.h.a(this, 2131297521, 2131297061, 2131296994, 2131296868, new MobileFriendUI.5(this), new MobileFriendUI.6(this));
        AppMethodBeat.o(13741);
        return;
        if (!((String)localObject).equals("1"))
          break label403;
        bool = true;
        break;
      }
      label403: bool = true;
      break;
      bool = true;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13734);
    super.onCreate(paramBundle);
    setMMTitle(2131301457);
    ((com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg()).fni.hY("qqlist", "update addr_upload2 set reserved4=0");
    com.tencent.mm.kernel.g.Rg().a(32, this);
    com.tencent.mm.kernel.g.Rg().a(133, this);
    initView();
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MobileFriendUI", "summerper checkPermission checkContacts(android.Manifest.permission.READ_CONTACTS)[%b]", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
      AppMethodBeat.o(13734);
    while (true)
    {
      return;
      aps();
      AppMethodBeat.o(13734);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13740);
    com.tencent.mm.model.a.f.oU("2");
    com.tencent.mm.kernel.g.Rg().b(32, this);
    com.tencent.mm.kernel.g.Rg().b(133, this);
    this.gtU.bIf();
    super.onDestroy();
    AppMethodBeat.o(13740);
  }

  public void onPause()
  {
    AppMethodBeat.i(13739);
    super.onPause();
    AppMethodBeat.o(13739);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(13736);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MobileFriendUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(13736);
      return;
    }
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MobileFriendUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 48:
    }
    while (true)
    {
      AppMethodBeat.o(13736);
      break;
      if (paramArrayOfInt[0] == 0)
      {
        aps();
        AppMethodBeat.o(13736);
        break;
      }
      com.tencent.mm.ui.base.h.a(this, getString(2131301922), getString(2131301936), getString(2131300878), getString(2131296868), false, new MobileFriendUI.1(this), new MobileFriendUI.8(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(13738);
    super.onResume();
    this.gtU.notifyDataSetChanged();
    AppMethodBeat.o(13738);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(13743);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MobileFriendUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if ((paramm.getType() == 32) && (this.ehJ != null))
    {
      this.ehJ.dismiss();
      this.ehJ = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MobileFriendUI", "onSceneEnd: errType = " + paramInt1 + ", errCode = " + paramInt2);
    if (paramm.getType() == 133)
    {
      paramString = new com.tencent.mm.plugin.account.friend.a.ab();
      com.tencent.mm.kernel.g.Rg().a(paramString, 0);
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (paramm.getType() == 32)
        ((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).updateAllContact();
      this.gtU.a(null, null);
      AppMethodBeat.o(13743);
    }
    while (true)
    {
      return;
      if (paramm.getType() == 32)
        Toast.makeText(this, 2131301454, 0).show();
      AppMethodBeat.o(13743);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.MobileFriendUI
 * JD-Core Version:    0.6.2
 */