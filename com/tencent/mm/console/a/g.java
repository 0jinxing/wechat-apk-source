package com.tencent.mm.console.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Environment;
import android.text.method.ScrollingMovementMethod;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.Statistics;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class g
  implements a
{
  static
  {
    AppMethodBeat.i(16137);
    b.a(new g(), new String[] { "//disablesfs", "//exportsfs", "//sfsstat" });
    AppMethodBeat.o(16137);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(16136);
    paramString = paramArrayOfString[0];
    int i;
    label55: boolean bool2;
    switch (paramString.hashCode())
    {
    default:
      i = -1;
      switch (i)
      {
      default:
        AppMethodBeat.o(16136);
        bool2 = false;
      case 0:
      case 1:
      case 2:
      }
      break;
    case 1595670136:
    case 1218851436:
    case -1024646924:
    }
    while (true)
    {
      return bool2;
      if (!paramString.equals("//disablesfs"))
        break;
      i = 0;
      break label55;
      if (!paramString.equals("//exportsfs"))
        break;
      i = 1;
      break label55;
      if (!paramString.equals("//sfsstat"))
        break;
      i = 2;
      break label55;
      paramString = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/tencent/MicroMsg/disable-sfs");
      try
      {
        if ((paramArrayOfString.length > 0) && (!paramArrayOfString[1].equals("0")))
          paramString.createNewFile();
        while (true)
        {
          paramArrayOfString = new StringBuilder("Use SFS: ");
          if (paramString.exists())
            break label271;
          bool2 = true;
          Toast.makeText(paramContext, Boolean.toString(bool2), 0).show();
          AppMethodBeat.o(16136);
          bool2 = bool1;
          break;
          paramString.delete();
        }
      }
      catch (Exception paramArrayOfString)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.SFSCommand", paramArrayOfString, "Failed to operate flag file.", new Object[0]);
          continue;
          label271: bool2 = false;
        }
      }
      if (paramArrayOfString.length <= 1)
      {
        AppMethodBeat.o(16136);
        bool2 = false;
      }
      else
      {
        paramArrayOfString = paramArrayOfString[1];
        FileOp.tc(paramArrayOfString);
        Toast.makeText(paramContext, paramArrayOfString, 0).show();
        AppMethodBeat.o(16136);
        bool2 = bool1;
        continue;
        long l1 = System.currentTimeMillis();
        paramString = FileOp.aiP();
        paramArrayOfString = new StringBuilder(8192);
        Iterator localIterator = paramString.entrySet().iterator();
        while (localIterator.hasNext())
        {
          paramString = (Map.Entry)localIterator.next();
          paramArrayOfString.append("===== ").append((String)paramString.getKey()).append(" =====\n").append(((SFSContext.Statistics)paramString.getValue()).toString()).append("\n\n");
        }
        long l2 = System.currentTimeMillis();
        paramArrayOfString.append("elapsed: ").append(l2 - l1).append(" ms");
        paramString = new TextView(paramContext);
        paramString.setText(paramArrayOfString);
        paramString.setGravity(8388627);
        paramString.setTextSize(1, 10.0F);
        paramString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        paramString.setTextColor(-16744704);
        paramString.setTypeface(Typeface.MONOSPACE);
        paramString.setMovementMethod(new ScrollingMovementMethod());
        i = paramContext.getResources().getDimensionPixelSize(2131427776);
        paramString.setPadding(i, i, i, i);
        h.a(paramContext, null, paramString, null);
        AppMethodBeat.o(16136);
        bool2 = bool1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.g
 * JD-Core Version:    0.6.2
 */