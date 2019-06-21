package com.tencent.mm.pluginsdk.model;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.n;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.a.d;
import com.tencent.mm.plugin.m.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bh;
import java.util.HashMap;

final class j$b
  implements az.a
{
  private int eYk;
  private int eYl;
  String fUG;
  VideoTransPara fWR;
  String fileName;
  String hzq;
  boolean ozx = false;
  String toUser;
  int uPx;
  private boolean uPy;
  private int uPz = 0;
  int vbg;
  com.tencent.mm.bj.g vbj;

  public final boolean acf()
  {
    AppMethodBeat.i(50972);
    int j;
    while (true)
    {
      synchronized (j.dhh())
      {
        if (!j.bTq().containsKey(this.fileName))
        {
          i = 1;
          j = i;
          if (i == 0)
          {
            if (u.ut(this.fileName) == null)
              j = 1;
          }
          else
          {
            if (j == 0)
              break;
            ab.w("MicroMsg.ImportMultiVideo", "remuxing job has been removed, filename %s", new Object[] { this.fileName });
            AppMethodBeat.o(50972);
            return true;
          }
        }
        else
        {
          i = 0;
        }
      }
      j = 0;
    }
    boolean bool = WXHardCoderJNI.hcEncodeVideoEnable;
    int i = WXHardCoderJNI.hcEncodeVideoDelay;
    int k = WXHardCoderJNI.hcEncodeVideoCPU;
    int m = WXHardCoderJNI.hcEncodeVideoIO;
    if (WXHardCoderJNI.hcEncodeVideoThr)
    {
      j = Process.myTid();
      label126: j.zt(WXHardCoderJNI.startPerformance(bool, i, k, m, j, WXHardCoderJNI.hcEncodeVideoTimeout, 603, WXHardCoderJNI.hcEncodeVideoAction, "MicroMsg.ImportMultiVideo"));
      ab.i("MicroMsg.ImportMultiVideo", "hardcoder summerPerformance startPerformance: %s", new Object[] { Integer.valueOf(j.alV()) });
      if ((this.fWR == null) || (this.fWR.isDefault))
        break label304;
      this.eYk = this.fWR.width;
    }
    Object localObject3;
    for (this.eYl = this.fWR.height; ; this.eYl = ???[1])
    {
      localObject3 = new PString();
      ??? = new PInt();
      if ((!((a)com.tencent.mm.kernel.g.K(a.class)).XT().a(this.fUG, (PString)localObject3, (PInt)???)) || (com.tencent.mm.vfs.e.y(((PString)localObject3).value, this.hzq) < 0L))
        break label333;
      ab.i("MicroMsg.ImportMultiVideo", "copy remuxing file success, do not remuxing again.");
      this.uPx = ((PInt)???).value;
      this.uPy = true;
      AppMethodBeat.o(50972);
      break;
      j = 0;
      break label126;
      label304: ??? = new int[2];
      j.c(this.fUG, (int[])???);
      this.eYk = ???[0];
    }
    label333: long l = bo.yz();
    if (this.fWR != null)
    {
      ab.i("MicroMsg.ImportMultiVideo", "remuxing new para %s", new Object[] { this.fWR });
      if (com.tencent.mm.plugin.sight.base.b.qwX)
        this.fWR.videoBitrate = ((int)(this.fWR.videoBitrate * 0.915D));
      if (this.ozx)
      {
        h.pYm.a(354L, 245L, 1L, false);
        if (com.tencent.mm.bj.e.a(this.fUG, this.hzq, this.fWR) < 0)
          h.pYm.a(354L, 246L, 1L, false);
        label442: this.uPz = ((int)bo.az(l));
        ab.i("MicroMsg.ImportMultiVideo", "remuxing [%s] to [%s], result %d, resolution:[%d, %d]", new Object[] { this.fUG, this.hzq, Integer.valueOf(this.uPx), Integer.valueOf(this.eYk), Integer.valueOf(this.eYl) });
        if (this.uPx < 0)
          break label906;
        bool = true;
        label517: this.uPy = bool;
        localObject3 = new PInt();
        ??? = new PInt();
        if (u.a(this.hzq, (PInt)localObject3, (PInt)???))
          this.uPx = ((PInt)localObject3).value;
        if (this.uPy)
          break label912;
        ab.w("MicroMsg.ImportMultiVideo", "remuxing video error, copy source video to send.");
        com.tencent.mm.vfs.e.deleteFile(this.hzq);
        com.tencent.mm.vfs.e.y(this.fUG, this.hzq);
      }
    }
    while (true)
    {
      if (j.alV() != 0)
      {
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcEncodeVideoEnable, j.alV());
        ab.i("MicroMsg.ImportMultiVideo", "hardcoder summerPerformance stopPerformance %s", new Object[] { Integer.valueOf(j.alV()) });
        j.zt(0);
      }
      AppMethodBeat.o(50972);
      break;
      this.uPx = SightVideoJNI.remuxing(this.fUG, this.hzq, this.eYk, this.eYl, this.fWR.videoBitrate, this.fWR.fzV, 8, this.fWR.fzU, 25.0F, this.fWR.fps, null, 0, com.tencent.mm.plugin.sight.base.b.qwX);
      break label442;
      ab.w("MicroMsg.ImportMultiVideo", "remuxing but new para is null. %s", new Object[] { this.fileName });
      if (com.tencent.mm.plugin.sight.base.b.qwX)
        com.tencent.mm.plugin.sight.base.b.qwZ = (int)(com.tencent.mm.plugin.sight.base.b.qwZ * 0.915D);
      if (this.ozx)
      {
        this.fWR = new VideoTransPara();
        this.fWR.width = this.eYk;
        this.fWR.height = this.eYl;
        this.fWR.videoBitrate = com.tencent.mm.plugin.sight.base.b.qwZ;
        this.fWR.fzV = com.tencent.mm.plugin.sight.base.b.qwY;
        this.fWR.fzU = 2;
        this.fWR.fps = ((int)com.tencent.mm.plugin.sight.base.b.qxa);
        this.fWR.duration = com.tencent.mm.bj.e.ea(this.fUG);
        com.tencent.mm.bj.e.a(this.fUG, this.hzq, this.fWR);
        break label442;
      }
      this.uPx = SightVideoJNI.remuxing(this.fUG, this.hzq, this.eYk, this.eYl, com.tencent.mm.plugin.sight.base.b.qwZ, com.tencent.mm.plugin.sight.base.b.qwY, 8, 2, 25.0F, com.tencent.mm.plugin.sight.base.b.qxa, null, 0, com.tencent.mm.plugin.sight.base.b.qwX);
      break label442;
      label906: bool = false;
      break label517;
      label912: ab.i("MicroMsg.ImportMultiVideo", "remuxing video sucess,insert to media duplication storage");
      try
      {
        ??? = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)???).<init>(this.hzq);
        ??? = ((com.tencent.mm.vfs.b)???).getName();
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        Object localObject4 = this.hzq + ".tmp";
        localObject3 = new com/tencent/mm/pointers/PInt;
        ((PInt)localObject3).<init>(0);
        if (!d.b(this.hzq, (String)localObject4, (PInt)localObject3))
          break label1164;
        bool = com.tencent.mm.vfs.e.deleteFile(this.hzq);
        localObject3 = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)localObject3).<init>((String)localObject4);
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ab.i("MicroMsg.ImportMultiVideo", "fast start success. delOld[%b] rename[%b] path[%s] target[%s]", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(com.tencent.mm.vfs.e.h(((com.tencent.mm.vfs.b)localObject3).getParent() + "/", ((com.tencent.mm.vfs.b)localObject3).getName(), (String)???)), com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject3).dMD()), this.hzq });
        h.pYm.a(354L, 30L, 1L, false);
        ((a)com.tencent.mm.kernel.g.K(a.class)).XT().P(this.fUG, this.hzq, this.uPx);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ImportMultiVideo", "fast start exception e[%s]", new Object[] { localException.toString() });
      }
    }
    label1164: if (((PInt)localObject3).value != 1)
      h.pYm.a(354L, 31L, 1L, false);
    while (true)
    {
      ab.i("MicroMsg.ImportMultiVideo", "fast start fail. msg[%d] importpath[%s] targetPath[%s]", new Object[] { Integer.valueOf(((PInt)localObject3).value), this.fUG, this.hzq });
      break;
      h.pYm.a(354L, 32L, 1L, false);
      h.pYm.e(13836, new Object[] { Integer.valueOf(600), Long.valueOf(bo.anT()), this.hzq });
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(50973);
    while (true)
    {
      synchronized (j.dhh())
      {
        j.bTq().remove(this.fileName);
        if (this.uPy)
        {
          j.dU(this.hzq, this.vbg);
          j.f(this.uPy, this.fUG, this.hzq);
          if (!com.tencent.mm.plugin.sight.base.b.qwX)
            break label188;
          i = 1;
          j.a(i, this.uPz, this.fUG, this.hzq, this.uPx);
          if (this.vbg != 1)
            break label193;
          i = 8;
          if (!this.uPy)
            break label198;
          j = 1;
          n.alj().a(this.fUG, this.hzq, this.toUser, "", "", i, j);
          u.n(this.fileName, this.uPx, 43);
          u.uo(this.fileName);
          AppMethodBeat.o(50973);
          return false;
        }
      }
      j.dV(this.hzq, this.vbg);
      continue;
      label188: int i = 0;
      continue;
      label193: i = 1;
      continue;
      label198: int j = 3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.j.b
 * JD-Core Version:    0.6.2
 */