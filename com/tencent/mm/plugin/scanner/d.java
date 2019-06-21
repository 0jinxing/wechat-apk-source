package com.tencent.mm.plugin.scanner;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.e;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;
import java.util.List;

public final class d
{
  public static boolean cgx()
  {
    boolean bool1 = true;
    AppMethodBeat.i(138579);
    int i = ((a)g.K(a.class)).Nu().getInt("EnableSessionPicTranslation", 0);
    Object localObject = ((a)g.K(a.class)).Nu().getValue("SessionPicTranslationSupportUserLanguage");
    boolean bool2;
    if (i == 1)
    {
      bool2 = true;
      ab.i("MicroMsg.ScannerHelper", "enable %s, support lang %s, current lang %s", new Object[] { Boolean.valueOf(bool2), localObject, aa.dor() });
      if ((i != 1) || (bo.isNullOrNil((String)localObject)))
        break label133;
      localObject = ((String)localObject).split(";");
      if ((localObject == null) || (!Arrays.asList((Object[])localObject).contains(aa.dor())))
        break label133;
      AppMethodBeat.o(138579);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label133: if (com.tencent.mm.protocal.d.vxs)
      {
        AppMethodBeat.o(138579);
        bool2 = bool1;
      }
      else
      {
        AppMethodBeat.o(138579);
        bool2 = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.d
 * JD-Core Version:    0.6.2
 */