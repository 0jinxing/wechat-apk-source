package com.tencent.d.b;

import android.content.Context;
import android.os.Build;
import com.tencent.d.f.d;
import com.tencent.d.f.d.a;
import com.tencent.d.f.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  private int ArI;
  private int ArJ;
  private String ArK;
  private com.tencent.d.c.a.c ArL;
  private com.tencent.d.c.a.a ArM;
  private String mChannelId;
  private Context mContext;
  private String mVersionName;

  public b(Context paramContext)
  {
    AppMethodBeat.i(114472);
    this.mContext = null;
    this.ArI = -1;
    this.ArJ = -1;
    this.mVersionName = null;
    this.mChannelId = null;
    this.ArK = null;
    this.ArL = null;
    this.ArM = null;
    this.mContext = paramContext;
    paramContext = com.tencent.d.f.a.cc(paramContext, paramContext.getPackageName());
    this.mVersionName = paramContext.versionName;
    this.ArJ = paramContext.versionCode;
    this.ArI = 82;
    this.mChannelId = "105901";
    this.ArK = "7AD75E27CD5842F6";
    AppMethodBeat.o(114472);
  }

  private static String atO(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  private com.tencent.d.c.a.c dQk()
  {
    int i = 2;
    AppMethodBeat.i(114474);
    if (this.ArL == null)
    {
      this.ArL = new com.tencent.d.c.a.c();
      this.ArL.ArW = this.ArI;
      this.ArL.Asb = this.ArJ;
      this.ArL.ArT = this.mChannelId;
      this.ArL.ArS = this.ArK;
    }
    try
    {
      Object localObject = this.mVersionName.trim().split("[\\.]");
      if ((localObject != null) && (localObject.length >= 3))
      {
        j = Integer.parseInt(localObject[0]);
        k = Integer.parseInt(localObject[1]);
        m = Integer.parseInt(localObject[2]);
        com.tencent.d.c.a.c localc = this.ArL;
        localObject = new com/tencent/d/c/a/b;
        ((com.tencent.d.c.a.b)localObject).<init>();
        localc.ArX = ((com.tencent.d.c.a.b)localObject);
        this.ArL.ArX.ArP = j;
        this.ArL.ArX.ArQ = k;
        this.ArL.ArX.ArR = m;
        this.ArL.ArY = 0;
        this.ArL.Asa = d.dQD();
        this.ArL.imei = atO(d.getIMEI(this.mContext));
        this.ArL.imsi = atO(d.iK(this.mContext));
        this.ArL.ArU = atO(Build.MODEL);
        this.ArL.qTL = atO(d.iL(this.mContext));
        this.ArL.Asg = atO(d.ro(true));
        this.ArL.Ash = atO(d.ro(false));
        this.ArL.guid = null;
        this.ArL.ArZ = 0;
        localObject = this.ArL;
        if (d.iM(this.mContext) == d.a.Aut);
        for (j = i; ; j = 1)
        {
          ((com.tencent.d.c.a.c)localObject).ArV = j;
          localObject = this.ArL;
          AppMethodBeat.o(114474);
          return localObject;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        continue;
        int m = 0;
        int k = 0;
        int j = 0;
      }
    }
  }

  public final byte[] a(com.tencent.d.c.b.a parama)
  {
    AppMethodBeat.i(114473);
    Object localObject = null;
    try
    {
      l locall = new com/tencent/d/f/l;
      locall.<init>();
      locall.dQJ();
      locall.atX("viruscheck");
      locall.atY("RiskCheck");
      locall.atW("UTF-8");
      if (this.ArM == null)
      {
        com.tencent.d.c.a.a locala = new com/tencent/d/c/a/a;
        locala.<init>();
        this.ArM = locala;
        this.ArM.ArN = 2;
        this.ArM.ArO = 201;
      }
      locall.put("phonetype", this.ArM);
      locall.put("userinfo", dQk());
      locall.put("req", parama);
      parama = com.tencent.d.f.b.compress(locall.AL());
      if (parama == null)
      {
        parama = new java/lang/RuntimeException;
        parama.<init>("compress data fail");
        AppMethodBeat.o(114473);
        throw parama;
      }
    }
    catch (Exception parama)
    {
      parama = localObject;
    }
    while (true)
    {
      AppMethodBeat.o(114473);
      return parama;
      parama = com.tencent.d.f.c.m(parama, com.tencent.d.f.c.dQC());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.d.b.b
 * JD-Core Version:    0.6.2
 */