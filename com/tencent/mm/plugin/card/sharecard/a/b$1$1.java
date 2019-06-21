package com.tencent.mm.plugin.card.sharecard.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.b.e;
import com.tencent.mm.plugin.card.model.am;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

final class b$1$1
  implements Runnable
{
  b$1$1(b.1 param1, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87981);
    Map localMap = (Map)am.bbb().getValue("key_share_user_info_map");
    Object localObject = localMap;
    if (localMap == null)
      localObject = new HashMap();
    ((Map)localObject).put(this.kfx.kfu, this.kfw);
    am.bbb().putValue("key_share_user_info_map", localObject);
    AppMethodBeat.o(87981);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.a.b.1.1
 * JD-Core Version:    0.6.2
 */