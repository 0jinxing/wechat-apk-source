package com.tencent.mm.plugin.emoji.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.emoji.model.e;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class c
  implements Cloneable, Iterable<f>
{
  private HashMap<String, ar> kSW;
  protected HashMap<String, ar> kSX;
  public boolean kSY;
  protected ArrayList<f> mItemList;

  public c()
  {
    AppMethodBeat.i(52780);
    this.kSW = new HashMap();
    this.kSX = new HashMap();
    this.kSY = r.YL();
    AppMethodBeat.o(52780);
  }

  public c(com.tencent.mm.plugin.emoji.model.f paramf)
  {
  }

  public c(List<f> paramList)
  {
    this();
    AppMethodBeat.i(52781);
    if (paramList == null)
      AppMethodBeat.o(52781);
    while (true)
    {
      return;
      this.mItemList = new ArrayList();
      this.mItemList.addAll(paramList);
      AppMethodBeat.o(52781);
    }
  }

  public final f IT(String paramString)
  {
    AppMethodBeat.i(52784);
    if (this.mItemList != null)
    {
      Iterator localIterator = this.mItemList.iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        EmotionSummary localEmotionSummary = localf.kTb;
        if ((localEmotionSummary != null) && (localEmotionSummary.ProductID != null) && (localEmotionSummary.ProductID.equals(paramString)))
        {
          AppMethodBeat.o(52784);
          paramString = localf;
        }
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(52784);
    }
  }

  public final void IU(String paramString)
  {
    AppMethodBeat.i(52787);
    f localf = IT(paramString);
    if (localf == null)
      AppMethodBeat.o(52787);
    while (true)
    {
      return;
      localf.setStatus(-1);
      localf.a(this.kSY, IX(paramString), IV(paramString));
      AppMethodBeat.o(52787);
    }
  }

  public final boolean IV(String paramString)
  {
    AppMethodBeat.i(52788);
    boolean bool;
    if (this.kSX == null)
    {
      bool = false;
      AppMethodBeat.o(52788);
    }
    while (true)
    {
      return bool;
      bool = this.kSX.containsKey(paramString);
      AppMethodBeat.o(52788);
    }
  }

  public final ar IW(String paramString)
  {
    AppMethodBeat.i(52789);
    ar localar1 = IX(paramString);
    ar localar2 = localar1;
    if (localar1 == null)
    {
      localar2 = new ar(paramString);
      this.kSW.put(paramString, localar2);
    }
    AppMethodBeat.o(52789);
    return localar2;
  }

  public final ar IX(String paramString)
  {
    AppMethodBeat.i(52790);
    paramString = (ar)this.kSW.get(paramString);
    AppMethodBeat.o(52790);
    return paramString;
  }

  public final void bY(String paramString, int paramInt)
  {
    AppMethodBeat.i(52792);
    paramString = (ar)this.kSW.get(paramString);
    if (paramString == null)
      AppMethodBeat.o(52792);
    while (true)
    {
      return;
      paramString.Mo(paramInt);
      AppMethodBeat.o(52792);
    }
  }

  public final c bjC()
  {
    AppMethodBeat.i(52785);
    try
    {
      localc1 = (c)super.clone();
      localc2 = localc1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException1)
    {
      try
      {
        if (this.mItemList != null)
          localc1.mItemList = ((ArrayList)this.mItemList.clone());
        Object localObject;
        for (c localc2 = localc1; ; localObject = null)
        {
          AppMethodBeat.o(52785);
          return localc2;
          localCloneNotSupportedException1 = localCloneNotSupportedException1;
        }
      }
      catch (CloneNotSupportedException localCloneNotSupportedException2)
      {
        while (true)
        {
          c localc1;
          c localc3 = localc1;
        }
      }
    }
  }

  public void bjD()
  {
    AppMethodBeat.i(52793);
    if (this.mItemList == null)
      AppMethodBeat.o(52793);
    while (true)
    {
      return;
      if (j.bkn().kVo == null)
      {
        AppMethodBeat.o(52793);
      }
      else
      {
        Iterator localIterator = this.mItemList.iterator();
        while (localIterator.hasNext())
        {
          f localf = (f)localIterator.next();
          Object localObject1 = localf.kTb;
          if (localObject1 != null)
          {
            Object localObject2 = j.bkn();
            localObject1 = ((EmotionSummary)localObject1).ProductID;
            localObject2 = (Integer)((e)localObject2).kVo.get(localObject1);
            if (localObject2 == null);
            for (int i = -1; ; i = ((Integer)localObject2).intValue())
            {
              if (i >= 0)
              {
                localf.setStatus(6);
                localf.EV = i;
              }
              if ((i >= 0) || (localf.mStatus != 6))
                break;
              localf.setStatus(3);
              break;
            }
          }
        }
        AppMethodBeat.o(52793);
      }
    }
  }

  public void clear()
  {
    AppMethodBeat.i(52778);
    if (this.mItemList != null)
    {
      this.mItemList.clear();
      this.mItemList = null;
    }
    if (this.kSW != null)
    {
      this.kSW.clear();
      this.kSW = null;
    }
    if (this.kSX != null)
    {
      this.kSX.clear();
      this.kSX = null;
    }
    AppMethodBeat.o(52778);
  }

  public Iterator<f> iterator()
  {
    AppMethodBeat.i(52791);
    c.a locala = new c.a(this, (byte)0);
    AppMethodBeat.o(52791);
    return locala;
  }

  public void notifyDataSetChanged()
  {
    AppMethodBeat.i(52786);
    if (this.mItemList == null)
      AppMethodBeat.o(52786);
    while (true)
    {
      return;
      this.kSX = j.getEmojiStorageMgr().xYo.duD();
      Iterator localIterator = this.mItemList.iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        Object localObject = localf.kTb;
        if (localObject != null)
        {
          if (com.tencent.mm.plugin.emoji.h.a.g((EmotionSummary)localObject))
          {
            if (com.tencent.mm.plugin.emoji.h.a.blE());
            for (int i = 7; ; i = 3)
            {
              localf.setStatus(i);
              break;
            }
          }
          localObject = ((EmotionSummary)localObject).ProductID;
          localf.a(this.kSY, IX((String)localObject), IV((String)localObject));
        }
      }
      bjD();
      AppMethodBeat.o(52786);
    }
  }

  public final int size()
  {
    AppMethodBeat.i(52782);
    int i;
    if (this.mItemList == null)
    {
      i = 0;
      AppMethodBeat.o(52782);
    }
    while (true)
    {
      return i;
      i = this.mItemList.size();
      AppMethodBeat.o(52782);
    }
  }

  public final f ub(int paramInt)
  {
    f localf = null;
    AppMethodBeat.i(52783);
    if ((this.mItemList == null) || (this.mItemList.size() <= paramInt) || (paramInt < 0))
      AppMethodBeat.o(52783);
    while (true)
    {
      return localf;
      if (this.mItemList == null)
      {
        AppMethodBeat.o(52783);
      }
      else
      {
        localf = (f)this.mItemList.get(paramInt);
        AppMethodBeat.o(52783);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.a.a.c
 * JD-Core Version:    0.6.2
 */