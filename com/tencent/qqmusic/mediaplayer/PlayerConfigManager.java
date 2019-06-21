package com.tencent.qqmusic.mediaplayer;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.lang.ref.WeakReference;

public class PlayerConfigManager
{
  private static final int ADD = 1;
  private static final int DTS_COST_THRESHOLD = 40;
  private static boolean ENABLE_CHANGE_THREAD_PRIORITY = false;
  private static final boolean ENABLE_REAL_CHECK = true;
  private static final int MAX_RATIO = 4;
  private static final int MAX_TIMES = 10;
  private static final int MIN_RATIO = 8;
  private static final int NONE = 0;
  private static final int SUB = -1;
  private static final String TAG = "PlayerConfigManager";
  private static PlayerConfigManager mInstance;
  private int[] THREAD_PRIORITY;
  private int count;
  private int mAddPriority;
  private int mBufRatio;
  private WeakReference<CorePlayer> mCommonPlayerRef;
  private int mCurrPriorityIndex;
  private long mLastDecodeSpeed;
  private long mPlaySpeed;
  private int mProcessorNumber;
  private long mStartTime;

  private PlayerConfigManager()
  {
    AppMethodBeat.i(104500);
    this.mBufRatio = 4;
    this.count = 0;
    this.mStartTime = 0L;
    this.mPlaySpeed = 1L;
    this.mAddPriority = 0;
    this.mProcessorNumber = Runtime.getRuntime().availableProcessors();
    this.mCommonPlayerRef = null;
    this.THREAD_PRIORITY = new int[] { 19, 10, -2, -4, -8, -16, -19 };
    this.mCurrPriorityIndex = 0;
    this.mBufRatio = 4;
    this.count = 0;
    this.mStartTime = 0L;
    AppMethodBeat.o(104500);
  }

  private boolean add()
  {
    if (this.mAddPriority > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static PlayerConfigManager getInstance()
  {
    try
    {
      AppMethodBeat.i(104501);
      if (mInstance == null)
      {
        localPlayerConfigManager = new com/tencent/qqmusic/mediaplayer/PlayerConfigManager;
        localPlayerConfigManager.<init>();
        mInstance = localPlayerConfigManager;
      }
      PlayerConfigManager localPlayerConfigManager = mInstance;
      AppMethodBeat.o(104501);
      return localPlayerConfigManager;
    }
    finally
    {
    }
  }

  private boolean sub()
  {
    if (this.mAddPriority < -1);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void calDTSCostEnd()
  {
    AppMethodBeat.i(104504);
    if (this.mBufRatio == 8)
      AppMethodBeat.o(104504);
    while (true)
    {
      return;
      if (System.currentTimeMillis() - this.mStartTime > 40L)
      {
        this.count += 1;
        if (this.count > 10)
        {
          this.mBufRatio *= 2;
          this.count = 0;
        }
      }
      AppMethodBeat.o(104504);
    }
  }

  public void calDTSCostStart()
  {
    AppMethodBeat.i(104503);
    if (this.mBufRatio == 8)
      AppMethodBeat.o(104503);
    while (true)
    {
      return;
      this.mStartTime = System.currentTimeMillis();
      AppMethodBeat.o(104503);
    }
  }

  public void changeDecodeThreadPriority()
  {
    AppMethodBeat.i(104507);
    if (this.mCommonPlayerRef != null)
    {
      CorePlayer localCorePlayer = (CorePlayer)this.mCommonPlayerRef.get();
      if (localCorePlayer != null)
        localCorePlayer.changePlayThreadPriorityImmediately();
    }
    AppMethodBeat.o(104507);
  }

  public void changeDecodeThreadPriorityIfNeed()
  {
    int i = 0;
    AppMethodBeat.i(104508);
    try
    {
      int j = this.mCurrPriorityIndex;
      if ((isSingleCpuOrScreenOff()) && (ENABLE_CHANGE_THREAD_PRIORITY))
      {
        if (add())
          k = j + 1;
        while ((k == this.mCurrPriorityIndex) && (k >= 0) && (k < this.THREAD_PRIORITY.length))
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("changeDecodeThreadPriorityIfNeed don't change Priority mCurrPriorityIndex = ");
          Logger.i("PlayerConfigManager", this.THREAD_PRIORITY[this.mCurrPriorityIndex]);
          AppMethodBeat.o(104508);
          return;
          k = j;
          if (sub())
            k = j - 1;
        }
        if (k >= 0)
          break label141;
      }
      for (int k = i; ; k--)
      {
        this.mCurrPriorityIndex = k;
        this.mAddPriority = 0;
        Process.setThreadPriority(0);
        AppMethodBeat.o(104508);
        break;
        label141: if (k < this.THREAD_PRIORITY.length)
          break label179;
        k = this.THREAD_PRIORITY.length;
      }
    }
    catch (Throwable localThrowable)
    {
      label179: 
      while (true)
      {
        Logger.e("PlayerConfigManager", localThrowable);
        AppMethodBeat.o(104508);
      }
    }
  }

  public int getBufRatio()
  {
    AppMethodBeat.i(104502);
    if (this.mBufRatio <= 1)
      this.mBufRatio = 4;
    while (true)
    {
      Logger.i("PlayerConfigManager", "getBufRatio = " + this.mBufRatio);
      this.count = 0;
      int i = this.mBufRatio;
      AppMethodBeat.o(104502);
      return i;
      if (this.mBufRatio > 8)
        this.mBufRatio = 8;
    }
  }

  public boolean isSingleCpuOrScreenOff()
  {
    boolean bool = true;
    AppMethodBeat.i(104505);
    this.mProcessorNumber = Runtime.getRuntime().availableProcessors();
    if (this.mProcessorNumber <= 1)
      AppMethodBeat.o(104505);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(104505);
    }
  }

  public void setCommonPlayerRef(CorePlayer paramCorePlayer)
  {
    AppMethodBeat.i(104506);
    if (paramCorePlayer != null)
    {
      this.mCommonPlayerRef = new WeakReference(paramCorePlayer);
      this.mCurrPriorityIndex = 0;
      this.mAddPriority = 0;
      paramCorePlayer = paramCorePlayer.getCurrentAudioInformation();
      if (paramCorePlayer != null)
      {
        this.mPlaySpeed = (()((float)(paramCorePlayer.getSampleRate() * 2L * paramCorePlayer.getChannels()) / 1000.0F));
        Logger.i("PlayerConfigManager", "setCommonPlayerRef info = " + paramCorePlayer + ",mPlaySpeed = " + this.mPlaySpeed);
      }
    }
    AppMethodBeat.o(104506);
  }

  public void updateDecodeSpeed(long paramLong)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.PlayerConfigManager
 * JD-Core Version:    0.6.2
 */