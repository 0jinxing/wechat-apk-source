package com.tencent.mm.plugin.ext;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bp;
import java.util.ArrayList;
import java.util.HashMap;

final class b$5
  implements h.a
{
  b$5(b paramb)
  {
  }

  public final void a(h arg1, h.c paramc)
  {
    AppMethodBeat.i(20263);
    if ((??? == null) || (paramc == null) || (paramc.oqK == null))
    {
      ab.e("MicroMsg.SubCoreExt", "onMsgChange, wrong args");
      AppMethodBeat.o(20263);
    }
    while (true)
    {
      return;
      synchronized (this.lPx)
      {
        Object localObject = b.brA().dui();
        if (localObject == null)
        {
          ab.i("MicroMsg.SubCoreExt", "onMsgChange onNotifyChange getValidOpenMsgListener cu == null");
          AppMethodBeat.o(20263);
        }
        else
        {
          ab.d("MicroMsg.SubCoreExt", "onMsgChange onNotifyChange listener count = %s", new Object[] { Integer.valueOf(((Cursor)localObject).getCount()) });
          if (((Cursor)localObject).getCount() <= 0)
          {
            ((Cursor)localObject).close();
            ab.i("MicroMsg.SubCoreExt", "onMsgChange onNotifyChange cu.getCount() <= 0");
            AppMethodBeat.o(20263);
          }
          else
          {
            ((Cursor)localObject).close();
            int i = 0;
            while (i < paramc.oqK.size())
            {
              bi localbi = (bi)paramc.oqK.get(i);
              if ((localbi != null) && (localbi.field_isSend == 0) && (localbi.field_status != 4) && (localbi.getType() != 9999) && (localbi.getType() != 10000) && (!t.nJ(localbi.field_talker)) && (!t.nN(localbi.field_talker)))
              {
                localObject = (Integer)b.a(this.lPx).get(localbi.field_talker);
                if (localObject == null)
                {
                  b.a(this.lPx).put(localbi.field_talker, Integer.valueOf(1));
                  ab.d("MicroMsg.SubCoreExt", "onMsgChange %s, %d", new Object[] { localbi.field_talker, Integer.valueOf(1) });
                }
              }
              else
              {
                i++;
                continue;
              }
              b.a(this.lPx).put(localbi.field_talker, Integer.valueOf(((Integer)localObject).intValue() + 1));
              ab.d("MicroMsg.SubCoreExt", "onMsgChange %s, %d", new Object[] { localbi.field_talker, Integer.valueOf(((Integer)localObject).intValue() + 1) });
            }
          }
        }
      }
    }
    if (b.a(this.lPx).size() > 0)
      this.lPx.brF();
    while (true)
    {
      AppMethodBeat.o(20263);
      break;
      ab.i("MicroMsg.SubCoreExt", "notifyMsgUsers.size < 1");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.b.5
 * JD-Core Version:    0.6.2
 */