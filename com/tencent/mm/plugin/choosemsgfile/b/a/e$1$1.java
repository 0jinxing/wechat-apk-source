package com.tencent.mm.plugin.choosemsgfile.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.MsgFile;
import com.tencent.mm.choosemsgfile.compat.b.a;
import com.tencent.mm.plugin.choosemsgfile.b.b.a;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1$1
  implements b.a
{
  e$1$1(e.1 param1, b paramb)
  {
  }

  public final void bQ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(54263);
    this.kue.kuc.dL(paramInt1, paramInt2);
    AppMethodBeat.o(54263);
  }

  public final void m(int paramInt, String paramString)
  {
    AppMethodBeat.i(54262);
    ab.i("MicroMsg.MsgFileWorker_File", "DownloadCallback errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramInt == 0)
    {
      paramString = new MsgFile();
      paramString.fileSize = this.kue.kuc.ktT.bfp();
      paramString.filePath = this.kud.field_fileFullPath;
      paramString.fileName = this.kue.kuc.ktT.getFileName();
      paramString.type = "file";
      paramString.eov = this.kue.kuc.ktT.bfo();
      paramString.timeStamp = (this.kue.kuc.ktT.getTimeStamp() / 1000L);
      this.kue.kuc.b(paramString);
      AppMethodBeat.o(54262);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
      {
        this.kue.kuc.bfj();
        AppMethodBeat.o(54262);
      }
      else
      {
        ab.e("MicroMsg.MsgFileWorker_File", "download %s fail", new Object[] { this.kue.kuc.ktT });
        this.kue.kuc.bfk();
        AppMethodBeat.o(54262);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.a.e.1.1
 * JD-Core Version:    0.6.2
 */