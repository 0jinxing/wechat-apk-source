package com.tencent.mm.console.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.g;
import com.tencent.mm.ui.base.h;
import java.util.Map;

public final class j
  implements a
{
  static
  {
    AppMethodBeat.i(16143);
    b.a(new j(), new String[] { "//version" });
    AppMethodBeat.o(16143);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(16142);
    paramString = new StringBuilder();
    paramString.append(String.format("[ver  ] %s %08X\n", new Object[] { g.d(paramContext, d.vxo, true), Integer.valueOf(d.vxo) }));
    paramString.append(f.aZm());
    paramString.append(String.format("[cid  ] %d\n", new Object[] { Integer.valueOf(g.cdf) }));
    paramString.append(String.format("[s.ver] %d\n", new Object[] { Integer.valueOf(aa.HV(0)) }));
    paramString.append(String.format("[r.ver] %s\n", new Object[] { "0x27000435" }));
    if (f.EX_DEVICE_LOGIN)
      try
      {
        Map localMap = br.z(bo.convertStreamToString(paramContext.getAssets().open("merged_features.xml")), "merged");
        if (localMap != null)
        {
          i = 0;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(".merged.feature");
          if (i > 0);
          for (paramArrayOfString = String.valueOf(i); ; paramArrayOfString = "")
          {
            paramArrayOfString = (String)localMap.get(paramArrayOfString);
            if (paramArrayOfString == null)
              break label253;
            paramString.append(String.format("[feature#%02d] %s\n", new Object[] { Integer.valueOf(i), paramArrayOfString }));
            i++;
            break;
          }
        }
      }
      catch (Exception paramArrayOfString)
      {
        ab.printErrStackTrace("MicroMsg.Version", paramArrayOfString, "", new Object[0]);
      }
    label253: paramArrayOfString = new TextView(paramContext);
    paramArrayOfString.setText(paramString);
    paramArrayOfString.setGravity(19);
    paramArrayOfString.setTextSize(1, 10.0F);
    paramArrayOfString.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    paramArrayOfString.setTextColor(-16777216);
    paramArrayOfString.setTypeface(Typeface.MONOSPACE);
    int i = paramContext.getResources().getDimensionPixelSize(2131427776);
    paramArrayOfString.setPadding(i, i, i, i);
    h.a(paramContext, null, paramArrayOfString, null);
    AppMethodBeat.o(16142);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.j
 * JD-Core Version:    0.6.2
 */