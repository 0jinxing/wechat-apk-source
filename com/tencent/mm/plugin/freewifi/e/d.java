package com.tencent.mm.plugin.freewifi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
{
  private String cuH;
  private String cxb;
  private int mwD;

  public final boolean v(int paramInt, String paramString1, String paramString2)
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(20805);
      ab.i("MicroMsg.FreeWifi.Protocol31Locker", "threeOneStartUpType=%d, apKey=%s, ticket=%s", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
      int i;
      if ((paramInt == 1) || (paramInt == 2) || (paramInt == 3))
      {
        i = 1;
        if (i != 0)
          break label77;
        AppMethodBeat.o(20805);
      }
      while (true)
      {
        return bool;
        i = 0;
        break;
        label77: if ((m.isEmpty(paramString1)) || (m.isEmpty(paramString2)))
        {
          AppMethodBeat.o(20805);
          bool = false;
        }
        else if ((paramString1.equals(this.cuH)) && (paramString2.equals(this.cxb)) && (this.mwD != paramInt))
        {
          AppMethodBeat.o(20805);
          bool = false;
        }
        else
        {
          this.mwD = paramInt;
          this.cuH = paramString1;
          this.cxb = paramString2;
          AppMethodBeat.o(20805);
        }
      }
    }
    finally
    {
    }
    throw paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.d
 * JD-Core Version:    0.6.2
 */