package com.tencent.mm.plugin.game.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.s;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.vfs.e;

public final class k
{
  public c mVZ;
  public boolean mWa = false;
  public int mode = 1;
  public int progress = 0;
  public int status = 0;

  public k(c paramc)
  {
    this.mVZ = paramc;
  }

  public final void bEj()
  {
    this.mode = 1;
    this.mWa = true;
  }

  public final void biT()
  {
    AppMethodBeat.i(111272);
    if (this.mVZ == null)
    {
      AppMethodBeat.o(111272);
      return;
    }
    switch (this.mode)
    {
    default:
      this.status = 0;
    case 1:
    }
    while (true)
    {
      label45: ab.i("MicroMsg.GameDownloadInfo", "Updating Download Status, AppId: %s, downloadMode: %d, downloadStatus: %d", new Object[] { this.mVZ.field_appId, Integer.valueOf(this.mode), Integer.valueOf(this.status) });
      AppMethodBeat.o(111272);
      break;
      FileDownloadTaskInfo localFileDownloadTaskInfo = d.bij().Ir(this.mVZ.field_appId);
      if (localFileDownloadTaskInfo.jrb != 0L)
      {
        this.progress = ((int)(localFileDownloadTaskInfo.kNr / localFileDownloadTaskInfo.jrb * 100.0D));
        label137: if (this.progress != 0)
          break label228;
      }
      label228: for (int i = 1; ; i = this.progress)
      {
        this.progress = i;
        ab.d("MicroMsg.GameDownloadInfo", "status = " + localFileDownloadTaskInfo.status);
        switch (localFileDownloadTaskInfo.status)
        {
        default:
          this.status = 0;
          break label45;
          this.progress = 0;
          break label137;
        case 1:
        case 2:
        case 0:
        case 3:
        case 4:
        }
      }
      this.status = 1;
      continue;
      this.status = 2;
      continue;
      this.status = 0;
      continue;
      if (e.ct(localFileDownloadTaskInfo.path))
      {
        this.status = 3;
      }
      else
      {
        this.status = 0;
        continue;
        if ((this.progress != 0) && (!at.isConnected(ah.getContext())))
          this.status = 2;
        else
          this.status = 0;
      }
    }
  }

  public final void ei(Context paramContext)
  {
    AppMethodBeat.i(111271);
    if (this.mVZ == null)
      AppMethodBeat.o(111271);
    while (true)
    {
      return;
      int i = this.mVZ.dnj;
      int j = this.mVZ.dnj;
      ab.i("MicroMsg.GameDownloadInfo", "AppId: %s, Initial downloadMode: %d", new Object[] { this.mVZ.field_appId, Integer.valueOf(i) });
      if (i == 2)
        j = 3;
      i = j;
      if (j == 3)
      {
        i = j;
        if (!g.u(paramContext, "wx3909f6add1206543"))
          i = 1;
      }
      j = i;
      if (i != 1)
      {
        paramContext = d.bij().Ir(this.mVZ.field_appId);
        if ((paramContext.status != 1) && (paramContext.status != 2))
        {
          j = i;
          if (paramContext.status != 3);
        }
        else
        {
          j = 1;
        }
      }
      this.mode = j;
      ab.i("MicroMsg.GameDownloadInfo", "AppId: %s, Final downloadMode: %d", new Object[] { this.mVZ.field_appId, Integer.valueOf(j) });
      AppMethodBeat.o(111271);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.k
 * JD-Core Version:    0.6.2
 */