package com.tencent.wecall.talkroom.model;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.pb.common.c.h;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import java.util.LinkedList;
import java.util.List;

public final class g
{
  List<g.a> callbacks;
  Handler handler;

  public g()
  {
    AppMethodBeat.i(127969);
    this.callbacks = new LinkedList();
    this.handler = new Handler(Looper.getMainLooper());
    AppMethodBeat.o(127969);
  }

  public final void a(int paramInt, MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(127971);
    paramMultiTalkGroup = new g.21(this, paramInt, paramMultiTalkGroup);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramMultiTalkGroup.run();
      AppMethodBeat.o(127971);
    }
    while (true)
    {
      return;
      this.handler.post(paramMultiTalkGroup);
      AppMethodBeat.o(127971);
    }
  }

  public final void a(g.a parama)
  {
    AppMethodBeat.i(127972);
    try
    {
      if (this.callbacks.contains(parama));
      while (true)
      {
        return;
        this.callbacks.add(parama);
        AppMethodBeat.o(127972);
      }
    }
    finally
    {
      AppMethodBeat.o(127972);
    }
  }

  public final void cq(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(127975);
    paramString = new g.8(this, paramString, paramBoolean);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramString.run();
      AppMethodBeat.o(127975);
    }
    while (true)
    {
      return;
      this.handler.post(paramString);
      AppMethodBeat.o(127975);
    }
  }

  public final void eS(String paramString, int paramInt)
  {
    AppMethodBeat.i(127977);
    h.aB(new g.13(this, paramString, paramInt));
    AppMethodBeat.o(127977);
  }

  public final void fF(List<MultiTalkGroup> paramList)
  {
    AppMethodBeat.i(127970);
    paramList = new g.19(this, paramList);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramList.run();
      AppMethodBeat.o(127970);
    }
    while (true)
    {
      return;
      this.handler.post(paramList);
      AppMethodBeat.o(127970);
    }
  }

  public final void g(MultiTalkGroup paramMultiTalkGroup)
  {
    AppMethodBeat.i(127974);
    paramMultiTalkGroup = new g.5(this, paramMultiTalkGroup);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramMultiTalkGroup.run();
      AppMethodBeat.o(127974);
    }
    while (true)
    {
      return;
      this.handler.post(paramMultiTalkGroup);
      AppMethodBeat.o(127974);
    }
  }

  public final void k(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(127973);
    paramObject = new g.4(this, paramInt, paramObject);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramObject.run();
      AppMethodBeat.o(127973);
    }
    while (true)
    {
      return;
      this.handler.post(paramObject);
      AppMethodBeat.o(127973);
    }
  }

  public final void onStateChanged(int paramInt)
  {
    AppMethodBeat.i(127976);
    g.9 local9 = new g.9(this, paramInt);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      local9.run();
      AppMethodBeat.o(127976);
    }
    while (true)
    {
      return;
      this.handler.post(local9);
      AppMethodBeat.o(127976);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wecall.talkroom.model.g
 * JD-Core Version:    0.6.2
 */