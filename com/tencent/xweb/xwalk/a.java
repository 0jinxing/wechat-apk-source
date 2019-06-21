package com.tencent.xweb.xwalk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;

public final class a
{
  public static com.tencent.xweb.a.a di(Object paramObject)
  {
    int i = 0;
    com.tencent.xweb.a.a locala;
    try
    {
      AppMethodBeat.i(85120);
      locala = new com/tencent/xweb/a$a;
      locala.<init>();
      if ((paramObject == null) || (!(paramObject instanceof com.tencent.xweb.c.a.a)))
        AppMethodBeat.o(85120);
      while (true)
      {
        return locala;
        com.tencent.xweb.c.a.a locala1 = (com.tencent.xweb.c.a.a)paramObject;
        str = locala1.AOL;
        paramObject = locala1.AOM;
        if (!locala1.AOL.equals("executeCommand"))
          break label262;
        paramObject = com.tencent.xweb.a.avb(locala1.AOM);
        if ((paramObject != null) && (paramObject.length >= 2))
          break;
        AppMethodBeat.o(85120);
      }
    }
    finally
    {
    }
    String str = paramObject[0];
    paramObject = paramObject[1];
    label262: 
    while (true)
    {
      switch (str.hashCode())
      {
      default:
        label140: i = -1;
        label142: switch (i)
        {
        default:
        case 0:
        case 1:
        }
        break;
      case 1108642905:
      case -844092179:
      }
      while (true)
      {
        while (true)
        {
          AppMethodBeat.o(85120);
          break;
          if (!str.equals("revertToVersion"))
            break label140;
          break label142;
          if (!str.equals("fix_dex"))
            break label140;
          i = 1;
          break label142;
          locala.ALP = true;
          try
          {
            i = Integer.parseInt(paramObject);
            n.aE(XWalkEnvironment.getApplicationContext(), i);
            AppMethodBeat.o(85120);
          }
          catch (Exception localException)
          {
            Log.e("ConfigCmdProc", "parse revertapk cmdvalue to int failed , value is ".concat(String.valueOf(paramObject)));
            AppMethodBeat.o(85120);
          }
        }
        break;
        locala.ALP = true;
        n.dVL();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.a
 * JD-Core Version:    0.6.2
 */