package com.tencent.d.b;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.d.d.a.c;
import com.tencent.d.d.a.g;
import com.tencent.d.d.b.d.a;
import com.tencent.d.f.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a
{
  public b ArH;
  public Context mContext;

  public a(Context paramContext)
  {
    AppMethodBeat.i(114469);
    this.mContext = null;
    this.mContext = paramContext;
    this.ArH = new b(paramContext);
    AppMethodBeat.o(114469);
  }

  public static com.tencent.d.c.b.b a(Context paramContext, com.tencent.d.a.a parama, int paramInt)
  {
    AppMethodBeat.i(114471);
    if (parama == null)
      AppMethodBeat.o(114471);
    com.tencent.d.c.b.b localb;
    for (paramContext = null; ; paramContext = localb)
    {
      return paramContext;
      localb = new com.tencent.d.c.b.b();
      localb.Asp = paramInt;
      localb.Asq = null;
      localb.Asr = parama.ceO;
      localb.Ass = com.tencent.d.f.e.atV(parama.ArC);
      paramContext = com.tencent.d.f.a.cb(paramContext, parama.ceO);
      if (paramContext.size() > 1)
      {
        localb.AsH = new ArrayList();
        paramContext = paramContext.iterator();
        while (paramContext.hasNext())
        {
          byte[] arrayOfByte = (byte[])paramContext.next();
          localb.AsH.add(arrayOfByte);
        }
      }
      localb.Ast = parama.fileSize;
      localb.Asu = parama.ArB;
      localb.Asv = parama.versionCode;
      localb.Asw = parama.versionName;
      localb.Asx = 0;
      if (parama.egi == 1)
        localb.Asx |= 1;
      localb.Asx |= 2;
      if ((!parama.ArD.startsWith("/data")) && (!parama.ArD.startsWith("/system")))
        localb.Asx |= 4;
      localb.Asy = "";
      localb.Asz = 0;
      localb.AsA = 0;
      localb.AsB = 0;
      localb.AsC = null;
      localb.AsD = 0;
      localb.AsE = false;
      localb.AsF = 0;
      localb.AsG = 0;
      AppMethodBeat.o(114471);
    }
  }

  public static com.tencent.d.c.b.d dQj()
  {
    AppMethodBeat.i(114470);
    com.tencent.d.c.b.d locald = new com.tencent.d.c.b.d();
    try
    {
      locald.AsX = Build.FINGERPRINT;
      locald.AsY = com.tencent.d.f.d.dQE();
      locald.fwM = Build.BRAND;
      locald.model = Build.MODEL;
      locald.AsZ = Build.VERSION.SDK_INT;
      locald.Ata = Build.CPU_ABI;
      locald.platform = com.tencent.d.f.d.atU("ro.board.platform");
      if (com.tencent.d.d.a.f.dQn())
      {
        i = 2;
        locald.Atb = i;
        AppMethodBeat.o(114470);
        return locald;
      }
      Object localObject1 = com.tencent.d.d.b.d.dQo();
      if (((Collection)localObject1).isEmpty())
      {
        i = 1;
        if (i != 0)
          break label298;
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>(3);
        Object localObject2 = new com/tencent/d/d/a/g;
        ((g)localObject2).<init>();
        localArrayList.add(localObject2);
        localObject2 = new com/tencent/d/d/a/d;
        ((com.tencent.d.d.a.d)localObject2).<init>();
        localArrayList.add(localObject2);
        if (com.tencent.d.d.b.f.dQp())
        {
          localObject2 = new com/tencent/d/d/a/c;
          ((c)localObject2).<init>();
          localArrayList.add(localObject2);
        }
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          d.a locala = (d.a)((Iterator)localObject1).next();
          if (locala != null)
          {
            localObject2 = localArrayList.iterator();
            while (((Iterator)localObject2).hasNext())
              ((com.tencent.d.d.a.b)((Iterator)localObject2).next()).a(locala);
          }
        }
      }
    }
    catch (Exception localException)
    {
      label398: 
      while (true)
      {
        continue;
        int i = 0;
        continue;
        Iterator localIterator = localException.iterator();
        do
          if (!localIterator.hasNext())
            break;
        while (!((com.tencent.d.d.a.b)localIterator.next()).dQl());
        label298: for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label303;
          i = 2;
          break;
        }
        label303: if (com.tencent.d.d.a.e.dQm())
        {
          i = 1;
        }
        else
        {
          if (!com.tencent.d.d.a.a.atP("/system/bin/debuggerd"))
            i = 1;
          while (true)
          {
            if (i == 0)
              break label398;
            i = 1;
            break;
            if (!com.tencent.d.d.a.a.atP("/system/bin/debuggerd64"))
            {
              i = 1;
            }
            else if (!com.tencent.d.d.a.a.atP("/system/bin/ddexe"))
            {
              i = 1;
            }
            else if (!com.tencent.d.d.a.a.atQ("/system/etc/install-recovery.sh"))
            {
              i = 1;
            }
            else if (!com.tencent.d.d.a.a.atQ("/system/bin/install-recovery.sh"))
            {
              i = 1;
            }
            else
            {
              h.dQG();
              i = 0;
            }
          }
          i = 0;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.d.b.a
 * JD-Core Version:    0.6.2
 */