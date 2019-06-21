package com.tencent.mm.plugin.sns.j;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gh.a;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.aq;
import com.tencent.mm.plugin.sns.storage.h;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aau;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.cfg;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;
import java.util.Map;

public final class a
{
  public static void a(aar paramaar, n paramn)
  {
    AppMethodBeat.i(38042);
    if (paramn != null)
      a(paramaar, paramn.cqu());
    AppMethodBeat.o(38042);
  }

  private static void a(aar paramaar, TimeLineObject paramTimeLineObject)
  {
    AppMethodBeat.i(38041);
    if ((paramaar != null) && (paramTimeLineObject != null) && (!bo.isNullOrNil(paramTimeLineObject.rjC)))
      paramaar.alf(paramTimeLineObject.rjC);
    AppMethodBeat.o(38041);
  }

  public static boolean a(cl paramcl, n paramn)
  {
    AppMethodBeat.i(38035);
    boolean bool;
    if (paramn == null)
    {
      ab.w("MicroMsg.Sns.GetFavDataSource", "fill sight favorite event fail, event is null or tlObj is null");
      paramcl.cvA.cvG = 2131299622;
      bool = false;
      AppMethodBeat.o(38035);
    }
    abf localabf;
    Object localObject1;
    TimeLineObject localTimeLineObject;
    bau localbau;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int k;
    int m;
    Bitmap localBitmap;
    while (true)
    {
      return bool;
      localabf = new abf();
      localObject1 = new abl();
      localTimeLineObject = paramn.cqu();
      localbau = (bau)localTimeLineObject.xfI.wbK.get(0);
      if ((paramn.DI(32)) && (localTimeLineObject.xfI.wbJ == 15))
      {
        localTimeLineObject.xfN.fiM = paramn.cqq().qPj;
        localTimeLineObject.xfN.fiN = localTimeLineObject.Id;
      }
      localObject2 = String.format("%s#%s", new Object[] { i.jV(paramn.field_snsId), localbau.Id });
      ((abl)localObject1).alD(paramn.field_userName);
      ((abl)localObject1).alE(r.Yz());
      ((abl)localObject1).LN(2);
      ((abl)localObject1).ml(bo.anU());
      ((abl)localObject1).alI(paramn.cqA());
      ((abl)localObject1).alF((String)localObject2);
      localabf.a((abl)localObject1);
      localObject1 = new aar();
      ((aar)localObject1).akZ((String)localObject2);
      localObject3 = an.fZ(af.getAccSnsPath(), localbau.Id);
      localObject4 = i.j(localbau);
      localObject2 = i.e(localbau);
      if (bo.isNullOrNil(aq.a(paramn.cqU(), localbau)))
      {
        ab.w("MicroMsg.Sns.GetFavDataSource", "this sight had no download finish, can not favorite.");
        paramcl.cvA.cvG = 2131299639;
        bool = false;
        AppMethodBeat.o(38035);
      }
      else if (!e.ct((String)localObject3 + (String)localObject4))
      {
        ab.i("MicroMsg.Sns.GetFavDataSource", "fav error sight: " + e.ct(new StringBuilder().append((String)localObject3).append((String)localObject4).toString()) + " thumb:" + e.ct(new StringBuilder().append((String)localObject3).append((String)localObject2).toString()));
        paramcl.cvA.cvG = 2131299639;
        bool = false;
        AppMethodBeat.o(38035);
      }
      else
      {
        if (e.ct((String)localObject3 + (String)localObject2))
          break label683;
        int i = 320;
        int j = 240;
        k = j;
        m = i;
        if (localbau.wEK != null)
        {
          k = j;
          m = i;
          if (localbau.wEK.wFy > 0.0F)
          {
            k = j;
            m = i;
            if (localbau.wEK.wFx > 0.0F)
            {
              m = (int)localbau.wEK.wFx;
              k = (int)localbau.wEK.wFy;
            }
          }
        }
        localBitmap = com.tencent.mm.plugin.sight.base.d.ag((String)localObject3 + (String)localObject4, m, k);
        if (localBitmap != null)
          break;
        ab.i("MicroMsg.Sns.GetFavDataSource", "fav error on get thumb:" + e.ct(new StringBuilder().append((String)localObject3).append((String)localObject2).toString()));
        paramcl.cvA.cvG = 2131299639;
        bool = false;
        AppMethodBeat.o(38035);
      }
    }
    while (true)
    {
      try
      {
        Bitmap.CompressFormat localCompressFormat = Bitmap.CompressFormat.JPEG;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        com.tencent.mm.sdk.platformtools.d.a(localBitmap, 60, localCompressFormat, (String)localObject3 + (String)localObject2, true);
        label683: ((aar)localObject1).akV((String)localObject3 + (String)localObject4);
        ((aar)localObject1).akW((String)localObject3 + (String)localObject2);
        if (!bo.isNullOrNil(localbau.wES))
          break label1252;
        localObject2 = localTimeLineObject.xfF;
        ((aar)localObject1).akH((String)localObject2);
        ((aar)localObject1).alg(localTimeLineObject.rCK);
        if (!bo.isNullOrNil(localTimeLineObject.rCK))
        {
          localObject2 = br.z(localTimeLineObject.rCK, "adxml");
          if (((Map)localObject2).size() > 0)
          {
            ((aar)localObject1).akH(bo.bc((String)((Map)localObject2).get(".adxml.adCanvasInfo.shareTitle"), ""));
            ((aar)localObject1).akI(bo.bc((String)((Map)localObject2).get(".adxml.adCanvasInfo.shareDesc"), ""));
          }
        }
        k = 4;
        if (!paramn.DI(32))
          break label1292;
        localObject3 = paramn.cqo();
        localObject4 = new aau();
        if (!bo.isNullOrNil(localbau.wES))
          break label1262;
        localObject2 = localTimeLineObject.xfF;
        ((aau)localObject4).fiI = ((String)localObject2);
        ((aau)localObject4).wid = localbau.rEd;
        ((aau)localObject4).fiG = localbau.wEO;
        ((aau)localObject4).fiM = localTimeLineObject.xfN.fiM;
        ((aau)localObject4).fiN = localTimeLineObject.xfN.fiN;
        if (bo.isNullOrNil(((aau)localObject4).fiN))
          ((aau)localObject4).fiN = localTimeLineObject.Id;
        if (!bo.isNullOrNil(localbau.wER))
          break label1272;
        localObject2 = localbau.wEH;
        ((aau)localObject4).fiL = ((String)localObject2);
        if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).qUn == 0))
        {
          ((aau)localObject4).fiK = ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUp;
          ((aau)localObject4).fiJ = ((com.tencent.mm.plugin.sns.storage.b)localObject3).qUo;
        }
        ((aar)localObject1).a((aau)localObject4);
        m = 16;
        k = 15;
        ((aar)localObject1).LE(k);
        localObject2 = com.tencent.mm.plugin.sight.base.d.WR(((aar)localObject1).wgx);
        if (localObject2 == null)
          break label1282;
        ((aar)localObject1).LD(((com.tencent.mm.plugin.sight.base.a)localObject2).ckU());
        localObject2 = new LinkedList();
        ((LinkedList)localObject2).add(localObject1);
        localabf.aE((LinkedList)localObject2);
        paramcl.cvA.cvC = localabf;
        paramcl.cvA.type = m;
        a((aar)localObject1, paramn);
        ab.i("MicroMsg.Sns.GetFavDataSource", "fill event Info sight dataType %d eventType %d", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
        bool = true;
        AppMethodBeat.o(38035);
      }
      catch (Exception paramn)
      {
        ab.printErrStackTrace("MicroMsg.Sns.GetFavDataSource", paramn, "save bmp error %s", new Object[] { paramn.getMessage() });
        ab.i("MicroMsg.Sns.GetFavDataSource", "fav error on save thumb:" + e.ct(new StringBuilder().append((String)localObject3).append((String)localObject2).toString()));
        paramcl.cvA.cvG = 2131299639;
        bool = false;
        AppMethodBeat.o(38035);
      }
      break;
      label1252: localObject2 = localbau.wES;
      continue;
      label1262: localObject2 = localbau.wES;
      continue;
      label1272: localObject2 = localbau.wER;
      continue;
      label1282: ((aar)localObject1).LD(1);
      continue;
      label1292: m = 4;
    }
  }

  public static boolean a(cl paramcl, n paramn, String paramString)
  {
    AppMethodBeat.i(38039);
    boolean bool;
    if ((paramcl == null) || (bo.isNullOrNil(paramString)))
    {
      ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or media id is null");
      if (paramcl != null)
        paramcl.cvA.cvG = 2131299622;
      bool = false;
      AppMethodBeat.o(38039);
    }
    bau localbau;
    abf localabf;
    abl localabl;
    aar localaar;
    while (true)
    {
      return bool;
      if (paramn == null)
      {
        ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
        paramcl.cvA.cvG = 2131299623;
        bool = false;
        AppMethodBeat.o(38039);
      }
      else
      {
        localbau = aj.a(paramn, paramString);
        if (localbau == null)
        {
          ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
          paramcl.cvA.cvG = 2131299623;
          bool = false;
          AppMethodBeat.o(38039);
        }
        else
        {
          String str = String.format("%s#%s", new Object[] { i.jV(paramn.field_snsId), paramString });
          localabf = new abf();
          localabl = new abl();
          localaar = new aar();
          ab.i("MicroMsg.Sns.GetFavDataSource", "fav sns image, from %s", new Object[] { paramn.field_userName });
          localabl.alD(paramn.field_userName);
          localabl.alE(r.Yz());
          localabl.LN(2);
          localabl.ml(paramn.field_createTime * 1000L);
          localabl.alI(paramn.cqA());
          localabl.alF(str);
          localaar.akZ(str);
          localaar.akV(an.fZ(af.getAccSnsPath(), paramString) + i.l(localbau));
          if (paramn.cqu() != null)
          {
            localaar.alg(paramn.cqu().rCK);
            if (!bo.isNullOrNil(paramn.cqu().rCK))
            {
              paramString = br.z(paramn.cqu().rCK, "adxml");
              if (paramString.size() > 0)
              {
                localaar.akH(bo.bc((String)paramString.get(".adxml.adCanvasInfo.shareTitle"), ""));
                localaar.akI(bo.bc((String)paramString.get(".adxml.adCanvasInfo.shareDesc"), ""));
              }
            }
          }
          a(localaar, paramn);
          paramString = an.fZ(af.getAccSnsPath(), localbau.Id) + i.e(localbau);
          if ((e.ct(localaar.wgx)) || (!paramn.field_userName.endsWith(af.cnk())))
            break;
          ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, mediaObj is null");
          paramcl.cvA.cvG = 2131299623;
          bool = false;
          AppMethodBeat.o(38039);
        }
      }
    }
    if (e.ct(paramString))
      localaar.akW(paramString);
    while (true)
    {
      localaar.LE(2);
      localabf.wiv.add(localaar);
      localabf.a(localabl);
      paramcl.cvA.cvC = localabf;
      paramcl.cvA.type = 2;
      bool = true;
      AppMethodBeat.o(38039);
      break;
      localaar.oY(true);
      localaar.akQ(localbau.wEH);
      paramn = new abu();
      paramn.alT(localbau.wEH);
      localabf.b(paramn);
    }
  }

  public static boolean a(cl paramcl, String paramString)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(38043);
    if ((paramcl == null) || (!v.Zo(paramString)))
    {
      ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
      if (paramcl != null)
        paramcl.cvA.cvG = 2131299622;
      AppMethodBeat.o(38043);
    }
    while (true)
    {
      return bool;
      if (af.cnn())
      {
        ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
        paramcl.cvA.cvG = 2131299640;
        AppMethodBeat.o(38043);
      }
      else
      {
        Object localObject1 = h.YT(paramString);
        if (localObject1 == null)
        {
          ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
          paramcl.cvA.cvG = 2131299623;
          AppMethodBeat.o(38043);
        }
        else
        {
          paramString = "0";
          Object localObject2 = aj.a((n)localObject1, 0);
          if (localObject2 != null)
            paramString = ((bau)localObject2).Id;
          String str = String.format("%s#%s", new Object[] { i.jV(((n)localObject1).field_snsId), paramString });
          localObject2 = new abl();
          paramString = ((n)localObject1).cqu();
          if (paramString == null)
          {
            ab.i("MicroMsg.Sns.GetFavDataSource", "fav NoteLink, tlObj is null , return");
            AppMethodBeat.o(38043);
          }
          else
          {
            ab.i("MicroMsg.Sns.GetFavDataSource", "fav NoteLink, from %s", new Object[] { ((n)localObject1).field_userName });
            ((abl)localObject2).alD(((n)localObject1).field_userName);
            ((abl)localObject2).alE(r.Yz());
            ((abl)localObject2).LN(2);
            ((abl)localObject2).ml(((n)localObject1).field_createTime * 1000L);
            ((abl)localObject2).alI(((n)localObject1).cqA());
            ((abl)localObject2).alF(str);
            localObject1 = new gh();
            ((gh)localObject1).cAH.type = 30;
            ((gh)localObject1).cAH.cAO = 4;
            ((gh)localObject1).cAH.desc = paramString.xfI.wbM;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
            ((gh)localObject1).cAH.cvC.a((abl)localObject2);
            paramcl.cvA.cvC = ((gh)localObject1).cAH.cvC;
            if (paramcl.cvA.cvC != null)
            {
              localObject1 = paramcl.cvA.cvC.wiv;
              if (localObject1 != null)
                while (i < ((LinkedList)localObject1).size())
                {
                  localObject2 = (aar)((LinkedList)localObject1).get(i);
                  if (localObject2 != null)
                  {
                    ((aar)localObject2).oX(true);
                    ((aar)localObject2).oY(true);
                  }
                  i++;
                }
            }
            paramcl.cvA.desc = paramString.xfI.Title;
            paramcl.cvA.type = 18;
            AppMethodBeat.o(38043);
            bool = true;
          }
        }
      }
    }
  }

  public static boolean a(cl paramcl, String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(38040);
    if ((v.Zp(paramString)) || (paramInt < 0))
    {
      ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or position errro");
      paramcl.cvA.cvG = 2131299622;
      AppMethodBeat.o(38040);
    }
    while (true)
    {
      return bool;
      if (af.cnn())
      {
        ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
        paramcl.cvA.cvG = 2131299640;
        AppMethodBeat.o(38040);
      }
      else
      {
        n localn = af.cnF().YT(paramString);
        if (localn == null)
        {
          ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
          paramcl.cvA.cvG = 2131299623;
          AppMethodBeat.o(38040);
        }
        else
        {
          paramString = aj.a(localn, paramInt);
          if (paramString == null)
          {
            ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, media obj is null");
            paramcl.cvA.cvG = 2131299623;
            AppMethodBeat.o(38040);
          }
          else
          {
            bool = a(paramcl, localn, paramString.Id);
            AppMethodBeat.o(38040);
          }
        }
      }
    }
  }

  public static boolean a(cl paramcl, String paramString, CharSequence paramCharSequence)
  {
    boolean bool = false;
    AppMethodBeat.i(38038);
    if ((v.Zp(paramString)) || (paramCharSequence == null))
    {
      ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or text is null");
      paramcl.cvA.cvG = 2131299622;
      AppMethodBeat.o(38038);
    }
    while (true)
    {
      return bool;
      if (af.cnn())
      {
        ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
        paramcl.cvA.cvG = 2131299640;
        AppMethodBeat.o(38038);
      }
      else
      {
        n localn = af.cnF().YT(paramString);
        if (localn == null)
        {
          ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
          paramcl.cvA.cvG = 2131299623;
          AppMethodBeat.o(38038);
        }
        else if (0L == localn.field_snsId)
        {
          ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo.field_snsId is 0");
          paramcl.cvA.cvG = 2131299621;
          AppMethodBeat.o(38038);
        }
        else
        {
          paramString = String.format("%s#0", new Object[] { i.jV(localn.field_snsId) });
          abf localabf = new abf();
          abl localabl = new abl();
          ab.i("MicroMsg.Sns.GetFavDataSource", "fav sns text, from %s", new Object[] { localn.field_userName });
          localabl.alD(localn.field_userName);
          localabl.alE(r.Yz());
          localabl.LN(2);
          localabl.ml(localn.field_createTime * 1000L);
          localabl.alI(localn.cqA());
          localabl.alF(paramString);
          localabf.a(localabl);
          paramcl.cvA.cvC = localabf;
          paramcl.cvA.desc = paramCharSequence.toString();
          paramcl.cvA.type = 1;
          AppMethodBeat.o(38038);
          bool = true;
        }
      }
    }
  }

  public static boolean a(cl paramcl, String paramString1, String paramString2)
  {
    AppMethodBeat.i(38036);
    boolean bool = b(paramcl, paramString1, paramString2);
    AppMethodBeat.o(38036);
    return bool;
  }

  public static boolean b(cl paramcl, String paramString1, String paramString2)
  {
    AppMethodBeat.i(38037);
    boolean bool;
    if ((paramcl == null) || (!v.Zo(paramString2)) || (paramString1 == null))
    {
      ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or url is null");
      if (paramcl != null)
        paramcl.cvA.cvG = 2131299622;
      bool = false;
      AppMethodBeat.o(38037);
    }
    Object localObject1;
    while (true)
    {
      return bool;
      if (af.cnn())
      {
        ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
        paramcl.cvA.cvG = 2131299640;
        bool = false;
        AppMethodBeat.o(38037);
      }
      else
      {
        localObject1 = h.YT(paramString2);
        if (localObject1 == null)
        {
          ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
          paramcl.cvA.cvG = 2131299623;
          bool = false;
          AppMethodBeat.o(38037);
        }
        else
        {
          if ((((n)localObject1).cqu().xfI == null) || (((n)localObject1).cqu().xfI.wbJ != 26))
            break;
          bool = a(paramcl, paramString2);
          AppMethodBeat.o(38037);
        }
      }
    }
    paramString2 = "0";
    Object localObject2 = aj.a((n)localObject1, 0);
    if (localObject2 != null)
      paramString2 = ((bau)localObject2).Id;
    Object localObject3 = String.format("%s#%s", new Object[] { i.jV(((n)localObject1).field_snsId), paramString2 });
    paramString2 = new abf();
    abl localabl = new abl();
    ab.i("MicroMsg.Sns.GetFavDataSource", "fav sns url, from %s", new Object[] { ((n)localObject1).field_userName });
    localabl.alD(((n)localObject1).field_userName);
    localabl.alE(r.Yz());
    localabl.LN(2);
    localabl.ml(((n)localObject1).field_createTime * 1000L);
    localabl.alI(((n)localObject1).cqA());
    localabl.alF((String)localObject3);
    localabl.alK(paramString1);
    paramString1 = new aar();
    paramString1.akZ((String)localObject3);
    if (localObject2 != null)
    {
      localObject3 = an.fZ(af.getAccSnsPath(), ((bau)localObject2).Id) + i.e((bau)localObject2);
      if (e.ct((String)localObject3))
        paramString1.akW((String)localObject3);
    }
    while (true)
    {
      paramString1.LE(5);
      localObject1 = ((n)localObject1).cqu();
      paramString1.akH(((TimeLineObject)localObject1).xfI.Title);
      paramString1.akI(((TimeLineObject)localObject1).xfI.Desc);
      paramString1.alg(((TimeLineObject)localObject1).rCK);
      if (!bo.isNullOrNil(((TimeLineObject)localObject1).rCK))
      {
        localObject2 = br.z(((TimeLineObject)localObject1).rCK, "adxml");
        if (((Map)localObject2).size() > 0)
        {
          paramString1.akH(bo.bc((String)((Map)localObject2).get(".adxml.adCanvasInfo.shareTitle"), ""));
          paramString1.akI(bo.bc((String)((Map)localObject2).get(".adxml.adCanvasInfo.shareDesc"), ""));
        }
      }
      a(paramString1, (TimeLineObject)localObject1);
      paramString1.oX(true);
      paramString2.wiv.add(paramString1);
      paramString1 = new abu();
      paramString1.LP(((TimeLineObject)localObject1).fgt);
      paramString2.b(paramString1);
      paramString2.a(localabl);
      paramcl.cvA.cvC = paramString2;
      paramcl.cvA.desc = ((TimeLineObject)localObject1).xfI.Title;
      paramcl.cvA.type = 5;
      bool = true;
      AppMethodBeat.o(38037);
      break;
      paramString1.oY(true);
      paramString1.akQ(((bau)localObject2).wEH);
      localObject3 = new abu();
      ((abu)localObject3).alT(((bau)localObject2).wEH);
      paramString2.b((abu)localObject3);
      continue;
      paramString1.oY(true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.j.a
 * JD-Core Version:    0.6.2
 */