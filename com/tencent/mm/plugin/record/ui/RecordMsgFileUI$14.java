package com.tencent.mm.plugin.record.ui;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.io.File;
import java.util.Iterator;
import java.util.List;

final class RecordMsgFileUI$14
  implements Runnable
{
  RecordMsgFileUI$14(RecordMsgFileUI paramRecordMsgFileUI, List paramList, String paramString, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24270);
    File localFile = new File(n.c(RecordMsgFileUI.a(this.pKI), RecordMsgFileUI.b(this.pKI)));
    Iterator localIterator = this.pKJ.iterator();
    if (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      Object localObject1;
      if (localFile.exists())
      {
        localObject1 = RecordMsgFileUI.m(this.pKI);
        ab.d("MicroMsg.RecordMsgFileUI", "sendVideo::data path[%s] thumb path[%s]", new Object[] { localFile.getAbsolutePath(), localObject1 });
        if (RecordMsgFileUI.c(this.pKI) == 15)
          com.tencent.mm.plugin.messenger.a.g.bOk().a(this.pKI.mController.ylL, str1, localFile.getAbsolutePath(), (String)localObject1, 62, RecordMsgFileUI.a(this.pKI).duration, "");
      }
      while (true)
      {
        com.tencent.mm.plugin.messenger.a.g.bOk().eZ(this.mjK, str1);
        break;
        com.tencent.mm.plugin.messenger.a.g.bOk().a(this.pKI.mController.ylL, str1, localFile.getAbsolutePath(), (String)localObject1, 1, RecordMsgFileUI.a(this.pKI).duration, "");
        continue;
        Object localObject2 = RecordMsgFileUI.a(this.pKI).wgg;
        if (!bo.isNullOrNil((String)localObject2))
        {
          localObject1 = new WXVideoObject();
          ((WXVideoObject)localObject1).videoUrl = ((String)localObject2);
          localObject2 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject1);
          String str2 = bo.bc(RecordMsgFileUI.a(this.pKI).title, this.pKI.mController.ylL.getResources().getString(2131299761));
          ((WXMediaMessage)localObject2).mediaObject = ((WXMediaMessage.IMediaObject)localObject1);
          ((WXMediaMessage)localObject2).title = str2;
          ((WXMediaMessage)localObject2).description = RecordMsgFileUI.a(this.pKI).desc;
          ((WXMediaMessage)localObject2).thumbData = bo.readFromFile(n.f(RecordMsgFileUI.a(this.pKI), RecordMsgFileUI.b(this.pKI)));
          if (((WXMediaMessage)localObject2).thumbData == null)
          {
            localObject1 = new StringBuilder();
            aw.ZK();
            ((WXMediaMessage)localObject2).thumbData = bo.readFromFile(c.Yg() + "web/" + com.tencent.mm.a.g.x(bo.bc(RecordMsgFileUI.a(this.pKI).cvq, "").getBytes()));
          }
          l.a((WXMediaMessage)localObject2, "", "", str1, 3, null);
        }
      }
    }
    al.d(this.cfC);
    AppMethodBeat.o(24270);
  }

  public final String toString()
  {
    AppMethodBeat.i(24271);
    String str = super.toString() + "|onActivityResult1";
    AppMethodBeat.o(24271);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgFileUI.14
 * JD-Core Version:    0.6.2
 */