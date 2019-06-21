package com.tencent.mm.plugin.wepkg.version;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.w;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessTask;
import com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask;
import com.tencent.mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi.1;
import com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi.RemoteCgiTask;
import com.tencent.mm.plugin.wepkg.utils.WepkgRunCgi.a;
import com.tencent.mm.plugin.wepkg.utils.d;
import com.tencent.mm.protocal.protobuf.sh;
import com.tencent.mm.protocal.protobuf.si;
import com.tencent.mm.protocal.protobuf.ss;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class WepkgVersionUpdater
{
  public static void a(Set<String> paramSet, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(63682);
    if (paramSet == null)
      AppMethodBeat.o(63682);
    while (true)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      StringBuffer localStringBuffer1 = new StringBuffer();
      StringBuffer localStringBuffer2 = new StringBuffer();
      paramSet = paramSet.iterator();
      while (paramSet.hasNext())
      {
        String str = (String)paramSet.next();
        if (!bo.isNullOrNil(str))
        {
          localStringBuffer1.append(str);
          localStringBuffer1.append(";");
          ss localss = new ss();
          localss.mZV = str;
          localss.Scene = paramInt1;
          WepkgVersion localWepkgVersion = com.tencent.mm.plugin.wepkg.model.h.ahW(str);
          if (localWepkgVersion == null)
          {
            localss.jCh = "";
            localLinkedList.add(localss);
          }
          else
          {
            localss.jCh = localWepkgVersion.version;
            long l = localWepkgVersion.uXL;
            if (d.aNY() >= l)
            {
              localLinkedList.add(localss);
              com.tencent.mm.plugin.wepkg.model.h.ahZ(str);
            }
            else
            {
              localStringBuffer2.append(str);
              localStringBuffer2.append(";");
            }
          }
        }
      }
      ab.i("MicroMsg.Wepkg.WepkgVersionUpdater", "All wepkg list[%s] to update, excluded wepkg list[%s], scene:%d, downloadTriggerType:%d, isReportSize:%b", new Object[] { localStringBuffer1.toString(), localStringBuffer2.toString(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) });
      if (!bo.ek(localLinkedList))
        b(localLinkedList, paramInt2, paramBoolean);
      AppMethodBeat.o(63682);
    }
  }

  public static void a(Set<String> paramSet, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(63681);
    a(paramSet, paramInt, -1, paramBoolean);
    AppMethodBeat.o(63681);
  }

  private static void b(LinkedList<ss> paramLinkedList, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(63683);
    if (paramLinkedList.size() == 0)
      AppMethodBeat.o(63683);
    while (true)
    {
      return;
      WepkgNetSceneProcessTask localWepkgNetSceneProcessTask = new WepkgNetSceneProcessTask();
      WepkgNetSceneProcessTask.a(localWepkgNetSceneProcessTask, paramInt);
      WepkgNetSceneProcessTask.a(localWepkgNetSceneProcessTask, paramBoolean);
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        paramLinkedList = (ss)localIterator.next();
        WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq localWepkgCheckReq = new WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq((byte)0);
        WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq.a(localWepkgCheckReq, paramLinkedList.mZV);
        WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq.b(localWepkgCheckReq, paramLinkedList.jCh);
        WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq.a(localWepkgCheckReq, paramLinkedList.Scene);
        WepkgNetSceneProcessTask.a(localWepkgNetSceneProcessTask).add(localWepkgCheckReq);
      }
      if (ah.bqo())
      {
        d.aNS().aa(new WepkgVersionUpdater.1(localWepkgNetSceneProcessTask));
        AppMethodBeat.o(63683);
      }
      else
      {
        WepkgMainProcessService.a(localWepkgNetSceneProcessTask);
        AppMethodBeat.o(63683);
      }
    }
  }

  public static void r(List<String> paramList, int paramInt)
  {
    AppMethodBeat.i(63680);
    if (bo.ek(paramList))
      AppMethodBeat.o(63680);
    while (true)
    {
      return;
      HashSet localHashSet = new HashSet();
      localHashSet.addAll(paramList);
      a(localHashSet, paramInt, false);
      AppMethodBeat.o(63680);
    }
  }

  static final class WepkgNetSceneProcessTask extends BaseWepkgProcessTask
  {
    public static final Parcelable.Creator<WepkgNetSceneProcessTask> CREATOR;
    private int cTb;
    private List<WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq> uYi;
    private boolean uYj;

    static
    {
      AppMethodBeat.i(63679);
      CREATOR = new WepkgVersionUpdater.WepkgNetSceneProcessTask.2();
      AppMethodBeat.o(63679);
    }

    public WepkgNetSceneProcessTask()
    {
      AppMethodBeat.i(63674);
      this.uYi = new ArrayList();
      AppMethodBeat.o(63674);
    }

    private WepkgNetSceneProcessTask(Parcel paramParcel)
    {
      AppMethodBeat.i(63675);
      g(paramParcel);
      AppMethodBeat.o(63675);
    }

    public final void a(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(63678);
      paramParcel.writeList(this.uYi);
      paramParcel.writeInt(this.cTb);
      if (this.uYj);
      for (paramInt = 1; ; paramInt = 0)
      {
        paramParcel.writeByte((byte)paramInt);
        AppMethodBeat.o(63678);
        return;
      }
    }

    public final void asP()
    {
      AppMethodBeat.i(63676);
      if (bo.ek(this.uYi))
        AppMethodBeat.o(63676);
      while (true)
      {
        return;
        b.a locala = new b.a();
        locala.fsI = 1313;
        locala.fsL = 0;
        locala.fsM = 0;
        locala.uri = "/cgi-bin/mmgame-bin/checkwepkgversion";
        Object localObject1 = new sh();
        Iterator localIterator = this.uYi.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq)localIterator.next();
          localObject3 = new ss();
          ((ss)localObject3).mZV = WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq.a((WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq)localObject2);
          ((ss)localObject3).jCh = WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq.b((WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq)localObject2);
          ((ss)localObject3).Scene = WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq.c((WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq)localObject2);
          ((sh)localObject1).vZD.add(localObject3);
        }
        locala.fsJ = ((a)localObject1);
        locala.fsK = new si();
        com.tencent.mm.plugin.report.service.h.pYm.a(859L, 15L, 1L, false);
        Object localObject3 = locala.acD();
        Object localObject2 = new WepkgRunCgi.a()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, b paramAnonymousb)
          {
            AppMethodBeat.i(63668);
            if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.fsH.fsP == null))
            {
              ab.e("MicroMsg.Wepkg.WepkgVersionUpdater", "check wepkg version, cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.fsH.fsP });
              com.tencent.mm.plugin.report.service.h.pYm.a(859L, 16L, 1L, false);
              AppMethodBeat.o(63668);
            }
            while (true)
            {
              return;
              try
              {
                paramAnonymousb = (si)paramAnonymousb.fsH.fsP;
                al localal = d.aNS();
                paramAnonymousString = new com/tencent/mm/plugin/wepkg/version/WepkgVersionUpdater$WepkgNetSceneProcessTask$1$1;
                paramAnonymousString.<init>(this, paramAnonymousb);
                localal.aa(paramAnonymousString);
                AppMethodBeat.o(63668);
              }
              catch (Exception paramAnonymousString)
              {
                ab.e("MicroMsg.Wepkg.WepkgVersionUpdater", "get checkwepkgversion error");
                AppMethodBeat.o(63668);
              }
            }
          }
        };
        if (ah.bqo())
        {
          w.a((b)localObject3, new WepkgRunCgi.1((WepkgRunCgi.a)localObject2));
          AppMethodBeat.o(63676);
        }
        else
        {
          localObject1 = new WepkgRunCgi.RemoteCgiTask();
          d.bB(localObject1);
          ((WepkgRunCgi.RemoteCgiTask)localObject1).uYe = ((b)localObject3);
          ((WepkgRunCgi.RemoteCgiTask)localObject1).uYf = ((WepkgRunCgi.a)localObject2);
          ((WepkgRunCgi.RemoteCgiTask)localObject1).uYc = 1;
          WepkgMainProcessService.a((WepkgMainProcessTask)localObject1);
          AppMethodBeat.o(63676);
        }
      }
    }

    public final void asQ()
    {
    }

    public final void m(Parcel paramParcel)
    {
      AppMethodBeat.i(63677);
      if (this.uYi == null)
        this.uYi = new ArrayList();
      paramParcel.readList(this.uYi, WepkgVersionUpdater.WepkgNetSceneProcessTask.WepkgCheckReq.class.getClassLoader());
      this.cTb = paramParcel.readInt();
      if (paramParcel.readByte() != 0);
      for (boolean bool = true; ; bool = false)
      {
        this.uYj = bool;
        AppMethodBeat.o(63677);
        return;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.version.WepkgVersionUpdater
 * JD-Core Version:    0.6.2
 */