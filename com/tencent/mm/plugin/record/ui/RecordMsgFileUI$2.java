package com.tencent.mm.plugin.record.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

final class RecordMsgFileUI$2
  implements Runnable
{
  RecordMsgFileUI$2(RecordMsgFileUI paramRecordMsgFileUI, List paramList, String paramString, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24253);
    Object localObject1 = n.c(RecordMsgFileUI.a(this.pKI), RecordMsgFileUI.b(this.pKI));
    Object localObject2 = new WXFileObject();
    ((WXFileObject)localObject2).setFilePath((String)localObject1);
    localObject1 = new WXMediaMessage();
    ((WXMediaMessage)localObject1).mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
    ((WXMediaMessage)localObject1).title = RecordMsgFileUI.a(this.pKI).title;
    ((WXMediaMessage)localObject1).description = RecordMsgFileUI.a(this.pKI).desc;
    ((WXMediaMessage)localObject1).thumbData = bo.readFromFile(n.f(RecordMsgFileUI.a(this.pKI), RecordMsgFileUI.b(this.pKI)));
    localObject2 = this.pKJ.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      l.a((WXMediaMessage)localObject1, "", "", str, 3, null);
      g.bOk().eZ(this.mjK, str);
    }
    al.d(this.cfC);
    AppMethodBeat.o(24253);
  }

  public final String toString()
  {
    AppMethodBeat.i(24254);
    String str = super.toString() + "|onActivityResult2";
    AppMethodBeat.o(24254);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgFileUI.2
 * JD-Core Version:    0.6.2
 */