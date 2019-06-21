package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.l;
import com.tencent.mm.af.p;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.nt.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.protocal.protobuf.aap;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.protocal.protobuf.aau;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.protocal.protobuf.abt;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.protocal.protobuf.cfh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
{
  private static final SimpleDateFormat pJi;

  static
  {
    AppMethodBeat.i(27295);
    pJi = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    AppMethodBeat.o(27295);
  }

  private static aar a(bi parambi, j.b paramb, int paramInt)
  {
    AppMethodBeat.i(27291);
    aar localaar = new aar();
    localaar.akZ(ah(parambi));
    localaar.akO(paramb.fgM);
    localaar.akP(paramb.fgN);
    localaar.akN(paramb.url);
    localaar.oX(true);
    parambi = new File(bo.bc(com.tencent.mm.at.o.ahl().I(parambi.field_imgPath, true), ""));
    if (parambi.exists())
      localaar.akW(parambi.getAbsolutePath());
    while (true)
    {
      localaar.akH(paramb.title);
      localaar.akI(paramb.description);
      localaar.LE(paramInt);
      localaar.alg(paramb.canvasPageXml);
      AppMethodBeat.o(27291);
      return localaar;
      localaar.oY(true);
    }
  }

  private static aar a(bi parambi, String paramString, aas paramaas)
  {
    AppMethodBeat.i(27292);
    aar localaar = new aar();
    localaar.akZ(ah(parambi));
    localaar.LE(1);
    localaar.akI(paramString);
    localaar.oY(true);
    localaar.oX(true);
    localaar.a(paramaas);
    localaar.alc(a(paramaas.whw));
    localaar.ald(b(paramaas.whw));
    if (ad.aox(paramaas.whw.whU))
    {
      parambi = paramaas.whw.whU;
      parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
      if (!bo.isNullOrNil(parambi))
        localaar.all(parambi);
    }
    AppMethodBeat.o(27292);
    return localaar;
  }

  private static String a(aat paramaat)
  {
    AppMethodBeat.i(27281);
    String str1 = paramaat.whU;
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = paramaat.cEV;
    if (com.tencent.mm.aj.a.e.rr(str2))
    {
      paramaat = com.tencent.mm.aj.a.e.rt(str2);
      AppMethodBeat.o(27281);
    }
    while (true)
    {
      return paramaat;
      paramaat = com.tencent.mm.model.s.mI(str2);
      AppMethodBeat.o(27281);
    }
  }

  private static boolean a(Context paramContext, cl paramcl, bi parambi)
  {
    AppMethodBeat.i(27293);
    aas localaas = new aas();
    localaas.c(ag(parambi));
    Object localObject1 = parambi.field_content;
    if (localObject1 == null)
    {
      paramcl.cvA.cvG = 2131299632;
      AppMethodBeat.o(27293);
    }
    for (boolean bool = false; ; bool = false)
    {
      return bool;
      localObject1 = j.b.me((String)localObject1);
      if (localObject1 != null)
        break;
      paramcl.cvA.cvG = 2131299632;
      AppMethodBeat.o(27293);
    }
    localaas.whw.alr(((j.b)localObject1).appId);
    localaas.whw.alt(((j.b)localObject1).cMg);
    Object localObject2 = com.tencent.mm.pluginsdk.model.app.g.bT(((j.b)localObject1).appId, true);
    if (localObject2 != null)
      ((com.tencent.mm.pluginsdk.model.app.f)localObject2).xy();
    switch (((j.b)localObject1).type)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 10:
    case 20:
    case 13:
    case 46:
    case 33:
    case 36:
    case 44:
    case 19:
    }
    Object localObject3;
    label3078: 
    while (true)
    {
      paramcl.cvA.cvG = 2131299630;
      AppMethodBeat.o(27293);
      bool = false;
      break;
      paramContext = new aar();
      paramContext.akZ(ah(parambi));
      paramContext.LE(1);
      paramContext.akI(((j.b)localObject1).title);
      paramContext.oY(true);
      paramContext.oX(true);
      paramContext.a(localaas);
      paramContext.alc(a(localaas.whw));
      paramContext.ald(b(localaas.whw));
      if (ad.aox(localaas.whw.whU))
      {
        parambi = localaas.whw.whU;
        parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
        if (!bo.isNullOrNil(parambi))
          paramContext.all(parambi);
      }
      paramcl.cvA.cvC.wiv.add(paramContext);
      paramContext = paramcl.cvA.cvD;
      paramContext.wiK += 1;
      AppMethodBeat.o(27293);
      bool = true;
      break;
      aw.ZK();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        paramcl.cvA.cvG = 2131299638;
        AppMethodBeat.o(27293);
        bool = false;
        break;
      }
      localObject2 = am.aUq().aiE(((j.b)localObject1).csD);
      paramContext = new aar();
      paramContext.akZ(ah(parambi));
      if (localObject2 != null)
        paramContext.akV(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
      localObject2 = com.tencent.mm.at.o.ahl().I(parambi.field_imgPath, true);
      if (com.tencent.mm.a.e.ct((String)localObject2))
        paramContext.akW((String)localObject2);
      paramContext.LE(2);
      paramContext.akH(((j.b)localObject1).title);
      paramContext.akI(((j.b)localObject1).description);
      paramContext.a(localaas);
      paramContext.alc(a(localaas.whw));
      paramContext.ald(b(localaas.whw));
      paramContext.mh(parambi.field_msgId);
      if (ad.aox(localaas.whw.whU))
      {
        parambi = localaas.whw.whU;
        parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
        if (!bo.isNullOrNil(parambi))
          paramContext.all(parambi);
      }
      paramcl.cvA.cvC.wiv.add(paramContext);
      paramContext = paramcl.cvA.cvD;
      paramContext.wiL += 1;
      AppMethodBeat.o(27293);
      bool = true;
      break;
      paramContext = a(parambi, (j.b)localObject1, 7);
      paramContext.a(localaas);
      paramContext.alc(a(localaas.whw));
      paramContext.ald(b(localaas.whw));
      if (ad.aox(localaas.whw.whU))
      {
        parambi = localaas.whw.whU;
        parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
        if (!bo.isNullOrNil(parambi))
          paramContext.all(parambi);
      }
      paramcl.cvA.cvC.wiv.add(paramContext);
      paramContext = paramcl.cvA.cvD;
      paramContext.wiQ += 1;
      AppMethodBeat.o(27293);
      bool = true;
      break;
      paramContext = a(parambi, (j.b)localObject1, 4);
      paramContext.a(localaas);
      paramContext.alc(a(localaas.whw));
      paramContext.ald(b(localaas.whw));
      paramContext.mh(parambi.field_msgId);
      if (ad.aox(localaas.whw.whU))
      {
        parambi = localaas.whw.whU;
        parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
        if (!bo.isNullOrNil(parambi))
          paramContext.all(parambi);
      }
      paramcl.cvA.cvC.wiv.add(paramContext);
      paramContext = paramcl.cvA.cvD;
      paramContext.wiN += 1;
      AppMethodBeat.o(27293);
      bool = true;
      break;
      if ((((j.b)localObject1).url != null) && (!((j.b)localObject1).url.equals("")))
      {
        localaas.whw.als(((j.b)localObject1).url);
        paramContext = a(parambi, (j.b)localObject1, 5);
        paramContext.a(localaas);
        paramContext.alc(a(localaas.whw));
        paramContext.ald(b(localaas.whw));
        if (ad.aox(localaas.whw.whU))
        {
          parambi = localaas.whw.whU;
          parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
          if (!bo.isNullOrNil(parambi))
            paramContext.all(parambi);
        }
        parambi = new abu();
        if (!bo.isNullOrNil(((j.b)localObject1).title))
          parambi.alQ(((j.b)localObject1).title);
        if (!bo.isNullOrNil(((j.b)localObject1).description))
          parambi.alR(((j.b)localObject1).description);
        if (!bo.isNullOrNil(((j.b)localObject1).thumburl))
          parambi.alT(((j.b)localObject1).thumburl);
        if (!bo.isNullOrNil(((j.b)localObject1).canvasPageXml))
          parambi.alU(((j.b)localObject1).canvasPageXml);
        if (parambi.computeSize() > 0)
        {
          parambi.LO(1);
          localaas.a(parambi);
        }
        paramcl.cvA.cvC.wiv.add(paramContext);
        paramContext = paramcl.cvA.cvD;
        paramContext.wiO += 1;
        AppMethodBeat.o(27293);
        bool = true;
        break;
      }
      paramcl.cvA.cvG = 2131299626;
      AppMethodBeat.o(27293);
      bool = false;
      break;
      aw.ZK();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        paramcl.cvA.cvG = 2131299638;
        AppMethodBeat.o(27293);
        bool = false;
        break;
      }
      localObject2 = am.aUq().aiE(((j.b)localObject1).csD);
      paramContext = new aar();
      if (localObject2 != null)
        paramContext.akV(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
      paramContext.akZ(ah(parambi));
      paramContext.LE(8);
      paramContext.akR(((j.b)localObject1).fgp);
      localObject2 = com.tencent.mm.at.o.ahl().I(parambi.field_imgPath, true);
      if (bo.isNullOrNil((String)localObject2))
        paramContext.oY(true);
      if (com.tencent.mm.a.e.ct((String)localObject2))
        paramContext.akW((String)localObject2);
      paramContext.akH(((j.b)localObject1).title);
      paramContext.akI(((j.b)localObject1).description);
      paramContext.a(localaas);
      paramContext.alc(a(localaas.whw));
      paramContext.ald(b(localaas.whw));
      paramContext.mh(parambi.field_msgId);
      if (ad.aox(localaas.whw.whU))
      {
        parambi = localaas.whw.whU;
        parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
        if (!bo.isNullOrNil(parambi))
          paramContext.all(parambi);
      }
      paramcl.cvA.cvC.wiv.add(paramContext);
      paramContext = paramcl.cvA.cvD;
      paramContext.fileCount += 1;
      AppMethodBeat.o(27293);
      bool = true;
      break;
      if ((((j.b)localObject1).csD == null) || (((j.b)localObject1).csD.length() == 0))
        paramcl.cvA.cvG = 2131299623;
      do
      {
        paramcl.cvA.cvG = 2131299630;
        AppMethodBeat.o(27293);
        bool = false;
        break;
        aw.ZK();
      }
      while (com.tencent.mm.model.c.isSDCardAvailable());
      paramcl.cvA.cvG = 2131299638;
      AppMethodBeat.o(27293);
      bool = false;
      break;
      paramContext = new abe();
      paramContext.alw(((j.b)localObject1).title);
      paramContext.alx(((j.b)localObject1).description);
      paramContext.LK(((j.b)localObject1).fgP);
      paramContext.alz(((j.b)localObject1).fgQ);
      paramContext.aly(((j.b)localObject1).thumburl);
      localaas.a(paramContext);
      paramContext = new aar();
      paramContext.akZ(ah(parambi));
      paramContext.LE(10);
      paramContext.oY(true);
      paramContext.oX(true);
      paramContext.a(localaas);
      paramContext.alc(a(localaas.whw));
      paramContext.ald(b(localaas.whw));
      if (ad.aox(localaas.whw.whU))
      {
        parambi = localaas.whw.whU;
        parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
        if (!bo.isNullOrNil(parambi))
          paramContext.all(parambi);
      }
      paramcl.cvA.cvC.wiv.add(paramContext);
      paramContext = paramcl.cvA.cvD;
      paramContext.wiS += 1;
      AppMethodBeat.o(27293);
      bool = true;
      break;
      paramContext = new abo();
      paramContext.alM(((j.b)localObject1).title);
      paramContext.alN(((j.b)localObject1).description);
      paramContext.alP(((j.b)localObject1).fgT);
      paramContext.alO(((j.b)localObject1).thumburl);
      localaas.a(paramContext);
      paramContext = new aar();
      paramContext.akZ(ah(parambi));
      paramContext.LE(14);
      paramContext.oY(true);
      paramContext.oX(true);
      paramContext.a(localaas);
      paramContext.alc(a(localaas.whw));
      paramContext.ald(b(localaas.whw));
      if (ad.aox(localaas.whw.whU))
      {
        parambi = localaas.whw.whU;
        parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
        if (!bo.isNullOrNil(parambi))
          paramContext.all(parambi);
      }
      paramcl.cvA.cvC.wiv.add(paramContext);
      paramContext = paramcl.cvA.cvD;
      paramContext.wiW += 1;
      AppMethodBeat.o(27293);
      bool = true;
      break;
      paramContext = new abe();
      paramContext.alw(((j.b)localObject1).title);
      paramContext.alx(((j.b)localObject1).description);
      paramContext.LK(((j.b)localObject1).fgV);
      paramContext.alz(((j.b)localObject1).fgW);
      paramContext.aly(((j.b)localObject1).thumburl);
      localaas.a(paramContext);
      paramContext = new aar();
      paramContext.akZ(ah(parambi));
      paramContext.LE(11);
      paramContext.oY(true);
      paramContext.oX(true);
      paramContext.a(localaas);
      paramContext.alc(a(localaas.whw));
      paramContext.ald(b(localaas.whw));
      if (ad.aox(localaas.whw.whU))
      {
        parambi = localaas.whw.whU;
        parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
        if (!bo.isNullOrNil(parambi))
          paramContext.all(parambi);
      }
      paramcl.cvA.cvC.wiv.add(paramContext);
      paramContext = paramcl.cvA.cvD;
      paramContext.wiT += 1;
      AppMethodBeat.o(27293);
      bool = true;
      break;
      paramContext = a(parambi, paramContext.getString(2131296992), localaas);
      paramcl.cvA.cvC.wiv.add(paramContext);
      AppMethodBeat.o(27293);
      bool = true;
      break;
      paramContext = new aar();
      paramContext.akZ(ah(parambi));
      paramContext.akH(((j.b)localObject1).title);
      paramContext.akI(((j.b)localObject1).description);
      paramContext.LE(19);
      localObject2 = com.tencent.mm.at.o.ahl().I(parambi.field_imgPath, true);
      if (bo.isNullOrNil((String)localObject2))
        paramContext.oY(true);
      if (com.tencent.mm.a.e.ct((String)localObject2))
        paramContext.akW((String)localObject2);
      localObject2 = new aap();
      if (!bo.isNullOrNil(((j.b)localObject1).fiP))
        ((aap)localObject2).username = ((j.b)localObject1).fiP;
      if (!bo.isNullOrNil(((j.b)localObject1).fiQ))
        ((aap)localObject2).appId = ((j.b)localObject1).fiQ;
      if (!bo.isNullOrNil(((j.b)localObject1).fjb))
        ((aap)localObject2).iconUrl = ((j.b)localObject1).fjb;
      ((aap)localObject2).type = ((j.b)localObject1).fiR;
      ((aap)localObject2).cBc = ((j.b)localObject1).fiT;
      ((aap)localObject2).csu = ((j.b)localObject1).fiO;
      ((aap)localObject2).wfO = ((j.b)localObject1).cMh;
      localaas.a((aap)localObject2);
      paramContext.a(localaas);
      paramContext.alc(a(localaas.whw));
      paramContext.ald(b(localaas.whw));
      paramContext.mh(parambi.field_msgId);
      if (ad.aox(localaas.whw.whU))
      {
        parambi = localaas.whw.whU;
        parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
        if (!bo.isNullOrNil(parambi))
          paramContext.all(parambi);
      }
      paramcl.cvA.cvC.wiv.add(paramContext);
      AppMethodBeat.o(27293);
      bool = true;
      break;
      paramContext = ((j.b)localObject1).p(paramContext, true);
      if (bo.isNullOrNil(paramContext))
      {
        paramcl.cvA.cvG = 2131299630;
        AppMethodBeat.o(27293);
        bool = false;
        break;
      }
      paramContext = a(parambi, paramContext + ((j.b)localObject1).title, localaas);
      paramcl.cvA.cvC.wiv.add(paramContext);
      AppMethodBeat.o(27293);
      bool = true;
      break;
      if ((((j.b)localObject1).fgU != null) && (((j.b)localObject1).fgU.contains("<recordxml>")));
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label3078;
        localObject2 = new aar();
        ((aar)localObject2).akZ(ah(parambi));
        ((aar)localObject2).LE(17);
        ((aar)localObject2).oY(true);
        ((aar)localObject2).akH(((j.b)localObject1).title);
        ((aar)localObject2).alh(((j.b)localObject1).fgU);
        paramContext = ((j.b)localObject1).description;
        localObject3 = new nt();
        ((nt)localObject3).cJY.type = 0;
        ((nt)localObject3).cJY.cKa = ((j.b)localObject1).fgU;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
        localObject3 = ((nt)localObject3).cJZ.cKi;
        if (localObject3 == null)
          break label3080;
        localObject1 = ((com.tencent.mm.protocal.b.a.c)localObject3).fjr.iterator();
        do
          if (!((Iterator)localObject1).hasNext())
            break;
        while (bo.isNullOrNil(((aar)((Iterator)localObject1).next()).whr));
        paramcl.cvA.cvG = 2131299630;
        AppMethodBeat.o(27293);
        bool = false;
        break;
      }
    }
    label3080: if (localObject3 != null)
      paramContext = ((com.tencent.mm.protocal.b.a.c)localObject3).desc;
    while (true)
    {
      ((aar)localObject2).akI(paramContext);
      ((aar)localObject2).a(localaas);
      ((aar)localObject2).alc(a(localaas.whw));
      ((aar)localObject2).ald(b(localaas.whw));
      ((aar)localObject2).mh(parambi.field_msgId);
      if (ad.aox(localaas.whw.whU))
      {
        paramContext = localaas.whw.whU;
        paramContext = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramContext));
        if (!bo.isNullOrNil(paramContext))
          ((aar)localObject2).all(paramContext);
      }
      paramcl.cvA.cvC.wiv.add(localObject2);
      AppMethodBeat.o(27293);
      bool = true;
      break;
    }
  }

  public static boolean a(Context paramContext, cl paramcl, String paramString, List<bi> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(27277);
    if ((paramList == null) || (paramList.isEmpty()) || (paramContext == null))
    {
      ab.w("MicroMsg.GetFavRecordDataSource", "fill favorite event fail, event or msgs is null");
      paramcl.cvA.cvG = 2131299622;
      AppMethodBeat.o(27277);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      Object localObject1 = paramList.iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (bi)((Iterator)localObject1).next();
        if (bh.o((bi)localObject2))
          switch (((bi)localObject2).getType() & 0xFFFF)
          {
          default:
            break;
          case 1:
            ((bi)localObject2).setContent(paramContext.getString(2131297059));
            break;
          case 3:
            ((bi)localObject2).setContent(paramContext.getString(2131297012));
            ((bi)localObject2).setType(1);
            break;
          case 43:
            ((bi)localObject2).setContent(paramContext.getString(2131297076));
            ((bi)localObject2).setType(1);
            break;
          case 49:
            ((bi)localObject2).setContent(paramContext.getString(2131297069));
            ((bi)localObject2).setType(1);
          }
      }
      boolean bool = com.tencent.mm.aj.f.kq(paramString);
      if ((paramList.size() == 1) && (!paramBoolean))
      {
        paramList = (bi)paramList.get(0);
        if (paramList.drC())
        {
          localObject1 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).b(paramList.field_msgId, paramList.field_content);
          if ((((com.tencent.mm.af.o)localObject1).fjr != null) && (((com.tencent.mm.af.o)localObject1).fjr.size() == 1))
          {
            paramBoolean = e.d(paramcl, paramList);
            AppMethodBeat.o(27277);
          }
          else
          {
            paramcl.cvA.cvC = new abf();
            paramcl.cvA.cvD = new abt();
            paramcl.cvA.cvC.a(aiz(paramString));
            paramcl.cvA.type = 14;
            paramBoolean = b(paramContext, paramcl, paramList);
            AppMethodBeat.o(27277);
          }
        }
        else
        {
          paramBoolean = e.d(paramcl, paramList);
          AppMethodBeat.o(27277);
        }
      }
      else
      {
        paramcl.cvA.cvC = new abf();
        paramcl.cvA.cvD = new abt();
        int i;
        if (paramContext != null)
        {
          if (!bool)
            break label637;
          localObject2 = com.tencent.mm.aj.a.e.fD(((bi)paramList.get(0)).field_bizChatId);
          if (com.tencent.mm.aj.a.e.rs((String)localObject2))
          {
            paramcl.cvA.cvC.alB(paramContext.getString(2131302200));
            ab.d("MicroMsg.GetFavRecordDataSource", "title %s", new Object[] { paramcl.cvA.cvC.title });
          }
        }
        else
        {
          paramcl.cvA.cvC.a(aiz(paramString));
          paramcl.cvA.type = 14;
          paramString = paramList.iterator();
          paramBoolean = true;
          i = 0;
        }
        while (true)
        {
          if (!paramString.hasNext())
            break label762;
          if (b(paramContext, paramcl, (bi)paramString.next()))
          {
            i = 1;
            continue;
            localObject1 = com.tencent.mm.aj.a.e.rv(paramString);
            if (localObject1 == null)
              break;
            paramcl.cvA.cvC.alB(paramContext.getString(2131299697, new Object[] { ((com.tencent.mm.aj.a.j)localObject1).field_userName, com.tencent.mm.aj.a.e.rt((String)localObject2) }));
            break;
            label637: if (com.tencent.mm.model.t.kH(paramString))
            {
              paramcl.cvA.cvC.alB(paramContext.getString(2131302200));
              break;
            }
            localObject1 = bo.nullAsNil(r.YB());
            if (((String)localObject1).equals(bo.nullAsNil(com.tencent.mm.model.s.mI(paramString))))
            {
              paramcl.cvA.cvC.alB(paramContext.getString(2131299698, new Object[] { localObject1 }));
              break;
            }
            paramcl.cvA.cvC.alB(paramContext.getString(2131299697, new Object[] { r.YB(), com.tencent.mm.model.s.mI(paramString) }));
            break;
          }
          paramBoolean = false;
        }
        label762: if ((i != 0) && (paramcl.cvA.cvG > 0))
          paramcl.cvA.cvG = 0;
        AppMethodBeat.o(27277);
      }
    }
  }

  private static boolean a(cl paramcl, bi parambi)
  {
    AppMethodBeat.i(27286);
    aas localaas = new aas();
    localaas.c(ag(parambi));
    Object localObject = br.z(parambi.field_content, "msg");
    if (localObject != null);
    while (true)
    {
      try
      {
        aay localaay = new com/tencent/mm/protocal/protobuf/aay;
        localaay.<init>();
        localaay.alu((String)((Map)localObject).get(".msg.location.$label"));
        localaay.E(Double.parseDouble((String)((Map)localObject).get(".msg.location.$x")));
        localaay.D(Double.parseDouble((String)((Map)localObject).get(".msg.location.$y")));
        localaay.LJ(Integer.valueOf((String)((Map)localObject).get(".msg.location.$scale")).intValue());
        localaay.alv((String)((Map)localObject).get(".msg.location.$poiname"));
        localaas.a(localaay);
        localObject = new com/tencent/mm/protocal/protobuf/aar;
        ((aar)localObject).<init>();
        ((aar)localObject).akZ(ah(parambi));
        ((aar)localObject).LE(6);
        ((aar)localObject).oY(true);
        ((aar)localObject).oX(true);
        ((aar)localObject).a(localaas);
        ((aar)localObject).alc(a(localaas.whw));
        ((aar)localObject).ald(b(localaas.whw));
        if (ad.aox(localaas.whw.whU))
        {
          parambi = localaas.whw.whU;
          parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
          if (!bo.isNullOrNil(parambi))
            ((aar)localObject).all(parambi);
        }
        paramcl.cvA.cvC.wiv.add(localObject);
        parambi = paramcl.cvA.cvD;
        parambi.wiP += 1;
        AppMethodBeat.o(27286);
        bool = true;
        return bool;
      }
      catch (Exception parambi)
      {
        ab.e("MicroMsg.GetFavRecordDataSource", "parse failed, %s", new Object[] { parambi.getStackTrace().toString() });
      }
      paramcl.cvA.cvG = 2131299632;
      AppMethodBeat.o(27286);
      boolean bool = false;
    }
  }

  private static aat ag(bi parambi)
  {
    AppMethodBeat.i(27280);
    aat localaat = new aat();
    if (parambi == null)
    {
      AppMethodBeat.o(27280);
      return localaat;
    }
    Object localObject;
    if (parambi.field_isSend == 0)
    {
      localaat.alm(parambi.field_talker);
      localaat.aln(r.Yz());
      if (com.tencent.mm.model.t.kH(parambi.field_talker))
      {
        if (parambi.field_content == null)
          break label344;
        localObject = parambi.field_content.substring(0, Math.max(0, parambi.field_content.indexOf(':')));
        label89: localaat.alp((String)localObject);
        if ((!bo.isNullOrNil(localaat.whU)) && (!parambi.drD()))
        {
          parambi.setContent(parambi.field_content.substring(localaat.whU.length() + 1));
          if ((parambi.field_content.length() > 0) && ('\n' == parambi.field_content.charAt(0)))
            parambi.setContent(parambi.field_content.substring(1));
          if (parambi.dtF())
          {
            parambi.jx(parambi.field_transContent.substring(localaat.whU.length() + 1));
            if ((parambi.field_transContent.length() > 0) && ('\n' == parambi.field_transContent.charAt(0)))
              parambi.jx(parambi.field_transContent.substring(1));
          }
        }
      }
    }
    while (true)
    {
      if (com.tencent.mm.aj.f.kq(parambi.field_talker))
      {
        String str = parambi.field_bizChatUserId;
        localObject = str;
        if (str == null)
          localObject = bf.oE(parambi.dqJ).userId;
        localaat.alp((String)localObject);
      }
      localaat.LI(1);
      localaat.mi(parambi.field_createTime);
      localaat.alq(parambi.field_msgSvrId);
      if (parambi.field_msgSvrId > 0L)
        localaat.alo(parambi.field_msgSvrId);
      AppMethodBeat.o(27280);
      break;
      label344: localObject = "";
      break label89;
      localaat.alm(r.Yz());
      localaat.aln(parambi.field_talker);
      if (com.tencent.mm.model.t.kH(parambi.field_talker))
        localaat.alp(localaat.cEV);
    }
  }

  private static String ah(bi parambi)
  {
    AppMethodBeat.i(27283);
    if (parambi.field_isSend == 1)
      if ((com.tencent.mm.model.t.kH(parambi.field_talker)) || (parambi.field_talker.equals("filehelper")))
      {
        parambi = String.format("%d", new Object[] { Long.valueOf(parambi.field_msgSvrId) });
        AppMethodBeat.o(27283);
      }
    while (true)
    {
      return parambi;
      parambi = String.format("%s#%d", new Object[] { parambi.field_talker, Long.valueOf(parambi.field_msgSvrId) });
      AppMethodBeat.o(27283);
      continue;
      parambi = String.valueOf(parambi.field_msgSvrId);
      AppMethodBeat.o(27283);
    }
  }

  private static String aiy(String paramString)
  {
    AppMethodBeat.i(27288);
    aw.ZK();
    paramString = com.tencent.mm.sdk.platformtools.j.b(com.tencent.mm.model.c.XZ(), "recbiz_", paramString, ".rec", 2);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(27288);
    }
    while (true)
    {
      return paramString;
      if (new File(paramString).exists())
        AppMethodBeat.o(27288);
      else
        AppMethodBeat.o(27288);
    }
  }

  private static abl aiz(String paramString)
  {
    AppMethodBeat.i(27279);
    abl localabl = new abl();
    localabl.alD(paramString);
    localabl.LN(1);
    localabl.ml(bo.anU());
    localabl.alF("");
    AppMethodBeat.o(27279);
    return localabl;
  }

  private static String b(aat paramaat)
  {
    AppMethodBeat.i(27282);
    paramaat = pJi.format(new Date(paramaat.createTime));
    AppMethodBeat.o(27282);
    return paramaat;
  }

  private static boolean b(Context paramContext, cl paramcl, bi parambi)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(27278);
    if ((paramcl == null) || (parambi == null))
    {
      ab.w("MicroMsg.GetFavRecordDataSource", "fill favorite event fail, event or msg is null");
      if (paramcl != null)
        paramcl.cvA.cvG = 2131299622;
      AppMethodBeat.o(27278);
      return bool2;
    }
    parambi = bi.ar(parambi);
    if (parambi.isText())
      bool2 = e(paramcl, parambi);
    while (true)
    {
      com.tencent.mm.plugin.fav.ui.c.a(parambi, paramcl, bool2);
      AppMethodBeat.o(27278);
      break;
      if (parambi.drD())
      {
        bool2 = k(paramcl, parambi);
      }
      else if (parambi.bAC())
      {
        bool2 = a(paramcl, parambi);
      }
      else if (parambi.drE())
      {
        bool2 = j(paramcl, parambi);
      }
      else if (parambi.bws())
      {
        bool2 = b(paramcl, parambi);
      }
      else if (parambi.bwt())
      {
        bool2 = b(paramcl, parambi);
      }
      else if (parambi.drC())
      {
        bool2 = c(paramcl, parambi);
      }
      else if (parambi.dtw())
      {
        bool2 = c(paramContext, paramcl, parambi);
      }
      else if ((parambi.bAA()) && (!parambi.dty()))
      {
        bool2 = a(paramContext, paramcl, parambi);
      }
      else
      {
        paramcl.cvA.cvG = 2131299630;
        bool2 = bool1;
      }
    }
  }

  private static boolean b(cl paramcl, bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(27289);
    Object localObject = new aas();
    ((aas)localObject).c(ag(parambi));
    aar localaar = new aar();
    localaar.akZ(ah(parambi));
    com.tencent.mm.modelvideo.o.all();
    localaar.akV(com.tencent.mm.modelvideo.t.uh(parambi.field_imgPath));
    com.tencent.mm.modelvideo.o.all();
    localaar.akW(com.tencent.mm.modelvideo.t.ui(parambi.field_imgPath));
    localaar.akR(com.tencent.mm.a.e.cv(localaar.wgx));
    com.tencent.mm.modelvideo.s locals;
    if (parambi.bwt())
    {
      localaar.LE(15);
      locals = u.ut(parambi.field_imgPath);
      if (locals != null)
        break label158;
      ab.i("MicroMsg.GetFavRecordDataSource", "video info null");
      paramcl.cvA.cvG = 2131299621;
      AppMethodBeat.o(27289);
    }
    while (true)
    {
      return bool;
      localaar.LE(4);
      break;
      label158: ab.i("MicroMsg.GetFavRecordDataSource", "video length is %d", new Object[] { Integer.valueOf(locals.frO) });
      if (locals.frO > com.tencent.mm.m.b.Nc())
      {
        paramcl.cvA.cvG = 2131299756;
        AppMethodBeat.o(27289);
      }
      else if ((parambi.bwt()) && (u.uv(locals.getFileName())))
      {
        paramcl.cvA.cvG = 2131299621;
        AppMethodBeat.o(27289);
      }
      else
      {
        localaar.LD(locals.fXd);
        localaar.a((aas)localObject);
        localaar.alc(a(((aas)localObject).whw));
        localaar.ald(b(((aas)localObject).whw));
        if (ad.aox(((aas)localObject).whw.whU))
        {
          localObject = ((aas)localObject).whw.whU;
          localObject = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO((String)localObject));
          if (!bo.isNullOrNil((String)localObject))
            localaar.all((String)localObject);
        }
        localaar.mh(parambi.field_msgId);
        localaar.mf(locals.frO);
        paramcl.cvA.cvC.wiv.add(localaar);
        paramcl = paramcl.cvA.cvD;
        paramcl.wiN += 1;
        paramcl = u.ut(parambi.field_imgPath);
        localaar.alf(paramcl.cMn);
        parambi = paramcl.fXm;
        if ((parambi != null) && (!bo.isNullOrNil(parambi.fiM)))
        {
          paramcl = new aau();
          paramcl.fiG = parambi.fiG;
          paramcl.wid = parambi.wid;
          paramcl.fiJ = parambi.fiJ;
          paramcl.fiK = parambi.fiK;
          paramcl.fiI = parambi.fiI;
          paramcl.fiL = parambi.fiL;
          paramcl.fiM = parambi.fiM;
          paramcl.fiN = parambi.fiN;
          localaar.a(paramcl);
        }
        AppMethodBeat.o(27289);
        bool = true;
      }
    }
  }

  private static boolean c(Context paramContext, cl paramcl, bi parambi)
  {
    AppMethodBeat.i(27290);
    aw.ZK();
    Object localObject = com.tencent.mm.model.c.XO().Rn(parambi.field_content);
    aas localaas = new aas();
    localaas.c(ag(parambi));
    if ((localObject != null) && (com.tencent.mm.model.t.kv(((bi.a)localObject).ufB)))
    {
      paramContext = new aar();
      paramContext.akZ(ah(parambi));
      paramContext.LE(16);
      paramContext.akI(parambi.field_content);
      paramContext.oY(true);
      paramContext.oX(true);
      paramContext.a(localaas);
      paramContext.alc(a(localaas.whw));
      paramContext.ald(b(localaas.whw));
      if (!ad.aox(localaas.whw.whU))
        break label337;
      parambi = localaas.whw.whU;
      parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
      if (!bo.isNullOrNil(parambi))
        paramContext.all(parambi);
    }
    label337: 
    while (true)
    {
      paramcl.cvA.cvC.wiv.add(paramContext);
      paramContext = paramcl.cvA.cvD;
      paramContext.wiX += 1;
      AppMethodBeat.o(27290);
      return true;
      if ((localObject != null) && (ad.aox(((bi.a)localObject).svN)))
      {
        localObject = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).a(((bi.a)localObject).xZm, "openim_card_type_name", b.a.geR);
        if (TextUtils.isEmpty((CharSequence)localObject));
        for (paramContext = paramContext.getResources().getString(2131296949); ; paramContext = String.format("[%s]", new Object[] { localObject }))
        {
          paramContext = a(parambi, paramContext, localaas);
          break;
        }
      }
      paramContext = a(parambi, paramContext.getString(2131296949), localaas);
    }
  }

  private static boolean c(cl paramcl, bi parambi)
  {
    AppMethodBeat.i(27294);
    int i;
    label204: boolean bool;
    try
    {
      com.tencent.mm.af.o localo = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).b(parambi.field_msgId, parambi.field_content);
      Object localObject = localo.fjr;
      if (localObject != null)
      {
        Iterator localIterator = ((List)localObject).iterator();
        i = 0;
        while (localIterator.hasNext())
        {
          p localp = (p)localIterator.next();
          if (!l.mg(localp.fjC))
          {
            aas localaas = new com/tencent/mm/protocal/protobuf/aas;
            localaas.<init>();
            localaas.c(ag(parambi));
            localaas.whw.alt(localo.cMg);
            localaas.whw.als(localp.url);
            aar localaar = new com/tencent/mm/protocal/protobuf/aar;
            localaar.<init>();
            localaar.akH(localp.title);
            localaar.akI(localp.fjz);
            localaar.akZ(ah(parambi));
            if (!bo.isNullOrNil(localp.fjx))
            {
              String str = localp.fjx;
              int j = parambi.getType();
              if (i == 0)
              {
                localObject = "@T";
                localaar.akW(q.v(str, j, (String)localObject));
              }
            }
            while (true)
            {
              localaar.oX(true);
              localObject = new com/tencent/mm/protocal/protobuf/abu;
              ((abu)localObject).<init>();
              if (!bo.isNullOrNil(localp.title))
                ((abu)localObject).alQ(localp.title);
              if (!bo.isNullOrNil(localp.fjz))
                ((abu)localObject).alR(localp.fjz);
              if (!bo.isNullOrNil(localp.fjx))
                ((abu)localObject).alT(l.a(localp));
              if (((abu)localObject).computeSize() > 0)
              {
                ((abu)localObject).LO(1);
                localaas.a((abu)localObject);
              }
              localaar.LE(5);
              localaar.a(localaas);
              localaar.alc(a(localaas.whw));
              localaar.ald(b(localaas.whw));
              if (ad.aox(localaas.whw.whU))
              {
                localObject = localaas.whw.whU;
                localObject = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO((String)localObject));
                if (!bo.isNullOrNil((String)localObject))
                  localaar.all((String)localObject);
              }
              paramcl.cvA.cvC.wiv.add(localaar);
              localObject = paramcl.cvA.cvD;
              ((abt)localObject).wiO += 1;
              i++;
              break;
              localObject = "@S";
              break label204;
              localaar.oY(true);
            }
          }
        }
      }
    }
    catch (Exception parambi)
    {
      ab.printErrStackTrace("MicroMsg.GetFavRecordDataSource", parambi, "", new Object[0]);
      ab.e("MicroMsg.GetFavRecordDataSource", "retransmit app msg error : %s", new Object[] { parambi.getLocalizedMessage() });
      paramcl.cvA.cvG = 2131299632;
      AppMethodBeat.o(27294);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        paramcl.cvA.cvG = 2131299630;
        AppMethodBeat.o(27294);
        bool = false;
      }
      else
      {
        AppMethodBeat.o(27294);
        bool = true;
      }
    }
  }

  private static boolean e(cl paramcl, bi parambi)
  {
    AppMethodBeat.i(27284);
    aas localaas = new aas();
    localaas.c(ag(parambi));
    aar localaar = new aar();
    localaar.akZ(ah(parambi));
    localaar.LE(1);
    String str;
    if (parambi.dtV())
    {
      str = ah.getContext().getString(2131302586, new Object[] { "@" }) + '\n';
      if (parambi.dtM())
        break label273;
      localaar.akI(str + parambi.field_content);
    }
    while (true)
    {
      localaar.oY(true);
      localaar.oX(true);
      localaar.a(localaas);
      localaar.alc(a(localaas.whw));
      localaar.ald(b(localaas.whw));
      if (ad.aox(localaas.whw.whU))
      {
        parambi = localaas.whw.whU;
        parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
        if (!bo.isNullOrNil(parambi))
          localaar.all(parambi);
      }
      paramcl.cvA.cvC.wiv.add(localaar);
      paramcl = paramcl.cvA.cvD;
      paramcl.wiK += 1;
      AppMethodBeat.o(27284);
      return true;
      str = "";
      break;
      label273: localaar.akI(str + parambi.field_content + "\n\n" + parambi.field_transContent);
    }
  }

  private static boolean j(cl paramcl, bi parambi)
  {
    AppMethodBeat.i(27285);
    Object localObject1 = null;
    if (parambi.field_msgId > 0L)
      localObject1 = com.tencent.mm.at.o.ahl().fJ((int)parambi.field_msgId);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (((com.tencent.mm.at.e)localObject1).fDy > 0L);
    }
    else
    {
      localObject2 = localObject1;
      if (parambi.field_msgSvrId > 0L)
        localObject2 = com.tencent.mm.at.o.ahl().fI(parambi.field_msgSvrId);
    }
    boolean bool;
    if (localObject2 == null)
    {
      ab.w("MicroMsg.GetFavRecordDataSource", "getImgDataPath: try get imgInfo fail");
      paramcl.cvA.cvG = 2131299628;
      bool = false;
      AppMethodBeat.o(27285);
    }
    while (true)
    {
      return bool;
      aas localaas = new aas();
      localaas.c(ag(parambi));
      localObject1 = new aar();
      ((aar)localObject1).akZ(ah(parambi));
      ((aar)localObject1).LE(2);
      ((aar)localObject1).akV(com.tencent.mm.at.o.ahl().q(com.tencent.mm.at.f.c((com.tencent.mm.at.e)localObject2), "", ""));
      if (((com.tencent.mm.at.e)localObject2).agQ())
      {
        localObject2 = com.tencent.mm.at.o.ahl().ly(((com.tencent.mm.at.e)localObject2).fDJ);
        if (((com.tencent.mm.at.e)localObject2).frO > ((com.tencent.mm.at.e)localObject2).offset)
          ((aar)localObject1).akV(com.tencent.mm.at.o.ahl().q("SERVERID://" + parambi.field_msgSvrId, "", ""));
      }
      ((aar)localObject1).akW(com.tencent.mm.at.o.ahl().I(parambi.field_imgPath, true));
      ((aar)localObject1).a(localaas);
      ((aar)localObject1).alc(a(localaas.whw));
      ((aar)localObject1).ald(b(localaas.whw));
      ((aar)localObject1).mh(parambi.field_msgId);
      if (ad.aox(localaas.whw.whU))
      {
        parambi = localaas.whw.whU;
        parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
        if (!bo.isNullOrNil(parambi))
          ((aar)localObject1).all(parambi);
      }
      paramcl.cvA.cvC.wiv.add(localObject1);
      paramcl = paramcl.cvA.cvD;
      paramcl.wiL += 1;
      AppMethodBeat.o(27285);
      bool = true;
    }
  }

  private static boolean k(cl paramcl, bi parambi)
  {
    AppMethodBeat.i(27287);
    aas localaas = new aas();
    localaas.c(ag(parambi));
    aar localaar = new aar();
    localaar.akZ(ah(parambi));
    localaar.LE(3);
    com.tencent.mm.modelvoice.b localb;
    boolean bool;
    if (com.tencent.mm.model.t.nv(parambi.field_talker))
    {
      localaar.akV(aiy(parambi.field_imgPath));
      localaar.oY(true);
      localb = com.tencent.mm.modelvoice.q.uN(parambi.field_imgPath);
      if (localb != null)
        break label115;
      bool = false;
      AppMethodBeat.o(27287);
    }
    while (true)
    {
      return bool;
      localaar.akV(com.tencent.mm.modelvoice.q.getFullPath(parambi.field_imgPath));
      break;
      label115: localaar.akR(e.Kp(localb.getFormat()));
      localaar.LD((int)new n(parambi.field_content).time);
      localaar.a(localaas);
      localaar.alc(a(localaas.whw));
      localaar.ald(b(localaas.whw));
      if (ad.aox(localaas.whw.whU))
      {
        parambi = localaas.whw.whU;
        parambi = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(parambi));
        if (!bo.isNullOrNil(parambi))
          localaar.all(parambi);
      }
      paramcl.cvA.cvC.wiv.add(localaar);
      paramcl = paramcl.cvA.cvD;
      paramcl.wiM += 1;
      AppMethodBeat.o(27287);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.g
 * JD-Core Version:    0.6.2
 */