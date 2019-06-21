package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bh;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;
import java.util.HashMap;

final class d$b
  implements az.a
{
  private int eYk;
  private int eYl;
  String fUG;
  VideoTransPara fWR;
  String fileName;
  String hzq;
  d.a uPn;
  k uPo;
  int uPx;
  private boolean uPy;
  private int uPz = 0;

  public final boolean acf()
  {
    AppMethodBeat.i(26756);
    while (true)
    {
      synchronized (d.access$600())
      {
        int i;
        if (!d.bTp().containsKey(this.fileName))
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
            ab.w("MicroMsg.NoteVideoCompress", "remuxing job has been removed, filename %s", new Object[] { this.fileName });
            AppMethodBeat.o(26756);
            return true;
          }
        }
        else
        {
          i = 0;
        }
      }
      int j = 0;
    }
    if ((this.fWR != null) && (!this.fWR.isDefault))
      this.eYk = this.fWR.width;
    Object localObject3;
    for (this.eYl = this.fWR.height; ; this.eYl = ???[1])
    {
      ??? = new PString();
      localObject3 = new PInt();
      aw.ZK();
      if ((!c.XT().a(this.fUG, (PString)???, (PInt)localObject3)) || (e.y(((PString)???).value, this.hzq) < 0L))
        break label251;
      ab.i("MicroMsg.NoteVideoCompress", "copy remuxing file success, do not remuxing again.");
      this.uPx = ((PInt)localObject3).value;
      this.uPy = true;
      AppMethodBeat.o(26756);
      break;
      ??? = new int[2];
      d.c(this.fUG, (int[])???);
      this.eYk = ???[0];
    }
    label251: long l = bo.yz();
    if (this.fWR != null)
    {
      ab.i("MicroMsg.NoteVideoCompress", "remuxing new para %s", new Object[] { this.fWR });
      this.uPx = SightVideoJNI.remuxing(this.fUG, this.hzq, this.eYk, this.eYl, this.fWR.videoBitrate, this.fWR.fzV, 8, this.fWR.fzU, 25.0F, this.fWR.fps, null, 0, false);
      label340: this.uPz = ((int)bo.az(l));
      ab.i("MicroMsg.NoteVideoCompress", "remuxing [%s] to [%s], result %d, resolution:[%d, %d]", new Object[] { this.fUG, this.hzq, Integer.valueOf(this.uPx), Integer.valueOf(this.eYk), Integer.valueOf(this.eYl) });
      if (this.uPx < 0)
        break label564;
    }
    label564: for (boolean bool = true; ; bool = false)
    {
      this.uPy = bool;
      localObject3 = new PInt();
      ??? = new PInt();
      if (u.a(this.hzq, (PInt)localObject3, (PInt)???))
        this.uPx = ((PInt)localObject3).value;
      if (this.uPy)
        break label570;
      ab.w("MicroMsg.NoteVideoCompress", "remuxing video error, copy source video to send.");
      e.deleteFile(this.hzq);
      e.y(this.fUG, this.hzq);
      AppMethodBeat.o(26756);
      break;
      ab.w("MicroMsg.NoteVideoCompress", "remuxing but new para is null. %s", new Object[] { this.fileName });
      this.uPx = SightVideoJNI.remuxing(this.fUG, this.hzq, this.eYk, this.eYl, com.tencent.mm.plugin.sight.base.b.qwZ, com.tencent.mm.plugin.sight.base.b.qwY, 8, 2, 25.0F, com.tencent.mm.plugin.sight.base.b.qxa, null, 0, false);
      break label340;
    }
    label570: ab.i("MicroMsg.NoteVideoCompress", "remuxing video sucess,insert to media duplication storage");
    while (true)
    {
      PInt localPInt;
      try
      {
        localObject3 = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)localObject3).<init>(this.hzq);
        ??? = ((com.tencent.mm.vfs.b)localObject3).getName();
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = this.hzq + ".tmp";
        localPInt = new com/tencent/mm/pointers/PInt;
        localPInt.<init>(0);
        if (!com.tencent.mm.plugin.a.d.b(this.hzq, (String)localObject4, localPInt))
          break label800;
        bool = ((com.tencent.mm.vfs.b)localObject3).delete();
        localObject3 = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)localObject3).<init>((String)localObject4);
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ab.i("MicroMsg.NoteVideoCompress", "fast start success. delOld[%b] rename[%b] path[%s] target[%s]", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(e.h(((com.tencent.mm.vfs.b)localObject3).getParent() + "/", ((com.tencent.mm.vfs.b)localObject3).getName(), (String)???)), j.w(((com.tencent.mm.vfs.b)localObject3).dMD()), this.hzq });
        aw.ZK();
        c.XT().P(this.fUG, this.hzq, this.uPx);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.NoteVideoCompress", "fast start exception e[%s]", new Object[] { localException.toString() });
      }
      break;
      label800: ab.i("MicroMsg.NoteVideoCompress", "fast start fail. msg[%d] importpath[%s] targetPath[%s]", new Object[] { Integer.valueOf(localPInt.value), this.fUG, this.hzq });
    }
  }

  public final boolean acg()
  {
    AppMethodBeat.i(26757);
    synchronized (d.access$600())
    {
      d.bTp().remove(this.fileName);
      if (this.uPn != null)
        this.uPn.b(this.hzq, this.uPo);
      AppMethodBeat.o(26757);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.d.b
 * JD-Core Version:    0.6.2
 */