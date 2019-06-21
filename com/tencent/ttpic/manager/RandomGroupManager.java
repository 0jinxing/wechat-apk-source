package com.tencent.ttpic.manager;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.BaseUtils;
import com.tencent.ttpic.model.MemRandomValue;
import com.tencent.ttpic.util.AlgoUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public enum RandomGroupManager
{
  private static final int HAND_RANDOM_INDEX = 0;
  private Map<Integer, MemRandomValue> mRandomGroupFaceValueMap;
  private Map<Integer, MemRandomValue> mRandomGroupHandValueMap;

  static
  {
    AppMethodBeat.i(83450);
    INSTANCE = new RandomGroupManager("INSTANCE", 0);
    $VALUES = new RandomGroupManager[] { INSTANCE };
    AppMethodBeat.o(83450);
  }

  private RandomGroupManager()
  {
    AppMethodBeat.i(83439);
    this.mRandomGroupFaceValueMap = new HashMap();
    this.mRandomGroupHandValueMap = new HashMap();
    clearAll();
    AppMethodBeat.o(83439);
  }

  private void clearFaceRandomGroupStatus()
  {
    AppMethodBeat.i(83446);
    Iterator localIterator = this.mRandomGroupFaceValueMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      MemRandomValue localMemRandomValue = (MemRandomValue)this.mRandomGroupFaceValueMap.get(Integer.valueOf(i));
      if (localMemRandomValue != null)
      {
        localMemRandomValue.curValue = -1;
        this.mRandomGroupFaceValueMap.put(Integer.valueOf(i), localMemRandomValue);
      }
    }
    AppMethodBeat.o(83446);
  }

  private void clearFaceRandomGroupStatus(List<Integer> paramList)
  {
    AppMethodBeat.i(83444);
    Iterator localIterator = this.mRandomGroupFaceValueMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if (!faceExist(paramList, i))
      {
        MemRandomValue localMemRandomValue = (MemRandomValue)this.mRandomGroupFaceValueMap.get(Integer.valueOf(i));
        if (localMemRandomValue != null)
        {
          localMemRandomValue.curValue = -1;
          this.mRandomGroupFaceValueMap.put(Integer.valueOf(i), localMemRandomValue);
        }
      }
    }
    AppMethodBeat.o(83444);
  }

  private void clearHandRandomGroupStatus()
  {
    AppMethodBeat.i(83447);
    MemRandomValue localMemRandomValue = (MemRandomValue)this.mRandomGroupHandValueMap.get(Integer.valueOf(0));
    localMemRandomValue.curValue = -1;
    this.mRandomGroupHandValueMap.put(Integer.valueOf(0), localMemRandomValue);
    AppMethodBeat.o(83447);
  }

  private boolean faceExist(List<Integer> paramList, int paramInt)
  {
    AppMethodBeat.i(83445);
    paramList = paramList.iterator();
    boolean bool;
    while (paramList.hasNext())
      if (((Integer)paramList.next()).intValue() == paramInt)
      {
        bool = true;
        AppMethodBeat.o(83445);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(83445);
    }
  }

  private void fillEmptyRandomGroupValue(List<Integer> paramList, int paramInt)
  {
    AppMethodBeat.i(83443);
    Object localObject = paramList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      i = ((Integer)((Iterator)localObject).next()).intValue();
      if (!this.mRandomGroupFaceValueMap.containsKey(Integer.valueOf(i)))
        this.mRandomGroupFaceValueMap.put(Integer.valueOf(i), new MemRandomValue());
    }
    for (int i = 1; i < paramList.size(); i++)
    {
      localObject = (MemRandomValue)this.mRandomGroupFaceValueMap.get(paramList.get(i));
      if ((localObject != null) && (((MemRandomValue)localObject).curValue < 0))
      {
        int j = AlgoUtils.randValueDiff(((MemRandomValue)localObject).lastValue, paramInt);
        ((MemRandomValue)localObject).curValue = j;
        ((MemRandomValue)localObject).lastValue = j;
      }
      this.mRandomGroupFaceValueMap.put(paramList.get(i), localObject);
    }
    AppMethodBeat.o(83443);
  }

  public static RandomGroupManager getInstance()
  {
    return INSTANCE;
  }

  public final void clearAll()
  {
    AppMethodBeat.i(83449);
    this.mRandomGroupFaceValueMap.clear();
    this.mRandomGroupHandValueMap.put(Integer.valueOf(0), new MemRandomValue());
    AppMethodBeat.o(83449);
  }

  public final void clearCurValue()
  {
    AppMethodBeat.i(83448);
    clearFaceRandomGroupStatus();
    clearHandRandomGroupStatus();
    AppMethodBeat.o(83448);
  }

  public final int getFaceValue(int paramInt)
  {
    AppMethodBeat.i(83440);
    if (this.mRandomGroupFaceValueMap.containsKey(Integer.valueOf(paramInt)))
    {
      paramInt = ((MemRandomValue)this.mRandomGroupFaceValueMap.get(Integer.valueOf(paramInt))).curValue;
      AppMethodBeat.o(83440);
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      AppMethodBeat.o(83440);
    }
  }

  public final int getHandValue()
  {
    AppMethodBeat.i(83441);
    int i = ((MemRandomValue)this.mRandomGroupHandValueMap.get(Integer.valueOf(0))).curValue;
    AppMethodBeat.o(83441);
    return i;
  }

  public final void updateValue(List<Integer> paramList, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(83442);
    if (!paramBoolean)
      clearHandRandomGroupStatus();
    clearFaceRandomGroupStatus(paramList);
    fillEmptyRandomGroupValue(paramList, paramInt);
    MemRandomValue localMemRandomValue1 = (MemRandomValue)this.mRandomGroupHandValueMap.get(Integer.valueOf(0));
    MemRandomValue localMemRandomValue2;
    int i;
    if (!BaseUtils.isEmpty(paramList))
    {
      localMemRandomValue2 = (MemRandomValue)this.mRandomGroupFaceValueMap.get(paramList.get(0));
      if ((localMemRandomValue1 == null) || (localMemRandomValue2 == null) || (((localMemRandomValue1.curValue >= 0) || (!paramBoolean)) && ((localMemRandomValue2.curValue >= 0) || (BaseUtils.isEmpty(paramList)))))
        break label224;
      if (localMemRandomValue1.curValue >= 0)
        break label146;
      i = localMemRandomValue2.lastValue;
    }
    label122: for (paramInt = AlgoUtils.randValueDiff(i, paramInt); ; paramInt = -1)
    {
      if (paramInt < 0)
        AppMethodBeat.o(83442);
      while (true)
      {
        return;
        localMemRandomValue2 = localMemRandomValue1;
        break;
        i = localMemRandomValue1.lastValue;
        break label122;
        if (!BaseUtils.isEmpty(paramList))
          this.mRandomGroupFaceValueMap.put(paramList.get(0), new MemRandomValue(paramInt, paramInt));
        if (paramBoolean)
          this.mRandomGroupHandValueMap.put(Integer.valueOf(0), new MemRandomValue(paramInt, paramInt));
        AppMethodBeat.o(83442);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.manager.RandomGroupManager
 * JD-Core Version:    0.6.2
 */