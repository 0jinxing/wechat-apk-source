package com.tencent.mm.plugin.topstory;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.fa;
import com.tencent.mm.g.a.px;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.topstory.a.e.a;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.ac;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.cht;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements com.tencent.mm.plugin.topstory.a.e
{
  private f fur;
  public cht sAm;
  LinkedList<cht> sAn;
  e.a sAo;
  o sAp;
  com.tencent.mm.plugin.topstory.a.c.b sAq;
  final String sAr;
  String sAs;
  com.tencent.mm.sdk.b.c<fa> sAt;

  public b()
  {
    AppMethodBeat.i(65457);
    this.sAn = new LinkedList();
    this.sAp = new b.1(this);
    this.fur = new b.2(this);
    this.sAr = "{\"tabs\":[{\"wording\":\"好看\",\"wording_cn\":\"好看\",\"wording_en\":\"Wow\",\"wording_hk\":\"好看\",\"wording_tw\":\"好看\",\"category\":110,\"showWhenRedDot\":1,\"tabInfo\":\"{\\\"category\\\":110}\"},{\"wording\":\"精选\",\"wording_cn\":\"精选\",\"wording_en\":\"Recommended\",\"wording_hk\":\"精選\",\"wording_tw\":\"精選\",\"category\":100,\"showWhenRedDot\":0,\"tabInfo\":\"{\\\"category\\\":100}\"}]}";
    this.sAs = "";
    this.sAt = new b.3(this);
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("mmsearch_reddot_new", this.sAp);
    this.sAm = new cht();
    c(this.sAm);
    cht localcht = this.sAm;
    Object localObject = (String)g.RP().Ry().get(ac.a.xUK, "");
    if (!bo.isNullOrNil((String)localObject))
    {
      localObject = ((String)localObject).split(",");
      if (localObject == null)
        break label182;
    }
    try
    {
      if (localObject.length >= 13)
        a(localcht, (String[])localObject);
      while (true)
      {
        cES();
        com.tencent.mm.sdk.b.a.xxA.b(this.sAt);
        AppMethodBeat.o(65457);
        return;
        label182: g.RP().Ry().set(ac.a.xUK, "");
        g.RP().Ry().dsb();
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        g.RP().Ry().set(ac.a.xUK, "");
        g.RP().Ry().dsb();
      }
    }
  }

  private static void a(cht paramcht, String[] paramArrayOfString)
  {
    AppMethodBeat.i(65470);
    paramcht.cJb = paramArrayOfString[0];
    paramcht.xgA = Integer.valueOf(paramArrayOfString[1]).intValue();
    paramcht.uaV = Integer.valueOf(paramArrayOfString[2]).intValue();
    paramcht.uaW = Integer.valueOf(paramArrayOfString[3]).intValue();
    paramcht.uaU = Integer.valueOf(paramArrayOfString[4]).intValue();
    paramcht.fRS = Long.valueOf(paramArrayOfString[5]).longValue();
    paramcht.tZU = Integer.valueOf(paramArrayOfString[6]).intValue();
    paramcht.xgB = Long.valueOf(paramArrayOfString[7]).longValue();
    paramcht.text = paramArrayOfString[8];
    paramcht.type = Integer.valueOf(paramArrayOfString[9]).intValue();
    paramcht.dtW = Integer.valueOf(paramArrayOfString[10]).intValue();
    paramcht.xgz = Long.valueOf(paramArrayOfString[11]).longValue();
    paramcht.cIY = paramArrayOfString[12];
    if (paramArrayOfString.length > 13)
    {
      paramcht.fQi = Integer.valueOf(paramArrayOfString[13]).intValue();
      if (paramArrayOfString.length <= 14)
        break label229;
      paramcht.extInfo = paramArrayOfString[14];
      AppMethodBeat.o(65470);
    }
    while (true)
    {
      return;
      paramcht.fQi = 0;
      if (paramcht.type != 7)
        break;
      ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "no seq");
      break;
      label229: paramcht.extInfo = "";
      AppMethodBeat.o(65470);
    }
  }

  public static void abx(String paramString)
  {
    AppMethodBeat.i(65468);
    ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "setHomeTabRedDot %s", new Object[] { paramString });
    g.RP().Ry().set(ac.a.xVT, paramString);
    g.RP().Ry().dsb();
    AppMethodBeat.o(65468);
  }

  private void bNs()
  {
    AppMethodBeat.i(65460);
    this.sAm = new cht();
    c(this.sAm);
    g.RP().Ry().set(ac.a.xUK, "");
    g.RP().Ry().dsb();
    if (this.sAo != null)
    {
      e.a locala = this.sAo;
      cEZ();
      locala.cFk();
    }
    AppMethodBeat.o(65460);
  }

  static void c(cht paramcht)
  {
    paramcht.cIY = "";
    paramcht.cJb = "";
    paramcht.text = "";
  }

  private void cER()
  {
    AppMethodBeat.i(65467);
    StringBuilder localStringBuilder;
    synchronized (this.sAn)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Iterator localIterator = this.sAn.iterator();
      if (localIterator.hasNext())
        localStringBuilder.append(d((cht)localIterator.next())).append(";");
    }
    g.RP().Ry().set(ac.a.xVS, localStringBuilder.toString());
    g.RP().Ry().dsb();
    AppMethodBeat.o(65467);
  }

  private void cES()
  {
    AppMethodBeat.i(65471);
    Object localObject1 = (String)g.RP().Ry().get(ac.a.xVS, "");
    if (!bo.isNullOrNil((String)localObject1))
      localObject1 = ((String)localObject1).split(";");
    while (true)
    {
      try
      {
        int i = localObject1.length;
        int j = 0;
        if (j < i)
        {
          Object localObject2 = localObject1[j];
          if (!bo.isNullOrNil((String)localObject2))
          {
            localObject2 = ((String)localObject2).split(",");
            cht localcht = new com/tencent/mm/protocal/protobuf/cht;
            localcht.<init>();
            a(localcht, (String[])localObject2);
            this.sAn.addLast(localcht);
          }
          j++;
          continue;
        }
        AppMethodBeat.o(65471);
        return;
      }
      catch (Exception localException)
      {
        g.RP().Ry().set(ac.a.xVS, "");
        g.RP().Ry().dsb();
      }
      AppMethodBeat.o(65471);
    }
  }

  private int cEV()
  {
    int i = 0;
    AppMethodBeat.i(65473);
    if (!cFj())
    {
      ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "getCmtRedDotCountForReport %s", new Object[] { Integer.valueOf(0) });
      AppMethodBeat.o(65473);
    }
    while (true)
    {
      return i;
      ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "getCmtRedDotCountForReport %s", new Object[] { Integer.valueOf(this.sAn.size()) });
      i = this.sAn.size();
      AppMethodBeat.o(65473);
    }
  }

  public static long cEZ()
  {
    AppMethodBeat.i(65480);
    Object localObject = g.RP().Ry().get(ac.a.xUH, null);
    long l;
    if (localObject == null)
    {
      l = 0L;
      AppMethodBeat.o(65480);
    }
    while (true)
    {
      return l;
      l = ((Long)localObject).longValue();
      AppMethodBeat.o(65480);
    }
  }

  private static int cFa()
  {
    AppMethodBeat.i(65481);
    Object localObject = g.RP().Ry().get(ac.a.xUJ, null);
    int i;
    if (localObject == null)
    {
      i = -1;
      AppMethodBeat.o(65481);
    }
    while (true)
    {
      return i;
      i = ((Integer)localObject).intValue();
      AppMethodBeat.o(65481);
    }
  }

  public static String d(cht paramcht)
  {
    AppMethodBeat.i(65469);
    paramcht = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { paramcht.cJb, Integer.valueOf(paramcht.xgA), Integer.valueOf(paramcht.uaV), Integer.valueOf(paramcht.uaW), Integer.valueOf(paramcht.uaU), Long.valueOf(paramcht.fRS), Integer.valueOf(paramcht.tZU), Long.valueOf(paramcht.xgB), paramcht.text, Integer.valueOf(paramcht.type), Integer.valueOf(paramcht.dtW), Long.valueOf(paramcht.xgz), paramcht.cIY, Integer.valueOf(paramcht.fQi), paramcht.extInfo });
    AppMethodBeat.o(65469);
    return paramcht;
  }

  public final void A(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(65463);
    if ((this.sAm == null) || (bo.isNullOrNil(this.sAm.cJb)))
      AppMethodBeat.o(65463);
    while (true)
    {
      return;
      long l = System.currentTimeMillis() / 1000L;
      ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "rec updateRedDotTimestamp %d, cur %d", new Object[] { Long.valueOf(paramLong), Long.valueOf(l) });
      if ((paramLong < cEZ()) || (paramLong <= 0L) || (l + 3600L < paramLong))
      {
        ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateRedDotTimestamp invalid, getRedDotTimestamp:%s", new Object[] { Long.valueOf(cEZ()) });
        AppMethodBeat.o(65463);
      }
      else if ((this.sAm != null) && (paramLong < this.sAm.xgz))
      {
        ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateRedDotTimestamp invalid, showTime:%s", new Object[] { Long.valueOf(this.sAm.xgz) });
        AppMethodBeat.o(65463);
      }
      else
      {
        if (paramBoolean)
          an.a(this.sAm, 106, 1, 0, paramLong, "");
        bNs();
        g.RP().Ry().set(ac.a.xUH, Long.valueOf(paramLong));
        g.RP().Ry().dsb();
        AppMethodBeat.o(65463);
      }
    }
  }

  public final void Fx(int paramInt)
  {
    AppMethodBeat.i(65461);
    switch (paramInt)
    {
    case 5:
    case 6:
    case 9:
    default:
    case 8:
    case 7:
    case 1:
    case 2:
    case 3:
    case 4:
    case 10:
    }
    while (true)
    {
      AppMethodBeat.o(65461);
      while (true)
      {
        return;
        abx("");
        AppMethodBeat.o(65461);
        continue;
        synchronized (this.sAn)
        {
          this.sAn.clear();
          cER();
          if (this.sAo != null)
            this.sAo.a(0, "", "", 0, 0, "", true);
          ??? = new px();
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)???);
          AppMethodBeat.o(65461);
        }
        bNs();
        ??? = new px();
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)???);
        AppMethodBeat.o(65461);
      }
      m("", "", 0L);
    }
  }

  public final void Fy(int paramInt)
  {
    AppMethodBeat.i(65479);
    cht localcht = cEW();
    if (localcht != null)
      an.a(localcht.cJb, localcht.xgz, 2, paramInt, "", localcht.fQi);
    AppMethodBeat.o(65479);
  }

  public final void a(long paramLong, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    AppMethodBeat.i(65476);
    if (this.sAn.size() == 0)
      AppMethodBeat.o(65476);
    while (true)
    {
      return;
      if (paramInt > cFa())
        break;
      ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "clickCmtRedDot invalid, seq:%s, curSeq:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(cFa()) });
      AppMethodBeat.o(65476);
    }
    int i = this.sAn.size();
    Object localObject1 = this.sAn;
    String str = "";
    while (true)
    {
      try
      {
        if ((this.sAn.size() > 0) && (((cht)this.sAn.getFirst()).fQi <= paramInt))
        {
          str = ((cht)this.sAn.getFirst()).cJb;
          this.sAn.removeFirst();
          continue;
        }
        if (i != this.sAn.size())
          cER();
        if (this.sAo != null)
        {
          if (this.sAn.size() > 0)
            this.sAo.a(this.sAn.size(), ((cht)this.sAn.getFirst()).cJb, ((cht)this.sAn.getLast()).cJb, ((cht)this.sAn.getFirst()).fQi, ((cht)this.sAn.getLast()).fQi, ((cht)this.sAn.getLast()).extInfo, paramBoolean1);
        }
        else
        {
          if (paramBoolean2)
          {
            localObject1 = new cht();
            ((cht)localObject1).cJb = str;
            ((cht)localObject1).xgz = paramLong;
            ((cht)localObject1).fQi = paramInt;
            an.a((cht)localObject1, 106, 2, i, paramLong, "");
          }
          g.RP().Ry().set(ac.a.xUI, Long.valueOf(paramLong));
          g.RP().Ry().dsb();
          ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "updateCmtRedDotSeq %s", new Object[] { Integer.valueOf(paramInt) });
          g.RP().Ry().set(ac.a.xUJ, Integer.valueOf(paramInt));
          g.RP().Ry().dsb();
          AppMethodBeat.o(65476);
          break;
        }
      }
      finally
      {
        AppMethodBeat.o(65476);
      }
      this.sAo.a(0, "", "", 0, 0, "", paramBoolean1);
    }
  }

  public final void a(e.a parama)
  {
    this.sAo = parama;
  }

  public final void a(cht paramcht)
  {
    AppMethodBeat.i(65465);
    if (!cFi())
      an.a(paramcht, 108, 1, 0, 0L, "");
    long l1 = System.currentTimeMillis() / 1000L;
    long l2 = paramcht.xgz;
    String str;
    if (this.sAm == null)
    {
      str = "null";
      ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "setTopStoryRedDot showTime new:%s, cur:%s, curTime:%s", new Object[] { Long.valueOf(l2), str, Long.valueOf(l1) });
      if (paramcht.xgz > cEZ())
        break label177;
      an.a(paramcht, 103, 1, 0, 0L, "");
      an.a(paramcht, 109, 1, 0, 0L, "r6|" + paramcht.xgz + "|" + cEZ());
      AppMethodBeat.o(65465);
    }
    while (true)
    {
      return;
      str = this.sAm.xgz;
      break;
      label177: if (paramcht.xgz > 3600L + l1)
      {
        an.a(paramcht, 109, 1, 0, 0L, "r10|" + paramcht.xgz + "|" + l1);
        AppMethodBeat.o(65465);
      }
      else if ((this.sAm != null) && (!bo.isNullOrNil(this.sAm.cJb)) && (this.sAm.xgz > paramcht.xgz))
      {
        an.a(paramcht, 105, 1, 0, 0L, this.sAm.cJb);
        an.a(paramcht, 109, 1, 0, 0L, "r9|" + paramcht.xgz + "|" + cEZ());
        AppMethodBeat.o(65465);
      }
      else
      {
        if ((this.sAm != null) && (!bo.isNullOrNil(this.sAm.cJb)))
          an.a(paramcht, 105, 1, 0, 0L, paramcht.cJb);
        ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "setTopStoryRedDot valid");
        this.sAm = paramcht;
        g.RP().Ry().set(ac.a.xUK, d(this.sAm));
        g.RP().Ry().dsb();
        if (cFi())
          an.a(this.sAm, 101, 1, 0, 0L, "");
        if (this.sAo != null)
          this.sAo.as(this.sAm.cJb, this.sAm.xgz);
        paramcht = new px();
        com.tencent.mm.sdk.b.a.xxA.m(paramcht);
        AppMethodBeat.o(65465);
      }
    }
  }

  public final void b(e.a parama)
  {
    if (this.sAo == parama)
      this.sAo = null;
  }

  public final void b(cht paramcht)
  {
    AppMethodBeat.i(65466);
    ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "start addCmtRedDot: %s", new Object[] { Integer.valueOf(paramcht.fQi) });
    if (!cFi())
      an.a(paramcht, 108, 2, this.sAn.size(), 0L, "");
    if (paramcht.fQi <= cFa())
    {
      ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "addCmtRedDot invalid1, %s, %s", new Object[] { Integer.valueOf(paramcht.fQi), Integer.valueOf(cFa()) });
      an.a(paramcht, 103, 2, cEV(), 0L, "");
      an.a(paramcht, 109, 2, cEV(), 0L, "r6|" + paramcht.fQi + "|" + cFa());
      AppMethodBeat.o(65466);
      return;
    }
    while (true)
    {
      synchronized (this.sAn)
      {
        if (!bo.ek(this.sAn))
        {
          i = 0;
          if (i < this.sAn.size())
          {
            cht localcht = (cht)this.sAn.get(i);
            if (localcht.cJb.equals(paramcht.cJb))
            {
              ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "addCmtRedDot invalid3");
              an.a(paramcht, 109, 2, cEV(), 0L, "r11");
              AppMethodBeat.o(65466);
              break;
            }
            if (localcht.fQi <= paramcht.fQi)
            {
              i++;
              continue;
            }
          }
          this.sAn.add(i, paramcht);
          if (cFi())
            an.a(cEW(), 101, 2, this.sAn.size(), 0L, "");
          ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "addCmtRedDot msgId:%s, showTime:%s", new Object[] { paramcht.cJb, Long.valueOf(paramcht.xgz) });
          cER();
          if (this.sAo != null)
            this.sAo.a(this.sAn.size(), ((cht)this.sAn.getFirst()).cJb, ((cht)this.sAn.getLast()).cJb, ((cht)this.sAn.getFirst()).fQi, ((cht)this.sAn.getLast()).fQi, ((cht)this.sAn.getLast()).extInfo);
          paramcht = new px();
          com.tencent.mm.sdk.b.a.xxA.m(paramcht);
          AppMethodBeat.o(65466);
        }
      }
      int i = 0;
    }
  }

  public final boolean cEN()
  {
    boolean bool1 = false;
    AppMethodBeat.i(65458);
    boolean bool2;
    if (!cFj())
    {
      AppMethodBeat.o(65458);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      int i;
      if (bo.isNullOrNil(this.sAm.cJb))
        i = -5;
      while (true)
      {
        if (i != 0)
          break label351;
        if (!cFi())
          break label375;
        AppMethodBeat.o(65458);
        bool2 = true;
        break;
        if (this.sAm.xgA == 1)
        {
          i = -1;
        }
        else if (this.sAm.uaV > d.vxo)
        {
          ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "msgid %s clientVersion %d invalid ,curVer is %d", new Object[] { this.sAm.cJb, Integer.valueOf(this.sAm.uaV), Integer.valueOf(d.vxo) });
          i = -2;
        }
        else if (this.sAm.fRS != 0L)
        {
          long l1 = this.sAm.xgB;
          long l2 = this.sAm.fRS;
          if (System.currentTimeMillis() > l1 + l2 * 1000L)
          {
            ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "msgid %s expired", new Object[] { this.sAm.cJb });
            i = -3;
          }
        }
        else
        {
          if (aa.HV(1) >= this.sAm.tZU)
          {
            bool2 = true;
            label232: ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "h5 version valid ? %b, red.h5 %d, cur.h5 %s, red.timestamp %d, last rec.timestamp %d", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(this.sAm.tZU), Integer.valueOf(aa.HV(1)), Long.valueOf(this.sAm.xgz), Long.valueOf(cEZ()) });
            if ((aa.HV(1) < this.sAm.tZU) || (this.sAm.xgz <= cEZ()))
              break label341;
          }
          label341: for (i = 1; ; i = 0)
          {
            if (i != 0)
              break label346;
            i = -4;
            break;
            bool2 = false;
            break label232;
          }
          label346: i = 0;
        }
      }
      label351: if (i == -3)
      {
        an.a(this.sAm, 104, 1, 0, 0L, "");
        bNs();
      }
      label375: AppMethodBeat.o(65458);
      bool2 = bool1;
    }
  }

  public final boolean cEO()
  {
    AppMethodBeat.i(65459);
    boolean bool;
    if (!cFj())
    {
      AppMethodBeat.o(65459);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((cht)this.sAn.getLast() == null)
      {
        AppMethodBeat.o(65459);
        bool = false;
      }
      else
      {
        bool = true;
        AppMethodBeat.o(65459);
      }
    }
  }

  public final cht cEP()
  {
    return this.sAm;
  }

  public final void cEQ()
  {
    AppMethodBeat.i(65462);
    if (this.sAm != null)
      an.a(this.sAm.cJb, this.sAm.xgz, 1, 0, "", 0);
    AppMethodBeat.o(65462);
  }

  public final boolean cET()
  {
    boolean bool = true;
    if (this.sAm != null)
      if (this.sAm.uaW != 1);
    while (true)
    {
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }

  public final int cEU()
  {
    int i = 0;
    AppMethodBeat.i(65472);
    if (!cFj())
    {
      ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "getCmtRedDotCount %s", new Object[] { Integer.valueOf(0) });
      AppMethodBeat.o(65472);
    }
    while (true)
    {
      return i;
      ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "getCmtRedDotCount %s", new Object[] { Integer.valueOf(this.sAn.size()) });
      i = this.sAn.size();
      AppMethodBeat.o(65472);
    }
  }

  public final cht cEW()
  {
    AppMethodBeat.i(65474);
    synchronized (this.sAn)
    {
      if (bo.ek(this.sAn))
      {
        localcht = null;
        AppMethodBeat.o(65474);
        return localcht;
      }
      cht localcht = (cht)this.sAn.getLast();
      AppMethodBeat.o(65474);
    }
  }

  public final cht cEX()
  {
    AppMethodBeat.i(65475);
    synchronized (this.sAn)
    {
      if (bo.ek(this.sAn))
      {
        localcht = null;
        AppMethodBeat.o(65475);
        return localcht;
      }
      cht localcht = (cht)this.sAn.getFirst();
      AppMethodBeat.o(65475);
    }
  }

  public final boolean cEY()
  {
    AppMethodBeat.i(65478);
    boolean bool;
    if (!bo.ek(this.sAn))
      if (((cht)this.sAn.getLast()).uaW == 1)
      {
        AppMethodBeat.o(65478);
        bool = true;
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(65478);
      bool = false;
      continue;
      AppMethodBeat.o(65478);
      bool = false;
    }
  }

  public final boolean cFb()
  {
    AppMethodBeat.i(65482);
    boolean bool;
    if (!bo.isNullOrNil((String)g.RP().Ry().get(ac.a.xVT, "")))
    {
      bool = true;
      AppMethodBeat.o(65482);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65482);
    }
  }

  public final String cFc()
  {
    AppMethodBeat.i(65483);
    String str = (String)g.RP().Ry().get(ac.a.xVT, "");
    AppMethodBeat.o(65483);
    return str;
  }

  public final void cFd()
  {
    AppMethodBeat.i(65484);
    cht localcht = new cht();
    localcht.cJb = cFc();
    an.a(localcht, 106, 3, 0, 0L, "");
    abx("");
    AppMethodBeat.o(65484);
  }

  public final String cFe()
  {
    AppMethodBeat.i(65486);
    String str1 = (String)g.RP().Ry().get(ac.a.xVU, "");
    if (bo.isNullOrNil(str1))
    {
      str1 = "";
      AppMethodBeat.o(65486);
    }
    while (true)
    {
      return str1;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str1);
        str1 = localJSONObject.optString("msgId", "");
        AppMethodBeat.o(65486);
      }
      catch (JSONException localJSONException)
      {
        String str2 = "";
        AppMethodBeat.o(65486);
      }
    }
  }

  public final long cFf()
  {
    AppMethodBeat.i(65487);
    String str = (String)g.RP().Ry().get(ac.a.xVU, "");
    long l;
    if (bo.isNullOrNil(str))
    {
      AppMethodBeat.o(65487);
      l = 0L;
    }
    while (true)
    {
      return l;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        int i = localJSONObject.optInt("ts", 0);
        l = i;
        AppMethodBeat.o(65487);
      }
      catch (JSONException localJSONException)
      {
        AppMethodBeat.o(65487);
        l = 0L;
      }
    }
  }

  public final String cFg()
  {
    AppMethodBeat.i(65488);
    String str1 = (String)g.RP().Ry().get(ac.a.xVU, "");
    if (bo.isNullOrNil(str1))
    {
      str1 = "";
      AppMethodBeat.o(65488);
    }
    while (true)
    {
      return str1;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str1);
        str1 = localJSONObject.optString("extInfo");
        AppMethodBeat.o(65488);
      }
      catch (JSONException localJSONException)
      {
        String str2 = "";
        AppMethodBeat.o(65488);
      }
    }
  }

  public final void cFh()
  {
    AppMethodBeat.i(65489);
    m("", "", 0L);
    AppMethodBeat.o(65489);
  }

  public final boolean cFi()
  {
    AppMethodBeat.i(65490);
    JSONObject localJSONObject = ac.adL("discoverRecommendEntry");
    boolean bool;
    if (((com.tencent.mm.plugin.welab.a.a.a)g.K(com.tencent.mm.plugin.welab.a.a.a.class)).agO("labs_browse"))
    {
      if (!((com.tencent.mm.plugin.welab.a.a.a)g.K(com.tencent.mm.plugin.welab.a.a.a.class)).xj("labs_browse"))
        break label98;
      bool = true;
    }
    while (true)
    {
      ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "recommend show %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(65490);
      return bool;
      if (localJSONObject.optInt("entrySwitch") == 1)
        bool = true;
      else
        label98: bool = false;
    }
  }

  public final boolean cFj()
  {
    AppMethodBeat.i(65491);
    if (((d.vxo >= 654311424) || (d.vxs)) && (com.tencent.magicbrush.c.isNullOrNil(this.sAs)))
      this.sAs = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHF, "{\"tabs\":[{\"wording\":\"好看\",\"wording_cn\":\"好看\",\"wording_en\":\"Wow\",\"wording_hk\":\"好看\",\"wording_tw\":\"好看\",\"category\":110,\"showWhenRedDot\":1,\"tabInfo\":\"{\\\"category\\\":110}\"},{\"wording\":\"精选\",\"wording_cn\":\"精选\",\"wording_en\":\"Recommended\",\"wording_hk\":\"精選\",\"wording_tw\":\"精選\",\"category\":100,\"showWhenRedDot\":0,\"tabInfo\":\"{\\\"category\\\":100}\"}]}");
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(this.sAs);
      localObject = ((JSONObject)localObject).getJSONArray("tabs");
      for (int i = 0; i < ((JSONArray)localObject).length(); i++)
      {
        int j = ((JSONArray)localObject).getJSONObject(i).getInt("category");
        if (j == 110)
        {
          AppMethodBeat.o(65491);
          bool = true;
          return bool;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.TopStory.TopStoryRedDotImpl", "parse tabconfig failed: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(65491);
        boolean bool = false;
      }
    }
  }

  public final void i(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(65477);
    a(paramLong, paramBoolean, paramInt, true);
    AppMethodBeat.o(65477);
  }

  public final void lC(long paramLong)
  {
    AppMethodBeat.i(65464);
    A(paramLong, true);
    AppMethodBeat.o(65464);
  }

  public final void m(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(65485);
    ab.i("MicroMsg.TopStory.TopStoryRedDotImpl", "setUserIconRedDot %s, extInfo %s", new Object[] { paramString1, paramString2 });
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("msgId", paramString1);
      localJSONObject.put("extInfo", paramString2);
      localJSONObject.put("ts", paramLong);
      g.RP().Ry().set(ac.a.xVU, localJSONObject.toString());
      g.RP().Ry().dsb();
      if ((!bo.isNullOrNil(paramString1)) && (this.sAo != null))
        this.sAo.at(paramString1, paramLong);
      AppMethodBeat.o(65485);
      return;
    }
    catch (JSONException paramString2)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryRedDotImpl", paramString2, "setUserIconRedDot error", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.b
 * JD-Core Version:    0.6.2
 */