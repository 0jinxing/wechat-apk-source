package com.tencent.mm.plugin.sns.ui.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.MenuItem;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.a.sc;
import com.tencent.mm.g.a.sc.b;
import com.tencent.mm.model.t;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.a.b.j.d;
import com.tencent.mm.plugin.sns.a.b.j.e;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.ap;
import com.tencent.mm.plugin.sns.model.ap.b;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.FlipView;
import com.tencent.mm.plugin.sns.ui.SnsBrowseUI;
import com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity;
import com.tencent.mm.plugin.sns.ui.SnsPermissionUI;
import com.tencent.mm.plugin.sns.ui.ao;
import com.tencent.mm.plugin.sns.ui.ar;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.l;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.cat;
import com.tencent.mm.protocal.protobuf.cfg;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.ui.base.n.d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a
  implements f, n.d
{
  private Activity activity;
  private int cvd;
  private ClipboardManager mmO;
  private String rJA;
  private TimeLineObject rJB;
  private View rJz;
  private com.tencent.mm.ui.base.p rhB;
  private ae rhQ;

  public a(Activity paramActivity, int paramInt, ae paramae)
  {
    AppMethodBeat.i(40232);
    this.activity = paramActivity;
    this.cvd = paramInt;
    this.mmO = ((ClipboardManager)ah.getContext().getSystemService("clipboard"));
    this.rhQ = paramae;
    AppMethodBeat.o(40232);
  }

  private void ZP(String paramString)
  {
    AppMethodBeat.i(40236);
    Object localObject1 = af.cnF().YT(paramString);
    if (localObject1 == null)
      AppMethodBeat.o(40236);
    while (true)
    {
      return;
      TimeLineObject localTimeLineObject = ((com.tencent.mm.plugin.sns.storage.n)localObject1).cqu();
      String str1;
      if (((com.tencent.mm.plugin.sns.storage.n)localObject1).DI(32))
      {
        localObject2 = ((com.tencent.mm.plugin.sns.storage.n)localObject1).crd();
        str1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.y((com.tencent.mm.plugin.sns.storage.n)localObject1);
        if (!bo.isNullOrNil(str1))
          ((com.tencent.mm.plugin.sns.storage.e)localObject2).field_adxml = str1;
      }
      Object localObject3;
      for (Object localObject2 = ((com.tencent.mm.plugin.sns.storage.e)localObject2).field_adxml; ; localObject2 = localTimeLineObject.rCK)
      {
        localObject3 = br.z((String)localObject2, "adxml");
        if (localObject3 != null)
          break label102;
        AppMethodBeat.o(40236);
        break;
      }
      label102: if (!((Map)localObject3).containsKey(".adxml.adCanvasInfo"))
      {
        com.tencent.mm.ui.base.h.g(this.activity, 2131299632, 0);
        AppMethodBeat.o(40236);
      }
      else
      {
        String str2 = com.tencent.mm.model.v.nW(((com.tencent.mm.plugin.sns.storage.n)localObject1).field_snsId);
        String str3 = bo.bc((String)((Map)localObject3).get(".adxml.adCanvasInfo.shareTitle"), "");
        str1 = bo.bc((String)((Map)localObject3).get(".adxml.adCanvasInfo.shareWebUrl"), "");
        localObject3 = bo.bc((String)((Map)localObject3).get(".adxml.adCanvasInfo.shareDesc"), "");
        localObject1 = new cl();
        sc localsc = new sc();
        localsc.cNZ.cOc = paramString;
        localsc.cNZ.cOd = ((cl)localObject1);
        localsc.cNZ.url = str1;
        com.tencent.mm.sdk.b.a.xxA.m(localsc);
        if (!localsc.cOa.cvi)
        {
          if (((cl)localObject1).cvA.cvG == 0)
            ((cl)localObject1).cvA.cvG = 2131299630;
          com.tencent.mm.ui.base.h.g(this.activity, ((cl)localObject1).cvA.cvG, 0);
          AppMethodBeat.o(40236);
        }
        else
        {
          ((cl)localObject1).cvA.cvF = str2;
          ((cl)localObject1).cvA.title = str3;
          ((cl)localObject1).cvA.desc = ((String)localObject3);
          paramString = ((cl)localObject1).cvA.cvC;
          if ((paramString != null) && (paramString.wiv != null) && (paramString.wiv.size() > 0) && (paramString.wiv.get(0) != null))
          {
            ((aar)paramString.wiv.get(0)).alg((String)localObject2);
            if (bo.isNullOrNil(((aar)paramString.wiv.get(0)).title))
              ((aar)paramString.wiv.get(0)).akH(((cl)localObject1).cvA.title);
            if (bo.isNullOrNil(((aar)paramString.wiv.get(0)).desc))
              ((aar)paramString.wiv.get(0)).akI(((cl)localObject1).cvA.desc);
            localObject2 = new abl();
            ((abl)localObject2).alD(localTimeLineObject.jBB);
            ((abl)localObject2).alE(com.tencent.mm.model.r.Yz());
            ((abl)localObject2).LN(2);
            ((abl)localObject2).ml(bo.anU());
            paramString.a((abl)localObject2);
          }
          ((cl)localObject1).cvA.activity = this.activity;
          ((cl)localObject1).cvA.cvH = 28;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          AppMethodBeat.o(40236);
        }
      }
    }
  }

  private String cuX()
  {
    AppMethodBeat.i(40233);
    Object localObject;
    if ((this.rJz != null) && ((this.rJz.getTag() instanceof ar)) && (((ar)this.rJz.getTag()).ctI()))
    {
      localObject = ap.Ye(af.cnF().YT(this.rJA).cqA());
      if (localObject != null)
      {
        localObject = ((ap.b)localObject).result;
        AppMethodBeat.o(40233);
      }
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(40233);
    }
  }

  private com.tencent.mm.plugin.sns.storage.a f(com.tencent.mm.plugin.sns.storage.n paramn)
  {
    AppMethodBeat.i(40234);
    if (paramn != null)
      if (this.cvd == 2)
      {
        paramn = paramn.cqr();
        AppMethodBeat.o(40234);
      }
    while (true)
    {
      return paramn;
      paramn = paramn.cqq();
      AppMethodBeat.o(40234);
      continue;
      paramn = null;
      AppMethodBeat.o(40234);
    }
  }

  public final void a(View paramView, String paramString, TimeLineObject paramTimeLineObject)
  {
    this.rJz = paramView;
    this.rJA = paramString;
    this.rJB = paramTimeLineObject;
  }

  public final void bIB()
  {
    AppMethodBeat.i(40230);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(218, this);
    AppMethodBeat.o(40230);
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(40237);
    Object localObject1;
    String str1;
    Object localObject2;
    String str2;
    Object localObject3;
    TimeLineObject localTimeLineObject;
    if (paramInt2 == -1)
    {
      if (paramInt1 != 15)
        break label822;
      com.tencent.mm.plugin.sns.storage.n localn = af.cnF().YT(this.rJA);
      localObject1 = (bau)this.rJB.xfI.wbK.get(0);
      str1 = paramIntent.getStringExtra("Select_Conv_User");
      localObject2 = paramIntent.getStringExtra("custom_send_text");
      str2 = an.fZ(af.getAccSnsPath(), ((bau)localObject1).Id) + com.tencent.mm.plugin.sns.data.i.e((bau)localObject1);
      localObject3 = bo.P(str1.split(",")).iterator();
      if (((Iterator)localObject3).hasNext())
      {
        str1 = (String)((Iterator)localObject3).next();
        if (localn.DI(32))
        {
          String str3 = an.fZ(af.getAccSnsPath(), ((bau)localObject1).Id) + com.tencent.mm.plugin.sns.data.i.j((bau)localObject1);
          localTimeLineObject = localn.cqu();
          com.tencent.mm.plugin.sns.storage.b localb = localn.cqo();
          localObject3 = new cfh();
          ((cfh)localObject3).wid = ((bau)localObject1).rEd;
          ((cfh)localObject3).fiG = ((bau)localObject1).wEO;
          if (localTimeLineObject.xfI.wbJ == 15)
          {
            ((cfh)localObject3).fiM = f(localn).qPj;
            ((cfh)localObject3).fiN = localTimeLineObject.Id;
            label264: ((cfh)localObject3).fiI = localTimeLineObject.xfF;
            if (!bo.isNullOrNil(((bau)localObject1).wER))
              break label553;
            paramIntent = ((bau)localObject1).wEH;
            label291: ((cfh)localObject3).fiL = paramIntent;
            if ((localb != null) && (localb.qUn == 0))
            {
              ((cfh)localObject3).fiK = localb.qUp;
              ((cfh)localObject3).fiJ = localb.qUo;
            }
            paramInt1 = com.tencent.mm.plugin.sns.data.i.Xr(str3);
            ab.i("MicroMsg.TimeLineMMMenuItemSelectedListener", "send adsight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", new Object[] { str1, str3, str2, ((bau)localObject1).wEO, Integer.valueOf(((bau)localObject1).rEd), Integer.valueOf(paramInt1) });
            com.tencent.mm.plugin.messenger.a.g.bOk().a(this.activity, str1, str3, str2, 43, paramInt1, (cfh)localObject3, localTimeLineObject.rjC);
            com.tencent.mm.plugin.messenger.a.g.bOk().eZ((String)localObject2, str1);
            paramInt2 = this.cvd;
            if (this.cvd != 0)
              break label562;
            paramInt1 = 1;
            label445: com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(paramInt2, paramInt1, localn.field_snsId, 12, 0));
            boolean bool = t.kH(str1);
            localObject1 = j.d.qFe;
            if (!bool)
              break label567;
            paramIntent = j.c.qFb;
            label486: localObject2 = j.e.qFk;
            if (!bool)
              break label574;
            paramInt1 = com.tencent.mm.model.n.mA(str1);
            label502: j.a((j.d)localObject1, paramIntent, (j.e)localObject2, paramInt1, localn, this.cvd);
            AppMethodBeat.o(40237);
          }
        }
      }
    }
    while (true)
    {
      return;
      ((cfh)localObject3).fiM = localTimeLineObject.xfN.fiM;
      ((cfh)localObject3).fiN = localTimeLineObject.xfN.fiN;
      break label264;
      label553: paramIntent = ((bau)localObject1).wER;
      break label291;
      label562: paramInt1 = 2;
      break label445;
      label567: paramIntent = j.c.qFa;
      break label486;
      label574: paramInt1 = 0;
      break label502;
      paramIntent = an.fZ(af.getAccSnsPath(), ((bau)localObject1).Id) + com.tencent.mm.plugin.sns.data.i.j((bau)localObject1);
      paramInt1 = com.tencent.mm.plugin.sns.data.i.Xr(paramIntent);
      ab.i("MicroMsg.TimeLineMMMenuItemSelectedListener", "send sight to %s, videopath %s, thumbpath %s url: %s time: %d, duration: %s", new Object[] { str1, paramIntent, str2, ((bau)localObject1).wEO, Integer.valueOf(((bau)localObject1).rEd), Integer.valueOf(paramInt1) });
      com.tencent.mm.plugin.messenger.a.g.bOk().a(this.activity, str1, paramIntent, str2, 43, paramInt1, this.rJB.rjC);
      com.tencent.mm.plugin.messenger.a.g.bOk().eZ((String)localObject2, str1);
      break;
      com.tencent.mm.ui.widget.snackbar.b.i(this.activity, this.activity.getString(2131300520));
      AppMethodBeat.o(40237);
      continue;
      if (paramInt1 != 15)
        break label822;
      paramIntent = af.cnF().YT(this.rJA);
      if (paramIntent != null)
        break label789;
      ab.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "menuitemselected and snsinfo is null %s", new Object[] { this.rJA });
      AppMethodBeat.o(40237);
    }
    label789: paramInt2 = this.cvd;
    if (this.cvd == 0);
    for (paramInt1 = 1; ; paramInt1 = 2)
    {
      com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(paramInt2, paramInt1, paramIntent.field_snsId, 13, 0));
      label822: AppMethodBeat.o(40237);
      break;
    }
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(40235);
    if (this.rJz == null)
    {
      AppMethodBeat.o(40235);
      return;
    }
    label132: Object localObject3;
    label384: int i;
    label552: Object localObject4;
    Object localObject5;
    label739: Object localObject6;
    label768: Object localObject7;
    label1343: long l;
    Object localObject2;
    switch (paramMenuItem.getItemId())
    {
    case 6:
    default:
    case 0:
    case 1:
    case 2:
    case 4:
    case 18:
    case 19:
    case 3:
    case 5:
    case 9:
    case 7:
    case 8:
    case 10:
    case 12:
    case 11:
    case 13:
    case 14:
    case 15:
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                while (true)
                {
                  AppMethodBeat.o(40235);
                  break;
                  Object localObject1 = cuX();
                  paramMenuItem = (MenuItem)localObject1;
                  if (bo.isNullOrNil((String)localObject1))
                    paramMenuItem = this.rJB.xfF;
                  this.mmO.setText(paramMenuItem);
                  com.tencent.mm.ui.base.h.bQ(this.activity, this.activity.getString(2131296876));
                  localObject1 = com.tencent.mm.plugin.secinforeport.a.a.qjm;
                  com.tencent.mm.plugin.secinforeport.a.a.h(2, this.rJB.Id, bo.ana(paramMenuItem));
                  AppMethodBeat.o(40235);
                  break;
                  localObject1 = cuX();
                  paramMenuItem = (MenuItem)localObject1;
                  if (bo.isNullOrNil((String)localObject1))
                    paramMenuItem = this.rJB.xfF;
                  this.rhQ.cnj().gg(this.rJA, this.rJB.Id);
                  localObject1 = new cl();
                  com.tencent.mm.plugin.sns.j.a.a((cl)localObject1, this.rJA, paramMenuItem);
                  ((cl)localObject1).cvA.activity = this.activity;
                  ((cl)localObject1).cvA.cvH = 30;
                  com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
                  AppMethodBeat.o(40235);
                  break;
                  this.rhQ.cnj().gg(this.rJA, this.rJB.Id);
                  localObject3 = new cl();
                  localObject1 = com.tencent.mm.plugin.sns.storage.h.YT(this.rJA);
                  if ((((com.tencent.mm.plugin.sns.storage.n)localObject1).DI(32)) && (((com.tencent.mm.plugin.sns.storage.n)localObject1).cqo().coK()))
                  {
                    ZP(this.rJA);
                    if (((com.tencent.mm.plugin.sns.storage.n)localObject1).DI(32))
                    {
                      i = this.cvd;
                      if (this.cvd != 0)
                        break label552;
                    }
                  }
                  for (paramInt = 1; ; paramInt = 2)
                  {
                    com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(i, paramInt, ((com.tencent.mm.plugin.sns.storage.n)localObject1).field_snsId, 11, 0));
                    AppMethodBeat.o(40235);
                    break;
                    if (this.rJB.dtW == 1)
                    {
                      com.tencent.mm.plugin.sns.j.a.a((cl)localObject3, this.rJA, 0);
                      ((cl)localObject3).cvA.activity = this.activity;
                      ((cl)localObject3).cvA.cvH = 31;
                      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
                      break label384;
                    }
                    paramMenuItem = (ao)this.rJz.getTag();
                    com.tencent.mm.plugin.sns.j.a.a((cl)localObject3, this.rJA, paramMenuItem.index);
                    ((cl)localObject3).cvA.activity = this.activity;
                    ((cl)localObject3).cvA.cvH = 31;
                    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
                    break label384;
                  }
                  this.rhQ.cnj().gg(this.rJA, this.rJB.Id);
                  localObject4 = af.cnF().YT(this.rJA);
                  if (this.rJB.xfI.wbK.size() != 0)
                  {
                    paramMenuItem = (bau)this.rJB.xfI.wbK.get(0);
                    if ((localObject4 == null) || (paramMenuItem == null))
                    {
                      ab.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "favorite music fail, snsinfo or mediaobj is null");
                      AppMethodBeat.o(40235);
                      break;
                    }
                    localObject5 = new cl();
                    if ((paramMenuItem != null) && (localObject4 != null) && (((com.tencent.mm.plugin.sns.storage.n)localObject4).reX != 0))
                      break label739;
                    ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or media is null");
                  }
                  for (((cl)localObject5).cvA.cvG = 2131299622; ; ((cl)localObject5).cvA.cvG = 2131299640)
                  {
                    ((cl)localObject5).cvA.activity = this.activity;
                    ((cl)localObject5).cvA.cvH = 25;
                    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject5);
                    AppMethodBeat.o(40235);
                    break;
                    if (!af.cnn())
                      break label768;
                    ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
                  }
                  localObject6 = String.format("%s#%s", new Object[] { com.tencent.mm.plugin.sns.data.i.jV(((com.tencent.mm.plugin.sns.storage.n)localObject4).field_snsId), paramMenuItem.Id });
                  localObject3 = new abf();
                  localObject7 = new abl();
                  ab.i("MicroMsg.Sns.GetFavDataSource", "fav sns music, from %s", new Object[] { ((com.tencent.mm.plugin.sns.storage.n)localObject4).field_userName });
                  ((abl)localObject7).alD(((com.tencent.mm.plugin.sns.storage.n)localObject4).field_userName);
                  ((abl)localObject7).alE(com.tencent.mm.model.r.Yz());
                  ((abl)localObject7).LN(2);
                  ((abl)localObject7).ml(((com.tencent.mm.plugin.sns.storage.n)localObject4).field_createTime * 1000L);
                  ((abl)localObject7).alI(((com.tencent.mm.plugin.sns.storage.n)localObject4).cqA());
                  ((abl)localObject7).alF((String)localObject6);
                  localObject1 = new aar();
                  ((aar)localObject1).akZ((String)localObject6);
                  ((aar)localObject1).akO(paramMenuItem.Url);
                  ((aar)localObject1).akP(paramMenuItem.wEL);
                  ((aar)localObject1).akN(((com.tencent.mm.plugin.sns.storage.n)localObject4).cqu().xfI.Url);
                  localObject6 = an.fZ(af.getAccSnsPath(), paramMenuItem.Id) + com.tencent.mm.plugin.sns.data.i.e(paramMenuItem);
                  if (com.tencent.mm.vfs.e.ct((String)localObject6))
                    ((aar)localObject1).akW((String)localObject6);
                  while (true)
                  {
                    ((aar)localObject1).LE(7);
                    ((aar)localObject1).akH(paramMenuItem.Title);
                    ((aar)localObject1).akI(paramMenuItem.Desc);
                    ((aar)localObject1).oX(true);
                    ((abf)localObject3).wiv.add(localObject1);
                    ((abf)localObject3).a((abl)localObject7);
                    ((cl)localObject5).cvA.cvC = ((abf)localObject3);
                    ((cl)localObject5).cvA.type = 7;
                    com.tencent.mm.plugin.sns.j.a.a((aar)localObject1, (com.tencent.mm.plugin.sns.storage.n)localObject4);
                    break;
                    ((aar)localObject1).oY(true);
                    ((aar)localObject1).akQ(paramMenuItem.wEH);
                    localObject6 = new abu();
                    ((abu)localObject6).alT(paramMenuItem.wEH);
                    ((abf)localObject3).b((abu)localObject6);
                  }
                  localObject1 = this.activity;
                  localObject3 = af.cnF().YT(this.rJA);
                  if (localObject3 != null)
                  {
                    paramMenuItem = new Intent();
                    if (((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu().xfI.wbJ != 1)
                      break label1343;
                    paramInt = 0;
                    if ((this.rJz.getTag() instanceof com.tencent.mm.plugin.sns.ui.aj))
                      paramInt = ((ao)this.rJz.getTag()).index;
                    localObject7 = com.tencent.mm.plugin.sns.model.aj.a((com.tencent.mm.plugin.sns.storage.n)localObject3, paramInt);
                    if (localObject7 == null)
                    {
                      ab.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "send photo fail, mediaObj is null");
                      AppMethodBeat.o(40235);
                      break;
                    }
                    localObject3 = ((bau)localObject7).Id;
                    paramMenuItem.putExtra("sns_send_data_ui_image_path", FlipView.g(an.fZ(af.getAccSnsPath(), (String)localObject3) + com.tencent.mm.plugin.sns.data.i.l((bau)localObject7), (Context)localObject1));
                    paramMenuItem.putExtra("sns_send_data_ui_image_position", paramInt);
                  }
                  while (((((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu().xfI.wbJ != 4) && (((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu().xfI.wbJ != 15) && (((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu().xfI.wbJ != 3)) || ((bau)((com.tencent.mm.plugin.sns.storage.n)localObject3).cqu().xfI.wbK.get(0) != null))
                  {
                    paramMenuItem.putExtra("exdevice_open_scene_type", 1);
                    paramMenuItem.putExtra("sns_local_id", this.rJA);
                    paramMenuItem.putExtra("sns_send_data_ui_activity", true);
                    com.tencent.mm.bp.d.f(this.activity, ".ui.chatting.ChattingSendDataToDeviceUI", paramMenuItem);
                    AppMethodBeat.o(40235);
                    break;
                  }
                  ab.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mediaObj is null, send failed!");
                  AppMethodBeat.o(40235);
                  break;
                  paramMenuItem = af.cnF().YT(this.rJA);
                  if (paramMenuItem == null)
                  {
                    ab.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mute play video but sns info is null.");
                    AppMethodBeat.o(40235);
                    break;
                  }
                  if (paramMenuItem.DI(32))
                  {
                    ab.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mute play video but it is ad");
                    AppMethodBeat.o(40235);
                    break;
                  }
                  localObject3 = (bau)paramMenuItem.cqu().xfI.wbK.get(0);
                  if (localObject3 == null)
                  {
                    ab.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "mute paly video but media is null");
                    AppMethodBeat.o(40235);
                    break;
                  }
                  localObject1 = an.fZ(af.getAccSnsPath(), ((bau)localObject3).Id);
                  paramMenuItem = "";
                  localObject7 = com.tencent.mm.plugin.sns.data.i.j((bau)localObject3);
                  if (com.tencent.mm.vfs.e.ct((String)localObject1 + (String)localObject7))
                    paramMenuItem = (String)localObject1 + com.tencent.mm.plugin.sns.data.i.e((bau)localObject3);
                  if (com.tencent.mm.vfs.e.ct((String)localObject1 + com.tencent.mm.plugin.sns.data.i.p((bau)localObject3)))
                    paramMenuItem = (String)localObject1 + com.tencent.mm.plugin.sns.data.i.n((bau)localObject3);
                  localObject1 = new Intent();
                  ((Intent)localObject1).setClass(this.activity, SnsOnlineVideoActivity.class);
                  ((Intent)localObject1).putExtra("intent_thumbpath", paramMenuItem);
                  ((Intent)localObject1).putExtra("intent_localid", this.rJA);
                  ((Intent)localObject1).putExtra("intent_from_scene", this.cvd);
                  ((Intent)localObject1).putExtra("intent_ismute", true);
                  if (this.rJz != null)
                  {
                    paramMenuItem = new int[2];
                    this.rJz.getLocationInWindow(paramMenuItem);
                    i = this.rJz.getWidth();
                    paramInt = this.rJz.getHeight();
                    ((Intent)localObject1).putExtra("img_gallery_left", paramMenuItem[0]);
                    ((Intent)localObject1).putExtra("img_gallery_top", paramMenuItem[1]);
                    ((Intent)localObject1).putExtra("img_gallery_width", i);
                    ((Intent)localObject1).putExtra("img_gallery_height", paramInt);
                  }
                  this.activity.startActivity((Intent)localObject1);
                  this.activity.overridePendingTransition(0, 0);
                  AppMethodBeat.o(40235);
                  break;
                  this.rhQ.cnj().gg(this.rJA, this.rJB.Id);
                  localObject1 = au.ZJ(this.rJB.xfI.Url);
                  if (bo.isNullOrNil((String)localObject1))
                  {
                    ab.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "favorite url fail, url is null");
                    AppMethodBeat.o(40235);
                    break;
                  }
                  localObject3 = new cl();
                  paramMenuItem = com.tencent.mm.plugin.sns.storage.h.YT(this.rJA);
                  if (paramMenuItem != null)
                  {
                    localObject4 = com.tencent.mm.model.v.nW(paramMenuItem.field_snsId);
                    localObject7 = com.tencent.mm.model.v.Zp().y((String)localObject4, true);
                    ((v.b)localObject7).j("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(paramMenuItem.field_snsId));
                    ((v.b)localObject7).j("preUsername", paramMenuItem.field_userName);
                    ((v.b)localObject7).j("preChatName", "");
                    ((v.b)localObject7).j("url", localObject1);
                    ((v.b)localObject7).j("preMsgIndex", Integer.valueOf(0));
                    ((v.b)localObject7).j("sendAppMsgScene", Integer.valueOf(1));
                    ((v.b)localObject7).j("adExtStr", paramMenuItem.cqu().rjC);
                    ((cl)localObject3).cvA.cvF = ((String)localObject4);
                  }
                  localObject7 = af.cnF().YT(this.rJA);
                  if ((localObject7 != null) && (this.rJB.xfI.wbJ == 18))
                    j.a(j.d.qFf, j.c.qEZ, j.e.qFk, 0, (com.tencent.mm.plugin.sns.storage.n)localObject7, this.cvd);
                  if (!bo.isNullOrNil(this.rJB.rCK))
                  {
                    ZP(((com.tencent.mm.plugin.sns.storage.n)localObject7).cqU());
                    AppMethodBeat.o(40235);
                    break;
                  }
                  if (((com.tencent.mm.plugin.sns.storage.n)localObject7).DI(32))
                  {
                    i = this.cvd;
                    if (this.cvd == 0)
                    {
                      paramInt = 1;
                      com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(i, paramInt, paramMenuItem.field_snsId, 11, 0));
                    }
                  }
                  else
                  {
                    com.tencent.mm.plugin.sns.j.a.a((cl)localObject3, (String)localObject1, this.rJA);
                    ((cl)localObject3).cvA.activity = this.activity;
                    ((cl)localObject3).cvA.cvH = 28;
                    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
                    if (((cl)localObject3).cvB.ret == 0)
                    {
                      l = bo.anT();
                      if (!bo.isNullOrNil((String)localObject1))
                      {
                        ab.d("MicroMsg.TimeLineMMMenuItemSelectedListener", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), localObject1, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
                        paramMenuItem = "";
                      }
                    }
                  }
                  try
                  {
                    localObject1 = URLEncoder.encode((String)localObject1, "UTF-8");
                    paramMenuItem = (MenuItem)localObject1;
                    com.tencent.mm.plugin.report.service.h.pYm.e(13378, new Object[] { paramMenuItem, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
                    AppMethodBeat.o(40235);
                    break;
                    paramInt = 2;
                  }
                  catch (UnsupportedEncodingException localUnsupportedEncodingException)
                  {
                    while (true)
                      ab.printErrStackTrace("MicroMsg.TimeLineMMMenuItemSelectedListener", localUnsupportedEncodingException, "", new Object[0]);
                  }
                }
                this.rhQ.cnj().gg(this.rJA, this.rJB.Id);
              }
              while (this.rJB == null);
              paramMenuItem = new cl();
              localObject4 = this.rJB;
              if (localObject4 == null)
              {
                ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
                paramMenuItem.cvA.cvG = 2131299622;
              }
              while (true)
              {
                paramMenuItem.cvA.activity = this.activity;
                paramMenuItem.cvA.cvH = 26;
                com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
                AppMethodBeat.o(40235);
                break;
                localObject3 = new abf();
                localObject2 = new abl();
                localObject7 = new abe();
                ((abl)localObject2).alD(((TimeLineObject)localObject4).jBB);
                ((abl)localObject2).alE(com.tencent.mm.model.r.Yz());
                ((abl)localObject2).LN(2);
                ((abl)localObject2).ml(bo.anU());
                if (((TimeLineObject)localObject4).xfH != null)
                  ((abl)localObject2).alJ(((TimeLineObject)localObject4).xfH.Id);
                if (((TimeLineObject)localObject4).xfI != null)
                {
                  ((abe)localObject7).alw(((TimeLineObject)localObject4).xfI.Title);
                  ((abe)localObject7).alx(((TimeLineObject)localObject4).xfI.Desc);
                  if ((((TimeLineObject)localObject4).xfI.wbK != null) && (!((TimeLineObject)localObject4).xfI.wbK.isEmpty()))
                  {
                    localObject4 = (bau)((TimeLineObject)localObject4).xfI.wbK.get(0);
                    ((abe)localObject7).LK(((bau)localObject4).cuu);
                    ((abe)localObject7).alz(((bau)localObject4).rik);
                    ((abe)localObject7).aly(((bau)localObject4).wEH);
                  }
                }
                paramMenuItem.cvA.title = ((abe)localObject7).title;
                paramMenuItem.cvA.desc = ((abe)localObject7).desc;
                paramMenuItem.cvA.cvC = ((abf)localObject3);
                paramMenuItem.cvA.type = 10;
                ((abf)localObject3).a((abl)localObject2);
                ((abf)localObject3).b((abe)localObject7);
              }
              this.rhQ.cnj().gg(this.rJA, this.rJB.Id);
            }
            while (this.rJB == null);
            localObject2 = new cl();
            localObject4 = this.rJB;
            if (localObject4 == null)
            {
              ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
              ((cl)localObject2).cvA.cvG = 2131299622;
            }
            while (true)
            {
              ((cl)localObject2).cvA.activity = this.activity;
              ((cl)localObject2).cvA.cvH = 27;
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
              AppMethodBeat.o(40235);
              break;
              paramMenuItem = new abf();
              localObject3 = new abl();
              localObject7 = new abo();
              ((abl)localObject3).alD(((TimeLineObject)localObject4).jBB);
              ((abl)localObject3).alE(com.tencent.mm.model.r.Yz());
              ((abl)localObject3).LN(8);
              ((abl)localObject3).ml(bo.anU());
              if (((TimeLineObject)localObject4).xfH != null)
                ((abl)localObject3).alJ(((TimeLineObject)localObject4).xfH.Id);
              if (((TimeLineObject)localObject4).xfI != null)
              {
                ((abo)localObject7).alM(((TimeLineObject)localObject4).xfI.Title);
                ((abo)localObject7).alN(((TimeLineObject)localObject4).xfI.Desc);
                if ((((TimeLineObject)localObject4).xfI.wbK != null) && (!((TimeLineObject)localObject4).xfI.wbK.isEmpty()))
                {
                  localObject4 = (bau)((TimeLineObject)localObject4).xfI.wbK.get(0);
                  ((abo)localObject7).alP(((bau)localObject4).rik);
                  ((abo)localObject7).alO(((bau)localObject4).wEH);
                }
              }
              ((cl)localObject2).cvA.title = ((abo)localObject7).title;
              ((cl)localObject2).cvA.desc = ((abo)localObject7).desc;
              ((cl)localObject2).cvA.cvC = paramMenuItem;
              ((cl)localObject2).cvA.type = 15;
              paramMenuItem.a((abl)localObject3);
              paramMenuItem.b((abo)localObject7);
            }
            localObject2 = af.cnF().YT(this.rJA).cqA();
            paramMenuItem = (l)this.rJz.getTag();
            if (com.tencent.mm.plugin.sns.storage.v.Zl((String)localObject2))
            {
              paramMenuItem = new com.tencent.mm.plugin.sns.model.r(com.tencent.mm.plugin.sns.storage.v.Zm((String)localObject2), 6, paramMenuItem.qJj);
              com.tencent.mm.kernel.g.RQ();
              com.tencent.mm.kernel.g.RO().eJo.a(paramMenuItem, 0);
            }
            while (true)
            {
              localObject2 = this.activity;
              this.activity.getString(2131297061);
              this.rhB = com.tencent.mm.ui.base.h.b((Context)localObject2, this.activity.getString(2131303615), true, new a.1(this, paramMenuItem));
              AppMethodBeat.o(40235);
              break;
              paramMenuItem = new com.tencent.mm.plugin.sns.model.r(com.tencent.mm.plugin.sns.storage.v.Zm((String)localObject2), 4, paramMenuItem.qJj);
              com.tencent.mm.kernel.g.RQ();
              com.tencent.mm.kernel.g.RO().eJo.a(paramMenuItem, 0);
            }
            localObject2 = af.cnF().YT(this.rJA);
          }
          while (localObject2 == null);
          com.tencent.mm.plugin.sns.abtest.a.b((com.tencent.mm.plugin.sns.storage.n)localObject2);
          paramMenuItem = new Intent();
          paramMenuItem.putExtra("sns_permission_snsinfo_svr_id", ((com.tencent.mm.plugin.sns.storage.n)localObject2).field_snsId);
          paramMenuItem.putExtra("sns_permission_userName", ((com.tencent.mm.plugin.sns.storage.n)localObject2).field_userName);
          paramMenuItem.putExtra("sns_permission_anim", true);
          paramMenuItem.setClass(this.activity, SnsPermissionUI.class);
          this.activity.startActivityForResult(paramMenuItem, 11);
          AppMethodBeat.o(40235);
          break;
          this.rhQ.cnj().gg(this.rJA, this.rJB.Id);
          paramMenuItem = com.tencent.mm.plugin.sns.storage.h.YT(this.rJA);
          if ((paramMenuItem.DI(32)) && (paramMenuItem.cqo().coK()))
          {
            localObject2 = af.cnF().YT(this.rJA);
            if ((localObject2 != null) && (((com.tencent.mm.plugin.sns.storage.n)localObject2).DI(32)))
            {
              i = this.cvd;
              if (this.cvd != 0)
                break label3463;
            }
            for (paramInt = 1; ; paramInt = 2)
            {
              com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(i, paramInt, paramMenuItem.field_snsId, 11, 0));
              ZP(this.rJA);
              AppMethodBeat.o(40235);
              break;
            }
          }
          paramMenuItem = this.rJA;
          localObject2 = af.cnF().YT(paramMenuItem);
          if (localObject2 != null)
            if (((com.tencent.mm.plugin.sns.storage.n)localObject2).DI(32))
            {
              j.a(j.d.qFe, j.c.qEZ, j.e.qFk, 0, (com.tencent.mm.plugin.sns.storage.n)localObject2, this.cvd);
              i = this.cvd;
              if (this.cvd != 0)
                break label3598;
            }
          for (paramInt = 1; ; paramInt = 2)
          {
            com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(i, paramInt, ((com.tencent.mm.plugin.sns.storage.n)localObject2).field_snsId, 11, 0));
            paramMenuItem = new cl();
            com.tencent.mm.plugin.sns.j.a.a(paramMenuItem, (com.tencent.mm.plugin.sns.storage.n)localObject2);
            paramMenuItem.cvA.activity = this.activity;
            paramMenuItem.cvA.cvH = 29;
            com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
            AppMethodBeat.o(40235);
            break;
          }
          paramMenuItem = (bau)this.rJB.xfI.wbK.get(0);
          localObject2 = an.fZ(af.getAccSnsPath(), paramMenuItem.Id) + com.tencent.mm.plugin.sns.data.i.e(paramMenuItem);
          paramMenuItem = new Intent();
          paramMenuItem.putExtra("Select_Conv_Type", 3);
          paramMenuItem.putExtra("select_is_ret", true);
          paramMenuItem.putExtra("mutil_select_is_ret", true);
          paramMenuItem.putExtra("image_path", (String)localObject2);
          paramMenuItem.putExtra("Retr_Msg_Type", 11);
          com.tencent.mm.bp.d.b(this.activity, ".ui.transmit.SelectConversationUI", paramMenuItem, 15);
          AppMethodBeat.o(40235);
          break;
        }
        while (!(this.rJz.getTag() instanceof l));
        localObject2 = (l)this.rJz.getTag();
        this.mmO.setText(((l)localObject2).ncM);
        com.tencent.mm.ui.base.h.bQ(this.activity, this.activity.getString(2131296876));
        if (((l)localObject2).qJj != null)
        {
          paramMenuItem = com.tencent.mm.plugin.secinforeport.a.a.qjm;
          com.tencent.mm.plugin.secinforeport.a.a.h(4, this.rJB.Id + ":" + ((l)localObject2).qJj.wZG, bo.ana(((l)localObject2).ncM));
        }
        AppMethodBeat.o(40235);
        break;
        paramMenuItem = af.cnF().YT(this.rJA);
        com.tencent.mm.plugin.sns.abtest.a.a(this.activity, paramMenuItem);
        AppMethodBeat.o(40235);
        break;
        localObject2 = af.cnF().YT(this.rJA);
        if (localObject2 != null)
          if (this.cvd != 0)
            break label3955;
        for (paramMenuItem = com.tencent.mm.modelsns.b.lY(714); ; paramMenuItem = com.tencent.mm.modelsns.b.lZ(714))
        {
          paramMenuItem.tx(com.tencent.mm.plugin.sns.data.i.j((com.tencent.mm.plugin.sns.storage.n)localObject2)).mb(((com.tencent.mm.plugin.sns.storage.n)localObject2).field_type).cS(((com.tencent.mm.plugin.sns.storage.n)localObject2).DI(32)).tx(((com.tencent.mm.plugin.sns.storage.n)localObject2).crc());
          paramMenuItem.ajK();
          ap.r((com.tencent.mm.plugin.sns.storage.n)localObject2);
          AppMethodBeat.o(40235);
          break;
        }
      }
      while (!(this.rJz.getTag() instanceof l));
      localObject2 = (l)this.rJz.getTag();
      localObject3 = af.cnF().YS(((l)localObject2).rib);
      if (localObject3 != null)
      {
        if (this.cvd != 0)
          break label4127;
        paramMenuItem = com.tencent.mm.modelsns.b.lY(715);
        paramMenuItem.tx(com.tencent.mm.plugin.sns.data.i.j((com.tencent.mm.plugin.sns.storage.n)localObject3)).mb(((com.tencent.mm.plugin.sns.storage.n)localObject3).field_type).cS(((com.tencent.mm.plugin.sns.storage.n)localObject3).DI(32)).tx(((com.tencent.mm.plugin.sns.storage.n)localObject3).crc());
        if (((l)localObject2).qJj == null)
          break label4161;
        if (((l)localObject2).qJj.wZG != 0)
          break label4137;
        localObject2 = ((l)localObject2).qJj.wZJ;
        paramMenuItem.tx((String)localObject2);
      }
      while (true)
      {
        paramMenuItem.ajK();
        ap.a((l)this.rJz.getTag());
        AppMethodBeat.o(40235);
        break;
        paramMenuItem = com.tencent.mm.modelsns.b.lZ(715);
        break label4020;
        localObject2 = ((l)localObject2).qJj.wZG;
        break label4094;
        paramMenuItem.tx("");
      }
    case 20:
      label3463: label3598: label3955: label4094: this.rhQ.cnj().gg(this.rJA, this.rJB.Id);
      label4020: label4161: localObject2 = com.tencent.mm.plugin.sns.storage.h.YT(this.rJA);
      label4127: label4137: if ((((com.tencent.mm.plugin.sns.storage.n)localObject2).DI(32)) && (((com.tencent.mm.plugin.sns.storage.n)localObject2).cqo().coK()))
      {
        paramMenuItem = af.cnF().YT(this.rJA);
        if ((paramMenuItem != null) && (paramMenuItem.DI(32)) && (this.rJB != null))
        {
          i = this.cvd;
          if (this.cvd != 0)
            break label4304;
        }
        label4304: for (paramInt = 1; ; paramInt = 2)
        {
          com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(i, paramInt, ((com.tencent.mm.plugin.sns.storage.n)localObject2).field_snsId, 11, 0));
          ZP(this.rJA);
          AppMethodBeat.o(40235);
          break;
        }
      }
      paramMenuItem = this.rJA;
      localObject3 = af.cnF().YT(paramMenuItem);
      localObject2 = null;
      paramMenuItem = (MenuItem)localObject2;
      if (localObject3 != null)
      {
        paramMenuItem = (MenuItem)localObject2;
        if (((com.tencent.mm.plugin.sns.storage.n)localObject3).DI(32))
        {
          localObject2 = ((com.tencent.mm.plugin.sns.storage.n)localObject3).crb();
          paramMenuItem = (MenuItem)localObject2;
          if (bo.isNullOrNil((String)localObject2))
            paramMenuItem = ((com.tencent.mm.plugin.sns.storage.n)localObject3).getAdLink();
        }
      }
      if (bo.isNullOrNil(paramMenuItem))
        paramMenuItem = au.ZJ(this.rJB.xfI.Url);
      break;
    case 16:
    case 17:
    case 21:
    case 22:
    }
    while (true)
    {
      while (true)
      {
        if (bo.isNullOrNil(paramMenuItem))
        {
          ab.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "favorite url fail, url is null");
          AppMethodBeat.o(40235);
          break;
        }
        localObject5 = new cl();
        localObject4 = com.tencent.mm.plugin.sns.storage.h.YT(this.rJA);
        if (localObject4 != null)
        {
          localObject2 = com.tencent.mm.model.v.nW(((com.tencent.mm.plugin.sns.storage.n)localObject4).field_snsId);
          localObject7 = com.tencent.mm.model.v.Zp().y((String)localObject2, true);
          ((v.b)localObject7).j("prePublishId", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(((com.tencent.mm.plugin.sns.storage.n)localObject4).field_snsId));
          ((v.b)localObject7).j("preUsername", ((com.tencent.mm.plugin.sns.storage.n)localObject4).field_userName);
          ((v.b)localObject7).j("preChatName", "");
          ((v.b)localObject7).j("url", paramMenuItem);
          ((v.b)localObject7).j("preMsgIndex", Integer.valueOf(0));
          ((v.b)localObject7).j("sendAppMsgScene", Integer.valueOf(1));
          ((v.b)localObject7).j("adExtStr", ((com.tencent.mm.plugin.sns.storage.n)localObject4).cqu().rjC);
          ((cl)localObject5).cvA.cvF = ((String)localObject2);
        }
        if ((localObject3 != null) && ((this.rJB.xfI.wbJ == 18) || (((com.tencent.mm.plugin.sns.storage.n)localObject3).DI(32))))
        {
          j.a(j.d.qFf, j.c.qEZ, j.e.qFk, 0, (com.tencent.mm.plugin.sns.storage.n)localObject3, this.cvd);
          if (this.rJB != null)
          {
            i = this.cvd;
            if (this.cvd != 0)
              break label4709;
          }
        }
        label4709: for (paramInt = 1; ; paramInt = 2)
        {
          com.tencent.mm.plugin.sns.data.i.a(new SnsAdClick(i, paramInt, ((com.tencent.mm.plugin.sns.storage.n)localObject4).field_snsId, 11, 0));
          if (bo.isNullOrNil(this.rJB.rCK))
            break label4714;
          ZP(((com.tencent.mm.plugin.sns.storage.n)localObject3).cqU());
          AppMethodBeat.o(40235);
          break;
        }
        label4714: com.tencent.mm.plugin.sns.j.a.a((cl)localObject5, paramMenuItem, this.rJA);
        ((cl)localObject5).cvA.activity = this.activity;
        ((cl)localObject5).cvA.cvH = 28;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject5);
        if (((cl)localObject5).cvB.ret == 0)
        {
          l = bo.anT();
          if (!bo.isNullOrNil(paramMenuItem))
          {
            ab.d("MicroMsg.TimeLineMMMenuItemSelectedListener", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), paramMenuItem, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
            localObject2 = "";
          }
        }
        try
        {
          paramMenuItem = URLEncoder.encode(paramMenuItem, "UTF-8");
          com.tencent.mm.plugin.report.service.h.pYm.e(13378, new Object[] { paramMenuItem, Long.valueOf(l), Integer.valueOf(3), Integer.valueOf(2), Integer.valueOf(1) });
          AppMethodBeat.o(40235);
        }
        catch (UnsupportedEncodingException paramMenuItem)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.TimeLineMMMenuItemSelectedListener", paramMenuItem, "", new Object[0]);
            paramMenuItem = (MenuItem)localObject2;
          }
        }
      }
      ap.s(af.cnF().YT(this.rJA));
      AppMethodBeat.o(40235);
      break;
      if (!(this.rJz.getTag() instanceof l))
        break label132;
      ap.b((l)this.rJz.getTag());
      AppMethodBeat.o(40235);
      break;
      localObject7 = com.tencent.mm.plugin.sns.storage.h.YT(this.rJA);
      if (localObject7 == null)
      {
        ab.w("MicroMsg.TimeLineMMMenuItemSelectedListener", "edit photo fail, info is null");
        AppMethodBeat.o(40235);
        break;
      }
      localObject2 = (ao)this.rJz.getTag();
      localObject3 = this.activity;
      localObject4 = paramMenuItem.getIntent();
      if (this.cvd == 0);
      for (paramInt = 1; ; paramInt = 2)
      {
        i = this.cvd;
        paramMenuItem = this.rhQ;
        if (localObject4 != null)
          break label5082;
        ab.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] intent is null!");
        AppMethodBeat.o(40235);
        break;
      }
      label5082: if (paramMenuItem == null)
      {
        ab.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] snsContext is null!");
        AppMethodBeat.o(40235);
        break;
      }
      if (localObject7 == null)
      {
        ab.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] info is null!");
        AppMethodBeat.o(40235);
        break;
      }
      com.tencent.mm.kernel.g.RQ();
      if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
      {
        ab.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is not SDCardAvailable");
        AppMethodBeat.o(40235);
        break;
      }
      localObject5 = ((ao)localObject2).czD;
      int j = ((ao)localObject2).index;
      int k = ((ao)localObject2).position;
      localObject2 = ((com.tencent.mm.plugin.sns.storage.n)localObject7).cqu();
      if ((((TimeLineObject)localObject2).xfI == null) || (((TimeLineObject)localObject2).xfI.wbK.size() == 0))
      {
        ab.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] is ContentObj null");
        AppMethodBeat.o(40235);
        break;
      }
      paramMenuItem.cnj().x((com.tencent.mm.plugin.sns.storage.n)localObject7);
      localObject6 = ((com.tencent.mm.plugin.sns.storage.n)localObject7).cqu();
      if (j < ((TimeLineObject)localObject6).xfI.wbK.size());
      for (paramMenuItem = (bau)((TimeLineObject)localObject6).xfI.wbK.get(j); ; paramMenuItem = new bau())
      {
        if (af.cnC().B(paramMenuItem))
          break label5324;
        ab.e("MicroMsg.SnsImageDialogShowerMgr", "[showImg] media[%s] is illegal", new Object[] { Integer.valueOf(paramMenuItem.cNE) });
        AppMethodBeat.o(40235);
        break;
      }
      label5324: if (paramInt == 1)
      {
        localObject2 = com.tencent.mm.modelsns.b.lY(716);
        label5336: ((com.tencent.mm.modelsns.b)localObject2).tx(com.tencent.mm.plugin.sns.data.i.j((com.tencent.mm.plugin.sns.storage.n)localObject7)).mb(((com.tencent.mm.plugin.sns.storage.n)localObject7).field_type).cS(((com.tencent.mm.plugin.sns.storage.n)localObject7).DI(32)).tx(((com.tencent.mm.plugin.sns.storage.n)localObject7).crc()).tx(paramMenuItem.Id).mb(j).mb(((TimeLineObject)localObject6).xfI.wbK.size());
        ((com.tencent.mm.modelsns.b)localObject2).ajK();
        if (paramInt != 1)
          break label5657;
      }
      label5657: for (paramMenuItem = com.tencent.mm.modelsns.b.lY(744); ; paramMenuItem = com.tencent.mm.modelsns.b.lZ(744))
      {
        paramMenuItem.tx(com.tencent.mm.plugin.sns.data.i.j((com.tencent.mm.plugin.sns.storage.n)localObject7)).mb(((com.tencent.mm.plugin.sns.storage.n)localObject7).field_type).cS(((com.tencent.mm.plugin.sns.storage.n)localObject7).DI(32)).tx(((com.tencent.mm.plugin.sns.storage.n)localObject7).crc());
        paramMenuItem.b((Intent)localObject4, "intent_key_StatisticsOplog");
        ((Intent)localObject4).putExtra("sns_soon_enter_photoedit_ui", true);
        ((Intent)localObject4).putExtra("sns_gallery_localId", (String)localObject5);
        ((Intent)localObject4).putExtra("sns_gallery_position", j);
        ((Intent)localObject4).putExtra("sns_position", k);
        ((Intent)localObject4).putExtra("sns_gallery_showtype", 1);
        ((Intent)localObject4).putExtra("K_ad_scene", paramInt);
        ((Intent)localObject4).putExtra("K_ad_source", i);
        ((Intent)localObject4).putExtra("k_is_from_sns_main_timeline", true);
        ((Intent)localObject4).setClass((Context)localObject3, SnsBrowseUI.class);
        paramMenuItem = new Bundle();
        paramMenuItem.putInt("stat_scene", 3);
        paramMenuItem.putString("stat_msg_id", "sns_" + com.tencent.mm.plugin.sns.data.i.jV(((com.tencent.mm.plugin.sns.storage.n)localObject7).field_snsId));
        paramMenuItem.putString("stat_send_msg_user", ((com.tencent.mm.plugin.sns.storage.n)localObject7).field_userName);
        ((Intent)localObject4).putExtra("_stat_obj", paramMenuItem);
        ((Activity)localObject3).startActivity((Intent)localObject4);
        ((Activity)localObject3).overridePendingTransition(0, 0);
        AppMethodBeat.o(40235);
        break;
        localObject2 = com.tencent.mm.modelsns.b.lZ(716);
        break label5336;
      }
      if (this.rJB == null)
      {
        ab.e("MicroMsg.TimeLineMMMenuItemSelectedListener", "favNotelink,tlobj is null, return");
        AppMethodBeat.o(40235);
        break;
      }
      paramMenuItem = new cl();
      com.tencent.mm.plugin.sns.j.a.a(paramMenuItem, this.rJA);
      paramMenuItem.cvA.activity = this.activity;
      paramMenuItem.cvA.cvH = 28;
      com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
      break label132;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(40238);
    ab.i("MicroMsg.TimeLineMMMenuItemSelectedListener", "onSceneEnd");
    if ((this.rhB != null) && (this.rhB.isShowing()))
      this.rhB.dismiss();
    AppMethodBeat.o(40238);
  }

  public final void removeListener()
  {
    AppMethodBeat.i(40231);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(218, this);
    AppMethodBeat.o(40231);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.a
 * JD-Core Version:    0.6.2
 */