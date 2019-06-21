package com.tencent.mm.plugin.talkroom.model;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.at;
import com.tencent.mm.model.ae;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.talkroom.component.TalkRoomService;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cgl;
import com.tencent.mm.protocal.protobuf.cgm;
import com.tencent.mm.protocal.protobuf.cgn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  implements com.tencent.mm.ai.f, com.tencent.mm.bg.a, com.tencent.mm.bg.c, com.tencent.mm.model.af
{
  public static final int[] syP = { 80, 8080, 16285 };
  public static final byte[][] syQ = { { 101, -30, 76, 27 }, arrayOfByte, { 120, -52, -55, -58 } };
  private final ServiceConnection ktl;
  private int nwu;
  private long nwv;
  private int state;
  private int syA;
  private int syB;
  private boolean syC;
  public String syD;
  private int syE;
  private int syF;
  private int syG;
  private LinkedList<cgl> syH;
  private com.tencent.mm.plugin.talkroom.component.a syI;
  private com.tencent.mm.plugin.talkroom.component.b syJ;
  private com.tencent.mm.plugin.talkroom.component.e syK;
  private com.tencent.mm.plugin.talkroom.component.d syL;
  private com.tencent.mm.sdk.platformtools.af syM;
  private ap syN;
  private i syO;
  public boolean syR;

  static
  {
    byte[] arrayOfByte = { 112, 64, -19, -29 };
  }

  public g()
  {
    AppMethodBeat.i(25811);
    this.syA = 0;
    this.syB = 0;
    this.state = 0;
    this.syC = false;
    this.syH = new LinkedList();
    this.syO = new i();
    this.ktl = new g.1(this);
    this.syR = false;
    TalkRoomReceiver.init();
    AppMethodBeat.o(25811);
  }

  private void Ft(int paramInt)
  {
    AppMethodBeat.i(25828);
    if (this.syI != null);
    while (true)
    {
      try
      {
        cEz();
        AppMethodBeat.o(25828);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        AppMethodBeat.o(25828);
        continue;
      }
      if (paramInt == 0)
      {
        this.syO.l("bind talkroomService timeout", 3, -1);
        AppMethodBeat.o(25828);
      }
      else
      {
        new com.tencent.mm.sdk.platformtools.ak().postDelayed(new g.4(this, paramInt), 50L);
        AppMethodBeat.o(25828);
      }
    }
  }

  private void Fu(int paramInt)
  {
    AppMethodBeat.i(25831);
    if (paramInt > this.syE)
    {
      this.syE = paramInt;
      if (this.state >= 3)
        this.syO.mk(311);
      cEy();
    }
    AppMethodBeat.o(25831);
  }

  private static String Fv(int paramInt)
  {
    AppMethodBeat.i(25834);
    try
    {
      String str = InetAddress.getByAddress(new byte[] { (byte)(paramInt >>> 24 & 0xFF), (byte)(paramInt >>> 16 & 0xFF), (byte)(paramInt >>> 8 & 0xFF), (byte)(paramInt & 0xFF) }).getHostAddress();
      AppMethodBeat.o(25834);
      return str;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TalkRoomServer", localException, "", new Object[0]);
        Object localObject = null;
        AppMethodBeat.o(25834);
      }
    }
  }

  private int a(PByteArray paramPByteArray, String paramString)
  {
    AppMethodBeat.i(25838);
    int[] arrayOfInt;
    if (this.syI != null)
      arrayOfInt = new int[1];
    while (true)
    {
      try
      {
        paramPByteArray.value = this.syI.e(arrayOfInt, paramString);
        i = arrayOfInt[0];
        AppMethodBeat.o(25838);
        return i;
      }
      catch (RemoteException paramPByteArray)
      {
        arrayOfInt[0] = -99999;
        ab.printErrStackTrace("MicroMsg.TalkRoomServer", paramPByteArray, "", new Object[0]);
        continue;
      }
      int i = -99;
      AppMethodBeat.o(25838);
    }
  }

  private boolean cEA()
  {
    AppMethodBeat.i(25830);
    int i = -99999;
    try
    {
      int j = this.syI.cEb();
      i = j;
      ab.i("MicroMsg.TalkRoomServer", "engine.protocalInit");
      if ((i < 0) && (i != -3))
      {
        this.syI = null;
        ab.f("MicroMsg.TalkRoomServer", "engine.protocalInit error %d", new Object[] { Integer.valueOf(i) });
        this.syO.l("enterTalkRoom protocalInit failed", 3, -1);
        AppMethodBeat.o(25830);
        bool = false;
        return bool;
      }
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        continue;
        AppMethodBeat.o(25830);
        boolean bool = true;
      }
    }
  }

  private void cEB()
  {
    AppMethodBeat.i(25833);
    if (this.syI == null)
    {
      ab.e("MicroMsg.TalkRoomServer", "the engine should not be null.");
      AppMethodBeat.o(25833);
    }
    while (true)
    {
      return;
      this.syK = this.syI.a(new g.6(this));
      this.syK.start();
      this.syL = this.syI.cEc();
      this.syL.start();
      AppMethodBeat.o(25833);
    }
  }

  private void cEC()
  {
    AppMethodBeat.i(25835);
    if (this.syH.size() == 0)
    {
      ab.e("MicroMsg.TalkRoomServer", "engine. talk relay addr list is empty");
      this.syO.g(3, -1, "engine.talk relay addr list empty");
      AppMethodBeat.o(25835);
    }
    while (true)
    {
      return;
      int[] arrayOfInt1 = new int[this.syH.size()];
      int[] arrayOfInt2 = new int[this.syH.size()];
      ab.i("MicroMsg.TalkRoomServer", "talk relay addr cnt %d", new Object[] { Integer.valueOf(this.syH.size()) });
      for (int i = 0; i < this.syH.size(); i++)
      {
        arrayOfInt1[i] = ((cgl)this.syH.get(i)).xfs;
        arrayOfInt2[i] = ((cgl)this.syH.get(i)).wOO;
        ab.i("MicroMsg.TalkRoomServer", "add talk relay addr %s %d", new Object[] { Fv(((cgl)this.syH.get(i)).xfs), Integer.valueOf(((cgl)this.syH.get(i)).wOO) });
      }
      ab.i("MicroMsg.TalkRoomServer", "engine.Open myRoomMemId %d, roomId %d, roomKey %d", new Object[] { Integer.valueOf(this.syF), Integer.valueOf(this.nwu), Long.valueOf(this.nwv) });
      try
      {
        com.tencent.mm.plugin.talkroom.component.a locala = this.syI;
        com.tencent.mm.plugin.talkroom.component.b localb = this.syJ;
        aw.ZK();
        i = locala.a(localb, com.tencent.mm.model.c.QF(), this.syF, this.nwu, this.nwv, arrayOfInt1, arrayOfInt2, 0);
        if ((i < 0) && (i != -3))
        {
          ab.e("MicroMsg.TalkRoomServer", "engine.Open error %d", new Object[] { Integer.valueOf(i) });
          this.syO.g(3, i, "engine.Open error");
        }
        AppMethodBeat.o(25835);
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
          i = -99999;
        }
      }
    }
  }

  private boolean cEv()
  {
    AppMethodBeat.i(25817);
    if (cEt() == 1)
    {
      b(b.cEg().sxK);
      if (this.syB <= 0)
        break label60;
      ab.i("MicroMsg.TalkRoomServer", "addListener has init before");
      AppMethodBeat.o(25817);
    }
    while (true)
    {
      return true;
      a(b.cEg().sxK);
      break;
      label60: aw.Rg().a(332, this);
      aw.Rg().a(334, this);
      aw.Rg().a(336, this);
      aw.Rg().a(335, this);
      b.cEi().a(this);
      aw.Cc().a(this);
      this.syB = 1;
      if (this.syI != null);
      try
      {
        this.syI.Close();
        this.syI.uninitLive();
        Intent localIntent = new Intent(ah.getContext(), TalkRoomService.class);
        ah.getContext().bindService(localIntent, this.ktl, 1);
        this.syJ = new g.2(this);
        AppMethodBeat.o(25817);
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      }
    }
  }

  private void cEx()
  {
    AppMethodBeat.i(25821);
    if (this.syK != null);
    try
    {
      this.syK.release();
      this.syK = null;
      if (this.syL == null);
    }
    catch (RemoteException localRemoteException1)
    {
      try
      {
        this.syL.release();
        this.syL = null;
        if (this.syM != null)
        {
          this.syM.stopTimer();
          this.syM = null;
        }
        if (this.syN != null)
        {
          this.syN.stopTimer();
          this.syN = null;
        }
        AppMethodBeat.o(25821);
        return;
        localRemoteException1 = localRemoteException1;
        ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException1, "", new Object[0]);
      }
      catch (RemoteException localRemoteException2)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException2, "", new Object[0]);
      }
    }
  }

  private void cEy()
  {
    AppMethodBeat.i(25826);
    try
    {
      b.cEk().cEs();
      if (this.syL != null)
        this.syL.cEd();
      if (this.syK != null)
        this.syK.cEf();
      this.state = 2;
      AppMethodBeat.o(25826);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        AppMethodBeat.o(25826);
      }
    }
  }

  private void cEz()
  {
    AppMethodBeat.i(25829);
    this.state = 1;
    this.syC = false;
    if (!cEA())
      AppMethodBeat.o(25829);
    while (true)
    {
      return;
      cEx();
      cEC();
      cEB();
      if (this.syM != null)
      {
        ab.w("MicroMsg.TalkRoomServer", "enter talkroom not first time");
        AppMethodBeat.o(25829);
      }
      else
      {
        this.syM = new com.tencent.mm.sdk.platformtools.af(new g.5(this));
        this.syM.dow();
        AppMethodBeat.o(25829);
      }
    }
  }

  private void ma(boolean paramBoolean)
  {
    AppMethodBeat.i(25822);
    if (bo.isNullOrNil(this.syD))
      AppMethodBeat.o(25822);
    com.tencent.mm.storage.ak localak;
    while (true)
    {
      return;
      aw.ZK();
      localak = com.tencent.mm.model.c.XR().aoZ(this.syD);
      if (localak != null)
        break;
      AppMethodBeat.o(25822);
    }
    if (paramBoolean);
    for (int i = 5; ; i = 6)
    {
      localak.eE(com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localak, i, localak.field_conversationTime));
      aw.ZK();
      com.tencent.mm.model.c.XR().a(localak, this.syD);
      AppMethodBeat.o(25822);
      break;
    }
  }

  private void removeListener()
  {
    AppMethodBeat.i(25818);
    this.syB = 0;
    aw.Rg().b(332, this);
    aw.Rg().b(334, this);
    aw.Rg().b(336, this);
    aw.Rg().b(335, this);
    b.cEi().b(this);
    aw.Cc().b(this);
    b(b.cEg().sxK);
    int i = -99999;
    int j = i;
    if (this.syI != null);
    try
    {
      j = this.syI.uninitLive();
      ah.getContext().unbindService(this.ktl);
      Intent localIntent = new Intent(ah.getContext(), TalkRoomService.class);
      ah.getContext().stopService(localIntent);
      this.syI = null;
      if (j < 0)
        ab.e("MicroMsg.TalkRoomServer", "engine.uninitLive error %d", new Object[] { Integer.valueOf(j) });
      AppMethodBeat.o(25818);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        j = i;
      }
    }
  }

  public final void Zs()
  {
    AppMethodBeat.i(25840);
    ab.v("MicroMsg.TalkRoomServer", "yy talkroom onResume");
    i locali;
    i.3 local3;
    if (bo.isNullOrNil(this.syD))
    {
      ab.d("MicroMsg.TalkRoomServer", "pause");
      this.syR = false;
      locali = this.syO;
      local3 = new i.3(locali);
      if (Looper.myLooper() != Looper.getMainLooper())
        break label80;
      local3.run();
      AppMethodBeat.o(25840);
    }
    while (true)
    {
      return;
      cEy();
      break;
      label80: locali.handler.post(local3);
      AppMethodBeat.o(25840);
    }
  }

  public final void Zt()
  {
    AppMethodBeat.i(25841);
    ab.v("MicroMsg.TalkRoomServer", "yy talkroom onPause");
    try
    {
      if (bo.isNullOrNil(this.syD))
        ab.d("MicroMsg.TalkRoomServer", "pause");
      while (true)
      {
        this.syR = true;
        locali = this.syO;
        i.2 local2 = new i.2(locali);
        if (Looper.myLooper() != Looper.getMainLooper())
          break;
        local2.run();
        AppMethodBeat.o(25841);
        return;
        if (this.syL != null)
          this.syL.cEd();
        if (this.syK != null)
          this.syK.cpN();
        this.state = 2;
      }
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        i locali;
        ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        continue;
        locali.handler.post(localRemoteException);
        AppMethodBeat.o(25841);
      }
    }
  }

  public final void a(com.tencent.mm.bg.d paramd)
  {
    AppMethodBeat.i(25815);
    i locali = this.syO;
    try
    {
      if (locali.callbacks.contains(paramd));
      while (true)
      {
        this.syO.tO(cEu());
        AppMethodBeat.o(25815);
        return;
        locali.callbacks.add(paramd);
      }
    }
    finally
    {
      AppMethodBeat.o(25815);
    }
  }

  public final void ac(String paramString, int paramInt)
  {
    AppMethodBeat.i(25819);
    ab.i("MicroMsg.TalkRoomServer", "enterTalkRoom %s scene %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    this.syA = paramInt;
    cEv();
    if (paramString.equals(this.syD))
    {
      ab.d("MicroMsg.TalkRoomServer", "enterTalkRoom %s has enter the talkroom", new Object[] { paramString });
      if (this.state == 2)
        this.syO.akC();
      AppMethodBeat.o(25819);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.TalkRoomServer", "%s enter the talkroom", new Object[] { paramString });
      this.syD = paramString;
      Object localObject = new com.tencent.mm.plugin.talkroom.b.a(this.syD, cEt());
      aw.Rg().a((m)localObject, 0);
      b.cEg().sxM = new f();
      b.cEk().syu = bo.yz();
      b.cEk().syr = paramString;
      if (cEt() == 0)
        b.cEg().sxK.nNp = true;
      localObject = this.syO;
      paramString = new i.11((i)localObject, paramString);
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        paramString.run();
        AppMethodBeat.o(25819);
      }
      else
      {
        ((i)localObject).handler.post(paramString);
        AppMethodBeat.o(25819);
      }
    }
  }

  public final void akA()
  {
    AppMethodBeat.i(25824);
    ab.i("MicroMsg.TalkRoomServer", "putAwayMic");
    Object localObject = b.cEk();
    if ((((f)localObject).syz) && (!((f)localObject).syy))
      ((f)localObject).syt += 1;
    ((f)localObject).syy = false;
    ((f)localObject).syz = false;
    if (this.state < 3)
    {
      ab.w("MicroMsg.TalkRoomServer", "putAwayMic  err, isnot getting or has not got mic");
      AppMethodBeat.o(25824);
    }
    while (true)
    {
      return;
      if (this.syN != null)
      {
        this.syN.stopTimer();
        this.syN = null;
      }
      cEy();
      localObject = new com.tencent.mm.plugin.talkroom.b.d(this.nwu, this.nwv, 2, this.syD, cEt());
      aw.Rg().a((m)localObject, 0);
      AppMethodBeat.o(25824);
    }
  }

  public final boolean akB()
  {
    return this.syR;
  }

  public final void akw()
  {
    AppMethodBeat.i(25827);
    ab.i("MicroMsg.TalkRoomServer", "resumeRecord in state %d", new Object[] { Integer.valueOf(this.state) });
    if (this.state != 4)
      AppMethodBeat.o(25827);
    while (true)
    {
      return;
      f localf = b.cEk();
      localf.syy = true;
      localf.syx = bo.yz();
      try
      {
        this.syL.akw();
        AppMethodBeat.o(25827);
      }
      catch (RemoteException localRemoteException)
      {
        ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        AppMethodBeat.o(25827);
      }
    }
  }

  public final short akx()
  {
    short s1 = 0;
    AppMethodBeat.i(25836);
    short s2;
    if (this.syL == null)
    {
      AppMethodBeat.o(25836);
      s2 = s1;
    }
    while (true)
    {
      return s2;
      try
      {
        int i = this.syL.cEe();
        s1 = (short)i;
        AppMethodBeat.o(25836);
        s2 = s1;
      }
      catch (RemoteException localRemoteException)
      {
        ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        AppMethodBeat.o(25836);
        s2 = s1;
      }
    }
  }

  public final short aky()
  {
    short s1 = 0;
    AppMethodBeat.i(25837);
    short s2;
    if (this.syK == null)
    {
      AppMethodBeat.o(25837);
      s2 = s1;
    }
    while (true)
    {
      return s2;
      try
      {
        int i = this.syK.cEe();
        s1 = (short)i;
        AppMethodBeat.o(25837);
        s2 = s1;
      }
      catch (RemoteException localRemoteException)
      {
        ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        AppMethodBeat.o(25837);
        s2 = s1;
      }
    }
  }

  public final boolean akz()
  {
    boolean bool = true;
    AppMethodBeat.i(25823);
    ab.i("MicroMsg.TalkRoomServer", "seizeMic");
    if (this.state != 2)
    {
      ab.i("MicroMsg.TalkRoomServer", "seizeMic  not int the appropriate state");
      if (this.state == 0)
        this.syO.g(3, -1, "seizeMic in outside room state");
      AppMethodBeat.o(25823);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (this.syK != null);
      try
      {
        this.syK.cpN();
        this.state = 3;
        com.tencent.mm.plugin.talkroom.b.d locald = new com.tencent.mm.plugin.talkroom.b.d(this.nwu, this.nwv, 1, this.syD, cEt());
        aw.Rg().a(locald, 0);
        b.cEk().syw = bo.yz();
        b.cEk().syz = true;
        AppMethodBeat.o(25823);
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      }
    }
  }

  public final void b(com.tencent.mm.bg.d paramd)
  {
    AppMethodBeat.i(25816);
    i locali = this.syO;
    try
    {
      locali.callbacks.remove(paramd);
      return;
    }
    finally
    {
      AppMethodBeat.o(25816);
    }
  }

  public final List bJF()
  {
    AppMethodBeat.i(25813);
    LinkedList localLinkedList = b.cEi().tM(this.syD);
    AppMethodBeat.o(25813);
    return localLinkedList;
  }

  public final int cEt()
  {
    int i = 1;
    AppMethodBeat.i(25812);
    if ((this.syA == 1) || ((com.tencent.mm.bh.d.fUu != null) && (com.tencent.mm.bh.d.fUu.tQ(this.syD))))
      AppMethodBeat.o(25812);
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(25812);
    }
  }

  public final String cEu()
  {
    AppMethodBeat.i(25814);
    Object localObject = b.cEi().tM(this.syD).iterator();
    while (((Iterator)localObject).hasNext())
    {
      cgm localcgm = (cgm)((Iterator)localObject).next();
      if (localcgm.xft == this.syG)
      {
        localObject = localcgm.jBB;
        AppMethodBeat.o(25814);
      }
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(25814);
    }
  }

  public final void cEw()
  {
    AppMethodBeat.i(25820);
    ab.i("MicroMsg.TalkRoomServer", "exitTalkRoom");
    ma(false);
    if (bo.isNullOrNil(this.syD))
    {
      ab.i("MicroMsg.TalkRoomServer", "exitTalkRoom: has exited");
      AppMethodBeat.o(25820);
    }
    while (true)
    {
      return;
      b.cEk().cEq();
      this.state = 0;
      this.syC = false;
      int i = this.nwu;
      long l = this.nwv;
      Object localObject1;
      if (this.nwu != 0)
      {
        localObject1 = this.syD;
        localObject1 = new com.tencent.mm.plugin.talkroom.b.b(i, l, (String)localObject1, cEt());
        aw.Rg().a((m)localObject1, 0);
        if (this.syI == null);
      }
      try
      {
        i = this.syI.Close();
        if (i < 0)
          ab.e("MicroMsg.TalkRoomServer", "engine.Close error %d", new Object[] { Integer.valueOf(i) });
        localObject1 = new PByteArray();
        if (a((PByteArray)localObject1, s.mJ(this.syD)) == 0)
        {
          Object localObject2 = new String(((PByteArray)localObject1).value);
          ab.i("MicroMsg.TalkRoomServer", "getStatis==> pba.len %d, info: %s", new Object[] { Integer.valueOf(((PByteArray)localObject1).value.length), localObject2 });
          localObject1 = new LinkedList();
          cgn localcgn = new cgn();
          localcgn.wBd = 10402;
          localcgn.xfu = new bts().alV((String)localObject2);
          localObject2 = new cgn();
          ((cgn)localObject2).wBd = 10404;
          ((cgn)localObject2).xfu = new bts().alV(b.cEk().toString());
          ((LinkedList)localObject1).add(localcgn);
          ((LinkedList)localObject1).add(localObject2);
          localObject1 = new com.tencent.mm.plugin.talkroom.b.g((LinkedList)localObject1, cEt());
          aw.Rg().a((m)localObject1, 0);
        }
        this.syD = "";
        this.nwu = 0;
        this.nwv = 0L;
        this.syE = 0;
        this.syF = 0;
        this.syG = 0;
        this.syH.clear();
        cEx();
        this.syO.akE();
        b.cEg().sxK.cEm();
        removeListener();
        AppMethodBeat.o(25820);
        continue;
        localObject1 = "";
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
          i = -99999;
        }
      }
    }
  }

  public final void k(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(25839);
    if (!paramString1.equals(this.syD))
      AppMethodBeat.o(25839);
    while (true)
    {
      return;
      paramString1 = this.syO;
      paramString2 = new i.10(paramString1, paramString2, paramString3);
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        paramString2.run();
        AppMethodBeat.o(25839);
      }
      else
      {
        paramString1.handler.post(paramString2);
        AppMethodBeat.o(25839);
      }
    }
  }

  public final void mb(boolean paramBoolean)
  {
    AppMethodBeat.i(25832);
    ab.i("MicroMsg.TalkRoomServer", "reConnect talkRoomUsername: %s", new Object[] { this.syD });
    if ((bo.isNullOrNil(this.syD)) || (this.state < 2))
      AppMethodBeat.o(25832);
    while (true)
    {
      return;
      b.cEk().cEr();
      if (paramBoolean)
        if (!cEA())
        {
          AppMethodBeat.o(25832);
          continue;
        }
      try
      {
        cEB();
        cEy();
        this.state = 1;
      }
      catch (RemoteException localRemoteException1)
      {
        try
        {
          if (this.syI != null)
            this.syI.Close();
          if (this.nwu != 0)
            cEC();
          if (!paramBoolean)
            this.syO.akH();
          AppMethodBeat.o(25832);
          continue;
          localRemoteException1 = localRemoteException1;
          ab.e("MicroMsg.TalkRoomServer", localRemoteException1.toString());
          ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException1, "", new Object[0]);
        }
        catch (RemoteException localRemoteException2)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException2, "", new Object[0]);
        }
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(25825);
    ab.i("MicroMsg.TalkRoomServer", "type:%d  errType:%d  errCode:%d", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramString = (com.tencent.mm.plugin.talkroom.b.f)paramm;
    if ((paramString.cED() == null) || (!paramString.cED().equals(this.syD)))
    {
      ab.w("MicroMsg.TalkRoomServer", "%s, now :%s this is the old sceneEnd, abandon it!!", new Object[] { paramString.cED(), this.syD });
      AppMethodBeat.o(25825);
    }
    while (true)
    {
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        if (paramm.getType() == 332)
        {
          b.cEk().Fs(2);
          if (paramInt1 == 4)
            b.cEk().sys = paramInt2;
          this.syO.l("cgi enter failed : errType:" + paramInt1 + " errCode:" + paramInt2, paramInt1, paramInt2);
          cEw();
          AppMethodBeat.o(25825);
        }
        else if (paramm.getType() == 334)
        {
          if (((com.tencent.mm.plugin.talkroom.b.d)paramm).actionType != 1)
          {
            AppMethodBeat.o(25825);
          }
          else
          {
            paramString = b.cEk();
            paramString.syb += 1;
            paramString.syw = 0L;
            cEy();
            ab.w("MicroMsg.TalkRoomServer", "onSceneEnd SeizeMicFailed");
            if ((paramInt1 == 4) && ((paramInt2 == 311) || (paramInt2 == 340)))
            {
              this.syO.mk(paramInt2);
              AppMethodBeat.o(25825);
            }
            else
            {
              this.syO.g(paramInt1, paramInt2, "TalkMicAction failed!!");
              AppMethodBeat.o(25825);
            }
          }
        }
        else if (paramm.getType() == 336)
        {
          this.syC = false;
          this.syO.g(paramInt1, paramInt2, "TalkGetMember failed!!");
          cEw();
          AppMethodBeat.o(25825);
        }
        else if (paramm.getType() == 335)
        {
          this.syO.g(paramInt1, paramInt2, "TalkNoop failed!!");
          cEw();
          AppMethodBeat.o(25825);
        }
      }
      else
      {
        Object localObject;
        if (paramm.getType() == 332)
        {
          b.cEk().Fs(1);
          paramm = (com.tencent.mm.plugin.talkroom.b.a)paramm;
          this.nwu = paramm.nwu;
          this.nwv = paramm.nwv;
          this.syE = paramm.syE;
          this.syF = paramm.syF;
          this.syH = paramm.syH;
          localObject = b.cEk();
          paramInt1 = this.nwu;
          long l = this.nwv;
          ((f)localObject).nwu = paramInt1;
          ((f)localObject).nwv = l;
          paramm = paramm.sza;
          b.cEi().a(this.syD, paramm, null, null, paramString.cEE());
          Ft(100);
          AppMethodBeat.o(25825);
        }
        else if (paramm.getType() == 334)
        {
          paramm = (com.tencent.mm.plugin.talkroom.b.d)paramm;
          if (paramm.actionType == 1)
          {
            paramString = b.cEk();
            if (paramString.syw != 0L)
            {
              paramString.sxZ = ((bo.az(paramString.syw) + paramString.sxZ * paramString.syv) / (paramString.syv + 1));
              paramString.syv += 1;
              paramString.sya += 1;
              paramString.syw = 0L;
            }
            ab.i("MicroMsg.TalkRoomServer", "dealWithSeizeMic seize Mic successFul");
            if (paramm.syE < this.syE)
            {
              ab.w("MicroMsg.TalkRoomServer", "micSeq is smaller seizeSeq %d, now %d", new Object[] { Integer.valueOf(paramm.syE), Integer.valueOf(this.syE) });
              cEy();
              this.syO.mk(311);
              AppMethodBeat.o(25825);
            }
            else
            {
              this.syE = paramm.syE;
              paramInt2 = -99999;
              try
              {
                paramInt1 = this.syI.SetCurrentMicId(this.syE);
                if (this.state != 3)
                {
                  ab.i("MicroMsg.TalkRoomServer", "dealWithSeizeMic not in getting mic state");
                  AppMethodBeat.o(25825);
                }
              }
              catch (RemoteException paramString)
              {
                while (true)
                {
                  ab.printErrStackTrace("MicroMsg.TalkRoomServer", paramString, "", new Object[0]);
                  paramInt1 = paramInt2;
                }
                paramm = this.syO;
                paramString = new i.6(paramm);
                if (Looper.myLooper() != Looper.getMainLooper())
                  break label874;
              }
              paramString.run();
              while (true)
              {
                this.state = 4;
                if (paramInt1 < 0)
                  ab.e("MicroMsg.TalkRoomServer", "SetCurrentMicId err: %d ", new Object[] { Integer.valueOf(paramInt1) });
                if (this.syN == null)
                {
                  this.syN = new ap(new g.3(this), true);
                  this.syN.ae(5000L, 5000L);
                }
                AppMethodBeat.o(25825);
                break;
                label874: paramm.handler.post(paramString);
              }
            }
          }
          else
          {
            ab.i("MicroMsg.TalkRoomServer", "putaway Mic successFul");
            AppMethodBeat.o(25825);
          }
        }
        else
        {
          if (paramm.getType() == 336)
          {
            localObject = (com.tencent.mm.plugin.talkroom.b.c)paramm;
            LinkedList localLinkedList = ((com.tencent.mm.plugin.talkroom.b.c)localObject).sza;
            b.cEi().a(this.syD, localLinkedList, null, null, paramString.cEE());
            Fu(((com.tencent.mm.plugin.talkroom.b.c)localObject).syE);
            this.syC = false;
            this.syO.tO(cEu());
          }
          if ((paramm.getType() == 335) && (this.state == 0))
            this.syO.g(3, -1, "talknoop success but in outside room state");
          AppMethodBeat.o(25825);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.model.g
 * JD-Core Version:    0.6.2
 */