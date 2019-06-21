package com.tencent.mm.storage;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.protocal.protobuf.ev;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.c.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class r$3
  implements a<Void, Void>
{
  public r$3(r paramr, List paramList)
  {
  }

  private Void asR()
  {
    AppMethodBeat.i(11856);
    long l = r.a(this.xIb).iV(Thread.currentThread().getId());
    Iterator localIterator = this.ibp.iterator();
    while (true)
      if (localIterator.hasNext())
      {
        q localq = (q)localIterator.next();
        if (localq.field_appMsgStatInfoProto == null)
          continue;
        ContentValues localContentValues = new ContentValues();
        try
        {
          localContentValues.put("appMsgStatInfoProto", localq.field_appMsgStatInfoProto.toByteArray());
          if (localContentValues.size() > 0)
            r.a(this.xIb).update("BizTimeLineInfo", localContentValues, "msgSvrId = ?", new String[] { localq.field_msgSvrId });
        }
        catch (IOException localIOException)
        {
          while (true)
            ab.e("MicroMsg.BizTimeLineInfoStorage", localIOException.getMessage());
        }
      }
    r.a(this.xIb).mB(l);
    AppMethodBeat.o(11856);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.r.3
 * JD-Core Version:    0.6.2
 */