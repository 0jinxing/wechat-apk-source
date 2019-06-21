package com.tencent.rtmp;

import com.tencent.liteav.basic.util.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

class TXLivePusher$3
  implements Runnable
{
  TXLivePusher$3(TXLivePusher paramTXLivePusher, String paramString)
  {
  }

  public void run()
  {
    AppMethodBeat.i(65593);
    Object localObject = new File(this.val$videoFilePath).getParentFile();
    String str = new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(new Date(System.currentTimeMillis()));
    localObject = localObject + File.separator + String.format("TXUGCCover_%s.jpg", new Object[] { str });
    b.a(this.val$videoFilePath, (String)localObject);
    TXLivePusher.access$400(this.this$0, this.val$videoFilePath, (String)localObject);
    AppMethodBeat.o(65593);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.TXLivePusher.3
 * JD-Core Version:    0.6.2
 */