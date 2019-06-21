package com.tencent.mm.plugin.appbrand.debugger;

import android.util.Pair;
import android.webkit.ValueCallback;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.l.a;
import com.tencent.mm.protocal.protobuf.cql;
import com.tencent.mm.protocal.protobuf.cqt;
import com.tencent.mm.protocal.protobuf.cra;
import com.tencent.mm.protocal.protobuf.crf;
import com.tencent.mm.sdk.platformtools.f;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class l
{
  private boolean hjA;
  private boolean hjB;
  private final HashMap<String, Method> hjC;
  private final HashMap<String, cra> hjD;
  LinkedList<Pair<String, ValueCallback<String>>> hjE;
  final LinkedList<o> hjF;
  final Map<String, k> hjG;
  final LinkedList<cqt> hjH;
  final HashMap<Integer, b> hjI;
  int hjJ;
  long hjK;
  com.tencent.luggage.sdk.a.a.b hjn;
  final cql hjo;
  private String hjp;
  private int hjq;
  private int hjr;
  crf hjs;
  m hjt;
  AtomicInteger hju;
  long hjv;
  long hjw;
  long hjx;
  long hjy;
  AtomicInteger hjz;
  final Object mLock;
  private int mStatus;

  public l()
  {
    AppMethodBeat.i(101823);
    this.hjq = 0;
    this.hjr = 0;
    this.mStatus = 0;
    this.hju = new AtomicInteger(0);
    this.hjv = 0L;
    this.hjw = 0L;
    this.hjy = System.currentTimeMillis();
    this.hjz = new AtomicInteger(0);
    this.hjC = new HashMap();
    this.hjD = new HashMap();
    this.hjE = new LinkedList();
    this.hjF = new LinkedList();
    this.hjG = new HashMap();
    this.hjH = new LinkedList();
    this.hjI = new HashMap();
    this.mLock = new Object();
    this.hjJ = 0;
    this.hjK = 0L;
    this.hjo = new cql();
    this.hjo.vQI = f.xxY;
    AppMethodBeat.o(101823);
  }

  private int getStatus()
  {
    try
    {
      int i = this.mStatus;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(com.tencent.luggage.sdk.a.a.b paramb, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(101824);
    this.hjn = paramb;
    this.hjt = t.zP(paramString);
    paramString = this.hjn.xL().xZ();
    if (paramString != null)
    {
      paramString.bQs = this.hjt.bQs;
      paramString.bQf = true;
      paramb = (a)paramb.xL().aa(a.class);
      if (paramb != null)
        if (paramString.bQs)
          break label86;
    }
    while (true)
    {
      paramb.iof = bool;
      AppMethodBeat.o(101824);
      return;
      label86: bool = false;
    }
  }

  public final String ayY()
  {
    try
    {
      String str = this.hjp;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int ayZ()
  {
    try
    {
      int i = this.hjq;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int aza()
  {
    try
    {
      int i = this.hjr;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean azb()
  {
    try
    {
      boolean bool = this.hjB;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean azc()
  {
    AppMethodBeat.i(101826);
    boolean bool;
    if (getStatus() == 4)
    {
      bool = true;
      AppMethodBeat.o(101826);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101826);
    }
  }

  public final boolean azd()
  {
    AppMethodBeat.i(101827);
    boolean bool;
    if (getStatus() == 5)
    {
      bool = true;
      AppMethodBeat.o(101827);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(101827);
    }
  }

  public final boolean aze()
  {
    if (this.hjt.hjO == 3);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void cU(int paramInt1, int paramInt2)
  {
    try
    {
      if ((this.hjr >= paramInt1) && (this.hjr <= paramInt2))
        this.hjr = paramInt2;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void dJ(boolean paramBoolean)
  {
    try
    {
      this.hjA = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void dK(boolean paramBoolean)
  {
    try
    {
      this.hjB = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean isBusy()
  {
    try
    {
      boolean bool = this.hjA;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean isReady()
  {
    try
    {
      AppMethodBeat.i(101825);
      boolean bool;
      if (getStatus() == 3)
      {
        bool = true;
        AppMethodBeat.o(101825);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(101825);
      }
    }
    finally
    {
    }
  }

  public final void nG(int paramInt)
  {
    try
    {
      this.hjq = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void nH(int paramInt)
  {
    try
    {
      if (this.hjr < paramInt)
        this.hjr = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void nI(int paramInt)
  {
    this.hjK += paramInt;
  }

  public final void setStatus(int paramInt)
  {
    try
    {
      this.mStatus = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void zI(String paramString)
  {
    try
    {
      this.hjp = paramString;
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.l
 * JD-Core Version:    0.6.2
 */