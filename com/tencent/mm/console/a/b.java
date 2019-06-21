package com.tencent.mm.console.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Process;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.websearch.api.ai;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.protocal.protobuf.bdi;
import com.tencent.mm.protocal.protobuf.bdj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
  implements a
{
  static
  {
    AppMethodBeat.i(16127);
    com.tencent.mm.pluginsdk.cmd.b.a(new b(), new String[] { "//fts" });
    AppMethodBeat.o(16127);
  }

  private static void E(Context paramContext, String paramString)
  {
    AppMethodBeat.i(16126);
    TextView localTextView = new TextView(paramContext);
    localTextView.setText(paramString);
    localTextView.setGravity(19);
    localTextView.setTextSize(1, 10.0F);
    localTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    localTextView.setTextColor(-16711936);
    localTextView.setTypeface(Typeface.MONOSPACE);
    int i = paramContext.getResources().getDimensionPixelSize(2131427776);
    localTextView.setPadding(i, i, i, i);
    com.tencent.mm.ui.base.h.a(paramContext, null, localTextView, null);
    AppMethodBeat.o(16126);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(16125);
    boolean bool;
    if (ab.getLogLevel() > 1)
    {
      bool = false;
      AppMethodBeat.o(16125);
    }
    while (true)
    {
      return bool;
      if (paramArrayOfString.length >= 2)
        break;
      bool = true;
      AppMethodBeat.o(16125);
    }
    paramString = paramArrayOfString[1];
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
      label144: switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
      break;
    case 104187309:
    case 819712873:
    case -1354714445:
    case 955180557:
    case 1873247692:
    case -1132164145:
    case 3237038:
    case -1183792455:
    case -617644996:
    case 967115467:
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(16125);
      break;
      if (!paramString.equals("msbiz"))
        break label144;
      i = 0;
      break label144;
      if (!paramString.equals("deletedb"))
        break label144;
      i = 1;
      break label144;
      if (!paramString.equals("copydb"))
        break label144;
      i = 2;
      break label144;
      if (!paramString.equals("corrupt"))
        break label144;
      i = 3;
      break label144;
      if (!paramString.equals("addchatroomcontact"))
        break label144;
      i = 4;
      break label144;
      if (!paramString.equals("clearconfig"))
        break label144;
      i = 5;
      break label144;
      if (!paramString.equals("info"))
        break label144;
      i = 6;
      break label144;
      if (!paramString.equals("insert"))
        break label144;
      i = 7;
      break label144;
      if (!paramString.equals("clearunread"))
        break label144;
      i = 8;
      break label144;
      if (!paramString.equals("inserttest"))
        break label144;
      i = 9;
      break label144;
      paramString = ai.cVo();
      paramArrayOfString = new StringBuilder();
      Object localObject = paramString.jBw.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramString = (bdi)((Iterator)localObject).next();
        paramArrayOfString.append(String.format("%s | %.2f | %s", new Object[] { s.mJ(paramString.vHl), Double.valueOf(paramString.wHm), com.tencent.mm.pluginsdk.f.h.formatTime("yyyy-MM-dd HH:mm", paramString.wHn / 1000L) }));
        paramArrayOfString.append("\n");
      }
      E(paramContext, paramArrayOfString.toString());
      continue;
      aw.ZK();
      paramContext = new com.tencent.mm.vfs.b(com.tencent.mm.model.c.Rt(), "FTS5IndexMicroMsg_encrypt.db");
      if (paramContext.exists())
        paramContext.delete();
      Process.killProcess(Process.myPid());
      continue;
      aw.ZK();
      paramContext = new com.tencent.mm.vfs.b(com.tencent.mm.model.c.Rt(), "FTS5IndexMicroMsg_encrypt.db");
      paramArrayOfString = new com.tencent.mm.vfs.b("/sdcard/IndexMicroMsg.db");
      if (paramArrayOfString.exists())
        paramArrayOfString.delete();
      e.y(j.w(paramContext.dMD()), j.w(paramArrayOfString.dMD()));
      continue;
      paramContext = new i();
      paramContext.hbo = 65522;
      ((n)g.M(n.class)).search(10000, paramContext);
      continue;
      paramContext = new i();
      paramContext.query = paramArrayOfString[2];
      paramContext.hbo = 65523;
      ((n)g.M(n.class)).search(10000, paramContext);
      continue;
      ac.a locala1 = ac.a.xQY;
      ac.a locala2 = ac.a.xQZ;
      ac.a locala3 = ac.a.xRa;
      paramArrayOfString = ac.a.xRb;
      ac.a locala4 = ac.a.xRc;
      ac.a locala5 = ac.a.xRd;
      ac.a locala6 = ac.a.xRe;
      ac.a locala7 = ac.a.xRf;
      ac.a locala8 = ac.a.xRg;
      ac.a locala9 = ac.a.xRh;
      ac.a locala10 = ac.a.xRi;
      ac.a locala11 = ac.a.xRj;
      ac.a locala12 = ac.a.xRk;
      ac.a locala13 = ac.a.xRl;
      ac.a locala14 = ac.a.xRm;
      ac.a locala15 = ac.a.xRn;
      paramString = ac.a.xRo;
      ac.a locala16 = ac.a.xRp;
      ac.a locala17 = ac.a.xRq;
      ac.a locala18 = ac.a.xRr;
      paramContext = ac.a.xRs;
      ac.a locala19 = ac.a.xRt;
      ac.a locala20 = ac.a.xRu;
      localObject = ac.a.xRv;
      ac.a locala21 = ac.a.xRw;
      ac.a locala22 = ac.a.xRx;
      for (i = 0; i < 26; i++)
      {
        ac.a locala23 = new ac.a[] { locala1, locala2, locala3, paramArrayOfString, locala4, locala5, locala6, locala7, locala8, locala9, locala10, locala11, locala12, locala13, locala14, locala15, paramString, locala16, locala17, locala18, paramContext, locala19, locala20, localObject, locala21, locala22 }[i];
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(locala23, "");
      }
      paramArrayOfString = new com.tencent.mm.vfs.b(com.tencent.mm.plugin.fts.a.c.mCx, "FTS5IndexMicroMsgInfo.txt");
      if (!paramArrayOfString.exists())
        continue;
      try
      {
        E(paramContext, e.cy(j.w(paramArrayOfString.dMD())));
      }
      catch (IOException paramContext)
      {
      }
      continue;
      paramContext = new i();
      paramContext.hbo = 65521;
      paramContext.mEt = 100;
      if (paramArrayOfString.length > 2);
      try
      {
        paramContext.mEt = Integer.valueOf(paramArrayOfString[2]).intValue();
        label1055: if (paramArrayOfString.length > 3)
          paramContext.talker = paramArrayOfString[3];
        ((n)g.M(n.class)).search(10000, paramContext);
        continue;
        paramContext = new i();
        paramContext.hbo = 65524;
        ((n)g.M(n.class)).search(10000, paramContext);
        continue;
        paramContext = new i();
        paramContext.hbo = 65525;
        ((n)g.M(n.class)).search(10000, paramContext);
      }
      catch (Exception paramString)
      {
        break label1055;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.b
 * JD-Core Version:    0.6.2
 */