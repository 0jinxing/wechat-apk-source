package com.tencent.mm.audio.mix.f;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.c.e.a;
import com.tencent.mm.audio.mix.d.h;
import com.tencent.mm.audio.mix.d.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c
{
  public String appId;
  public d cno;
  public com.tencent.mm.audio.mix.d.a cnp;
  public HashMap<String, Boolean> cnq;
  private com.tencent.mm.audio.mix.c.e cnr;
  public com.tencent.mm.audio.mix.b.a.d cns;

  public c()
  {
    AppMethodBeat.i(137139);
    this.cnq = new HashMap();
    this.cno = new d();
    this.cnp = new com.tencent.mm.audio.mix.d.a(this.cno);
    this.cno.cnp = this.cnp;
    this.cnr = new com.tencent.mm.audio.mix.c.e();
    this.cns = new com.tencent.mm.audio.mix.b.a.d();
    AppMethodBeat.o(137139);
  }

  private void d(com.tencent.mm.ag.b paramb)
  {
    AppMethodBeat.i(137148);
    paramb.ckA = true;
    int i = this.cno.ea(paramb.ckD);
    int j = this.cno.Es();
    if (i <= 2000)
      paramb.ckA = false;
    if ((i < 5000) && (j <= 5));
    for (paramb.ckA = false; ; paramb.ckA = true)
    {
      if (paramb.filePath.contains("scale_intro"))
        paramb.ckA = false;
      if (j <= 5)
        break;
      Object localObject = this.cno.Et();
      if (((ArrayList)localObject).contains(paramb.ckD))
        ((ArrayList)localObject).remove(paramb.ckD);
      if (((ArrayList)localObject).size() <= 2)
        break;
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "do stop paused audio size:%d", new Object[] { Integer.valueOf(((ArrayList)localObject).size()) });
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        dV((String)((Iterator)localObject).next());
    }
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "playingCount:%d, duration:%d, supportMixPlay:%b", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Boolean.valueOf(paramb.ckA) });
    AppMethodBeat.o(137148);
  }

  private com.tencent.mm.ag.b dQ(String paramString)
  {
    AppMethodBeat.i(137145);
    paramString = this.cno.dQ(paramString);
    AppMethodBeat.o(137145);
    return paramString;
  }

  public final void Eh()
  {
    AppMethodBeat.i(137140);
    ??? = this.cnp;
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "pauseAllOnBackground");
    Object localObject2 = ((com.tencent.mm.audio.mix.d.a)???).clF.iterator();
    Object localObject4;
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = (String)((Iterator)localObject2).next();
      localObject4 = (com.tencent.mm.audio.mix.d.b)((com.tencent.mm.audio.mix.d.a)???).clC.get(localObject4);
      if ((localObject4 != null) && (!((com.tencent.mm.audio.mix.d.b)localObject4).clI) && (!((com.tencent.mm.audio.mix.d.b)localObject4).Dv()))
      {
        localObject4 = ((com.tencent.mm.audio.mix.d.b)localObject4).clJ;
        if ((localObject4 != null) && (!((k)localObject4).DA()))
          ((k)localObject4).Dx();
      }
    }
    ??? = this.cno;
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "pauseAllOnBackground");
    ((d)???).cnB.DS();
    ((d)???).El();
    ??? = this.cnr;
    if (com.tencent.mm.audio.mix.c.e.clx == 0L)
      com.tencent.mm.audio.mix.c.e.clx = 0L;
    long l = System.currentTimeMillis();
    if (l - com.tencent.mm.audio.mix.c.e.clx <= com.tencent.mm.audio.mix.c.e.clu.longValue())
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioScanConvertCacheController", "startClean the last clean time is in AUDIO_MIX_NO_SCAN_TIME time");
    while (true)
    {
      localObject2 = com.tencent.mm.audio.mix.b.d.Dm();
      synchronized (((com.tencent.mm.audio.mix.b.d)localObject2).ckQ)
      {
        localObject4 = ((com.tencent.mm.audio.mix.b.d)localObject2).ckO.iterator();
        Object localObject5;
        do
        {
          if (!((Iterator)localObject4).hasNext())
            break;
          localObject5 = (String)((Iterator)localObject4).next();
          localObject5 = (com.tencent.mm.audio.mix.a.c)((com.tencent.mm.audio.mix.b.d)localObject2).ckP.get(localObject5);
        }
        while ((localObject5 == null) || (!((com.tencent.mm.audio.mix.a.c)localObject5).cky) || (!((com.tencent.mm.audio.mix.a.c)localObject5).ckB));
        ((com.tencent.mm.audio.mix.a.c)localObject5).Dc();
      }
      com.tencent.mm.audio.mix.c.e.clx = l;
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioScanConvertCacheController", "start scan audio mix convert file");
      h.a(new e.a((com.tencent.mm.audio.mix.c.e)???, "clean audio mix convert cache"));
    }
    AppMethodBeat.o(137140);
  }

  public final boolean Ei()
  {
    AppMethodBeat.i(137160);
    boolean bool = this.cno.cnw.get();
    AppMethodBeat.o(137160);
    return bool;
  }

  public final void Ej()
  {
    AppMethodBeat.i(137164);
    String str = this.appId;
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmDataTrackTaskController", "recycleAllCache appId:%s", new Object[] { str });
    com.tencent.mm.audio.mix.b.a.d.a(new com.tencent.mm.audio.mix.b.a.c(str), "AudioPcmDataTrackRecycleCacheTask");
    this.cnq.clear();
    AppMethodBeat.o(137164);
  }

  public final long Ek()
  {
    return this.cno.cnB.cmG;
  }

  public final void a(com.tencent.mm.ag.b paramb)
  {
    AppMethodBeat.i(137142);
    this.appId = paramb.appId;
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "preparePlay:%s", new Object[] { paramb.ckD });
    if ((ee(paramb.filePath)) && (paramb.fqK))
      d(paramb);
    Object localObject1 = this.cno;
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "preparePlay");
    if ((!paramb.fqX) && (paramb.fqK))
      if (((d)localObject1).cnu.get())
      {
        ((d)localObject1).Em();
        ((d)localObject1).clD.put(paramb.ckD, paramb);
      }
    while (true)
    {
      synchronized (((d)localObject1).cnz)
      {
        while (true)
        {
          ((d)localObject1).cmD.put(paramb.ckD, Boolean.FALSE);
          ((d)localObject1).cnB.dG(paramb.ckD);
          ((d)localObject1).cnB.DR();
          localObject1 = this.cnp;
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "prepareDecode");
          if (paramb == null)
          {
            com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "param is null");
            AppMethodBeat.o(137142);
            return;
            if (((d)localObject1).cnu.get())
              break;
            com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayerImpl", "initThread");
            ((d)localObject1).cnu.set(true);
            ((d)localObject1).cnw.set(false);
            ((d)localObject1).cnv.set(false);
            ((d)localObject1).Em();
            break;
            if (!paramb.fqX)
              break;
            synchronized (((d)localObject1).cnz)
            {
              if (((d)localObject1).cnH.containsKey(paramb.ckD))
              {
                e locale = (e)((d)localObject1).cnH.get(paramb.ckD);
                if (locale != null)
                  if (locale.g(new Integer[] { Integer.valueOf(4) }))
                    ((d)localObject1).cnH.remove(paramb.ckD);
              }
            }
          }
        }
      }
      if (TextUtils.isEmpty(paramb.ckD))
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "audioId is empty!");
        AppMethodBeat.o(137142);
        continue;
      }
      if (!((com.tencent.mm.audio.mix.d.a)localObject1).clF.contains(paramb.ckD))
      {
        ((com.tencent.mm.audio.mix.d.a)localObject1).clF.add(paramb.ckD);
        ((com.tencent.mm.audio.mix.d.a)localObject1).clD.put(paramb.ckD, paramb);
        bool = false;
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "ids:%d, id2ParamMap:%d", new Object[] { Integer.valueOf(((com.tencent.mm.audio.mix.d.a)localObject1).clF.size()), Integer.valueOf(((com.tencent.mm.audio.mix.d.a)localObject1).clD.size()) });
        if (!paramb.fqX)
          break label593;
        bool = ((com.tencent.mm.audio.mix.d.a)localObject1).b(paramb.ckD, bool, true);
        ??? = ((com.tencent.mm.audio.mix.d.a)localObject1).ckQ;
        if (!bool);
      }
      try
      {
        if (!((com.tencent.mm.audio.mix.d.a)localObject1).clE.contains(paramb.filePath))
          ((com.tencent.mm.audio.mix.d.a)localObject1).clE.add(paramb.filePath);
        AppMethodBeat.o(137142);
        continue;
        if (((com.tencent.mm.ag.b)((com.tencent.mm.audio.mix.d.a)localObject1).clD.get(paramb.ckD)).e(paramb))
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "is same param");
        for (bool = false; ; bool = true)
        {
          ((com.tencent.mm.audio.mix.d.a)localObject1).clD.put(paramb.ckD, paramb);
          break;
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "force to decode");
        }
      }
      finally
      {
        AppMethodBeat.o(137142);
      }
      label593: if (paramb.fqK)
      {
        ((com.tencent.mm.audio.mix.d.a)localObject1).b(paramb.ckD, bool, false);
        AppMethodBeat.o(137142);
        continue;
      }
      boolean bool = ((com.tencent.mm.audio.mix.d.a)localObject1).b(paramb.ckD, bool, true);
      ??? = ((com.tencent.mm.audio.mix.d.a)localObject1).ckQ;
      if (bool);
      try
      {
        if (!((com.tencent.mm.audio.mix.d.a)localObject1).clE.contains(paramb.filePath))
          ((com.tencent.mm.audio.mix.d.a)localObject1).clE.add(paramb.filePath);
        AppMethodBeat.o(137142);
      }
      finally
      {
        AppMethodBeat.o(137142);
      }
    }
  }

  public final void a(b paramb)
  {
    this.cno.cnC = paramb;
  }

  public final void a(g paramg)
  {
    this.cno.cnE = paramg;
  }

  public final void b(com.tencent.mm.ag.b paramb)
  {
    AppMethodBeat.i(137143);
    this.cno.clD.put(paramb.ckD, paramb);
    this.cnp.clD.put(paramb.ckD, paramb);
    AppMethodBeat.o(137143);
  }

  public final void c(com.tencent.mm.ag.b paramb)
  {
    AppMethodBeat.i(137144);
    Object localObject = this.cno;
    if (((d)localObject).clD.containsKey(paramb.ckD))
      ((d)localObject).clD.put(paramb.ckD, paramb);
    localObject = this.cnp;
    if (((com.tencent.mm.audio.mix.d.a)localObject).clD.containsKey(paramb.ckD))
      ((com.tencent.mm.audio.mix.d.a)localObject).clD.put(paramb.ckD, paramb);
    AppMethodBeat.o(137144);
  }

  public final void clearCache()
  {
    AppMethodBeat.i(137141);
    this.cnp.clearCache();
    this.cno.clearCache();
    AppMethodBeat.o(137141);
  }

  public final boolean dF(String paramString)
  {
    AppMethodBeat.i(137154);
    boolean bool = this.cno.dF(paramString);
    AppMethodBeat.o(137154);
    return bool;
  }

  public final boolean dR(String paramString)
  {
    AppMethodBeat.i(137146);
    boolean bool;
    if (this.cno.clD.containsKey(paramString))
    {
      bool = true;
      AppMethodBeat.o(137146);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137146);
    }
  }

  public final void dS(String paramString)
  {
    AppMethodBeat.i(137147);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "play audioId:%s, audio state:%d", new Object[] { paramString, Integer.valueOf(this.cno.eg(paramString)) });
    d(this.cno.dQ(paramString));
    d locald = this.cno;
    locald.cnw.set(false);
    locald.cnv.set(false);
    locald.Eq();
    locald.Em();
    synchronized (locald.cnz)
    {
      locald.cmD.put(paramString, Boolean.FALSE);
      locald.cnB.dG(paramString);
      locald.cnF.remove(paramString);
      locald.cnG.put(paramString, Boolean.TRUE);
      if ((locald.cnp.dE(paramString)) && (locald.cnp.dF(paramString)))
        locald.i(0, paramString);
      this.cnp.dC(paramString);
      AppMethodBeat.o(137147);
      return;
    }
  }

  public final void dT(String paramString)
  {
    AppMethodBeat.i(137149);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "resume audioId:%s, audio state:%d", new Object[] { paramString, Integer.valueOf(this.cno.eg(paramString)) });
    d(this.cno.dQ(paramString));
    d locald = this.cno;
    locald.cnw.set(false);
    locald.cnv.set(false);
    locald.Eq();
    locald.Em();
    synchronized (locald.cnz)
    {
      locald.cmD.put(paramString, Boolean.FALSE);
      locald.cnB.dG(paramString);
      locald.cnF.remove(paramString);
      locald.cnG.put(paramString, Boolean.TRUE);
      if ((locald.cnp.dE(paramString)) && (locald.cnp.dF(paramString)))
        locald.i(1, paramString);
      this.cnp.dC(paramString);
      AppMethodBeat.o(137149);
      return;
    }
  }

  public final void dU(String paramString)
  {
    AppMethodBeat.i(137150);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "pause audioId:%s, audio state:%d", new Object[] { paramString, Integer.valueOf(this.cno.eg(paramString)) });
    Object localObject = this.cno;
    ((d)localObject).cnB.dH(paramString);
    if ((((d)localObject).cnp.dE(paramString)) && (((d)localObject).cnp.dF(paramString)))
      ((d)localObject).i(2, paramString);
    localObject = this.cnp;
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioDecodeMgr", "pauseDecode audioId:%s", new Object[] { paramString });
    paramString = (com.tencent.mm.audio.mix.d.b)((com.tencent.mm.audio.mix.d.a)localObject).clC.get(paramString);
    if (paramString == null)
    {
      com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "task is not exist");
      AppMethodBeat.o(137150);
    }
    while (true)
    {
      return;
      if (paramString.clI)
      {
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "task is execute end!");
        AppMethodBeat.o(137150);
      }
      else if (paramString.Dv())
      {
        com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.AudioDecodeMgr", "task is isDetach!");
        AppMethodBeat.o(137150);
      }
      else
      {
        paramString = paramString.clJ;
        if (paramString != null)
          paramString.pause();
        AppMethodBeat.o(137150);
      }
    }
  }

  public final void dV(String paramString)
  {
    AppMethodBeat.i(137151);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "stop audioId:%s, audio state:%d", new Object[] { paramString, Integer.valueOf(this.cno.eg(paramString)) });
    this.cno.dV(paramString);
    this.cnp.dD(paramString);
    AppMethodBeat.o(137151);
  }

  public final boolean dW(String paramString)
  {
    AppMethodBeat.i(137155);
    d locald = this.cno;
    boolean bool;
    if (locald.cnG.containsKey(paramString))
    {
      bool = ((Boolean)locald.cnG.get(paramString)).booleanValue();
      AppMethodBeat.o(137155);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137155);
    }
  }

  public final boolean dX(String paramString)
  {
    AppMethodBeat.i(137156);
    d locald = this.cno;
    if (locald.cnH.containsKey(paramString))
    {
      paramString = (e)locald.cnH.get(paramString);
      if (paramString != null)
        if (paramString.g(new Integer[] { Integer.valueOf(9) }))
          AppMethodBeat.o(137156);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(137156);
    }
  }

  public final boolean dY(String paramString)
  {
    AppMethodBeat.i(137157);
    d locald = this.cno;
    if (locald.cnH.containsKey(paramString))
    {
      paramString = (e)locald.cnH.get(paramString);
      if (paramString != null)
        if (paramString.g(new Integer[] { Integer.valueOf(7) }))
          AppMethodBeat.o(137157);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(137157);
    }
  }

  public final boolean dZ(String paramString)
  {
    AppMethodBeat.i(137159);
    d locald = this.cno;
    if (locald.cnH.containsKey(paramString))
    {
      paramString = (e)locald.cnH.get(paramString);
      if (paramString != null)
      {
        if (!paramString.g(new Integer[] { Integer.valueOf(3) }))
          if (!paramString.g(new Integer[] { Integer.valueOf(4) }))
            if (!paramString.g(new Integer[] { Integer.valueOf(5) }))
              break label102;
        AppMethodBeat.o(137159);
      }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      label102: AppMethodBeat.o(137159);
    }
  }

  public final int ea(String paramString)
  {
    AppMethodBeat.i(137161);
    int i = this.cno.ea(paramString);
    AppMethodBeat.o(137161);
    return i;
  }

  public final com.tencent.mm.ag.d eb(String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(137162);
    d locald = this.cno;
    com.tencent.mm.ag.d locald1;
    int i;
    int j;
    boolean bool2;
    int k;
    if (locald.cnI.containsKey(paramString))
    {
      locald1 = (com.tencent.mm.ag.d)locald.cnI.get(paramString);
      i = locald.ea(paramString);
      j = locald.ef(paramString);
      bool2 = locald.dF(paramString);
      if (!locald.clD.containsKey(paramString))
        break label283;
      Object localObject = ((com.tencent.mm.ag.b)locald.clD.get(paramString)).filePath;
      if (TextUtils.isEmpty((CharSequence)localObject))
        break label283;
      localObject = com.tencent.mm.audio.mix.b.d.Dm().dv((String)localObject);
      if ((localObject == null) || (((com.tencent.mm.audio.mix.a.c)localObject).duration <= 0L))
        break label283;
      k = 100;
      label122: if (k >= 0)
        break label313;
      k = 0;
    }
    label152: label283: label295: label301: label313: 
    while (true)
    {
      locald1.csK = j;
      locald1.duration = i;
      if (bool2)
      {
        bool2 = false;
        locald1.rw = bool2;
        if ((!locald.cnF.containsKey(paramString)) || (!((Boolean)locald.cnF.get(paramString)).booleanValue()))
          break label295;
        bool2 = bool1;
        label190: locald1.fqY = bool2;
        locald1.fqZ = (k * i / 100);
        if (!locald.clD.containsKey(paramString))
          break label301;
        paramString = (com.tencent.mm.ag.b)locald.clD.get(paramString);
        locald1.startTime = paramString.fqJ;
        locald1.ckz = paramString.clP;
        AppMethodBeat.o(137162);
      }
      while (true)
      {
        return locald1;
        locald1 = new com.tencent.mm.ag.d();
        locald.cnI.put(paramString, locald1);
        break;
        k = 0;
        break label122;
        bool2 = true;
        break label152;
        bool2 = false;
        break label190;
        locald1 = null;
        AppMethodBeat.o(137162);
      }
    }
  }

  public final void ec(String paramString)
  {
    AppMethodBeat.i(137165);
    String str = this.appId;
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmDataTrackTaskController", "cacheToFile appId:%s, filePath:%s", new Object[] { str, paramString });
    com.tencent.mm.audio.mix.b.a.d.a(new com.tencent.mm.audio.mix.b.a.a(str, paramString), "AudioPcmDataTrackCacheToFileTask");
    AppMethodBeat.o(137165);
  }

  public final boolean ed(String paramString)
  {
    AppMethodBeat.i(137166);
    paramString = dQ(paramString);
    boolean bool;
    if (paramString != null)
      if (this.cnq.containsKey(paramString.filePath))
      {
        bool = ((Boolean)this.cnq.get(paramString.filePath)).booleanValue();
        AppMethodBeat.o(137166);
      }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.audio.mix.b.d.Dm().dx(paramString.filePath);
      if (bool)
        this.cnq.put(paramString.filePath, Boolean.valueOf(bool));
      AppMethodBeat.o(137166);
      continue;
      bool = false;
      AppMethodBeat.o(137166);
    }
  }

  public final boolean ee(String paramString)
  {
    AppMethodBeat.i(137167);
    boolean bool;
    if (this.cnq.containsKey(paramString))
    {
      bool = ((Boolean)this.cnq.get(paramString)).booleanValue();
      AppMethodBeat.o(137167);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.audio.mix.b.d.Dm().dx(paramString);
      if (bool)
        this.cnq.put(paramString, Boolean.valueOf(bool));
      AppMethodBeat.o(137167);
    }
  }

  public final void i(int paramInt, String paramString)
  {
    AppMethodBeat.i(137163);
    this.cno.i(paramInt, paramString);
    AppMethodBeat.o(137163);
  }

  public final boolean isPaused(String paramString)
  {
    AppMethodBeat.i(137158);
    d locald = this.cno;
    if (locald.cnH.containsKey(paramString))
    {
      paramString = (e)locald.cnH.get(paramString);
      if (paramString != null)
        if (paramString.g(new Integer[] { Integer.valueOf(2) }))
          AppMethodBeat.o(137158);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(137158);
    }
  }

  public final void remove(String paramString)
  {
    AppMethodBeat.i(137152);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "remove audioId:%s", new Object[] { paramString });
    d locald = this.cno;
    locald.clD.remove(paramString);
    locald.cnF.remove(paramString);
    locald.cnG.remove(paramString);
    synchronized (locald.cnz)
    {
      locald.cnH.remove(paramString);
      locald.cmD.remove(paramString);
      locald.cnI.remove(paramString);
      ??? = this.cnp;
      if ((((com.tencent.mm.audio.mix.d.a)???).clC.containsKey(paramString)) && (((com.tencent.mm.audio.mix.d.a)???).clF.contains(paramString)))
        ((com.tencent.mm.audio.mix.d.a)???).dD(paramString);
      ((com.tencent.mm.audio.mix.d.a)???).clD.remove(paramString);
      ((com.tencent.mm.audio.mix.d.a)???).clF.remove(paramString);
      AppMethodBeat.o(137152);
      return;
    }
  }

  public final boolean w(String paramString, int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(137153);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "seekTo audioId:%s, position:%d", new Object[] { paramString, Integer.valueOf(paramInt) });
    boolean bool2 = this.cnp.v(paramString, paramInt);
    boolean bool3;
    if (!bool2)
    {
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "seekTo fail audioId:%s", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(137153);
      bool3 = false;
      return bool3;
    }
    i(10, paramString);
    long l = this.cno.ef(paramString);
    int i = this.cno.eg(paramString);
    if (!ed(paramString))
    {
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "seekTo cache is not exist");
      bool3 = true;
    }
    while (true)
    {
      i(6, paramString);
      if ((bool3) && (bool2))
      {
        AppMethodBeat.o(137153);
        bool3 = bool1;
        break;
        if (ea(paramString) <= 2000)
        {
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "seekTo duration is not support seek");
          if (this.cnp.dE(paramString))
            break label318;
          bool2 = this.cnp.u(paramString, paramInt);
          bool3 = true;
          continue;
        }
        if (Math.abs(paramInt - l) <= 3000L)
        {
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "seekTo time is not support seek");
          bool3 = true;
          continue;
        }
        if ((i != 0) && (i != 1) && (i != 2))
        {
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioMixPlayer", "seekTo state is not support seek");
          bool3 = true;
          continue;
        }
        if (!this.cnp.dE(paramString))
        {
          bool2 = this.cnp.u(paramString, paramInt);
          bool3 = true;
          continue;
        }
        bool3 = this.cno.cnB.w(paramString, paramInt);
        continue;
      }
      AppMethodBeat.o(137153);
      bool3 = false;
      break;
      label318: bool3 = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.f.c
 * JD-Core Version:    0.6.2
 */