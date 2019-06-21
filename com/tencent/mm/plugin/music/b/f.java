package com.tencent.mm.plugin.music.b;

import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.qqmusic.mediaplayer.CommonPlayer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
{
  private static f oJQ;
  com.tencent.mm.ag.a csM;
  Object lrj;
  private HashMap<String, String> oJA;
  HashMap<String, LinkedList<String>> oJB;
  HashMap<String, com.tencent.mm.ag.b> oJC;
  private HashMap<String, com.tencent.mm.ag.d> oJD;
  private LinkedList<String> oJE;
  HashMap<String, Integer> oJF;
  private LinkedList<String> oJG;
  boolean oJH;
  private boolean oJI;
  long oJJ;
  private long oJK;
  com.tencent.mm.plugin.music.b.a.d oJL;
  private com.tencent.mm.plugin.music.b.b.a oJM;
  private HashMap<String, String> oJN;
  HashMap<String, Integer> oJO;
  com.tencent.mm.audio.mix.f.c oJP;
  private c oJR;
  private Runnable oJS;
  Runnable oJT;
  private com.tencent.mm.audio.mix.f.b oJU;
  private com.tencent.mm.audio.mix.f.g oJV;
  private LinkedList<String> oJu;
  HashMap<String, h> oJv;
  LinkedList<String> oJw;
  HashMap<String, h> oJx;
  LinkedList<String> oJy;
  LinkedList<String> oJz;

  private f()
  {
    AppMethodBeat.i(137287);
    this.oJu = new LinkedList();
    this.oJv = new HashMap();
    this.oJw = new LinkedList();
    this.oJx = new HashMap();
    this.oJy = new LinkedList();
    this.oJz = new LinkedList();
    this.oJA = new HashMap();
    this.oJB = new HashMap();
    this.oJC = new HashMap();
    this.oJD = new HashMap();
    this.oJE = new LinkedList();
    this.oJF = new HashMap();
    this.oJG = new LinkedList();
    this.lrj = new Object();
    this.oJH = false;
    this.oJI = false;
    this.oJJ = 0L;
    this.oJK = 0L;
    this.csM = new com.tencent.mm.ag.a();
    this.oJM = new com.tencent.mm.plugin.music.b.b.a();
    this.oJN = new HashMap();
    this.oJO = new HashMap();
    this.oJR = new f.1(this);
    this.oJS = new f.2(this);
    this.oJT = new f.3(this);
    this.oJU = new f.5(this);
    this.oJV = new f.6(this);
    bSB();
    this.oJP = new com.tencent.mm.audio.mix.f.c();
    this.oJP.a(this.oJU);
    this.oJP.a(this.oJV);
    AppMethodBeat.o(137287);
  }

  private void SE(String arg1)
  {
    AppMethodBeat.i(137314);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAllStoppedAudioPlayersAndSaveStateByAppId, appId:%s", new Object[] { ??? });
    Object localObject = (LinkedList)this.oJB.get(???);
    if ((localObject == null) || (((LinkedList)localObject).size() == 0))
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to stop");
      AppMethodBeat.o(137314);
    }
    while (true)
    {
      return;
      while (true)
      {
        String str;
        synchronized (this.lrj)
        {
          Iterator localIterator = ((LinkedList)localObject).iterator();
          if (!localIterator.hasNext())
            break;
          str = (String)localIterator.next();
          if (this.oJP.dR(str))
            this.oJP.dV(str);
          localObject = (h)this.oJx.remove(str);
          this.oJy.remove(str);
          if (localObject == null)
            continue;
          b(str, (h)localObject);
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "destroy recycled player");
          if (((h)localObject).fqY)
            d(str, (h)localObject);
        }
        c(str, localh);
      }
      AppMethodBeat.o(137314);
    }
  }

  private String SF(String paramString)
  {
    AppMethodBeat.i(137317);
    Iterator localIterator = this.oJz.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      LinkedList localLinkedList = (LinkedList)this.oJB.get(str);
      if ((localLinkedList != null) && (localLinkedList.contains(paramString)))
      {
        AppMethodBeat.o(137317);
        paramString = str;
      }
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(137317);
    }
  }

  private boolean SG(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(137324);
    ??? = SB(paramString);
    if (??? == null)
      AppMethodBeat.o(137324);
    while (true)
    {
      return bool;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAndRemovePlayer, audioId:%s", new Object[] { paramString });
      c(paramString, (h)???);
      synchronized (this.lrj)
      {
        this.oJv.remove(paramString);
        this.oJw.remove(paramString);
        this.oJx.remove(paramString);
        this.oJy.remove(paramString);
        AppMethodBeat.o(137324);
        bool = true;
      }
    }
  }

  private void SH(String paramString)
  {
    AppMethodBeat.i(137328);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "recyclePlayer");
    int i = this.oJv.size();
    int j = this.oJx.size();
    int k = bSE();
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d, paused_player_count:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
    if (i >= 10)
      bSF();
    Iterator localIterator;
    String str;
    while (true)
    {
      paramString = SF(paramString);
      j = this.oJv.size();
      k = this.oJx.size();
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
      if (k < 50)
        break;
      localIterator = this.oJz.iterator();
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        if ((str != null) && (!str.equalsIgnoreCase(paramString)))
          SI(str);
      }
      if (k >= 6)
        bSF();
      else if (i + k >= 8)
        bSF();
    }
    if (k + j >= 50)
    {
      localIterator = this.oJz.iterator();
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        if ((str != null) && (!str.equalsIgnoreCase(paramString)))
          SI(str);
      }
    }
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "not do recycle player, condition is not satisfy to do recycleStopPlayerByAppId");
    k = this.oJx.size();
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "start_player_count:%d, recycled_player_count:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
    if (k >= 50)
    {
      bSG();
      AppMethodBeat.o(137328);
    }
    while (true)
    {
      return;
      if (k + j >= 50)
      {
        bSG();
        AppMethodBeat.o(137328);
      }
      else
      {
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "not do recycle player, condition is not satisfy to do recycleAllStopPlayer");
        AppMethodBeat.o(137328);
      }
    }
  }

  private void SI(String paramString)
  {
    AppMethodBeat.i(137331);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "recycleStoppedPlayerByAppId");
    SE(paramString);
    AppMethodBeat.o(137331);
  }

  private boolean SJ(String paramString)
  {
    AppMethodBeat.i(137332);
    boolean bool1 = false;
    Object localObject1 = new ArrayList();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    int i;
    Object localObject3;
    while (true)
    {
      synchronized (this.lrj)
      {
        i = this.oJv.size();
        if (i < 10)
        {
          this.oJE.clear();
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "playerCount:%d is not need to remove", new Object[] { Integer.valueOf(i) });
          bool1 = false;
          AppMethodBeat.o(137332);
          return bool1;
        }
        localObject3 = this.oJw.iterator();
        if (!((Iterator)localObject3).hasNext())
          break;
        localObject4 = (String)((Iterator)localObject3).next();
        localObject4 = (com.tencent.mm.ag.b)this.oJC.get(localObject4);
        if ((localObject4 == null) || (((com.tencent.mm.ag.b)localObject4).clP == null))
          continue;
        if (!localHashMap1.containsKey(((com.tencent.mm.ag.b)localObject4).clP))
        {
          localHashMap1.put(((com.tencent.mm.ag.b)localObject4).clP, Integer.valueOf(1));
          localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          localArrayList.add(((com.tencent.mm.ag.b)localObject4).ckD);
          localHashMap2.put(((com.tencent.mm.ag.b)localObject4).clP, localArrayList);
          if (((ArrayList)localObject1).contains(((com.tencent.mm.ag.b)localObject4).clP))
            continue;
          ((ArrayList)localObject1).add(((com.tencent.mm.ag.b)localObject4).clP);
        }
      }
      j = ((Integer)localHashMap1.get(((com.tencent.mm.ag.b)localObject4).clP)).intValue();
      localHashMap1.put(((com.tencent.mm.ag.b)localObject4).clP, Integer.valueOf(j + 1));
      ArrayList localArrayList = (ArrayList)localHashMap2.get(((com.tencent.mm.ag.b)localObject4).clP);
      if (!localArrayList.contains(((com.tencent.mm.ag.b)localObject4).ckD))
        localArrayList.add(((com.tencent.mm.ag.b)localObject4).ckD);
      localHashMap2.put(((com.tencent.mm.ag.b)localObject4).clP, localArrayList);
    }
    ??? = "";
    int k = com.tencent.mm.plugin.music.cache.g.bTA();
    ab.d("MicroMsg.Audio.AudioPlayerMgr", "removePlayerGroupMinCount:%d", new Object[] { Integer.valueOf(k) });
    Object localObject4 = ((ArrayList)localObject1).iterator();
    int j = k;
    label389: int m;
    if (((Iterator)localObject4).hasNext())
    {
      localObject3 = (String)((Iterator)localObject4).next();
      m = ((Integer)localHashMap1.get(localObject3)).intValue();
      ab.d("MicroMsg.Audio.AudioPlayerMgr", "count:%d, url:%s", new Object[] { Integer.valueOf(m), localObject3 });
      if (m < k)
        break label916;
      boolean bool2 = true;
      if (j >= m)
        break label909;
      ??? = localObject3;
      label472: j = m;
      localObject1 = ???;
      bool1 = bool2;
      if (TextUtils.isEmpty((CharSequence)???))
      {
        localObject1 = localObject3;
        bool1 = bool2;
        j = m;
      }
    }
    while (true)
    {
      ??? = localObject1;
      break label389;
      if (bool1)
      {
        paramString = (com.tencent.mm.ag.b)this.oJC.get(paramString);
        if ((paramString != null) && (??? != null) && (((String)???).equalsIgnoreCase(paramString.clP)))
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "srcUrl is same, not remove and don't play again");
          bool1 = false;
        }
      }
      while (true)
      {
        if (bool1)
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "need to remove player");
          ??? = (ArrayList)localHashMap2.get(???);
          if ((??? != null) && (((ArrayList)???).size() > 0))
          {
            paramString = new LinkedList();
            ??? = ((ArrayList)???).iterator();
            while (((Iterator)???).hasNext())
            {
              localObject1 = (String)((Iterator)???).next();
              localObject1 = (com.tencent.mm.ag.b)this.oJC.get(localObject1);
              if (localObject1 != null)
                paramString.add(localObject1);
            }
            Collections.sort(paramString, new f.a(this));
            ??? = new LinkedList();
            paramString = paramString.iterator();
            while (paramString.hasNext())
              ((LinkedList)???).add(((com.tencent.mm.ag.b)paramString.next()).ckD);
            j = i - 10;
            if ((j <= 0) || (((LinkedList)???).size() <= j))
              break label828;
            j++;
            ab.i("MicroMsg.Audio.AudioPlayerMgr", "removeCount should be %d", new Object[] { Integer.valueOf(j) });
            m = ((LinkedList)???).size() - j;
            j = m;
            if (m < 0)
              j = 1;
            this.oJE.addAll(((LinkedList)???).subList(j, ((LinkedList)???).size()));
            label794: ab.i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player count : %d", new Object[] { Integer.valueOf(this.oJE.size()) });
          }
        }
        while (true)
        {
          AppMethodBeat.o(137332);
          break;
          label828: if ((j > 0) && (((LinkedList)???).size() < j))
          {
            this.oJE.addAll(((LinkedList)???).subList(1, ((LinkedList)???).size()));
            break label794;
          }
          this.oJE.add(((LinkedList)???).get(((LinkedList)???).size() - 1));
          break label794;
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "not need to remove player");
          this.oJE.clear();
        }
      }
      label909: m = j;
      break label472;
      label916: localObject1 = ???;
    }
  }

  private void a(com.tencent.mm.ag.b paramb1, com.tencent.mm.ag.b paramb2)
  {
    AppMethodBeat.i(137295);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "startAudioByMixPlayer");
    SG(paramb1.ckD);
    k(paramb1);
    if ((TextUtils.isEmpty(paramb1.filePath)) && (paramb2 != null) && (paramb2.e(paramb1)))
      paramb1.filePath = paramb2.filePath;
    if (paramb1.fqK)
    {
      if ((paramb2 != null) && (!paramb2.e(paramb1)))
      {
        a(paramb1, true, false);
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "mixPlayer param src change, do stop now and play new");
        if ((this.oJP.dF(paramb1.ckD)) || (this.oJP.dW(paramb1.ckD)) || (this.oJP.dX(paramb1.ckD)) || (this.oJP.dY(paramb1.ckD)) || (this.oJP.isPaused(paramb1.ckD)))
          this.oJP.dV(paramb1.ckD);
        this.oJP.a(paramb1);
        AppMethodBeat.o(137295);
      }
      while (true)
      {
        return;
        if (this.oJP.dF(paramb1.ckD))
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "mixPlayer is playing, do nothing");
          AppMethodBeat.o(137295);
        }
        else if ((this.oJP.dW(paramb1.ckD)) && (this.oJP.isPaused(paramb1.ckD)))
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "mixPlayer is paused, do resume");
          a(paramb1, true, false);
          this.oJP.dT(paramb1.ckD);
          AppMethodBeat.o(137295);
        }
        else if (this.oJP.dY(paramb1.ckD))
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "mixPlayer is isPrepared, do resume");
          a(paramb1, true, false);
          this.oJP.dT(paramb1.ckD);
          AppMethodBeat.o(137295);
        }
        else if (this.oJP.dX(paramb1.ckD))
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "mixPlayer is isPreparing, do nothing");
          AppMethodBeat.o(137295);
        }
        else
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "mixPlayer is end or stop, do startPlay");
          a(paramb1, true, false);
          this.oJP.a(paramb1);
          AppMethodBeat.o(137295);
        }
      }
    }
    if (this.oJP.dR(paramb1.ckD))
      this.oJP.c(paramb1);
    while (true)
    {
      if ((paramb2 != null) && (!paramb2.e(paramb1)))
      {
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "mixPlayer param src change, do stop now");
        if ((this.oJP.dF(paramb1.ckD)) || (this.oJP.dW(paramb1.ckD)) || (this.oJP.dX(paramb1.ckD)) || (this.oJP.dY(paramb1.ckD)) || (this.oJP.isPaused(paramb1.ckD)))
          this.oJP.dV(paramb1.ckD);
      }
      this.oJP.i(7, paramb1.ckD);
      AppMethodBeat.o(137295);
      break;
      this.oJP.b(paramb1);
    }
  }

  private void a(com.tencent.mm.ag.b paramb, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(137341);
    this.oJL = ((com.tencent.mm.plugin.music.b.a.d)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.b.a.d.class));
    if (this.oJL != null)
      this.oJL.r(paramb.ckD, paramb.clP, paramBoolean2);
    long l1 = System.currentTimeMillis();
    paramb.fqO = l1;
    long l2;
    if (paramBoolean1)
    {
      l2 = paramb.fqS;
      paramb.fqP = paramb.fqR;
      if ((l2 <= 0L) || (l1 <= l2))
        break label121;
      paramb.fqQ = (l1 - l2);
      AppMethodBeat.o(137341);
    }
    while (true)
    {
      return;
      l2 = paramb.fqU;
      paramb.fqP = paramb.fqT;
      break;
      label121: paramb.fqQ = 0L;
      AppMethodBeat.o(137341);
    }
  }

  private void a(String paramString, com.tencent.mm.ag.b paramb)
  {
    AppMethodBeat.i(137289);
    if (paramb == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "restorePlayerParam param == null, audioId:%s", new Object[] { paramString });
      AppMethodBeat.o(137289);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "restorePlayerParam audioId:%s", new Object[] { paramString });
      this.oJA.put(paramb.appId, paramb.processName);
      this.oJC.put(paramb.ckD, paramb);
      fj(paramb.appId, paramString);
      this.oJF.remove(paramString);
      AppMethodBeat.o(137289);
    }
  }

  private void a(String paramString, h paramh)
  {
    AppMethodBeat.i(137318);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "pausePlayerOnBackground, pause player on background by audioId:%s", new Object[] { paramString });
    com.tencent.mm.ag.b localb = (com.tencent.mm.ag.b)this.oJC.get(paramString);
    if ((localb != null) && (paramh.aie()) && (paramh.aig()))
    {
      localb.fqK = true;
      localb.startTime = paramh.bTi();
      b(paramString, paramh);
      paramString = Sz(paramString);
      if ((paramString != null) && (paramh.aie()))
        paramString.rw = true;
      if ((!paramh.aie()) && (!paramh.aig()) && (!paramh.bTc()) && (!paramh.bTd()) && (!paramh.isPaused()))
        break label183;
      paramh.bTf();
      AppMethodBeat.o(137318);
    }
    while (true)
    {
      return;
      if ((localb != null) && (paramh.aig()))
      {
        localb.fqK = true;
        localb.startTime = paramh.bTi();
        break;
      }
      if (localb == null)
        break;
      localb.fqK = true;
      localb.startTime = 0;
      break;
      label183: paramh.bTe();
      AppMethodBeat.o(137318);
    }
  }

  private static boolean a(h paramh)
  {
    boolean bool = true;
    AppMethodBeat.i(137325);
    if (paramh == null)
      AppMethodBeat.o(137325);
    while (true)
    {
      return bool;
      if ((paramh.aie()) || (paramh.isPaused()) || (paramh.bTc()) || (paramh.bTd()) || (paramh.aig()));
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label75;
        AppMethodBeat.o(137325);
        break;
      }
      label75: AppMethodBeat.o(137325);
      bool = false;
    }
  }

  private void aS(int paramInt, String paramString)
  {
    AppMethodBeat.i(137315);
    ab.e("MicroMsg.Audio.AudioPlayerMgr", "onErrorEvent with errCode:%d, audioId:%s", new Object[] { Integer.valueOf(paramInt), paramString });
    String str = paramString;
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "audioId is empty");
      str = e.bSy();
    }
    paramString = new u();
    paramString.csP.action = 4;
    paramString.csP.state = "error";
    paramString.csP.errCode = com.tencent.mm.plugin.music.f.a.e.zS(paramInt);
    paramString.csP.aIm = com.tencent.mm.plugin.music.f.a.e.ph(paramInt);
    paramString.csP.ckD = str;
    paramString.csP.appId = SF(str);
    com.tencent.mm.sdk.b.a.xxA.a(paramString, Looper.getMainLooper());
    AppMethodBeat.o(137315);
  }

  private void b(com.tencent.mm.ag.b paramb1, com.tencent.mm.ag.b paramb2)
  {
    int i = 1;
    AppMethodBeat.i(137296);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "startAudioByQQAudioPlayer");
    h localh = SB(paramb1.ckD);
    if (localh == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "startAudio, player is null, create new QQAudioPlayer with audioId:%s", new Object[] { paramb1.ckD });
      paramb2 = bSC();
      paramb2.a(this.oJR);
      paramb2.SN(paramb1.ckD);
      paramb2.b(paramb1);
      if (paramb1.fqK)
      {
        a(paramb1, true, true);
        e(paramb1.ckD, paramb2);
        paramb1.fqM = System.currentTimeMillis();
        paramb2.l(paramb1);
        AppMethodBeat.o(137296);
      }
    }
    while (true)
    {
      return;
      f(paramb1.ckD, paramb2);
      paramb2.bSR();
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "new player autoplay false, not to play ");
      AppMethodBeat.o(137296);
      continue;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "startAudio, audioId:%s", new Object[] { paramb1.ckD });
      if (!paramb1.fqK)
        break;
      e(paramb1.ckD, localh);
      paramb1.fqM = System.currentTimeMillis();
      localh.b(paramb1);
      if ((paramb2 != null) && (!paramb2.e(paramb1)))
      {
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "param src change, do stop now and play new");
        if ((localh.aie()) || (localh.aig()) || (localh.bTc()) || (localh.bTd()) || (localh.isPaused()))
          localh.stopPlay();
        a(paramb1, true, true);
        localh.l(paramb1);
        AppMethodBeat.o(137296);
      }
      else if (localh.aie())
      {
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "is playing, do nothing");
        AppMethodBeat.o(137296);
      }
      else if ((localh.aig()) && (localh.isPaused()))
      {
        a(paramb1, true, true);
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "is paused, do resume");
        localh.resume();
        AppMethodBeat.o(137296);
      }
      else if (localh.bTd())
      {
        a(paramb1, true, true);
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "is isPrepared, do resume");
        localh.resume();
        AppMethodBeat.o(137296);
      }
      else if (localh.bTc())
      {
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "is isPreparing, do nothing");
        AppMethodBeat.o(137296);
      }
      else
      {
        a(paramb1, true, true);
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "is end or stop, do startPlay");
        localh.l(paramb1);
        AppMethodBeat.o(137296);
      }
    }
    while (true)
    {
      synchronized (this.lrj)
      {
        if (!this.oJw.contains(paramb1.ckD))
          break label610;
        if (i == 0)
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "mark player recycle");
          f(paramb1.ckD, localh);
          localh.b(paramb1);
          if ((paramb2 != null) && (!paramb2.e(paramb1)))
          {
            ab.i("MicroMsg.Audio.AudioPlayerMgr", "param src change, do stop now");
            if ((localh.aie()) || (localh.aig()) || (localh.bTc()) || (localh.bTd()) || (localh.isPaused()))
              localh.stopPlay();
          }
          localh.bSR();
          ab.e("MicroMsg.Audio.AudioPlayerMgr", "autoplay false, not to play ");
          AppMethodBeat.o(137296);
        }
      }
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "don't mark player, is playing");
      continue;
      label610: i = 0;
    }
  }

  public static f bSA()
  {
    AppMethodBeat.i(137286);
    if (oJQ == null)
      oJQ = new f();
    f localf = oJQ;
    AppMethodBeat.o(137286);
    return localf;
  }

  private h bSC()
  {
    AppMethodBeat.i(137316);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "createOrReusePlayer");
    label374: 
    while (true)
    {
      synchronized (this.lrj)
      {
        if (this.oJx.size() == 0)
        {
          localObject2 = new com/tencent/mm/plugin/music/b/h;
          ((h)localObject2).<init>();
          AppMethodBeat.o(137316);
          return localObject2;
        }
        Object localObject2 = null;
        Object localObject5 = "";
        long l1 = 0L;
        long l2 = System.currentTimeMillis();
        Iterator localIterator = this.oJy.iterator();
        if (localIterator.hasNext())
        {
          ??? = (String)localIterator.next();
          h localh2 = (h)this.oJx.get(???);
          if (localh2 == null)
            continue;
          if ((!localh2.fqY) && (!localh2.isCompleted()) && (!localh2.isStopped()))
          {
            if (localh2.oKc == null)
              continue;
            if (localh2.oKc.getPlayerState() == 9)
            {
              i = 1;
              if (i == 0)
                break label374;
            }
          }
          else
          {
            if ((l1 != 0L) && (localh2.eDL >= l1))
              break label374;
            l1 = localh2.eDL;
            localObject2 = localh2;
            localObject5 = ???;
            continue;
          }
          int i = 0;
          continue;
          i = 0;
          continue;
        }
        if ((localObject2 != null) && (l2 - l1 > 500L))
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "player is be reuse to play again with other audio");
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "unmarkPlayer, unmark player by audioId:%s", new Object[] { localObject5 });
          synchronized (this.lrj)
          {
            if (this.oJy.contains(localObject5))
            {
              this.oJx.remove(localObject5);
              this.oJy.remove(localObject5);
            }
            if (this.oJw.contains(localObject5))
            {
              this.oJw.remove(localObject5);
              this.oJv.remove(localObject5);
            }
            AppMethodBeat.o(137316);
          }
        }
      }
      h localh1 = new h();
      AppMethodBeat.o(137316);
    }
  }

  private int bSE()
  {
    AppMethodBeat.i(137327);
    while (true)
      synchronized (this.lrj)
      {
        Iterator localIterator = this.oJy.iterator();
        int i = 0;
        if (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          Object localObject3 = SB(str);
          boolean bool;
          if (localObject3 == null)
          {
            ab.e("MicroMsg.Audio.AudioPlayerMgr", "isPausedPlayer, player is null");
            localObject3 = Sz(str);
            if (localObject3 != null)
            {
              bool = ((com.tencent.mm.ag.d)localObject3).rw;
              if (bool)
                i++;
            }
            else
            {
              bool = false;
            }
          }
          else
          {
            bool = ((h)localObject3).isPaused();
          }
        }
        else
        {
          AppMethodBeat.o(137327);
          return i;
        }
      }
  }

  private void bSF()
  {
    AppMethodBeat.i(137329);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "recyclePausedPlayer");
    synchronized (this.lrj)
    {
      Object localObject2 = new java/util/LinkedList;
      ((LinkedList)localObject2).<init>();
      ((LinkedList)localObject2).addAll(this.oJy);
      Iterator localIterator = ((LinkedList)localObject2).iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localObject2 = (h)this.oJx.get(str);
        if ((localObject2 != null) && (((h)localObject2).isPaused()))
          a(str, (h)localObject2);
      }
    }
    AppMethodBeat.o(137329);
  }

  private void bSG()
  {
    AppMethodBeat.i(137330);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "recycleStopPlayer");
    while (true)
    {
      h localh;
      synchronized (this.lrj)
      {
        Object localObject2 = new java/util/LinkedList;
        ((LinkedList)localObject2).<init>();
        ((LinkedList)localObject2).addAll(this.oJy);
        Iterator localIterator = ((LinkedList)localObject2).iterator();
        if (!localIterator.hasNext())
          break;
        localObject2 = (String)localIterator.next();
        localh = (h)this.oJx.remove(localObject2);
        this.oJy.remove(localObject2);
        if (localh == null)
          continue;
        if (localh.fqY)
        {
          b((String)localObject2, localh);
          d((String)localObject2, localh);
        }
      }
      if (!localh.isPaused())
      {
        b(str, localh);
        c(str, localh);
      }
    }
    AppMethodBeat.o(137330);
  }

  private void bSI()
  {
    AppMethodBeat.i(137336);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "mixWithOther:%b, focus:%b", new Object[] { Boolean.valueOf(this.csM.fqI), Boolean.valueOf(this.oJM.oKT) });
    if ((!this.csM.fqI) && (!this.oJM.oKT))
    {
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "requestFocus()");
      bSJ();
      AppMethodBeat.o(137336);
    }
    while (true)
    {
      return;
      if ((this.csM.fqI) && (this.oJM.oKT))
      {
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "abandonFocus()");
        bSK();
      }
      AppMethodBeat.o(137336);
    }
  }

  private void bSJ()
  {
    AppMethodBeat.i(137337);
    if (this.oJM.oKT)
      AppMethodBeat.o(137337);
    while (true)
    {
      return;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "requestFocus focus:%b", new Object[] { Boolean.valueOf(this.oJM.requestFocus()) });
      AppMethodBeat.o(137337);
    }
  }

  private void bSL()
  {
    AppMethodBeat.i(137339);
    this.oJL = ((com.tencent.mm.plugin.music.b.a.d)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.b.a.d.class));
    if (this.oJL != null)
      this.oJL.bTm();
    AppMethodBeat.o(137339);
  }

  public static void bSz()
  {
    try
    {
      AppMethodBeat.i(137285);
      if (oJQ != null)
        AppMethodBeat.o(137285);
      while (true)
      {
        return;
        f localf = new com/tencent/mm/plugin/music/b/f;
        localf.<init>();
        oJQ = localf;
        AppMethodBeat.o(137285);
      }
    }
    finally
    {
    }
  }

  static void c(String paramString, h paramh)
  {
    AppMethodBeat.i(137320);
    if (paramh == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "destroyPlayer player is null for audioId:%s", new Object[] { paramString });
      AppMethodBeat.o(137320);
    }
    while (true)
    {
      return;
      if ((paramh.aie()) || (paramh.aig()) || (paramh.bTc()) || (paramh.bTd()) || (paramh.isPaused()))
        paramh.stopPlay();
      paramh.release();
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "destroyPlayer stop and release player by audioId:%s", new Object[] { paramString });
      AppMethodBeat.o(137320);
    }
  }

  private boolean cG(String paramString, int paramInt)
  {
    AppMethodBeat.i(137303);
    paramString = (com.tencent.mm.ag.b)this.oJC.get(paramString);
    boolean bool;
    if (paramString != null)
    {
      paramString.startTime = paramInt;
      bool = true;
      AppMethodBeat.o(137303);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(137303);
    }
  }

  static void d(String paramString, h paramh)
  {
    AppMethodBeat.i(137321);
    ab.d("MicroMsg.Audio.AudioPlayerMgr", "releasePlayer");
    c(paramString, paramh);
    AppMethodBeat.o(137321);
  }

  private void fj(String paramString1, String paramString2)
  {
    AppMethodBeat.i(137290);
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
      AppMethodBeat.o(137290);
    while (true)
    {
      return;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "saveCreateId, appId:%s, audioId:%s", new Object[] { paramString1, paramString2 });
      if (!this.oJz.contains(paramString1))
        this.oJz.add(paramString1);
      if (!this.oJu.contains(paramString2))
        this.oJu.add(paramString2);
      LinkedList localLinkedList1 = (LinkedList)this.oJB.get(paramString1);
      LinkedList localLinkedList2 = localLinkedList1;
      if (localLinkedList1 == null)
        localLinkedList2 = new LinkedList();
      if (!localLinkedList2.contains(paramString2))
        localLinkedList2.add(paramString2);
      this.oJB.put(paramString1, localLinkedList2);
      AppMethodBeat.o(137290);
    }
  }

  private void i(com.tencent.mm.ag.b paramb)
  {
    AppMethodBeat.i(137294);
    if (this.oJP.dR(paramb.ckD))
      this.oJP.c(paramb);
    while (true)
    {
      if (!TextUtils.isEmpty(paramb.filePath))
        SM(paramb.ckD);
      AppMethodBeat.o(137294);
      return;
      this.oJP.b(paramb);
    }
  }

  private void j(com.tencent.mm.ag.b paramb)
  {
    AppMethodBeat.i(137340);
    this.oJL = ((com.tencent.mm.plugin.music.b.a.d)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.b.a.d.class));
    if (this.oJL != null)
      this.oJL.fl(paramb.ckD, paramb.clP);
    AppMethodBeat.o(137340);
  }

  private static void k(com.tencent.mm.ag.b paramb)
  {
    AppMethodBeat.i(137343);
    if (paramb.fqV != null);
    while (true)
    {
      try
      {
        paramb.fqV.close();
        paramb.fqV = null;
        AppMethodBeat.o(137343);
        return;
      }
      catch (Exception paramb)
      {
        ab.printErrStackTrace("MicroMsg.Audio.AudioPlayerMgr", paramb, "closeAudioDataSource", new Object[0]);
      }
      AppMethodBeat.o(137343);
    }
  }

  public final int SA(String paramString)
  {
    AppMethodBeat.i(137309);
    int i = bSE();
    synchronized (this.lrj)
    {
      int j = this.oJu.size();
      int k = this.oJv.size();
      int m = this.oJx.size();
      paramString = (LinkedList)this.oJB.get(paramString);
      if (paramString == null)
      {
        n = 0;
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "getAudioPlayerCount, count:%d, player_count:%d, recycled_player_count:%d, audioIdsCount:%d, pause_count:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i) });
        AppMethodBeat.o(137309);
        return k;
      }
      int n = paramString.size();
    }
  }

  final h SB(String paramString)
  {
    AppMethodBeat.i(137311);
    if (this.oJv.containsKey(paramString))
    {
      paramString = (h)this.oJv.get(paramString);
      AppMethodBeat.o(137311);
    }
    while (true)
    {
      return paramString;
      if (this.oJx.containsKey(paramString))
      {
        paramString = (h)this.oJx.get(paramString);
        AppMethodBeat.o(137311);
      }
      else
      {
        paramString = null;
        AppMethodBeat.o(137311);
      }
    }
  }

  public final void SC(String paramString)
  {
    AppMethodBeat.i(137312);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "pauseAllAudioPlayers, appId:%s", new Object[] { paramString });
    this.oJP.Eh();
    bSK();
    Object localObject1 = (LinkedList)this.oJB.get(paramString);
    long l1 = this.oJP.Ek();
    long l2 = com.tencent.mm.audio.mix.b.d.Dm().Dn();
    long l3 = com.tencent.mm.audio.mix.b.c.Dk().Dl();
    long l4 = l2 + l3;
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "mixAverageTime:%d, loadedCacheBufferSize:%d, remainingBufferSize:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
    this.oJL = ((com.tencent.mm.plugin.music.b.a.d)com.tencent.mm.plugin.music.f.c.b.ar(com.tencent.mm.plugin.music.b.a.d.class));
    if ((localObject1 == null) || (((LinkedList)localObject1).size() == 0))
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to pause");
      AppMethodBeat.o(137312);
    }
    while (true)
    {
      return;
      if ((this.oJv.isEmpty()) && (this.oJx.isEmpty()))
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to pause");
        if (this.oJL != null)
          this.oJL.b(paramString, l1, l4, l2);
        AppMethodBeat.o(137312);
      }
      else
      {
        Object localObject2 = new LinkedList();
        synchronized (this.lrj)
        {
          ((LinkedList)localObject2).addAll((Collection)localObject1);
          localObject1 = ((LinkedList)localObject2).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            String str = (String)((Iterator)localObject1).next();
            ??? = (h)this.oJx.get(str);
            if (??? != null)
              a(str, (h)???);
          }
        }
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "playing player count:%d", new Object[] { Integer.valueOf(this.oJv.size()) });
        ??? = ((LinkedList)localObject2).iterator();
        while (((Iterator)???).hasNext())
        {
          localObject1 = (String)((Iterator)???).next();
          localObject2 = (h)this.oJv.get(localObject1);
          if (localObject2 != null)
          {
            a((String)localObject1, (h)localObject2);
            f((String)localObject1, (h)localObject2);
          }
        }
        if (this.oJL != null)
          this.oJL.b(paramString, l1, l4, l2);
        AppMethodBeat.o(137312);
      }
    }
  }

  public final void SD(String paramString)
  {
    AppMethodBeat.i(137313);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAllAudioPlayers, appId:%s", new Object[] { paramString });
    bSK();
    LinkedList localLinkedList = (LinkedList)this.oJB.remove(paramString);
    if ((localLinkedList == null) || (localLinkedList.size() == 0))
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "there is no audioIds and players for this appId to stop");
      AppMethodBeat.o(137313);
    }
    while (true)
    {
      return;
      Object localObject2;
      h localh;
      synchronized (this.lrj)
      {
        localObject2 = localLinkedList.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (String)((Iterator)localObject2).next();
          localh = (h)this.oJv.remove(localObject3);
          this.oJw.remove(localObject3);
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "destroy playing player");
          c((String)localObject3, localh);
          this.oJC.remove(localObject3);
          this.oJD.remove(localObject3);
          if (this.oJP.dR((String)localObject3))
          {
            this.oJP.dV((String)localObject3);
            this.oJP.remove((String)localObject3);
          }
        }
      }
      Object localObject3 = localLinkedList.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (String)((Iterator)localObject3).next();
        localh = (h)this.oJx.remove(localObject2);
        this.oJy.remove(localObject2);
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "destroy recycled player");
        c((String)localObject2, localh);
        this.oJC.remove(localObject2);
        this.oJD.remove(localObject2);
        if (this.oJP.dR((String)localObject2))
        {
          this.oJP.dV((String)localObject2);
          this.oJP.remove((String)localObject2);
        }
      }
      this.oJu.removeAll(localLinkedList);
      this.oJz.remove(paramString);
      this.oJA.remove(paramString);
      this.oJP.clearCache();
      this.oJP.Ej();
      this.oJN.clear();
      this.oJO.clear();
      AppMethodBeat.o(137313);
    }
  }

  public final void SK(String paramString)
  {
    AppMethodBeat.i(137334);
    if (this.oJz.size() == 0)
      AppMethodBeat.o(137334);
    while (true)
    {
      return;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAllAudioPlayersByProcessName with name :%s", new Object[] { paramString });
      Object localObject = new ArrayList();
      ((ArrayList)localObject).addAll(this.oJz);
      Iterator localIterator = ((ArrayList)localObject).iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localObject = (String)this.oJA.get(str);
        if ((paramString != null) && (paramString.equalsIgnoreCase((String)localObject)))
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "The app brand process name is same as the process which is killed by system");
          SD(str);
        }
      }
      AppMethodBeat.o(137334);
    }
  }

  final boolean SL(String paramString)
  {
    AppMethodBeat.i(137335);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "canRemoveAudioPlayerInPlayingListForTry");
    boolean bool1 = false;
    Object localObject1 = new ArrayList();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    while (true)
    {
      Object localObject4;
      synchronized (this.lrj)
      {
        i = this.oJv.size();
        if (i <= 5)
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "playerCount:%d is not need to remove for try", new Object[] { Integer.valueOf(i) });
          bool1 = false;
          AppMethodBeat.o(137335);
          return bool1;
        }
        localObject3 = this.oJw.iterator();
        if (!((Iterator)localObject3).hasNext())
          break label347;
        localObject4 = (String)((Iterator)localObject3).next();
        localObject4 = (com.tencent.mm.ag.b)this.oJC.get(localObject4);
        if ((localObject4 == null) || (((com.tencent.mm.ag.b)localObject4).clP == null))
          continue;
        if (!localHashMap1.containsKey(((com.tencent.mm.ag.b)localObject4).clP))
        {
          localHashMap1.put(((com.tencent.mm.ag.b)localObject4).clP, Integer.valueOf(1));
          localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          localArrayList.add(((com.tencent.mm.ag.b)localObject4).ckD);
          localHashMap2.put(((com.tencent.mm.ag.b)localObject4).clP, localArrayList);
          if (((ArrayList)localObject1).contains(((com.tencent.mm.ag.b)localObject4).clP))
            continue;
          ((ArrayList)localObject1).add(((com.tencent.mm.ag.b)localObject4).clP);
        }
      }
      i = ((Integer)localHashMap1.get(((com.tencent.mm.ag.b)localObject4).clP)).intValue();
      localHashMap1.put(((com.tencent.mm.ag.b)localObject4).clP, Integer.valueOf(i + 1));
      ArrayList localArrayList = (ArrayList)localHashMap2.get(((com.tencent.mm.ag.b)localObject4).clP);
      if (!localArrayList.contains(((com.tencent.mm.ag.b)localObject4).ckD))
        localArrayList.add(((com.tencent.mm.ag.b)localObject4).ckD);
      localHashMap2.put(((com.tencent.mm.ag.b)localObject4).clP, localArrayList);
      continue;
      label347: localObject3 = (com.tencent.mm.ag.b)this.oJC.get(paramString);
      ??? = ((ArrayList)localObject1).iterator();
      do
      {
        if (!((Iterator)???).hasNext())
          break;
        paramString = (String)((Iterator)???).next();
      }
      while ((localObject3 == null) || (paramString == null) || (!paramString.equalsIgnoreCase(((com.tencent.mm.ag.b)localObject3).clP)));
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "srcUrl is same, not remove and don't play again for try");
      bool1 = false;
      AppMethodBeat.o(137335);
    }
    paramString = "";
    ab.d("MicroMsg.Audio.AudioPlayerMgr", "removePlayerGroupMinCountForTry:%d", new Object[] { Integer.valueOf(2) });
    int i = 2;
    Object localObject3 = ((ArrayList)localObject1).iterator();
    label461: int j;
    if (((Iterator)localObject3).hasNext())
    {
      ??? = (String)((Iterator)localObject3).next();
      j = ((Integer)localHashMap1.get(???)).intValue();
      ab.d("MicroMsg.Audio.AudioPlayerMgr", "count:%d, url:%s", new Object[] { Integer.valueOf(j), ??? });
      if (j < 2)
        break label790;
      boolean bool2 = true;
      if (i >= j)
        break label787;
      paramString = (String)???;
      i = j;
      label546: j = i;
      localObject1 = paramString;
      bool1 = bool2;
      if (TextUtils.isEmpty(paramString))
      {
        localObject1 = ???;
        bool1 = bool2;
        j = i;
      }
    }
    while (true)
    {
      i = j;
      paramString = (String)localObject1;
      break label461;
      if (bool1)
      {
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "need to remove player");
        localObject1 = (ArrayList)localHashMap2.get(paramString);
        if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0))
        {
          paramString = new LinkedList();
          localObject1 = ((ArrayList)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            ??? = (String)((Iterator)localObject1).next();
            ??? = (com.tencent.mm.ag.b)this.oJC.get(???);
            if (??? != null)
              paramString.add(???);
          }
          Collections.sort(paramString, new f.a(this));
          localObject1 = new LinkedList();
          paramString = paramString.iterator();
          while (paramString.hasNext())
            ((LinkedList)localObject1).add(((com.tencent.mm.ag.b)paramString.next()).ckD);
          this.oJG.add(((LinkedList)localObject1).getLast());
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player count for try: %d", new Object[] { Integer.valueOf(this.oJG.size()) });
        }
      }
      while (true)
      {
        AppMethodBeat.o(137335);
        break;
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "not need to remove player for try");
      }
      label787: break label546;
      label790: j = i;
      localObject1 = paramString;
    }
  }

  public final void SM(String paramString)
  {
    AppMethodBeat.i(137342);
    if (!b.bSx())
      AppMethodBeat.o(137342);
    while (true)
    {
      return;
      Looper.myQueue().addIdleHandler(new f.4(this, paramString));
      AppMethodBeat.o(137342);
    }
  }

  public final boolean St(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(137298);
    h localh = SB(paramString);
    if (localh == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "pauseAudio, player is null");
      if (this.oJP.dR(paramString))
      {
        this.oJP.dU(paramString);
        AppMethodBeat.o(137298);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137298);
      bool = false;
      continue;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "pauseAudio, audioId:%s", new Object[] { paramString });
      localh.pause();
      b(paramString, localh);
      f(paramString, localh);
      AppMethodBeat.o(137298);
    }
  }

  public final boolean Su(String paramString)
  {
    AppMethodBeat.i(137299);
    h localh = SB(paramString);
    boolean bool;
    if (localh == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "stopAudio, player is null");
      if (this.oJP.dR(paramString))
      {
        this.oJP.dV(paramString);
        AppMethodBeat.o(137299);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(137299);
      bool = false;
      continue;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "stopAudio, audioId:%s", new Object[] { paramString });
      localh.stopPlay();
      com.tencent.mm.ag.b localb = (com.tencent.mm.ag.b)this.oJC.get(paramString);
      if (localb != null)
      {
        localb.startTime = 0;
        localb.fqK = true;
      }
      b(paramString, localh);
      f(paramString, localh);
      AppMethodBeat.o(137299);
      bool = true;
    }
  }

  public final boolean Sv(String paramString)
  {
    AppMethodBeat.i(137300);
    if (this.oJP.dR(paramString))
      this.oJP.dV(paramString);
    h localh = SB(paramString);
    if (localh == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "stopPlayOnBackGround, player is null");
      AppMethodBeat.o(137300);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "stopPlayOnBackGround, audioId:%s", new Object[] { paramString });
      localh.bTg();
      com.tencent.mm.ag.b localb = (com.tencent.mm.ag.b)this.oJC.get(paramString);
      if (localb != null)
      {
        localb.startTime = 0;
        localb.fqK = true;
      }
      b(paramString, localh);
      f(paramString, localh);
      AppMethodBeat.o(137300);
    }
  }

  public final boolean Sw(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(137301);
    this.oJP.dV(paramString);
    this.oJP.remove(paramString);
    ??? = SB(paramString);
    if (??? == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "destroyAudio, player is null");
      AppMethodBeat.o(137301);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "destroyAudio, audioId:%s", new Object[] { paramString });
      c(paramString, (h)???);
      synchronized (this.lrj)
      {
        this.oJv.remove(paramString);
        this.oJw.remove(paramString);
        this.oJx.remove(paramString);
        this.oJy.remove(paramString);
        this.oJu.remove(paramString);
        ??? = this.oJz.iterator();
        while (((Iterator)???).hasNext())
        {
          String str = (String)((Iterator)???).next();
          LinkedList localLinkedList = (LinkedList)this.oJB.get(str);
          if ((localLinkedList != null) && (localLinkedList.contains(paramString)))
          {
            localLinkedList.remove(paramString);
            if (localLinkedList.size() == 0)
            {
              this.oJB.remove(str);
              this.oJz.remove(str);
              this.oJA.remove(str);
            }
          }
        }
        this.oJC.remove(paramString);
        this.oJD.remove(paramString);
        AppMethodBeat.o(137301);
        bool = true;
      }
    }
  }

  public final boolean Sx(String paramString)
  {
    AppMethodBeat.i(137304);
    h localh = SB(paramString);
    boolean bool;
    if (localh == null)
      if (this.oJP.dR(paramString))
      {
        bool = this.oJP.dW(paramString);
        AppMethodBeat.o(137304);
      }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "isStartPlayAudio, player is null");
      bool = false;
      AppMethodBeat.o(137304);
      continue;
      bool = localh.aig();
      AppMethodBeat.o(137304);
    }
  }

  public final boolean Sy(String paramString)
  {
    AppMethodBeat.i(137307);
    h localh = SB(paramString);
    boolean bool;
    if (localh == null)
      if (this.oJP.dR(paramString))
      {
        bool = this.oJP.Ei();
        AppMethodBeat.o(137307);
      }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "isPauseOnBackground, player is null");
      paramString = Sz(paramString);
      if (paramString != null)
      {
        bool = paramString.fqY;
        AppMethodBeat.o(137307);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(137307);
        continue;
        bool = localh.fqY;
        AppMethodBeat.o(137307);
      }
    }
  }

  public final com.tencent.mm.ag.d Sz(String paramString)
  {
    AppMethodBeat.i(137308);
    Object localObject = SB(paramString);
    if (localObject != null)
    {
      paramString = ((h)localObject).bTj();
      AppMethodBeat.o(137308);
    }
    while (true)
    {
      return paramString;
      if (this.oJP.dR(paramString))
      {
        localObject = this.oJP.eb(paramString);
        if (localObject != null)
        {
          AppMethodBeat.o(137308);
          paramString = (String)localObject;
        }
      }
      else
      {
        paramString = (com.tencent.mm.ag.d)this.oJD.get(paramString);
        AppMethodBeat.o(137308);
      }
    }
  }

  final void b(String paramString, h paramh)
  {
    AppMethodBeat.i(137319);
    this.oJD.put(paramString, paramh.bTj());
    AppMethodBeat.o(137319);
  }

  public final boolean b(String paramString, com.tencent.mm.ag.b paramb)
  {
    boolean bool1 = false;
    AppMethodBeat.i(137297);
    com.tencent.mm.ag.b localb1 = (com.tencent.mm.ag.b)this.oJC.get(paramString);
    com.tencent.mm.ag.b localb2;
    boolean bool3;
    if (((!this.oJu.contains(paramString)) || (localb1 == null)) && (paramb != null))
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "resumeAudio, the audioId %s is not found or param is null, backupParam is exit", new Object[] { paramString });
      a(paramString, paramb);
      localb2 = localb1;
      if (localb1 == null)
        localb2 = paramb;
      j(localb2);
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "resumeAudio, audioId:%s", new Object[] { paramString });
      int i = SA(SF(paramString));
      if (i >= 10)
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "now created QQAudioPlayer count %d arrive MAX_PLAY_AUDIO_PLAYER_COUNT", new Object[] { Integer.valueOf(i) });
        if (!SJ(paramString))
          break label385;
        bSH();
      }
      bSI();
      this.oJC.put(paramString, localb2);
      paramb = SB(paramString);
      if (!b.bSx())
        break label472;
      boolean bool2 = a(paramb);
      if ((!this.oJP.dR(paramString)) || (!this.oJP.ed(paramString)))
        break label409;
      bool3 = true;
      label205: ab.i("MicroMsg.Audio.AudioPlayerMgr", "resume canUseMixPlayer:%b, localCacheExit:%b, audioId:%s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), localb2.ckD });
      if ((!bool2) || (!bool3))
        break label480;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "use AudioMixPlayer");
      SG(localb2.ckD);
      k(localb2);
      if (!this.oJP.dF(localb2.ckD))
        break label415;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "mix player is playing, do nothing");
      label297: AppMethodBeat.o(137297);
      bool3 = true;
    }
    while (true)
    {
      return bool3;
      label385: label781: if (!this.oJu.contains(paramString))
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "resumeAudio fail, the audioId is not found!");
        aS(601, paramString);
        AppMethodBeat.o(137297);
        bool3 = bool1;
      }
      else
      {
        localb2 = localb1;
        if (localb1 != null)
          break;
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "resumeAudio fail, the param is not found!");
        aS(602, paramString);
        AppMethodBeat.o(137297);
        bool3 = bool1;
        continue;
        bSL();
        aS(600, paramString);
        AppMethodBeat.o(137297);
        bool3 = bool1;
        continue;
        label409: bool3 = false;
        break label205;
        label415: if (this.oJP.dX(localb2.ckD))
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "mix player is preparing, do nothing");
          localb2.fqK = true;
          paramb.b(localb2);
          break label297;
        }
        a(localb2, false, false);
        this.oJP.dS(paramString);
        break label297;
        label472: ab.i("MicroMsg.Audio.AudioPlayerMgr", "Not support mix audio");
        label480: if (paramb == null)
        {
          ab.e("MicroMsg.Audio.AudioPlayerMgr", "resumeAudio, player is null");
          SH(paramString);
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "create new QQAudioPlayer with audioId %s to play", new Object[] { paramString });
          paramb = bSC();
          paramb.a(this.oJR);
          paramb.SN(paramString);
          e(paramString, paramb);
          localb2.fqK = true;
          localb2.startTime = 0;
          localb2.fqM = System.currentTimeMillis();
          a(localb2, false, true);
          paramb.l(localb2);
          AppMethodBeat.o(137297);
          bool3 = true;
        }
        else
        {
          e(paramString, paramb);
          if ((paramb.aig()) && (!paramb.aie()))
          {
            a(localb2, false, true);
            ab.i("MicroMsg.Audio.AudioPlayerMgr", "is pause, do resume");
            paramb.resume();
          }
          while (true)
          {
            AppMethodBeat.o(137297);
            bool3 = true;
            break;
            if (paramb.bTd())
            {
              a(localb2, false, true);
              localb2.fqK = true;
              localb2.fqM = System.currentTimeMillis();
              ab.i("MicroMsg.Audio.AudioPlayerMgr", "is prepared, do resume");
              paramb.resume();
              localb2.startTime = 0;
              paramb.b(localb2);
            }
            else if (paramb.bTc())
            {
              ab.i("MicroMsg.Audio.AudioPlayerMgr", "is preparing, do update param");
              localb2.fqK = true;
              localb2.fqM = System.currentTimeMillis();
              paramb.b(localb2);
            }
            else
            {
              if (paramb.aig())
                break label781;
              a(localb2, false, true);
              localb2.fqK = true;
              localb2.fqM = System.currentTimeMillis();
              ab.i("MicroMsg.Audio.AudioPlayerMgr", "is stop, do startPlay");
              paramb.l(localb2);
              localb2.startTime = 0;
            }
          }
          ab.e("MicroMsg.Audio.AudioPlayerMgr", "do nothing");
          AppMethodBeat.o(137297);
          bool3 = bool1;
        }
      }
    }
  }

  public final void bSB()
  {
    AppMethodBeat.i(137288);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "_release");
    this.oJu.clear();
    synchronized (this.lrj)
    {
      Iterator localIterator = this.oJw.iterator();
      if (localIterator.hasNext())
      {
        localObject4 = (String)localIterator.next();
        c((String)localObject4, (h)this.oJv.remove(localObject4));
      }
    }
    this.oJw.clear();
    this.oJv.clear();
    Object localObject4 = this.oJy.iterator();
    Object localObject3;
    while (((Iterator)localObject4).hasNext())
    {
      localObject3 = (String)((Iterator)localObject4).next();
      c((String)localObject3, (h)this.oJx.remove(localObject3));
    }
    this.oJy.clear();
    this.oJx.clear();
    ??? = this.oJz.iterator();
    while (((Iterator)???).hasNext())
    {
      localObject3 = (String)((Iterator)???).next();
      localObject3 = (LinkedList)this.oJB.remove(localObject3);
      if (localObject3 != null)
        ((LinkedList)localObject3).clear();
    }
    this.oJz.clear();
    this.oJA.clear();
    this.oJB.clear();
    this.oJC.clear();
    this.oJD.clear();
    this.oJF.clear();
    this.oJG.clear();
    al.af(this.oJS);
    al.af(this.oJT);
    this.oJH = false;
    this.oJI = false;
    AppMethodBeat.o(137288);
  }

  public final void bSD()
  {
    AppMethodBeat.i(137326);
    long l = System.currentTimeMillis();
    if ((this.oJH) && (l - this.oJJ < 10000L))
      AppMethodBeat.o(137326);
    while (true)
    {
      return;
      this.oJJ = l;
      synchronized (this.lrj)
      {
        this.oJH = true;
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "releaseAudioDelayIfPaused, delay_ms:%d", new Object[] { Integer.valueOf(1800000) });
        al.af(this.oJT);
        al.n(this.oJT, 1800000L);
        AppMethodBeat.o(137326);
      }
    }
  }

  final void bSH()
  {
    AppMethodBeat.i(137333);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "removeAndStopPlayingAudioPlayer");
    Object localObject1 = this.oJE.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player audioId : %s", new Object[] { localObject2 });
      Su((String)localObject2);
      bSL();
    }
    Object localObject2 = this.oJG.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (String)((Iterator)localObject2).next();
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "need remove and stop player for try audioId : %s", new Object[] { localObject1 });
      Su((String)localObject1);
      bSL();
    }
    this.oJE.clear();
    this.oJG.clear();
    AppMethodBeat.o(137333);
  }

  final void bSK()
  {
    AppMethodBeat.i(137338);
    if (this.oJM.oKT)
      this.oJM.bSK();
    AppMethodBeat.o(137338);
  }

  public final boolean cF(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(137302);
    h localh = SB(paramString);
    if (localh == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "seekToAudio, player is null");
      if (this.oJP.dR(paramString))
        this.oJP.w(paramString, paramInt);
      bool = cG(paramString, paramInt);
      AppMethodBeat.o(137302);
    }
    while (true)
    {
      return bool;
      if (paramInt < 0)
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "seekToAudio, time pos is invalid time:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localh.getDuration()) });
        AppMethodBeat.o(137302);
      }
      else if (localh.getDuration() <= 0)
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "seekToAudio, duration is invalid, time:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localh.getDuration()) });
        localh.bSW();
        bool = cG(paramString, paramInt);
        AppMethodBeat.o(137302);
      }
      else if ((paramInt > 0) && (paramInt > localh.getDuration()))
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "seekToAudio, time pos is invalid, exceed duration time:%d, duration:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localh.getDuration()) });
        AppMethodBeat.o(137302);
      }
      else
      {
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "seekToAudio, audioId:%s, time:%s", new Object[] { paramString, Integer.valueOf(paramInt) });
        if ((localh.aie()) || (localh.aig()) || (localh.isPaused()))
        {
          bool = localh.lP(paramInt);
          AppMethodBeat.o(137302);
        }
        else
        {
          localh.bSW();
          bool = cG(paramString, paramInt);
          AppMethodBeat.o(137302);
        }
      }
    }
  }

  public final boolean dZ(String paramString)
  {
    AppMethodBeat.i(137306);
    h localh = SB(paramString);
    boolean bool;
    if (localh == null)
      if (this.oJP.dR(paramString))
      {
        bool = this.oJP.dZ(paramString);
        AppMethodBeat.o(137306);
      }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "isStoppedAudio, player is null");
      bool = true;
      AppMethodBeat.o(137306);
      continue;
      bool = localh.isStopped();
      AppMethodBeat.o(137306);
    }
  }

  final void e(String paramString, h paramh)
  {
    AppMethodBeat.i(137322);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "markPlayer, mark player by audioId:%s", new Object[] { paramString });
    synchronized (this.lrj)
    {
      if (this.oJy.contains(paramString))
      {
        this.oJx.remove(paramString);
        this.oJy.remove(paramString);
      }
      if (!this.oJw.contains(paramString))
      {
        this.oJw.add(paramString);
        this.oJv.put(paramString, paramh);
      }
      AppMethodBeat.o(137322);
      return;
    }
  }

  final void f(String paramString, h paramh)
  {
    AppMethodBeat.i(137323);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "markPlayerRecycled, mark player recycled by audioId:%s", new Object[] { paramString });
    synchronized (this.lrj)
    {
      if (this.oJw.contains(paramString))
      {
        this.oJv.remove(paramString);
        this.oJw.remove(paramString);
      }
      if (!this.oJy.contains(paramString))
      {
        this.oJy.add(paramString);
        this.oJx.put(paramString, paramh);
      }
      AppMethodBeat.o(137323);
      return;
    }
  }

  public final String fk(String paramString1, String paramString2)
  {
    AppMethodBeat.i(137291);
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "createAudioPlayer");
    LinkedList localLinkedList = (LinkedList)this.oJB.get(paramString1);
    Object localObject = this.lrj;
    if (localLinkedList != null);
    while (true)
    {
      int i;
      int j;
      try
      {
        if ((localLinkedList.contains(paramString2)) && ((this.oJw.contains(paramString2)) || (this.oJy.contains(paramString2))))
        {
          i = 1;
          j = SA(paramString1);
          if (TextUtils.isEmpty(paramString2))
          {
            ab.e("MicroMsg.Audio.AudioPlayerMgr", "createAudioPlayer fail, the audioId is empty!");
            aS(604, paramString2);
            AppMethodBeat.o(137291);
            paramString2 = null;
            return paramString2;
          }
        }
        else
        {
          i = 0;
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(137291);
      }
      if (j >= 10)
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "now created QQAudioPlayer count %d arrive MAX_AUDIO_PLAYER_COUNT, save id and not send error event, not create player!", new Object[] { Integer.valueOf(j) });
        fj(paramString1, paramString2);
        AppMethodBeat.o(137291);
        paramString2 = null;
      }
      else if (i != 0)
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "now created QQAudioPlayer fail, the audioId exist in mAudioIds");
        aS(603, paramString2);
        AppMethodBeat.o(137291);
        paramString2 = null;
      }
      else
      {
        fj(paramString1, paramString2);
        SH(paramString2);
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "create player success, appId:%s, audioId:%s", new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(137291);
      }
    }
  }

  public final boolean g(com.tencent.mm.ag.b paramb)
  {
    AppMethodBeat.i(137292);
    boolean bool;
    if (paramb == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "setAudioParam param == null");
      bool = false;
      AppMethodBeat.o(137292);
      return bool;
    }
    com.tencent.mm.ag.b localb = (com.tencent.mm.ag.b)this.oJC.get(paramb.ckD);
    if (localb != null)
    {
      localb.f(paramb);
      label52: h localh = SB(paramb.ckD);
      if (localh == null)
        break label138;
      ab.i("MicroMsg.Audio.AudioPlayerMgr", "setAudioParam player ok");
      localh.b(localb);
      label81: if (b.bSx())
      {
        if (!this.oJP.dR(paramb.ckD))
          break label149;
        this.oJP.c(paramb);
      }
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(137292);
      break;
      this.oJC.put(paramb.ckD, paramb);
      localb = paramb;
      break label52;
      label138: ab.e("MicroMsg.Audio.AudioPlayerMgr", "setAudioParam player is null");
      break label81;
      label149: this.oJP.b(paramb);
    }
  }

  public final boolean h(com.tencent.mm.ag.b paramb)
  {
    boolean bool1 = false;
    AppMethodBeat.i(137293);
    if (paramb == null)
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "startAudio, play param is null");
      aS(605, "");
      AppMethodBeat.o(137293);
    }
    while (true)
    {
      return bool1;
      if (TextUtils.isEmpty(paramb.ckD))
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "startAudio fail, the audioId is empty!");
        aS(604, paramb.ckD);
        AppMethodBeat.o(137293);
      }
      else if (!this.oJu.contains(paramb.ckD))
      {
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "startAudio fail, the audioId is not found!");
        aS(601, paramb.ckD);
        AppMethodBeat.o(137293);
      }
      else
      {
        if (paramb.fqK)
          j(paramb);
        ab.i("MicroMsg.Audio.AudioPlayerMgr", "startAudio");
        Object localObject1 = SF(paramb.ckD);
        Object localObject2 = pO(paramb.ckD);
        int i = SA((String)localObject1);
        boolean bool2;
        boolean bool3;
        if (i >= 10)
        {
          ab.e("MicroMsg.Audio.AudioPlayerMgr", "startAudio now created QQAudioPlayer count %d arrive MAX_PLAY_AUDIO_PLAYER_COUNT, but save param!", new Object[] { Integer.valueOf(i) });
          this.oJC.put(paramb.ckD, paramb);
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "autoPlay:%b", new Object[] { Boolean.valueOf(paramb.fqK) });
          if ((paramb.fqK) && (SJ(paramb.ckD)))
            bSH();
        }
        else
        {
          SH(paramb.ckD);
          bSI();
          this.oJA.put(localObject1, paramb.processName);
          this.oJC.put(paramb.ckD, paramb);
          if ((TextUtils.isEmpty(paramb.filePath)) && (this.oJN.containsKey(paramb.clP)))
            paramb.filePath = ((String)this.oJN.get(paramb.clP));
          localObject1 = SB(paramb.ckD);
          bool2 = b.bSx();
          if (!bool2)
            break label560;
          bool3 = a((h)localObject1);
          if (((TextUtils.isEmpty(paramb.filePath)) || (!this.oJP.ee(paramb.filePath))) && ((localObject2 == null) || (!paramb.e((com.tencent.mm.ag.b)localObject2)) || (TextUtils.isEmpty(((com.tencent.mm.ag.b)localObject2).filePath)) || (!this.oJP.ee(((com.tencent.mm.ag.b)localObject2).filePath))))
            break label555;
        }
        label555: for (bool1 = true; ; bool1 = false)
        {
          ab.i("MicroMsg.Audio.AudioPlayerMgr", "canUseMixPlayer:%b, localCacheExit:%b, audioId:%s", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool1), paramb.ckD });
          if ((!bool3) || (!bool1))
            break label568;
          a(paramb, (com.tencent.mm.ag.b)localObject2);
          AppMethodBeat.o(137293);
          bool1 = true;
          break;
          if (paramb.fqK)
          {
            aS(600, paramb.ckD);
            bSL();
            AppMethodBeat.o(137293);
            break;
          }
          ab.e("MicroMsg.Audio.AudioPlayerMgr", "save param, do nothing ");
          localObject2 = SB(paramb.ckD);
          if (localObject2 != null)
          {
            ((h)localObject2).b(paramb);
            ((h)localObject2).bSR();
          }
          AppMethodBeat.o(137293);
          bool1 = true;
          break;
        }
        label560: ab.i("MicroMsg.Audio.AudioPlayerMgr", "not support mix audio");
        label568: b(paramb, (com.tencent.mm.ag.b)localObject2);
        if (bool2)
          i(paramb);
        AppMethodBeat.o(137293);
        bool1 = true;
      }
    }
  }

  public final boolean pN(String paramString)
  {
    AppMethodBeat.i(137305);
    h localh = SB(paramString);
    boolean bool;
    if (localh == null)
      if (this.oJP.dR(paramString))
      {
        bool = this.oJP.dF(paramString);
        AppMethodBeat.o(137305);
      }
    while (true)
    {
      return bool;
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "isPlayingAudio, player is null");
      bool = false;
      AppMethodBeat.o(137305);
      continue;
      bool = localh.aie();
      AppMethodBeat.o(137305);
    }
  }

  public final com.tencent.mm.ag.b pO(String paramString)
  {
    AppMethodBeat.i(137310);
    if (this.oJC.containsKey(paramString))
    {
      paramString = (com.tencent.mm.ag.b)this.oJC.get(paramString);
      AppMethodBeat.o(137310);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(137310);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.f
 * JD-Core Version:    0.6.2
 */