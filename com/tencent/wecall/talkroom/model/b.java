package com.tencent.wecall.talkroom.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.multi.talk;
import com.tencent.pb.common.a.a;
import com.tencent.pb.common.c.c;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
{
  talk AIV;

  public b()
  {
    AppMethodBeat.i(127789);
    this.AIV = new talk();
    c.i("simon:TalkRoomContext", new Object[] { "construct engine:", this.AIV });
    AppMethodBeat.o(127789);
  }

  public final int Close()
  {
    int i = 0;
    AppMethodBeat.i(127791);
    if (!a.Alr)
      AppMethodBeat.o(127791);
    while (true)
    {
      return i;
      try
      {
        if (this.AIV != null)
        {
          i = this.AIV.close();
          c.i("simon:TalkRoomContext", new Object[] { "Close ret: ", Integer.valueOf(i) });
          AppMethodBeat.o(127791);
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          c.w("simon:TalkRoomContext", new Object[] { "Close ", localThrowable });
          i = 0;
        }
      }
    }
  }

  public final void OnMembersChanged(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(127792);
    if ((!a.Alr) || (this.AIV == null))
      AppMethodBeat.o(127792);
    while (true)
    {
      return;
      this.AIV.OnMembersChanged(paramArrayOfInt);
      AppMethodBeat.o(127792);
    }
  }

  public final byte[] dTd()
  {
    if ((!a.Alr) || (this.AIV == null));
    for (byte[] arrayOfByte = new byte[0]; ; arrayOfByte = this.AIV.field_capInfo)
      return arrayOfByte;
  }

  public final void dTe()
  {
    if ((!a.Alr) || (this.AIV == null));
    while (true)
    {
      return;
      this.AIV.field_capInfo = null;
    }
  }

  public final int dTf()
  {
    int i = 0;
    AppMethodBeat.i(127793);
    try
    {
      Object localObject;
      if (a.Alr)
      {
        localObject = this.AIV;
        if (localObject != null);
      }
      else
      {
        AppMethodBeat.o(127793);
        j = i;
      }
      while (true)
      {
        return j;
        localObject = new java/util/concurrent/atomic/AtomicInteger;
        ((AtomicInteger)localObject).<init>();
        AtomicInteger localAtomicInteger = new java/util/concurrent/atomic/AtomicInteger;
        localAtomicInteger.<init>();
        this.AIV.getChannelBytes((AtomicInteger)localObject, localAtomicInteger);
        j = localAtomicInteger.get();
        AppMethodBeat.o(127793);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        c.w("simon:TalkRoomContext", new Object[] { "getTotalWWANBytes: ", localThrowable });
        AppMethodBeat.o(127793);
        int j = i;
      }
    }
  }

  public final int uninitLive()
  {
    int i = 0;
    AppMethodBeat.i(127790);
    if (!a.Alr)
      AppMethodBeat.o(127790);
    while (true)
    {
      return i;
      try
      {
        if (this.AIV != null)
        {
          i = this.AIV.uninit();
          c.i("simon:TalkRoomContext", new Object[] { "uninitLive ret: ", Integer.valueOf(i) });
          AppMethodBeat.o(127790);
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          c.w("simon:TalkRoomContext", new Object[] { "uninitLive ", localThrowable });
          i = 0;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.b
 * JD-Core Version:    0.6.2
 */