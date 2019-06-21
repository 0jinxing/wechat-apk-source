package com.tencent.xweb.xwalk.a;

import android.os.AsyncTask;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkLibraryLoader.HttpDownloadTask;
import org.xwalk.core.XWalkLibraryLoader.WXFileDownloaderTask;

public final class g extends AsyncTask<String, Integer, Integer>
{
  String ASK;
  f.a ASL;
  private final Object ASN;
  g.a ASO;
  private Map<String, g.b> ASP;
  private int ASQ;
  private int ASR;
  private int ASS;
  private int AST;
  private int ASU;
  boolean ASV;

  public g()
  {
    AppMethodBeat.i(85432);
    this.ASN = new Object();
    this.ASO = new g.a();
    this.ASP = new HashMap();
    this.ASQ = 0;
    this.ASR = 0;
    this.ASS = 0;
    this.AST = 0;
    this.ASU = 0;
    this.ASV = false;
    this.ASK = "";
    this.ASL = null;
    AppMethodBeat.o(85432);
  }

  private void aN(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(85436);
    if (paramInt2 <= paramInt1)
    {
      Log.i("XWalkPluginUp", "status not changed, return");
      AppMethodBeat.o(85436);
      return;
    }
    Log.i("XWalkPluginUp", "change status from " + paramInt1 + " to " + paramInt2 + " errcode: " + paramInt3);
    if (dVU())
    {
      if ((paramInt1 != 0) || (paramInt2 != 1))
        break label194;
      this.ASL.dVI();
    }
    while (true)
    {
      if (paramInt2 == 5)
      {
        com.tencent.xweb.util.f.bX(15718, this.ASO.errCode + "," + this.ASQ + "," + this.ASR + "," + this.ASS + "," + this.AST + "," + this.ASU);
        f.dVT();
        this.ASV = true;
      }
      AppMethodBeat.o(85436);
      break;
      label194: if ((paramInt1 != 0) && (paramInt2 == 5))
        this.ASL.Sz(paramInt3);
    }
  }

  public final void a(HashMap<String, String> paramHashMap, String paramString, f.a parama)
  {
    AppMethodBeat.i(85433);
    if (paramHashMap != null)
    {
      paramHashMap = (String)paramHashMap.get("UpdaterCheckType");
      if ((paramHashMap != null) && (paramHashMap.equals("1")))
        f.nQ(0L);
    }
    this.ASK = paramString;
    this.ASL = parama;
    AppMethodBeat.o(85433);
  }

  public final boolean a(int paramInt1, int paramInt2, Map<String, g.b> paramMap)
  {
    AppMethodBeat.i(85435);
    while (true)
    {
      boolean bool;
      Iterator localIterator;
      synchronized (this.ASN)
      {
        int i = this.ASO.ASX;
        if (paramInt1 > i)
        {
          this.ASO.ASX = paramInt1;
          if (paramInt2 != 1)
            this.ASO.errCode = paramInt2;
          if (this.ASO.ASX != 4)
            break label204;
          if (this.ASP.size() == 0)
          {
            this.ASO.ASX = 5;
            continue;
          }
        }
        else
        {
          paramInt2 = this.ASO.ASX;
          paramInt1 = this.ASO.errCode;
          aN(i, paramInt2, paramInt1);
          if (paramInt2 <= i)
            break label376;
          AppMethodBeat.o(85435);
          bool = true;
          return bool;
        }
        localIterator = this.ASP.entrySet().iterator();
        if (!localIterator.hasNext())
          continue;
        paramMap = (g.b)((Map.Entry)localIterator.next()).getValue();
        if ((paramMap == null) || (paramMap.sle))
          continue;
        paramMap.fUH.cancel(true);
      }
      label204: if ((this.ASO.ASX == 3) && (paramMap != null))
      {
        localIterator = paramMap.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Object localObject2 = (Map.Entry)localIterator.next();
          paramMap = (String)((Map.Entry)localObject2).getKey();
          localObject2 = (g.b)((Map.Entry)localObject2).getValue();
          this.ASP.put(paramMap, localObject2);
          if (((g.b)localObject2).type == 1)
            ((XWalkLibraryLoader.HttpDownloadTask)((g.b)localObject2).fUH).execute(new Void[0]);
          else if (((g.b)localObject2).type == 2)
            ((XWalkLibraryLoader.WXFileDownloaderTask)((g.b)localObject2).fUH).execute(new Void[0]);
          else
            this.ASP.remove(paramMap);
        }
        this.ASQ = this.ASP.size();
        continue;
        label376: AppMethodBeat.o(85435);
        bool = false;
      }
    }
  }

  final boolean dVU()
  {
    AppMethodBeat.i(85437);
    boolean bool;
    if ((this.ASK != null) && (!this.ASK.isEmpty()) && (this.ASL != null))
    {
      bool = true;
      AppMethodBeat.o(85437);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85437);
    }
  }

  public final void eW(String paramString, int paramInt)
  {
    AppMethodBeat.i(85434);
    XWalkEnvironment.addXWalkInitializeLog("XWalkPluginUp", "onNotifyResult: " + paramString + " install retCode: " + paramInt);
    while (true)
    {
      synchronized (this.ASN)
      {
        if (this.ASO.ASX == 5)
        {
          AppMethodBeat.o(85434);
          return;
        }
        switch (paramInt)
        {
        default:
          ((g.b)this.ASP.get(paramString)).sle = true;
          paramString = this.ASP.entrySet().iterator();
          if (!paramString.hasNext())
            break label324;
          g.b localb = (g.b)((Map.Entry)paramString.next()).getValue();
          if ((localb == null) || (localb.sle))
            continue;
          paramInt = 0;
          int i = this.ASO.ASX;
          if (paramInt != 0)
          {
            this.ASP.clear();
            this.ASO.ASX = 5;
            if ((this.ASS > 0) || (this.AST > 0))
              this.ASO.errCode = -9;
          }
          paramInt = this.ASO.ASX;
          int j = this.ASO.errCode;
          aN(i, paramInt, j);
          AppMethodBeat.o(85434);
          break;
        case -3:
          this.ASR += 1;
        case -1:
        case -2:
        case 0:
        }
      }
      this.ASS += 1;
      continue;
      this.AST += 1;
      continue;
      this.ASU += 1;
      continue;
      label324: paramInt = 1;
    }
  }

  protected final void onPreExecute()
  {
    AppMethodBeat.i(85438);
    a(1, 1, null);
    super.onPreExecute();
    AppMethodBeat.o(85438);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.a.g
 * JD-Core Version:    0.6.2
 */