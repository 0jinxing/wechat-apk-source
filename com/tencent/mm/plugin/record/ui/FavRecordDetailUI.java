package com.tencent.mm.plugin.record.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavRecordDetailUI extends RecordMsgBaseUI
{
  private boolean cHc;
  private k.a mgG;
  private com.tencent.mm.plugin.fav.a.g mjP;
  private long pKf;
  private boolean pKg;
  private boolean pKh;

  public FavRecordDetailUI()
  {
    AppMethodBeat.i(24210);
    this.pKf = -1L;
    this.cHc = true;
    this.pKg = true;
    this.pKh = false;
    this.mgG = new FavRecordDetailUI.1(this);
    AppMethodBeat.o(24210);
  }

  protected final void ceI()
  {
    AppMethodBeat.i(24212);
    this.pKf = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.cHc = getIntent().getBooleanExtra("show_share", true);
    this.mjP = com.tencent.mm.plugin.record.b.g.jD(this.pKf);
    if (this.mjP == null)
    {
      finish();
      AppMethodBeat.o(24212);
      return;
    }
    F(this.mjP);
    Object localObject1 = new b();
    ((b)localObject1).mnW = this.mjP;
    ((b)localObject1).pJZ = this.mjP.field_favProto.wiv;
    Object localObject2 = ((b)localObject1).pJZ;
    if (localObject2 == null)
      this.pKg = false;
    while (true)
    {
      super.ceI();
      this.pKw.a((a)localObject1);
      localObject1 = ((b)localObject1).pJZ;
      if (localObject1 != null)
        com.tencent.mm.sdk.g.d.post(new FavRecordDetailUI.4(this, (List)localObject1), "calc_fav_record_info");
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().c(this.mgG);
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().a(((d)this.pKw).pKb);
      AppMethodBeat.o(24212);
      break;
      if (((List)localObject2).size() == 0)
      {
        this.pKg = false;
      }
      else
      {
        localObject2 = ((List)localObject2).iterator();
        while (true)
          if (((Iterator)localObject2).hasNext())
            if (((aar)((Iterator)localObject2).next()).whh != 0)
            {
              this.pKg = false;
              break;
            }
        this.pKg = true;
      }
    }
  }

  protected final h ceJ()
  {
    AppMethodBeat.i(24213);
    d locald = new d(this, new c(this));
    AppMethodBeat.o(24213);
    return locald;
  }

  protected final String ceK()
  {
    AppMethodBeat.i(24217);
    Object localObject;
    if ((14 == this.mjP.field_type) && (!bo.isNullOrNil(this.mjP.field_favProto.title)))
      localObject = this.mjP.field_favProto.title;
    while (true)
    {
      AppMethodBeat.o(24217);
      return localObject;
      abl localabl = this.mjP.field_favProto.wit;
      if ((localabl != null) && (!bo.isNullOrNil(localabl.whU)))
      {
        String str1 = s.mJ(localabl.whU);
        String str2;
        if (r.Yz().equals(localabl.cEV))
        {
          str2 = n.mK(localabl.toUser);
          localObject = str1;
          if (!bo.bc(str2, "").equals(localabl.toUser))
            localObject = str1 + " - " + str2;
        }
        while (true)
        {
          ab.v("MicroMsg.FavRecordDetailUI", "display name, source from[%s] to[%s]", new Object[] { localabl.cEV, localabl.toUser });
          break;
          str2 = n.mK(localabl.cEV);
          localObject = str1;
          if (!bo.bc(str2, "").equals(localabl.cEV))
            localObject = str1 + " - " + str2;
        }
      }
      ab.v("MicroMsg.FavRecordDetailUI", "display name, from item info user[%s]", new Object[] { this.mjP.field_fromUser });
      localObject = n.mK(this.mjP.field_fromUser);
    }
  }

  protected final String ceL()
  {
    AppMethodBeat.i(24218);
    Object localObject = this.mjP.field_favProto.wiv;
    if (((LinkedList)localObject).size() > 0)
    {
      localObject = ((aar)((LinkedList)localObject).getFirst()).wgX;
      AppMethodBeat.o(24218);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(24218);
    }
  }

  protected final String ceM()
  {
    AppMethodBeat.i(24219);
    Object localObject = this.mjP.field_favProto.wiv;
    if (((LinkedList)localObject).size() > 0)
    {
      localObject = ((aar)((LinkedList)localObject).getLast()).wgX;
      AppMethodBeat.o(24219);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(24219);
    }
  }

  protected final void ceN()
  {
    AppMethodBeat.i(24220);
    if (!this.cHc)
      AppMethodBeat.o(24220);
    while (true)
    {
      return;
      addIconOptionMenu(0, 2131304081, 2130839555, new FavRecordDetailUI.2(this));
      AppMethodBeat.o(24220);
    }
  }

  protected final void d(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(24221);
    Object localObject;
    if ((4097 == paramInt1) && (-1 == paramInt2))
    {
      localObject = new gh();
      ((gh)localObject).cAH.type = 32;
      ((gh)localObject).cAH.cvv = this.pKf;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      if (((gh)localObject).cAI.cAY)
      {
        com.tencent.mm.ui.base.h.bQ(this.mController.ylL, getString(2131296320));
        AppMethodBeat.o(24221);
      }
    }
    while (true)
    {
      return;
      if (paramIntent == null)
      {
        localObject = null;
        label101: if (paramIntent != null)
          break label241;
      }
      label241: for (paramIntent = null; ; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        p localp = com.tencent.mm.ui.base.h.b(this.mController.ylL, getString(2131299643), false, null);
        gh localgh = new gh();
        localgh.cAH.type = 13;
        localgh.cAH.context = this.mController.ylL;
        localgh.cAH.toUser = ((String)localObject);
        localgh.cAH.cAN = paramIntent;
        localgh.cAH.cvv = this.pKf;
        localgh.cAH.cAM = new FavRecordDetailUI.3(this, localp);
        com.tencent.mm.sdk.b.a.xxA.m(localgh);
        AppMethodBeat.o(24221);
        break;
        localObject = paramIntent.getStringExtra("Select_Conv_User");
        break label101;
      }
      AppMethodBeat.o(24221);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24211);
    super.onCreate(paramBundle);
    AppMethodBeat.o(24211);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24216);
    ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().d(this.mgG);
    if (this.pKw != null)
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavCdnStorage().b(((d)this.pKw).pKb);
    this.pKh = true;
    super.onDestroy();
    AppMethodBeat.o(24216);
  }

  public void onResume()
  {
    AppMethodBeat.i(24214);
    super.onResume();
    Object localObject1 = (b)((d)this.pKw).pKs;
    com.tencent.mm.plugin.fav.a.g localg;
    Object localObject2;
    if (((b)localObject1).mnW != null)
    {
      localg = com.tencent.mm.plugin.record.b.g.jD(((b)localObject1).mnW.field_localId);
      if ((localg == null) || (localg.field_favProto == null))
      {
        AppMethodBeat.o(24214);
        return;
      }
      localObject2 = localg.field_favProto.wiv;
      localObject1 = ((b)localObject1).pJZ.iterator();
      do
        if (!((Iterator)localObject1).hasNext())
          break;
      while (((LinkedList)localObject2).contains((aar)((Iterator)localObject1).next()));
    }
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        localObject2 = new b();
        ((b)localObject2).mnW = localg;
        ((b)localObject2).pJZ = localg.field_favProto.wiv;
        this.pKw.a((a)localObject2);
      }
      AppMethodBeat.o(24214);
      break;
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(24215);
    super.onStop();
    AppMethodBeat.o(24215);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.FavRecordDetailUI
 * JD-Core Version:    0.6.2
 */