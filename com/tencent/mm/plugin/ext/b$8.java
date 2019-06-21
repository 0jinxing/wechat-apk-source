package com.tencent.mm.plugin.ext;

import android.content.ContentValues;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.bp;
import java.util.Iterator;
import java.util.LinkedList;

final class b$8 extends ak
{
  b$8(b paramb, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(20267);
    label39: Object localObject1;
    Object localObject2;
    bp localbp;
    label290: ContentValues localContentValues;
    try
    {
      i = b.b(this.lPx).size();
      if (i <= 0)
      {
        AppMethodBeat.o(20267);
        return;
      }
      paramMessage = b.b(this.lPx).iterator();
      while (true)
      {
        if (!paramMessage.hasNext())
          break label361;
        localObject1 = (String)paramMessage.next();
        if (!"*".equals(localObject1))
        {
          localObject2 = g.bT((String)localObject1, false);
          if (localObject2 != null)
            break;
          ab.w("MicroMsg.SubCoreExt", "appInfo is null");
        }
      }
    }
    catch (Exception paramMessage)
    {
      do
      {
        while (true)
        {
          ab.e("MicroMsg.SubCoreExt", "exception in onAppInfoStgChange, %s", new Object[] { paramMessage.getMessage() });
          AppMethodBeat.o(20267);
          continue;
          if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((f)localObject2).field_appId))
          {
            ab.w("MicroMsg.SubCoreExt", "appId is null");
          }
          else
          {
            ab.d("MicroMsg.SubCoreExt", "onAppInfoStgChange, notify[%s], appFlag[%s], id[%s]", new Object[] { localObject1, Integer.valueOf(((f)localObject2).field_appInfoFlag), ((f)localObject2).field_appId });
            localObject1 = b.brA().apN(((f)localObject2).field_appId);
            if (localObject1 != null)
              break;
            ab.w("MicroMsg.SubCoreExt", "openMsgListener is null, appId = %s", new Object[] { ((f)localObject2).field_appId });
          }
        }
        if (!g.k((f)localObject2))
          break;
      }
      while (((com.tencent.mm.storage.bo)localObject1).field_status == 1);
      for (((com.tencent.mm.storage.bo)localObject1).field_status = 1; ; ((com.tencent.mm.storage.bo)localObject1).field_status = 0)
      {
        localbp = b.brA();
        localObject2 = ((f)localObject2).field_appId;
        if ((!com.tencent.mm.sdk.platformtools.bo.isNullOrNil((String)localObject2)) && (localObject1 != null) && (!com.tencent.mm.sdk.platformtools.bo.isNullOrNil(((com.tencent.mm.storage.bo)localObject1).field_appId)))
          break label290;
        ab.w("MicroMsg.OpenMsgListenerStorage", "wrong argument");
        break;
        if (((com.tencent.mm.storage.bo)localObject1).field_status == 0)
          break;
      }
      localContentValues = ((com.tencent.mm.storage.bo)localObject1).Hl();
      if (localContentValues.size() <= 0);
    }
    for (int i = localbp.bSd.update("OpenMsgListener", localContentValues, "appId=?", new String[] { com.tencent.mm.sdk.platformtools.bo.vA((String)localObject2) }); ; i = 0)
    {
      ab.d("MicroMsg.OpenMsgListenerStorage", "update: id=%s, ret=%s ", new Object[] { ((com.tencent.mm.storage.bo)localObject1).field_appId, Integer.valueOf(i) });
      break label39;
      label361: b.b(this.lPx).clear();
      AppMethodBeat.o(20267);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.b.8
 * JD-Core Version:    0.6.2
 */