package com.tencent.mm.plugin.wepkg.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.wepkg.utils.d;
import com.tencent.mm.protocal.protobuf.bkj;
import com.tencent.mm.protocal.protobuf.cvm;
import com.tencent.mm.protocal.protobuf.cvo;
import com.tencent.mm.protocal.protobuf.cvp;
import com.tencent.mm.protocal.protobuf.cvq;
import com.tencent.mm.protocal.protobuf.cvr;
import com.tencent.mm.protocal.protobuf.cvs;
import com.tencent.mm.protocal.protobuf.cvt;
import com.tencent.mm.protocal.protobuf.cvu;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class h
{
  public static void a(int paramInt1, String paramString1, String paramString2, String paramString3, long paramLong, String paramString4, String paramString5, int paramInt2, a parama)
  {
    AppMethodBeat.i(63583);
    WepkgDownloadProcessTask localWepkgDownloadProcessTask = new WepkgDownloadProcessTask();
    localWepkgDownloadProcessTask.fileType = paramInt1;
    localWepkgDownloadProcessTask.cSY = paramString1;
    localWepkgDownloadProcessTask.downloadUrl = paramString3;
    localWepkgDownloadProcessTask.uXf = paramLong;
    localWepkgDownloadProcessTask.version = paramString4;
    localWepkgDownloadProcessTask.cvZ = paramString5;
    localWepkgDownloadProcessTask.uWQ = paramInt2;
    if (ah.bqo())
    {
      d.aNS().aa(new h.1(localWepkgDownloadProcessTask, parama, paramInt1, paramString1, paramString2, paramString3, paramLong, paramString4, paramString5, paramInt2));
      AppMethodBeat.o(63583);
    }
    while (true)
    {
      return;
      localWepkgDownloadProcessTask.hww = new h.2(parama, localWepkgDownloadProcessTask);
      localWepkgDownloadProcessTask.aBV();
      WepkgMainProcessService.a(localWepkgDownloadProcessTask);
      AppMethodBeat.o(63583);
    }
  }

  public static void a(bkj parambkj, int paramInt)
  {
    AppMethodBeat.i(63584);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 2002;
    Object localObject1 = localWepkgCrossProcessTask.uWY;
    Object localObject2;
    Object localObject3;
    if (parambkj != null)
    {
      ((WepkgVersion)localObject1).eBS = parambkj.mZV;
      localObject2 = parambkj.wNv;
      localObject3 = parambkj.wNw;
      if (localObject2 != null)
      {
        ((WepkgVersion)localObject1).appId = ((cvr)localObject2).fKh;
        localObject2 = ((cvr)localObject2).xrH;
        if (localObject2 != null)
        {
          ((WepkgVersion)localObject1).version = ((cvo)localObject2).xrA;
          ((WepkgVersion)localObject1).uXG = ((cvo)localObject2).xrB;
          ((WepkgVersion)localObject1).uXH = ((cvo)localObject2).xrC;
          ((WepkgVersion)localObject1).uXI = ((cvo)localObject2).xrD;
        }
      }
      if (localObject3 != null)
      {
        ((WepkgVersion)localObject1).cSx = ((cvu)localObject3).xrK;
        ((WepkgVersion)localObject1).charset = ((cvu)localObject3).xql;
        localObject2 = ((cvu)localObject3).xrL;
        if ((localObject2 == null) || (((cvm)localObject2).xrx == null) || (bo.isNullOrNil(((cvm)localObject2).xrx.vMJ)))
          break label651;
        ((WepkgVersion)localObject1).cvZ = ((cvm)localObject2).xrx.Md5;
        ((WepkgVersion)localObject1).downloadUrl = ((cvm)localObject2).xrx.vMJ;
        ((WepkgVersion)localObject1).uXK = ((cvm)localObject2).xrx.xrF;
        ((WepkgVersion)localObject1).uWQ = ((cvm)localObject2).xrx.xrE;
        ((WepkgVersion)localObject1).uXM = false;
        localObject3 = ((cvu)localObject3).xrM;
        if (localObject3 != null)
          ((WepkgVersion)localObject1).uXO = ((cvt)localObject3).xrJ;
        if ((localObject3 == null) || (bo.ek(((cvt)localObject3).xrI)) || (!((cvt)localObject3).xrJ))
          break label659;
      }
    }
    label651: label659: for (((WepkgVersion)localObject1).uXN = false; ; ((WepkgVersion)localObject1).uXN = true)
    {
      ((WepkgVersion)localObject1).uXP = 0;
      ((WepkgVersion)localObject1).cTb = paramInt;
      localObject3 = localWepkgCrossProcessTask.uXa;
      if ((parambkj != null) && (parambkj.wNw != null) && (parambkj.wNw.xrL != null) && (parambkj.wNw.xrL.xrx != null) && (parambkj.wNw.xrL.xrx.xrG != null) && (!bo.isNullOrNil(parambkj.wNw.xrL.xrx.xrG.vMJ)))
      {
        localObject1 = parambkj.wNw.xrL.xrx.xrG;
        ((WePkgDiffInfo)localObject3).version = parambkj.wNv.xrH.xrA;
        ((WePkgDiffInfo)localObject3).eBS = parambkj.mZV;
        ((WePkgDiffInfo)localObject3).downloadUrl = ((cvs)localObject1).vMJ;
        ((WePkgDiffInfo)localObject3).cvZ = ((cvs)localObject1).Md5;
        ((WePkgDiffInfo)localObject3).fileSize = ((cvs)localObject1).xrF;
        ((WePkgDiffInfo)localObject3).uWQ = ((cvs)localObject1).xrE;
      }
      localObject3 = parambkj.wNw.xrM;
      if ((localObject3 == null) || (bo.ek(((cvt)localObject3).xrI)))
        break label672;
      localObject1 = new ArrayList();
      localObject2 = ((cvt)localObject3).xrI.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        cvq localcvq = (cvq)((Iterator)localObject2).next();
        localObject3 = new WepkgPreloadFile();
        String str = parambkj.mZV;
        Object localObject4 = parambkj.wNv.xrH.xrA;
        if (localcvq != null)
        {
          ((WepkgPreloadFile)localObject3).key = d.hA(str, localcvq.wjQ);
          ((WepkgPreloadFile)localObject3).eBS = str;
          ((WepkgPreloadFile)localObject3).version = ((String)localObject4);
          ((WepkgPreloadFile)localObject3).uXe = localcvq.wjQ;
          ((WepkgPreloadFile)localObject3).mimeType = localcvq.wjS;
          localObject4 = localcvq.xrx;
          if (localObject4 != null)
          {
            ((WepkgPreloadFile)localObject3).cvZ = ((cvp)localObject4).Md5;
            ((WepkgPreloadFile)localObject3).downloadUrl = ((cvp)localObject4).vMJ;
            ((WepkgPreloadFile)localObject3).size = ((cvp)localObject4).xrF;
            ((WepkgPreloadFile)localObject3).uWQ = ((cvp)localObject4).xrE;
          }
          ((WepkgPreloadFile)localObject3).uXr = false;
        }
        ((List)localObject1).add(localObject3);
      }
      ((WepkgVersion)localObject1).uXM = true;
      break;
    }
    localWepkgCrossProcessTask.uXc = ((List)localObject1);
    label672: if (ah.bqo())
    {
      localWepkgCrossProcessTask.asP();
      AppMethodBeat.o(63584);
    }
    while (true)
    {
      return;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
      AppMethodBeat.o(63584);
    }
  }

  public static void a(String paramString, a parama)
  {
    AppMethodBeat.i(63581);
    final WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 3002;
    localWepkgCrossProcessTask.uWY.eBS = paramString;
    if (ah.bqo())
    {
      localWepkgCrossProcessTask.asP();
      AppMethodBeat.o(63581);
    }
    while (true)
    {
      return;
      localWepkgCrossProcessTask.hww = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(63574);
          if (this.uXt != null)
            this.uXt.a(localWepkgCrossProcessTask);
          localWepkgCrossProcessTask.aBW();
          AppMethodBeat.o(63574);
        }
      };
      localWepkgCrossProcessTask.aBV();
      WepkgMainProcessService.a(localWepkgCrossProcessTask);
      AppMethodBeat.o(63581);
    }
  }

  public static void a(String paramString1, String paramString2, String paramString3, a parama)
  {
    AppMethodBeat.i(63586);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 4002;
    localWepkgCrossProcessTask.uXb.eBS = paramString1;
    localWepkgCrossProcessTask.uXb.uXe = paramString2;
    localWepkgCrossProcessTask.uXb.filePath = paramString3;
    localWepkgCrossProcessTask.uXb.uXr = false;
    if (ah.bqo())
    {
      d.aNS().aa(new h.3(localWepkgCrossProcessTask, parama));
      AppMethodBeat.o(63586);
    }
    while (true)
    {
      return;
      localWepkgCrossProcessTask.hww = new h.4(parama, localWepkgCrossProcessTask);
      localWepkgCrossProcessTask.aBV();
      WepkgMainProcessService.a(localWepkgCrossProcessTask);
      AppMethodBeat.o(63586);
    }
  }

  public static void a(String paramString1, String paramString2, boolean paramBoolean, a parama)
  {
    AppMethodBeat.i(63582);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 3005;
    localWepkgCrossProcessTask.uWY.eBS = paramString1;
    localWepkgCrossProcessTask.uWY.gSP = paramString2;
    localWepkgCrossProcessTask.uWY.uXM = paramBoolean;
    if (ah.bqo())
    {
      d.aNS().aa(new h.9(localWepkgCrossProcessTask, parama));
      AppMethodBeat.o(63582);
    }
    while (true)
    {
      return;
      localWepkgCrossProcessTask.hww = new h.10(parama, localWepkgCrossProcessTask);
      localWepkgCrossProcessTask.aBV();
      WepkgMainProcessService.a(localWepkgCrossProcessTask);
      AppMethodBeat.o(63582);
    }
  }

  public static WepkgVersion ahW(String paramString)
  {
    AppMethodBeat.i(63579);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 3001;
    localWepkgCrossProcessTask.uWY.eBS = paramString;
    if (ah.bqo())
    {
      localWepkgCrossProcessTask.asP();
      if (localWepkgCrossProcessTask.uWY != null)
        break label64;
      paramString = null;
      AppMethodBeat.o(63579);
    }
    while (true)
    {
      return paramString;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
      break;
      label64: paramString = localWepkgCrossProcessTask.uWY;
      AppMethodBeat.o(63579);
    }
  }

  public static WepkgVersion ahX(String paramString)
  {
    AppMethodBeat.i(63580);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 3002;
    localWepkgCrossProcessTask.uWY.eBS = paramString;
    if (ah.bqo())
    {
      localWepkgCrossProcessTask.asP();
      if (localWepkgCrossProcessTask.uWY != null)
        break label64;
      paramString = null;
      AppMethodBeat.o(63580);
    }
    while (true)
    {
      return paramString;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
      break;
      label64: paramString = localWepkgCrossProcessTask.uWY;
      AppMethodBeat.o(63580);
    }
  }

  public static List<WepkgPreloadFile> ahY(String paramString)
  {
    AppMethodBeat.i(63585);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 4001;
    localWepkgCrossProcessTask.uWY.eBS = paramString;
    if (ah.bqo())
      localWepkgCrossProcessTask.asP();
    while (true)
    {
      paramString = localWepkgCrossProcessTask.uXc;
      AppMethodBeat.o(63585);
      return paramString;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
    }
  }

  public static void ahZ(String paramString)
  {
    AppMethodBeat.i(63587);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 3003;
    localWepkgCrossProcessTask.uWY.eBS = paramString;
    if (ah.bqo())
    {
      d.aNS().aa(new h.5(localWepkgCrossProcessTask));
      AppMethodBeat.o(63587);
    }
    while (true)
    {
      return;
      WepkgMainProcessService.a(localWepkgCrossProcessTask);
      AppMethodBeat.o(63587);
    }
  }

  public static List<WepkgPreloadFile> aia(String paramString)
  {
    AppMethodBeat.i(63588);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 4003;
    localWepkgCrossProcessTask.uWY.eBS = paramString;
    if (ah.bqo())
      localWepkgCrossProcessTask.asP();
    while (true)
    {
      paramString = localWepkgCrossProcessTask.uXc;
      AppMethodBeat.o(63588);
      return paramString;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
    }
  }

  public static void aib(String paramString)
  {
    AppMethodBeat.i(63589);
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 2006;
    localWepkgCrossProcessTask.uWY.eBS = paramString;
    if (ah.bqo())
    {
      localWepkgCrossProcessTask.asP();
      AppMethodBeat.o(63589);
    }
    while (true)
    {
      return;
      WepkgMainProcessService.b(localWepkgCrossProcessTask);
      AppMethodBeat.o(63589);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.h
 * JD-Core Version:    0.6.2
 */