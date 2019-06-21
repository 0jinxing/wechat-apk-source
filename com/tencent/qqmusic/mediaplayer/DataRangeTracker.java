package com.tencent.qqmusic.mediaplayer;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class DataRangeTracker
{
  private static final long LOCK_INTERVAL = 2000L;
  private static final String TAG = "DataRangeTracker";
  private final ReentrantReadWriteLock lock;
  private Comparator<DataRangeTracker.Range> mComparator;
  private final ArrayList<DataRangeTracker.Range> mDownloadDataList;
  private long mFileTotalSize;
  private long waitingPosition;
  private int waitingSize;

  public DataRangeTracker()
  {
    AppMethodBeat.i(104672);
    this.mDownloadDataList = new ArrayList();
    this.lock = new ReentrantReadWriteLock();
    this.mFileTotalSize = 0L;
    this.mComparator = new DataRangeTracker.1(this);
    AppMethodBeat.o(104672);
  }

  private void lockRead()
  {
    AppMethodBeat.i(104683);
    this.lock.readLock().lock();
    AppMethodBeat.o(104683);
  }

  private void unlock()
  {
    try
    {
      AppMethodBeat.i(104685);
      Logger.i("DataRangeTracker", "[unlock].");
      notifyAll();
      AppMethodBeat.o(104685);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void unlockRead()
  {
    AppMethodBeat.i(104684);
    this.lock.readLock().unlock();
    AppMethodBeat.o(104684);
  }

  public void abandonLock()
  {
    AppMethodBeat.i(104681);
    Logger.i("DataRangeTracker", "[abandonLock]");
    unblock();
    unlock();
    AppMethodBeat.o(104681);
  }

  public void addRange(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(104673);
    if (paramLong1 > paramLong2)
    {
      Logger.e("DataRangeTracker", "[addRange] illegal arguments! beginPos(%s) > endPos(%s)", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
      AppMethodBeat.o(104673);
    }
    while (true)
    {
      return;
      this.lock.writeLock().lock();
      ArrayList localArrayList;
      int j;
      while (true)
      {
        DataRangeTracker.Range localRange1;
        try
        {
          localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          Object localObject1 = this.mDownloadDataList;
          localRange1 = new com/tencent/qqmusic/mediaplayer/DataRangeTracker$Range;
          localRange1.<init>(paramLong1, paramLong2, null);
          ((ArrayList)localObject1).add(localRange1);
          Collections.sort(this.mDownloadDataList, this.mComparator);
          int i = this.mDownloadDataList.size() - 1;
          localObject1 = (DataRangeTracker.Range)this.mDownloadDataList.get(0);
          if (i <= 0)
            break label325;
          j = 1;
          if (j > i)
            break;
          localRange1 = (DataRangeTracker.Range)this.mDownloadDataList.get(j);
          if (DataRangeTracker.Range.access$100((DataRangeTracker.Range)localObject1) + 1L < DataRangeTracker.Range.access$200(localRange1))
          {
            DataRangeTracker.Range localRange2 = new com/tencent/qqmusic/mediaplayer/DataRangeTracker$Range;
            localRange2.<init>(DataRangeTracker.Range.access$200((DataRangeTracker.Range)localObject1), DataRangeTracker.Range.access$100((DataRangeTracker.Range)localObject1), null);
            localArrayList.add(localRange2);
            localObject1 = new com/tencent/qqmusic/mediaplayer/DataRangeTracker$Range;
            ((DataRangeTracker.Range)localObject1).<init>(DataRangeTracker.Range.access$200(localRange1), DataRangeTracker.Range.access$100(localRange1), null);
            if (j >= i)
              localArrayList.add(localObject1);
            j++;
            continue;
          }
          if (DataRangeTracker.Range.access$100((DataRangeTracker.Range)localObject1) > DataRangeTracker.Range.access$100(localRange1))
          {
            paramLong1 = DataRangeTracker.Range.access$100((DataRangeTracker.Range)localObject1);
            localObject1 = new DataRangeTracker.Range(DataRangeTracker.Range.access$200((DataRangeTracker.Range)localObject1), paramLong1, null);
            continue;
          }
        }
        finally
        {
          this.lock.writeLock().unlock();
          AppMethodBeat.o(104673);
        }
        paramLong1 = DataRangeTracker.Range.access$100(localRange1);
      }
      this.mDownloadDataList.clear();
      this.mDownloadDataList.addAll(localArrayList);
      label325: if ((this.waitingPosition >= 0L) && (this.waitingSize > 0))
      {
        boolean bool = isCached(this.waitingPosition, this.waitingSize);
        if (bool)
        {
          j = 1;
          label363: this.lock.writeLock().unlock();
          if (j == 0)
            break label458;
          Logger.i("DataRangeTracker", "[addRange] notify position: " + this.waitingPosition + ", size: " + this.waitingSize);
        }
      }
      try
      {
        unlock();
        this.waitingPosition = 0L;
        this.waitingSize = 0;
        AppMethodBeat.o(104673);
        continue;
        j = 0;
        break label363;
      }
      finally
      {
        AppMethodBeat.o(104673);
      }
      label458: AppMethodBeat.o(104673);
    }
  }

  public void block()
  {
    AppMethodBeat.i(104679);
    Logger.i("DataRangeTracker", "[block]");
    AppMethodBeat.o(104679);
  }

  public long findEnd(long paramLong)
  {
    AppMethodBeat.i(104675);
    lockRead();
    try
    {
      int i = this.mDownloadDataList.size();
      if (i == 0)
      {
        unlockRead();
        paramLong = -1L;
        AppMethodBeat.o(104675);
      }
      while (true)
      {
        return paramLong;
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label165;
          if (paramLong < DataRangeTracker.Range.access$200((DataRangeTracker.Range)this.mDownloadDataList.get(j)))
          {
            paramLong = DataRangeTracker.Range.access$200((DataRangeTracker.Range)this.mDownloadDataList.get(j));
            paramLong -= 1L;
            unlockRead();
            AppMethodBeat.o(104675);
            break;
          }
          if ((paramLong <= DataRangeTracker.Range.access$100((DataRangeTracker.Range)this.mDownloadDataList.get(j))) && (j + 1 < i))
          {
            paramLong = DataRangeTracker.Range.access$200((DataRangeTracker.Range)this.mDownloadDataList.get(j + 1));
            paramLong -= 1L;
            unlockRead();
            AppMethodBeat.o(104675);
            break;
          }
        }
        label165: unlockRead();
        paramLong = 0L;
        AppMethodBeat.o(104675);
      }
    }
    finally
    {
      unlockRead();
      AppMethodBeat.o(104675);
    }
  }

  public long findStart(long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(104674);
    lockRead();
    try
    {
      int j = this.mDownloadDataList.size();
      if (j == 0)
      {
        unlockRead();
        paramLong = -1L;
        AppMethodBeat.o(104674);
      }
      while (true)
      {
        return paramLong;
        long l1 = DataRangeTracker.Range.access$100((DataRangeTracker.Range)this.mDownloadDataList.get(0)) + 1L;
        while (true)
        {
          if (i >= j)
            break label176;
          long l2 = DataRangeTracker.Range.access$200((DataRangeTracker.Range)this.mDownloadDataList.get(i));
          if (paramLong < l2)
          {
            unlockRead();
            AppMethodBeat.o(104674);
            paramLong = l1;
            break;
          }
          l1 = DataRangeTracker.Range.access$100((DataRangeTracker.Range)this.mDownloadDataList.get(i)) + 1L;
          if (paramLong <= DataRangeTracker.Range.access$100((DataRangeTracker.Range)this.mDownloadDataList.get(i)))
          {
            paramLong = DataRangeTracker.Range.access$100((DataRangeTracker.Range)this.mDownloadDataList.get(i));
            paramLong += 1L;
            unlockRead();
            AppMethodBeat.o(104674);
            break;
          }
          i++;
        }
        label176: paramLong = DataRangeTracker.Range.access$100((DataRangeTracker.Range)this.mDownloadDataList.get(this.mDownloadDataList.size() - 1));
        paramLong += 1L;
        unlockRead();
        AppMethodBeat.o(104674);
      }
    }
    finally
    {
      unlockRead();
      AppMethodBeat.o(104674);
    }
  }

  public long getContinuousEnd()
  {
    AppMethodBeat.i(104677);
    lockRead();
    try
    {
      int i = this.mDownloadDataList.size();
      long l;
      if (i == 0)
      {
        unlockRead();
        l = -1L;
        AppMethodBeat.o(104677);
      }
      while (true)
      {
        return l;
        l = DataRangeTracker.Range.access$100((DataRangeTracker.Range)this.mDownloadDataList.get(0));
        unlockRead();
        AppMethodBeat.o(104677);
      }
    }
    finally
    {
      unlockRead();
      AppMethodBeat.o(104677);
    }
  }

  List<DataRangeTracker.Range> getEmptyContentPairList(long paramLong)
  {
    AppMethodBeat.i(104686);
    ArrayList localArrayList1 = new ArrayList();
    long l = 0L;
    synchronized (this.mDownloadDataList)
    {
      Iterator localIterator = this.mDownloadDataList.iterator();
      while (localIterator.hasNext())
      {
        DataRangeTracker.Range localRange1 = (DataRangeTracker.Range)localIterator.next();
        if (l < DataRangeTracker.Range.access$200(localRange1))
        {
          DataRangeTracker.Range localRange2 = new com/tencent/qqmusic/mediaplayer/DataRangeTracker$Range;
          localRange2.<init>(l, DataRangeTracker.Range.access$200(localRange1) - 1L, null);
          localArrayList1.add(localRange2);
        }
        l = 1L + DataRangeTracker.Range.access$100(localRange1);
      }
      if (l < paramLong)
        localArrayList1.add(new DataRangeTracker.Range(l, paramLong - 1L, null));
      AppMethodBeat.o(104686);
      return localArrayList1;
    }
  }

  public boolean isCached(long paramLong, int paramInt)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(104676);
    lockRead();
    try
    {
      long l1 = findStart(paramLong);
      long l2 = findStart(paramInt + paramLong);
      long l3 = findEnd(paramLong);
      long l4 = findEnd(paramInt + paramLong);
      if ((l1 != l2) || (l3 != l4));
      while (true)
      {
        return bool2;
        if (l3 == -1L)
        {
          unlockRead();
          AppMethodBeat.o(104676);
        }
        else
        {
          l2 = paramInt + paramLong;
          paramLong = l2;
          if (this.mFileTotalSize > 0L)
          {
            paramLong = l2;
            if (l2 > this.mFileTotalSize)
              paramLong = this.mFileTotalSize;
          }
          bool2 = bool1;
          if (paramLong <= l1)
            bool2 = true;
          unlockRead();
          AppMethodBeat.o(104676);
        }
      }
    }
    finally
    {
      unlockRead();
      AppMethodBeat.o(104676);
    }
  }

  public boolean lock(long paramLong1, int paramInt, long paramLong2)
  {
    try
    {
      AppMethodBeat.i(104678);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("[lock] position = [");
      Logger.i("DataRangeTracker", paramLong1 + "]. size = [" + paramInt + "]. timeout = [" + paramLong2 + "].");
      this.waitingPosition = paramLong1;
      this.waitingSize = paramInt;
      int i = (int)(paramLong2 / 2000L);
      paramInt = i;
      if (i <= 0)
        paramInt = 1;
      for (i = 0; i < paramInt; i++)
      {
        wait(2000L);
        if (isCached(this.waitingPosition, this.waitingSize))
          break;
      }
      AppMethodBeat.o(104678);
      return true;
    }
    finally
    {
    }
  }

  public String print()
  {
    try
    {
      AppMethodBeat.i(104682);
      this.lock.readLock().lock();
      try
      {
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        for (int i = 0; i < this.mDownloadDataList.size(); i++)
          ((StringBuilder)localObject1).append(((DataRangeTracker.Range)this.mDownloadDataList.get(i)).toString());
        localObject1 = ((StringBuilder)localObject1).toString();
        this.lock.readLock().unlock();
        AppMethodBeat.o(104682);
        return localObject1;
      }
      finally
      {
        this.lock.readLock().unlock();
        AppMethodBeat.o(104682);
      }
    }
    finally
    {
    }
  }

  public void setFileTotalSize(long paramLong)
  {
    this.mFileTotalSize = paramLong;
  }

  public void unblock()
  {
    AppMethodBeat.i(104680);
    Logger.i("DataRangeTracker", "[unblock]");
    AppMethodBeat.o(104680);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.DataRangeTracker
 * JD-Core Version:    0.6.2
 */