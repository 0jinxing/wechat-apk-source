package com.tencent.mm.model.d;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.o;
import com.tencent.mm.ai.p;
import com.tencent.mm.ba.j;
import com.tencent.mm.ba.n;
import com.tencent.mm.ba.r;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class c
  implements f
{
  private static c fpB;
  private ArrayList<c.a> eES;
  private SharedPreferences ehZ;
  private volatile boolean fpA;
  private final int fpx;
  private final String fpy;
  private final long fpz;

  private c()
  {
    AppMethodBeat.i(16418);
    this.fpx = 21;
    this.fpy = "trace_config_last_update_time";
    this.fpz = 86400000L;
    this.fpA = false;
    this.ehZ = ah.doB();
    this.eES = new ArrayList();
    AppMethodBeat.o(16418);
  }

  public static c abt()
  {
    AppMethodBeat.i(16419);
    if (fpB == null);
    try
    {
      if (fpB == null)
      {
        localc = new com/tencent/mm/model/d/c;
        localc.<init>();
        fpB = localc;
      }
      c localc = fpB;
      AppMethodBeat.o(16419);
      return localc;
    }
    finally
    {
      AppMethodBeat.o(16419);
    }
  }

  private void kP(int paramInt)
  {
    AppMethodBeat.i(16421);
    r.aix();
    Object localObject1 = n.aiu();
    Object localObject2 = r.aix().cx(paramInt, 21);
    try
    {
      Object localObject3 = new java/io/File;
      ((File)localObject3).<init>((String)localObject1);
      localObject1 = new java/io/File;
      ((File)localObject1).<init>((File)localObject3, (String)localObject2);
      localObject1 = br.z(e.cy(((File)localObject1).getPath()), "TraceConfig");
      if (localObject1 == null)
      {
        ab.d("MicroMsg.TraceConfigUpdater", "summer kvMap is null and ret");
        AppMethodBeat.o(16421);
        return;
      }
      localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>();
      i = 0;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      Object localObject5 = ((StringBuilder)localObject3).append(".TraceConfig.Item");
      if (i == 0);
      for (localObject3 = ""; ; localObject3 = Integer.valueOf(i))
      {
        localObject3 = localObject3;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = (String)((Map)localObject1).get((String)localObject3 + ".$key");
        if (localObject5 == null)
          break label272;
        i++;
        long l = bo.getLong((String)((Map)localObject1).get(localObject3), -1L);
        if (l < 0L)
          break label491;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("summer updateTraceConfig i: ");
        ab.i("MicroMsg.TraceConfigUpdater", i + " key: " + (String)localObject5 + "|value: " + l);
        ((Map)localObject2).put(localObject5, Long.valueOf(l));
        break;
      }
      label272: localObject3 = this.ehZ.edit();
      localObject1 = ((Map)localObject2).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject5 = (Map.Entry)((Iterator)localObject1).next();
        ((SharedPreferences.Editor)localObject3).putLong((String)((Map.Entry)localObject5).getKey(), ((Long)((Map.Entry)localObject5).getValue()).longValue());
      }
    }
    catch (IOException localIOException)
    {
      label491: 
      while (true)
      {
        int i;
        ab.printErrStackTrace("MicroMsg.TraceConfigUpdater", localIOException, "", new Object[0]);
        while (true)
        {
          Object localObject4 = r.aix().cv(paramInt, 21);
          ((com.tencent.mm.ba.m)localObject4).status = 2;
          r.aix().b((com.tencent.mm.ba.m)localObject4);
          AppMethodBeat.o(16421);
          break;
          ((SharedPreferences.Editor)localObject4).putLong("trace_config_last_update_time", System.currentTimeMillis()).commit();
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("summer updateTraceConfig configMap size: ");
          ab.d("MicroMsg.TraceConfigUpdater", ((Map)localObject2).size());
          int j = this.eES.size();
          for (i = 0; i < j; i++)
            ((c.a)this.eES.get(i)).abn();
        }
      }
    }
  }

  private void release()
  {
    AppMethodBeat.i(16422);
    ab.i("MicroMsg.TraceConfigUpdater", "summer release");
    this.fpA = false;
    aw.Rg().b(159, this);
    aw.Rg().b(160, this);
    AppMethodBeat.o(16422);
  }

  public final boolean a(c.a parama)
  {
    AppMethodBeat.i(16423);
    boolean bool;
    if ((parama != null) && (!this.eES.contains(parama)))
    {
      bool = this.eES.add(parama);
      AppMethodBeat.o(16423);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(16423);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(16420);
    int i = paramm.getType();
    ab.i("MicroMsg.TraceConfigUpdater", "summer onSceneEnd: errType:[%d], errCode:[%d], type:[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
    if ((!(paramm instanceof o)) || (((o)paramm).acR() != 21))
    {
      ab.i("MicroMsg.TraceConfigUpdater", "summer onSceneEnd another scene and ret");
      AppMethodBeat.o(16420);
    }
    while (true)
    {
      return;
      if (i == 159)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = r.aix().lU(21);
          if ((paramString == null) || (paramString.length == 0))
          {
            ab.i("MicroMsg.TraceConfigUpdater", "summer doDownload error no pkg found.");
            release();
            AppMethodBeat.o(16420);
          }
          else
          {
            paramString = paramString[0];
            ab.i("MicroMsg.TraceConfigUpdater", "summer doDownload pkg id:" + paramString.id + " version:" + paramString.version + " status:" + paramString.status + " type:" + paramString.cBc);
            if (5 == paramString.status)
            {
              paramString = new j(paramString.id, 21);
              aw.Rg().a(paramString, 0);
              AppMethodBeat.o(16420);
            }
            else
            {
              ab.i("MicroMsg.TraceConfigUpdater", "summer pkgInfo has downloaded and release");
              this.ehZ.edit().putLong("trace_config_last_update_time", System.currentTimeMillis()).commit();
              release();
              AppMethodBeat.o(16420);
            }
          }
        }
        else
        {
          release();
          AppMethodBeat.o(16420);
        }
      }
      else
      {
        if (i == 160)
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
            kP(((j)paramm).fMn);
          release();
        }
        AppMethodBeat.o(16420);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.d.c
 * JD-Core Version:    0.6.2
 */