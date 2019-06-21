package com.tencent.d.b;

import android.content.Context;
import android.os.Build;
import com.tencent.d.f.d;
import com.tencent.d.f.d.a;
import com.tencent.d.f.i;
import com.tencent.d.f.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  private int ArJ;
  private com.tencent.d.c.a.c ArL;
  private Context mContext;
  private String mVersionName;

  public c(Context paramContext)
  {
    AppMethodBeat.i(114475);
    this.ArL = null;
    this.mVersionName = null;
    this.ArJ = -1;
    this.mContext = paramContext;
    paramContext = i.cd(paramContext, paramContext.getPackageName());
    this.mVersionName = paramContext.versionName;
    this.ArJ = paramContext.versionCode;
    AppMethodBeat.o(114475);
  }

  private com.tencent.d.c.a.c a(com.tencent.d.e.a.b.a parama)
  {
    AppMethodBeat.i(114477);
    if (this.ArL == null)
    {
      this.ArL = new com.tencent.d.c.a.c();
      this.ArL.ArW = 82;
      this.ArL.Asb = this.ArJ;
      this.ArL.ArT = parama.cIb;
      this.ArL.ArS = parama.ArS;
    }
    try
    {
      Object localObject = this.mVersionName.trim().split("[\\.]");
      if ((localObject != null) && (localObject.length >= 3))
      {
        i = Integer.parseInt(localObject[0]);
        j = Integer.parseInt(localObject[1]);
        k = Integer.parseInt(localObject[2]);
        localObject = this.ArL;
        com.tencent.d.c.a.b localb = new com/tencent/d/c/a/b;
        localb.<init>();
        ((com.tencent.d.c.a.c)localObject).ArX = localb;
        this.ArL.ArX.ArP = i;
        this.ArL.ArX.ArQ = j;
        this.ArL.ArX.ArR = k;
        this.ArL.ArY = 0;
        this.ArL.Asa = d.dQD();
        this.ArL.imei = atO(parama.imei);
        this.ArL.imsi = atO(parama.imsi);
        this.ArL.ArU = atO(Build.MODEL);
        this.ArL.qTL = atO(d.iL(this.mContext));
        this.ArL.Asg = atO(d.ro(true));
        this.ArL.Ash = atO(d.ro(false));
        this.ArL.ArZ = 0;
        this.ArL.ArV = getNetworkType();
        this.ArL.guid = atO(d.iN(this.mContext));
        parama = this.ArL;
        AppMethodBeat.o(114477);
        return parama;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        continue;
        int k = 0;
        int j = 0;
        int i = 0;
      }
    }
  }

  private static String atO(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  private int getNetworkType()
  {
    int i = 2;
    AppMethodBeat.i(114478);
    try
    {
      if (d.iM(this.mContext) == d.a.Aut)
        AppMethodBeat.o(114478);
      while (true)
      {
        return i;
        i = 1;
        AppMethodBeat.o(114478);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(114478);
    }
  }

  public final byte[] c(String paramString1, String paramString2, com.tencent.d.e.a.b.a parama)
  {
    AppMethodBeat.i(114476);
    Object localObject = null;
    try
    {
      l locall = new com/tencent/d/f/l;
      locall.<init>();
      locall.dQJ();
      locall.atX(paramString1);
      locall.atY(paramString2);
      locall.atW("UTF-8");
      locall.put("userInfo", a(parama));
      locall.put("req", parama);
      paramString1 = com.tencent.d.f.b.compress(locall.AL());
      if (paramString1 == null)
      {
        paramString1 = new java/lang/RuntimeException;
        paramString1.<init>("compress data fail");
        AppMethodBeat.o(114476);
        throw paramString1;
      }
    }
    catch (Exception paramString1)
    {
      paramString1 = localObject;
    }
    while (true)
    {
      AppMethodBeat.o(114476);
      return paramString1;
      paramString1 = com.tencent.d.f.c.m(paramString1, com.tencent.d.f.c.dQC());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.d.b.c
 * JD-Core Version:    0.6.2
 */