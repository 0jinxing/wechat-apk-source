package com.tencent.mm.plugin.record.b;

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
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.bh;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.openim.a.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.q;
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

public final class b
{
  private static final SimpleDateFormat pJi;

  static
  {
    AppMethodBeat.i(135638);
    pJi = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    AppMethodBeat.o(135638);
  }

  private static aar a(bi parambi, j.b paramb, int paramInt)
  {
    AppMethodBeat.i(135634);
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
      AppMethodBeat.o(135634);
      return localaar;
      localaar.oY(true);
    }
  }

  private static aar a(bi parambi, String paramString, aas paramaas)
  {
    AppMethodBeat.i(135635);
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
    AppMethodBeat.o(135635);
    return localaar;
  }

  private static String a(aat paramaat)
  {
    AppMethodBeat.i(135629);
    String str1 = paramaat.whU;
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = paramaat.cEV;
    if (com.tencent.mm.aj.a.e.rr(str2))
    {
      paramaat = com.tencent.mm.aj.a.e.rt(str2);
      AppMethodBeat.o(135629);
    }
    while (true)
    {
      return paramaat;
      paramaat = com.tencent.mm.model.s.mI(str2);
      AppMethodBeat.o(135629);
    }
  }

  private static boolean a(Context paramContext, cl paramcl, bi parambi)
  {
    AppMethodBeat.i(135636);
    aas localaas = new aas();
    localaas.c(ag(parambi));
    Object localObject1 = parambi.field_content;
    boolean bool;
    if (localObject1 == null)
    {
      paramcl.cvA.cvG = 2131299632;
      AppMethodBeat.o(135636);
      bool = false;
    }
    Object localObject2;
    while (true)
    {
      return bool;
      localObject1 = j.b.me((String)localObject1);
      if (localObject1 == null)
      {
        paramcl.cvA.cvG = 2131299632;
        AppMethodBeat.o(135636);
        bool = false;
      }
      else
      {
        localaas.whw.alr(((j.b)localObject1).appId);
        localaas.whw.alt(((j.b)localObject1).cMg);
        localObject2 = com.tencent.mm.pluginsdk.model.app.g.bT(((j.b)localObject1).appId, true);
        if ((localObject2 != null) && (((com.tencent.mm.pluginsdk.model.app.f)localObject2).xy()))
        {
          paramContext = a(parambi, paramContext.getString(2131296950), localaas);
          paramcl.cvA.cvC.wiv.add(paramContext);
          AppMethodBeat.o(135636);
          bool = true;
        }
        else
        {
          switch (((j.b)localObject1).type)
          {
          default:
            paramContext = a(parambi, paramContext.getString(2131297054), localaas);
            paramcl.cvA.cvC.wiv.add(paramContext);
            AppMethodBeat.o(135636);
            bool = true;
            break;
          case 1:
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
            AppMethodBeat.o(135636);
            bool = true;
            break;
          case 2:
            com.tencent.mm.kernel.g.RQ();
            if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
            {
              paramcl.cvA.cvG = 2131299638;
              AppMethodBeat.o(135636);
              bool = false;
            }
            else
            {
              localObject2 = com.tencent.mm.plugin.s.a.aUq().aiE(((j.b)localObject1).csD);
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
              AppMethodBeat.o(135636);
              bool = true;
            }
            break;
          case 3:
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
            AppMethodBeat.o(135636);
            bool = true;
            break;
          case 4:
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
            AppMethodBeat.o(135636);
            bool = true;
            break;
          case 5:
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
              AppMethodBeat.o(135636);
              bool = true;
            }
            else
            {
              paramcl.cvA.cvG = 2131299626;
              paramContext = a(parambi, paramContext.getString(2131297054), localaas);
              paramcl.cvA.cvC.wiv.add(paramContext);
              AppMethodBeat.o(135636);
              bool = true;
            }
            break;
          case 6:
            com.tencent.mm.kernel.g.RQ();
            if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
            {
              paramcl.cvA.cvG = 2131299638;
              AppMethodBeat.o(135636);
              bool = false;
            }
            else
            {
              localObject2 = com.tencent.mm.plugin.s.a.aUq().aiE(((j.b)localObject1).csD);
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
              paramContext.akL(((j.b)localObject1).fgD);
              paramContext.akM(((j.b)localObject1).eyr);
              paramContext.alk(((j.b)localObject1).fgu);
              paramContext.ali(((j.b)localObject1).eyr);
              paramContext.alj(((j.b)localObject1).fgA);
              paramcl.cvA.cvC.wiv.add(paramContext);
              paramContext = paramcl.cvA.cvD;
              paramContext.fileCount += 1;
              AppMethodBeat.o(135636);
              bool = true;
            }
            break;
          case 7:
            if ((((j.b)localObject1).csD == null) || (((j.b)localObject1).csD.length() == 0))
              paramcl.cvA.cvG = 2131299623;
            do
            {
              paramcl.cvA.cvG = 2131299630;
              AppMethodBeat.o(135636);
              bool = false;
              break;
              com.tencent.mm.kernel.g.RQ();
            }
            while (com.tencent.mm.kernel.g.RP().isSDCardAvailable());
            paramcl.cvA.cvG = 2131299638;
            AppMethodBeat.o(135636);
            bool = false;
            break;
          case 10:
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
            AppMethodBeat.o(135636);
            bool = true;
            break;
          case 20:
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
            AppMethodBeat.o(135636);
            bool = true;
            break;
          case 13:
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
            AppMethodBeat.o(135636);
            bool = true;
            break;
          case 46:
            paramContext = a(parambi, paramContext.getString(2131296992), localaas);
            paramcl.cvA.cvC.wiv.add(paramContext);
            AppMethodBeat.o(135636);
            bool = true;
            break;
          case 33:
          case 36:
            if (((j.b)localObject1).fiR == 3)
            {
              paramContext = a(parambi, paramContext.getString(2131296992), localaas);
              paramcl.cvA.cvC.wiv.add(paramContext);
              AppMethodBeat.o(135636);
              bool = true;
            }
            else
            {
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
              AppMethodBeat.o(135636);
              bool = true;
            }
            break;
          case 44:
            localObject2 = ((j.b)localObject1).p(paramContext, true);
            if (bo.isNullOrNil((String)localObject2))
            {
              paramContext = a(parambi, paramContext.getString(2131297054), localaas);
              paramcl.cvA.cvC.wiv.add(paramContext);
              AppMethodBeat.o(135636);
              bool = true;
            }
            else
            {
              paramContext = a(parambi, (String)localObject2 + ((j.b)localObject1).title, localaas);
              paramcl.cvA.cvC.wiv.add(paramContext);
              AppMethodBeat.o(135636);
              bool = true;
            }
            break;
          case 19:
          case 24:
          case 16:
          }
        }
      }
    }
    int i;
    if ((((j.b)localObject1).fgU != null) && (((j.b)localObject1).fgU.contains("<recordxml>")))
      i = 1;
    while (true)
      label3098: if (i == 0)
      {
        localObject2 = new aar();
        ((aar)localObject2).akZ(ah(parambi));
        ((aar)localObject2).LE(17);
        ((aar)localObject2).oY(true);
        ((aar)localObject2).akH(((j.b)localObject1).title);
        ((aar)localObject2).alh(((j.b)localObject1).fgU);
        paramContext = ((j.b)localObject1).description;
        Object localObject3 = new nt();
        ((nt)localObject3).cJY.type = 0;
        ((nt)localObject3).cJY.cKa = ((j.b)localObject1).fgU;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
        localObject1 = ((nt)localObject3).cJZ.cKi;
        if (localObject1 != null)
        {
          localObject3 = ((com.tencent.mm.protocal.b.a.c)localObject1).fjr.iterator();
          while (true)
            if (((Iterator)localObject3).hasNext())
              if (!bo.isNullOrNil(((aar)((Iterator)localObject3).next()).whr))
              {
                paramcl.cvA.cvG = 2131299630;
                AppMethodBeat.o(135636);
                bool = false;
                break;
                i = 0;
                break label3098;
              }
        }
        if (localObject1 == null)
          break label3510;
        paramContext = ((com.tencent.mm.protocal.b.a.c)localObject1).desc;
      }
    label3510: 
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
      AppMethodBeat.o(135636);
      bool = true;
      break;
      paramContext = a(parambi, paramContext.getString(2131299767), localaas);
      paramcl.cvA.cvC.wiv.add(paramContext);
      AppMethodBeat.o(135636);
      bool = true;
      break;
      paramContext = a(parambi, paramContext.getString(2131297019), localaas);
      paramcl.cvA.cvC.wiv.add(paramContext);
      AppMethodBeat.o(135636);
      bool = true;
      break;
    }
  }

  private static boolean a(Context paramContext, cl paramcl, bi parambi, int paramInt)
  {
    AppMethodBeat.i(135627);
    aas localaas = new aas();
    localaas.c(ag(parambi));
    String str = null;
    if (paramInt == 1)
      str = paramContext.getString(2131296895);
    while (true)
    {
      paramContext = a(parambi, str, localaas);
      paramcl.cvA.cvC.wiv.add(paramContext);
      AppMethodBeat.o(135627);
      return true;
      if (paramInt == 2)
        str = paramContext.getString(2131296998);
      else if (paramInt == 3)
        str = paramContext.getString(2131297054);
    }
  }

  public static boolean a(Context paramContext, cl paramcl, String paramString, List<bi> paramList)
  {
    AppMethodBeat.i(135626);
    boolean bool1;
    if ((paramList == null) || (paramList.isEmpty()) || (paramContext == null))
    {
      ab.w("MicroMsg.GetFavRecordDataSourceForRecordMsg", "fill favorite event fail, event or msgs is null");
      paramcl.cvA.cvG = 2131299622;
      bool1 = false;
      AppMethodBeat.o(135626);
      return bool1;
    }
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
    boolean bool2 = com.tencent.mm.aj.f.kq(paramString);
    paramList.size();
    paramcl.cvA.cvC = new abf();
    paramcl.cvA.cvD = new abt();
    int i;
    if (paramContext != null)
    {
      if (!bool2)
        break label535;
      localObject2 = com.tencent.mm.aj.a.e.fD(((bi)paramList.get(0)).field_bizChatId);
      if (com.tencent.mm.aj.a.e.rs((String)localObject2))
      {
        paramcl.cvA.cvC.alB(paramContext.getString(2131302200));
        ab.d("MicroMsg.GetFavRecordDataSourceForRecordMsg", "title %s", new Object[] { paramcl.cvA.cvC.title });
      }
    }
    else
    {
      localObject1 = paramcl.cvA.cvC;
      localObject2 = new abl();
      ((abl)localObject2).alD(paramString);
      ((abl)localObject2).LN(1);
      ((abl)localObject2).ml(bo.anU());
      ((abl)localObject2).alF("");
      ((abf)localObject1).a((abl)localObject2);
      paramcl.cvA.type = 14;
      localObject1 = paramList.iterator();
      i = 0;
      bool1 = true;
      label425: if (!((Iterator)localObject1).hasNext())
        break label2343;
      paramString = (bi)((Iterator)localObject1).next();
      if (paramString != null)
        break label654;
      ab.w("MicroMsg.GetFavRecordDataSourceForRecordMsg", "fill favorite event fail, event or msg is null");
      paramcl.cvA.cvG = 2131299622;
      bool2 = false;
    }
    label535: label945: 
    while (true)
      label472: if (bool2)
      {
        i = 1;
        break label425;
        localObject1 = com.tencent.mm.aj.a.e.rv(paramString);
        if (localObject1 == null)
          break;
        paramcl.cvA.cvC.alB(paramContext.getString(2131299697, new Object[] { ((com.tencent.mm.aj.a.j)localObject1).field_userName, com.tencent.mm.aj.a.e.rt((String)localObject2) }));
        break;
        if (com.tencent.mm.model.t.kH(paramString))
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
        localObject2 = bi.ar(paramString);
        bool2 = false;
        Object localObject3;
        if (((bi)localObject2).isText())
        {
          localObject3 = new aas();
          ((aas)localObject3).c(ag((bi)localObject2));
          paramList = new aar();
          paramList.akZ(ah((bi)localObject2));
          paramList.LE(1);
          if (((bi)localObject2).dtV())
          {
            paramString = ah.getContext().getString(2131302586, new Object[] { "@" }) + '\n';
            label761: if (((bi)localObject2).dtM())
              break label945;
            paramList.akI(paramString + ((cy)localObject2).field_content);
          }
          while (true)
          {
            paramList.oY(true);
            paramList.oX(true);
            paramList.a((aas)localObject3);
            paramList.alc(a(((aas)localObject3).whw));
            paramList.ald(b(((aas)localObject3).whw));
            if (ad.aox(((aas)localObject3).whw.whU))
            {
              paramString = ((aas)localObject3).whw.whU;
              paramString = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString));
              if (!bo.isNullOrNil(paramString))
                paramList.all(paramString);
            }
            paramcl.cvA.cvC.wiv.add(paramList);
            paramString = paramcl.cvA.cvD;
            paramString.wiK += 1;
            bool2 = true;
            break;
            paramString = "";
            break label761;
            paramList.akI(paramString + ((cy)localObject2).field_content + "\n\n" + ((cy)localObject2).field_transContent);
          }
        }
        if (((bi)localObject2).drD())
        {
          paramList = new aas();
          paramList.c(ag((bi)localObject2));
          paramString = new aar();
          paramString.akZ(ah((bi)localObject2));
          paramString.LE(3);
          paramString.oY(true);
          paramString.oX(true);
          paramString.a(paramList);
          paramString.alc(a(paramList.whw));
          paramString.ald(b(paramList.whw));
          if (ad.aox(paramList.whw.whU))
          {
            paramList = paramList.whw.whU;
            paramList = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramList));
            if (!bo.isNullOrNil(paramList))
              paramString.all(paramList);
          }
          paramcl.cvA.cvC.wiv.add(paramString);
          paramString = paramcl.cvA.cvD;
          paramString.wiM += 1;
          bool2 = true;
        }
        else if (((bi)localObject2).bAC())
        {
          bool2 = a(paramcl, (bi)localObject2);
        }
        else if (((bi)localObject2).drE())
        {
          paramList = null;
          if (((cy)localObject2).field_msgId > 0L)
            paramList = com.tencent.mm.at.o.ahl().fJ((int)((cy)localObject2).field_msgId);
          if (paramList != null)
          {
            paramString = paramList;
            if (paramList.fDy > 0L);
          }
          else
          {
            paramString = paramList;
            if (((cy)localObject2).field_msgSvrId > 0L)
              paramString = com.tencent.mm.at.o.ahl().fI(((cy)localObject2).field_msgSvrId);
          }
          if (paramString == null)
          {
            ab.w("MicroMsg.GetFavRecordDataSourceForRecordMsg", "getImgDataPath: try get imgInfo fail");
            paramcl.cvA.cvG = 2131299628;
            bool2 = false;
            continue;
          }
          aas localaas = new aas();
          localaas.c(ag((bi)localObject2));
          paramList = new aar();
          paramList.akZ(ah((bi)localObject2));
          paramList.LE(2);
          paramList.akV(com.tencent.mm.at.o.ahl().q(com.tencent.mm.at.f.c(paramString), "", ""));
          if (paramString.agQ())
          {
            localObject3 = com.tencent.mm.at.o.ahl().ly(paramString.fDJ);
            if (((com.tencent.mm.at.e)localObject3).frO > ((com.tencent.mm.at.e)localObject3).offset)
              paramList.akV(com.tencent.mm.at.o.ahl().q("SERVERID://" + ((cy)localObject2).field_msgSvrId, "", ""));
          }
          paramList.akW(com.tencent.mm.at.o.ahl().I(((cy)localObject2).field_imgPath, true));
          paramList.a(localaas);
          paramList.alc(a(localaas.whw));
          paramList.ald(b(localaas.whw));
          paramList.mh(((cy)localObject2).field_msgId);
          if (ad.aox(localaas.whw.whU))
          {
            localObject3 = localaas.whw.whU;
            localObject3 = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO((String)localObject3));
            if (!bo.isNullOrNil((String)localObject3))
              paramList.all((String)localObject3);
          }
          if ((!paramString.agQ()) || (paramString.frO != 0))
            break label2378;
          paramString = com.tencent.mm.at.o.ahl().ly(paramString.fDJ);
        }
      }
    label654: label1597: label2375: label2378: 
    while (true)
    {
      int j;
      if (((cy)localObject2).field_isSend == 1)
        if (paramString.agQ())
        {
          j = 1;
          localObject2 = br.z(paramString.fDK, "msg");
          if (localObject2 == null)
            break label1776;
          if (j == 1)
          {
            paramList.akL((String)((Map)localObject2).get(".msg.img.$cdnbigimgurl"));
            paramList.mf(bo.getInt((String)((Map)localObject2).get(".msg.img.$length"), 0));
            paramList.akM((String)((Map)localObject2).get(".msg.img.$aeskey"));
          }
        }
      while (true)
      {
        paramcl.cvA.cvC.wiv.add(paramList);
        paramString = paramcl.cvA.cvD;
        paramString.wiL += 1;
        bool2 = true;
        break;
        j = 0;
        break label1597;
        if (!paramString.agQ())
        {
          j = 0;
          break label1597;
        }
        localObject2 = com.tencent.mm.at.f.a(paramString);
        if (!com.tencent.mm.a.e.ct(com.tencent.mm.at.o.ahl().q(((com.tencent.mm.at.e)localObject2).fDz, "", "")))
        {
          j = 0;
          break label1597;
        }
        j = 1;
        break label1597;
        label1776: ab.i("MicroMsg.GetFavRecordDataSourceForRecordMsg", "parse cdnInfo failed. [%s]", new Object[] { paramString.fDK });
      }
      if (((bi)localObject2).bws())
      {
        bool2 = b(paramcl, (bi)localObject2);
        break label472;
      }
      if (((bi)localObject2).bwt())
      {
        bool2 = b(paramcl, (bi)localObject2);
        break label472;
      }
      if (((bi)localObject2).getType() == 318767153)
      {
        bool2 = a(paramContext, paramcl, (bi)localObject2, 3);
        break label472;
      }
      if (((bi)localObject2).drC())
      {
        bool2 = c(paramcl, (bi)localObject2);
        break label472;
      }
      if ((((bi)localObject2).dtx()) || (((bi)localObject2).dty()))
      {
        bool2 = a(paramContext, paramcl, (bi)localObject2, 1);
        break label472;
      }
      if (((bi)localObject2).getType() == 419430449)
      {
        bool2 = a(paramContext, paramcl, (bi)localObject2, 2);
        break label472;
      }
      if (((bi)localObject2).dtw())
      {
        paramString = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Rn(((cy)localObject2).field_content);
        paramList = new aas();
        paramList.c(ag((bi)localObject2));
        if ((paramString != null) && (com.tencent.mm.model.t.kv(paramString.ufB)))
        {
          paramString = new aar();
          paramString.akZ(ah((bi)localObject2));
          paramString.LE(16);
          paramString.akI(((cy)localObject2).field_content);
          paramString.oY(true);
          paramString.oX(true);
          paramString.a(paramList);
          paramString.alc(a(paramList.whw));
          paramString.ald(b(paramList.whw));
          if (!ad.aox(paramList.whw.whU))
            break label2375;
          paramList = paramList.whw.whU;
          paramList = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramList));
          if (!bo.isNullOrNil(paramList))
            paramString.all(paramList);
        }
      }
      while (true)
      {
        paramcl.cvA.cvC.wiv.add(paramString);
        paramString = paramcl.cvA.cvD;
        paramString.wiX += 1;
        bool2 = true;
        break label472;
        if ((paramString != null) && (ad.aox(paramString.svN)))
        {
          paramString = ((com.tencent.mm.openim.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.openim.a.b.class)).a(paramString.xZm, "openim_card_type_name", b.a.geR);
          if (TextUtils.isEmpty(paramString));
          for (paramString = paramContext.getResources().getString(2131296949); ; paramString = String.format("[%s]", new Object[] { paramString }))
          {
            paramString = a((bi)localObject2, paramString, paramList);
            break;
          }
        }
        paramString = a((bi)localObject2, paramContext.getString(2131296949), paramList);
        continue;
        if (((bi)localObject2).bAA())
        {
          if (((bi)localObject2).dty())
          {
            paramcl.cvA.cvG = 2131299630;
            break label472;
          }
          bool2 = a(paramContext, paramcl, (bi)localObject2);
          break label472;
        }
        paramcl.cvA.cvG = 2131299630;
        bool2 = a(paramContext, paramcl, (bi)localObject2, 3);
        break label472;
        bool1 = false;
        break label425;
        if ((i != 0) && (paramcl.cvA.cvG > 0))
          paramcl.cvA.cvG = 0;
        AppMethodBeat.o(135626);
        break;
      }
    }
  }

  private static boolean a(cl paramcl, bi parambi)
  {
    AppMethodBeat.i(135632);
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
        AppMethodBeat.o(135632);
        bool = true;
        return bool;
      }
      catch (Exception parambi)
      {
        ab.e("MicroMsg.GetFavRecordDataSourceForRecordMsg", "parse failed, %s", new Object[] { parambi.getStackTrace().toString() });
      }
      paramcl.cvA.cvG = 2131299632;
      AppMethodBeat.o(135632);
      boolean bool = false;
    }
  }

  private static aat ag(bi parambi)
  {
    AppMethodBeat.i(135628);
    aat localaat = new aat();
    if (parambi == null)
    {
      AppMethodBeat.o(135628);
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
      AppMethodBeat.o(135628);
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
    AppMethodBeat.i(135631);
    if (parambi.field_isSend == 1)
      if ((com.tencent.mm.model.t.kH(parambi.field_talker)) || (parambi.field_talker.equals("filehelper")))
      {
        parambi = String.format("%d", new Object[] { Long.valueOf(parambi.field_msgSvrId) });
        AppMethodBeat.o(135631);
      }
    while (true)
    {
      return parambi;
      parambi = String.format("%s#%d", new Object[] { parambi.field_talker, Long.valueOf(parambi.field_msgSvrId) });
      AppMethodBeat.o(135631);
      continue;
      parambi = String.valueOf(parambi.field_msgSvrId);
      AppMethodBeat.o(135631);
    }
  }

  private static String b(aat paramaat)
  {
    AppMethodBeat.i(135630);
    paramaat = pJi.format(new Date(paramaat.createTime));
    AppMethodBeat.o(135630);
    return paramaat;
  }

  private static boolean b(cl paramcl, bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(135633);
    Object localObject1 = new aas();
    ((aas)localObject1).c(ag(parambi));
    aar localaar = new aar();
    localaar.akZ(ah(parambi));
    com.tencent.mm.modelvideo.o.all();
    localaar.akV(com.tencent.mm.modelvideo.t.uh(parambi.field_imgPath));
    com.tencent.mm.modelvideo.o.all();
    localaar.akW(com.tencent.mm.modelvideo.t.ui(parambi.field_imgPath));
    localaar.akR(com.tencent.mm.a.e.cv(localaar.wgx));
    if (parambi.bwt())
    {
      localaar.LE(15);
      localObject2 = u.ut(parambi.field_imgPath);
      if (localObject2 != null)
        break label158;
      ab.i("MicroMsg.GetFavRecordDataSourceForRecordMsg", "video info null");
      paramcl.cvA.cvG = 2131299621;
      AppMethodBeat.o(135633);
    }
    while (true)
    {
      return bool;
      localaar.LE(4);
      break;
      label158: ab.i("MicroMsg.GetFavRecordDataSourceForRecordMsg", "video length is %d", new Object[] { Integer.valueOf(((com.tencent.mm.modelvideo.s)localObject2).frO) });
      if (((com.tencent.mm.modelvideo.s)localObject2).frO > com.tencent.mm.m.b.Nc())
      {
        paramcl.cvA.cvG = 2131299756;
        AppMethodBeat.o(135633);
      }
      else
      {
        if ((!parambi.bwt()) || (!u.uv(((com.tencent.mm.modelvideo.s)localObject2).getFileName())))
          break label249;
        paramcl.cvA.cvG = 2131299621;
        AppMethodBeat.o(135633);
      }
    }
    label249: localaar.LD(((com.tencent.mm.modelvideo.s)localObject2).fXd);
    localaar.a((aas)localObject1);
    localaar.alc(a(((aas)localObject1).whw));
    localaar.ald(b(((aas)localObject1).whw));
    if (ad.aox(((aas)localObject1).whw.whU))
    {
      localObject1 = ((aas)localObject1).whw.whU;
      localObject1 = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO((String)localObject1));
      if (!bo.isNullOrNil((String)localObject1))
        localaar.all((String)localObject1);
    }
    localaar.mh(parambi.field_msgId);
    localaar.mf(((com.tencent.mm.modelvideo.s)localObject2).frO);
    Object localObject2 = br.z(((com.tencent.mm.modelvideo.s)localObject2).alw(), "msg");
    if (localObject2 != null)
    {
      localaar.akL((String)((Map)localObject2).get(".msg.videomsg.$cdnvideourl"));
      localaar.akM((String)((Map)localObject2).get(".msg.videomsg.$aeskey"));
    }
    while (true)
    {
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
      AppMethodBeat.o(135633);
      bool = true;
      break;
      ab.i("MicroMsg.GetFavRecordDataSourceForRecordMsg", "cdntra parse video recv xml failed");
    }
  }

  private static boolean c(cl paramcl, bi parambi)
  {
    AppMethodBeat.i(135637);
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
      ab.printErrStackTrace("MicroMsg.GetFavRecordDataSourceForRecordMsg", parambi, "", new Object[0]);
      ab.e("MicroMsg.GetFavRecordDataSourceForRecordMsg", "retransmit app msg error : %s", new Object[] { parambi.getLocalizedMessage() });
      paramcl.cvA.cvG = 2131299632;
      AppMethodBeat.o(135637);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (i == 0)
      {
        paramcl.cvA.cvG = 2131299630;
        AppMethodBeat.o(135637);
        bool = false;
      }
      else
      {
        AppMethodBeat.o(135637);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.b
 * JD-Core Version:    0.6.2
 */