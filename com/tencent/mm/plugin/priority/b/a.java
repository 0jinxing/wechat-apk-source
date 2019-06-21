package com.tencent.mm.plugin.priority.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Process;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.plugin.priority.PluginPriority;
import com.tencent.mm.plugin.priority.b.a.d;
import com.tencent.mm.protocal.protobuf.aul;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public final class a
  implements com.tencent.mm.pluginsdk.cmd.a
{
  public static boolean pgk = false;

  private static void E(Context paramContext, String paramString)
  {
    AppMethodBeat.i(54887);
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
    AppMethodBeat.o(54887);
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(54886);
    boolean bool;
    if (ab.getLogLevel() > 1)
    {
      bool = false;
      AppMethodBeat.o(54886);
    }
    while (true)
    {
      return bool;
      if (paramArrayOfString.length >= 2)
        break;
      bool = true;
      AppMethodBeat.o(54886);
    }
    Object localObject = paramArrayOfString[1];
    int i = -1;
    switch (((String)localObject).hashCode())
    {
    default:
      label104: switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      }
      break;
    case -1354714445:
    case 819712873:
    case -1424659792:
    case -1796087539:
    case 66125101:
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(54886);
      break;
      if (!((String)localObject).equals("copydb"))
        break label104;
      i = 0;
      break label104;
      if (!((String)localObject).equals("deletedb"))
        break label104;
      i = 1;
      break label104;
      if (!((String)localObject).equals("enabledebug"))
        break label104;
      i = 2;
      break label104;
      if (!((String)localObject).equals("printrate"))
        break label104;
      i = 3;
      break label104;
      if (!((String)localObject).equals("outlimit"))
        break label104;
      i = 4;
      break label104;
      ab.i("MicroMsg.Priority.PriorityCommand", "copydb");
      g.RQ();
      paramContext = new File(g.RP().cachePath, "MicroMsgPriority.db").getAbsolutePath();
      com.tencent.mm.vfs.e.deleteFile("/sdcard/tencent/MicroMsg/Download/priority.db");
      com.tencent.mm.vfs.e.y(paramContext, "/sdcard/tencent/MicroMsg/Download/priority.db");
      continue;
      ab.i("MicroMsg.Priority.PriorityCommand", "deletedb");
      g.RQ();
      com.tencent.mm.vfs.e.deleteFile(new File(g.RP().cachePath, "MicroMsgPriority.db").getAbsolutePath());
      Process.killProcess(Process.myPid());
      continue;
      ab.i("MicroMsg.Priority.PriorityCommand", "enabledebug %s", new Object[] { paramArrayOfString[2] });
      while (true)
      {
        try
        {
          if (!paramArrayOfString[2].equals("1"))
            break label366;
          bool = true;
          pgk = bool;
        }
        catch (Exception paramContext)
        {
          pgk = false;
        }
        break;
        label366: bool = false;
      }
      if ((paramArrayOfString.length > 2) && (t.kH(paramString)))
      {
        paramString = ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgImgUsageStorage().fC(paramString, paramArrayOfString[2]);
        paramArrayOfString = String.format("%s\n%s\n DayClickRate: %.2f\nWeekClickRate: %.2f\nMonthClickRate: %.2f", new Object[] { paramArrayOfString[2], ((b)g.K(b.class)).mJ(paramArrayOfString[2]), Double.valueOf(paramString[0]), Double.valueOf(paramString[1]), Double.valueOf(paramString[2]) });
        ab.i("MicroMsg.Priority.PriorityCommand", "printrate %s", new Object[] { paramArrayOfString });
        E(paramContext, paramArrayOfString);
      }
      else
      {
        localObject = new StringBuffer();
        if (t.kH(paramString))
        {
          paramArrayOfString = ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgImgUsageStorage().fC(paramString, "@all");
          Iterator localIterator = ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgImgUsageStorage().UH(paramString).iterator();
          while (localIterator.hasNext())
          {
            paramString = (aul)localIterator.next();
            ((StringBuffer)localObject).append("\n");
            ((StringBuffer)localObject).append(((b)g.K(b.class)).mJ(paramString.wyw));
            ((StringBuffer)localObject).append("[");
            ((StringBuffer)localObject).append(paramString.wyw);
            ((StringBuffer)localObject).append("][");
            ((StringBuffer)localObject).append(com.tencent.mm.pluginsdk.f.h.formatTime("yyyy-MM-dd", paramString.wyx / 1000L));
            ((StringBuffer)localObject).append("]");
            ((StringBuffer)localObject).append(String.format("%.2f %.2f %.2f %d", new Object[] { Float.valueOf(paramString.wyE), Float.valueOf(paramString.wyF), Float.valueOf(paramString.wyG), Integer.valueOf(paramString.wyC) }));
          }
        }
        while (true)
        {
          paramArrayOfString = String.format("DayClickRate: %.2f\nWeekClickRate: %.2f\nMonthClickRate: %.2f%s", new Object[] { Double.valueOf(paramArrayOfString[0]), Double.valueOf(paramArrayOfString[1]), Double.valueOf(paramArrayOfString[2]), ((StringBuffer)localObject).toString() });
          ab.i("MicroMsg.Priority.PriorityCommand", "printrate %s", new Object[] { paramArrayOfString });
          E(paramContext, paramArrayOfString);
          break;
          paramArrayOfString = ((PluginPriority)g.M(PluginPriority.class)).getC2CMsgImgUsageStorage().fC(paramString, paramString);
        }
        try
        {
          long l = Long.valueOf(paramArrayOfString[2]).longValue();
          ab.i("MicroMsg.Priority.PriorityCommand", "currentCount %d", new Object[] { Long.valueOf(l) });
          g.RP().Ry().set(ac.a.xJY, Long.valueOf(l));
        }
        catch (Exception paramContext)
        {
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.priority.b.a
 * JD-Core Version:    0.6.2
 */