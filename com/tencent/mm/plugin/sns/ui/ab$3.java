package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.a;
import com.tencent.mm.aw.e;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.bo;

final class ab$3
  implements Runnable
{
  ab$3(ab paramab)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38327);
    Object localObject;
    String str2;
    if (3 == this.rkw.rjH.getType())
    {
      this.rkw.isPlaying = true;
      localObject = (WXMusicObject)this.rkw.rjH.mediaObject;
      if (bo.isNullOrNil(((WXMusicObject)localObject).musicUrl))
        break label248;
      str1 = ((WXMusicObject)localObject).musicUrl;
      str2 = bo.bc(str1, "");
      if (bo.isNullOrNil(((WXMusicObject)localObject).musicDataUrl))
        break label256;
    }
    label256: for (String str1 = ((WXMusicObject)localObject).musicDataUrl; ; str1 = ((WXMusicObject)localObject).musicUrl)
    {
      str1 = bo.bc(str1, "");
      if (bo.isNullOrNil(this.rkw.cHr))
        this.rkw.cHr = System.currentTimeMillis();
      localObject = new e();
      ((e)localObject).fJS = 1;
      ((e)localObject).fJU = this.rkw.cHr;
      ((e)localObject).fJV = 0.0F;
      ((e)localObject).fJY = "";
      ((e)localObject).fKe = null;
      ((e)localObject).fJT = 1;
      ((e)localObject).fKd = null;
      ((e)localObject).fJW = this.rkw.rjH.title;
      ((e)localObject).fJX = this.rkw.rjH.description;
      ((e)localObject).fKc = str2;
      ((e)localObject).fKb = str1;
      ((e)localObject).fKa = str1;
      ((e)localObject).fKk = "";
      ((e)localObject).fKf = af.getAccPath();
      ((e)localObject).fKh = this.rkw.csB;
      a.b((e)localObject);
      AppMethodBeat.o(38327);
      return;
      label248: str1 = ((WXMusicObject)localObject).musicLowBandUrl;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ab.3
 * JD-Core Version:    0.6.2
 */