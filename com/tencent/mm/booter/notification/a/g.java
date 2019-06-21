package com.tencent.mm.booter.notification.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g
{
  public c eeA;
  public d eeB;
  public h eeC;
  private f eeD;
  public a eeE;
  public int eeF;
  public int eeG;
  public int eeH;
  public int eeI;
  public boolean eeJ;
  private int eeK;
  private int eeL;
  public boolean eeM;
  public boolean eeN;
  public b eez;
  public Context mContext;

  public g(Context paramContext)
  {
    AppMethodBeat.i(16035);
    this.eeK = -1;
    this.eeL = -1;
    this.mContext = paramContext;
    this.eez = new b();
    this.eeA = new c();
    this.eeB = new d();
    this.eeC = new h();
    this.eeE = new a();
    this.eeD = f.a.IZ();
    AppMethodBeat.o(16035);
  }

  public static String b(long[] paramArrayOfLong)
  {
    AppMethodBeat.i(16037);
    String str;
    if (paramArrayOfLong == null)
    {
      str = null;
      AppMethodBeat.o(16037);
    }
    while (true)
    {
      return str;
      str = "";
      int i = paramArrayOfLong.length;
      for (int j = 0; j < i; j++)
      {
        long l = paramArrayOfLong[j];
        str = str + String.valueOf(l) + ",";
      }
      if (str.isEmpty())
      {
        AppMethodBeat.o(16037);
      }
      else
      {
        str = str.substring(0, str.length() - 1);
        AppMethodBeat.o(16037);
      }
    }
  }

  public final void jU(String paramString)
  {
    AppMethodBeat.i(16036);
    this.eeD.jT(paramString);
    AppMethodBeat.o(16036);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.g
 * JD-Core Version:    0.6.2
 */