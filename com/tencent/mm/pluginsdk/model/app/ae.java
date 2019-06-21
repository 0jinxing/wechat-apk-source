package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.g.c.s;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.s.a.a;
import com.tencent.mm.plugin.s.a.a.a;
import com.tencent.mm.protocal.protobuf.aos;
import com.tencent.mm.protocal.protobuf.aot;
import com.tencent.mm.protocal.protobuf.bg;
import com.tencent.mm.protocal.protobuf.bpe;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cyf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class ae extends x
{
  private int egi;
  LinkedList<f> vct;
  private LinkedList<f> vcu;
  private LinkedList<String> vcv;

  public ae(String paramString, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(79384);
    ab.i("MicroMsg.NetSceneGetSuggestionAppList", "offset: 0, limit = 20, lang = " + paramString + "installedApp list size: " + paramLinkedList.size());
    Object localObject = paramLinkedList.iterator();
    while (((Iterator)localObject).hasNext())
      ab.i("MicroMsg.NetSceneGetSuggestionAppList", "install id:[%s]", new Object[] { (String)((Iterator)localObject).next() });
    this.egi = 3;
    localObject = new b.a();
    ((b.a)localObject).fsJ = new aos();
    ((b.a)localObject).fsK = new aot();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getsuggestionapplist";
    ((b.a)localObject).fsI = 409;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (aos)this.lty.fsG.fsP;
    ((aos)localObject).mZF = 3;
    ((aos)localObject).ncn = 0;
    ((aos)localObject).nco = 20;
    ((aos)localObject).nbs = paramString;
    paramString = aD(paramLinkedList);
    ((aos)localObject).wsQ = paramString.size();
    ((aos)localObject).nbX = paramString;
    this.vct = new LinkedList();
    this.vcu = new LinkedList();
    this.vcv = new LinkedList();
    this.vcv.addAll(paramLinkedList);
    AppMethodBeat.o(79384);
  }

  private static void a(f paramf, bg parambg)
  {
    AppMethodBeat.i(79392);
    paramf.ih(parambg.vDl);
    paramf.ik(parambg.nad);
    paramf.ii(parambg.vDn);
    paramf.field_appName = parambg.ncH;
    paramf.field_appIconUrl = parambg.vDm;
    paramf.il(parambg.vDp);
    paramf.it(parambg.vDr);
    a(paramf, parambg.vDq);
    AppMethodBeat.o(79392);
  }

  private static void a(f paramf, bpe parambpe)
  {
    AppMethodBeat.i(79389);
    paramf.ih(parambpe.vDl);
    paramf.field_appIconUrl = parambpe.vDm;
    paramf.ig(parambpe.wRy);
    paramf.field_appName = parambpe.ncH;
    paramf.ii(parambpe.vDn);
    paramf.field_appType = parambpe.vME;
    paramf.ik(parambpe.nad);
    paramf.field_packageName = parambpe.vDo;
    paramf.il(parambpe.vDp);
    if (!bo.isNullOrNil(parambpe.vDp))
    {
      ab.i("MicroMsg.NetSceneGetSuggestionAppList", "google play download url is : %s, download flag is %d", new Object[] { parambpe.vDp, Integer.valueOf(parambpe.wRI) });
      paramf.hq(parambpe.wRI);
    }
    paramf.im(parambpe.wRF);
    paramf.in(parambpe.wRG);
    a(paramf, parambpe.vDq);
    o(paramf);
    AppMethodBeat.o(79389);
  }

  private static void a(f paramf, cyf paramcyf)
  {
    AppMethodBeat.i(79391);
    ab.v("MicroMsg.NetSceneGetSuggestionAppList", "dealYYBDownloadInfos, appId = %s", new Object[] { paramf.field_appId });
    if (paramcyf != null)
    {
      paramf.hq(paramcyf.xtB);
      paramf.iq(paramcyf.vMJ);
      paramf.ir(paramcyf.ndR);
      paramf.io(paramcyf.xtC);
      paramf.ip(paramcyf.ndT);
      paramf.is(paramcyf.ndU);
      paramf.hr(paramcyf.ndV);
      ab.i("MicroMsg.NetSceneGetSuggestionAppList", "get yyb download infos:[%d],[%s],[%s],[%s],[%s],[%s],[%d]", new Object[] { Integer.valueOf(paramcyf.xtB), paramcyf.vMJ, paramcyf.ndR, paramcyf.xtC, paramcyf.ndT, paramcyf.ndU, Integer.valueOf(paramcyf.ndV) });
    }
    AppMethodBeat.o(79391);
  }

  private void a(i parami, LinkedList<bg> paramLinkedList)
  {
    AppMethodBeat.i(79386);
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      Iterator localIterator = paramLinkedList.iterator();
      if (localIterator.hasNext())
      {
        bg localbg = (bg)localIterator.next();
        paramLinkedList = g.bT(localbg.mZr, true);
        if (paramLinkedList != null)
        {
          a(paramLinkedList, localbg);
          parami.a(paramLinkedList, new String[0]);
        }
        while (true)
        {
          this.vcu.add(paramLinkedList);
          break;
          paramLinkedList = new f();
          paramLinkedList.field_appId = localbg.mZr;
          a(paramLinkedList, localbg);
          parami.n(paramLinkedList);
        }
      }
    }
    AppMethodBeat.o(79386);
  }

  private static LinkedList<bts> aD(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(79388);
    LinkedList localLinkedList = new LinkedList();
    if (paramLinkedList == null)
      AppMethodBeat.o(79388);
    while (true)
    {
      return localLinkedList;
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        paramLinkedList = (String)localIterator.next();
        if (!bo.isNullOrNil(paramLinkedList))
          localLinkedList.add(aa.vy(paramLinkedList));
      }
      AppMethodBeat.o(79388);
    }
  }

  private void b(i parami, LinkedList<bpe> paramLinkedList)
  {
    AppMethodBeat.i(79387);
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0))
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        bpe localbpe = (bpe)localIterator.next();
        if (bo.isNullOrNil(localbpe.mZr))
        {
          ab.e("MicroMsg.NetSceneGetSuggestionAppList", "error appinfo, the appid is null");
        }
        else
        {
          boolean bool1 = true;
          boolean bool2 = true;
          boolean bool3 = false;
          paramLinkedList = g.bT(localbpe.mZr, true);
          label136: boolean bool4;
          if (paramLinkedList != null)
          {
            a(paramLinkedList, localbpe);
            if (this.egi == 3)
            {
              paramLinkedList.field_status = 5;
              if ((bo.isNullOrNil(paramLinkedList.dni)) || (bo.isNullOrNil(paramLinkedList.dnh)))
                if (paramLinkedList.dni != null)
                {
                  bool2 = true;
                  if (paramLinkedList.dnh == null)
                    break label265;
                  bool4 = true;
                  label146: ab.e("MicroMsg.NetSceneGetSuggestionAppList", "wrong suggestion params1, has IntroUrl %s, has IconUrl %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool4) });
                  bool2 = false;
                }
            }
            for (bool4 = false; ; bool4 = parami.a(paramLinkedList, new String[0]))
            {
              ab.i("MicroMsg.NetSceneGetSuggestionAppList", "update appinfo: AppID = %s, ret = %s, needAddToList = %s", new Object[] { localbpe.mZr, Boolean.valueOf(bool4), Boolean.valueOf(bool2) });
              label216: if ((!bool2) || (this.vcv.contains(localbpe.mZr)) || (this.vct.contains(paramLinkedList)))
                break label433;
              this.vct.add(paramLinkedList);
              break;
              bool2 = false;
              break label136;
              label265: bool4 = false;
              break label146;
            }
          }
          paramLinkedList = new f();
          paramLinkedList.field_appId = localbpe.mZr;
          a(paramLinkedList, localbpe);
          if (this.egi == 3)
          {
            paramLinkedList.field_status = 5;
            if ((bo.isNullOrNil(paramLinkedList.dni)) || (bo.isNullOrNil(paramLinkedList.dnh)))
              if (paramLinkedList.dni != null)
              {
                bool2 = true;
                label351: if (paramLinkedList.dnh == null)
                  break label441;
                bool4 = true;
                label361: ab.e("MicroMsg.NetSceneGetSuggestionAppList", "wrong suggestion params2, has IntroUrl %s, has IconUrl %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool4) });
                bool2 = false;
                bool4 = bool3;
              }
          }
          while (true)
          {
            ab.i("MicroMsg.NetSceneGetSuggestionAppList", "insert appinfo: AppID = %s, ret = %s, needAddToList = %s", new Object[] { localbpe.mZr, Boolean.valueOf(bool4), Boolean.valueOf(bool2) });
            break label216;
            label433: break;
            bool2 = false;
            break label351;
            label441: bool4 = false;
            break label361;
            bool4 = parami.n(paramLinkedList);
            bool2 = bool1;
          }
        }
      }
    }
    AppMethodBeat.o(79387);
  }

  private static void o(f paramf)
  {
    AppMethodBeat.i(79390);
    if ((!bo.isNullOrNil(paramf.field_appType)) && ((paramf.field_appType.startsWith("1")) || (paramf.field_appType.startsWith("6"))))
    {
      if (!paramf.field_appType.endsWith(","))
        paramf.field_appType += ",";
      paramf.field_appType = ("," + paramf.field_appType);
    }
    AppMethodBeat.o(79390);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79385);
    ab.i("MicroMsg.NetSceneGetSuggestionAppList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneGetSuggestionAppList", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      AppMethodBeat.o(79385);
    }
    while (true)
    {
      return;
      paramString = (aot)this.lty.fsH.fsP;
      if (paramString == null)
      {
        ab.e("MicroMsg.NetSceneGetSuggestionAppList", "resp == null");
        AppMethodBeat.o(79385);
      }
      else
      {
        ab.v("MicroMsg.NetSceneGetSuggestionAppList", "suggestion app count = %s, appType = %s, ", new Object[] { Integer.valueOf(paramString.wsR), Integer.valueOf(this.egi) });
        paramq = a.a.bYQ().bYO();
        b(paramq, paramString.wsS);
        a(paramq, paramString.ncU);
        AppMethodBeat.o(79385);
      }
    }
  }

  public final void bG(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79394);
    if (paramArrayOfByte == null)
    {
      ab.e("MicroMsg.NetSceneGetSuggestionAppList", "buf is null");
      AppMethodBeat.o(79394);
    }
    while (true)
    {
      return;
      b.c localc = this.lty.fsH;
      try
      {
        localc.P(paramArrayOfByte);
        AppMethodBeat.o(79394);
      }
      catch (Exception paramArrayOfByte)
      {
        ab.e("MicroMsg.NetSceneGetSuggestionAppList", paramArrayOfByte.getMessage());
        ab.printErrStackTrace("MicroMsg.NetSceneGetSuggestionAppList", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(79394);
      }
    }
  }

  public final int dhJ()
  {
    return ((aot)this.lty.fsH.fsP).wsR;
  }

  public final byte[] dhj()
  {
    AppMethodBeat.i(79393);
    try
    {
      byte[] arrayOfByte = ((b.b)this.lty.acF()).ZT();
      AppMethodBeat.o(79393);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.NetSceneGetSuggestionAppList", localException.getMessage());
        ab.printErrStackTrace("MicroMsg.NetSceneGetSuggestionAppList", localException, "", new Object[0]);
        Object localObject = null;
        AppMethodBeat.o(79393);
      }
    }
  }

  public final int getType()
  {
    return 4;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ae
 * JD-Core Version:    0.6.2
 */