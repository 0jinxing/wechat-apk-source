package com.tencent.mm.plugin.choosemsgfile.b.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.MsgFile;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  private Map<Long, MsgFile> kvr;
  public boolean kvs;
  private Set<Long> kvt;
  public int mMaxCount;

  public a()
  {
    AppMethodBeat.i(54378);
    this.mMaxCount = 2147483647;
    this.kvr = new ConcurrentHashMap();
    this.kvt = new HashSet();
    AppMethodBeat.o(54378);
  }

  public final boolean a(long paramLong, MsgFile paramMsgFile)
  {
    boolean bool = false;
    AppMethodBeat.i(54383);
    if (paramLong == -1L)
    {
      ab.e("MicroMsg.ChooseMsgFileHelper", "msgid is invalid");
      AppMethodBeat.o(54383);
    }
    while (true)
    {
      return bool;
      if (paramMsgFile == null)
      {
        ab.e("MicroMsg.ChooseMsgFileHelper", "msgFile is null");
        AppMethodBeat.o(54383);
      }
      else if (bo.isNullOrNil(paramMsgFile.filePath))
      {
        ab.e("MicroMsg.ChooseMsgFileHelper", "filePath is invalid");
        AppMethodBeat.o(54383);
      }
      else if (kq())
      {
        ab.e("MicroMsg.ChooseMsgFileHelper", "exceed max:%d", new Object[] { Integer.valueOf(this.mMaxCount) });
        AppMethodBeat.o(54383);
      }
      else if (this.kvr == null)
      {
        ab.e("MicroMsg.ChooseMsgFileHelper", "msgIdToMsgFile is null, return");
        AppMethodBeat.o(54383);
      }
      else
      {
        ab.i("MicroMsg.ChooseMsgFileHelper", "msgIdToFilePath put msgId:%d filePath:%s", new Object[] { Long.valueOf(paramLong), paramMsgFile });
        this.kvr.put(Long.valueOf(paramLong), paramMsgFile);
        AppMethodBeat.o(54383);
        bool = true;
      }
    }
  }

  public final boolean bfD()
  {
    boolean bool = false;
    AppMethodBeat.i(54382);
    if (this.kvr == null)
    {
      ab.e("MicroMsg.ChooseMsgFileHelper", "isChange() msgIdToMsgFile is null, return");
      AppMethodBeat.o(54382);
    }
    while (true)
    {
      return bool;
      if ((this.kvr.size() == this.mMaxCount - 1) || (this.kvr.size() == this.mMaxCount))
      {
        bool = true;
        AppMethodBeat.o(54382);
      }
      else
      {
        AppMethodBeat.o(54382);
      }
    }
  }

  public final ArrayList<MsgFile> bfE()
  {
    AppMethodBeat.i(54387);
    Object localObject;
    if ((this.kvr == null) || (this.kvr.size() == 0))
    {
      ab.e("MicroMsg.ChooseMsgFileHelper", "msgIdToFilePath is null, return");
      localObject = null;
      AppMethodBeat.o(54387);
    }
    while (true)
    {
      return localObject;
      localObject = new ArrayList();
      Iterator localIterator = this.kvr.values().iterator();
      while (localIterator.hasNext())
        ((ArrayList)localObject).add((MsgFile)localIterator.next());
      AppMethodBeat.o(54387);
    }
  }

  public final boolean bfF()
  {
    try
    {
      AppMethodBeat.i(54391);
      boolean bool;
      if ((this.kvt != null) && (this.kvt.size() > 0))
      {
        bool = true;
        AppMethodBeat.o(54391);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(54391);
      }
    }
    finally
    {
    }
  }

  public final boolean gV(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(54384);
    if (paramLong == -1L)
    {
      ab.e("MicroMsg.ChooseMsgFileHelper", "msgid is invalid");
      AppMethodBeat.o(54384);
    }
    while (true)
    {
      return bool;
      if (this.kvr == null)
      {
        ab.e("MicroMsg.ChooseMsgFileHelper", "msgIdToMsgFile is null, return");
        AppMethodBeat.o(54384);
      }
      else
      {
        ab.i("MicroMsg.ChooseMsgFileHelper", "msgIdToFilePath remove msgId:%d", new Object[] { Long.valueOf(paramLong) });
        this.kvr.remove(Long.valueOf(paramLong));
        AppMethodBeat.o(54384);
        bool = true;
      }
    }
  }

  public final boolean gW(long paramLong)
  {
    AppMethodBeat.i(54385);
    boolean bool;
    if (this.kvr == null)
    {
      bool = false;
      AppMethodBeat.o(54385);
    }
    while (true)
    {
      return bool;
      bool = this.kvr.containsKey(Long.valueOf(paramLong));
      AppMethodBeat.o(54385);
    }
  }

  public final void gX(long paramLong)
  {
    try
    {
      AppMethodBeat.i(54388);
      if (this.kvt != null)
        this.kvt.add(Long.valueOf(paramLong));
      AppMethodBeat.o(54388);
      return;
    }
    finally
    {
    }
  }

  public final void gY(long paramLong)
  {
    try
    {
      AppMethodBeat.i(54389);
      if (this.kvt != null)
        this.kvt.remove(Long.valueOf(paramLong));
      AppMethodBeat.o(54389);
      return;
    }
    finally
    {
    }
  }

  public final boolean gZ(long paramLong)
  {
    try
    {
      AppMethodBeat.i(54390);
      boolean bool;
      if ((this.kvt != null) && (this.kvt.contains(Long.valueOf(paramLong))))
      {
        bool = true;
        AppMethodBeat.o(54390);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(54390);
      }
    }
    finally
    {
    }
  }

  public final int getSelectCount()
  {
    AppMethodBeat.i(54386);
    int i;
    if (this.kvr == null)
    {
      i = 0;
      AppMethodBeat.o(54386);
    }
    while (true)
    {
      return i;
      i = this.kvr.size();
      AppMethodBeat.o(54386);
    }
  }

  public final void init(int paramInt)
  {
    try
    {
      AppMethodBeat.i(54379);
      ab.i("MicroMsg.ChooseMsgFileHelper", "init count:%d", new Object[] { Integer.valueOf(paramInt) });
      this.mMaxCount = paramInt;
      this.kvr.clear();
      AppMethodBeat.o(54379);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean kq()
  {
    boolean bool = false;
    AppMethodBeat.i(54381);
    if (this.kvr == null)
    {
      ab.e("MicroMsg.ChooseMsgFileHelper", "isInvalid() msgIdToMsgFile is null, return");
      AppMethodBeat.o(54381);
    }
    while (true)
    {
      return bool;
      if (this.kvr.size() >= this.mMaxCount)
      {
        bool = true;
        AppMethodBeat.o(54381);
      }
      else
      {
        AppMethodBeat.o(54381);
      }
    }
  }

  public final void uninit()
  {
    try
    {
      AppMethodBeat.i(54380);
      ab.i("MicroMsg.ChooseMsgFileHelper", "uninit");
      this.kvr.clear();
      this.kvr = null;
      this.kvt.clear();
      this.kvt = null;
      AppMethodBeat.o(54380);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.d.a
 * JD-Core Version:    0.6.2
 */