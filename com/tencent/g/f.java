package com.tencent.g;

import com.tencent.g.b.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

public final class f
{
  private static f AHA;
  private HashMap<String, g> AHB;
  HashMap<String, Object> AHC;
  private Object AHD;
  Object AHE;
  private f.a AHF;

  public f()
  {
    AppMethodBeat.i(127751);
    this.AHB = new HashMap();
    this.AHC = new HashMap();
    this.AHD = new Object();
    this.AHE = new Object();
    this.AHF = new f.a(this);
    AppMethodBeat.o(127751);
  }

  private boolean Z(String[] paramArrayOfString)
  {
    AppMethodBeat.i(127758);
    int j;
    Object localObject1;
    if (paramArrayOfString != null)
    {
      int i = paramArrayOfString.length;
      j = 0;
      if (j < i)
      {
        localObject1 = paramArrayOfString[j];
        if (localObject1 == null);
      }
    }
    while (true)
    {
      boolean bool;
      synchronized (this.AHD)
      {
        localObject1 = (g)this.AHB.get(localObject1);
        if (localObject1 == null)
        {
          bool = false;
          AppMethodBeat.o(127758);
          return bool;
        }
      }
      a((g)localObject1);
      if (((g)localObject1).mState != 32)
      {
        bool = false;
      }
      else
      {
        ((g)localObject1).mReferenceCount += 1;
        com.tencent.pb.common.c.c.d("reference_count", new Object[] { "addReferenceCount|", ((g)localObject1).AHJ.AHS, "|refcount=", Integer.valueOf(((g)localObject1).mReferenceCount) });
        j++;
        break;
        bool = true;
      }
    }
  }

  public static com.tencent.g.b.b a(d paramd)
  {
    AppMethodBeat.i(127754);
    paramd = dSG().b(paramd);
    AppMethodBeat.o(127754);
    return paramd;
  }

  public static Object aux(String paramString)
  {
    AppMethodBeat.i(127753);
    paramString = dSG().auy(paramString);
    AppMethodBeat.o(127753);
    return paramString;
  }

  private Object auy(String paramString)
  {
    AppMethodBeat.i(127755);
    if (paramString == null)
    {
      paramString = new h("TpfServiceCenter|getService|service name should not be null");
      AppMethodBeat.o(127755);
      throw paramString;
    }
    synchronized (this.AHE)
    {
      ??? = this.AHC.get(paramString);
      if (??? != null);
    }
    while (true)
    {
      g localg;
      synchronized (this.AHD)
      {
        localg = (g)this.AHB.get(paramString);
        if (localg == null)
          break label190;
        if (localg.AHJ.AHU)
        {
          paramString = c(localg);
          AppMethodBeat.o(127755);
          return paramString;
          paramString = finally;
          AppMethodBeat.o(127755);
          throw paramString;
        }
      }
      if (4 == localg.mState);
      try
      {
        a(localg);
        synchronized (this.AHE)
        {
          paramString = this.AHC.get(paramString);
        }
      }
      catch (com.tencent.g.b.c paramString)
      {
        com.tencent.pb.common.c.c.w("service", new Object[] { paramString });
        paramString = null;
        AppMethodBeat.o(127755);
      }
      continue;
      label190: paramString = ???;
    }
  }

  private com.tencent.g.b.b b(d paramd)
  {
    int i = 1;
    AppMethodBeat.i(127756);
    Object localObject1;
    if ((paramd == null) || (paramd.AHS == null))
    {
      localObject1 = null;
      AppMethodBeat.o(127756);
      return localObject1;
    }
    String str = paramd.AHS;
    this.AHF.iD("install_", str);
    while (true)
    {
      try
      {
        synchronized (this.AHD)
        {
          localObject1 = (g)this.AHB.get(str);
          if (localObject1 == null)
          {
            localObject1 = new com/tencent/g/g;
            ((g)localObject1).<init>(this, paramd);
            ((g)localObject1).mState = 2;
            com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] installed!" });
            this.AHB.put(str, localObject1);
            j = 1;
            if (j != 0)
            {
              if (paramd.AHR == null)
                break label293;
              j = i;
              if (j == 0)
                break label254;
              ((g)localObject1).mState = 4;
              com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] resolved!" });
            }
            this.AHF.iE("install_", str);
            AppMethodBeat.o(127756);
            break;
          }
          com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] had been installed!" });
          j = 0;
        }
      }
      finally
      {
        this.AHF.iE("install_", str);
        AppMethodBeat.o(127756);
      }
      label254: paramd = new com/tencent/g/b/c;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("resolve service [");
      paramd.<init>(str + "] failed.");
      AppMethodBeat.o(127756);
      throw paramd;
      label293: int j = 0;
    }
  }

  private static boolean b(g paramg)
  {
    AppMethodBeat.i(127759);
    if (!paramg.AHJ.AHU);
    while (true)
    {
      try
      {
        b localb = (b)Class.forName(paramg.AHJ.AHR).newInstance();
        paramg.AHK = localb;
        a locala = new com/tencent/g/a;
        locala.<init>(paramg);
        paramg.AHL = locala;
        localb.a(locala);
        bool = true;
        AppMethodBeat.o(127759);
        return bool;
      }
      catch (Exception paramg)
      {
        com.tencent.pb.common.c.c.w("service", new Object[] { paramg });
      }
      boolean bool = false;
    }
  }

  private static Object c(g paramg)
  {
    AppMethodBeat.i(127760);
    try
    {
      c localc = (c)Class.forName(paramg.AHJ.AHR).newInstance();
      a locala = new com/tencent/g/a;
      locala.<init>(paramg);
      paramg.AHL = locala;
      paramg.mState = 32;
      paramg = localc.dSB();
      AppMethodBeat.o(127760);
      return paramg;
    }
    catch (Exception paramg)
    {
      while (true)
      {
        com.tencent.pb.common.c.c.w("service", new Object[] { paramg });
        paramg = null;
        AppMethodBeat.o(127760);
      }
    }
  }

  static f dSG()
  {
    AppMethodBeat.i(127752);
    if (AHA == null);
    try
    {
      if (AHA == null)
      {
        localf = new com/tencent/g/f;
        localf.<init>();
        AHA = localf;
      }
      f localf = AHA;
      AppMethodBeat.o(127752);
      return localf;
    }
    finally
    {
      AppMethodBeat.o(127752);
    }
  }

  final boolean a(g paramg)
  {
    int i = 0;
    AppMethodBeat.i(127757);
    d locald = paramg.AHJ;
    String str = locald.AHS;
    this.AHF.iD("service_", str);
    try
    {
      int j = paramg.mState;
      if (j == 32)
        j = 1;
      while (true)
      {
        this.AHF.iE("service_", str);
        if (j != 0)
          break;
        paramg = new com.tencent.g.b.c("startService [" + str + "] failed");
        AppMethodBeat.o(127757);
        throw paramg;
        j = i;
        if (paramg.mState == 4)
        {
          paramg.mState = 8;
          com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] starting..." });
          if (locald.AHT != null)
            Z(locald.AHT);
          j = i;
          if (b(paramg))
          {
            paramg.mState = 32;
            com.tencent.pb.common.c.c.d("service", new Object[] { "service [", str, "] active..." });
            j = 1;
          }
        }
      }
    }
    finally
    {
      this.AHF.iE("service_", str);
      AppMethodBeat.o(127757);
    }
    AppMethodBeat.o(127757);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.g.f
 * JD-Core Version:    0.6.2
 */