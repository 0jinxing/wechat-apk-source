package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.av;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelcontrol.b;
import com.tencent.mm.modelvideo.f;
import com.tencent.mm.modelvideo.f.a;
import com.tencent.mm.modelvideo.i;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.bld;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class ar
  implements f.a
{
  boolean fVW;
  boolean fVX;
  f fWa;
  c qMM;
  c qMN;
  ay qMW;
  LinkedList<ay> qMX;
  Map<String, ay> qMY;
  LinkedList<com.tencent.mm.plugin.sns.storage.n> qMZ;
  c qNa;

  public ar()
  {
    AppMethodBeat.i(36657);
    this.qMX = null;
    this.qMY = null;
    this.fWa = null;
    this.qMZ = null;
    this.fVW = false;
    this.fVX = false;
    this.qNa = new ar.9(this);
    this.qMM = new ar.10(this);
    this.qMN = new c()
    {
    };
    this.qMW = null;
    this.qMX = new LinkedList();
    this.qMY = new HashMap();
    this.qMZ = new LinkedList();
    com.tencent.mm.sdk.b.a.xxA.c(this.qNa);
    com.tencent.mm.sdk.b.a.xxA.c(this.qMM);
    com.tencent.mm.sdk.b.a.xxA.c(this.qMN);
    AppMethodBeat.o(36657);
  }

  public final void a(f paramf, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(36660);
    if (paramf == null)
    {
      ab.e("MicroMsg.SnsVideoService", "%d on preload finish but scene is null?", new Object[] { Integer.valueOf(hashCode()) });
      AppMethodBeat.o(36660);
    }
    while (true)
    {
      return;
      if (this.fWa != paramf)
        ab.w("MicroMsg.SnsVideoService", "%d on preload finish, but scene callback not same object.", new Object[] { Integer.valueOf(hashCode()) });
      ab.i("MicroMsg.SnsVideoService", "%d preload video[%s] finish success[%b] range[%d, %d]", new Object[] { Integer.valueOf(hashCode()), paramf.alc(), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      g.RS().aa(new ar.4(this, paramf));
      AppMethodBeat.o(36660);
    }
  }

  final boolean a(ay paramay, boolean paramBoolean)
  {
    boolean bool1 = false;
    AppMethodBeat.i(36665);
    Object localObject1 = aq.a(paramay.cwT, paramay.cNr);
    if (!bo.isNullOrNil((String)localObject1))
    {
      ab.i("MicroMsg.SnsVideoService", "this video[%s] already download finish, do nothing. [%s, %s]", new Object[] { paramay.fUL, paramay.cwT, localObject1 });
      AppMethodBeat.o(36665);
      paramBoolean = bool1;
    }
    while (true)
    {
      return paramBoolean;
      boolean bool2 = com.tencent.mm.vfs.e.tf(aq.Yg(paramay.cNr.Id));
      localObject1 = aq.D(paramay.cNr);
      Object localObject2 = aq.Yh(paramay.cwT);
      if (localObject2 == null)
        aq.dd(paramay.cwT, paramay.egF);
      Object localObject3;
      while (true)
      {
        ab.i("MicroMsg.SnsVideoService", "prepare stream download sns video %s mkDir %b", new Object[] { localObject1, Boolean.valueOf(bool2) });
        localObject2 = new com.tencent.mm.plugin.sns.model.a.a(paramay.cNr.Id);
        ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qJh = paramay.cNr;
        localObject3 = az.dtl();
        ((az)localObject3).oyB = paramay.fDG;
        ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qNW = ((az)localObject3);
        ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qNU = true;
        ((com.tencent.mm.plugin.sns.model.a.a)localObject2).url = paramay.cNr.Url;
        ((com.tencent.mm.plugin.sns.model.a.a)localObject2).qNT = false;
        com.tencent.mm.modelvideo.n.alj();
        com.tencent.mm.modelvideo.o.alm();
        localObject1 = com.tencent.mm.al.e.a(((com.tencent.mm.plugin.sns.model.a.a)localObject2).qNW, ((com.tencent.mm.plugin.sns.model.a.a)localObject2).url, (String)localObject1, aq.ug(paramay.cwT), paramay.egD);
        if (localObject1 != null)
          break label275;
        AppMethodBeat.o(36665);
        paramBoolean = bool1;
        break;
        aq.c((s)localObject2, paramay.egF);
      }
      label275: localObject2 = paramay.qNS;
      ((com.tencent.mm.i.h)localObject1).egE = ((String)localObject2);
      ((com.tencent.mm.i.h)localObject1).cEV = ((String)localObject2);
      try
      {
        localObject2 = aj.p(af.cnF().YT(paramay.cwT));
        if (localObject2 != null)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((com.tencent.mm.i.h)localObject1).cFc = ((cbf)localObject2).vQE;
          ((com.tencent.mm.i.h)localObject1).egI = ((cbf)localObject2).xaF.wOd;
        }
        label356: this.qMW = paramay;
        this.qMW.fUL = ((com.tencent.mm.i.h)localObject1).field_mediaId;
        ab.i("MicroMsg.SnsVideoService", "start stream download sns video cdnMediaId %s delay %b", new Object[] { this.qMW.fUL, Boolean.valueOf(paramBoolean) });
        com.tencent.mm.modelvideo.o.alm().a((com.tencent.mm.i.h)localObject1, paramBoolean);
        AppMethodBeat.o(36665);
        paramBoolean = true;
      }
      catch (Exception localException)
      {
        break label356;
      }
    }
  }

  public final boolean a(bau parambau, int paramInt1, String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(36662);
    if (parambau.wEG == 2)
    {
      ab.w("MicroMsg.SnsVideoService", "add video task, but url is weixin, do nothing");
      AppMethodBeat.o(36662);
    }
    for (paramBoolean1 = bool; ; paramBoolean1 = true)
    {
      return paramBoolean1;
      ay localay = new ay();
      localay.fUL = aq.be(paramInt1, parambau.Url);
      localay.cNr = parambau;
      localay.fDG = paramInt1;
      localay.cwT = paramString;
      paramInt1 = i;
      if (paramBoolean1)
        paramInt1 = 1;
      localay.egD = paramInt1;
      localay.egF = paramInt2;
      g.RQ();
      g.RS().aa(new ar.6(this, localay, paramBoolean2));
      if (paramBoolean2)
        col();
      AppMethodBeat.o(36662);
    }
  }

  public final void coi()
  {
    AppMethodBeat.i(36658);
    ab.d("MicroMsg.SnsVideoService", "%d stop preload %s", new Object[] { Integer.valueOf(hashCode()), bo.dpG() });
    g.RS().aa(new ar.1(this));
    AppMethodBeat.o(36658);
  }

  final void coj()
  {
    AppMethodBeat.i(36659);
    g.RS().aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(36647);
        if (ar.this.qMW != null)
          AppMethodBeat.o(36647);
        while (true)
        {
          return;
          if (!ar.this.qMX.isEmpty())
          {
            AppMethodBeat.o(36647);
          }
          else if (ar.this.fWa != null)
          {
            AppMethodBeat.o(36647);
          }
          else if ((ar.this.fVW) || (ar.this.fVX))
          {
            AppMethodBeat.o(36647);
          }
          else
          {
            Object localObject1 = null;
            Object localObject3 = null;
            PBool localPBool = new PBool();
            PInt localPInt = new PInt();
            PString localPString = new PString();
            Object localObject6;
            Object localObject7;
            int i;
            while (true)
            {
              synchronized (ar.this.qMZ)
              {
                Iterator localIterator = ar.this.qMZ.iterator();
                localObject6 = localObject1;
                localObject7 = localObject3;
                if (!localIterator.hasNext())
                  break;
                localObject1 = (com.tencent.mm.plugin.sns.storage.n)localIterator.next();
                localObject7 = ar.this;
                if (localObject1 == null)
                {
                  localPBool.value = true;
                  i = 0;
                  if (localPBool.value)
                    localIterator.remove();
                  if (i == 0)
                    break label950;
                  i = localPInt.value;
                  localObject7 = localPString.value;
                  if (localObject1 != null)
                    break label615;
                  localObject3 = null;
                  localObject6 = localObject1;
                  localObject7 = localObject3;
                  if (localObject3 != null)
                    break;
                  localIterator.remove();
                }
              }
              if (bo.fp(((com.tencent.mm.plugin.sns.storage.n)localObject1).field_createTime) >= 86400L)
              {
                localPBool.value = true;
                i = 0;
              }
              else if (com.tencent.mm.modelvideo.o.aln().cX(false))
              {
                localPBool.value = true;
                i = 0;
              }
              else
              {
                localObject6 = aj.p((com.tencent.mm.plugin.sns.storage.n)localObject1);
                if ((localObject6 == null) || (((cbf)localObject6).xaF == null))
                {
                  ab.i("MicroMsg.SnsVideoService", "sns obj is null or sns obj PreDownloadInfo is null");
                  localPBool.value = true;
                  i = 0;
                }
                else
                {
                  ab.i("MicroMsg.SnsVideoService", "%d check sns video[%s] preload [%d %d %s]", new Object[] { Integer.valueOf(localObject7.hashCode()), ((com.tencent.mm.plugin.sns.storage.n)localObject1).cqU(), Integer.valueOf(((cbf)localObject6).xaF.wOd), Integer.valueOf(((cbf)localObject6).xaF.wOe), ((cbf)localObject6).xaF.wOf });
                  if (((cbf)localObject6).xaF.wOd <= 0)
                  {
                    ab.i("MicroMsg.SnsVideoService", "%d can not preload because percent <= 0", new Object[] { Integer.valueOf(localObject7.hashCode()) });
                    localPBool.value = true;
                    i = 0;
                  }
                  else
                  {
                    localObject7 = new java/lang/StringBuilder;
                    ((StringBuilder)localObject7).<init>();
                    localPString.value = ((cbf)localObject6).vQE;
                    localPInt.value = ((cbf)localObject6).xaF.wOd;
                    if (!b.rR(((cbf)localObject6).xaF.wOf))
                    {
                      if (at.isWifi(ah.getContext()))
                        i = ((cbf)localObject6).xaF.wOe & 0x1;
                      while (true)
                        if (i > 0)
                        {
                          localPBool.value = false;
                          i = 1;
                          break;
                          if (at.is4G(ah.getContext()))
                          {
                            i = ((cbf)localObject6).xaF.wOe & 0x2;
                          }
                          else if (at.is3G(ah.getContext()))
                          {
                            i = ((cbf)localObject6).xaF.wOe & 0x4;
                          }
                          else
                          {
                            localPBool.value = false;
                            i = 0;
                            break;
                          }
                        }
                    }
                    localPBool.value = false;
                    i = 0;
                    continue;
                    label615: localObject6 = (bau)((com.tencent.mm.plugin.sns.storage.n)localObject1).cqu().xfI.wbK.get(0);
                    ??? = ((com.tencent.mm.plugin.sns.storage.n)localObject1).cqU();
                    String str = aq.a((String)???, (bau)localObject6);
                    if (!bo.isNullOrNil(str))
                    {
                      ab.i("MicroMsg.SnsVideoService", "this video[%s] already download finish, do nothing.", new Object[] { str });
                      ??? = ((bau)localObject6).wFc;
                      long l = com.tencent.mm.vfs.e.asZ(str);
                      com.tencent.mm.modelvideo.o.aln().a((String)???, 3, l, ((com.tencent.mm.plugin.sns.storage.n)localObject1).field_userName, "", 0, "", ((bau)localObject6).Url, (String)localObject7);
                      com.tencent.mm.plugin.report.service.h.pYm.a(354L, 147L, 1L, false);
                      ??? = null;
                    }
                    else
                    {
                      boolean bool = com.tencent.mm.vfs.e.tf(aq.Yg(((bau)localObject6).Id));
                      str = aq.D((bau)localObject6);
                      Object localObject8 = aq.Yh((String)???);
                      if (localObject8 == null)
                        aq.dd((String)???, 30);
                      while (true)
                      {
                        ab.i("MicroMsg.SnsVideoService", "preload stream download sns video %s mkDir %b", new Object[] { str, Boolean.valueOf(bool) });
                        com.tencent.mm.plugin.sns.model.a.a locala = new com/tencent/mm/plugin/sns/model/a/a;
                        locala.<init>(((bau)localObject6).Id);
                        locala.qJh = ((bau)localObject6);
                        localObject8 = az.dtl();
                        ((az)localObject8).oyB = ((com.tencent.mm.plugin.sns.storage.n)localObject1).field_createTime;
                        locala.qNW = ((az)localObject8);
                        locala.qNU = true;
                        locala.url = ((bau)localObject6).Url;
                        locala.qNT = false;
                        com.tencent.mm.modelvideo.n.alj();
                        com.tencent.mm.modelvideo.o.alm();
                        ??? = com.tencent.mm.al.e.a(locala.qNW, locala.url, str, aq.ug((String)???), 2);
                        if (??? != null)
                          break label908;
                        ??? = null;
                        break;
                        aq.c((s)localObject8, 30);
                      }
                      label908: ((com.tencent.mm.i.h)???).cdx = ((bau)localObject6).wFc;
                      ((com.tencent.mm.i.h)???).field_preloadRatio = i;
                      ((com.tencent.mm.i.h)???).cFc = ((String)localObject7);
                      localObject6 = ((com.tencent.mm.plugin.sns.storage.n)localObject1).field_userName;
                      ((com.tencent.mm.i.h)???).egE = ((String)localObject6);
                      ((com.tencent.mm.i.h)???).cEV = ((String)localObject6);
                      continue;
                      label950: localObject1 = null;
                    }
                  }
                }
              }
            }
            if ((localObject6 == null) || (localObject7 == null))
            {
              AppMethodBeat.o(36647);
            }
            else
            {
              i = 0;
              if (localObject7 != null);
              while (true)
              {
                try
                {
                  ??? = ar.this;
                  localObject1 = new com/tencent/mm/modelvideo/f;
                  ((f)localObject1).<init>((com.tencent.mm.i.h)localObject7, ((com.tencent.mm.plugin.sns.storage.n)localObject6).cqU());
                  ((ar)???).fWa = ((f)localObject1);
                  if (ar.this.fWa.a(ar.this) < 0)
                  {
                    ab.w("MicroMsg.SnsVideoService", "%s curr preload task do scene error.", new Object[] { Integer.valueOf(ar.this.hashCode()) });
                    i = 1;
                    ar.this.fWa = null;
                  }
                  if (i == 0)
                    break label1219;
                  synchronized (ar.this.qMZ)
                  {
                    localObject1 = ar.this.qMZ.iterator();
                    if (!((Iterator)localObject1).hasNext())
                      break label1209;
                    localObject7 = (com.tencent.mm.plugin.sns.storage.n)((Iterator)localObject1).next();
                    if ((localObject7 == null) || (!bo.isEqual(((com.tencent.mm.plugin.sns.storage.n)localObject7).cqU(), ((com.tencent.mm.plugin.sns.storage.n)localObject6).cqU())))
                      continue;
                    ab.i("MicroMsg.SnsVideoService", "%d find sns info[%s], remove now", new Object[] { Integer.valueOf(ar.this.hashCode()), ((com.tencent.mm.plugin.sns.storage.n)localObject6).cqU() });
                    ((Iterator)localObject1).remove();
                  }
                }
                catch (Exception localException)
                {
                  ab.printErrStackTrace("MicroMsg.SnsVideoService", localException, "", new Object[0]);
                  AppMethodBeat.o(36647);
                }
                break;
                i = 1;
              }
              label1209: AppMethodBeat.o(36647);
              continue;
              label1219: AppMethodBeat.o(36647);
            }
          }
        }
      }
    });
    AppMethodBeat.o(36659);
  }

  // ERROR //
  final boolean cok()
  {
    // Byte code:
    //   0: ldc_w 392
    //   3: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 396	com/tencent/mm/sdk/platformtools/bo:yz	()J
    //   9: lstore_1
    //   10: ldc_w 398
    //   13: invokestatic 402	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   16: checkcast 398	com/tencent/mm/plugin/zero/b/a
    //   19: invokeinterface 406 1 0
    //   24: ldc_w 408
    //   27: iconst_1
    //   28: invokevirtual 414	com/tencent/mm/m/e:getInt	(Ljava/lang/String;I)I
    //   31: istore_3
    //   32: invokestatic 417	com/tencent/mm/sdk/platformtools/bo:anT	()J
    //   35: iload_3
    //   36: i2l
    //   37: ldc2_w 418
    //   40: lmul
    //   41: lsub
    //   42: lstore 4
    //   44: ldc 114
    //   46: ldc_w 421
    //   49: iconst_4
    //   50: anewarray 4	java/lang/Object
    //   53: dup
    //   54: iconst_0
    //   55: aload_0
    //   56: invokevirtual 120	java/lang/Object:hashCode	()I
    //   59: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   62: aastore
    //   63: dup
    //   64: iconst_1
    //   65: iconst_1
    //   66: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   69: aastore
    //   70: dup
    //   71: iconst_2
    //   72: sipush 130
    //   75: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   78: aastore
    //   79: dup
    //   80: iconst_3
    //   81: lload 4
    //   83: invokestatic 426	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   86: aastore
    //   87: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   90: invokestatic 430	com/tencent/mm/modelvideo/o:all	()Lcom/tencent/mm/modelvideo/t;
    //   93: sipush 130
    //   96: lload 4
    //   98: invokevirtual 436	com/tencent/mm/modelvideo/t:v	(IJ)Ljava/util/List;
    //   101: astore 6
    //   103: aload 6
    //   105: ifnull +13 -> 118
    //   108: aload 6
    //   110: invokeinterface 441 1 0
    //   115: ifeq +11 -> 126
    //   118: ldc_w 392
    //   121: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: iconst_0
    //   125: ireturn
    //   126: aload 6
    //   128: invokeinterface 445 1 0
    //   133: astore 7
    //   135: iconst_0
    //   136: istore_3
    //   137: aload 7
    //   139: invokeinterface 450 1 0
    //   144: ifeq +203 -> 347
    //   147: aload 7
    //   149: invokeinterface 454 1 0
    //   154: checkcast 456	com/tencent/mm/modelvideo/s
    //   157: astore 8
    //   159: aload 8
    //   161: ifnull -24 -> 137
    //   164: aload 8
    //   166: invokevirtual 459	com/tencent/mm/modelvideo/s:getFileName	()Ljava/lang/String;
    //   169: invokestatic 462	com/tencent/mm/plugin/sns/model/aq:Yf	(Ljava/lang/String;)Ljava/lang/String;
    //   172: astore 9
    //   174: invokestatic 298	com/tencent/mm/plugin/sns/model/af:cnF	()Lcom/tencent/mm/plugin/sns/storage/o;
    //   177: aload 9
    //   179: invokevirtual 304	com/tencent/mm/plugin/sns/storage/o:YT	(Ljava/lang/String;)Lcom/tencent/mm/plugin/sns/storage/n;
    //   182: invokevirtual 468	com/tencent/mm/plugin/sns/storage/n:cqu	()Lcom/tencent/mm/protocal/protobuf/TimeLineObject;
    //   185: getfield 474	com/tencent/mm/protocal/protobuf/TimeLineObject:xfI	Lcom/tencent/mm/protocal/protobuf/uf;
    //   188: getfield 479	com/tencent/mm/protocal/protobuf/uf:wbK	Ljava/util/LinkedList;
    //   191: iconst_0
    //   192: invokevirtual 483	java/util/LinkedList:get	(I)Ljava/lang/Object;
    //   195: checkcast 189	com/tencent/mm/protocal/protobuf/bau
    //   198: invokestatic 205	com/tencent/mm/plugin/sns/model/aq:D	(Lcom/tencent/mm/protocal/protobuf/bau;)Ljava/lang/String;
    //   201: astore 9
    //   203: aload 9
    //   205: invokestatic 182	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   208: ifne +220 -> 428
    //   211: new 485	com/tencent/mm/vfs/b
    //   214: astore 10
    //   216: aload 10
    //   218: aload 9
    //   220: invokespecial 486	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   223: aload 10
    //   225: invokevirtual 489	com/tencent/mm/vfs/b:exists	()Z
    //   228: ifeq +200 -> 428
    //   231: aload 10
    //   233: invokevirtual 492	com/tencent/mm/vfs/b:length	()J
    //   236: lstore 4
    //   238: ldc 114
    //   240: ldc_w 494
    //   243: iconst_5
    //   244: anewarray 4	java/lang/Object
    //   247: dup
    //   248: iconst_0
    //   249: aload 8
    //   251: invokevirtual 459	com/tencent/mm/modelvideo/s:getFileName	()Ljava/lang/String;
    //   254: aastore
    //   255: dup
    //   256: iconst_1
    //   257: lload 4
    //   259: invokestatic 426	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   262: aastore
    //   263: dup
    //   264: iconst_2
    //   265: aload 8
    //   267: getfield 497	com/tencent/mm/modelvideo/s:cFa	I
    //   270: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   273: aastore
    //   274: dup
    //   275: iconst_3
    //   276: aload 8
    //   278: getfield 500	com/tencent/mm/modelvideo/s:fXb	J
    //   281: invokestatic 426	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   284: aastore
    //   285: dup
    //   286: iconst_4
    //   287: aload 9
    //   289: aastore
    //   290: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   293: lload 4
    //   295: lconst_0
    //   296: lcmp
    //   297: ifle +131 -> 428
    //   300: lload 4
    //   302: aload 8
    //   304: getfield 497	com/tencent/mm/modelvideo/s:cFa	I
    //   307: i2l
    //   308: lcmp
    //   309: ifgt +119 -> 428
    //   312: aload 10
    //   314: invokevirtual 503	com/tencent/mm/vfs/b:delete	()Z
    //   317: pop
    //   318: iinc 3 1
    //   321: aload 8
    //   323: iconst_0
    //   324: putfield 497	com/tencent/mm/modelvideo/s:cFa	I
    //   327: aload 8
    //   329: iconst_1
    //   330: putfield 506	com/tencent/mm/modelvideo/s:bJt	I
    //   333: aload 8
    //   335: invokestatic 512	com/tencent/mm/modelvideo/u:f	(Lcom/tencent/mm/modelvideo/s;)Z
    //   338: pop
    //   339: goto -202 -> 137
    //   342: astore 8
    //   344: goto -207 -> 137
    //   347: getstatic 518	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   350: ldc2_w 519
    //   353: ldc2_w 521
    //   356: iload_3
    //   357: i2l
    //   358: iconst_0
    //   359: invokevirtual 525	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   362: ldc 114
    //   364: ldc_w 527
    //   367: iconst_4
    //   368: anewarray 4	java/lang/Object
    //   371: dup
    //   372: iconst_0
    //   373: aload_0
    //   374: invokevirtual 120	java/lang/Object:hashCode	()I
    //   377: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   380: aastore
    //   381: dup
    //   382: iconst_1
    //   383: aload 6
    //   385: invokeinterface 530 1 0
    //   390: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   393: aastore
    //   394: dup
    //   395: iconst_2
    //   396: iload_3
    //   397: invokestatic 126	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   400: aastore
    //   401: dup
    //   402: iconst_3
    //   403: lload_1
    //   404: invokestatic 534	com/tencent/mm/sdk/platformtools/bo:az	(J)J
    //   407: invokestatic 426	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   410: aastore
    //   411: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   414: ldc_w 392
    //   417: invokestatic 88	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   420: goto -296 -> 124
    //   423: astore 8
    //   425: goto -81 -> 344
    //   428: goto -107 -> 321
    //
    // Exception table:
    //   from	to	target	type
    //   164	293	342	java/lang/Exception
    //   300	318	342	java/lang/Exception
    //   321	339	423	java/lang/Exception
  }

  final void col()
  {
    AppMethodBeat.i(36664);
    g.RQ();
    g.RS().aa(new ar.7(this));
    AppMethodBeat.o(36664);
  }

  public final boolean s(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(36663);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(36663);
    }
    while (true)
    {
      return bool;
      g.RQ();
      g.RS().aa(new ar.5(this, paramString, paramArrayOfObject));
      bool = true;
      AppMethodBeat.o(36663);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ar
 * JD-Core Version:    0.6.2
 */