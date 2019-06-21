package com.tencent.mm.plugin.brandservice.ui.timeline.offenread;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.chc;
import com.tencent.mm.protocal.protobuf.chd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  static chc jQA;

  public static boolean FG(String paramString)
  {
    AppMethodBeat.i(14343);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(14343);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = aWL();
      if (localObject == null)
      {
        AppMethodBeat.o(14343);
        bool = false;
      }
      else
      {
        localObject = ((chc)localObject).xfW;
        if (bo.ek((List)localObject))
        {
          AppMethodBeat.o(14343);
          bool = false;
        }
        else
        {
          Iterator localIterator = ((LinkedList)localObject).iterator();
          while (true)
            if (localIterator.hasNext())
            {
              localObject = (chd)localIterator.next();
              if ((localObject != null) && (paramString.equals(((chd)localObject).vGE)))
              {
                bool = true;
                AppMethodBeat.o(14343);
                break;
              }
            }
          AppMethodBeat.o(14343);
          bool = false;
        }
      }
    }
  }

  public static chc aWL()
  {
    AppMethodBeat.i(14342);
    chc localchc;
    if (jQA != null)
    {
      localchc = jQA;
      AppMethodBeat.o(14342);
    }
    while (true)
    {
      return localchc;
      Object localObject2 = (String)g.RP().Ry().get(ac.a.xVn, "");
      if (bo.isNullOrNil((String)localObject2))
      {
        AppMethodBeat.o(14342);
        localchc = null;
      }
      else
      {
        localchc = new chc();
        localObject2 = Base64.decode((String)localObject2, 0);
        try
        {
          localchc.parseFrom((byte[])localObject2);
          jQA = localchc;
          AppMethodBeat.o(14342);
        }
        catch (IOException localIOException)
        {
          ab.e("MicroMsg.BizTimeLineOftenReadHelper", "getOftenRead exp: %s", new Object[] { localIOException.getMessage() });
          AppMethodBeat.o(14342);
          Object localObject1 = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.offenread.d
 * JD-Core Version:    0.6.2
 */