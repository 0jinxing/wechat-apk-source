package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cod;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class h
{
  String gbr;
  LinkedHashMap<String, h.a> gbs;
  final ReadWriteLock gbt;
  private StringBuilder gbu;

  public h(String paramString)
  {
    AppMethodBeat.i(116747);
    this.gbt = new ReentrantReadWriteLock();
    this.gbu = new StringBuilder();
    this.gbs = new LinkedHashMap();
    this.gbr = paramString;
    AppMethodBeat.o(116747);
  }

  public final void am(List<cod> paramList)
  {
    AppMethodBeat.i(116751);
    int i;
    Object localObject;
    if (paramList == null)
    {
      i = 0;
      this.gbt.readLock().lock();
      if (this.gbs.size() != 0)
        break label110;
      this.gbt.readLock().unlock();
      localObject = "[]";
      label52: ab.d("MicroMsg.ShortSentenceContainer", "updateVoiceInfoResult respVTList size %s innerContainer %s", new Object[] { Integer.valueOf(i), localObject });
      if ((paramList != null) && (paramList.size() != 0))
        break label247;
      ab.i("MicroMsg.ShortSentenceContainer", "respList == null");
      AppMethodBeat.o(116751);
    }
    while (true)
    {
      return;
      i = paramList.size();
      break;
      label110: localObject = new StringBuilder();
      ((StringBuilder)localObject).append("[");
      Iterator localIterator = this.gbs.values().iterator();
      while (localIterator.hasNext())
        ((StringBuilder)localObject).append(((h.a)localIterator.next()).gbv).append(", ");
      if (((StringBuilder)localObject).length() <= 3)
      {
        this.gbt.readLock().unlock();
        localObject = "]";
        break label52;
      }
      ((StringBuilder)localObject).setLength(((StringBuilder)localObject).length() - 2);
      this.gbt.readLock().unlock();
      localObject = "]";
      break label52;
      label247: this.gbt.readLock().lock();
      localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        cod localcod = (cod)localIterator.next();
        if (localcod == null)
        {
          ab.i("MicroMsg.ShortSentenceContainer", "setFetchedVoiceInfoResult voiceTransCell is null.");
        }
        else
        {
          h.a locala = (h.a)this.gbs.get(localcod.vZx);
          if (locala == null)
          {
            ab.i("MicroMsg.ShortSentenceContainer", "voiceInfoContainer not found the voiceId %s", new Object[] { localcod.vZx });
          }
          else if (localcod == null)
          {
            ab.d("MicroMsg.ShortSentenceContainer", "update VoiceInfo cell is null");
          }
          else
          {
            String str1 = localcod.vZx;
            int j = localcod.xlD;
            label400: boolean bool1;
            label411: int k;
            String str2;
            boolean bool2;
            boolean bool3;
            int m;
            if ((localcod.xiP == null) || (localcod.xiP.getBuffer() == null))
            {
              paramList = null;
              if (localcod.fJT == 0)
                break label610;
              bool1 = true;
              k = localcod.fJT;
              str2 = locala.gbv;
              bool2 = locala.gbw;
              bool3 = locala.gbx;
              i = locala.gby;
              m = locala.gbA;
              if (locala.data != null)
                break label616;
            }
            label610: label616: for (localObject = null; ; localObject = Integer.valueOf(locala.data.length()))
            {
              ab.d("MicroMsg.ShortSentenceContainer", "update VoiceInfo get {cell} %s, seq %s, text %s, endFlag %s, endFlag %s {currentInfo} %s, isRequestStart %s, isRequestEnd %s, voiceFileMark %s, seq %s, data %s, isResponseEnd %s", new Object[] { str1, Integer.valueOf(j), paramList, Boolean.valueOf(bool1), Integer.valueOf(k), str2, Boolean.valueOf(bool2), Boolean.valueOf(bool3), Integer.valueOf(i), Integer.valueOf(m), localObject, Boolean.valueOf(locala.gbB) });
              if ((localcod.xlD >= locala.gbA) && (!locala.gbB))
                break label631;
              ab.d("MicroMsg.ShortSentenceContainer", "update seq not fit.");
              break;
              paramList = Integer.valueOf(localcod.xiP.getILen());
              break label400;
              bool1 = false;
              break label411;
            }
            label631: locala.gbA = localcod.xlD;
            if ((localcod.xiP == null) || (localcod.xiP.getBuffer() == null))
            {
              paramList = null;
              label662: locala.data = paramList;
              if (localcod.fJT == 0)
                break label800;
              bool1 = true;
              label679: locala.gbB = bool1;
              paramList = localcod.vZx;
              k = locala.gbA;
              bool1 = locala.gbB;
              if (locala.data != null)
                break label806;
            }
            label800: label806: for (i = -1; ; i = locala.data.length())
            {
              ab.i("MicroMsg.ShortSentenceContainer", "update VoiceId = %s,respSeq = %s,isResponseEnd = %s,data.length = %s", new Object[] { paramList, Integer.valueOf(k), Boolean.valueOf(bool1), Integer.valueOf(i) });
              if (localcod.fJT != 2)
                break;
              ab.e("MicroMsg.ShortSentenceContainer", "update cell.EndFlag = 2 VoiceId = %s", new Object[] { localcod.vZx });
              break;
              paramList = localcod.xiP.getBuffer().dlY();
              break label662;
              bool1 = false;
              break label679;
            }
          }
        }
      }
      this.gbt.readLock().unlock();
      AppMethodBeat.o(116751);
    }
  }

  public final LinkedList<bts> amx()
  {
    AppMethodBeat.i(116748);
    LinkedList localLinkedList = new LinkedList();
    this.gbt.readLock().lock();
    Iterator localIterator = this.gbs.values().iterator();
    while (localIterator.hasNext())
    {
      h.a locala = (h.a)localIterator.next();
      if (locala.gbw)
        localLinkedList.add(new bts().alV(locala.gbv));
    }
    this.gbt.readLock().unlock();
    AppMethodBeat.o(116748);
    return localLinkedList;
  }

  public final boolean amy()
  {
    boolean bool = false;
    AppMethodBeat.i(116750);
    this.gbt.readLock().lock();
    if (this.gbs.size() == 0)
    {
      ab.i("MicroMsg.ShortSentenceContainer", "isAllRespEnd innerContainer.size() == 0");
      AppMethodBeat.o(116750);
      return bool;
    }
    Iterator localIterator = this.gbs.values().iterator();
    h.a locala;
    do
    {
      if (!localIterator.hasNext())
        break;
      locala = (h.a)localIterator.next();
      ab.d("MicroMsg.ShortSentenceContainer", "isAllRespEnd voiceId:%s isRequestEnd:%s isResponseEnd:%s", new Object[] { locala.gbv, Boolean.valueOf(locala.gbx), Boolean.valueOf(locala.gbB) });
    }
    while (locala.gbB);
    for (bool = false; ; bool = true)
    {
      this.gbt.readLock().unlock();
      AppMethodBeat.o(116750);
      break;
    }
  }

  public final String getResult()
  {
    AppMethodBeat.i(116749);
    this.gbu.setLength(0);
    this.gbt.readLock().lock();
    Iterator localIterator = this.gbs.values().iterator();
    while (localIterator.hasNext())
    {
      localObject = (h.a)localIterator.next();
      if (((h.a)localObject).data != null)
        this.gbu.append(((h.a)localObject).data);
    }
    this.gbt.readLock().unlock();
    Object localObject = this.gbu.toString();
    AppMethodBeat.o(116749);
    return localObject;
  }

  public final void mw(int paramInt)
  {
    AppMethodBeat.i(116752);
    ab.i("MicroMsg.ShortSentenceContainer", "cutShortSentence markEnd:%s", new Object[] { Integer.valueOf(paramInt) });
    Object localObject;
    if (paramInt < 0)
    {
      localObject = new IllegalStateException("splitShortSentence file mark less than zero. mark: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(116752);
      throw ((Throwable)localObject);
    }
    this.gbt.readLock().lock();
    if (this.gbs.size() == 0)
    {
      ab.e("MicroMsg.ShortSentenceContainer", "splitShortSentence there is no last one");
      AppMethodBeat.o(116752);
    }
    while (true)
    {
      return;
      Iterator localIterator = this.gbs.values().iterator();
      for (localObject = null; localIterator.hasNext(); localObject = (h.a)localIterator.next());
      if (localObject == null)
      {
        localObject = new IllegalStateException("splitShortSentence last info is null");
        AppMethodBeat.o(116752);
        throw ((Throwable)localObject);
      }
      ab.d("MicroMsg.ShortSentenceContainer", "cutShortSentence voiceFileMarkEnd:%s voiceId:%s markEnd:%s", new Object[] { Integer.valueOf(((h.a)localObject).gby), ((h.a)localObject).gbv, Integer.valueOf(paramInt) });
      ((h.a)localObject).gby = paramInt;
      this.gbt.readLock().unlock();
      AppMethodBeat.o(116752);
    }
  }

  public final h.a mx(int paramInt)
  {
    h.a locala = null;
    AppMethodBeat.i(116753);
    this.gbt.readLock().lock();
    if (this.gbs.size() == 0)
    {
      AppMethodBeat.o(116753);
      return locala;
    }
    Iterator localIterator = this.gbs.values().iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      locala = (h.a)localIterator.next();
      ab.d("MicroMsg.ShortSentenceContainer", "locateCurrentShortSentence oldOffset = %s voiceFileMarkEnd = %s info.isRequestEnd = %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(locala.gby), Boolean.valueOf(locala.gbx) });
    }
    while ((locala.gbx) || (paramInt > locala.gby));
    while (true)
    {
      this.gbt.readLock().unlock();
      AppMethodBeat.o(116753);
      break;
      locala = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.h
 * JD-Core Version:    0.6.2
 */