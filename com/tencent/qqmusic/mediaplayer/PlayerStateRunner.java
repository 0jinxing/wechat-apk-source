package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class PlayerStateRunner
{
  private static final String TAG = "StateRunner";
  private WeakReference<AudioTrack> mAudioTrack;
  private final ReadWriteLock mLock;
  private Integer mState;

  PlayerStateRunner(Integer paramInteger)
  {
    AppMethodBeat.i(104781);
    this.mLock = new ReentrantReadWriteLock();
    this.mAudioTrack = new WeakReference(null);
    this.mState = paramInteger;
    AppMethodBeat.o(104781);
  }

  Integer get()
  {
    AppMethodBeat.i(104785);
    this.mLock.readLock().lock();
    while (true)
      try
      {
        int i = this.mState.intValue();
        Object localObject1 = (AudioTrack)this.mAudioTrack.get();
        if (localObject1 != null)
        {
          switch (((AudioTrack)localObject1).getPlayState())
          {
          default:
            j = i;
            i = j;
            if (!this.mState.equals(Integer.valueOf(j)))
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("!mState.equals(state), mstate = ");
              Logger.e("StateRunner", this.mState.toString() + "   state = " + j);
              i = j;
            }
            return Integer.valueOf(i);
          case 2:
            j = 5;
            break;
          case 3:
          }
          int j = 4;
        }
      }
      finally
      {
        this.mLock.readLock().unlock();
        AppMethodBeat.o(104785);
      }
  }

  boolean isEqual(Integer[] paramArrayOfInteger)
  {
    boolean bool1 = false;
    AppMethodBeat.i(104784);
    this.mLock.readLock().lock();
    try
    {
      int i = paramArrayOfInteger.length;
      int j = 0;
      if (j < i)
      {
        Integer localInteger = paramArrayOfInteger[j];
        boolean bool2 = this.mState.equals(localInteger);
        if (bool2)
        {
          this.mLock.readLock().unlock();
          bool1 = true;
          AppMethodBeat.o(104784);
        }
      }
      while (true)
      {
        return bool1;
        j++;
        break;
        this.mLock.readLock().unlock();
        AppMethodBeat.o(104784);
      }
    }
    finally
    {
      this.mLock.readLock().unlock();
      AppMethodBeat.o(104784);
    }
    throw paramArrayOfInteger;
  }

  public void setAudioTrack(AudioTrack paramAudioTrack)
  {
    AppMethodBeat.i(104786);
    this.mAudioTrack = new WeakReference(paramAudioTrack);
    AppMethodBeat.o(104786);
  }

  Integer transfer(Integer paramInteger)
  {
    AppMethodBeat.i(104782);
    this.mLock.writeLock().lock();
    try
    {
      Integer localInteger = this.mState;
      this.mState = paramInteger;
      paramInteger = new java/lang/StringBuilder;
      paramInteger.<init>();
      Logger.i("StateRunner", localInteger.toString() + " -> " + this.mState.toString());
      return localInteger;
    }
    finally
    {
      this.mLock.writeLock().unlock();
      AppMethodBeat.o(104782);
    }
    throw paramInteger;
  }

  boolean transfer(Integer paramInteger, Integer[] paramArrayOfInteger)
  {
    AppMethodBeat.i(104783);
    this.mLock.writeLock().lock();
    try
    {
      if (isEqual(paramArrayOfInteger))
      {
        transfer(paramInteger);
        this.mLock.writeLock().unlock();
        return bool;
      }
      this.mLock.writeLock().unlock();
      boolean bool = false;
      AppMethodBeat.o(104783);
    }
    finally
    {
      this.mLock.writeLock().unlock();
      AppMethodBeat.o(104783);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.PlayerStateRunner
 * JD-Core Version:    0.6.2
 */