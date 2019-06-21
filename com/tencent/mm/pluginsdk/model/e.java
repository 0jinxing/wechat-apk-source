package com.tencent.mm.pluginsdk.model;

import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.af.l;
import com.tencent.mm.af.p;
import com.tencent.mm.ah.i;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.b;
import com.tencent.mm.g.a.nt;
import com.tencent.mm.g.a.nt.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.modelvoice.n;
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
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class e
{
  public static String Kp(int paramInt)
  {
    String str;
    if (paramInt == 1)
      str = "speex";
    while (true)
    {
      return str;
      if (paramInt == 4)
        str = "silk";
      else
        str = "amr";
    }
  }

  private static aar a(aar paramaar, int paramInt)
  {
    AppMethodBeat.i(27268);
    aar localaar = p(paramaar);
    localaar.LE(paramInt);
    if ((paramaar.wgT != null) && (paramaar.wgT.whC != null))
    {
      abe localabe = new abe();
      localabe.alw(paramaar.wgT.whC.title);
      localabe.alx(paramaar.wgT.whC.desc);
      localabe.LK(paramaar.wgT.whC.type);
      localabe.alz(paramaar.wgT.whC.info);
      localabe.aly(paramaar.wgT.whC.thumbUrl);
      localaar.wgT.a(localabe);
    }
    AppMethodBeat.o(27268);
    return localaar;
  }

  private static aar a(bi parambi, j.b paramb, int paramInt)
  {
    AppMethodBeat.i(27251);
    aar localaar = new aar();
    a(localaar, parambi);
    localaar.akO(paramb.fgM);
    localaar.akP(paramb.fgN);
    localaar.akN(paramb.url);
    localaar.oX(true);
    parambi = new com.tencent.mm.vfs.b(bo.bc(com.tencent.mm.at.o.ahl().I(parambi.field_imgPath, true), ""));
    if (parambi.exists())
      localaar.akW(com.tencent.mm.vfs.j.w(parambi.dMD()));
    while (true)
    {
      localaar.akH(paramb.title);
      localaar.akI(paramb.description);
      localaar.alg(paramb.canvasPageXml);
      localaar.LE(paramInt);
      localaar.alf(paramb.cMn);
      AppMethodBeat.o(27251);
      return localaar;
      localaar.oY(true);
    }
  }

  private static void a(aar paramaar1, aar paramaar2)
  {
    AppMethodBeat.i(27257);
    paramaar1.akO(paramaar2.wgi);
    paramaar1.akP(paramaar2.wgk);
    paramaar1.akN(paramaar2.wgg);
    paramaar1.akH(paramaar2.title);
    paramaar1.akI(paramaar2.desc);
    AppMethodBeat.o(27257);
  }

  private static void a(aar paramaar, bi parambi)
  {
    AppMethodBeat.i(27247);
    if (parambi.field_isSend == 1)
      if ((com.tencent.mm.model.t.kH(parambi.field_talker)) || (parambi.field_talker.equals("filehelper")))
      {
        paramaar.akZ(String.valueOf(parambi.field_msgSvrId));
        AppMethodBeat.o(27247);
      }
    while (true)
    {
      return;
      paramaar.akZ(parambi.field_talker + "#" + String.valueOf(parambi.field_msgSvrId));
      AppMethodBeat.o(27247);
      continue;
      paramaar.akZ(String.valueOf(parambi.field_msgSvrId));
      AppMethodBeat.o(27247);
    }
  }

  public static boolean a(cl paramcl, int paramInt, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(27240);
    if ((paramcl == null) || (bo.isNullOrNil(paramString)))
    {
      ab.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
      if (paramcl != null)
        paramcl.cvA.cvG = 2131299622;
      AppMethodBeat.o(27240);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.GetFavDataSource", "do fill event info(fav simple image), path %s sourceType %d", new Object[] { paramString, Integer.valueOf(paramInt) });
      abf localabf = new abf();
      abl localabl = new abl();
      aar localaar = new aar();
      localaar.LE(2);
      localaar.akV(paramString);
      localaar.akU(com.tencent.mm.a.g.x((localaar.toString() + 2 + System.currentTimeMillis()).getBytes()));
      Object localObject = new gh();
      ((gh)localObject).cAH.type = 27;
      ((gh)localObject).cAH.cAJ = localaar;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      localObject = ((gh)localObject).cAI.thumbPath;
      d.c(paramString, 150, 150, Bitmap.CompressFormat.JPEG, 90, (String)localObject);
      localaar.akW((String)localObject);
      localabl.alD(r.Yz());
      localabl.alE(r.Yz());
      localabl.LN(paramInt);
      localabl.ml(bo.anU());
      localabf.a(localabl);
      localabf.wiv.add(localaar);
      paramcl.cvA.title = localaar.title;
      paramcl.cvA.cvC = localabf;
      paramcl.cvA.type = 2;
      AppMethodBeat.o(27240);
      bool = true;
    }
  }

  public static boolean a(cl paramcl, long paramLong)
  {
    AppMethodBeat.i(27241);
    boolean bool = d(paramcl, ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(paramLong));
    AppMethodBeat.o(27241);
    return bool;
  }

  public static boolean a(cl paramcl, Intent paramIntent)
  {
    boolean bool = false;
    AppMethodBeat.i(27237);
    if (paramcl == null)
    {
      ab.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null");
      AppMethodBeat.o(27237);
    }
    while (true)
    {
      return bool;
      double d1 = paramIntent.getDoubleExtra("kwebmap_slat", 0.0D);
      double d2 = paramIntent.getDoubleExtra("kwebmap_lng", 0.0D);
      int i = paramIntent.getIntExtra("kwebmap_scale", 0);
      Object localObject = bo.bc(paramIntent.getStringExtra("Kwebmap_locaion"), "");
      String str = paramIntent.getStringExtra("kPoiName");
      paramIntent.getCharSequenceExtra("kRemark");
      paramIntent.getStringArrayListExtra("kTags");
      paramIntent = new aay();
      paramIntent.alu((String)localObject);
      paramIntent.E(d1);
      paramIntent.D(d2);
      paramIntent.LJ(i);
      paramIntent.alv(str);
      localObject = new abf();
      abl localabl = new abl();
      str = r.Yz();
      localabl.alD(str);
      localabl.alE(str);
      localabl.LN(6);
      localabl.ml(bo.anU());
      ((abf)localObject).b(paramIntent);
      ((abf)localObject).a(localabl);
      paramcl.cvA.cvC = ((abf)localObject);
      paramcl.cvA.type = 6;
      bool = true;
      AppMethodBeat.o(27237);
    }
  }

  private static boolean a(cl paramcl, j.b paramb, abf paramabf, bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(27255);
    Object localObject = new nt();
    ((nt)localObject).cJY.type = 0;
    ((nt)localObject).cJY.cKa = paramb.fgU;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    com.tencent.mm.protocal.b.a.c localc = ((nt)localObject).cJZ.cKi;
    if (localc == null)
    {
      ab.w("MicroMsg.GetFavDataSource", "fill favorite event fail, parse record msg null");
      paramcl.cvA.cvG = 2131299632;
      AppMethodBeat.o(27255);
      return bool;
    }
    paramabf.alB(localc.title);
    Iterator localIterator = localc.fjr.iterator();
    int i = 0;
    label113: aar localaar;
    if (localIterator.hasNext())
    {
      localaar = (aar)localIterator.next();
      localObject = null;
      paramb = (j.b)localObject;
      switch (localaar.dataType)
      {
      default:
        paramb = (j.b)localObject;
      case 9:
      case 13:
      case 18:
        label243: if (paramb != null)
        {
          int j = i + 1;
          paramb.akZ(e(parambi, i));
          paramabf.wiv.add(paramb);
          i = j;
        }
        break;
      case 3:
      case 1:
      case 2:
      case 5:
      case 4:
      case 15:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
      case 12:
      case 14:
      case 16:
      case 17:
      case 19:
      case 20:
      }
    }
    while (true)
    {
      break label113;
      paramb = i(localaar, parambi.field_msgId);
      localObject = paramcl.cvA.cvD;
      ((abt)localObject).wiM += 1;
      break label243;
      paramb = q(localaar);
      localObject = paramcl.cvA.cvD;
      ((abt)localObject).wiK += 1;
      break label243;
      paramb = j(localaar, parambi.field_msgId);
      localObject = paramcl.cvA.cvD;
      ((abt)localObject).wiL += 1;
      break label243;
      paramb = k(localaar, parambi.field_msgId);
      localObject = paramcl.cvA.cvD;
      ((abt)localObject).wiO += 1;
      break label243;
      paramb = l(localaar, parambi.field_msgId);
      localObject = paramcl.cvA.cvD;
      ((abt)localObject).wiN += 1;
      break label243;
      paramb = r(localaar);
      localObject = paramcl.cvA.cvD;
      ((abt)localObject).wiP += 1;
      break label243;
      paramb = m(localaar, parambi.field_msgId);
      localObject = paramcl.cvA.cvD;
      ((abt)localObject).wiQ += 1;
      break label243;
      paramb = n(localaar, parambi.field_msgId);
      localObject = paramcl.cvA.cvD;
      ((abt)localObject).fileCount += 1;
      break label243;
      paramb = a(localaar, localaar.dataType);
      localObject = paramcl.cvA.cvD;
      ((abt)localObject).wiS += 1;
      break label243;
      paramb = a(localaar, localaar.dataType);
      localObject = paramcl.cvA.cvD;
      ((abt)localObject).wiT += 1;
      break label243;
      paramb = t(localaar);
      localObject = paramcl.cvA.cvD;
      ((abt)localObject).wiW += 1;
      break label243;
      paramb = u(localaar);
      localObject = paramcl.cvA.cvD;
      ((abt)localObject).wiX += 1;
      break label243;
      paramb = s(localaar);
      break label243;
      paramb = o(localaar, parambi.field_msgId);
      break label243;
      paramb = v(localaar);
      break label243;
      if ((!bo.isNullOrNil(((aar)localc.fjr.get(0)).wgo)) && (((aar)localc.fjr.get(0)).wgo.equals(".htm")));
      for (paramcl.cvA.type = 18; ; paramcl.cvA.type = 14)
      {
        bool = true;
        AppMethodBeat.o(27255);
        break;
      }
    }
  }

  private static boolean a(cl paramcl, bi parambi)
  {
    AppMethodBeat.i(27246);
    abf localabf = new abf();
    localabf.a(ak(parambi));
    Map localMap = br.z(parambi.field_content, "msg");
    if (localMap != null);
    while (true)
    {
      try
      {
        parambi = new com/tencent/mm/protocal/protobuf/aay;
        parambi.<init>();
        parambi.alu((String)localMap.get(".msg.location.$label"));
        parambi.E(Double.parseDouble((String)localMap.get(".msg.location.$x")));
        parambi.D(Double.parseDouble((String)localMap.get(".msg.location.$y")));
        parambi.LJ(Integer.valueOf((String)localMap.get(".msg.location.$scale")).intValue());
        parambi.alv((String)localMap.get(".msg.location.$poiname"));
        localabf.b(parambi);
        paramcl.cvA.type = 6;
        paramcl.cvA.cvC = localabf;
        AppMethodBeat.o(27246);
        bool = true;
        return bool;
      }
      catch (Exception parambi)
      {
        ab.e("MicroMsg.GetFavDataSource", "parse failed, %s", new Object[] { parambi.getStackTrace().toString() });
      }
      paramcl.cvA.cvG = 2131299632;
      AppMethodBeat.o(27246);
      boolean bool = false;
    }
  }

  public static boolean a(cl paramcl, String paramString1, String paramString2, String paramString3)
  {
    boolean bool = false;
    AppMethodBeat.i(27238);
    if (bo.isNullOrNil(paramString1))
    {
      ab.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
      paramcl.cvA.cvG = 2131299622;
      AppMethodBeat.o(27238);
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.GetFavDataSource", "do fill event info(fav simple file), title %s, desc %s, path %s, sourceType %d", new Object[] { paramString2, paramString3, paramString1, Integer.valueOf(13) });
      if (new com.tencent.mm.vfs.b(paramString1).length() > com.tencent.mm.m.b.Nc())
      {
        paramcl.cvA.cvG = 2131299756;
        AppMethodBeat.o(27238);
      }
      else
      {
        abf localabf = new abf();
        abl localabl = new abl();
        aar localaar = new aar();
        localaar.akV(paramString1);
        localaar.LE(8);
        localaar.akR(com.tencent.mm.vfs.e.cv(paramString1));
        localaar.oY(true);
        localaar.akH(paramString2);
        localaar.akI(paramString3);
        localabl.alD(r.Yz());
        localabl.alE(r.Yz());
        localabl.LN(13);
        localabl.ml(bo.anU());
        localabf.a(localabl);
        localabf.wiv.add(localaar);
        paramcl.cvA.title = localaar.title;
        paramcl.cvA.desc = localaar.title;
        paramcl.cvA.cvC = localabf;
        paramcl.cvA.type = 8;
        AppMethodBeat.o(27238);
        bool = true;
      }
    }
  }

  private static String aiy(String paramString)
  {
    AppMethodBeat.i(27249);
    paramString = com.tencent.mm.sdk.platformtools.j.b(com.tencent.mm.plugin.record.b.XZ(), "recbiz_", paramString, ".rec", 2);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(27249);
    }
    while (true)
    {
      return paramString;
      if (new com.tencent.mm.vfs.b(paramString).exists())
        AppMethodBeat.o(27249);
      else
        AppMethodBeat.o(27249);
    }
  }

  private static abl ak(bi parambi)
  {
    AppMethodBeat.i(27243);
    abl localabl = new abl();
    if (parambi.field_isSend == 1)
    {
      localabl.alD(r.Yz());
      localabl.alE(parambi.field_talker);
      if (com.tencent.mm.model.t.kH(parambi.field_talker))
        localabl.alG(localabl.cEV);
    }
    do
    {
      localabl.LN(1);
      localabl.ml(parambi.field_createTime);
      localabl.alH(parambi.field_msgSvrId);
      if (parambi.field_msgSvrId > 0L)
        localabl.alF(parambi.field_msgSvrId);
      AppMethodBeat.o(27243);
      return localabl;
      localabl.alD(parambi.field_talker);
      localabl.alE(r.Yz());
    }
    while (!com.tencent.mm.model.t.kH(parambi.field_talker));
    if (parambi.field_content != null);
    for (String str = parambi.field_content.substring(0, Math.max(0, parambi.field_content.indexOf(':'))); ; str = "")
    {
      localabl.alG(str);
      if ((bo.isNullOrNil(localabl.whU)) || (parambi.drD()))
        break;
      parambi.setContent(parambi.field_content.substring(localabl.whU.length() + 1));
      if ((parambi.field_content.length() > 0) && ('\n' == parambi.field_content.charAt(0)))
        parambi.setContent(parambi.field_content.substring(1));
      if (!parambi.dtF())
        break;
      parambi.jx(parambi.field_transContent.substring(localabl.whU.length() + 1));
      if ((parambi.field_transContent.length() <= 0) || ('\n' != parambi.field_transContent.charAt(0)))
        break;
      parambi.jx(parambi.field_transContent.substring(1));
      break;
    }
  }

  public static boolean b(cl paramcl, String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(27239);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
      paramcl.cvA.cvG = 2131299622;
      AppMethodBeat.o(27239);
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.GetFavDataSource", "do fill event info(fav simple text), %s, sourceType %d", new Object[] { paramString, Integer.valueOf(paramInt) });
      abf localabf = new abf();
      abl localabl = new abl();
      localabl.alD(r.Yz());
      localabl.alE(r.Yz());
      localabl.LN(paramInt);
      localabl.ml(bo.anU());
      localabf.a(localabl);
      paramcl.cvA.desc = paramString;
      paramcl.cvA.cvC = localabf;
      paramcl.cvA.type = 1;
      AppMethodBeat.o(27239);
      bool = true;
    }
  }

  private static boolean c(cl paramcl, bi parambi)
  {
    AppMethodBeat.i(27253);
    abf localabf = new abf();
    Object localObject1 = ak(parambi);
    localabf.a((abl)localObject1);
    try
    {
      Object localObject2 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).b(parambi.field_msgId, parambi.field_content);
      Object localObject3 = ((com.tencent.mm.af.o)localObject2).fjr;
      ((abl)localObject1).alL(((com.tencent.mm.af.o)localObject2).cMg);
      if ((localObject3 != null) && (((List)localObject3).size() > paramcl.cvA.cvE))
      {
        ab.i("MicroMsg.GetFavDataSource", "favorite biz msg, index is %d", new Object[] { Integer.valueOf(paramcl.cvA.cvE) });
        localObject3 = (p)((List)localObject3).get(paramcl.cvA.cvE);
        if (l.mg(((p)localObject3).fjC))
        {
          paramcl.cvA.cvG = 2131299630;
          AppMethodBeat.o(27253);
          bool = false;
          return bool;
        }
        ((abl)localObject1).alK(((p)localObject3).url);
        if (paramcl.cvA.cvE > 0)
          ((abl)localObject1).alF("");
        localObject2 = new com/tencent/mm/protocal/protobuf/aar;
        ((aar)localObject2).<init>();
        ((aar)localObject2).akH(((p)localObject3).title);
        ((aar)localObject2).akI(((p)localObject3).fjz);
        a((aar)localObject2, parambi);
        localObject1 = l.a((p)localObject3);
        if (!bo.isNullOrNil((String)localObject1))
          break label504;
        com.tencent.mm.ah.h localh = com.tencent.mm.ah.o.act().qo(parambi.field_talker);
        if (localh == null)
          break label504;
        localObject1 = localh.ack();
        if (!bo.isNullOrNil((String)localObject1))
        {
          int i = parambi.getType();
          if (paramcl.cvA.cvE > 0)
          {
            parambi = "@S";
            label293: ((aar)localObject2).akW(q.v((String)localObject1, i, parambi));
            ((aar)localObject2).oY(false);
            if ((bo.isNullOrNil(((aar)localObject2).wgz)) || (!com.tencent.mm.vfs.e.ct(((aar)localObject2).wgz)))
            {
              ((aar)localObject2).akQ((String)localObject1);
              ((aar)localObject2).oY(true);
              parambi = new com/tencent/mm/protocal/protobuf/abu;
              parambi.<init>();
              parambi.alT((String)localObject1);
              localabf.b(parambi);
            }
          }
        }
        while (true)
        {
          ((aar)localObject2).oX(true);
          ((aar)localObject2).LE(5);
          localabf.wiv.add(localObject2);
          paramcl.cvA.cvC = localabf;
          paramcl.cvA.desc = ((p)localObject3).title;
          paramcl.cvA.type = 5;
          AppMethodBeat.o(27253);
          bool = true;
          break;
          parambi = "@T";
          break label293;
          ((aar)localObject2).oY(true);
        }
      }
    }
    catch (Exception parambi)
    {
      label504: 
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.GetFavDataSource", parambi, "", new Object[0]);
        ab.e("MicroMsg.GetFavDataSource", "retransmit app msg error : %s", new Object[] { parambi.getLocalizedMessage() });
        paramcl.cvA.cvG = 2131299632;
        AppMethodBeat.o(27253);
        boolean bool = false;
      }
    }
  }

  public static boolean d(cl paramcl, bi parambi)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(27242);
    if ((paramcl == null) || (parambi == null))
    {
      ab.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event or msg is null");
      if (paramcl != null)
        paramcl.cvA.cvG = 2131299622;
      AppMethodBeat.o(27242);
      return bool2;
    }
    parambi = bi.ar(parambi);
    if (parambi.isText())
      bool2 = e(paramcl, parambi);
    while (true)
    {
      paramcl.cvA.cvq = parambi.field_content;
      if ((bool2) || (paramcl.cvA.cvG == 0))
        com.tencent.mm.plugin.fav.ui.c.a(parambi, paramcl, bool2);
      AppMethodBeat.o(27242);
      break;
      if (parambi.drD())
      {
        bool2 = g(paramcl, parambi);
      }
      else if (parambi.bAC())
      {
        bool2 = a(paramcl, parambi);
      }
      else if (parambi.drE())
      {
        bool2 = f(paramcl, parambi);
      }
      else if ((parambi.bws()) || (parambi.bwt()))
      {
        bool2 = h(paramcl, parambi);
      }
      else if (parambi.drC())
      {
        bool2 = c(paramcl, parambi);
      }
      else
      {
        if (parambi.dtw());
        while ((!parambi.bAA()) || (parambi.dty()))
        {
          paramcl.cvA.cvG = 2131299630;
          bool2 = bool1;
          break;
        }
        bool2 = i(paramcl, parambi);
      }
    }
  }

  private static String e(bi parambi, int paramInt)
  {
    AppMethodBeat.i(27254);
    if (parambi.field_isSend == 1)
      if ((com.tencent.mm.model.t.kH(parambi.field_talker)) || (parambi.field_talker.equals("filehelper")))
      {
        parambi = String.format("%d$%d", new Object[] { Long.valueOf(parambi.field_msgSvrId), Integer.valueOf(paramInt) });
        AppMethodBeat.o(27254);
      }
    while (true)
    {
      return parambi;
      parambi = String.format("%s#%d$%d", new Object[] { parambi.field_talker, Long.valueOf(parambi.field_msgSvrId), Integer.valueOf(paramInt) });
      AppMethodBeat.o(27254);
      continue;
      parambi = String.format("%d$%d", new Object[] { Long.valueOf(parambi.field_msgSvrId), Integer.valueOf(paramInt) });
      AppMethodBeat.o(27254);
    }
  }

  private static boolean e(cl paramcl, bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(27244);
    abf localabf = new abf();
    localabf.a(ak(parambi));
    paramcl.cvA.cvC = localabf;
    paramcl.cvA.desc = parambi.field_content;
    paramcl.cvA.type = 1;
    if (com.tencent.mm.ui.tools.f.asg(paramcl.cvA.desc) > com.tencent.mm.m.b.MY())
    {
      paramcl.cvA.cvG = 2131299754;
      bool = false;
      AppMethodBeat.o(27244);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(27244);
    }
  }

  private static boolean f(cl paramcl, bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(27245);
    Object localObject1 = null;
    if (parambi.field_msgId > 0L)
      localObject1 = com.tencent.mm.at.o.ahl().fJ(parambi.field_msgId);
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
    if (localObject2 == null)
    {
      ab.w("MicroMsg.GetFavDataSource", "getImgDataPath: try get imgInfo fail");
      paramcl.cvA.cvG = 2131299628;
      bool = false;
      AppMethodBeat.o(27245);
    }
    while (true)
    {
      return bool;
      abf localabf = new abf();
      localabf.a(ak(parambi));
      localObject1 = new aar();
      a((aar)localObject1, parambi);
      ((aar)localObject1).LE(2);
      ((aar)localObject1).akV(com.tencent.mm.at.o.ahl().q(com.tencent.mm.at.f.c((com.tencent.mm.at.e)localObject2), "", ""));
      if (((com.tencent.mm.at.e)localObject2).agQ())
      {
        localObject2 = com.tencent.mm.at.o.ahl().ly(((com.tencent.mm.at.e)localObject2).fDJ);
        if (((com.tencent.mm.at.e)localObject2).frO > ((com.tencent.mm.at.e)localObject2).offset)
          ((aar)localObject1).akV(com.tencent.mm.at.o.ahl().q("SERVERID://" + parambi.field_msgSvrId, "", ""));
      }
      ((aar)localObject1).akW(com.tencent.mm.at.o.ahl().I(parambi.field_imgPath, true));
      parambi = new LinkedList();
      parambi.add(localObject1);
      localabf.aE(parambi);
      paramcl.cvA.cvC = localabf;
      paramcl.cvA.type = 2;
      AppMethodBeat.o(27245);
    }
  }

  private static boolean g(cl paramcl, bi parambi)
  {
    boolean bool = true;
    AppMethodBeat.i(27248);
    abf localabf = new abf();
    localabf.a(ak(parambi));
    aar localaar = new aar();
    a(localaar, parambi);
    com.tencent.mm.modelvoice.b localb;
    if (com.tencent.mm.model.t.nv(parambi.field_talker))
    {
      localaar.akV(aiy(parambi.field_imgPath));
      localaar.LE(3);
      localaar.oY(true);
      localb = com.tencent.mm.modelvoice.q.uN(parambi.field_imgPath);
      if (localb != null)
        break label117;
      bool = false;
      AppMethodBeat.o(27248);
    }
    while (true)
    {
      return bool;
      localaar.akV(com.tencent.mm.modelvoice.q.getFullPath(parambi.field_imgPath));
      break;
      label117: localaar.akR(Kp(localb.getFormat()));
      localaar.LD((int)new n(parambi.field_content).time);
      parambi = new LinkedList();
      parambi.add(localaar);
      localabf.aE(parambi);
      paramcl.cvA.cvC = localabf;
      paramcl.cvA.type = 3;
      AppMethodBeat.o(27248);
    }
  }

  private static boolean h(cl paramcl, bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(27250);
    abf localabf = new abf();
    localabf.a(ak(parambi));
    aar localaar = new aar();
    a(localaar, parambi);
    com.tencent.mm.modelvideo.o.all();
    localaar.akW(com.tencent.mm.modelvideo.t.ui(parambi.field_imgPath));
    localaar.akR(com.tencent.mm.vfs.e.cv(localaar.wgx));
    Object localObject = u.ut(parambi.field_imgPath);
    if (localObject == null)
    {
      ab.w("MicroMsg.GetFavDataSource", "[doFileFavVideoEventInfo] null == info");
      paramcl.cvA.cvG = 2131299621;
      AppMethodBeat.o(27250);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.GetFavDataSource", "video length is %d", new Object[] { Integer.valueOf(((s)localObject).frO) });
      if (((s)localObject).frO > com.tencent.mm.m.b.Nc())
      {
        paramcl.cvA.cvG = 2131299756;
        AppMethodBeat.o(27250);
      }
      else
      {
        if ((!parambi.bwt()) || (!u.uv(((s)localObject).getFileName())))
          break;
        paramcl.cvA.cvG = 2131299621;
        AppMethodBeat.o(27250);
      }
    }
    if (((s)localObject).alz())
    {
      com.tencent.mm.modelvideo.o.all();
      String str = com.tencent.mm.modelvideo.t.uh(parambi.field_imgPath);
      ab.i("MicroMsg.GetFavDataSource", "this video had finish download, set orgn path [%s]", new Object[] { str });
      localaar.akV(str);
      label247: localaar.LD(((s)localObject).fXd);
      localObject = new LinkedList();
      ((LinkedList)localObject).add(localaar);
      localabf.aE((LinkedList)localObject);
      paramcl.cvA.cvC = localabf;
      if (!parambi.bwt())
        break label460;
      paramcl.cvA.type = 16;
      localaar.LE(15);
    }
    while (true)
    {
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
      AppMethodBeat.o(27250);
      bool = true;
      break;
      ab.i("MicroMsg.GetFavDataSource", "this video had not finish download, set orgn path null");
      localaar.akV("");
      break label247;
      label460: paramcl.cvA.type = 4;
      localaar.LE(4);
    }
  }

  private static aar i(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(27259);
    aar localaar = p(paramaar);
    localaar.LE(3);
    if (!bo.isNullOrNil(paramaar.whb))
    {
      nt localnt = new nt();
      localnt.cJY.type = 1;
      localnt.cJY.cAv = paramaar;
      localnt.cJY.cvx = paramLong;
      com.tencent.mm.sdk.b.a.xxA.m(localnt);
      if ((bo.isNullOrNil(localnt.cJZ.dataPath)) && (bo.isNullOrNil(localnt.cJZ.thumbPath)))
        ab.e("MicroMsg.GetFavDataSource", "cloneImgItem:not record plugin ? get paths error");
      localaar.akV(localnt.cJZ.dataPath);
      localaar.LD(paramaar.duration);
      localaar.oY(true);
      localaar.oX(false);
      localaar.akR(paramaar.wgo);
    }
    AppMethodBeat.o(27259);
    return localaar;
  }

  private static boolean i(cl paramcl, bi parambi)
  {
    boolean bool = false;
    AppMethodBeat.i(27252);
    abf localabf = new abf();
    localabf.a(ak(parambi));
    Object localObject1 = parambi.field_content;
    if (localObject1 == null)
    {
      paramcl.cvA.cvG = 2131299632;
      AppMethodBeat.o(27252);
    }
    while (true)
    {
      return bool;
      localObject1 = j.b.me((String)localObject1);
      if (localObject1 == null)
      {
        paramcl.cvA.cvG = 2131299632;
        AppMethodBeat.o(27252);
      }
      else
      {
        paramcl.cvA.cvC = localabf;
        Object localObject2 = localabf.wit;
        ((abl)localObject2).alJ(((j.b)localObject1).appId);
        ((abl)localObject2).alL(((j.b)localObject1).cMg);
        Object localObject3;
        switch (((j.b)localObject1).type)
        {
        default:
          paramcl.cvA.cvG = 2131299630;
          AppMethodBeat.o(27252);
          break;
        case 1:
          paramcl.cvA.cvC = localabf;
          paramcl.cvA.desc = ((j.b)localObject1).title;
          paramcl.cvA.type = 1;
          AppMethodBeat.o(27252);
          bool = true;
          break;
        case 2:
          if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
          {
            paramcl.cvA.cvG = 2131299638;
            AppMethodBeat.o(27252);
          }
          else
          {
            localObject3 = com.tencent.mm.plugin.s.a.aUq().aiE(((j.b)localObject1).csD);
            localObject2 = new aar();
            a((aar)localObject2, parambi);
            if (localObject3 != null)
              ((aar)localObject2).akV(((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath);
            parambi = com.tencent.mm.at.o.ahl().I(parambi.field_imgPath, true);
            if (com.tencent.mm.vfs.e.ct(parambi))
              ((aar)localObject2).akW(parambi);
            ((aar)localObject2).LE(2);
            ((aar)localObject2).akH(((j.b)localObject1).title);
            ((aar)localObject2).akI(((j.b)localObject1).description);
            localabf.wiv.add(localObject2);
            paramcl.cvA.type = 2;
            AppMethodBeat.o(27252);
            bool = true;
          }
          break;
        case 3:
          parambi = a(parambi, (j.b)localObject1, 7);
          localabf.wiv.add(parambi);
          paramcl.cvA.type = 7;
          AppMethodBeat.o(27252);
          bool = true;
          break;
        case 4:
          parambi = a(parambi, (j.b)localObject1, 4);
          localabf.alB(parambi.title);
          localabf.alC(parambi.desc);
          localabf.wiv.add(parambi);
          paramcl.cvA.type = 4;
          AppMethodBeat.o(27252);
          bool = true;
          break;
        case 5:
          if ((((j.b)localObject1).url != null) && (!((j.b)localObject1).url.equals("")))
          {
            localabf.wit.alK(((j.b)localObject1).url);
            if (!bo.isNullOrNil(((j.b)localObject1).thumburl))
            {
              localObject2 = new abu();
              ((abu)localObject2).alT(((j.b)localObject1).thumburl);
              localabf.b((abu)localObject2);
            }
            parambi = a(parambi, (j.b)localObject1, 5);
            localabf.wiv.add(parambi);
            localabf.alB(parambi.title);
            localabf.alC(parambi.desc);
            paramcl.cvA.type = 5;
            AppMethodBeat.o(27252);
            bool = true;
          }
          else
          {
            paramcl.cvA.cvG = 2131299626;
            AppMethodBeat.o(27252);
          }
          break;
        case 6:
          if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
          {
            paramcl.cvA.cvG = 2131299638;
            AppMethodBeat.o(27252);
          }
          else
          {
            localObject3 = com.tencent.mm.plugin.s.a.aUq().aiE(((j.b)localObject1).csD);
            localObject2 = new aar();
            if (localObject3 != null)
              ((aar)localObject2).akV(((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath);
            a((aar)localObject2, parambi);
            ((aar)localObject2).LE(8);
            ((aar)localObject2).akR(((j.b)localObject1).fgp);
            parambi = com.tencent.mm.at.o.ahl().I(parambi.field_imgPath, true);
            if (bo.isNullOrNil(parambi))
              ((aar)localObject2).oY(true);
            if (com.tencent.mm.vfs.e.ct(parambi))
              ((aar)localObject2).akW(parambi);
            ((aar)localObject2).akH(((j.b)localObject1).title);
            ((aar)localObject2).akI(((j.b)localObject1).description);
            localabf.wiv.add(localObject2);
            paramcl.cvA.desc = ((j.b)localObject1).title;
            paramcl.cvA.type = 8;
            AppMethodBeat.o(27252);
            bool = true;
          }
          break;
        case 7:
          if ((((j.b)localObject1).csD == null) || (((j.b)localObject1).csD.length() == 0))
            paramcl.cvA.cvG = 2131299623;
          while (com.tencent.mm.kernel.g.RP().isSDCardAvailable())
          {
            paramcl.cvA.cvG = 2131299630;
            AppMethodBeat.o(27252);
            break;
          }
          paramcl.cvA.cvG = 2131299638;
          AppMethodBeat.o(27252);
          break;
        case 10:
          parambi = new abe();
          parambi.alw(((j.b)localObject1).title);
          parambi.alx(((j.b)localObject1).description);
          parambi.LK(((j.b)localObject1).fgP);
          parambi.alz(((j.b)localObject1).fgQ);
          parambi.aly(((j.b)localObject1).thumburl);
          paramcl.cvA.title = ((j.b)localObject1).title;
          paramcl.cvA.desc = ((j.b)localObject1).description;
          paramcl.cvA.type = 10;
          localabf.b(parambi);
          AppMethodBeat.o(27252);
          bool = true;
          break;
        case 20:
          parambi = new abo();
          parambi.alM(((j.b)localObject1).title);
          parambi.alN(((j.b)localObject1).description);
          parambi.alP(((j.b)localObject1).fgT);
          parambi.alO(((j.b)localObject1).thumburl);
          paramcl.cvA.title = ((j.b)localObject1).title;
          paramcl.cvA.desc = ((j.b)localObject1).description;
          paramcl.cvA.type = 15;
          localabf.b(parambi);
          AppMethodBeat.o(27252);
          bool = true;
          break;
        case 13:
          parambi = new abe();
          parambi.alw(((j.b)localObject1).title);
          parambi.alx(((j.b)localObject1).description);
          parambi.LK(((j.b)localObject1).fgV);
          parambi.alz(((j.b)localObject1).fgW);
          parambi.aly(((j.b)localObject1).thumburl);
          paramcl.cvA.title = ((j.b)localObject1).title;
          paramcl.cvA.desc = ((j.b)localObject1).description;
          paramcl.cvA.type = 11;
          localabf.b(parambi);
          AppMethodBeat.o(27252);
          bool = true;
          break;
        case 19:
        case 24:
          paramcl.cvA.cvD = new abt();
          bool = a(paramcl, (j.b)localObject1, localabf, parambi);
          AppMethodBeat.o(27252);
          break;
        case 33:
        case 36:
          localObject2 = new aap();
          ((aap)localObject2).username = ((j.b)localObject1).fiP;
          ((aap)localObject2).appId = ((j.b)localObject1).fiQ;
          ((aap)localObject2).cBc = ((j.b)localObject1).fiT;
          ((aap)localObject2).iconUrl = ((j.b)localObject1).fjb;
          ((aap)localObject2).csu = ((j.b)localObject1).fiO;
          ((aap)localObject2).wfO = ((j.b)localObject1).cMh;
          localObject3 = new aar();
          a((aar)localObject3, parambi);
          ((aar)localObject3).LE(19);
          parambi = com.tencent.mm.at.o.ahl().I(parambi.field_imgPath, true);
          if (bo.isNullOrNil(parambi))
            ((aar)localObject3).oY(true);
          if (com.tencent.mm.vfs.e.ct(parambi))
            ((aar)localObject3).akW(parambi);
          ((aar)localObject3).akH(((j.b)localObject1).title);
          ((aar)localObject3).akI(((j.b)localObject1).description);
          localabf.wiv.add(localObject3);
          paramcl.cvA.title = ((j.b)localObject1).title;
          paramcl.cvA.desc = ((j.b)localObject1).description;
          paramcl.cvA.type = 19;
          localabf.b((aap)localObject2);
          AppMethodBeat.o(27252);
          bool = true;
        }
      }
    }
  }

  private static aar j(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(27260);
    aar localaar = p(paramaar);
    localaar.LE(2);
    nt localnt = new nt();
    localnt.cJY.type = 1;
    localnt.cJY.cAv = paramaar;
    localnt.cJY.cvx = paramLong;
    com.tencent.mm.sdk.b.a.xxA.m(localnt);
    if ((bo.isNullOrNil(localnt.cJZ.dataPath)) && (bo.isNullOrNil(localnt.cJZ.thumbPath)))
      ab.e("MicroMsg.GetFavDataSource", "cloneImgItem:not record plugin ? get paths error");
    localaar.akV(localnt.cJZ.dataPath);
    localaar.akW(localnt.cJZ.thumbPath);
    localaar.oY(false);
    localaar.oX(false);
    AppMethodBeat.o(27260);
    return localaar;
  }

  private static aar k(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(27261);
    aar localaar = p(paramaar);
    a(localaar, paramaar);
    localaar.LE(5);
    Object localObject = new nt();
    ((nt)localObject).cJY.type = 1;
    ((nt)localObject).cJY.cAv = paramaar;
    ((nt)localObject).cJY.cvx = paramLong;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    if ((bo.isNullOrNil(((nt)localObject).cJZ.dataPath)) && (bo.isNullOrNil(((nt)localObject).cJZ.thumbPath)))
      ab.e("MicroMsg.GetFavDataSource", "cloneUrlItem:not record plugin ? get paths error");
    localaar.akW(((nt)localObject).cJZ.thumbPath);
    localaar.oY(false);
    if ((paramaar.wgT != null) && (paramaar.wgT.whA != null))
    {
      localObject = new abu();
      ((abu)localObject).alQ(paramaar.wgT.whA.title);
      ((abu)localObject).alR(paramaar.wgT.whA.desc);
      ((abu)localObject).alT(paramaar.wgT.whA.thumbUrl);
      ((abu)localObject).LO(paramaar.wgT.whA.wja);
      ((abu)localObject).alS(paramaar.wgT.whA.wiY);
      localaar.wgT.a((abu)localObject);
    }
    AppMethodBeat.o(27261);
    return localaar;
  }

  private static aar l(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(27262);
    aar localaar = p(paramaar);
    a(localaar, paramaar);
    if (paramaar.dataType == 15)
      localaar.LE(15);
    while (true)
    {
      nt localnt = new nt();
      localnt.cJY.type = 1;
      localnt.cJY.cAv = paramaar;
      localnt.cJY.cvx = paramLong;
      com.tencent.mm.sdk.b.a.xxA.m(localnt);
      if ((bo.isNullOrNil(localnt.cJZ.dataPath)) && (bo.isNullOrNil(localnt.cJZ.thumbPath)))
        ab.e("MicroMsg.GetFavDataSource", "cloneVideoItem:not record plugin ? get paths error");
      localaar.oX(false);
      localaar.akV(localnt.cJZ.dataPath);
      localaar.oY(false);
      localaar.akW(localnt.cJZ.thumbPath);
      localaar.LD(paramaar.duration);
      AppMethodBeat.o(27262);
      return localaar;
      localaar.LE(4);
    }
  }

  private static aar m(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(27264);
    aar localaar = p(paramaar);
    a(localaar, paramaar);
    localaar.LE(7);
    nt localnt = new nt();
    localnt.cJY.type = 1;
    localnt.cJY.cAv = paramaar;
    localnt.cJY.cvx = paramLong;
    com.tencent.mm.sdk.b.a.xxA.m(localnt);
    if ((bo.isNullOrNil(localnt.cJZ.dataPath)) && (bo.isNullOrNil(localnt.cJZ.thumbPath)))
      ab.e("MicroMsg.GetFavDataSource", "cloneMusicItem:not record plugin ? get paths error");
    localaar.akW(localnt.cJZ.thumbPath);
    localaar.oY(false);
    AppMethodBeat.o(27264);
    return localaar;
  }

  private static aar n(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(27265);
    aar localaar = p(paramaar);
    a(localaar, paramaar);
    localaar.LE(8);
    nt localnt = new nt();
    localnt.cJY.type = 1;
    localnt.cJY.cAv = paramaar;
    localnt.cJY.cvx = paramLong;
    com.tencent.mm.sdk.b.a.xxA.m(localnt);
    if ((bo.isNullOrNil(localnt.cJZ.dataPath)) && (bo.isNullOrNil(localnt.cJZ.thumbPath)))
      ab.e("MicroMsg.GetFavDataSource", "cloneFileItem:not record plugin ? get paths error");
    localaar.akV(localnt.cJZ.dataPath);
    localaar.akW(localnt.cJZ.thumbPath);
    localaar.oX(false);
    localaar.akR(paramaar.wgo);
    AppMethodBeat.o(27265);
    return localaar;
  }

  private static aar o(aar paramaar, long paramLong)
  {
    AppMethodBeat.i(27267);
    aar localaar = p(paramaar);
    localaar.akH(paramaar.title);
    localaar.akI(paramaar.desc);
    localaar.LE(19);
    Object localObject = new nt();
    ((nt)localObject).cJY.type = 1;
    ((nt)localObject).cJY.cAv = paramaar;
    ((nt)localObject).cJY.cvx = paramLong;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    if (bo.isNullOrNil(((nt)localObject).cJZ.thumbPath))
      ab.e("MicroMsg.GetFavDataSource", "cloneAppBrandItem:not record plugin ? get paths error");
    while (true)
    {
      if ((paramaar.wgT != null) && (paramaar.wgT.whN != null))
      {
        localObject = new aap();
        ((aap)localObject).username = paramaar.wgT.whN.username;
        ((aap)localObject).appId = paramaar.wgT.whN.appId;
        ((aap)localObject).cBc = paramaar.wgT.whN.cBc;
        ((aap)localObject).iconUrl = paramaar.wgT.whN.iconUrl;
        ((aap)localObject).type = paramaar.wgT.whN.type;
        ((aap)localObject).csu = paramaar.wgT.whN.csu;
        ((aap)localObject).wfO = paramaar.wgT.whN.wfO;
        localaar.wgT.a((aap)localObject);
      }
      AppMethodBeat.o(27267);
      return localaar;
      localaar.oY(false);
      localaar.akW(((nt)localObject).cJZ.thumbPath);
    }
  }

  private static aar p(aar paramaar)
  {
    AppMethodBeat.i(27256);
    aar localaar = new aar();
    aas localaas = new aas();
    aat localaat1 = new aat();
    aat localaat2 = paramaar.wgT.whw;
    if (localaat2.whQ)
      localaat1.alm(localaat2.cEV);
    if (localaat2.whR)
      localaat1.aln(localaat2.toUser);
    if (localaat2.whV)
      localaat1.alp(localaat2.whU);
    localaat1.LI(1);
    localaat1.mi(bo.anU());
    localaas.c(localaat1);
    localaar.a(localaas);
    localaar.alc(paramaar.wgV);
    localaar.ald(paramaar.wgX);
    localaar.all(paramaar.whu);
    localaar.oY(true);
    localaar.oX(true);
    localaar.ale(paramaar.whb);
    localaar.LG(paramaar.whh);
    localaar.akS(paramaar.wgq);
    localaar.akT(paramaar.wgs);
    localaar.mf(paramaar.wgu);
    localaar.akX(paramaar.wgB);
    localaar.akY(paramaar.wgD);
    localaar.mg(paramaar.wgF);
    AppMethodBeat.o(27256);
    return localaar;
  }

  private static aar q(aar paramaar)
  {
    AppMethodBeat.i(27258);
    aar localaar = p(paramaar);
    localaar.LE(1);
    localaar.akI(paramaar.desc);
    AppMethodBeat.o(27258);
    return localaar;
  }

  private static aar r(aar paramaar)
  {
    AppMethodBeat.i(27263);
    aar localaar = p(paramaar);
    localaar.LE(6);
    if ((paramaar.wgT != null) && (paramaar.wgT.why != null))
    {
      aay localaay = new aay();
      localaay.alu(paramaar.wgT.why.label);
      localaay.E(paramaar.wgT.why.lat);
      localaay.D(paramaar.wgT.why.lng);
      localaay.LJ(paramaar.wgT.why.cED);
      localaay.alv(paramaar.wgT.why.cIK);
      localaar.wgT.a(localaay);
    }
    AppMethodBeat.o(27263);
    return localaar;
  }

  private static aar s(aar paramaar)
  {
    AppMethodBeat.i(27266);
    aar localaar = p(paramaar);
    localaar.akH(paramaar.title);
    localaar.akI(paramaar.desc);
    localaar.LE(17);
    localaar.alh(paramaar.whj);
    AppMethodBeat.o(27266);
    return localaar;
  }

  private static aar t(aar paramaar)
  {
    AppMethodBeat.i(27269);
    aar localaar = p(paramaar);
    localaar.LE(14);
    if ((paramaar.wgT != null) && (paramaar.wgT.whE != null))
    {
      abo localabo = new abo();
      localabo.alM(paramaar.wgT.whE.title);
      localabo.alN(paramaar.wgT.whE.desc);
      localabo.alP(paramaar.wgT.whE.info);
      localabo.alO(paramaar.wgT.whE.thumbUrl);
      localaar.wgT.a(localabo);
    }
    AppMethodBeat.o(27269);
    return localaar;
  }

  private static aar u(aar paramaar)
  {
    AppMethodBeat.i(27270);
    aar localaar = p(paramaar);
    localaar.LE(16);
    localaar.akI(paramaar.desc);
    AppMethodBeat.o(27270);
    return localaar;
  }

  private static aar v(aar paramaar)
  {
    AppMethodBeat.i(27271);
    aar localaar = p(paramaar);
    localaar.LE(20);
    localaar.LD(paramaar.duration);
    AppMethodBeat.o(27271);
    return localaar;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.e
 * JD-Core Version:    0.6.2
 */