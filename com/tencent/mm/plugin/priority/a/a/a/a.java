package com.tencent.mm.plugin.priority.a.a.a;

import android.text.format.DateFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.modelcontrol.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class a
{
  public static final boolean UE(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(97739);
    int i;
    int j;
    if ((t.mY(paramString)) && (t.nN(paramString)))
    {
      i = 1;
      if ((!t.kH(paramString)) || (t.nM(paramString)))
        break label61;
      j = 1;
      label39: if ((i == 0) && (j == 0))
        break label66;
      AppMethodBeat.o(97739);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label61: j = 0;
      break label39;
      label66: AppMethodBeat.o(97739);
    }
  }

  public static final boolean bZv()
  {
    boolean bool = false;
    AppMethodBeat.i(97740);
    if (!bZw())
      AppMethodBeat.o(97740);
    while (true)
    {
      return bool;
      if (!bZx())
      {
        AppMethodBeat.o(97740);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(97740);
      }
    }
  }

  public static final boolean bZw()
  {
    AppMethodBeat.i(97741);
    boolean bool;
    if (!b.afz())
    {
      bool = true;
      AppMethodBeat.o(97741);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(97741);
    }
  }

  public static final boolean bZx()
  {
    AppMethodBeat.i(97742);
    int i = bo.getInt(((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("ChatImgAutoDownload"), 1);
    boolean bool;
    if (i == 3)
    {
      ab.i("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "settings is not auto download C2C image. ChatImgAutoDownload : ".concat(String.valueOf(i)));
      AppMethodBeat.o(97742);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((i == 2) && (!at.isWifi(ah.getContext())))
      {
        AppMethodBeat.o(97742);
        bool = false;
      }
      else if (i == 1)
      {
        if (!at.isWifi(ah.getContext()))
        {
          bool = bZy();
          AppMethodBeat.o(97742);
        }
        else
        {
          AppMethodBeat.o(97742);
          bool = true;
        }
      }
      else
      {
        AppMethodBeat.o(97742);
        bool = false;
      }
    }
  }

  private static boolean bZy()
  {
    AppMethodBeat.i(97743);
    long l1 = bo.getInt(((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("ChatImgAutoDownloadMax"), 0);
    long l2 = bo.a((Long)g.RP().Ry().get(ac.a.xJY, null), 0L);
    long l3 = bo.anl((String)DateFormat.format("M", System.currentTimeMillis()));
    long l4 = bo.a((Long)g.RP().Ry().get(ac.a.xJZ, null), 0L);
    ab.d("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "currentmonth " + l3 + " month " + l4 + " maxcount " + l1 + " current " + l2);
    if (l3 != l4)
    {
      ab.i("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "update month %d ", new Object[] { Long.valueOf(l3) });
      g.RP().Ry().set(ac.a.xJY, Long.valueOf(0L));
      g.RP().Ry().set(ac.a.xJZ, Long.valueOf(l3));
      l2 = 0L;
    }
    if ((l2 > l1) && (l1 > 0L))
    {
      ab.i("MicroMsg.Priority.C2CMsgImgAutoDownloadControlLogic", "this month had auto download " + l2 + " C2C image, can not auto download.");
      AppMethodBeat.o(97743);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      AppMethodBeat.o(97743);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.a.a.a.a
 * JD-Core Version:    0.6.2
 */